class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        {
            return false;
        }
//        HashSet<Character> set1  = new HashSet<>();
//         StringBuilder sb1 = new StringBuilder();
//        HashSet<Character> set2 = new HashSet<>();
//         StringBuilder sb2 = new StringBuilder();
        
//         for(char i: s.toCharArray())
//         {
//             if(set1.add(i))
//             {
//                 sb1.append(i);
                
//             }
            
//         }
        
//         for(char i: t.toCharArray())
//         {
//             if(set2.add(i))
//             {
//                 sb2.append(i);
//             }
//         }
        
//         System.out.println(sb1);
//         System.out.println(sb2);
        
        char[] char1= s.toCharArray();
        char[] char2=t.toCharArray();
        
        Arrays.sort(char1);
        Arrays.sort(char2);
        
        if(Arrays.equals(char1,char2))
        {
            return true;
        }
        else
        {
        return false;
        }
        
    }
}