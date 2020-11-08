package chapter.ch04.sec04;

/**
 * 定义密码接口
 */
public interface Cipher {
    /**
     * 加密
     * @param source
     * @param key
     * @return
     */
    byte[] encrypt(byte[] source, byte[] key);

    /**
     * 解密
     * @param source
     * @param key
     * @return
     */
    byte[] decrypt(byte[] source, byte[] key);
    int strength();
}