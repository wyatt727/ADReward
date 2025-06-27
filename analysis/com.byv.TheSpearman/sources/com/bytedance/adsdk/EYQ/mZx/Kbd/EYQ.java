package com.bytedance.adsdk.EYQ.mZx.Kbd;

/* compiled from: CharType.java */
/* loaded from: classes2.dex */
public class EYQ {
    public static boolean EYQ(char c) {
        return c == ' ';
    }

    public static boolean Pm(char c) {
        return '+' == c || '-' == c || '*' == c || '/' == c || '%' == c || '=' == c || '>' == c || '<' == c || '!' == c || '&' == c || '|' == c || '?' == c || ':' == c;
    }

    public static boolean Td(char c) {
        return c >= '0' && c <= '9';
    }

    public static boolean mZx(char c) {
        if (c < 'A' || c > 'Z') {
            return c >= 'a' && c <= 'z';
        }
        return true;
    }
}
