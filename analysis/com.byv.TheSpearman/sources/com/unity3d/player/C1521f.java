package com.unity3d.player;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.assetpacks.AssetPackState;
import com.google.android.play.core.assetpacks.AssetPackStates;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.unity3d.player.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C1521f implements OnCompleteListener {

    /* renamed from: a, reason: collision with root package name */
    private IAssetPackManagerDownloadStatusCallback f4396a;
    private Looper b = Looper.myLooper();
    private String c;

    public C1521f(IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback, String str) {
        this.f4396a = iAssetPackManagerDownloadStatusCallback;
        this.c = str;
    }

    private void a(String str, int i, int i2, long j) {
        new Handler(this.b).post(new RunnableC1517b(Collections.singleton(this.f4396a), str, i, j, i == 4 ? j : 0L, 0, i2));
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        try {
            AssetPackStates assetPackStates = (AssetPackStates) task.getResult();
            Map mapPackStates = assetPackStates.packStates();
            if (mapPackStates.size() == 0) {
                return;
            }
            for (AssetPackState assetPackState : mapPackStates.values()) {
                if (assetPackState.errorCode() != 0 || assetPackState.status() == 4 || assetPackState.status() == 5 || assetPackState.status() == 0) {
                    a(assetPackState.name(), assetPackState.status(), assetPackState.errorCode(), assetPackStates.totalBytes());
                } else {
                    C1524i c1524i = C1524i.d;
                    String strName = assetPackState.name();
                    IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback = this.f4396a;
                    Looper looper = this.b;
                    c1524i.getClass();
                    synchronized (C1524i.d) {
                        Object obj = c1524i.c;
                        if (obj == null) {
                            C1518c c1518c = new C1518c(c1524i, iAssetPackManagerDownloadStatusCallback, looper);
                            c1524i.f4399a.registerListener(c1518c);
                            c1524i.c = c1518c;
                        } else {
                            C1518c c1518c2 = (C1518c) obj;
                            synchronized (c1518c2) {
                                c1518c2.f4393a.add(iAssetPackManagerDownloadStatusCallback);
                            }
                        }
                        c1524i.b.add(strName);
                        c1524i.f4399a.fetch(Collections.singletonList(strName));
                    }
                }
            }
        } catch (RuntimeExecutionException e) {
            a(this.c, 0, C1524i.a((Throwable) e), 0L);
        }
    }
}
