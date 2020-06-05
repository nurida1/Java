package day44_Exceptions;

import java.util.NoSuchElementException;

public class multi_catchBlocks {

    public static void main(String[] args) {

        try {
            System.out.println( 100 / 0 ); //arithmetic

        }catch(ClassCastException e) {
            System.out.println("Class Cast");

        } catch (NoSuchElementException e) {
            System.out.println("No such element");

        }catch (ArithmeticException e) { //child can handle
            System.out.println("Arithmetic");

        }catch (RuntimeException e) { //parent , it will be executes, if u take out arithmetic exception
            System.out.println("Runtime");

        }catch (Exception e) {  //grand parent of all exceptions, if u take out arithmetic and runtime, it will handle
            System.out.println("Arithmetic ");

        }

        //parent cannot come before child



    }

}
