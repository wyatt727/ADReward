package com.google.android.gms.internal.ads;

import java.io.File;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzawf implements zzfro {
    final /* synthetic */ zzfpi zza;

    zzawf(zzawh zzawhVar, zzfpi zzfpiVar) {
        this.zza = zzfpiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfro
    public final boolean zza(File file) {
        try {
            return this.zza.zza(file);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }
}
