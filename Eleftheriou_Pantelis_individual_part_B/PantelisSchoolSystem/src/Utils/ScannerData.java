/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

/**
 *
 * @author Pantelis
 */
public class ScannerData {
    
    private static final Scanner INPUT = new Scanner(System.in);
    private static boolean loopExit;

    public final static LocalDate inputDate(String outputMessage) {
        LocalDate date = null;
        String dateString;
        loopExit = true;
        System.out.println(outputMessage);
        do {
            try {
                dateString = INPUT.nextLine();
                String[] dateLayout = dateString.split("/");

                date = LocalDate.of(Integer.parseInt(dateLayout[2]), Integer.parseInt(dateLayout[01]), Integer.parseInt(dateLayout[0]));
                loopExit = false;
            } catch (Exception e) {
                System.out.println("Try again: ");
            }
        } while (loopExit);
        return date;
    }
    
    public final static LocalDateTime inputDateTime(String outputMessage) {
        LocalDateTime dateTime;
        System.out.println(outputMessage);
        dateTime = LocalDateTime.of(inputDate("Give the date (dd/mm/yyyy)"), inputTime("Give me the hour (HH:MM): "));
        return dateTime;
    }

    public final static LocalTime inputTime(String outputMessage) {
        LocalTime time = null;
        String timeString;
        loopExit = true;
        System.out.println(outputMessage);
        do {
            try {
                timeString = INPUT.nextLine();
                String[] timeLayout = timeString.split(":");
                time = LocalTime.of(Integer.parseInt(timeLayout[0]), Integer.parseInt(timeLayout[1]));
                loopExit = false;
            } catch (Exception e) {
                System.out.println("Try again: ");
            }
        } while (loopExit);
        return time;
    }

    public final static String inputString(String outputMessage) {
        String data;
        if (outputMessage.length() > 0) {
            System.out.println(outputMessage);
            data = INPUT.nextLine().toUpperCase();
        } else {
            data = INPUT.nextLine().toUpperCase();
        }
        return data;
    }

    public static float inputFloat(String outputMessage) {
        float inputFloat = 0;
        loopExit = true;
        System.out.println(outputMessage);
        do {
            try {
                inputFloat = Float.parseFloat(INPUT.nextLine());
                loopExit = false;
            } catch (Exception e) {
                System.out.println("Try again: ");
            }
        } while (loopExit);

        return inputFloat;
    }

    public static int inputInt(String outputMessage) {
        int inputInt = 0;
        loopExit = true;
        System.out.println(outputMessage);
        do {
            try {
                inputInt = Integer.parseInt(INPUT.nextLine());
                loopExit = false;
            } catch (Exception e) {
                System.out.println("Try again: ");
            }
        } while (loopExit);

        return inputInt;
    }
    
}
