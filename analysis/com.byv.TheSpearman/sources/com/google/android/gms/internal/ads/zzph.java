package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.net.Uri;
import android.provider.Settings;
import android.util.SparseArray;
import com.json.t2;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzph {
    static final zzfzq zzb;
    private final SparseArray zzd;
    private final int zze;
    public static final zzph zza = new zzph(zzfzn.zzn(zzpf.zza));
    private static final zzfzn zzc = zzfzn.zzp(2, 5, 6);

    static {
        zzfzp zzfzpVar = new zzfzp();
        zzfzpVar.zza(5, 6);
        zzfzpVar.zza(17, 6);
        zzfzpVar.zza(7, 6);
        zzfzpVar.zza(30, 10);
        zzfzpVar.zza(18, 6);
        zzfzpVar.zza(6, 8);
        zzfzpVar.zza(8, 8);
        zzfzpVar.zza(14, 8);
        zzb = zzfzpVar.zzc();
    }

    private zzph(List list) {
        this.zzd = new SparseArray();
        for (int i = 0; i < list.size(); i++) {
            zzpf zzpfVar = (zzpf) list.get(i);
            this.zzd.put(zzpfVar.zzb, zzpfVar);
        }
        int iMax = 0;
        for (int i2 = 0; i2 < this.zzd.size(); i2++) {
            iMax = Math.max(iMax, ((zzpf) this.zzd.valueAt(i2)).zzc);
        }
        this.zze = iMax;
    }

    static Uri zza() {
        if (zzf()) {
            return Settings.Global.getUriFor("external_surround_sound_enabled");
        }
        return null;
    }

    static zzph zzc(Context context, zzk zzkVar, zzpp zzppVar) {
        return zzd(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), zzkVar, zzppVar);
    }

    static zzph zzd(Context context, Intent intent, zzk zzkVar, zzpp zzppVar) {
        Object systemService = context.getSystemService("audio");
        Objects.requireNonNull(systemService);
        AudioManager audioManager = (AudioManager) systemService;
        if (zzppVar == null) {
            zzppVar = zzfx.zza >= 33 ? zzpe.zzb(audioManager, zzkVar) : null;
        }
        if (zzfx.zza >= 33 && (zzfx.zzM(context) || zzfx.zzJ(context))) {
            return zzpe.zza(audioManager, zzkVar);
        }
        if (zzfx.zza >= 23 && zzpc.zza(audioManager, zzppVar)) {
            return zza;
        }
        zzfzr zzfzrVar = new zzfzr();
        zzfzrVar.zzf((Object) 2);
        if (zzfx.zza >= 29 && (zzfx.zzM(context) || zzfx.zzJ(context))) {
            zzfzrVar.zzh(zzpd.zzb(zzkVar));
            return new zzph(zze(zzgcl.zzg(zzfzrVar.zzi()), 10));
        }
        ContentResolver contentResolver = context.getContentResolver();
        boolean z = Settings.Global.getInt(contentResolver, "use_external_surround_sound_flag", 0) == 1;
        if ((z || zzf()) && Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
            zzfzrVar.zzh(zzc);
        }
        if (intent == null || z || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 1) {
            return new zzph(zze(zzgcl.zzg(zzfzrVar.zzi()), 10));
        }
        int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
        if (intArrayExtra != null) {
            zzfzrVar.zzh(zzgcl.zzf(intArrayExtra));
        }
        return new zzph(zze(zzgcl.zzg(zzfzrVar.zzi()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10)));
    }

    private static zzfzn zze(int[] iArr, int i) {
        zzfzk zzfzkVar = new zzfzk();
        for (int i2 : iArr) {
            zzfzkVar.zzf(new zzpf(i2, i));
        }
        return zzfzkVar.zzi();
    }

    private static boolean zzf() {
        return "Amazon".equals(zzfx.zzc) || "Xiaomi".equals(zzfx.zzc);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0045 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 1
            if (r8 != r9) goto L4
            return r0
        L4:
            boolean r1 = r9 instanceof com.google.android.gms.internal.ads.zzph
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.google.android.gms.internal.ads.zzph r9 = (com.google.android.gms.internal.ads.zzph) r9
            android.util.SparseArray r1 = r8.zzd
            android.util.SparseArray r3 = r9.zzd
            int r4 = com.google.android.gms.internal.ads.zzfx.zza
            r5 = 31
            if (r4 < r5) goto L1d
            boolean r1 = r1.contentEquals(r3)
            if (r1 == 0) goto L46
            goto L3f
        L1d:
            int r4 = r1.size()
            int r5 = r3.size()
            if (r4 != r5) goto L46
            r5 = r2
        L28:
            if (r5 >= r4) goto L3f
            int r6 = r1.keyAt(r5)
            java.lang.Object r7 = r1.valueAt(r5)
            java.lang.Object r6 = r3.get(r6)
            boolean r6 = java.util.Objects.equals(r7, r6)
            if (r6 == 0) goto L46
            int r5 = r5 + 1
            goto L28
        L3f:
            int r1 = r8.zze
            int r9 = r9.zze
            if (r1 != r9) goto L46
            return r0
        L46:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzph.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iContentHashCode;
        int i = zzfx.zza;
        SparseArray sparseArray = this.zzd;
        if (i >= 31) {
            iContentHashCode = sparseArray.contentHashCode();
        } else {
            int iKeyAt = 17;
            for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                iKeyAt = (((iKeyAt * 31) + sparseArray.keyAt(i2)) * 31) + Objects.hashCode(sparseArray.valueAt(i2));
            }
            iContentHashCode = iKeyAt;
        }
        return this.zze + (iContentHashCode * 31);
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.zze + ", audioProfiles=" + this.zzd.toString() + t2.i.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a A[PHI: r0
      0x003a: PHI (r0v3 int) = (r0v2 int), (r0v7 int) binds: [B:11:0x002c, B:14:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.util.Pair zzb(com.google.android.gms.internal.ads.zzam r9, com.google.android.gms.internal.ads.zzk r10) {
        /*
            r8 = this;
            java.lang.String r0 = r9.zzm
            java.util.Objects.requireNonNull(r0)
            java.lang.String r1 = r9.zzj
            int r0 = com.google.android.gms.internal.ads.zzcb.zza(r0, r1)
            com.google.android.gms.internal.ads.zzfzq r1 = com.google.android.gms.internal.ads.zzph.zzb
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            boolean r1 = r1.containsKey(r2)
            if (r1 != 0) goto L19
            goto Lc5
        L19:
            r1 = 7
            r2 = 6
            r3 = 8
            r4 = 18
            if (r0 != r4) goto L2c
            android.util.SparseArray r0 = r8.zzd
            boolean r0 = com.google.android.gms.internal.ads.zzfx.zzH(r0, r4)
            if (r0 != 0) goto L2b
            r0 = r2
            goto L47
        L2b:
            r0 = r4
        L2c:
            if (r0 != r3) goto L3a
            android.util.SparseArray r0 = r8.zzd
            boolean r0 = com.google.android.gms.internal.ads.zzfx.zzH(r0, r3)
            if (r0 == 0) goto L38
            r0 = r3
            goto L3a
        L38:
            r0 = r1
            goto L47
        L3a:
            r5 = 30
            if (r0 != r5) goto L47
            android.util.SparseArray r6 = r8.zzd
            boolean r5 = com.google.android.gms.internal.ads.zzfx.zzH(r6, r5)
            if (r5 != 0) goto L47
            goto L38
        L47:
            android.util.SparseArray r5 = r8.zzd
            boolean r5 = com.google.android.gms.internal.ads.zzfx.zzH(r5, r0)
            if (r5 == 0) goto Lc5
            android.util.SparseArray r5 = r8.zzd
            java.lang.Object r5 = r5.get(r0)
            com.google.android.gms.internal.ads.zzpf r5 = (com.google.android.gms.internal.ads.zzpf) r5
            java.util.Objects.requireNonNull(r5)
            int r6 = r9.zzz
            r7 = -1
            if (r6 == r7) goto L7e
            if (r0 != r4) goto L62
            goto L7e
        L62:
            java.lang.String r9 = r9.zzm
            java.lang.String r10 = "audio/vnd.dts.uhd;profile=p2"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L77
            int r9 = com.google.android.gms.internal.ads.zzfx.zza
            r10 = 33
            if (r9 >= r10) goto L77
            r9 = 10
            if (r6 <= r9) goto L89
            goto Lc5
        L77:
            boolean r9 = r5.zzb(r6)
            if (r9 != 0) goto L89
            goto Lc5
        L7e:
            int r9 = r9.zzA
            if (r9 != r7) goto L85
            r9 = 48000(0xbb80, float:6.7262E-41)
        L85:
            int r6 = r5.zza(r9, r10)
        L89:
            int r9 = com.google.android.gms.internal.ads.zzfx.zza
            r10 = 28
            if (r9 > r10) goto L9d
            if (r6 != r1) goto L93
            r2 = r3
            goto L9e
        L93:
            r9 = 3
            if (r6 == r9) goto L9e
            r9 = 4
            if (r6 == r9) goto L9e
            r9 = 5
            if (r6 != r9) goto L9d
            goto L9e
        L9d:
            r2 = r6
        L9e:
            int r9 = com.google.android.gms.internal.ads.zzfx.zza
            r10 = 26
            if (r9 > r10) goto Lb2
            java.lang.String r9 = com.google.android.gms.internal.ads.zzfx.zzb
            java.lang.String r10 = "fugu"
            boolean r9 = r10.equals(r9)
            if (r9 == 0) goto Lb2
            r9 = 1
            if (r2 != r9) goto Lb2
            r2 = 2
        Lb2:
            int r9 = com.google.android.gms.internal.ads.zzfx.zzh(r2)
            if (r9 == 0) goto Lc5
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            android.util.Pair r9 = android.util.Pair.create(r10, r9)
            return r9
        Lc5:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzph.zzb(com.google.android.gms.internal.ads.zzam, com.google.android.gms.internal.ads.zzk):android.util.Pair");
    }
}
