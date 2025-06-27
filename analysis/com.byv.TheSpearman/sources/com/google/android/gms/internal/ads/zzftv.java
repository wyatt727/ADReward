package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzftv {
    public static ListenableFuture zza(Task task, CancellationTokenSource cancellationTokenSource) {
        final zzftu zzftuVar = new zzftu(task, null);
        task.addOnCompleteListener(zzgev.zzb(), new OnCompleteListener() { // from class: com.google.android.gms.internal.ads.zzftt
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task2) {
                zzftu zzftuVar2 = zzftuVar;
                if (task2.isCanceled()) {
                    zzftuVar2.cancel(false);
                    return;
                }
                if (task2.isSuccessful()) {
                    zzftuVar2.zzc(task2.getResult());
                    return;
                }
                Exception exception = task2.getException();
                if (exception == null) {
                    throw new IllegalStateException();
                }
                zzftuVar2.zzd(exception);
            }
        });
        return zzftuVar;
    }
}
