import java.util.Scanner;

public class sortDatesAlgo {

    public static void sortDates(String[] arr) {
        countSort(arr, 1000000, 100, 32); //days
        countSort(arr, 10000, 100, 12); //months
        countSort(arr, 1, 10000, 2500); //year
    }

    public static void countSort(String[] arr,int div, int mod, int range) {

        int[] farr = new int[range];

        for(String val : arr){
            farr[Integer.parseInt(val, 10)/div%mod]++;
        }

        for(int i=1; i<farr.length; i++)
            farr[i] = farr[i] + farr[i-1];

        String[] ans = new String[arr.length];

        for(int i=arr.length-1; i>=0; i--){
            String val = arr[i];
            int k = Integer.parseInt(val, 10)/div%mod;
            int pos = farr[k];
            ans[--pos] = val;
            farr[k]--;
        }

        System.arraycopy(ans, 0, arr, 0, arr.length);
    }

    public static void print(String[] arr) {
        for (String s : arr) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            String str = scn.next();
            arr[i] = str;
        }
        sortDates(arr);
        print(arr);
    }
}
