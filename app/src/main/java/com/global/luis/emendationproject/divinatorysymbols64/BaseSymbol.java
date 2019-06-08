package com.global.luis.emendationproject.divinatorysymbols64;

public class BaseSymbol<T> implements Isymbl {
    private static String value = "000";
    private T extendsData;

    public static String getValue() {
        return value;
    }


    /**
     * 判断是否为六冲卦
     *
     * @return
     */
    public static boolean judgeSixClash(String inValue) {
        String val1 = inValue.substring(0, 3);
        String val2 = inValue.substring(3, 6);
        if (val2.equals(val1)) {
            return true;
        }

        if ((val1.equals("111")||val2.equals("111")) &&   addZeroForNum(getBinaryReverseAddOne(val1), 3).equals(val2)) {
            return true;
        }
        return false;
    }


    /**
     * 输入一个整数，将它的二进制的0和1调换
     */
    public static String getBinaryReverseAddOne(String number) {
        int num = Integer.valueOf(number, 2);
        String temp = BaseSymbol.decimalToBinary(~num+1);
        return temp.substring(temp.length() - 3, temp.length());
    }


    // 1/8   1/8 3/8 3/8

    /**
     * 十进制转二进制 高位补0
     *
     * @param value
     * @return
     */
    public static String decimalToBinary(int value) {
        return addZeroForNum(Integer.toBinaryString(value), 6);
    }

    /**
     * 二进制转十进制
     *
     * @param binaryNumber
     * @return
     */
    private static int binaryToDecimal(String binaryNumber) {
        return Integer.valueOf(binaryNumber, 2);
    }

    /**
     * 高位补0
     */
    public static String addZeroForNum(String str, int strLength) {
        int strLen = str.length();
        if (strLen < strLength) {
            while (strLen < strLength) {
                StringBuffer sb = new StringBuffer();
                sb.append("0").append(str);// 左补0
                str = sb.toString();
                strLen = str.length();
            }
        }
        return str;
    }

}
