package com.csc;

public class CParser
{
    public Cheese parse(String[] list)
    {
        Cheese newCheese = new Cheese(list[9], list[6], list[3], list[8]);
        return newCheese;

    }
    
}