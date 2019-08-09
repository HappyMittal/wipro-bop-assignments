var b=20
var c=15
var d=16
var e=25
numbers=[]
numbers.push(a)
numbers.push(b)
numbers.push(c)
numbers.push(d)
numbers.push(e)
temp=0
for(i=0;i<numbers.length;i++)
{
	if(numbers[i]>=temp)
		temp=numbers[i]
}