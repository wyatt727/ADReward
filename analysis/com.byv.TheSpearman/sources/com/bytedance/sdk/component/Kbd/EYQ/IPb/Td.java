package com.bytedance.sdk.component.Kbd.EYQ.IPb;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.sdk.component.Kbd.EYQ.QQ;
import java.security.SecureRandom;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import org.json.JSONObject;

/* compiled from: TrackAdUrlImpl.java */
/* loaded from: classes2.dex */
public class Td implements mZx {
    private final Context EYQ;
    private final Kbd mZx;

    public Td(Context context, Kbd kbd) {
        this.EYQ = context;
        this.mZx = kbd;
    }

    public Context EYQ() {
        Context context = this.EYQ;
        return context == null ? QQ.VwS().IPb() : context;
    }

    @Override // com.bytedance.sdk.component.Kbd.EYQ.IPb.mZx
    public void EYQ(String str, List<String> list, boolean z, Map<String, String> map, int i, String str2) {
        com.bytedance.sdk.component.Kbd.EYQ.Kbd kbdHu = QQ.VwS().hu();
        if (kbdHu == null || QQ.VwS().IPb() == null || kbdHu.Pm() == null || !kbdHu.Td() || list == null || list.size() == 0) {
            return;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            kbdHu.Pm().execute(new EYQ(new Pm(UUID.randomUUID().toString() + "_" + System.currentTimeMillis(), it.next(), z, i, str2), str, map));
        }
    }

    @Override // com.bytedance.sdk.component.Kbd.EYQ.IPb.mZx
    public Runnable EYQ(final Pm pm, final String str, final Map<String, String> map) {
        if (pm == null || TextUtils.isEmpty(pm.EYQ())) {
            return null;
        }
        return new Runnable() { // from class: com.bytedance.sdk.component.Kbd.EYQ.IPb.Td.1
            @Override // java.lang.Runnable
            public void run() {
                if (Td.this.mZx.EYQ(pm.EYQ()) != null) {
                    new EYQ(pm, str, map).run();
                }
            }
        };
    }

    @Override // com.bytedance.sdk.component.Kbd.EYQ.IPb.mZx
    public void EYQ(final String str, final boolean z) {
        com.bytedance.sdk.component.Kbd.EYQ.Kbd kbdHu = QQ.VwS().hu();
        if (kbdHu == null || QQ.VwS().IPb() == null || !kbdHu.Td()) {
            return;
        }
        com.bytedance.sdk.component.Kbd.EYQ.Kbd.Kbd kbd = new com.bytedance.sdk.component.Kbd.EYQ.Kbd.Kbd("trackFailedUrls") { // from class: com.bytedance.sdk.component.Kbd.EYQ.IPb.Td.2
            @Override // java.lang.Runnable
            public void run() {
                Td.this.EYQ(Td.this.mZx.EYQ(), str, z);
            }
        };
        kbd.EYQ(1);
        if (kbdHu.Pm() != null) {
            kbdHu.Pm().execute(kbd);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void EYQ(List<Pm> list, String str, boolean z) {
        if (list == null || list.size() == 0) {
            return;
        }
        com.bytedance.sdk.component.Kbd.EYQ.Kbd kbdHu = QQ.VwS().hu();
        for (Pm pm : list) {
            if (kbdHu != null && kbdHu.Pm() != null) {
                pm.EYQ(z);
                kbdHu.Pm().execute(new EYQ(pm, str, null));
            }
        }
    }

    /* compiled from: TrackAdUrlImpl.java */
    private class EYQ extends com.bytedance.sdk.component.Kbd.EYQ.Kbd.Kbd {
        private final Map<String, String> Pm;
        private final String Td;
        private final Pm mZx;

        private EYQ(Pm pm, String str, Map<String, String> map) {
            super("AdsStats");
            this.mZx = pm;
            this.Td = str;
            this.Pm = map;
        }

        private String Td(String str) {
            if (TextUtils.isEmpty(str)) {
                return str;
            }
            if (str.contains("{TS}") || str.contains("__TS__")) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                str = str.replace("{TS}", String.valueOf(jCurrentTimeMillis)).replace("__TS__", String.valueOf(jCurrentTimeMillis));
            }
            return ((str.contains("{UID}") || str.contains("__UID__")) && !TextUtils.isEmpty(this.Td)) ? str.replace("{UID}", this.Td).replace("__UID__", this.Td) : str;
        }

        boolean EYQ(String str) {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            return str.startsWith("http://") || str.startsWith("https://");
        }

        String mZx(String str) {
            if (TextUtils.isEmpty(str)) {
                return str;
            }
            try {
                return str.replace("[ss_random]", String.valueOf(Td.Td().nextLong())).replace("[ss_timestamp]", String.valueOf(System.currentTimeMillis()));
            } catch (Exception unused) {
                return str;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            com.bytedance.sdk.component.Kbd.EYQ.Kbd kbdHu = QQ.VwS().hu();
            if (kbdHu == null || QQ.VwS().IPb() == null || !kbdHu.Td() || !EYQ(this.mZx.mZx())) {
                return;
            }
            if (this.mZx.Pm() >= kbdHu.Td(this.mZx.IPb())) {
                Td.this.mZx.Td(this.mZx);
                return;
            }
            try {
                kbdHu.pi();
                if (this.mZx.MxO()) {
                    Td.this.mZx.EYQ(this.mZx);
                }
                if (kbdHu.EYQ(Td.this.EYQ())) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    String strMZx = this.mZx.mZx();
                    if (kbdHu.IPb() == 0) {
                        strMZx = Td(this.mZx.mZx());
                        if (this.mZx.Td()) {
                            strMZx = mZx(strMZx);
                        }
                    }
                    com.bytedance.sdk.component.Kbd.EYQ.Kbd.Td tdTp = kbdHu.tp();
                    if (tdTp == null) {
                        return;
                    }
                    tdTp.EYQ("User-Agent", kbdHu.HX());
                    tdTp.EYQ("csj_client_source_from", "1");
                    if (this.Pm != null) {
                        JSONObject jSONObject = new JSONObject();
                        for (Map.Entry<String, String> entry : this.Pm.entrySet()) {
                            jSONObject.put(entry.getKey(), entry.getValue());
                        }
                        tdTp.EYQ("csj_extra_info", jSONObject.toString());
                    }
                    tdTp.EYQ(strMZx);
                    com.bytedance.sdk.component.Kbd.EYQ.Kbd.Pm pmEYQ = null;
                    try {
                        pmEYQ = tdTp.EYQ();
                        kbdHu.EYQ(pmEYQ.EYQ());
                    } catch (Throwable unused) {
                    }
                    Pm pm = this.mZx;
                    pm.EYQ(pm.Pm() + 1);
                    if (pmEYQ != null && pmEYQ.EYQ()) {
                        Td.this.mZx.Td(this.mZx);
                        this.mZx.mZx();
                        kbdHu.EYQ(true, 200, System.currentTimeMillis() - jCurrentTimeMillis, this.mZx);
                        return;
                    }
                    if (pmEYQ != null) {
                        this.mZx.mZx(pmEYQ.mZx());
                        this.mZx.Td(pmEYQ.Td());
                    }
                    if (pmEYQ != null && pmEYQ.mZx() == 8848) {
                        pmEYQ.Td();
                        Td.this.mZx.Td(this.mZx);
                    } else {
                        this.mZx.mZx();
                        if (this.mZx.Pm() >= kbdHu.Td(this.mZx.IPb())) {
                            Td.this.mZx.Td(this.mZx);
                            this.mZx.mZx();
                        } else {
                            Td.this.mZx.mZx(this.mZx);
                        }
                    }
                    kbdHu.EYQ(false, this.mZx.QQ(), System.currentTimeMillis() - jCurrentTimeMillis, this.mZx);
                }
            } catch (Throwable unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Random Td() {
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                return SecureRandom.getInstanceStrong();
            } catch (Throwable unused) {
                return new SecureRandom();
            }
        }
        return new SecureRandom();
    }
}
