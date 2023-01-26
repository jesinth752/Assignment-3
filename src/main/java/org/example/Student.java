package org.example;


import java.util.logging.Logger;
import java.util.Scanner;

 class DET
{
    public static final Logger LOGGER = Logger.getLogger("InfoLogging");
   Scanner input =new Scanner(System.in);
}

class GPA extends DET
{

    String studname;
    String gradelvl;

    double gpa;
    double newgpa;

    double val;
    String con;

    int set=0;


    GPA()
    {
    LOGGER.info("Enter Student Name:");
    studname=input.nextLine();
    LOGGER.info("Enter Grade leve:");
    gradelvl=input.nextLine();
    LOGGER.info("your Gpa Must Be greater than 0 and less than 10");
        do {
            LOGGER.info("Enter Gpa:");
            gpa = input.nextDouble();
        } while (!(gpa <= 10) || !(gpa >= 1));
    }
    double update(double newgpa)
    {
       val=newgpa;
        set=1;
        return val;
    }
    void REC(String recordname)
    {

      if(studname.equals(recordname))
      {
          LOGGER.info("your Gpa Must Be greater than 0 and less than 10");
          do {
              LOGGER.info("Enter new  Gpa:");
              newgpa= input.nextDouble();
          } while (!(newgpa <= 10) || !(newgpa >= 1));
          update(newgpa);
          LOGGER.info("Updated successfully");

      }
      else
      {
          LOGGER.warning("NO result Found Try again");

      }
  }
  String display()
  {
      String q=String.valueOf(gpa);

      if(set==1) {

          con = studname + " has a " + update(newgpa) + " Gpa";
      }
      else{
          con = studname + " has a " + q + " Gpa";
      }


    return con;
  }
}
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
            call.REC(recordname);
        }
        else
        {
            LOGGER.warning("update Terminated");
        }

            LOGGER.info(call.display());

    }
}