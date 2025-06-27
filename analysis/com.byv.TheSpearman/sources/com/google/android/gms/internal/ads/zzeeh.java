package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import com.google.android.gms.internal.ads.zzbdg;
import com.json.t2;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzeeh extends zzeei {
    private static final SparseArray zzb;
    private final Context zzc;
    private final zzcxu zzd;
    private final TelephonyManager zze;
    private final zzedz zzf;
    private zzbdg.zzq zzg;

    static {
        SparseArray sparseArray = new SparseArray();
        zzb = sparseArray;
        sparseArray.put(NetworkInfo.DetailedState.CONNECTED.ordinal(), zzbdg.zzaf.zzd.CONNECTED);
        sparseArray.put(NetworkInfo.DetailedState.AUTHENTICATING.ordinal(), zzbdg.zzaf.zzd.CONNECTING);
        sparseArray.put(NetworkInfo.DetailedState.CONNECTING.ordinal(), zzbdg.zzaf.zzd.CONNECTING);
        sparseArray.put(NetworkInfo.DetailedState.OBTAINING_IPADDR.ordinal(), zzbdg.zzaf.zzd.CONNECTING);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTING.ordinal(), zzbdg.zzaf.zzd.DISCONNECTING);
        sparseArray.put(NetworkInfo.DetailedState.BLOCKED.ordinal(), zzbdg.zzaf.zzd.DISCONNECTED);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTED.ordinal(), zzbdg.zzaf.zzd.DISCONNECTED);
        sparseArray.put(NetworkInfo.DetailedState.FAILED.ordinal(), zzbdg.zzaf.zzd.DISCONNECTED);
        sparseArray.put(NetworkInfo.DetailedState.IDLE.ordinal(), zzbdg.zzaf.zzd.DISCONNECTED);
        sparseArray.put(NetworkInfo.DetailedState.SCANNING.ordinal(), zzbdg.zzaf.zzd.DISCONNECTED);
        sparseArray.put(NetworkInfo.DetailedState.SUSPENDED.ordinal(), zzbdg.zzaf.zzd.SUSPENDED);
        sparseArray.put(NetworkInfo.DetailedState.CAPTIVE_PORTAL_CHECK.ordinal(), zzbdg.zzaf.zzd.CONNECTING);
        sparseArray.put(NetworkInfo.DetailedState.VERIFYING_POOR_LINK.ordinal(), zzbdg.zzaf.zzd.CONNECTING);
    }

    zzeeh(Context context, zzcxu zzcxuVar, zzedz zzedzVar, zzedv zzedvVar, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        super(zzedvVar, zzgVar);
        this.zzc = context;
        this.zzd = zzcxuVar;
        this.zzf = zzedzVar;
        this.zze = (TelephonyManager) context.getSystemService("phone");
    }

    static /* bridge */ /* synthetic */ zzbdg.zzab zza(zzeeh zzeehVar, Bundle bundle) {
        zzbdg.zzab.zzb zzbVar;
        zzbdg.zzab.zza zzaVarZza = zzbdg.zzab.zza();
        int i = bundle.getInt("cnt", -2);
        int i2 = bundle.getInt("gnt", 0);
        if (i == -1) {
            zzeehVar.zzg = zzbdg.zzq.ENUM_TRUE;
        } else {
            zzeehVar.zzg = zzbdg.zzq.ENUM_FALSE;
            if (i == 0) {
                zzaVarZza.zzd(zzbdg.zzab.zzc.CELL);
            } else if (i != 1) {
                zzaVarZza.zzd(zzbdg.zzab.zzc.NETWORKTYPE_UNSPECIFIED);
            } else {
                zzaVarZza.zzd(zzbdg.zzab.zzc.WIFI);
            }
            switch (i2) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                case 16:
                    zzbVar = zzbdg.zzab.zzb.TWO_G;
                    break;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                    zzbVar = zzbdg.zzab.zzb.THREE_G;
                    break;
                case 13:
                    zzbVar = zzbdg.zzab.zzb.LTE;
                    break;
                default:
                    zzbVar = zzbdg.zzab.zzb.CELLULAR_NETWORK_TYPE_UNSPECIFIED;
                    break;
            }
            zzaVarZza.zzc(zzbVar);
        }
        return zzaVarZza.zzbr();
    }

    static /* bridge */ /* synthetic */ zzbdg.zzaf.zzd zzb(zzeeh zzeehVar, Bundle bundle) {
        return (zzbdg.zzaf.zzd) zzb.get(zzfgw.zza(zzfgw.zza(bundle, t2.h.G), "network").getInt("active_network_state", -1), zzbdg.zzaf.zzd.UNSPECIFIED);
    }

    static /* bridge */ /* synthetic */ byte[] zze(zzeeh zzeehVar, boolean z, ArrayList arrayList, zzbdg.zzab zzabVar, zzbdg.zzaf.zzd zzdVar) {
        zzbdg.zzaf.zza.C0147zza c0147zzaZzn = zzbdg.zzaf.zza.zzn();
        c0147zzaZzn.zzn(arrayList);
        c0147zzaZzn.zzD(zzg(Settings.Global.getInt(zzeehVar.zzc.getContentResolver(), "airplane_mode_on", 0) != 0));
        c0147zzaZzn.zzE(com.google.android.gms.ads.internal.zzu.zzq().zzg(zzeehVar.zzc, zzeehVar.zze));
        c0147zzaZzn.zzM(zzeehVar.zzf.zze());
        c0147zzaZzn.zzL(zzeehVar.zzf.zzb());
        c0147zzaZzn.zzG(zzeehVar.zzf.zza());
        c0147zzaZzn.zzH(zzdVar);
        c0147zzaZzn.zzJ(zzabVar);
        c0147zzaZzn.zzK(zzeehVar.zzg);
        c0147zzaZzn.zzN(zzg(z));
        c0147zzaZzn.zzP(zzeehVar.zzf.zzd());
        c0147zzaZzn.zzO(com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis());
        c0147zzaZzn.zzQ(zzg(Settings.Global.getInt(zzeehVar.zzc.getContentResolver(), "wifi_on", 0) != 0));
        return c0147zzaZzn.zzbr().zzaV();
    }

    private static final zzbdg.zzq zzg(boolean z) {
        return z ? zzbdg.zzq.ENUM_TRUE : zzbdg.zzq.ENUM_FALSE;
    }

    public final void zzd(boolean z) {
        zzgee.zzr(this.zzd.zzb(new Bundle()), new zzeeg(this, z), zzcbr.zzf);
    }
}
