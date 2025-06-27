package com.mbridge.msdk.newreward.function.h;

import android.text.TextUtils;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.mbridge.msdk.c.h;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.x;
import com.mbridge.msdk.newreward.function.common.MBridgeTaskManager;
import java.io.File;
import java.io.FileInputStream;
import java.net.URL;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MBridgeCommonUtils.java */
/* loaded from: classes4.dex */
public final class a {
    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            String path = new URL(str).getPath();
            return path.substring(path.lastIndexOf(47) + 1);
        } catch (Exception unused) {
            return str;
        }
    }

    public static boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return ai.i(str);
    }

    public static boolean c(String str) {
        String[] strArrSplit;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            String[] strArrSplit2 = str.split("_");
            if (strArrSplit2.length < 4) {
                return false;
            }
            String str2 = strArrSplit2[3];
            if (!TextUtils.isEmpty(str2) && (strArrSplit = x.a(str2).split("\\|")) != null) {
                if (strArrSplit.length != 0) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return true;
        }
    }

    public static String a(File file) throws Throwable {
        FileInputStream fileInputStream;
        StringBuilder sb = new StringBuilder();
        FileInputStream fileInputStream2 = null;
        try {
            try {
                try {
                    fileInputStream = new FileInputStream(file);
                } catch (Exception unused) {
                }
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception unused2) {
        }
        try {
            byte[] bArr = new byte[1024];
            for (int i = fileInputStream.read(bArr); i > 0; i = fileInputStream.read(bArr)) {
                sb.append(new String(bArr, 0, i));
            }
            fileInputStream.close();
        } catch (Exception unused3) {
            fileInputStream2 = fileInputStream;
            sb.setLength(0);
            if (fileInputStream2 != null) {
                fileInputStream2.close();
            }
            return sb.toString();
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
            if (fileInputStream2 != null) {
                try {
                    fileInputStream2.close();
                } catch (Exception unused4) {
                }
            }
            throw th;
        }
        return sb.toString();
    }

    public static double d(String str) {
        String[] strArrSplit;
        if (TextUtils.isEmpty(str)) {
            return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        }
        try {
            strArrSplit = str.split("_");
        } catch (Exception unused) {
        }
        if (strArrSplit.length < 4) {
            return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        }
        String str2 = strArrSplit[3];
        if (TextUtils.isEmpty(str2)) {
            return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        }
        String[] strArrSplit2 = x.a(str2).split("\\|");
        if (strArrSplit2.length > 0) {
            return Double.parseDouble(strArrSplit2[0]);
        }
        return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    public static void a(final String str, final int i, final int i2, final int i3) {
        MBridgeTaskManager.commonExecute(new Runnable() { // from class: com.mbridge.msdk.newreward.function.h.a.1
            @Override // java.lang.Runnable
            public final void run() throws JSONException {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("ivRewardEnable", 1);
                    jSONObject.put("ivRewardMode", i == com.mbridge.msdk.foundation.same.a.G ? 0 : 1);
                    jSONObject.put("ivRewardPlayValueMode", i2 == com.mbridge.msdk.foundation.same.a.I ? 0 : 1);
                    jSONObject.put("ivRewardPlayValue", i3);
                    h.a().f(str, jSONObject.toString());
                } catch (Exception unused) {
                }
            }
        });
    }
}
