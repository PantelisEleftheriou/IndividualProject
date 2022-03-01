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
public class StudentSyntheticList {

    public final static void setStudentSyntheticList() throws SQLException {
        Connection con = null;
        Statement st = null;
        con = ConnectionToDataBase.getCon();
        st = con.createStatement();
        st.addBatch("insert into students (id, firstName, lastName, "
                + "tuitionFees, birthday) values (1, 'Janie', 'Sammes', 1616.16, '1996-07-31');");
        st.addBatch("insert into students (id, firstName, lastName, "
                + "tuitionFees, birthday) values (2, 'Rosco', 'Cheltnam', 2408.85, '1987-01-03');");
        st.addBatch("insert into students (id, firstName, lastName, "
                + "tuitionFees, birthday) values (3, 'Alix', 'Burnell', 355.44, '1976-07-02');");
        st.addBatch("insert into students (id, firstName, lastName, "
                + "tuitionFees, birthday) values (4, 'Allina', 'Sheaf', 531.15, '1981-09-12');");
        st.addBatch("insert into students (id, firstName, lastName, "
                + "tuitionFees, birthday) values (5, 'Becky', 'Vauter', 1297.68, '1992-12-14');");
        st.addBatch("insert into students (id, firstName, lastName, "
                + "tuitionFees, birthday) values (6, 'Margareta', 'Roo', 418.13, '1976-07-14');");
        st.addBatch("insert into students (id, firstName, lastName, "
                + "tuitionFees, birthday) values (7, 'Ellery', 'Slater', 153.16, '1975-07-28');");
        st.addBatch("insert into students (id, firstName, lastName, "
                + "tuitionFees, birthday) values (8, 'Nanete', 'Upstell', 1251.77, '2001-05-31');");
        st.addBatch("insert into students (id, firstName, lastName, "
                + "tuitionFees, birthday) values (9, 'Rourke', 'Shulver', 1966.65, '1985-06-05');");
        st.addBatch("insert into students (id, firstName, lastName, "
                + "tuitionFees, birthday) values (10, 'Mannie', 'Dannehl', 870.6, '1970-03-21');");
        st.addBatch("insert into students (id, firstName, lastName, "
                + "tuitionFees, birthday) values (11, 'Jeanette', 'Stichall', 492.26, '1991-02-16');");
        st.addBatch("insert into students (id, firstName, lastName, "
                + "tuitionFees, birthday) values (12, 'Marsiella', 'Baudy', 2121.89, '1994-05-23');");
        st.addBatch("insert into students (id, firstName, lastName, "
                + "tuitionFees, birthday) values (13, 'Sileas', 'Labes', 2008.79, '2000-12-07');");
        st.addBatch("insert into students (id, firstName, lastName, "
                + "tuitionFees, birthday) values (14, 'Edlin', 'Padilla', 211.77, '1993-10-19');");
        st.addBatch("insert into students (id, firstName, lastName, "
                + "tuitionFees, birthday) values (15, 'Melissa', 'Fairey', 356.19, '1982-04-06');");
        st.addBatch("insert into students (id, firstName, lastName, "
                + "tuitionFees, birthday) values (16, 'Verne', 'Doley', 1439.66, '1998-06-23');");
        st.addBatch("insert into students (id, firstName, lastName, "
                + "tuitionFees, birthday) values (17, 'Lyda', 'Taylder', 1847.24, '1977-10-11');");
        st.addBatch("insert into students (id, firstName, lastName, "
                + "tuitionFees, birthday) values (18, 'Gwendolyn', 'Botley', 1048.37, '1974-03-09');");
        st.addBatch("insert into students (id, firstName, lastName, "
                + "tuitionFees, birthday) values (19, 'Gabie', 'Copsey', 2278.67, '1981-08-31');");
        st.addBatch("insert into students (id, firstName, lastName, "
                + "tuitionFees, birthday) values (20, 'Doralynne', 'Mulqueen', 1517.8, '1997-03-16');");
        st.addBatch("insert into students (id, firstName, lastName, "
                + "tuitionFees, birthday) values (21, 'Loren', 'Liddiard', 335.97, '1986-11-09');");
        st.addBatch("insert into students (id, firstName, lastName, "
                + "tuitionFees, birthday) values (22, 'Ashli', 'South', 1064.63, '1992-08-04');");
        st.addBatch("insert into students (id, firstName, lastName, "
                + "tuitionFees, birthday) values (23, 'Lloyd', 'Skally', 2038.57, '1970-01-13');");
        st.addBatch("insert into students (id, firstName, lastName, "
                + "tuitionFees, birthday) values (24, 'Leila', 'Goodman', 676.47, '1973-03-10');");
        st.addBatch("insert into students (id, firstName, lastName, "
                + "tuitionFees, birthday) values (25, 'Zacharias', 'Pilgrim', 310.37, '1986-07-07');");
        st.addBatch("insert into students (id, firstName, lastName, "
                + "tuitionFees, birthday) values (26, 'Maryann', 'Fleote', 1433.37, '1970-05-14');");
        st.addBatch("insert into students (id, firstName, lastName, "
                + "tuitionFees, birthday) values (27, 'Irene', 'Schurcke', 75.68, '1995-04-14');");
        st.addBatch("insert into students (id, firstName, lastName, "
                + "tuitionFees, birthday) values (28, 'Iosep', 'Smieton', 1678.81, '1971-03-21');");
        st.addBatch("insert into students (id, firstName, lastName, "
                + "tuitionFees, birthday) values (29, 'Berky', 'Hannaby', 492.6, '1990-05-25');");
        st.addBatch("insert into students (id, firstName, lastName, "
                + "tuitionFees, birthday) values (30, 'Hadlee', 'Braund', 2071.91, '1986-12-27');");
        st.addBatch("insert into students (id, firstName, lastName, "
                + "tuitionFees, birthday) values (31, 'Elonore', 'Cadany', 1227.99, '2000-07-24');");
        st.addBatch("insert into students (id, firstName, lastName, "
                + "tuitionFees, birthday) values (32, 'Bill', 'Kingaby', 679.06, '1976-02-13');");
        st.executeBatch();
        ConnectionToDataBase.closeAConnection(con);
        ConnectionToDataBase.closeAStatement(st);
    }

    public final static void deleteEveryStudent() {
        Connection con = null;
        Statement st = null;
        String sql = "Delete FROM students";
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
