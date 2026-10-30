public class PrimeNumber{
 public static boolean isPrimeNumber(int number){
   if (number <= 1)
       return false;
    for (int index = 2; index < number; index++){
      if (number % index == 0){
                return false;
        }
      }
        return true;
  }
    public static void main(String[] args) {
        System.out.println(isPrimeNumber(11)); 
        System.out.println(isPrimeNumber(12)); 
 }
}

  
  


