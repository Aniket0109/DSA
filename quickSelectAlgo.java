import java.util.Scanner;

public class quickSelectAlgo {

    public static int quickSelect(int[] arr, int k, int lo, int hi){
        int pivot = arr[hi];
        int pi = partition(arr, pivot, lo, hi);

        if(k>pi)
            return quickSelect(arr, k,pi+1, hi);
        else if(k<pi)
            return quickSelect(arr, k, lo, pi - 1);
        else
            return arr[pi];

    }

    public static int partition(int[] arr, int pivot, int lo, int hi){
        System.out.println("Pivoting >>" + pivot);
        int i=lo, j=lo;
        while(i<=hi){
            if(arr[i]<=pivot){
                swap(arr, i , j);
                i++;
                j++;
            } else
                i++;
        }
        System.out.println("Pivot index >>"+(j-1));
        return j-1;
    }

    public static void swap(int[] arr, int i, int j){

        System.out.println("Swapping "+arr[i]+" and "+arr[j]);
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        int k = sc.nextInt();

        System.out.println(quickSelect(arr, k-1, 0, arr.length - 1));
    }
}
