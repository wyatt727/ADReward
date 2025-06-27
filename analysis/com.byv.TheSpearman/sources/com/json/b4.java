package com.json;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.json.sdk.utils.Logger;

/* loaded from: classes4.dex */
public class b4 extends Handler {
    private static final String b = "DownloadHandler";

    /* renamed from: a, reason: collision with root package name */
    db f1702a;

    public b4(Looper looper) {
        super(looper);
    }

    public void a() {
        this.f1702a = null;
    }

    public void a(db dbVar) {
        if (dbVar == null) {
            throw new IllegalArgumentException();
        }
        this.f1702a = dbVar;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        db dbVar = this.f1702a;
        if (dbVar == null) {
            Logger.i(b, "OnPreCacheCompletion listener is null, msg: " + message.toString());
            return;
        }
        try {
            int i = message.what;
            if (i == 1016) {
                dbVar.a((o7) message.obj);
            } else {
                this.f1702a.a((o7) message.obj, new g7(i, be.a(i)));
            }
        } catch (Throwable th) {
            Logger.i(b, "handleMessage | Got exception: " + th.getMessage());
            th.printStackTrace();
        }
    }
}
