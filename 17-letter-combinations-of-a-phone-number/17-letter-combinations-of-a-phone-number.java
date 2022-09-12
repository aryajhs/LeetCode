class Solution {
    public List<String> letterCombinations(String digits) {
        HashMap<Character, String> map = new HashMap<>();
        map.put('2', "abc");
         map.put('3', "def");
         map.put('4', "ghi");
         map.put('5', "jkl");
         map.put('6', "mno");
         map.put('7', "pqrs");
         map.put('8', "tuv");
         map.put('9', "wxyz");
        
        ArrayList<String> ans = new ArrayList<>();
        ans.add("");
    
        for(int i=0 ; i<digits.length();i++)
        {
            String dummy = map.get(digits.charAt(i));
            ArrayList<String> bogie = new ArrayList<>();
            
            for(int j=0;j<dummy.length();j++)
            {
                for(String each : ans)
                {
                    String m = each + String.valueOf(dummy.charAt(j));
                    bogie.add(m);
                }
            }
            ans=bogie;
        }
        
        if(ans.get(0).equals(""))
        {
            ArrayList<String> ans2 = new ArrayList<>();
            return ans2;
        }
        
        return ans;
         
        
        
    }
}