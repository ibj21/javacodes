public class MountainArray
{
    //https://leetcode.com/problems/peak-index-in-a-mountain-array/
    public static void main(String[] args)
    {

    }
    public int peakIndexInMountainArray(int[] arr) 
    {
        int start=0;
        int end= arr.length-1;
        while(start<end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1])
            {
                //dec part of array
                //this may be answer but look at left
                //this is why end!= mid-1
                end=mid;
            }
            else 
            {
                //asc part of array
                start=mid+1; //because mid+1 is greater than mid 
            }
            //start==end pointing to same element which is the answer
           
        }
         return start; // or end as both are equal
    } 
   
}
