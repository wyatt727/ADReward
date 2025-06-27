package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.util.Hex;
import com.json.mediationsdk.utils.IronSourceConstants;
import java.io.File;
import java.util.HashSet;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzfrp {
    private static final Object zza = new Object();
    private final Context zzb;
    private final SharedPreferences zzc;
    private final String zzd;
    private final zzfqw zze;
    private boolean zzf;

    public zzfrp(Context context, zzazh zzazhVar, zzfqw zzfqwVar, boolean z) {
        this.zzf = false;
        this.zzb = context;
        this.zzd = Integer.toString(zzazhVar.zza());
        this.zzc = context.getSharedPreferences("pcvmspf", 0);
        this.zze = zzfqwVar;
        this.zzf = z;
    }

    private final File zze(String str) {
        return new File(new File(this.zzb.getDir("pccache", 0), this.zzd), str);
    }

    private static String zzf(zzazk zzazkVar) {
        zzazm zzazmVarZze = zzazn.zze();
        zzazmVarZze.zze(zzazkVar.zzd().zzk());
        zzazmVarZze.zza(zzazkVar.zzd().zzj());
        zzazmVarZze.zzb(zzazkVar.zzd().zza());
        zzazmVarZze.zzd(zzazkVar.zzd().zzd());
        zzazmVarZze.zzc(zzazkVar.zzd().zzc());
        return Hex.bytesToStringLowercase(((zzazn) zzazmVarZze.zzbr()).zzaV());
    }

    private final String zzg() {
        return "FBAMTD".concat(String.valueOf(this.zzd));
    }

    private final String zzh() {
        return "LATMTD".concat(String.valueOf(this.zzd));
    }

    private final void zzi(int i, long j) {
        this.zze.zza(i, j);
    }

    private final void zzj(int i, long j, String str) {
        this.zze.zzb(i, j, str);
    }

    private final zzazn zzk(int i) {
        String string = i == 1 ? this.zzc.getString(zzh(), null) : this.zzc.getString(zzg(), null);
        if (string == null) {
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            byte[] bArrStringToBytes = Hex.stringToBytes(string);
            zzgyj zzgyjVar = zzgyj.zzb;
            return zzazn.zzi(zzgyj.zzv(bArrStringToBytes, 0, bArrStringToBytes.length), this.zzf ? zzgzf.zza() : zzgzf.zzb());
        } catch (zzhak unused) {
            return null;
        } catch (NullPointerException unused2) {
            zzi(2029, jCurrentTimeMillis);
            return null;
        } catch (RuntimeException unused3) {
            zzi(2032, jCurrentTimeMillis);
            return null;
        }
    }

    public final boolean zza(zzazk zzazkVar) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (zza) {
            if (!zzfrj.zze(new File(zze(zzazkVar.zzd().zzk()), "pcbc"), zzazkVar.zze().zzB())) {
                zzi(IronSourceConstants.NT_INSTANCE_COLLECT_TOKEN, jCurrentTimeMillis);
                return false;
            }
            String strZzf = zzf(zzazkVar);
            SharedPreferences.Editor editorEdit = this.zzc.edit();
            editorEdit.putString(zzh(), strZzf);
            boolean zCommit = editorEdit.commit();
            if (zCommit) {
                zzi(5015, jCurrentTimeMillis);
            } else {
                zzi(IronSourceConstants.NT_INSTANCE_COLLECT_TOKEN_SUCCESS, jCurrentTimeMillis);
            }
            return zCommit;
        }
    }

    public final boolean zzb(zzazk zzazkVar, zzfro zzfroVar) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (zza) {
            zzazn zzaznVarZzk = zzk(1);
            String strZzk = zzazkVar.zzd().zzk();
            if (zzaznVarZzk != null && zzaznVarZzk.zzk().equals(strZzk)) {
                zzi(4014, jCurrentTimeMillis);
                return false;
            }
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            File fileZze = zze(strZzk);
            if (fileZze.exists()) {
                zzj(IronSourceConstants.NT_INSTANCE_COLLECT_TOKEN_TIMED_OUT, jCurrentTimeMillis2, "d:" + (true != fileZze.isDirectory() ? "0" : "1") + ",f:" + (true != fileZze.isFile() ? "0" : "1"));
                zzi(4015, jCurrentTimeMillis2);
            } else if (!fileZze.mkdirs()) {
                zzj(4024, jCurrentTimeMillis2, "cw:".concat(true != fileZze.canWrite() ? "0" : "1"));
                zzi(4015, jCurrentTimeMillis2);
                return false;
            }
            File fileZze2 = zze(strZzk);
            File file = new File(fileZze2, "pcam.jar");
            File file2 = new File(fileZze2, "pcbc");
            if (!zzfrj.zze(file, zzazkVar.zzf().zzB())) {
                zzi(4016, jCurrentTimeMillis);
                return false;
            }
            if (!zzfrj.zze(file2, zzazkVar.zze().zzB())) {
                zzi(4017, jCurrentTimeMillis);
                return false;
            }
            if (zzfroVar != null && !zzfroVar.zza(file)) {
                zzi(4018, jCurrentTimeMillis);
                zzfrj.zzd(fileZze2);
                return false;
            }
            String strZzf = zzf(zzazkVar);
            long jCurrentTimeMillis3 = System.currentTimeMillis();
            String string = this.zzc.getString(zzh(), null);
            SharedPreferences.Editor editorEdit = this.zzc.edit();
            editorEdit.putString(zzh(), strZzf);
            if (string != null) {
                editorEdit.putString(zzg(), string);
            }
            if (!editorEdit.commit()) {
                zzi(4019, jCurrentTimeMillis3);
                return false;
            }
            HashSet hashSet = new HashSet();
            zzazn zzaznVarZzk2 = zzk(1);
            if (zzaznVarZzk2 != null) {
                hashSet.add(zzaznVarZzk2.zzk());
            }
            zzazn zzaznVarZzk3 = zzk(2);
            if (zzaznVarZzk3 != null) {
                hashSet.add(zzaznVarZzk3.zzk());
            }
            for (File file3 : new File(this.zzb.getDir("pccache", 0), this.zzd).listFiles()) {
                if (!hashSet.contains(file3.getName())) {
                    zzfrj.zzd(file3);
                }
            }
            zzi(5014, jCurrentTimeMillis);
            return true;
        }
    }

    public final zzfrh zzc(int i) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (zza) {
            zzazn zzaznVarZzk = zzk(1);
            if (zzaznVarZzk == null) {
                zzi(IronSourceConstants.NT_INSTANCE_COLLECT_TOKEN_FAILED, jCurrentTimeMillis);
                return null;
            }
            File fileZze = zze(zzaznVarZzk.zzk());
            File file = new File(fileZze, "pcam.jar");
            if (!file.exists()) {
                file = new File(fileZze, "pcam");
            }
            File file2 = new File(fileZze, "pcbc");
            File file3 = new File(fileZze, "pcopt");
            zzi(5016, jCurrentTimeMillis);
            return new zzfrh(zzaznVarZzk, file, file2, file3);
        }
    }

    public final boolean zzd(int i) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (zza) {
            zzazn zzaznVarZzk = zzk(1);
            if (zzaznVarZzk == null) {
                zzi(4025, jCurrentTimeMillis);
                return false;
            }
            File fileZze = zze(zzaznVarZzk.zzk());
            if (!new File(fileZze, "pcam.jar").exists()) {
                zzi(4026, jCurrentTimeMillis);
                return false;
            }
            if (new File(fileZze, "pcbc").exists()) {
                zzi(5019, jCurrentTimeMillis);
                return true;
            }
            zzi(4027, jCurrentTimeMillis);
            return false;
        }
    }
}
