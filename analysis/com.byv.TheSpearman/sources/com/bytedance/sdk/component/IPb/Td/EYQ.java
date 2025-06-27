package com.bytedance.sdk.component.IPb.Td;

import android.content.Context;
import android.content.SharedPreferences;
import android.location.Address;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.sdk.component.IPb.EYQ;
import com.bytedance.sdk.component.utils.Uc;
import com.bytedance.sdk.component.utils.wBa;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AppConfig.java */
/* loaded from: classes2.dex */
public class EYQ implements wBa.EYQ {
    private static ThreadPoolExecutor HX;
    private static boolean QQ;
    private final Context MxO;
    private final boolean mZx;
    private int nWX;
    private com.bytedance.sdk.component.IPb.EYQ pi;
    private volatile boolean Td = false;
    private boolean Pm = true;
    private boolean Kbd = false;
    private long IPb = 0;
    private long VwS = 0;
    private AtomicBoolean tp = new AtomicBoolean(false);
    private volatile boolean tsL = false;
    final wBa EYQ = com.bytedance.sdk.component.VwS.EYQ.EYQ.EYQ().EYQ(this, "tt-net");

    public EYQ(Context context, int i) {
        this.MxO = context;
        this.mZx = Uc.EYQ(context);
        this.nWX = i;
    }

    public void EYQ() {
        EYQ(false);
    }

    public synchronized void EYQ(boolean z) {
        if (this.mZx) {
            Pm(z);
            return;
        }
        if (this.IPb <= 0) {
            try {
                VwS().execute(new Runnable() { // from class: com.bytedance.sdk.component.IPb.Td.EYQ.1
                    @Override // java.lang.Runnable
                    public void run() {
                        EYQ.this.mZx();
                    }
                });
            } catch (Throwable unused) {
            }
        }
    }

    public static void mZx(boolean z) {
        QQ = z;
    }

    synchronized void mZx() {
        if (System.currentTimeMillis() - this.IPb > 3600000) {
            this.IPb = System.currentTimeMillis();
            try {
                if (VwS.EYQ().EYQ(this.nWX).QQ() != null) {
                    VwS.EYQ().EYQ(this.nWX).QQ().mZx();
                }
            } catch (Exception unused) {
            }
        }
    }

    private void Pm(boolean z) {
        if (this.Kbd) {
            return;
        }
        if (this.Pm) {
            this.Pm = false;
            this.IPb = 0L;
            this.VwS = 0L;
        }
        long j = z ? 360000L : 43200000L;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.IPb > j) {
            if (jCurrentTimeMillis - this.VwS > 120000 || !this.tsL) {
                Td();
            }
        }
    }

    public boolean Td() {
        this.tp.get();
        VwS().execute(new Runnable() { // from class: com.bytedance.sdk.component.IPb.Td.EYQ.2
            @Override // java.lang.Runnable
            public void run() {
                boolean zEYQ = com.bytedance.sdk.component.IPb.Pm.Kbd.EYQ(EYQ.this.MxO);
                if (zEYQ) {
                    EYQ.this.VwS = System.currentTimeMillis();
                    if (EYQ.this.tp.compareAndSet(false, true)) {
                        EYQ.this.Td(zEYQ);
                    }
                }
            }
        });
        return true;
    }

    @Override // com.bytedance.sdk.component.utils.wBa.EYQ
    public void EYQ(Message message) {
        int i = message.what;
        if (i == 101) {
            this.Kbd = false;
            this.IPb = System.currentTimeMillis();
            if (this.Pm) {
                EYQ();
            }
            this.tp.set(false);
            return;
        }
        if (i != 102) {
            return;
        }
        this.Kbd = false;
        if (this.Pm) {
            EYQ();
        }
        this.tp.set(false);
    }

    public synchronized void Pm() {
        if (this.tsL) {
            return;
        }
        this.tsL = true;
        long j = this.MxO.getSharedPreferences("ss_app_config", 0).getLong("last_refresh_time", 0L);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (j > jCurrentTimeMillis) {
            j = jCurrentTimeMillis;
        }
        this.IPb = j;
        try {
            if (VwS.EYQ().EYQ(this.nWX).QQ() != null) {
                VwS.EYQ().EYQ(this.nWX).QQ().EYQ();
            }
        } catch (Exception unused) {
        }
    }

    public void Kbd() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        try {
            if (this.mZx) {
                Pm();
            } else {
                mZx();
            }
        } catch (Throwable unused) {
        }
    }

    void Td(boolean z) {
        Pm();
        this.Kbd = true;
        if (!z) {
            this.EYQ.sendEmptyMessage(102);
            return;
        }
        try {
            QQ();
        } catch (Exception unused) {
            this.tp.set(false);
        }
    }

    public String[] IPb() {
        String[] strArrIPb = VwS.EYQ().EYQ(this.nWX).Pm() != null ? VwS.EYQ().EYQ(this.nWX).Pm().IPb() : null;
        return (strArrIPb == null || strArrIPb.length <= 0) ? new String[0] : strArrIPb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean EYQ(Object obj) throws Exception {
        JSONObject jSONObject;
        if (obj instanceof String) {
            String str = (String) obj;
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            jSONObject = new JSONObject(str);
            if (!"success".equals(jSONObject.getString("message"))) {
                return false;
            }
        } else {
            jSONObject = obj instanceof JSONObject ? (JSONObject) obj : null;
        }
        if (jSONObject == null) {
            return false;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        synchronized (this) {
            SharedPreferences.Editor editorEdit = this.MxO.getSharedPreferences("ss_app_config", 0).edit();
            editorEdit.putLong("last_refresh_time", System.currentTimeMillis());
            editorEdit.apply();
        }
        if (VwS.EYQ().EYQ(this.nWX).QQ() == null) {
            return true;
        }
        VwS.EYQ().EYQ(this.nWX).QQ().EYQ(jSONObject2);
        return true;
    }

    private boolean QQ() {
        String[] strArrIPb = IPb();
        if (strArrIPb != null && strArrIPb.length != 0) {
            EYQ(0);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void EYQ(final int i) {
        String[] strArrIPb = IPb();
        if (strArrIPb == null || strArrIPb.length <= i) {
            mZx(102);
            return;
        }
        String str = strArrIPb[i];
        if (TextUtils.isEmpty(str)) {
            mZx(102);
            return;
        }
        try {
            String strEYQ = EYQ(str);
            if (TextUtils.isEmpty(strEYQ)) {
                mZx(102);
                return;
            }
            com.bytedance.sdk.component.IPb.mZx.mZx mzxTd = HX().Td();
            mzxTd.EYQ(strEYQ);
            EYQ(mzxTd);
            mzxTd.EYQ(new com.bytedance.sdk.component.IPb.EYQ.EYQ() { // from class: com.bytedance.sdk.component.IPb.Td.EYQ.3
                @Override // com.bytedance.sdk.component.IPb.EYQ.EYQ
                public void EYQ(com.bytedance.sdk.component.IPb.mZx.Td td, com.bytedance.sdk.component.IPb.mZx mzx) throws JSONException {
                    JSONObject jSONObject;
                    if (mzx == null || !mzx.IPb()) {
                        EYQ.this.EYQ(i + 1);
                        return;
                    }
                    String string = null;
                    try {
                        jSONObject = new JSONObject(mzx.Pm());
                    } catch (Exception unused) {
                        jSONObject = null;
                    }
                    if (jSONObject == null) {
                        EYQ.this.EYQ(i + 1);
                        return;
                    }
                    try {
                        string = jSONObject.getString("message");
                    } catch (Exception unused2) {
                    }
                    if (!"success".equals(string)) {
                        EYQ.this.EYQ(i + 1);
                        return;
                    }
                    try {
                        if (EYQ.this.EYQ(jSONObject)) {
                            EYQ.this.mZx(101);
                        } else {
                            EYQ.this.EYQ(i + 1);
                        }
                    } catch (Exception unused3) {
                    }
                }

                @Override // com.bytedance.sdk.component.IPb.EYQ.EYQ
                public void EYQ(com.bytedance.sdk.component.IPb.mZx.Td td, IOException iOException) {
                    EYQ.this.EYQ(i + 1);
                }
            });
        } catch (Throwable th) {
            th.toString();
        }
    }

    private com.bytedance.sdk.component.IPb.EYQ HX() {
        if (this.pi == null) {
            this.pi = new EYQ.C0080EYQ().EYQ(10L, TimeUnit.SECONDS).mZx(10L, TimeUnit.SECONDS).Td(10L, TimeUnit.SECONDS).EYQ();
        }
        return this.pi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mZx(int i) {
        wBa wba = this.EYQ;
        if (wba != null) {
            wba.sendEmptyMessage(i);
        }
    }

    private String EYQ(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return "https://" + str + "/get_domains/v4/";
    }

    private void EYQ(com.bytedance.sdk.component.IPb.mZx.mZx mzx) {
        String str;
        if (mzx == null) {
            return;
        }
        Address addressEYQ = VwS.EYQ().EYQ(this.nWX).Pm() != null ? VwS.EYQ().EYQ(this.nWX).Pm().EYQ(this.MxO) : null;
        if (addressEYQ != null && addressEYQ.hasLatitude() && addressEYQ.hasLongitude()) {
            StringBuilder sb = new StringBuilder();
            sb.append(addressEYQ.getLatitude());
            mzx.EYQ("latitude", sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(addressEYQ.getLongitude());
            mzx.EYQ("longitude", sb2.toString());
            String locality = addressEYQ.getLocality();
            if (!TextUtils.isEmpty(locality)) {
                mzx.EYQ("city", Uri.encode(locality));
            }
        }
        if (this.Td) {
            mzx.EYQ("force", "1");
        }
        try {
            if (Build.VERSION.SDK_INT < 21) {
                str = Build.CPU_ABI;
            } else {
                str = Build.SUPPORTED_ABIS[0];
            }
            mzx.EYQ("abi", str);
        } catch (Throwable unused) {
        }
        if (VwS.EYQ().EYQ(this.nWX).Pm() != null) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(VwS.EYQ().EYQ(this.nWX).Pm().EYQ());
            mzx.EYQ("aid", sb3.toString());
            mzx.EYQ("device_platform", VwS.EYQ().EYQ(this.nWX).Pm().Td());
            mzx.EYQ("channel", VwS.EYQ().EYQ(this.nWX).Pm().mZx());
            StringBuilder sb4 = new StringBuilder();
            sb4.append(VwS.EYQ().EYQ(this.nWX).Pm().Pm());
            mzx.EYQ("version_code", sb4.toString());
            mzx.EYQ("custom_info_1", VwS.EYQ().EYQ(this.nWX).Pm().Kbd());
        }
    }

    public static ThreadPoolExecutor VwS() {
        if (HX == null) {
            synchronized (EYQ.class) {
                if (HX == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 2, 20L, TimeUnit.SECONDS, new LinkedBlockingQueue());
                    HX = threadPoolExecutor;
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                }
            }
        }
        return HX;
    }

    public static void EYQ(ThreadPoolExecutor threadPoolExecutor) {
        HX = threadPoolExecutor;
    }
}
