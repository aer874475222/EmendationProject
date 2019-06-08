package com.global.luis.emendationproject.stem10;

public class 丙 implements IStem {

    private static final int heTuValue=7;//河图数
    private static final int blackValue=7;//太玄数
    public static final int sequenceValue=3;//顺序数
    public static final int reverseSequenceValue =  8;//逆序数

    private static final String orientation="南";//方位

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
