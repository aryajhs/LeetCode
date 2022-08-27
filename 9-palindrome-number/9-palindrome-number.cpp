class Solution {
public:
    bool isPalindrome(int x) {
             if(x < 0){
            return false;
        }
        
        string s = to_string(x);
        
        for(int i=0; i<s.length(); i++){
            
            if(i >= s.length()-1-i){
                break;
            }
            if(s[i] != s[s.length()-1-i]){
                return false;
            }
        }
        return true;
        
    }
};
        
 