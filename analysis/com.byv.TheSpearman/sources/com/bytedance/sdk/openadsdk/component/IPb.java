package com.bytedance.sdk.openadsdk.component;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.text.TextUtils;
import com.bykv.vk.openvk.component.video.api.Kbd.EYQ;
import com.bytedance.sdk.component.Pm.MxO;
import com.bytedance.sdk.component.Pm.QQ;
import com.bytedance.sdk.component.utils.pi;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.UB;
import com.bytedance.sdk.openadsdk.core.hu;
import com.bytedance.sdk.openadsdk.core.model.XN;
import com.bytedance.sdk.openadsdk.core.model.hYh;
import com.bytedance.sdk.openadsdk.core.model.nWX;
import com.bytedance.sdk.openadsdk.utils.MxO;
import com.bytedance.sdk.openadsdk.utils.Nvm;
import com.bytedance.sdk.openadsdk.utils.tr;
import com.bytedance.sdk.openadsdk.utils.xt;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: TTAppOpenAdCacheManager.java */
/* loaded from: classes2.dex */
public class IPb {
    private static volatile IPb EYQ;
    private final Map<String, AtomicInteger> Kbd = new ConcurrentHashMap();
    private final Context Pm;
    private final UB<com.bytedance.sdk.openadsdk.mZx.EYQ> Td;
    private final com.bytedance.sdk.openadsdk.EYQ.mZx mZx;

    /* compiled from: TTAppOpenAdCacheManager.java */
    public interface Pm {
        void EYQ(Bitmap bitmap);
    }

    /* compiled from: TTAppOpenAdCacheManager.java */
    interface Td {
        void EYQ();

        void EYQ(int i, String str);
    }

    /* compiled from: TTAppOpenAdCacheManager.java */
    public interface mZx {
        void EYQ();

        void EYQ(com.bytedance.sdk.openadsdk.MxO.EYQ.mZx mzx);
    }

    private IPb(Context context) {
        if (context != null) {
            this.Pm = context.getApplicationContext();
        } else {
            this.Pm = hu.EYQ();
        }
        this.mZx = new com.bytedance.sdk.openadsdk.EYQ.mZx(10, 8, true);
        this.Td = hu.Td();
    }

    public static IPb EYQ(Context context) {
        if (EYQ == null) {
            synchronized (IPb.class) {
                if (EYQ == null) {
                    EYQ = new IPb(context);
                }
            }
        }
        return EYQ;
    }

    public static void EYQ(com.bytedance.sdk.openadsdk.core.model.UB ub, Pm pm) {
        EYQ(ub, pm, 0);
    }

    public static void EYQ(com.bytedance.sdk.openadsdk.core.model.UB ub, final Pm pm, final int i) {
        String strTp = ub.mN().tp();
        if (TextUtils.isEmpty(strTp)) {
            return;
        }
        com.bytedance.sdk.openadsdk.IPb.Pm.EYQ(strTp).EYQ(ub.mN().Td()).mZx(ub.mN().mZx()).Kbd(tr.Pm(hu.EYQ())).Pm(tr.Td(hu.EYQ())).Td(2).EYQ(new QQ() { // from class: com.bytedance.sdk.openadsdk.component.IPb.2
            @Override // com.bytedance.sdk.component.Pm.QQ
            public Bitmap EYQ(Bitmap bitmap) {
                if (i <= 0) {
                    return bitmap;
                }
                if (Build.VERSION.SDK_INT >= 17) {
                    return com.bytedance.sdk.component.adexpress.Pm.EYQ.EYQ(hu.EYQ(), bitmap, i);
                }
                return null;
            }
        }).EYQ(new com.bytedance.sdk.openadsdk.IPb.mZx(ub, strTp, new com.bytedance.sdk.component.Pm.hu<Bitmap>() { // from class: com.bytedance.sdk.openadsdk.component.IPb.1
            @Override // com.bytedance.sdk.component.Pm.hu
            public void EYQ(int i2, String str, Throwable th) {
            }

            @Override // com.bytedance.sdk.component.Pm.hu
            public void EYQ(MxO<Bitmap> mxO) {
                Pm pm2;
                if (mxO == null || mxO.mZx() == null || mxO.Td() == null || (pm2 = pm) == null) {
                    return;
                }
                pm2.EYQ(mxO.mZx());
            }
        }));
    }

    public void EYQ(final AdSlot adSlot) {
        if (adSlot == null || !TextUtils.isEmpty(adSlot.getBidAdm())) {
            return;
        }
        AtomicInteger atomicInteger = this.Kbd.get(adSlot.getCodeId());
        if (atomicInteger == null) {
            atomicInteger = new AtomicInteger(0);
        }
        int iTd = atomicInteger.get() + Td(adSlot);
        if (iTd > 0) {
            Integer.valueOf(iTd);
            Integer.valueOf(1);
            return;
        }
        atomicInteger.incrementAndGet();
        this.Kbd.put(adSlot.getCodeId(), atomicInteger);
        final XN xn = new XN();
        xn.EYQ(Nvm.EYQ());
        hYh hyh = new hYh();
        hyh.QQ = xn;
        hyh.Pm = 2;
        hyh.IPb = 2;
        this.Td.EYQ(adSlot, hyh, 3, new UB.EYQ() { // from class: com.bytedance.sdk.openadsdk.component.IPb.3
            @Override // com.bytedance.sdk.openadsdk.core.UB.EYQ
            public void EYQ(int i, String str) {
                IPb.this.mZx(adSlot);
            }

            @Override // com.bytedance.sdk.openadsdk.core.UB.EYQ
            public void EYQ(com.bytedance.sdk.openadsdk.core.model.EYQ eyq, com.bytedance.sdk.openadsdk.core.model.mZx mzx) {
                if (eyq == null || eyq.Td() == null || eyq.Td().size() == 0) {
                    mzx.EYQ(-3);
                    com.bytedance.sdk.openadsdk.core.model.mZx.EYQ(mzx);
                    return;
                }
                com.bytedance.sdk.openadsdk.core.model.UB ub = eyq.Td().get(0);
                if (ub != null && ub.BEC()) {
                    com.bytedance.sdk.openadsdk.component.Kbd.EYQ eyq2 = new com.bytedance.sdk.openadsdk.component.Kbd.EYQ(ub.yK(), ub);
                    IPb.this.EYQ(eyq2);
                    com.bytedance.sdk.openadsdk.component.Pm.EYQ.EYQ(eyq2.mZx(), 1, xn);
                    IPb.this.mZx(adSlot);
                    return;
                }
                if (com.bytedance.sdk.openadsdk.core.model.UB.Kbd(ub)) {
                    IPb.this.EYQ(ub, adSlot, xn);
                } else {
                    IPb.this.mZx(ub, adSlot, xn);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mZx(AdSlot adSlot) {
        AtomicInteger atomicInteger = this.Kbd.get(adSlot.getCodeId());
        if (atomicInteger == null) {
            atomicInteger = new AtomicInteger(0);
        } else {
            atomicInteger.decrementAndGet();
        }
        this.Kbd.put(adSlot.getCodeId(), atomicInteger);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void EYQ(final com.bytedance.sdk.openadsdk.core.model.UB ub, final AdSlot adSlot, final XN xn) {
        final int iYK = ub.yK();
        EYQ(ub, adSlot, xn, new Td() { // from class: com.bytedance.sdk.openadsdk.component.IPb.4
            @Override // com.bytedance.sdk.openadsdk.component.IPb.Td
            public void EYQ() {
                com.bytedance.sdk.openadsdk.component.Kbd.EYQ eyq = new com.bytedance.sdk.openadsdk.component.Kbd.EYQ(iYK, ub);
                IPb.this.EYQ(eyq);
                com.bytedance.sdk.openadsdk.component.Pm.EYQ.EYQ(eyq.mZx(), 1, xn);
                IPb.this.mZx(adSlot);
            }

            @Override // com.bytedance.sdk.openadsdk.component.IPb.Td
            public void EYQ(int i, String str) {
                IPb.this.mZx(adSlot);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mZx(final com.bytedance.sdk.openadsdk.core.model.UB ub, final AdSlot adSlot, final XN xn) {
        final int iYK = ub.yK();
        EYQ(ub, xn, new mZx() { // from class: com.bytedance.sdk.openadsdk.component.IPb.5
            @Override // com.bytedance.sdk.openadsdk.component.IPb.mZx
            public void EYQ(com.bytedance.sdk.openadsdk.MxO.EYQ.mZx mzx) {
                com.bytedance.sdk.openadsdk.component.Kbd.EYQ eyq = new com.bytedance.sdk.openadsdk.component.Kbd.EYQ(iYK, ub);
                IPb.this.EYQ(eyq);
                com.bytedance.sdk.openadsdk.component.Pm.EYQ.EYQ(eyq.mZx(), 1, xn);
                IPb.this.mZx(adSlot);
            }

            @Override // com.bytedance.sdk.openadsdk.component.IPb.mZx
            public void EYQ() {
                IPb.this.mZx(adSlot);
            }
        });
    }

    public void EYQ(final com.bytedance.sdk.openadsdk.core.model.UB ub, AdSlot adSlot, final XN xn, final Td td) {
        final Nvm nvmEYQ = Nvm.EYQ();
        final int iYK = ub.yK();
        com.bykv.vk.openvk.component.video.api.Td.mZx mzxMN = ub.mN();
        String strMxO = mzxMN.MxO();
        String strNWX = mzxMN.nWX();
        if (TextUtils.isEmpty(strNWX)) {
            strNWX = com.bytedance.sdk.component.utils.Kbd.EYQ(strMxO);
        }
        final File fileEYQ = com.bytedance.sdk.openadsdk.component.VwS.EYQ.EYQ(strNWX);
        if (fileEYQ.exists()) {
            com.bytedance.sdk.openadsdk.component.VwS.EYQ.EYQ(fileEYQ);
            EYQ(iYK);
            long jTd = nvmEYQ.Td();
            if (xn != null) {
                xn.EYQ(jTd);
                xn.EYQ(1);
            }
            td.EYQ();
            EYQ(ub, (Pm) null);
            return;
        }
        if (hu.Pm().wBa(String.valueOf(iYK)) && !com.bytedance.sdk.component.utils.hu.Pm(hu.EYQ())) {
            td.EYQ(100, "OnlyWifi");
            return;
        }
        com.bytedance.sdk.openadsdk.core.video.EYQ.mZx mzxEYQ = com.bytedance.sdk.openadsdk.core.model.UB.EYQ(fileEYQ.getParent(), ub);
        mzxEYQ.EYQ("material_meta", ub);
        mzxEYQ.EYQ("ad_slot", adSlot);
        com.bytedance.sdk.openadsdk.core.video.Pm.EYQ.EYQ(mzxEYQ, new EYQ.InterfaceC0064EYQ() { // from class: com.bytedance.sdk.openadsdk.component.IPb.6
            @Override // com.bykv.vk.openvk.component.video.api.Kbd.EYQ.InterfaceC0064EYQ
            public void mZx(com.bykv.vk.openvk.component.video.api.Td.Td td2, int i) {
            }

            @Override // com.bykv.vk.openvk.component.video.api.Kbd.EYQ.InterfaceC0064EYQ
            public void EYQ(com.bykv.vk.openvk.component.video.api.Td.Td td2, int i) {
                IPb.this.EYQ(iYK);
                long jTd2 = nvmEYQ.Td();
                com.bytedance.sdk.openadsdk.component.Pm.EYQ.mZx(ub, jTd2, true);
                XN xn2 = xn;
                if (xn2 != null) {
                    xn2.EYQ(jTd2);
                    xn.EYQ(2);
                }
                td.EYQ();
                IPb.EYQ(ub, (Pm) null);
            }

            @Override // com.bykv.vk.openvk.component.video.api.Kbd.EYQ.InterfaceC0064EYQ
            public void EYQ(com.bykv.vk.openvk.component.video.api.Td.Td td2, int i, String str) {
                long jTd2 = nvmEYQ.Td();
                com.bytedance.sdk.openadsdk.component.Pm.EYQ.mZx(ub, jTd2, false);
                XN xn2 = xn;
                if (xn2 != null) {
                    xn2.EYQ(jTd2);
                }
                td.EYQ(i, str);
                try {
                    if (fileEYQ.exists() && fileEYQ.isFile()) {
                        com.bytedance.sdk.component.utils.IPb.Td(fileEYQ);
                    }
                } catch (Throwable unused) {
                }
            }
        });
        if (Build.VERSION.SDK_INT < 23) {
            EYQ(new File(com.bykv.vk.openvk.component.video.api.Td.EYQ().getCacheDir(), "proxy_cache"));
            EYQ(iYK);
            long jTd2 = nvmEYQ.Td();
            com.bytedance.sdk.openadsdk.component.Pm.EYQ.mZx(ub, jTd2, true);
            if (xn != null) {
                xn.EYQ(jTd2);
                xn.EYQ(2);
            }
            td.EYQ();
            EYQ(ub, (Pm) null);
        }
    }

    public void EYQ(final com.bytedance.sdk.openadsdk.core.model.UB ub, final XN xn, final mZx mzx) {
        final Nvm nvmEYQ = Nvm.EYQ();
        final int iYK = ub.yK();
        nWX nwx = ub.Dal().get(0);
        String strVwS = nwx.VwS();
        String strEYQ = nwx.EYQ();
        int iMZx = nwx.mZx();
        int iTd = nwx.Td();
        String strEYQ2 = TextUtils.isEmpty(strVwS) ? com.bytedance.sdk.component.utils.Kbd.EYQ(strEYQ) : strVwS;
        if (TextUtils.isEmpty(strEYQ2)) {
            if (mzx != null) {
                mzx.EYQ();
                return;
            }
            return;
        }
        File fileMZx = com.bytedance.sdk.openadsdk.component.VwS.EYQ.mZx(strEYQ2);
        if (EYQ(strEYQ, strVwS)) {
            Td(iYK);
            long jTd = nvmEYQ.Td();
            if (xn != null) {
                xn.EYQ(jTd);
                xn.EYQ(1);
            }
            mzx.EYQ(null);
            return;
        }
        com.bytedance.sdk.openadsdk.utils.MxO.EYQ(new com.bytedance.sdk.openadsdk.MxO.EYQ(strEYQ, nwx.VwS()), iMZx, iTd, new MxO.EYQ() { // from class: com.bytedance.sdk.openadsdk.component.IPb.7
            @Override // com.bytedance.sdk.openadsdk.utils.MxO.EYQ
            public void EYQ(com.bytedance.sdk.openadsdk.MxO.EYQ.mZx mzx2) {
                if (mzx2.Pm()) {
                    IPb.this.Td(iYK);
                    long jTd2 = nvmEYQ.Td();
                    com.bytedance.sdk.openadsdk.component.Pm.EYQ.EYQ(ub, jTd2, true);
                    XN xn2 = xn;
                    if (xn2 != null) {
                        xn2.EYQ(jTd2);
                        xn.EYQ(2);
                    }
                    mzx.EYQ(mzx2);
                    return;
                }
                com.bytedance.sdk.openadsdk.component.Pm.EYQ.EYQ(ub, nvmEYQ.Td(), false);
                mzx.EYQ();
            }

            @Override // com.bytedance.sdk.openadsdk.utils.MxO.EYQ
            public void EYQ() {
                com.bytedance.sdk.openadsdk.component.Pm.EYQ.EYQ(ub, nvmEYQ.Td(), false);
                mzx.EYQ();
            }
        }, fileMZx.getParent());
    }

    public void EYQ(int i) {
        com.bytedance.sdk.openadsdk.multipro.Pm.Pm.EYQ("tt_openad", "video_has_cached".concat(String.valueOf(i)), Boolean.TRUE);
    }

    public boolean mZx(int i) {
        return com.bytedance.sdk.openadsdk.multipro.Pm.Pm.EYQ("tt_openad", "video_has_cached".concat(String.valueOf(i)), false);
    }

    public void Td(int i) {
        com.bytedance.sdk.openadsdk.multipro.Pm.Pm.EYQ("tt_openad", "image_has_cached".concat(String.valueOf(i)), Boolean.TRUE);
    }

    public boolean Pm(int i) {
        return com.bytedance.sdk.openadsdk.multipro.Pm.Pm.EYQ("tt_openad", "image_has_cached".concat(String.valueOf(i)), false);
    }

    public void EYQ(com.bytedance.sdk.openadsdk.component.Kbd.EYQ eyq) {
        if (eyq.mZx() != null) {
            com.bytedance.sdk.openadsdk.multipro.Pm.Pm.EYQ("tt_openad", "material_expiration_time" + eyq.EYQ(), Long.valueOf(eyq.mZx().OnO()));
            mZx(eyq);
        }
    }

    public com.bytedance.sdk.openadsdk.core.model.UB Kbd(int i) {
        long jEYQ = com.bytedance.sdk.openadsdk.multipro.Pm.Pm.EYQ("tt_openad", "material_expiration_time".concat(String.valueOf(i)), -1L);
        com.bytedance.sdk.openadsdk.core.model.UB ubIPb = IPb(i);
        if (System.currentTimeMillis() / 1000 < jEYQ && ubIPb != null) {
            return ubIPb;
        }
        if (ubIPb == null && jEYQ == -1) {
            return null;
        }
        VwS(i);
        if (ubIPb == null) {
            return null;
        }
        com.bytedance.sdk.openadsdk.component.Pm.EYQ.EYQ(ubIPb);
        return null;
    }

    public com.bytedance.sdk.openadsdk.core.model.UB IPb(int i) {
        String strTd;
        String strMZx = com.bytedance.sdk.openadsdk.multipro.Pm.Pm.mZx("tt_openad_materialMeta", "material".concat(String.valueOf(i)), null);
        if (!TextUtils.isEmpty(strMZx)) {
            try {
                strTd = com.bytedance.sdk.component.utils.EYQ.Td(new JSONObject(strMZx).optString("message"));
            } catch (JSONException e) {
                pi.EYQ("TTAppOpenAdCacheManager", e.getMessage());
                strTd = null;
            }
            if (!TextUtils.isEmpty(strTd)) {
                try {
                    com.bytedance.sdk.openadsdk.core.model.UB ubEYQ = com.bytedance.sdk.openadsdk.core.mZx.EYQ(new JSONObject(strTd));
                    if (ubEYQ != null) {
                        return ubEYQ;
                    }
                } catch (JSONException e2) {
                    pi.EYQ("TTAppOpenAdCacheManager", e2.getMessage());
                }
            }
        }
        return null;
    }

    private void mZx(com.bytedance.sdk.openadsdk.component.Kbd.EYQ eyq) {
        xt.EYQ(new EYQ(eyq), 5);
    }

    public String EYQ(com.bytedance.sdk.openadsdk.core.model.UB ub) {
        if (ub != null && ub.mN() != null && !TextUtils.isEmpty(ub.mN().MxO())) {
            String strMxO = ub.mN().MxO();
            String strNWX = ub.mN().nWX();
            if (TextUtils.isEmpty(strNWX)) {
                strNWX = com.bytedance.sdk.component.utils.Kbd.EYQ(strMxO);
            }
            File fileEYQ = com.bytedance.sdk.openadsdk.component.VwS.EYQ.EYQ(strNWX);
            if (fileEYQ.exists() && fileEYQ.isFile()) {
                return fileEYQ.getAbsolutePath();
            }
        }
        return null;
    }

    public boolean mZx(com.bytedance.sdk.openadsdk.core.model.UB ub) {
        if (ub == null || ub.Dal() == null || ub.Dal().size() == 0 || TextUtils.isEmpty(ub.Dal().get(0).EYQ())) {
            return false;
        }
        nWX nwx = ub.Dal().get(0);
        return EYQ(nwx.EYQ(), nwx.VwS());
    }

    public boolean EYQ(String str, String str2) throws IOException {
        boolean z;
        try {
            if (TextUtils.isEmpty(str2)) {
                str2 = com.bytedance.sdk.component.utils.Kbd.EYQ(str);
            }
            File fileMZx = com.bytedance.sdk.openadsdk.component.VwS.EYQ.mZx(str2);
            InputStream inputStreamEYQ = com.bytedance.sdk.openadsdk.IPb.Pm.EYQ(str, str2);
            if (inputStreamEYQ != null) {
                try {
                    inputStreamEYQ.close();
                } catch (IOException e) {
                    pi.EYQ("TTAppOpenAdCacheManager", e.getMessage());
                }
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                if (com.bytedance.sdk.openadsdk.IPb.Pm.EYQ(str, str2, fileMZx.getParent())) {
                    return true;
                }
                if (new File(fileMZx.getPath() + ".0").exists()) {
                    return true;
                }
            }
            return z;
        } catch (Exception e2) {
            pi.EYQ("TTAppOpenAdCacheManager", e2.getMessage());
            return false;
        }
    }

    public void EYQ(File file) {
        try {
            this.mZx.EYQ(file);
        } catch (IOException e) {
            pi.EYQ("TTAppOpenAdCacheManager", "trimFileCache fail", e);
        }
    }

    public void VwS(int i) {
        com.bytedance.sdk.openadsdk.multipro.Pm.Pm.EYQ("tt_openad_materialMeta", "material".concat(String.valueOf(i)));
        com.bytedance.sdk.openadsdk.multipro.Pm.Pm.EYQ("tt_openad", "material_expiration_time".concat(String.valueOf(i)));
        com.bytedance.sdk.openadsdk.multipro.Pm.Pm.EYQ("tt_openad", "video_has_cached".concat(String.valueOf(i)));
        com.bytedance.sdk.openadsdk.multipro.Pm.Pm.EYQ("tt_openad", "image_has_cached".concat(String.valueOf(i)));
    }

    public void EYQ() {
        File[] fileArrListFiles;
        try {
            com.bytedance.sdk.openadsdk.multipro.Pm.Pm.EYQ("tt_openad_materialMeta");
            com.bytedance.sdk.openadsdk.multipro.Pm.Pm.EYQ("tt_openad");
        } catch (Throwable unused) {
        }
        try {
            File cacheDir = this.Pm.getCacheDir();
            if (cacheDir == null || !cacheDir.exists() || !cacheDir.isDirectory() || (fileArrListFiles = cacheDir.listFiles(new FileFilter() { // from class: com.bytedance.sdk.openadsdk.component.IPb.8
                @Override // java.io.FileFilter
                public boolean accept(File file) {
                    if (file == null) {
                        return false;
                    }
                    String name = file.getName();
                    return name.contains("openad_image_cache") || name.contains("openad_video_cache");
                }
            })) == null) {
                return;
            }
            for (File file : fileArrListFiles) {
                try {
                    com.bytedance.sdk.component.utils.IPb.Td(file);
                } catch (Throwable unused2) {
                }
            }
        } catch (Throwable unused3) {
        }
    }

    public String mZx() {
        String name = new File(CacheDirFactory.getRootDir()).getName();
        if (com.bytedance.sdk.openadsdk.multipro.mZx.Td()) {
            return name + "/openad_image_cache/";
        }
        return name + "//openad_image_cache/";
    }

    private int Td(AdSlot adSlot) {
        long jEYQ = com.bytedance.sdk.openadsdk.multipro.Pm.Pm.EYQ("tt_openad", "material_expiration_time" + adSlot.getCodeId(), -1L);
        Integer.valueOf(jEYQ == -1 ? 0 : 1);
        return jEYQ == -1 ? 0 : 1;
    }

    /* compiled from: TTAppOpenAdCacheManager.java */
    private class EYQ extends com.bytedance.sdk.component.VwS.QQ {
        private final com.bytedance.sdk.openadsdk.component.Kbd.EYQ mZx;

        public EYQ(com.bytedance.sdk.openadsdk.component.Kbd.EYQ eyq) {
            super("App Open Ad Write Cache");
            this.mZx = eyq;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                com.bytedance.sdk.openadsdk.multipro.Pm.Pm.EYQ("tt_openad_materialMeta", "material" + this.mZx.EYQ(), com.bytedance.sdk.component.utils.EYQ.EYQ(this.mZx.mZx().aEX()).toString());
            } catch (Throwable unused) {
            }
        }
    }
}
