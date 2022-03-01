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
public class TrainerSyntheticList {

    public final static void setTrainerSyntheticList() throws SQLException {
        Connection con = null;
        Statement st = null;
        con = ConnectionToDataBase.getCon();
        st = con.createStatement();
        st.addBatch("insert into trainers(id, firstName, lastName, subject, courseID) values(1, 'Janie', 'MacCumiskey', 'JAVA', 1);");
        st.addBatch("insert into trainers(id, firstName, lastName, subject, courseID) values(2, 'Nicol', 'Wilks', 'PYTHON', 2);");
        st.addBatch("insert into trainers(id, firstName, lastName, subject, courseID) values(3, 'Viola', 'Meadowcraft', 'HTML', 3);");
        st.addBatch("insert into trainers(id, firstName, lastName, subject, courseID) values(4, 'Leroi', 'Keeton', 'JAVASCRIPT', 4);");
        st.addBatch("insert into trainers(id, firstName, lastName, subject, courseID) values(5, 'Kimbell', 'Voce', 'C#', 5);");
        st.addBatch("insert into trainers(id, firstName, lastName, subject, courseID) values(6, 'Alden', 'Milverton', 'C++', 6);");
        st.addBatch("insert into trainers(id, firstName, lastName, subject, courseID) values(7, 'Parke', 'Hildrew', 'MYSQL', 7);");
        st.addBatch("insert into trainers(id, firstName, lastName, subject, courseID) values(8, 'Nona', 'Jotcham', 'PASCAL', 8);");
        st.addBatch("insert into trainers(id, firstName, lastName, subject, courseID) values(9, 'Marjie', 'Matys', 'JAVA', 1);");
        st.addBatch("insert into trainers(id, firstName, lastName, subject, courseID) values(10, 'Courtney', 'Keane', 'PYTHON', 2);");
        st.addBatch("insert into trainers(id, firstName, lastName, subject, courseID) values(11, 'Kassie', 'Coskerry', 'HTML', 3);");
        st.addBatch("insert into trainers(id, firstName, lastName, subject, courseID) values(12, 'Boris', 'Domenge', 'JAVASCRIPT', 4);");
        st.addBatch("insert into trainers(id, firstName, lastName, subject, courseID) values(13, 'Bibbie', 'Wisam', 'C#', 5);");
        st.addBatch("insert into trainers(id, firstName, lastName, subject, courseID) values(14, 'Tedie', 'Boshard', 'C++', 6);");
        st.addBatch("insert into trainers(id, firstName, lastName, subject, courseID) values(15, 'Chaddie', 'Tathacott', 'MYSQL', 7);");
        st.addBatch("insert into trainers(id, firstName, lastName, subject, courseID) values(16, 'Raddie', 'Stock', 'PASCAL', 8);");
        st.executeBatch();
        ConnectionToDataBase.closeAConnection(con);
        ConnectionToDataBase.closeAStatement(st);
    }

    public final static void deleteEveryTrainer() {
        Connection con = null;
        Statement st = null;
        String sql = "Delete FROM trainers";
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
