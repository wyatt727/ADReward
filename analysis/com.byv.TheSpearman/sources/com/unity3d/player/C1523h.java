package com.unity3d.player;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.assetpacks.AssetPackState;
import com.google.android.play.core.assetpacks.AssetPackStates;
import java.util.Map;

/* renamed from: com.unity3d.player.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C1523h implements OnCompleteListener {

    /* renamed from: a, reason: collision with root package name */
    private IAssetPackManagerStatusQueryCallback f4398a;
    private Looper b = Looper.myLooper();
    private String[] c;

    public C1523h(IAssetPackManagerStatusQueryCallback iAssetPackManagerStatusQueryCallback, String[] strArr) {
        this.f4398a = iAssetPackManagerStatusQueryCallback;
        this.c = strArr;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        if (this.f4398a == null) {
            return;
        }
        int i = 0;
        try {
            AssetPackStates assetPackStates = (AssetPackStates) task.getResult();
            Map mapPackStates = assetPackStates.packStates();
            int size = mapPackStates.size();
            String[] strArr = new String[size];
            int[] iArr = new int[size];
            int[] iArr2 = new int[size];
            for (AssetPackState assetPackState : mapPackStates.values()) {
                strArr[i] = assetPackState.name();
                iArr[i] = assetPackState.status();
                iArr2[i] = assetPackState.errorCode();
                i++;
            }
            new Handler(this.b).post(new RunnableC1522g(this.f4398a, assetPackStates.totalBytes(), strArr, iArr, iArr2));
        } catch (RuntimeExecutionException e) {
            String message = e.getMessage();
            for (String str : this.c) {
                if (message.contains(str)) {
                    new Handler(this.b).post(new RunnableC1522g(this.f4398a, 0L, new String[]{str}, new int[]{0}, new int[]{C1524i.a((Throwable) e)}));
                    return;
                }
            }
            String[] strArr2 = this.c;
            int[] iArr3 = new int[strArr2.length];
            int[] iArr4 = new int[strArr2.length];
            for (int i2 = 0; i2 < this.c.length; i2++) {
                iArr3[i2] = 0;
                iArr4[i2] = C1524i.a((Throwable) e);
            }
            new Handler(this.b).post(new RunnableC1522g(this.f4398a, 0L, this.c, iArr3, iArr4));
        }
    }
}
