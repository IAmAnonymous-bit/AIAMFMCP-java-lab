package com.csc;

public class CRowCleaner
{
    public String[] clean(String line)
    {
        String editLine = "";
        for (int i = 0; i < line.length()-1; i++)
        {
            if(line.substring(i, i+1).equals(",") && !line.substring(i+1,i+2).equals(" "))
            {
                editLine += ";";

            } else {
                editLine += line.substring(i,i+1);
            }

        }
        editLine += line.substring(line.length()-1);
        String[] newLine = editLine.split(";");
        return newLine;

    }

}