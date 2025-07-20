{
  num = as.integer((readline("Enter The Number:-")))
  j=0

  sum=0
  
  while(num>0){
    j = num%%10
    sum = sum + j
    num=as.integer(num/10)
  }
  
  sum = as.integer(sum)
  print(sum)
}