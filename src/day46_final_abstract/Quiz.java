package day46_final_abstract;

import java.io.IOException;

public class Quiz {

    //public static void main(String[] args) throws RuntimeException{ //unchecked exception, u need to give IOException or Exception
    public static void main(String[] args) throws Exception{
        method();
    }

    public static void method() throws IOException{ //cheap way to handle it. // checked
        throw new IOException();
    }





}
