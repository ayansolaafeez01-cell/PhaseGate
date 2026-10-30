function PrimeNumber(number){
    if (number <= 1) 
       return false;

    for (let index = 2; index < number; index++){
        if (number % index == 0) {
            return false;
   }
  }
    return true;
}

console.log(PrimeNumber(11)); 
console.log(PrimeNumber(12));
 
