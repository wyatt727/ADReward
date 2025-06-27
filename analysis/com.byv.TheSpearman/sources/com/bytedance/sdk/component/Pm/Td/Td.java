package com.bytedance.sdk.component.Pm.Td;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.widget.ImageView;
import com.bytedance.sdk.component.Pm.HX;
import com.bytedance.sdk.component.Pm.MxO;
import com.bytedance.sdk.component.Pm.hu;
import com.bytedance.sdk.component.Pm.nWX;
import com.bytedance.sdk.component.Pm.tp;
import com.bytedance.sdk.component.Pm.zF;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: ImageRequest.java */
/* loaded from: classes2.dex */
public class Td implements HX {
    Future<?> EYQ;
    private boolean FH;
    private int HX;
    private ImageView.ScaleType IPb;
    private boolean KO;
    private hu Kbd;
    private int MxO;
    private IPb NZ;
    private ExecutorService Nvm;
    private String Pm;
    private int QQ;
    private String Td;
    private int UB;
    private Queue<com.bytedance.sdk.component.Pm.Pm.HX> Uc;
    private Bitmap.Config VwS;
    private com.bytedance.sdk.component.Pm.VwS WU;
    private int XN;
    private final Handler hYh;
    private zF hu;
    private int lEs;
    private String mZx;
    private boolean nWX;
    private volatile boolean pi;
    private int rfB;
    private com.bytedance.sdk.component.Pm.Td.EYQ tPj;
    private com.bytedance.sdk.component.Pm.QQ tp;
    private nWX tr;
    private WeakReference<ImageView> tsL;
    private com.bytedance.sdk.component.Pm.mZx wBa;
    private boolean xt;
    private boolean zF;

    private Td(mZx mzx) {
        this.Uc = new LinkedBlockingQueue();
        this.hYh = new Handler(Looper.getMainLooper());
        this.zF = true;
        this.mZx = mzx.Pm;
        this.Kbd = new EYQ(mzx.EYQ);
        this.tsL = new WeakReference<>(mzx.mZx);
        this.IPb = mzx.Kbd;
        this.VwS = mzx.IPb;
        this.QQ = mzx.VwS;
        this.HX = mzx.QQ;
        this.MxO = mzx.HX;
        this.UB = mzx.tp;
        this.hu = mzx.MxO;
        this.wBa = EYQ(mzx);
        if (!TextUtils.isEmpty(mzx.Td)) {
            mZx(mzx.Td);
            EYQ(mzx.Td);
        }
        this.nWX = mzx.tsL;
        this.KO = mzx.pi;
        this.NZ = mzx.hu;
        this.tp = mzx.UB;
        this.lEs = mzx.hYh;
        this.rfB = mzx.Uc;
        this.Nvm = mzx.WU;
        this.xt = mzx.zF;
        this.FH = mzx.XN;
        this.tr = mzx.NZ;
        this.Uc.add(new com.bytedance.sdk.component.Pm.Pm.Td());
    }

    private com.bytedance.sdk.component.Pm.mZx EYQ(mZx mzx) {
        if (mzx.KO != null) {
            return mzx.KO;
        }
        if (!TextUtils.isEmpty(mzx.nWX)) {
            return com.bytedance.sdk.component.Pm.Td.EYQ.EYQ.EYQ(new File(mzx.nWX));
        }
        return com.bytedance.sdk.component.Pm.Td.EYQ.EYQ.VwS();
    }

    public int VwS() {
        return this.rfB;
    }

    public int QQ() {
        return this.lEs;
    }

    @Override // com.bytedance.sdk.component.Pm.HX
    public String EYQ() {
        return this.mZx;
    }

    public hu HX() {
        return this.Kbd;
    }

    public String tp() {
        return this.Pm;
    }

    public void EYQ(String str) {
        this.Pm = str;
    }

    @Override // com.bytedance.sdk.component.Pm.HX
    public String Kbd() {
        return this.Td;
    }

    @Override // com.bytedance.sdk.component.Pm.HX
    public Bitmap.Config IPb() {
        return this.VwS;
    }

    public void mZx(String str) {
        WeakReference<ImageView> weakReference = this.tsL;
        if (weakReference != null && weakReference.get() != null) {
            this.tsL.get().setTag(1094453505, str);
        }
        this.Td = str;
    }

    @Override // com.bytedance.sdk.component.Pm.HX
    public ImageView.ScaleType Pm() {
        return this.IPb;
    }

    public Bitmap.Config MxO() {
        return this.VwS;
    }

    @Override // com.bytedance.sdk.component.Pm.HX
    public int mZx() {
        return this.QQ;
    }

    @Override // com.bytedance.sdk.component.Pm.HX
    public int Td() {
        return this.HX;
    }

    public int tsL() {
        return this.MxO;
    }

    public boolean pi() {
        return this.nWX;
    }

    public boolean nWX() {
        return this.KO;
    }

    public void EYQ(boolean z) {
        this.zF = z;
    }

    public boolean KO() {
        return this.zF;
    }

    public com.bytedance.sdk.component.Pm.VwS hu() {
        return this.WU;
    }

    public void EYQ(com.bytedance.sdk.component.Pm.VwS vwS) {
        this.WU = vwS;
    }

    public int UB() {
        return this.XN;
    }

    public void EYQ(int i) {
        this.XN = i;
    }

    public com.bytedance.sdk.component.Pm.Td.EYQ Uc() {
        return this.tPj;
    }

    public void EYQ(com.bytedance.sdk.component.Pm.Td.EYQ eyq) {
        this.tPj = eyq;
    }

    public IPb hYh() {
        return this.NZ;
    }

    public com.bytedance.sdk.component.Pm.mZx zF() {
        return this.wBa;
    }

    public boolean EYQ(com.bytedance.sdk.component.Pm.Pm.HX hx) {
        if (this.pi) {
            return false;
        }
        return this.Uc.add(hx);
    }

    public boolean WU() {
        return this.xt;
    }

    public nWX XN() {
        return this.tr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public HX tPj() {
        IPb iPb;
        try {
            iPb = this.NZ;
        } catch (Exception e) {
            Log.e("ImageRequest", e.getMessage());
        }
        if (iPb == null) {
            hu huVar = this.Kbd;
            if (huVar != null) {
                huVar.EYQ(1005, "not init !", null);
            }
            return this;
        }
        if (this.Nvm == null) {
            this.Nvm = iPb.IPb();
        }
        Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.component.Pm.Td.Td.1
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.component.Pm.Pm.HX hx;
                while (!Td.this.pi && (hx = (com.bytedance.sdk.component.Pm.Pm.HX) Td.this.Uc.poll()) != null) {
                    try {
                        if (Td.this.hu != null) {
                            Td.this.hu.EYQ(hx.EYQ(), Td.this);
                        }
                        hx.EYQ(Td.this);
                        if (Td.this.hu != null) {
                            Td.this.hu.mZx(hx.EYQ(), Td.this);
                        }
                    } catch (Throwable th) {
                        Td.this.EYQ(2000, th.getMessage(), th);
                        if (Td.this.hu != null) {
                            Td.this.hu.mZx("exception", Td.this);
                            return;
                        }
                        return;
                    }
                }
                if (Td.this.pi) {
                    Td.this.EYQ(1003, "canceled", null);
                }
            }
        };
        if (this.FH) {
            runnable.run();
        } else {
            ExecutorService executorService = this.Nvm;
            if (executorService != null) {
                this.EYQ = executorService.submit(runnable);
            }
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void EYQ(int i, String str, Throwable th) {
        new com.bytedance.sdk.component.Pm.Pm.QQ(i, str, th).EYQ(this);
        this.Uc.clear();
    }

    public String NZ() {
        return Kbd() + tsL();
    }

    /* compiled from: ImageRequest.java */
    public static class mZx implements tp {
        private hu EYQ;
        private Bitmap.Config IPb;
        private com.bytedance.sdk.component.Pm.mZx KO;
        private ImageView.ScaleType Kbd;
        private zF MxO;
        private nWX NZ;
        private String Pm;
        private int QQ;
        private String Td;
        private com.bytedance.sdk.component.Pm.QQ UB;
        private int Uc;
        private int VwS;
        private ExecutorService WU;
        private boolean XN;
        private int hYh;
        private IPb hu;
        private ImageView mZx;
        private String nWX;
        private boolean pi;
        private boolean tsL;
        private boolean zF;
        private int HX = 1;
        private int tp = 5;

        public mZx(IPb iPb) {
            this.hu = iPb;
        }

        public tp Td(String str) {
            this.Pm = str;
            return this;
        }

        @Override // com.bytedance.sdk.component.Pm.tp
        public tp EYQ(String str) {
            this.Td = str;
            return this;
        }

        @Override // com.bytedance.sdk.component.Pm.tp
        public tp EYQ(ImageView.ScaleType scaleType) {
            this.Kbd = scaleType;
            return this;
        }

        @Override // com.bytedance.sdk.component.Pm.tp
        public tp EYQ(Bitmap.Config config) {
            this.IPb = config;
            return this;
        }

        @Override // com.bytedance.sdk.component.Pm.tp
        public tp EYQ(int i) {
            this.VwS = i;
            return this;
        }

        @Override // com.bytedance.sdk.component.Pm.tp
        public tp mZx(int i) {
            this.QQ = i;
            return this;
        }

        @Override // com.bytedance.sdk.component.Pm.tp
        public tp Td(int i) {
            this.HX = i;
            return this;
        }

        @Override // com.bytedance.sdk.component.Pm.tp
        public tp EYQ(zF zFVar) {
            this.MxO = zFVar;
            return this;
        }

        @Override // com.bytedance.sdk.component.Pm.tp
        public tp EYQ(boolean z) {
            this.pi = z;
            return this;
        }

        @Override // com.bytedance.sdk.component.Pm.tp
        public tp mZx(String str) {
            this.nWX = str;
            return this;
        }

        @Override // com.bytedance.sdk.component.Pm.tp
        public HX EYQ(hu huVar, int i) {
            this.tp = i;
            return EYQ(huVar);
        }

        @Override // com.bytedance.sdk.component.Pm.tp
        public HX EYQ(hu huVar) {
            this.EYQ = huVar;
            return new Td(this).tPj();
        }

        @Override // com.bytedance.sdk.component.Pm.tp
        public HX EYQ(ImageView imageView) {
            this.mZx = imageView;
            return new Td(this).tPj();
        }

        @Override // com.bytedance.sdk.component.Pm.tp
        public tp EYQ(com.bytedance.sdk.component.Pm.QQ qq) {
            this.UB = qq;
            return this;
        }

        @Override // com.bytedance.sdk.component.Pm.tp
        public tp Pm(int i) {
            this.Uc = i;
            return this;
        }

        @Override // com.bytedance.sdk.component.Pm.tp
        public tp Kbd(int i) {
            this.hYh = i;
            return this;
        }
    }

    /* compiled from: ImageRequest.java */
    private class EYQ implements hu {
        private hu mZx;

        public EYQ(hu huVar) {
            this.mZx = huVar;
        }

        @Override // com.bytedance.sdk.component.Pm.hu
        public void EYQ(final MxO mxO) {
            final ImageView imageView = (ImageView) Td.this.tsL.get();
            if (imageView != null && Td.this.MxO != 3 && EYQ(imageView) && (mxO.mZx() instanceof Bitmap)) {
                final Bitmap bitmap = (Bitmap) mxO.mZx();
                Td.this.hYh.post(new Runnable() { // from class: com.bytedance.sdk.component.Pm.Td.Td.EYQ.1
                    @Override // java.lang.Runnable
                    public void run() {
                        imageView.setImageBitmap(bitmap);
                    }
                });
            }
            try {
                if (Td.this.tp != null && (mxO.mZx() instanceof Bitmap)) {
                    com.bytedance.sdk.component.Pm.QQ qq = Td.this.tp;
                    Bitmap bitmap2 = (Bitmap) mxO.mZx();
                    Bitmap bitmapEYQ = qq.EYQ(bitmap2);
                    if (bitmapEYQ != null) {
                        mxO.EYQ(bitmapEYQ);
                    }
                }
            } catch (Throwable unused) {
            }
            if (Td.this.UB == 5) {
                Td.this.hYh.postAtFrontOfQueue(new Runnable() { // from class: com.bytedance.sdk.component.Pm.Td.Td.EYQ.2
                    @Override // java.lang.Runnable
                    public void run() {
                        if (EYQ.this.mZx != null) {
                            EYQ.this.mZx.EYQ(mxO);
                        }
                    }
                });
                return;
            }
            hu huVar = this.mZx;
            if (huVar != null) {
                huVar.EYQ(mxO);
            }
        }

        private boolean EYQ(ImageView imageView) {
            Object tag;
            return (imageView == null || (tag = imageView.getTag(1094453505)) == null || !tag.equals(Td.this.Td)) ? false : true;
        }

        @Override // com.bytedance.sdk.component.Pm.hu
        public void EYQ(final int i, final String str, final Throwable th) {
            if (Td.this.UB == 5) {
                Td.this.hYh.post(new Runnable() { // from class: com.bytedance.sdk.component.Pm.Td.Td.EYQ.3
                    @Override // java.lang.Runnable
                    public void run() {
                        if (EYQ.this.mZx != null) {
                            EYQ.this.mZx.EYQ(i, str, th);
                        }
                    }
                });
                return;
            }
            hu huVar = this.mZx;
            if (huVar != null) {
                huVar.EYQ(i, str, th);
            }
        }
    }
}
