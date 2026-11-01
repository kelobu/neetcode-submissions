class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int row = 0; row < 9; row++) {
            var seen = new HashSet<Character>();
            for(int i = 0; i < 9; i++) {
                var element = board[row][i];
                if(element == '.') continue;
                if(seen.contains(element)) return false;
                seen.add(element);
            }
        }

        for(int col = 0; col < 9; col++) {
            var seen = new HashSet<Character>();
            for(int i = 0; i < 9; i++) {
                var element = board[i][col];
                if(element == '.') continue;
                if(seen.contains(element)) return false;
                seen.add(element);
            }
        }

        for(int box = 0; box < 9; box++) {
            var seen = new HashSet<Character>();
            for(int i = 0; i < 3; i++) {
                for(int j = 0; j < 3; j++) {
                    int row = (box / 3) * 3 + i;
                    int col = (box % 3) * 3 + j;
                    var element = board[row][col];
                    if(element == '.') continue;
                    if(seen.contains(element)) return false;
                    seen.add(element);
                }
            }
        }
        return true;
    }
}
