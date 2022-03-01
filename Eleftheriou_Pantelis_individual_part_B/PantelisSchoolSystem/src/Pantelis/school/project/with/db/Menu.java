/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pantelis.school.project.with.db;

import Utils.OutputMessages;
import Utils.ScannerData;
import dao.*;
import java.util.ArrayList;
import java.util.List;
import model.Assingment;

/**
 *
 * @author Pantelis
 */
public class Menu {

    private static AssingmentDaoInt assingment = new AssingmentDaoImpl();
    private static StudentDaoInt student = new StudentDaoImpl();
    private static CourseDaoInt course = new CourseDaoImpl();
    private static TrainerDaoInt trainer = new TrainerDaoImpl();
    private static List assingmentList;
    private static List studentList;
    private static List trainerList;
    private static List courseList;

    public static void outputMenu() {
        String choice;
        boolean loopExit = true;
        do {
            OutputMessages.outputChoiceMessage();
            choice = ScannerData.inputString("");
            switch (choice) {
                case "1":
                    outputStudentCourseTrainerAssingment();
                    break;
                case "2":
                    outputPerCourse();
                    break;
                case "3":
                    assingmentList = assingment.allAssingmentsPerStudentPerCourse(student.studentFinder(ScannerData.inputString("Give me the full name of the student")));
                    if (assingmentList==null) {
                    }
                    else if (!assingmentList.isEmpty()){
                        System.out.println(assingmentList.toString().replace(",", ""));
                    } else {
                        System.out.println("This student does not have any assingment.");
                    }
                    break;
                case "4":
                    studentList = student.allStudentsWithMoreThanOneCourse();
                    if(!studentList.isEmpty())
                    System.out.println(studentList.toString().replace(",", ""));
                    else System.out.println("There is not any student with more than one course.");
                    break;
                case "5":
                    loopExit = false;
                    break;
                default:
                    System.out.println("Not valid value.");
            }
        } while (loopExit != false);
    }

    public static void outputStudentCourseTrainerAssingment() {
        String choice;
        boolean loopExit = true;
        do {
            OutputMessages.outputStudentCourseTrainerAssingmentMessage();
            choice = ScannerData.inputString("");
            switch (choice) {
                case "1":
                    studentList = student.allStudents();
                    if (!studentList.isEmpty()){
                        System.out.println(studentList.toString().replace(",", ""));
                    } else {
                        System.out.println("There is not any student in the system.");
                    }
                    break;
                case "2":
                     courseList = course.allCourses();
                    if (!courseList.isEmpty()){
                        System.out.println(courseList.toString().replace(",", ""));
                    } else {
                        System.out.println("There is not any course in the system.");
                    }
                    break;
                case "3":
                     trainerList = trainer.allTrainers();
                    if (!trainerList.isEmpty()){
                        System.out.println(trainerList.toString().replace(",", ""));
                    } else {
                        System.out.println("There is not any trainer in the system.");
                    }
                    break;
                case "4":
                    assingmentList = assingment.allAssingments();
                    if (!assingmentList.isEmpty()){
                        System.out.println(assingmentList.toString().replace(",", ""));
                    } else {
                        System.out.println("There is not any assingment in the system.");
                    }
                    break;
                case "5":
                    loopExit = false;
                    break;
                default:
                    System.out.println("Not valid value.");
            }
        } while (loopExit != false);

    }

    public static void outputPerCourse() {
        String choice;
        boolean loopExit = true;
        do {
            OutputMessages.outputPerCourseChoiceMessage();
            choice = ScannerData.inputString("");
            switch (choice) {
                case "1":
                    studentList = student.allStudentsPerCourse(course.courseFinder(ScannerData.inputString("Give me the title,stream and type of the course: ")));
                    if (studentList==null) {
                    }
                    else if (!studentList.isEmpty()){
                        System.out.println(studentList.toString().replace(",", ""));
                    } else {
                        System.out.println("This course does not have any student.");
                    }
                    break;
                case "2":
                    trainerList = trainer.allTrainersPerCourse(course.courseFinder(ScannerData.inputString("Give me the title,stream and type of the course: ")));
                    if (trainerList==null) {
                    }
                    else if (!trainerList.isEmpty()){
                        System.out.println(trainerList.toString().replace(",", ""));
                    } else {
                        System.out.println("This course does not have any trainer.");
                    }
                    break;
                case "3":
                     assingmentList = assingment.allAssingmentsPerCourse(course.courseFinder(ScannerData.inputString("Give me the title,stream and type of the course: ")));
                    if (assingmentList==null) {
                    }
                    else if (!assingmentList.isEmpty()){
                        System.out.println(assingmentList.toString().replace(",", ""));
                    } else {
                        System.out.println("This course does not have any assingment.");
                    }
                    break;
                case "4":
                    loopExit = false;
                    break;
                default:
                    System.out.println("Not valid value.");
            }
        } while (loopExit != false);
    }

    public static void addChoisePerCourse() {
        String choice;
        boolean loopExit = true;
        do {
            OutputMessages.addChoisePerCourseMessage();
            choice = ScannerData.inputString("");
            switch (choice) {
                case "1":
                    student.insertAStudentInACourse(course.courseFinder(ScannerData.inputString("Give me the title,stream and type of the course: ")));
                    break;
                case "2":
                    trainer.insertTrainerInACourse(course.courseFinder(ScannerData.inputString("Give me the title,stream and type of the course: ")));
                    break;
                case "3":
                    assingment.insertAssingmentInACourse(course.courseFinder(ScannerData.inputString("Give me the title,stream and type of the course: ")));
                    break;
                case "4":
                    loopExit = false;
                    break;
                default:
                    System.out.println("Not valid value.");
            }
        } while (loopExit != false);
    }

    public static void addStudentCourseTrainerAssingment() {
        String choice;
        boolean loopExit = true;
        do {
            OutputMessages.addStudentCourseTrainerAssingmentMessage();
            choice = ScannerData.inputString("");
            switch (choice) {
                case "1":
                    student.insertStudentInDB(student.inputAStudent());
                    break;
                case "2":
                    course.insertCourseInDB(course.inputACourse());
                    break;
                case "3":
                    trainer.insertTrainerInDB(trainer.inputATrainer());
                    break;
                case "4":
                    assingment.insertAssingmentInDB(assingment.inputAnAssingment());
                    break;
                case "5":
                    loopExit = false;
                    break;
                default:
                    System.out.println("Not valid value.");
            }
        } while (loopExit != false);
    }

}
