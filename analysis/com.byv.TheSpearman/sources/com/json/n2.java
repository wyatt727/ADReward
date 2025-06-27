package com.json;

import android.content.Context;
import android.os.Build;
import com.json.sdk.service.Connectivity.BroadcastReceiverStrategy;
import com.json.sdk.utils.Logger;
import com.json.t2;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class n2 implements y5 {

    /* renamed from: a, reason: collision with root package name */
    private x5 f2027a;

    protected n2(JSONObject jSONObject, Context context) {
        this.f2027a = a(jSONObject, context);
        Logger.i("n2", "created ConnectivityAdapter with strategy " + this.f2027a.getClass().getSimpleName());
    }

    private x5 a(JSONObject jSONObject, Context context) {
        if (jSONObject.optInt(t2.i.f0) == 1) {
            return new BroadcastReceiverStrategy(this);
        }
        return (Build.VERSION.SDK_INT < 23 || !p0.c(context, "android.permission.ACCESS_NETWORK_STATE")) ? new BroadcastReceiverStrategy(this) : new oa(this);
    }

    public JSONObject a(Context context) {
        return this.f2027a.c(context);
    }

    @Override // com.json.y5
    public void a() {
    }

    @Override // com.json.y5
    public void a(String str, JSONObject jSONObject) {
    }

    public void b() {
        this.f2027a.a();
    }

    public void b(Context context) {
        this.f2027a.b(context);
    }

    @Override // com.json.y5
    public void b(String str, JSONObject jSONObject) {
    }

    public void c(Context context) {
        this.f2027a.a(context);
    }
}
