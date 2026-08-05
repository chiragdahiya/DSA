class Solution {
    public List<List<Integer>> generate(int numRows) {
        int n = numRows;
        List<List<Integer>> triangle = new ArrayList<>();

        for(int row = 0; row<n; row++){
            List<Integer> currRow = new ArrayList<>();
            currRow.add(1);
            int value = 1;
            for(int col = 1;col<=row; col++){
                value = value*(row-col+1)/col;
                currRow.add(value);
            }
            triangle.add(currRow);
        }
        return triangle;
        
    }
}