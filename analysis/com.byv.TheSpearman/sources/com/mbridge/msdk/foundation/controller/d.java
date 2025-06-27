package com.mbridge.msdk.foundation.controller;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.MBridgeSDK;
import com.mbridge.msdk.c.g;
import com.mbridge.msdk.c.h;
import com.mbridge.msdk.c.j;
import com.mbridge.msdk.foundation.controller.a;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.l;
import com.mbridge.msdk.foundation.same.net.n;
import com.mbridge.msdk.foundation.same.report.i;
import com.mbridge.msdk.foundation.same.report.k;
import com.mbridge.msdk.foundation.tools.FastKV;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.af;
import com.mbridge.msdk.foundation.tools.ag;
import com.mbridge.msdk.foundation.tools.x;
import com.mbridge.msdk.foundation.tools.z;
import com.mbridge.msdk.out.MBridgeSDKFactory;
import java.util.List;
import java.util.Map;

/* compiled from: SDKController.java */
/* loaded from: classes4.dex */
public class d {
    private static volatile d e;
    private int f;
    private Map<String, Object> g;
    private FastKV h;
    private String j;
    private String k;
    private String l;
    private Context m;
    private String n;
    private com.mbridge.msdk.b.a o;
    private String p;

    /* renamed from: a, reason: collision with root package name */
    public final int f2764a = 4;
    public final int b = 5;
    public final int c = 2;
    private boolean i = false;
    Handler d = new Handler(Looper.getMainLooper()) { // from class: com.mbridge.msdk.foundation.controller.d.6
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            List list;
            List list2;
            try {
                int i = message.what;
                if (i == 2) {
                    if (!(message.obj instanceof List) || (list = (List) message.obj) == null || list.size() <= 0) {
                        return;
                    }
                    i iVar = new i(d.this.m, 0);
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        l lVar = (l) list.get(i2);
                        boolean z = false;
                        if (i2 == list.size() - 1) {
                            z = true;
                        }
                        iVar.a(lVar, z);
                    }
                    return;
                }
                if (i == 7) {
                    if (message.obj == null || !(message.obj instanceof List) || (list2 = (List) message.obj) == null) {
                        return;
                    }
                    list2.size();
                    return;
                }
                if (i == 9) {
                    g gVar = (g) message.obj;
                    com.mbridge.msdk.foundation.tools.g gVarD = c.m().d();
                    if (gVarD != null && gVarD.b() && gVar != null && gVar.J() == 1) {
                        com.mbridge.msdk.foundation.same.report.b.d.a(d.this.m).b();
                    }
                    if (gVarD == null || !gVarD.a()) {
                        return;
                    }
                    com.mbridge.msdk.foundation.same.report.b.c.a();
                    return;
                }
                if (i == 4) {
                    String str = (String) message.obj;
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    if (com.mbridge.msdk.foundation.same.report.e.a().b()) {
                        com.mbridge.msdk.foundation.same.report.e.a().a(str);
                        return;
                    } else {
                        new i(d.this.m, 0).a("click_duration", str, null, null);
                        return;
                    }
                }
                if (i != 5) {
                    return;
                }
                String str2 = (String) message.obj;
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                if (com.mbridge.msdk.foundation.same.report.e.a().b()) {
                    com.mbridge.msdk.foundation.same.report.e.a().a(str2);
                } else {
                    new i(d.this.m, 0).a("load_duration", str2, null, null);
                }
            } catch (Exception unused) {
                ad.b("SDKController", "REPORT HANDLE ERROR!");
            }
        }
    };

    private d() {
    }

    public static d a() {
        if (e == null) {
            synchronized (d.class) {
                if (e == null) {
                    e = new d();
                }
            }
        }
        return e;
    }

    public final void a(Map map, final Context context) {
        Object obj;
        String string;
        if (context != null) {
            if (!TextUtils.isEmpty(MBridgeConstans.DEVELOPER_CUSTOM_PACKAGE)) {
                c.m().f(MBridgeConstans.DEVELOPER_CUSTOM_PACKAGE);
            } else if (map.containsKey(MBridgeConstans.KEY_MBRIDGE_CUSTOM_PACKAGE_NAME) && (obj = map.get(MBridgeConstans.KEY_MBRIDGE_CUSTOM_PACKAGE_NAME)) != null) {
                String str = (String) obj;
                if (!TextUtils.isEmpty(str)) {
                    c.m().f(str);
                }
            }
            if (map != null) {
                if (map.containsKey(MBridgeConstans.ID_MBRIDGE_APPID)) {
                    this.j = (String) map.get(MBridgeConstans.ID_MBRIDGE_APPID);
                }
                if (map.containsKey(MBridgeConstans.ID_MBRIDGE_APPKEY)) {
                    this.k = (String) map.get(MBridgeConstans.ID_MBRIDGE_APPKEY);
                }
                if (map.containsKey(MBridgeConstans.ID_MBRIDGE_WX_APPID)) {
                    this.p = (String) map.get(MBridgeConstans.ID_MBRIDGE_WX_APPID);
                }
                if (map.containsKey(MBridgeConstans.PACKAGE_NAME_MANIFEST)) {
                    this.l = (String) map.get(MBridgeConstans.PACKAGE_NAME_MANIFEST);
                }
                if (map.containsKey(MBridgeConstans.ID_MBRIDGE_STARTUPCRASH)) {
                    this.n = (String) map.get(MBridgeConstans.ID_MBRIDGE_STARTUPCRASH);
                }
            }
            this.m = context.getApplicationContext();
            c.m().b(this.m);
            c.m().d(this.j);
            c.m().e(this.k);
            c.m().a(this.p);
            c.m().c(this.l);
            c.m().a(new a.InterfaceC0263a() { // from class: com.mbridge.msdk.foundation.controller.d.4
            }, this.d);
            try {
                com.mbridge.msdk.foundation.same.net.g.d.f().e();
            } catch (Throwable th) {
                ad.b("SDKController", th.getMessage());
            }
            try {
                n.a(this.m);
            } catch (Exception e2) {
                ad.b("SDKController", e2.getMessage());
            }
            if (this.i) {
                return;
            }
            ag.a(this.m);
            Context applicationContext = this.m.getApplicationContext();
            try {
                if (this.h == null) {
                    try {
                        this.h = new FastKV.Builder(com.mbridge.msdk.foundation.same.b.e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_700_CONFIG), x.a("H+tU+FeXHM==")).build();
                    } catch (Exception unused) {
                        this.h = null;
                    }
                }
                FastKV fastKV = this.h;
                String string2 = "";
                if (fastKV != null) {
                    String string3 = fastKV.getString(x.a("H+tU+bfPhM=="), "");
                    String string4 = this.h.getString(x.a("H+tU+Fz8"), "");
                    if (TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.U) && TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.g)) {
                        com.mbridge.msdk.foundation.same.a.U = com.mbridge.msdk.foundation.a.a.a.a().a(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B);
                        com.mbridge.msdk.foundation.same.a.g = com.mbridge.msdk.foundation.a.a.a.a().a("c");
                    }
                    if (TextUtils.isEmpty(string3) && TextUtils.isEmpty(string4)) {
                        if (!TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.U) || !TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.g)) {
                            this.h.putString(x.a("H+tU+bfPhM=="), com.mbridge.msdk.foundation.same.a.U);
                            this.h.putString(x.a("H+tU+Fz8"), com.mbridge.msdk.foundation.same.a.g);
                        }
                    } else {
                        com.mbridge.msdk.foundation.same.a.U = string3;
                        com.mbridge.msdk.foundation.same.a.g = string4;
                        com.mbridge.msdk.foundation.a.a.a.a().a(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, com.mbridge.msdk.foundation.same.a.U);
                        com.mbridge.msdk.foundation.a.a.a.a().a("c", com.mbridge.msdk.foundation.same.a.g);
                    }
                } else {
                    SharedPreferences sharedPreferences = applicationContext.getSharedPreferences(x.a("H+tU+FeXHM=="), 0);
                    if (sharedPreferences != null) {
                        string2 = sharedPreferences.getString(x.a("H+tU+bfPhM=="), "");
                        string = sharedPreferences.getString(x.a("H+tU+Fz8"), "");
                    } else {
                        string = "";
                    }
                    if (TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.U) && TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.g)) {
                        com.mbridge.msdk.foundation.same.a.U = com.mbridge.msdk.foundation.a.a.a.a().a(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B);
                        com.mbridge.msdk.foundation.same.a.g = com.mbridge.msdk.foundation.a.a.a.a().a("c");
                    }
                    if (TextUtils.isEmpty(string2) && TextUtils.isEmpty(string)) {
                        if ((!TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.U) || !TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.g)) && sharedPreferences != null) {
                            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                            editorEdit.putString(x.a("H+tU+bfPhM=="), com.mbridge.msdk.foundation.same.a.U);
                            editorEdit.putString(x.a("H+tU+Fz8"), com.mbridge.msdk.foundation.same.a.g);
                            editorEdit.apply();
                        }
                    } else {
                        com.mbridge.msdk.foundation.same.a.U = string2;
                        com.mbridge.msdk.foundation.same.a.g = string;
                        com.mbridge.msdk.foundation.a.a.a.a().a(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, com.mbridge.msdk.foundation.same.a.U);
                        com.mbridge.msdk.foundation.a.a.a.a().a("c", com.mbridge.msdk.foundation.same.a.g);
                    }
                }
            } catch (Throwable th2) {
                ad.a("SDKController", th2.getMessage(), th2);
            }
            try {
                com.mbridge.msdk.foundation.same.f.b.b().execute(new Runnable() { // from class: com.mbridge.msdk.foundation.controller.d.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        Looper.prepare();
                        d.a(d.this);
                        d.b(d.this);
                        Looper.loop();
                    }
                });
                com.mbridge.msdk.foundation.same.f.b.b().execute(new Runnable() { // from class: com.mbridge.msdk.foundation.controller.d.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        d dVar = d.this;
                        d.a(dVar, dVar.j);
                        if (!TextUtils.isEmpty(d.this.j)) {
                            com.mbridge.msdk.foundation.a.a.a.a().a(MBridgeConstans.SDK_APP_ID, d.this.j);
                        }
                        new i(d.this.m).a();
                        d.this.b();
                    }
                });
                k.c();
            } catch (Exception unused2) {
                ad.b("SDKController", "get app setting failed");
            }
            this.i = true;
            z.f(context);
            long jAz = h.a().a(this.j).az();
            if (jAz != 1300) {
                this.d.postDelayed(new Runnable() { // from class: com.mbridge.msdk.foundation.controller.d.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        z.d(context);
                    }
                }, jAz);
            }
        }
    }

    public final void b() {
        if (this.m == null || this.d == null) {
            return;
        }
        try {
            int i = af.a().a("e_r_r_c_t_r_l", false) ? 5 : 1;
            com.mbridge.msdk.foundation.same.report.c.a.a();
            Context context = this.m;
            String string = null;
            List<l> listA = (context != null && com.mbridge.msdk.foundation.db.n.a(com.mbridge.msdk.foundation.db.h.a(context)).a() > 0) ? com.mbridge.msdk.foundation.db.n.a(com.mbridge.msdk.foundation.db.h.a(context)).a(i) : null;
            if (listA != null && listA.size() > 0) {
                Message messageObtainMessage = this.d.obtainMessage();
                messageObtainMessage.what = 2;
                messageObtainMessage.obj = listA;
                this.d.sendMessage(messageObtainMessage);
            }
            com.mbridge.msdk.foundation.db.h hVarA = com.mbridge.msdk.foundation.db.h.a(this.m);
            com.mbridge.msdk.foundation.db.e eVarA = com.mbridge.msdk.foundation.db.e.a(hVarA);
            if (eVarA.a() >= 20) {
                String strA = com.mbridge.msdk.foundation.entity.e.a(eVarA.a(20));
                Message messageObtain = Message.obtain();
                messageObtain.obj = strA;
                messageObtain.what = 4;
                this.d.sendMessage(messageObtain);
            }
            com.mbridge.msdk.foundation.db.l lVarA = com.mbridge.msdk.foundation.db.l.a(hVarA);
            if (lVarA.a() > 20) {
                List<com.mbridge.msdk.foundation.entity.h> listA2 = lVarA.a(20);
                if (listA2 != null && listA2.size() > 0) {
                    StringBuffer stringBuffer = new StringBuffer();
                    for (com.mbridge.msdk.foundation.entity.h hVar : listA2) {
                        if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                            stringBuffer.append("ad_source_id=" + hVar.a());
                            stringBuffer.append("&time=" + hVar.b());
                            stringBuffer.append("&num=" + hVar.c());
                            stringBuffer.append("&unit_id=" + hVar.d());
                            stringBuffer.append("&key=2000006");
                            stringBuffer.append("&fb=" + hVar.e());
                            stringBuffer.append("&network_str=" + hVar.f());
                            stringBuffer.append("&network_type=" + hVar.g());
                        } else {
                            stringBuffer.append("ad_source_id=" + hVar.a());
                            stringBuffer.append("&time=" + hVar.b());
                            stringBuffer.append("&num=" + hVar.c());
                            stringBuffer.append("&unit_id=" + hVar.d());
                            stringBuffer.append("&key=2000006");
                            stringBuffer.append("&fb=" + hVar.e());
                        }
                        if (hVar.h() == 1) {
                            stringBuffer.append("&hb=1");
                        }
                        stringBuffer.append("&timeout=" + hVar.i() + "\n");
                    }
                    string = stringBuffer.toString();
                }
                Message messageObtain2 = Message.obtain();
                messageObtain2.obj = string;
                messageObtain2.what = 5;
                this.d.sendMessage(messageObtain2);
            }
        } catch (Exception unused) {
            if (MBridgeConstans.DEBUG) {
                ad.b("SDKController", "report netstate error !");
            }
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x008a -> B:34:0x008d). Please report as a decompilation issue!!! */
    public final void a(Map<String, Object> map, int i) {
        if (MBridgeSDKFactory.getMBridgeSDK().getStatus() != MBridgeSDK.PLUGIN_LOAD_STATUS.COMPLETED) {
            ad.b("SDKController", "preloaad failed,sdk do not inited");
            return;
        }
        this.g = map;
        this.f = i;
        c.m().k();
        if (map != null) {
            if (this.o == null) {
                this.o = new com.mbridge.msdk.b.a();
            }
            try {
                Map<String, Object> map2 = this.g;
                if (map2 != null && map2.size() > 0 && this.g.containsKey(MBridgeConstans.PROPERTIES_LAYOUT_TYPE)) {
                    int iIntValue = ((Integer) this.g.get(MBridgeConstans.PROPERTIES_LAYOUT_TYPE)).intValue();
                    if (iIntValue == 0) {
                        Map<String, Object> map3 = this.g;
                        int i2 = this.f;
                        try {
                            Class<?> cls = Class.forName("com.mbridge.msdk.mbnative.f.a");
                            cls.getMethod("preload", Map.class, Integer.TYPE).invoke(cls.newInstance(), map3, Integer.valueOf(i2));
                        } catch (Exception unused) {
                        }
                    } else if (1 != iIntValue && 2 != iIntValue) {
                        ad.b("SDKController", "unknow layout type in preload");
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public final void c() {
        Handler handler = this.d;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    static /* synthetic */ void a(d dVar) {
        try {
            Class<?> cls = Class.forName("com.mbridge.msdk.d.b");
            cls.getDeclaredMethod("start", new Class[0]).invoke(cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]), new Object[0]);
        } catch (Throwable th) {
            ad.a("SDKController", th.getMessage(), th);
        }
    }

    static /* synthetic */ void b(d dVar) {
        List<com.mbridge.msdk.foundation.entity.a> listK;
        Object objNewInstance;
        Class<?> cls;
        Object objNewInstance2;
        try {
            g gVarB = h.a().b(c.m().k());
            if (gVarB == null || (listK = gVarB.k()) == null || listK.size() <= 0) {
                return;
            }
            for (com.mbridge.msdk.foundation.entity.a aVar : listK) {
                if (aVar.a() == 287) {
                    Class<?> cls2 = Class.forName("com.mbridge.msdk.interstitialvideo.out.MBInterstitialVideoHandler");
                    if (dVar.m != null && cls2 != null && (objNewInstance = cls2.getConstructor(String.class, String.class).newInstance("", aVar.b())) != null) {
                        cls2.getMethod("loadFormSelfFilling", new Class[0]).invoke(objNewInstance, new Object[0]);
                    }
                } else if (aVar.a() == 94 && (cls = Class.forName("com.mbridge.msdk.out.MBRewardVideoHandler")) != null && (objNewInstance2 = cls.getConstructor(String.class, String.class).newInstance("", aVar.b())) != null) {
                    cls.getMethod("loadFormSelfFilling", new Class[0]).invoke(objNewInstance2, new Object[0]);
                }
            }
        } catch (Throwable th) {
            if (MBridgeConstans.DEBUG) {
                th.printStackTrace();
            }
        }
    }

    static /* synthetic */ void a(d dVar, final String str) {
        if (h.a() == null) {
            return;
        }
        h hVarA = h.a();
        if (hVarA != null) {
            g gVarB = hVarA.b(str);
            if (gVarB != null) {
                MBridgeConstans.OMID_JS_SERVICE_URL = gVarB.W();
                MBridgeConstans.OMID_JS_H5_URL = gVarB.V();
                if (!TextUtils.isEmpty(gVarB.y())) {
                    com.mbridge.msdk.foundation.same.net.g.d.f().h = gVarB.y();
                    com.mbridge.msdk.foundation.same.net.g.d.f().b();
                }
                if (!TextUtils.isEmpty(gVarB.z())) {
                    com.mbridge.msdk.foundation.same.net.g.d.f().l = gVarB.z();
                    com.mbridge.msdk.foundation.same.net.g.d.f().c();
                }
            } else {
                MBridgeConstans.OMID_JS_SERVICE_URL = com.mbridge.msdk.c.a.b.b;
                MBridgeConstans.OMID_JS_H5_URL = com.mbridge.msdk.c.a.b.f2494a;
            }
        }
        if (h.a().d(str) && h.a().a(str, 1, (String) null)) {
            if (com.mbridge.msdk.foundation.a.a.a.a().a("is_first_init", 0) == 0) {
                try {
                    com.mbridge.msdk.foundation.a.a.a.a().b("is_first_init", 1);
                    if (TextUtils.isEmpty(z.c())) {
                        dVar.d.postDelayed(new Runnable() { // from class: com.mbridge.msdk.foundation.controller.d.5
                            @Override // java.lang.Runnable
                            public final void run() {
                                new j().a(d.this.m, str, d.this.k);
                            }
                        }, 350L);
                    } else {
                        new j().a(dVar.m, str, dVar.k);
                    }
                    return;
                } catch (Throwable unused) {
                    new j().a(dVar.m, str, dVar.k);
                    return;
                }
            }
            new j().a(dVar.m, str, dVar.k);
        }
    }
}
