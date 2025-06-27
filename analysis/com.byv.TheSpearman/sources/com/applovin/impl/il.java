package com.applovin.impl;

import android.content.IntentFilter;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public class il {

    /* renamed from: a, reason: collision with root package name */
    private final Set f540a = new HashSet(32);
    private final Object b = new Object();

    public boolean a(String str) {
        synchronized (this.b) {
            Iterator it = this.f540a.iterator();
            while (it.hasNext()) {
                if (str.equals(((jl) it.next()).b())) {
                    return true;
                }
            }
            return false;
        }
    }

    public void b(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, String str) {
        jl jlVarA;
        if (StringUtils.isValidString(str)) {
            synchronized (this.b) {
                jlVarA = a(str, appLovinCommunicatorSubscriber);
            }
            if (jlVarA != null) {
                jlVarA.a(false);
                AppLovinBroadcastManager.unregisterReceiver(jlVarA);
            }
        }
    }

    private jl a(String str, AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber) {
        for (jl jlVar : this.f540a) {
            if (str.equals(jlVar.b()) && appLovinCommunicatorSubscriber.equals(jlVar.a())) {
                return jlVar;
            }
        }
        return null;
    }

    public boolean a(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, String str) {
        if (appLovinCommunicatorSubscriber != null && StringUtils.isValidString(str)) {
            synchronized (this.b) {
                jl jlVarA = a(str, appLovinCommunicatorSubscriber);
                if (jlVarA != null) {
                    com.applovin.impl.sdk.t.h("AppLovinCommunicator", "Attempting to re-subscribe subscriber (" + appLovinCommunicatorSubscriber + ") to topic (" + str + ")");
                    if (!jlVarA.c()) {
                        jlVarA.a(true);
                        AppLovinBroadcastManager.registerReceiver(jlVarA, new IntentFilter(str));
                    }
                    return true;
                }
                jl jlVar = new jl(str, appLovinCommunicatorSubscriber);
                this.f540a.add(jlVar);
                AppLovinBroadcastManager.registerReceiver(jlVar, new IntentFilter(str));
                return true;
            }
        }
        com.applovin.impl.sdk.t.h("AppLovinCommunicator", "Unable to subscribe - invalid subscriber (" + appLovinCommunicatorSubscriber + ") or topic (" + str + ")");
        return false;
    }
}
