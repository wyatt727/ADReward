package com.bytedance.sdk.component.EYQ;

import android.text.TextUtils;

/* compiled from: Js2JavaCall.java */
/* loaded from: classes2.dex */
public class hu {
    public final int EYQ;
    public final String IPb;
    public final String Kbd;
    public final String Pm;
    public final String QQ;
    public final String Td;
    public final String VwS;
    public final String mZx;

    public static EYQ EYQ() {
        return new EYQ();
    }

    public static hu EYQ(String str, int i) {
        return new hu(str, i);
    }

    private hu(String str, int i) {
        this.mZx = null;
        this.Td = null;
        this.Pm = null;
        this.Kbd = null;
        this.IPb = str;
        this.VwS = null;
        this.EYQ = i;
        this.QQ = null;
    }

    private hu(EYQ eyq) {
        this.mZx = eyq.EYQ;
        this.Td = eyq.mZx;
        this.Pm = eyq.Td;
        this.Kbd = eyq.Pm;
        this.IPb = eyq.Kbd;
        this.VwS = eyq.IPb;
        this.EYQ = 1;
        this.QQ = eyq.VwS;
    }

    public static boolean EYQ(hu huVar) {
        return huVar == null || huVar.EYQ != 1 || TextUtils.isEmpty(huVar.Pm) || TextUtils.isEmpty(huVar.Kbd);
    }

    public String toString() {
        return "methodName: " + this.Pm + ", params: " + this.Kbd + ", callbackId: " + this.IPb + ", type: " + this.Td + ", version: " + this.mZx + ", ";
    }

    /* compiled from: Js2JavaCall.java */
    public static final class EYQ {
        private String EYQ;
        private String IPb;
        private String Kbd;
        private String Pm;
        private String Td;
        private String VwS;
        private String mZx;

        private EYQ() {
        }

        public EYQ EYQ(String str) {
            this.EYQ = str;
            return this;
        }

        public EYQ mZx(String str) {
            this.mZx = str;
            return this;
        }

        public EYQ Td(String str) {
            this.Td = str;
            return this;
        }

        public EYQ Pm(String str) {
            this.Pm = str;
            return this;
        }

        public EYQ Kbd(String str) {
            this.Kbd = str;
            return this;
        }

        public EYQ IPb(String str) {
            this.IPb = str;
            return this;
        }

        public EYQ VwS(String str) {
            this.VwS = str;
            return this;
        }

        public hu EYQ() {
            return new hu(this);
        }
    }
}
