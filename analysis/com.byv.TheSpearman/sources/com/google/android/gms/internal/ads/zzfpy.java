package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.json.mediationsdk.utils.IronSourceConstants;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzfpy implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    protected final zzfra zza;
    private final String zzb;
    private final String zzc;
    private final zzazh zzd;
    private final LinkedBlockingQueue zze;
    private final HandlerThread zzf;
    private final zzfpp zzg;
    private final long zzh;

    public zzfpy(Context context, int i, zzazh zzazhVar, String str, String str2, String str3, zzfpp zzfppVar) {
        this.zzb = str;
        this.zzd = zzazhVar;
        this.zzc = str2;
        this.zzg = zzfppVar;
        HandlerThread handlerThread = new HandlerThread("GassDGClient");
        this.zzf = handlerThread;
        handlerThread.start();
        this.zzh = System.currentTimeMillis();
        zzfra zzfraVar = new zzfra(context, handlerThread.getLooper(), this, this, 19621000);
        this.zza = zzfraVar;
        this.zze = new LinkedBlockingQueue();
        zzfraVar.checkAvailabilityAndConnect();
    }

    static zzfrm zza() {
        return new zzfrm(null, 1);
    }

    private final void zze(int i, long j, Exception exc) {
        this.zzg.zzc(i, System.currentTimeMillis() - j, exc);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        zzfrf zzfrfVarZzd = zzd();
        if (zzfrfVarZzd != null) {
            try {
                zzfrm zzfrmVarZzf = zzfrfVarZzd.zzf(new zzfrk(1, this.zzd, this.zzb, this.zzc));
                zze(IronSourceConstants.errorCode_internal, this.zzh, null);
                this.zze.put(zzfrmVarZzf);
            } finally {
                try {
                } finally {
                }
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) throws InterruptedException {
        try {
            zze(4012, this.zzh, null);
            this.zze.put(zza());
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) throws InterruptedException {
        try {
            zze(4011, this.zzh, null);
            this.zze.put(zza());
        } catch (InterruptedException unused) {
        }
    }

    public final zzfrm zzb(int i) {
        zzfrm zzfrmVar;
        try {
            zzfrmVar = (zzfrm) this.zze.poll(50000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            zze(2009, this.zzh, e);
            zzfrmVar = null;
        }
        zze(3004, this.zzh, null);
        if (zzfrmVar != null) {
            if (zzfrmVar.zzc == 7) {
                zzfpp.zzg(zzasn.DISABLED);
            } else {
                zzfpp.zzg(zzasn.ENABLED);
            }
        }
        return zzfrmVar == null ? zza() : zzfrmVar;
    }

    public final void zzc() {
        zzfra zzfraVar = this.zza;
        if (zzfraVar != null) {
            if (zzfraVar.isConnected() || this.zza.isConnecting()) {
                this.zza.disconnect();
            }
        }
    }

    protected final zzfrf zzd() {
        try {
            return this.zza.zzp();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }
}
