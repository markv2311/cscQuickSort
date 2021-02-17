public class Quick {
    public static void main (String args[]){
        int[] arry = {7,2,1,5,3,10,4,6};
        int[] arry2 = {5,4,3,2,1}; 
    }
    public static void quickSort(int a[], int left, int right){
        if(left>=right)
            return;
        int pivot = a(left+right)/2;
        int index = partition(a, left, right, pivot);
        quicksort(a, left, index - 1);
        quicksort(a, index, right);
    }
    public static void partition(int[] a, int left, int right, int pivot){
        
    }
    public static void printArray(int[] a){
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + ", ");
        }
    }
}
