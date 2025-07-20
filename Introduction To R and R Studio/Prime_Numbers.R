{
  num = as.integer((readline("Enter The Number:-")))
  j=0
  
  for(i in 1:num){
    if(num%%i==0){
      j= j+1
    }
  } 
  if(j == 2){
    print("It Is A Prime Number")
  } else{
    print("It Is Not Prime Number")
  }
}
