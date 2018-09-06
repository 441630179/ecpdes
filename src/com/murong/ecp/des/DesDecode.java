package com.murong.ecp.des;

import com.yuangou.ecp.bp.common.util.YGBaseUtil;
import com.yuangou.ecp.bp.core.common.exception.YGException;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

/**
 * ECP解密
 */
public class DesDecode {
    public static void main(String[] args) {
        try {
            String decodeString = YGBaseUtil.des_decode("0a22ad1831832e0ba3d29be1c7d92449f17422dab6b21cca");
            System.out.println("解密后的字符串=" + decodeString);
        } catch (YGException e) {
            e.printStackTrace();
        }

    }
}
