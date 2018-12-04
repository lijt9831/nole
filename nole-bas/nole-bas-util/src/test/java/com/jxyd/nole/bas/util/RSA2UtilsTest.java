package com.jxyd.nole.bas.util;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Author: luy
 * @Description:
 * @Date: create in 2018/3/30 17:14
 */
public class RSA2UtilsTest {

    @Test
    public void test() {
        String[] keyPair = RSA2Utils.generateKeyPair();
        assertNotNull(keyPair);
        assertEquals(keyPair.length, 2);
        String plaintext = "www.xxxxxx.com";
        String privateKeyEncode = RSA2Utils.encodeByPrivateKey(keyPair[1], plaintext);
        assertNotNull(privateKeyEncode);
        String privateKeyDecode = RSA2Utils.decodeByPublicKey(keyPair[0], privateKeyEncode);
        assertNotNull(privateKeyDecode);
        assertEquals(privateKeyDecode, plaintext);

        String publicKeyEncode = RSA2Utils.encodeByPublicKey(keyPair[0], plaintext);
        assertNotNull(publicKeyEncode);
        String publicKeyDecode = RSA2Utils.decodeByPrivateKey(keyPair[1], publicKeyEncode);
        assertNotNull(publicKeyDecode);
        assertEquals(publicKeyDecode, plaintext);

    }

    @Test
    public void generateKeyPair() throws Exception {
    }

    @Test
    public void encodeByPrivateKey() throws Exception {
    }

    @Test
    public void encodeByPublicKey() throws Exception {
    }

    @Test
    public void decodeByPrivateKey() throws Exception {
    }

    @Test
    public void decodeByPublicKey() throws Exception {
    }

    @Test
    public void sign() throws Exception {
    }

    @Test
    public void check() throws Exception {
    }

}