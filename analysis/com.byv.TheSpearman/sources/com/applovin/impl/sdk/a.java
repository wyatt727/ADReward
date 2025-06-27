package com.applovin.impl.sdk;

import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.h8;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class a implements AppLovinBroadcastManager.Receiver {
    private static final long f = TimeUnit.SECONDS.toMillis(2);

    /* renamed from: a, reason: collision with root package name */
    private final k f914a;
    private final t b;
    private final HashSet c = new HashSet();
    private final Object d = new Object();

    /* renamed from: com.applovin.impl.sdk.a$a, reason: collision with other inner class name */
    public interface InterfaceC0042a {
        void onAdExpired(h8 h8Var);
    }

    public a(k kVar) {
        this.f914a = kVar;
        this.b = kVar.L();
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            a();
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            b();
        }
    }

    public void a(h8 h8Var) {
        synchronized (this.d) {
            b bVarB = b(h8Var);
            if (bVarB != null) {
                if (t.a()) {
                    this.b.a("AdExpirationManager", "Cancelling expiration timer for ad: " + h8Var);
                }
                bVarB.a();
                a(bVarB);
            }
        }
    }

    private b b(h8 h8Var) {
        synchronized (this.d) {
            if (h8Var == null) {
                return null;
            }
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                b bVar = (b) it.next();
                if (h8Var == bVar.b()) {
                    return bVar;
                }
            }
            return null;
        }
    }

    private void b() {
        HashSet hashSet = new HashSet();
        synchronized (this.d) {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                b bVar = (b) it.next();
                h8 h8VarB = bVar.b();
                if (h8VarB == null) {
                    hashSet.add(bVar);
                } else {
                    long timeToLiveMillis = h8VarB.getTimeToLiveMillis();
                    if (timeToLiveMillis <= 0) {
                        if (t.a()) {
                            this.b.a("AdExpirationManager", "Ad expired while app was paused. Preparing to notify listener for ad: " + h8VarB);
                        }
                        hashSet.add(bVar);
                    } else {
                        if (t.a()) {
                            this.b.a("AdExpirationManager", "Rescheduling expiration with remaining " + TimeUnit.MILLISECONDS.toSeconds(timeToLiveMillis) + " seconds for ad: " + h8VarB);
                        }
                        bVar.a(timeToLiveMillis);
                    }
                }
            }
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            b bVar2 = (b) it2.next();
            a(bVar2);
            bVar2.d();
        }
    }

    public boolean a(h8 h8Var, InterfaceC0042a interfaceC0042a) {
        synchronized (this.d) {
            if (b(h8Var) != null) {
                if (t.a()) {
                    this.b.a("AdExpirationManager", "Ad expiration already scheduled for ad: " + h8Var);
                }
                return true;
            }
            if (h8Var.getTimeToLiveMillis() <= f) {
                if (t.a()) {
                    this.b.a("AdExpirationManager", "Ad has already expired: " + h8Var);
                }
                h8Var.setExpired();
                return false;
            }
            if (t.a()) {
                this.b.a("AdExpirationManager", "Scheduling ad expiration " + TimeUnit.MILLISECONDS.toSeconds(h8Var.getTimeToLiveMillis()) + " seconds from now for " + h8Var + "...");
            }
            if (this.c.isEmpty()) {
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
            }
            this.c.add(b.a(h8Var, interfaceC0042a, this.f914a));
            return true;
        }
    }

    public void a(b bVar) {
        synchronized (this.d) {
            this.c.remove(bVar);
            if (this.c.isEmpty()) {
                AppLovinBroadcastManager.unregisterReceiver(this);
            }
        }
    }

    private void a() {
        synchronized (this.d) {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                ((b) it.next()).a();
            }
        }
    }
}
