package com.csc;
import java.io.FileOutputStream;

public class CWriter
{
    private String fileName;

    public CWriter (String fN)
    {
        fileName = fN;

    }

    public void write_cheese_data(String w)
    {
        try
        {
            FileOutputStream fos = new FileOutputStream(fileName);
            byte[] wtob = w.getBytes();
            fos.write(wtob);
            fos.close();

        } catch (Exception e) {

        }

    }

}