package com.google.android.gms.internal.ads;

import com.google.firebase.analytics.FirebaseAnalytics;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
final class zzfwx extends zzfxc {
    final /* synthetic */ zzfwy zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfwx(zzfwy zzfwyVar, zzfxe zzfxeVar, CharSequence charSequence) {
        super(zzfxeVar, charSequence);
        this.zza = zzfwyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfxc
    final int zzc(int i) {
        return i + 1;
    }

    @Override // com.google.android.gms.internal.ads.zzfxc
    final int zzd(int i) {
        CharSequence charSequence = this.zzb;
        int length = charSequence.length();
        zzfwr.zzb(i, length, FirebaseAnalytics.Param.INDEX);
        while (i < length) {
            zzfwy zzfwyVar = this.zza;
            if (zzfwyVar.zza.zzb(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
