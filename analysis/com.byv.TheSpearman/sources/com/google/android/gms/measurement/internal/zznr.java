package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.measurement.zzfu;
import com.google.android.gms.internal.measurement.zzok;
import com.google.android.gms.internal.measurement.zzpz;
import com.google.android.gms.internal.measurement.zzql;
import com.google.android.gms.internal.measurement.zzqr;
import com.google.android.gms.measurement.internal.zziq;
import com.json.i5;
import com.json.t2;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.checkerframework.dataflow.qual.Pure;

/* compiled from: com.google.android.gms:play-services-measurement@@22.0.0 */
/* loaded from: classes3.dex */
public final class zznr extends zznd {
    @Override // com.google.android.gms.measurement.internal.zznd
    protected final boolean zzc() {
        return false;
    }

    static int zza(zzfu.zzj.zza zzaVar, String str) {
        if (zzaVar == null) {
            return -1;
        }
        for (int i = 0; i < zzaVar.zzd(); i++) {
            if (str.equals(zzaVar.zzk(i).zzg())) {
                return i;
            }
        }
        return -1;
    }

    final long zza(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        return zza(str.getBytes(Charset.forName(C.UTF8_NAME)));
    }

    final long zza(byte[] bArr) {
        Preconditions.checkNotNull(bArr);
        zzq().zzt();
        MessageDigest messageDigestZzu = zzny.zzu();
        if (messageDigestZzu == null) {
            zzj().zzg().zza("Failed to get MD5");
            return 0L;
        }
        return zzny.zza(messageDigestZzu.digest(bArr));
    }

    @Override // com.google.android.gms.measurement.internal.zzim, com.google.android.gms.measurement.internal.zzio
    @Pure
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    private static Bundle zzb(List<zzfu.zzg> list) {
        Bundle bundle = new Bundle();
        for (zzfu.zzg zzgVar : list) {
            String strZzg = zzgVar.zzg();
            if (zzgVar.zzj()) {
                bundle.putString(strZzg, String.valueOf(zzgVar.zza()));
            } else if (zzgVar.zzk()) {
                bundle.putString(strZzg, String.valueOf(zzgVar.zzb()));
            } else if (zzgVar.zzn()) {
                bundle.putString(strZzg, zzgVar.zzh());
            } else if (zzgVar.zzl()) {
                bundle.putString(strZzg, String.valueOf(zzgVar.zzd()));
            }
        }
        return bundle;
    }

    static Bundle zza(List<zzfu.zzg> list) {
        Bundle bundle = new Bundle();
        for (zzfu.zzg zzgVar : list) {
            String strZzg = zzgVar.zzg();
            if (zzgVar.zzj()) {
                bundle.putDouble(strZzg, zzgVar.zza());
            } else if (zzgVar.zzk()) {
                bundle.putFloat(strZzg, zzgVar.zzb());
            } else if (zzgVar.zzn()) {
                bundle.putString(strZzg, zzgVar.zzh());
            } else if (zzgVar.zzl()) {
                bundle.putLong(strZzg, zzgVar.zzd());
            }
        }
        return bundle;
    }

    private final Bundle zza(Map<String, Object> map, boolean z) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                bundle.putString(str, obj.toString());
            } else if (z) {
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    arrayList2.add(zza((Map<String, Object>) obj2, false));
                }
                bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
        }
        return bundle;
    }

    private static Bundle zzc(List<zzfu.zzn> list) {
        Bundle bundle = new Bundle();
        for (zzfu.zzn zznVar : list) {
            String strZzg = zznVar.zzg();
            if (zznVar.zzi()) {
                bundle.putString(strZzg, String.valueOf(zznVar.zza()));
            } else if (zznVar.zzj()) {
                bundle.putString(strZzg, String.valueOf(zznVar.zzb()));
            } else if (zznVar.zzm()) {
                bundle.putString(strZzg, zznVar.zzh());
            } else if (zznVar.zzk()) {
                bundle.putString(strZzg, String.valueOf(zznVar.zzc()));
            }
        }
        return bundle;
    }

    final <T extends Parcelable> T zza(byte[] bArr, Parcelable.Creator<T> creator) {
        if (bArr == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.unmarshall(bArr, 0, bArr.length);
            parcelObtain.setDataPosition(0);
            return creator.createFromParcel(parcelObtain);
        } catch (SafeParcelReader.ParseException unused) {
            zzj().zzg().zza("Failed to load parcelable from buffer");
            return null;
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzim, com.google.android.gms.measurement.internal.zzio
    @Pure
    public final /* bridge */ /* synthetic */ Clock zzb() {
        return super.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.zzne
    public final /* bridge */ /* synthetic */ zzu zzg() {
        return super.zzg();
    }

    @Override // com.google.android.gms.measurement.internal.zzim, com.google.android.gms.measurement.internal.zzio
    @Pure
    public final /* bridge */ /* synthetic */ zzab zzd() {
        return super.zzd();
    }

    @Override // com.google.android.gms.measurement.internal.zzim
    @Pure
    public final /* bridge */ /* synthetic */ zzag zze() {
        return super.zze();
    }

    @Override // com.google.android.gms.measurement.internal.zzne
    public final /* bridge */ /* synthetic */ zzal zzh() {
        return super.zzh();
    }

    @Override // com.google.android.gms.measurement.internal.zzim
    @Pure
    public final /* bridge */ /* synthetic */ zzax zzf() {
        return super.zzf();
    }

    final zzbd zza(com.google.android.gms.internal.measurement.zzad zzadVar) {
        Object obj;
        Bundle bundleZza = zza(zzadVar.zzc(), true);
        String string = (!bundleZza.containsKey("_o") || (obj = bundleZza.get("_o")) == null) ? MBridgeConstans.DYNAMIC_VIEW_WX_APP : obj.toString();
        String strZzb = zziu.zzb(zzadVar.zzb());
        if (strZzb == null) {
            strZzb = zzadVar.zzb();
        }
        return new zzbd(strZzb, new zzbc(bundleZza), string, zzadVar.zza());
    }

    @Override // com.google.android.gms.measurement.internal.zzim
    @Pure
    public final /* bridge */ /* synthetic */ zzfy zzi() {
        return super.zzi();
    }

    @Override // com.google.android.gms.measurement.internal.zzim, com.google.android.gms.measurement.internal.zzio
    @Pure
    public final /* bridge */ /* synthetic */ zzfz zzj() {
        return super.zzj();
    }

    @Override // com.google.android.gms.measurement.internal.zzim
    @Pure
    public final /* bridge */ /* synthetic */ zzgo zzk() {
        return super.zzk();
    }

    @Override // com.google.android.gms.measurement.internal.zzne
    public final /* bridge */ /* synthetic */ zzgz zzm() {
        return super.zzm();
    }

    @Override // com.google.android.gms.measurement.internal.zzim, com.google.android.gms.measurement.internal.zzio
    @Pure
    public final /* bridge */ /* synthetic */ zzhj zzl() {
        return super.zzl();
    }

    @Override // com.google.android.gms.measurement.internal.zzne
    public final /* bridge */ /* synthetic */ zzmi zzn() {
        return super.zzn();
    }

    final zzna zza(String str, zzfu.zzj.zza zzaVar, zzfu.zze.zza zzaVar2, String str2) {
        int iIndexOf;
        if (!zzpz.zza() || !zze().zze(str, zzbf.zzce)) {
            return null;
        }
        long jCurrentTimeMillis = zzb().currentTimeMillis();
        Set setZza = zznu.zza(zze().zzd(str, zzbf.zzbe).split(","));
        Uri.Builder builderZza = zzo().zza(str);
        zza(builderZza, "gmp_app_id", zzaVar.zzx(), (Set<String>) setZza);
        zza(builderZza, "gmp_version", "92000", (Set<String>) setZza);
        String strZzu = zzaVar.zzu();
        String str3 = "";
        if (zze().zze(str, zzbf.zzch) && zzm().zzp(str)) {
            strZzu = "";
        }
        zza(builderZza, "app_instance_id", strZzu, (Set<String>) setZza);
        zza(builderZza, "rdid", zzaVar.zzz(), (Set<String>) setZza);
        zza(builderZza, "bundle_id", zzaVar.zzt(), (Set<String>) setZza);
        String strZze = zzaVar2.zze();
        String strZza = zziu.zza(strZze);
        if (!TextUtils.isEmpty(strZza)) {
            strZze = strZza;
        }
        zza(builderZza, "app_event_name", strZze, (Set<String>) setZza);
        zza(builderZza, "app_version", String.valueOf(zzaVar.zzb()), (Set<String>) setZza);
        String strZzy = zzaVar.zzy();
        if (!zze().zze(str, zzbf.zzch) || !zzm().zzt(str)) {
            str3 = strZzy;
        } else if (zze().zze(str, zzbf.zzbw)) {
            if (!TextUtils.isEmpty(strZzy) && (iIndexOf = strZzy.indexOf(".")) != -1) {
                strZzy = strZzy.substring(0, iIndexOf);
            }
            str3 = strZzy;
        }
        zza(builderZza, "os_version", str3, (Set<String>) setZza);
        zza(builderZza, "timestamp", String.valueOf(zzaVar2.zzc()), (Set<String>) setZza);
        if (zzaVar.zzad()) {
            zza(builderZza, i5.p, "1", (Set<String>) setZza);
        }
        zza(builderZza, "privacy_sandbox_version", String.valueOf(zzaVar.zza()), (Set<String>) setZza);
        zza(builderZza, "trigger_uri_source", "1", (Set<String>) setZza);
        zza(builderZza, "trigger_uri_timestamp", String.valueOf(jCurrentTimeMillis), (Set<String>) setZza);
        zza(builderZza, "request_uuid", str2, (Set<String>) setZza);
        zza(builderZza, zze().zzd(str, zzbf.zzbd).split("\\|"), zzb(zzaVar2.zzf()), (Set<String>) setZza);
        zza(builderZza, zze().zzd(str, zzbf.zzbc).split("\\|"), zzc(zzaVar.zzab()), (Set<String>) setZza);
        zza(builderZza, "dma", zzaVar.zzac() ? "1" : "0", (Set<String>) setZza);
        if (!zzaVar.zzw().isEmpty()) {
            zza(builderZza, "dma_cps", zzaVar.zzw(), (Set<String>) setZza);
        }
        return new zzna(builderZza.build().toString(), jCurrentTimeMillis, 1);
    }

    final zzna zza(String str, zzfu.zzj zzjVar, zzfu.zze.zza zzaVar, String str2) {
        int iIndexOf;
        if (!zzpz.zza() || !zze().zze(str, zzbf.zzce)) {
            return null;
        }
        long jCurrentTimeMillis = zzb().currentTimeMillis();
        Set setZza = zznu.zza(zze().zzd(str, zzbf.zzbe).split(","));
        Uri.Builder builderZza = zzo().zza(str);
        zza(builderZza, "gmp_app_id", zzjVar.zzai(), (Set<String>) setZza);
        zza(builderZza, "gmp_version", "92000", (Set<String>) setZza);
        String strZzz = zzjVar.zzz();
        String str3 = "";
        if (zze().zze(str, zzbf.zzch) && zzm().zzp(str)) {
            strZzz = "";
        }
        zza(builderZza, "app_instance_id", strZzz, (Set<String>) setZza);
        zza(builderZza, "rdid", zzjVar.zzam(), (Set<String>) setZza);
        zza(builderZza, "bundle_id", zzjVar.zzy(), (Set<String>) setZza);
        String strZze = zzaVar.zze();
        String strZza = zziu.zza(strZze);
        if (!TextUtils.isEmpty(strZza)) {
            strZze = strZza;
        }
        zza(builderZza, "app_event_name", strZze, (Set<String>) setZza);
        zza(builderZza, "app_version", String.valueOf(zzjVar.zzb()), (Set<String>) setZza);
        String strZzak = zzjVar.zzak();
        if (!zze().zze(str, zzbf.zzch) || !zzm().zzt(str)) {
            str3 = strZzak;
        } else if (zze().zze(str, zzbf.zzbw)) {
            if (!TextUtils.isEmpty(strZzak) && (iIndexOf = strZzak.indexOf(".")) != -1) {
                strZzak = strZzak.substring(0, iIndexOf);
            }
            str3 = strZzak;
        }
        zza(builderZza, "os_version", str3, (Set<String>) setZza);
        zza(builderZza, "timestamp", String.valueOf(zzaVar.zzc()), (Set<String>) setZza);
        if (zzjVar.zzau()) {
            zza(builderZza, i5.p, "1", (Set<String>) setZza);
        }
        zza(builderZza, "privacy_sandbox_version", String.valueOf(zzjVar.zza()), (Set<String>) setZza);
        zza(builderZza, "trigger_uri_source", "1", (Set<String>) setZza);
        zza(builderZza, "trigger_uri_timestamp", String.valueOf(jCurrentTimeMillis), (Set<String>) setZza);
        zza(builderZza, "request_uuid", str2, (Set<String>) setZza);
        zza(builderZza, zze().zzd(str, zzbf.zzbd).split("\\|"), zzb(zzaVar.zzf()), (Set<String>) setZza);
        zza(builderZza, zze().zzd(str, zzbf.zzbc).split("\\|"), zzc(zzjVar.zzar()), (Set<String>) setZza);
        zza(builderZza, "dma", zzjVar.zzat() ? "1" : "0", (Set<String>) setZza);
        if (!zzjVar.zzae().isEmpty()) {
            zza(builderZza, "dma_cps", zzjVar.zzae(), (Set<String>) setZza);
        }
        return new zzna(builderZza.build().toString(), jCurrentTimeMillis, 1);
    }

    @Override // com.google.android.gms.measurement.internal.zzne
    public final /* bridge */ /* synthetic */ zzng zzo() {
        return super.zzo();
    }

    @Override // com.google.android.gms.measurement.internal.zzne
    public final /* bridge */ /* synthetic */ zznr g_() {
        return super.g_();
    }

    @Override // com.google.android.gms.measurement.internal.zzim
    @Pure
    public final /* bridge */ /* synthetic */ zzny zzq() {
        return super.zzq();
    }

    final zzfu.zze zza(zzba zzbaVar) throws IllegalStateException {
        zzfu.zze.zza zzaVarZza = zzfu.zze.zze().zza(zzbaVar.zzd);
        Iterator<String> it = zzbaVar.zze.iterator();
        while (it.hasNext()) {
            String next = it.next();
            zzfu.zzg.zza zzaVarZza2 = zzfu.zzg.zze().zza(next);
            Object objZzc = zzbaVar.zze.zzc(next);
            Preconditions.checkNotNull(objZzc);
            zza(zzaVarZza2, objZzc);
            zzaVarZza.zza(zzaVarZza2);
        }
        return (zzfu.zze) ((com.google.android.gms.internal.measurement.zzjv) zzaVarZza.zzah());
    }

    static zzfu.zzg zza(zzfu.zze zzeVar, String str) {
        for (zzfu.zzg zzgVar : zzeVar.zzh()) {
            if (zzgVar.zzg().equals(str)) {
                return zzgVar;
            }
        }
        return null;
    }

    static <BuilderT extends com.google.android.gms.internal.measurement.zzlh> BuilderT zza(BuilderT buildert, byte[] bArr) throws com.google.android.gms.internal.measurement.zzkd {
        com.google.android.gms.internal.measurement.zzji zzjiVarZza = com.google.android.gms.internal.measurement.zzji.zza();
        if (zzjiVarZza != null) {
            return (BuilderT) buildert.zza(bArr, zzjiVarZza);
        }
        return (BuilderT) buildert.zza(bArr);
    }

    static Object zzb(zzfu.zze zzeVar, String str) {
        zzfu.zzg zzgVarZza = zza(zzeVar, str);
        if (zzgVarZza == null) {
            return null;
        }
        if (zzgVarZza.zzn()) {
            return zzgVarZza.zzh();
        }
        if (zzgVarZza.zzl()) {
            return Long.valueOf(zzgVarZza.zzd());
        }
        if (zzgVarZza.zzj()) {
            return Double.valueOf(zzgVarZza.zza());
        }
        if (zzgVarZza.zzc() <= 0) {
            return null;
        }
        List<zzfu.zzg> listZzi = zzgVarZza.zzi();
        ArrayList arrayList = new ArrayList();
        for (zzfu.zzg zzgVar : listZzi) {
            if (zzgVar != null) {
                Bundle bundle = new Bundle();
                for (zzfu.zzg zzgVar2 : zzgVar.zzi()) {
                    if (zzgVar2.zzn()) {
                        bundle.putString(zzgVar2.zzg(), zzgVar2.zzh());
                    } else if (zzgVar2.zzl()) {
                        bundle.putLong(zzgVar2.zzg(), zzgVar2.zzd());
                    } else if (zzgVar2.zzj()) {
                        bundle.putDouble(zzgVar2.zzg(), zzgVar2.zza());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    final String zza(zzfu.zzi zziVar) {
        zzfu.zzb zzbVarZzu;
        if (zziVar == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nbatch {\n");
        if (zzqr.zza() && zze().zza(zzbf.zzbt) && zziVar.zza() > 0) {
            zzq();
            if (zzny.zzf(zziVar.zza(0).zzy()) && zziVar.zzf()) {
                zza(sb, 0, "UploadSubdomain", zziVar.zzd());
            }
        }
        for (zzfu.zzj zzjVar : zziVar.zze()) {
            if (zzjVar != null) {
                zza(sb, 1);
                sb.append("bundle {\n");
                if (zzjVar.zzbm()) {
                    zza(sb, 1, "protocol_version", Integer.valueOf(zzjVar.zzf()));
                }
                if (zzql.zza() && zze().zze(zzjVar.zzy(), zzbf.zzbs) && zzjVar.zzbp()) {
                    zza(sb, 1, "session_stitching_token", zzjVar.zzan());
                }
                zza(sb, 1, "platform", zzjVar.zzal());
                if (zzjVar.zzbh()) {
                    zza(sb, 1, "gmp_version", Long.valueOf(zzjVar.zzn()));
                }
                if (zzjVar.zzbu()) {
                    zza(sb, 1, "uploading_gmp_version", Long.valueOf(zzjVar.zzt()));
                }
                if (zzjVar.zzbf()) {
                    zza(sb, 1, "dynamite_version", Long.valueOf(zzjVar.zzl()));
                }
                if (zzjVar.zzaz()) {
                    zza(sb, 1, "config_version", Long.valueOf(zzjVar.zzj()));
                }
                zza(sb, 1, "gmp_app_id", zzjVar.zzai());
                zza(sb, 1, "admob_app_id", zzjVar.zzx());
                zza(sb, 1, "app_id", zzjVar.zzy());
                zza(sb, 1, "app_version", zzjVar.zzab());
                if (zzjVar.zzaw()) {
                    zza(sb, 1, "app_version_major", Integer.valueOf(zzjVar.zzb()));
                }
                zza(sb, 1, "firebase_instance_id", zzjVar.zzah());
                if (zzjVar.zzbe()) {
                    zza(sb, 1, "dev_cert_hash", Long.valueOf(zzjVar.zzk()));
                }
                zza(sb, 1, "app_store", zzjVar.zzaa());
                if (zzjVar.zzbt()) {
                    zza(sb, 1, "upload_timestamp_millis", Long.valueOf(zzjVar.zzs()));
                }
                if (zzjVar.zzbq()) {
                    zza(sb, 1, "start_timestamp_millis", Long.valueOf(zzjVar.zzq()));
                }
                if (zzjVar.zzbg()) {
                    zza(sb, 1, "end_timestamp_millis", Long.valueOf(zzjVar.zzm()));
                }
                if (zzjVar.zzbl()) {
                    zza(sb, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(zzjVar.zzp()));
                }
                if (zzjVar.zzbk()) {
                    zza(sb, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(zzjVar.zzo()));
                }
                zza(sb, 1, "app_instance_id", zzjVar.zzz());
                zza(sb, 1, "resettable_device_id", zzjVar.zzam());
                zza(sb, 1, "ds_id", zzjVar.zzag());
                if (zzjVar.zzbj()) {
                    zza(sb, 1, "limited_ad_tracking", Boolean.valueOf(zzjVar.zzau()));
                }
                zza(sb, 1, "os_version", zzjVar.zzak());
                zza(sb, 1, "device_model", zzjVar.zzaf());
                zza(sb, 1, "user_default_language", zzjVar.zzao());
                if (zzjVar.zzbs()) {
                    zza(sb, 1, "time_zone_offset_minutes", Integer.valueOf(zzjVar.zzh()));
                }
                if (zzjVar.zzay()) {
                    zza(sb, 1, "bundle_sequential_index", Integer.valueOf(zzjVar.zzc()));
                }
                if (zzqr.zza()) {
                    zzq();
                    if (zzny.zzf(zzjVar.zzy()) && zze().zza(zzbf.zzbt) && zzjVar.zzbd()) {
                        zza(sb, 1, "delivery_index", Integer.valueOf(zzjVar.zzd()));
                    }
                }
                if (zzjVar.zzbo()) {
                    zza(sb, 1, "service_upload", Boolean.valueOf(zzjVar.zzav()));
                }
                zza(sb, 1, "health_monitor", zzjVar.h_());
                if (zzjVar.zzbn()) {
                    zza(sb, 1, "retry_counter", Integer.valueOf(zzjVar.zzg()));
                }
                if (zzjVar.zzbb()) {
                    zza(sb, 1, "consent_signals", zzjVar.zzad());
                }
                if (zzjVar.zzbi()) {
                    zza(sb, 1, "is_dma_region", Boolean.valueOf(zzjVar.zzat()));
                }
                if (zzjVar.zzbc()) {
                    zza(sb, 1, "core_platform_services", zzjVar.zzae());
                }
                if (zzjVar.zzba()) {
                    zza(sb, 1, "consent_diagnostics", zzjVar.zzac());
                }
                if (zzjVar.zzbr()) {
                    zza(sb, 1, "target_os_version", Long.valueOf(zzjVar.zzr()));
                }
                if (zzpz.zza() && zze().zze(zzjVar.zzy(), zzbf.zzce)) {
                    zza(sb, 1, "ad_services_version", Integer.valueOf(zzjVar.zza()));
                    if (zzjVar.zzax() && (zzbVarZzu = zzjVar.zzu()) != null) {
                        zza(sb, 2);
                        sb.append("attribution_eligibility_status {\n");
                        zza(sb, 2, "eligible", Boolean.valueOf(zzbVarZzu.zzf()));
                        zza(sb, 2, "no_access_adservices_attribution_permission", Boolean.valueOf(zzbVarZzu.zzh()));
                        zza(sb, 2, "pre_r", Boolean.valueOf(zzbVarZzu.zzi()));
                        zza(sb, 2, "r_extensions_too_old", Boolean.valueOf(zzbVarZzu.zzj()));
                        zza(sb, 2, "adservices_extension_too_old", Boolean.valueOf(zzbVarZzu.zze()));
                        zza(sb, 2, "ad_storage_not_allowed", Boolean.valueOf(zzbVarZzu.zzd()));
                        zza(sb, 2, "measurement_manager_disabled", Boolean.valueOf(zzbVarZzu.zzg()));
                        zza(sb, 2);
                        sb.append("}\n");
                    }
                }
                List<zzfu.zzn> listZzar = zzjVar.zzar();
                if (listZzar != null) {
                    for (zzfu.zzn zznVar : listZzar) {
                        if (zznVar != null) {
                            zza(sb, 2);
                            sb.append("user_property {\n");
                            zza(sb, 2, "set_timestamp_millis", zznVar.zzl() ? Long.valueOf(zznVar.zzd()) : null);
                            zza(sb, 2, "name", zzi().zzc(zznVar.zzg()));
                            zza(sb, 2, "string_value", zznVar.zzh());
                            zza(sb, 2, "int_value", zznVar.zzk() ? Long.valueOf(zznVar.zzc()) : null);
                            zza(sb, 2, "double_value", zznVar.zzi() ? Double.valueOf(zznVar.zza()) : null);
                            zza(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<zzfu.zzc> listZzap = zzjVar.zzap();
                zzjVar.zzy();
                if (listZzap != null) {
                    for (zzfu.zzc zzcVar : listZzap) {
                        if (zzcVar != null) {
                            zza(sb, 2);
                            sb.append("audience_membership {\n");
                            if (zzcVar.zzg()) {
                                zza(sb, 2, "audience_id", Integer.valueOf(zzcVar.zza()));
                            }
                            if (zzcVar.zzh()) {
                                zza(sb, 2, "new_audience", Boolean.valueOf(zzcVar.zzf()));
                            }
                            zza(sb, 2, "current_data", zzcVar.zzd());
                            if (zzcVar.zzi()) {
                                zza(sb, 2, "previous_data", zzcVar.zze());
                            }
                            zza(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<zzfu.zze> listZzaq = zzjVar.zzaq();
                if (listZzaq != null) {
                    for (zzfu.zze zzeVar : listZzaq) {
                        if (zzeVar != null) {
                            zza(sb, 2);
                            sb.append("event {\n");
                            zza(sb, 2, "name", zzi().zza(zzeVar.zzg()));
                            if (zzeVar.zzk()) {
                                zza(sb, 2, "timestamp_millis", Long.valueOf(zzeVar.zzd()));
                            }
                            if (zzeVar.zzj()) {
                                zza(sb, 2, "previous_timestamp_millis", Long.valueOf(zzeVar.zzc()));
                            }
                            if (zzeVar.zzi()) {
                                zza(sb, 2, "count", Integer.valueOf(zzeVar.zza()));
                            }
                            if (zzeVar.zzb() != 0) {
                                zza(sb, 2, zzeVar.zzh());
                            }
                            zza(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                zza(sb, 1);
                sb.append("}\n");
            }
        }
        sb.append("}\n");
        return sb.toString();
    }

    final String zza(zzfi.zzb zzbVar) {
        if (zzbVar == null) {
            return AbstractJsonLexerKt.NULL;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nevent_filter {\n");
        if (zzbVar.zzl()) {
            zza(sb, 0, "filter_id", Integer.valueOf(zzbVar.zzb()));
        }
        zza(sb, 0, "event_name", zzi().zza(zzbVar.zzf()));
        String strZza = zza(zzbVar.zzh(), zzbVar.zzi(), zzbVar.zzj());
        if (!strZza.isEmpty()) {
            zza(sb, 0, "filter_type", strZza);
        }
        if (zzbVar.zzk()) {
            zza(sb, 1, "event_count_filter", zzbVar.zze());
        }
        if (zzbVar.zza() > 0) {
            sb.append("  filters {\n");
            Iterator<zzfi.zzc> it = zzbVar.zzg().iterator();
            while (it.hasNext()) {
                zza(sb, 2, it.next());
            }
        }
        zza(sb, 1);
        sb.append("}\n}\n");
        return sb.toString();
    }

    private static String zza(boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("Dynamic ");
        }
        if (z2) {
            sb.append("Sequence ");
        }
        if (z3) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    final String zza(zzfi.zze zzeVar) {
        if (zzeVar == null) {
            return AbstractJsonLexerKt.NULL;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nproperty_filter {\n");
        if (zzeVar.zzi()) {
            zza(sb, 0, "filter_id", Integer.valueOf(zzeVar.zza()));
        }
        zza(sb, 0, "property_name", zzi().zzc(zzeVar.zze()));
        String strZza = zza(zzeVar.zzf(), zzeVar.zzg(), zzeVar.zzh());
        if (!strZza.isEmpty()) {
            zza(sb, 0, "filter_type", strZza);
        }
        zza(sb, 1, zzeVar.zzb());
        sb.append("}\n");
        return sb.toString();
    }

    final List<Long> zza(List<Long> list, List<Integer> list2) throws IllegalStateException {
        int i;
        ArrayList arrayList = new ArrayList(list);
        for (Integer num : list2) {
            if (num.intValue() < 0) {
                zzj().zzu().zza("Ignoring negative bit index to be cleared", num);
            } else {
                int iIntValue = num.intValue() / 64;
                if (iIntValue >= arrayList.size()) {
                    zzj().zzu().zza("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(iIntValue, Long.valueOf(((Long) arrayList.get(iIntValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i2 = size2;
            i = size;
            size = i2;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i);
    }

    final List<Integer> zzu() throws IllegalStateException, NumberFormatException {
        Map<String, String> mapZza = zzbf.zza(this.zzf.zza());
        if (mapZza == null || mapZza.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int iIntValue = zzbf.zzap.zza(null).intValue();
        for (Map.Entry<String, String> entry : mapZza.entrySet()) {
            if (entry.getKey().startsWith("measurement.id.")) {
                try {
                    int i = Integer.parseInt(entry.getValue());
                    if (i != 0) {
                        arrayList.add(Integer.valueOf(i));
                        if (arrayList.size() >= iIntValue) {
                            zzj().zzu().zza("Too many experiment IDs. Number of IDs", Integer.valueOf(arrayList.size()));
                            break;
                        }
                        continue;
                    } else {
                        continue;
                    }
                } catch (NumberFormatException e) {
                    zzj().zzu().zza("Experiment ID NumberFormatException", e);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    static List<Long> zza(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            long j = 0;
            for (int i2 = 0; i2 < 64; i2++) {
                int i3 = (i << 6) + i2;
                if (i3 < bitSet.length()) {
                    if (bitSet.get(i3)) {
                        j |= 1 << i2;
                    }
                }
            }
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    final Map<String, Object> zza(Bundle bundle, boolean z) {
        HashMap map = new HashMap();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            boolean z2 = obj instanceof Parcelable[];
            if (z2 || (obj instanceof ArrayList) || (obj instanceof Bundle)) {
                if (z) {
                    ArrayList arrayList = new ArrayList();
                    if (z2) {
                        for (Parcelable parcelable : (Parcelable[]) obj) {
                            if (parcelable instanceof Bundle) {
                                arrayList.add(zza((Bundle) parcelable, false));
                            }
                        }
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList2 = (ArrayList) obj;
                        int size = arrayList2.size();
                        int i = 0;
                        while (i < size) {
                            Object obj2 = arrayList2.get(i);
                            i++;
                            if (obj2 instanceof Bundle) {
                                arrayList.add(zza((Bundle) obj2, false));
                            }
                        }
                    } else if (obj instanceof Bundle) {
                        arrayList.add(zza((Bundle) obj, false));
                    }
                    map.put(str, arrayList);
                }
            } else if (obj != null) {
                map.put(str, obj);
            }
        }
        return map;
    }

    zznr(zzni zzniVar) {
        super(zzniVar);
    }

    static void zza(zzfu.zze.zza zzaVar, String str, Object obj) {
        List<zzfu.zzg> listZzf = zzaVar.zzf();
        int i = 0;
        while (true) {
            if (i >= listZzf.size()) {
                i = -1;
                break;
            } else if (str.equals(listZzf.get(i).zzg())) {
                break;
            } else {
                i++;
            }
        }
        zzfu.zzg.zza zzaVarZza = zzfu.zzg.zze().zza(str);
        if (obj instanceof Long) {
            zzaVarZza.zza(((Long) obj).longValue());
        } else if (obj instanceof String) {
            zzaVarZza.zzb((String) obj);
        } else if (obj instanceof Double) {
            zzaVarZza.zza(((Double) obj).doubleValue());
        }
        if (i >= 0) {
            zzaVar.zza(i, zzaVarZza);
        } else {
            zzaVar.zza(zzaVarZza);
        }
    }

    private static void zza(Uri.Builder builder, String[] strArr, Bundle bundle, Set<String> set) {
        for (String str : strArr) {
            String[] strArrSplit = str.split(",");
            String str2 = strArrSplit[0];
            String str3 = strArrSplit[strArrSplit.length - 1];
            String string = bundle.getString(str2);
            if (string != null) {
                zza(builder, str3, string, set);
            }
        }
    }

    private static void zza(StringBuilder sb, int i, String str, zzfu.zzl zzlVar) {
        if (zzlVar == null) {
            return;
        }
        zza(sb, 3);
        sb.append(str);
        sb.append(" {\n");
        if (zzlVar.zzb() != 0) {
            zza(sb, 4);
            sb.append("results: ");
            int i2 = 0;
            for (Long l : zzlVar.zzi()) {
                int i3 = i2 + 1;
                if (i2 != 0) {
                    sb.append(", ");
                }
                sb.append(l);
                i2 = i3;
            }
            sb.append('\n');
        }
        if (zzlVar.zzd() != 0) {
            zza(sb, 4);
            sb.append("status: ");
            int i4 = 0;
            for (Long l2 : zzlVar.zzk()) {
                int i5 = i4 + 1;
                if (i4 != 0) {
                    sb.append(", ");
                }
                sb.append(l2);
                i4 = i5;
            }
            sb.append('\n');
        }
        if (zzlVar.zza() != 0) {
            zza(sb, 4);
            sb.append("dynamic_filter_timestamps: {");
            int i6 = 0;
            for (zzfu.zzd zzdVar : zzlVar.zzh()) {
                int i7 = i6 + 1;
                if (i6 != 0) {
                    sb.append(", ");
                }
                sb.append(zzdVar.zzf() ? Integer.valueOf(zzdVar.zza()) : null);
                sb.append(":");
                sb.append(zzdVar.zze() ? Long.valueOf(zzdVar.zzb()) : null);
                i6 = i7;
            }
            sb.append("}\n");
        }
        if (zzlVar.zzc() != 0) {
            zza(sb, 4);
            sb.append("sequence_filter_timestamps: {");
            int i8 = 0;
            for (zzfu.zzm zzmVar : zzlVar.zzj()) {
                int i9 = i8 + 1;
                if (i8 != 0) {
                    sb.append(", ");
                }
                sb.append(zzmVar.zzf() ? Integer.valueOf(zzmVar.zzb()) : null);
                sb.append(": [");
                Iterator<Long> it = zzmVar.zze().iterator();
                int i10 = 0;
                while (it.hasNext()) {
                    long jLongValue = it.next().longValue();
                    int i11 = i10 + 1;
                    if (i10 != 0) {
                        sb.append(", ");
                    }
                    sb.append(jLongValue);
                    i10 = i11;
                }
                sb.append(t2.i.e);
                i8 = i9;
            }
            sb.append("}\n");
        }
        zza(sb, 3);
        sb.append("}\n");
    }

    private final void zza(StringBuilder sb, int i, List<zzfu.zzg> list) {
        if (list == null) {
            return;
        }
        int i2 = i + 1;
        for (zzfu.zzg zzgVar : list) {
            if (zzgVar != null) {
                zza(sb, i2);
                sb.append("param {\n");
                zza(sb, i2, "name", zzgVar.zzm() ? zzi().zzb(zzgVar.zzg()) : null);
                zza(sb, i2, "string_value", zzgVar.zzn() ? zzgVar.zzh() : null);
                zza(sb, i2, "int_value", zzgVar.zzl() ? Long.valueOf(zzgVar.zzd()) : null);
                zza(sb, i2, "double_value", zzgVar.zzj() ? Double.valueOf(zzgVar.zza()) : null);
                if (zzgVar.zzc() > 0) {
                    zza(sb, i2, zzgVar.zzi());
                }
                zza(sb, i2);
                sb.append("}\n");
            }
        }
    }

    private final void zza(StringBuilder sb, int i, zzfi.zzc zzcVar) {
        if (zzcVar == null) {
            return;
        }
        zza(sb, i);
        sb.append("filter {\n");
        if (zzcVar.zzg()) {
            zza(sb, i, "complement", Boolean.valueOf(zzcVar.zzf()));
        }
        if (zzcVar.zzi()) {
            zza(sb, i, "param_name", zzi().zzb(zzcVar.zze()));
        }
        if (zzcVar.zzj()) {
            int i2 = i + 1;
            zzfi.zzf zzfVarZzd = zzcVar.zzd();
            if (zzfVarZzd != null) {
                zza(sb, i2);
                sb.append("string_filter");
                sb.append(" {\n");
                if (zzfVarZzd.zzj()) {
                    zza(sb, i2, "match_type", zzfVarZzd.zzb().name());
                }
                if (zzfVarZzd.zzi()) {
                    zza(sb, i2, "expression", zzfVarZzd.zze());
                }
                if (zzfVarZzd.zzh()) {
                    zza(sb, i2, "case_sensitive", Boolean.valueOf(zzfVarZzd.zzg()));
                }
                if (zzfVarZzd.zza() > 0) {
                    zza(sb, i2 + 1);
                    sb.append("expression_list {\n");
                    for (String str : zzfVarZzd.zzf()) {
                        zza(sb, i2 + 2);
                        sb.append(str);
                        sb.append("\n");
                    }
                    sb.append("}\n");
                }
                zza(sb, i2);
                sb.append("}\n");
            }
        }
        if (zzcVar.zzh()) {
            zza(sb, i + 1, "number_filter", zzcVar.zzc());
        }
        zza(sb, i);
        sb.append("}\n");
    }

    private static void zza(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
    }

    private static void zza(StringBuilder sb, int i, String str, zzfi.zzd zzdVar) {
        if (zzdVar == null) {
            return;
        }
        zza(sb, i);
        sb.append(str);
        sb.append(" {\n");
        if (zzdVar.zzh()) {
            zza(sb, i, "comparison_type", zzdVar.zza().name());
        }
        if (zzdVar.zzj()) {
            zza(sb, i, "match_as_float", Boolean.valueOf(zzdVar.zzg()));
        }
        if (zzdVar.zzi()) {
            zza(sb, i, "comparison_value", zzdVar.zzd());
        }
        if (zzdVar.zzl()) {
            zza(sb, i, "min_comparison_value", zzdVar.zzf());
        }
        if (zzdVar.zzk()) {
            zza(sb, i, "max_comparison_value", zzdVar.zze());
        }
        zza(sb, i);
        sb.append("}\n");
    }

    private static void zza(Uri.Builder builder, String str, String str2, Set<String> set) {
        if (set.contains(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }

    private static void zza(StringBuilder sb, int i, String str, Object obj) {
        if (obj == null) {
            return;
        }
        zza(sb, i + 1);
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append('\n');
    }

    @Override // com.google.android.gms.measurement.internal.zzim
    public final /* bridge */ /* synthetic */ void zzr() {
        super.zzr();
    }

    @Override // com.google.android.gms.measurement.internal.zzim
    public final /* bridge */ /* synthetic */ void zzs() {
        super.zzs();
    }

    @Override // com.google.android.gms.measurement.internal.zzim
    public final /* bridge */ /* synthetic */ void zzt() {
        super.zzt();
    }

    final void zza(zzfu.zzj.zza zzaVar) throws IllegalStateException {
        zzj().zzp().zza("Checking account type status for ad personalization signals");
        if (zzc(zzaVar.zzt())) {
            zzj().zzc().zza("Turning off ad personalization due to account type");
            zzfu.zzn zznVar = (zzfu.zzn) ((com.google.android.gms.internal.measurement.zzjv) zzfu.zzn.zze().zza("_npa").zzb(zzf().zzc()).zza(1L).zzah());
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= zzaVar.zzd()) {
                    break;
                }
                if ("_npa".equals(zzaVar.zzk(i).zzg())) {
                    zzaVar.zza(i, zznVar);
                    z = true;
                    break;
                }
                i++;
            }
            if (!z) {
                zzaVar.zza(zznVar);
            }
            zzah zzahVarZza = zzah.zza(zzaVar.zzv());
            zzahVarZza.zza(zziq.zza.AD_PERSONALIZATION, zzak.CHILD_ACCOUNT);
            zzaVar.zzf(zzahVarZza.toString());
        }
    }

    final void zza(zzfu.zzg.zza zzaVar, Object obj) throws IllegalStateException {
        Preconditions.checkNotNull(obj);
        zzaVar.zze().zzc().zzb().zzd();
        if (obj instanceof String) {
            zzaVar.zzb((String) obj);
            return;
        }
        if (obj instanceof Long) {
            zzaVar.zza(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            zzaVar.zza(((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof Bundle[]) {
            ArrayList arrayList = new ArrayList();
            for (Bundle bundle : (Bundle[]) obj) {
                if (bundle != null) {
                    zzfu.zzg.zza zzaVarZze = zzfu.zzg.zze();
                    for (String str : bundle.keySet()) {
                        zzfu.zzg.zza zzaVarZza = zzfu.zzg.zze().zza(str);
                        Object obj2 = bundle.get(str);
                        if (obj2 instanceof Long) {
                            zzaVarZza.zza(((Long) obj2).longValue());
                        } else if (obj2 instanceof String) {
                            zzaVarZza.zzb((String) obj2);
                        } else if (obj2 instanceof Double) {
                            zzaVarZza.zza(((Double) obj2).doubleValue());
                        }
                        zzaVarZze.zza(zzaVarZza);
                    }
                    if (zzaVarZze.zza() > 0) {
                        arrayList.add((zzfu.zzg) ((com.google.android.gms.internal.measurement.zzjv) zzaVarZze.zzah()));
                    }
                }
            }
            zzaVar.zza(arrayList);
            return;
        }
        zzj().zzg().zza("Ignoring invalid (type) event param value", obj);
    }

    final void zza(zzfu.zzn.zza zzaVar, Object obj) throws IllegalStateException {
        Preconditions.checkNotNull(obj);
        zzaVar.zzc().zzb().zza();
        if (obj instanceof String) {
            zzaVar.zzb((String) obj);
            return;
        }
        if (obj instanceof Long) {
            zzaVar.zza(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            zzaVar.zza(((Double) obj).doubleValue());
        } else {
            zzj().zzg().zza("Ignoring invalid (type) user attribute value", obj);
        }
    }

    static boolean zza(zzbd zzbdVar, zzo zzoVar) {
        Preconditions.checkNotNull(zzbdVar);
        Preconditions.checkNotNull(zzoVar);
        return (TextUtils.isEmpty(zzoVar.zzb) && TextUtils.isEmpty(zzoVar.zzp)) ? false : true;
    }

    static boolean zza(List<Long> list, int i) {
        if (i < (list.size() << 6)) {
            return ((1 << (i % 64)) & list.get(i / 64).longValue()) != 0;
        }
        return false;
    }

    final boolean zza(long j, long j2) {
        return j == 0 || j2 <= 0 || Math.abs(zzb().currentTimeMillis() - j) > j2;
    }

    static boolean zzb(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    final boolean zzc(String str) {
        if (zzok.zza() && zze().zza(zzbf.zzcv)) {
            return false;
        }
        Preconditions.checkNotNull(str);
        zzg zzgVarZze = zzh().zze(str);
        return zzgVarZze != null && zzf().zzn() && zzgVarZze.zzaq() && zzm().zzk(str);
    }

    final byte[] zzb(byte[] bArr) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            zzj().zzg().zza("Failed to gzip content", e);
            throw e;
        }
    }

    final byte[] zzc(byte[] bArr) throws IllegalStateException, IOException {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[1024];
            while (true) {
                int i = gZIPInputStream.read(bArr2);
                if (i > 0) {
                    byteArrayOutputStream.write(bArr2, 0, i);
                } else {
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (IOException e) {
            zzj().zzg().zza("Failed to ungzip content", e);
            throw e;
        }
    }
}
