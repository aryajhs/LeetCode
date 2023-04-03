class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> list = new ArrayList<>();
        int max=0;
        for(int i: candies) max=i<max?max:i;
        for(int i: candies)
            if(max<=i+extraCandies) list.add(true);
        else list.add(false);
        return list;
        
    }
}