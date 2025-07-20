# import Dataset
A = read.csv("D:/Aryan/Semester - 2/Introduction To R and R Studio/Shark Tank US Dataset_Final.csv")

# Question - 1 : Which season is having the overall highest deal in terms of the amount?

A$Total.Deal.Amount[is.na(A$Total.Deal.Amount)] = 0
Season = A$Season.Number[which(A$Total.Deal.Amount == max(A$Total.Deal.Amount))]

# Question -2 : Enlist episodes for each season having the highest deal in terms of the amount?

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

# Question - 3 : Which are the top-10 deals in the shark tank?

Highest_deal_Season = sort(price_Season,decreasing = TRUE)

# Question - 4 : Top-3 Industries with highest deals in the shark tank?

Industries = unique(A$Industry)
Name_Industry = c()

for(i in 1:nrow(A)){
  if(A$Got.Deal[i]== 1){
  if(A$Industry[i] == Industries[1]){
    Name_Industry = append(Name_Industry,1)
  } else if (A$Industry[i] == Industries[2]){
    Name_Industry = append(Name_Industry,2)
  } else if (A$Industry[i] == Industries[3]){
    Name_Industry = append(Name_Industry,3)
  } else if (A$Industry[i] == Industries[4]){
    Name_Industry = append(Name_Industry,4)
  } else if (A$Industry[i] == Industries[5]){
    Name_Industry = append(Name_Industry,5)
  } else if (A$Industry[i] == Industries[6]){
    Name_Industry = append(Name_Industry,6)
  } else if (A$Industry[i] == Industries[7]){
    Name_Industry = append(Name_Industry,7)
  } else if (A$Industry[i] == Industries[8]){
    Name_Industry = append(Name_Industry,8)
  } else if (A$Industry[i] == Industries[9]){
    Name_Industry = append(Name_Industry,9)
  } else if (A$Industry[i] == Industries[10]){
    Name_Industry = append(Name_Industry,10)
  } else if (A$Industry[i] == Industries[11]){
    Name_Industry = append(Name_Industry,11)
  } else if (A$Industry[i] == Industries[12]){
    Name_Industry = append(Name_Industry,12)
  } else if (A$Industry[i] == Industries[13]){
    Name_Industry = append(Name_Industry,13)
  } else if (A$Industry[i] == Industries[14]){
    Name_Industry = append(Name_Industry,14)
  } }
}


Industry_Table = table(Name_Industry)
Industry_Name = c() 

for(i in 1:14){
  Industry_Name = append(Industry_Name,Industry_Table[[i]])
}

Biggest_Industry = sort(Industry_Name,decreasing = TRUE)
Industry = c()

for(i in 1:14){
  Industry = append(Industry, which(Biggest_Industry[i] == Industry_Name))
}

Name_Of_Industry = c()

for(i in 1:3){
  Name_Of_Industry = append(Name_Of_Industry,Industries[Industry[i]])
}

# Question - 5 : Which are the top-5 cities with the maximum number of entrepreneurs?

City = unique(A$Pitchers.City)
City = City[-250]
City_No = c()

for(i in 1:249){
  for(j in 1:nrow(A)){
    if(A$Pitchers.City[j] == City[i]){
      City_No = append(City_No,i)
    } } }

City_No = table(City_No)
City_Name = c()

for(i in 1:249){
  City_Name = append(City_Name,City_No[[i]])
}

Biggest_City = sort(City_Name,decreasing = TRUE)
Cities = c()

for(i in 1:249){
  Cities = append(Cities,which(Biggest_City[i] == City_No))
}

Top_City = c()

for(i in 1:5){
  Top_City = append(Top_City,City[Cities[i]])
}

# Question - 6 : Which are the top-3 states that has got maximum number of deals?

States = unique(A$Pitchers.State)
States = States[-45]

State_No = c()

for(i in 1:length(States)){
  for(j in 1:nrow(A)){
    if(A$Pitchers.State[j] == States[i]){
      State_No = append(State_No,i)
    }
  }
}

State_No = table(State_No)

Sorted_State_No = sort(State_No,decreasing = TRUE)
