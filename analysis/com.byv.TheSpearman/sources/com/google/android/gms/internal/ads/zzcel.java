package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzcel extends zzary {
    static final zzcel zzb = new zzcel();

    zzcel() {
    }

    @Override // com.google.android.gms.internal.ads.zzary
    public final zzasc zza(String str, byte[] bArr, String str2) {
        return "moov".equals(str) ? new zzase() : "mvhd".equals(str) ? new zzasf() : new zzasg(str);
    }
}
