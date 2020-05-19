package day38_Constructors;

import jdk.management.resource.internal.inst.FileOutputStreamRMHooks;

import java.util.ArrayList;
import java.util.Arrays;

/*
Task04:
	create a class called Item
			instance variables:
				name, unitPrice, quantity
			add a constructor that can initialize the fields
			instance methods:
				calcCost(): returns the total cost as double
							hint: quantity * unitPrice
				toString(): returns the name, unit price, quantity and total cost info as calculated by calcCost()
	create a class called ShoppingList
			create 5 objects of Item and store them into List of Items
			calculate the total cost of all Items in the list
 */
public class Item { //u shouldn't use this class for printing out
    String name;
    double unitPrice;
    int quantity;

    //Constructor: to initialize instance variables
    // since we have 3 instance variables ==> we will pass 3 variables in the parameter

    public Item (String name, double unitPrice, int quantity) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    // instance method: to calculate cost
    // We can not make this method static because we need to use our instance variables here
    // we use Instance method to use Instance variables like this:
    public double calcCost() {
        return quantity * unitPrice;
    }
//instance means every single object has its own copy
// each object will return different value from this method (it will return its own copy depending on its price and quantity)

    // instance method : toString() to specify how we want to print our item information
    public String toString () {
        return "Item: " + name + ", Unit price: $" + unitPrice + ", Quantity: " + quantity +
        "\nTotal Cost of Item: $" + calcCost();

    }
}

class ShoppingList {
/*
create a class called ShoppingList
			create 5 objects of Item and store them into List of Items
			calculate the total cost of all Items in the list
 */
    public static void main(String[] args) {

        // when creating objects we must pass our argument in the parameter because that's how we created our constructor
        //Item item1 = new Item (); -doesn't exist
        Item item1 = new Item("Tomato", 2, 6);
        Item item2 = new Item("Potato", 4, 10);
        Item item3 = new Item("Apples", 3, 8);
        Item item4 = new Item("Peach", 4, 3);
        Item item5 = new Item("Avocado", 2, 2);

        //System.out.println(item1.calcCost());
        //System.out.println(item1);

        //To calculate the total cost of all items purchased I will add items into a list then use for each loop
        ArrayList<Item> list = new ArrayList<>();
        list.addAll(Arrays.asList( item1, item2, item3, item4, item5 ));

        // using the for each loop I will calculate the total like this:
        double totalCost = 0;

        /*
        //solution1:
        for ( Item each : list  ) { //each: item1, item2, item3, item4, item5
            totalCost += each.calcCost();
        }
       */

        for (int i =0; i < list.size(); i ++) {
            totalCost += list.get(i).calcCost();
        }

        System.out.println("Total: " + totalCost);





    }

}
