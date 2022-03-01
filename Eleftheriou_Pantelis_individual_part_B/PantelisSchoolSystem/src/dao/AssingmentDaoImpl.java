 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Utils.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Assingment;
import model.Course;
import model.Student;

/**
 *
 * @author Pantelis
 */
public class AssingmentDaoImpl implements AssingmentDaoInt {

    @Override
    public Assingment inputAnAssingment() {
        Assingment assingment = new Assingment();
        assingment.setTitle(ScannerData.inputString("Give me the assingment title: "));
        assingment.setDescription(ScannerData.inputString("Give me a short assingment description: "));
        assingment.setOralMark(ScannerData.inputFloat("Give me a oral mark: "));
        assingment.setTotalMark(ScannerData.inputFloat("Give me a total mark: "));
        assingment.setSubDateTime(ScannerData.inputDateTime("Give me the day and the time of submision: "));
        return assingment;
    }

    @Override
    public void insertAssingmentInDB(Assingment assingment) {
        Connection con = null;
        PreparedStatement pst = null;
        String sql = "INSERT INTO `privateschooldatabase`.`assingments`"
                + " (`title`, `description`, `oralMark`, `totalMark`, `subDateTime`)"
                + " VALUES (?,?,?,?,?);";
        try {
            con = ConnectionToDataBase.getCon();
            pst = con.prepareStatement(sql);
            pst.setString(1, assingment.getTitle());
            pst.setString(2, assingment.getDescription());
            pst.setFloat(3, assingment.getOralMark());
            pst.setFloat(4, assingment.getTotalMark());
            pst.setString(5, String.valueOf(assingment.getSubDateTime()));
            pst.executeUpdate();
        } catch (SQLException ex) {
        } finally {
            ConnectionToDataBase.closeAConnection(con);
            ConnectionToDataBase.closeAPreparedStatement(pst);
        }
    }

    @Override
    public List<Assingment> allAssingments() {
        Connection con = null;
        ResultSet rs = null;
        Statement st = null;
        String sql = "SELECT * FROM assingments";
        ArrayList<Assingment> allAssingments = new ArrayList();
        try {
            con = ConnectionToDataBase.getCon();
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                allAssingments.add(fillanAssingment(rs));
            }
        } catch (SQLException ex) {
        } finally {
            ConnectionToDataBase.closeAConnection(con);
            ConnectionToDataBase.closeAResultSet(rs);
            ConnectionToDataBase.closeAStatement(st);
        }
        return allAssingments;
    }

    @Override
    public List<Assingment> allAssingmentsPerStudentPerCourse(Student s) {

        Connection con = null;
        ResultSet rs = null;
        PreparedStatement pst;
        ArrayList<Assingment> allAssingmentsPerStudentPerCourse = null;
        String sql = "SELECT assingments.*"
                + " FROM courses,assingments, students,studentswatchcourses"
                + " WHERE courses.id = assingments.courseID"
                + " AND studentswatchcourses.studentsID = students.id AND studentswatchcourses.coursesID = courses.id"
                + " AND students.id=?";

        try {
            con = ConnectionToDataBase.getCon();
            pst = con.prepareStatement(sql);
            pst.setInt(1, s.getId());
            rs = pst.executeQuery();
            allAssingmentsPerStudentPerCourse = new ArrayList();
            while (rs.next()) {
                allAssingmentsPerStudentPerCourse.add(fillanAssingment(rs));
            }
        } catch (Exception ex) {
        } finally {
            ConnectionToDataBase.closeAConnection(con);
            ConnectionToDataBase.closeAResultSet(rs);
        }
        return allAssingmentsPerStudentPerCourse;

    }

    @Override
    public List<Assingment> allAssingmentsPerCourse(Course c) {
        Connection con = null;
        ResultSet rs = null;
        PreparedStatement pst;
        ArrayList<Assingment> allAssingmentsPerCourse = null;
        String sql = "SELECT assingments.*"
                + " FROM courses,assingments"
                + " WHERE courses.id = assingments.courseID AND courses.id = ?";
        try {
            con = ConnectionToDataBase.getCon();
            pst = con.prepareStatement(sql);
            pst.setInt(1, c.getId());
            rs = pst.executeQuery();
            allAssingmentsPerCourse = new ArrayList();
            while (rs.next()) {
                allAssingmentsPerCourse.add(fillanAssingment(rs));
            }
        } catch (SQLException | NullPointerException ex) {
        } finally {
            ConnectionToDataBase.closeAConnection(con);
            ConnectionToDataBase.closeAResultSet(rs);
        }
        return allAssingmentsPerCourse;
    }

    @Override
    public void insertAssingmentInACourse(Course c) {
        if (c != null) {
            Connection con = null;
            PreparedStatement pst = null;
            String sql = "UPDATE `privateschooldatabase`.`assingments` SET `courseID` = ? WHERE (`id` = ?);";
            try {
                con = ConnectionToDataBase.getCon();
                pst = con.prepareStatement(sql);
                pst.setInt(1, c.getId());
                pst.setInt(2, assingmentFinder(ScannerData.inputString("Give me the title of the assingment")).getId());
                pst.executeUpdate();
            } catch (SQLException | NullPointerException ex) {

            } finally {
                ConnectionToDataBase.closeAConnection(con);
                ConnectionToDataBase.closeAPreparedStatement(pst);
            }
        }
    }

    private Assingment fillanAssingment(ResultSet rs) throws SQLException {
        Assingment a = new Assingment();
        a.setId(rs.getInt("id"));
        a.setTitle(rs.getString("title"));
        a.setDescription(rs.getString("description"));
        a.setOralMark(rs.getFloat("oralMark"));
        a.setTotalMark(rs.getFloat("totalMark"));
        a.setSubDateTime(rs.getTimestamp("subDateTime").toLocalDateTime());
        a.setCourseID(rs.getInt("courseID"));
        return a;
    }

    @Override
    public Assingment assingmentFinder(String fulltitle) {
        Assingment a = null;
        Connection con = null;
        ResultSet rs = null;
        PreparedStatement pst = null;
        fulltitle = fulltitle.replace(" ", "").replace("-", "");
        String sql = "SELECT * FROM assingments WHERE replace(replace(title,'-',''),' ','')=?;";
        try {
            con = ConnectionToDataBase.getCon();
            pst = con.prepareStatement(sql);
            pst.setString(1, fulltitle);
            rs = pst.executeQuery();
            while (rs.next()) {
                a = fillanAssingment(rs);
            }
        } catch (SQLException ex) {
        } finally {
            ConnectionToDataBase.closeAConnection(con);
            ConnectionToDataBase.closeAPreparedStatement(pst);
            ConnectionToDataBase.closeAResultSet(rs);
        }
        if (a == null) {
            System.out.println("There is not any assingment with this title");
        }
        return a;
    }

}
