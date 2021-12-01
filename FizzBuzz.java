import java.util.*;

public class FizzBuzz {
  public static void main(String[] args) {
    System.out.println(fizzbuzz(20));
  }

  public static ArrayList fizzbuzz(int n){
     ArrayList<String> list = new ArrayList<String>();
  if(n > 0){
       for(int i= 1; i <= n; i++){
      if(i%3 == 0 && i%5 == 0){
          list.add("FizzBuzz");
      } else if(i%3 == 0){
          list.add("Fizz");
      } else if(i%5 == 0) {
          list.add("Buzz");
      } else {
          list.add(String.valueOf(i));
      }
    }
  }
    return list;
  }   
}