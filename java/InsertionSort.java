public class InsertionSort{
    public static void insertion(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j >0; j--) {
                if(arr[j]<arr[j-1]){
                    //swap
                 int temp= arr[j-1];
                 arr[j-1]=arr[j];
                 arr[j]=temp;
                }
                else
                break;
            }
        }
    }
}