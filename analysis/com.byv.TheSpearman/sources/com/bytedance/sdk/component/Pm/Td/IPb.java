package com.bytedance.sdk.component.Pm.Td;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import com.bytedance.sdk.component.Pm.UB;
import com.bytedance.sdk.component.Pm.Uc;
import com.bytedance.sdk.component.Pm.hYh;
import com.bytedance.sdk.component.Pm.pi;
import com.bytedance.sdk.component.Pm.tsL;
import java.io.File;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;

/* compiled from: LoadFactory.java */
/* loaded from: classes2.dex */
public class IPb {
    private UB HX;
    private com.bytedance.sdk.component.Pm.Pm IPb;
    private ExecutorService QQ;
    private tsL VwS;
    private final pi mZx;
    private Map<String, List<Td>> EYQ = new ConcurrentHashMap();
    private Map<String, Uc> Td = new HashMap();
    private Map<String, hYh> Pm = new HashMap();
    private Map<String, com.bytedance.sdk.component.Pm.Td> Kbd = new HashMap();

    public IPb(Context context, pi piVar) {
        this.mZx = (pi) QQ.EYQ(piVar);
        com.bytedance.sdk.component.Pm.Td.EYQ.EYQ.EYQ(context, piVar.QQ());
    }

    public Collection<Uc> EYQ() {
        return this.Td.values();
    }

    public Collection<hYh> mZx() {
        return this.Pm.values();
    }

    public Collection<com.bytedance.sdk.component.Pm.Td> Td() {
        return this.Kbd.values();
    }

    public Uc EYQ(com.bytedance.sdk.component.Pm.mZx mzx) {
        if (mzx == null) {
            mzx = com.bytedance.sdk.component.Pm.Td.EYQ.EYQ.VwS();
        }
        String string = mzx.Kbd().toString();
        Uc uc = this.Td.get(string);
        if (uc != null) {
            return uc;
        }
        Uc ucPm = Pm(mzx);
        this.Td.put(string, ucPm);
        return ucPm;
    }

    private Uc Pm(com.bytedance.sdk.component.Pm.mZx mzx) {
        Uc ucPm = this.mZx.Pm();
        if (ucPm != null) {
            return com.bytedance.sdk.component.Pm.Td.EYQ.mZx.EYQ.EYQ(ucPm);
        }
        return com.bytedance.sdk.component.Pm.Td.EYQ.mZx.EYQ.EYQ(mzx.mZx());
    }

    public hYh mZx(com.bytedance.sdk.component.Pm.mZx mzx) {
        if (mzx == null) {
            mzx = com.bytedance.sdk.component.Pm.Td.EYQ.EYQ.VwS();
        }
        String string = mzx.Kbd().toString();
        hYh hyh = this.Pm.get(string);
        if (hyh != null) {
            return hyh;
        }
        hYh hyhKbd = Kbd(mzx);
        this.Pm.put(string, hyhKbd);
        return hyhKbd;
    }

    private hYh Kbd(com.bytedance.sdk.component.Pm.mZx mzx) {
        hYh hyhKbd = this.mZx.Kbd();
        return hyhKbd != null ? hyhKbd : com.bytedance.sdk.component.Pm.Td.EYQ.mZx.Kbd.EYQ(mzx.mZx());
    }

    public com.bytedance.sdk.component.Pm.Td Td(com.bytedance.sdk.component.Pm.mZx mzx) {
        if (mzx == null) {
            mzx = com.bytedance.sdk.component.Pm.Td.EYQ.EYQ.VwS();
        }
        String string = mzx.Kbd().toString();
        com.bytedance.sdk.component.Pm.Td td = this.Kbd.get(string);
        if (td != null) {
            return td;
        }
        com.bytedance.sdk.component.Pm.Td tdIPb = IPb(mzx);
        this.Kbd.put(string, tdIPb);
        return tdIPb;
    }

    public com.bytedance.sdk.component.Pm.Td EYQ(String str) {
        return Td(com.bytedance.sdk.component.Pm.Td.EYQ.EYQ.EYQ(new File(str)));
    }

    private com.bytedance.sdk.component.Pm.Td IPb(com.bytedance.sdk.component.Pm.mZx mzx) {
        com.bytedance.sdk.component.Pm.Td tdIPb = this.mZx.IPb();
        return tdIPb != null ? tdIPb : new com.bytedance.sdk.component.Pm.Td.EYQ.EYQ.mZx(mzx.Kbd(), mzx.EYQ(), IPb());
    }

    public com.bytedance.sdk.component.Pm.Pm Pm() {
        if (this.IPb == null) {
            this.IPb = HX();
        }
        return this.IPb;
    }

    private com.bytedance.sdk.component.Pm.Pm HX() {
        com.bytedance.sdk.component.Pm.Pm pmTd = this.mZx.Td();
        return pmTd == null ? com.bytedance.sdk.component.Pm.mZx.mZx.EYQ() : pmTd;
    }

    public tsL Kbd() {
        if (this.VwS == null) {
            this.VwS = tp();
        }
        return this.VwS;
    }

    private tsL tp() {
        tsL tslEYQ = this.mZx.EYQ();
        return tslEYQ != null ? tslEYQ : com.bytedance.sdk.component.Pm.EYQ.mZx.EYQ();
    }

    public ExecutorService IPb() {
        if (this.QQ == null) {
            this.QQ = MxO();
        }
        return this.QQ;
    }

    private ExecutorService MxO() {
        ExecutorService executorServiceMZx = this.mZx.mZx();
        return executorServiceMZx != null ? executorServiceMZx : com.bytedance.sdk.component.Pm.EYQ.Td.EYQ();
    }

    public Map<String, List<Td>> VwS() {
        return this.EYQ;
    }

    public com.bytedance.sdk.component.Pm.Td.mZx.EYQ EYQ(Td td) {
        ImageView.ScaleType scaleTypePm = td.Pm();
        if (scaleTypePm == null) {
            scaleTypePm = com.bytedance.sdk.component.Pm.Td.mZx.EYQ.EYQ;
        }
        ImageView.ScaleType scaleType = scaleTypePm;
        Bitmap.Config configMxO = td.MxO();
        if (configMxO == null) {
            configMxO = com.bytedance.sdk.component.Pm.Td.mZx.EYQ.mZx;
        }
        return new com.bytedance.sdk.component.Pm.Td.mZx.EYQ(td.mZx(), td.Td(), scaleType, configMxO, td.VwS(), td.QQ());
    }

    public UB QQ() {
        if (this.HX == null) {
            this.HX = tsL();
        }
        return this.HX;
    }

    private UB tsL() {
        UB ubVwS = this.mZx.VwS();
        return ubVwS == null ? new VwS() : ubVwS;
    }
}
