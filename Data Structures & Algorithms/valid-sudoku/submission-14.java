class Solution {
    public boolean isValidSudoku(char[][] board) {
        var seen = new HashMap<String, Set<Character>>();
        for(int r = 0; r < 9; r++) {
            for(int c = 0; c < 9; c++) {
                var val = board[r][c];
                if(val == '.') continue;

                var row = seen.computeIfAbsent("r" + r, k -> new HashSet<>());
                var col = seen.computeIfAbsent("c" + c, k -> new HashSet<>());
                var square = seen.computeIfAbsent(r / 3 + "," + c / 3, k -> new HashSet<>());

                if(row.contains(val) || col.contains(val) || square.contains(val)) {
                    return false;
                }
                row.add(val);
                col.add(val);
                square.add(val);
            }
        }

        return true;
    }
}
