class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int row = 0; row < 9; row++) {
            Set<Character> seen = new HashSet<Character>();
            for(int i = 0; i < 9; i++) { 
                char value = board[row][i];
                if(value == '.') continue;
                if(seen.contains(value)) return false;
                seen.add(value);
            }
        }

        for(int col = 0; col < 9; col++) {
            Set<Character> seen = new HashSet<Character>();
            for(int i = 0; i < 9; i++) { 
                char value = board[i][col];
                if(value == '.') continue;
                if(seen.contains(value)) return false;
                seen.add(value);
            }
        }

        for(int box = 0; box < 9; box++) {
            Set<Character> seen = new HashSet<Character>();
            for(int row = 0; row < 3; row++) {
                for(int col = 0; col < 3; col++) {
                    char value = board[(box / 3) * 3 + row][(box % 3) * 3 + col];
                    if(value == '.') continue;
                    if(seen.contains(value)) return false;
                    seen.add(value);
                }
            }
        }

        return true;
    }
}
