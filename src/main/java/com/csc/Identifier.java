package com.csc;

public class Identifier
{
    public int isPasteurized(ListofCheese list)
    {
        int count = 0;

        for (int i = 0; i < list.numOfCheese(); i++)
        {
            String current = list.getCheese(i).getMTR();
            if (current.indexOf("Pasteurized") != -1)
            {
                count++;

            }

        }

        return count;

    }

    public int orgAndMoist(ListofCheese list)
    {
        int count = 0;

        for (int i = 0; i < list.numOfCheese(); i++)
        {
            Cheese current = list.getCheese(i);
            if (current.getO() == 1 && current.getML() > 41.0)
            {
                count++;
                
            }

        }

        return count;

    }

    public String commonMilkType(ListofCheese list)
    {
        int cowCount = 0;
        int goatCount = 0;
        int eweCount = 0;
        int buffaloCount = 0;

        for (int i = 0; i < list.numOfCheese(); i++)
        {
            String current = list.getCheese(i).getMTY();
            if (current.indexOf("Cow") != -1)
            {
                cowCount++;

            }

            if (current.indexOf("Goat") != -1)
            {
                goatCount++;

            }

            if (current.indexOf("Ewe") != -1)
            {
                eweCount++;

            }

            if (current.indexOf("Buffalo") != -1)
            {
                buffaloCount++;

            }

        }

        String mostAnimal = "Cow";
        int mostCount = cowCount;

        if (mostCount < goatCount)
        {
            mostAnimal = "Goat";
            mostCount = goatCount;

        } else if (mostCount == goatCount) {
            mostAnimal = mostAnimal + "/Goat";

        }

        if (mostCount < eweCount)
        {
            mostAnimal = "Ewe";
            mostCount = eweCount;

        } else if (mostCount == eweCount) {
            mostAnimal = mostAnimal + "/Ewe";

        }

        if (mostCount < buffaloCount)
        {
            mostAnimal = "Buffalo";
            mostCount = buffaloCount;

        } else if (mostCount == buffaloCount) {
            mostAnimal = mostAnimal + "/Buffalo";

        }

        mostAnimal = mostAnimal + " - " + Integer.toString(mostCount);
        return mostAnimal;

    }

}