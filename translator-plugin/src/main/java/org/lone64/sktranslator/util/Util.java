package org.lone64.sktranslator.util;

import java.util.Base64;

public class Util {

    public static String encode(String s) {
        Base64.Encoder encoder = Base64.getEncoder();
        byte[] encodedData   = encoder.encode(s.getBytes());
        return new String(encodedData);
    }

    public static String decode(String s) {
        Base64.Decoder decoder = Base64.getDecoder();
        byte[] decodedDataInBytes = decoder.decode(s.getBytes());
        return new String(decodedDataInBytes);
    }

}
