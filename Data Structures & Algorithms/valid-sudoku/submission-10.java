class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer, HashSet<Character>> rows = new HashMap<Integer, HashSet<Character>>();
        Map<Integer, HashSet<Character>> colomns = new HashMap<Integer, HashSet<Character>>();
        Map<String, HashSet<Character>> boxes = new HashMap<String, HashSet<Character>>();

        for(int row = 0; row < 9; row++) {
            for(int col = 0; col < 9; col++) {
                char value = board[row][col];
                if(value == '.') continue;

                String boxKey = (row / 3) + "," + (col / 3);

                if(rows.computeIfAbsent(row, k -> new HashSet<>()).contains(value) ||
                    colomns.computeIfAbsent(col, k -> new HashSet<>()).contains(value) ||
                    boxes.computeIfAbsent(boxKey, k -> new HashSet<>()).contains(value)) return false;

                rows.get(row).add(value);
                colomns.get(col).add(value);
                boxes.get(boxKey).add(value);
            }
        }

        return true;
    }
}
