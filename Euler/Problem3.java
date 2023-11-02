package Euler;
//ѕоиск максимального простого множител€ числа.
public class Problem3 {
  static void PrimeFactor(){
      long x = 600851475143L; //
      long counter = 1;
      long maxFactor = 0L;
      for (long i = 3; i < x; i++){
          if (x % i == 0 && i / 2 != 0){
              counter = counter * i;
              if (counter == x){
                  maxFactor = i;
                  break;
              }
          }
      }
      System.out.println(maxFactor);
  }  
    public static void main(String[] args) {
        PrimeFactor();
    }
}
