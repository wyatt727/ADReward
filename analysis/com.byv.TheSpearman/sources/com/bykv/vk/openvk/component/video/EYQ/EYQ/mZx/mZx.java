package com.bykv.vk.openvk.component.video.EYQ.EYQ.mZx;

import android.content.Context;
import com.bykv.vk.openvk.component.video.api.Kbd.EYQ;
import com.bytedance.sdk.component.mZx.EYQ.MxO;
import com.bytedance.sdk.component.mZx.EYQ.pi;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: ReallyVideoPreload.java */
/* loaded from: classes.dex */
public class mZx {
    private Context EYQ;
    private File Kbd;
    private File Pm;
    private com.bykv.vk.openvk.component.video.api.Td.Td mZx;
    private volatile boolean Td = false;
    private final List<EYQ.InterfaceC0064EYQ> IPb = new ArrayList();
    private volatile boolean VwS = false;

    public mZx(Context context, com.bykv.vk.openvk.component.video.api.Td.Td td) {
        this.Pm = null;
        this.Kbd = null;
        this.EYQ = context;
        this.mZx = td;
        this.Pm = com.bykv.vk.openvk.component.video.EYQ.Kbd.mZx.mZx(td.mZx(), td.nWX());
        this.Kbd = com.bykv.vk.openvk.component.video.EYQ.Kbd.mZx.Td(td.mZx(), td.nWX());
    }

    public void EYQ(EYQ.InterfaceC0064EYQ interfaceC0064EYQ) {
        if (this.VwS) {
            synchronized (EYQ.InterfaceC0064EYQ.class) {
                this.IPb.add(interfaceC0064EYQ);
            }
            return;
        }
        this.IPb.add(interfaceC0064EYQ);
        if (mZx()) {
            this.mZx.VwS(1);
            EYQ(this.mZx, 200);
            Td.EYQ(this.mZx);
        } else {
            this.VwS = true;
            this.mZx.VwS(0);
            Td();
        }
    }

    private boolean mZx() {
        if (this.Kbd.exists()) {
            return true;
        }
        if (!this.mZx.tp()) {
            if (this.Pm.length() >= this.mZx.Td()) {
                return true;
            }
            if (this.mZx.EYQ() > 0 && this.Pm.length() >= this.mZx.EYQ()) {
                return true;
            }
        }
        return false;
    }

    private void Td() {
        MxO.EYQ eyq;
        if (com.bykv.vk.openvk.component.video.api.Td.Pm() != null) {
            eyq = com.bykv.vk.openvk.component.video.api.Td.Pm().mZx();
        } else {
            eyq = new MxO.EYQ("v_preload");
        }
        eyq.EYQ(this.mZx.hu(), TimeUnit.MILLISECONDS).mZx(this.mZx.UB(), TimeUnit.MILLISECONDS).Td(this.mZx.Uc(), TimeUnit.MILLISECONDS);
        MxO mxOEYQ = eyq.EYQ();
        pi.EYQ eyq2 = new pi.EYQ();
        final long length = this.Pm.length();
        int iTd = this.mZx.Td();
        boolean zTp = this.mZx.tp();
        int iEYQ = this.mZx.EYQ();
        if (iEYQ > 0) {
            if (iEYQ >= this.mZx.HX()) {
                zTp = true;
            } else {
                iTd = iEYQ;
            }
        }
        if (zTp) {
            eyq2.EYQ("RANGE", "bytes=" + length + "-").EYQ(this.mZx.pi()).EYQ().mZx();
        } else {
            eyq2.EYQ("RANGE", "bytes=" + length + "-" + iTd).EYQ(this.mZx.pi()).EYQ().mZx();
        }
        mxOEYQ.EYQ(eyq2.mZx()).EYQ(new com.bytedance.sdk.component.mZx.EYQ.Td() { // from class: com.bykv.vk.openvk.component.video.EYQ.EYQ.mZx.mZx.1
            @Override // com.bytedance.sdk.component.mZx.EYQ.Td
            public void EYQ(com.bytedance.sdk.component.mZx.EYQ.mZx mzx, IOException iOException) {
                mZx mzx2 = mZx.this;
                mzx2.EYQ(mzx2.mZx, 601, iOException.getMessage());
                Td.EYQ(mZx.this.mZx);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:70:0x0161 A[Catch: all -> 0x0178, TryCatch #2 {all -> 0x0178, blocks: (B:68:0x0154, B:70:0x0161, B:71:0x0165), top: B:79:0x0154 }] */
            /* JADX WARN: Type inference failed for: r13v5 */
            @Override // com.bytedance.sdk.component.mZx.EYQ.Td
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void EYQ(com.bytedance.sdk.component.mZx.EYQ.mZx r18, com.bytedance.sdk.component.mZx.EYQ.KO r19) throws java.io.IOException {
                /*
                    Method dump skipped, instructions count: 429
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bykv.vk.openvk.component.video.EYQ.EYQ.mZx.mZx.AnonymousClass1.EYQ(com.bytedance.sdk.component.mZx.EYQ.mZx, com.bytedance.sdk.component.mZx.EYQ.KO):void");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void EYQ(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    public com.bykv.vk.openvk.component.video.api.Td.Td EYQ() {
        return this.mZx;
    }

    public void EYQ(boolean z) {
        this.Td = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void EYQ(com.bykv.vk.openvk.component.video.api.Td.Td td, int i) {
        synchronized (EYQ.InterfaceC0064EYQ.class) {
            for (EYQ.InterfaceC0064EYQ interfaceC0064EYQ : this.IPb) {
                if (interfaceC0064EYQ != null) {
                    interfaceC0064EYQ.EYQ(td, i);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void EYQ(com.bykv.vk.openvk.component.video.api.Td.Td td, int i, String str) {
        synchronized (EYQ.InterfaceC0064EYQ.class) {
            for (EYQ.InterfaceC0064EYQ interfaceC0064EYQ : this.IPb) {
                if (interfaceC0064EYQ != null) {
                    interfaceC0064EYQ.EYQ(td, i, str);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mZx(com.bykv.vk.openvk.component.video.api.Td.Td td, int i) {
        synchronized (EYQ.InterfaceC0064EYQ.class) {
            for (EYQ.InterfaceC0064EYQ interfaceC0064EYQ : this.IPb) {
                if (interfaceC0064EYQ != null) {
                    interfaceC0064EYQ.mZx(td, i);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Pm() {
        try {
            this.Kbd.delete();
            this.Pm.delete();
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Kbd() {
        try {
            if (this.Pm.renameTo(this.Kbd)) {
                return;
            }
            throw new IOException("Error renaming file " + this.Pm + " to " + this.Kbd + " for completion!");
        } catch (Throwable th) {
            th.getMessage();
        }
    }
}
