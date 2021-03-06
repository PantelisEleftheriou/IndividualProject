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
public class Student {
    
    private int id;
    private String firstName, lastName;
    private float tuitionFees;
    private LocalDate dateOfBirth;

    public Student(int id, String firstName, String lastName, float tuitionFees, LocalDate dateOfBirth) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.tuitionFees = tuitionFees;
        this.dateOfBirth = dateOfBirth;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public float getTuitionFees() {
        return tuitionFees;
    }

    public void setTuitionFees(float tuitionFees) {
        this.tuitionFees = tuitionFees;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return Layouts.layoutst() + "\nFirst Name: " + firstName + "\nLast Name: " + lastName + 
                "\nTuition Fees: " + tuitionFees + "$" + "\nDate Of Birth: " + dateOfBirth + "\n";
    }
    
}
