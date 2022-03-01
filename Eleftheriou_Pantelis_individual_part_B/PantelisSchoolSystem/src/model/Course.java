/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import Utils.Layouts;
import java.time.LocalDate;

/**
 *
 * @author Pantelis
 */
public class Course {
    
    private int id;
    private String title, stream, type;
    private LocalDate startDate, endDate;

    public Course(int id,String title, String stream, String type, LocalDate startDate, LocalDate endDate) {
        this.id = id;
        this.title = title;
        this.stream = stream;
        this.type = type;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Course() {
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

    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
    
    @Override
    public String toString() {
        return Layouts.layoutst() + "\nTitle: " + title + "\nStream: " + stream + 
                "\nType: " + type + "\nStart Date: " + startDate + "\nEnd Date: "+ endDate + "\n";
    }

}
