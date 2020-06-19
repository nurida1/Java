package day51_Recap;
/*
warmup tasks:
    1. create an abstract class named Shape
            variables: name(static)
            abstract methods: calculateArea(), calculatePerimeter();
                    both methods return double

    2. create an interface named Volume
            variable: boolean hasVolume
            abstract method: calculateVolume() ==> returns double
    3. create an interface named PI
            variable: PI
            (created Volume & PI within same Java file)



 */
public abstract class _1Shape { //2 ways to achieve abstruction: by abstract class or interface class

    public static String name;

    public abstract double calculateArea(); //abstract doesn't have body
                                            //benefit: ignore implementation details
                                            //IF U GIVE IMPLEMENTATION: u cannot calculate Area for all shapes, because they are different
    public abstract double calculatePerimeter(); //return type everything except void

    interface Volume {
        boolean hasVolume = true;
        double calculateVolume(); //public by default
    }

    interface PI { //by default any variable public static final, u cannot reinitialize later
        double PI = 3.14;
    }











}
