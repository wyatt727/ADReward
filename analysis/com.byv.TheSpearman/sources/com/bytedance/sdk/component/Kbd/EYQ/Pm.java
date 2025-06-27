package com.bytedance.sdk.component.Kbd.EYQ;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.Uc;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: EventMultiUtils.java */
/* loaded from: classes2.dex */
public class Pm {
    public static final Pm EYQ = new Pm();

    public void EYQ(EYQ eyq, Context context) {
        mZx(eyq, context);
        QQ.VwS().EYQ(context);
        QQ.VwS().EYQ(eyq.tp());
        QQ.VwS().mZx(eyq.VwS());
        QQ.VwS().Td(eyq.QQ());
        QQ.VwS().EYQ(eyq.mZx());
        QQ.VwS().Pm(eyq.HX());
        QQ.VwS().Kbd(eyq.IPb());
        QQ.VwS().EYQ(eyq.EYQ() == null ? com.bytedance.sdk.component.Kbd.EYQ.EYQ.EYQ.Kbd.EYQ : eyq.EYQ());
        QQ.VwS().mZx(eyq.MxO());
        QQ.VwS().EYQ(eyq.Pm());
        QQ.VwS().EYQ(eyq.Td());
        QQ.VwS().EYQ(eyq.Kbd());
        com.bytedance.sdk.component.Kbd.EYQ.mZx.Td.Td.EYQ(eyq.pi());
        com.bytedance.sdk.component.Kbd.EYQ.mZx.Td.Td.mZx(eyq.tsL());
        EYQ(eyq);
    }

    private void EYQ(EYQ eyq) {
        Executor executorKbd;
        if (Looper.myLooper() != Looper.getMainLooper() && com.bytedance.sdk.component.Kbd.EYQ.Td.EYQ.mZx()) {
            com.bytedance.sdk.component.Kbd.EYQ.Td.EYQ.EYQ();
            return;
        }
        Kbd kbdPm = eyq.Pm();
        if (kbdPm == null || !com.bytedance.sdk.component.Kbd.EYQ.Td.EYQ.mZx() || (executorKbd = kbdPm.Kbd()) == null) {
            return;
        }
        executorKbd.execute(new Runnable() { // from class: com.bytedance.sdk.component.Kbd.EYQ.Pm.1
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.component.Kbd.EYQ.Td.EYQ.EYQ();
            }
        });
    }

    public void EYQ(boolean z) {
        QQ.VwS().EYQ(z);
    }

    private void mZx(EYQ eyq, Context context) {
        Td.EYQ(context, "context == null");
        Td.EYQ(eyq, "AdLogConfig == null");
        Td.EYQ(eyq.Pm(), "AdLogDepend ==null");
    }

    private boolean EYQ(Context context, Kbd kbd) {
        if (context == null || kbd == null) {
            return false;
        }
        if (kbd.IPb() == 2) {
            return true;
        }
        if (kbd.IPb() == 1) {
            return kbd.nWX();
        }
        try {
            return Uc.EYQ(context);
        } catch (Throwable th) {
            th.getMessage();
            return true;
        }
    }

    public void EYQ() {
        final Kbd kbdHu = QQ.VwS().hu();
        if (kbdHu == null || QQ.VwS().IPb() == null || kbdHu.Pm() == null) {
            return;
        }
        if (QQ.VwS().mZx()) {
            if (EYQ(QQ.VwS().IPb(), kbdHu)) {
                QQ.VwS().HX();
                return;
            } else if (Td()) {
                kbdHu.Pm().execute(new com.bytedance.sdk.component.Kbd.EYQ.Kbd.Kbd("start") { // from class: com.bytedance.sdk.component.Kbd.EYQ.Pm.2
                    @Override // java.lang.Runnable
                    public void run() {
                        Pm.this.EYQ(kbdHu.IPb());
                    }
                });
                return;
            } else {
                EYQ(kbdHu.IPb());
                return;
            }
        }
        QQ.VwS().HX();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void EYQ(int i) {
        if (i == 0) {
            com.bytedance.sdk.component.Kbd.EYQ.mZx.mZx.EYQ.EYQ();
        } else if (i == 1) {
            com.bytedance.sdk.component.Kbd.EYQ.mZx.mZx.mZx.EYQ();
        }
    }

    public void mZx() {
        final Kbd kbdHu = QQ.VwS().hu();
        if (kbdHu == null || QQ.VwS().IPb() == null || kbdHu.Pm() == null) {
            return;
        }
        if (QQ.VwS().mZx()) {
            if (EYQ(QQ.VwS().IPb(), kbdHu)) {
                QQ.VwS().MxO();
                return;
            } else if (Td()) {
                kbdHu.Pm().execute(new com.bytedance.sdk.component.Kbd.EYQ.Kbd.Kbd("stop") { // from class: com.bytedance.sdk.component.Kbd.EYQ.Pm.3
                    @Override // java.lang.Runnable
                    public void run() {
                        Pm.this.mZx(kbdHu.IPb());
                    }
                });
                return;
            } else {
                mZx(kbdHu.IPb());
                return;
            }
        }
        QQ.VwS().MxO();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mZx(int i) {
        if (i == 0) {
            com.bytedance.sdk.component.Kbd.EYQ.mZx.mZx.EYQ.mZx();
        } else if (i == 1) {
            com.bytedance.sdk.component.Kbd.EYQ.mZx.mZx.mZx.mZx();
        }
    }

    public void EYQ(com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ eyq) {
        mZx(eyq);
    }

    private boolean Td() {
        return Thread.currentThread() == Looper.getMainLooper().getThread();
    }

    private void mZx(final com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ eyq) {
        final Kbd kbdHu = QQ.VwS().hu();
        if (eyq == null || kbdHu == null || QQ.VwS().IPb() == null || kbdHu.Pm() == null) {
            return;
        }
        if (QQ.VwS().mZx()) {
            if (EYQ(QQ.VwS().IPb(), kbdHu)) {
                QQ.VwS().EYQ(eyq);
                return;
            }
            Td();
            if (Td()) {
                kbdHu.Pm().execute(new com.bytedance.sdk.component.Kbd.EYQ.Kbd.Kbd("dispatchEvent") { // from class: com.bytedance.sdk.component.Kbd.EYQ.Pm.4
                    @Override // java.lang.Runnable
                    public void run() {
                        Pm.this.EYQ(eyq, kbdHu.IPb());
                    }
                });
                return;
            } else {
                EYQ(eyq, kbdHu.IPb());
                return;
            }
        }
        QQ.VwS().EYQ(eyq);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void EYQ(com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ eyq, int i) {
        if (i == 0) {
            com.bytedance.sdk.component.Kbd.EYQ.mZx.mZx.EYQ.EYQ(eyq);
        } else if (i == 1) {
            com.bytedance.sdk.component.Kbd.EYQ.mZx.mZx.mZx.EYQ(eyq);
        }
    }

    public void EYQ(final String str, final List<String> list, final boolean z, Map<String, String> map, final int i, final String str2) {
        final Kbd kbdHu = QQ.VwS().hu();
        if (kbdHu == null || QQ.VwS().IPb() == null || kbdHu.Pm() == null) {
            return;
        }
        if (kbdHu.QQ()) {
            if (kbdHu.IPb() == 1) {
                if (list == null || list.isEmpty()) {
                    return;
                }
            } else if (kbdHu.IPb() == 0 && (TextUtils.isEmpty(str) || list == null || list.isEmpty())) {
                return;
            }
            if (QQ.VwS().mZx() && !EYQ(QQ.VwS().IPb(), kbdHu)) {
                if (Td()) {
                    kbdHu.Pm().execute(new com.bytedance.sdk.component.Kbd.EYQ.Kbd.Kbd("trackFailed") { // from class: com.bytedance.sdk.component.Kbd.EYQ.Pm.5
                        @Override // java.lang.Runnable
                        public void run() {
                            Pm.this.EYQ(str, (List<String>) list, z, kbdHu.IPb(), i, str2);
                        }
                    });
                    return;
                } else {
                    EYQ(str, list, z, kbdHu.IPb(), i, str2);
                    return;
                }
            }
            QQ.VwS().EYQ(str, list, z, map, i, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void EYQ(String str, List<String> list, boolean z, int i, int i2, String str2) {
        if (i == 0) {
            com.bytedance.sdk.component.Kbd.EYQ.mZx.mZx.EYQ.EYQ(str, list, z);
        } else if (i == 1) {
            com.bytedance.sdk.component.Kbd.EYQ.mZx.mZx.mZx.EYQ(str, list, z, i2, str2);
        }
    }

    public void EYQ(final String str, final boolean z) {
        final Kbd kbdHu = QQ.VwS().hu();
        if (kbdHu == null || QQ.VwS().IPb() == null || kbdHu.Pm() == null || !kbdHu.QQ()) {
            return;
        }
        if (kbdHu.IPb() == 0 && TextUtils.isEmpty(str)) {
            return;
        }
        if (!QQ.VwS().mZx() || EYQ(QQ.VwS().IPb(), kbdHu)) {
            QQ.VwS().EYQ(str, z);
        } else if (Td()) {
            kbdHu.Pm().execute(new com.bytedance.sdk.component.Kbd.EYQ.Kbd.Kbd("trackFailed") { // from class: com.bytedance.sdk.component.Kbd.EYQ.Pm.6
                @Override // java.lang.Runnable
                public void run() {
                    Pm.this.EYQ(str, kbdHu.IPb(), z);
                }
            });
        } else {
            EYQ(str, kbdHu.IPb(), z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void EYQ(String str, int i, boolean z) {
        if (i == 0) {
            com.bytedance.sdk.component.Kbd.EYQ.mZx.mZx.EYQ.EYQ(str);
        } else if (i == 1) {
            com.bytedance.sdk.component.Kbd.EYQ.mZx.mZx.mZx.EYQ(str, z);
        }
    }
}
