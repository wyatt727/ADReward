package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.bannerexpress.EYQ;
import com.bytedance.sdk.openadsdk.dislike.TTDislikeListView;
import com.bytedance.sdk.openadsdk.utils.FH;
import com.vungle.ads.internal.signals.SignalManager;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: GlobalInfo.java */
/* loaded from: classes2.dex */
public class QQ {
    public static tsL EYQ = null;
    private static boolean Uc = false;
    public static final Set<String> mZx = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.core.QQ.1
        {
            add("8025677");
            add("5001121");
        }
    };
    private String HX;
    private String IPb;
    private Integer KO;
    private String Kbd;
    private int MxO;
    private volatile ConcurrentHashMap<String, EYQ.InterfaceC0117EYQ> NZ;
    private boolean Pm;
    private boolean QQ;
    Boolean Td;
    private Integer UB;
    private int VwS;
    private String WU;
    private com.bytedance.sdk.openadsdk.core.video.mZx.Td XN;
    private int hYh;
    private Integer hu;
    private Bitmap nWX;
    private boolean pi;
    private String tp;
    private boolean tsL;
    private boolean zF;

    public static void EYQ(tsL tsl) {
        EYQ = tsl;
    }

    public boolean EYQ() {
        return this.zF;
    }

    public void EYQ(boolean z) {
        this.zF = z;
    }

    private QQ() {
        this.Pm = false;
        this.MxO = 0;
        this.tsL = true;
        this.pi = false;
        this.nWX = null;
        this.KO = null;
        this.hu = null;
        this.UB = null;
        this.hYh = 0;
        this.NZ = null;
        try {
            com.bykv.vk.openvk.component.video.api.IPb.EYQ.EYQ(hu.EYQ());
        } catch (Throwable unused) {
        }
    }

    public static QQ mZx() {
        return EYQ.EYQ;
    }

    /* compiled from: GlobalInfo.java */
    private static class EYQ {
        private static final QQ EYQ = new QQ();
    }

    public boolean Td() {
        return com.bytedance.sdk.openadsdk.multipro.Pm.Pm.EYQ("sp_global_file", "sdk_activate_init", true);
    }

    public void mZx(boolean z) {
        com.bytedance.sdk.openadsdk.multipro.Pm.Pm.EYQ("sp_global_file", "sdk_activate_init", Boolean.valueOf(z));
    }

    public String Pm() {
        if (com.bytedance.sdk.openadsdk.multipro.mZx.Td()) {
            return EYQ("app_id", Long.MAX_VALUE);
        }
        return this.Kbd;
    }

    public void EYQ(String str) throws JSONException {
        IPb(str);
        this.Kbd = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        EYQ("app_id", str);
        com.bytedance.sdk.openadsdk.core.settings.KO.Jpu().Pm(7);
    }

    public String Kbd() {
        if (TextUtils.isEmpty(this.IPb)) {
            this.IPb = EYQ(hu.EYQ());
        }
        return this.IPb;
    }

    private String EYQ(Context context) {
        try {
            PackageManager packageManager = context.getApplicationContext().getPackageManager();
            return (String) packageManager.getApplicationLabel(packageManager.getApplicationInfo(context.getPackageName(), 128));
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    public void EYQ(int i) {
        if (com.bytedance.sdk.openadsdk.multipro.mZx.Td()) {
            com.bytedance.sdk.openadsdk.multipro.Pm.Pm.EYQ("sp_global_icon_id", "icon_id", Integer.valueOf(i));
        }
        this.VwS = i;
    }

    public int IPb() {
        if (com.bytedance.sdk.openadsdk.multipro.mZx.Td()) {
            return com.bytedance.sdk.openadsdk.multipro.Pm.Pm.EYQ("sp_global_icon_id", "icon_id", 0);
        }
        return this.VwS;
    }

    public void mZx(final int i) {
        if (i == 0 || i == 1 || i == -1) {
            final Integer num = this.KO;
            if (num == null || num.intValue() != i) {
                this.KO = Integer.valueOf(i);
                if (!com.bytedance.sdk.openadsdk.utils.xt.Kbd()) {
                    EYQ(num, i);
                } else {
                    pi.mZx().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.QQ.2
                        @Override // java.lang.Runnable
                        public void run() {
                            QQ.this.EYQ(num, i);
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void EYQ(Integer num, int i) {
        if (num == null) {
            if (com.bytedance.sdk.openadsdk.multipro.Pm.Pm.EYQ("sp_global_privacy", "sdk_coppa", -1) != i) {
                com.bytedance.sdk.openadsdk.multipro.Pm.Pm.EYQ("sp_global_privacy", "sdk_coppa", Integer.valueOf(i));
                com.bytedance.sdk.openadsdk.core.settings.KO.Jpu().EYQ(3, true);
                return;
            }
            return;
        }
        com.bytedance.sdk.openadsdk.multipro.Pm.Pm.EYQ("sp_global_privacy", "sdk_coppa", Integer.valueOf(i));
        com.bytedance.sdk.openadsdk.core.settings.KO.Jpu().EYQ(3, true);
    }

    public int VwS() {
        Integer num = this.KO;
        if (num != null) {
            return num.intValue();
        }
        return com.bytedance.sdk.openadsdk.multipro.Pm.Pm.EYQ("sp_global_privacy", "sdk_coppa", -1);
    }

    public int QQ() {
        Integer num = this.hu;
        if (num != null) {
            return num.intValue();
        }
        return com.bytedance.sdk.openadsdk.multipro.Pm.Pm.EYQ("sp_global_privacy", "tt_gdpr", -1);
    }

    public void Td(final int i) {
        if (i == 1) {
            i = 0;
        } else if (i == 0) {
            i = 1;
        }
        if (i == 0 || i == 1 || i == -1) {
            final Integer num = this.hu;
            if (num == null || num.intValue() != i) {
                this.hu = Integer.valueOf(i);
                if (!com.bytedance.sdk.openadsdk.utils.xt.Kbd()) {
                    mZx(num, i);
                } else {
                    pi.mZx().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.QQ.3
                        @Override // java.lang.Runnable
                        public void run() {
                            QQ.this.mZx(num, i);
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mZx(Integer num, int i) {
        if (num == null) {
            if (com.bytedance.sdk.openadsdk.multipro.Pm.Pm.EYQ("sp_global_privacy", "tt_gdpr", -1) != i) {
                com.bytedance.sdk.openadsdk.multipro.Pm.Pm.EYQ("sp_global_privacy", "tt_gdpr", Integer.valueOf(i));
                com.bytedance.sdk.openadsdk.core.settings.KO.Jpu().EYQ(4, true);
                return;
            }
            return;
        }
        com.bytedance.sdk.openadsdk.multipro.Pm.Pm.EYQ("sp_global_privacy", "tt_gdpr", Integer.valueOf(i));
        com.bytedance.sdk.openadsdk.core.settings.KO.Jpu().EYQ(4, true);
    }

    public void Pm(int i) {
        if (i != 0 && i != 1) {
            i = -99;
        }
        com.bytedance.sdk.openadsdk.multipro.Pm.Pm.EYQ("sp_global_privacy", "global_coppa", Integer.valueOf(i));
        this.hYh = i;
    }

    public int HX() {
        int iEYQ = com.bytedance.sdk.openadsdk.multipro.Pm.Pm.EYQ("sp_global_privacy", "global_coppa", -99);
        this.hYh = iEYQ;
        if (iEYQ == -99) {
            this.hYh = VwS();
        }
        return this.hYh;
    }

    public boolean tp() {
        if (com.bytedance.sdk.openadsdk.multipro.mZx.Td()) {
            return com.bytedance.sdk.openadsdk.multipro.Pm.Pm.EYQ("sp_global_file", "is_paid", false);
        }
        return this.QQ;
    }

    public String MxO() {
        if (com.bytedance.sdk.openadsdk.multipro.mZx.Td()) {
            return com.bytedance.sdk.openadsdk.multipro.Pm.Pm.mZx("sp_global_file", "keywords", null);
        }
        return this.HX;
    }

    public String tsL() {
        if (com.bytedance.sdk.openadsdk.multipro.mZx.Td()) {
            return com.bytedance.sdk.openadsdk.multipro.Pm.Pm.mZx("sp_global_file", "extra_data", null);
        }
        return this.tp;
    }

    public void mZx(final String str) {
        VwS(str);
        if (com.bytedance.sdk.openadsdk.utils.xt.Kbd()) {
            pi.mZx().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.QQ.4
                @Override // java.lang.Runnable
                public void run() {
                    if (com.bytedance.sdk.openadsdk.multipro.mZx.Td()) {
                        com.bytedance.sdk.openadsdk.multipro.Pm.Pm.EYQ("sp_global_file", "extra_data", str);
                    }
                }
            });
        } else if (com.bytedance.sdk.openadsdk.multipro.mZx.Td()) {
            com.bytedance.sdk.openadsdk.multipro.Pm.Pm.EYQ("sp_global_file", "extra_data", str);
        }
        this.tp = str;
    }

    public void Kbd(int i) {
        if (com.bytedance.sdk.openadsdk.multipro.mZx.Td()) {
            com.bytedance.sdk.openadsdk.multipro.Pm.Pm.EYQ("sp_global_file", "title_bar_theme", Integer.valueOf(i));
        }
        this.MxO = i;
    }

    public int pi() {
        if (com.bytedance.sdk.openadsdk.multipro.mZx.Td()) {
            return com.bytedance.sdk.openadsdk.multipro.Pm.Pm.EYQ("sp_global_file", "title_bar_theme", 0);
        }
        return this.MxO;
    }

    private static void IPb(String str) {
        tsL tsl;
        if (TextUtils.isEmpty(str) && (tsl = EYQ) != null) {
            tsl.fail(4000, "appid cannot be empty");
        }
        com.bytedance.sdk.component.utils.pi.EYQ("TTAD.GlobalInfo", "appid cannot be empty");
    }

    private static void VwS(String str) {
        if (TextUtils.isEmpty(str) || str.length() <= 1000) {
            return;
        }
        tsL tsl = EYQ;
        if (tsl != null) {
            tsl.fail(4000, "Data is very long, the longest is 1000");
        }
        com.bytedance.sdk.component.utils.pi.EYQ("TTAD.GlobalInfo", "Data is very long, the longest is 1000");
    }

    public com.bytedance.sdk.openadsdk.core.video.mZx.Td nWX() {
        if (this.XN == null) {
            this.XN = new com.bytedance.sdk.openadsdk.core.video.mZx.Td(10, 8);
        }
        return this.XN;
    }

    public boolean KO() {
        if (com.bytedance.sdk.openadsdk.multipro.mZx.Td()) {
            return com.bytedance.sdk.openadsdk.multipro.Pm.Pm.EYQ("sp_global_file", "is_use_texture", false);
        }
        return this.pi;
    }

    public void Td(boolean z) {
        if (com.bytedance.sdk.openadsdk.multipro.mZx.Td()) {
            com.bytedance.sdk.openadsdk.multipro.Pm.Pm.EYQ("sp_global_file", "is_use_texture", Boolean.valueOf(z));
        }
        this.pi = z;
    }

    public Bitmap hu() {
        if (com.bytedance.sdk.openadsdk.multipro.mZx.Td()) {
            return com.bytedance.sdk.component.utils.Pm.EYQ(com.bytedance.sdk.openadsdk.multipro.Pm.Pm.mZx("sp_global_file", "pause_icon", null));
        }
        return this.nWX;
    }

    public boolean UB() {
        return mZx.contains(this.Kbd);
    }

    public boolean Uc() {
        return "com.union_test.internationad".equals(FH.Kbd());
    }

    public String hYh() {
        if (!TextUtils.isEmpty(this.WU)) {
            return this.WU;
        }
        String strEYQ = com.bytedance.sdk.openadsdk.utils.QQ.EYQ();
        this.WU = strEYQ;
        if (!TextUtils.isEmpty(strEYQ)) {
            return this.WU;
        }
        String strValueOf = String.valueOf(System.currentTimeMillis());
        com.bytedance.sdk.openadsdk.utils.QQ.EYQ(strValueOf);
        this.WU = strValueOf;
        return strValueOf;
    }

    private static JSONObject QQ(String str) {
        String strMZx = com.bytedance.sdk.openadsdk.multipro.Pm.Pm.mZx("sp_global_file", str, null);
        if (TextUtils.isEmpty(strMZx)) {
            return null;
        }
        try {
            return new JSONObject(strMZx);
        } catch (JSONException e) {
            com.bytedance.sdk.component.utils.pi.EYQ("TTAD.GlobalInfo", e.getMessage());
            return null;
        }
    }

    public static void EYQ(String str, String str2) throws JSONException {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("value", str2);
            jSONObject.put("time", System.currentTimeMillis());
            com.bytedance.sdk.openadsdk.multipro.Pm.Pm.EYQ("sp_global_file", str, jSONObject.toString());
        } catch (JSONException e) {
            com.bytedance.sdk.component.utils.pi.EYQ("TTAD.GlobalInfo", e.getMessage());
        }
    }

    public static String EYQ(String str, long j) throws JSONException {
        JSONObject jSONObjectQQ;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            jSONObjectQQ = QQ(str);
        } catch (JSONException e) {
            com.bytedance.sdk.component.utils.pi.EYQ("TTAD.GlobalInfo", e.getMessage());
        }
        if (jSONObjectQQ == null) {
            return null;
        }
        if (System.currentTimeMillis() - jSONObjectQQ.getLong("time") <= j) {
            return jSONObjectQQ.getString("value");
        }
        return null;
    }

    public int zF() {
        Integer num = this.UB;
        if (num != null) {
            return num.intValue();
        }
        return com.bytedance.sdk.openadsdk.multipro.Pm.Pm.EYQ("sp_global_privacy", "global_ccpa", -1);
    }

    public void IPb(final int i) {
        if (i == 0 || i == 1 || i == -1) {
            final Integer num = this.UB;
            if (num == null || num.intValue() != i) {
                this.UB = Integer.valueOf(i);
                if (!com.bytedance.sdk.openadsdk.utils.xt.Kbd()) {
                    Td(num, i);
                } else {
                    pi.mZx().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.QQ.5
                        @Override // java.lang.Runnable
                        public void run() {
                            QQ.this.Td(num, i);
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Td(Integer num, int i) {
        if (num == null) {
            if (com.bytedance.sdk.openadsdk.multipro.Pm.Pm.EYQ("sp_global_privacy", "global_ccpa", -1) != i) {
                com.bytedance.sdk.openadsdk.multipro.Pm.Pm.EYQ("sp_global_privacy", "global_ccpa", Integer.valueOf(i));
                com.bytedance.sdk.openadsdk.core.settings.KO.Jpu().EYQ(5, true);
                return;
            }
            return;
        }
        com.bytedance.sdk.openadsdk.multipro.Pm.Pm.EYQ("sp_global_privacy", "global_ccpa", Integer.valueOf(i));
        com.bytedance.sdk.openadsdk.core.settings.KO.Jpu().EYQ(5, true);
    }

    public EYQ.InterfaceC0117EYQ Td(String str) {
        if (this.NZ == null || str == null) {
            return null;
        }
        return this.NZ.get(str);
    }

    public void EYQ(String str, EYQ.InterfaceC0117EYQ interfaceC0117EYQ) {
        if (TextUtils.isEmpty(str) || interfaceC0117EYQ == null) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.multipro.mZx.Td()) {
            TTDislikeListView.EYQ(6, str, interfaceC0117EYQ);
            return;
        }
        if (this.NZ == null) {
            synchronized (QQ.class) {
                if (this.NZ == null) {
                    this.NZ = new ConcurrentHashMap<>();
                }
            }
        }
        this.NZ.put(str, interfaceC0117EYQ);
    }

    public void Pm(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.multipro.mZx.Td()) {
            TTDislikeListView.EYQ(6, str);
        } else if (this.NZ != null) {
            this.NZ.remove(str);
        }
    }

    public void WU() {
        try {
            if (this.NZ == null || this.NZ.size() != 0) {
                return;
            }
            this.NZ = null;
        } catch (NullPointerException e) {
            e.getMessage();
        }
    }

    public void Pm(boolean z) {
        this.Pm = z;
    }

    public static boolean XN() {
        return Uc;
    }

    public static void NZ() {
        if (Build.VERSION.SDK_INT == 26 && "MI 6".equals(Build.MODEL)) {
            Uc = true;
        }
    }

    public static boolean Kbd(String str) {
        return (!com.bytedance.sdk.openadsdk.utils.zF.EYQ || str.contains("sp_full_screen_video") || str.contains("sp_reward_video") || str.contains("tt_openad") || str.contains("pag_sp_bad_par")) ? false : true;
    }

    public boolean tPj() throws JSONException {
        Boolean bool = this.Td;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (UB()) {
            this.Td = Boolean.TRUE;
            return true;
        }
        if (TextUtils.isEmpty(EYQ("interval_one_day", SignalManager.TWENTY_FOUR_HOURS_MILLIS))) {
            this.Td = Boolean.TRUE;
            StringBuilder sb = new StringBuilder();
            sb.append(System.currentTimeMillis());
            EYQ("interval_one_day", sb.toString());
        } else {
            this.Td = Boolean.FALSE;
        }
        return this.Td.booleanValue();
    }
}
