package com.bytedance.adsdk.lottie.Pm;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* compiled from: DefaultLottieNetworkFetcher.java */
/* loaded from: classes2.dex */
public class mZx implements IPb {
    @Override // com.bytedance.adsdk.lottie.Pm.IPb
    public Pm EYQ(String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return new EYQ(httpURLConnection);
    }
}
