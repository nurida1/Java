package Practise.Constructors;

import com.sun.org.apache.xml.internal.security.c14n.helper.C14nHelper;

import java.util.ArrayList;

import java.util.Arrays;
/*
1. create a custom class for pizza that should contain the following:
				instance variables:
					  	size (either small, medium, large)
					  	number of cheese topping
					  	number of pepperoni toppings
			  	Add a constructor that can allow user to set the size and toppisngs of the pizza
				instance method:
						calcCost(): returns the total cost as double
						toString(): a String return method that's containing the pizza' size, quantity of each topping, and the pizza cost as calculated by calcCost()
				Pizza cost is determined by:
						Small: $10 + $1.5 per pepperoni topping + 1 per cheese topping
						Medium: $12 + $1.5 per pepperoni topping + 1 per cheese topping
						Large: $14 + $1.5 per pepperoni topping + 1 per cheese topping
	create a class called Order
			create five objects of the pizza
			create an arraylist of pizza and add those 5 objects into it
			calculate the total price of the order (use for each loop)

 */

public class Pizza {

 String size;
 int cheeseTop;
 int pepTop;

 public Pizza (String size, int cheeseTop, int pepTop) {

     this.size = size;
     this.cheeseTop = cheeseTop;
     this.pepTop = pepTop;


 }

 public double calcCost () {

     if (size.equalsIgnoreCase("small")) {
         return 10 + 1.5 * pepTop + 1 * cheeseTop;
     } else if (size.equalsIgnoreCase("medium")) {
         return 12 + 1.5 * pepTop + 1 * cheeseTop;
     } else {
         return 14 + 1.5 * pepTop + 1 * cheeseTop;
     }

 }


 public String toString () {

     return "Pizza size: " + size + ", cheese toppings: " + cheeseTop + ", pepperoni toppings: " + pepTop + "cost is: $" + calcCost();
 }


}

class Order {

    public static void main(String[] args) {

        Pizza pizza1 = new Pizza("small", 4, 3);
        Pizza pizza2 = new Pizza("small", 2, 6);
        Pizza pizza3 = new Pizza("small", 5, 4);
        Pizza pizza4 = new Pizza("large", 5, 10);
        Pizza pizza5 = new Pizza("large", 10, 5);

        ArrayList<Pizza> list = new ArrayList<>();
        list.addAll(Arrays.asList(pizza1, pizza2, pizza3, pizza4, pizza5));

        for( Pizza each : list) {
            System.out.println(each.calcCost());
        }


    }

}

