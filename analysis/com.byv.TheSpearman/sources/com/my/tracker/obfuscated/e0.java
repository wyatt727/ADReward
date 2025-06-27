package com.my.tracker.obfuscated;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;

/* loaded from: classes4.dex */
public final class e0 {
    public static void a(int i, Map<String, String> map, ByteArrayOutputStream byteArrayOutputStream, OutputStream outputStream) {
        if (map == null || map.isEmpty()) {
            return;
        }
        Iterator it = new TreeSet(map.keySet()).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            byteArrayOutputStream.reset();
            for (int i2 : t0.x) {
                if (i2 == 1) {
                    u0.a(1, str, byteArrayOutputStream);
                } else if (i2 == 2) {
                    u0.a(2, map.get(str), byteArrayOutputStream);
                }
            }
            if (byteArrayOutputStream.size() > 0) {
                u0.a(i, byteArrayOutputStream, outputStream);
            }
        }
    }
}
