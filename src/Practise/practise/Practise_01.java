package Practise.practise;

public class Practise_01 {

    public static void main(String[] args) {

        int inputSeconds = 20394;

        int hours = inputSeconds / 3600;
        int minutes = (inputSeconds % 3600)-hours/60;
        int seconds = inputSeconds - (hours * 3600) - (minutes * 60);

        System.out.println(hours);
        System.out.println(minutes);
        System.out.println(seconds);
    }

}
