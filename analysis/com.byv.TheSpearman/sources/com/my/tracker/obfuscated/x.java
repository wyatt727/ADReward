package com.my.tracker.obfuscated;

import com.my.tracker.obfuscated.z;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/* loaded from: classes4.dex */
public final class x extends z<String> {
    x() {
    }

    /* JADX WARN: Type inference failed for: r3v16, types: [T, java.lang.String] */
    @Override // com.my.tracker.obfuscated.z
    public z.b<String> a(String str) {
        Throwable th;
        HttpURLConnection httpURLConnection;
        z.b<String> bVarC = z.b.c();
        BufferedReader bufferedReader = null;
        try {
            z0.a("HttpGetRequest: send request to " + str);
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            try {
                httpURLConnection.setConnectTimeout(3000);
                httpURLConnection.setReadTimeout(3000);
                httpURLConnection.setRequestMethod("GET");
                int responseCode = httpURLConnection.getResponseCode();
                z0.a("HttpGetRequest: response received with response code: " + responseCode);
                bVarC.f4273a = responseCode == 200;
            } catch (Throwable th2) {
                th = th2;
                try {
                    z0.a("HttpGetRequest: error", th);
                    bVarC.f4273a = false;
                    bVarC.c = "HttpGetRequest: error while sending data";
                    return bVarC;
                } finally {
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
            httpURLConnection = null;
        }
        try {
            z0.a("HttpGetRequest: processing server response");
            BufferedReader bufferedReader2 = bVarC.f4273a ? new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream())) : new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
            StringBuilder sb = new StringBuilder();
            while (true) {
                String line = bufferedReader2.readLine();
                if (line == null) {
                    break;
                }
                sb.append(line);
            }
            if (sb.length() > 0) {
                bVarC.b = sb.toString();
            } else {
                z0.a("HttpGetRequest: response data is empty");
            }
            bufferedReader2.close();
            return bVarC;
        } catch (Throwable th4) {
            if (0 != 0) {
                bufferedReader.close();
            }
            throw th4;
        }
    }
}
