package com.pgl.ssdk;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;

/* loaded from: classes4.dex */
public class G {
    private static G c;

    /* renamed from: a, reason: collision with root package name */
    private Context f4289a;
    private List b = new ArrayList();

    private G(Context context) {
        this.f4289a = null;
        this.f4289a = context;
    }

    public static G a(Context context) {
        if (c == null) {
            synchronized (G.class) {
                if (c == null) {
                    c = new G(context);
                }
            }
        }
        return c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0046, code lost:
    
        r1 = (r1 * 10000) + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a() {
        /*
            r6 = this;
            r0 = 0
            monitor-enter(r6)     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L52
            android.content.Context r1 = r6.f4289a     // Catch: java.lang.Throwable -> L4c
            android.content.IntentFilter r2 = new android.content.IntentFilter     // Catch: java.lang.Throwable -> L4c
            java.lang.String r3 = "android.intent.action.BATTERY_CHANGED"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L4c
            r3 = 0
            android.content.Intent r1 = r1.registerReceiver(r3, r2)     // Catch: java.lang.Throwable -> L4c
            if (r1 != 0) goto L14
            r1 = r0
            goto L1a
        L14:
            java.lang.String r2 = "plugged"
            int r1 = r1.getIntExtra(r2, r0)     // Catch: java.lang.Throwable -> L4c
        L1a:
            android.content.Context r2 = r6.f4289a     // Catch: java.lang.Throwable -> L4a
            android.content.IntentFilter r4 = new android.content.IntentFilter     // Catch: java.lang.Throwable -> L4a
            java.lang.String r5 = "android.intent.action.BATTERY_CHANGED"
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L4a
            android.content.Intent r2 = r2.registerReceiver(r3, r4)     // Catch: java.lang.Throwable -> L4a
            if (r2 != 0) goto L2a
            goto L45
        L2a:
            java.lang.String r3 = "level"
            int r3 = r2.getIntExtra(r3, r0)     // Catch: java.lang.Throwable -> L4a
            java.lang.String r4 = "scale"
            int r2 = r2.getIntExtra(r4, r0)     // Catch: java.lang.Throwable -> L4a
            float r3 = (float) r3     // Catch: java.lang.Throwable -> L4a
            float r2 = (float) r2     // Catch: java.lang.Throwable -> L4a
            float r3 = r3 / r2
            r2 = 1120403456(0x42c80000, float:100.0)
            float r3 = r3 * r2
            r2 = 1092616192(0x41200000, float:10.0)
            float r3 = r3 * r2
            int r2 = java.lang.Math.round(r3)     // Catch: java.lang.Throwable -> L4a
            int r0 = r2 / 10
        L45:
            monitor-exit(r6)
            int r1 = r1 * 10000
            int r1 = r1 + r0
            goto L56
        L4a:
            r2 = move-exception
            goto L4e
        L4c:
            r2 = move-exception
            r1 = r0
        L4e:
            monitor-exit(r6)
            throw r2     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L53
        L50:
            r0 = move-exception
            throw r0
        L52:
            r1 = r0
        L53:
            int r1 = r1 * 10000
            int r1 = r1 + r0
        L56:
            r0 = -1
            if (r1 != r0) goto L5a
            return
        L5a:
            java.util.List r0 = r6.b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            java.util.List r0 = r6.b     // Catch: java.lang.Throwable -> L81
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L81
            r1 = 20
            if (r0 <= r1) goto L81
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L81
            java.util.List r2 = r6.b     // Catch: java.lang.Throwable -> L81
            int r3 = r0 + (-10)
            java.util.List r0 = r2.subList(r3, r0)     // Catch: java.lang.Throwable -> L81
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L81
            java.util.List r0 = r6.b     // Catch: java.lang.Throwable -> L81
            r0.clear()     // Catch: java.lang.Throwable -> L81
            r6.b = r1     // Catch: java.lang.Throwable -> L81
        L81:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pgl.ssdk.G.a():void");
    }

    public synchronized String b() {
        if (this.b.size() <= 0) {
            return "-1";
        }
        return String.valueOf(((Integer) this.b.get(r0.size() - 1)).intValue() % 10000);
    }

    public synchronized String c() {
        return new JSONArray((Collection) this.b).toString();
    }
}
