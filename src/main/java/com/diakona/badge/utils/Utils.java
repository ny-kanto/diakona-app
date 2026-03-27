package com.diakona.badge.utils;

import java.lang.reflect.Method;

import java.util.Locale;

public class Utils {
    public static String capitalizeFirstLetter(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        return Character.toUpperCase(str.charAt(0)) + str.substring(1);
    }

    public static String getExtension(String str) {
        String extension = "";
        int lastDotIndex = str.lastIndexOf('.');
        if (lastDotIndex > 0) {
            extension = str.substring(lastDotIndex + 1);
        }
        return extension;
    }

    public static Method getGetterMethod(Class<?> clazz, String fieldName) throws NoSuchMethodException {
        String getterMethodName = "get" + Utils.capitalizeFirstLetter(fieldName);
        return clazz.getMethod(getterMethodName);
    }

    public static String getNombreFormat(double nombre) {
        if (nombre == (int) nombre) {
            return String.format(Locale.FRANCE, "%,d", (int) nombre);
        } else {
            return String.format(Locale.FRANCE, "%,.2f", nombre);
        }
    }

    public static boolean isDecimal(String text) {
        String regex = "\\d*\\.?\\d+";

        return text.matches(regex);
    }
}
