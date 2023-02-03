public class CountStep {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));
        System.out.println(Steps(8));
    }

    static int numberOfSteps(int num) {
        return helper(num, 0);
    }

    static int helper(int num, int step) {
        if (num == 0) {
            return step;
        }
        if (num % 2 == 0) {
            step += 1;
            num = num / 2;

        } else {
            step += 1;
            num = num - 1;
        }
        return helper(num, step);
    }

    static int Steps(int num) {
        int step = 0;
        while (num != 0) {
            if (num % 2 == 0) {
                step += 1;
                num = num / 2;

            } else {
                step += 1;
                num = num - 1;
            }
        }
        return step;
    }
}
