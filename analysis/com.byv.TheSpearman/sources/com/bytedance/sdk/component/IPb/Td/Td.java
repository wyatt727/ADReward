package com.bytedance.sdk.component.IPb.Td;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.Map;

/* compiled from: TNCConfig.java */
/* loaded from: classes2.dex */
public class Td {
    public boolean EYQ = false;
    public boolean mZx = true;
    public Map<String, Integer> Td = null;
    public Map<String, String> Pm = null;
    public int Kbd = 10;
    public int IPb = 1;
    public int VwS = 1;
    public int QQ = 10;
    public int HX = 1;
    public int tp = 1;
    public int MxO = TypedValues.Custom.TYPE_INT;
    public int tsL = 120;
    public String pi = null;
    public int nWX = 0;
    public long KO = 0;

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(" localEnable: ");
        sb.append(this.EYQ);
        sb.append(" probeEnable: ");
        sb.append(this.mZx);
        sb.append(" hostFilter: ");
        Map<String, Integer> map = this.Td;
        sb.append(map != null ? map.size() : 0);
        sb.append(" hostMap: ");
        Map<String, String> map2 = this.Pm;
        sb.append(map2 != null ? map2.size() : 0);
        sb.append(" reqTo: ");
        sb.append(this.Kbd);
        sb.append("#");
        sb.append(this.IPb);
        sb.append("#");
        sb.append(this.VwS);
        sb.append(" reqErr: ");
        sb.append(this.QQ);
        sb.append("#");
        sb.append(this.HX);
        sb.append("#");
        sb.append(this.tp);
        sb.append(" updateInterval: ");
        sb.append(this.MxO);
        sb.append(" updateRandom: ");
        sb.append(this.tsL);
        sb.append(" httpBlack: ");
        sb.append(this.pi);
        return sb.toString();
    }
}
