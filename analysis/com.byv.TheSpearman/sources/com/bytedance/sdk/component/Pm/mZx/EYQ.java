package com.bytedance.sdk.component.Pm.mZx;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: DefaultHttpClient.java */
/* loaded from: classes2.dex */
public class EYQ implements com.bytedance.sdk.component.Pm.Pm<Pm> {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v7 */
    @Override // com.bytedance.sdk.component.Pm.Pm
    /* renamed from: mZx, reason: merged with bridge method [inline-methods] */
    public Pm<byte[]> EYQ(com.bytedance.sdk.component.Pm.Kbd kbd) throws Throwable {
        Closeable closeable;
        InputStream inputStream;
        byte[] byteArray;
        ByteArrayOutputStream byteArrayOutputStream;
        String message;
        Closeable closeable2;
        HttpURLConnection httpURLConnection;
        int i = 0;
        InputStream inputStream2 = null;
        Map<String, String> mapEYQ = null;
        try {
            try {
                httpURLConnection = (HttpURLConnection) new URL(kbd.EYQ()).openConnection();
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.setConnectTimeout(5000);
                httpURLConnection.setReadTimeout(5000);
                httpURLConnection.connect();
                inputStream = httpURLConnection.getInputStream();
            } catch (Throwable th) {
                th = th;
            }
            try {
                byte[] bArr = new byte[1024];
                byteArrayOutputStream = new ByteArrayOutputStream();
                while (true) {
                    try {
                        int i2 = inputStream.read(bArr);
                        if (i2 == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, i2);
                    } catch (MalformedURLException e) {
                        e = e;
                        byteArray = null;
                    } catch (IOException e2) {
                        e = e2;
                        byteArray = null;
                    }
                }
                i = 200;
                byteArray = byteArrayOutputStream.toByteArray();
                try {
                    mapEYQ = kbd.mZx() ? EYQ(httpURLConnection) : null;
                    com.bytedance.sdk.component.Pm.Td.Td.mZx.EYQ(inputStream);
                    com.bytedance.sdk.component.Pm.Td.Td.mZx.EYQ(byteArrayOutputStream);
                    message = "success";
                } catch (MalformedURLException e3) {
                    e = e3;
                    Log.w("InternalHttpClient", "MalformedURLException:" + e.getMessage());
                    message = e.getMessage();
                    closeable2 = byteArrayOutputStream;
                    com.bytedance.sdk.component.Pm.Td.Td.mZx.EYQ(inputStream);
                    com.bytedance.sdk.component.Pm.Td.Td.mZx.EYQ(closeable2);
                    return new Pm<>(i, byteArray, message, mapEYQ);
                } catch (IOException e4) {
                    e = e4;
                    Log.w("InternalHttpClient", "IOException:" + e.getMessage());
                    message = e.getMessage();
                    closeable2 = byteArrayOutputStream;
                    com.bytedance.sdk.component.Pm.Td.Td.mZx.EYQ(inputStream);
                    com.bytedance.sdk.component.Pm.Td.Td.mZx.EYQ(closeable2);
                    return new Pm<>(i, byteArray, message, mapEYQ);
                }
            } catch (MalformedURLException e5) {
                e = e5;
                byteArray = null;
                byteArrayOutputStream = byteArray;
                Log.w("InternalHttpClient", "MalformedURLException:" + e.getMessage());
                message = e.getMessage();
                closeable2 = byteArrayOutputStream;
                com.bytedance.sdk.component.Pm.Td.Td.mZx.EYQ(inputStream);
                com.bytedance.sdk.component.Pm.Td.Td.mZx.EYQ(closeable2);
                return new Pm<>(i, byteArray, message, mapEYQ);
            } catch (IOException e6) {
                e = e6;
                byteArray = null;
                byteArrayOutputStream = byteArray;
                Log.w("InternalHttpClient", "IOException:" + e.getMessage());
                message = e.getMessage();
                closeable2 = byteArrayOutputStream;
                com.bytedance.sdk.component.Pm.Td.Td.mZx.EYQ(inputStream);
                com.bytedance.sdk.component.Pm.Td.Td.mZx.EYQ(closeable2);
                return new Pm<>(i, byteArray, message, mapEYQ);
            } catch (Throwable th2) {
                th = th2;
                closeable = null;
                inputStream2 = inputStream;
                com.bytedance.sdk.component.Pm.Td.Td.mZx.EYQ(inputStream2);
                com.bytedance.sdk.component.Pm.Td.Td.mZx.EYQ(closeable);
                throw th;
            }
        } catch (MalformedURLException e7) {
            e = e7;
            inputStream = null;
            byteArray = null;
        } catch (IOException e8) {
            e = e8;
            inputStream = null;
            byteArray = null;
        } catch (Throwable th3) {
            th = th3;
            closeable = null;
            com.bytedance.sdk.component.Pm.Td.Td.mZx.EYQ(inputStream2);
            com.bytedance.sdk.component.Pm.Td.Td.mZx.EYQ(closeable);
            throw th;
        }
        return new Pm<>(i, byteArray, message, mapEYQ);
    }

    private Map<String, String> EYQ(HttpURLConnection httpURLConnection) {
        HashMap map = new HashMap();
        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
        for (String str : headerFields.keySet()) {
            List<String> list = headerFields.get(str);
            if (list != null && list.size() > 0) {
                map.put(str, list.get(0));
            }
        }
        return map;
    }
}
