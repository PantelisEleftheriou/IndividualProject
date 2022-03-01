/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.Course;
import model.Student;

/**
 *
 * @author Pantelis
 */
public interface StudentDaoInt {
    
    public Student inputAStudent();
    
    public void insertStudentInDB(Student s);
    
    public List<Student> allStudents();
    
    public List<Student> allStudentsPerCourse(Course c);
    
    public List<Student> allStudentsWithMoreThanOneCourse();
    
    public void insertAStudentInACourse(Course c);
    
    public Student studentFinder(String fullName);
    
    
}
