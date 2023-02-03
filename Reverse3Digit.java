public class Reverse3Digit {
    public static void main(String[] args) {
        System.out.println(Reverse(2147483642));
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
    }
    static int Reverse(int x) {
        int Rev = 0;

        while (x != 0) {
            int remainder = x % 10;
            int newRev = Rev * 10 + remainder;
            if ((newRev - remainder) / 10 != Rev) {
                return 0;
            }
            Rev = newRev;
            x = x / 10;
        }
            return Rev;
    }
}
