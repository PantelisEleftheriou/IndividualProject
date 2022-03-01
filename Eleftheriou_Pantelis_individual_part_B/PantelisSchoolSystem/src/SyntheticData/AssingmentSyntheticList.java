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
import java.util.List;

/**
 *
 * @author Pantelis
 */
public class AssingmentSyntheticList {

    public final static void setAssingmentSyntheticList() throws SQLException {
        Connection con = null;
        Statement st = null;
        con = ConnectionToDataBase.getCon();
        st = con.createStatement();
        st.addBatch("insert into assingments values(1, 'INDIVIDUAL PROJECT', 'During the development of this project you need to do the implementation of a private school structure.', 100, 100, '2020-11-18 23:59:59', 1);");
        st.addBatch("insert into assingments values(2, 'SPRING PROJECT', 'During the development of this project you need to do the implementation of a private school structure.', 100, 100, '2020-12-19 23:59:59', 1);");
        st.addBatch("insert into assingments values(3, 'TEAM PROJECT', 'During the development of this project you need to do the implementation of a private school structure.', 100, 100, '2021-11-30 23:59:59', 2);");
        st.addBatch("insert into assingments values(4, 'PETSHOP FRONT END IN JAVASCRIPT', 'During the development of this project you need to do the implementation of a private school structure.', 100, 100, '2020-11-25 23:59:59', 4);");
        st.addBatch("insert into assingments values(5, 'HANGMAN IN JAVA', 'During the development of this project you need to do the implementation of a private school structure.', 100, 100, '2020-11-25 23:59:59', 1);");
        st.addBatch("insert into assingments values(6, 'BOOKSTORE IN PYTHON', 'During the development of this project you need to do the implementation of a private school structure.', 100, 100, '2020-11-25 23:59:59', 2);\n");
        st.addBatch("insert into assingments values(7, 'PRIVATE SCHOOL IN C#', 'During the development of this project you need to do the implementation of a private school structure.', 100, 100, '2020-11-25 23:59:59', 5);");
        st.addBatch("insert into assingments values(8, 'PACMAN IN HTML', 'During the development of this project you need to do the implementation of a private school structure.', 100, 100, '2020-11-25 23:59:59', 3);");
        st.addBatch("insert into assingments values(9, 'CONSTUCT A DATABASE IN MYSQL', 'During the development of this project you need to do the implementation of a private school structure.', 100, 100, '2020-11-25 23:59:59', 7);");
        st.addBatch("insert into assingments values(10, 'PROJECT C++', 'During the development of this project you need to do the implementation of a private school structure.', 100, 100, '2020-11-25 23:59:59', 6);");
        st.addBatch("insert into assingments values(11, 'CALCULATOR IN PASCAL', 'During the development of this project you need to do the implementation of a private school structure.', 100, 100, '2020-11-25 23:59:59', 8);");

        st.executeBatch();
        ConnectionToDataBase.closeAConnection(con);
        ConnectionToDataBase.closeAStatement(st);
    }

    public final static void deleteEveryAssingment() {
        Connection con = null;
        Statement st = null;
        String sql = "Delete FROM assingments";
        try {
            con = ConnectionToDataBase.getCon();
            st = con.createStatement();
            st.executeUpdate(sql);
            ConnectionToDataBase.closeAConnection(con);
            ConnectionToDataBase.closeAStatement(st);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

}
