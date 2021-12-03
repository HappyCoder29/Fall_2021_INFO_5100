package edu.northeastern.ashish;

import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        getDateOfBirthFromUser();
    }

    private static void getDateOfBirthFromUser() {

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter Drivers Birth date in format MM/DD/YYYY");

        String strYear = myObj.nextLine();  // Read user input
        int year = Integer.parseInt(strYear);
        System.out.println("Enter Drivers Birth Month");

        String strMonth = myObj.nextLine();  // Read user input
        int month = Integer.parseInt(strMonth);

        System.out.println("Enter Drivers Birth Date");

        String strDate = myObj.nextLine();  // Read user input
        int day = Integer.parseInt(strDate);

        Date dateNow = new Date();

        Date date = new GregorianCalendar(year, month -1, day).getTime();

        int difference = (int) ChronoUnit.DAYS.between( date.toInstant(), dateNow.toInstant());
        if(365* 16 > difference){
            System.out.println("User is below age limit");
        }

    }
}
