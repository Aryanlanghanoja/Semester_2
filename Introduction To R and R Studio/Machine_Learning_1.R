# Single Variable Linear Regression.

A = read.csv("D:/Aryan/Semester - 2/Introduction To R and R Studio/salary_regression.csv")

# Install Library

install.packages("caTools")
install.packages("base")
install.packages("class")
install.packages("mlbench")
install.packages("caret")
install.packages("e1071")
library(caTools)
library(ggplot2)
library(base)
library(class)
library(mlbench)
library(caret)
library(e1071)

# Develop A Linear Regression Model

Linear_Reg = lm(formula = Salary ~ A$Years.experienced,data=A)

intercept = coef(Linear_Reg)[1]
weights = coef(Linear_Reg)[2]

year = 3
y = weights*year + intercept

# Visulization

ggplot() + geom_point(aes(x = A$Years.experienced , y = A$Salary)) + geom_line(aes(x = A$Years.experienced, y = predict(Linear_Reg,newdata = A)),color = "red")

# Develop A polynomial  model
poly_model = lm(formula =  Salary~poly(A$Years.experienced,5,raw = TRUE),data = A)

ggplot(data = A,aes(A$Years.experienced,A$Salary)) + geom_point() + stat_smooth(method = lm,formula = y~poly(x,5,raw=TRUE)) + geom_point(aes(x = A$Years.experienced , y = A$Salary)) + geom_line(aes(x = A$Years.experienced, y = predict(Linear_Reg,newdata = A)),color = "red")


poly_model = lm(formula =  Salary~poly(A$Years.experienced,8,raw = TRUE),data = A)

ggplot(data = A,aes(A$Years.experienced,A$Salary)) + geom_point() + stat_smooth(method = lm,formula = y~poly(x,8,raw=TRUE)) 

# KNN

data("Sonar")

# Randomizing The Data

data  = Sonar[base::sample(nrow(Sonar)),]
train = data[1:150,]
test = data[151:nrow(data),]

# Developing Our Model

X_train = subset(train,select =-Class)
Y_train = train$Class

X_test = subset(test,select =-Class)
Y_test = test$Class

model_knn = knn(X_train,X_test,Y_train,k=3) 

# Ploting The Confusion Matrix

conf_matrix = base :: table(Y_test,model_knn)

# Finding Accuracy

sum(diag(conf_matrix))/sum(conf_matrix)

library(rpart)
library(rpart.plot)

# Importing The Dataset

a = iris
colnames(iris)

decisiontree = rpart(Species~.,data = iris,method = "class")
decisiontree
rpart.plot(decisiontree,cex = 0.70,type = 2)

# KMEANS CLUSTER APPROACH

install.packages("cluster")
install.packages("ClusterR")
library(cluster)
library(ClusterR)

iris_kmeans = iris[,-5]

# Applying Functions

kmeans_model = kmeans(iris_kmeans,centers = 3)

# Confusion Matrix

cofusion_matrix = table(iris$Species,kmeans_model$cluster)
cofusion_matrix

# Ploting 2-Dimensions.

plot(iris_kmeans[c("Sepal.Length","Sepal.Width")],col = kmeans_model$cluster,main = "Kmeans")
points(kmeans_model$centers[,c("Sepal.Length","Sepal.Width")],col = 1:3,pch=8)