// Fint the elment in an infint array without using arr.length function and the time complexity must be logn.

import java.util.*;
public class InfintArray{
    public static void main(String[] args){
        int[] arr = {1,19,29,30,40,50,55};
        int target = 1;
        System.out.print(ans(arr,target));

    }

    static int ans(int[] arr, int target){
        int Start = 0;
        int end = 1;
        while(target > arr[end]){
            int temp = end + 1;
            end = end + (end - Start + 1) * 2;
            Start = temp; 
        }

        return BinarySearch(arr,target,Start,end);

    }
    public static int BinarySearch(int[] arr, int target,int Start,int end){
        while(Start <= end){
            int mid = Start + (end - Start)/2;

            if(target < arr[mid]){
                end = mid - 1;
            }
            else if(target > arr[mid]){
                Start = mid + 1;
            }else{
                // answer is founf
                return mid;
            }
        }
        return -1;
    }
}
