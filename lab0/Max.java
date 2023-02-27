package lab0;

public class Max {
    public static int max(int[] m) {
        int maxValue = m[0];
        for ( int i = 1; i < m.length; i++) {
            if (m[i] > maxValue) {
                maxValue = m[i];
            }
        }
        return maxValue;
    }

    public static void main(String[] args) {
        int[] numbers = {5,8,9,0,89,976,200,67};
        int maxValue = max(numbers);
        System.out.println(maxValue);
    }
}
