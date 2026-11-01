class Solution {
    public int[] dailyTemperatures(int[] temps) {
        int[] result = new int[temps.length];
        for(int i = 0; i < temps.length; i++) {
            int j = i + 1;
            int numOfDays = 0;
            boolean found = false;
            while(j < temps.length) {
                int curr = temps[i];
                int next = temps[j++];
                if(curr < next) {
                    numOfDays++;
                    found = true;
                    break;
                }
                numOfDays++;
            }
            result[i] = found ? numOfDays : 0;
            found = false;
        }
        return result;
    }
}
