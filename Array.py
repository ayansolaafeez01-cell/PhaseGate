
def reverse_list(numbers):
    new_list = []

    for number in numbers:
        new_list.append(list(reversed(number)))

    return new_list


numbers_list = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
]

result = reverse_list(numbers_list)
print(result)
    
  
                


   


                 

                
   
