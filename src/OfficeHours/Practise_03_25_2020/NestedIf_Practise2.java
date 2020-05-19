package OfficeHours.Practise_03_25_2020;
  /*
    for the loan:
        if he/she has a job that pays > 50000$ ==> might be eligible
           if he/she has a good credit
             if job history is more than or equal to 2 ==> then eligible
     */
public class NestedIf_Practise2 {
      public static void main(String[] args) {

          int salary = 50000;
          int creditscore = 750;  //or short
          byte jobHistory = 1;


          if (salary > 50000) { //might be eligible
              if (creditscore > 650) { // might be eligible

                  if (jobHistory >= 2) { //eligible for loan
                      System.out.println("You are qualified");
                  }else {
                      System.out.println("You do not have enough job history, come back later");
                  }

              } else { //not eligible due to credit score
                  System.out.println("You are do not have good credit score");
                  }
          }   else {
              System.out.println("You need to have a job that pays $50000");


          }
      }
  }