# Import Dataset

A = read.csv("D:/Aryan/Semester - 2/Introduction To R and R Studio/Shark Tank US Dataset_Final.csv")

# Black Box

Solution = function(vector,num){
  freq_table = table(vector)
  ranked_vect = names(sort(freq_table,decreasing = TRUE))
  ranked_vect = ranked_vect[nzchar(ranked_vect)]
  print(ranked_vect[1:num])
}

# Vector Sum

Vector_Sum = function(vector){
  Sum = 0
  
  for(i in 1:length(vector)){
    Sum = Sum + vector[i]
  }
  
  return (Sum)
}

# 1. Which season is having the overall highest deal in terms of the amount?

A$Total.Deal.Amount[is.na(A$Total.Deal.Amount)] = 0
Season = A$Season.Number[which(A$Total.Deal.Amount == max(A$Total.Deal.Amount))]

# 2. Enlist episodes for each season having the highest deal in terms of the amount?

season_unique = unique(A$Season.Number)
price_Season = c()

for(sn in season_unique){
  price = c()
  i = 1
  while(i<NROW(A)){
    if(A$Season.Number[i] == sn){
      price = append(price,A$Total.Deal.Amount[i])
    }
    i = i + 1
  }
  price[is.na(price)] = 0
  price_Season = append(price_Season,max(price))
}

Episodes = c() 

Final_Episode = c()
for(i in 1:10){
  Episodes = append(Episodes,A$Episode.Number[which(price_Season[i] == A$Total.Deal.Amount)][[1]])
}

# 3. Which are the top-10 deals in the shark tank?

Name = c()
Highest_deal_Season = sort(A$Total.Deal.Amount,decreasing = TRUE)
Highest_deal_Season = unique(Highest_deal_Season)
Highest_deal_Season = Highest_deal_Season[1:10]

for( i in 1:10){
  Name = append(Name,A$Startup.Name[which(A$Total.Deal.Amount == Highest_deal_Season[i])][[1]])
}

# 4. Top-3 Industries with highest deals in the shark tank?

Industry = c()

for( i in 1:3){
  Industry = append(Industry,A$Industry[which(A$Total.Deal.Amount == Highest_deal_Season[i])][[1]])
}

# 5. Which are the top-5 cities with the maximum number of entrepreneurs?

Solution(A$Pitchers.City,5)

# 6.  Which are the top-3 states that has got maximum number of deals?

States = c()

for(i in 1:nrow(A)){
  if(A$Got.Deal[i] == 1){
    States = append(States,A$Pitchers.State[i])
  }
}

Solution(States,3)

# 7. Industry wise count the total number of startups who pitched in shark tank

Industry_Table = table(A$Industry)
Data_Frame = as.data.frame(Industry_Table)
#Data_Frame <- Data_Frame[order(Data_Frame$Freq),]
print(Data_Frame)

# 8. Count the number of pitchers who are male, female and belongs to mixed team

Team_Table = table(A$Pitchers.Gender)
Team_Data = data.frame(Team_Table)


# 9. Find the maximum amount requested by a pitcher in each industrial segment

Industry = unique(A$Industry)

Max_Amount = c()
A$Original.Ask.Amount[is.na(A$Original.Ask.Amount)] = 0

for(i in 1:length(Industry)){
  Industry_Amount = c()
  for(j in 1:nrow(A)){
    if((A$Industry[j] == Industry[i])){
      Industry_Amount = append(Industry_Amount,A$Original.Ask.Amount[j])
    } 
  }
  Max_Amount = append(Max_Amount,max(Industry_Amount))
}

Amount_Industry = data.frame(Industry,Max_Amount)

# 10. Find the maximum equity received by a shark in each industrial segment

Max_Equity = c()
A$Total.Deal.Equity[is.na(A$Total.Deal.Equity)] = 0

for(i in 1:length(Industry)){  #pick one industry
  Industry_Eqity = c()
  for(j in 1:nrow(A)){
    if((A$Industry[j] == Industry[i])){
      Industry_Eqity = append(Industry_Eqity,A$Total.Deal.Equity[j])
    } 
  }
  Max_Equity = append(Max_Equity,max(Industry_Eqity))
}

Equity_Industry = data.frame(Industry,Max_Equity)

# 11. Find the total amount invested by each shark throughout shark tank

# Barbara_Corcora
Barbara_Corcora_Amount = A$Barbara.Corcoran.Investment.Amount[!is.na(A$Barbara.Corcoran.Investment.Amount)]
Barbara_Corcoran = Vector_Sum(Barbara_Corcora_Amount)

# Mark_Cuban
Mark_Cuban_Amount = A$Mark.Cuban.Investment.Amount[!is.na(A$Mark.Cuban.Investment.Amount)]
Mark_Cuban = Vector_Sum(Mark_Cuban_Amount)

# Lori Greine

Lori_Greine_Amount = A$Lori.Greiner.Investment.Amount[!is.na(A$Lori.Greiner.Investment.Amount)]
Lori_Greine = Vector_Sum(Lori_Greine_Amount)

# Robert Herjavec

Robert_Herjavec_Amount = A$Robert.Herjavec.Investment.Amount[!is.na(A$Robert.Herjavec.Investment.Amount)]
Robert_Herjavec = Vector_Sum(Robert_Herjavec_Amount)

# Daymond John

Daymond_John_Amount = A$Daymond.John.Investment.Amount[!is.na(A$Daymond.John.Investment.Amount)]
Daymond_John = Vector_Sum(Daymond_John_Amount)

# Kevin O Leary

Kevin_O_Leary_Amount = A$Kevin.O.Leary.Investment.Amount[!is.na(A$Kevin.O.Leary.Investment.Amount)]
Kevin_O_Leary = Vector_Sum(Kevin_O_Leary_Amount)

Data = data.frame(Shark_Name = c("Barbara Corcora","Mark Cuban","Lori Greine","Robert Herjavec","Daymond John","Kevin O Leary"),
                  c(Barbara_Corcoran,Mark_Cuban,Lori_Greine,Robert_Herjavec,Daymond_John,Kevin_O_Leary))



# 12. Name the startups with Top-15 investments

Name_1 = c()
Highest_deal_Season_1 = sort(A$Total.Deal.Amount,decreasing = TRUE)
Highest_deal_Season_1 = unique(Highest_deal_Season_1)
Highest_deal_Season_1 = Highest_deal_Season_1[1:15]

for( i in 1:15){
  Name_1 = append(Name_1,A$Startup.Name[which(A$Total.Deal.Amount == Highest_deal_Season_1[i])][[1]])
}

# 13. Find number of deals having [1,2,3,4,5] sharks included in the deal

Sharks_No = c(0,0,0,0,0)

for(i in 1:length(Sharks)){
  if(Sharks[i] == 1){
    Sharks_No[1] = Sharks_No[1]  + 1
  } else if(Sharks[i] == 2){
    Sharks_No[2] = Sharks_No[2]  + 1
  } else if(Sharks[i] == 3){
    Sharks_No[3] = Sharks_No[3]  + 1
  } else if(Sharks[i] == 4){
    Sharks_No[4] = Sharks_No[4]  + 1
  } else if(Sharks[i] == 5){
    Sharks_No[5] = Sharks_No[5]  + 1
  }
}

Frame = data.frame(No_Of_Sharks = 1:5,No_Of_Start_Up = Sharks_No)

# 14. Which are the top-3 industries where "Kevin O Leary" is more interested to invest into?

A$Kevin.O.Leary.Investment.Amount[is.na(A$Kevin.O.Leary.Investment.Amount)] = 0
Industry_Kevin = c()

for(i in 1:length(A$Kevin.O.Leary.Investment.Amount)){
  if(A$Kevin.O.Leary.Investment.Amount[i] > 0){
    Industry_Kevin = append(Industry_Kevin,A$Industry[i])
  }
}

Solution(Industry_Kevin,3)

# 15. Which are the 3 least favoured industries by the sharks? 

Industry = A$Industry[A$Total.Deal.Amount != 0]

Least_Industry = table(Industry)
Ranked_Least_Industry = names(sort(Least_Industry,decreasing = FALSE))
Ranked_Least_Industry = Ranked_Least_Industry[-1]