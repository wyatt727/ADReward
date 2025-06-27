package com.bytedance.sdk.component.VwS;

import android.os.SystemClock;
import com.bytedance.sdk.component.utils.pi;
import com.google.android.exoplayer2.C;
import com.json.t2;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: DelegateRunnable.java */
/* loaded from: classes2.dex */
class mZx implements Comparable, Runnable {
    private QQ EYQ;
    private Thread Pm = null;
    private long Td;
    private EYQ mZx;

    public mZx(QQ qq, EYQ eyq) {
        this.EYQ = null;
        this.mZx = null;
        this.Td = 0L;
        this.EYQ = qq;
        this.mZx = eyq;
        this.Td = SystemClock.uptimeMillis();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // java.lang.Runnable
    public void run() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        long j = jUptimeMillis - this.Td;
        this.Pm = Thread.currentThread();
        QQ qq = this.EYQ;
        if (qq != null) {
            qq.run();
        }
        long jUptimeMillis2 = SystemClock.uptimeMillis() - jUptimeMillis;
        if (this.mZx != null) {
            Pm.EYQ();
        }
        if (pi.EYQ()) {
            EYQ eyq = this.mZx;
            if (eyq != null) {
                eyq.EYQ();
            }
            Long.valueOf(j);
            Long.valueOf(jUptimeMillis2);
            QQ qq2 = this.EYQ;
            if (qq2 != null) {
                qq2.getName();
            }
            String strEYQ = this.mZx.EYQ();
            strEYQ.hashCode();
            char c = 65535;
            switch (strEYQ.hashCode()) {
                case 3107:
                    if (strEYQ.equals("ad")) {
                        c = 0;
                        break;
                    }
                    break;
                case 3366:
                    if (strEYQ.equals("io")) {
                        c = 1;
                        break;
                    }
                    break;
                case 107332:
                    if (strEYQ.equals("log")) {
                        c = 2;
                        break;
                    }
                    break;
                case 3237136:
                    if (strEYQ.equals(t2.a.e)) {
                        c = 3;
                        break;
                    }
                    break;
                case 212371911:
                    if (strEYQ.equals("computation")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            String name = AbstractJsonLexerKt.NULL;
            switch (c) {
                case 0:
                case 3:
                    if (jUptimeMillis2 > 2000) {
                        EYQ eyq2 = this.mZx;
                        String strEYQ2 = eyq2 != null ? eyq2.EYQ() : AbstractJsonLexerKt.NULL;
                        QQ qq3 = this.EYQ;
                        if (qq3 != null) {
                            name = qq3.getName();
                        }
                        EYQ(strEYQ2, name, jUptimeMillis2);
                        break;
                    }
                    break;
                case 1:
                    if (jUptimeMillis2 > 5000) {
                        EYQ eyq3 = this.mZx;
                        String strEYQ3 = eyq3 != null ? eyq3.EYQ() : AbstractJsonLexerKt.NULL;
                        QQ qq4 = this.EYQ;
                        if (qq4 != null) {
                            name = qq4.getName();
                        }
                        EYQ(strEYQ3, name, jUptimeMillis2);
                        break;
                    }
                    break;
                case 2:
                    if (jUptimeMillis2 > C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS) {
                        EYQ eyq4 = this.mZx;
                        String strEYQ4 = eyq4 != null ? eyq4.EYQ() : AbstractJsonLexerKt.NULL;
                        QQ qq5 = this.EYQ;
                        if (qq5 != null) {
                            name = qq5.getName();
                        }
                        EYQ(strEYQ4, name, jUptimeMillis2);
                        break;
                    }
                    break;
                case 4:
                    if (jUptimeMillis2 > 1000) {
                        EYQ eyq5 = this.mZx;
                        String strEYQ5 = eyq5 != null ? eyq5.EYQ() : AbstractJsonLexerKt.NULL;
                        QQ qq6 = this.EYQ;
                        if (qq6 != null) {
                            name = qq6.getName();
                        }
                        EYQ(strEYQ5, name, jUptimeMillis2);
                        break;
                    }
                    break;
            }
        }
    }

    private void EYQ(String str, String str2, long j) {
        pi.EYQ("DelegateRunnable", "pool is " + str + "  name is " + str2 + "is timeout,cost " + j);
    }

    public QQ EYQ() {
        return this.EYQ;
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        if (obj instanceof mZx) {
            return this.EYQ.compareTo(((mZx) obj).EYQ());
        }
        return 0;
    }

    public int hashCode() {
        return this.EYQ.hashCode();
    }

    public boolean equals(Object obj) {
        QQ qq;
        return (obj instanceof mZx) && (qq = this.EYQ) != null && qq.equals(((mZx) obj).EYQ());
    }
}
