#Switch Case In R

for(i in 1:4){
  print(switch(i,"A","B","C","D"))
}

num = as.integer((readline(prompt = "Enter The Number:-")))

switch(num%%2 + 1 ,"Number Is Even","Number Is Odd")

#Functions In R

#function_Name = function(Parameters){
#  Statements
#}

parameter = readline(prompt="Enter The String:-")
welcome = function(parameter){
  print(parameter)
}

welcome(parameter)

# Calculator In R


Addition = function(num1,num2){
  print("The Addition Is ")
  return(num1 + num2)
}

substraction = function(num1,num2){
  print("The Substraction Is ")
  return(num1 - num2)
}

Multiplication = function(num1,num2){
  print("The Multiplication Is ")
  print(num1 * num2)
}

Division = function(num1,num2){
  print("The Division Is ")
  return(num1 / num2)
}

Modulo = function(num1,num2){

  print("The Modulo-Operation Is ")
  return(num1 %% num2)
}
{
choice = as.integer((readline(prompt = "Enter The Your Choice 1-Addition,2-Substraction,3=Multiplication,4=Division,5=Modulo-Operation:-")))
  num1 = as.integer((readline(prompt = "Enter The First Number:-")))
  num2 = as.integer((readline(prompt = "Enter The Second Number:-")))
Answer=switch(choice,Addition(num1,num2),substraction(num1,num2),Multiplication(num1,num2),Division(num1,num2),Modulo(num1,num2))
print(Answer)
}

{
{
first_name = readline(prompt = "Enter The First Name:-")
last_name = readline(prompt = "Enter The Last Number:-")
name = Full_Name(first_name,last_name)
Answer = Hello(name)
print(Answer)
}

Full_Name = function(first_name,last_name){
  Name = paste(first_name,last_name)
  return(Name)
}
Hello = function(name){
  String = paste("Hello!",name)
  return(String)
}
}