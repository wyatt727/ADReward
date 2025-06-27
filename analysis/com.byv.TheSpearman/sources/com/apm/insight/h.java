package com.apm.insight;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.apm.insight.l.l;
import com.apm.insight.l.v;
import com.json.i5;
import com.json.t2;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class h {
    protected static MonitorCrash b;
    protected static volatile ConcurrentHashMap<String, h> c = new ConcurrentHashMap<>();

    /* renamed from: a, reason: collision with root package name */
    protected MonitorCrash f54a;

    private h(MonitorCrash monitorCrash) {
        this.f54a = monitorCrash;
        com.apm.insight.entity.b.a(this);
        com.apm.insight.j.b.d();
        com.apm.insight.k.k.e();
    }

    static h a(String str) {
        return c.get(str);
    }

    public static Object a() {
        return b;
    }

    static void a(Context context, final MonitorCrash monitorCrash) {
        b = monitorCrash;
        h hVar = new h(monitorCrash);
        final com.apm.insight.runtime.d dVarA = i.a();
        Npth.init(context, new ICommonParams() { // from class: com.apm.insight.h.1
            @Override // com.apm.insight.ICommonParams
            public Map<String, Object> getCommonParams() {
                return l.b(h.this.e());
            }

            @Override // com.apm.insight.ICommonParams
            public String getDeviceId() {
                return TextUtils.isEmpty(monitorCrash.mConfig.mDeviceId) ? dVarA.d() : monitorCrash.mConfig.mDeviceId;
            }

            @Override // com.apm.insight.ICommonParams
            public List<String> getPatchInfo() {
                return null;
            }

            @Override // com.apm.insight.ICommonParams
            public Map<String, Integer> getPluginInfo() {
                return null;
            }

            @Override // com.apm.insight.ICommonParams
            public String getSessionId() {
                return null;
            }

            @Override // com.apm.insight.ICommonParams
            public long getUserId() {
                return 0L;
            }
        });
    }

    static void a(MonitorCrash monitorCrash) {
        h hVar = new h(monitorCrash);
        if (monitorCrash == null || monitorCrash.mConfig == null) {
            return;
        }
        c.put(monitorCrash.mConfig.mAid, hVar);
    }

    private JSONObject b(CrashType crashType) {
        Map<? extends String, ? extends String> userData;
        if (this.f54a.mCustomData == null || (userData = this.f54a.mCustomData.getUserData(crashType)) == null) {
            return null;
        }
        return new JSONObject(userData);
    }

    private JSONObject c(CrashType crashType) {
        return new JSONObject(this.f54a.mTagMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject e() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.f54a.mConfig.mPackageName == null) {
                Context contextG = i.g();
                PackageInfo packageInfo = contextG.getPackageManager().getPackageInfo(contextG.getPackageName(), 128);
                if (packageInfo != null) {
                    if (this.f54a.mConfig.mVersionInt == -1) {
                        this.f54a.mConfig.mVersionInt = packageInfo.versionCode;
                    }
                    if (this.f54a.mConfig.mVersionStr == null) {
                        this.f54a.mConfig.mVersionStr = packageInfo.versionName;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        if (TextUtils.isEmpty(this.f54a.mConfig.mDeviceId) || "0".equals(this.f54a.mConfig.mDeviceId)) {
            this.f54a.mConfig.mDeviceId = i.c().a();
        }
        try {
            jSONObject.put("aid", String.valueOf(this.f54a.mConfig.mAid));
            jSONObject.put("update_version_code", this.f54a.mConfig.mVersionInt);
            jSONObject.put("version_code", this.f54a.mConfig.mVersionInt);
            jSONObject.put("app_version", this.f54a.mConfig.mVersionStr);
            jSONObject.put("channel", this.f54a.mConfig.mChannel);
            jSONObject.put("package", l.a(this.f54a.mConfig.mPackageName));
            jSONObject.put("device_id", this.f54a.mConfig.mDeviceId);
            jSONObject.put("user_id", this.f54a.mConfig.mUID);
            jSONObject.put("ssid", this.f54a.mConfig.mSSID);
            jSONObject.put(i5.x, t2.e);
            jSONObject.put("so_list", l.a(this.f54a.mConfig.mSoList));
            jSONObject.put("thread_list", l.a(this.f54a.mConfig.mThreadList));
            jSONObject.put("single_upload", d() ? 1 : 0);
        } catch (JSONException unused2) {
        }
        return jSONObject;
    }

    public JSONArray a(StackTraceElement[] stackTraceElementArr, Throwable th) {
        return a(stackTraceElementArr, th, null);
    }

    public JSONArray a(StackTraceElement[] stackTraceElementArr, Throwable th, String str) {
        if (this.f54a.mConfig.mPackageName == null) {
            return new JSONArray().put(new v.a(0, stackTraceElementArr.length).a());
        }
        if (th == null || stackTraceElementArr == null) {
            return null;
        }
        JSONArray jSONArrayA = v.a(stackTraceElementArr, this.f54a.mConfig.mPackageName);
        if (str != null && this.f54a.mConfig.mThreadList != null && l.a(jSONArrayA)) {
            for (String str2 : this.f54a.mConfig.mThreadList) {
                if (TextUtils.equals(str2, str)) {
                    jSONArrayA.put(new v.a(0, stackTraceElementArr.length).a());
                }
            }
        }
        return jSONArrayA;
    }

    public JSONArray a(String[] strArr) {
        return this.f54a.config().mPackageName == null ? new JSONArray().put(new v.a(0, strArr.length).a()) : v.a(strArr, this.f54a.mConfig.mPackageName);
    }

    public JSONObject a(CrashType crashType) {
        return a(crashType, (JSONArray) null);
    }

    public JSONObject a(CrashType crashType, JSONArray jSONArray) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("header", e());
            if (crashType != null) {
                jSONObject.put("custom", b(crashType));
                jSONObject.put("filters", c(crashType));
            }
            jSONObject.put("line_num", jSONArray);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    public boolean a(Object obj) {
        return this.f54a == obj;
    }

    public boolean a(String str, String str2) {
        if (this.f54a.config().mPackageName == null) {
            return true;
        }
        return com.apm.insight.entity.b.a(str, l.a(this.f54a.mConfig.mSoList), str2, l.a(this.f54a.mConfig.mThreadList));
    }

    public String b() {
        return this.f54a.mConfig.mAid;
    }

    public JSONObject c() {
        return e();
    }

    public boolean d() {
        return false;
    }
}
