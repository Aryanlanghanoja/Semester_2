movie = list(name="URI",year=2019,producer="ABC",month="July",rating=4.2,
             available=FALSE,type=c("INDIAN","PATRIOTIC","MOVIE"))
movie$name = movie$name + " II"
movie["type"]
movie$available = TRUE 
print(movie)
a=movie$type
a=append(a,"Emotional")
movie$type = a
movie["Actor"] = "Vickey"
movie

ID = list(name = "Aryan" , Roll_No = 92200133030 , Percentage10 = 86.33 , 
          Percentage12 = 84 , SPI = c(9.63,9,8,8) , CPI = mean(ID$SPI))
ID$SPI[2] = 10
ID$SPI[3] = 9.98
ID$SPI[4] = 10
ID$CPI = 9.91
c=ID$name
c=paste(c,"Langhanoja")
ID$name = c
ID$CPI = mean(ID$SPI)
ID

Score = list(DLD = "O" , MAVC = "O" , OOP = "O" , EDCAD = "A+" , IRRS = "O")
Score$EDCAD = "O"
score = list(subject = c("DLD" ,"MAVC" ,"OOP" , "EDCAP" ,"IRRS"),
             grades = c(9,10,9))
a=score$grades
a[3] = 10
score$grades = a
score

# Factors In R
directions = c("E","W" , "M", "N" , "S" , "E", "F" , "W" , "W" ,"W")
factor(directions)