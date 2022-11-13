package com.bjpowernode;

import org.jasypt.encryption.StringEncryptor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BootJinjieApplicationTests {

    @Test
    void contextLoads() {
    }
    @Autowired
    private StringEncryptor stringEncryptor;
    @Test
    public void doEncryptor(){
        String str = "root";
        String encrypt2 = stringEncryptor.encrypt(str);
        System.out.println(encrypt2);
        System.out.println(stringEncryptor.decrypt(encrypt2));
    }

}
