class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int r = 0; r < 9; r++) {
            var seen = new HashSet<Character>();
            for(int i = 0; i < 9; i++) {
                var val = board[r][i];
                if(val == '.') continue; 
                if(seen.contains(val)) return false;
                seen.add(val);
            }
        }

        for(int c = 0; c < 9; c++) {
            var seen = new HashSet<Character>();
            for(int i = 0; i < 9; i++) {
                var val = board[i][c];
                if(val == '.') continue; 
                if(seen.contains(val)) return false;
                seen.add(val);
            }
        }

        for(int square = 0; square < 9; square++) {
            var seen = new HashSet<Character>();
            for(int r = 0; r < 3; r++) {
                for(int c = 0;  c < 3; c++) {
                    var val = board[square / 3 * 3 + r][square % 3 * 3 + c];
                    if(val == '.') continue;
                    if(seen.contains(val)) return false;
                    seen.add(val);
                }
            }
        }

        return true;
    }
}
