package lab0;

public class PosSum {
    public static void windowPosSum(int[] a, int n) {
        for (int i = 0; i < a.length; i++){

            /** Skip not positive value */
            if (a[i] <= 0) {
                continue;
            }
            int sum = 0;
            for (int j = i; j <= Math.min(i+n, a.length -1); j++){
                sum = sum + a[j];
            }
            a[i] = sum;
        }
    }

    public static void main(String[] args) {
        int[] a = new int[]{1, -1, -1, 10, 5, -1};
        int n = 2;
        windowPosSum(a, n);

        /** Print out the new list*/
        System.out.println(java.util.Arrays.toString(a));
    }
}
