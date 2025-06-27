package com.json;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class l9 {
    public static Map<String, Object> a(Object[][] objArr) {
        HashMap map = new HashMap();
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    map.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception unused) {
            }
        }
        return map;
    }
}
