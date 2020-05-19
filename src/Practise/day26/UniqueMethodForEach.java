package Practise.day26;

public class UniqueMethodForEach {
    public static void main(String[] args) {

        System.out.println(uniqueChars("BugBusters"));
    }


    public static String uniqueChars (String str) {

        String unique = "";

        for (int i = 0; i < str.length(); i++) {

            if (!unique.contains(str.charAt(i) + "")) {
                unique += str.charAt(i);
            }
        }

        return unique;
    }

}
