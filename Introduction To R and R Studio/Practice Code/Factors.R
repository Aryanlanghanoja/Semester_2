vector = c("E" , "W", "N" ,"S","W","W","S" ,"N" , "N" ,"S" , "S")
factor(vector)
summary(vector)
summary(factor((vector)))

#Ordered Factor

vector_1 = factor(vector,ordered = TRUE , levels = c("E" , "W", "N" ,"S","W","W","S" ,"N" , "N" ,"S" , "S"))
vector_1


# Operations On Vectors.

year <- c(1985,1990,2010,2002)
name(year) <- c("LOC-Kargil","Sholay","ABCDE","TREE")
year_sorted = sort(year)
year_sorted

# logical operation on vector

year[year>2000]