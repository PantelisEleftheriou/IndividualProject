/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pantelis.school.project.with.db;

import SyntheticData.AssingmentSyntheticList;
import SyntheticData.CourseSyntheticList;
import SyntheticData.StudentSyntheticList;
import SyntheticData.StudentsPerAssingmentSyntheticList;
import SyntheticData.StudentsPerCourseSyntheticList;
import SyntheticData.TrainerSyntheticList;
import Utils.OutputMessages;
import Utils.ScannerData;
import java.sql.SQLException;

/**
 *
 * @author Pantelis
 */
public class PantelisSchoolSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean loopExit = true;
        String choise;
        do {
            choise = ScannerData.inputString("If you want to insert the data press 1 else.\nIf you want to put some synthetic data press 2 :");
            if (choise.equals("1")) {
                while (loopExit == true) {
                    OutputMessages.firstMessages();
                    choise = ScannerData.inputString("");
                    switch (choise) {
                        case "1":
                            Menu.addStudentCourseTrainerAssingment();
                            break;
                        case "2":
                            Menu.addChoisePerCourse();
                            break;
                        case "3":
                            Menu.outputMenu();
                            break;
                        case "4":

                            TrainerSyntheticList.deleteEveryTrainer();
                            AssingmentSyntheticList.deleteEveryAssingment();
                            StudentsPerCourseSyntheticList.deleteEveryStudentPerCourse();
                            StudentsPerAssingmentSyntheticList.deleteEveryStudentPerAssingment();
                            StudentSyntheticList.deleteEveryStudent();
                            CourseSyntheticList.deleteEveryCourse();
                            break;
                        case "5":
                            loopExit = false;
                            break;
                        default:
                            System.out.println("Not valid value, try again: ");
                    }
                }
            } else if (choise.equals("2")) {

                do {
                    try {
                        CourseSyntheticList.setCourseSyntheticList();
                        StudentSyntheticList.setStudentSyntheticList();
                        TrainerSyntheticList.setTrainerSyntheticList();
                        AssingmentSyntheticList.setAssingmentSyntheticList();
                        StudentsPerCourseSyntheticList.setStudentsPerCourseSyntheticList();
                        StudentsPerAssingmentSyntheticList.setStudentsPerAssingmentSyntheticList();
                        break;
                    } catch (SQLException e) {
                        TrainerSyntheticList.deleteEveryTrainer();
                        AssingmentSyntheticList.deleteEveryAssingment();
                        StudentsPerCourseSyntheticList.deleteEveryStudentPerCourse();
                        StudentsPerAssingmentSyntheticList.deleteEveryStudentPerAssingment();
                        StudentSyntheticList.deleteEveryStudent();
                        CourseSyntheticList.deleteEveryCourse();

                    }
                } while (true);

                while (loopExit) {
                    System.out.println("Press 1 for output.");
                    System.out.println("Press 2 for end the program.");
                    choise = ScannerData.inputString("");
                    switch (choise) {
                        case "1":
                            Menu.outputMenu();
                            break;
                        case "2":
                            loopExit = false;
                            break;
                        default:
                            System.out.println("Not valid value, try again: ");
                    }
                }
            } else {
                System.out.println("Not valid value.\nTry again!");
            }
        } while (loopExit);
    }
}
