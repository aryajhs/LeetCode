class Solution {
    public String addBinary(String a, String b) {
        int i = a.length()-1, j = b.length()-1;
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        int carry = 0;
        while(i >= 0 || j >= 0){
            sum = carry;
            if(i >= 0)sum += a.charAt(i)-'0';
            if(j >= 0)sum += b.charAt(j)-'0';
            
            sb.append((char)sum % 2);
            carry = sum/2;
            i--;
            j--;
        }
        if(carry > 0){
            sb.append(carry);
        }
        sb.reverse();
        return sb.toString();
    }
}