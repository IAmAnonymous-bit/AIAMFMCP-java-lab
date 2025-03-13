package com.csc;

public class Cheese
{
    private String milkTreatment;
    private String organic;
    private String moistureLevel;
    private String milkType;

    public Cheese(String mtr, String o, String ml, String mty)
    {
        milkTreatment = mtr;
        organic = o;
        moistureLevel = ml;
        milkType = mty;

    }

    public String getMTR()
    {
        return milkTreatment;

    }
    
    public int getO()
    {
        int myInt = 0;

        try
        {
            myInt = Integer.parseInt(organic);

        } catch (Exception e) {
            myInt = 0;

        }

        return myInt;

    }

    public double getML()
    {
        double myDouble = 0.0;
        try
        {
            myDouble = Double.parseDouble(moistureLevel);

        } catch (Exception e) {
            myDouble = 0.0;

        }

        return myDouble;

    }

    public String getMTY()
    {
        return milkType;

    }


}