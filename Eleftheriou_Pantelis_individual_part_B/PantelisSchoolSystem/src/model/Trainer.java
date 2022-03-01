/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import Utils.Layouts;

/**
 *
 * @author Pantelis
 */
public class Trainer {
    
    private int id,courseID;
    private String firstName, lastName, subject;

    public Trainer(int id, String firstName, String lastName, String subject, int courseID) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
        this.courseID = courseID;
    }

    public Trainer() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    
    @Override
    public String toString() {
        return Layouts.layoutst() + "\nFirst Name: " + firstName + "\nLast Name: " + lastName + 
                "\nSubject: " + subject + "\n";
    }
    
}
