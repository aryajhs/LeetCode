class Solution {
    public int concatenatedBinary(int n) {
        long val=0, i=0;
        while(i++<n)
            val= ((val<<(1+(int)(Math.log(i)/Math.log(2))))+i)%1000000007;
        return (int)val;
    }
}



// class Solution {
//     public int concatenatedBinary(int n) {
//     String s;
//     String s2="";
//     long k ;
         
        
//         for(int i=1;i<=n;i++)
//         {
//            s= Integer.toBinaryString(i);
//           s2+=s;
//         }
//         k = Integer.parseInt(s2);
//     int decimalNumber = 0, i = 0;int sum=0;
//     while(k!=0){
//         int rem=k%10;
//         if(k==1) sum+=Math.pow(2,i);
//         k/=10;
//         i++;
//     }
//             return sum;
//     }
// }