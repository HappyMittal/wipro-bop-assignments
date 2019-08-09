function fibonacci(n)
{
    if(n<=1)
        return n 
    return fibonacci(n-1)+fibonacci(n-2)
}
fiblist=[]
c==0
while(fiblist.length<10)
{
	fiblist.push(fibonacci(c))
}