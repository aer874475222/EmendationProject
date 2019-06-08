package com.global.luis.emendationproject.elements5;

public class ElementsFactory {

    public static IElements getBaseElements(int value) {
        switch (value) {
            case 0:
            case 土.value:
                return new 土();
            case 木.value:
                return new 木();
            case 水.value:
                return new 水();
            case 火.value:
                return new 火();
            case 金.value:
                return new 金();
        }
        return null;
    }
}
