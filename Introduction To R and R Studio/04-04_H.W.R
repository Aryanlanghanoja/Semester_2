# Question - 1
a = mtcars
b = a$cyl
e = c(4,6,8)
c = factor(b,levels = c(4,6,8))
d = table(c)
read_1 = d[["4"]]
read_2 = d[["6"]]
read_3 = d[["8"]]
sum = read_1 + read_2 + read_3
read = c(read_1,read_2,read_3)
names(read) = as.integer((read/sum)*100)
pie(read,paste(e,names(read),sep = "-"),main="Pie-Charts",radius = 1,col.main = "Green",col = c("Red","yellow","Blue"))

# Question - 2

a = mtcars
b = a$gear
e = c(3,4,5)
c = factor(b,levels = c(3,4,5))
d = table(c)
read_1 = d[["3"]]
read_2 = d[["4"]]
read_3 = d[["5"]]
sum = read_1 + read_2 + read_3
read = c(read_1,read_2,read_3)
names(read) = as.integer((read/sum)*100)
pie(read,paste(e,names(read),sep = "-"),main="Pie-Charts",radius = 1,col.main = "Green",col = c("Red","yellow","Blue"))

# Question - 3 

plot(a$cyl,a$hp)

# Question - 4 

plot(a$cyl,a$wt)

# Question - 5

plot(a$gear,a$mpg)

library(ggplot2)

# Example data
student_data <- data.frame(
  student_name = c("Alice", "Bob", "Charlie", "David", "Eve"),
  marks = c(80, 75, 90, 65, 85)
)

# Create box plot
ggplot(student_data, aes(x = "", y = marks)) +
  geom_boxplot() +
  labs(title = "Student Marks Box Plot")
