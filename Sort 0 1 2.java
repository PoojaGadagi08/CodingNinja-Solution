import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static void sort012(int[] n)
    {
        //Write your code here
        int c0=0;
        int c1=0;
        int c2=0;

        for(int i=0;i<n.length;i++){
            if(n[i]==0)
            c0++;
            else if(n[i]==1)
            c1++;
            else
            c2++;
        }
        for(int i=0;i<n.length;i++){
            if(c0>0){
                n[i]=0;
                c0--;
            }
            else if(c1>0){
                n[i]=1;
                c1--;
            }
            else{
                n[i]=2;
                c2--;
            }
        }
    }
}


// Dutch National Flag algorithm or Three-way partitioning 
// The Dutch National Flag algorithm or three-way partitioning algorithm 
// allows sorting the array consisting of 0s, 1s, and 2s in a single traversal 
// only and in constant space. 

// Steps: ●Maintain three indices low = 0, mid = 0, and high = N-1, 
// where N is the number of elements in the array. 
// 1.The range from 0 to low denotes the range containing 0s.
//  2.The range from low to mid denotes the range containing 1s. 
//  3.The range from mid to high denotes the range containing any of 0s, 1s, or 2s.
//   4.The range from high to N-1 denotes the range containing 2s.


//    ●The mid pointer denotes the current element, traverses the array while mid<=high i.e 
//    we have exhausted the search space for the range which can contain any of 0s, 1s, or 2s.
//     1.If A[mid] == 0, swap A[mid] and A[low] and increment low and mid pointers by 1.
//      2.If A[mid] == 1, increment the mid pointer by 1. 
//      3.If A[mid] == 2, swap A[high] and A[mid] and increment mid by 1 and decrement high by 1. 
//      The resulting array will be a sorted array containing 0s, 1s, and 2s. 
     
//      3Pseudocode: /* array of size N from 0 to N-1 is considered */ function DNF(arr, N)
//       //Initializing low, mid and high pointers low = 0 mid = 0 high = N-1 while mid <= high /* Check if arr[mid] == 0, swap arr[low] and arr[mid], increment mid and low pointers
//        */ if arr[mid] == 0 swap(arr[mid],arr[low]) low += 1 mid += 1 //Check if arr[mid] == 1,
//         increment mid pointer else if arr[mid] == 1 mid += 1 /* Check if arr[mid] == 2,
//          swap arr[mid] and arr[high], decrement high pointer and increment low pointer */
//           else if arr[mid] == 2 swap(arr[mid],arr[high]) high -= 1 Time complexity: O(N), 
//           where N is the number of elementsin the array, as we sort the array in a single 
//           traversal only. Space complexity: O(1), as no extra space is required. 4
