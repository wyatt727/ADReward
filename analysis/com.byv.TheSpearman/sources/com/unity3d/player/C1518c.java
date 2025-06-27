package com.unity3d.player;

import android.os.Handler;
import android.os.Looper;
import com.google.android.play.core.assetpacks.AssetPackState;
import com.google.android.play.core.assetpacks.AssetPackStateUpdateListener;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.unity3d.player.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C1518c implements AssetPackStateUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    private HashSet f4393a;
    private Looper b;
    final /* synthetic */ C1524i c;

    public C1518c(C1524i c1524i, IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback, Looper looper) {
        this.c = c1524i;
        HashSet hashSet = new HashSet();
        this.f4393a = hashSet;
        hashSet.add(iAssetPackManagerDownloadStatusCallback);
        this.b = looper;
    }

    public void onStateUpdate(Object obj) {
        AssetPackState assetPackState = (AssetPackState) obj;
        synchronized (this) {
            if (assetPackState.status() == 4 || assetPackState.status() == 5 || assetPackState.status() == 0) {
                synchronized (C1524i.d) {
                    this.c.b.remove(assetPackState.name());
                    if (this.c.b.isEmpty()) {
                        C1524i c1524i = this.c;
                        Object obj2 = c1524i.c;
                        if (obj2 instanceof C1518c) {
                            c1524i.f4399a.unregisterListener((C1518c) obj2);
                        }
                        this.c.c = null;
                    }
                }
            }
            if (this.f4393a.size() == 0) {
                return;
            }
            new Handler(this.b).post(new RunnableC1517b((Set) this.f4393a.clone(), assetPackState.name(), assetPackState.status(), assetPackState.totalBytesToDownload(), assetPackState.bytesDownloaded(), assetPackState.transferProgressPercentage(), assetPackState.errorCode()));
        }
    }
}
