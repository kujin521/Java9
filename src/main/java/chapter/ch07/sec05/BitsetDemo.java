package chapter.ch07.sec05;

import java.util.BitSet;

/**
 * 此类实现按需增长的位向量。
 * 比特组中的每个组件具有一个boolean值。
 * 一个的比特BitSet是由非负整数索引。
 * 个别索引的位进行测试，设置或清除。
 * 一个BitSet可以用于修改另一个内容BitSet通过逻辑与，逻辑或和逻辑异或操作。
 * 默认情况下，集合中的所有位的初始值都是false 。
 * 每一位集都有一个电流的大小，这是目前在该位set使用空间的位数。
 * 请注意，这个大小与位set的实现，因此它可能与实现改变。
 * 位组的长度涉及一种位组逻辑长度并且独立地执行所定义。
 */
public class BitsetDemo {
    public static void main(String[] args) {
        // This program demonstrates the Sieve of Erathostenes for finding primes
        int n = 100000;
        BitSet primes = new BitSet(n + 1);
        for (int i = 2; i <= n; i++)
           primes.set(i);
        for (int i = 2; i * i <= n; i++) {
           if (primes.get(i)) {
              for (int k = 2 * i; k <= n; k += i)
                 primes.clear(k);
           }
        }
        System.out.println(primes);
    }
}
