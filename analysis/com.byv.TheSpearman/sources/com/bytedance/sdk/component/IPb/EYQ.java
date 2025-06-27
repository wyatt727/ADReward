package com.bytedance.sdk.component.IPb;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.sdk.component.IPb.Pm.Td;
import com.bytedance.sdk.component.IPb.Td.IPb;
import com.bytedance.sdk.component.IPb.Td.VwS;
import com.bytedance.sdk.component.IPb.mZx.Pm;
import com.bytedance.sdk.component.mZx.EYQ.MxO;
import com.bytedance.sdk.component.mZx.EYQ.QQ;
import com.bytedance.sdk.component.utils.Uc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: NetClient.java */
/* loaded from: classes2.dex */
public class EYQ {
    private MxO EYQ;
    private int Td;
    private IPb mZx;

    private EYQ(C0080EYQ c0080eyq) {
        MxO.EYQ eyqMZx = new MxO.EYQ().EYQ(c0080eyq.EYQ, TimeUnit.MILLISECONDS).Td(c0080eyq.Td, TimeUnit.MILLISECONDS).mZx(c0080eyq.mZx, TimeUnit.MILLISECONDS);
        if (c0080eyq.Pm) {
            IPb iPb = new IPb();
            this.mZx = iPb;
            eyqMZx.EYQ(iPb);
        }
        if (c0080eyq.Kbd != null && c0080eyq.Kbd.size() > 0) {
            Iterator<QQ> it = c0080eyq.Kbd.iterator();
            while (it.hasNext()) {
                eyqMZx.EYQ(it.next());
            }
        }
        if (c0080eyq.VwS != null) {
            Bundle unused = c0080eyq.VwS;
        }
        Set unused2 = c0080eyq.IPb;
        this.EYQ = eyqMZx.EYQ();
    }

    public void EYQ(Context context, boolean z, com.bytedance.sdk.component.IPb.Td.mZx mzx) {
        if (context == null) {
            throw new IllegalArgumentException("tryInitAdTTNet context is null");
        }
        if (mzx == null) {
            throw new IllegalArgumentException("tryInitAdTTNet ITTAdNetDepend is null");
        }
        int iEYQ = mzx.EYQ();
        this.Td = iEYQ;
        IPb iPb = this.mZx;
        if (iPb != null) {
            iPb.EYQ(iEYQ);
        }
        VwS.EYQ().EYQ(this.Td).EYQ(z);
        VwS.EYQ().EYQ(this.Td).EYQ(mzx);
        VwS.EYQ().EYQ(this.Td).EYQ(context, Uc.EYQ(context));
    }

    public void EYQ(Context context, boolean z) {
        com.bytedance.sdk.component.IPb.Td.EYQ.mZx(true);
        if (EYQ(context) || (!Uc.EYQ(context) && z)) {
            VwS.EYQ().EYQ(this.Td, context).Pm();
            VwS.EYQ().EYQ(this.Td, context).EYQ();
        }
        if (Uc.EYQ(context)) {
            VwS.EYQ().EYQ(this.Td, context).Pm();
            VwS.EYQ().EYQ(this.Td, context).EYQ();
        }
    }

    public static void EYQ() {
        Td.EYQ(Td.EYQ.DEBUG);
    }

    public Pm mZx() {
        return new Pm(this.EYQ);
    }

    public com.bytedance.sdk.component.IPb.mZx.mZx Td() {
        return new com.bytedance.sdk.component.IPb.mZx.mZx(this.EYQ);
    }

    public com.bytedance.sdk.component.IPb.mZx.EYQ Pm() {
        return new com.bytedance.sdk.component.IPb.mZx.EYQ(this.EYQ);
    }

    private static boolean EYQ(Context context) {
        String strMZx = Uc.mZx(context);
        if (strMZx != null) {
            return strMZx.endsWith(":push") || strMZx.endsWith(":pushservice");
        }
        return false;
    }

    public MxO Kbd() {
        return this.EYQ;
    }

    /* compiled from: NetClient.java */
    /* renamed from: com.bytedance.sdk.component.IPb.EYQ$EYQ, reason: collision with other inner class name */
    public static final class C0080EYQ {
        private Set<String> IPb;
        private Bundle VwS;
        boolean Pm = true;
        final List<QQ> Kbd = new ArrayList();
        int EYQ = 10000;
        int mZx = 10000;
        int Td = 10000;

        public C0080EYQ EYQ(long j, TimeUnit timeUnit) {
            this.EYQ = EYQ("timeout", j, timeUnit);
            return this;
        }

        public C0080EYQ mZx(long j, TimeUnit timeUnit) {
            this.mZx = EYQ("timeout", j, timeUnit);
            return this;
        }

        public C0080EYQ Td(long j, TimeUnit timeUnit) {
            this.Td = EYQ("timeout", j, timeUnit);
            return this;
        }

        public C0080EYQ EYQ(boolean z) {
            this.Pm = z;
            return this;
        }

        private static int EYQ(String str, long j, TimeUnit timeUnit) {
            if (j < 0) {
                throw new IllegalArgumentException(str + " < 0");
            }
            Objects.requireNonNull(timeUnit, "unit == null");
            long millis = timeUnit.toMillis(j);
            if (millis > 2147483647L) {
                throw new IllegalArgumentException(str + " too large.");
            }
            if (millis != 0 || j <= 0) {
                return (int) millis;
            }
            throw new IllegalArgumentException(str + " too small.");
        }

        public EYQ EYQ() {
            return new EYQ(this);
        }
    }
}
