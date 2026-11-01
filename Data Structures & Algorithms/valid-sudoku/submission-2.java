class Solution {
    public boolean isValidSudoku(char[][] board) {
        var rows = new HashMap<Integer, Set<Character>>();
        var cols = new HashMap<Integer, Set<Character>>();
        var squares = new HashMap<String, Set<Character>>();

        for(int r = 0; r < 9; r++) {
            for(int c = 0; c < 9; c++) {
                var el = board[r][c];
                if(el == '.') continue;

                var squareKey = (r / 3) + "," + (c / 3);
                if(
                    rows.computeIfAbsent(r, k -> new HashSet<>()).contains(el)
                    || cols.computeIfAbsent(c, k -> new HashSet<>()).contains(el)
                    || squares.computeIfAbsent(squareKey, k -> new HashSet<>()).contains(el)
                ) { 
                    return false;
                }

                rows.get(r).add(el);
                cols.get(c).add(el);
                squares.get(squareKey).add(el);
            }
        }

        return true;
        
    }
}
