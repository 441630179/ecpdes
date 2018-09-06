package com.murong.ecp.des;

import com.yuangou.ecp.bp.common.util.YGBaseUtil;
import com.yuangou.ecp.bp.comp.pubatc.common.YGBaseUtils;
import com.yuangou.ecp.bp.core.common.exception.YGException;

/**
 * ECP解密
 */
public class DesEncode {
    public static void main(String[] args) {
        try {
            String decodeString = YGBaseUtil.des_encode("520103197112166039");
            System.out.printf("加密后的字符串=" + decodeString);
        } catch (YGException e) {
            e.printStackTrace();
        }
    }
}
