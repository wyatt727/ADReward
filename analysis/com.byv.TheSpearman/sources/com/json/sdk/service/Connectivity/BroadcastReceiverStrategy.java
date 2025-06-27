package com.json.sdk.service.Connectivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import com.json.q2;
import com.json.x5;
import com.json.y5;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class BroadcastReceiverStrategy implements x5 {

    /* renamed from: a, reason: collision with root package name */
    private final y5 f2278a;
    private BroadcastReceiver b = new BroadcastReceiver() { // from class: com.ironsource.sdk.service.Connectivity.BroadcastReceiverStrategy.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String strB = q2.b(context);
            if (strB.equals("none")) {
                BroadcastReceiverStrategy.this.f2278a.a();
            } else {
                BroadcastReceiverStrategy.this.f2278a.a(strB, new JSONObject());
            }
        }
    };

    public BroadcastReceiverStrategy(y5 y5Var) {
        this.f2278a = y5Var;
    }

    @Override // com.json.x5
    public void a() {
        this.b = null;
    }

    @Override // com.json.x5
    public void a(Context context) {
        try {
            context.unregisterReceiver(this.b);
        } catch (IllegalArgumentException unused) {
        } catch (Exception e) {
            Log.e("ContentValues", "unregisterConnectionReceiver - " + e);
        }
    }

    @Override // com.json.x5
    public void b(Context context) {
        try {
            context.registerReceiver(this.b, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.json.x5
    public JSONObject c(Context context) {
        return new JSONObject();
    }
}
