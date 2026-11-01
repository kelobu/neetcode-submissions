class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int[][] positionSpeed = new int[position.length][2];
        for(int i = 0; i < position.length; i++) {
            positionSpeed[i][0] = position[i];
            positionSpeed[i][1] = speed[i];
        }
        Arrays.sort(positionSpeed, (a, b) -> b[0] - a[0]);

        double[] time = new double[position.length];
        for(int i = 0; i < position.length; i++) {
            time[i] = (double)(target - positionSpeed[i][0]) / positionSpeed[i][1]; 
        }

        int fleets = 1;
        double prevTime = time[0];
        for(int i = 1; i < time.length; i++) {
            if(time[i] > prevTime) {
                fleets++;
                prevTime = time[i];
            }
        }

        return fleets;
    }
}
