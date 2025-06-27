package com.bykv.vk.openvk.component.video.EYQ.Td;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.bykv.vk.openvk.component.video.EYQ.mZx.HX;
import com.bykv.vk.openvk.component.video.EYQ.mZx.Kbd;
import com.bykv.vk.openvk.component.video.EYQ.mZx.mZx.Td;
import com.bytedance.sdk.component.VwS.IPb;
import com.bytedance.sdk.component.VwS.QQ;
import com.google.common.net.HttpHeaders;
import com.json.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.Closeable;
import java.io.File;
import java.io.FilenameFilter;
import java.io.RandomAccessFile;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* compiled from: Util.java */
/* loaded from: classes.dex */
public final class EYQ {
    private static final Handler mZx = new Handler(Looper.getMainLooper());
    public static final Charset EYQ = Charset.forName(C.UTF8_NAME);

    public static void EYQ(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    public static void EYQ(ServerSocket serverSocket) {
        if (serverSocket != null) {
            try {
                serverSocket.close();
            } catch (Throwable unused) {
            }
        }
    }

    public static void EYQ(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (Throwable unused) {
            }
        }
    }

    public static void EYQ(RandomAccessFile randomAccessFile) {
        if (randomAccessFile != null) {
            try {
                randomAccessFile.getFD().sync();
                randomAccessFile.close();
            } catch (Throwable unused) {
            }
        }
    }

    public static boolean EYQ(String str) {
        if (str != null) {
            return str.startsWith("http://") || str.startsWith("https://");
        }
        return false;
    }

    public static int mZx(String str) {
        return EYQ(str, 0);
    }

    public static int EYQ(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return i;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public static String EYQ(com.bykv.vk.openvk.component.video.EYQ.mZx.Kbd.EYQ eyq, int i) {
        int iEYQ;
        if (eyq == null || !eyq.mZx()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(eyq.Kbd().toUpperCase());
        sb.append(' ');
        sb.append(eyq.EYQ());
        sb.append(' ');
        sb.append(eyq.IPb());
        sb.append("\r\n");
        if (Kbd.Td) {
            Log.i("TAG_PROXY_headers", eyq.Kbd().toUpperCase() + " " + eyq.EYQ() + " " + eyq.IPb());
        }
        List<HX.mZx> listEYQ = EYQ(eyq.Td());
        boolean z = true;
        if (listEYQ != null) {
            int size = listEYQ.size();
            for (int i2 = 0; i2 < size; i2++) {
                HX.mZx mzx = listEYQ.get(i2);
                if (mzx != null) {
                    String str = mzx.EYQ;
                    String str2 = mzx.mZx;
                    sb.append(str);
                    sb.append(": ");
                    sb.append(str2);
                    sb.append("\r\n");
                    if (HttpHeaders.CONTENT_RANGE.equalsIgnoreCase(str) || (HttpHeaders.ACCEPT_RANGES.equalsIgnoreCase(str) && "bytes".equalsIgnoreCase(str2))) {
                        z = false;
                    }
                }
            }
        }
        if (z && (iEYQ = EYQ(eyq)) > 0) {
            sb.append("Content-Range: bytes ");
            sb.append(Math.max(i, 0));
            sb.append("-");
            sb.append(iEYQ - 1);
            sb.append("/");
            sb.append(iEYQ);
            sb.append("\r\n");
        }
        sb.append("Connection: close\r\n");
        sb.append("\r\n");
        String string = sb.toString();
        if (Kbd.Td) {
            Log.i("TAG_PROXY_WRITE_TO_MP", string);
        }
        return string;
    }

    public static String EYQ(int i, int i2) {
        String strMZx = mZx(i, i2);
        if (strMZx == null) {
            return null;
        }
        return "bytes=".concat(String.valueOf(strMZx));
    }

    public static String mZx(int i, int i2) {
        if (i >= 0 && i2 > 0) {
            return i + "-" + i2;
        }
        if (i > 0) {
            return i + "-";
        }
        if (i >= 0 || i2 <= 0) {
            return null;
        }
        return "-".concat(String.valueOf(i2));
    }

    public static List<String> EYQ(String... strArr) {
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            if (EYQ(str)) {
                arrayList.add(str);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    public static String EYQ(com.bykv.vk.openvk.component.video.EYQ.mZx.mZx.EYQ eyq, int i) {
        StringBuilder sb = new StringBuilder();
        if (i <= 0) {
            sb.append("HTTP/1.1 200 OK\r\n");
        } else {
            sb.append("HTTP/1.1 206 Partial Content\r\n");
        }
        sb.append("Accept-Ranges: bytes\r\n");
        sb.append("Content-Type: ");
        sb.append(eyq.mZx);
        sb.append("\r\n");
        if (i <= 0) {
            sb.append("Content-Length: ");
            sb.append(eyq.Td);
            sb.append("\r\n");
        } else {
            sb.append("Content-Range: bytes ");
            sb.append(i);
            sb.append("-");
            sb.append(eyq.Td - 1);
            sb.append("/");
            sb.append(eyq.Td);
            sb.append("\r\n");
            sb.append("Content-Length: ");
            sb.append(eyq.Td - i);
            sb.append("\r\n");
        }
        sb.append("Connection: close\r\n");
        sb.append("\r\n");
        String string = sb.toString();
        if (Kbd.Td) {
            Log.i("TAG_PROXY_WRITE_TO_MP", string);
        }
        return string;
    }

    public static int EYQ() {
        File[] fileArrListFiles;
        if (Build.VERSION.SDK_INT >= 17) {
            return Math.max(Runtime.getRuntime().availableProcessors(), 1);
        }
        try {
            File file = new File("/sys/devices/system/cpu/");
            if (file.exists() && (fileArrListFiles = file.listFiles(new FilenameFilter() { // from class: com.bykv.vk.openvk.component.video.EYQ.Td.EYQ.1
                private Pattern EYQ = Pattern.compile("^cpu[0-9]+$");

                @Override // java.io.FilenameFilter
                public boolean accept(File file2, String str) {
                    return this.EYQ.matcher(str).matches();
                }
            })) != null) {
                return Math.max(fileArrListFiles.length, 1);
            }
        } catch (Throwable unused) {
        }
        return 1;
    }

    public static int EYQ(com.bykv.vk.openvk.component.video.EYQ.mZx.Kbd.EYQ eyq) {
        int iLastIndexOf;
        if (eyq == null) {
            return -1;
        }
        if (eyq.EYQ() == 200) {
            return EYQ(eyq.EYQ("Content-Length", null), -1);
        }
        if (eyq.EYQ() == 206) {
            String strEYQ = eyq.EYQ(HttpHeaders.CONTENT_RANGE, null);
            if (!TextUtils.isEmpty(strEYQ) && (iLastIndexOf = strEYQ.lastIndexOf("/")) >= 0 && iLastIndexOf < strEYQ.length() - 1) {
                return EYQ(strEYQ.substring(iLastIndexOf + 1), -1);
            }
        }
        return -1;
    }

    public static String EYQ(com.bykv.vk.openvk.component.video.EYQ.mZx.Kbd.EYQ eyq, boolean z, boolean z2) {
        String strEYQ;
        if (eyq == null) {
            if (Kbd.Td) {
                Log.e("TAG_PROXY_Response", "response null");
            }
            return "response null";
        }
        if (!eyq.mZx()) {
            if (Kbd.Td) {
                Log.e("TAG_PROXY_Response", "response code: " + eyq.EYQ());
            }
            return "response code: " + eyq.EYQ();
        }
        String strEYQ2 = eyq.EYQ("Content-Type", null);
        if (!Td(strEYQ2)) {
            if (Kbd.Td) {
                Log.e("TAG_PROXY_Response", "Content-Type: ".concat(String.valueOf(strEYQ2)));
            }
            return "Content-Type: ".concat(String.valueOf(strEYQ2));
        }
        int iEYQ = EYQ(eyq);
        if (iEYQ <= 0) {
            if (Kbd.Td) {
                Log.e("TAG_PROXY_Response", "Content-Length: ".concat(String.valueOf(iEYQ)));
            }
            return "Content-Length: ".concat(String.valueOf(iEYQ));
        }
        if (z && ((strEYQ = eyq.EYQ(HttpHeaders.ACCEPT_RANGES, null)) == null || !strEYQ.contains("bytes"))) {
            if (Kbd.Td) {
                Log.e("TAG_PROXY_Response", "Accept-Ranges: ".concat(String.valueOf(strEYQ)));
            }
            return "Accept-Ranges: ".concat(String.valueOf(strEYQ));
        }
        if (!z2 || eyq.Pm() != null) {
            return null;
        }
        if (Kbd.Td) {
            Log.e("TAG_PROXY_Response", "response body null");
        }
        return "response body null";
    }

    public static boolean Td(String str) {
        if (str != null) {
            return str.startsWith("video/") || "application/octet-stream".equals(str) || "binary/octet-stream".equals(str);
        }
        return false;
    }

    public static boolean mZx() {
        return Thread.currentThread() == Looper.getMainLooper().getThread();
    }

    public static void EYQ(QQ qq) {
        if (qq != null) {
            if (mZx()) {
                IPb.mZx(qq);
                if (Kbd.Td) {
                    Log.e("TAG_PROXY_UTIL", "invoke in pool thread");
                    return;
                }
                return;
            }
            qq.run();
            if (Kbd.Td) {
                Log.e("TAG_PROXY_UTIL", "invoke calling thread");
            }
        }
    }

    public static void EYQ(Runnable runnable) {
        if (runnable != null) {
            if (mZx()) {
                runnable.run();
            } else {
                mZx.post(runnable);
            }
        }
    }

    public static List<HX.mZx> EYQ(List<HX.mZx> list) {
        if (list == null || list.size() == 0) {
            return null;
        }
        if (Kbd.Td) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                HX.mZx mzx = list.get(i);
                if (mzx != null) {
                    Log.i("TAG_PROXY_PRE_FILTER", mzx.EYQ + ": " + mzx.EYQ);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (HX.mZx mzx2 : list) {
            if (HttpHeaders.HOST.equals(mzx2.EYQ) || HttpHeaders.KEEP_ALIVE.equals(mzx2.EYQ) || "Connection".equals(mzx2.EYQ) || "Proxy-Connection".equals(mzx2.EYQ)) {
                arrayList.add(mzx2);
            }
        }
        list.removeAll(arrayList);
        if (Kbd.Td) {
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                HX.mZx mzx3 = list.get(i2);
                if (mzx3 != null) {
                    Log.i("TAG_PROXY_POST_FILTER", mzx3.EYQ + ": " + mzx3.mZx);
                }
            }
        }
        return list;
    }

    public static List<HX.mZx> EYQ(Map<String, String> map) {
        if (map != null && !map.isEmpty()) {
            try {
                Set<Map.Entry<String, String>> setEntrySet = map.entrySet();
                ArrayList arrayList = new ArrayList();
                for (Map.Entry<String, String> entry : setEntrySet) {
                    arrayList.add(new HX.mZx(entry.getKey(), entry.getValue()));
                }
                return arrayList;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public static com.bykv.vk.openvk.component.video.EYQ.mZx.mZx.EYQ EYQ(com.bykv.vk.openvk.component.video.EYQ.mZx.Kbd.EYQ eyq, Td td, String str, int i) {
        String strMZx;
        String str2;
        String string;
        com.bykv.vk.openvk.component.video.EYQ.mZx.mZx.EYQ EYQ2 = td.EYQ(str, i);
        if (EYQ2 != null) {
            return EYQ2;
        }
        int iEYQ = EYQ(eyq);
        String strEYQ = eyq.EYQ("Content-Type", null);
        if (iEYQ <= 0 || TextUtils.isEmpty(strEYQ)) {
            return EYQ2;
        }
        com.bykv.vk.openvk.component.video.EYQ.mZx.Kbd.Kbd kbdVwS = eyq.VwS();
        if (kbdVwS != null) {
            str2 = kbdVwS.mZx;
            strMZx = mZx(kbdVwS.Kbd);
        } else {
            strMZx = "";
            str2 = strMZx;
        }
        String strMZx2 = mZx(eyq.Td());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(IronSourceConstants.REQUEST_URL, str2);
            jSONObject.put("requestHeaders", strMZx);
            jSONObject.put("responseHeaders", strMZx2);
            string = jSONObject.toString();
        } catch (Throwable unused) {
            string = "";
        }
        com.bykv.vk.openvk.component.video.EYQ.mZx.mZx.EYQ eyq2 = new com.bykv.vk.openvk.component.video.EYQ.mZx.mZx.EYQ(str, strEYQ, iEYQ, i, string);
        td.EYQ(eyq2);
        return eyq2;
    }

    public static String mZx(List<HX.mZx> list) {
        if (list == null || list.size() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            HX.mZx mzx = list.get(0);
            if (mzx != null) {
                sb.append(mzx.EYQ);
                sb.append(": ");
                sb.append(mzx.mZx);
                sb.append("\r\n");
            }
        }
        return sb.toString();
    }

    public static String mZx(Map<String, String> map) {
        if (map == null || map.size() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            sb.append((Object) entry.getKey());
            sb.append(": ");
            sb.append((Object) entry.getValue());
            sb.append("\r\n");
        }
        return sb.toString();
    }
}
