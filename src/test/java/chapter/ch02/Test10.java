package chapter.ch02;

import java.util.ArrayList;
import java.util.Random;

/**
 * Test10
 * todo
 *
 * @author kujin
 * 创建时间：2020/10/25
 * @version 1
 */
public class Test10 {

    public void start() {
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i=0; i<100; ++i) {
            integers.add(i);
        }
        System.out.println(RandomNumbers.randomElement(integers).toString());
        int[] arrays = new int[100];
        for (int i=0; i<100; ++i) {
            arrays[i] = i;
        }
        System.out.println(RandomNumbers.randomElement(arrays).toString());
    }

    static class RandomNumbers {
        private static Random s_random;

        static {
            s_random = new Random();
            s_random.setSeed(System.currentTimeMillis());
        }

        public static Object randomElement(ArrayList<?> arrayList) {
            if (arrayList.size() == 0) {
                return 0;
            }
            return arrayList.get(Math.abs(s_random.nextInt())%(arrayList.size() - 1));
        }

//        public static Object randomElement(Integer[] arrayList) {
//            return randomElement(new ArrayList<>(Arrays.asList(arrayList)));
//        }

        public static Object randomElement(int[] arrayList) {
            ArrayList<Integer> intList = new ArrayList<>();
            for (Integer i : arrayList) {
                intList.add(i);
            }
            return randomElement(intList);
        }

    }

}
