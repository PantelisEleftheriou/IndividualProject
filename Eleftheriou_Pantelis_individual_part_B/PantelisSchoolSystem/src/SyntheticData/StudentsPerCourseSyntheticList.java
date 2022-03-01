/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SyntheticData;

import Utils.ConnectionToDataBase;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Pantelis
 */
public class StudentsPerCourseSyntheticList {

    public final static void setStudentsPerCourseSyntheticList() throws SQLException {
        Connection con = null;
        Statement st = null;
        con = ConnectionToDataBase.getCon();
        st = con.createStatement();

        st.addBatch("INSERT INTO `privateschooldatabase`.`studentswatchcourses` (`coursesID`, `studentsID`) VALUES (1, 1);");
        st.addBatch("INSERT INTO `privateschooldatabase`.`studentswatchcourses` (`coursesID`, `studentsID`) VALUES (2, 2);");
        st.addBatch("INSERT INTO `privateschooldatabase`.`studentswatchcourses` (`coursesID`, `studentsID`) VALUES (3, 5);");
        st.addBatch("INSERT INTO `privateschooldatabase`.`studentswatchcourses` (`coursesID`, `studentsID`) VALUES (4, 4);");
        st.addBatch("INSERT INTO `privateschooldatabase`.`studentswatchcourses` (`coursesID`, `studentsID`) VALUES (5, 5);");
        st.addBatch("INSERT INTO `privateschooldatabase`.`studentswatchcourses` (`coursesID`, `studentsID`) VALUES (6, 6);");
        st.addBatch("INSERT INTO `privateschooldatabase`.`studentswatchcourses` (`coursesID`, `studentsID`) VALUES (7, 7);");
        st.addBatch("INSERT INTO `privateschooldatabase`.`studentswatchcourses` (`coursesID`, `studentsID`) VALUES (8, 8);");
        st.addBatch("INSERT INTO `privateschooldatabase`.`studentswatchcourses` (`coursesID`, `studentsID`) VALUES (1, 9);");
        st.addBatch("INSERT INTO `privateschooldatabase`.`studentswatchcourses` (`coursesID`, `studentsID`) VALUES (2, 10);");
        st.addBatch("INSERT INTO `privateschooldatabase`.`studentswatchcourses` (`coursesID`, `studentsID`) VALUES (3, 11);");
        st.addBatch("INSERT INTO `privateschooldatabase`.`studentswatchcourses` (`coursesID`, `studentsID`) VALUES (4, 12);");
        st.addBatch("INSERT INTO `privateschooldatabase`.`studentswatchcourses` (`coursesID`, `studentsID`) VALUES (5, 13);");
        st.addBatch("INSERT INTO `privateschooldatabase`.`studentswatchcourses` (`coursesID`, `studentsID`) VALUES (6, 14);");
        st.addBatch("INSERT INTO `privateschooldatabase`.`studentswatchcourses` (`coursesID`, `studentsID`) VALUES (7, 15);");
        st.addBatch("INSERT INTO `privateschooldatabase`.`studentswatchcourses` (`coursesID`, `studentsID`) VALUES (8, 16);");
        st.addBatch("INSERT INTO `privateschooldatabase`.`studentswatchcourses` (`coursesID`, `studentsID`) VALUES (1, 17);");
        st.addBatch("INSERT INTO `privateschooldatabase`.`studentswatchcourses` (`coursesID`, `studentsID`) VALUES (2, 18);");
        st.addBatch("INSERT INTO `privateschooldatabase`.`studentswatchcourses` (`coursesID`, `studentsID`) VALUES (3, 19);");
        st.addBatch("INSERT INTO `privateschooldatabase`.`studentswatchcourses` (`coursesID`, `studentsID`) VALUES (4, 20);");
        st.addBatch("INSERT INTO `privateschooldatabase`.`studentswatchcourses` (`coursesID`, `studentsID`) VALUES (5, 21);");
        st.addBatch("INSERT INTO `privateschooldatabase`.`studentswatchcourses` (`coursesID`, `studentsID`) VALUES (6, 22);");
        st.addBatch("INSERT INTO `privateschooldatabase`.`studentswatchcourses` (`coursesID`, `studentsID`) VALUES (7, 23);");
        st.addBatch("INSERT INTO `privateschooldatabase`.`studentswatchcourses` (`coursesID`, `studentsID`) VALUES (8, 24);");
        st.addBatch("INSERT INTO `privateschooldatabase`.`studentswatchcourses` (`coursesID`, `studentsID`) VALUES (2, 1);");
        st.addBatch("INSERT INTO `privateschooldatabase`.`studentswatchcourses` (`coursesID`, `studentsID`) VALUES (3, 2);");
        st.addBatch("INSERT INTO `privateschooldatabase`.`studentswatchcourses` (`coursesID`, `studentsID`) VALUES (4, 3);");
        st.addBatch("INSERT INTO `privateschooldatabase`.`studentswatchcourses` (`coursesID`, `studentsID`) VALUES (5, 4);");
        st.addBatch("INSERT INTO `privateschooldatabase`.`studentswatchcourses` (`coursesID`, `studentsID`) VALUES (6, 5);");
        st.executeBatch();
        ConnectionToDataBase.closeAConnection(con);
        ConnectionToDataBase.closeAStatement(st);
    }

    public final static void deleteEveryStudentPerCourse() {
        Connection con = null;
        Statement st = null;
        String sql = "Delete FROM studentswatchcourses";
        try {
            con = ConnectionToDataBase.getCon();
            st = con.createStatement();
            st.executeUpdate(sql);
            ConnectionToDataBase.closeAConnection(con);
            ConnectionToDataBase.closeAStatement(st);
        } catch (SQLException ex) {
        }
    }
}
