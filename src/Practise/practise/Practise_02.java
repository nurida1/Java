package Practise.practise;

public class Practise_02 {
    public static void main(String[] args) {

        String outsideWeather;
        int Degree;
        outsideWeather = "Shinny";
        Degree = 70;
        boolean comp2 = (!(outsideWeather == "Rainy" || Degree == 70));

        System.out.println(comp2);

        System.out.println("=====================");


        System.out.println("================");

        boolean A = true,
                B = !A;
        if (A) {
            if (B){
                System.out.println("Monday");
            }else {
                System.out.println("Tuesday");
            }
    }else{
            if (A) {
                System.out.println("Thursday");
            }else {
                System.out.println("Friday");
            }
        }
}































































    }



