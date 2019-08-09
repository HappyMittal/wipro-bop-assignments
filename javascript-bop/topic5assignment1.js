function areaTriangle(a,b,c)
{
	s=(a+b+c)/2;
	area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
	return area;
}
window.alert(areaTriangle(5,6,7))