package com.my.tracker.obfuscated;

import android.app.Application;
import com.my.tracker.plugins.MyTrackerPlugin;
import com.my.tracker.plugins.MyTrackerPluginConfig;
import com.my.tracker.plugins.PluginEventTracker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public final class p0 {

    /* renamed from: a, reason: collision with root package name */
    private final List<MyTrackerPlugin> f4247a = new ArrayList();
    private final AtomicBoolean b = new AtomicBoolean();
    private final PluginEventTracker c;
    private final Application d;

    private p0(PluginEventTracker pluginEventTracker, Application application) {
        this.c = pluginEventTracker;
        this.d = application;
    }

    public static p0 a(p pVar, Application application) {
        return new p0(PluginEventTracker.newTracker(pVar), application);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MyTrackerPluginConfig myTrackerPluginConfig = (MyTrackerPluginConfig) it.next();
            String pluginName = myTrackerPluginConfig.getPluginName();
            z0.c("PluginHandler: initializing plugin " + pluginName);
            try {
                MyTrackerPlugin myTrackerPlugin = (MyTrackerPlugin) Class.forName(myTrackerPluginConfig.getPluginClass()).newInstance();
                myTrackerPlugin.init(myTrackerPluginConfig, this.c, this.d);
                this.f4247a.add(myTrackerPlugin);
                z0.c("PluginHandler: plugin " + pluginName + " is initialized");
            } catch (Throwable th) {
                z0.b("PluginHandler: exception occurred while initialization plugin " + pluginName, th);
            }
        }
    }

    public void a(final List<MyTrackerPluginConfig> list) {
        if (this.b.compareAndSet(false, true)) {
            g.a(new Runnable() { // from class: com.my.tracker.obfuscated.p0$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.b(list);
                }
            });
        } else {
            z0.a("PluginHandler: instance has already been initialized");
        }
    }
}
