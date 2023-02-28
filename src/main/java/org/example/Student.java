package org.example;


import java.util.logging.Logger;
import java.util.Scanner;

public class  Student {
    public static final Logger LOGGER = Logger.getLogger("InfoLogging");
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        GPA call=new GPA();
        LOGGER.info("Do you want Update your gpa (y/n):");

        String choice=input.nextLine();
        String dum=choice.toUpperCase();

        if(dum.equals("Y"))
        {
            LOGGER.info("Enter student name:");
            String recordname=input.nextLine();
            call.checkrecord(recordname);
        }
        else
        {
            LOGGER.warning("update Terminated");
        }
        String result=call.display();
        LOGGER.info(result);

    }
}