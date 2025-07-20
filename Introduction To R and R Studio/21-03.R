# While Loop
{
i=1

while(i<=10){
  print(i)
  i = i+1 
    }
}

{
m=as.integer((readline(prompt = "Enter The Value Of M:-")))
n=as.integer((readline(prompt = "Enter The Value Of N:-")))
x=as.integer((readline(prompt = "Enter The Value Of X:-")))
y=as.integer((readline(prompt = "Enter The Value Of Y:-")))

i = min(m,n)

while(i<=max(m,n)){
  if(i==min(x,y)){
    i = i+ 1
    next
  } else if(i==max(x,y)){
    break
  } else {
      print(i)
  }
  i = i+ 1
}
}