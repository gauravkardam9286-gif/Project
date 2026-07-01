package sorting;
public class quickSort{
    public static int partation(int arr, int low, int high){
        
    }
    public static void quickSort(int arr[], int low, int high){
        if(low < high){
            int pivot = partition(arr, low , high);

            quickSort(arr, low, pivot-1);
            quickSort(arr, pivot+1, high);
        }

    }
    public static void main(String args[]){
        int arr[]  = {3,5,7,3,2,4,5,654,33,56,43,23,67,33,24,8776,45};
        int n = arr.length;
        quickSort(arr, 0, n-1);

    }
}