{
year = as.integer((readline(prompt = "Enter The Year:-")))
if(year%%400==0){
  print("It Is Leap Year")
}else if(year%%100!=0 && year%%4==0){
  print("It Is A Leap Year")
}else{
  print("It Is Not A Leap Year")
}
}

# For loop In R.

for(i in 1:10){
  print(i)
}

for(i in 5:20){
  cat(paste(i,"*"))
}

fruits = list("Banana","Mango","Orange","Grapes")
for (i in fruits){
  print(i)
}

for(i in seq(1,10,3)){

  print(i)
}

for(i in 1:10){
  if(i==5){
    break
  }
  print(i)
}

for(i in 1:10){
  if(i==5){
    next
  }
  print(i)
}

Adj = list("Tasty","Fresh")
fruits1 = list("Mango","Orange","Banana")
for (i in Adj){
  for(j in fruits1)
  print(paste(i,j))
}























































































































