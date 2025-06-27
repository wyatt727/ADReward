package com.my.target;

import android.content.Context;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Map;

/* loaded from: classes4.dex */
public class z1 extends a2<Void> {
    public static z1 a() {
        return new z1();
    }

    @Override // com.my.target.a2
    public b2<Void> a(String str, String str2, Map<String, String> map, Context context) {
        b2<Void> b2Var = new b2<>();
        if (str2 == null) {
            ba.a("HttpLogRequest: Can't send log request - body is null");
            b2Var.f3927a = false;
            return b2Var;
        }
        ba.a("HttpLogRequest: Send log request");
        HttpURLConnection httpURLConnection = null;
        try {
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(str).openConnection();
            try {
                httpURLConnection2.setUseCaches(false);
                httpURLConnection2.setDoOutput(true);
                httpURLConnection2.setConnectTimeout(5000);
                httpURLConnection2.setReadTimeout(5000);
                httpURLConnection2.setRequestMethod("POST");
                httpURLConnection2.setRequestProperty("Content-Type", "text/html; charset=utf-8");
                httpURLConnection2.setRequestProperty("connection", "close");
                httpURLConnection2.connect();
                OutputStream outputStream = httpURLConnection2.getOutputStream();
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, Charset.forName(C.UTF8_NAME)));
                bufferedWriter.write(str2);
                bufferedWriter.flush();
                bufferedWriter.close();
                outputStream.close();
                httpURLConnection2.getInputStream().close();
                httpURLConnection2.disconnect();
            } catch (Throwable th) {
                th = th;
                httpURLConnection = httpURLConnection2;
                try {
                    b2Var.f3927a = false;
                    b2Var.e = th.getMessage();
                    ba.a("HttpLogRequest: Log request error - " + b2Var.e);
                    return b2Var;
                } finally {
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
        return b2Var;
    }
}
