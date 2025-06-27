package com.google.android.gms.internal.ads;

import androidx.room.RoomDatabase;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public enum zzazh implements zzgzz {
    UNSUPPORTED(0),
    ARM7(2),
    X86(4),
    ARM64(5),
    X86_64(6),
    RISCV64(7),
    UNKNOWN(RoomDatabase.MAX_BIND_PARAMETER_CNT);

    private static final zzhaa zzh = new zzhaa() { // from class: com.google.android.gms.internal.ads.zzazg
        @Override // com.google.android.gms.internal.ads.zzhaa
        public final /* synthetic */ zzgzz zza(int i) {
            zzazh zzazhVar = zzazh.UNSUPPORTED;
            if (i == 0) {
                return zzazh.UNSUPPORTED;
            }
            if (i == 2) {
                return zzazh.ARM7;
            }
            if (i == 999) {
                return zzazh.UNKNOWN;
            }
            if (i == 4) {
                return zzazh.X86;
            }
            if (i == 5) {
                return zzazh.ARM64;
            }
            if (i == 6) {
                return zzazh.X86_64;
            }
            if (i != 7) {
                return null;
            }
            return zzazh.RISCV64;
        }
    };
    private final int zzj;

    zzazh(int i) {
        this.zzj = i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzgzz
    public final int zza() {
        return this.zzj;
    }
}
