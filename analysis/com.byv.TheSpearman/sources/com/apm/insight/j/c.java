package com.apm.insight.j;

import android.os.Handler;
import android.text.TextUtils;
import com.apm.insight.i;
import com.apm.insight.l.q;

/* loaded from: classes.dex */
public class c extends a {
    c(Handler handler, long j, long j2) {
        super(handler, j, j2);
    }

    @Override // java.lang.Runnable
    public void run() {
        String str;
        if (i.c().b()) {
            return;
        }
        String strD = i.a().d();
        if (TextUtils.isEmpty(strD) || "0".equals(strD)) {
            a(c());
            str = "[DeviceIdTask] did is null, continue check.";
        } else {
            i.c().a(strD);
            str = "[DeviceIdTask] did is " + strD;
        }
        q.a((Object) str);
    }
}
