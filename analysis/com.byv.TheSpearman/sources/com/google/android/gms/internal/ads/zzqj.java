package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzqj extends Exception {
    public final int zza;
    public final boolean zzb;
    public final zzam zzc;

    public zzqj(int i, int i2, int i3, int i4, zzam zzamVar, boolean z, Exception exc) {
        String strValueOf = String.valueOf(zzamVar);
        StringBuilder sb = new StringBuilder();
        sb.append("AudioTrack init failed ");
        sb.append(i);
        sb.append(" Config(");
        sb.append(i2);
        sb.append(", ");
        sb.append(i3);
        sb.append(", ");
        sb.append(i4);
        sb.append(") ");
        sb.append(strValueOf);
        sb.append(true != z ? "" : " (recoverable)");
        super(sb.toString(), exc);
        this.zza = i;
        this.zzb = z;
        this.zzc = zzamVar;
    }
}
