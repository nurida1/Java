package day06_Shorthnd_LogicalOperators;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class IfStatementsPractise {
    public static void main(String[] args) {
        int a = 100;
        int b = 200;

        if (a > b) { //false
            System.out.println(a+" is greater than "+b);
        }
        boolean bGreater = b > a;
        if( b > a) {
            System.out.println(b+ " is greater than " + a);

        }
        if(a == b){
            System.out.println(a+ " is equal to "+b);

        }

//        if (a>b && b > a && a==b) {
  //          System.out.println("");


        System.out.println("=============================================");
        int x = 200;
        int y = 300;
        boolean xGreater = x > y;
        boolean yGreater = y > x;

        if (xGreater) {
            System.out.println(x + " is greater than" + y);
        }

        if (yGreater) {

            System.out.println(y + " is greater than " + x);
        }





            }



            }

            


