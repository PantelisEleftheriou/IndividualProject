/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Utils.ConnectionToDataBase;
import Utils.ScannerData;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Course;
import model.Student;

/**
 *
 * @author Pantelis
 */
public class StudentDaoImpl implements StudentDaoInt {

    @Override
    public Student inputAStudent() {
        Student s = new Student();
        s.setFirstName(ScannerData.inputString("Give me the first name of the student: "));
        s.setLastName(ScannerData.inputString("Give me the last name of the student: "));
        s.setTuitionFees(ScannerData.inputFloat("Give me the tuition fees of the student: "));
        s.setDateOfBirth(ScannerData.inputDate("Give me the student birth day (dd/mm/yyyy): "));
        return s;
    }

    @Override
    public void insertStudentInDB(Student s) {
        Connection con = null;
        PreparedStatement pst = null;
        String sql = "INSERT INTO `privateschooldatabase`.`students`"
                + " (`firstName`, `lastName`, `tuitionFees`, `birthday`)"
                + " VALUES (?,?,?,?);";
        try {
            con = ConnectionToDataBase.getCon();
            pst = con.prepareStatement(sql);
            pst.setString(1, s.getFirstName());
            pst.setString(2, s.getLastName());
            pst.setFloat(3, s.getTuitionFees());
            pst.setDate(4, Date.valueOf(s.getDateOfBirth()));
            pst.executeUpdate();
        } catch (SQLException ex) {
            
        } finally {
            ConnectionToDataBase.closeAConnection(con);
            ConnectionToDataBase.closeAPreparedStatement(pst);
        }
    }

    @Override
    public List<Student> allStudents() {
        Connection con = null;
        ResultSet rs = null;
        Statement st = null;
        String sql = "SELECT * FROM students";
        ArrayList<Student> allStudent = new ArrayList();
        try {
            con = ConnectionToDataBase.getCon();
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                allStudent.add(fillStudent(rs));
            }
        } catch (Exception ex) {
            
        } finally {
            ConnectionToDataBase.closeAConnection(con);
            ConnectionToDataBase.closeAResultSet(rs);
            ConnectionToDataBase.closeAStatement(st);
        }
        return allStudent;
    }

    @Override
    public List<Student> allStudentsPerCourse(Course c) {
        Connection con = null;
        ResultSet rs = null;
        PreparedStatement pst;
        ArrayList<Student> allStudentsPerCourse = null;
        String sql = "SELECT s.* FROM students s,courses c,studentswatchcourses swc"
                + " WHERE (swc.coursesID = c.id AND swc.studentsID = s.id)"
                + " AND c.id = ?;";
        try {
            con = ConnectionToDataBase.getCon();
            pst = con.prepareStatement(sql);
            pst.setInt(1, c.getId());
            rs = pst.executeQuery();
            allStudentsPerCourse = new ArrayList();
            while (rs.next()) {
                allStudentsPerCourse.add(fillStudent(rs));
            }
        } catch (SQLException | NullPointerException ex) {
            
        } finally {
            ConnectionToDataBase.closeAConnection(con);
            ConnectionToDataBase.closeAResultSet(rs);
        }
        return allStudentsPerCourse;
    }

    @Override
    public List<Student> allStudentsWithMoreThanOneCourse() {
        ResultSet rs = null;
        Connection con = null;
        Statement st = null;
        ArrayList<Student> allStudentsWithMoreThanOneCourse = new ArrayList();
        String sql = "SELECT students.*"
                + " FROM students, studentswatchcourses, courses"
                + " WHERE studentswatchcourses.coursesID = courses.id AND studentswatchcourses.studentsID = students.id"
                + " GROUP BY students.firstname"
                + " HAVING COUNT(COURSES.id)>=2"
                + " ORDER BY students.lastName;";
        try {
            con = ConnectionToDataBase.getCon();
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                allStudentsWithMoreThanOneCourse.add(fillStudent(rs));
            }
        } catch (SQLException ex) {
            
        } finally {
            ConnectionToDataBase.closeAConnection(con);
            ConnectionToDataBase.closeAResultSet(rs);
            ConnectionToDataBase.closeAStatement(st);
        }
        return allStudentsWithMoreThanOneCourse;
    }

    @Override
    public void insertAStudentInACourse(Course c) {
        if (c!=null) {
        Connection con = null;
        PreparedStatement pst = null;
        String sql = "INSERT INTO `privateschooldatabase`.`studentswatchcourses` (`studentsID`, `coursesID`) VALUES (?, ?);";
        try {
            con = ConnectionToDataBase.getCon();
            pst = con.prepareStatement(sql);
            pst.setInt(1, studentFinder(ScannerData.inputString("Give me the full name of the student")).getId());
            pst.setInt(2, c.getId());
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("This student is already in this course");
        }catch (NullPointerException ex){
                }finally {
            ConnectionToDataBase.closeAConnection(con);
            ConnectionToDataBase.closeAPreparedStatement(pst);
        }
        }
    }

    @Override
    public Student studentFinder(String fullName) {
        Student s = null;
        Connection con = null;
        ResultSet rs = null;
        PreparedStatement pst = null;
        fullName = fullName.replace(" ", "").replace("-", "");
        String sql = "SELECT * FROM students WHERE replace(replace(CONCAT(firstName, lastName),'-',''),' ','')=?"
                + " OR replace(replace(CONCAT(firstName,lastName),'-',''),' ','')=?;";
        try {
            con = ConnectionToDataBase.getCon();
            pst = con.prepareStatement(sql);
            pst.setString(1, fullName);
            pst.setString(2, fullName);
            rs = pst.executeQuery();
            while (rs.next()) {
                s = fillStudent(rs);
            }
        } catch (SQLException ex) {
           
        } finally {
            ConnectionToDataBase.closeAConnection(con);
            ConnectionToDataBase.closeAPreparedStatement(pst);
            ConnectionToDataBase.closeAResultSet(rs);
        }
        if (s==null) {
            System.out.println("There is not any student with this name");
        }
        return s;
    }

    private Student fillStudent(ResultSet rs) throws SQLException {
        Student s = new Student();
        s.setId(rs.getInt("id"));
        s.setFirstName(rs.getString("firstName"));
        s.setLastName(rs.getString("lastName"));
        s.setTuitionFees(rs.getFloat("tuitionFees"));
        s.setDateOfBirth(rs.getDate("birthday").toLocalDate());
        return s;

    }

}
