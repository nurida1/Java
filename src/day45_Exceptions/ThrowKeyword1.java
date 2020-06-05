package day45_Exceptions;

import java.io.IOException;
import java.util.NoSuchElementException;

public class ThrowKeyword1 {
//chrome, firefox, opera...

    public static void main(String[] args) throws Exception{

        NoSuchElementException obj = new NoSuchElementException();

        //throw obj;
        //throw new NoSuchElementException();

        //System.out.println(); u cannot print anything after throw
/*
        boolean breakTime = true;

        if (breakTime) {
            throw new RuntimeException("It's break time, we should take break");
        }
 */
            throw new IOException();


    }
}
