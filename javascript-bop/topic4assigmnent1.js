N=parseInt(window.prompt("enter the input size"))
primeArray=[]
for(i=1;i<=N;i++)
{
	c=0
	for(j=1;j*j<=i;j++)
	{
		if(i%j==0)
		{
			c++
		}
	}
	if(c==1)
		primeArray.push(i)
		
}
primeArray.sort(function(a,b){return a-b})
