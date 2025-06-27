package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.InputStreamReader;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzdzm implements zzeak {
    private static final Pattern zza = Pattern.compile("Received error HTTP response code: (.*)");
    private final zzdyn zzb;
    private final zzgep zzc;
    private final zzfgi zzd;
    private final ScheduledExecutorService zze;
    private final zzedz zzf;
    private final zzflh zzg;
    private final Context zzh;

    zzdzm(Context context, zzfgi zzfgiVar, zzdyn zzdynVar, zzgep zzgepVar, ScheduledExecutorService scheduledExecutorService, zzedz zzedzVar, zzflh zzflhVar) {
        this.zzh = context;
        this.zzd = zzfgiVar;
        this.zzb = zzdynVar;
        this.zzc = zzgepVar;
        this.zze = scheduledExecutorService;
        this.zzf = zzedzVar;
        this.zzg = zzflhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeak
    public final ListenableFuture zzb(zzbxd zzbxdVar) {
        Context context = this.zzh;
        ListenableFuture listenableFutureZzc = this.zzb.zzc(zzbxdVar);
        zzfkw zzfkwVarZza = zzfkv.zza(context, zzflo.CUI_NAME_ADREQUEST_PARSERESPONSE);
        zzflg.zze(listenableFutureZzc, zzfkwVarZza);
        ListenableFuture listenableFutureZzn = zzgee.zzn(listenableFutureZzc, new zzgdl() { // from class: com.google.android.gms.internal.ads.zzdzj
            @Override // com.google.android.gms.internal.ads.zzgdl
            public final ListenableFuture zza(Object obj) {
                return this.zza.zzc((zzeam) obj);
            }
        }, this.zzc);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzfx)).booleanValue()) {
            listenableFutureZzn = zzgee.zzf(zzgee.zzo(listenableFutureZzn, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzfz)).intValue(), TimeUnit.SECONDS, this.zze), TimeoutException.class, new zzgdl() { // from class: com.google.android.gms.internal.ads.zzdzk
                @Override // com.google.android.gms.internal.ads.zzgdl
                public final ListenableFuture zza(Object obj) {
                    return zzgee.zzg(new zzdyi(5));
                }
            }, zzcbr.zzf);
        }
        zzflg.zzb(listenableFutureZzn, this.zzg, zzfkwVarZza);
        zzgee.zzr(listenableFutureZzn, new zzdzl(this), zzcbr.zzf);
        return listenableFutureZzn;
    }

    final /* synthetic */ ListenableFuture zzc(zzeam zzeamVar) throws Exception {
        return zzgee.zzh(new zzffz(new zzffw(this.zzd), zzffy.zza(new InputStreamReader(zzeamVar.zzb()), zzeamVar.zza())));
    }
}
