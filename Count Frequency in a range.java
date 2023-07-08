



import java.util.HashMap;

public class Solution {
    public static int[] countFrequency(int n, int a, int []nums){
        // Write your code here.
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int x:nums){
            m.put(x,m.getOrDefault(x, 0)+1);
        }
        for(int i=1;i<=n;i++){
            int val = m.getOrDefault(i ,0);
            nums[i-1]=val;
        }
        return nums;
    }
}
