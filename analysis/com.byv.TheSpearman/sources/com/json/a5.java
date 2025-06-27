package com.json;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes4.dex */
public class a5 extends Handler {

    /* renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap<String, db> f1696a;

    public a5(Looper looper) {
        super(looper);
        this.f1696a = new ConcurrentHashMap<>();
    }

    private boolean a(int i) {
        return i == 1016 || i == 1015;
    }

    void a(String str, db dbVar) {
        if (str == null || dbVar == null) {
            return;
        }
        this.f1696a.put(str, dbVar);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        try {
            o7 o7Var = (o7) message.obj;
            String path = o7Var.getPath();
            db dbVar = this.f1696a.get(path);
            if (dbVar == null) {
                return;
            }
            if (a(message.what)) {
                dbVar.a(o7Var);
            } else {
                int i = message.what;
                dbVar.a(o7Var, new g7(i, be.a(i)));
            }
            this.f1696a.remove(path);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
