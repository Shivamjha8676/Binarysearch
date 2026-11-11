//Binary Search (leetCode 704)

// class binarysearch {
//     public int search(int[] nums, int target) {
//         int n = nums.length;
//         int lo =0, hi = n-1;
//         while (lo<=hi) {
//             int mid = (lo+hi)/2;
//             if (nums[mid]==target) return mid;
//             else if (nums[mid]<target) lo = mid+1;
//             else hi = mid-1;
//         }
//         return -1; 
//     }
// }


// First Occurrence in Sorted (GFG)


// class binarysearch {
//     public int firstSearch(int[] arr, int k) {
//         // Code Here
//         int start =0, end=arr.length-1, idx=-1;
//         while (start<=end) {
//             int mid = (start+end)/2;
//             if(arr[mid]>k) start = mid-1;
//             else if (arr[mid]<k) end=mid+1;
//             else {
//                 idx = mid;
//                 start = mid-1;
//             }
//         }
//         return idx;
//     }
// }


//Ques:-  first and last occurance (gfg)


// class Solution {
//     ArrayList<Integer> find(int arr[], int x) {
//         // code here

//         ArrayList<Integer> ans = new ArrayList<>();

        
//         int lo=0, hi =arr.length-1, idx=-1;
//         while(lo<=hi) {
//             int mid = (lo+hi)/2;
//             if (arr[mid]<x) lo = mid+1;
//             else if(arr[mid]>x) hi = mid-1;
//             else {
//                 idx = mid;
//                 hi = mid-1;
//             }
//         }
//         ans.add(idx);

       

//         lo=0;
//         hi = arr.length-1;
//         idx=-1;
//         while(lo<=hi) {
//             int mid = (lo+hi)/2;
//             if(arr[mid]<x) lo=mid+1;
//             else if (arr[mid]>x) hi=mid-1;
//             else {
//                 idx=mid;
//                 lo=mid+1;
//             }
//         }
//         ans.add(idx);
//         return ans;
// }
// }


//Ques:-  Binary Search in Descending order Array (GFG)

 




// Binary searach (GFG)


// class Solution {
//     public boolean binarySearch(int[] arr, int k) {
//         // code here
//         int start =0, end = arr.length-1;
//         while (start<=end) {
//             int mid = (start+end)/2;
//             if (arr[mid]>k) start = mid -1;
//             else if (arr[mid]<k) end = mid +1;
//             else return true;
//         }
//         return false;
//     }
// }


// Find peak in mountain array (Leetcode)


// int lo= 1, hi = arr.length-2;
// while (lo<=hi) {
//     int mid = (lo+hi)/2;
//     if (arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]) return mid;
//     else if (arr[mid]>arr [mid-1] && arr[mid]<arr[mid+1]) lo = mid +1;
//     else hi = mid-1;
// }
// return 368765;


//Ques:-  Floor in a sorted array (1:49)



// static int findFloor (int [] arr, int tar){
// int lo=0, hi=arr.lrngth-1, idx=-1;
// while(lo<=h) {
//     int mid = (lo+hi)/2;
//     if (arr[mid]>tar) hi=mid-1;
//     else {
//         idx=mid;
//         lo=mid+1;
//     }
// }
// return idx;
// }

 
//Ques:-  Maximum count of positive Integer an Negative Integer (Leetcode)


//Ques:-  Square Root (leetcode)


// class Solution {
//     public int mySqrt(int x) {
//         if(x==0) return 0;
//         int lo=1, hi=x;
//         while (lo<=hi) {
//             int mid = lo+(hi-lo)/2;
//             if(mid == x/mid) return mid;
//             else if (mid>x/mid) hi = mid-1;
//             else lo= mid+1;
//         }
//         return hi;

//     }
// }


//Ques:-  Single among Double in a sorted array


// class Solution {
//     int single(int[] arr) {
//         // code here
        
//         int n=arr.length;
//         if(n==1) return arr[0];
//         if (arr[0]!=arr[1]) return arr[0];
//         if (arr[n-1]!=arr[n-2]) return arr[n-1];
//         int lo=0, hi=n-1;
//         while (lo<=hi) {
//             int mid = lo + (hi-lo)/2;
//             if (arr[mid]!=arr[mid-1] && arr[mid]!=arr[mid+1])
//             return arr[mid];
//             int f=mid, s=mid;
//             if(arr[mid-1]==arr[mid]) f=mid-1;
//             else s=mid +1;
//             int leftCount = f-lo;
//             int rightCount = hi=s;
//             if(leftCount%2==0) lo = s+1;
//             else hi=f-1;
            
//         }
//         return 942;
//     }
// }


//Ques:-  Arranging Coins

// class solution {
//     publicint arrangeCoins(int n) {
//         long lo=0, hi=n, ans =0;
//         while (lo<=hi) {
//             long k=lo+(hi-lo)/2;
//             long m= k*(k+1)/2;
//             if (m==n) return (int) k;
//             else if (m>n) {
//                 hi=k-1;
//             }
//             else {
//                 ans = k;
//                 lo=k+1;
//             }
//         }
//         return (int)(ans);
//     }
// }
 


//Ques:- Maximum count of positive Integer

//Ques:-  Search an element in sorted and rotated array (GFG)

// class Solution {
//     int search(int[] arr, int tar) {
//         // code here
        
        
//         int lo=0, hi=arr.length-1;
//         while (lo<=hi) {
//             int mid = lo+(hi-lo)/2;
//             if(arr[mid]==tar) return mid;
//             else if(arr[lo]<=arr[mid]) { //lo to mid is sorted
//             if(arr[lo]<=tar && tar<arr[mid]) hi=mid-1;
//             else lo=mid+1;
//         }
//         else {  //mid to hi is sorted
//         if(arr[mid]<tar && tar<=arr[hi]) lo=mid+1;
//         else hi=mid-1;
//     }
// }
// return -1;
// }
// }


//Ques:- Search in a sorted matrix (GFG)


// class Solution {
//     public boolean searchMatrix(int[][] arr, int tar) {
//         // code here
        
//         int rows = arr.length, cols = arr[0].length;
//         int lo=0, hi = rows*cols-1;
//         while(lo<=hi) {
//             int mid=(lo+hi)/2;
//             int midRow=mid/cols, midCol=mid%cols;
//             if(arr[midRow][midCol]==tar) return true;
//             else if(arr[midRow][midCol]>tar) hi=mid-1;
//             else lo=mid+1;
//         }
        
//         return false;
//     }
// }


//Ques:- Kth missing positive Number in a sorted Array

// import java.util.*;
// public class binarysearch {
//     public int kthMissing(int[] arr, int k) {

//         int lo=0, hi=arr.length-1;
//         while (lo<=hi) {
//             int mid = (lo+hi)/2;
//             int correctNo = mid +1;
//             int missing =arr[mid]-correctNo;
//             if(missing>=k) hi = mid-1;
//             else lo=mid+1;
//         }
//     return hi+1+k;
//     }
// }