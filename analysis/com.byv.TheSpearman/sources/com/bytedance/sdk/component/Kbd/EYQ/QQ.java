package com.bytedance.sdk.component.Kbd.EYQ;

import android.content.Context;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: LogInternalManager.java */
/* loaded from: classes2.dex */
public class QQ {
    private static QQ pi;
    private static volatile com.bytedance.sdk.component.Kbd.EYQ.Kbd.EYQ tp;
    private volatile Context EYQ;
    private volatile Kbd HX;
    private volatile com.bytedance.sdk.component.Kbd.EYQ.Pm.mZx.EYQ IPb;
    private long KO;
    private volatile com.bytedance.sdk.component.Kbd.EYQ.Pm.mZx.EYQ Kbd;
    private volatile com.bytedance.sdk.component.Kbd.EYQ.mZx.Td MxO;
    private volatile com.bytedance.sdk.component.Kbd.EYQ.Pm.mZx.EYQ Pm;
    private volatile boolean QQ;
    private volatile com.bytedance.sdk.component.Kbd.EYQ.Pm.mZx.EYQ Td;
    private volatile com.bytedance.sdk.component.Kbd.EYQ.EYQ.Kbd VwS;
    private volatile com.bytedance.sdk.component.Kbd.EYQ.Pm.mZx.EYQ mZx;
    private final AtomicBoolean nWX = new AtomicBoolean(false);
    private volatile Map<Integer, com.bytedance.sdk.component.Kbd.EYQ.mZx.Td> tsL;

    public boolean EYQ() {
        return this.nWX.get();
    }

    public void EYQ(boolean z) {
        this.nWX.set(z);
    }

    public boolean mZx() {
        return this.QQ;
    }

    public void mZx(boolean z) {
        this.QQ = z;
    }

    public Map<Integer, com.bytedance.sdk.component.Kbd.EYQ.mZx.Td> Td() {
        return this.tsL;
    }

    public com.bytedance.sdk.component.Kbd.EYQ.EYQ.Kbd Pm() {
        return this.VwS;
    }

    public static com.bytedance.sdk.component.Kbd.EYQ.Kbd.EYQ Kbd() {
        if (tp == null) {
            synchronized (QQ.class) {
                if (tp == null) {
                    tp = new com.bytedance.sdk.component.Kbd.EYQ.Kbd.mZx();
                }
            }
        }
        return tp;
    }

    public void EYQ(com.bytedance.sdk.component.Kbd.EYQ.EYQ.Kbd kbd) {
        this.VwS = kbd;
    }

    public Context IPb() {
        return this.EYQ;
    }

    public void EYQ(Context context) {
        this.EYQ = context;
    }

    private QQ() {
    }

    public static synchronized QQ VwS() {
        if (pi == null) {
            pi = new QQ();
        }
        return pi;
    }

    public void EYQ(com.bytedance.sdk.component.Kbd.EYQ.mZx.Td td) {
        this.MxO = td;
    }

    public com.bytedance.sdk.component.Kbd.EYQ.mZx.Td QQ() {
        return this.MxO;
    }

    public void HX() {
        com.bytedance.sdk.component.Kbd.EYQ.mZx.Pm.EYQ.mZx();
    }

    public com.bytedance.sdk.component.Kbd.EYQ.Pm.mZx.EYQ tp() {
        return this.IPb;
    }

    public void EYQ(com.bytedance.sdk.component.Kbd.EYQ.Pm.mZx.EYQ eyq) {
        this.IPb = eyq;
    }

    public void MxO() {
        com.bytedance.sdk.component.Kbd.EYQ.mZx.Pm.EYQ.Td();
    }

    public void EYQ(com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ eyq) {
        if (eyq == null) {
            return;
        }
        eyq.EYQ(System.currentTimeMillis());
        com.bytedance.sdk.component.Kbd.EYQ.mZx.Pm.EYQ.EYQ(eyq, eyq.Pm());
    }

    public void EYQ(String str, boolean z) {
        com.bytedance.sdk.component.Kbd.EYQ.IPb.EYQ.EYQ().EYQ(str, z);
    }

    public void EYQ(String str, List<String> list, boolean z, Map<String, String> map, int i, String str2) {
        com.bytedance.sdk.component.Kbd.EYQ.IPb.EYQ.EYQ().EYQ(str, list, z, map, i, str2);
    }

    public void mZx(com.bytedance.sdk.component.Kbd.EYQ.Pm.mZx.EYQ eyq) {
        this.mZx = eyq;
    }

    public com.bytedance.sdk.component.Kbd.EYQ.Pm.mZx.EYQ tsL() {
        return this.mZx;
    }

    public void Td(com.bytedance.sdk.component.Kbd.EYQ.Pm.mZx.EYQ eyq) {
        this.Td = eyq;
    }

    public com.bytedance.sdk.component.Kbd.EYQ.Pm.mZx.EYQ pi() {
        return this.Td;
    }

    public void Pm(com.bytedance.sdk.component.Kbd.EYQ.Pm.mZx.EYQ eyq) {
        this.Pm = eyq;
    }

    public com.bytedance.sdk.component.Kbd.EYQ.Pm.mZx.EYQ nWX() {
        return this.Pm;
    }

    public com.bytedance.sdk.component.Kbd.EYQ.Pm.mZx.EYQ KO() {
        return this.Kbd;
    }

    public void Kbd(com.bytedance.sdk.component.Kbd.EYQ.Pm.mZx.EYQ eyq) {
        this.Kbd = eyq;
    }

    public void EYQ(Kbd kbd) {
        this.HX = kbd;
    }

    public Kbd hu() {
        return this.HX;
    }

    public void EYQ(long j) {
        this.KO = j;
    }

    public long UB() {
        return this.KO * 24 * 60 * 60 * 1000;
    }
}
