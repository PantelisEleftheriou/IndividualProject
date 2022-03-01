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
public class CourseSyntheticList {

    public final static void setCourseSyntheticList() throws SQLException {
        Connection con = null;
        Statement st = null;
        con = ConnectionToDataBase.getCon();
        st = con.createStatement();
        st.addBatch("insert into courses (id, title, stream, type, startDate, endDate) values (1, 'CB12', 'JAVA', 'PART-TIME', '2020-10-05', '2021-04-05');");
        st.addBatch("insert into courses (id, title, stream, type, startDate, endDate) values (2, 'CB12', 'PYTHON', 'FULL-TIME', '2020-10-05', '2021-01-05');");
        st.addBatch("insert into courses (id, title, stream, type, startDate, endDate) values (3, 'CB12', 'HTML', 'PART-TIME', '2020-10-05', '2021-04-05');");
        st.addBatch("insert into courses (id, title, stream, type, startDate, endDate) values (4, 'CB12', 'JAVASCRIPT', 'FULL-TIME', '2020-10-05', '2021-01-05');");
        st.addBatch("insert into courses (id, title, stream, type, startDate, endDate) values (5, 'CB12', 'C#', 'PART-TIME', '2020-10-05', '2021-04-05');");
        st.addBatch("insert into courses (id, title, stream, type, startDate, endDate) values (6, 'CB12', 'C++', 'FULL-TIME', '2020-10-05', '2021-01-05');");
        st.addBatch("insert into courses (id, title, stream, type, startDate, endDate) values (7, 'CB12', 'MYSQL', 'PART-TIME', '2020-10-05', '2021-04-05');");
        st.addBatch("insert into courses (id, title, stream, type, startDate, endDate) values (8, 'CB12', 'PASCAL', 'FULL-TIME', '2020-10-05', '2021-01-05');");
        st.executeBatch();
        ConnectionToDataBase.closeAConnection(con);
        ConnectionToDataBase.closeAStatement(st);
    }

    public final static void deleteEveryCourse() {
        Connection con = null;
        Statement st = null;
        String sql = "Delete FROM courses";

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
