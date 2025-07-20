{
num = as.integer((readline(prompt = "Enter The Number:-")))

vec = c()
for(i in 1:num){
  if(num%%i == 0){
#    cat(paste(i," "))
    vec = append(vec,i)
  }
}
print(vec)
}