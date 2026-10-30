public class Array{
  public static int [][] reverseArray(int [][] array){
for(int index = 0; index < array.length; index++){
for(int row = 0; row < array[index].length; row++){
for(int colum = row+1; colum < array[index].length; colum++){

int temp = array[index][row];
array[index][row] = array[index][colum];
array[index][colum] = temp;
 
   }
  }
}

  return array;
   }
   
public static void main (String...args){
int [][] array = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
int [][] result = reverseArray(array);
for(int row = 0; row < result.length; row++){
for(int colum = 0; colum < result.length; colum++){
 System.out.print(result[row][colum] + " ");
 
    }
   System.out.println();
   }
  }
}

  


                 

                
   
