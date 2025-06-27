package com.google.android.gms.internal.nearby;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.google.android.gms.nearby.connection.Payload;
import java.io.File;
import java.io.FileNotFoundException;

/* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* loaded from: classes3.dex */
public final class zzgf {
    private static File zza;

    static Payload zza(Context context, zzgd zzgdVar) throws FileNotFoundException {
        long jZza = zzgdVar.zza();
        int iZzb = zzgdVar.zzb();
        if (iZzb == 1) {
            zzfz zzfzVarZzi = zzgdVar.zzi();
            return Payload.zza((byte[]) zzhz.zza(zzfzVarZzi != null ? zzfzVarZzi.zza() : zzgdVar.zzc(), "Payload bytes cannot be null if type is BYTES."), jZza);
        }
        if (iZzb != 2) {
            if (iZzb != 3) {
                Log.w("NearbyConnections", String.format("Incoming ParcelablePayload %d has unknown type %d", Long.valueOf(zzgdVar.zza()), Integer.valueOf(zzgdVar.zzb())));
                return null;
            }
            ParcelFileDescriptor parcelFileDescriptorZzd = zzgdVar.zzd();
            zzhz.zza(parcelFileDescriptorZzd, "Data ParcelFileDescriptor cannot be null for type STREAM");
            return Payload.zzc(Payload.Stream.zzb(parcelFileDescriptorZzd), jZza);
        }
        String strZze = zzgdVar.zze();
        Uri uriZzh = zzgdVar.zzh();
        if (strZze == null || uriZzh == null) {
            ParcelFileDescriptor parcelFileDescriptorZzd2 = zzgdVar.zzd();
            zzhz.zza(parcelFileDescriptorZzd2, "Data ParcelFileDescriptor cannot be null for type FILE");
            return Payload.zzb(Payload.File.zzb(parcelFileDescriptorZzd2), jZza);
        }
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uriZzh, "r");
            if (parcelFileDescriptorOpenFileDescriptor != null) {
                return Payload.zzb(Payload.File.zza(new File(strZze), parcelFileDescriptorOpenFileDescriptor, zzgdVar.zzf(), uriZzh), jZza);
            }
            Log.w("NearbyConnections", String.format("Failed to get ParcelFileDescriptor for %s", uriZzh));
            return null;
        } catch (FileNotFoundException e) {
            Log.w("NearbyConnections", String.format("Failed to create Payload from ParcelablePayload: unable to open uri %s for file %s.", uriZzh, strZze), e);
            return null;
        }
    }

    public static void zzb(File file) {
        if (file == null) {
            Log.e("NearbyConnections", "Cannot set null temp directory");
        } else {
            zza = file;
        }
    }

    static File zzc() {
        return zza;
    }
}
