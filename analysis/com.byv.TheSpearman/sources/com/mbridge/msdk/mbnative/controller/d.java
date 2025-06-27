package com.mbridge.msdk.mbnative.controller;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.c.j;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.entity.k;
import com.mbridge.msdk.foundation.same.c;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.Frame;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: NativePreloadController.java */
/* loaded from: classes4.dex */
public class d extends com.mbridge.msdk.mbnative.controller.b {
    private static final String e = "d";
    private static Map<String, Map<Long, Object>> f = new HashMap();
    private static Map<String, Boolean> g = new HashMap();
    private static Map<String, k> h = new HashMap();
    private static Map<String, Integer> i = new HashMap();
    private static Map<String, Integer> j = new HashMap();
    private static d k = null;
    private static int u = -1;
    private static int v = -2;
    protected List<Integer> d;
    private j l;
    private com.mbridge.msdk.click.a m;
    private com.mbridge.msdk.c.k n;
    private String o;
    private Map<String, Object> q;
    private List<Integer> r;
    private List<Integer> s;
    private boolean t;
    private boolean w;
    private int x;
    private int y;
    Queue<Integer> b = null;
    Queue<Long> c = null;
    private int p = 0;
    private com.mbridge.msdk.foundation.same.e.b z = new com.mbridge.msdk.foundation.same.e.b(com.mbridge.msdk.foundation.controller.c.m().c());

    public d() {
        if (Looper.myLooper() == null) {
            Looper.prepare();
        }
        this.f3121a = new Handler() { // from class: com.mbridge.msdk.mbnative.controller.d.1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x02dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.util.Map<java.lang.String, java.lang.Object> r24, int r25) {
        /*
            Method dump skipped, instructions count: 1087
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.mbnative.controller.d.a(java.util.Map, int):void");
    }

    private int a(String str) {
        if (str == null) {
            return 0;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() > 0) {
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    JSONObject jSONObject = (JSONObject) jSONArray.opt(i2);
                    if (2 == jSONObject.optInt("id", 0)) {
                        return jSONObject.optInt("ad_num");
                    }
                }
            }
        } catch (Exception e2) {
            ad.b(e, com.mbridge.msdk.mbnative.b.a.a(e2));
        }
        return 0;
    }

    private void a(int i2, com.mbridge.msdk.c.k kVar, String str, String str2, com.mbridge.msdk.b.a.a aVar) {
        Queue<Integer> queue = this.b;
        if (queue == null || queue.size() <= 0) {
            return;
        }
        try {
            int iIntValue = this.b.poll().intValue();
            long jLongValue = MBridgeConstans.REQUEST_TIME_OUT;
            Queue<Long> queue2 = this.c;
            if (queue2 != null && queue2.size() > 0) {
                jLongValue = this.c.poll().longValue();
            }
            ad.c(e, "preload start queue adsource = " + iIntValue);
            a(iIntValue, jLongValue, str, str2, this.q, i2, kVar, aVar);
        } catch (Throwable unused) {
            ad.b(e, "queue poll exception");
        }
    }

    private void a(int i2, long j2, String str, String str2, Map<String, Object> map, int i3, com.mbridge.msdk.c.k kVar, com.mbridge.msdk.b.a.a aVar) throws JSONException {
        com.mbridge.msdk.mbnative.a.b<String, List<Campaign>> bVarA;
        if (i2 != 1 && (bVarA = com.mbridge.msdk.mbnative.a.c.a(i2)) != null) {
            List<Campaign> listB = bVarA.b(str, this.y);
            if (listB != null && listB.size() > 0) {
                a(true, aVar, (String) null);
                return;
            }
        }
        if (i2 == 1) {
            a(i2, j2, i3, kVar, str, str2, true, aVar);
        } else if (i2 == 2) {
            a(2, j2, i3, kVar, str, str2, aVar, false);
        } else {
            a(i2, j2, i3, kVar, str, str2, aVar, false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x02af A[Catch: Exception -> 0x0476, TryCatch #3 {Exception -> 0x0476, blocks: (B:3:0x001a, B:6:0x0067, B:8:0x006d, B:10:0x0075, B:12:0x007d, B:14:0x0085, B:16:0x008f, B:17:0x0099, B:19:0x00a3, B:20:0x00ad, B:22:0x00b7, B:24:0x00c1, B:26:0x00c7, B:27:0x00d0, B:29:0x00e9, B:30:0x00f0, B:32:0x00f6, B:33:0x00fb, B:35:0x0122, B:36:0x0127, B:43:0x0140, B:46:0x0148, B:48:0x0150, B:50:0x0156, B:52:0x015b, B:54:0x015f, B:58:0x0173, B:60:0x017b, B:62:0x0181, B:66:0x018c, B:67:0x019e, B:69:0x01a2, B:70:0x01b8, B:72:0x01c0, B:74:0x01cf, B:75:0x01e5, B:78:0x01f6, B:80:0x01fc, B:84:0x0209, B:86:0x0210, B:88:0x0216, B:114:0x0261, B:115:0x026e, B:124:0x0286, B:126:0x02af, B:127:0x02b5, B:129:0x02bd, B:131:0x02cf, B:132:0x02d8, B:134:0x02e0, B:140:0x02f0, B:144:0x0300, B:149:0x030d, B:153:0x0339, B:155:0x0374, B:156:0x0379, B:158:0x037f, B:160:0x0387, B:162:0x0391, B:163:0x03b1, B:165:0x03bb, B:167:0x03c5, B:168:0x03e5, B:169:0x03ec, B:173:0x041b, B:175:0x0447, B:179:0x045c, B:178:0x0453, B:172:0x0418, B:152:0x0325, B:141:0x02f5, B:142:0x02fa, B:94:0x021f, B:96:0x0225, B:108:0x024a, B:118:0x0279, B:180:0x0464), top: B:191:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02bd A[Catch: Exception -> 0x0476, TryCatch #3 {Exception -> 0x0476, blocks: (B:3:0x001a, B:6:0x0067, B:8:0x006d, B:10:0x0075, B:12:0x007d, B:14:0x0085, B:16:0x008f, B:17:0x0099, B:19:0x00a3, B:20:0x00ad, B:22:0x00b7, B:24:0x00c1, B:26:0x00c7, B:27:0x00d0, B:29:0x00e9, B:30:0x00f0, B:32:0x00f6, B:33:0x00fb, B:35:0x0122, B:36:0x0127, B:43:0x0140, B:46:0x0148, B:48:0x0150, B:50:0x0156, B:52:0x015b, B:54:0x015f, B:58:0x0173, B:60:0x017b, B:62:0x0181, B:66:0x018c, B:67:0x019e, B:69:0x01a2, B:70:0x01b8, B:72:0x01c0, B:74:0x01cf, B:75:0x01e5, B:78:0x01f6, B:80:0x01fc, B:84:0x0209, B:86:0x0210, B:88:0x0216, B:114:0x0261, B:115:0x026e, B:124:0x0286, B:126:0x02af, B:127:0x02b5, B:129:0x02bd, B:131:0x02cf, B:132:0x02d8, B:134:0x02e0, B:140:0x02f0, B:144:0x0300, B:149:0x030d, B:153:0x0339, B:155:0x0374, B:156:0x0379, B:158:0x037f, B:160:0x0387, B:162:0x0391, B:163:0x03b1, B:165:0x03bb, B:167:0x03c5, B:168:0x03e5, B:169:0x03ec, B:173:0x041b, B:175:0x0447, B:179:0x045c, B:178:0x0453, B:172:0x0418, B:152:0x0325, B:141:0x02f5, B:142:0x02fa, B:94:0x021f, B:96:0x0225, B:108:0x024a, B:118:0x0279, B:180:0x0464), top: B:191:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02e0 A[Catch: Exception -> 0x0476, TryCatch #3 {Exception -> 0x0476, blocks: (B:3:0x001a, B:6:0x0067, B:8:0x006d, B:10:0x0075, B:12:0x007d, B:14:0x0085, B:16:0x008f, B:17:0x0099, B:19:0x00a3, B:20:0x00ad, B:22:0x00b7, B:24:0x00c1, B:26:0x00c7, B:27:0x00d0, B:29:0x00e9, B:30:0x00f0, B:32:0x00f6, B:33:0x00fb, B:35:0x0122, B:36:0x0127, B:43:0x0140, B:46:0x0148, B:48:0x0150, B:50:0x0156, B:52:0x015b, B:54:0x015f, B:58:0x0173, B:60:0x017b, B:62:0x0181, B:66:0x018c, B:67:0x019e, B:69:0x01a2, B:70:0x01b8, B:72:0x01c0, B:74:0x01cf, B:75:0x01e5, B:78:0x01f6, B:80:0x01fc, B:84:0x0209, B:86:0x0210, B:88:0x0216, B:114:0x0261, B:115:0x026e, B:124:0x0286, B:126:0x02af, B:127:0x02b5, B:129:0x02bd, B:131:0x02cf, B:132:0x02d8, B:134:0x02e0, B:140:0x02f0, B:144:0x0300, B:149:0x030d, B:153:0x0339, B:155:0x0374, B:156:0x0379, B:158:0x037f, B:160:0x0387, B:162:0x0391, B:163:0x03b1, B:165:0x03bb, B:167:0x03c5, B:168:0x03e5, B:169:0x03ec, B:173:0x041b, B:175:0x0447, B:179:0x045c, B:178:0x0453, B:172:0x0418, B:152:0x0325, B:141:0x02f5, B:142:0x02fa, B:94:0x021f, B:96:0x0225, B:108:0x024a, B:118:0x0279, B:180:0x0464), top: B:191:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0325 A[Catch: Exception -> 0x0476, TryCatch #3 {Exception -> 0x0476, blocks: (B:3:0x001a, B:6:0x0067, B:8:0x006d, B:10:0x0075, B:12:0x007d, B:14:0x0085, B:16:0x008f, B:17:0x0099, B:19:0x00a3, B:20:0x00ad, B:22:0x00b7, B:24:0x00c1, B:26:0x00c7, B:27:0x00d0, B:29:0x00e9, B:30:0x00f0, B:32:0x00f6, B:33:0x00fb, B:35:0x0122, B:36:0x0127, B:43:0x0140, B:46:0x0148, B:48:0x0150, B:50:0x0156, B:52:0x015b, B:54:0x015f, B:58:0x0173, B:60:0x017b, B:62:0x0181, B:66:0x018c, B:67:0x019e, B:69:0x01a2, B:70:0x01b8, B:72:0x01c0, B:74:0x01cf, B:75:0x01e5, B:78:0x01f6, B:80:0x01fc, B:84:0x0209, B:86:0x0210, B:88:0x0216, B:114:0x0261, B:115:0x026e, B:124:0x0286, B:126:0x02af, B:127:0x02b5, B:129:0x02bd, B:131:0x02cf, B:132:0x02d8, B:134:0x02e0, B:140:0x02f0, B:144:0x0300, B:149:0x030d, B:153:0x0339, B:155:0x0374, B:156:0x0379, B:158:0x037f, B:160:0x0387, B:162:0x0391, B:163:0x03b1, B:165:0x03bb, B:167:0x03c5, B:168:0x03e5, B:169:0x03ec, B:173:0x041b, B:175:0x0447, B:179:0x045c, B:178:0x0453, B:172:0x0418, B:152:0x0325, B:141:0x02f5, B:142:0x02fa, B:94:0x021f, B:96:0x0225, B:108:0x024a, B:118:0x0279, B:180:0x0464), top: B:191:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0374 A[Catch: Exception -> 0x0476, TryCatch #3 {Exception -> 0x0476, blocks: (B:3:0x001a, B:6:0x0067, B:8:0x006d, B:10:0x0075, B:12:0x007d, B:14:0x0085, B:16:0x008f, B:17:0x0099, B:19:0x00a3, B:20:0x00ad, B:22:0x00b7, B:24:0x00c1, B:26:0x00c7, B:27:0x00d0, B:29:0x00e9, B:30:0x00f0, B:32:0x00f6, B:33:0x00fb, B:35:0x0122, B:36:0x0127, B:43:0x0140, B:46:0x0148, B:48:0x0150, B:50:0x0156, B:52:0x015b, B:54:0x015f, B:58:0x0173, B:60:0x017b, B:62:0x0181, B:66:0x018c, B:67:0x019e, B:69:0x01a2, B:70:0x01b8, B:72:0x01c0, B:74:0x01cf, B:75:0x01e5, B:78:0x01f6, B:80:0x01fc, B:84:0x0209, B:86:0x0210, B:88:0x0216, B:114:0x0261, B:115:0x026e, B:124:0x0286, B:126:0x02af, B:127:0x02b5, B:129:0x02bd, B:131:0x02cf, B:132:0x02d8, B:134:0x02e0, B:140:0x02f0, B:144:0x0300, B:149:0x030d, B:153:0x0339, B:155:0x0374, B:156:0x0379, B:158:0x037f, B:160:0x0387, B:162:0x0391, B:163:0x03b1, B:165:0x03bb, B:167:0x03c5, B:168:0x03e5, B:169:0x03ec, B:173:0x041b, B:175:0x0447, B:179:0x045c, B:178:0x0453, B:172:0x0418, B:152:0x0325, B:141:0x02f5, B:142:0x02fa, B:94:0x021f, B:96:0x0225, B:108:0x024a, B:118:0x0279, B:180:0x0464), top: B:191:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x037f A[Catch: Exception -> 0x0476, TryCatch #3 {Exception -> 0x0476, blocks: (B:3:0x001a, B:6:0x0067, B:8:0x006d, B:10:0x0075, B:12:0x007d, B:14:0x0085, B:16:0x008f, B:17:0x0099, B:19:0x00a3, B:20:0x00ad, B:22:0x00b7, B:24:0x00c1, B:26:0x00c7, B:27:0x00d0, B:29:0x00e9, B:30:0x00f0, B:32:0x00f6, B:33:0x00fb, B:35:0x0122, B:36:0x0127, B:43:0x0140, B:46:0x0148, B:48:0x0150, B:50:0x0156, B:52:0x015b, B:54:0x015f, B:58:0x0173, B:60:0x017b, B:62:0x0181, B:66:0x018c, B:67:0x019e, B:69:0x01a2, B:70:0x01b8, B:72:0x01c0, B:74:0x01cf, B:75:0x01e5, B:78:0x01f6, B:80:0x01fc, B:84:0x0209, B:86:0x0210, B:88:0x0216, B:114:0x0261, B:115:0x026e, B:124:0x0286, B:126:0x02af, B:127:0x02b5, B:129:0x02bd, B:131:0x02cf, B:132:0x02d8, B:134:0x02e0, B:140:0x02f0, B:144:0x0300, B:149:0x030d, B:153:0x0339, B:155:0x0374, B:156:0x0379, B:158:0x037f, B:160:0x0387, B:162:0x0391, B:163:0x03b1, B:165:0x03bb, B:167:0x03c5, B:168:0x03e5, B:169:0x03ec, B:173:0x041b, B:175:0x0447, B:179:0x045c, B:178:0x0453, B:172:0x0418, B:152:0x0325, B:141:0x02f5, B:142:0x02fa, B:94:0x021f, B:96:0x0225, B:108:0x024a, B:118:0x0279, B:180:0x0464), top: B:191:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0416 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0418 A[Catch: Exception -> 0x0476, TryCatch #3 {Exception -> 0x0476, blocks: (B:3:0x001a, B:6:0x0067, B:8:0x006d, B:10:0x0075, B:12:0x007d, B:14:0x0085, B:16:0x008f, B:17:0x0099, B:19:0x00a3, B:20:0x00ad, B:22:0x00b7, B:24:0x00c1, B:26:0x00c7, B:27:0x00d0, B:29:0x00e9, B:30:0x00f0, B:32:0x00f6, B:33:0x00fb, B:35:0x0122, B:36:0x0127, B:43:0x0140, B:46:0x0148, B:48:0x0150, B:50:0x0156, B:52:0x015b, B:54:0x015f, B:58:0x0173, B:60:0x017b, B:62:0x0181, B:66:0x018c, B:67:0x019e, B:69:0x01a2, B:70:0x01b8, B:72:0x01c0, B:74:0x01cf, B:75:0x01e5, B:78:0x01f6, B:80:0x01fc, B:84:0x0209, B:86:0x0210, B:88:0x0216, B:114:0x0261, B:115:0x026e, B:124:0x0286, B:126:0x02af, B:127:0x02b5, B:129:0x02bd, B:131:0x02cf, B:132:0x02d8, B:134:0x02e0, B:140:0x02f0, B:144:0x0300, B:149:0x030d, B:153:0x0339, B:155:0x0374, B:156:0x0379, B:158:0x037f, B:160:0x0387, B:162:0x0391, B:163:0x03b1, B:165:0x03bb, B:167:0x03c5, B:168:0x03e5, B:169:0x03ec, B:173:0x041b, B:175:0x0447, B:179:0x045c, B:178:0x0453, B:172:0x0418, B:152:0x0325, B:141:0x02f5, B:142:0x02fa, B:94:0x021f, B:96:0x0225, B:108:0x024a, B:118:0x0279, B:180:0x0464), top: B:191:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0447 A[Catch: Exception -> 0x0476, TryCatch #3 {Exception -> 0x0476, blocks: (B:3:0x001a, B:6:0x0067, B:8:0x006d, B:10:0x0075, B:12:0x007d, B:14:0x0085, B:16:0x008f, B:17:0x0099, B:19:0x00a3, B:20:0x00ad, B:22:0x00b7, B:24:0x00c1, B:26:0x00c7, B:27:0x00d0, B:29:0x00e9, B:30:0x00f0, B:32:0x00f6, B:33:0x00fb, B:35:0x0122, B:36:0x0127, B:43:0x0140, B:46:0x0148, B:48:0x0150, B:50:0x0156, B:52:0x015b, B:54:0x015f, B:58:0x0173, B:60:0x017b, B:62:0x0181, B:66:0x018c, B:67:0x019e, B:69:0x01a2, B:70:0x01b8, B:72:0x01c0, B:74:0x01cf, B:75:0x01e5, B:78:0x01f6, B:80:0x01fc, B:84:0x0209, B:86:0x0210, B:88:0x0216, B:114:0x0261, B:115:0x026e, B:124:0x0286, B:126:0x02af, B:127:0x02b5, B:129:0x02bd, B:131:0x02cf, B:132:0x02d8, B:134:0x02e0, B:140:0x02f0, B:144:0x0300, B:149:0x030d, B:153:0x0339, B:155:0x0374, B:156:0x0379, B:158:0x037f, B:160:0x0387, B:162:0x0391, B:163:0x03b1, B:165:0x03bb, B:167:0x03c5, B:168:0x03e5, B:169:0x03ec, B:173:0x041b, B:175:0x0447, B:179:0x045c, B:178:0x0453, B:172:0x0418, B:152:0x0325, B:141:0x02f5, B:142:0x02fa, B:94:0x021f, B:96:0x0225, B:108:0x024a, B:118:0x0279, B:180:0x0464), top: B:191:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x044e  */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // com.mbridge.msdk.mbnative.controller.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(int r25, long r26, int r28, com.mbridge.msdk.c.k r29, java.lang.String r30, java.lang.String r31, com.mbridge.msdk.b.a.a r32, boolean r33) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 1160
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.mbnative.controller.d.a(int, long, int, com.mbridge.msdk.c.k, java.lang.String, java.lang.String, com.mbridge.msdk.b.a.a, boolean):void");
    }

    public static void a(int i2, String str) {
        k kVar;
        if (h.containsKey(str)) {
            kVar = h.get(str);
        } else {
            kVar = new k();
        }
        int iIntValue = i.get(str).intValue();
        int iIntValue2 = j.containsKey(str) ? j.get(str).intValue() : 1;
        if (i2 == 1) {
            int iA = iIntValue + kVar.a();
            kVar.a(iA <= iIntValue2 ? iA : 0);
        } else if (i2 == 2) {
            int iB = iIntValue + kVar.b();
            kVar.b(iB <= iIntValue2 ? iB : 0);
        }
        h.put(str, kVar);
    }

    public static void b(int i2, String str) {
        if (h.containsKey(str)) {
            k kVar = h.get(str);
            if (i2 == 1) {
                kVar.a(0);
            } else if (i2 == 2) {
                kVar.b(0);
            }
            h.put(str, kVar);
        }
    }

    /* compiled from: NativePreloadController.java */
    public class a extends com.mbridge.msdk.mbnative.f.a.b implements com.mbridge.msdk.foundation.same.e.d {
        private int b;
        private int c;
        private int d;
        private int e;
        private int f;
        private Runnable i;
        private com.mbridge.msdk.b.a.a k;
        private List<String> g = null;
        private boolean h = false;
        private boolean j = true;

        public final void a(List<String> list) {
            this.g = list;
        }

        public final void a(int i) {
            this.f = i;
        }

        public final void b(int i) {
            this.d = i;
        }

        public final void c(int i) {
            this.e = i;
        }

        public final void d(int i) {
            this.c = i;
        }

        public a(int i) {
            this.b = i;
        }

        public final void a(com.mbridge.msdk.b.a.a aVar) {
            this.k = aVar;
        }

        public final void b(boolean z) {
            this.j = z;
        }

        @Override // com.mbridge.msdk.foundation.same.e.d
        public final void a(boolean z) {
            this.h = z;
        }

        @Override // com.mbridge.msdk.mbnative.f.a.b
        public final void a(List<com.mbridge.msdk.foundation.same.net.d.b> list, final CampaignUnit campaignUnit) {
            d.this.w = true;
            d.this.a(true, this.k, (String) null);
            d.this.a(new Thread(new Runnable() { // from class: com.mbridge.msdk.mbnative.controller.d.a.1
                @Override // java.lang.Runnable
                public final void run() throws IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
                    boolean z;
                    if (MBridgeConstans.PRELOAD_RESULT_IN_SUBTHREAD && Looper.myLooper() == null) {
                        Looper.prepare();
                        z = true;
                    } else {
                        z = false;
                    }
                    if (a.this.i != null) {
                        d.this.f3121a.removeCallbacks(a.this.i);
                    }
                    if (com.mbridge.msdk.f.b.a()) {
                        d dVar = d.this;
                    }
                    if (d.f.containsKey("0_" + a.this.unitId)) {
                        d.f.remove("0_" + a.this.unitId);
                    }
                    if (a.this.f > 0) {
                        if (campaignUnit.ads.size() <= a.this.f) {
                            a.this.c = campaignUnit.ads.size();
                        } else {
                            a aVar = a.this;
                            aVar.c = aVar.f;
                        }
                    } else if (a.this.f == -1) {
                        a.this.c = 0;
                    } else if (a.this.f == -3) {
                        a.this.c = campaignUnit.ads.size();
                    } else if (a.this.f == -2) {
                        if (campaignUnit.getTemplate() == 3) {
                            if (a.this.e != 0) {
                                a aVar2 = a.this;
                                aVar2.c = aVar2.e;
                            }
                        } else if (a.this.d != 0) {
                            a aVar3 = a.this;
                            aVar3.c = aVar3.d;
                        }
                        if (a.this.c <= 0) {
                            a.this.c = ((Integer) d.i.get(a.this.unitId)).intValue();
                        }
                    }
                    if (campaignUnit.ads.size() < a.this.c) {
                        a.this.c = campaignUnit.ads.size();
                    }
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (int i = 0; i < campaignUnit.ads.size(); i++) {
                        CampaignEx campaignEx = campaignUnit.ads.get(i);
                        campaignEx.setCampaignUnitId(a.this.unitId);
                        boolean zC = ai.c(com.mbridge.msdk.foundation.controller.c.m().c(), campaignEx.getPackageName());
                        d dVar2 = d.this;
                        com.mbridge.msdk.foundation.controller.c.m().c();
                        if (arrayList.size() < a.this.c && campaignEx.getOfferType() != 99) {
                            if (ai.c(campaignEx)) {
                                campaignEx.setRtinsType(zC ? 1 : 2);
                            }
                            if (com.mbridge.msdk.foundation.same.c.a(com.mbridge.msdk.foundation.controller.c.m().c(), campaignEx)) {
                                arrayList.add(campaignEx);
                                if (!TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
                                    arrayList2.add(campaignEx);
                                }
                            } else {
                                ai.a(a.this.unitId, campaignEx, com.mbridge.msdk.foundation.same.a.x);
                            }
                            a.a(a.this, campaignEx, null, null);
                        }
                        d.this.a(d.this.t, campaignEx);
                    }
                    d.a(d.this, arrayList2, a.this.unitId);
                    com.mbridge.msdk.mbnative.a.b<String, List<Campaign>> bVarA = com.mbridge.msdk.mbnative.a.c.a(campaignUnit.getAds().get(0) != null ? campaignUnit.getAds().get(0).getType() : 1);
                    if (bVarA != null) {
                        bVarA.a((com.mbridge.msdk.mbnative.a.b<String, List<Campaign>>) a.this.unitId, (String) arrayList);
                    }
                    d.a(a.this.b, a.this.unitId);
                    if (Looper.myLooper() != null && z) {
                        Looper.loop();
                    }
                    if (campaignUnit.getAds().get(0) != null) {
                        com.mbridge.msdk.click.c.a(com.mbridge.msdk.foundation.controller.c.m().c(), campaignUnit.getAds().get(0).getMaitve(), campaignUnit.getAds().get(0).getMaitve_src());
                    }
                }
            }));
        }

        @Override // com.mbridge.msdk.mbnative.f.a.b
        public final void a(final int i, final String str) {
            d.this.a(new Thread(new Runnable() { // from class: com.mbridge.msdk.mbnative.controller.d.a.3
                @Override // java.lang.Runnable
                public final void run() {
                    boolean z;
                    if (MBridgeConstans.PRELOAD_RESULT_IN_SUBTHREAD && Looper.myLooper() == null) {
                        Looper.prepare();
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!a.this.h) {
                        if (a.this.i != null) {
                            d.this.f3121a.removeCallbacks(a.this.i);
                        }
                        if (a.this.b() == 1 || a.this.j) {
                            d.this.a(str, a.this.b(), a.this.unitId, a.this.placementId, a.this.k);
                        }
                    } else if (a.this.j) {
                        d.this.a(str, a.this.b(), a.this.unitId, a.this.placementId, a.this.k);
                    }
                    if (i == -1) {
                        d.b(a.this.b, a.this.unitId);
                    }
                    if (Looper.myLooper() == null || !z) {
                        return;
                    }
                    Looper.loop();
                }
            }));
        }

        public final void a(Runnable runnable) {
            this.i = runnable;
        }

        @Override // com.mbridge.msdk.mbnative.f.a.b
        public final void b(final List<Frame> list) {
            d.this.a(new Thread(new Runnable() { // from class: com.mbridge.msdk.mbnative.controller.d.a.4
                @Override // java.lang.Runnable
                public final void run() {
                    boolean z;
                    if (MBridgeConstans.PRELOAD_RESULT_IN_SUBTHREAD && Looper.myLooper() == null) {
                        Looper.prepare();
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!a.this.h && a.this.i != null) {
                        d.this.f3121a.removeCallbacks(a.this.i);
                    }
                    List list2 = list;
                    if (list2 != null && list2.size() > 0) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            Iterator<CampaignEx> it2 = ((Frame) it.next()).getCampaigns().iterator();
                            while (it2.hasNext()) {
                                d.this.a(d.this.t, it2.next());
                            }
                        }
                        HashMap map = new HashMap();
                        map.put(Long.valueOf(System.currentTimeMillis()), list);
                        if (d.f.containsKey("1_" + a.this.unitId)) {
                            d.f.remove("1_" + a.this.unitId);
                        }
                        d.f.put("1_" + a.this.unitId, map);
                    }
                    if (Looper.myLooper() == null || !z) {
                        return;
                    }
                    Looper.loop();
                }
            }));
        }

        static /* synthetic */ void a(a aVar, final CampaignEx campaignEx, com.mbridge.msdk.foundation.same.report.d.b bVar, final com.mbridge.msdk.foundation.same.report.d.a.a aVar2) {
            try {
                final Context contextC = com.mbridge.msdk.foundation.controller.c.m().c();
                com.mbridge.msdk.foundation.same.c.a(campaignEx, contextC, bVar, new c.a() { // from class: com.mbridge.msdk.mbnative.controller.d.a.2
                    @Override // com.mbridge.msdk.foundation.same.c.a
                    public final void a(String str, com.mbridge.msdk.foundation.same.report.d.b bVar2) {
                        com.mbridge.msdk.mbnative.e.a.a(str, bVar2, campaignEx, contextC, aVar2);
                    }
                });
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    e.printStackTrace();
                }
            }
        }
    }

    public final void a(String str, int i2, String str2, String str3, com.mbridge.msdk.b.a.a aVar) {
        Log.e(e, str);
        try {
            Queue<Integer> queue = this.b;
            if ((queue != null && queue.size() <= 0) || this.b == null) {
                a(false, aVar, str);
            } else {
                a(i2, this.n, str2, str3, aVar);
            }
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                e2.printStackTrace();
            }
        }
    }

    /* compiled from: NativePreloadController.java */
    public class b implements Runnable {
        private int b;
        private com.mbridge.msdk.foundation.same.e.d c;
        private int d;
        private String e;
        private String f;
        private com.mbridge.msdk.b.a.a g;
        private boolean h = false;

        public final void a(boolean z) {
            this.h = z;
        }

        public final void a(com.mbridge.msdk.b.a.a aVar) {
            this.g = aVar;
        }

        public final void a(String str) {
            this.e = str;
        }

        public b(int i, com.mbridge.msdk.foundation.same.e.d dVar, int i2, String str, String str2) {
            this.b = i;
            this.c = dVar;
            this.d = i2;
            this.e = str;
            this.f = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.c.a(true);
            int i = this.b;
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                d.this.a("REQUEST_TIMEOUT", this.d, this.e, this.f, this.g);
            } else {
                d.this.w = true;
                if (this.h || this.d == 1) {
                    d.this.a("REQUEST_TIMEOUT", this.d, this.e, this.f, this.g);
                }
            }
        }
    }

    public static Map<String, Map<Long, Object>> a() {
        return f;
    }

    public static Map<String, Boolean> b() {
        return g;
    }

    public static Map<String, k> c() {
        return h;
    }

    public static Map<String, Integer> d() {
        return i;
    }

    public static Map<String, Integer> e() {
        return j;
    }

    public final void a(boolean z, com.mbridge.msdk.b.a.a aVar, String str) {
        if (z) {
            if (aVar == null || aVar.a()) {
                return;
            }
            aVar.a(true);
            aVar.onPreloadSucceed();
            return;
        }
        if (aVar == null || aVar.a()) {
            return;
        }
        aVar.a(true);
        aVar.onPreloadFaild(str);
    }

    public final void a(boolean z, Campaign campaign) {
        if (campaign == null) {
            return;
        }
        if (z && campaign.getIconDrawable() == null) {
            campaign.loadIconUrlAsyncWithBlock(null);
        }
        if (z && campaign.getBigDrawable() == null) {
            campaign.loadImageUrlAsyncWithBlock(null);
        }
    }

    public final void a(Thread thread) {
        if (!MBridgeConstans.PRELOAD_RESULT_IN_SUBTHREAD) {
            thread.run();
        } else {
            thread.start();
        }
    }

    static /* synthetic */ void a(d dVar, List list, String str) throws IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        if (list != null) {
            try {
                if (list.size() > 0) {
                    try {
                        Class.forName("com.mbridge.msdk.nativex.view.MBMediaView");
                        Class.forName("com.mbridge.msdk.videocommon.download.b");
                        Class<?> cls = Class.forName("com.mbridge.msdk.videocommon.download.b");
                        Object objInvoke = cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
                        if (objInvoke != null) {
                            cls.getMethod("createUnitCache", Context.class, String.class, CopyOnWriteArrayList.class, Integer.TYPE, Class.forName("com.mbridge.msdk.videocommon.listener.a")).invoke(objInvoke, com.mbridge.msdk.foundation.controller.c.m().c(), str, new CopyOnWriteArrayList(list), 1, null);
                            cls.getMethod("load", String.class).invoke(objInvoke, str);
                        }
                    } catch (Exception unused) {
                        ad.b(e, "please import the videocommon aar");
                    }
                }
            } catch (Exception e2) {
                ad.b(e, com.mbridge.msdk.mbnative.b.a.a(e2));
            }
        }
    }
}
