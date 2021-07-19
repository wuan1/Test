import java.util.Arrays;

public class test1 {
    public static void insertSort(int arr[]){
        int bound = 1;
        for(;bound < arr.length;bound++){
            int i = bound - 1;
            for(;i >= 0;i--){
                if(arr[bound] < arr[i]){
                    arr[i + 1] = arr[i];
                }else{
                    break;
                }
                arr[i + 1] = arr[bound];
            }

        }


    }

    public static void main(String[] args) {
        int[] arr = {3,5,7,4};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
