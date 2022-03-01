/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.Course;

/**
 *
 * @author Pantelis
 */
public interface CourseDaoInt {
    
    public Course inputACourse();
    
    public void insertCourseInDB(Course c);
    
    public List<Course> allCourses();
    
    public Course courseFinder(String fulltitle);
    
}
