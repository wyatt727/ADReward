package com.bytedance.sdk.openadsdk.core.video.mZx;

import android.text.TextUtils;
import android.webkit.WebResourceResponse;
import com.bytedance.sdk.component.VwS.QQ;
import com.bytedance.sdk.component.utils.IPb;
import com.bytedance.sdk.component.utils.KO;
import com.bytedance.sdk.component.utils.Kbd;
import com.bytedance.sdk.component.utils.lEs;
import com.bytedance.sdk.component.utils.pi;
import com.bytedance.sdk.openadsdk.core.hu;
import com.bytedance.sdk.openadsdk.core.model.UB;
import com.bytedance.sdk.openadsdk.utils.xt;
import com.json.m4;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: PlayableCache.java */
/* loaded from: classes2.dex */
public class EYQ {
    private static volatile EYQ EYQ;
    private String mZx;
    private final Map<UB, mZx> Td = Collections.synchronizedMap(new HashMap());
    private final Map<String, JSONObject> Pm = Collections.synchronizedMap(new HashMap());
    private final AtomicBoolean Kbd = new AtomicBoolean(false);
    private final Set<String> IPb = Collections.synchronizedSet(new HashSet());
    private final Map<String, String> VwS = Collections.synchronizedMap(new HashMap());

    /* compiled from: PlayableCache.java */
    /* renamed from: com.bytedance.sdk.openadsdk.core.video.mZx.EYQ$EYQ, reason: collision with other inner class name */
    public interface InterfaceC0128EYQ {
    }

    public static EYQ EYQ() {
        if (EYQ == null) {
            synchronized (EYQ.class) {
                if (EYQ == null) {
                    EYQ = new EYQ();
                }
            }
        }
        return EYQ;
    }

    private EYQ() {
    }

    public boolean EYQ(UB ub) {
        if (this.Kbd.get() && ub != null && ub.mN() != null && ub.mN().pi() != null) {
            try {
                String strEYQ = Kbd.EYQ(ub.mN().pi());
                if (this.Pm.get(strEYQ) == null) {
                    return false;
                }
                return IPb(new File(Td(), strEYQ));
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    public void mZx() {
        if (this.Kbd.get()) {
            return;
        }
        xt.EYQ(new QQ("PlayableCache_init") { // from class: com.bytedance.sdk.openadsdk.core.video.mZx.EYQ.1
            @Override // java.lang.Runnable
            public void run() {
                File[] fileArrListFiles;
                try {
                    String strTd = EYQ.this.Td();
                    if (!TextUtils.isEmpty(strTd)) {
                        File file = new File(strTd);
                        if (file.exists() && file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
                            for (File file2 : fileArrListFiles) {
                                if (file2 != null) {
                                    try {
                                        File fileTd = EYQ.this.Td(file2);
                                        if (fileTd != null && fileTd.exists()) {
                                            EYQ.this.VwS.put(file2.getName(), fileTd.getAbsolutePath());
                                        }
                                        EYQ.this.EYQ(EYQ.this.EYQ(fileTd), true);
                                    } catch (Throwable unused) {
                                    }
                                }
                            }
                        }
                    }
                } catch (Throwable unused2) {
                }
                EYQ.this.Kbd.set(true);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject EYQ(File file, boolean z) {
        byte[] bArrPm;
        String strMZx;
        try {
            if (!mZx(file) || (bArrPm = IPb.Pm(file)) == null || bArrPm.length <= 0) {
                return null;
            }
            if (TextUtils.equals(file.getName(), "tt_open_ad_sdk_check_res.dat")) {
                strMZx = com.bytedance.sdk.component.utils.EYQ.Td(new String(bArrPm));
            } else {
                strMZx = com.bytedance.sdk.component.Td.EYQ.mZx(new String(bArrPm), com.bytedance.sdk.openadsdk.core.EYQ.mZx());
            }
            if (TextUtils.isEmpty(strMZx)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(strMZx);
            if (z && jSONObject.length() > 0) {
                this.Pm.put(file.getParentFile().getName(), jSONObject);
            }
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public File EYQ(File file) {
        File file2 = new File(file, "tt_open_ad_sdk_check_res.dat");
        return mZx(file2) ? file2 : new File(file, "tt_open_ad_sdk_check_res.dat");
    }

    private boolean mZx(File file) {
        return file != null && file.exists() && file.isFile() && file.canRead();
    }

    public WebResourceResponse EYQ(String str, String str2, String str3) {
        File fileTd;
        try {
        } catch (Throwable th) {
            pi.EYQ("PlayableCache", "playable intercept error: ", th);
        }
        if (this.Kbd.get() && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            try {
                if ((str3.startsWith("http://") || str3.startsWith("https://")) && str3.contains("?")) {
                    str3 = str3.split("\\?")[0];
                    if (str3.endsWith("/")) {
                        str3 = str3.substring(0, str3.length() - 1);
                    }
                }
            } catch (Throwable unused) {
            }
            String strEYQ = KO.EYQ(hu.EYQ(), str3);
            if (TextUtils.isEmpty(strEYQ)) {
                return null;
            }
            String strEYQ2 = Kbd.EYQ(str);
            if (TextUtils.isEmpty(strEYQ2)) {
                return null;
            }
            String str4 = this.VwS.get(strEYQ2);
            if (!TextUtils.isEmpty(str4)) {
                fileTd = new File(str4);
            } else {
                fileTd = Td(new File(Td(), strEYQ2));
                if (fileTd != null && fileTd.exists()) {
                    this.VwS.put(strEYQ2, fileTd.getAbsolutePath());
                }
            }
            if (fileTd != null && fileTd.exists()) {
                String strEYQ3 = EYQ(str2);
                if (TextUtils.isEmpty(strEYQ3)) {
                    return null;
                }
                String strReplace = str3.replace(strEYQ3, "");
                if (!TextUtils.isEmpty(strReplace) && !strReplace.startsWith("https://") && !strReplace.startsWith("http://")) {
                    File file = new File(fileTd, strReplace);
                    if (file.exists() && EYQ(strEYQ2, strReplace, file) && file.getCanonicalPath().startsWith(fileTd.getCanonicalPath())) {
                        return new WebResourceResponse(strEYQ, m4.M, new FileInputStream(file));
                    }
                }
            }
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public File Td(File file) {
        File[] fileArrListFiles;
        if (file != null && file.isDirectory() && (fileArrListFiles = file.listFiles()) != null && fileArrListFiles.length != 0) {
            for (File file2 : fileArrListFiles) {
                if (file2 != null && file2.isFile() && "index.html".equals(file2.getName())) {
                    return file;
                }
            }
            for (File file3 : fileArrListFiles) {
                if (file3 != null && file3.isDirectory()) {
                    return Td(file3);
                }
            }
        }
        return null;
    }

    private String EYQ(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] strArrSplit = str.split("\\?");
        if (strArrSplit != null && strArrSplit.length == 2) {
            if (strArrSplit[0] != null && strArrSplit[0].endsWith("/")) {
                str = str.substring(0, strArrSplit.length - 1);
            }
            if (strArrSplit[0] != null && strArrSplit[0].endsWith("index.html")) {
                str = strArrSplit[0];
            }
        }
        return str.replace("index.html", "");
    }

    private boolean EYQ(String str, String str2, File file) {
        if (file != null && file.exists()) {
            JSONObject jSONObject = this.Pm.get(str);
            if (jSONObject == null) {
                return true;
            }
            String strOptString = jSONObject.optString(str2);
            if (strOptString != null && strOptString.equalsIgnoreCase(Kbd.EYQ(file))) {
                return true;
            }
        }
        return false;
    }

    public void EYQ(final UB ub, final InterfaceC0128EYQ interfaceC0128EYQ) {
        File file;
        if (ub == null || ub.mN() == null || TextUtils.isEmpty(ub.mN().pi())) {
            com.bytedance.sdk.openadsdk.core.video.mZx.mZx.EYQ(ub, -701, (String) null);
            EYQ(interfaceC0128EYQ, false);
            return;
        }
        final String strPi = ub.mN().pi();
        if (this.IPb.contains(strPi)) {
            return;
        }
        this.Td.put(ub, new mZx().EYQ(System.currentTimeMillis()));
        com.bytedance.sdk.openadsdk.core.video.mZx.mZx.EYQ(ub);
        String strEYQ = Kbd.EYQ(strPi);
        final File file2 = new File(Td(), strEYQ);
        String str = this.VwS.get(strEYQ);
        if (TextUtils.isEmpty(str)) {
            file = Td(file2);
            if (file != null && file.exists()) {
                this.VwS.put(strEYQ, file.getAbsolutePath());
            }
        } else {
            file = new File(str);
        }
        if (file != null && file.exists()) {
            com.bytedance.sdk.openadsdk.core.video.mZx.mZx.EYQ(ub, -702, (String) null);
            Kbd(file2);
            this.Td.remove(ub);
            EYQ(interfaceC0128EYQ, true);
            return;
        }
        try {
            IPb.Td(file2);
        } catch (Throwable unused) {
        }
        this.IPb.add(strPi);
        File file3 = new File(Pm(), strEYQ + ".zip");
        com.bytedance.sdk.component.IPb.mZx.EYQ eyqPm = com.bytedance.sdk.openadsdk.MxO.Td.EYQ().mZx().Pm();
        eyqPm.EYQ(strPi);
        eyqPm.EYQ(file3.getParent(), file3.getName());
        eyqPm.EYQ(new com.bytedance.sdk.component.IPb.EYQ.EYQ() { // from class: com.bytedance.sdk.openadsdk.core.video.mZx.EYQ.2
            @Override // com.bytedance.sdk.component.IPb.EYQ.EYQ
            public void EYQ(com.bytedance.sdk.component.IPb.mZx.Td td, final com.bytedance.sdk.component.IPb.mZx mzx) {
                EYQ.this.IPb.remove(strPi);
                final mZx mzx2 = (mZx) EYQ.this.Td.remove(ub);
                if (mzx2 != null) {
                    mzx2.mZx(System.currentTimeMillis());
                }
                if (mzx.IPb() && mzx.Kbd() != null && mzx.Kbd().exists()) {
                    xt.mZx(new QQ("downloadZip") { // from class: com.bytedance.sdk.openadsdk.core.video.mZx.EYQ.2.1
                        @Override // java.lang.Runnable
                        public void run() {
                            long jMZx;
                            boolean z = true;
                            try {
                                mZx mzx3 = mzx2;
                                if (mzx3 != null) {
                                    mzx3.Td(System.currentTimeMillis());
                                }
                                lEs.EYQ(mzx.Kbd().getAbsolutePath(), file2.getAbsolutePath());
                                mZx mzx4 = mzx2;
                                if (mzx4 != null) {
                                    mzx4.Pm(System.currentTimeMillis());
                                }
                                mZx mzx5 = mzx2;
                                long jEYQ = 0;
                                if (mzx5 != null) {
                                    jEYQ = mzx5.EYQ();
                                    jMZx = mzx2.mZx();
                                } else {
                                    jMZx = 0;
                                }
                                com.bytedance.sdk.openadsdk.core.video.mZx.mZx.EYQ(ub, jEYQ, jMZx);
                                EYQ.this.Pm(file2);
                                try {
                                    File fileTd = EYQ.this.Td(file2);
                                    if (fileTd != null && fileTd.exists()) {
                                        EYQ.this.VwS.put(file2.getName(), fileTd.getAbsolutePath());
                                    }
                                    EYQ.this.EYQ(EYQ.this.EYQ(fileTd), true);
                                } catch (Throwable unused2) {
                                }
                            } catch (Throwable th) {
                                pi.EYQ("PlayableCache", "unzip error: ", th);
                                com.bytedance.sdk.openadsdk.core.video.mZx.mZx.EYQ(ub, -704, th.getMessage());
                                z = false;
                            }
                            try {
                                mzx.Kbd().delete();
                            } catch (Throwable unused3) {
                            }
                            EYQ.this.EYQ(interfaceC0128EYQ, z);
                        }
                    });
                } else {
                    com.bytedance.sdk.openadsdk.core.video.mZx.mZx.EYQ(ub, mzx.EYQ() != 0 ? mzx.EYQ() : -700, (String) null);
                    EYQ.this.EYQ(interfaceC0128EYQ, false);
                }
            }

            @Override // com.bytedance.sdk.component.IPb.EYQ.EYQ
            public void EYQ(com.bytedance.sdk.component.IPb.mZx.Td td, IOException iOException) {
                EYQ.this.IPb.remove(strPi);
                EYQ.this.Td.remove(ub);
                com.bytedance.sdk.openadsdk.core.video.mZx.mZx.EYQ(ub, -700, iOException.getMessage());
                EYQ.this.EYQ(interfaceC0128EYQ, false);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void EYQ(final InterfaceC0128EYQ interfaceC0128EYQ, final boolean z) {
        xt.EYQ(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.mZx.EYQ.3
            @Override // java.lang.Runnable
            public void run() {
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Pm(File file) {
        Kbd(file);
        try {
            com.bytedance.sdk.openadsdk.core.QQ.mZx().nWX().EYQ(file);
        } catch (Throwable unused) {
        }
    }

    private void Kbd(File file) {
        try {
            if (!file.exists() || file.setLastModified(System.currentTimeMillis())) {
                return;
            }
            file.renameTo(file);
            file.lastModified();
        } catch (Throwable unused) {
        }
    }

    private boolean IPb(File file) {
        String[] list;
        if (file == null || !file.isDirectory() || (list = file.list()) == null || list.length <= 0) {
            return false;
        }
        return Arrays.asList(list).contains("index.html");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String Td() {
        File file = new File(Pm(), "games");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getAbsolutePath();
    }

    private String Pm() {
        if (TextUtils.isEmpty(this.mZx)) {
            try {
                File file = new File(hu.EYQ().getCacheDir(), "playable");
                if (!file.exists()) {
                    file.mkdirs();
                }
                this.mZx = file.getAbsolutePath();
            } catch (Throwable th) {
                pi.EYQ("PlayableCache", "init root path error: ".concat(String.valueOf(th)));
            }
        }
        return this.mZx;
    }

    /* compiled from: PlayableCache.java */
    private static class mZx {
        long EYQ;
        long Pm;
        long Td;
        long mZx;

        private mZx() {
        }

        public long EYQ() {
            return this.mZx - this.EYQ;
        }

        public long mZx() {
            return this.Pm - this.Td;
        }

        public mZx EYQ(long j) {
            this.EYQ = j;
            return this;
        }

        public mZx mZx(long j) {
            this.mZx = j;
            return this;
        }

        public mZx Td(long j) {
            this.Td = j;
            return this;
        }

        public mZx Pm(long j) {
            this.Pm = j;
            return this;
        }
    }
}
