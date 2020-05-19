package Practise.practise;

import javax.net.ssl.SNIServerName;

public class get_setObjects {

    public static void main(String[] args) {

        get_set Nurida = new get_set("Nurida") ;
        System.out.println(Nurida.name);

        get_set NuridaGender = new get_set('F');
        System.out.println(NuridaGender.gender);

        get_set NuridaChildren = new get_set(5);
        System.out.println(NuridaChildren.numChildren);

        get_set NuriWeigth = new get_set(54.2);
        System.out.println(NuriWeigth.weight);

        Nurida.setID(11751517);
        System.out.println("Nurida's ID: " + Nurida.getID() );

        Nurida.setHusbandName("Nadyr");
        System.out.println("Nurida's Husband name: " + Nurida.getHusbandName());

        Nurida.setAccountNumber(11111);
        System.out.println("Account number: " + Nurida.getAccountNumber());

        Nurida.setSSN(111555);
        System.out.println("Nurida's SSN: " + Nurida.getSSN());

        Nurida.setAvailableAmount(999_999);
        System.out.println("Amount: " + Nurida.getAvailableAmount() );


    }








    }

