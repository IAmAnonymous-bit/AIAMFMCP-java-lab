package com.csc;
import java.util.ArrayList;

public class ListofCheese
{
    private ArrayList<Cheese> cheeses = new ArrayList<Cheese>();

    public void addCheese(Cheese c)
    {
        cheeses.add(c);

    }

    public Cheese getCheese(int n)
    {
        return cheeses.get(n);

    }

    public int numOfCheese()
    {
        return cheeses.size();
        
    }

}