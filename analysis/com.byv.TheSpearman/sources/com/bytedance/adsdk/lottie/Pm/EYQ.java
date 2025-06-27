package com.bytedance.adsdk.lottie.Pm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

/* compiled from: DefaultLottieFetchResult.java */
/* loaded from: classes2.dex */
public class EYQ implements Pm {
    private final HttpURLConnection EYQ;

    public EYQ(HttpURLConnection httpURLConnection) {
        this.EYQ = httpURLConnection;
    }

    @Override // com.bytedance.adsdk.lottie.Pm.Pm
    public boolean EYQ() {
        try {
            return this.EYQ.getResponseCode() / 100 == 2;
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // com.bytedance.adsdk.lottie.Pm.Pm
    public InputStream mZx() throws IOException {
        return this.EYQ.getInputStream();
    }

    @Override // com.bytedance.adsdk.lottie.Pm.Pm
    public String Td() {
        return this.EYQ.getContentType();
    }

    @Override // com.bytedance.adsdk.lottie.Pm.Pm
    public String Pm() {
        try {
            if (EYQ()) {
                return null;
            }
            return "Unable to fetch " + this.EYQ.getURL() + ". Failed with " + this.EYQ.getResponseCode() + "\n" + EYQ(this.EYQ);
        } catch (IOException e) {
            return e.getMessage();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.EYQ.disconnect();
    }

    private String EYQ(HttpURLConnection httpURLConnection) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line != null) {
                    sb.append(line);
                    sb.append('\n');
                } else {
                    try {
                        break;
                    } catch (Exception unused) {
                    }
                }
            } finally {
                try {
                    bufferedReader.close();
                } catch (Exception unused2) {
                }
            }
        }
        return sb.toString();
    }
}
