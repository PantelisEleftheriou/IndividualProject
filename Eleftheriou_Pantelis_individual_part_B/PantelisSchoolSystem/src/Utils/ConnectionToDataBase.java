/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import java.sql.*;
import java.util.ArrayList;


/**
 *
 * @author Pantelis
 */
public class ConnectionToDataBase {

    public static Connection con = null;
    private static final String MYSQLURL = "jdbc:mysql://localhost:3306/privateschooldatabase"
            + "?zeroDateTimeBehavior=CONVERT_TO_NULL"
            + "&useUnicode=true"
            + "&useJDBCCompliantTimezoneShift=true"
            + "&useLegacyDatetimeCode=false"
            + "&serverTimezone=UTC"
            + "&allowPublicKeyRetrieval=true"
            + "&useSSL=false";

    public static Connection getCon() throws SQLException {
        con = DriverManager.getConnection(MYSQLURL, "root", "qwerty");
        return con;
    }
    
    public static void closeAConnection(Connection con){
        try {
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void closeAResultSet(ResultSet rs){
        if (rs!=null) {
            try {
            rs.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        }
        
    }
    
    public static void closeAStatement(Statement st){
        try {
            st.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void closeAPreparedStatement(PreparedStatement pst){
        try {
            pst.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public static Statement addStatementBatch(ArrayList<String> sqls, Statement st) throws SQLException{
        for (String sql:sqls){
        st.addBatch(sql);
        }
        return st;
    }
    
}
