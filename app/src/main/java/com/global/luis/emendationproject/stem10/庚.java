package com.global.luis.emendationproject.stem10;

public class 庚 implements IStem {
    private static final int heTuValue=9;//河图数
    private static final int blackValue=8;//太玄数
    private static final String orientation="西";//方位
    public static final int sequenceValue=7;//顺序数
    public static final int reverseSequenceValue =  4;//逆序数

    @Override
    public int getHeTuValue() {
        return heTuValue;
    }

    @Override
    public int getBlackValue() {
        return blackValue;
    }

    @Override
    public int getSequenceValue() {
        return sequenceValue;
    }
}