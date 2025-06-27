package com.bytedance.sdk.component.Pm.mZx;

import com.bytedance.sdk.component.Pm.IPb;
import com.bytedance.sdk.component.Pm.VwS;
import java.util.Map;

/* compiled from: HttpResponse.java */
/* loaded from: classes2.dex */
public class Pm<T> implements IPb {
    Map<String, String> EYQ;
    private VwS Kbd;
    private String Pm;
    private T Td;
    private int mZx;

    public Pm(int i, T t, String str) {
        this.mZx = i;
        this.Td = t;
        this.Pm = str;
    }

    public Pm(int i, T t, String str, Map<String, String> map) {
        this(i, t, str);
        this.EYQ = map;
    }

    @Override // com.bytedance.sdk.component.Pm.IPb
    public VwS EYQ() {
        return this.Kbd;
    }

    public void EYQ(VwS vwS) {
        this.Kbd = vwS;
    }

    @Override // com.bytedance.sdk.component.Pm.IPb
    public int mZx() {
        return this.mZx;
    }

    @Override // com.bytedance.sdk.component.Pm.IPb
    public T Td() {
        return this.Td;
    }

    @Override // com.bytedance.sdk.component.Pm.IPb
    public String Pm() {
        return this.Pm;
    }

    @Override // com.bytedance.sdk.component.Pm.IPb
    public Map<String, String> Kbd() {
        return this.EYQ;
    }
}
