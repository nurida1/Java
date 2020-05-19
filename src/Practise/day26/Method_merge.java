package Practise.day26;

public class Method_merge {
        public static String mergeStrings(String one, String two) {

            String result="";
            for(int i=0; i < one.length() || i < two.length(); i++){

                if( i < one.length()){
                    result += ""+ one.charAt(i);
                }if(i < two.length()){
                    result+=""+two.charAt(i);
                }
            }
            return result;
        }
        public static void main(String[]args){
            System.out.println(mergeStrings("12345","abcde"));
        }
    }

