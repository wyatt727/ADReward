package com.my.tracker.obfuscated;

import android.text.TextUtils;
import com.my.tracker.MyTrackerConfig;
import com.my.tracker.obfuscated.z;
import java.io.ByteArrayOutputStream;
import java.util.zip.GZIPOutputStream;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* loaded from: classes4.dex */
public final class n0 extends z<String> {
    static final MediaType d = MediaType.parse("application/octet-stream");

    /* renamed from: a, reason: collision with root package name */
    final z.a f4243a;
    final MyTrackerConfig.OkHttpClientProvider b;
    final boolean c;

    n0(z.a aVar, MyTrackerConfig.OkHttpClientProvider okHttpClientProvider, boolean z) {
        this.f4243a = aVar;
        this.b = okHttpClientProvider;
        this.c = z;
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [T, java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    @Override // com.my.tracker.obfuscated.z
    public z.b<String> a(String str) {
        ByteArrayOutputStream byteArrayOutputStream;
        GZIPOutputStream gZIPOutputStream;
        z.b<String> bVarC = z.b.c();
        Response response = null;
        try {
            z0.a("OkHttpPostRequest: send request to " + str);
        } catch (Throwable th) {
            th = th;
        }
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                if (this.c) {
                    z0.a("OkHttpPostRequest: populating post request body using gzip");
                    gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                    try {
                        this.f4243a.a(gZIPOutputStream);
                        gZIPOutputStream.finish();
                    } catch (Throwable th2) {
                        th = th2;
                        if (gZIPOutputStream != null) {
                            gZIPOutputStream.close();
                        }
                        if (byteArrayOutputStream != null) {
                            byteArrayOutputStream.close();
                        }
                        throw th;
                    }
                } else {
                    z0.a("OkHttpPostRequest: populating post request body without using gzip");
                    this.f4243a.a(byteArrayOutputStream);
                    byteArrayOutputStream.flush();
                    gZIPOutputStream = null;
                }
                Request requestBuild = new Request.Builder().url(str).header("Content-Encoding", "gzip").post(RequestBody.create(byteArrayOutputStream.toByteArray(), d)).build();
                if (gZIPOutputStream != null) {
                    gZIPOutputStream.close();
                }
                byteArrayOutputStream.close();
                Response responseExecute = this.b.getOkHttpClient().newCall(requestBuild).execute();
                try {
                    int iCode = responseExecute.code();
                    if (iCode == 200 || iCode == 204) {
                        z0.a("OkHttpPostRequest: response successfully received");
                        bVarC.f4273a = true;
                    } else {
                        z0.a("OkHttpPostRequest error: response code " + iCode);
                        bVarC.f4273a = false;
                    }
                    if (iCode == 200) {
                        z0.a("OkHttpPostRequest: processing server response");
                        ResponseBody responseBodyBody = responseExecute.body();
                        ?? String = responseBodyBody != null ? responseBodyBody.string() : 0;
                        if (TextUtils.isEmpty(String)) {
                            z0.a("OkHttpPostRequest: response data is empty");
                        } else {
                            bVarC.b = String;
                        }
                    }
                } catch (Throwable th3) {
                    response = responseExecute;
                    th = th3;
                    try {
                        z0.a("OkHttpPostRequest error: error while sending data", th);
                        bVarC.f4273a = false;
                        bVarC.c = "OkHttpPostRequest error: error while sending data";
                        if (response != null) {
                            responseExecute = response;
                            responseExecute.close();
                        }
                        return bVarC;
                    } catch (Throwable th4) {
                        if (response != null) {
                            response.close();
                        }
                        throw th4;
                    }
                }
                responseExecute.close();
                return bVarC;
            } catch (Throwable th5) {
                th = th5;
                gZIPOutputStream = null;
            }
        } catch (Throwable th6) {
            th = th6;
            byteArrayOutputStream = null;
            gZIPOutputStream = null;
        }
    }
}
