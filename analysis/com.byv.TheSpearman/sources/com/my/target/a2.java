package com.my.target;

import android.content.Context;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class a2<T> {
    public final b2<T> a(String str, String str2, Context context) {
        return b(str, str2, null, context);
    }

    public abstract b2<T> a(String str, String str2, Map<String, String> map, Context context);

    public final b2<T> b(String str, String str2, Map<String, String> map, Context context) {
        return a(str, str2, map, context);
    }
}
