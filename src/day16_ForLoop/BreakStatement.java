package day16_ForLoop;

public class BreakStatement {

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {  //i: 1-false-print, 2-false-print, 3 and then Break and St-t will not executed

            if (i == 3) {
                break;
            }
            System.out.println("Hello World");
        }

        for (char i = 'a'; i <= 'z'; i++) {


            if (i == 'e') {
                break;  // when it reaches 'e' do not print and exit
            }
            System.out.println(i);
        }
    }
}