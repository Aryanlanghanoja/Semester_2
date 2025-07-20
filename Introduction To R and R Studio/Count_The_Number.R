{
  num = as.integer((readline("Enter The Number:-")))
  j=0
  
  sum=0
  
  while(num>0){
    j = j + 1
    num = as.integer(num/10)
  }
  print(j)
}