package org.example;

class GPA extends DET
{

    String studname;
    String gradelvl;

    double gpapoint;
    double temp;

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
            gpapoint= input.nextDouble();
            if(gpapoint<=10 && gpapoint>=1)
            {
                break;
            }
        } while (true);
    }
    double update(double temp)
    {
        val=temp;
        set=1;
        return val;
    }
    void checkrecord(String recordname)
    {

        if(studname.equals(recordname))
        {
            LOGGER.info("your Gpa Must Be greater than 0 and less than 10");
            do {
                LOGGER.info("Enter new  Gpa:");
                temp= input.nextDouble();
                if(temp<=10 && temp>=1)
                {
                    break;
                }
            } while (true);
            update(temp);
            LOGGER.info("Updated successfully");

        }
        else
        {
            LOGGER.warning("NO result Found Try again");

        }
    }
    String display()
    {
        String q=String.valueOf(gpapoint);

        if(set==1) {

            con = studname + " has a " + update(temp) + " Gpa";
        }
        else{
            con = studname + " has a " + q + " Gpa";
        }


        return con;
    }
}