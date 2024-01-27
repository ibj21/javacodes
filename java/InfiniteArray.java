public class InfiniteArray
{
    public static void main(String[] args)
    {
        int[] arr={1,2,3,4,15,16,20,32};
         int target=3;
        System.out.println(ans(arr,target));

    }
    static int ans(int[] arr, int target)
    {//first finding range
        int start=0;
        int end=1;
        //condition for target to lie in range, only if target element is greater than end
        while(target>arr[end])
        {
            int newStart=end+1;
            end=end+(end-start+1)*2;
            start=newStart;
        }
        return binarySearch(arr,target,start,end);

    }
    static int binarySearch(int[] arr, int target, int start, int end)
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
}