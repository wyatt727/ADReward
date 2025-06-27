package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzbdg;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzeeq {
    private final zzbcx zza;
    private final Context zzb;
    private final zzedv zzc;
    private final VersionInfoParcel zzd;

    public zzeeq(Context context, VersionInfoParcel versionInfoParcel, zzbcx zzbcxVar, zzedv zzedvVar) {
        this.zzb = context;
        this.zzd = versionInfoParcel;
        this.zza = zzbcxVar;
        this.zzc = zzedvVar;
    }

    public final void zzb(final boolean z) {
        try {
            this.zzc.zza(new zzfjq() { // from class: com.google.android.gms.internal.ads.zzeen
                @Override // com.google.android.gms.internal.ads.zzfjq
                public final Object zza(Object obj) throws Exception {
                    this.zza.zza(z, (SQLiteDatabase) obj);
                    return null;
                }
            });
        } catch (Exception e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("Error in offline signals database startup: ".concat(String.valueOf(e.getMessage())));
        }
    }

    final /* synthetic */ Void zza(boolean z, SQLiteDatabase sQLiteDatabase) throws Exception {
        if (z) {
            this.zzb.deleteDatabase("OfflineUpload.db");
        } else {
            ArrayList arrayList = new ArrayList();
            Cursor cursorQuery = sQLiteDatabase.query("offline_signal_contents", new String[]{"serialized_proto_data"}, null, null, null, null, null);
            while (cursorQuery.moveToNext()) {
                try {
                    arrayList.add(zzbdg.zzaf.zza.zzx(cursorQuery.getBlob(cursorQuery.getColumnIndexOrThrow("serialized_proto_data"))));
                } catch (zzhak e) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzg("Unable to deserialize proto from offline signals database:");
                    com.google.android.gms.ads.internal.util.client.zzm.zzg(e.getMessage());
                }
            }
            cursorQuery.close();
            Context context = this.zzb;
            zzbdg.zzaf.zzc zzcVarZzi = zzbdg.zzaf.zzi();
            zzcVarZzi.zzv(context.getPackageName());
            zzcVarZzi.zzy(Build.MODEL);
            zzcVarZzi.zzA(zzeek.zza(sQLiteDatabase, 0));
            zzcVarZzi.zzh(arrayList);
            zzcVarZzi.zzE(zzeek.zza(sQLiteDatabase, 1));
            zzcVarZzi.zzx(zzeek.zza(sQLiteDatabase, 3));
            zzcVarZzi.zzF(com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis());
            zzcVarZzi.zzB(zzeek.zzb(sQLiteDatabase, 2));
            final zzbdg.zzaf zzafVarZzbr = zzcVarZzi.zzbr();
            int size = arrayList.size();
            long jZze = 0;
            for (int i = 0; i < size; i++) {
                zzbdg.zzaf.zza zzaVar = (zzbdg.zzaf.zza) arrayList.get(i);
                if (zzaVar.zzk() == zzbdg.zzq.ENUM_TRUE && zzaVar.zze() > jZze) {
                    jZze = zzaVar.zze();
                }
            }
            if (jZze != 0) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("value", Long.valueOf(jZze));
                sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = 'last_successful_request_time'", null);
            }
            this.zza.zzc(new zzbcw() { // from class: com.google.android.gms.internal.ads.zzeeo
                @Override // com.google.android.gms.internal.ads.zzbcw
                public final void zza(zzbdg.zzt.zza zzaVar2) {
                    zzaVar2.zzW(zzafVarZzbr);
                }
            });
            VersionInfoParcel versionInfoParcel = this.zzd;
            zzbdg.zzar.zza zzaVarZzd = zzbdg.zzar.zzd();
            zzaVarZzd.zzg(versionInfoParcel.buddyApkVersion);
            zzaVarZzd.zzi(this.zzd.clientJarVersion);
            zzaVarZzd.zzh(true != this.zzd.isClientJar ? 2 : 0);
            final zzbdg.zzar zzarVarZzbr = zzaVarZzd.zzbr();
            this.zza.zzc(new zzbcw() { // from class: com.google.android.gms.internal.ads.zzeep
                @Override // com.google.android.gms.internal.ads.zzbcw
                public final void zza(zzbdg.zzt.zza zzaVar2) {
                    zzbdg.zzm.zza zzaVarZzcZ = zzaVar2.zzg().zzcZ();
                    zzaVarZzcZ.zzw(zzarVarZzbr);
                    zzaVar2.zzK(zzaVarZzcZ);
                }
            });
            this.zza.zzb(zzbcz.OFFLINE_UPLOAD);
            zzeek.zze(sQLiteDatabase);
        }
        return null;
    }
}
