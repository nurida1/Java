package day35_Static;

import java.util.ArrayList;
import java.util.Arrays;

public class OfferObjects {

    public static void main(String[] args) {

        Offer offer1 = new Offer();
        offer1.setInfo("VA", "BOA", 100000, true);
        System.out.println(offer1);  //

        Offer offer2 = new Offer();
        offer2.setInfo("KY", "CapitalOne", 120000, false);
        System.out.println(offer2);  //

        Offer offer3 = new Offer();
        offer3.setInfo( "MD", "Chase", 95000, true );
        System.out.println(offer3);

        Offer offer4 = new Offer();
        offer4.setInfo("BayArea", "Google", 115000, false);

        Offer [] offers = { offer1, offer2, offer3, offer4 };

        String myLocation = "VA";

        ArrayList<Offer> Accept = new ArrayList<>(Arrays.asList(offers));
//        Accept.removeIf( each -> each.salary < 100_000 || !each.isFullTime || !each.location.equals(myLocation));  //each.isFullTime == false // we remove the offer if it's less than 100k and not FullTime
        Accept.removeIf(p -> p.salary < 100_000);
        Accept.removeIf( p -> p.isFullTime == false );
        Accept.removeIf( p -> p.location.equals(myLocation) );

        for ( Offer each : Accept ) {
            System.out.println(each);
        }






    }


}
