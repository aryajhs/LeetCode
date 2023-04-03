class Solution {
    public boolean isHappy(int n) {
        if (n==1)
            return true;
        if(n<=4)
            return false;
        int num=0;
            while (n>0){
                num+= Math.pow(n%10,2);
                n /=10;
            }
            if (num != 1)
                return isHappy(num);
         return true;
    }
}