def is_prime_number(number):
    
    for index in range (2, number):
              if (number % 2 == 0):
                 return False
                 
              return True
                 
print(is_prime_number(11))
print(is_prime_number(12))

