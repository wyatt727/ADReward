package com.bytedance.sdk.component.EYQ;

import com.bytedance.sdk.component.EYQ.Pm;
import com.bytedance.sdk.component.EYQ.WU;
import com.bytedance.sdk.component.EYQ.XN;
import com.bytedance.sdk.component.EYQ.hYh;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.json.JSONException;

/* compiled from: CallHandler.java */
/* loaded from: classes2.dex */
class VwS implements XN.EYQ {
    private final QQ EYQ;
    private final boolean HX;
    private final boolean QQ;
    private final pi VwS;
    private final zF mZx;
    private final com.bytedance.sdk.component.EYQ.EYQ tp;
    private final Map<String, mZx> Td = new HashMap();
    private final Map<String, Pm.mZx> Pm = new HashMap();
    private final List<hu> Kbd = new ArrayList();
    private final Set<Pm> IPb = new HashSet();

    VwS(tp tpVar, com.bytedance.sdk.component.EYQ.EYQ eyq, WU wu) {
        this.tp = eyq;
        this.EYQ = tpVar.Pm;
        zF zFVar = new zF(wu, tpVar.tsL, tpVar.pi);
        this.mZx = zFVar;
        zFVar.EYQ(this);
        zFVar.EYQ(tpVar.hu);
        this.VwS = tpVar.HX;
        this.QQ = tpVar.QQ;
        this.HX = tpVar.KO;
    }

    EYQ EYQ(hu huVar, IPb iPb) throws Exception {
        mZx mzx = this.Td.get(huVar.Pm);
        if (mzx != null) {
            try {
                NZ nzMZx = mZx(iPb.mZx, mzx);
                iPb.Pm = nzMZx;
                if (nzMZx == null) {
                    Objects.toString(huVar);
                    throw new Uc(-1);
                }
                if (mzx instanceof Kbd) {
                    Objects.toString(huVar);
                    return EYQ(huVar, (Kbd) mzx, iPb);
                }
                if (mzx instanceof Td) {
                    Objects.toString(huVar);
                    return EYQ(huVar, (Td) mzx, nzMZx);
                }
            } catch (WU.EYQ unused) {
                Objects.toString(huVar);
                this.Kbd.add(huVar);
                return new EYQ(false, tPj.EYQ());
            }
        }
        Pm.mZx mzx2 = this.Pm.get(huVar.Pm);
        if (mzx2 != null) {
            Pm pmEYQ = mzx2.EYQ();
            pmEYQ.EYQ(huVar.Pm);
            NZ nzMZx2 = mZx(iPb.mZx, pmEYQ);
            iPb.Pm = nzMZx2;
            if (nzMZx2 == null) {
                Objects.toString(huVar);
                pmEYQ.Pm();
                throw new Uc(-1);
            }
            Objects.toString(huVar);
            return EYQ(huVar, pmEYQ, iPb);
        }
        Objects.toString(huVar);
        return null;
    }

    void EYQ(String str, Kbd<?, ?> kbd) {
        kbd.EYQ(str);
        this.Td.put(str, kbd);
    }

    void EYQ(String str, Pm.mZx mzx) {
        this.Pm.put(str, mzx);
    }

    void EYQ() {
        Iterator<Pm> it = this.IPb.iterator();
        while (it.hasNext()) {
            it.next().Kbd();
        }
        this.IPb.clear();
        this.Td.clear();
        this.Pm.clear();
        this.mZx.mZx(this);
    }

    private EYQ EYQ(hu huVar, Kbd kbd, IPb iPb) throws Exception {
        return new EYQ(true, tPj.EYQ(this.EYQ.EYQ((QQ) kbd.EYQ(EYQ(huVar.Kbd, (mZx) kbd), iPb))));
    }

    private EYQ EYQ(final hu huVar, final Pm pm, IPb iPb) throws Exception {
        this.IPb.add(pm);
        pm.EYQ(EYQ(huVar.Kbd, pm), iPb, new Pm.EYQ() { // from class: com.bytedance.sdk.component.EYQ.VwS.1
            @Override // com.bytedance.sdk.component.EYQ.Pm.EYQ
            public void EYQ(Throwable th) {
                if (VwS.this.tp == null) {
                    return;
                }
                VwS.this.tp.mZx(tPj.EYQ(th), huVar);
                VwS.this.IPb.remove(pm);
            }
        });
        return new EYQ(false, tPj.EYQ());
    }

    private EYQ EYQ(final hu huVar, Td td, NZ nz) throws Exception {
        new hYh(huVar.Pm, nz, new hYh.EYQ() { // from class: com.bytedance.sdk.component.EYQ.VwS.2
        });
        return new EYQ(false, tPj.EYQ());
    }

    private Object EYQ(String str, mZx mzx) throws JSONException {
        return this.EYQ.EYQ(str, EYQ(mzx)[0]);
    }

    private NZ mZx(String str, mZx mzx) {
        if (this.HX) {
            return NZ.PRIVATE;
        }
        return this.mZx.EYQ(this.QQ, str, mzx);
    }

    private static Type[] EYQ(Object obj) {
        Type genericSuperclass = obj.getClass().getGenericSuperclass();
        if (genericSuperclass == null) {
            throw new IllegalStateException("Method is not parameterized?!");
        }
        return ((ParameterizedType) genericSuperclass).getActualTypeArguments();
    }

    /* compiled from: CallHandler.java */
    static final class EYQ {
        boolean EYQ;
        String mZx;

        private EYQ(boolean z, String str) {
            this.EYQ = z;
            this.mZx = str;
        }
    }
}
