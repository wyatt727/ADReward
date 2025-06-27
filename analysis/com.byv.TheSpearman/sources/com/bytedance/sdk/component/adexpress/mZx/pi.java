package com.bytedance.sdk.component.adexpress.mZx;

import java.util.Map;
import org.json.JSONObject;

/* compiled from: RenderRequest.java */
/* loaded from: classes2.dex */
public class pi {
    private JSONObject EYQ;
    private boolean HX;
    private String IPb;
    private int KO;
    private int Kbd;
    private long MxO;
    private String NZ;
    private String Nvm;
    private HX Pm;
    private String QQ;
    private String Td;
    private String UB;
    private int Uc;
    private String VwS;
    private int WU;
    private int XN;
    private int hYh;
    private boolean hu;
    private JSONObject lEs;
    private Kbd mZx;
    private Map<String, String> nWX;
    private String pi;
    private boolean rfB;
    private double tPj;
    private int tp;
    private int tsL;
    private int wBa;
    private boolean xt;
    private int zF;

    public pi(EYQ eyq) {
        this.EYQ = eyq.EYQ;
        this.mZx = eyq.mZx;
        this.Td = eyq.Td;
        this.Pm = eyq.Pm;
        this.Kbd = eyq.Kbd;
        this.IPb = eyq.IPb;
        this.VwS = eyq.VwS;
        this.QQ = eyq.QQ;
        this.HX = eyq.HX;
        this.tp = eyq.tp;
        this.MxO = eyq.MxO;
        this.tsL = eyq.tsL;
        this.pi = eyq.pi;
        this.nWX = eyq.nWX;
        this.KO = eyq.KO;
        this.hu = eyq.hu;
        this.UB = eyq.UB;
        this.Uc = eyq.Uc;
        this.hYh = eyq.hYh;
        this.zF = eyq.zF;
        this.WU = eyq.WU;
        this.XN = eyq.XN;
        this.NZ = eyq.NZ;
        this.tPj = eyq.tPj;
        this.wBa = eyq.wBa;
        this.rfB = eyq.rfB;
        this.lEs = eyq.lEs;
        this.xt = eyq.xt;
        this.Nvm = eyq.Nvm;
    }

    public boolean EYQ() {
        return this.rfB;
    }

    public double mZx() {
        return this.tPj;
    }

    public JSONObject Td() {
        Kbd kbd;
        if (this.EYQ == null && (kbd = this.mZx) != null) {
            this.EYQ = kbd.EYQ();
        }
        return this.EYQ;
    }

    public String Pm() {
        return this.Td;
    }

    public HX Kbd() {
        return this.Pm;
    }

    public int IPb() {
        return this.Kbd;
    }

    public int VwS() {
        return this.wBa;
    }

    public boolean QQ() {
        return this.HX;
    }

    public long HX() {
        return this.MxO;
    }

    public int tp() {
        return this.tsL;
    }

    public Map<String, String> MxO() {
        return this.nWX;
    }

    public int tsL() {
        return this.KO;
    }

    public boolean pi() {
        return this.hu;
    }

    public String nWX() {
        return this.UB;
    }

    public int KO() {
        return this.Uc;
    }

    public int hu() {
        return this.hYh;
    }

    public int UB() {
        return this.zF;
    }

    public JSONObject Uc() {
        return this.lEs;
    }

    public int hYh() {
        return this.WU;
    }

    public int zF() {
        return this.XN;
    }

    public boolean WU() {
        return this.xt;
    }

    public String XN() {
        return this.Nvm;
    }

    /* compiled from: RenderRequest.java */
    public static class EYQ {
        private JSONObject EYQ;
        private boolean HX;
        private String IPb;
        private int KO;
        private int Kbd;
        private long MxO;
        private String NZ;
        private String Nvm;
        private HX Pm;
        private String QQ;
        private String Td;
        private String UB;
        private int Uc;
        private String VwS;
        private int WU;
        private int XN;
        private int hYh;
        private boolean hu;
        private JSONObject lEs;
        private Kbd mZx;
        private Map<String, String> nWX;
        private String pi;
        private boolean rfB = true;
        private double tPj;
        private int tp;
        private int tsL;
        private int wBa;
        private boolean xt;
        private int zF;

        public EYQ EYQ(Kbd kbd) {
            this.mZx = kbd;
            return this;
        }

        public EYQ EYQ(boolean z) {
            this.rfB = z;
            return this;
        }

        public EYQ EYQ(String str) {
            this.Td = str;
            return this;
        }

        public EYQ EYQ(HX hx) {
            this.Pm = hx;
            return this;
        }

        public EYQ EYQ(int i) {
            this.Kbd = i;
            return this;
        }

        public EYQ mZx(String str) {
            this.IPb = str;
            return this;
        }

        public EYQ Td(String str) {
            this.VwS = str;
            return this;
        }

        public EYQ Pm(String str) {
            this.QQ = str;
            return this;
        }

        public EYQ mZx(boolean z) {
            this.HX = z;
            return this;
        }

        public EYQ mZx(int i) {
            this.tp = i;
            return this;
        }

        public EYQ EYQ(long j) {
            this.MxO = j;
            return this;
        }

        public EYQ Td(int i) {
            this.tsL = i;
            return this;
        }

        public EYQ EYQ(Map<String, String> map) {
            this.nWX = map;
            return this;
        }

        public EYQ Pm(int i) {
            this.KO = i;
            return this;
        }

        public EYQ Td(boolean z) {
            this.hu = z;
            return this;
        }

        public EYQ Kbd(String str) {
            this.UB = str;
            return this;
        }

        public EYQ Kbd(int i) {
            this.wBa = i;
            return this;
        }

        public EYQ Pm(boolean z) {
            this.xt = z;
            return this;
        }

        public EYQ IPb(String str) {
            this.Nvm = str;
            return this;
        }

        public pi EYQ() {
            return new pi(this);
        }

        public EYQ EYQ(double d) {
            this.tPj = d;
            return this;
        }
    }
}
