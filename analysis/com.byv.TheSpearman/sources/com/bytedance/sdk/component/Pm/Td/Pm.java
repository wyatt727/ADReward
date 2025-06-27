package com.bytedance.sdk.component.Pm.Td;

import com.bytedance.sdk.component.Pm.MxO;
import java.util.Map;

/* compiled from: ImageResponse.java */
/* loaded from: classes2.dex */
public class Pm<T> implements MxO {
    private String EYQ;
    private boolean HX;
    private int IPb;
    private int Kbd;
    private int MxO;
    private T Pm;
    private boolean QQ;
    private T Td;
    private Map<String, String> VwS;
    private String mZx;
    private com.bytedance.sdk.component.Pm.VwS tp;

    public Pm EYQ(Td td, T t) {
        this.Td = t;
        this.EYQ = td.Kbd();
        this.mZx = td.EYQ();
        this.Kbd = td.mZx();
        this.IPb = td.Td();
        this.HX = td.KO();
        this.tp = td.hu();
        this.MxO = td.UB();
        return this;
    }

    public Pm EYQ(Td td, T t, Map<String, String> map, boolean z) {
        this.VwS = map;
        this.QQ = z;
        return EYQ(td, t);
    }

    @Override // com.bytedance.sdk.component.Pm.MxO
    public String EYQ() {
        return this.mZx;
    }

    @Override // com.bytedance.sdk.component.Pm.MxO
    public T mZx() {
        return this.Td;
    }

    @Override // com.bytedance.sdk.component.Pm.MxO
    public T Td() {
        return this.Pm;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.sdk.component.Pm.MxO
    public void EYQ(Object obj) {
        this.Pm = this.Td;
        this.Td = obj;
    }

    @Override // com.bytedance.sdk.component.Pm.MxO
    public Map<String, String> Pm() {
        return this.VwS;
    }

    @Override // com.bytedance.sdk.component.Pm.MxO
    public boolean Kbd() {
        return this.QQ;
    }

    @Override // com.bytedance.sdk.component.Pm.MxO
    public boolean IPb() {
        return this.HX;
    }

    @Override // com.bytedance.sdk.component.Pm.MxO
    public int VwS() {
        return this.MxO;
    }
}
