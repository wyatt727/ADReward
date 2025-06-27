package com.bykv.vk.openvk.preload.geckox;

import android.content.Context;
import android.text.TextUtils;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bykv.vk.openvk.preload.geckox.net.INetWork;
import com.json.z4;
import java.io.File;
import java.io.InputStream;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* compiled from: GeckoHubUtil.java */
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    static File f1402a;
    static Context b;
    static String c;
    private static final Set<String> g = new HashSet(Arrays.asList("js", "css", "html", "ico", "jpeg", "jpg", "png", "gif", "woff", "svg", "ttf", "woff2", "webp", "otf", "sfnt"));
    INetWork d;
    private Map.Entry<String, JSONObject> e;
    private Map.Entry<String, JSONObject> f;

    /* synthetic */ c(byte b2) {
        this();
    }

    /* compiled from: GeckoHubUtil.java */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        private static c f1403a = new c(0);
    }

    public static c a(Context context) {
        b = context;
        if (f1402a == null) {
            f1402a = new File(b.getCacheDir() + File.separator + "gecko");
        }
        return a.f1403a;
    }

    public static c a() {
        return a.f1403a;
    }

    private c() {
    }

    public static void a(String str) {
        c = str;
    }

    private static String b(String str) {
        if (str == null) {
            return null;
        }
        int iIndexOf = str.indexOf("?");
        return iIndexOf == -1 ? str : str.substring(0, iIndexOf);
    }

    private JSONObject a(String str, String str2) {
        if (str != null && str2 != null) {
            try {
                Map.Entry<String, JSONObject> entry = this.e;
                if (entry == null || !str.equals(entry.getKey())) {
                    String strA = com.bykv.vk.openvk.preload.geckox.utils.c.a(new com.bykv.vk.openvk.preload.falconx.loader.a(b, "cca47107bfcbdb211d88f3385aeede40", f1402a).getInputStream(str + "/manifest.json"));
                    if (TextUtils.isEmpty(strA)) {
                        return null;
                    }
                    this.e = new AbstractMap.SimpleEntry(str, new JSONObject(strA));
                }
                Map.Entry<String, JSONObject> entry2 = this.f;
                if (entry2 == null || !str.equals(entry2.getKey())) {
                    String strA2 = com.bykv.vk.openvk.preload.geckox.utils.c.a(new com.bykv.vk.openvk.preload.falconx.loader.a(b, "cca47107bfcbdb211d88f3385aeede40", f1402a).getInputStream(str + "/md5_url_map.json"));
                    if (TextUtils.isEmpty(strA2)) {
                        return null;
                    }
                    this.f = new AbstractMap.SimpleEntry(str, new JSONObject(strA2));
                }
                JSONObject value = this.e.getValue();
                JSONObject value2 = this.f.getValue();
                String strA3 = a(str2, value2);
                if (value.has(strA3)) {
                    JSONObject jSONObject = value.getJSONObject(strA3);
                    a(value, strA3, str2);
                    return jSONObject;
                }
                String strB = b(str2);
                if (strB == null) {
                    return null;
                }
                String strA4 = a(strB, value2);
                if (value.has(strA4)) {
                    JSONObject jSONObject2 = value.getJSONObject(strA4);
                    a(value, strA4, str2);
                    return jSONObject2;
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    private static String a(String str, JSONObject jSONObject) {
        try {
            return jSONObject.getJSONObject(str).getString("md5");
        } catch (Throwable unused) {
            return "";
        }
    }

    private void a(JSONObject jSONObject, String str, String str2) {
        try {
            if ("once".equals(jSONObject.getJSONObject(str).optJSONObject("cacheStrategy").optString("hitStrategy"))) {
                jSONObject.remove(str);
                c(str2);
            }
        } catch (Throwable unused) {
        }
    }

    private void c(String str) {
        try {
            if (this.d == null || TextUtils.isEmpty(str)) {
                return;
            }
            this.d.syncDoGet(str);
        } catch (Throwable unused) {
        }
    }

    public static com.bykv.vk.openvk.preload.falconx.loader.a b() {
        try {
            return new com.bykv.vk.openvk.preload.falconx.loader.a(b, "cca47107bfcbdb211d88f3385aeede40", f1402a);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void a(ILoader iLoader) {
        if (iLoader != null) {
            try {
                iLoader.release();
            } catch (Throwable unused) {
            }
        }
    }

    public final WebResourceResponseModel a(ILoader iLoader, String str, String str2) {
        try {
            if (iLoader == null) {
                return new WebResourceResponseModel(-1, null);
            }
            boolean z = false;
            if (!TextUtils.isEmpty(str2) && !str2.matches("^https?:\\/\\/www\\.google-analytics\\.com/(?:ga|urchin|analytics)\\.js") && !str2.matches("^https?:\\/\\/www\\.googletagmanager\\.com\\/(gtag\\/js|gtm\\.js)") && !str2.matches("^https?:\\/\\/analytics\\.tiktok\\.com\\/i18n\\/pixel") && !str2.matches("https?:\\/\\/connect\\.facebook\\.net\\/(.*)\\/fbevents\\.js") && !str2.matches("https?:\\/\\/mc\\.yandex\\.ru\\/") && !str2.contains("jsonp") && !str2.contains("Callback") && !str2.contains("analytics.tiktok.com/i18n/pixel") && !str2.contains("google-analytics.com/analytics") && !str2.contains("connect.facebook.net") && !str2.contains("www.googletagmanager.com")) {
                z = true;
            }
            if (!z) {
                return new WebResourceResponseModel(1, null);
            }
            JSONObject jSONObjectA = a(str, str2);
            Set<String> set = g;
            String strB = b(str2);
            int iLastIndexOf = strB.lastIndexOf(".");
            int i = set.contains(iLastIndexOf == -1 ? "" : strB.substring(iLastIndexOf + 1)) ? 2 : -1;
            if (jSONObjectA == null) {
                return new WebResourceResponseModel(i, null);
            }
            String strOptString = jSONObjectA.optString(z4.c.b, null);
            if (strOptString == null) {
                return new WebResourceResponseModel(i, null);
            }
            JSONObject jSONObject = jSONObjectA.has("respHeader") ? jSONObjectA.getJSONObject("respHeader") : null;
            if (jSONObject == null) {
                return new WebResourceResponseModel(i, null);
            }
            String str3 = str + File.separator + strOptString;
            InputStream inputStream = !iLoader.exist(str3) ? null : iLoader.getInputStream(str3);
            if (inputStream == null) {
                return new WebResourceResponseModel(i, null);
            }
            HashMap map = new HashMap();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.getString(next));
            }
            return new WebResourceResponseModel(i, com.bykv.vk.openvk.preload.falconx.a.a.a(inputStream, map));
        } catch (Throwable unused) {
            return new WebResourceResponseModel(-1, null);
        }
    }

    public static int a(ILoader iLoader, String str) {
        if (iLoader == null || str == null) {
            return 0;
        }
        try {
            com.bykv.vk.openvk.preload.falconx.loader.a aVar = new com.bykv.vk.openvk.preload.falconx.loader.a(b, "cca47107bfcbdb211d88f3385aeede40", f1402a);
            String str2 = str + File.separator;
            if (aVar.b.get()) {
                throw new RuntimeException("released!");
            }
            com.bykv.vk.openvk.preload.geckox.f.b bVar = aVar.f1383a;
            if (bVar.b.get()) {
                throw new RuntimeException("released");
            }
            if (TextUtils.isEmpty(str2)) {
                throw new RuntimeException("relativePath empty");
            }
            return bVar.a(str2.trim()).b(str2);
        } catch (Throwable unused) {
            return 0;
        }
    }
}
