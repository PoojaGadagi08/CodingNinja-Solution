import java.util.*;
class Solution {
  // Function to Reverse the array
  public static void Reverse(int[] arr, int start, int end) {
    while (start <= end) {
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }
  }
  // Function to Rotate k elements to left
  public static void Rotateeletoleft(int[] arr, int n, int k) {
    // Reverse first k elements
    Reverse(arr, 0, k - 1);
    // Reverse last n-k elements
    Reverse(arr, k , n - 1);
    // Reverse whole array
    Reverse(arr, 0, n - 1);
  }
  public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int [n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    //int[] arr = {1,2,3,4,5,6,7};
    //int n = 7;
    int k = sc.nextInt();

    Rotateeletoleft(arr, n, k);

    //System.out.print("After Rotating the k elements to left ");

    for (int i = 0; i < n; i++)
      System.out.print(arr[i] + " ");
    System.out.println();
  }
}
