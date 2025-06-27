package com.bytedance.adsdk.EYQ.mZx.Kbd.EYQ;

/* compiled from: ModUtil.java */
/* loaded from: classes2.dex */
public class IPb {
    private static Object EYQ(int i, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return Integer.valueOf(i % number.intValue());
        }
        if (number instanceof Long) {
            return Long.valueOf(i % number.longValue());
        }
        if (number instanceof Float) {
            return Float.valueOf(i % number.floatValue());
        }
        if (number instanceof Double) {
            return Double.valueOf(i % number.doubleValue());
        }
        throw new UnsupportedOperationException(number.getClass().getName() + "This type of addition operation is not supported");
    }

    private static Object EYQ(long j, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return Long.valueOf(j % number.intValue());
        }
        if (number instanceof Long) {
            return Long.valueOf(j % number.longValue());
        }
        if (number instanceof Float) {
            return Float.valueOf(j % number.floatValue());
        }
        if (number instanceof Double) {
            return Double.valueOf(j % number.doubleValue());
        }
        throw new UnsupportedOperationException(number.getClass().getName() + "This type of addition operation is not supported");
    }

    private static Object EYQ(float f, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return Float.valueOf(f % number.intValue());
        }
        if (number instanceof Long) {
            return Float.valueOf(f % number.longValue());
        }
        if (number instanceof Float) {
            return Float.valueOf(f % number.floatValue());
        }
        if (number instanceof Double) {
            return Double.valueOf(f % number.doubleValue());
        }
        throw new UnsupportedOperationException(number.getClass().getName() + "This type of addition operation is not supported");
    }

    private static Object EYQ(double d, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return Double.valueOf(d % number.intValue());
        }
        if (number instanceof Long) {
            return Double.valueOf(d % number.longValue());
        }
        if (number instanceof Float) {
            return Double.valueOf(d % number.floatValue());
        }
        if (number instanceof Double) {
            return Double.valueOf(d % number.doubleValue());
        }
        throw new UnsupportedOperationException(number.getClass().getName() + "This type of addition operation is not supported");
    }

    public static Object EYQ(Number number, Number number2) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return EYQ(number.intValue(), number2);
        }
        if (number instanceof Long) {
            return EYQ(number.longValue(), number2);
        }
        if (number instanceof Float) {
            return EYQ(number.floatValue(), number2);
        }
        if (number instanceof Double) {
            return EYQ(number.doubleValue(), number2);
        }
        throw new UnsupportedOperationException(number.getClass().getName() + "This type of addition operation is not supported");
    }
}
