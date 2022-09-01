 

class Solution {
public String intToRoman(int num) {
HashMap<Integer,String>h = new HashMap<>();
h.put(1,"I");
h.put(2,"II");
h.put(3,"III");
h.put(4,"IV");
h.put(5,"V");
h.put(9,"IX");
h.put(10,"X");
h.put(50,"L");
h.put(100,"C");
h.put(500,"D");
h.put(1000,"M");
h.put(40,"XL");
h.put(90,"XC");
h.put(400,"CD");
h.put(900,"CM");
String s1="";
while(num>0)
{
if(num<5)
{
s1+=h.get(num);
num=0;
}
else if(num>=5&&num<9)
{
s1+=h.get(5);
num-=5;
}
else if(num==9)
{
s1+=h.get(9);
num=0;
}
else if(num>=10&&num<40)
{
s1+=h.get(10);
num-=10;
}
else if(num>=40&&num<50)
{
s1+=h.get(40);
num-=40;
}
else if(num>=50&&num<90)
{
s1+=h.get(50);
num-=50;
}
else if(num>=90&&num<100)
{
s1+=h.get(90);
num-=90;
}
else if(num>=100&&num<400)
{
s1+=h.get(100);
num-=100;
}
else if(num>=400&&num<500)
{
s1+=h.get(400);
num-=400;
}
else if(num>=500&&num<900)
{
s1+=h.get(500);
num-=500;
}
else if(num>=900&&num<1000)
{
s1+=h.get(900);
num-=900;
}
else if(num>=1000)
{
s1+=h.get(1000);
num-=1000;
}

    }
    return s1;
    
}
}