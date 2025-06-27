package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public abstract class zzejs implements zzegj {
    private static Bundle zzd(Bundle bundle) {
        return bundle == null ? new Bundle() : new Bundle(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzegj
    public final ListenableFuture zza(zzffz zzffzVar, zzffn zzffnVar) {
        String strOptString = zzffnVar.zzw.optString("pubid", "");
        zzfgi zzfgiVar = zzffzVar.zza.zza;
        zzfgg zzfggVar = new zzfgg();
        zzfggVar.zzq(zzfgiVar);
        zzfggVar.zzt(strOptString);
        Bundle bundleZzd = zzd(zzfgiVar.zzd.zzm);
        Bundle bundleZzd2 = zzd(bundleZzd.getBundle("com.google.ads.mediation.admob.AdMobAdapter"));
        bundleZzd2.putInt("gw", 1);
        String strOptString2 = zzffnVar.zzw.optString("mad_hac", null);
        if (strOptString2 != null) {
            bundleZzd2.putString("mad_hac", strOptString2);
        }
        String strOptString3 = zzffnVar.zzw.optString("adJson", null);
        if (strOptString3 != null) {
            bundleZzd2.putString("_ad", strOptString3);
        }
        bundleZzd2.putBoolean("_noRefresh", true);
        Iterator<String> itKeys = zzffnVar.zzE.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOptString4 = zzffnVar.zzE.optString(next, null);
            if (next != null) {
                bundleZzd2.putString(next, strOptString4);
            }
        }
        bundleZzd.putBundle("com.google.ads.mediation.admob.AdMobAdapter", bundleZzd2);
        com.google.android.gms.ads.internal.client.zzl zzlVar = zzfgiVar.zzd;
        Bundle bundle = zzlVar.zzn;
        List list = zzlVar.zzo;
        String str = zzlVar.zzp;
        String str2 = zzlVar.zzq;
        int i = zzlVar.zzd;
        boolean z = zzlVar.zzr;
        List list2 = zzlVar.zze;
        com.google.android.gms.ads.internal.client.zzc zzcVar = zzlVar.zzs;
        boolean z2 = zzlVar.zzf;
        int i2 = zzlVar.zzt;
        int i3 = zzlVar.zzg;
        String str3 = zzlVar.zzu;
        boolean z3 = zzlVar.zzh;
        List list3 = zzlVar.zzv;
        String str4 = zzlVar.zzi;
        int i4 = zzlVar.zzw;
        zzfggVar.zzG(new com.google.android.gms.ads.internal.client.zzl(zzlVar.zza, zzlVar.zzb, bundleZzd2, i, list2, z2, i3, z3, str4, zzlVar.zzj, zzlVar.zzk, zzlVar.zzl, bundleZzd, bundle, list, str, str2, z, zzcVar, i2, str3, list3, i4, zzlVar.zzx, zzlVar.zzy, zzlVar.zzz));
        zzfgi zzfgiVarZzI = zzfggVar.zzI();
        Bundle bundle2 = new Bundle();
        zzffq zzffqVar = zzffzVar.zzb.zzb;
        Bundle bundle3 = new Bundle();
        bundle3.putStringArrayList("nofill_urls", new ArrayList<>(zzffqVar.zza));
        bundle3.putInt("refresh_interval", zzffqVar.zzc);
        bundle3.putString("gws_query_id", zzffqVar.zzb);
        bundle2.putBundle("parent_common_config", bundle3);
        zzfgi zzfgiVar2 = zzffzVar.zza.zza;
        Bundle bundle4 = new Bundle();
        bundle4.putString("initial_ad_unit_id", zzfgiVar2.zzf);
        bundle4.putString("allocation_id", zzffnVar.zzx);
        bundle4.putStringArrayList("click_urls", new ArrayList<>(zzffnVar.zzc));
        bundle4.putStringArrayList("imp_urls", new ArrayList<>(zzffnVar.zzd));
        bundle4.putStringArrayList("manual_tracking_urls", new ArrayList<>(zzffnVar.zzq));
        bundle4.putStringArrayList("fill_urls", new ArrayList<>(zzffnVar.zzn));
        bundle4.putStringArrayList("video_start_urls", new ArrayList<>(zzffnVar.zzh));
        bundle4.putStringArrayList("video_reward_urls", new ArrayList<>(zzffnVar.zzi));
        bundle4.putStringArrayList("video_complete_urls", new ArrayList<>(zzffnVar.zzj));
        bundle4.putString("transaction_id", zzffnVar.zzk);
        bundle4.putString("valid_from_timestamp", zzffnVar.zzl);
        bundle4.putBoolean("is_closable_area_disabled", zzffnVar.zzQ);
        bundle4.putString("recursive_server_response_data", zzffnVar.zzap);
        if (zzffnVar.zzm != null) {
            Bundle bundle5 = new Bundle();
            bundle5.putInt("rb_amount", zzffnVar.zzm.zzb);
            bundle5.putString("rb_type", zzffnVar.zzm.zza);
            bundle4.putParcelableArray("rewards", new Bundle[]{bundle5});
        }
        bundle2.putBundle("parent_ad_config", bundle4);
        return zzc(zzfgiVarZzI, bundle2, zzffnVar, zzffzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzegj
    public final boolean zzb(zzffz zzffzVar, zzffn zzffnVar) {
        return !TextUtils.isEmpty(zzffnVar.zzw.optString("pubid", ""));
    }

    protected abstract ListenableFuture zzc(zzfgi zzfgiVar, Bundle bundle, zzffn zzffnVar, zzffz zzffzVar);
}
