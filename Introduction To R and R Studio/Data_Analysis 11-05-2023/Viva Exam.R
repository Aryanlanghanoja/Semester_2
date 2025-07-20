# 1. Write a R program that accepts a number from the user and determine whether it is prime number or not
num = as.integer(readline(prompt = "Enter The Number:-"))
new_Num = num
 
prime = 0
 for(i in 1:num){
   if(new_Num %% i == 0){
     prime = prime + 1
     break
   }
 }
 
 if(prime > 2){
   print(paste(num , " Is Not Prime Number"))
 } else{
   print(paste(num , " Is  A Prime Number"))
 }

# 2. Write a R program to check whether the user entered the number is Armstrong

num_1 = as.integer(readline(prompt = "Enter The Number:-"))
num_2 = num_1

for(i in 1:3){
  sum = 0
  temp = num_1 %% 10 
  sum = sum  + (temp^3)
  num_1 = num_1 /10
}

if(num_2 == sum){
  print(paste(num_2 , " Is A Armstrong Number"))
}else {
  print(paste(num_2 , " Is A Armstrong Number"))
}

# 3.  Write a R program that finds modulo-7 of a given number without using modulo operator.

num_3 = as.integer(readline(prompt = "Enter The Number:-"))

div = as.integer(num_3 / 7)

mod = num_3 - (7 * div)

print(paste(num_3,"modulo-7 Is " , mod))

# 4. Write a function that calculates the value of f(n) for n is user defined (and it is non-negative) where
#f(x)= 3x2+f(x-1), for x>=1
#2, for x=0

cal = function(num){
  
  if(num == 0){
    return(0)
  }else{
  ans = 3*(num^2)
  return(ans)
  }
}

num_4 = as.integer(readline(prompt = "Enter The Number:-"))

sum = 0
for(i in num_4:1){
  ans = cal(i)
  sum = sum + ans
}

print(paste("Answer Is ",sum))



# 5. Write a nested loop to create a multiplication table from 1 to 10. 
#The extend of multiplication table to be decided by the user.

num_5 = as.integer(readline(prompt = "Enter The Number:-"))

for(i in 1:10){
  for(j in 1:num_5){
    print(paste(i," x ", j, " = ",i*j))
  }
}
 # 6. Continue accepting the numbers until the user enters negative number, skip all the numbers that are greater than 100. Once the numbers are accepted, find out         
# the min, max, mean and median among all the numbers entered by the user.

number = c()
for(i in 1:100){
  temp = 0
  
  temp = as.integer(readline(prompt = "Enter The Number:-"))
  if(!is.na(temp))
  if(temp< 0){
    break
  }else{
    number = append(number,temp)
  }
}

new_vec = number[number<100]

mini = min(new_vec)
maxi = max(new_vec)
mean_vec = mean(new_vec)
median_vec= median(new_vec)

print(paste("Min = ",mini))
print(paste("Max = ",maxi))
print(paste("Mean = ",mean_vec))
print(paste("Median = ",median_vec))



# 7 Write a program that converts your name and surname into equivalent dictionary numbers. For eg.: A-1, B-2, C-3, etc.

name = readline(prompt = "Enter Your Name:-")
s_name= readline(prompt = "Enter Your Surname:-")

