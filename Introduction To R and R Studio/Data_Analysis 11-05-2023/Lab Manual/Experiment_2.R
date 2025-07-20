print("R Programming")
print("Aryan Langhanoja")
print("9 - Shivdhara Duplex Row-House nr.Dharmanandan Society Opp. Poonam Bakery, 
      Nikol-Naroda Road,Nikol Ahmedabad- 382350")

# Sample vector with blank strings
my_vector <- c("apple", "", "banana", "", "Grapes", "")

# Remove blank strings
my_vector <- my_vector[nzchar(my_vector)]

# Display the modified vector
print(my_vector)



x = 10
y = 5

#Arithmetic Operators

print("Arithmetic Operators :-")
print("x + y = ")
print(x+y)
print("x - y = ")
print(x-y)
print("x * y = ")
print(x*y)
print("x / y = ")
print(x/y)
print("x ^ y = ")
print(x^y)
print("x %% y = ")
print(x%%y)


# Relational Operators

print("Relational Operators :- ")
print("x > y")
print(x>y)
print("x < y")
print(x<y)
print("x >= y")
print(x>=y)
print("x <= y")
print(x>=y)
print("x == y")
print(x==y)
print("x != y")
print(x!=y)


# Assigment Operators

print("Assigment Operators :- ")

a <- 5
print(a)

6 -> a
print(a)

a = 7
print(a)




num_1 = as.integer((readline(prompt = "Enter The First Number:- ")))
num_2 = as.integer((readline(prompt = "Enter The Second Number:- ")))

temp = num_2 
num_2 = num_1
num_1 = temp

print(paste("The First Number Is" , num_1))
print(paste("The Second Number Is " , num_2))


input_char <- readline(prompt = "Enter a Character:- ")
uppercase_char <- toupper(input_char)
cat("Uppercase:", uppercase_char)


char <- readline(prompt = "Enter a Character:- ")

if(char == 'A' || char == 'E' || char == 'I' || char == 'O' || char == 'U' || 
   char == 'a'  || char == 'e' || char == 'i' || char == 'o' || char == 'u'){
    print("It Is A Vovel.")
} else{
  print("It Is A Constant")
}


v = c(1,2,3,4,5,4,5,3,4,2,1,4,3,5,5,5)
s = summary(factor(v))
f = c(1,4,5,3,2)
names(f) = c("One" , "Four" , "Five" , "Three" , "Two")

marks = c()

for(i in 1:5){
  temp = 0
  temp = as.integer((readline(prompt = paste("Enter The Marks - ",i," :-"))))
  marks = append(marks,temp)
}

percentage = ((marks[1] + marks[2] + marks[3] + marks[4] + marks[5])/ 500) * 100

if (percentage >= 70){
  print("DISTINCTION")
} else if (percentage >= 60 & percentage <= 69) {
  print("FIRST CLASS")
} else if (percentage >= 50 & percentage <= 59) {
  print("SECOND CLASS")
} else if (percentage >= 40 & percentage <= 49) {
  print("PASS CLASS")
} else {
  print("FAIL")
}

marks_1 = c()

for(i in 1:5){
  temp = 0
  temp = as.integer((readline(prompt = paste("Enter The Marks - ",i," :-"))))
  marks_1 = append(marks_1,temp)
}

fail = marks_1[marks_1<40]

if(length(fail) >= 2){
  print("FAIL")
}else if(length(fail) == 1){
  print("ATKT")
}else if (length(fail) == 0){
  print("PASS")
}

calculateCircleArea <- function(radius) {
  return(pi * radius^2)
}

calculateSquareArea <- function(side) {
  return(side^2)
}

calculateRectangleArea <- function(length, width) {
  return(length * width)
}

calculateTriangleArea <- function(base, height) {
  return(0.5 * base * height)
}


print(paste("Select a shape:\n"))
print(paste("1. Circle\n"))
print(paste("2. Square\n"))
print(paste("3. Rectangle\n"))
print(paste("4. Triangle\n"))
shape <- as.integer(readline())

switch(shape,
       "1" = {
         print("Enter the radius of the circle: ")
         radius <- as.numeric(readline())
         area <- calculateCircleArea(radius)
         print(paste("The area of the circle is:", area))
       },
       "2" = {
         print("Enter the side length of the square: ")
         side <- as.numeric(readline())
         area <- calculateSquareArea(side)
         print(paste("The area of the square is:", area))
       },
       "3" = {
         print("Enter the length of the rectangle: ")
         length <- as.numeric(readline())
         print("Enter the width of the rectangle: ")
         width <- as.numeric(readline())
         area <- calculateRectangleArea(length, width)
         print(paste("The area of the rectangle is:", area))
       },
       "4" = {
         print("Enter the base of the triangle: ")
         base <- as.numeric(readline())
         print("Enter the height of the triangle: ")
         height <- as.numeric(readline())
         area <- calculateTriangleArea(base, height)
         print(paste("The area of the triangle is:", area))
       },
       {
         print("Invalid shape selection!")
       }
)


year <- as.integer(readline("Enter a year-: "))

if (year %% 4 == 0 && (year %% 100 != 0 || year %% 400 == 0)) {
  print(paste(year, "is a leap year."))
} else {
  print(paste(year, "is not a leap year."))
}



hardness <- as.numeric(readline("Enter the hardness of steel: "))
carbon <- as.numeric(readline("Enter the carbon content of steel: "))
tensile <- as.numeric(readline("Enter the tensile strength of steel: "))

if (hardness > 50 && carbon < 0.7 && tensile > 5500) {
  grade <- "Grade A"
} else if (hardness > 50 && carbon < 0.7) {
  grade <- "Grade B"
} else if (carbon < 0.7 && tensile > 5500) {
  grade <- "Grade C"
} else if (hardness > 50 && tensile > 5500) {
  grade <- "Grade D"
} else if (hardness > 50 || carbon < 0.7 || tensile > 5500) {
  grade <- "Grade E"
} else {
  grade <- "Grade F"
}

print(paste("The grade of steel is:", grade))


total <- 0
count <- 0
number <- 2


while (count < 100) {
  total <- total + number
  number <- number + 2
  count <- count + 1
}


print(paste("The total of the first 100 even numbers is:", total))

limit <- as.integer(readline("Enter the limit for the Fibonacci series: "))

if (!is.na(limit) && limit > 0 && round(limit) == limit){

  num1 <- 0
  num2 <- 1
  
  print(paste(num1," " , num2))
  
  for (i in 3:limit) {
    num3 <- num1 + num2
    print(paste(num3," "))
    
  
    num1 <- num2
    num2 <- num3
  }
} else {
  print("Invalid input. Please enter a positive integer as the limit.")
}


n <- as.integer(readline("Enter a number to calculate its factorial: "))

if (!is.na(n) && n >= 0 && round(n) == n) {
  factorial <- 1
  
  if (n == 0 || n == 1) {
    print(paste("The factorial of", n, "is", factorial))
  } else {
    for (i in 2:n) {
      factorial <- factorial * i
    }
    print(paste("The factorial of", n, "is", factorial))
  }
} else {
  print(paste("Invalid input. Please enter a non-negative integer."))
}

num <- as.integer(readline("Enter a number: "))

if (!is.na(num) && num >= 0 && round(num) == num) {
  temp <- num
  digits <- nchar(temp)
  sum <- 0
  
  while (temp > 0) {
    digit <- temp %% 10
    sum <- sum + digit^digits
    temp <- temp %/% 10
  }
  
  if (num == sum) {
    print(paste(num, "is an Armstrong number."))
  } else {
    print(paste(num, "is not an Armstrong number."))
  }
} else {
  print(paste("Invalid input. Please enter a non-negative integer."))
}

num <- as.integer(readline("Enter a number: "))

if (!is.na(num)) {
  reverse <- 0
  temp <- num
  
  while (temp > 0) {
    digit <- temp %% 10
    reverse <- reverse * 10 + digit
    temp <- temp %/% 10
  }
  
  print(paste("The reverse of", num, "is", reverse))
} else {
  print(paste("Invalid input. Please enter a valid number."))
}

num <- as.integer(readline("Enter a number: "))

if (!is.na(num) && num > 0) {
  sum <- 0
  temp <- num
  
  while (temp > 0) {
    digit <- temp %% 10
    sum <- sum + digit
    temp <- temp %/% 10
  }
  
  print(paste("The sum of digits of", num, "is", sum))
} else {
  print(paste("Invalid input. Please enter a positive integer."))
}


rows <- 5
cols <- 5

for (i in 1:rows) {
  for (j in 1:cols) {
    cat(j)
  }
  cat("\n")
}


rows <- 5

for (i in 1:rows) {
  for (j in 1:rows) {
    letter <- LETTERS[i]
    cat(letter, " ")
  }
  cat("\n")
}

sum <- function(a, b) {
  return(a + b)
}


num1 <- as.integer(readline("Enter the first number:- "))
num2 <- as.integer(readline("Enter the second number:- "))

result <- sum(num1, num2)

print(paste("The sum of", num1, "and", num2, "is", result))


avg <- function(arr) {
  if (length(arr) == 0) {
    print("Array is empty.")
    return()
  }
  
  for(i in 1:length(arr)){
    temp = arr[i]
    total <- total + temp
    average <- total / length(arr)
  }
  
  return(average)
}

numbers <- c(5, 10, 15, 20, 25)

result <- avg(numbers)
if (!is.null(result)) {
  print(paste("Average:", result))
}




numbers <- c(5, 10, 15, 20, 25)
print(numbers)

first_element <- numbers[1]
print(first_element)

third_element <- numbers[3]
print(third_element)

numbers[2] <- 12
print(numbers)

addition_result <- numbers + 5
print(addition_result)

multiplication_result <- numbers * 2
print(multiplication_result)

vector_mean <- mean(numbers)
print(vector_mean)

vector_length <- length(numbers)
print(vector_length)

more_numbers <- c(30, 35, 40)
combined_vector <- c(numbers, more_numbers)
print(combined_vector)


my_list <- list(name = "Rohit", age = 18, city = "Ahmedabad")


print(my_list$name) 
print(my_list$age)   
print(my_list$city)  


my_list$name <- "Rohan"
print(my_list$name)  

my_list$occupation <- "Engineer"
print(my_list$occupation)  

my_list$city <- NULL
print(my_list)  


print(length(my_list))  



df <- data.frame(
  Name = c("Rahul", "Roshni", "Jenny", "Ajay"),
  Age = c(25, 32, 28, 35),
  Gender = c("Male", "Female", "Female", "Male"),
  stringsAsFactors = FALSE
)


print(df)


print(df$Name)    
print(df$Age)     
print(df[2, ])    


print(df[2, "Age"])     

# Adding a new column
df$Salary <- c(50000, 60000, 55000, 70000)
print(df)


matrix1 <- matrix(1:9, nrow = 3, ncol = 3)
print("Matrix 1:")
print(matrix1)


element <- matrix1[2, 3]
print("Element at position (2, 3):")
print(element)


matrix1[2, 3] <- 99
print("Modified Matrix 1:")
print(matrix1)


categories <- c("A", "B", "C", "A", "B", "C", "A", "B", "C")
factor_data <- factor(categories)
print(levels(factor_data))
print(factor_data)


categories <- c("Category 1", "Category 2", "Category 3" , "Category 4")
values <- c(25, 30, 20 , 40)


barplot(values, names.arg = categories, xlab = "Categories", ylab = "Values", 
        main = "Bar Chart")

data <- rnorm(500, mean = 0, sd = 1)

hist(data, breaks = 30, col = "yellow", xlab = "Values", ylab = "Frequency", 
     main = "Histogram")


categories <- c("Category A", "Category B", "Category C", "Category D")
values <- c(30, 20, 15, 35)

pie(values, labels = categories, main = "Pie Chart")


x <- c(1, 2, 3, 4, 5)     
y <- c(2, 4, 6, 8, 10)    

plot(x, y, main = "Scatter Plot", xlab = "X", ylab = "Y", col = "blue")


data_1 <- data.frame(category = c("A", "B", "C", "D"),
                     value = c(10, 15, 7, 12))

ggplot(data_1, aes(x = category, y = value)) +
  geom_bar(stat = "identity",fill  = "cyan") +
  labs(x = "Category", y = "Value", title = "Bar Graph")


library(ggplot2)          
data_3 <- data.frame(values = c(10, 20, 15, 30, 25, 18, 12, 28, 22))

ggplot(data_3, aes(x = values)) +
  geom_histogram(binwidth = 5, fill = "grey", color = "black") +
  labs(x = "Values", y = "Frequency", title = "Histogram")


data_2 <- data.frame(category = c("A", "B", "C", "D","E"),
                     value = c(30, 20, 15, 35,100))



ggplot(data_2, aes(x = "", y = value, fill = category)) +
  geom_bar(stat = "identity", width = 1) +
  coord_polar(theta = "y") +
  labs(fill = "Category", title = "Pie-like Chart") +
  theme_void()


data <- data.frame(x = c(1, 2, 3, 4, 5),
                   y = c(3, 5, 4, 6, 8))


library(ggplot2)
ggplot(data, aes(x = x, y = y)) +
  geom_point(col = "red") +
  labs(x = "X-axis", y = "Y-axis", title = "Scatter Plot")

A = read.csv("D:/Aryan/Semester - 2/Introduction To R and R Studio/salary_regression.csv")

Linear_Reg = lm(formula = Salary ~ A$Years.experienced,data=A)

intercept = coef(Linear_Reg)[1]
weights = coef(Linear_Reg)[2]

year = 3
y = weights*year + intercept

ggplot() + geom_point(aes(x = A$Years.experienced , y = A$Salary)) + 
  geom_line(aes(x = A$Years.experienced, y = predict(Linear_Reg,newdata = A)),color = "red")

poly_model = lm(formula =  Salary~poly(A$Years.experienced,5,raw = TRUE),data = A)

ggplot(data = A,aes(A$Years.experienced,A$Salary)) + geom_point() + 
  stat_smooth(method = lm,formula = y~poly(x,5,raw=TRUE)) + 
  geom_point(aes(x = A$Years.experienced , y = A$Salary)) +
  geom_line(aes(x = A$Years.experienced, y = predict(Linear_Reg,newdata = A)),color = "red")


data("Sonar")

data  = Sonar[base::sample(nrow(Sonar)),]
train = data[1:150,]
test = data[151:nrow(data),]

X_train = subset(train,select =-Class)
Y_train = train$Class

X_test = subset(test,select =-Class)
Y_test = test$Class

model_knn = knn(X_train,X_test,Y_train,k=3) 

conf_matrix = base :: table(Y_test,model_knn)

Accuracy = ((conf_matrix[1] + conf_matrix[4]) / 
              (conf_matrix[1] + conf_matrix[2] + conf_matrix[3] + conf_matrix[4])) * 100


library(cluster)
data <- matrix(rnorm(100), ncol = 2)
k <- 3
kmeans_result <- kmeans(data, centers = k)
cluster_assignments <- kmeans_result$cluster
cluster_centers <- kmeans_result$centers

cat("Cluster Assignments:\n")
cat(cluster_assignments, "\n")
cat("\nCluster Centers:\n")
print(cluster_centers)
plot(data, col = cluster_assignments, pch = 19, main = "K-Means Clustering")
points(cluster_centers, col = 1:k, pch = 8, cex = 2)



library(rpart)
library(rpart.plot)
data(iris)
set.seed(123)
train_indices <- sample(1:nrow(iris), 0.7 * nrow(iris))
train_data <- iris[train_indices, ]
test_data <- iris[-train_indices, ]
model <- rpart(Species ~ ., data = train_data, method = "class")
rpart.plot(model)

predictions <- predict(model, newdata = test_data, type = "class")
accuracy <- sum(predictions == test_data$Species) / nrow(test_data)
cat("Accuracy:", accuracy, "\n")


evenodd <- function(num) { 
  if (num %% 2 == 0) { 
    return("Even")
} else { 
  return("Odd")
}
}

result <- evenodd(25) 
print(result)

fact <- function(num) {
  if (num == 0 || num == 1) { return(1)
  } else {
    return(num * fact(num - 1))
  }
}
result <- fact(6) 
print(result)

prime <- function(num) { 
  is_prime <- TRUE

if (num <= 1) { 
  is_prime <- FALSE
} else {
  for (i in 2:sqrt(num)) { 
    if (num %% i == 0) { 
      is_prime <- FALSE 
      break
  }
  }
}

if (is_prime) {
  print(paste(num, "is a prime number."))
} else {
  print(paste(num, "is not a prime number."))
}
}
prime(25)

power <- function(base, expon) {
  result <- base ^ expon
  print(paste(base, "^", expon, "=", result))
}
power(5, 3)

simple_interest <- function(principal, rate, time) { 
  interest <- (principal * rate * time) / 100 
  return(interest)
}
interest <- simple_interest(5000, 5, 3) 
print(interest)

square <- function(num) { 
  result <- num^2 
  return(result)
}
result <- square(5) print(result)


power <- function(base, expon) { 
  result <- base ** expon 
  return(result)
}
result <- power(2, 3) 
print(result)

absolute <- function(num) { 
  result <- abs(num) 
  return(result)
}

result <- absolute(-25) print(result)

countDigits <- function() {
  number <- as.integer(readline("Enter a number: ")) 
  digitCount <- nchar(as.character(number)) 
  print(paste("Number of digits:", digitCount))
}

countDigits()

isPrime <- function(num) { 
  if (num <= 1) { return(FALSE)
}
  
  for (i in 2:sqrt(num)) { 
    if (num %% i == 0) { 
      return(FALSE)
  }
  }
  
  return(TRUE)
}

printPrimeNumbers <- function() {
  lower <- as.integer(readline("Enter the lower bound of the range: ")) 
  upper <- as.integer(readline("Enter the upper bound of the range: "))
  
  if (lower >= upper) {
    print("Invalid range. Please enter a valid range.") return()
  }
  
  print("Prime numbers in the given range:") for (num in lower:upper) {
    if (isPrime(num)) { print(num)
    }
  }
}

printPrimeNumbers()


add <- function(a, b) { 
  return(a + b)
}

subtract <- function(a, b) { 
  return(a - b)
}

multiply <- function(a, b) { 
  return(a * b)
  } 

divide <- function(a, b) { if (b != 0) {
  return(a / b)
} else {
  print("Error: Division by zero!") return(NA)
}
}

getChoice <- function() { 
  print("Calculator Menu:") 
  print("1. Addition")
  print("2. Subtraction") 
  print("3. Multiplication") 
  print("4. Division") 
  print("5. Exit")
  
  choice <- as.integer(readline("Enter your choice: "))
  
  return(choice)
}

calculator <- function() { 
  while (TRUE) {
  choice <- getChoice()
  
  if (choice == 5) { 
    break
  }
  
  num1 <- as.numeric(readline("Enter the first number: ")) 
  num2 <- as.numeric(readline("Enter the second number: "))
  
  result <- switch(choice,
                   add(num1, num2), 
                   subtract(num1, num2), 
                   multiply(num1, num2), 
                   divide(num1, num2))
  
  if (!is.na(result)) { 
    print(paste("Result:", result))
    
    
    cat("\n")
  }
  
  print("Calculator exited.")
}}
  
  calculator()
  


