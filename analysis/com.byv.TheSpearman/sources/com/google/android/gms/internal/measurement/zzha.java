package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.ContentObserver;
import android.util.Log;
import androidx.core.content.PermissionChecker;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* loaded from: classes3.dex */
final class zzha implements zzgz {
    private static zzha zza;

    @Nullable
    private final Context zzb;

    @Nullable
    private final ContentObserver zzc;

    static zzha zza(Context context) {
        zzha zzhaVar;
        synchronized (zzha.class) {
            if (zza == null) {
                zza = PermissionChecker.checkSelfPermission(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new zzha(context) : new zzha();
            }
            zzhaVar = zza;
        }
        return zzhaVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.measurement.zzgz
    @Nullable
    /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final String zza(final String str) {
        Context context = this.zzb;
        if (context != null && !zzgq.zza(context)) {
            try {
                return (String) zzgy.zza(new zzhb() { // from class: com.google.android.gms.internal.measurement.zzhd
                    @Override // com.google.android.gms.internal.measurement.zzhb
                    public final Object zza() {
                        return this.zza.zzb(str);
                    }
                });
            } catch (IllegalStateException | NullPointerException | SecurityException e) {
                Log.e("GservicesLoader", "Unable to read GServices for: " + str, e);
            }
        }
        return null;
    }

    final /* synthetic */ String zzb(String str) {
        return zzgh.zza(this.zzb.getContentResolver(), str, null);
    }

    private zzha() {
        this.zzb = null;
        this.zzc = null;
    }

    private zzha(Context context) {
        this.zzb = context;
        zzhc zzhcVar = new zzhc(this, null);
        this.zzc = zzhcVar;
        context.getContentResolver().registerContentObserver(zzgg.zza, true, zzhcVar);
    }

    static synchronized void zza() {
        Context context;
        zzha zzhaVar = zza;
        if (zzhaVar != null && (context = zzhaVar.zzb) != null && zzhaVar.zzc != null) {
            context.getContentResolver().unregisterContentObserver(zza.zzc);
        }
        zza = null;
    }
}
