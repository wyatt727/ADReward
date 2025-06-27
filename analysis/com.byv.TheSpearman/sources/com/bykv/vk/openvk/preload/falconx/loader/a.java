package com.bykv.vk.openvk.preload.falconx.loader;

import android.content.Context;
import android.text.TextUtils;
import com.bykv.vk.openvk.preload.geckox.f.b;
import com.bykv.vk.openvk.preload.geckox.g.c;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import java.io.File;
import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: GeckoResLoader.java */
/* loaded from: classes2.dex */
public final class a implements ILoader {

    /* renamed from: a, reason: collision with root package name */
    public b f1383a;
    public AtomicBoolean b = new AtomicBoolean(false);

    public a(Context context, String str, File file) {
        if (context == null) {
            throw new RuntimeException("context == null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new RuntimeException("access key empty");
        }
        if (file == null) {
            throw new RuntimeException("resRootDir == null");
        }
        this.f1383a = new b(context, str, file);
    }

    @Override // com.bykv.vk.openvk.preload.falconx.loader.ILoader
    public final InputStream getInputStream(String str) throws Exception {
        if (this.b.get()) {
            throw new RuntimeException("released!");
        }
        GeckoLogger.d("WebOffline-falcon", "GeckoResLoader ready to load, file:", str);
        b bVar = this.f1383a;
        if (bVar.b.get()) {
            throw new RuntimeException("released");
        }
        if (TextUtils.isEmpty(str)) {
            throw new RuntimeException("relativePath empty");
        }
        com.bykv.vk.openvk.preload.geckox.f.a aVarA = bVar.a(str.trim());
        return aVarA.a(aVarA.b).a(com.bykv.vk.openvk.preload.geckox.f.a.a(aVarA.b, str));
    }

    @Override // com.bykv.vk.openvk.preload.falconx.loader.ILoader
    public final boolean exist(String str) throws Exception {
        if (this.b.get()) {
            throw new RuntimeException("released!");
        }
        b bVar = this.f1383a;
        if (bVar.b.get()) {
            throw new RuntimeException("released");
        }
        if (TextUtils.isEmpty(str)) {
            throw new RuntimeException("relativePath empty");
        }
        com.bykv.vk.openvk.preload.geckox.f.a aVarA = bVar.a(str.trim());
        return aVarA.a(aVarA.b).b(com.bykv.vk.openvk.preload.geckox.f.a.a(aVarA.b, str));
    }

    @Override // com.bykv.vk.openvk.preload.falconx.loader.ILoader
    public final String getResRootDir() {
        return this.f1383a.c;
    }

    @Override // com.bykv.vk.openvk.preload.falconx.loader.ILoader
    public final Map<String, Long> getChannelVersion() {
        return this.f1383a.a();
    }

    @Override // com.bykv.vk.openvk.preload.falconx.loader.ILoader
    public final void release() throws Exception {
        if (this.b.getAndSet(true)) {
            return;
        }
        b bVar = this.f1383a;
        if (bVar.b.getAndSet(true)) {
            return;
        }
        GeckoLogger.d("Loader", "release version res loader");
        synchronized (bVar.f1412a) {
            for (com.bykv.vk.openvk.preload.geckox.f.a aVar : bVar.f1412a.values()) {
                if (!aVar.e.getAndSet(true)) {
                    com.bykv.vk.openvk.preload.geckox.g.b bVarA = com.bykv.vk.openvk.preload.geckox.g.b.a(aVar.f1410a + File.separator + aVar.b + File.separator + "select.lock");
                    GeckoLogger.d("gecko-file-lock", "channel version loader clean");
                    try {
                        if (aVar.c != null) {
                            c.b(aVar.c.getAbsolutePath() + File.separator + "using.lock");
                            bVarA.a();
                            com.bykv.vk.openvk.preload.geckox.a.c.a(aVar.f1410a + File.separator + aVar.b);
                        }
                    } finally {
                        bVarA.a();
                    }
                }
            }
            bVar.f1412a.clear();
        }
    }
}
