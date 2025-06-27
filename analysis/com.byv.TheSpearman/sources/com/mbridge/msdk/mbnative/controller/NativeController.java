package com.mbridge.msdk.mbnative.controller;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.room.RoomMasterTable;
import com.iab.omid.library.mmadbridge.adsession.AdEvents;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.c.j;
import com.mbridge.msdk.c.k;
import com.mbridge.msdk.foundation.db.h;
import com.mbridge.msdk.foundation.db.q;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.download.download.HTMLResourceManager;
import com.mbridge.msdk.foundation.download.download.ResourceManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.entity.n;
import com.mbridge.msdk.foundation.same.c;
import com.mbridge.msdk.foundation.same.e.a;
import com.mbridge.msdk.foundation.same.report.i;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.ab;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.x;
import com.mbridge.msdk.foundation.tools.z;
import com.mbridge.msdk.mbnative.controller.c;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.out.NativeListener;
import com.my.tracker.ads.AdFormat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class NativeController extends com.mbridge.msdk.mbnative.controller.a {
    public static Map<String, Long> b = new HashMap();
    private static final String f = "NativeController";
    private static boolean g;
    private boolean A;
    private int B;
    private int C;
    private int D;
    private int E;
    private com.mbridge.msdk.foundation.same.e.b F;
    private List<com.mbridge.msdk.mbnative.controller.c> G;
    private List<c.a> H;
    private CopyOnWriteArrayList<com.mbridge.msdk.foundation.same.e.a> I;
    private Hashtable<String, AdSession> J;
    private int K;
    private int L;
    private a M;
    private boolean N;
    private boolean O;
    private Timer P;
    private String Q;
    private String R;
    private ViewTreeObserver.OnGlobalLayoutListener S;
    private k T;
    private long U;
    private int V;
    private int W;
    private boolean X;
    private int Y;
    private int Z;
    private boolean aa;
    private List<Campaign> ab;
    private String ac;
    private AdEvents ad;
    protected List<Integer> c;
    protected List<Integer> d;
    Map<String, Object> e;
    private j h;
    private com.mbridge.msdk.mbnative.d.a i;
    private NativeListener.NativeTrackingListener j;
    private Context k;
    private String l;
    private String m;
    private Queue<Integer> n;
    private Queue<Long> o;
    private String p;
    private i q;
    private String r;
    private com.mbridge.msdk.click.a s;
    private int t;
    private int u;
    private int v;
    private int w;
    private String x;
    private boolean y;
    private boolean z;

    public interface b {
        void a();
    }

    public NativeController(com.mbridge.msdk.mbnative.d.a aVar, NativeListener.NativeTrackingListener nativeTrackingListener, Map<String, Object> map, Context context) {
        com.mbridge.msdk.mbnative.a.b<String, List<Campaign>> bVarA;
        int iIntValue;
        Object obj;
        this.t = 1;
        this.u = 1;
        this.v = -1;
        this.w = 0;
        this.y = false;
        this.z = false;
        this.A = false;
        this.B = 0;
        this.C = 0;
        this.D = 0;
        this.E = 0;
        this.I = new CopyOnWriteArrayList<>();
        this.J = new Hashtable<>();
        this.K = 1;
        this.L = 2;
        this.Q = "";
        this.R = "";
        this.ac = "";
        this.k = context;
        this.e = map;
        this.h = new j();
        this.i = aVar;
        this.j = nativeTrackingListener;
        this.G = new ArrayList();
        this.H = new ArrayList();
        String str = (String) map.get(MBridgeConstans.PROPERTIES_UNIT_ID);
        this.l = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (map.containsKey(MBridgeConstans.PLACEMENT_ID) && map.get(MBridgeConstans.PLACEMENT_ID) != null) {
            this.m = (String) map.get(MBridgeConstans.PLACEMENT_ID);
        } else {
            this.m = "";
        }
        if (map.containsKey(MBridgeConstans.PREIMAGE) && (obj = map.get(MBridgeConstans.PREIMAGE)) != null) {
            g = ((Boolean) obj).booleanValue();
        }
        this.n = new LinkedList();
        this.o = new LinkedList();
        this.F = new com.mbridge.msdk.foundation.same.e.b(this.k);
        if (Looper.myLooper() == null) {
            Looper.prepare();
        }
        this.f3120a = new e(this);
        if (map.containsKey(MBridgeConstans.PROPERTIES_API_REUQEST_CATEGORY)) {
            this.x = (String) map.get(MBridgeConstans.PROPERTIES_API_REUQEST_CATEGORY);
        }
        try {
            boolean zEquals = com.mbridge.msdk.mbnative.controller.d.b().containsKey(this.l) ? Boolean.TRUE.equals(com.mbridge.msdk.mbnative.controller.d.b().get(this.l)) : false;
            Object obj2 = map.get("ad_num");
            Object obj3 = map.get(MBridgeConstans.PROPERTIES_AD_FRAME_NUM);
            if (!zEquals) {
                if (map.containsKey("ad_num") && obj2 != null) {
                    try {
                        iIntValue = ((Integer) obj2).intValue();
                    } catch (Exception e2) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b(f, e2.getMessage());
                        }
                        iIntValue = 1;
                    }
                    iIntValue = iIntValue < 1 ? 1 : iIntValue;
                    iIntValue = iIntValue > 10 ? 10 : iIntValue;
                    this.u = iIntValue;
                    this.t = iIntValue;
                }
                if (map.containsKey(MBridgeConstans.PROPERTIES_AD_FRAME_NUM) && obj3 != null) {
                    try {
                        this.D = ((Integer) obj3).intValue();
                    } catch (Exception e3) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b(f, e3.getMessage());
                        }
                    }
                }
            } else if (com.mbridge.msdk.mbnative.controller.d.d().containsKey(this.l)) {
                Integer num = com.mbridge.msdk.mbnative.controller.d.d().get(this.l);
                if (num != null) {
                    this.u = num.intValue();
                }
                if (map.containsKey("ad_num") && obj2 != null) {
                    int iIntValue2 = ((Integer) obj2).intValue();
                    this.B = iIntValue2;
                    this.t = iIntValue2;
                }
                if (map.containsKey(MBridgeConstans.PROPERTIES_AD_FRAME_NUM) && obj3 != null) {
                    int iIntValue3 = ((Integer) obj3).intValue();
                    this.C = iIntValue3;
                    this.D = iIntValue3;
                }
            }
        } catch (Exception e4) {
            ad.b(f, com.mbridge.msdk.mbnative.b.a.a(e4));
        }
        this.q = new i(this.k);
        this.s = new com.mbridge.msdk.click.a(this.k, this.l);
        try {
            Class.forName("com.mbridge.msdk.nativex.view.MBMediaView");
            Class.forName("com.mbridge.msdk.videocommon.download.b");
            this.O = true;
            Map<String, Object> map2 = this.e;
            if (map2 != null && (map2.containsKey(MBridgeConstans.NATIVE_VIDEO_WIDTH) || this.e.containsKey(MBridgeConstans.NATIVE_VIDEO_HEIGHT) || map.containsKey(MBridgeConstans.NATIVE_VIDEO_SUPPORT))) {
                this.N = true;
            }
            com.mbridge.msdk.mbnative.controller.e.a(this.k, this.l);
            ab.a();
            if (TextUtils.isEmpty(this.l)) {
                return;
            }
            com.mbridge.msdk.foundation.db.f.a(h.a(this.k)).a();
            int iA = a(map.containsKey(MBridgeConstans.NATIVE_INFO) ? (String) map.get(MBridgeConstans.NATIVE_INFO) : null);
            String str2 = this.l;
            iA = iA <= 0 ? this.t : iA;
            k kVarD = com.mbridge.msdk.c.h.a().d("", str2);
            this.T = kVarD;
            if (kVarD == null) {
                this.T = k.d(str2);
            }
            List<Integer> listB = this.T.b();
            this.c = listB;
            List<Campaign> listB2 = (listB == null || listB.size() <= 0 || !this.c.contains(1) || (bVarA = com.mbridge.msdk.mbnative.a.c.a(1)) == null) ? null : bVarA.b(str2, iA);
            if (listB2 != null) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < listB2.size(); i++) {
                    CampaignEx campaignEx = (CampaignEx) listB2.get(i);
                    if (!TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
                        arrayList.add(campaignEx);
                    }
                }
                if (arrayList.size() > 0) {
                    Class<?> cls = Class.forName("com.mbridge.msdk.videocommon.download.b");
                    Class<?> cls2 = Class.forName("com.mbridge.msdk.videocommon.listener.a");
                    Object objInvoke = cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
                    cls.getMethod("createUnitCache", Context.class, String.class, CopyOnWriteArrayList.class, Integer.TYPE, cls2).invoke(objInvoke, context, this.l, new CopyOnWriteArrayList(arrayList), 1, null);
                    cls.getMethod("load", String.class).invoke(objInvoke, this.l);
                }
            }
        } catch (Throwable unused) {
            ad.b(f, "please import the nativex aar");
        }
    }

    public NativeController() {
        this.t = 1;
        this.u = 1;
        this.v = -1;
        this.w = 0;
        this.y = false;
        this.z = false;
        this.A = false;
        this.B = 0;
        this.C = 0;
        this.D = 0;
        this.E = 0;
        this.I = new CopyOnWriteArrayList<>();
        this.J = new Hashtable<>();
        this.K = 1;
        this.L = 2;
        this.Q = "";
        this.R = "";
        this.ac = "";
    }

    public static boolean a(Map<String, Object> map) {
        if (map == null) {
            return false;
        }
        try {
            if (map.containsKey("app_id") && map.containsKey("app_key") && map.containsKey(MBridgeConstans.KEY_WORD)) {
                return map.get(MBridgeConstans.KEY_WORD) != null;
            }
            return false;
        } catch (Exception e2) {
            ad.b(f, com.mbridge.msdk.mbnative.b.a.a(e2));
            return false;
        }
    }

    public static List<String> b(Map<String, Object> map) {
        ArrayList arrayList = null;
        try {
            if (!(map.get(MBridgeConstans.KEY_WORD) instanceof String)) {
                return null;
            }
            String str = (String) map.get(MBridgeConstans.KEY_WORD);
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() == 0) {
                return null;
            }
            ArrayList arrayList2 = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                    if (jSONObjectOptJSONObject != null) {
                        String strOptString = jSONObjectOptJSONObject.optString("p");
                        if (!TextUtils.isEmpty(strOptString)) {
                            arrayList2.add(strOptString);
                        }
                    }
                } catch (Exception e2) {
                    e = e2;
                    arrayList = arrayList2;
                    ad.b(f, com.mbridge.msdk.mbnative.b.a.a(e));
                    return arrayList;
                }
            }
            return arrayList2;
        } catch (Exception e3) {
            e = e3;
        }
    }

    public static void insertExcludeId(String str, CampaignEx campaignEx) {
        if (TextUtils.isEmpty(str) || campaignEx == null || com.mbridge.msdk.foundation.controller.c.m().c() == null) {
            return;
        }
        com.mbridge.msdk.foundation.db.j jVarA = com.mbridge.msdk.foundation.db.j.a(h.a(com.mbridge.msdk.foundation.controller.c.m().c()));
        com.mbridge.msdk.foundation.entity.f fVar = new com.mbridge.msdk.foundation.entity.f();
        fVar.a(System.currentTimeMillis());
        fVar.b(str);
        fVar.a(campaignEx.getId());
        jVarA.a(fVar);
    }

    private int a(String str) {
        if (str == null) {
            return 0;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() > 0) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = (JSONObject) jSONArray.opt(i);
                    if (2 == jSONObject.optInt("id", 0)) {
                        return jSONObject.optInt("ad_num");
                    }
                }
            }
        } catch (Exception e2) {
            ad.b(f, com.mbridge.msdk.mbnative.b.a.a(e2));
        }
        return 0;
    }

    public final void a(int i, String str) throws JSONException {
        boolean zA;
        this.y = false;
        this.z = false;
        this.A = false;
        this.X = false;
        this.Q = str;
        this.i.a(!TextUtils.isEmpty(str));
        this.M = null;
        Map<String, Long> map = b;
        if (map != null && map.size() > 0) {
            b.clear();
        }
        if (((com.mbridge.msdk.mbnative.controller.d.b() == null || !com.mbridge.msdk.mbnative.controller.d.b().containsKey(this.l)) ? false : Boolean.TRUE.equals(com.mbridge.msdk.mbnative.controller.d.b().get(this.l))) && i == 1 && a(i)) {
            return;
        }
        String strK = com.mbridge.msdk.foundation.controller.c.m().k();
        String strB = com.mbridge.msdk.foundation.controller.c.m().b();
        if (this.e.containsKey("app_id") && this.e.containsKey("app_key") && this.e.containsKey(MBridgeConstans.KEY_WORD)) {
            strK = (String) this.e.get("app_id");
            strB = (String) this.e.get("app_key");
        }
        this.h.a(this.k, strK, strB, this.l);
        k kVarD = com.mbridge.msdk.c.h.a().d(strK, this.l);
        this.T = kVarD;
        if (kVarD == null) {
            this.T = k.d(this.l);
        }
        com.mbridge.msdk.mbnative.controller.d.e().put(this.l, Integer.valueOf(this.T.w() * this.u));
        this.c = this.T.b();
        this.d = this.T.c();
        this.W = this.T.e();
        this.V = this.T.d();
        this.u = this.t;
        List<Integer> list = this.c;
        if (list == null || list.size() == 0) {
            com.mbridge.msdk.mbnative.d.a aVar = this.i;
            if (aVar != null) {
                this.y = true;
                aVar.onAdLoadError("do not have sorceList");
                return;
            }
            return;
        }
        try {
            zA = com.mbridge.msdk.mbsignalcommon.webEnvCheck.a.a(com.mbridge.msdk.foundation.controller.c.m().c());
        } catch (Exception unused) {
            zA = false;
        }
        if (!zA) {
            com.mbridge.msdk.mbnative.d.a aVar2 = this.i;
            if (aVar2 != null) {
                aVar2.onAdLoadError("webview is not available");
                return;
            }
            return;
        }
        if (this.e.containsKey(MBridgeConstans.NATIVE_INFO) && this.p == null) {
            String str2 = (String) this.e.get(MBridgeConstans.NATIVE_INFO);
            this.p = str2;
            if (str2 != null) {
                try {
                    JSONArray jSONArray = new JSONArray(this.p);
                    if (jSONArray.length() > 0) {
                        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                            JSONObject jSONObject = (JSONObject) jSONArray.opt(i2);
                            int iOptInt = jSONObject.optInt("id", 0);
                            if (2 == iOptInt) {
                                this.Y = jSONObject.optInt("ad_num");
                                if (this.W > 0) {
                                    jSONObject.remove("ad_num");
                                    jSONObject.put("ad_num", this.W);
                                }
                            } else if (3 == iOptInt) {
                                this.Z = jSONObject.optInt("ad_num");
                                if (this.W > 0) {
                                    jSONObject.remove("ad_num");
                                    jSONObject.put("ad_num", this.W);
                                }
                            }
                        }
                    }
                    this.K = Math.max(this.Y, this.Z);
                    this.p = jSONArray.toString();
                } catch (JSONException e2) {
                    ad.b(f, com.mbridge.msdk.mbnative.b.a.a(e2));
                }
            }
        }
        if ((!this.c.contains(1) || this.c.get(0).intValue() == 1) && i == 0 && a(a(this.l, this.u, this.Q))) {
            return;
        }
        this.aa = true;
        if (this.c.contains(1) && i == 0 && this.c.get(0).intValue() != 1) {
            int iIntValue = this.c.get(0).intValue();
            com.mbridge.msdk.mbnative.a.b<String, List<Campaign>> bVarA = com.mbridge.msdk.mbnative.a.c.a(iIntValue);
            if (iIntValue == 2 && this.e.containsKey(MBridgeConstans.NATIVE_INFO)) {
                this.u = this.K;
            } else {
                this.u = this.t;
            }
            if (bVarA != null && a(a(iIntValue, d(bVarA.b(this.l, this.u))))) {
                return;
            }
            this.aa = false;
            try {
                a(this.d.get(this.c.indexOf(1)).intValue() * 1000, i, false, this.l, this.Q);
            } catch (Exception unused2) {
            }
        }
        this.f3120a.sendEmptyMessageDelayed(1, this.T.u() * 1000);
        List<Integer> list2 = this.c;
        if (list2 != null && list2.size() > 0) {
            Queue<Integer> queue = this.n;
            if (queue != null && queue.size() > 0) {
                this.n.clear();
            }
            for (Integer num : this.c) {
                Queue<Integer> queue2 = this.n;
                if (queue2 != null) {
                    queue2.add(num);
                }
            }
        }
        List<Integer> list3 = this.d;
        if (list3 != null && list3.size() > 0) {
            Queue<Long> queue3 = this.o;
            if (queue3 != null && queue3.size() > 0) {
                this.o.clear();
            }
            for (Integer num2 : this.d) {
                Queue<Long> queue4 = this.o;
                if (queue4 != null) {
                    queue4.add(Long.valueOf(num2.intValue() * 1000));
                }
            }
        }
        b(i, this.Q);
    }

    private boolean a(int i) {
        int iMin;
        int iOptInt;
        int iOptInt2;
        com.mbridge.msdk.mbnative.d.a aVar;
        int i2 = 0;
        if (com.mbridge.msdk.mbnative.controller.d.b().containsKey(this.l) && Boolean.TRUE.equals(com.mbridge.msdk.mbnative.controller.d.b().get(this.l))) {
            Map<String, Map<Long, Object>> mapA = com.mbridge.msdk.mbnative.controller.d.a();
            Map<Long, Object> map = mapA.get(i + "_" + this.l);
            Integer num = com.mbridge.msdk.mbnative.controller.d.d().get(this.l);
            com.mbridge.msdk.c.g gVarB = com.mbridge.msdk.c.h.a().b(com.mbridge.msdk.foundation.controller.c.m().k());
            if (num != null) {
                this.u = num.intValue();
            }
            if (map != null && map.size() > 0) {
                Long next = map.keySet().iterator().next();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (gVarB == null) {
                    com.mbridge.msdk.c.h.a();
                    gVarB = com.mbridge.msdk.c.i.a();
                }
                if (jCurrentTimeMillis - next.longValue() >= gVarB.ab() * 1000) {
                    mapA.remove(i + "_" + this.l);
                } else {
                    if (i == 1) {
                        List<Frame> list = (List) map.get(next);
                        if (list == null || list.size() <= 0 || (aVar = this.i) == null) {
                            return false;
                        }
                        if (this.D >= list.size()) {
                            mapA.remove(i + "_" + this.l);
                            aVar.onAdFramesLoaded(list);
                            return true;
                        }
                        if (this.D == 0) {
                            return false;
                        }
                        List<Frame> listSubList = list.subList(0, this.C);
                        aVar.onAdFramesLoaded(list);
                        list.removeAll(listSubList);
                        map.put(next, listSubList);
                        ArrayList arrayList = new ArrayList();
                        for (Frame frame : list) {
                            if (i2 >= this.D) {
                                arrayList.add(frame);
                            }
                            i2++;
                        }
                        map.put(next, arrayList);
                        mapA.put(i + "_" + this.l, map);
                        aVar.onAdFramesLoaded(listSubList);
                        return true;
                    }
                    List list2 = (List) map.get(next);
                    if (list2 != null && list2.size() > 0) {
                        List<Campaign> arrayList2 = new ArrayList<>();
                        if (((CampaignEx) list2.get(0)).getType() == 1) {
                            if (TextUtils.isEmpty(this.p)) {
                                iMin = Math.min(this.B, list2.size());
                            } else {
                                try {
                                    JSONArray jSONArray = new JSONArray(this.p);
                                    if (jSONArray.length() > 0) {
                                        iOptInt = 0;
                                        iOptInt2 = 0;
                                        for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                                            JSONObject jSONObject = (JSONObject) jSONArray.opt(i3);
                                            int iOptInt3 = jSONObject.optInt("id", 0);
                                            if (2 == iOptInt3) {
                                                iOptInt = jSONObject.optInt("ad_num");
                                            } else if (3 == iOptInt3) {
                                                iOptInt2 = jSONObject.optInt("ad_num");
                                            }
                                        }
                                    } else {
                                        iOptInt = 0;
                                        iOptInt2 = 0;
                                    }
                                    if (3 == ((CampaignEx) list2.get(0)).getTemplate()) {
                                        iMin = Math.min(iOptInt2, list2.size());
                                    } else {
                                        iMin = Math.min(iOptInt, list2.size());
                                    }
                                } catch (Exception unused) {
                                    ad.b(f, "load from catch error in get nativeinfo adnum");
                                    iMin = 0;
                                }
                            }
                            if (iMin <= 0) {
                                return false;
                            }
                            Iterator it = list2.iterator();
                            while (it.hasNext() && i2 != iMin) {
                                CampaignEx campaignEx = (CampaignEx) it.next();
                                campaignEx.getTemplate();
                                arrayList2.add(campaignEx);
                                it.remove();
                                i2++;
                            }
                        } else {
                            int iMin2 = Math.min(this.B, list2.size());
                            if (iMin2 > 0) {
                                Iterator it2 = list2.iterator();
                                while (it2.hasNext() && i2 != iMin2) {
                                    CampaignEx campaignEx2 = (CampaignEx) it2.next();
                                    campaignEx2.getTemplate();
                                    arrayList2.add(campaignEx2);
                                    it2.remove();
                                    i2++;
                                }
                            }
                        }
                        a(arrayList2);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private void b(int i, String str) {
        com.mbridge.msdk.mbnative.d.a aVar;
        Long lPoll;
        Queue<Integer> queue = this.n;
        if (queue != null && queue.size() > 0) {
            Integer numPoll = this.n.poll();
            int iIntValue = numPoll != null ? numPoll.intValue() : 1;
            this.U = MBridgeConstans.REQUEST_TIME_OUT;
            Queue<Long> queue2 = this.o;
            if (queue2 != null && queue2.size() > 0 && (lPoll = this.o.poll()) != null) {
                this.U = lPoll.longValue();
            }
            b(iIntValue, this.U, i, str);
            return;
        }
        if (this.y || (aVar = this.i) == null) {
            return;
        }
        this.y = true;
        aVar.onAdLoadError("no ad source");
    }

    private void b(int i, long j, int i2, String str) {
        com.mbridge.msdk.mbnative.a.b<String, List<Campaign>> bVarA;
        if (i2 == 0 && (bVarA = com.mbridge.msdk.mbnative.a.c.a(i)) != null) {
            if ((i == 1 || i == 2) && this.e.containsKey(MBridgeConstans.NATIVE_INFO)) {
                this.u = this.K;
            } else {
                this.u = this.t;
            }
            if (a(a(i, d(bVarA.b(this.l, this.u))))) {
                return;
            }
        }
        if (i == 1) {
            a(j, i2, true, this.l, str);
        } else if (i == 2) {
            a(2, j, i2, str);
        } else {
            a(i, j, i2, str);
        }
    }

    public final void a(String str, int i, String str2, CampaignEx campaignEx) {
        Queue<Integer> queue = this.n;
        if ((queue != null && queue.size() <= 0) || this.n == null) {
            com.mbridge.msdk.mbnative.d.a aVar = this.i;
            if (aVar == null || this.y) {
                return;
            }
            this.y = true;
            aVar.a(campaignEx, str);
            return;
        }
        b(i, str2);
    }

    @Override // com.mbridge.msdk.mbnative.controller.a
    public final synchronized void a(int i, long j, int i2, String str) {
        com.mbridge.msdk.foundation.entity.k kVar;
        try {
            if (this.e.containsKey(MBridgeConstans.NATIVE_INFO)) {
                this.u = Math.max(this.Y, this.Z);
            }
            if (i2 == 0) {
                com.mbridge.msdk.mbnative.a.b<String, List<Campaign>> bVarA = com.mbridge.msdk.mbnative.a.c.a(i);
                if (bVarA != null && a(a(1, d(bVarA.b(this.l, this.u))))) {
                    return;
                }
                a aVar = this.M;
                if (aVar != null && !this.X) {
                    aVar.b(true);
                }
                if (this.X && !this.y) {
                    a("mb load failed", i2, str, (CampaignEx) null);
                }
                if (!this.aa) {
                    return;
                }
            }
            int i3 = this.v;
            if (i3 == -1) {
                this.v = i;
            } else if (i3 != i) {
                this.w = 0;
            }
            com.mbridge.msdk.foundation.db.f.a(h.a(this.k)).a();
            com.mbridge.msdk.mbnative.f.a.a aVar2 = new com.mbridge.msdk.mbnative.f.a.a(this.k);
            com.mbridge.msdk.foundation.same.net.h.e eVar = new com.mbridge.msdk.foundation.same.net.h.e();
            String strK = com.mbridge.msdk.foundation.controller.c.m().k();
            String strB = com.mbridge.msdk.foundation.controller.c.m().b();
            Map<String, Object> map = this.e;
            if (map != null && map.containsKey("app_id") && this.e.containsKey("app_key") && this.e.containsKey(MBridgeConstans.KEY_WORD) && this.e.get(MBridgeConstans.KEY_WORD) != null) {
                if (this.e.get("app_id") instanceof String) {
                    strK = (String) this.e.get("app_id");
                }
                if (this.e.get("app_key") instanceof String) {
                    strB = (String) this.e.get("app_key");
                }
                String str2 = this.e.get(MBridgeConstans.KEY_WORD) instanceof String ? (String) this.e.get(MBridgeConstans.KEY_WORD) : null;
                if (!TextUtils.isEmpty(str2)) {
                    eVar.a("smart", x.b(str2));
                }
            }
            eVar.a("app_id", strK);
            eVar.a(MBridgeConstans.PROPERTIES_UNIT_ID, this.l);
            if (!TextUtils.isEmpty(this.m)) {
                eVar.a(MBridgeConstans.PLACEMENT_ID, this.m);
            }
            eVar.a("req_type", "2");
            if (!TextUtils.isEmpty(this.x)) {
                eVar.a("category", this.x);
            }
            eVar.a("sign", SameMD5.getMD5(strK + strB));
            if (this.W > 0 && i2 == 0) {
                eVar.a("ad_num", this.W + "");
            } else {
                eVar.a("ad_num", this.t + "");
            }
            String strD = ai.d(this.l);
            if (!TextUtils.isEmpty(strD)) {
                eVar.a("j", strD);
            }
            eVar.a("only_impression", "1");
            eVar.a("ping_mode", "1");
            if (this.D != 0) {
                eVar.a("frame_num", this.D + "");
            }
            if (!TextUtils.isEmpty(this.p)) {
                eVar.a(MBridgeConstans.NATIVE_INFO, this.p);
                if (i == 1) {
                    eVar.a("tnum", this.K + "");
                }
            } else if (i == 1) {
                eVar.a("tnum", this.t + "");
            }
            String strA = com.mbridge.msdk.foundation.same.a.d.a(this.l, AdFormat.NATIVE);
            if (!TextUtils.isEmpty(strA)) {
                eVar.a(com.mbridge.msdk.foundation.same.net.h.e.d, strA);
            }
            if (Build.VERSION.SDK_INT >= 14) {
                if (this.e.containsKey(MBridgeConstans.NATIVE_VIDEO_WIDTH) && (this.e.get(MBridgeConstans.NATIVE_VIDEO_WIDTH) instanceof Integer)) {
                    eVar.a("video_width", ((Integer) this.e.get(MBridgeConstans.NATIVE_VIDEO_WIDTH)).intValue() + "");
                }
                if (this.e.containsKey(MBridgeConstans.NATIVE_VIDEO_HEIGHT) && (this.e.get(MBridgeConstans.NATIVE_VIDEO_HEIGHT) instanceof Integer)) {
                    eVar.a("video_height", ((Integer) this.e.get(MBridgeConstans.NATIVE_VIDEO_HEIGHT)).intValue() + "");
                }
                if (this.e.containsKey(MBridgeConstans.NATIVE_VIDEO_SUPPORT) && (this.e.get(MBridgeConstans.NATIVE_VIDEO_SUPPORT) instanceof Boolean)) {
                    ((Boolean) this.e.get(MBridgeConstans.NATIVE_VIDEO_SUPPORT)).booleanValue();
                }
                eVar.a("video_version", "2.0");
            }
            if (com.mbridge.msdk.c.h.a().b(com.mbridge.msdk.foundation.controller.c.m().k()) == null) {
                com.mbridge.msdk.c.h.a();
                com.mbridge.msdk.c.i.a();
            }
            if (!a(this.e)) {
                JSONArray jSONArrayB = ai.b(this.k, this.l);
                if (jSONArrayB.length() > 0) {
                    eVar.a(com.mbridge.msdk.foundation.same.net.h.e.e, ai.a(jSONArrayB));
                }
            }
            if (com.mbridge.msdk.mbnative.controller.d.b().containsKey(this.l) && com.mbridge.msdk.mbnative.controller.d.b().get(this.l).booleanValue() && com.mbridge.msdk.mbnative.controller.d.c().get(this.l) != null && (kVar = com.mbridge.msdk.mbnative.controller.d.c().get(this.l)) != null) {
                if (i == 1) {
                    this.w = kVar.a();
                } else if (i == 2) {
                    this.w = kVar.b();
                }
            }
            eVar.a(TypedValues.CycleType.S_WAVE_OFFSET, this.w + "");
            eVar.a("ad_type", RoomMasterTable.DEFAULT_ID);
            eVar.a(CampaignEx.JSON_KEY_AD_SOURCE_ID, i + "");
            if (!TextUtils.isEmpty(this.r)) {
                eVar.a(com.mbridge.msdk.foundation.same.net.h.e.f, this.r);
            }
            a aVar3 = new a();
            aVar3.a(b(this.e));
            aVar3.setUnitId(this.l);
            aVar3.setPlacementId(this.m);
            aVar3.setAdType(42);
            aVar3.b(true);
            c cVar = new c(1, aVar3, i2, str);
            aVar3.a(cVar);
            aVar3.e(i2);
            aVar3.a(str);
            if (i2 == 0) {
                if (!TextUtils.isEmpty(str)) {
                    eVar.a("token", str);
                }
                aVar2.choiceV3OrV5BySetting(1, eVar, aVar3, str);
            }
            if (i2 == 1) {
                aVar2.getLoadOrSetting(1, com.mbridge.msdk.foundation.same.net.g.d.f().N, eVar, aVar3);
            }
            this.f3120a.postDelayed(cVar, j);
        } catch (Exception e2) {
            String str3 = f;
            ad.b(str3, com.mbridge.msdk.mbnative.b.a.a(e2));
            ad.b(str3, e2.getMessage());
        }
    }

    private void a(final View view, CampaignEx campaignEx) {
        BitmapDrawable bitmapDrawableA;
        if (!(view instanceof FrameLayout) || (bitmapDrawableA = com.mbridge.msdk.foundation.controller.c.m().a(this.l, campaignEx.getAdType())) == null) {
            return;
        }
        final ImageView imageView = null;
        try {
            int childCount = ((ViewGroup) view).getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    break;
                }
                View childAt = ((ViewGroup) view).getChildAt(i);
                if ((childAt instanceof ImageView) && childAt.getTag() != null && "mb_wm".equals((String) childAt.getTag())) {
                    ((ImageView) childAt).setLayoutParams(new FrameLayout.LayoutParams(view.getWidth(), view.getHeight()));
                    imageView = (ImageView) childAt;
                    break;
                }
                i++;
            }
            if (imageView == null) {
                imageView = new ImageView(com.mbridge.msdk.foundation.controller.c.m().c());
                imageView.setTag("mb_wm");
                ai.a(imageView, bitmapDrawableA, view.getResources().getDisplayMetrics());
                if (imageView.getParent() == null) {
                    ((FrameLayout) view).addView(imageView, new FrameLayout.LayoutParams(view.getWidth(), view.getHeight()));
                }
            }
            this.S = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.mbridge.msdk.mbnative.controller.NativeController.1
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    if (imageView != null) {
                        imageView.setLayoutParams(new FrameLayout.LayoutParams(view.getWidth(), view.getHeight()));
                    }
                }
            };
            view.getViewTreeObserver().addOnGlobalLayoutListener(this.S);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void a(Campaign campaign, View view, List<View> list) {
        try {
            a(view, (CampaignEx) campaign);
            NativeListener.NativeTrackingListener nativeTrackingListener = this.j;
            if (nativeTrackingListener != null) {
                this.s.a(nativeTrackingListener);
            }
            com.mbridge.msdk.mbnative.a.c.a(campaign.getType()).a(this.l, campaign, this.Q);
            final CampaignEx campaignEx = (CampaignEx) campaign;
            Class<?> cls = null;
            try {
                cls = Class.forName("com.mbridge.msdk.nativex.view.MBMediaView");
            } catch (Throwable unused) {
            }
            com.mbridge.msdk.foundation.same.a.d.a(this.l, campaignEx, AdFormat.NATIVE);
            if (campaignEx != null) {
                if (view != null) {
                    if (cls != null && cls.isInstance(view)) {
                        return;
                    } else {
                        view.setOnClickListener(new com.mbridge.msdk.widget.a() { // from class: com.mbridge.msdk.mbnative.controller.NativeController.6
                            @Override // com.mbridge.msdk.widget.a
                            protected final void a(View view2) {
                                NativeController.a(NativeController.this, view2.getContext(), campaignEx);
                            }
                        });
                    }
                }
                if (list != null && list.size() > 0) {
                    for (View view2 : list) {
                        if (cls != null && cls.isInstance(view2)) {
                            break;
                        } else {
                            view2.setOnClickListener(new com.mbridge.msdk.widget.a() { // from class: com.mbridge.msdk.mbnative.controller.NativeController.7
                                @Override // com.mbridge.msdk.widget.a
                                protected final void a(View view3) {
                                    NativeController.a(NativeController.this, view3.getContext(), campaignEx);
                                }
                            });
                        }
                    }
                }
                if (campaignEx.isReport()) {
                    return;
                }
                a(campaignEx, view, list);
                Log.e(f, "sendImpression" + campaignEx);
            }
        } catch (Exception unused2) {
            ad.b(f, "registerview exception!");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(CampaignEx campaignEx) {
        if (campaignEx == null || campaignEx.isReportClick()) {
            return;
        }
        campaignEx.setReportClick(true);
        if (campaignEx == null || campaignEx.getNativeVideoTracking() == null || campaignEx.getNativeVideoTracking().l() == null) {
            return;
        }
        com.mbridge.msdk.click.a.a(this.k, campaignEx, campaignEx.getCampaignUnitId(), campaignEx.getNativeVideoTracking().l(), false, false);
    }

    public final void a(Campaign campaign, View view) {
        try {
            NativeListener.NativeTrackingListener nativeTrackingListener = this.j;
            if (nativeTrackingListener != null) {
                this.s.a(nativeTrackingListener);
            }
            com.mbridge.msdk.mbnative.a.c.a(campaign.getType()).a(this.l, campaign, this.Q);
            final CampaignEx campaignEx = (CampaignEx) campaign;
            com.mbridge.msdk.foundation.same.a.d.a(this.l, campaignEx, AdFormat.NATIVE);
            if (campaignEx != null) {
                com.mbridge.msdk.widget.a aVar = new com.mbridge.msdk.widget.a() { // from class: com.mbridge.msdk.mbnative.controller.NativeController.9
                    @Override // com.mbridge.msdk.widget.a
                    protected final void a(View view2) {
                        NativeController.a(NativeController.this, view2.getContext(), campaignEx);
                    }
                };
                try {
                    a(view, aVar, Class.forName("com.mbridge.msdk.nativex.view.MBMediaView"));
                } catch (Throwable unused) {
                    a(view, aVar, (Class) null);
                }
                if (!com.mbridge.msdk.f.b.a()) {
                    a(view, (CampaignEx) campaign);
                }
                if (campaignEx.isReport()) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                a(campaignEx, view, (List<View>) arrayList);
                ad.c(f, "sendImpression" + campaignEx);
            }
        } catch (Exception unused2) {
            ad.b(f, "registerview exception!");
        }
    }

    private AdSession b(CampaignEx campaignEx) {
        if (this.J == null) {
            this.J = new Hashtable<>();
        }
        String requestIdNotice = campaignEx.getRequestIdNotice();
        AdSession adSessionA = this.J.get(requestIdNotice);
        if (adSessionA == null && campaignEx.isActiveOm() && TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
            adSessionA = com.mbridge.msdk.a.b.a(this.k, true, campaignEx.getOmid(), campaignEx.getRequestId(), campaignEx.getId(), this.l, "", campaignEx.getRequestIdNotice());
        }
        if (adSessionA != null) {
            this.J.put(requestIdNotice, adSessionA);
        }
        return adSessionA;
    }

    private void a(CampaignEx campaignEx, View view, List<View> list) {
        AdSession adSessionB = null;
        try {
            if (this.k != null && campaignEx != null && (adSessionB = b(campaignEx)) != null) {
                adSessionB.registerAdView(view);
                adSessionB.start();
            }
            AdSession adSession = adSessionB;
            k kVar = this.T;
            int iL = (campaignEx == null || campaignEx.getImpReportType() != 1) ? kVar != null ? kVar.l() : 0 : 0;
            final f fVar = new f(campaignEx, view, list, this, adSession);
            if (this.I == null) {
                this.I = new CopyOnWriteArrayList<>();
            }
            this.I.add(fVar);
            fVar.setOnStateChangeListener(new a.InterfaceC0268a() { // from class: com.mbridge.msdk.mbnative.controller.NativeController.10
                @Override // com.mbridge.msdk.foundation.same.e.a.InterfaceC0268a
                public final void a(a.b bVar) {
                    if (bVar != a.b.FINISH || NativeController.this.I == null || NativeController.this.I.size() <= 0 || !NativeController.this.I.contains(fVar)) {
                        return;
                    }
                    NativeController.this.I.remove(fVar);
                }
            });
            if (this.f3120a != null) {
                this.f3120a.postDelayed(fVar, iL * 1000);
            }
        } catch (Exception e2) {
            ad.b(f, com.mbridge.msdk.mbnative.b.a.a(e2));
        }
    }

    private void a(View view, View.OnClickListener onClickListener, Class cls) {
        if (view == null || onClickListener == null) {
            return;
        }
        if (cls != null) {
            try {
                if (cls.isInstance(view)) {
                    return;
                }
            } catch (Throwable unused) {
                return;
            }
        }
        view.setOnClickListener(onClickListener);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                a(viewGroup.getChildAt(i), onClickListener, cls);
            }
        }
    }

    public final void b(Campaign campaign, View view) {
        b(campaign, view, null);
    }

    public final void b(Campaign campaign, View view, List<View> list) {
        if (view != null && this.S != null) {
            try {
                view.getViewTreeObserver().removeOnGlobalLayoutListener(this.S);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        if (campaign != null) {
            int type = campaign.getType();
            if (type == 1 || type == 2) {
                Class<?> cls = null;
                try {
                    cls = Class.forName("com.mbridge.msdk.nativex.view.MBMediaView");
                } catch (Throwable unused) {
                }
                if (list == null || list.size() <= 0) {
                    if (view != null) {
                        a(view, cls);
                    }
                } else {
                    Iterator<View> it = list.iterator();
                    while (it.hasNext()) {
                        a(it.next(), cls);
                    }
                }
            }
        }
    }

    private void a(View view, Class cls) {
        if (view == null) {
            return;
        }
        if (cls != null) {
            try {
                if (cls.isInstance(view)) {
                    return;
                }
            } catch (Throwable unused) {
                return;
            }
        }
        view.setOnClickListener(null);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                a(viewGroup.getChildAt(i), cls);
            }
        }
    }

    public final void a() {
        com.mbridge.msdk.foundation.same.e.a next;
        com.mbridge.msdk.foundation.same.e.b bVar = this.F;
        if (bVar != null) {
            bVar.a();
            this.F = null;
        }
        Hashtable<String, AdSession> hashtable = this.J;
        if (hashtable != null) {
            for (AdSession adSession : hashtable.values()) {
                if (adSession != null) {
                    adSession.finish();
                }
            }
            this.J.clear();
        }
        if (this.f3120a != null) {
            this.f3120a.removeCallbacksAndMessages(null);
        }
        this.j = null;
        this.s.a();
        try {
            Context context = this.k;
            if (context != null) {
                com.mbridge.msdk.foundation.same.c.b.a(context).b();
            }
            List<com.mbridge.msdk.mbnative.controller.c> list = this.G;
            if (list != null && list.size() > 0) {
                Iterator<com.mbridge.msdk.mbnative.controller.c> it = this.G.iterator();
                while (it.hasNext()) {
                    it.next().a();
                }
                this.G.clear();
                this.G = null;
            }
            List<c.a> list2 = this.H;
            if (list2 != null && list2.size() > 0) {
                for (c.a aVar : this.H) {
                }
                this.H.clear();
                this.H = null;
            }
            CopyOnWriteArrayList<com.mbridge.msdk.foundation.same.e.a> copyOnWriteArrayList = this.I;
            if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
                return;
            }
            Iterator<com.mbridge.msdk.foundation.same.e.a> it2 = this.I.iterator();
            if (it2.hasNext() && (next = it2.next()) != null) {
                next.cancel();
                this.f3120a.removeCallbacks(next);
            }
            this.I.clear();
        } catch (Exception unused) {
        }
    }

    public final List<Campaign> a(String str, int i, String str2) {
        int i2;
        int i3;
        List<Campaign> listA = null;
        if (this.c != null) {
            ArrayList arrayList = new ArrayList(this.c);
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                com.mbridge.msdk.mbnative.a.b<String, List<Campaign>> bVarA = com.mbridge.msdk.mbnative.a.c.a(((Integer) arrayList.get(i4)).intValue());
                if (bVarA != null) {
                    if ((((Integer) arrayList.get(i4)).intValue() == 1 || ((Integer) arrayList.get(i4)).intValue() == 2) && this.e.containsKey(MBridgeConstans.NATIVE_INFO)) {
                        i3 = this.K;
                    } else {
                        i3 = this.t;
                    }
                    listA = a(((Integer) arrayList.get(i4)).intValue(), bVarA.b(str, i3));
                    if (listA != null) {
                        break;
                    }
                }
            }
            if (listA == null) {
                for (int i5 = 0; i5 < arrayList.size(); i5++) {
                    com.mbridge.msdk.mbnative.a.b<String, List<Campaign>> bVarA2 = com.mbridge.msdk.mbnative.a.c.a(((Integer) arrayList.get(i5)).intValue());
                    if ((((Integer) arrayList.get(i5)).intValue() == 1 || ((Integer) arrayList.get(i5)).intValue() == 2) && this.e.containsKey(MBridgeConstans.NATIVE_INFO)) {
                        i2 = this.K;
                    } else {
                        i2 = this.t;
                    }
                    listA = a(((Integer) arrayList.get(i5)).intValue(), bVarA2.a((com.mbridge.msdk.mbnative.a.b<String, List<Campaign>>) str, i2));
                    if (listA != null) {
                        break;
                    }
                }
            }
        }
        return d(listA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(final List<Campaign> list) {
        AdSession adSessionB;
        if ((!TextUtils.isEmpty(this.Q) && list != null && list.size() == 0) || list == null || list.size() <= 0) {
            return false;
        }
        final com.mbridge.msdk.mbnative.d.a aVar = this.i;
        if (aVar == null) {
            return true;
        }
        CampaignEx campaignEx = (CampaignEx) list.get(0);
        if (campaignEx != null && campaignEx.isActiveOm() && (adSessionB = b(campaignEx)) != null) {
            adSessionB.start();
            AdEvents adEventsCreateAdEvents = AdEvents.createAdEvents(adSessionB);
            this.ad = adEventsCreateAdEvents;
            adEventsCreateAdEvents.loaded();
        }
        final int template = campaignEx != null ? campaignEx.getTemplate() : 2;
        com.mbridge.msdk.foundation.db.k kVarA = com.mbridge.msdk.foundation.db.k.a(h.a(this.k));
        kVarA.a();
        for (int i = 0; i < list.size(); i++) {
            CampaignEx campaignEx2 = (CampaignEx) list.get(i);
            if (!kVarA.b(campaignEx2.getId())) {
                com.mbridge.msdk.foundation.entity.g gVar = new com.mbridge.msdk.foundation.entity.g();
                gVar.a(campaignEx2.getId());
                gVar.b(campaignEx2.getFca());
                gVar.c(campaignEx2.getFcb());
                gVar.a(0);
                gVar.d(0);
                gVar.a(System.currentTimeMillis());
                kVarA.a(gVar);
            }
        }
        if (this.O && this.N) {
            if (f().h() == 3) {
                final List<Campaign> listB = b(list);
                if (list != null && list.size() > 0) {
                    a(list, new b() { // from class: com.mbridge.msdk.mbnative.controller.NativeController.12
                        @Override // com.mbridge.msdk.mbnative.controller.NativeController.b
                        public final void a() {
                            List listA = NativeController.a(NativeController.this, listB, true);
                            if (listA == null || listA.size() <= 0) {
                                NativeController.this.a(aVar, "has no ads", (CampaignEx) list.get(0));
                            } else {
                                NativeController.this.a((List<Campaign>) listA, template, aVar);
                            }
                        }
                    });
                    return true;
                }
                a(aVar, "has no ads", (CampaignEx) null);
                return true;
            }
            List<Campaign> listC = c(list);
            if (listC != null && listC.size() > 0) {
                a(listC, new b() { // from class: com.mbridge.msdk.mbnative.controller.NativeController.13
                    @Override // com.mbridge.msdk.mbnative.controller.NativeController.b
                    public final void a() {
                        List listA = NativeController.a(NativeController.this, list, false);
                        if (listA == null || listA.size() <= 0) {
                            NativeController.this.a(aVar, "has no ads", (CampaignEx) null);
                        } else {
                            NativeController.this.a((List<Campaign>) listA, template, aVar);
                        }
                    }
                });
                return true;
            }
            a(list, template, aVar);
            return true;
        }
        if (list != null && list.size() > 0) {
            Iterator<Campaign> it = list.iterator();
            while (it.hasNext()) {
                it.next().setVideoLength(0);
            }
            a(list, template, aVar);
            return true;
        }
        a(aVar, "has no ads", (CampaignEx) null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final List<Campaign> list, final int i, final NativeListener.NativeAdListener nativeAdListener) {
        this.f3120a.post(new Runnable() { // from class: com.mbridge.msdk.mbnative.controller.NativeController.2
            @Override // java.lang.Runnable
            public final void run() {
                List list2 = list;
                if (list2 != null && list2.size() > 0) {
                    CampaignEx campaignEx = (CampaignEx) list.get(0);
                    NativeController.this.R = campaignEx.getRequestId();
                    NativeController.this.ab = list;
                }
                NativeController.this.y = true;
                nativeAdListener.onAdLoaded(list, i);
                com.mbridge.msdk.mbnative.e.a.a(NativeController.this.k, list, NativeController.this.l);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final com.mbridge.msdk.mbnative.d.a aVar, final String str, final CampaignEx campaignEx) {
        this.f3120a.post(new Runnable() { // from class: com.mbridge.msdk.mbnative.controller.NativeController.3
            @Override // java.lang.Runnable
            public final void run() {
                aVar.a(campaignEx, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<Campaign> a(int i, List<Campaign> list) {
        if (i != 1 || !this.e.containsKey(MBridgeConstans.NATIVE_INFO) || list == null || list.size() <= 0) {
            return list;
        }
        CampaignEx campaignEx = (CampaignEx) list.get(0);
        int template = campaignEx != null ? campaignEx.getTemplate() : 1;
        if (template == 2) {
            if (list == null) {
                return list;
            }
            int size = list.size();
            int i2 = this.Y;
            return size >= i2 ? list.subList(0, i2) : list;
        }
        if (template != 3 || list == null) {
            return list;
        }
        int size2 = list.size();
        int i3 = this.Z;
        return size2 >= i3 ? list.subList(0, i3) : list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public k f() {
        k kVarD = com.mbridge.msdk.c.h.a().d("", this.l);
        this.T = kVarD;
        if (kVarD == null) {
            this.T = k.d(this.l);
        }
        return this.T;
    }

    private List<Campaign> b(List<Campaign> list) {
        if (list != null) {
            CampaignEx campaignEx = null;
            for (int size = list.size() - 1; size >= 0; size--) {
                try {
                    campaignEx = (CampaignEx) list.get(size);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
                if (campaignEx != null && TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
                    Campaign campaignRemove = list.remove(size);
                    com.mbridge.msdk.mbnative.a.c.a(campaignEx.getType()).a(this.l, campaignRemove, this.Q);
                    ad.a(f, "remove no videoURL ads:" + campaignRemove);
                }
            }
        }
        return list;
    }

    private List<Campaign> c(List<Campaign> list) {
        ArrayList arrayList = null;
        if (list != null) {
            for (Campaign campaign : list) {
                if (campaign instanceof CampaignEx) {
                    CampaignEx campaignEx = (CampaignEx) campaign;
                    if (TextUtils.isEmpty(campaignEx.getImageUrl()) && !TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(campaign);
                    }
                }
            }
        }
        return arrayList;
    }

    private void a(final List<Campaign> list, final b bVar) {
        g();
        final long jCurrentTimeMillis = System.currentTimeMillis();
        Timer timer = new Timer();
        this.P = timer;
        timer.schedule(new TimerTask() { // from class: com.mbridge.msdk.mbnative.controller.NativeController.5
            @Override // java.util.TimerTask, java.lang.Runnable
            public final void run() {
                boolean z;
                if (System.currentTimeMillis() - jCurrentTimeMillis < 60000) {
                    int iL = z.l(NativeController.this.k);
                    int iK = NativeController.this.f().k();
                    if (iL != 9 && iK == 2) {
                        bVar.a();
                        NativeController.this.g();
                        return;
                    }
                    if (iK == 3) {
                        bVar.a();
                        NativeController.this.g();
                        return;
                    }
                    loop0: while (true) {
                        z = false;
                        for (Campaign campaign : list) {
                            String id = campaign.getId();
                            if (campaign instanceof CampaignEx) {
                                StringBuilder sb = new StringBuilder();
                                sb.append(id);
                                CampaignEx campaignEx = (CampaignEx) campaign;
                                sb.append(campaignEx.getVideoUrlEncode());
                                sb.append(campaignEx.getBidToken());
                                id = sb.toString();
                            }
                            com.mbridge.msdk.videocommon.download.a aVarA = com.mbridge.msdk.videocommon.download.b.getInstance().a(NativeController.this.l, id);
                            if (aVarA == null || !com.mbridge.msdk.videocommon.download.j.a(aVarA, NativeController.this.f().p())) {
                                break;
                            } else {
                                z = true;
                            }
                        }
                    }
                    if (z) {
                        bVar.a();
                        NativeController.this.g();
                        return;
                    }
                    return;
                }
                bVar.a();
                NativeController.this.g();
            }
        }, 0L, 1000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        Timer timer = this.P;
        if (timer != null) {
            timer.cancel();
            this.P = null;
        }
    }

    public final String b() {
        return this.R;
    }

    public final String c() {
        ArrayList arrayList = new ArrayList();
        List<Campaign> list = this.ab;
        if (list != null) {
            for (Campaign campaign : list) {
                CampaignEx campaignEx = new CampaignEx();
                campaignEx.setCreativeId(campaign.getCreativeId());
                arrayList.add(campaignEx);
            }
        }
        return com.mbridge.msdk.foundation.same.c.a(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<Campaign> d(List<Campaign> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList(list.size());
        for (Campaign campaign : list) {
            if (campaign instanceof CampaignEx) {
                CampaignEx campaignEx = (CampaignEx) campaign;
                if (TextUtils.isEmpty(this.Q) && TextUtils.isEmpty(campaignEx.getBidToken()) && !campaignEx.isBidCampaign()) {
                    arrayList2.add(campaignEx);
                } else if (!TextUtils.isEmpty(this.Q) && TextUtils.equals(campaignEx.getBidToken(), this.Q)) {
                    arrayList.add(campaign);
                }
            } else {
                arrayList2.add(campaign);
            }
        }
        return TextUtils.isEmpty(this.Q) ? arrayList2 : arrayList;
    }

    protected static class e extends Handler {

        /* renamed from: a, reason: collision with root package name */
        private WeakReference<NativeController> f3117a;

        public e(NativeController nativeController) {
            this.f3117a = new WeakReference<>(nativeController);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            WeakReference<NativeController> weakReference;
            NativeController nativeController;
            super.handleMessage(message);
            try {
                if (message.what == 0 && (weakReference = this.f3117a) != null && (nativeController = weakReference.get()) != null) {
                    nativeController.q.a(message.arg1, (String) message.obj);
                }
                if (message.what == 1) {
                    NativeController nativeController2 = null;
                    WeakReference<NativeController> weakReference2 = this.f3117a;
                    if (weakReference2 != null && weakReference2.get() != null) {
                        nativeController2 = this.f3117a.get();
                    }
                    if (nativeController2 != null) {
                        nativeController2.z = true;
                        List<Campaign> listA = nativeController2.a(nativeController2.l, nativeController2.u, nativeController2.Q);
                        if (nativeController2.y) {
                            return;
                        }
                        nativeController2.a(listA);
                    }
                }
            } catch (Exception e) {
                ad.b(NativeController.f, com.mbridge.msdk.mbnative.b.a.a(e));
            }
        }
    }

    private static class f extends com.mbridge.msdk.foundation.same.e.a {

        /* renamed from: a, reason: collision with root package name */
        private CampaignEx f3118a;
        private WeakReference<View> b;
        private WeakReference<List<View>> c;
        private WeakReference<NativeController> d;
        private WeakReference<AdSession> e;

        @Override // com.mbridge.msdk.foundation.same.e.a
        public final void cancelTask() {
        }

        @Override // com.mbridge.msdk.foundation.same.e.a
        public final void pauseTask(boolean z) {
        }

        public f(CampaignEx campaignEx, View view, List<View> list, NativeController nativeController, AdSession adSession) {
            this.f3118a = campaignEx;
            this.b = new WeakReference<>(view);
            this.c = new WeakReference<>(list);
            this.d = new WeakReference<>(nativeController);
            this.e = new WeakReference<>(adSession);
        }

        @Override // com.mbridge.msdk.foundation.same.e.a
        public final void runTask() {
            WeakReference<View> weakReference;
            try {
                if (this.d == null || (weakReference = this.b) == null || this.c == null) {
                    return;
                }
                View view = weakReference.get();
                List<View> list = this.c.get();
                NativeController nativeController = this.d.get();
                WeakReference<AdSession> weakReference2 = this.e;
                AdSession adSession = weakReference2 != null ? weakReference2.get() : null;
                if (view == null || nativeController == null) {
                    return;
                }
                NativeController.a(nativeController, this.f3118a, view, list, adSession);
            } catch (Exception e) {
                ad.b(NativeController.f, com.mbridge.msdk.mbnative.b.a.a(e));
            }
        }
    }

    private static class d implements H5DownLoadManager.IH5SourceDownloadListener {

        /* renamed from: a, reason: collision with root package name */
        private String f3116a;
        private CampaignEx b;
        private long c = System.currentTimeMillis();
        private boolean d;

        public d(String str, CampaignEx campaignEx, boolean z) {
            this.d = true;
            this.f3116a = str;
            this.b = campaignEx;
            this.d = z;
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public final void onSuccess(String str, String str2, boolean z) {
            try {
                if (this.d) {
                    long jCurrentTimeMillis = System.currentTimeMillis() - this.c;
                    q.a(h.a(com.mbridge.msdk.foundation.controller.c.m().c()));
                    n nVar = new n("2000043", 1, jCurrentTimeMillis + "", str, this.b.getId(), this.f3116a, "", "2");
                    CampaignEx campaignEx = this.b;
                    if (campaignEx != null && !TextUtils.isEmpty(campaignEx.getId())) {
                        nVar.e(this.b.getId());
                    }
                    CampaignEx campaignEx2 = this.b;
                    if (campaignEx2 != null) {
                        nVar.f(campaignEx2.getRequestId());
                        nVar.g(this.b.getRequestIdNotice());
                        nVar.s(this.b.getCurrentLocalRid());
                        nVar.c(this.b.getAdSpaceT());
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        nVar.t(str2);
                    }
                    nVar.d("1");
                    com.mbridge.msdk.foundation.same.report.h.a(nVar, this.f3116a, this.b);
                }
            } catch (Exception e) {
                ad.b(NativeController.f, com.mbridge.msdk.mbnative.b.a.a(e));
            }
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public final void onFailed(String str, String str2) {
            try {
                if (this.d) {
                    long jCurrentTimeMillis = System.currentTimeMillis() - this.c;
                    q.a(h.a(com.mbridge.msdk.foundation.controller.c.m().c()));
                    n nVar = new n("2000043", 3, jCurrentTimeMillis + "", str, this.b.getId(), this.f3116a, str2, "2");
                    nVar.f(this.b.getRequestId());
                    nVar.s(this.b.getCurrentLocalRid());
                    nVar.g(this.b.getRequestIdNotice());
                    CampaignEx campaignEx = this.b;
                    if (campaignEx != null && !TextUtils.isEmpty(campaignEx.getId())) {
                        nVar.e(this.b.getId());
                    }
                    CampaignEx campaignEx2 = this.b;
                    if (campaignEx2 != null) {
                        nVar.c(campaignEx2.getAdSpaceT());
                    }
                    nVar.d("1");
                    com.mbridge.msdk.foundation.same.report.h.a(nVar, this.f3116a, this.b);
                }
            } catch (Exception e) {
                ad.b(NativeController.f, com.mbridge.msdk.mbnative.b.a.a(e));
            }
        }
    }

    private static final class g implements H5DownLoadManager.ZipDownloadListener {

        /* renamed from: a, reason: collision with root package name */
        String f3119a;
        CampaignEx b;
        private long c = System.currentTimeMillis();
        private boolean d;

        public g(String str, CampaignEx campaignEx, boolean z) {
            this.d = true;
            this.f3119a = str;
            this.b = campaignEx;
            this.d = z;
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public final void onSuccess(String str, String str2, boolean z) {
            try {
                if (this.d) {
                    long jCurrentTimeMillis = System.currentTimeMillis() - this.c;
                    q.a(h.a(com.mbridge.msdk.foundation.controller.c.m().c()));
                    n nVar = new n("2000043", 1, jCurrentTimeMillis + "", str, this.b.getId(), this.f3119a, "", "1");
                    CampaignEx campaignEx = this.b;
                    if (campaignEx != null && !TextUtils.isEmpty(campaignEx.getId())) {
                        nVar.e(this.b.getId());
                    }
                    CampaignEx campaignEx2 = this.b;
                    if (campaignEx2 != null) {
                        nVar.f(campaignEx2.getRequestId());
                        nVar.s(this.b.getCurrentLocalRid());
                        nVar.g(this.b.getRequestIdNotice());
                        nVar.c(this.b.getAdSpaceT());
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        nVar.t(str2);
                    }
                    nVar.d("2");
                    com.mbridge.msdk.foundation.same.report.h.a(nVar, this.f3119a, this.b);
                }
            } catch (Exception e) {
                ad.b(NativeController.f, com.mbridge.msdk.mbnative.b.a.a(e));
            }
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public final void onFailed(String str, String str2) {
            try {
                if (this.d) {
                    long jCurrentTimeMillis = System.currentTimeMillis() - this.c;
                    q.a(h.a(com.mbridge.msdk.foundation.controller.c.m().c()));
                    n nVar = new n("2000043", 3, jCurrentTimeMillis + "", str2, this.b.getId(), this.f3119a, str, "1");
                    CampaignEx campaignEx = this.b;
                    if (campaignEx != null && !TextUtils.isEmpty(campaignEx.getId())) {
                        nVar.e(this.b.getId());
                    }
                    CampaignEx campaignEx2 = this.b;
                    if (campaignEx2 != null) {
                        nVar.f(campaignEx2.getRequestId());
                        nVar.s(this.b.getCurrentLocalRid());
                        nVar.g(this.b.getRequestIdNotice());
                        nVar.c(this.b.getAdSpaceT());
                    }
                    nVar.d("2");
                    com.mbridge.msdk.foundation.same.report.h.a(nVar, this.f3119a, this.b);
                }
            } catch (Exception e) {
                ad.b(NativeController.f, com.mbridge.msdk.mbnative.b.a.a(e));
            }
        }
    }

    public class c implements Runnable {
        private int b;
        private com.mbridge.msdk.foundation.same.e.d c;
        private int d;
        private String e;

        public c(int i, com.mbridge.msdk.foundation.same.e.d dVar, int i2, String str) {
            this.b = i;
            this.c = dVar;
            this.d = i2;
            this.e = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.c.a(true);
            int i = this.b;
            if (i == 1) {
                NativeController.this.X = true;
                NativeController.this.a("REQUEST_TIMEOUT", this.d, this.e, (CampaignEx) null);
            } else {
                if (i != 2) {
                    return;
                }
                if (!NativeController.this.y || this.d == 1) {
                    NativeController.this.a("REQUEST_TIMEOUT", this.d, this.e, (CampaignEx) null);
                }
            }
        }
    }

    public class a extends com.mbridge.msdk.mbnative.f.a.b implements com.mbridge.msdk.foundation.same.e.d {
        private Runnable c;
        private boolean b = false;
        private boolean d = true;
        private List<String> e = null;

        public a() {
        }

        public final void b(boolean z) {
            this.d = z;
        }

        @Override // com.mbridge.msdk.foundation.same.e.d
        public final void a(boolean z) {
            this.b = z;
        }

        public final void a(List<String> list) {
            this.e = list;
        }

        @Override // com.mbridge.msdk.mbnative.f.a.b
        public final void a(List<com.mbridge.msdk.foundation.same.net.d.b> list, CampaignUnit campaignUnit) {
            Integer num;
            int iIntValue = 1;
            NativeController.this.X = true;
            com.mbridge.msdk.foundation.db.k kVarA = com.mbridge.msdk.foundation.db.k.a(h.a(NativeController.this.k));
            kVarA.a();
            if (this.c != null) {
                NativeController.this.f3120a.removeCallbacks(this.c);
            }
            com.mbridge.msdk.f.b.a();
            if (campaignUnit != null && campaignUnit.getAds() != null && campaignUnit.getAds().size() > 0) {
                NativeController.this.r = campaignUnit.getSessionId();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                if (NativeController.this.V <= 0) {
                    if (NativeController.this.V == -3) {
                        NativeController.this.V = campaignUnit.getAds().size();
                    } else {
                        NativeController nativeController = NativeController.this;
                        nativeController.V = nativeController.u;
                    }
                    if (NativeController.this.Y != 0 && campaignUnit.getTemplate() == 2) {
                        NativeController nativeController2 = NativeController.this;
                        nativeController2.V = nativeController2.Y;
                    }
                    if (NativeController.this.Z != 0 && campaignUnit.getTemplate() == 3) {
                        NativeController nativeController3 = NativeController.this;
                        nativeController3.V = nativeController3.Z;
                    }
                }
                for (int i = 0; i < campaignUnit.getAds().size(); i++) {
                    final CampaignEx campaignEx = campaignUnit.getAds().get(i);
                    campaignEx.setCampaignUnitId(this.unitId);
                    if (!TextUtils.isEmpty(NativeController.this.Q)) {
                        campaignEx.setBidToken(NativeController.this.Q);
                        campaignEx.setIsBidCampaign(true);
                    }
                    final com.mbridge.msdk.foundation.same.report.d.a.a aVar = null;
                    if (NativeController.g) {
                        campaignEx.loadIconUrlAsyncWithBlock(null);
                        campaignEx.loadImageUrlAsyncWithBlock(null);
                    }
                    if (campaignEx != null) {
                        boolean zC = ai.c(NativeController.this.k, campaignEx.getPackageName());
                        Context unused = NativeController.this.k;
                        if (i < NativeController.this.u && campaignEx.getOfferType() != 99) {
                            if (ai.c(campaignEx)) {
                                campaignEx.setRtinsType(zC ? 1 : 2);
                            }
                            if (com.mbridge.msdk.foundation.same.c.a(NativeController.this.k, campaignEx)) {
                                arrayList.add(campaignEx);
                                if (!TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
                                    arrayList3.add(campaignEx);
                                }
                            } else {
                                ai.a(this.unitId, campaignEx, com.mbridge.msdk.foundation.same.a.x);
                                NativeController.this.ac = "APP ALREADY INSTALLED";
                            }
                            try {
                                com.mbridge.msdk.foundation.same.c.a(campaignEx, NativeController.this.k, null, new c.a() { // from class: com.mbridge.msdk.mbnative.controller.NativeController.a.1
                                    @Override // com.mbridge.msdk.foundation.same.c.a
                                    public final void a(String str, com.mbridge.msdk.foundation.same.report.d.b bVar) {
                                        com.mbridge.msdk.mbnative.e.a.a(str, bVar, campaignEx, NativeController.this.k, aVar);
                                    }
                                });
                            } catch (Exception e) {
                                if (MBridgeConstans.DEBUG) {
                                    e.printStackTrace();
                                }
                            }
                        }
                        if (i < NativeController.this.V && campaignEx.getOfferType() != 99) {
                            if (ai.c(campaignEx)) {
                                campaignEx.setRtinsType(zC ? 1 : 2);
                            }
                            if (!zC || ai.c(campaignEx)) {
                                arrayList2.add(campaignEx);
                            }
                        }
                        if (!kVarA.b(campaignEx.getId())) {
                            com.mbridge.msdk.foundation.entity.g gVar = new com.mbridge.msdk.foundation.entity.g();
                            gVar.a(campaignEx.getId());
                            gVar.b(campaignEx.getFca());
                            gVar.c(campaignEx.getFcb());
                            gVar.a(0);
                            gVar.d(0);
                            gVar.a(System.currentTimeMillis());
                            kVarA.a(gVar);
                        }
                        com.mbridge.msdk.click.c.a(NativeController.this.k, campaignEx.getMaitve(), campaignEx.getMaitve_src());
                    }
                }
                NativeController.c(NativeController.this, arrayList3);
                int type = campaignUnit.getAds().get(0) != null ? campaignUnit.getAds().get(0).getType() : 1;
                com.mbridge.msdk.mbnative.a.b<String, List<Campaign>> bVarA = com.mbridge.msdk.mbnative.a.c.a(type);
                if (bVarA != null) {
                    bVarA.a((com.mbridge.msdk.mbnative.a.b<String, List<Campaign>>) this.unitId, (String) arrayList2, NativeController.this.Q);
                }
                if (arrayList.size() == 0) {
                    if (NativeController.this.ac.contains("INSTALLED")) {
                        NativeController.this.a("APP ALREADY INSTALLED", b(), a(), campaignUnit.getAds().get(0));
                        new com.mbridge.msdk.foundation.c.b(880021, "APP ALREADY INSTALLED");
                        return;
                    } else {
                        NativeController.this.a("v3 response error", b(), a(), campaignUnit.getAds().get(0));
                        new com.mbridge.msdk.foundation.c.b(880003);
                        return;
                    }
                }
                NativeController nativeController4 = NativeController.this;
                nativeController4.a((List<Campaign>) nativeController4.a(type, (List<Campaign>) nativeController4.d(arrayList)));
                if (com.mbridge.msdk.mbnative.controller.d.b().containsKey(this.unitId) && Boolean.TRUE.equals(com.mbridge.msdk.mbnative.controller.d.b().get(this.unitId))) {
                    com.mbridge.msdk.mbnative.controller.d.a(NativeController.this.v, this.unitId);
                    return;
                }
                if (com.mbridge.msdk.mbnative.controller.d.e().containsKey(this.unitId) && (num = com.mbridge.msdk.mbnative.controller.d.e().get(this.unitId)) != null) {
                    iIntValue = num.intValue();
                }
                int i2 = NativeController.this.u + NativeController.this.w;
                NativeController.this.w = i2 <= iIntValue ? i2 : 0;
                return;
            }
            this.unitId = "0_" + this.unitId;
            com.mbridge.msdk.mbnative.controller.d.b(NativeController.this.v, this.unitId);
            NativeController.this.w = 0;
        }

        @Override // com.mbridge.msdk.mbnative.f.a.b
        public final void a(int i, String str) {
            NativeController.this.X = true;
            if (this.b) {
                if (NativeController.this.y || !this.d) {
                    return;
                }
                NativeController.this.a(str, b(), a(), (CampaignEx) null);
                return;
            }
            if (i == -1) {
                com.mbridge.msdk.mbnative.controller.d.b(NativeController.this.v, this.unitId);
                NativeController.this.w = 0;
            }
            if (this.c != null) {
                NativeController.this.f3120a.removeCallbacks(this.c);
            }
            if (NativeController.this.y) {
                return;
            }
            if (b() == 1 || this.d) {
                NativeController.this.a(str, b(), a(), (CampaignEx) null);
            }
        }

        public final void a(Runnable runnable) {
            this.c = runnable;
        }

        @Override // com.mbridge.msdk.mbnative.f.a.b
        public final void b(List<Frame> list) {
            if (this.b) {
                return;
            }
            if (this.c != null) {
                NativeController.this.f3120a.removeCallbacks(this.c);
            }
            if (list == null || list.size() == 0) {
                if (NativeController.this.i != null) {
                    NativeController.this.y = true;
                    NativeController.this.i.onAdLoadError("frame is empty");
                    return;
                }
                return;
            }
            Iterator<Frame> it = list.iterator();
            while (it.hasNext()) {
                List<CampaignEx> campaigns = it.next().getCampaigns();
                if (campaigns == null || campaigns.size() == 0) {
                    if (NativeController.this.i != null) {
                        NativeController.this.y = true;
                        NativeController.this.i.onAdLoadError("ads in frame is empty");
                        return;
                    }
                    return;
                }
                for (CampaignEx campaignEx : campaigns) {
                    if (NativeController.g) {
                        campaignEx.loadImageUrlAsyncWithBlock(null);
                        campaignEx.loadIconUrlAsyncWithBlock(null);
                    }
                }
            }
            if (NativeController.this.i != null) {
                NativeController.this.i.onAdFramesLoaded(list);
            }
        }
    }

    static /* synthetic */ void a(NativeController nativeController, Context context, final CampaignEx campaignEx) {
        if (campaignEx != null) {
            try {
                if (campaignEx.needShowIDialog() && com.mbridge.msdk.f.b.a()) {
                    new com.mbridge.msdk.widget.dialog.a() { // from class: com.mbridge.msdk.mbnative.controller.NativeController.8
                        @Override // com.mbridge.msdk.widget.dialog.a
                        public final void b() {
                        }

                        @Override // com.mbridge.msdk.widget.dialog.a
                        public final void c() {
                        }

                        @Override // com.mbridge.msdk.widget.dialog.a
                        public final void a() {
                            NativeController.this.s.a(campaignEx, NativeController.this.i);
                            NativeController.this.a(campaignEx);
                        }
                    };
                    if (com.mbridge.msdk.click.c.a(campaignEx) && campaignEx.needShowIDialog()) {
                        com.mbridge.msdk.click.a aVar = nativeController.s;
                        String str = nativeController.l;
                        nativeController.a(campaignEx);
                        nativeController.i.onAdClick(campaignEx);
                        return;
                    }
                }
            } catch (Throwable th) {
                ad.a(f, th.getMessage());
            }
        }
        nativeController.s.a(campaignEx, nativeController.i);
        nativeController.a(campaignEx);
    }

    static /* synthetic */ List a(NativeController nativeController, List list, boolean z) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                Campaign campaign = (Campaign) list.get(size);
                String id = campaign.getId();
                boolean z2 = campaign instanceof CampaignEx;
                if (z2) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(id);
                    CampaignEx campaignEx = (CampaignEx) campaign;
                    sb.append(campaignEx.getVideoUrlEncode());
                    sb.append(campaignEx.getBidToken());
                    id = sb.toString();
                }
                com.mbridge.msdk.videocommon.download.a aVarA = com.mbridge.msdk.videocommon.download.b.getInstance().a(nativeController.l, id);
                if (z) {
                    if (aVarA == null || !com.mbridge.msdk.videocommon.download.j.a(aVarA, nativeController.f().p())) {
                        com.mbridge.msdk.mbnative.a.c.a(campaign.getType()).a(nativeController.l, (Campaign) list.remove(size), nativeController.Q);
                    }
                } else if (z2) {
                    CampaignEx campaignEx2 = (CampaignEx) campaign;
                    if (TextUtils.isEmpty(campaignEx2.getImageUrl()) && !TextUtils.isEmpty(campaignEx2.getVideoUrlEncode()) && (aVarA == null || !com.mbridge.msdk.videocommon.download.j.a(aVarA, nativeController.f().p()))) {
                        com.mbridge.msdk.mbnative.a.c.a(campaign.getType()).a(nativeController.l, (Campaign) list.remove(size), nativeController.Q);
                    }
                }
            }
        }
        return list;
    }

    static /* synthetic */ void a(NativeController nativeController, final CampaignEx campaignEx, View view, List list, AdSession adSession) {
        try {
            c.a aVar = new c.a() { // from class: com.mbridge.msdk.mbnative.controller.NativeController.11
                @Override // com.mbridge.msdk.mbnative.controller.c.a
                public final void a(ArrayList<View> arrayList, ArrayList<View> arrayList2) {
                    if (arrayList == null || arrayList.size() <= 0) {
                        return;
                    }
                    com.mbridge.msdk.mbnative.e.b.a(campaignEx, NativeController.this.k, NativeController.this.l, NativeController.this.i);
                }
            };
            com.mbridge.msdk.mbnative.controller.c cVar = new com.mbridge.msdk.mbnative.controller.c(list, aVar, new Handler(Looper.getMainLooper()), campaignEx.getImpReportType());
            cVar.a(view);
            List<com.mbridge.msdk.mbnative.controller.c> list2 = nativeController.G;
            if (list2 != null) {
                list2.add(cVar);
            }
            List<c.a> list3 = nativeController.H;
            if (list3 != null) {
                list3.add(aVar);
            }
            AdEvents adEvents = nativeController.ad;
            if (adEvents != null) {
                adEvents.impressionOccurred();
            }
        } catch (Exception unused) {
        }
    }

    static /* synthetic */ void c(NativeController nativeController, List list) {
        if (list != null) {
            try {
                if (list.size() > 0) {
                    try {
                        Class.forName("com.mbridge.msdk.nativex.view.MBMediaView");
                        Class.forName("com.mbridge.msdk.videocommon.download.b");
                        Class<?> cls = Class.forName("com.mbridge.msdk.videocommon.download.b");
                        Class<?> cls2 = Class.forName("com.mbridge.msdk.videocommon.listener.a");
                        Object objInvoke = cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
                        if (objInvoke != null) {
                            cls.getMethod("createUnitCache", Context.class, String.class, CopyOnWriteArrayList.class, Integer.TYPE, cls2).invoke(objInvoke, nativeController.k, nativeController.l, new CopyOnWriteArrayList(list), 1, null);
                            cls.getMethod("load", String.class).invoke(objInvoke, nativeController.l);
                        }
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            CampaignEx campaignEx = (CampaignEx) it.next();
                            if (campaignEx != null && !TextUtils.isEmpty(campaignEx.getImageUrl())) {
                                com.mbridge.msdk.foundation.same.c.b.a(com.mbridge.msdk.foundation.controller.c.m().c()).a(campaignEx.getImageUrl(), new com.mbridge.msdk.foundation.same.c.c() { // from class: com.mbridge.msdk.mbnative.controller.NativeController.4
                                    @Override // com.mbridge.msdk.foundation.same.c.c
                                    public final void onFailedLoad(String str, String str2) {
                                    }

                                    @Override // com.mbridge.msdk.foundation.same.c.c
                                    public final void onSuccessLoad(Bitmap bitmap, String str) {
                                    }
                                });
                            }
                            try {
                                Class.forName("com.mbridge.msdk.videocommon.download.d");
                                String str = campaignEx != null ? campaignEx.getendcard_url() : "";
                                com.mbridge.msdk.foundation.same.report.d.b bVar = new com.mbridge.msdk.foundation.same.report.d.b();
                                bVar.a(campaignEx);
                                if (!TextUtils.isEmpty(str)) {
                                    bVar.c((campaignEx == null || campaignEx.getAabEntity() == null) ? 0 : campaignEx.getAabEntity().h3c);
                                    if (str.contains(".zip") && str.contains(ResourceManager.KEY_MD5FILENAME)) {
                                        H5DownLoadManager.getInstance().downloadH5Res(bVar, str, new g(nativeController.l, campaignEx, TextUtils.isEmpty(H5DownLoadManager.getInstance().getH5ResAddress(str))));
                                    } else {
                                        H5DownLoadManager.getInstance().downloadH5Res(bVar, str, new d(nativeController.l, campaignEx, TextUtils.isEmpty(HTMLResourceManager.getInstance().getHtmlContentFromUrl(str))));
                                    }
                                }
                            } catch (Exception unused) {
                            }
                        }
                    } catch (Throwable unused2) {
                        ad.b(f, "please import the videocommon and nativex aar");
                    }
                }
            } catch (Throwable th) {
                if (MBridgeConstans.DEBUG) {
                    th.printStackTrace();
                }
            }
        }
    }
}
