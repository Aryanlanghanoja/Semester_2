{
  str = as.integer((readline(prompt = "Enter The Starting Number:-")))
  lst = as.integer((readline(prompt = "Enter The Last Number:-")))
  
  for(i in str:lst){
    j=0
    for(k in 1:i){
      if(i%%k == 0){
        j = j + 1 
      }
    }
    
    if(j == 2){
      cat(paste(i ," "))
    }
  }
}