package com.bytedance.sdk.component.EYQ;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.lang.reflect.Type;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DataConverterActual.java */
/* loaded from: classes2.dex */
class QQ {
    private tsL EYQ;

    static QQ EYQ(tsL tsl) {
        return new QQ(tsl);
    }

    private QQ(tsL tsl) {
        this.EYQ = tsl;
    }

    <T> T EYQ(String str, Type type) throws JSONException {
        EYQ(str);
        if (type.equals(JSONObject.class) || ((type instanceof Class) && JSONObject.class.isAssignableFrom((Class) type))) {
            return (T) new JSONObject(str);
        }
        return (T) this.EYQ.EYQ(str, type);
    }

    <T> String EYQ(T t) {
        String string;
        if (t == null) {
            return JsonUtils.EMPTY_JSON;
        }
        if ((t instanceof JSONObject) || (t instanceof JSONArray)) {
            string = t.toString();
        } else {
            string = this.EYQ.EYQ(t);
        }
        EYQ(string);
        return string;
    }

    private static void EYQ(String str) {
        if (str.startsWith("{") && str.endsWith("}")) {
            return;
        }
        HX.EYQ(new IllegalArgumentException("Param is not allowed to be List or JSONArray, rawString:\n ".concat(String.valueOf(str))));
    }
}
