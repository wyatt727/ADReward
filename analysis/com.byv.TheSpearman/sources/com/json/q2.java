package com.json;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class q2 {
    public static Network a(Context context) {
        if (context == null) {
            return null;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (Build.VERSION.SDK_INT >= 23 && connectivityManager != null) {
            try {
                return connectivityManager.getActiveNetwork();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public static String a(Network network, Context context) {
        NetworkCapabilities networkCapabilities;
        if (context == null) {
            return "none";
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (network == null || connectivityManager == null) {
            return "none";
        }
        try {
            if (Build.VERSION.SDK_INT >= 21 && (networkCapabilities = connectivityManager.getNetworkCapabilities(network)) != null) {
                return networkCapabilities.hasTransport(1) ? p2.b : networkCapabilities.hasTransport(0) ? p2.f2055a : c(context);
            }
            return c(context);
        } catch (Exception e) {
            e.printStackTrace();
            return "none";
        }
    }

    public static JSONObject a(Context context, Network network) throws JSONException {
        NetworkCapabilities networkCapabilities;
        if (context == null) {
            return new JSONObject();
        }
        JSONObject jSONObject = new JSONObject();
        if (Build.VERSION.SDK_INT >= 23 && network != null) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(network)) != null) {
                    jSONObject.put("networkCapabilities", networkCapabilities.toString());
                    jSONObject.put("downloadSpeed", networkCapabilities.getLinkDownstreamBandwidthKbps());
                    jSONObject.put("uploadSpeed", networkCapabilities.getLinkUpstreamBandwidthKbps());
                    jSONObject.put("hasVPN", d(context));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return jSONObject;
    }

    public static String b(Context context) {
        return Build.VERSION.SDK_INT >= 23 ? a(a(context), context) : c(context);
    }

    private static String b(Context context, Network network) {
        NetworkCapabilities networkCapabilities;
        if (Build.VERSION.SDK_INT >= 23 && network != null && context != null) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(network)) == null) {
                    return "";
                }
                if (networkCapabilities.hasTransport(1)) {
                    return p2.b;
                }
                if (networkCapabilities.hasTransport(0)) {
                    return p2.g;
                }
                if (networkCapabilities.hasTransport(4)) {
                    return "vpn";
                }
                if (networkCapabilities.hasTransport(3)) {
                    return p2.e;
                }
                if (networkCapabilities.hasTransport(5)) {
                    return p2.h;
                }
                if (networkCapabilities.hasTransport(6)) {
                    return p2.i;
                }
                if (networkCapabilities.hasTransport(2)) {
                    return p2.d;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return "";
    }

    private static String c(Context context) {
        String strA = p2.a(context);
        return TextUtils.isEmpty(strA) ? "none" : strA;
    }

    public static boolean d(Context context) {
        return b(context, a(context)).equals("vpn");
    }
}
