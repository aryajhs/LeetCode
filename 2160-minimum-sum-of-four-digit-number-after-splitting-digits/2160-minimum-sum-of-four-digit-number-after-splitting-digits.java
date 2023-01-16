class Solution {
    public int minimumSum(int num) {
        int ar[]=new int[4];
        int k = 0;
        while(num!=0)
        {
            ar[k]=num%10;
            num=num/10;
            k++;
        }
        Arrays.sort(ar);
        return ((ar[0]*10)+ar[2])+((ar[1]*10)+ar[3]);
    }
}