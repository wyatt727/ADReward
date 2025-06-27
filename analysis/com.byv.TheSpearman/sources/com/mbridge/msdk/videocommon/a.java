package com.mbridge.msdk.videocommon;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: TemplateWebviewCache.java */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0310a> f3870a = new ConcurrentHashMap<>();
    private static ConcurrentHashMap<String, C0310a> b = new ConcurrentHashMap<>();
    private static ConcurrentHashMap<String, C0310a> c = new ConcurrentHashMap<>();
    private static ConcurrentHashMap<String, C0310a> d = new ConcurrentHashMap<>();
    private static ConcurrentHashMap<String, C0310a> e = new ConcurrentHashMap<>();
    private static ConcurrentHashMap<String, C0310a> f = new ConcurrentHashMap<>();
    private static ConcurrentHashMap<String, C0310a> g = new ConcurrentHashMap<>();
    private static ConcurrentHashMap<String, C0310a> h = new ConcurrentHashMap<>();
    private static ConcurrentHashMap<String, C0310a> i = new ConcurrentHashMap<>();
    private static ConcurrentHashMap<String, C0310a> j = new ConcurrentHashMap<>();

    /* compiled from: TemplateWebviewCache.java */
    /* renamed from: com.mbridge.msdk.videocommon.a$a, reason: collision with other inner class name */
    public static class C0310a {

        /* renamed from: a, reason: collision with root package name */
        private WindVaneWebView f3871a;
        private boolean b;

        public final WindVaneWebView a() {
            return this.f3871a;
        }

        public final void a(WindVaneWebView windVaneWebView) {
            this.f3871a = windVaneWebView;
        }

        public final void a(String str) {
            WindVaneWebView windVaneWebView = this.f3871a;
            if (windVaneWebView != null) {
                windVaneWebView.setTag(str);
            }
        }

        public final String b() {
            WindVaneWebView windVaneWebView = this.f3871a;
            return windVaneWebView != null ? (String) windVaneWebView.getTag() : "";
        }

        public final boolean c() {
            return this.b;
        }

        public final void a(boolean z) {
            this.b = z;
        }
    }

    public static C0310a a(String str) {
        if (g.containsKey(str)) {
            return g.get(str);
        }
        if (h.containsKey(str)) {
            return h.get(str);
        }
        if (i.containsKey(str)) {
            return i.get(str);
        }
        if (j.containsKey(str)) {
            return j.get(str);
        }
        return null;
    }

    public static void a(String str, C0310a c0310a, boolean z, boolean z2) {
        if (z) {
            if (z2) {
                h.put(str, c0310a);
                return;
            } else {
                g.put(str, c0310a);
                return;
            }
        }
        if (z2) {
            j.put(str, c0310a);
        } else {
            i.put(str, c0310a);
        }
    }

    public static void b(String str) {
        if (g.containsKey(str)) {
            g.remove(str);
        }
        if (i.containsKey(str)) {
            i.remove(str);
        }
        if (h.containsKey(str)) {
            h.remove(str);
        }
        if (j.containsKey(str)) {
            j.remove(str);
        }
    }

    public static void c(String str) {
        if (!TextUtils.isEmpty(str)) {
            for (String str2 : g.keySet()) {
                if (!TextUtils.isEmpty(str2) && str2.startsWith(str)) {
                    g.remove(str2);
                }
            }
        } else {
            g.clear();
        }
        h.clear();
    }

    public static void a() {
        i.clear();
        j.clear();
    }

    public static void d(String str) {
        for (Map.Entry<String, C0310a> entry : g.entrySet()) {
            if (entry.getKey().contains(str)) {
                g.remove(entry.getKey());
            }
        }
    }

    public static void e(String str) {
        for (Map.Entry<String, C0310a> entry : h.entrySet()) {
            if (entry.getKey().contains(str)) {
                h.remove(entry.getKey());
            }
        }
    }

    public static C0310a a(int i2, CampaignEx campaignEx) {
        if (campaignEx == null) {
            return null;
        }
        try {
            String requestIdNotice = campaignEx.getRequestIdNotice();
            if (i2 == 288) {
                requestIdNotice = campaignEx.getKeyIaUrl();
            }
            if (i2 != 94) {
                if (i2 != 287) {
                    if (i2 == 288) {
                        ConcurrentHashMap<String, C0310a> concurrentHashMap = d;
                        if (concurrentHashMap != null && concurrentHashMap.size() > 0) {
                            return d.get(requestIdNotice);
                        }
                    } else {
                        ConcurrentHashMap<String, C0310a> concurrentHashMap2 = f3870a;
                        if (concurrentHashMap2 != null && concurrentHashMap2.size() > 0) {
                            return f3870a.get(requestIdNotice);
                        }
                    }
                } else if (campaignEx.isBidCampaign()) {
                    ConcurrentHashMap<String, C0310a> concurrentHashMap3 = c;
                    if (concurrentHashMap3 != null && concurrentHashMap3.size() > 0) {
                        return c.get(requestIdNotice);
                    }
                } else {
                    ConcurrentHashMap<String, C0310a> concurrentHashMap4 = f;
                    if (concurrentHashMap4 != null && concurrentHashMap4.size() > 0) {
                        return f.get(requestIdNotice);
                    }
                }
            } else if (campaignEx.isBidCampaign()) {
                ConcurrentHashMap<String, C0310a> concurrentHashMap5 = b;
                if (concurrentHashMap5 != null && concurrentHashMap5.size() > 0) {
                    return b.get(requestIdNotice);
                }
            } else {
                ConcurrentHashMap<String, C0310a> concurrentHashMap6 = e;
                if (concurrentHashMap6 != null && concurrentHashMap6.size() > 0) {
                    return e.get(requestIdNotice);
                }
            }
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                e2.printStackTrace();
            }
        }
        return null;
    }

    public static void b(int i2, CampaignEx campaignEx) {
        if (campaignEx == null) {
            return;
        }
        try {
            String requestIdNotice = campaignEx.getRequestIdNotice();
            if (i2 == 288) {
                requestIdNotice = campaignEx.getKeyIaUrl();
            }
            if (i2 == 94) {
                if (campaignEx.isBidCampaign()) {
                    ConcurrentHashMap<String, C0310a> concurrentHashMap = b;
                    if (concurrentHashMap != null) {
                        concurrentHashMap.remove(requestIdNotice);
                        return;
                    }
                    return;
                }
                ConcurrentHashMap<String, C0310a> concurrentHashMap2 = e;
                if (concurrentHashMap2 != null) {
                    concurrentHashMap2.remove(requestIdNotice);
                    return;
                }
                return;
            }
            if (i2 != 287) {
                if (i2 == 288) {
                    ConcurrentHashMap<String, C0310a> concurrentHashMap3 = d;
                    if (concurrentHashMap3 != null) {
                        concurrentHashMap3.remove(requestIdNotice);
                        return;
                    }
                    return;
                }
                ConcurrentHashMap<String, C0310a> concurrentHashMap4 = f3870a;
                if (concurrentHashMap4 != null) {
                    concurrentHashMap4.remove(requestIdNotice);
                    return;
                }
                return;
            }
            if (campaignEx.isBidCampaign()) {
                ConcurrentHashMap<String, C0310a> concurrentHashMap5 = c;
                if (concurrentHashMap5 != null) {
                    concurrentHashMap5.remove(requestIdNotice);
                    return;
                }
                return;
            }
            ConcurrentHashMap<String, C0310a> concurrentHashMap6 = f;
            if (concurrentHashMap6 != null) {
                concurrentHashMap6.remove(requestIdNotice);
            }
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                e2.printStackTrace();
            }
        }
    }

    public static void a(int i2, String str, C0310a c0310a) {
        try {
            if (i2 == 94) {
                if (b == null) {
                    b = new ConcurrentHashMap<>();
                }
                b.put(str, c0310a);
            } else {
                if (i2 != 287) {
                    return;
                }
                if (c == null) {
                    c = new ConcurrentHashMap<>();
                }
                c.put(str, c0310a);
            }
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                e2.printStackTrace();
            }
        }
    }

    public static void b(int i2, String str, C0310a c0310a) {
        try {
            if (i2 == 94) {
                if (e == null) {
                    e = new ConcurrentHashMap<>();
                }
                e.put(str, c0310a);
            } else if (i2 == 287) {
                if (f == null) {
                    f = new ConcurrentHashMap<>();
                }
                f.put(str, c0310a);
            } else if (i2 == 288) {
                if (d == null) {
                    d = new ConcurrentHashMap<>();
                }
                d.put(str, c0310a);
            } else {
                if (f3870a == null) {
                    f3870a = new ConcurrentHashMap<>();
                }
                f3870a.put(str, c0310a);
            }
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                e2.printStackTrace();
            }
        }
    }
}
