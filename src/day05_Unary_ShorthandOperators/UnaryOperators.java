package day05_Unary_ShorthandOperators;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;

public class UnaryOperators {
    public static void main(String[] args) {
        int a =10; //positive 10
        int b = +a;//positive 10

        System.out.println(a);
        System.out.println(b);

        int a2 =-10;
        boolean result1 = a2>0; //false
        boolean result2 = a2<0; //true

        System.out.println(result1);
        System.out.println(result2);

        int x1 = -10;
        int y1=-x1;
        //       -(-10) ==> +10
        System.out.println(y1);  //10

        int x2 = +20;
        int y2 = -x2;
               //-(+20)
        System.out.println(y2);

        int x3 = +20;
        int y = +x3;

        //PRE:
        int Z = 100;
        System.out.println(++Z); //101, increases it immediately
        System.out.println(Z); //101

        //POST:
        int P = 100;
        System.out.println(P++); //100, first passes the current value
        System.out.println(P); //increases the value by 1















    }

}
