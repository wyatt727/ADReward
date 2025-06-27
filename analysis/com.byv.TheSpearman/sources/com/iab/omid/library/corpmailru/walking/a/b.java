package com.iab.omid.library.corpmailru.walking.a;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class b extends AsyncTask<Object, Void, String> {

    /* renamed from: a, reason: collision with root package name */
    private a f1543a;
    protected final InterfaceC0217b d;

    public interface a {
        void a(b bVar);
    }

    /* renamed from: com.iab.omid.library.corpmailru.walking.a.b$b, reason: collision with other inner class name */
    public interface InterfaceC0217b {
        void a(JSONObject jSONObject);

        JSONObject b();
    }

    public b(InterfaceC0217b interfaceC0217b) {
        this.d = interfaceC0217b;
    }

    public void a(a aVar) {
        this.f1543a = aVar;
    }

    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        a aVar = this.f1543a;
        if (aVar != null) {
            aVar.a(this);
        }
    }

    public void a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
