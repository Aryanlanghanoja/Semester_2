a = c(1,2,3)
b= c(1,2,3)
a+b
a-b
a*b
a/b
a%%b
#Name Vector
name = c("Aryan","Jay","Krish")
names(name) = c("30","40","22")
name["30"]
# LIST In R
vint = c(1,2,3,4,5,6,7,8)
vchar = c("A","B","C","D")
vbool = c(TRUE,FALSE,TRUE,FALSE,TRUE,FALSE,TRUE,FALSE)
vector_list = list(vint,vchar,vbool)
print(vector_list)
typeof(vector_list)
class(vector_list)
list2=list("Aryan","Langhanoja",13.12,"A", 9.63)
print(list2)
movie = list(name="URI",year=2019,producer="ABC",month="July",rating=4.2,available=FALSE,type=c("INDIAN","PATRIOTIC","MOVIE"))
print(movie)