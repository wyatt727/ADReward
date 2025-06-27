package com.bytedance.sdk.component.IPb.Td;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.webkit.ProxyConfig;
import com.bytedance.sdk.component.mZx.EYQ.KO;
import com.bytedance.sdk.component.mZx.EYQ.pi;
import java.net.InetAddress;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/* compiled from: TNCManager.java */
/* loaded from: classes2.dex */
public class Kbd {
    private mZx Kbd;
    private boolean Pm;
    private Pm QQ;
    private EYQ Td;
    private Context VwS;
    private int hYh;
    private long mZx = 0;
    private boolean IPb = false;
    private int HX = 0;
    private long tp = 19700101000L;
    private int MxO = 0;
    private HashMap<String, Integer> tsL = new HashMap<>();
    private HashMap<String, Integer> pi = new HashMap<>();
    private int nWX = 0;
    private HashMap<String, Integer> KO = new HashMap<>();
    private HashMap<String, Integer> hu = new HashMap<>();
    private boolean UB = true;
    private Map<String, Integer> Uc = new HashMap();
    Handler EYQ = new Handler(Looper.getMainLooper()) { // from class: com.bytedance.sdk.component.IPb.Td.Kbd.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 10000) {
                return;
            }
            Kbd.this.mZx(message.arg1 != 0);
        }
    };

    private boolean EYQ(int i) {
        return i >= 200 && i < 400;
    }

    private Kbd() {
    }

    public Kbd(int i) {
        this.hYh = i;
    }

    public String EYQ() {
        return "ttnet_tnc_config" + this.hYh;
    }

    public EYQ mZx() {
        return this.Td;
    }

    public void EYQ(boolean z) {
        this.Pm = z;
    }

    public void EYQ(mZx mzx) {
        this.Kbd = mzx;
    }

    public boolean Td() {
        return this.Pm;
    }

    public mZx Pm() {
        return this.Kbd;
    }

    public void Kbd() {
        this.Uc.clear();
    }

    public synchronized void EYQ(Context context, boolean z) {
        if (!this.IPb) {
            this.VwS = context;
            this.UB = z;
            this.QQ = new Pm(context, z, this.hYh);
            if (z) {
                HX();
            }
            this.Td = VwS.EYQ().EYQ(this.hYh, this.VwS);
            this.IPb = true;
        }
    }

    private void HX() {
        SharedPreferences sharedPreferences = this.VwS.getSharedPreferences(EYQ(), 0);
        this.HX = sharedPreferences.getInt("tnc_probe_cmd", 0);
        this.tp = sharedPreferences.getLong("tnc_probe_version", 19700101000L);
    }

    public Td IPb() {
        Pm pm = this.QQ;
        if (pm != null) {
            return pm.Td();
        }
        return null;
    }

    public Map<String, String> VwS() {
        Td tdIPb = IPb();
        if (tdIPb != null) {
            return tdIPb.Pm;
        }
        return null;
    }

    public Pm QQ() {
        return this.QQ;
    }

    public String EYQ(String str) {
        String protocol;
        Map<String, String> mapVwS;
        if (TextUtils.isEmpty(str) || str.contains("/network/get_network") || str.contains("/get_domains/v4") || str.contains("/ies/speed")) {
            return str;
        }
        String host = null;
        try {
            URL url = new URL(str);
            protocol = url.getProtocol();
            try {
                host = url.getHost();
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            protocol = null;
        }
        if (TextUtils.isEmpty(protocol)) {
            return str;
        }
        if ((!ProxyConfig.MATCH_HTTP.equals(protocol) && !"https".equals(protocol)) || TextUtils.isEmpty(host) || Pm(host) || (mapVwS = VwS()) == null || !mapVwS.containsKey(host)) {
            return str;
        }
        String str2 = mapVwS.get(host);
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        String str3 = protocol + "://" + host;
        return str.startsWith(str3) ? str.replaceFirst(str3, protocol + "://" + str2) : str;
    }

    public synchronized void EYQ(pi piVar, KO ko) {
        if (piVar == null || ko == null) {
            return;
        }
        if (this.UB) {
            if (com.bytedance.sdk.component.IPb.Pm.Kbd.EYQ(this.VwS)) {
                URL urlEYQ = null;
                try {
                    urlEYQ = piVar.mZx().EYQ();
                } catch (Exception unused) {
                }
                if (urlEYQ == null) {
                    return;
                }
                String protocol = urlEYQ.getProtocol();
                String host = urlEYQ.getHost();
                String path = urlEYQ.getPath();
                String strEYQ = EYQ(piVar);
                int iTd = ko.Td();
                if (ProxyConfig.MATCH_HTTP.equals(protocol) || "https".equals(protocol)) {
                    if (TextUtils.isEmpty(strEYQ)) {
                        return;
                    }
                    Td tdIPb = IPb();
                    if (tdIPb != null && tdIPb.mZx) {
                        EYQ(ko, host);
                    }
                    if (tdIPb == null) {
                        return;
                    }
                    this.tsL.size();
                    this.pi.size();
                    this.KO.size();
                    this.hu.size();
                    if (iTd > 0) {
                        if (EYQ(iTd)) {
                            if (this.MxO > 0 || this.nWX > 0) {
                                tp();
                            }
                            Td(host);
                            return;
                        }
                        if (!mZx(iTd)) {
                            this.nWX++;
                            this.KO.put(path, 0);
                            this.hu.put(strEYQ, 0);
                            if (this.nWX >= tdIPb.QQ && this.KO.size() >= tdIPb.HX && this.hu.size() >= tdIPb.tp) {
                                EYQ(false, 0L);
                                tp();
                            }
                            mZx(host);
                        }
                    }
                }
            }
        }
    }

    private String EYQ(pi piVar) {
        if (piVar == null || piVar.mZx() == null || piVar.mZx().EYQ() == null) {
            return "";
        }
        try {
            return InetAddress.getByName(piVar.mZx().EYQ().getHost()).getHostAddress();
        } catch (Exception unused) {
            return "";
        }
    }

    private void mZx(String str) {
        Map<String, String> mapVwS;
        if (TextUtils.isEmpty(str) || (mapVwS = VwS()) == null || !mapVwS.containsValue(str)) {
            return;
        }
        if (this.Uc.get(str) == null) {
            this.Uc.put(str, 1);
        } else {
            this.Uc.put(str, Integer.valueOf(this.Uc.get(str).intValue() + 1));
        }
    }

    private void Td(String str) {
        if (!TextUtils.isEmpty(str) && this.Uc.containsKey(str)) {
            this.Uc.put(str, 0);
        }
    }

    private boolean Pm(String str) {
        Map<String, String> mapVwS = VwS();
        if (mapVwS == null) {
            return false;
        }
        String str2 = mapVwS.get(str);
        return (TextUtils.isEmpty(str2) || this.Uc.get(str2) == null || this.Uc.get(str2).intValue() < 3) ? false : true;
    }

    public synchronized void EYQ(pi piVar, Exception exc) {
        if (piVar != null) {
            if (piVar.mZx() != null && exc != null) {
                if (this.UB) {
                    if (com.bytedance.sdk.component.IPb.Pm.Kbd.EYQ(this.VwS)) {
                        URL urlEYQ = null;
                        try {
                            urlEYQ = piVar.mZx().EYQ();
                        } catch (Exception unused) {
                        }
                        if (urlEYQ == null) {
                            return;
                        }
                        String protocol = urlEYQ.getProtocol();
                        String host = urlEYQ.getHost();
                        String path = urlEYQ.getPath();
                        String strEYQ = EYQ(piVar);
                        if (ProxyConfig.MATCH_HTTP.equals(protocol) || "https".equals(protocol)) {
                            Td tdIPb = IPb();
                            if (tdIPb == null) {
                                return;
                            }
                            this.tsL.size();
                            this.pi.size();
                            this.KO.size();
                            this.hu.size();
                            this.MxO++;
                            this.tsL.put(path, 0);
                            this.pi.put(strEYQ, 0);
                            if (this.MxO >= tdIPb.Kbd && this.tsL.size() >= tdIPb.IPb && this.pi.size() >= tdIPb.VwS) {
                                EYQ(false, 0L);
                                tp();
                            }
                            mZx(host);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void EYQ(com.bytedance.sdk.component.mZx.EYQ.KO r9, java.lang.String r10) {
        /*
            r8 = this;
            if (r9 != 0) goto L3
            return
        L3:
            boolean r10 = r8.UB
            if (r10 != 0) goto L8
            return
        L8:
            r10 = 0
            java.lang.String r0 = "tnc-cmd"
            java.lang.String r9 = r9.EYQ(r0, r10)
            boolean r10 = android.text.TextUtils.isEmpty(r9)
            if (r10 == 0) goto L16
            return
        L16:
            java.lang.String r10 = "@"
            java.lang.String[] r9 = r9.split(r10)
            if (r9 == 0) goto L85
            int r10 = r9.length
            r0 = 2
            if (r10 == r0) goto L23
            goto L85
        L23:
            r10 = 1
            r0 = 0
            r2 = 0
            r3 = r9[r2]     // Catch: java.lang.Throwable -> L34
            int r3 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.Throwable -> L34
            r9 = r9[r10]     // Catch: java.lang.Throwable -> L35
            long r4 = java.lang.Long.parseLong(r9)     // Catch: java.lang.Throwable -> L35
            goto L36
        L34:
            r3 = r2
        L35:
            r4 = r0
        L36:
            long r6 = r8.tp
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 > 0) goto L3d
            return
        L3d:
            r8.HX = r3
            r8.tp = r4
            android.content.Context r9 = r8.VwS
            java.lang.String r6 = r8.EYQ()
            android.content.SharedPreferences r9 = r9.getSharedPreferences(r6, r2)
            android.content.SharedPreferences$Editor r9 = r9.edit()
            java.lang.String r2 = "tnc_probe_cmd"
            android.content.SharedPreferences$Editor r9 = r9.putInt(r2, r3)
            java.lang.String r2 = "tnc_probe_version"
            android.content.SharedPreferences$Editor r9 = r9.putLong(r2, r4)
            r9.apply()
            int r9 = r8.HX
            r2 = 10000(0x2710, float:1.4013E-41)
            if (r9 != r2) goto L85
            com.bytedance.sdk.component.IPb.Td.Td r9 = r8.IPb()
            if (r9 != 0) goto L6b
            return
        L6b:
            java.util.Random r2 = new java.util.Random
            long r3 = java.lang.System.currentTimeMillis()
            r2.<init>(r3)
            int r3 = r9.tsL
            if (r3 <= 0) goto L82
            int r9 = r9.tsL
            int r9 = r2.nextInt(r9)
            long r0 = (long) r9
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r2
        L82:
            r8.EYQ(r10, r0)
        L85:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.IPb.Td.Kbd.EYQ(com.bytedance.sdk.component.mZx.EYQ.KO, java.lang.String):void");
    }

    private void EYQ(boolean z, long j) {
        if (this.EYQ.hasMessages(10000)) {
            return;
        }
        Message messageObtainMessage = this.EYQ.obtainMessage();
        messageObtainMessage.what = 10000;
        messageObtainMessage.arg1 = z ? 1 : 0;
        if (j > 0) {
            this.EYQ.sendMessageDelayed(messageObtainMessage, j);
        } else {
            this.EYQ.sendMessage(messageObtainMessage);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mZx(boolean z) {
        if (IPb() == null) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (z || this.mZx + (r0.MxO * 1000) <= jElapsedRealtime) {
            this.mZx = jElapsedRealtime;
            VwS.EYQ().EYQ(this.hYh, this.VwS).Td();
        }
    }

    private void tp() {
        this.MxO = 0;
        this.tsL.clear();
        this.pi.clear();
        this.nWX = 0;
        this.KO.clear();
        this.hu.clear();
    }

    private boolean mZx(int i) {
        if (i < 100 || i >= 1000) {
            return true;
        }
        Td tdIPb = IPb();
        return (tdIPb == null || TextUtils.isEmpty(tdIPb.pi) || !tdIPb.pi.contains(String.valueOf(i))) ? false : true;
    }
}
