class Solution {
    public String[] findWords(String[] words) {
      List<String> result = new ArrayList<>();
      Set<Character> row1 = new HashSet<>();
      row1.add('Q');
      row1.add('W');
      row1.add('E');
      row1.add('R');
      row1.add('T');
      row1.add('Y');
      row1.add('U');
      row1.add('I');
      row1.add('O');
      row1.add('P');
      
      row1.add('q');
      row1.add('w');
      row1.add('e');
      row1.add('r');
      row1.add('t');
      row1.add('y');
      row1.add('u');
      row1.add('i');
      row1.add('o');
      row1.add('p');
      
      Set<Character> row2 = new HashSet<>();
      row2.add('A');
      row2.add('S');
      row2.add('D');
      row2.add('F');
      row2.add('G');
      row2.add('H');
      row2.add('J');
      row2.add('K');
      row2.add('L');
      
      row2.add('a');
      row2.add('s');
      row2.add('d');
      row2.add('f');
      row2.add('g');
      row2.add('h');
      row2.add('j');
      row2.add('k');
      row2.add('l');
      
      
      Set<Character> row3 = new HashSet<>();
      row3.add('Z');
      row3.add('X');
      row3.add('C');
      row3.add('V');
      row3.add('B');
      row3.add('N');
      row3.add('M');
      
      row3.add('z');
      row3.add('x');
      row3.add('c');
      row3.add('v');
      row3.add('b');
      row3.add('n');
      row3.add('m');
      
      for(String w : words) {
        Set<Character> assignedRow = null;
        boolean skip = false;
        for(char c: w.toCharArray()){
            if(assignedRow == null){
              assignedRow = row1.contains(c) ? row1 : (row2.contains(c) ? row2 : row3);
              continue;
            }
            if(!assignedRow.contains(c)){
              skip = true;
              break;
          }
        }
        if(!skip){
          result.add(w);
        }
      }
      return result.toArray(new String[0]);
    }
    
}