package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.hu;
import com.bytedance.sdk.openadsdk.core.model.UB;
import com.bytedance.sdk.openadsdk.core.model.zF;
import com.bytedance.sdk.openadsdk.utils.FH;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: FullScreenVideoCache.java */
/* loaded from: classes2.dex */
class Pm {
    private static volatile Pm EYQ;
    private final Map<UB, Long> Pm = Collections.synchronizedMap(new HashMap());
    private final pi Td;
    private final Context mZx;

    /* compiled from: FullScreenVideoCache.java */
    interface EYQ<T> {
        void EYQ(boolean z, T t);
    }

    public void EYQ(String str) {
        this.Td.Pm(str);
    }

    public void EYQ() {
        File[] fileArrListFiles;
        File file;
        File[] fileArrListFiles2;
        try {
            boolean z = Build.VERSION.SDK_INT >= 19 && com.bytedance.sdk.openadsdk.core.QQ.Kbd("sp_full_screen_video");
            String str = z ? "files" : "shared_prefs";
            if (Build.VERSION.SDK_INT >= 24) {
                file = new File(this.mZx.getDataDir(), str);
            } else {
                file = new File(this.mZx.getDatabasePath("1").getParentFile().getParentFile(), str);
            }
            if (file.exists() && file.isDirectory() && (fileArrListFiles2 = file.listFiles(new FileFilter() { // from class: com.bytedance.sdk.openadsdk.component.reward.Pm.1
                @Override // java.io.FileFilter
                public boolean accept(File file2) {
                    if (file2 != null) {
                        return file2.getName().contains("sp_full_screen_video");
                    }
                    return false;
                }
            })) != null) {
                for (File file2 : fileArrListFiles2) {
                    if (z) {
                        try {
                            com.bytedance.sdk.component.utils.IPb.Td(file2);
                        } catch (Throwable unused) {
                        }
                    } else {
                        String strReplace = file2.getName().replace(".xml", "");
                        if (Build.VERSION.SDK_INT >= 24) {
                            this.mZx.deleteSharedPreferences(strReplace);
                        } else {
                            this.mZx.getSharedPreferences(strReplace, 0).edit().clear().apply();
                            com.bytedance.sdk.component.utils.IPb.Td(file2);
                        }
                    }
                }
            }
        } catch (Throwable unused2) {
        }
        try {
            File cacheDir = this.mZx.getCacheDir();
            if (cacheDir == null || !cacheDir.exists() || !cacheDir.isDirectory() || (fileArrListFiles = cacheDir.listFiles(new FileFilter() { // from class: com.bytedance.sdk.openadsdk.component.reward.Pm.2
                @Override // java.io.FileFilter
                public boolean accept(File file3) {
                    if (file3 != null) {
                        return file3.getName().contains("full_screen_video_cache");
                    }
                    return false;
                }
            })) == null) {
                return;
            }
            for (File file3 : fileArrListFiles) {
                try {
                    com.bytedance.sdk.component.utils.IPb.Td(file3);
                } catch (Throwable unused3) {
                }
            }
        } catch (Throwable unused4) {
        }
    }

    public void EYQ(AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.EYQ eyq) {
        if (eyq == null || adSlot == null || !TextUtils.isEmpty(adSlot.getBidAdm())) {
            return;
        }
        try {
            this.Td.EYQ(adSlot.getCodeId(), eyq.MxO().toString());
        } catch (Throwable unused) {
        }
    }

    public static Pm EYQ(Context context) {
        if (EYQ == null) {
            synchronized (Pm.class) {
                if (EYQ == null) {
                    EYQ = new Pm(context);
                }
            }
        }
        return EYQ;
    }

    private Pm(Context context) {
        this.mZx = context == null ? hu.EYQ() : context.getApplicationContext();
        this.Td = new pi("sp_full_screen_video");
    }

    public String EYQ(UB ub) {
        if (ub == null || ub.mN() == null || TextUtils.isEmpty(ub.mN().MxO())) {
            return null;
        }
        return EYQ(ub.mN().MxO(), ub.mN().nWX(), ub.Cia());
    }

    public String EYQ(String str, String str2, int i) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = com.bytedance.sdk.component.utils.Kbd.EYQ(str);
        }
        File fileEYQ = EYQ(str2, i);
        if (fileEYQ == null || !fileEYQ.exists() || !fileEYQ.isFile() || fileEYQ.length() <= 0) {
            return null;
        }
        return fileEYQ.getAbsolutePath();
    }

    public com.bytedance.sdk.openadsdk.core.model.EYQ mZx(String str) {
        com.bytedance.sdk.openadsdk.core.model.EYQ eyqMZx;
        long jMZx = this.Td.mZx(str);
        boolean zTd = this.Td.Td(str);
        if ((System.currentTimeMillis() - jMZx < 10500000) && !zTd) {
            try {
                String strEYQ = this.Td.EYQ(str);
                if (!TextUtils.isEmpty(strEYQ)) {
                    JSONObject jSONObject = new JSONObject(strEYQ);
                    if (jSONObject.has("creatives")) {
                        eyqMZx = com.bytedance.sdk.openadsdk.core.model.EYQ.mZx(jSONObject);
                    } else {
                        UB ubEYQ = com.bytedance.sdk.openadsdk.core.mZx.EYQ(jSONObject);
                        com.bytedance.sdk.openadsdk.core.model.EYQ eyq = new com.bytedance.sdk.openadsdk.core.model.EYQ();
                        eyq.EYQ(ubEYQ);
                        eyqMZx = eyq;
                    }
                    if (eyqMZx != null && eyqMZx.Pm()) {
                        Iterator<UB> it = eyqMZx.Td().iterator();
                        while (it.hasNext()) {
                            if (!mZx(it.next())) {
                                it.remove();
                            }
                        }
                        if (eyqMZx.Pm()) {
                            return eyqMZx;
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    private boolean mZx(UB ub) {
        if (ub != null) {
            if (zF.MxO(ub)) {
                return true;
            }
            com.bykv.vk.openvk.component.video.api.Td.mZx mzxMN = ub.mN();
            if (mzxMN != null) {
                return Build.VERSION.SDK_INT >= 23 || !TextUtils.isEmpty(EYQ(mzxMN.MxO(), mzxMN.nWX(), ub.Cia()));
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void EYQ(final boolean z, final UB ub, final long j, String str) {
        Long lRemove = this.Pm.remove(ub);
        final long jElapsedRealtime = lRemove == null ? 0L : SystemClock.elapsedRealtime() - lRemove.longValue();
        final String str2 = z ? "load_video_success" : "load_video_error";
        final String str3 = (z || str == null) ? null : str;
        com.bytedance.sdk.openadsdk.tp.Td.EYQ(str2, false, new com.bytedance.sdk.openadsdk.tp.mZx() { // from class: com.bytedance.sdk.openadsdk.component.reward.Pm.3
            @Override // com.bytedance.sdk.openadsdk.tp.mZx
            public com.bytedance.sdk.openadsdk.tp.EYQ.mZx getLogStats() throws Exception {
                return com.bytedance.sdk.openadsdk.tp.EYQ.Td.mZx().EYQ(str2).mZx(FH.EYQ(z, ub, jElapsedRealtime, j, str3).toString());
            }
        });
    }

    public void EYQ(final UB ub, final EYQ<Object> eyq) {
        this.Pm.put(ub, Long.valueOf(SystemClock.elapsedRealtime()));
        if (ub.mN() == null || TextUtils.isEmpty(ub.mN().MxO())) {
            if (eyq != null) {
                eyq.EYQ(false, null);
            }
            EYQ(false, ub, -1L, null);
        } else {
            String strMxO = ub.mN().MxO();
            File fileEYQ = EYQ(ub.mN().nWX(), ub.Cia());
            com.bytedance.sdk.component.IPb.mZx.EYQ eyqPm = com.bytedance.sdk.openadsdk.MxO.Td.EYQ().mZx().Pm();
            eyqPm.EYQ(strMxO);
            eyqPm.EYQ(fileEYQ.getParent(), fileEYQ.getName());
            eyqPm.EYQ(new com.bytedance.sdk.component.IPb.EYQ.EYQ() { // from class: com.bytedance.sdk.openadsdk.component.reward.Pm.4
                @Override // com.bytedance.sdk.component.IPb.EYQ.EYQ
                public void EYQ(com.bytedance.sdk.component.IPb.mZx.Td td, com.bytedance.sdk.component.IPb.mZx mzx) {
                    if (mzx.IPb() && mzx.Kbd() != null && mzx.Kbd().exists()) {
                        EYQ eyq2 = eyq;
                        if (eyq2 != null) {
                            eyq2.EYQ(true, null);
                        }
                        Pm.this.EYQ(true, ub, mzx.EYQ(), mzx.mZx());
                        return;
                    }
                    EYQ eyq3 = eyq;
                    if (eyq3 != null) {
                        eyq3.EYQ(false, null);
                    }
                    Pm.this.EYQ(false, ub, mzx.EYQ(), mzx.mZx());
                }

                @Override // com.bytedance.sdk.component.IPb.EYQ.EYQ
                public void EYQ(com.bytedance.sdk.component.IPb.mZx.Td td, IOException iOException) {
                    EYQ eyq2 = eyq;
                    if (eyq2 != null) {
                        eyq2.EYQ(false, null);
                    }
                    Pm.this.EYQ(false, ub, -2L, iOException.getMessage());
                }
            });
        }
    }

    private File EYQ(String str, int i) {
        return new File(CacheDirFactory.getICacheDir(i).EYQ(), str);
    }
}
