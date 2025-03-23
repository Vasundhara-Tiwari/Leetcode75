package PrefixSum;

public class FindTheHighestAltitude {
    public int largestAltitude(int[] gain) {
        int[] prefixSum = new int[gain.length + 1];
        int max = 0;
        prefixSum[0] = 0;
        for(int i  = 0; i < gain.length; i++){
            prefixSum[i+1] = prefixSum[i] + gain[i];
            max = Math.max(prefixSum[i+1], max);
        }
        return max;
    }
}
