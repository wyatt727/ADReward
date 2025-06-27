package com.applovin.impl.sdk.network;

import android.text.TextUtils;
import com.applovin.impl.oj;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.t;
import com.applovin.impl.xl;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c extends xl {
    private final b h;
    private final t i;
    private AtomicBoolean j;
    private boolean k;

    c(b bVar, k kVar) {
        super("PersistentPostbackQueueSaveTask", kVar);
        this.j = new AtomicBoolean();
        this.k = false;
        this.h = bVar;
        this.i = kVar.L();
    }

    public List a(int i) throws Throwable {
        ArrayList arrayList = new ArrayList();
        p pVarD = this.f1179a.D();
        if (!pVarD.b("persistent_postback_cache.json", k.k())) {
            t.h("PersistentPostbackQueueSaveTask", "Postbacks queue file does not exist.");
            return arrayList;
        }
        File fileA = pVarD.a("persistent_postback_cache.json", k.k());
        String strE = pVarD.e(fileA);
        if (TextUtils.isEmpty(strE)) {
            t.h("PersistentPostbackQueueSaveTask", "Postbacks queue file has no content.");
            return arrayList;
        }
        boolean z = false;
        try {
            JSONArray jSONArray = new JSONObject(strE).getJSONArray("pb");
            if (t.a()) {
                this.i.a("PersistentPostbackQueueSaveTask", "Deserializing " + jSONArray.length() + " postback(s)...");
            }
            arrayList.ensureCapacity(Math.max(1, jSONArray.length()));
            Integer num = (Integer) this.f1179a.a(oj.V2);
            for (int i2 = 0; i2 < jSONArray.length() && arrayList.size() < i; i2++) {
                try {
                    d dVar = new d(jSONArray.getJSONObject(i2), this.f1179a);
                    if (dVar.c() < num.intValue()) {
                        arrayList.add(dVar);
                    } else {
                        t.h("PersistentPostbackQueueSaveTask", "Skipping deserialization because maximum attempt count exceeded for postback: " + dVar);
                    }
                } catch (Throwable th) {
                    t.c("PersistentPostbackQueueSaveTask", "Unable to deserialize postback from json", th);
                    this.f1179a.B().a("PersistentPostbackQueueSaveTask", "deserializePostback", th);
                }
            }
            if (t.a()) {
                this.i.a("PersistentPostbackQueueSaveTask", "Successfully loaded postback queue with " + arrayList.size() + " postback(s).");
            }
        } catch (Throwable th2) {
            try {
                t.c("PersistentPostbackQueueSaveTask", "Failed to load postback queue", th2);
                try {
                    this.f1179a.B().a("PersistentPostbackQueueSaveTask", "deserializePostbackQueue", th2);
                    if (((Boolean) this.f1179a.a(oj.h1)).booleanValue()) {
                        pVarD.a(fileA, "removeAfterDeserializationFail");
                    }
                } catch (Throwable th3) {
                    th = th3;
                    z = true;
                    if (z && ((Boolean) this.f1179a.a(oj.h1)).booleanValue()) {
                        pVarD.a(fileA, "removeAfterDeserializationFail");
                    }
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
        this.k = arrayList.isEmpty();
        return arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        a(this.h.d());
    }

    private void a(List list) {
        if (!(this.k && list.isEmpty()) && this.j.compareAndSet(false, true)) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                d dVar = (d) it.next();
                try {
                    jSONArray.put(dVar.q());
                } catch (Throwable th) {
                    t.c("PersistentPostbackQueueSaveTask", "Unable to serialize postback to JSON: " + dVar, th);
                    this.f1179a.B().a("PersistentPostbackQueueSaveTask", "serializePostback", th);
                }
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("pb", jSONArray);
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(jSONObject.toString().getBytes(C.UTF8_NAME));
                p pVarD = this.f1179a.D();
                if (pVarD.a((InputStream) byteArrayInputStream, pVarD.a("persistent_postback_cache.json", k.k()), true)) {
                    if (t.a()) {
                        this.i.a("PersistentPostbackQueueSaveTask", "Exported postback queue to disk.");
                    }
                } else if (t.a()) {
                    this.i.b("PersistentPostbackQueueSaveTask", "Unable to export postback queue to disk.");
                }
            } catch (Throwable th2) {
                t.c("PersistentPostbackQueueSaveTask", "Unable to export postbacks to disk: " + jSONArray, th2);
                this.f1179a.B().a("PersistentPostbackQueueSaveTask", "serializePostbackQueue", th2);
            }
            this.j.set(false);
        }
    }
}
