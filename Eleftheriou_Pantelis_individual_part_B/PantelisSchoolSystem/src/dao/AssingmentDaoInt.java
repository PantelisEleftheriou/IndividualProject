/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.Assingment;
import model.Course;
import model.Student;

/**
 *
 * @author Pantelis
 */
public abstract interface AssingmentDaoInt {
    
    
    public Assingment inputAnAssingment();
    
    public void insertAssingmentInDB(Assingment a);
    
    public List<Assingment> allAssingments();
    
    public List<Assingment> allAssingmentsPerStudentPerCourse(Student s);
    
    public void insertAssingmentInACourse(Course c);
    
    public List<Assingment> allAssingmentsPerCourse(Course c);
    
    public Assingment assingmentFinder(String fullTitle);
    
}
