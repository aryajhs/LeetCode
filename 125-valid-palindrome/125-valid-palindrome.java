class Solution {
    public boolean isPalindrome(String s) {
        if(s == null){return false;}
        String str = s.toLowerCase().replaceAll("[^a-z0-9]","");
        int i = 0;
        int j = str.length() - 1;
        while(i < j){
            if(str.charAt(i) == str.charAt(j)){
                i++;
                j--;
            }
            else{
                return false;
            }
        } 
        return true;
    }
}