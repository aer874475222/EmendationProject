package com.global.luis.emendationproject.utils;

import com.global.luis.emendationproject.elements5.ElementsFactory;
import com.global.luis.emendationproject.elements5.IElements;
import com.global.luis.emendationproject.stem10.IStem;

public class Utils {
    /**
     * 天干五合
     *
     * @param aStem
     * @param bStem
     * @return
     */
    public static IElements getFiveConvert(IStem aStem, IStem bStem) {
        if (Math.abs(aStem.getSequenceValue() - bStem.getSequenceValue()) == 5) {

            if (aStem.getSequenceValue() == 1 || aStem.getSequenceValue() == 10 ||
                    bStem.getSequenceValue() == 1 || bStem.getSequenceValue() == 10) {
                int wuxingValue = (11 - aStem.getSequenceValue() + 11 - bStem.getSequenceValue()) % 5;
                return ElementsFactory.getBaseElements(wuxingValue);

            } else {
                int wuxingValue = (aStem.getSequenceValue() + bStem.getSequenceValue()) % 5;
                return ElementsFactory.getBaseElements(wuxingValue);
            }
        }
        return null;


    }
}
