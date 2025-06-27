package com.google.android.gms.internal.ads;

import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
abstract class zzfxc extends zzfvw {
    final CharSequence zzb;
    final zzfwc zzc;
    int zzd = 0;
    int zze = Integer.MAX_VALUE;

    protected zzfxc(zzfxe zzfxeVar, CharSequence charSequence) {
        this.zzc = zzfxeVar.zza;
        this.zzb = charSequence;
    }

    @Override // com.google.android.gms.internal.ads.zzfvw
    @CheckForNull
    protected final /* bridge */ /* synthetic */ Object zza() {
        int iZzc;
        int i = this.zzd;
        while (true) {
            int i2 = this.zzd;
            if (i2 == -1) {
                zzb();
                return null;
            }
            int iZzd = zzd(i2);
            if (iZzd == -1) {
                iZzd = this.zzb.length();
                this.zzd = -1;
                iZzc = -1;
            } else {
                iZzc = zzc(iZzd);
                this.zzd = iZzc;
            }
            if (iZzc != i) {
                if (i < iZzd) {
                    this.zzb.charAt(i);
                }
                if (i < iZzd) {
                    this.zzb.charAt(iZzd - 1);
                }
                int i3 = this.zze;
                if (i3 == 1) {
                    iZzd = this.zzb.length();
                    this.zzd = -1;
                    if (iZzd > i) {
                        this.zzb.charAt(iZzd - 1);
                    }
                } else {
                    this.zze = i3 - 1;
                }
                return this.zzb.subSequence(i, iZzd).toString();
            }
            int i4 = iZzc + 1;
            this.zzd = i4;
            if (i4 > this.zzb.length()) {
                this.zzd = -1;
            }
        }
    }

    abstract int zzc(int i);

    abstract int zzd(int i);
}
