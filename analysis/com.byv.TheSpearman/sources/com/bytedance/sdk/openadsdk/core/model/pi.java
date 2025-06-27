package com.bytedance.sdk.openadsdk.core.model;

import android.util.SparseArray;
import com.bytedance.sdk.openadsdk.core.mZx.Td;
import org.json.JSONObject;

/* compiled from: DynamicClickInfo.java */
/* loaded from: classes2.dex */
public class pi implements com.bytedance.sdk.component.adexpress.Td {
    public final float EYQ;
    public final int HX;
    public final long IPb;
    public final boolean KO;
    public final long Kbd;
    public final String MxO;
    public final float Pm;
    public final int QQ;
    public final float Td;
    public final int VwS;
    public int hu;
    public final float mZx;
    public SparseArray<Td.EYQ> nWX;
    public JSONObject pi;
    public final int tp;
    public int tsL;

    private pi(EYQ eyq) {
        this.EYQ = eyq.VwS;
        this.mZx = eyq.IPb;
        this.Td = eyq.Kbd;
        this.Pm = eyq.Pm;
        this.Kbd = eyq.Td;
        this.IPb = eyq.mZx;
        this.VwS = eyq.QQ;
        this.QQ = eyq.HX;
        this.HX = eyq.tp;
        this.tp = eyq.MxO;
        this.MxO = eyq.tsL;
        this.nWX = eyq.EYQ;
        this.KO = eyq.hu;
        this.tsL = eyq.pi;
        this.pi = eyq.nWX;
        this.hu = eyq.KO;
    }

    /* compiled from: DynamicClickInfo.java */
    public static class EYQ {
        protected SparseArray<Td.EYQ> EYQ = new SparseArray<>();
        private int HX;
        private float IPb;
        private int KO;
        private float Kbd;
        private int MxO;
        private float Pm;
        private int QQ;
        private long Td;
        private float VwS;
        private boolean hu;
        private long mZx;
        private JSONObject nWX;
        private int pi;
        private int tp;
        private String tsL;

        public EYQ EYQ(int i) {
            this.KO = i;
            return this;
        }

        public EYQ mZx(int i) {
            this.pi = i;
            return this;
        }

        public EYQ EYQ(JSONObject jSONObject) {
            this.nWX = jSONObject;
            return this;
        }

        public EYQ EYQ(boolean z) {
            this.hu = z;
            return this;
        }

        public EYQ EYQ(long j) {
            this.mZx = j;
            return this;
        }

        public EYQ mZx(long j) {
            this.Td = j;
            return this;
        }

        public EYQ EYQ(float f) {
            this.Pm = f;
            return this;
        }

        public EYQ mZx(float f) {
            this.Kbd = f;
            return this;
        }

        public EYQ Td(float f) {
            this.IPb = f;
            return this;
        }

        public EYQ Pm(float f) {
            this.VwS = f;
            return this;
        }

        public EYQ Td(int i) {
            this.QQ = i;
            return this;
        }

        public EYQ Pm(int i) {
            this.HX = i;
            return this;
        }

        public EYQ Kbd(int i) {
            this.tp = i;
            return this;
        }

        public EYQ IPb(int i) {
            this.MxO = i;
            return this;
        }

        public EYQ EYQ(String str) {
            this.tsL = str;
            return this;
        }

        public EYQ EYQ(SparseArray<Td.EYQ> sparseArray) {
            this.EYQ = sparseArray;
            return this;
        }

        public pi EYQ() {
            return new pi(this);
        }
    }
}
