/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.Course;
import model.Trainer;

/**
 *
 * @author Pantelis
 */
public interface TrainerDaoInt {
    
    public Trainer inputATrainer();
    
    public void insertTrainerInDB(Trainer t);
    
    public void insertTrainerInACourse(Course c);
    
    public List<Trainer> allTrainers();
    
    public List<Trainer> allTrainersPerCourse(Course c);
    
    public Trainer trainerFinder(String fullName);
    
    
}
