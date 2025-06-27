package com.mbridge.msdk.out;

import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.x;
import com.mbridge.msdk.system.NoProGuard;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes4.dex */
public class CustomInfoManager implements NoProGuard {
    private static CustomInfoManager INSTANCE = null;
    private static String TAG = "CustomInfoManager";
    public static final int TYPE_BID = 6;
    public static final int TYPE_BIDLOAD = 7;
    public static final int TYPE_LOAD = 8;
    private ConcurrentHashMap<String, String> infoMap = new ConcurrentHashMap<>();

    private CustomInfoManager() {
    }

    public static synchronized CustomInfoManager getInstance() {
        if (INSTANCE == null) {
            synchronized (CustomInfoManager.class) {
                if (INSTANCE == null) {
                    INSTANCE = new CustomInfoManager();
                }
            }
        }
        return INSTANCE;
    }

    public String getCustomInfoByType(String str, int i) {
        return TextUtils.isEmpty(str) ? "" : getCustomInfoByUnitId(str, i);
    }

    public String getCustomInfoByUnitId(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return "";
        }
        try {
            Uri uri = Uri.parse(str2);
            if (uri != null) {
                String host = uri.getHost();
                String path = uri.getPath();
                if (!TextUtils.isEmpty(host) && host.contains("hb") && !TextUtils.isEmpty(path) && path.contains("bid")) {
                    return getCustomInfoByUnitId(str, 6);
                }
                if (!TextUtils.isEmpty(host) && host.contains("hb") && !TextUtils.isEmpty(path) && path.contains("load")) {
                    return getCustomInfoByUnitId(str, 7);
                }
                if (!TextUtils.isEmpty(path) && path.contains("v3")) {
                    return getCustomInfoByUnitId(str, 8);
                }
            }
        } catch (Throwable th) {
            ad.a(TAG, "Exception", th);
        }
        return "";
    }

    public String getCustomInfoByUnitId(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (i == 6) {
            return this.infoMap.get(str + "_bid");
        }
        if (i != 7) {
            return i != 8 ? "" : this.infoMap.get(str);
        }
        return this.infoMap.get(str + "_bidload");
    }

    public void setCustomInfo(String str, int i, String str2) {
        if (TextUtils.isEmpty(str) || str2 == null) {
            return;
        }
        String strB = x.b(str2);
        if (i == 6) {
            this.infoMap.put(str + "_bid", strB);
            return;
        }
        if (i != 7) {
            if (i != 8) {
                return;
            }
            this.infoMap.put(str, strB);
        } else {
            this.infoMap.put(str + "_bidload", strB);
        }
    }
}
