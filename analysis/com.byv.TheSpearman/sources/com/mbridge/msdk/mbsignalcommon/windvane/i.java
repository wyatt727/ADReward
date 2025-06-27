package com.mbridge.msdk.mbsignalcommon.windvane;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.mbridge.msdk.mbsignalcommon.c.a;
import java.util.regex.Pattern;

/* compiled from: WindVaneSignalCommunication.java */
/* loaded from: classes4.dex */
public final class i implements Handler.Callback, c {

    /* renamed from: a, reason: collision with root package name */
    protected Pattern f3191a;
    protected String b;
    protected Context d;
    protected WindVaneWebView e;
    protected final int c = 1;
    protected Handler f = new Handler(Looper.getMainLooper(), this);

    public i(Context context) {
        this.d = context;
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.c
    public final void a(WindVaneWebView windVaneWebView) {
        this.e = windVaneWebView;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    @Override // com.mbridge.msdk.mbsignalcommon.windvane.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.lang.String r8) {
        /*
            r7 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 == 0) goto L7
            return
        L7:
            r0 = 2
            r1 = 0
            r2 = 1
            if (r8 != 0) goto Ld
            goto L6c
        Ld:
            com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView r3 = r7.e
            com.mbridge.msdk.mbsignalcommon.windvane.a r3 = com.mbridge.msdk.mbsignalcommon.mraid.c.a(r3, r8)
            if (r3 == 0) goto L1a
            com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView r8 = r7.e
            r3.b = r8
            goto L6d
        L1a:
            java.util.regex.Pattern r3 = r7.f3191a
            java.util.regex.Matcher r8 = r3.matcher(r8)
            boolean r3 = r8.matches()
            if (r3 == 0) goto L6c
            com.mbridge.msdk.mbsignalcommon.windvane.a r3 = new com.mbridge.msdk.mbsignalcommon.windvane.a
            r3.<init>()
            int r4 = r8.groupCount()
            r5 = 5
            if (r4 < r5) goto L38
            java.lang.String r5 = r8.group(r5)
            r3.f = r5
        L38:
            r5 = 3
            if (r4 < r5) goto L6c
            java.lang.String r4 = r8.group(r2)
            r3.d = r4
            java.lang.String r4 = r8.group(r0)
            r3.g = r4
            java.lang.String r8 = r8.group(r5)
            r3.e = r8
            java.util.HashMap<java.lang.String, java.lang.String> r8 = com.mbridge.msdk.mbsignalcommon.base.e.k
            if (r8 == 0) goto L67
            java.util.HashMap<java.lang.String, java.lang.String> r8 = com.mbridge.msdk.mbsignalcommon.base.e.k
            java.lang.String r4 = r3.e
            boolean r8 = r8.containsKey(r4)
            if (r8 == 0) goto L67
            java.util.HashMap<java.lang.String, java.lang.String> r8 = com.mbridge.msdk.mbsignalcommon.base.e.k
            java.lang.String r4 = r3.e
            java.lang.Object r8 = r8.get(r4)
            java.lang.String r8 = (java.lang.String) r8
            r3.e = r8
        L67:
            com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView r8 = r7.e
            r3.b = r8
            goto L6d
        L6c:
            r3 = r1
        L6d:
            if (r3 != 0) goto L70
            return
        L70:
            com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView r8 = r3.b
            if (r8 != 0) goto L75
            goto L7d
        L75:
            com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView r8 = r3.b
            java.lang.String r1 = r3.d
            java.lang.Object r1 = r8.getJsObject(r1)
        L7d:
            if (r1 != 0) goto L80
            goto Lc9
        L80:
            android.content.Context r8 = r7.d     // Catch: java.lang.Exception -> Lc0 com.mbridge.msdk.mbsignalcommon.c.a.b.C0278a -> Lc5
            java.lang.ClassLoader r8 = r8.getClassLoader()     // Catch: java.lang.Exception -> Lc0 com.mbridge.msdk.mbsignalcommon.c.a.b.C0278a -> Lc5
            java.lang.Class r4 = r1.getClass()     // Catch: java.lang.Exception -> Lc0 com.mbridge.msdk.mbsignalcommon.c.a.b.C0278a -> Lc5
            java.lang.String r4 = r4.getName()     // Catch: java.lang.Exception -> Lc0 com.mbridge.msdk.mbsignalcommon.c.a.b.C0278a -> Lc5
            com.mbridge.msdk.mbsignalcommon.c.a$c r8 = com.mbridge.msdk.mbsignalcommon.c.a.a(r8, r4)     // Catch: java.lang.Exception -> Lc0 com.mbridge.msdk.mbsignalcommon.c.a.b.C0278a -> Lc5
            java.lang.String r4 = r3.e     // Catch: java.lang.Exception -> Lc0 com.mbridge.msdk.mbsignalcommon.c.a.b.C0278a -> Lc5
            java.lang.Class[] r0 = new java.lang.Class[r0]     // Catch: java.lang.Exception -> Lc0 com.mbridge.msdk.mbsignalcommon.c.a.b.C0278a -> Lc5
            r5 = 0
            java.lang.Class<java.lang.Object> r6 = java.lang.Object.class
            r0[r5] = r6     // Catch: java.lang.Exception -> Lc0 com.mbridge.msdk.mbsignalcommon.c.a.b.C0278a -> Lc5
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r0[r2] = r5     // Catch: java.lang.Exception -> Lc0 com.mbridge.msdk.mbsignalcommon.c.a.b.C0278a -> Lc5
            com.mbridge.msdk.mbsignalcommon.c.a$d r8 = r8.a(r4, r0)     // Catch: java.lang.Exception -> Lc0 com.mbridge.msdk.mbsignalcommon.c.a.b.C0278a -> Lc5
            r8.a()     // Catch: java.lang.Exception -> Lc0 com.mbridge.msdk.mbsignalcommon.c.a.b.C0278a -> Lc5
            if (r1 == 0) goto Lc9
            boolean r0 = r1 instanceof com.mbridge.msdk.mbsignalcommon.windvane.h     // Catch: java.lang.Exception -> Lc0 com.mbridge.msdk.mbsignalcommon.c.a.b.C0278a -> Lc5
            if (r0 == 0) goto Lc9
            r3.c = r1     // Catch: java.lang.Exception -> Lc0 com.mbridge.msdk.mbsignalcommon.c.a.b.C0278a -> Lc5
            r3.f3187a = r8     // Catch: java.lang.Exception -> Lc0 com.mbridge.msdk.mbsignalcommon.c.a.b.C0278a -> Lc5
            r3.c = r1     // Catch: java.lang.Exception -> Lc0 com.mbridge.msdk.mbsignalcommon.c.a.b.C0278a -> Lc5
            android.os.Message r8 = android.os.Message.obtain()     // Catch: java.lang.Exception -> Lc0 com.mbridge.msdk.mbsignalcommon.c.a.b.C0278a -> Lc5
            r8.what = r2     // Catch: java.lang.Exception -> Lc0 com.mbridge.msdk.mbsignalcommon.c.a.b.C0278a -> Lc5
            r8.obj = r3     // Catch: java.lang.Exception -> Lc0 com.mbridge.msdk.mbsignalcommon.c.a.b.C0278a -> Lc5
            android.os.Handler r0 = r7.f     // Catch: java.lang.Exception -> Lc0 com.mbridge.msdk.mbsignalcommon.c.a.b.C0278a -> Lc5
            r0.sendMessage(r8)     // Catch: java.lang.Exception -> Lc0 com.mbridge.msdk.mbsignalcommon.c.a.b.C0278a -> Lc5
            goto Lc9
        Lc0:
            r8 = move-exception
            r8.printStackTrace()
            goto Lc9
        Lc5:
            r8 = move-exception
            r8.printStackTrace()
        Lc9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.mbsignalcommon.windvane.i.b(java.lang.String):void");
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        a aVar = (a) message.obj;
        if (aVar == null) {
            return false;
        }
        try {
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (message.what != 1) {
            return false;
        }
        Object obj = aVar.c;
        a.d dVar = aVar.f3187a;
        if (dVar != null && obj != null) {
            Object[] objArr = new Object[2];
            objArr[0] = aVar;
            objArr[1] = TextUtils.isEmpty(aVar.f) ? JsonUtils.EMPTY_JSON : aVar.f;
            dVar.a(obj, objArr);
        }
        return true;
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.c
    public final boolean a(String str) {
        if (!j.a(str)) {
            return false;
        }
        this.f3191a = j.b(str);
        this.b = str;
        return true;
    }
}
