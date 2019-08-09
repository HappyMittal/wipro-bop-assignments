function combineList(list1,list2)
{
    listFinal=[]
	if(list1.length==list2.length)
	{
		for(i=0;i<list1.length;i++)
		{
			listFinal.push(list1[i])
			listFinal.push(list2[i])
		}
	}
	else if(list1.length<list2.length)
	{
		for(i=0;i<list1.length;i++)
		{
			listFinal.push(list1[i])
			listFinal.push(list2[i])
		}
		for(i=list1.length;i<list2.length;i++)
			listFinal.push(list2[i])
	}
	else
	{
		for(i=0;i<list2.length;i++)
		{
			listFinal.push(list1[i])
			listFinal.push(list2[i])
		}
		for(i=list2.length;i<list1.length;i++)
			listFinal.push(list1[i])
		
	}
}
combineList([1,'a','b',2],[3,4,5,6])