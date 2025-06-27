package com.my.tracker.obfuscated;

import android.text.TextUtils;
import com.my.tracker.MyTrackerConfig;
import com.my.tracker.obfuscated.z;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* loaded from: classes4.dex */
public final class m0 extends z<String> {

    /* renamed from: a, reason: collision with root package name */
    final MyTrackerConfig.OkHttpClientProvider f4242a;

    m0(MyTrackerConfig.OkHttpClientProvider okHttpClientProvider) {
        this.f4242a = okHttpClientProvider;
    }

    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v4, types: [T, java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r3v7 */
    @Override // com.my.tracker.obfuscated.z
    public z.b<String> a(String str) {
        Throwable th;
        Response responseExecute;
        z.b<String> bVarC = z.b.c();
        try {
            z0.a("OkHttpGetRequest: send request to " + str);
            responseExecute = this.f4242a.getOkHttpClient().newCall(new Request.Builder().url(str).get().build()).execute();
            try {
                int iCode = responseExecute.code();
                if (iCode == 200) {
                    z0.a("OkHttpGetRequest: response successfully received");
                    bVarC.f4273a = true;
                } else {
                    z0.a("OkHttpGetRequest error: response code " + iCode);
                    bVarC.f4273a = false;
                }
                if (iCode == 200) {
                    z0.a("OkHttpGetRequest: processing server response");
                    ResponseBody responseBodyBody = responseExecute.body();
                    ?? String = responseBodyBody != null ? responseBodyBody.string() : 0;
                    if (TextUtils.isEmpty(String)) {
                        z0.a("OkHttpGetRequest: response data is empty");
                    } else {
                        bVarC.b = String;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                try {
                    z0.a("OkHttpGetRequest error: error while sending data", th);
                    bVarC.f4273a = false;
                    bVarC.c = "OkHttpGetRequest error: error while sending data";
                    return bVarC;
                } finally {
                    if (responseExecute != null) {
                        responseExecute.close();
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
            responseExecute = null;
        }
        return bVarC;
    }
}
