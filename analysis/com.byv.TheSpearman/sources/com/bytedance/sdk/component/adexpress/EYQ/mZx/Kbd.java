package com.bytedance.sdk.component.adexpress.EYQ.mZx;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.EYQ.Td.EYQ;
import com.bytedance.sdk.component.utils.Uc;
import com.bytedance.sdk.component.utils.pi;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.json.t2;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: TemplateManager.java */
/* loaded from: classes2.dex */
public class Kbd extends Td {
    private static File EYQ;
    private static volatile Kbd mZx;
    private AtomicBoolean Td = new AtomicBoolean(true);
    private AtomicBoolean Pm = new AtomicBoolean(false);
    private boolean Kbd = false;
    private AtomicBoolean IPb = new AtomicBoolean(false);
    private AtomicInteger VwS = new AtomicInteger(0);
    private AtomicLong QQ = new AtomicLong();

    public static Kbd mZx() {
        if (mZx == null) {
            synchronized (Kbd.class) {
                if (mZx == null) {
                    mZx = new Kbd();
                }
            }
        }
        return mZx;
    }

    private Kbd() {
        tp();
    }

    public void Td() {
        tp();
    }

    private void tp() {
        com.bytedance.sdk.component.VwS.IPb.EYQ(new com.bytedance.sdk.component.VwS.QQ(t2.a.e) { // from class: com.bytedance.sdk.component.adexpress.EYQ.mZx.Kbd.1
            @Override // java.lang.Runnable
            public void run() throws IOException {
                QQ.EYQ();
                Kbd.this.Td.set(false);
                Kbd.this.Pm();
                Kbd.this.VwS();
                if (com.bytedance.sdk.component.adexpress.EYQ.EYQ.EYQ.EYQ().Td() == null || !Uc.EYQ(com.bytedance.sdk.component.adexpress.EYQ.EYQ.EYQ.EYQ().Td().mZx())) {
                    return;
                }
                com.bytedance.sdk.component.adexpress.EYQ.EYQ.EYQ.EYQ().Td().Td().post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.EYQ.mZx.Kbd.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (com.bytedance.sdk.component.adexpress.EYQ.EYQ.EYQ.EYQ().Td() != null) {
                            com.bytedance.sdk.component.adexpress.EYQ.EYQ.EYQ.EYQ().Td().Pm();
                        }
                    }
                });
            }
        });
    }

    public void Pm() {
        com.bytedance.sdk.component.adexpress.EYQ.Td.EYQ eyqMZx = QQ.mZx();
        if (eyqMZx == null || !eyqMZx.VwS()) {
            return;
        }
        boolean zEYQ = EYQ(eyqMZx);
        if (!zEYQ) {
            QQ.Pm();
        }
        this.Kbd = zEYQ;
    }

    public boolean EYQ(com.bytedance.sdk.component.adexpress.EYQ.Td.EYQ eyq) {
        if (eyq == null) {
            return false;
        }
        return EYQ(eyq.EYQ()) || EYQ(eyq.Kbd()) || EYQ(eyq.IPb());
    }

    public boolean Kbd() {
        return this.Kbd;
    }

    public com.bytedance.sdk.component.adexpress.EYQ.Td.EYQ IPb() {
        return QQ.mZx();
    }

    @Override // com.bytedance.sdk.component.adexpress.EYQ.mZx.Td
    public File EYQ() {
        return QQ();
    }

    public void VwS() {
        EYQ(false);
    }

    public void EYQ(boolean z) {
        boolean z2;
        if (this.Td.get()) {
            return;
        }
        try {
            if (this.Pm.get()) {
                if (z) {
                    this.VwS.getAndIncrement();
                    return;
                }
                return;
            }
            boolean z3 = true;
            this.Pm.set(true);
            com.bytedance.sdk.component.adexpress.EYQ.Td.EYQ eyqKbd = com.bytedance.sdk.component.adexpress.EYQ.EYQ.EYQ.EYQ().Td().Kbd();
            com.bytedance.sdk.component.adexpress.EYQ.Td.EYQ eyqMZx = QQ.mZx();
            if (eyqKbd != null && eyqKbd.VwS()) {
                if (!QQ.mZx(eyqKbd)) {
                    this.Pm.set(false);
                    this.QQ.set(System.currentTimeMillis());
                    return;
                }
                if (com.bytedance.sdk.component.adexpress.EYQ.EYQ.EYQ.EYQ().Td() != null) {
                    com.bytedance.sdk.component.adexpress.EYQ.EYQ.EYQ.EYQ().Td().Td().post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.EYQ.mZx.Kbd.2
                        @Override // java.lang.Runnable
                        public void run() {
                            com.bytedance.sdk.component.adexpress.Kbd.Kbd.EYQ().mZx();
                        }
                    });
                }
                QQ.EYQ(eyqKbd);
                boolean zEYQ = (eyqKbd.Kbd() == null || TextUtils.isEmpty(eyqKbd.Kbd().EYQ())) ? false : EYQ(eyqKbd.Kbd().EYQ());
                List<EYQ.C0089EYQ> listEYQ = null;
                if (eyqKbd.EYQ().size() != 0) {
                    listEYQ = EYQ(eyqKbd, eyqMZx);
                    z2 = listEYQ != null;
                } else {
                    z2 = zEYQ;
                }
                if (!zEYQ) {
                    List<EYQ.C0089EYQ> listMZx = mZx(eyqKbd, eyqMZx);
                    if (listEYQ == null || listMZx == null) {
                        listEYQ = listMZx;
                    } else {
                        listEYQ.addAll(listMZx);
                    }
                    if (listMZx == null) {
                        z3 = false;
                    }
                    if (listMZx == null) {
                        this.Pm.set(false);
                    }
                    z2 = z3;
                }
                if (z2 && EYQ(eyqKbd)) {
                    QQ.EYQ(eyqKbd);
                    QQ.Td();
                    mZx(listEYQ);
                }
                Pm();
                this.Pm.set(false);
                this.QQ.set(System.currentTimeMillis());
                MxO();
                return;
            }
            this.Pm.set(false);
            EYQ(109);
        } catch (Throwable unused) {
        }
    }

    private void MxO() {
        if (this.VwS.getAndSet(0) <= 0 || System.currentTimeMillis() - this.QQ.get() <= TTAdConstant.AD_MAX_EVENT_TIME) {
            return;
        }
        VwS();
    }

    public static File QQ() {
        if (EYQ == null) {
            try {
                File file = new File(new File(Pm.EYQ(), "tt_tmpl_pkg"), "template");
                file.mkdirs();
                EYQ = file;
            } catch (Throwable th) {
                pi.EYQ("TemplateManager", "getTemplateDir error", th);
            }
        }
        return EYQ;
    }

    public void mZx(boolean z) {
        this.IPb.set(z);
    }

    public void HX() {
        this.IPb.set(true);
        this.Kbd = false;
        this.Pm.set(false);
    }
}
