package com.csc;

public class CheeseAnalyzer 
{
  // You can put source code here
  public static void main(String args[])
  {
     CReader cr = new CReader("cheese_data.csv");
     CWriter cw = new CWriter("output.txt");
     Identifier id = new Identifier();
     ListofCheese list = cr.read();
     
     String line1 = "Num of Cheeses: " + Integer.toString(list.numOfCheese());
     String line2 = "Pasteurized Cheeses: " + Integer.toString(id.isPasteurized(list));
     String line3 = "Organic and Moisturized Cheese: " + Integer.toString(id.orgAndMoist(list));
     String line4 = "Most Used Animal Milk: " + id.commonMilkType(list);
     cw.write_cheese_data(line1 + "\n" + line2 + "\n" + line3 + "\n" + line4);

  }

}
