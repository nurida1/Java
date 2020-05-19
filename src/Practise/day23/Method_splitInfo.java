package Practise.day23;

import java.util.Scanner;

/*
The method person get a string with this format : "name,last name,age". For example: person("jon,doe,30");
the output is:
person name: jon last name: doe age: 30
hint: use the split method to split the string to a string array where there is a "," char


 */
public class Method_splitInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        person(s);

    }

    //ex:person("jon,doe,30") ==> person name: jon last name: doe age: 30
    //            0   1   2
    public static void person(String info){
        String [] person = info.split(" ");

        String name = "person name: " + person[0];
        String lastName = "last name: " + person[1];
        String age = "age: "+person[2];

        System.out.println(person);
}

}
