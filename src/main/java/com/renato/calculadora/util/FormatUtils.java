package com.renato.calculadora.util;
import java.util.Arrays;

public class FormatUtils {
    public static String formatar(Object obj) {
        if (obj instanceof int[]) return Arrays.toString((int[]) obj);
        else if (obj instanceof double[]) return Arrays.toString((double[]) obj);
        else if (obj instanceof int[][]) return Arrays.deepToString((int[][]) obj);
        else if (obj instanceof double[][]) return Arrays.deepToString((double[][]) obj);
        else return String.valueOf(obj);
    }
}
