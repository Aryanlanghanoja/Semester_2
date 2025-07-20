install.packages("ggplot2")
library(ggplot2)

A = EuStockMarkets
EuStockDF = as.data.frame(A)
head(EuStockDF)
ggplot(EuStockDF, aes(x= c(1:nrow(EuStockDF)), y = DAX)) +geom_line(size=1, 
color= "red")
ggplot() + geom_line(data =EuStockDF, aes(x= c(1:nrow(EuStockDF)), y = DAX),size=1, 
                      color= "red") + geom_line(data =EuStockDF, aes(x= c(1:nrow(EuStockDF)), y = SMI),size=1, 
                                                color= "blue")
