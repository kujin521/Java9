package chapter.ch04.sec04.impl;

import chapter.ch04.sec04.Cipher;

public class AESCipherFactory {
    public static Cipher provider() { return new AESCipher(); }
}
