package day54_Maps;

public class String_VS_Buffer_VS_Builder {

    public static void main(String[] args) {

        String str1 = "Cybertek";
                str1.concat(" School");
        System.out.println(str1); //cybertek

        System.out.println("===================================================");
        //String buffer:
        StringBuilder builder = new StringBuilder("Cybertek");
            builder.append(" School");

        System.out.println(builder);

        System.out.println("======================================================");
        //String Buffer= synchronized, slower
        StringBuffer buffer = new StringBuffer("Cybertek");
            buffer.append(" School");

        System.out.println(buffer);

        String word = "ABCD";
        StringBuilder sb = new StringBuilder(word);
            sb.reverse();

        System.out.println(sb);

        //conver String builder to String:
        word = sb.toString();
        System.out.println(word);

    }



}
