package com.bytedance.adsdk.lottie;

import android.graphics.Rect;
import android.util.LongSparseArray;
import android.util.SparseArray;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: LottieComposition.java */
/* loaded from: classes2.dex */
public class IPb {
    private List<com.bytedance.adsdk.lottie.Td.Td.Pm> HX;
    private List<com.bytedance.adsdk.lottie.Td.IPb> IPb;
    private Map<String, com.bytedance.adsdk.lottie.Td.Td> Kbd;
    private float MxO;
    private Map<String, HX> Pm;
    private LongSparseArray<com.bytedance.adsdk.lottie.Td.Td.Pm> QQ;
    private Map<String, List<com.bytedance.adsdk.lottie.Td.Td.Pm>> Td;
    private SparseArray<com.bytedance.adsdk.lottie.Td.Pm> VwS;
    private boolean nWX;
    private float pi;
    private Rect tp;
    private float tsL;
    private final UB EYQ = new UB();
    private final HashSet<String> mZx = new HashSet<>();
    private int KO = 0;

    public void EYQ(Rect rect, float f, float f2, float f3, List<com.bytedance.adsdk.lottie.Td.Td.Pm> list, LongSparseArray<com.bytedance.adsdk.lottie.Td.Td.Pm> longSparseArray, Map<String, List<com.bytedance.adsdk.lottie.Td.Td.Pm>> map, Map<String, HX> map2, SparseArray<com.bytedance.adsdk.lottie.Td.Pm> sparseArray, Map<String, com.bytedance.adsdk.lottie.Td.Td> map3, List<com.bytedance.adsdk.lottie.Td.IPb> list2) {
        this.tp = rect;
        this.MxO = f;
        this.tsL = f2;
        this.pi = f3;
        this.HX = list;
        this.QQ = longSparseArray;
        this.Td = map;
        this.Pm = map2;
        this.VwS = sparseArray;
        this.Kbd = map3;
        this.IPb = list2;
    }

    public void EYQ(String str) {
        this.mZx.add(str);
    }

    public void EYQ(boolean z) {
        this.nWX = z;
    }

    public void EYQ(int i) {
        this.KO += i;
    }

    public boolean EYQ() {
        return this.nWX;
    }

    public int mZx() {
        return this.KO;
    }

    public void mZx(boolean z) {
        this.EYQ.EYQ(z);
    }

    public UB Td() {
        return this.EYQ;
    }

    public com.bytedance.adsdk.lottie.Td.Td.Pm EYQ(long j) {
        return this.QQ.get(j);
    }

    public Rect Pm() {
        return this.tp;
    }

    public float Kbd() {
        return (long) ((pi() / this.pi) * 1000.0f);
    }

    public float IPb() {
        return this.MxO;
    }

    public float VwS() {
        return this.tsL;
    }

    public float EYQ(float f) {
        return com.bytedance.adsdk.lottie.IPb.Kbd.EYQ(this.MxO, this.tsL, f);
    }

    public float QQ() {
        return this.pi;
    }

    public List<com.bytedance.adsdk.lottie.Td.Td.Pm> HX() {
        return this.HX;
    }

    public List<com.bytedance.adsdk.lottie.Td.Td.Pm> mZx(String str) {
        return this.Td.get(str);
    }

    public SparseArray<com.bytedance.adsdk.lottie.Td.Pm> tp() {
        return this.VwS;
    }

    public Map<String, com.bytedance.adsdk.lottie.Td.Td> MxO() {
        return this.Kbd;
    }

    public com.bytedance.adsdk.lottie.Td.IPb Td(String str) {
        int size = this.IPb.size();
        for (int i = 0; i < size; i++) {
            com.bytedance.adsdk.lottie.Td.IPb iPb = this.IPb.get(i);
            if (iPb.EYQ(str)) {
                return iPb;
            }
        }
        return null;
    }

    public Map<String, HX> tsL() {
        return this.Pm;
    }

    public float pi() {
        return this.tsL - this.MxO;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        Iterator<com.bytedance.adsdk.lottie.Td.Td.Pm> it = this.HX.iterator();
        while (it.hasNext()) {
            sb.append(it.next().EYQ("\t"));
        }
        return sb.toString();
    }
}
