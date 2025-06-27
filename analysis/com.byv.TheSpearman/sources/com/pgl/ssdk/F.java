package com.pgl.ssdk;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkAddress;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkInfo;
import android.net.RouteInfo;
import android.os.Build;
import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Collections;
import org.json.JSONArray;

/* loaded from: classes4.dex */
public class F {
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized java.lang.String a(android.content.Context r8) {
        /*
            java.lang.Class<com.pgl.ssdk.F> r0 = com.pgl.ssdk.F.class
            monitor-enter(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc4
            r1.<init>()     // Catch: java.lang.Throwable -> Lc4
            java.io.File r2 = r8.getFilesDir()     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r2 = r2.getAbsolutePath()     // Catch: java.lang.Throwable -> Lc4
            r1.append(r2)     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r2 = "/cid"
            r1.append(r2)     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Lc4
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> Lc4
            r2.<init>(r1)     // Catch: java.lang.Throwable -> Lc4
            boolean r2 = r2.exists()     // Catch: java.lang.Throwable -> Lc4
            if (r2 == 0) goto L4f
            java.lang.String r2 = "chmod 777 "
            java.lang.String r3 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r2 = r2.concat(r3)     // Catch: java.lang.Throwable -> Lc4
            a(r2)     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r2 = a(r1)     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r3 = "chmod 600 "
            java.lang.String r4 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r3 = r3.concat(r4)     // Catch: java.lang.Throwable -> Lc4
            a(r3)     // Catch: java.lang.Throwable -> Lc4
            if (r2 == 0) goto L4f
            int r3 = r2.length()     // Catch: java.lang.Throwable -> Lc4
            if (r3 <= 0) goto L4f
            monitor-exit(r0)
            return r2
        L4f:
            android.content.res.Resources r8 = r8.getResources()     // Catch: java.lang.Throwable -> Lc4
            android.content.res.AssetManager r8 = r8.getAssets()     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r2 = "cid"
            java.io.InputStream r8 = r8.open(r2)     // Catch: java.lang.Throwable -> Lc4
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> Lc4
            r2.<init>()     // Catch: java.lang.Throwable -> Lc4
            r3 = 4096(0x1000, float:5.74E-42)
            byte[] r4 = new byte[r3]     // Catch: java.lang.Throwable -> Lc4
        L66:
            r5 = 0
            int r6 = r8.read(r4, r5, r3)     // Catch: java.lang.Throwable -> Lc4
            r7 = -1
            if (r6 == r7) goto L72
            r2.write(r4, r5, r6)     // Catch: java.lang.Throwable -> Lc4
            goto L66
        L72:
            java.io.FileOutputStream r8 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> Lc4
            r8.<init>(r1)     // Catch: java.lang.Throwable -> Lc4
            byte[] r2 = r2.toByteArray()     // Catch: java.lang.Throwable -> Lc4
            r8.write(r2)     // Catch: java.lang.Throwable -> Lc4
            r8.close()     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r8 = "chmod 777 "
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r8 = r8.concat(r2)     // Catch: java.lang.Throwable -> Lc4
            a(r8)     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r8 = a(r1)     // Catch: java.lang.Throwable -> Lc4
            if (r8 == 0) goto L9a
            int r2 = r8.length()     // Catch: java.lang.Throwable -> Lc4
            if (r2 != 0) goto Lb6
        L9a:
            java.io.RandomAccessFile r8 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r2 = "rw"
            r8.<init>(r1, r2)     // Catch: java.lang.Throwable -> Lc4
            r2 = 1
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> Lc4
            r3 = 2
            r2[r5] = r3     // Catch: java.lang.Throwable -> Lc4
            r3 = 16
            r8.seek(r3)     // Catch: java.lang.Throwable -> Lc4
            r8.write(r2)     // Catch: java.lang.Throwable -> Lc4
            r8.close()     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r8 = a(r1)     // Catch: java.lang.Throwable -> Lc4
        Lb6:
            java.lang.String r2 = "chmod 600 "
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r1 = r2.concat(r1)     // Catch: java.lang.Throwable -> Lc4
            a(r1)     // Catch: java.lang.Throwable -> Lc4
            goto Lc6
        Lc4:
            java.lang.String r8 = "0[<!>]EXCEPTION[<!>]"
        Lc6:
            if (r8 == 0) goto Lce
            int r1 = r8.length()     // Catch: java.lang.Throwable -> Ld2
            if (r1 != 0) goto Ld0
        Lce:
            java.lang.String r8 = "0[<!>]ERROR[<!>]"
        Ld0:
            monitor-exit(r0)
            return r8
        Ld2:
            r8 = move-exception
            monitor-exit(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pgl.ssdk.F.a(android.content.Context):java.lang.String");
    }

    private static String a(BufferedInputStream bufferedInputStream) {
        int i;
        byte[] bArr = new byte[4096];
        StringBuilder sb = new StringBuilder();
        do {
            try {
                i = bufferedInputStream.read(bArr);
                if (i > 0) {
                    sb.append(new String(bArr, 0, i));
                }
            } catch (Exception unused) {
            }
        } while (i >= 4096);
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006b A[PHI: r0 r1
      0x006b: PHI (r0v3 java.lang.String) = (r0v6 java.lang.String), (r0v5 java.lang.String) binds: [B:34:0x0068, B:9:0x003c] A[DONT_GENERATE, DONT_INLINE]
      0x006b: PHI (r1v6 java.lang.Process) = (r1v5 java.lang.Process), (r1v8 java.lang.Process) binds: [B:34:0x0068, B:9:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0052 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x004d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0065 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0060 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String a(java.lang.String r5) throws java.lang.Throwable {
        /*
            r0 = 0
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L5b
            java.lang.String r2 = "sh"
            java.lang.Process r1 = r1.exec(r2)     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L5b
            java.io.BufferedOutputStream r2 = new java.io.BufferedOutputStream     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L5c
            java.io.OutputStream r3 = r1.getOutputStream()     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L5c
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L5c
            java.io.BufferedInputStream r3 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L44
            java.io.InputStream r4 = r1.getInputStream()     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L44
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L44
            byte[] r5 = r5.getBytes()     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L5e
            r2.write(r5)     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L5e
            r5 = 10
            r2.write(r5)     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L5e
            r2.flush()     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L5e
            r2.close()     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L5e
            r1.waitFor()     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L5e
            java.lang.String r5 = a(r3)     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L5e
            r2.close()     // Catch: java.io.IOException -> L39
        L39:
            r3.close()     // Catch: java.io.IOException -> L3c
        L3c:
            r0 = r5
            goto L6b
        L3e:
            r5 = move-exception
            goto L42
        L40:
            r5 = move-exception
            r3 = r0
        L42:
            r0 = r2
            goto L4b
        L44:
            r3 = r0
            goto L5e
        L46:
            r5 = move-exception
            goto L4a
        L48:
            r5 = move-exception
            r1 = r0
        L4a:
            r3 = r0
        L4b:
            if (r0 == 0) goto L50
            r0.close()     // Catch: java.io.IOException -> L50
        L50:
            if (r3 == 0) goto L55
            r3.close()     // Catch: java.io.IOException -> L55
        L55:
            if (r1 == 0) goto L5a
            r1.destroy()
        L5a:
            throw r5
        L5b:
            r1 = r0
        L5c:
            r2 = r0
            r3 = r2
        L5e:
            if (r2 == 0) goto L63
            r2.close()     // Catch: java.io.IOException -> L63
        L63:
            if (r3 == 0) goto L68
            r3.close()     // Catch: java.io.IOException -> L68
        L68:
            if (r1 != 0) goto L6b
            goto L6e
        L6b:
            r1.destroy()
        L6e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pgl.ssdk.F.a(java.lang.String):java.lang.String");
    }

    private static void a(LinkProperties linkProperties, JSONArray jSONArray) {
        InetAddress gateway2;
        if (Build.VERSION.SDK_INT >= 21) {
            for (RouteInfo routeInfo : linkProperties.getRoutes()) {
                if (routeInfo != null && routeInfo.isDefaultRoute() && (gateway2 = routeInfo.getGateway()) != null && (!(gateway2 instanceof Inet6Address) || !"::".equals(gateway2.getHostAddress()))) {
                    jSONArray.put(gateway2.getHostAddress());
                }
            }
        }
    }

    private static void b(LinkProperties linkProperties, JSONArray jSONArray) {
        if (Build.VERSION.SDK_INT >= 21) {
            for (LinkAddress linkAddress : linkProperties.getLinkAddresses()) {
                if (linkAddress != null && linkAddress.getAddress() != null && !linkAddress.getAddress().isLoopbackAddress()) {
                    jSONArray.put(linkAddress.getAddress().getHostAddress());
                }
            }
        }
    }

    public static String[] b(Context context) {
        Network[] allNetworks;
        NetworkInfo networkInfo;
        LinkProperties linkProperties;
        int type;
        String[] strArr = new String[5];
        if (Build.VERSION.SDK_INT >= 21) {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager != null && (allNetworks = connectivityManager.getAllNetworks()) != null) {
                JSONArray jSONArray = new JSONArray();
                JSONArray jSONArray2 = new JSONArray();
                JSONArray jSONArray3 = new JSONArray();
                JSONArray jSONArray4 = new JSONArray();
                JSONArray jSONArray5 = new JSONArray();
                for (Network network : allNetworks) {
                    if (network != null && (networkInfo = connectivityManager.getNetworkInfo(network)) != null && networkInfo.getState() == NetworkInfo.State.CONNECTED && (linkProperties = connectivityManager.getLinkProperties(network)) != null && ((type = networkInfo.getType()) == 0 || type == 1)) {
                        if (Build.VERSION.SDK_INT >= 21) {
                            for (InetAddress inetAddress : linkProperties.getDnsServers()) {
                                if (inetAddress != null) {
                                    jSONArray5.put(inetAddress.getHostAddress());
                                }
                            }
                        }
                        if (type == 0) {
                            b(linkProperties, jSONArray);
                            a(linkProperties, jSONArray2);
                        } else {
                            b(linkProperties, jSONArray3);
                            a(linkProperties, jSONArray4);
                        }
                    }
                }
                strArr[0] = jSONArray3.toString();
                strArr[1] = jSONArray4.toString();
                strArr[2] = jSONArray.toString();
                strArr[3] = jSONArray2.toString();
                strArr[4] = jSONArray5.toString();
            }
        } else {
            try {
                for (NetworkInterface networkInterface : Collections.list(NetworkInterface.getNetworkInterfaces())) {
                    if (networkInterface != null) {
                        String name = networkInterface.getName();
                        if (!TextUtils.isEmpty(name) && name.contains("wlan")) {
                            ArrayList<InetAddress> list = Collections.list(networkInterface.getInetAddresses());
                            JSONArray jSONArray6 = new JSONArray();
                            for (InetAddress inetAddress2 : list) {
                                if (!inetAddress2.isLoopbackAddress()) {
                                    jSONArray6.put(inetAddress2.getHostAddress());
                                }
                            }
                            strArr[0] = jSONArray6.toString();
                        }
                    }
                }
                for (int i = 0; i < 5; i++) {
                    if (strArr[i] == null) {
                        strArr[i] = "";
                    }
                }
            } catch (SocketException unused) {
            }
        }
        return strArr;
    }
}
