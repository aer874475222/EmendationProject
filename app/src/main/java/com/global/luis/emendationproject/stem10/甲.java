package com.global.luis.emendationproject.stem10;

public class 甲 implements IStem {
    private static final int heTuValue=3;//河图数
    private static final int blackValue=9;//太玄数
    public static final int sequenceValue=1;//顺序数
    public static final int reverseSequenceValue =  10;//逆序数



    private static final String orientation="东";//方位


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
