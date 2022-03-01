/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Utils.ConnectionToDataBase;
import Utils.ScannerData;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Course;
import model.Trainer;

/**
 *
 * @author Pantelis
 */
public class TrainerDaoImpl implements TrainerDaoInt {

    @Override
    public Trainer inputATrainer() {
        Trainer trainer = new Trainer();
        trainer.setFirstName(ScannerData.inputString("Give me the first name of the trainer: "));
        trainer.setLastName(ScannerData.inputString("Give me the last name of the trainer: "));
        trainer.setSubject(ScannerData.inputString("Give me the subject of the trainer: "));
        return trainer;
    }

    @Override
    public void insertTrainerInDB(Trainer t) {
        Connection con = null;
        PreparedStatement pst = null;
        String sql = "INSERT INTO `privateschooldatabase`.`trainers`"
                + " (`firstName`, `lastName`, `subject`)"
                + " VALUES (?,?,?);";
        try {
            con = ConnectionToDataBase.getCon();
            pst = con.prepareStatement(sql);
            pst.setString(1, t.getFirstName());
            pst.setString(2, t.getLastName());
            pst.setString(3, t.getSubject());
            pst.executeUpdate();
        } catch (SQLException ex) {
        } finally {
                ConnectionToDataBase.closeAConnection(con);
                ConnectionToDataBase.closeAPreparedStatement(pst);
        }
    }

    @Override
    public void insertTrainerInACourse(Course c) {
        if (c!=null) {
             Connection con = null;
        PreparedStatement pst = null;
        String sql = "UPDATE `privateschooldatabase`.`trainers` SET `courseID` = ? WHERE (`id` = ?);";
        try {
            con = ConnectionToDataBase.getCon();
            pst = con.prepareStatement(sql);
            pst.setInt(1, c.getId());
            pst.setInt(2, trainerFinder(ScannerData.inputString("Give me the full name of the trainer")).getId());
            pst.executeUpdate();
        } catch (SQLException | NullPointerException ex) {
        } finally {
               ConnectionToDataBase.closeAConnection(con);
               ConnectionToDataBase.closeAPreparedStatement(pst);
        }
        }
    }

    @Override
    public List<Trainer> allTrainers() {
        Connection con = null;
        ResultSet rs = null;
        Statement st = null;
        String sql = "SELECT * FROM trainers";
        ArrayList<Trainer> allTrainers = new ArrayList();
        try {
            con = ConnectionToDataBase.getCon();
           st = con.createStatement();
           rs = st.executeQuery(sql);
            while (rs.next()) {
                allTrainers.add(fillTrainer(rs));
            }
        } catch (SQLException ex) {
        } finally {
            ConnectionToDataBase.closeAConnection(con);
            ConnectionToDataBase.closeAResultSet(rs);
            ConnectionToDataBase.closeAStatement(st);
        }
        return allTrainers;
    }

    @Override
    public List<Trainer> allTrainersPerCourse(Course c) {
        Connection con = null;
        ResultSet rs = null;
        PreparedStatement pst;
        ArrayList<Trainer> allTrainersPerCourse = null;
        String sql = "SELECT t.*"
                + " FROM courses c, trainers t"
                + " WHERE c.id = t.courseID AND c.id = ?";
        try {
            con = ConnectionToDataBase.getCon();
            pst = con.prepareStatement(sql);
            pst.setInt(1, c.getId());
            rs = pst.executeQuery();
            allTrainersPerCourse = new ArrayList();
            while (rs.next()) {
                allTrainersPerCourse.add(fillTrainer(rs));
            }
        } catch (SQLException | NullPointerException ex) {
        } finally {
            ConnectionToDataBase.closeAConnection(con);
            ConnectionToDataBase.closeAResultSet(rs);
        }
        return allTrainersPerCourse;
    }

    @Override
    public Trainer trainerFinder(String fullName) {
        Trainer t = null;
        Connection con = null;
        ResultSet rs = null;
        PreparedStatement pst = null;
        fullName = fullName.replace(" ", "").replace("-", "");
        String sql = "SELECT * FROM trainers WHERE replace(replace(CONCAT(firstName, lastName),'-',''),' ','')=?"
                + " OR replace(replace(CONCAT(firstName,lastName),'-',''),' ','')=?;";
        try {
            con = ConnectionToDataBase.getCon();
            pst = con.prepareStatement(sql);
            pst.setString(1, fullName);
            pst.setString(2, fullName);
            rs = pst.executeQuery();
            while (rs.next()){
                t = fillTrainer(rs);
            }
        } catch (SQLException ex) {
        }
        finally{
            ConnectionToDataBase.closeAConnection(con);
            ConnectionToDataBase.closeAPreparedStatement(pst);
            ConnectionToDataBase.closeAResultSet(rs);
        }
        if (t==null) {
            System.out.println("There is not any trainer with this name");
        }
        return t;
    }
    
    private Trainer fillTrainer(ResultSet rs) throws SQLException{
        Trainer t = new Trainer();
        t.setId(rs.getInt("id"));
        t.setFirstName(rs.getString("firstName"));
        t.setLastName(rs.getString("lastName"));
        t.setSubject(rs.getString("subject"));
        t.setCourseID(rs.getInt("courseID"));
        return t;
    }
}
