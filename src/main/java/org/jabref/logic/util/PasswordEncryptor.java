package org.jabref.logic.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class PasswordEncryptor {

    public static String hash(String password) {
        String md5 = null;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            byte[] hashBytes = messageDigest.digest(password.getBytes());
            StringBuilder stringBuilder = new StringBuilder();
            for (byte b : hashBytes) {
                stringBuilder.append(String.format("%02x", b));
            }
            md5 = stringBuilder.toString();
        } catch (NoSuchAlgorithmException e) {
            // Handle the exception here
        }
        return md5;
    }
}
