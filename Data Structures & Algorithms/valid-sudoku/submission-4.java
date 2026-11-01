class Solution {
    public boolean isValidSudoku(char[][] board) {
        int[] rows = new int[9];
        int[] cols = new int[9];
        int[] squares = new int[9];

        for(int r = 0; r < 9; r++) {
            for(int c = 0; c < 9; c++) {
                char el = board[r][c];
                if(el == '.') continue;

                int mask = 1 << (el - 1);

                int squareEl = (r / 3) * 3 + (c / 3);

                if((rows[r] & mask) != 0
                || (cols[c] & mask) != 0
                || (squares[squareEl] & mask) != 0) {
                    return false;
                }

                rows[r] |= mask;
                cols[c] |= mask;
                squares[squareEl] |= mask;
                
            }
        }
        return true;
    }
}
