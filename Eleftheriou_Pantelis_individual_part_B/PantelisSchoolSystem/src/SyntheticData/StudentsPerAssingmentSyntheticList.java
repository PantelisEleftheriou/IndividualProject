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
import java.util.ArrayList;

/**
 *
 * @author Pantelis
 */
public class StudentsPerAssingmentSyntheticList {

    public final static void setStudentsPerAssingmentSyntheticList() throws SQLException {
        Connection con = null;
        Statement st = null;
        con = ConnectionToDataBase.getCon();
        st = con.createStatement();

        st.addBatch("INSERT INTO `privateschooldatabase`.`studentshaveassingments` (`studentsID`, `assingmentsID`) VALUES (1, 1);");
        st.addBatch("INSERT INTO `privateschooldatabase`.`studentshaveassingments` (`studentsID`, `assingmentsID`) VALUES (2, 2);");
        st.addBatch("INSERT INTO `privateschooldatabase`.`studentshaveassingments` (`studentsID`, `assingmentsID`) VALUES (3, 5);");
        st.addBatch("INSERT INTO `privateschooldatabase`.`studentshaveassingments` (`studentsID`, `assingmentsID`) VALUES (4, 4);");
        st.addBatch("INSERT INTO `privateschooldatabase`.`studentshaveassingments` (`studentsID`, `assingmentsID`) VALUES (5, 5);");
        st.addBatch("INSERT INTO `privateschooldatabase`.`studentshaveassingments` (`studentsID`, `assingmentsID`) VALUES (6, 6);");
        st.addBatch("INSERT INTO `privateschooldatabase`.`studentshaveassingments` (`studentsID`, `assingmentsID`) VALUES (7, 7);");
        st.addBatch("INSERT INTO `privateschooldatabase`.`studentshaveassingments` (`studentsID`, `assingmentsID`) VALUES (8, 8);");
        st.addBatch("INSERT INTO `privateschooldatabase`.`studentshaveassingments` (`studentsID`, `assingmentsID`) VALUES (1, 9);");
        st.addBatch("INSERT INTO `privateschooldatabase`.`studentshaveassingments` (`studentsID`, `assingmentsID`) VALUES (2, 10);");
        st.addBatch("INSERT INTO `privateschooldatabase`.`studentshaveassingments` (`studentsID`, `assingmentsID`) VALUES (12, 10);");
        st.addBatch("INSERT INTO `privateschooldatabase`.`studentshaveassingments` (`studentsID`, `assingmentsID`) VALUES (15, 5);");
        st.addBatch("INSERT INTO `privateschooldatabase`.`studentshaveassingments` (`studentsID`, `assingmentsID`) VALUES (16, 1);");
        st.addBatch("INSERT INTO `privateschooldatabase`.`studentshaveassingments` (`studentsID`, `assingmentsID`) VALUES (20, 9);");
        st.addBatch("INSERT INTO `privateschooldatabase`.`studentshaveassingments` (`studentsID`, `assingmentsID`) VALUES (27, 8);");
        st.addBatch("INSERT INTO `privateschooldatabase`.`studentshaveassingments` (`studentsID`, `assingmentsID`) VALUES (13, 7);");
        st.addBatch("INSERT INTO `privateschooldatabase`.`studentshaveassingments` (`studentsID`, `assingmentsID`) VALUES (9, 6);");
        st.addBatch("INSERT INTO `privateschooldatabase`.`studentshaveassingments` (`studentsID`, `assingmentsID`) VALUES (31, 4);");
        st.addBatch("INSERT INTO `privateschooldatabase`.`studentshaveassingments` (`studentsID`, `assingmentsID`) VALUES (25, 5);");
        st.addBatch("INSERT INTO `privateschooldatabase`.`studentshaveassingments` (`studentsID`, `assingmentsID`) VALUES (19, 3);");
        st.addBatch("INSERT INTO `privateschooldatabase`.`studentshaveassingments` (`studentsID`, `assingmentsID`) VALUES (3, 1);");
        st.addBatch("INSERT INTO `privateschooldatabase`.`studentshaveassingments` (`studentsID`, `assingmentsID`) VALUES (4, 2);");
        st.addBatch("INSERT INTO `privateschooldatabase`.`studentshaveassingments` (`studentsID`, `assingmentsID`) VALUES (14, 10);");
        st.addBatch("INSERT INTO `privateschooldatabase`.`studentshaveassingments` (`studentsID`, `assingmentsID`) VALUES (17, 2);");
        st.addBatch("INSERT INTO `privateschooldatabase`.`studentshaveassingments` (`studentsID`, `assingmentsID`) VALUES (31, 3);");
        st.addBatch("INSERT INTO `privateschooldatabase`.`studentshaveassingments` (`studentsID`, `assingmentsID`) VALUES (32, 9);");
        st.addBatch("INSERT INTO `privateschooldatabase`.`studentshaveassingments` (`studentsID`, `assingmentsID`) VALUES (29, 8);");
        st.addBatch("INSERT INTO `privateschooldatabase`.`studentshaveassingments` (`studentsID`, `assingmentsID`) VALUES (25, 7);");
        st.addBatch("INSERT INTO `privateschooldatabase`.`studentshaveassingments` (`studentsID`, `assingmentsID`) VALUES (20, 5);");
        st.executeBatch();
        ConnectionToDataBase.closeAConnection(con);
        ConnectionToDataBase.closeAStatement(st);
    }

    public final static void deleteEveryStudentPerAssingment() {
        Connection con = null;
        Statement st = null;
        String sql = "Delete FROM studentshaveassingments";
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
