  import java.util.Scanner;
  import java.util.*;

  public class siva {
      public static void main(String args[]) {
  /*      int x = 10;
        int y = 20;
  // ternary operator Example.
  String result = x > y ? "x is greater than y" : "x is less than or equal to y";
  System.out.println(result);*/

  /*
  //'==' and .equals() difference.
    String s1 = new String("Hello");
    String s2 = new String ("Hello");
    if(s1 == s2){ // it will check the variable memory location
      System.out.println("True");
    } else {
      System.out.println("false");
    }
    if (s1.equals(s2)){ // it will check the value of the particular memory location
      System.out.println("True");
    } else {
      System.out.println("false");
    }*/

    //prime number program
    /*Scanner input = new Scanner(System. in);
    System.out.println("Enter an integer for 'n': ");
    int n = input.nextInt();
    Scanner input1 = new Scanner(System. in);
    System.out.println("Enter an integer for 'm': ");
    int m = input1.nextInt();
    boolean flag = false;

    while(n < m){
        for (int i = 2; i <= n/2 ; i++){
          if (n% i == 0){
                flag = true;
                break;
          }

        }

        /*if(!flag){
          System.out.println(n +"is prime number");
        } else {
          System.out.println(n +"is not a prime number");
        }
      }
  if (!flag){

    System.out.println(n + " ");
                ++n;
              }*/
            /*  Scanner input = new Scanner(System. in);
              System.out.println("Enter an integer for 'n': ");
              int low = input.nextInt();
              Scanner input1 = new Scanner(System. in);
              System.out.println("Enter an integer for 'm': ");
              int high = input1.nextInt();
              int sum = 0;
              while (low < high) {
                  boolean flag = false;
                  for(int i = 2; i <= low/2; i++) {
                      // condition for nonprime number
                      if(low % i == 0) {
                          flag = true;
                          break;
                      }
                  }
                  if (!flag)
                    System.out.print(low + " ");
                    sum = sum+low;
                  }
                    low++;
              System.out.println("sum of prime numbers :" +sum);*/

              /*
        Date d1 = new Date(2010, 1, 3);
        System.out.println("Current date is " + d1);*/
        try{
          int data = 100/0;
        }catch(Exception e){
          System.out.println(e);


        }
          System.out.println("Hi Hello how are you");

    }
}
