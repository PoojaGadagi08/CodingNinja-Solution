import java.util.* ;
import java.io.*; 

public class Solution {
	
	public static long maxSubarraySum(int[] arr, int n) {
		// write your code here
		long sum=0;
		long maxSum=Integer.MIN_VALUE;

		for(int i=0;i<n;i++){
			sum+=arr[i];
			

			if(sum<0) sum=0;


			maxSum=Math.max(maxSum,sum);
		}
		return maxSum;
	}

}
