# 1. Create a user define function named sum which accept 2 
# arguments (of integer type) and return the sum of them.
{
sum = function(a,b){
  return(a+b)
}

num_1 = as.integer((readline(prompt = "Enter The First Number:- ")))
num_2 = as.integer((readline(prompt = "Enter The Second Number:- ")))
num_3 = sum(num_1,num_2)
print("Addition Is ")
print(num_3)
}

# Design a function named R

{
  Area = function(L,B){
    return(L*B)
  }
  
  L = as.integer((readline(prompt = "Enter The Length Of A Rectangle:- ")))
  B = as.integer((readline(prompt = "Enter The Breadth Of A Rectangle:- ")))
  Area = Area(L,B)
  print("Area Of Rectangle Is ")
  print(Area)
}

# Data Visualization

x=c(1,2,3,4)
y=c(1,2,3,4)
plot(x,y,xlab="X-axis",ylab="Y-axis",main="Scatterplot",col="blue")

z=c(2,3,4,5)
points(x,z,col="green")

#Bar Charts

 a <- c(23,34,32,50,18)
 months <- c("January","February","March","April","May")
 barplot(a,names.arg = months,xlab="X-Axis",ylab="Y-Axis",border="Red",main = "Bar-Graphs",col = "green")

b <- c(1,2,3,4,5,6,7,8,9,10)
credits <- c(1,2,3,4,5,6,7,8,9,10)
barplot(b,names.arg = credits,xlab="Semester",ylab="Credits",border="Red",main = "Bar-Graphs",col = "yellow")

#  Create a user define function named avg which pass array as argument (of integer type) and return its average value.

a= mtcars
























