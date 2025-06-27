package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzfvr {
    private static final Map zza = new HashMap();
    private final Context zzb;
    private final zzfvg zzc;
    private boolean zzh;
    private final Intent zzi;
    private ServiceConnection zzm;
    private IInterface zzn;
    private final zzfut zzo;
    private final List zze = new ArrayList();
    private final Set zzf = new HashSet();
    private final Object zzg = new Object();
    private final IBinder.DeathRecipient zzk = new IBinder.DeathRecipient() { // from class: com.google.android.gms.internal.ads.zzfvi
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            zzfvr.zzj(this.zza);
        }
    };
    private final AtomicInteger zzl = new AtomicInteger(0);
    private final String zzd = "OverlayDisplayService";
    private final WeakReference zzj = new WeakReference(null);

    public zzfvr(Context context, zzfvg zzfvgVar, String str, Intent intent, zzfut zzfutVar, zzfvm zzfvmVar) {
        this.zzb = context;
        this.zzc = zzfvgVar;
        this.zzi = intent;
        this.zzo = zzfutVar;
    }

    public static /* synthetic */ void zzj(zzfvr zzfvrVar) {
        zzfvrVar.zzc.zzc("reportBinderDeath", new Object[0]);
        zzfvm zzfvmVar = (zzfvm) zzfvrVar.zzj.get();
        if (zzfvmVar != null) {
            zzfvrVar.zzc.zzc("calling onBinderDied", new Object[0]);
            zzfvmVar.zza();
        } else {
            zzfvrVar.zzc.zzc("%s : Binder has died.", zzfvrVar.zzd);
            Iterator it = zzfvrVar.zze.iterator();
            while (it.hasNext()) {
                ((zzfvh) it.next()).zzc(zzfvrVar.zzv());
            }
            zzfvrVar.zze.clear();
        }
        synchronized (zzfvrVar.zzg) {
            zzfvrVar.zzw();
        }
    }

    static /* bridge */ /* synthetic */ void zzn(final zzfvr zzfvrVar, final TaskCompletionSource taskCompletionSource) {
        zzfvrVar.zzf.add(taskCompletionSource);
        taskCompletionSource.getTask().addOnCompleteListener(new OnCompleteListener() { // from class: com.google.android.gms.internal.ads.zzfvj
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                this.zza.zzt(taskCompletionSource, task);
            }
        });
    }

    static /* bridge */ /* synthetic */ void zzq(zzfvr zzfvrVar) throws RemoteException {
        zzfvrVar.zzc.zzc("linkToDeath", new Object[0]);
        try {
            zzfvrVar.zzn.asBinder().linkToDeath(zzfvrVar.zzk, 0);
        } catch (RemoteException e) {
            zzfvrVar.zzc.zzb(e, "linkToDeath failed", new Object[0]);
        }
    }

    static /* bridge */ /* synthetic */ void zzr(zzfvr zzfvrVar) {
        zzfvrVar.zzc.zzc("unlinkToDeath", new Object[0]);
        zzfvrVar.zzn.asBinder().unlinkToDeath(zzfvrVar.zzk, 0);
    }

    private final RemoteException zzv() {
        return new RemoteException(String.valueOf(this.zzd).concat(" : Binder has died."));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzw() {
        Iterator it = this.zzf.iterator();
        while (it.hasNext()) {
            ((TaskCompletionSource) it.next()).trySetException(zzv());
        }
        this.zzf.clear();
    }

    public final Handler zzc() {
        Handler handler;
        Map map = zza;
        synchronized (map) {
            if (!map.containsKey(this.zzd)) {
                HandlerThread handlerThread = new HandlerThread(this.zzd, 10);
                handlerThread.start();
                map.put(this.zzd, new Handler(handlerThread.getLooper()));
            }
            handler = (Handler) map.get(this.zzd);
        }
        return handler;
    }

    public final IInterface zze() {
        return this.zzn;
    }

    public final void zzs(zzfvh zzfvhVar, TaskCompletionSource taskCompletionSource) {
        zzc().post(new zzfvk(this, zzfvhVar.zzb(), taskCompletionSource, zzfvhVar));
    }

    final /* synthetic */ void zzt(TaskCompletionSource taskCompletionSource, Task task) {
        synchronized (this.zzg) {
            this.zzf.remove(taskCompletionSource);
        }
    }

    public final void zzu() {
        zzc().post(new zzfvl(this));
    }

    static /* bridge */ /* synthetic */ void zzp(zzfvr zzfvrVar, zzfvh zzfvhVar) {
        if (zzfvrVar.zzn != null || zzfvrVar.zzh) {
            if (!zzfvrVar.zzh) {
                zzfvhVar.run();
                return;
            } else {
                zzfvrVar.zzc.zzc("Waiting to bind to the service.", new Object[0]);
                zzfvrVar.zze.add(zzfvhVar);
                return;
            }
        }
        zzfvrVar.zzc.zzc("Initiate binding to the service.", new Object[0]);
        zzfvrVar.zze.add(zzfvhVar);
        zzfvq zzfvqVar = new zzfvq(zzfvrVar, null);
        zzfvrVar.zzm = zzfvqVar;
        zzfvrVar.zzh = true;
        if (zzfvrVar.zzb.bindService(zzfvrVar.zzi, zzfvqVar, 1)) {
            return;
        }
        zzfvrVar.zzc.zzc("Failed to bind to the service.", new Object[0]);
        zzfvrVar.zzh = false;
        Iterator it = zzfvrVar.zze.iterator();
        while (it.hasNext()) {
            ((zzfvh) it.next()).zzc(new zzfvs());
        }
        zzfvrVar.zze.clear();
    }
}
