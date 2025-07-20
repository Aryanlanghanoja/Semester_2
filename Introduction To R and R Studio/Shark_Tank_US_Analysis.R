
# import Dataset

A = read.csv("D:/Aryan/Semester - 2/Introduction To R and R Studio/Shark Tank US Dataset_Final.csv")

Season_Number = c(unique(A$Season.Number))
Episodes = c(0,0,0,0,0,0,0,0,0,0)

for(i in 1:895){
  if(A$Season.Number[i] == 1){
    Episodes[1] = Episodes[1] + 1
  } else if(A$Season.Number[i]==2){
    Episodes[2] = Episodes[2] + 1
  } else if(A$Season.Number[i]==3){
    Episodes[3] = Episodes[3] + 1
  } else if(A$Season.Number[i]==4){
    Episodes[4] = Episodes[4] + 1
  } else if(A$Season.Number[i]==5){
    Episodes[5] = Episodes[5] + 1
  } else if(A$Season.Number[i]==6){
    Episodes[6] = Episodes[6] + 1
  } else if(A$Season.Number[i]==7){
    Episodes[7] = Episodes[7] + 1
  } else if(A$Season.Number[i]==8){
    Episodes[8] = Episodes[8] + 1
  } else if(A$Season.Number[i]==9){
    Episodes[9] = Episodes[9] + 1
  } else if(A$Season.Number[i]==10){
    Episodes[10] = Episodes[10] + 1
  }
}

#ggplot() +
#  geom_bar(data = A,aes(x=Season_Number , y = Episodes),stat = "identity") 
#+ ggtitle("Demonstration Of Line Chart") + labs(x="No.Of Companies",y="Score(as per Nifty-50)")

#Question-1

Total_Amount <- c(0,0,0,0,0,0,0,0,0,0)

for(i in 1:10){
  for(j in  Episodes[i]){
    Total_Amount[i] = Total_Amount[i] + A$Total.Deal.Amount[j]
  }  
}

# Question - 3 

Highest_deal_Season = c() 

i=1 
j=1
while(i<=10){
  max=0
  while(j<=Episodes[i]){
    if(A$Total.Deal.Amount[j] > 0){
      #Highest_deal_Season[i] = A$Total.Deal.Amount[j]
      Highest_deal_Season = append(Highest_deal_Season,A$Total.Deal.Amount[j])
    } 
    j = j + 1 
  }
    i = i + 1 
    }

# Question - 2

No_of_Episodes <- c(0,0,0,0,0,0,0,0,0,0)

for(i in 1:10){
  for(j in 1:Episodes[i]){
    if(A$Total.Deal.Amount[j] == Highest_deal_Season[i]){
      No_of_Episodes[i] = j
    }
  }
}

#_____________________________________________________________________________#

# Question-1

Season_Amount = c()
Highest_deal_Season = c()
for( i in 1:10){
  max = 0
  for(j in 1:Episodes[i]){
    if (!is.na(A$Total.Deal.Amount[j]) && A$Total.Deal.Amount[j] > max){
      Season_Amount = append(Season_Amount,A$Total.Deal.Amount[j])
    }
  }
  Highest_deal_Season = append(Highest_deal_Season,max(Season_Amount))
}

A$Total.Deal.Amount[is.na(A$Total.Deal.Amount)] = 0 
Deal_Season_1 = c(A$Total.Deal.Amount[1:Episodes[1]] )
Deal_Season_2 = c(A$Total.Deal.Amount[(Episodes[1] + 1) : (Episodes[1] + Episodes[2])])
Deal_Season_3 = c(A$Total.Deal.Amount[(Episodes[1] + Episodes[2] + 1) : (Episodes[2] + Episodes[3])])
Deal_Season_4 = c(A$Total.Deal.Amount[(Episodes[3] + Episodes[2] + 1) : (Episodes[3] + Episodes[4])])
Deal_Season_5 = c(A$Total.Deal.Amount[(Episodes[4] + Episodes[3] + 1) : (Episodes[4] + Episodes[5])])
Deal_Season_6 = c(A$Total.Deal.Amount[(Episodes[5] + Episodes[4] + 1) : (Episodes[5] + Episodes[6])])
Deal_Season_7 = c(A$Total.Deal.Amount[(Episodes[6] + Episodes[5] + 1) : (Episodes[6] + Episodes[7])])
Deal_Season_8 = c(A$Total.Deal.Amount[(Episodes[7] + Episodes[6] + 1) : (Episodes[7] + Episodes[8])])
Deal_Season_9 = c(A$Total.Deal.Amount[(Episodes[8] + Episodes[7] + 1) : (Episodes[8] + Episodes[9])])
Deal_Season_10 = c(A$Total.Deal.Amount[(Episodes[9] + Episodes[8] + 1) :(Episodes[9] + Episodes[10])])

Season_Max_Amount = c()
Season_Max_Amount = append(Season_Max_Amount,max(Deal_Season_1))
Season_Max_Amount = append(Season_Max_Amount,max(Deal_Season_2))
Season_Max_Amount = append(Season_Max_Amount,max(Deal_Season_3))
Season_Max_Amount = append(Season_Max_Amount,max(Deal_Season_4))
Season_Max_Amount = append(Season_Max_Amount,max(Deal_Season_5))
Season_Max_Amount = append(Season_Max_Amount,max(Deal_Season_6))
Season_Max_Amount = append(Season_Max_Amount,max(Deal_Season_7))
Season_Max_Amount = append(Season_Max_Amount,max(Deal_Season_8))
Season_Max_Amount = append(Season_Max_Amount,max(Deal_Season_9))
Season_Max_Amount = append(Season_Max_Amount,max(Deal_Season_10))