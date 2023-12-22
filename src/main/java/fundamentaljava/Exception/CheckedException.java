package fundamentaljava.Exception;

import java.io.IOException;

import fundamentaljava.Inheritance.Hybrid.cat;

public class CheckedException 
{
    public static void main(String[] args) throws IOException,InterruptedException
    {
        // compile time Exception 
        // 1)IOEXCEPTION
        // 2)INterurped exception
        Runtime run=Runtime.getRuntime();//predefined class.. getRuntime method inside using private of object is stored
        Process pro;
            pro=run.exec("notepad");
            Thread.sleep(4000);
            pro=run.exec("calc");
        

    }
}


