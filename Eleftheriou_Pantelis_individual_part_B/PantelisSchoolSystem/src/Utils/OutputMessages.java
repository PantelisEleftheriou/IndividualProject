/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

/**
 *
 * @author Pantelis
 */
public class OutputMessages {

    public static final void firstMessages() {
        System.out.println("Choose an option:");
        System.out.println("Press 1 if you want to add a student or a course or a trainer or an assingment.");
        System.out.println("Press 2 if you want to add a student or trainer or an assingment into a course.");
        System.out.println("Press 3 if you want to output the data.");
        System.out.println("Press 4 if you want to delete all data from the database");
        System.out.println("Press 5 if you want to end this programm.");
    }

    public static final void outputChoiceMessage() {
        System.out.println("Choose an option:");
        System.out.println("Press 1 if you want to output the student or course or trainer or assingment list.");
        System.out.println("Press 2 if you want to output the students or trainers or assingments per course.");
        System.out.println("Press 3 if you want to output the assingments per student.");
        System.out.println("Press 4 if you want to output student with more than one course.");
        System.out.println("Press 5 if you want to exit in the main menu.");
    }

    public static final void outputPerCourseChoiceMessage() {
        System.out.println("Choose an option:");
        System.out.println("Press 1 if you want to output the students per course");
        System.out.println("Press 2 if you want to output the trainers per course.");
        System.out.println("Press 3 if you want to output the assingments per course.");
        System.out.println("Press 4 if you want to go back.");
    }

    public static final void addStudentCourseTrainerAssingmentMessage() {
        System.out.println("Choose an option:");
        System.out.println("Press 1 if you want to add a student.");
        System.out.println("Press 2 if you want to add a course.");
        System.out.println("Press 3 if you want to add a trainer.");
        System.out.println("Press 4 if you want to add an assingment.");
        System.out.println("Press 5 if you want to exit in the main menu.");
    }

    public static final void addChoisePerCourseMessage() {
        System.out.println("Choose an option:");
        System.out.println("Press 1 if you want add a student into a course");
        System.out.println("Press 2 if you want add a trainer into a course");
        System.out.println("Press 3 if you want add an assingment into a course");
        System.out.println("Press 4 if you want to exit in the main menu.");
    }

    public static void outputStudentCourseTrainerAssingmentMessage() {
        System.out.println("Choose an option:");
        System.out.println("Press 1 if you want to output the student list.");
        System.out.println("Press 2 if you want to output the course list.");
        System.out.println("Press 3 if you want to output the trainer list.");
        System.out.println("Press 4 if you want to output the assingments list.");
        System.out.println("Press 5 if you want to go back.");
    }
}
