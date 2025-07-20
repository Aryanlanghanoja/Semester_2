#If Condition In R
a<-readline(prompt = "Enter The First Number:-")
a <- as.numeric(a)
b <-readline(prompt = "Enter The Second Number:-")
b <- as.numeric(b)
c <-readline(prompt = "Enter The Third Number:-")
c <- as.numeric(c)
a=readline();

print(a)
print(b)
print(c)

a=2
b=3
c=1
if(a>b){
  if(a>c){
    print("a Is Max")
  }else{
    print("c Is Max")
  }
}else{
  if(b>c){
    print("b Is Max")
  }else{
    print("c Is Max")
  }
}