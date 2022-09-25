class Solution {
public boolean isPalindrome(int x) {
int rev = 0;
int rem;
int temp = x;

    while(temp>0){
        rem = temp%10;
        rev = rev*10 + rem;
        temp = temp/10;
    }
    
    System.out.println(rev);
    if(x==rev){
        return true;
    }
    else{
        return false;
    }
    
}
}