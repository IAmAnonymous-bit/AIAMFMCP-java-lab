package com.csc;
import java.io.BufferedReader;
import java.io.FileReader;

public class CReader
{
    private String fileName;
    private CParser p = new CParser();
    private CRowCleaner crl = new CRowCleaner();

    public CReader(String fN)
    {
        fileName = fN;

    }

    public ListofCheese read()
    {
        ListofCheese list = new ListofCheese();

        try
        {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            boolean skipLine1 = false;

            while ((line = reader.readLine()) != null) {
                if (skipLine1 == false)
                {
                    skipLine1 = true;

                } else {
                    Cheese ch = create_cheese(line);
                    list.addCheese(ch);
                    
                }

            }

            reader.close();

        } catch (Exception e) {

        }

        return list;

    }

    private Cheese create_cheese(String line)
    {
        String[] cleaned = crl.clean(line);
        Cheese ch = p.parse(cleaned);
        return ch;

    }    

}