package com.global.luis.emendationproject.utils;

import com.global.luis.emendationproject.elements5.ElementsFactory;
import com.global.luis.emendationproject.stem10.Stem;

public class Utils {

    public static BaseElements getFiveConvert(Stem aStem, Stem bStem) {
        if (Math.abs(aStem.sequenceValue - bStem.sequenceValue) == 5) {

            if (aStem.sequenceValue == 1 || aStem.sequenceValue == 10 ||
                    bStem.sequenceValue == 1 || bStem.sequenceValue == 10) {
                int wuxingValue = (aStem.reverseSequenceValue + bStem.reverseSequenceValue) % 5;
                return ElementsFactory.getBaseElements(wuxingValue);

            } else {
                int wuxingValue = (aStem.sequenceValue + bStem.sequenceValue) % 5;
                return ElementsFactory.getBaseElements(wuxingValue);
            }
        }
        return null;


    }
}
