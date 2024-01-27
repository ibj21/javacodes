public class searchMountain
{
    public int search(int[] arr,int target) {
        int peak=peakIndexInMountainArray(arr);
        int firstTry=binarySearch(arr,target,0,peak);
        if (firstTry!=-1){
            return firstTry;
        } 
        else 
        {
            return orderagnostic( arr, target, peak+1, arr.length-1)
        }
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
                end=mid;
            }
            else 
            {
                start=mid+1; //because mid+1 is greater than mid 
            }
            //start==end pointing to same element which is the answer
           
        }
         return start; // or end as both are equal
    } static int binarySearch(int[] arr, int target, int start, int end)
    {
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if (target< arr[mid])
            end=mid-1;
            else if (target>arr[mid])
            start=mid+1;
            else
            return mid;
        }
        return -1;
    }
    static int orderagnostic(int[] arr, int target, int start, int end)
    {

        //finding if descending or ascending
        boolean flag= arr[0] < arr[end];

        while(start<=end)
        {

            int mid=start+(end-start)/2;
            if(target==arr[mid])
                return mid;
            if (flag) {
                if (target < arr[mid])
                    end = mid - 1;
                else
                    start = mid + 1;
            }
            else{
                if (target > arr[mid])
                    end = mid - 1;
                else
                    start = mid + 1;
            }

        }
        return -1;
    }
}