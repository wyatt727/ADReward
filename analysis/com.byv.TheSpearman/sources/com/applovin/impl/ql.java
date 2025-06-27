package com.applovin.impl;

import androidx.arch.core.util.Function;
import androidx.core.util.Consumer;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ql {

    /* renamed from: a, reason: collision with root package name */
    private final JSONObject f840a;
    private final Object b = new Object();

    public ql(JSONObject jSONObject) {
        this.f840a = jSONObject;
    }

    public void c(String str) {
        synchronized (this.b) {
            this.f840a.remove(str);
        }
    }

    public String toString() {
        String string;
        synchronized (this.b) {
            string = this.f840a.toString();
        }
        return string;
    }

    public Object a(Function function) {
        Object objApply;
        synchronized (this.b) {
            objApply = function.apply(this);
        }
        return objApply;
    }

    public void a(Consumer consumer) {
        synchronized (this.b) {
            consumer.accept(this);
        }
    }

    public List b(String str, List list) {
        List<String> stringList;
        synchronized (this.b) {
            stringList = JsonUtils.getStringList(this.f840a, str, list);
        }
        return stringList;
    }

    public Boolean a(String str, Boolean bool) {
        Boolean bool2;
        synchronized (this.b) {
            bool2 = JsonUtils.getBoolean(this.f840a, str, bool);
        }
        return bool2;
    }

    public Object b(String str) {
        Object objOpt;
        synchronized (this.b) {
            objOpt = this.f840a.opt(str);
        }
        return objOpt;
    }

    public double a(String str, double d) {
        double d2;
        synchronized (this.b) {
            d2 = JsonUtils.getDouble(this.f840a, str, d);
        }
        return d2;
    }

    public float a(String str, float f) {
        float f2;
        synchronized (this.b) {
            f2 = JsonUtils.getFloat(this.f840a, str, f);
        }
        return f2;
    }

    public void b(String str, int i) {
        synchronized (this.b) {
            JsonUtils.putInt(this.f840a, str, i);
        }
    }

    public int a(String str, int i) {
        int i2;
        synchronized (this.b) {
            i2 = JsonUtils.getInt(this.f840a, str, i);
        }
        return i2;
    }

    public void b(String str, long j) {
        synchronized (this.b) {
            JsonUtils.putLong(this.f840a, str, j);
        }
    }

    public List a(String str, List list) {
        List<Integer> integerList;
        synchronized (this.b) {
            integerList = JsonUtils.getIntegerList(this.f840a, str, list);
        }
        return integerList;
    }

    public JSONArray a(String str, JSONArray jSONArray) {
        JSONArray jSONArray2;
        synchronized (this.b) {
            jSONArray2 = JsonUtils.getJSONArray(this.f840a, str, jSONArray);
        }
        return jSONArray2;
    }

    public void b(String str, String str2) {
        synchronized (this.b) {
            JsonUtils.putString(this.f840a, str, str2);
        }
    }

    public JSONObject a(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        synchronized (this.b) {
            jSONObject2 = JsonUtils.getJSONObject(this.f840a, str, jSONObject);
        }
        return jSONObject2;
    }

    public long a(String str, long j) {
        long j2;
        synchronized (this.b) {
            j2 = JsonUtils.getLong(this.f840a, str, j);
        }
        return j2;
    }

    public String a(String str, String str2) {
        String string;
        synchronized (this.b) {
            string = JsonUtils.getString(this.f840a, str, str2);
        }
        return string;
    }

    public boolean a(String str) {
        boolean zHas;
        synchronized (this.b) {
            zHas = this.f840a.has(str);
        }
        return zHas;
    }

    public void a(String str, boolean z) {
        synchronized (this.b) {
            JsonUtils.putBoolean(this.f840a, str, z);
        }
    }

    public void a(String str, Object obj) {
        synchronized (this.b) {
            JsonUtils.putObject(this.f840a, str, obj);
        }
    }

    public JSONObject a() {
        JSONObject jSONObjectDeepCopy;
        synchronized (this.b) {
            jSONObjectDeepCopy = JsonUtils.deepCopy(this.f840a);
        }
        return jSONObjectDeepCopy;
    }
}
