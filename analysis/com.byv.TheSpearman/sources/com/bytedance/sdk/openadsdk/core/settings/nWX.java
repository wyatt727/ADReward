package com.bytedance.sdk.openadsdk.core.settings;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.hu;
import com.bytedance.sdk.openadsdk.core.settings.Pm;
import com.bytedance.sdk.openadsdk.utils.xt;
import java.io.File;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;

/* compiled from: SettingsPropRepository.java */
/* loaded from: classes2.dex */
public abstract class nWX implements Pm {
    private final String HX;
    private EYQ tp;
    private final ConcurrentHashMap<String, Object> Td = new ConcurrentHashMap<>();
    private final Object Pm = new Object();
    private final Object Kbd = new Object();
    private final CountDownLatch IPb = new CountDownLatch(1);
    private Properties VwS = new Properties();
    private volatile boolean QQ = false;

    /* compiled from: SettingsPropRepository.java */
    public interface EYQ {
        void EYQ();
    }

    public nWX(String str, EYQ eyq) {
        this.HX = str;
        this.tp = eyq;
        xt.EYQ(new com.bytedance.sdk.component.VwS.QQ("SetL_".concat(String.valueOf(str))) { // from class: com.bytedance.sdk.openadsdk.core.settings.nWX.1
            @Override // java.lang.Runnable
            public void run() {
                nWX.this.EYQ(false);
            }
        });
    }

    public String EYQ(String str, String str2) throws InterruptedException {
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        Pm();
        return this.VwS.getProperty(str, str2);
    }

    private void Pm() throws InterruptedException {
        while (!this.QQ) {
            try {
                this.IPb.await();
            } catch (InterruptedException e) {
                com.bytedance.sdk.component.utils.pi.EYQ("SdkSettings.Prop", "awaitLoadedLocked: ", e);
            }
        }
    }

    public int EYQ(String str, int i) throws InterruptedException {
        if (TextUtils.isEmpty(str)) {
            return i;
        }
        Pm();
        try {
            return Integer.parseInt(this.VwS.getProperty(str, String.valueOf(i)));
        } catch (NumberFormatException e) {
            com.bytedance.sdk.component.utils.pi.EYQ("SdkSettings.Prop", "", e);
            return i;
        }
    }

    public long EYQ(String str, long j) throws InterruptedException {
        if (TextUtils.isEmpty(str)) {
            return j;
        }
        Pm();
        try {
            return Long.parseLong(this.VwS.getProperty(str, String.valueOf(j)));
        } catch (NumberFormatException e) {
            com.bytedance.sdk.component.utils.pi.EYQ("SdkSettings.Prop", "", e);
            return j;
        }
    }

    public float EYQ(String str, float f) throws InterruptedException {
        if (TextUtils.isEmpty(str)) {
            return f;
        }
        Pm();
        try {
            return Float.parseFloat(this.VwS.getProperty(str, String.valueOf(f)));
        } catch (NumberFormatException e) {
            com.bytedance.sdk.component.utils.pi.EYQ("SdkSettings.Prop", "", e);
            return f;
        }
    }

    public boolean EYQ(String str, boolean z) throws InterruptedException {
        if (TextUtils.isEmpty(str)) {
            return z;
        }
        Pm();
        try {
            return Boolean.parseBoolean(this.VwS.getProperty(str, String.valueOf(z)));
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.pi.EYQ("SdkSettings.Prop", "", e);
            return z;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00ef A[Catch: all -> 0x00ff, TryCatch #7 {, blocks: (B:4:0x0003, B:7:0x0009, B:9:0x000b, B:11:0x0016, B:17:0x003b, B:18:0x0040, B:58:0x00eb, B:60:0x00ef, B:62:0x00f3, B:63:0x00f6, B:64:0x00fd, B:26:0x0054, B:27:0x0057, B:39:0x0072, B:40:0x0075, B:41:0x007a, B:36:0x006a, B:37:0x006d, B:42:0x007b, B:44:0x0085, B:46:0x008f, B:48:0x00a4, B:49:0x00b4, B:51:0x00ba, B:54:0x00d2, B:56:0x00dd, B:57:0x00e0, B:24:0x004b, B:34:0x0061, B:31:0x005c), top: B:76:0x0003, inners: #5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void EYQ(boolean r9) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.settings.nWX.EYQ(boolean):void");
    }

    private File Kbd() {
        return new File(hu.EYQ().getFilesDir(), this.HX);
    }

    public Pm.EYQ EYQ() {
        return new mZx();
    }

    public <T> T EYQ(String str, T t, Pm.mZx<T> mzx) throws InterruptedException {
        T tMZx;
        if (TextUtils.isEmpty(str)) {
            return t;
        }
        if (this.Td.containsKey(str)) {
            try {
                return (T) this.Td.get(str);
            } catch (Exception e) {
                com.bytedance.sdk.component.utils.pi.EYQ("SdkSettings.Prop", "", e);
                return t;
            }
        }
        Pm();
        String property = this.VwS.getProperty(str, null);
        if (property == null || mzx == null || (tMZx = mzx.mZx(property)) == null) {
            return t;
        }
        this.Td.put(str, tMZx);
        return tMZx;
    }

    public boolean mZx() {
        return this.QQ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void EYQ(Properties properties) {
        FileOutputStream fileOutputStream;
        synchronized (this.Kbd) {
            File fileKbd = Kbd();
            FileOutputStream fileOutputStream2 = null;
            try {
                try {
                    fileOutputStream = new FileOutputStream(fileKbd);
                } catch (Exception e) {
                    e = e;
                }
            } catch (Throwable th) {
                th = th;
            }
            try {
                properties.store(fileOutputStream, (String) null);
                fileKbd.getAbsolutePath();
                com.bytedance.sdk.openadsdk.utils.HX.EYQ(fileOutputStream);
            } catch (Exception e2) {
                e = e2;
                fileOutputStream2 = fileOutputStream;
                com.bytedance.sdk.component.utils.pi.EYQ("SdkSettings.Prop", "saveToLocal: ", e);
                if (fileOutputStream2 != null) {
                    com.bytedance.sdk.openadsdk.utils.HX.EYQ(fileOutputStream2);
                }
                KO.Rd();
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream2 = fileOutputStream;
                if (fileOutputStream2 != null) {
                    com.bytedance.sdk.openadsdk.utils.HX.EYQ(fileOutputStream2);
                }
                throw th;
            }
        }
        KO.Rd();
    }

    /* compiled from: SettingsPropRepository.java */
    public class mZx implements Pm.EYQ {
        private final Map<String, Object> mZx = new HashMap();
        private final Object Td = new Object();

        public mZx() {
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.Pm.EYQ
        public void EYQ() {
            Object obj;
            Properties properties = new Properties();
            synchronized (this.Td) {
                properties.putAll(nWX.this.VwS);
                boolean z = false;
                for (Map.Entry<String, Object> entry : this.mZx.entrySet()) {
                    String key = entry.getKey();
                    Object value = entry.getValue();
                    if (value == this || value == null) {
                        if (properties.containsKey(key)) {
                            properties.remove(key);
                            z = true;
                        }
                    } else if (!properties.containsKey(key) || (obj = properties.get(key)) == null || !obj.equals(value)) {
                        properties.put(key, String.valueOf(value));
                        z = true;
                    }
                }
                this.mZx.clear();
                if (z) {
                    nWX.this.EYQ(properties);
                    nWX.this.VwS = properties;
                    nWX.this.Td.clear();
                }
            }
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.Pm.EYQ
        public Pm.EYQ EYQ(String str, String str2) {
            synchronized (this.Td) {
                this.mZx.put(str, str2);
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.Pm.EYQ
        public Pm.EYQ EYQ(String str, int i) {
            synchronized (this.Td) {
                this.mZx.put(str, Integer.valueOf(i));
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.Pm.EYQ
        public Pm.EYQ EYQ(String str, long j) {
            synchronized (this.Td) {
                this.mZx.put(str, Long.valueOf(j));
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.Pm.EYQ
        public Pm.EYQ EYQ(String str) {
            synchronized (this.Td) {
                this.mZx.put(str, this);
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.Pm.EYQ
        public Pm.EYQ EYQ(String str, float f) {
            synchronized (this.Td) {
                this.mZx.put(str, Float.valueOf(f));
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.Pm.EYQ
        public Pm.EYQ EYQ(String str, boolean z) {
            synchronized (this.Td) {
                this.mZx.put(str, Boolean.valueOf(z));
            }
            return this;
        }
    }

    public void Td() {
        File fileKbd = Kbd();
        if (fileKbd.exists()) {
            fileKbd.delete();
        }
    }
}
