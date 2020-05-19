package day21_MultiDimensionalArrays;

public class ScrumTeam {
    public static void main(String[] args) {
//                             0          1        2         3
        String [] DevTeam = {"Zeynep", "Haider","Jovid", "Muhtar"};

        String [] TestersTeam = {"Rahman", "Aishan","Osman","Ali"};

        String [] PO = {"Barzy","Donald"};

        String [] TestersTeam2 = {"Nurida", "Zarina","Aizhan","Asiman"};


        String [] []  ScrumTeam = {DevTeam, TestersTeam, PO};
        //                          0           1       2
        ScrumTeam[0] [3] = "Jean";

        ScrumTeam[1] = TestersTeam2;

        System.out.println(ScrumTeam[0][3]);
        String info = ScrumTeam[1] [2];

        System.out.println("====================");

        //For each
        for (String eachEmployee : ScrumTeam[1] ) { //prints all the employees from given index
            System.out.println(eachEmployee);
        }
        System.out.println("====================");
        System.out.println(ScrumTeam[2][1]);





    }


}
