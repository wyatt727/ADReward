package com.bykv.vk.openvk.component.video.api.Td;

import android.os.Build;
import android.text.TextUtils;
import java.io.Serializable;
import java.util.HashMap;
import org.json.JSONObject;

/* compiled from: VideoUrlModel.java */
/* loaded from: classes.dex */
public class Td implements Serializable {
    public String EYQ;
    private mZx IPb;
    private long KO;
    private mZx Kbd;
    private String MxO;
    public int Pm;
    private boolean UB;
    private int Uc;
    private String VwS;
    private int hYh;
    private boolean hu;
    public int mZx;
    private String nWX;
    private int pi;
    private int tsL;
    private int QQ = 204800;
    private int HX = 0;
    private int tp = 0;
    public final HashMap<String, Object> Td = new HashMap<>();
    private int zF = 10000;
    private int WU = 10000;
    private int XN = 10000;
    private int NZ = 0;
    private JSONObject tPj = new JSONObject();

    public Td(String str, mZx mzx, mZx mzx2, int i, int i2) {
        this.Uc = 0;
        this.hYh = 0;
        this.VwS = str;
        this.Kbd = mzx;
        this.IPb = mzx2;
        this.Uc = i;
        this.hYh = i2;
    }

    public int EYQ() {
        return this.tPj.optInt("pitaya_cache_size", 0);
    }

    public String mZx() {
        return this.VwS;
    }

    public void EYQ(String str) {
        this.VwS = str;
    }

    public int Td() {
        if (MxO()) {
            return this.IPb.KO();
        }
        mZx mzx = this.Kbd;
        if (mzx != null) {
            return mzx.KO();
        }
        return 0;
    }

    public boolean Pm() {
        return this.UB;
    }

    public void mZx(String str) {
        this.MxO = str;
    }

    public int Kbd() {
        return this.tsL;
    }

    public void EYQ(int i) {
        this.tsL = i;
    }

    public int IPb() {
        return this.pi;
    }

    public void mZx(int i) {
        this.pi = i;
    }

    public void Td(String str) {
        this.nWX = str;
    }

    public long VwS() {
        return this.KO;
    }

    public void EYQ(long j) {
        this.KO = j;
    }

    public boolean QQ() {
        return this.hu;
    }

    public void EYQ(boolean z) {
        this.hu = z;
    }

    public long HX() {
        if (MxO()) {
            return this.IPb.Kbd();
        }
        mZx mzx = this.Kbd;
        if (mzx != null) {
            return mzx.Kbd();
        }
        return 0L;
    }

    public boolean tp() {
        if (MxO()) {
            return this.IPb.WU();
        }
        mZx mzx = this.Kbd;
        if (mzx != null) {
            return mzx.WU();
        }
        return true;
    }

    public void Pm(String str) {
        this.EYQ = str;
    }

    public void Td(int i) {
        this.mZx = i;
    }

    public boolean MxO() {
        mZx mzx;
        if (this.hYh == 1 && (mzx = this.IPb) != null && !TextUtils.isEmpty(mzx.MxO())) {
            if (com.bykv.vk.openvk.component.video.api.Td.IPb() == 2) {
                if (Build.VERSION.SDK_INT >= 26) {
                    return true;
                }
            } else if (this.Uc == 1) {
                return true;
            }
        }
        return false;
    }

    public float tsL() {
        if (MxO()) {
            return this.IPb.QQ();
        }
        mZx mzx = this.Kbd;
        if (mzx != null) {
            return mzx.QQ();
        }
        return -1.0f;
    }

    public String pi() {
        if (MxO()) {
            return this.IPb.MxO();
        }
        mZx mzx = this.Kbd;
        if (mzx != null) {
            return mzx.MxO();
        }
        return null;
    }

    public String nWX() {
        if (MxO()) {
            return this.IPb.nWX();
        }
        mZx mzx = this.Kbd;
        if (mzx != null) {
            return mzx.nWX();
        }
        return null;
    }

    public int KO() {
        return this.Uc;
    }

    public synchronized void EYQ(String str, Object obj) {
        this.Td.put(str, obj);
    }

    public synchronized Object Kbd(String str) {
        return this.Td.get(str);
    }

    public int hu() {
        return this.zF;
    }

    public void Pm(int i) {
        this.zF = i;
    }

    public int UB() {
        return this.WU;
    }

    public void Kbd(int i) {
        this.WU = i;
    }

    public int Uc() {
        return this.XN;
    }

    public void IPb(int i) {
        this.XN = i;
    }

    public int hYh() {
        return this.NZ;
    }

    public void VwS(int i) {
        this.NZ = i;
    }

    public mZx zF() {
        return this.Kbd;
    }

    public mZx WU() {
        return this.IPb;
    }
}
