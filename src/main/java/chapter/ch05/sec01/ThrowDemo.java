package chapter.ch05.sec01;

/**
 * 异常处理
 *
 *
 */
public class ThrowDemo {
    public static int randInt(int low, int high) {
        //如果 low >high 则抛出异常
        if (low > high)
            throw new IllegalArgumentException(
                "low should be <= high but low is "
                + low + " and high is " + high);

        return low + (int)(Math.random() * (high - low + 1));
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Generating a random number...");
        int r = randInt(10, 20);
        System.out.println("r = " + r);
        System.out.println("And another...");
        r = randInt(10, 5);
        System.out.println("r = " + r);
    }
}
