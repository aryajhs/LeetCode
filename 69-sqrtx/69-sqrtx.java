class Solution {
public int mySqrt(int x) {

double low=1;
double high=x;
int y=0;
while(low<=high)
{ double mid=(int)(low+high)/2;
double ans=1;
ans=mid*mid;
if(ans==x)
{
return (int)mid;
}
else if(ans>x)
{
high=mid-1;

}
else
{
    low=mid+1;
	 
    y=Math.max(y,(int)mid);
  
}

}
return y;
}
}