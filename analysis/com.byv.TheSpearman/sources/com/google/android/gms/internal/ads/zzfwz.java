package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
final class zzfwz extends zzfxc {
    final /* synthetic */ zzfxa zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfwz(zzfxa zzfxaVar, zzfxe zzfxeVar, CharSequence charSequence) {
        super(zzfxeVar, charSequence);
        this.zza = zzfxaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfxc
    public final int zzc(int i) {
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzfxc
    public final int zzd(int i) {
        int i2 = i + 4000;
        if (i2 < this.zzb.length()) {
            return i2;
        }
        return -1;
    }
}
