library(ggplot2)

# Q-1 - Load the dataset

A = read.csv("D:/Aryan/Semester - 2/Introduction To R and R Studio/Data_Analysis 11-05-2023/Evaluation Sheet for R Practical exam LHC-1.csv")

# Q-2 - Aggregate and determine the total marks for each component, i.e., ESE, CSE, IA, TW, and Viva.

ESE = A$ESE1
CSE = c()
IA = c()
TW = c()
Viva = c()

for(i in 1:nrow(A)){
  CSE = append(CSE,(A$Quiz.1[i] + A$Assignment1[i] + A$Assignment2[i] + A$Assignment.3[i] + A$Assignment4[i] + A$Assignment5[i] + A$Coding.Exercise.1[i] + A$Coding.Exercise.2[i]))
  IA = append(IA,(A$IITB[i] + A$Debug1[i] + A$Debug2[i] + A$Debug3[i] + A$Debug4[i]))
  TW = append(TW,(A$Mooc1[i] + A$TW.Test1[i] + A$TW.Test.2[i]))
  Viva = append(Viva,(A$Oral.VIVA[i]  + A$Long.Hour[i]))
}

# Q-3 - Map each of the components into 50,20,30,25 and 25 marks, respectively

CSE_Mapped = CSE *20/31

# Q-4 - Draw the scatterplot of each component individually

ESE_SP = data.frame(X = A$Enrollment , y =  A$ESE1)
CSE_SP = data.frame(x = A$Enrollment  ,y = CSE_Mapped)
IA_SP = data.frame(x = A$Enrollment , y =  IA)
TW_SP = data.frame(x = A$Enrollment , y = TW)
Viva_SP = data.frame(x = A$Enrollment , y = Viva)

ggplot(ESE_SP,aes(x = X ,y = y)) + geom_point(col = "red") +   labs(x = "Enrollment_No", y = "ESE_Marks", title = "ESE Scatter Plot")
ggplot(CSE_SP,aes(x = x ,y = y)) + geom_point(col = "blue") +   labs(x = "Enrollment_No", y = "CSE_Marks", title = "CSE Scatter Plot")
ggplot(IA_SP,aes(x = x ,y = y)) + geom_point(col = "green") +   labs(x = "Enrollment_No", y = "IA_Marks", title = "IA Scatter Plot")
ggplot(TW_SP,aes(x = x ,y = y)) + geom_point(col = "orange") +   labs(x = "Enrollment_No", y = "TermWork_Marks", title = "Term Work Scatter Plot")
ggplot(Viva_SP,aes(x = x ,y = y)) + geom_point(col = "cyan") +   labs(x = "Enrollment_No", y = "Viva_Marks", title = "Viva Scatter Plot")

# Q-5 -  Draw the box plot for each component individually

ggplot(ESE_SP,aes(x = X ,y = y)) + geom_boxplot() +   labs(x = "Enrollment_No", y = "ESE_Marks", title = "ESE Scatter Plot")
ggplot(CSE_SP,aes(x = x ,y = y)) + geom_boxplot() +   labs(x = "Enrollment_No", y = "CSE_Marks", title = "CSE Scatter Plot")
ggplot(IA_SP,aes(x = x ,y = y)) + geom_boxplot() +   labs(x = "Enrollment_No", y = "IA_Marks", title = "IA Scatter Plot")
ggplot(TW_SP,aes(x = x ,y = y)) + geom_boxplot() +   labs(x = "Enrollment_No", y = "TermWork_Marks", title = "Term Work Scatter Plot")
ggplot(Viva_SP,aes(x = x ,y = y)) + geom_boxplot()+   labs(x = "Enrollment_No", y = "Viva_Marks", title = "Viva Scatter Plot")


# Q-6 - Find the statistics of each component(Summary)

Stat_ESE = summary(ESE)
Stat_CSE = summary(CSE_Mapped)
Stat_IA = summary(IA)
Stat_TW = summary(TW)
Stat_Viva = summary(Viva)


# Q-7 -  Find out the student getting highest marks in each component individually

Highest = c(max(ESE)  ,max(CSE_Mapped) , max(IA) , max(TW) , max(Viva))


ESE_Name = A$Student[which(ESE == Highest[1])]
CSE_Name = A$Student[which(CSE_Mapped == Highest[2])]
IA_Name = A$Student[which(IA == Highest[3])]
TW_Name = A$Student[which(TW == Highest[4])]
Viva_name = A$Student[which(Viva == Highest[5])]


print(paste("ESE-Tppper - ",ESE_Name))
print(paste("CSE-Tppper - ",CSE_Name))
print(paste("IA-Tppper - ",IA_Name))
print(paste("TW-Tppper - ",TW_Name))
print(paste("VIVA-Tppper - ",Viva_Name))

# Q-8 - Find out the total marks (out of 150)

Total_Marks = ESE + CSE_Mapped + IA + TW + Viva

# Q-9 - Draw the scatterplot of total marks

Total_SP = data.frame(x = A$Enrollment , y = Total_Marks)

ggplot(Total_SP,aes(x = x ,y = y)) + geom_point(col = "black") +   labs(x = "Enrollment_No", y = "Total_Marks", title = "Total Marks Scatter Plot")


# Q-10 - Draw the box plot for total marks

ggplot(data=Total_SP, mapping=aes(x=x, y=y))+geom_boxplot() + labs(x = "Enrollment_No", y = "Total_Marks", title = "Total Marks Scatter Plot")

# Q-11 - Find out the total percentage obtained by the student

Percentage = Total_Marks * 100 / 150

# Q-12 - Find out the total number of students with marks 
#(i) less than 30 (ii) 30-50 (iii) 50-70 (iv) 70-85 and (v) greater than 85 and 
#represent them in a graph


Results = c(0,0,0,0,0)

for(i in 1:nrow(A)){
  if(Percentage[i] < 30){
    Results[1] = Results[1] + 1
  } else if (Percentage[i] >= 30 & Percentage[i] <= 50){
    Results[2] = Results[2] + 1
  }else if (Percentage[i] > 50 & Percentage[i] <= 70){
    Results[3] = Results[3] + 1
  }else if (Percentage[i] > 70 & Percentage[i] <= 85){
    Results[4] = Results[4] + 1
  }else if (Percentage[i] > 85){
    Results[5] = Results[5] + 1
  }
}

Results_Sp = data.frame(x = c("Percentage<30" , "30<=Percentage<=50" , "50<Percentage<=70" , "70<Percentage<=85" , "Percentage>85"), y = Results)

ggplot(Results_Sp,aes(x = x ,y = y)) + geom_point(col = "black") +   labs(x = "Marks", y = "No_Of_Students", title = "Results")


# Q-13 Absolute Grading to be given to each student, 
#as 90%+-->"O" Grade, 80%-90%--> "A+" Grade, 70%-80%--> "A" grade, etc.

Grade = c()

for(i in 1:nrow(A)){
  if(Percentage[i] >90){
    Grade = append(Grade,"O")
  } else if(Percentage[i]<=90 & Percentage[i]>80){
    Grade = append(Grade,"A+")
  }else if(Percentage[i]<=80 & Percentage[i]>70){
    Grade = append(Grade,"A")
  }else if(Percentage[i]<=70 & Percentage[i]>60){
    Grade = append(Grade,"B+")
  }else if(Percentage[i]<=60 & Percentage[i]>50){
    Grade = append(Grade,"B")
  }else if(Percentage[i]<=50 & Percentage[i]>40){
    Grade = append(Grade,"C")
  }else if(Percentage[i]<=40 & Percentage[i]>=33){
    Grade = append(Grade,"D")
  }else if(Percentage[i]<33){
    Grade = append(Grade,"F")
  }
}

# Q-14 Plot the bar chart showing the number of students for each grade obtained in Q.13

No_of_Stu = c(0,0,0,0,0,0,0,0)
for(i in 1:nrow(A)){
  if(Grade[i] == "O"){
    No_of_Stu[1] = No_of_Stu[1] + 1
  } else   if(Grade[i] == "A+"){
    No_of_Stu[2] = No_of_Stu[2] + 1
  } else   if(Grade[i] == "A"){
    No_of_Stu[3] = No_of_Stu[3] + 1
  }else   if(Grade[i] == "B+"){
    No_of_Stu[4] = No_of_Stu[4] + 1
  }else   if(Grade[i] == "B"){
    No_of_Stu[5] = No_of_Stu[5] + 1
  }else   if(Grade[i] == "C"){
    No_of_Stu[6] = No_of_Stu[6] + 1
  }else   if(Grade[i] == "D"){
    No_of_Stu[7] = No_of_Stu[7] + 1
  }else   if(Grade[i] == "F"){
    No_of_Stu[8] = No_of_Stu[8] + 1
  }
}

names_Grade = c("O" , "A+" ,"A" ,"B+" ,"B","C" ,"D","F")
Bar = data.frame(x = names_Grade , y = No_of_Stu )

ggplot(data = Bar, aes(x = x, y = y)) +
  geom_bar(stat = "identity") +
  labs(x = "Grade", y = "No_Of_Students", title = "Bar Graph")

# Q-15  Find out the grade obtained by a maximum number of students.

High_Grade = names_Grade[which(No_of_Stu == max(No_of_Stu))]









