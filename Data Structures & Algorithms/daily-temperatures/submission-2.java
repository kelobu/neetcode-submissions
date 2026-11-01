class Solution {
    public int[] dailyTemperatures(int[] temps) {
        int n = temps.length;
        int[] result = new int[temps.length];
        for(int i = 0; i < n; i++) {
            int j = i + 1;
            int numOfDays = 1;
            while(j < n) {
                if(temps[i] < temps[j]) break;
                j++;
                numOfDays++;
            }
            result[i] = (j == n) ? 0 : numOfDays;
        }
        return result;
    }
}
