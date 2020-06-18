package day50_polymorphism;
/*
3. create subclass of Animal named Dog
            variable: dogName
            methods: bark
 */
public final class _3Dog extends _1Animal{ //3 var, 3 methods

   public String dogName;

   public _3Dog ( String dogName, int age, String gender ) {
       this.dogName = dogName;
       this.age = age;
       this.gender = gender;
   }

   @Override
   public void eat () {
       System.out.println("Dog " + dogName + " is eating");
   }

   @Override
   public void sleep() {
       System.out.println("Dog " + dogName + " is sleeping");
   }

   public void bark () {
       System.out.println("Dog " + dogName + " is barking");
   }

   public static void MethodA(int a) {
       System.out.println("Dog Class A");
   }
}
