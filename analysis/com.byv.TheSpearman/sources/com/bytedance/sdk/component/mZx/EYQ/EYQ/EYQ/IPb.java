package com.bytedance.sdk.component.mZx.EYQ.EYQ.EYQ;

import android.text.TextUtils;
import com.bytedance.sdk.component.mZx.EYQ.KO;
import com.bytedance.sdk.component.mZx.EYQ.hu;
import com.bytedance.sdk.component.mZx.EYQ.pi;
import com.bytedance.sdk.component.mZx.EYQ.tp;
import com.bytedance.sdk.component.mZx.EYQ.tsL;
import com.google.common.net.HttpHeaders;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: NetResponse.java */
/* loaded from: classes2.dex */
public class IPb extends KO {
    HttpURLConnection EYQ;
    pi mZx;

    @Override // com.bytedance.sdk.component.mZx.EYQ.KO
    public long EYQ() {
        return 0L;
    }

    @Override // com.bytedance.sdk.component.mZx.EYQ.KO
    public long mZx() {
        return 0L;
    }

    public String toString() {
        return "";
    }

    public IPb(HttpURLConnection httpURLConnection, pi piVar) {
        this.EYQ = httpURLConnection;
        this.mZx = piVar;
    }

    @Override // com.bytedance.sdk.component.mZx.EYQ.KO
    public int Td() {
        try {
            return this.EYQ.getResponseCode();
        } catch (Exception unused) {
            return -1;
        }
    }

    @Override // com.bytedance.sdk.component.mZx.EYQ.KO
    public boolean Pm() {
        return Td() >= 200 && Td() < 300;
    }

    @Override // com.bytedance.sdk.component.mZx.EYQ.KO
    public String Kbd() throws IOException {
        return this.EYQ.getResponseMessage();
    }

    @Override // com.bytedance.sdk.component.mZx.EYQ.KO
    public hu IPb() {
        try {
            return new VwS(this.EYQ);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.component.mZx.EYQ.KO
    public com.bytedance.sdk.component.mZx.EYQ.IPb VwS() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, List<String>> entry : this.EYQ.getHeaderFields().entrySet()) {
            for (String str : entry.getValue()) {
                if (!HttpHeaders.CONTENT_RANGE.equalsIgnoreCase(entry.getKey()) || Td() != 206) {
                    arrayList.add(entry.getKey());
                    arrayList.add(str);
                }
            }
        }
        return new com.bytedance.sdk.component.mZx.EYQ.IPb((String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    public String EYQ(String str) {
        return this.EYQ.getHeaderField(str);
    }

    @Override // com.bytedance.sdk.component.mZx.EYQ.KO
    public String EYQ(String str, String str2) {
        return !TextUtils.isEmpty(EYQ(str)) ? EYQ(str) : str2;
    }

    @Override // com.bytedance.sdk.component.mZx.EYQ.KO, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            IPb().close();
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.mZx.EYQ.KO
    public tsL QQ() {
        return tsL.HTTP_1_1;
    }

    @Override // com.bytedance.sdk.component.mZx.EYQ.KO
    public tp HX() {
        return new tp();
    }
}
