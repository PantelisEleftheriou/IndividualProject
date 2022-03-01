/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import Utils.Layouts;
import java.time.LocalDateTime;

/**
 *
 * @author Pantelis
 */
public class Assingment {

    private int id, courseID;
    private String title;
    private String description;
    private float oralMark;
    private float totalMark;
    private LocalDateTime subDateTime;

    public Assingment(int id, String title, String description, float oralMark, float totalMark, LocalDateTime subDateTime, int courseID) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.oralMark = oralMark;
        this.totalMark = totalMark;
        this.subDateTime = subDateTime;
        this.courseID = courseID;
    }

    public Assingment() {
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getOralMark() {
        return oralMark;
    }

    public void setOralMark(float oralMark) {
        this.oralMark = oralMark;
    }

    public float getTotalMark() {
        return totalMark;
    }

    public void setTotalMark(float totalMark) {
        this.totalMark = totalMark;
    }

    public LocalDateTime getSubDateTime() {
        return subDateTime;
    }

    public void setSubDateTime(LocalDateTime subDateTime) {
        this.subDateTime = subDateTime;
    }
    
    @Override
    public String toString() {
        return Layouts.layoutst() + "\nTitle: " + title + "\nDescription: " 
                + Layouts.largeStringsLayout(description) + "\nOral Mark: " + oralMark 
                + "\nTotal Mark: " + totalMark + "\nSubmission Date and Time: " + subDateTime + "\n";
    }
}
