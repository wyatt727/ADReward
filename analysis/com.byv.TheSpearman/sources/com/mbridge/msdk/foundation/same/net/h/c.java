package com.mbridge.msdk.foundation.same.net.h;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.exoplayer2.upstream.CmcdConfiguration;
import com.json.t2;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.c.k;
import com.mbridge.msdk.foundation.same.DomainNameUtils;
import com.mbridge.msdk.foundation.same.net.Aa;
import com.mbridge.msdk.foundation.same.net.l;
import com.mbridge.msdk.foundation.same.net.n;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.out.CustomInfoManager;
import java.io.File;
import java.util.Map;
import org.json.JSONArray;

/* compiled from: CommonAsyncHttpRequest.java */
/* loaded from: classes4.dex */
public class c {
    private static final String TAG = "c";
    protected Context mContext;

    public c(Context context) {
        if (context == null) {
            this.mContext = com.mbridge.msdk.foundation.controller.c.m().c();
        } else {
            this.mContext = context.getApplicationContext();
        }
    }

    public static void downloadFile(File file, String str, com.mbridge.msdk.foundation.same.net.e eVar) {
        ad.c(TAG, "downloadFile url = " + str);
        n.a().a(file, str, eVar);
    }

    public void choiceV3OrV5BySetting(int i, e eVar, com.mbridge.msdk.foundation.same.net.e eVar2, String str) {
        choiceV3OrV5BySetting(i, eVar, eVar2, str, new com.mbridge.msdk.foundation.same.net.b());
    }

    public void choiceV3OrV5BySetting(int i, e eVar, com.mbridge.msdk.foundation.same.net.e eVar2, String str, l lVar) {
        int iF;
        com.mbridge.msdk.c.g gVarA = com.mbridge.msdk.c.h.a().a(com.mbridge.msdk.foundation.controller.c.m().k());
        if (TextUtils.isEmpty(str)) {
            iF = gVarA.ar();
        } else {
            iF = gVarA.F();
        }
        String strA = com.mbridge.msdk.foundation.same.net.g.d.f().a(str, iF);
        if (iF < 2) {
            if (lVar == null) {
                postV5(i, strA, eVar, eVar2);
                return;
            } else {
                postV5(i, strA, eVar, eVar2, lVar, false);
                return;
            }
        }
        if (iF % 2 == 0) {
            if (eVar == null) {
                eVar = new e();
            }
            JSONArray jSONArrayB = com.mbridge.msdk.foundation.db.a.a.a().b();
            if (jSONArrayB != null) {
                String string = jSONArrayB.toString();
                int iD = com.mbridge.msdk.foundation.same.net.g.d.f().d();
                if (iD > 0 && string.length() > iD) {
                    post(i, strA, eVar, eVar2);
                    return;
                }
                eVar.a(e.h, string);
            }
        }
        e eVar3 = eVar;
        if (lVar == null) {
            getLoadOrSetting(i, strA, eVar3, eVar2);
        } else {
            getLoadOrSetting(i, strA, eVar3, lVar, eVar2, true);
        }
    }

    public void get(int i, String str, e eVar, com.mbridge.msdk.foundation.same.net.e eVar2) {
        get(i, str, eVar, new com.mbridge.msdk.foundation.same.net.b(), eVar2, false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0165 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void get(int r14, java.lang.String r15, com.mbridge.msdk.foundation.same.net.h.e r16, com.mbridge.msdk.foundation.same.net.l r17, com.mbridge.msdk.foundation.same.net.e r18, boolean r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.same.net.h.c.get(int, java.lang.String, com.mbridge.msdk.foundation.same.net.h.e, com.mbridge.msdk.foundation.same.net.l, com.mbridge.msdk.foundation.same.net.e, boolean, boolean):void");
    }

    public void addExtraParams(String str, e eVar) {
        if (eVar != null) {
            String strA = Aa.a();
            if (strA == null) {
                strA = "";
            }
            eVar.a("channel", strA);
            eVar.a("band_width", com.mbridge.msdk.foundation.same.net.a.a().d() + "");
            eVar.a("open", com.mbridge.msdk.foundation.same.a.R);
            if (com.mbridge.msdk.f.b.a() && !TextUtils.isEmpty(str) && str.contains("setting")) {
                String strB = Aa.b();
                if (!TextUtils.isEmpty(strB)) {
                    eVar.a("keyword", strB);
                }
            }
            String str2 = eVar.a().get(MBridgeConstans.PROPERTIES_UNIT_ID);
            if (str2 != null) {
                String customInfoByUnitId = CustomInfoManager.getInstance().getCustomInfoByUnitId(str2, str);
                if (!TextUtils.isEmpty(customInfoByUnitId)) {
                    eVar.a("ch_info", customInfoByUnitId);
                }
                k kVarD = com.mbridge.msdk.c.h.a().d(com.mbridge.msdk.foundation.controller.c.m().k(), str2);
                if (kVarD != null && !TextUtils.isEmpty(kVarD.a())) {
                    eVar.a("u_stid", kVarD.a());
                }
            }
            if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.a()) {
                eVar.a("dev_source", "2");
            }
            if (DomainNameUtils.getInstance().isExcludeCNDomain()) {
                eVar.a("re_domain", "1");
                return;
            }
            return;
        }
        ad.b(TAG, "addExtraParams error, params is null,frame work error");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b2 A[Catch: Exception -> 0x0101, TRY_ENTER, TryCatch #4 {Exception -> 0x0101, blocks: (B:35:0x00b2, B:37:0x00b8, B:41:0x00c3, B:48:0x00e6, B:53:0x0105), top: B:101:0x00b0 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void post(int r15, java.lang.String r16, com.mbridge.msdk.foundation.same.net.h.e r17, com.mbridge.msdk.foundation.same.net.l r18, com.mbridge.msdk.foundation.same.net.e r19, boolean r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 513
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.same.net.h.c.post(int, java.lang.String, com.mbridge.msdk.foundation.same.net.h.e, com.mbridge.msdk.foundation.same.net.l, com.mbridge.msdk.foundation.same.net.e, boolean, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0079 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void get(int r3, java.lang.String r4, java.util.Map<java.lang.String, java.lang.String> r5, com.mbridge.msdk.foundation.same.net.l r6, com.mbridge.msdk.foundation.same.net.e r7) {
        /*
            r2 = this;
            if (r5 != 0) goto L7
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
        L7:
            com.mbridge.msdk.foundation.controller.c r0 = com.mbridge.msdk.foundation.controller.c.m()
            java.lang.String r0 = r0.k()
            java.lang.String r1 = "app_id"
            r5.put(r1, r0)
            java.lang.String r0 = "sdk_version"
            java.lang.String r1 = "MAL_16.7.41"
            r5.put(r0, r1)
            java.lang.String r0 = "platform"
            java.lang.String r1 = "1"
            r5.put(r0, r1)
            java.lang.String r5 = r2.asUrlParams(r5)
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L40
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            java.lang.String r4 = "?"
            r0.append(r4)
            r0.append(r5)
            java.lang.String r4 = r0.toString()
        L40:
            boolean r5 = com.mbridge.msdk.MBridgeConstans.DEBUG
            if (r5 == 0) goto L5a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "get wx scheme url = "
            r5.append(r0)
            r5.append(r4)
            java.lang.String r5 = r5.toString()
            java.lang.String r0 = "AppletsModel"
            com.mbridge.msdk.foundation.tools.ad.a(r0, r5)
        L5a:
            r5 = 0
            r0 = 0
            if (r3 == 0) goto L71
            r1 = 1
            if (r3 == r1) goto L6b
            r1 = 2
            if (r3 == r1) goto L65
            goto L77
        L65:
            com.mbridge.msdk.foundation.same.net.e.c r3 = new com.mbridge.msdk.foundation.same.net.e.c     // Catch: java.lang.Exception -> L77
            r3.<init>(r5, r4, r0, r7)     // Catch: java.lang.Exception -> L77
            goto L76
        L6b:
            com.mbridge.msdk.foundation.same.net.e.d r3 = new com.mbridge.msdk.foundation.same.net.e.d     // Catch: java.lang.Exception -> L77
            r3.<init>(r5, r4, r0, r7)     // Catch: java.lang.Exception -> L77
            goto L76
        L71:
            com.mbridge.msdk.foundation.same.net.e.f r3 = new com.mbridge.msdk.foundation.same.net.e.f     // Catch: java.lang.Exception -> L77
            r3.<init>(r5, r4, r0, r7)     // Catch: java.lang.Exception -> L77
        L76:
            r0 = r3
        L77:
            if (r0 == 0) goto L86
            r0.a(r6)     // Catch: java.lang.Exception -> L86
            int r3 = r0.b()     // Catch: java.lang.Exception -> L86
            r0.a(r3)     // Catch: java.lang.Exception -> L86
            com.mbridge.msdk.foundation.same.net.n.a(r0)     // Catch: java.lang.Exception -> L86
        L86:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.same.net.h.c.get(int, java.lang.String, java.util.Map, com.mbridge.msdk.foundation.same.net.l, com.mbridge.msdk.foundation.same.net.e):void");
    }

    private String asUrlParams(Map<String, String> map) {
        if (map != null && map.size() != 0) {
            StringBuilder sb = new StringBuilder();
            try {
                for (String str : map.keySet()) {
                    if (!TextUtils.isEmpty(str)) {
                        String str2 = map.get(str);
                        if (TextUtils.isEmpty(str2)) {
                            str2 = "";
                        }
                        sb.append(t2.i.c);
                        sb.append(str);
                        sb.append(t2.i.b);
                        sb.append(str2);
                    }
                }
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    ad.b(TAG, e.getMessage());
                }
                sb = null;
            }
            if (sb != null && sb.length() > 0) {
                return sb.toString();
            }
        }
        return null;
    }

    public void getCampaign(int i, String str, e eVar, l lVar, com.mbridge.msdk.foundation.same.net.e eVar2) {
        int iF;
        e eVar3;
        try {
            com.mbridge.msdk.c.g gVarA = com.mbridge.msdk.c.h.a().a(com.mbridge.msdk.foundation.controller.c.m().k());
            if (TextUtils.isEmpty(str)) {
                iF = gVarA.ar();
            } else {
                iF = gVarA.F();
            }
            String strA = com.mbridge.msdk.foundation.same.net.g.d.f().a(str, iF);
            if (lVar == null) {
                lVar = new com.mbridge.msdk.foundation.same.net.b();
            }
            if (iF < 2) {
                postV5(i, strA, eVar, eVar2, lVar, true);
                return;
            }
            if (iF % 2 == 0) {
                if (eVar == null) {
                    eVar = new e();
                }
                eVar3 = eVar;
                JSONArray jSONArrayB = com.mbridge.msdk.foundation.db.a.a.a().b();
                if (jSONArrayB != null) {
                    String string = jSONArrayB.toString();
                    int iD = com.mbridge.msdk.foundation.same.net.g.d.f().d();
                    if (iD > 0 && string.length() > iD) {
                        post(i, strA, eVar3, lVar, eVar2, true, false);
                        return;
                    }
                    eVar3.a(e.h, string);
                }
            } else {
                eVar3 = eVar;
            }
            get(i, strA, eVar3, lVar, eVar2, true, true);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                ad.b(TAG, e.getMessage());
            }
        }
    }

    public void getLoadOrSetting(int i, String str, e eVar, com.mbridge.msdk.foundation.same.net.e eVar2) {
        getLoadOrSetting(i, str, eVar, new com.mbridge.msdk.foundation.same.net.b(), eVar2, true);
    }

    public void getLoadOrSetting(int i, String str, e eVar, l lVar, com.mbridge.msdk.foundation.same.net.e eVar2, boolean z) {
        get(i, str, eVar, lVar, eVar2, z, false);
    }

    public void post(int i, String str, e eVar, com.mbridge.msdk.foundation.same.net.e eVar2) {
        post(i, str, eVar, new com.mbridge.msdk.foundation.same.net.b(), eVar2, false, false);
    }

    public void postFocusReport(int i, String str, e eVar, com.mbridge.msdk.foundation.same.net.e eVar2) {
        post(i, str, eVar, new com.mbridge.msdk.foundation.same.net.b(), eVar2, false, true);
    }

    public void postV5(int i, String str, e eVar, com.mbridge.msdk.foundation.same.net.e eVar2) {
        String str2 = eVar.a().get("sign");
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        eVar.a("ts", jCurrentTimeMillis + "");
        eVar.a(CmcdConfiguration.KEY_STREAM_TYPE, SameMD5.getMD5(jCurrentTimeMillis + str2));
        post(i, str, eVar, new com.mbridge.msdk.foundation.same.net.b(), eVar2, false, false);
    }

    public void postV5(int i, String str, e eVar, com.mbridge.msdk.foundation.same.net.e eVar2, l lVar, boolean z) {
        String str2 = eVar.a().get("sign");
        if (str2 == null) {
            str2 = "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        eVar.a("ts", jCurrentTimeMillis + "");
        eVar.a(CmcdConfiguration.KEY_STREAM_TYPE, SameMD5.getMD5(jCurrentTimeMillis + str2));
        if (lVar != null) {
            post(i, str, eVar, lVar, eVar2, z, false);
        } else {
            post(i, str, eVar, new com.mbridge.msdk.foundation.same.net.b(), eVar2, z, false);
        }
    }
}
