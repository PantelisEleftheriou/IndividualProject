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

/**
 *
 * @author Pantelis
 */
public class CourseDaoImpl implements CourseDaoInt {

    @Override
    public Course inputACourse() {
        Course c = new Course();
        c.setTitle(ScannerData.inputString("Give me the course title: "));
        c.setStream(ScannerData.inputString("Give me the course stream: "));
        c.setType(ScannerData.inputString("Give me the course type: "));
        c.setStartDate(ScannerData.inputDate("Give me the start day of the course (dd/mm/yyyy): "));
        c.setEndDate(ScannerData.inputDate("Give me the end day of the course (dd/mm/yyyy): "));
        return c;
    }

    @Override
    public void insertCourseInDB(Course c) {
        Connection con = null;
        PreparedStatement pst = null;
        String sql = "INSERT INTO `privateschooldatabase`.`courses`"
                + " (`title`, `stream`, `type`, `startDate`, `endDate`)"
                + " VALUES (?,?,?,?,?);";
        try {
            con = ConnectionToDataBase.getCon();
            pst = con.prepareStatement(sql);
            pst.setString(1, c.getTitle());
            pst.setString(2, c.getStream());
            pst.setString(3, c.getType());
            pst.setDate(4, Date.valueOf(c.getStartDate()));
            pst.setDate(5, Date.valueOf(c.getEndDate()));
            pst.executeUpdate();
        } catch (SQLException ex) {
            
        } finally {
            ConnectionToDataBase.closeAConnection(con);
            ConnectionToDataBase.closeAPreparedStatement(pst);
        }
    }

    @Override
    public List<Course> allCourses() {
        ArrayList<Course> allCourses = new ArrayList();
        Connection con = null;
        ResultSet rs = null;
        Statement st = null;
        String sql = "SELECT * FROM courses";
        try {
            con = ConnectionToDataBase.getCon();
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                allCourses.add(fillCourse(rs));
            }
        } catch (SQLException ex) {
            
        } finally {
            ConnectionToDataBase.closeAConnection(con);
            ConnectionToDataBase.closeAResultSet(rs);
            ConnectionToDataBase.closeAStatement(st);
        }
        return allCourses;
    }

    @Override
    public Course courseFinder(String fulltitle) {
        Course c = null;
        Connection con = null;
        ResultSet rs = null;
        PreparedStatement pst = null;
        fulltitle = fulltitle.replace(" ", "").replace("-", "");
        String sql = "SELECT * FROM courses c"
                + " WHERE (CONCAT(title, stream, replace(replace(type,'-',''),' ','')) = ?"
                + " OR CONCAT(title, replace(replace(type,'-',''),' ',''), stream) = ?"
                + " OR CONCAT(replace(replace(type,'-',''),' ',''), title, stream) = ?"
                + " OR CONCAT(replace(replace(type,'-',''),' ',''), stream, title) = ?"
                + " OR CONCAT(stream, replace(replace(type,'-',''),' ',''), title) = ?"
                + " OR CONCAT(stream, title, replace(replace(type,'-',''),' ','')) = ?);";
        try {
            con = ConnectionToDataBase.getCon();
            pst = con.prepareStatement(sql);
            pst.setString(1, fulltitle);
            pst.setString(2, fulltitle);
            pst.setString(3, fulltitle);
            pst.setString(4, fulltitle);
            pst.setString(5, fulltitle);
            pst.setString(6, fulltitle);
            rs = pst.executeQuery();
            while (rs.next()) {
                c = fillCourse(rs);
            }
        } catch (SQLException ex) {
           
        } finally {
            ConnectionToDataBase.closeAConnection(con);
            ConnectionToDataBase.closeAPreparedStatement(pst);
            ConnectionToDataBase.closeAResultSet(rs);
        }
        if (c==null) {
            System.out.println("There is not any course with this title,stream and type");
        }
        return c;
    }

    private Course fillCourse(ResultSet rs) throws SQLException {
        Course c = new Course();
        c.setId(rs.getInt("id"));
        c.setTitle(rs.getString("title"));
        c.setStream(rs.getString("stream"));
        c.setType(rs.getString("type"));
        c.setStartDate(rs.getDate("startDate").toLocalDate());
        c.setEndDate((rs.getDate("endDate")).toLocalDate());
        return c;
    }
}
