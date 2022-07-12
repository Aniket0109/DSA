import java.util.Scanner;

public class radixSortAlgo {

    public static void radixSort(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int val : arr)
            if(val>max)
                max = val;

        int exp = 1;
        while(exp<max){
            countSort(arr, exp);
            exp = exp*10;
        }
    }

    public static void countSort(int[] arr, int exp) {
        int[] farr = new int[10];

        for(int val : arr){
            farr[val/exp%10]++;
        }

        for(int i=1; i<farr.length; i++)
            farr[i] = farr[i] + farr[i-1];

        int[] ans = new int[arr.length];

        for(int i=arr.length-1; i>=0; i--){
            int val = arr[i];
            int pos = farr[val/exp%10];
            ans[--pos] = val;
            farr[val/exp%10]--;
        }

        System.arraycopy(ans, 0, arr, 0, arr.length);
    }

    public static void print(int[] arr) {
        for (int j : arr) {
            System.out.println(j);
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        radixSort(arr);
        print(arr);
    }
}
