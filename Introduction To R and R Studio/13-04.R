library(ggplot2)
library(xlsx)
library(readxl)

# Line Charts

A = EuStockMarkets
EuStockDF = as.data.frame(A)
ggplot(EuStockDF, aes(x= c(1:nrow(EuStockDF)), y = DAX)) +geom_line(size=1, 
                                                                    color= "red")
ggplot() + geom_line(data =EuStockDF, aes(x= c(1:nrow(EuStockDF)), y = DAX),size=1, 
                     color= "red") + geom_line(data =EuStockDF, aes(x= c(1:nrow(EuStockDF)), y = SMI),size=1, 
                                               color= "blue") + geom_line(data =EuStockDF, aes(x= c(1:nrow(EuStockDF)), y = CAC),size=1, 
                                                                         color= "orange")+  geom_line(data =EuStockDF, aes(x= c(1:nrow(EuStockDF)), y = FTSE),size=1, 
                                                                                                       color= "green")+  ggtitle("Demonstration Of Line Chart") + labs(x="No.Of Companies",y="Score(as per Nifty-50)")

# Scatter Plot
c = mtcars
ggplot() + geom_point(data = c , aes(x=mpg,y = wt,color=cyl),shape = 3) + ggtitle("MT Cars Analysis") + labs(x="MPG(Mass Per Gallon)",y="No.of Cylinders")