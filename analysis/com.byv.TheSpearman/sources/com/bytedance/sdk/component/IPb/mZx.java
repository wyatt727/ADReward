package com.bytedance.sdk.component.IPb;

import com.bytedance.sdk.component.mZx.EYQ.tp;
import java.io.File;
import java.util.Map;

/* compiled from: NetResponse.java */
/* loaded from: classes2.dex */
public class mZx {
    final int EYQ;
    private final boolean HX;
    final long IPb;
    final long Kbd;
    final String Pm;
    final Map<String, String> Td;
    tp VwS;
    final String mZx;
    private File QQ = null;
    private byte[] tp = null;

    public mZx(boolean z, int i, String str, Map<String, String> map, String str2, long j, long j2) {
        this.HX = z;
        this.EYQ = i;
        this.mZx = str;
        this.Td = map;
        this.Pm = str2;
        this.Kbd = j;
        this.IPb = j2;
    }

    public int EYQ() {
        return this.EYQ;
    }

    public String mZx() {
        return this.mZx;
    }

    public Map<String, String> Td() {
        return this.Td;
    }

    public String Pm() {
        return this.Pm;
    }

    public File Kbd() {
        return this.QQ;
    }

    public void EYQ(File file) {
        this.QQ = file;
    }

    public boolean IPb() {
        return this.HX;
    }

    public long VwS() {
        return this.Kbd - this.IPb;
    }

    public void EYQ(byte[] bArr) {
        this.tp = bArr;
    }

    public void EYQ(tp tpVar) {
        this.VwS = tpVar;
    }
}
