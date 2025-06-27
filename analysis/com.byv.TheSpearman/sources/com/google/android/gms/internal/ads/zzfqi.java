package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.Base64;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.nio.ByteBuffer;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzfqi {
    private final Context zza;
    private final Executor zzb;
    private final zzfpp zzc;
    private final zzfpr zzd;
    private final zzfqh zze;
    private final zzfqh zzf;
    private Task zzg;
    private Task zzh;

    zzfqi(Context context, Executor executor, zzfpp zzfppVar, zzfpr zzfprVar, zzfqf zzfqfVar, zzfqg zzfqgVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzfppVar;
        this.zzd = zzfprVar;
        this.zze = zzfqfVar;
        this.zzf = zzfqgVar;
    }

    public static zzfqi zze(Context context, Executor executor, zzfpp zzfppVar, zzfpr zzfprVar) {
        final zzfqi zzfqiVar = new zzfqi(context, executor, zzfppVar, zzfprVar, new zzfqf(), new zzfqg());
        if (zzfqiVar.zzd.zzd()) {
            zzfqiVar.zzg = zzfqiVar.zzh(new Callable() { // from class: com.google.android.gms.internal.ads.zzfqc
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.zza.zzc();
                }
            });
        } else {
            zzfqiVar.zzg = Tasks.forResult(zzfqiVar.zze.zza());
        }
        zzfqiVar.zzh = zzfqiVar.zzh(new Callable() { // from class: com.google.android.gms.internal.ads.zzfqd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzd();
            }
        });
        return zzfqiVar;
    }

    private static zzaud zzg(Task task, zzaud zzaudVar) {
        return !task.isSuccessful() ? zzaudVar : (zzaud) task.getResult();
    }

    private final Task zzh(Callable callable) {
        return Tasks.call(this.zzb, callable).addOnFailureListener(this.zzb, new OnFailureListener() { // from class: com.google.android.gms.internal.ads.zzfqe
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                this.zza.zzf(exc);
            }
        });
    }

    public final zzaud zza() {
        return zzg(this.zzg, this.zze.zza());
    }

    public final zzaud zzb() {
        return zzg(this.zzh, this.zzf.zza());
    }

    final /* synthetic */ zzaud zzc() throws Exception {
        zzata zzataVarZza = zzaud.zza();
        AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.zza);
        String id = advertisingIdInfo.getId();
        if (id != null && id.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
            UUID uuidFromString = UUID.fromString(id);
            byte[] bArr = new byte[16];
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            byteBufferWrap.putLong(uuidFromString.getMostSignificantBits());
            byteBufferWrap.putLong(uuidFromString.getLeastSignificantBits());
            id = Base64.encodeToString(bArr, 11);
        }
        if (id != null) {
            zzataVarZza.zzt(id);
            zzataVarZza.zzs(advertisingIdInfo.isLimitAdTrackingEnabled());
            zzataVarZza.zzu(zzati.DEVICE_IDENTIFIER_ANDROID_AD_ID);
        }
        return (zzaud) zzataVarZza.zzbr();
    }

    final /* synthetic */ zzaud zzd() throws Exception {
        Context context = this.zza;
        return zzfpx.zza(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
    }

    final /* synthetic */ void zzf(Exception exc) {
        if (exc instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
        this.zzc.zzc(2025, -1L, exc);
    }
}
