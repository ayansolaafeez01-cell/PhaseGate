function reverseArray(number){
for(let index = 0; index < array.length; index++){
for(let row = 0; row < array[index].length; row++){
for(let colum = row+1; colum < array[index].length; colum++){

let temp = array[index][row];
array[index][row] = array[index][colum];
array[index][colum] = temp;
 
   }
  }
}

  return array;
   }
   
let  array = [[1, 2, 3],[4, 5, 6],[7, 8, 9]];
let  result = reverseArray(array);
 console.log(result);
