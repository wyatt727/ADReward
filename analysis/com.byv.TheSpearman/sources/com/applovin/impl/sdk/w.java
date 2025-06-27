package com.applovin.impl.sdk;

import android.adservices.measurement.MeasurementManager;
import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.GetTopicsResponse;
import android.adservices.topics.Topic;
import android.adservices.topics.TopicsManager;
import android.content.Context;
import android.net.Uri;
import android.os.OutcomeReceiver;
import android.text.TextUtils;
import android.view.InputEvent;
import com.applovin.impl.kn;
import com.applovin.impl.oj;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sm;
import com.applovin.impl.th;
import com.json.i5;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class w {

    /* renamed from: a, reason: collision with root package name */
    private final k f987a;
    private final Executor b;
    private final MeasurementManager e;
    private final TopicsManager h;
    private final Set c = new HashSet();
    private final Object d = new Object();
    private final AtomicReference f = new AtomicReference(new JSONArray());
    private final d g = new d(this, null);

    class a implements OutcomeReceiver {
        a() {
        }

        @Override // android.os.OutcomeReceiver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onError(Exception exc) {
            w.this.f987a.L();
            if (t.a()) {
                w.this.f987a.L().a("PrivacySandboxService", "Failed to register impression", exc);
            }
        }

        @Override // android.os.OutcomeReceiver
        public void onResult(Object obj) {
            w.this.f987a.L();
            if (t.a()) {
                w.this.f987a.L().a("PrivacySandboxService", "Successfully registered impression");
            }
        }
    }

    class b implements OutcomeReceiver {
        b() {
        }

        @Override // android.os.OutcomeReceiver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onError(Exception exc) {
            w.this.f987a.L();
            if (t.a()) {
                w.this.f987a.L().a("PrivacySandboxService", "Failed to register click", exc);
            }
        }

        @Override // android.os.OutcomeReceiver
        public void onResult(Object obj) {
            w.this.f987a.L();
            if (t.a()) {
                w.this.f987a.L().a("PrivacySandboxService", "Successfully registered click");
            }
        }
    }

    class c implements OutcomeReceiver {
        c() {
        }

        @Override // android.os.OutcomeReceiver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onError(Exception exc) {
            w.this.f987a.L();
            if (t.a()) {
                w.this.f987a.L().a("PrivacySandboxService", "Failed to register conversion", exc);
            }
        }

        @Override // android.os.OutcomeReceiver
        public void onResult(Object obj) {
            w.this.f987a.L();
            if (t.a()) {
                w.this.f987a.L().a("PrivacySandboxService", "Successfully registered conversion");
            }
        }
    }

    private class d implements OutcomeReceiver {
        private d() {
        }

        @Override // android.os.OutcomeReceiver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResult(GetTopicsResponse getTopicsResponse) throws JSONException {
            List<Topic> topics = getTopicsResponse.getTopics();
            int size = topics.size();
            w.this.f987a.L();
            if (t.a()) {
                w.this.f987a.L().d("PrivacySandboxService", size + " topic(s) received");
            }
            JSONArray jSONArray = new JSONArray();
            for (Topic topic : topics) {
                JSONObject jSONObject = new JSONObject();
                JsonUtils.putInt(jSONObject, "id", topic.getTopicId());
                JsonUtils.putLong(jSONObject, i5.u, topic.getModelVersion());
                JsonUtils.putLong(jSONObject, "taxonomy", topic.getTaxonomyVersion());
                jSONArray.put(jSONObject);
            }
            w.this.f.set(jSONArray);
            w.this.b(((Boolean) w.this.f987a.a(oj.C6)).booleanValue(), ((Long) w.this.f987a.a(oj.A6)).longValue());
        }

        /* synthetic */ d(w wVar, a aVar) {
            this();
        }

        @Override // android.os.OutcomeReceiver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onError(Exception exc) {
            String str;
            Long l = (Long) w.this.f987a.a(oj.B6);
            boolean z = l.longValue() == -1;
            w.this.f987a.L();
            if (t.a()) {
                t tVarL = w.this.f987a.L();
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to retrieve topics");
                if (z) {
                    str = "";
                } else {
                    str = ", retrying in " + l + " ms";
                }
                sb.append(str);
                tVarL.a("PrivacySandboxService", sb.toString(), exc);
            }
            if (z) {
                return;
            }
            w.this.b(((Boolean) w.this.f987a.a(oj.D6)).booleanValue(), l.longValue());
        }
    }

    protected w(k kVar) {
        this.f987a = kVar;
        this.b = kVar.l0().a();
        Context contextK = k.k();
        this.e = (MeasurementManager) contextK.getSystemService(MeasurementManager.class);
        this.h = (TopicsManager) contextK.getSystemService(TopicsManager.class);
        if (((Boolean) kVar.a(oj.z6)).booleanValue()) {
            b(((Boolean) kVar.a(oj.C6)).booleanValue(), 0L);
        }
    }

    private boolean c(String str) {
        synchronized (this.d) {
            if (this.c.contains(str)) {
                return false;
            }
            this.c.add(str);
            return true;
        }
    }

    public void b(final List list) {
        a("register impression", new Runnable() { // from class: com.applovin.impl.sdk.w$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(list);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(List list) {
        if (list == null || list.isEmpty() || this.e == null || !th.e(k.B0)) {
            return;
        }
        this.f987a.L();
        if (t.a()) {
            this.f987a.L().a("PrivacySandboxService", "Registering impression...");
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.e.registerSource(Uri.parse((String) it.next()), null, this.b, new a());
        }
    }

    public void b(final List list, final InputEvent inputEvent) {
        a("register click", new Runnable() { // from class: com.applovin.impl.sdk.w$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(list, inputEvent);
            }
        });
    }

    public void b(final String str) {
        a("register conversion trigger event", new Runnable() { // from class: com.applovin.impl.sdk.w$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final boolean z, final long j) {
        a("retrieve topics", new Runnable() { // from class: com.applovin.impl.sdk.w$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(z, j);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(List list, InputEvent inputEvent) {
        if (list == null || list.isEmpty() || this.e == null || !th.e(k.B0)) {
            return;
        }
        this.f987a.L();
        if (t.a()) {
            this.f987a.L().a("PrivacySandboxService", "Registering click...");
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.e.registerSource(Uri.parse((String) it.next()), inputEvent, this.b, new b());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str) {
        if (TextUtils.isEmpty(str) || this.e == null || !th.e(k.B0)) {
            return;
        }
        this.f987a.L();
        if (t.a()) {
            this.f987a.L().a("PrivacySandboxService", "Registering conversion: " + str);
        }
        this.e.registerTrigger(Uri.parse(str), this.b, new c());
    }

    public JSONArray a() {
        return (JSONArray) this.f.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(boolean z, long j) {
        if (this.h == null) {
            return;
        }
        final GetTopicsRequest getTopicsRequestBuild = new GetTopicsRequest.Builder().setShouldRecordObservation(z).setAdsSdkName("AppLovin").build();
        if (j > 0) {
            this.f987a.l0().a(new kn(this.f987a, true, "getTopics", new Runnable() { // from class: com.applovin.impl.sdk.w$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.a(getTopicsRequestBuild);
                }
            }), sm.b.OTHER, j);
        } else {
            this.h.getTopics(getTopicsRequestBuild, this.b, this.g);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(GetTopicsRequest getTopicsRequest) {
        this.h.getTopics(getTopicsRequest, this.b, this.g);
    }

    private void a(String str, Runnable runnable) {
        try {
            this.f987a.L();
            if (t.a()) {
                this.f987a.L().a("PrivacySandboxService", "Running operation: " + str);
            }
            runnable.run();
        } catch (Throwable th) {
            this.f987a.L();
            if (t.a()) {
                this.f987a.L().a("PrivacySandboxService", "Failed to run operation: " + str, th);
            }
            if (c(str)) {
                this.f987a.B().a("PrivacySandboxService", str, th);
            }
        }
    }
}
