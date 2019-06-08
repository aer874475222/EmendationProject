package com.global.luis.emendationproject.stem10;

public class Stem {
    private static int heTuValue;////河图数 甲3，乙8，丙7，丁2，戊5，己10，庚9，辛4，壬1，癸6.
    /**
     * 甲己子午九, 乙庚丑未八, 丙辛寅申七, 丁壬卯酉六, 戊癸辰戌五, 巳亥单四数
     */
    private static int blackValue;//太玄数

    public static final int sequenceValue=0;//顺序数
    public static final int reverseSequenceValue =0;//逆序数

    public static int getHeTuValue() {
        return heTuValue;
    }

    public static void setHeTuValue(int heTuValue) {
        Stem.heTuValue = heTuValue;
    }
    public static int getBlackValue() {
        return blackValue;
    }

}
