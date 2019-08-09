var str="Helloo"
function occurences(a)
{	
	c=0
	for(i=0;i<str.length;i++)
    {
		if(str.charAt(i)==a)
			c++
    }
return c
}