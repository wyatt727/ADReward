package com.my.target;

import android.content.Context;
import android.util.Base64;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class o5 {

    /* renamed from: a, reason: collision with root package name */
    public final Map<String, Object> f4087a;
    public final Map<Integer, Long> b;
    public final long c;
    public final int d;
    public boolean e;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f4088a;
        public boolean b = false;

        public a(int i) {
            this.f4088a = i;
        }

        public o5 a() {
            o5 o5Var = new o5(this.f4088a, "myTarget", 0);
            o5Var.a(this.b);
            return o5Var;
        }

        public o5 a(String str, float f) {
            o5 o5Var = new o5(this.f4088a, str, 5);
            o5Var.a(this.b);
            o5Var.f4087a.put(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, Float.valueOf(f));
            return o5Var;
        }

        public void a(boolean z) {
            this.b = z;
        }

        public o5 b() {
            o5 o5Var = new o5(this.f4088a, "myTarget", 4);
            o5Var.a(this.b);
            return o5Var;
        }
    }

    public o5(int i, String str, int i2) {
        HashMap map = new HashMap();
        this.f4087a = map;
        this.b = new HashMap();
        this.d = i2;
        this.c = System.currentTimeMillis();
        map.put("slot", Integer.valueOf(i));
        map.put("network", str);
    }

    public static a a(int i) {
        return new a(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Context context) {
        String strA = a();
        ba.a("MetricMessage: Send metrics message - \n " + strA);
        z1.a().a("https://ad.mail.ru/sdk/ms/", Base64.encodeToString(strA.getBytes(Charset.forName(C.UTF8_NAME)), 0), context);
    }

    public String a() {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, Object> entry : this.f4087a.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
            JSONArray jSONArray = new JSONArray();
            jSONObject.put("events", jSONArray);
            for (Map.Entry<Integer, Long> entry2 : this.b.entrySet()) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("type", entry2.getKey());
                jSONObject2.put("value", entry2.getValue());
                jSONArray.put(jSONObject2);
            }
        } catch (Throwable unused) {
        }
        return jSONObject.toString();
    }

    public void a(int i, long j) {
        Long l = this.b.get(Integer.valueOf(i));
        if (l != null) {
            j += l.longValue();
        }
        b(i, j);
    }

    public void a(boolean z) {
        this.e = z;
    }

    public void b() {
        b(this.d, System.currentTimeMillis() - this.c);
    }

    public void b(int i, long j) {
        this.b.put(Integer.valueOf(i), Long.valueOf(j));
    }

    public void b(final Context context) {
        if (!this.e) {
            ba.a("MetricMessage: Metrics sending disabled");
            return;
        }
        if (this.b.isEmpty()) {
            ba.a("MetricMessage: Metrics not send: empty");
            return;
        }
        j1 j1VarA = q1.b().a();
        if (j1VarA == null) {
            ba.a("MetricMessage: Metrics not send: basic info not collected");
            return;
        }
        this.f4087a.put("instanceId", j1VarA.f4012a);
        this.f4087a.put(com.json.i5.x, j1VarA.b);
        this.f4087a.put("osver", j1VarA.c);
        this.f4087a.put(MBridgeConstans.DYNAMIC_VIEW_WX_APP, j1VarA.d);
        this.f4087a.put("appver", j1VarA.e);
        this.f4087a.put("sdkver", j1VarA.f);
        c0.c(new Runnable() { // from class: com.my.target.o5$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(context);
            }
        });
    }
}
