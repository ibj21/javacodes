public class CycleSort {
    //when given numbers from range 1 to N, use cycle sort
    static void cyclesort(int[] arr)
    {
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i] !=correct){
            int temp =arr[i];
            arr[i]=arr[correct];
            arr[correct]=temp;
            }
            else
            i++;
        }
    }
    public static void main(String[] args) {
        int[] arr= {3,5,2,1,4};
        cyclesort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
