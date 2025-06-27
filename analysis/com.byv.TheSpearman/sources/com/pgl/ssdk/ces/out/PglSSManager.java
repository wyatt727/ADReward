package com.pgl.ssdk.ces.out;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.pgl.ssdk.C1421w;
import com.pgl.ssdk.C1423y;
import com.pgl.ssdk.b0;
import com.pgl.ssdk.ces.a;
import com.pgl.ssdk.ces.b;
import com.pgl.ssdk.ces.f;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes4.dex */
public class PglSSManager {
    public static final int INIT_STATUS_FAIL_CONTEXT_NULL = 4;
    public static final int INIT_STATUS_FAIL_SO_LOADFAIL = 3;
    public static final int INIT_STATUS_FAIL_SO_MISSING = 2;
    public static final int INIT_STATUS_OK = 0;
    public static final int INIT_STATUS_UNINITIALIZE = 1;
    private static volatile PglSSManager c;

    /* renamed from: a, reason: collision with root package name */
    private final f f4313a;
    private volatile int b = 0;

    private PglSSManager(Context context, PglSSConfig pglSSConfig) {
        this.f4313a = f.a(context, pglSSConfig.getAppId(), pglSSConfig.getOVRegionType(), pglSSConfig.getCollectMode(), pglSSConfig.getAdSdkVersionCode());
    }

    public static int getInitStatus() {
        return f.d();
    }

    public static PglSSManager getInstance() {
        return c;
    }

    public static String getLoadError() {
        if (f.f() != null) {
            return f.f().b;
        }
        return null;
    }

    public static PglSSManager init(Context context, PglSSConfig pglSSConfig, String str, String str2, String str3, String str4) {
        if (context == null && pglSSConfig == null) {
            return null;
        }
        if (c == null) {
            synchronized (PglSSManager.class) {
                if (c == null) {
                    c = new PglSSManager(context, pglSSConfig);
                    if (f.d() == 0) {
                        c.f4313a.a(str, str3, str2, str4);
                    }
                }
            }
        }
        return c;
    }

    public void checkEventVirtual(MotionEvent motionEvent) {
        if (f.d() == 0) {
            C1421w.a(motionEvent, this.f4313a.f4309a);
        }
    }

    public Map getFeatureHash(String str, byte[] bArr) {
        if (f.d() != 0) {
            return null;
        }
        f fVar = this.f4313a;
        Objects.requireNonNull(fVar);
        HashMap map = new HashMap();
        Object[] objArr = new Object[2];
        if (str == null) {
            str = "";
        }
        objArr[0] = str;
        if (bArr == null) {
            bArr = new byte[0];
        }
        objArr[1] = bArr;
        String str2 = (String) a.meta(224, fVar.f4309a, objArr);
        if (!TextUtils.isEmpty(str2)) {
            map.put("X-Armors", str2);
        }
        return map;
    }

    public String getSofChara() {
        if (f.d() != 0) {
            return null;
        }
        Objects.requireNonNull(this.f4313a);
        return C1423y.c();
    }

    public String getToken() {
        if (f.d() != 0) {
            return null;
        }
        Objects.requireNonNull(this.f4313a);
        return b0.b();
    }

    public void reportNow(String str) {
        if (f.d() == 0) {
            if (this.b % 5 == 0) {
                this.f4313a.a(str);
            }
            this.b++;
        }
    }

    public void setCnReportUrl(String str, boolean z) {
        if (f.d() == 0) {
            f fVar = this.f4313a;
            Objects.requireNonNull(fVar);
            if (str != null && !str.equals(b.f4307a) && z) {
                fVar.a("updateUrl");
            }
            b.f4307a = str;
        }
    }

    public void setCnTokenUrl(String str, boolean z) {
        if (f.d() == 0) {
            Objects.requireNonNull(this.f4313a);
            if (str != null && !str.equals(b.b) && z) {
                b0.c();
            }
            b.b = str;
        }
    }

    public void setCustomInfo(HashMap map) {
        if (f.d() == 0) {
            this.f4313a.a(map);
        }
    }

    public void setDeviceId(String str) {
        if (f.d() == 0) {
            this.f4313a.b(str);
        }
    }

    public void setGaid(String str) {
        if (f.d() == 0) {
            this.f4313a.c(str);
        }
    }

    public void setOaid(String str) {
        if (f.d() == 0) {
            this.f4313a.d(str);
        }
    }
}
