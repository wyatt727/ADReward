package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzjv;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.Collections;
import java.util.List;
import kotlin.text.Typography;

/* compiled from: com.google.android.gms:play-services-measurement@@22.0.0 */
/* loaded from: classes3.dex */
public final class zzfu {

    /* compiled from: com.google.android.gms:play-services-measurement@@22.0.0 */
    public static final class zza extends zzjv<zza, C0156zza> implements zzlk {
        private static final zza zzc;
        private static volatile zzlr<zza> zzd;
        private int zze;
        private String zzf = "";
        private String zzg = "";
        private String zzh = "";
        private String zzi = "";
        private String zzj = "";
        private String zzk = "";
        private String zzl = "";

        /* compiled from: com.google.android.gms:play-services-measurement@@22.0.0 */
        /* renamed from: com.google.android.gms.internal.measurement.zzfu$zza$zza, reason: collision with other inner class name */
        public static final class C0156zza extends zzjv.zza<zza, C0156zza> implements zzlk {
            private C0156zza() {
                super(zza.zzc);
            }

            /* synthetic */ C0156zza(zzft zzftVar) {
                this();
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzjv
        protected final Object zza(int i, Object obj, Object obj2) {
            zzft zzftVar = null;
            switch (zzft.zza[i - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C0156zza(zzftVar);
                case 3:
                    return zza(zzc, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
                case 4:
                    return zzc;
                case 5:
                    zzlr<zza> zzcVar = zzd;
                    if (zzcVar == null) {
                        synchronized (zza.class) {
                            zzcVar = zzd;
                            if (zzcVar == null) {
                                zzcVar = new zzjv.zzc<>(zzc);
                                zzd = zzcVar;
                            }
                        }
                    }
                    return zzcVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            zza zzaVar = new zza();
            zzc = zzaVar;
            zzjv.zza((Class<zza>) zza.class, zzaVar);
        }

        private zza() {
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@22.0.0 */
    public static final class zzb extends zzjv<zzb, zza> implements zzlk {
        private static final zzb zzc;
        private static volatile zzlr<zzb> zzd;
        private int zze;
        private boolean zzf;
        private boolean zzg;
        private boolean zzh;
        private boolean zzi;
        private boolean zzj;
        private boolean zzk;
        private boolean zzl;

        public static zza zza() {
            return zzc.zzbz();
        }

        /* compiled from: com.google.android.gms:play-services-measurement@@22.0.0 */
        public static final class zza extends zzjv.zza<zzb, zza> implements zzlk {
            public final zza zza(boolean z) {
                zzak();
                ((zzb) this.zza).zza(z);
                return this;
            }

            public final zza zzb(boolean z) {
                zzak();
                ((zzb) this.zza).zzb(z);
                return this;
            }

            public final zza zzc(boolean z) {
                zzak();
                ((zzb) this.zza).zzc(z);
                return this;
            }

            public final zza zzd(boolean z) {
                zzak();
                ((zzb) this.zza).zzd(z);
                return this;
            }

            public final zza zze(boolean z) {
                zzak();
                ((zzb) this.zza).zze(z);
                return this;
            }

            public final zza zzf(boolean z) {
                zzak();
                ((zzb) this.zza).zzf(z);
                return this;
            }

            public final zza zzg(boolean z) {
                zzak();
                ((zzb) this.zza).zzg(z);
                return this;
            }

            private zza() {
                super(zzb.zzc);
            }

            /* synthetic */ zza(zzft zzftVar) {
                this();
            }
        }

        public static zzb zzc() {
            return zzc;
        }

        @Override // com.google.android.gms.internal.measurement.zzjv
        protected final Object zza(int i, Object obj, Object obj2) {
            zzft zzftVar = null;
            switch (zzft.zza[i - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new zza(zzftVar);
                case 3:
                    return zza(zzc, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
                case 4:
                    return zzc;
                case 5:
                    zzlr<zzb> zzcVar = zzd;
                    if (zzcVar == null) {
                        synchronized (zzb.class) {
                            zzcVar = zzd;
                            if (zzcVar == null) {
                                zzcVar = new zzjv.zzc<>(zzc);
                                zzd = zzcVar;
                            }
                        }
                    }
                    return zzcVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            zzb zzbVar = new zzb();
            zzc = zzbVar;
            zzjv.zza((Class<zzb>) zzb.class, zzbVar);
        }

        private zzb() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(boolean z) {
            this.zze |= 32;
            this.zzk = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzb(boolean z) {
            this.zze |= 16;
            this.zzj = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzc(boolean z) {
            this.zze |= 1;
            this.zzf = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzd(boolean z) {
            this.zze |= 64;
            this.zzl = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zze(boolean z) {
            this.zze |= 2;
            this.zzg = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzf(boolean z) {
            this.zze |= 4;
            this.zzh = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzg(boolean z) {
            this.zze |= 8;
            this.zzi = z;
        }

        public final boolean zzd() {
            return this.zzk;
        }

        public final boolean zze() {
            return this.zzj;
        }

        public final boolean zzf() {
            return this.zzf;
        }

        public final boolean zzg() {
            return this.zzl;
        }

        public final boolean zzh() {
            return this.zzg;
        }

        public final boolean zzi() {
            return this.zzh;
        }

        public final boolean zzj() {
            return this.zzi;
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@22.0.0 */
    public static final class zzc extends zzjv<zzc, zza> implements zzlk {
        private static final zzc zzc;
        private static volatile zzlr<zzc> zzd;
        private int zze;
        private int zzf;
        private zzl zzg;
        private zzl zzh;
        private boolean zzi;

        public final int zza() {
            return this.zzf;
        }

        public static zza zzb() {
            return zzc.zzbz();
        }

        /* compiled from: com.google.android.gms:play-services-measurement@@22.0.0 */
        public static final class zza extends zzjv.zza<zzc, zza> implements zzlk {
            public final zza zza(int i) {
                zzak();
                ((zzc) this.zza).zza(i);
                return this;
            }

            public final zza zza(zzl.zza zzaVar) {
                zzak();
                ((zzc) this.zza).zza((zzl) ((zzjv) zzaVar.zzah()));
                return this;
            }

            public final zza zza(boolean z) {
                zzak();
                ((zzc) this.zza).zza(z);
                return this;
            }

            public final zza zza(zzl zzlVar) {
                zzak();
                ((zzc) this.zza).zzb(zzlVar);
                return this;
            }

            private zza() {
                super(zzc.zzc);
            }

            /* synthetic */ zza(zzft zzftVar) {
                this();
            }
        }

        public final zzl zzd() {
            zzl zzlVar = this.zzg;
            return zzlVar == null ? zzl.zzg() : zzlVar;
        }

        public final zzl zze() {
            zzl zzlVar = this.zzh;
            return zzlVar == null ? zzl.zzg() : zzlVar;
        }

        @Override // com.google.android.gms.internal.measurement.zzjv
        protected final Object zza(int i, Object obj, Object obj2) {
            zzft zzftVar = null;
            switch (zzft.zza[i - 1]) {
                case 1:
                    return new zzc();
                case 2:
                    return new zza(zzftVar);
                case 3:
                    return zza(zzc, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
                case 4:
                    return zzc;
                case 5:
                    zzlr<zzc> zzcVar = zzd;
                    if (zzcVar == null) {
                        synchronized (zzc.class) {
                            zzcVar = zzd;
                            if (zzcVar == null) {
                                zzcVar = new zzjv.zzc<>(zzc);
                                zzd = zzcVar;
                            }
                        }
                    }
                    return zzcVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            zzc zzcVar = new zzc();
            zzc = zzcVar;
            zzjv.zza((Class<zzc>) zzc.class, zzcVar);
        }

        private zzc() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(int i) {
            this.zze |= 1;
            this.zzf = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(zzl zzlVar) {
            zzlVar.getClass();
            this.zzg = zzlVar;
            this.zze |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(boolean z) {
            this.zze |= 8;
            this.zzi = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzb(zzl zzlVar) {
            zzlVar.getClass();
            this.zzh = zzlVar;
            this.zze |= 4;
        }

        public final boolean zzf() {
            return this.zzi;
        }

        public final boolean zzg() {
            return (this.zze & 1) != 0;
        }

        public final boolean zzh() {
            return (this.zze & 8) != 0;
        }

        public final boolean zzi() {
            return (this.zze & 4) != 0;
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@22.0.0 */
    public static final class zzd extends zzjv<zzd, zza> implements zzlk {
        private static final zzd zzc;
        private static volatile zzlr<zzd> zzd;
        private int zze;
        private int zzf;
        private long zzg;

        public final int zza() {
            return this.zzf;
        }

        public final long zzb() {
            return this.zzg;
        }

        /* compiled from: com.google.android.gms:play-services-measurement@@22.0.0 */
        public static final class zza extends zzjv.zza<zzd, zza> implements zzlk {
            public final zza zza(long j) {
                zzak();
                ((zzd) this.zza).zza(j);
                return this;
            }

            public final zza zza(int i) {
                zzak();
                ((zzd) this.zza).zza(i);
                return this;
            }

            private zza() {
                super(zzd.zzc);
            }

            /* synthetic */ zza(zzft zzftVar) {
                this();
            }
        }

        public static zza zzc() {
            return zzc.zzbz();
        }

        @Override // com.google.android.gms.internal.measurement.zzjv
        protected final Object zza(int i, Object obj, Object obj2) {
            zzft zzftVar = null;
            switch (zzft.zza[i - 1]) {
                case 1:
                    return new zzd();
                case 2:
                    return new zza(zzftVar);
                case 3:
                    return zza(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", "zzg"});
                case 4:
                    return zzc;
                case 5:
                    zzlr<zzd> zzcVar = zzd;
                    if (zzcVar == null) {
                        synchronized (zzd.class) {
                            zzcVar = zzd;
                            if (zzcVar == null) {
                                zzcVar = new zzjv.zzc<>(zzc);
                                zzd = zzcVar;
                            }
                        }
                    }
                    return zzcVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            zzd zzdVar = new zzd();
            zzc = zzdVar;
            zzjv.zza((Class<zzd>) zzd.class, zzdVar);
        }

        private zzd() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(long j) {
            this.zze |= 2;
            this.zzg = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(int i) {
            this.zze |= 1;
            this.zzf = i;
        }

        public final boolean zze() {
            return (this.zze & 2) != 0;
        }

        public final boolean zzf() {
            return (this.zze & 1) != 0;
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@22.0.0 */
    public static final class zze extends zzjv<zze, zza> implements zzlk {
        private static final zze zzc;
        private static volatile zzlr<zze> zzd;
        private int zze;
        private zzke<zzg> zzf = zzce();
        private String zzg = "";
        private long zzh;
        private long zzi;
        private int zzj;

        /* compiled from: com.google.android.gms:play-services-measurement@@22.0.0 */
        public static final class zza extends zzjv.zza<zze, zza> implements zzlk {
            public final int zza() {
                return ((zze) this.zza).zzb();
            }

            public final long zzb() {
                return ((zze) this.zza).zzc();
            }

            public final long zzc() {
                return ((zze) this.zza).zzd();
            }

            public final zza zza(Iterable<? extends zzg> iterable) {
                zzak();
                ((zze) this.zza).zza(iterable);
                return this;
            }

            public final zza zza(zzg.zza zzaVar) {
                zzak();
                ((zze) this.zza).zza((zzg) ((zzjv) zzaVar.zzah()));
                return this;
            }

            public final zza zza(zzg zzgVar) {
                zzak();
                ((zze) this.zza).zza(zzgVar);
                return this;
            }

            public final zza zzd() {
                zzak();
                ((zze) this.zza).zzl();
                return this;
            }

            public final zza zza(int i) {
                zzak();
                ((zze) this.zza).zzb(i);
                return this;
            }

            public final zza zza(String str) {
                zzak();
                ((zze) this.zza).zza(str);
                return this;
            }

            public final zza zza(int i, zzg.zza zzaVar) {
                zzak();
                ((zze) this.zza).zza(i, (zzg) ((zzjv) zzaVar.zzah()));
                return this;
            }

            public final zza zza(int i, zzg zzgVar) {
                zzak();
                ((zze) this.zza).zza(i, zzgVar);
                return this;
            }

            public final zza zza(long j) {
                zzak();
                ((zze) this.zza).zza(j);
                return this;
            }

            public final zza zzb(long j) {
                zzak();
                ((zze) this.zza).zzb(j);
                return this;
            }

            public final zzg zzb(int i) {
                return ((zze) this.zza).zza(i);
            }

            public final String zze() {
                return ((zze) this.zza).zzg();
            }

            public final List<zzg> zzf() {
                return Collections.unmodifiableList(((zze) this.zza).zzh());
            }

            private zza() {
                super(zze.zzc);
            }

            /* synthetic */ zza(zzft zzftVar) {
                this();
            }

            public final boolean zzg() {
                return ((zze) this.zza).zzk();
            }
        }

        public final int zza() {
            return this.zzj;
        }

        public final int zzb() {
            return this.zzf.size();
        }

        public final long zzc() {
            return this.zzi;
        }

        public final long zzd() {
            return this.zzh;
        }

        public static zza zze() {
            return zzc.zzbz();
        }

        public final zzg zza(int i) {
            return this.zzf.get(i);
        }

        @Override // com.google.android.gms.internal.measurement.zzjv
        protected final Object zza(int i, Object obj, Object obj2) {
            zzft zzftVar = null;
            switch (zzft.zza[i - 1]) {
                case 1:
                    return new zze();
                case 2:
                    return new zza(zzftVar);
                case 3:
                    return zza(zzc, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zze", "zzf", zzg.class, "zzg", "zzh", "zzi", "zzj"});
                case 4:
                    return zzc;
                case 5:
                    zzlr<zze> zzcVar = zzd;
                    if (zzcVar == null) {
                        synchronized (zze.class) {
                            zzcVar = zzd;
                            if (zzcVar == null) {
                                zzcVar = new zzjv.zzc<>(zzc);
                                zzd = zzcVar;
                            }
                        }
                    }
                    return zzcVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public final String zzg() {
            return this.zzg;
        }

        public final List<zzg> zzh() {
            return this.zzf;
        }

        static {
            zze zzeVar = new zze();
            zzc = zzeVar;
            zzjv.zza((Class<zze>) zze.class, zzeVar);
        }

        private zze() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(Iterable<? extends zzg> iterable) {
            zzm();
            zzhz.zza(iterable, this.zzf);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(zzg zzgVar) {
            zzgVar.getClass();
            zzm();
            this.zzf.add(zzgVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzl() {
            this.zzf = zzce();
        }

        private final void zzm() {
            zzke<zzg> zzkeVar = this.zzf;
            if (zzkeVar.zzc()) {
                return;
            }
            this.zzf = zzjv.zza(zzkeVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzb(int i) {
            zzm();
            this.zzf.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(String str) {
            str.getClass();
            this.zze |= 1;
            this.zzg = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(int i, zzg zzgVar) {
            zzgVar.getClass();
            zzm();
            this.zzf.set(i, zzgVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(long j) {
            this.zze |= 4;
            this.zzi = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzb(long j) {
            this.zze |= 2;
            this.zzh = j;
        }

        public final boolean zzi() {
            return (this.zze & 8) != 0;
        }

        public final boolean zzj() {
            return (this.zze & 4) != 0;
        }

        public final boolean zzk() {
            return (this.zze & 2) != 0;
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@22.0.0 */
    public static final class zzf extends zzjv<zzf, zza> implements zzlk {
        private static final zzf zzc;
        private static volatile zzlr<zzf> zzd;
        private int zze;
        private String zzf = "";
        private long zzg;

        public static zza zza() {
            return zzc.zzbz();
        }

        /* compiled from: com.google.android.gms:play-services-measurement@@22.0.0 */
        public static final class zza extends zzjv.zza<zzf, zza> implements zzlk {
            public final zza zza(long j) {
                zzak();
                ((zzf) this.zza).zza(j);
                return this;
            }

            public final zza zza(String str) {
                zzak();
                ((zzf) this.zza).zza(str);
                return this;
            }

            private zza() {
                super(zzf.zzc);
            }

            /* synthetic */ zza(zzft zzftVar) {
                this();
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzjv
        protected final Object zza(int i, Object obj, Object obj2) {
            zzft zzftVar = null;
            switch (zzft.zza[i - 1]) {
                case 1:
                    return new zzf();
                case 2:
                    return new zza(zzftVar);
                case 3:
                    return zza(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", "zzg"});
                case 4:
                    return zzc;
                case 5:
                    zzlr<zzf> zzcVar = zzd;
                    if (zzcVar == null) {
                        synchronized (zzf.class) {
                            zzcVar = zzd;
                            if (zzcVar == null) {
                                zzcVar = new zzjv.zzc<>(zzc);
                                zzd = zzcVar;
                            }
                        }
                    }
                    return zzcVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            zzf zzfVar = new zzf();
            zzc = zzfVar;
            zzjv.zza((Class<zzf>) zzf.class, zzfVar);
        }

        private zzf() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(long j) {
            this.zze |= 2;
            this.zzg = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(String str) {
            str.getClass();
            this.zze |= 1;
            this.zzf = str;
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@22.0.0 */
    public static final class zzg extends zzjv<zzg, zza> implements zzlk {
        private static final zzg zzc;
        private static volatile zzlr<zzg> zzd;
        private int zze;
        private long zzh;
        private float zzi;
        private double zzj;
        private String zzf = "";
        private String zzg = "";
        private zzke<zzg> zzk = zzce();

        /* compiled from: com.google.android.gms:play-services-measurement@@22.0.0 */
        public static final class zza extends zzjv.zza<zzg, zza> implements zzlk {
            public final int zza() {
                return ((zzg) this.zza).zzc();
            }

            public final zza zza(Iterable<? extends zzg> iterable) {
                zzak();
                ((zzg) this.zza).zza(iterable);
                return this;
            }

            public final zza zza(zza zzaVar) {
                zzak();
                ((zzg) this.zza).zze((zzg) ((zzjv) zzaVar.zzah()));
                return this;
            }

            public final zza zzb() {
                zzak();
                ((zzg) this.zza).zzo();
                return this;
            }

            public final zza zzc() {
                zzak();
                ((zzg) this.zza).zzp();
                return this;
            }

            public final zza zzd() {
                zzak();
                ((zzg) this.zza).zzq();
                return this;
            }

            public final zza zze() {
                zzak();
                ((zzg) this.zza).zzr();
                return this;
            }

            public final zza zza(double d) {
                zzak();
                ((zzg) this.zza).zza(d);
                return this;
            }

            public final zza zza(long j) {
                zzak();
                ((zzg) this.zza).zza(j);
                return this;
            }

            public final zza zza(String str) {
                zzak();
                ((zzg) this.zza).zza(str);
                return this;
            }

            public final zza zzb(String str) {
                zzak();
                ((zzg) this.zza).zzb(str);
                return this;
            }

            public final String zzf() {
                return ((zzg) this.zza).zzg();
            }

            public final String zzg() {
                return ((zzg) this.zza).zzh();
            }

            private zza() {
                super(zzg.zzc);
            }

            /* synthetic */ zza(zzft zzftVar) {
                this();
            }
        }

        public final double zza() {
            return this.zzj;
        }

        public final float zzb() {
            return this.zzi;
        }

        public final int zzc() {
            return this.zzk.size();
        }

        public final long zzd() {
            return this.zzh;
        }

        public static zza zze() {
            return zzc.zzbz();
        }

        @Override // com.google.android.gms.internal.measurement.zzjv
        protected final Object zza(int i, Object obj, Object obj2) {
            zzft zzftVar = null;
            switch (zzft.zza[i - 1]) {
                case 1:
                    return new zzg();
                case 2:
                    return new zza(zzftVar);
                case 3:
                    return zza(zzc, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", zzg.class});
                case 4:
                    return zzc;
                case 5:
                    zzlr<zzg> zzcVar = zzd;
                    if (zzcVar == null) {
                        synchronized (zzg.class) {
                            zzcVar = zzd;
                            if (zzcVar == null) {
                                zzcVar = new zzjv.zzc<>(zzc);
                                zzd = zzcVar;
                            }
                        }
                    }
                    return zzcVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public final String zzg() {
            return this.zzf;
        }

        public final String zzh() {
            return this.zzg;
        }

        public final List<zzg> zzi() {
            return this.zzk;
        }

        static {
            zzg zzgVar = new zzg();
            zzc = zzgVar;
            zzjv.zza((Class<zzg>) zzg.class, zzgVar);
        }

        private zzg() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(Iterable<? extends zzg> iterable) {
            zzs();
            zzhz.zza(iterable, this.zzk);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zze(zzg zzgVar) {
            zzgVar.getClass();
            zzs();
            this.zzk.add(zzgVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzo() {
            this.zze &= -17;
            this.zzj = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzp() {
            this.zze &= -5;
            this.zzh = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzq() {
            this.zzk = zzce();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzr() {
            this.zze &= -3;
            this.zzg = zzc.zzg;
        }

        private final void zzs() {
            zzke<zzg> zzkeVar = this.zzk;
            if (zzkeVar.zzc()) {
                return;
            }
            this.zzk = zzjv.zza(zzkeVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(double d) {
            this.zze |= 16;
            this.zzj = d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(long j) {
            this.zze |= 4;
            this.zzh = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(String str) {
            str.getClass();
            this.zze |= 1;
            this.zzf = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzb(String str) {
            str.getClass();
            this.zze |= 2;
            this.zzg = str;
        }

        public final boolean zzj() {
            return (this.zze & 16) != 0;
        }

        public final boolean zzk() {
            return (this.zze & 8) != 0;
        }

        public final boolean zzl() {
            return (this.zze & 4) != 0;
        }

        public final boolean zzm() {
            return (this.zze & 1) != 0;
        }

        public final boolean zzn() {
            return (this.zze & 2) != 0;
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@22.0.0 */
    public static final class zzh extends zzjv<zzh, zza> implements zzlk {
        private static final zzh zzc;
        private static volatile zzlr<zzh> zzd;
        private int zze;
        private String zzf = "";
        private String zzg = "";
        private zza zzh;

        /* compiled from: com.google.android.gms:play-services-measurement@@22.0.0 */
        public static final class zza extends zzjv.zza<zzh, zza> implements zzlk {
            private zza() {
                super(zzh.zzc);
            }

            /* synthetic */ zza(zzft zzftVar) {
                this();
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzjv
        protected final Object zza(int i, Object obj, Object obj2) {
            zzft zzftVar = null;
            switch (zzft.zza[i - 1]) {
                case 1:
                    return new zzh();
                case 2:
                    return new zza(zzftVar);
                case 3:
                    return zza(zzc, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
                case 4:
                    return zzc;
                case 5:
                    zzlr<zzh> zzcVar = zzd;
                    if (zzcVar == null) {
                        synchronized (zzh.class) {
                            zzcVar = zzd;
                            if (zzcVar == null) {
                                zzcVar = new zzjv.zzc<>(zzc);
                                zzd = zzcVar;
                            }
                        }
                    }
                    return zzcVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            zzh zzhVar = new zzh();
            zzc = zzhVar;
            zzjv.zza((Class<zzh>) zzh.class, zzhVar);
        }

        private zzh() {
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@22.0.0 */
    public static final class zzi extends zzjv<zzi, zzb> implements zzlk {
        private static final zzi zzc;
        private static volatile zzlr<zzi> zzd;
        private int zze;
        private zzke<zzj> zzf = zzce();
        private String zzg = "";
        private String zzh = "";
        private int zzi;

        /* compiled from: com.google.android.gms:play-services-measurement@@22.0.0 */
        public static final class zzb extends zzjv.zza<zzi, zzb> implements zzlk {
            public final int zza() {
                return ((zzi) this.zza).zza();
            }

            public final zzb zza(zzj.zza zzaVar) {
                zzak();
                ((zzi) this.zza).zza((zzj) ((zzjv) zzaVar.zzah()));
                return this;
            }

            public final zzb zza(String str) {
                zzak();
                ((zzi) this.zza).zza(str);
                return this;
            }

            public final zzj zza(int i) {
                return ((zzi) this.zza).zza(0);
            }

            private zzb() {
                super(zzi.zzc);
            }

            /* synthetic */ zzb(zzft zzftVar) {
                this();
            }
        }

        public final int zza() {
            return this.zzf.size();
        }

        public static zzb zzb() {
            return zzc.zzbz();
        }

        /* compiled from: com.google.android.gms:play-services-measurement@@22.0.0 */
        public enum zza implements zzjx {
            SDK(0),
            SGTM(1);

            private static final zzka<zza> zzc = new zzfz();
            private final int zze;

            @Override // com.google.android.gms.internal.measurement.zzjx
            public final int zza() {
                return this.zze;
            }

            public static zza zza(int i) {
                if (i == 0) {
                    return SDK;
                }
                if (i != 1) {
                    return null;
                }
                return SGTM;
            }

            public static zzjz zzb() {
                return zzfy.zza;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zze + " name=" + name() + Typography.greater;
            }

            zza(int i) {
                this.zze = i;
            }
        }

        public final zzj zza(int i) {
            return this.zzf.get(0);
        }

        @Override // com.google.android.gms.internal.measurement.zzjv
        protected final Object zza(int i, Object obj, Object obj2) {
            zzft zzftVar = null;
            switch (zzft.zza[i - 1]) {
                case 1:
                    return new zzi();
                case 2:
                    return new zzb(zzftVar);
                case 3:
                    return zza(zzc, "\u0001\u0004\u0000\u0001\u0001\t\u0004\u0000\u0001\u0000\u0001\u001b\u0007ဈ\u0000\bဈ\u0001\t᠌\u0002", new Object[]{"zze", "zzf", zzj.class, "zzg", "zzh", "zzi", zza.zzb()});
                case 4:
                    return zzc;
                case 5:
                    zzlr<zzi> zzcVar = zzd;
                    if (zzcVar == null) {
                        synchronized (zzi.class) {
                            zzcVar = zzd;
                            if (zzcVar == null) {
                                zzcVar = new zzjv.zzc<>(zzc);
                                zzd = zzcVar;
                            }
                        }
                    }
                    return zzcVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public final String zzd() {
            return this.zzh;
        }

        public final List<zzj> zze() {
            return this.zzf;
        }

        static {
            zzi zziVar = new zzi();
            zzc = zziVar;
            zzjv.zza((Class<zzi>) zzi.class, zziVar);
        }

        private zzi() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(zzj zzjVar) {
            zzjVar.getClass();
            zzke<zzj> zzkeVar = this.zzf;
            if (!zzkeVar.zzc()) {
                this.zzf = zzjv.zza(zzkeVar);
            }
            this.zzf.add(zzjVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(String str) {
            str.getClass();
            this.zze |= 2;
            this.zzh = str;
        }

        public final boolean zzf() {
            return (this.zze & 2) != 0;
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@22.0.0 */
    public static final class zzj extends zzjv<zzj, zza> implements zzlk {
        private static final zzj zzc;
        private static volatile zzlr<zzj> zzd;
        private long zzab;
        private int zzac;
        private boolean zzaf;
        private int zzai;
        private int zzaj;
        private int zzak;
        private long zzam;
        private long zzan;
        private int zzaq;
        private zzk zzas;
        private long zzau;
        private long zzav;
        private int zzay;
        private boolean zzaz;
        private boolean zzbb;
        private zzh zzbc;
        private long zzbg;
        private boolean zzbh;
        private boolean zzbj;
        private int zzbl;
        private zzb zzbn;
        private int zzbo;
        private int zze;
        private int zzf;
        private int zzg;
        private long zzj;
        private long zzk;
        private long zzl;
        private long zzm;
        private long zzn;
        private int zzs;
        private long zzw;
        private long zzx;
        private boolean zzz;
        private zzke<zze> zzh = zzce();
        private zzke<zzn> zzi = zzce();
        private String zzo = "";
        private String zzp = "";
        private String zzq = "";
        private String zzr = "";
        private String zzt = "";
        private String zzu = "";
        private String zzv = "";
        private String zzy = "";
        private String zzaa = "";
        private String zzad = "";
        private String zzae = "";
        private zzke<zzc> zzag = zzce();
        private String zzah = "";
        private String zzal = "";
        private String zzao = "";
        private String zzap = "";
        private String zzar = "";
        private zzkc zzat = zzcc();
        private String zzaw = "";
        private String zzax = "";
        private String zzba = "";
        private String zzbd = "";
        private zzke<String> zzbe = zzjv.zzce();
        private String zzbf = "";
        private String zzbi = "";
        private String zzbk = "";
        private String zzbm = "";

        /* compiled from: com.google.android.gms:play-services-measurement@@22.0.0 */
        public static final class zza extends zzjv.zza<zzj, zza> implements zzlk {
            public final int zza() {
                return ((zzj) this.zza).zza();
            }

            public final int zzb() {
                return ((zzj) this.zza).zzb();
            }

            public final int zzc() {
                return ((zzj) this.zza).zze();
            }

            public final int zzd() {
                return ((zzj) this.zza).zzi();
            }

            public final long zze() {
                return ((zzj) this.zza).zzm();
            }

            public final long zzf() {
                return ((zzj) this.zza).zzq();
            }

            public final zze zza(int i) {
                return ((zzj) this.zza).zza(i);
            }

            public final zza zza(Iterable<? extends zzc> iterable) {
                zzak();
                ((zzj) this.zza).zza(iterable);
                return this;
            }

            public final zza zzb(Iterable<? extends zze> iterable) {
                zzak();
                ((zzj) this.zza).zzb(iterable);
                return this;
            }

            public final zza zzc(Iterable<? extends Integer> iterable) {
                zzak();
                ((zzj) this.zza).zzc(iterable);
                return this;
            }

            public final zza zzd(Iterable<String> iterable) {
                zzak();
                ((zzj) this.zza).zzd(iterable);
                return this;
            }

            public final zza zze(Iterable<? extends zzn> iterable) {
                zzak();
                ((zzj) this.zza).zze(iterable);
                return this;
            }

            public final zza zza(zze.zza zzaVar) {
                zzak();
                ((zzj) this.zza).zza((zze) ((zzjv) zzaVar.zzah()));
                return this;
            }

            public final zza zza(zzn.zza zzaVar) {
                zzak();
                ((zzj) this.zza).zza((zzn) ((zzjv) zzaVar.zzah()));
                return this;
            }

            public final zza zza(zzn zznVar) {
                zzak();
                ((zzj) this.zza).zza(zznVar);
                return this;
            }

            public final zza zzg() {
                zzak();
                ((zzj) this.zza).zzck();
                return this;
            }

            public final zza zzh() {
                zzak();
                ((zzj) this.zza).zzcl();
                return this;
            }

            public final zza zzi() {
                zzak();
                ((zzj) this.zza).zzcm();
                return this;
            }

            public final zza zzj() {
                zzak();
                ((zzj) this.zza).zzcn();
                return this;
            }

            public final zza zzk() {
                zzak();
                ((zzj) this.zza).zzco();
                return this;
            }

            public final zza zzl() {
                zzak();
                ((zzj) this.zza).zzcp();
                return this;
            }

            public final zza zzm() {
                zzak();
                ((zzj) this.zza).zzcq();
                return this;
            }

            public final zza zzn() {
                zzak();
                ((zzj) this.zza).zzcr();
                return this;
            }

            public final zza zzo() {
                zzak();
                ((zzj) this.zza).zzcs();
                return this;
            }

            public final zza zzp() {
                zzak();
                ((zzj) this.zza).zzct();
                return this;
            }

            public final zza zzq() {
                zzak();
                ((zzj) this.zza).zzcu();
                return this;
            }

            public final zza zzr() {
                zzak();
                ((zzj) this.zza).zzcv();
                return this;
            }

            public final zza zzs() {
                zzak();
                ((zzj) this.zza).zzcw();
                return this;
            }

            public final zza zzb(int i) {
                zzak();
                ((zzj) this.zza).zzd(i);
                return this;
            }

            public final zza zzc(int i) {
                zzak();
                ((zzj) this.zza).zze(i);
                return this;
            }

            public final zza zzd(int i) {
                zzak();
                ((zzj) this.zza).zzf(i);
                return this;
            }

            public final zza zza(String str) {
                zzak();
                ((zzj) this.zza).zza(str);
                return this;
            }

            public final zza zzb(String str) {
                zzak();
                ((zzj) this.zza).zzb(str);
                return this;
            }

            public final zza zzc(String str) {
                zzak();
                ((zzj) this.zza).zzc(str);
                return this;
            }

            public final zza zzd(String str) {
                zzak();
                ((zzj) this.zza).zzd(str);
                return this;
            }

            public final zza zze(String str) {
                zzak();
                ((zzj) this.zza).zze(str);
                return this;
            }

            public final zza zze(int i) {
                zzak();
                ((zzj) this.zza).zzg(i);
                return this;
            }

            public final zza zza(zzb zzbVar) {
                zzak();
                ((zzj) this.zza).zza(zzbVar);
                return this;
            }

            public final zza zzf(int i) {
                zzak();
                ((zzj) this.zza).zzh(i);
                return this;
            }

            public final zza zza(long j) {
                zzak();
                ((zzj) this.zza).zza(j);
                return this;
            }

            public final zza zzb(long j) {
                zzak();
                ((zzj) this.zza).zzb(j);
                return this;
            }

            public final zza zzf(String str) {
                zzak();
                ((zzj) this.zza).zzf(str);
                return this;
            }

            public final zza zzg(String str) {
                zzak();
                ((zzj) this.zza).zzg(str);
                return this;
            }

            public final zza zzh(String str) {
                zzak();
                ((zzj) this.zza).zzh(str);
                return this;
            }

            public final zza zzg(int i) {
                zzak();
                ((zzj) this.zza).zzi(i);
                return this;
            }

            public final zza zzc(long j) {
                zzak();
                ((zzj) this.zza).zzc(j);
                return this;
            }

            public final zza zzi(String str) {
                zzak();
                ((zzj) this.zza).zzi(str);
                return this;
            }

            public final zza zzj(String str) {
                zzak();
                ((zzj) this.zza).zzj((String) null);
                return this;
            }

            public final zza zzd(long j) {
                zzak();
                ((zzj) this.zza).zzd(j);
                return this;
            }

            public final zza zza(boolean z) {
                zzak();
                ((zzj) this.zza).zza(z);
                return this;
            }

            public final zza zze(long j) {
                zzak();
                ((zzj) this.zza).zze(j);
                return this;
            }

            public final zza zzk(String str) {
                zzak();
                ((zzj) this.zza).zzk(str);
                return this;
            }

            public final zza zza(int i, zze.zza zzaVar) {
                zzak();
                ((zzj) this.zza).zza(i, (zze) ((zzjv) zzaVar.zzah()));
                return this;
            }

            public final zza zza(int i, zze zzeVar) {
                zzak();
                ((zzj) this.zza).zza(i, zzeVar);
                return this;
            }

            public final zza zzl(String str) {
                zzak();
                ((zzj) this.zza).zzl(str);
                return this;
            }

            public final zza zzm(String str) {
                zzak();
                ((zzj) this.zza).zzm(str);
                return this;
            }

            public final zza zzf(long j) {
                zzak();
                ((zzj) this.zza).zzf(j);
                return this;
            }

            public final zza zzn(String str) {
                zzak();
                ((zzj) this.zza).zzn(str);
                return this;
            }

            public final zza zzb(boolean z) {
                zzak();
                ((zzj) this.zza).zzb(z);
                return this;
            }

            public final zza zzc(boolean z) {
                zzak();
                ((zzj) this.zza).zzc(z);
                return this;
            }

            public final zza zzo(String str) {
                zzak();
                ((zzj) this.zza).zzo(str);
                return this;
            }

            public final zza zzp(String str) {
                zzak();
                ((zzj) this.zza).zzp(str);
                return this;
            }

            public final zza zza(zzk.zza zzaVar) {
                zzak();
                ((zzj) this.zza).zza((zzk) ((zzjv) zzaVar.zzah()));
                return this;
            }

            public final zza zzg(long j) {
                zzak();
                ((zzj) this.zza).zzg(j);
                return this;
            }

            public final zza zzh(long j) {
                zzak();
                ((zzj) this.zza).zzh(j);
                return this;
            }

            public final zza zzh(int i) {
                zzak();
                ((zzj) this.zza).zzj(1);
                return this;
            }

            public final zza zzq(String str) {
                zzak();
                ((zzj) this.zza).zzq(str);
                return this;
            }

            public final zza zzi(int i) {
                zzak();
                ((zzj) this.zza).zzk(i);
                return this;
            }

            public final zza zzd(boolean z) {
                zzak();
                ((zzj) this.zza).zzd(z);
                return this;
            }

            public final zza zzr(String str) {
                zzak();
                ((zzj) this.zza).zzr(str);
                return this;
            }

            public final zza zzi(long j) {
                zzak();
                ((zzj) this.zza).zzi(j);
                return this;
            }

            public final zza zzj(long j) {
                zzak();
                ((zzj) this.zza).zzj(j);
                return this;
            }

            public final zza zzj(int i) {
                zzak();
                ((zzj) this.zza).zzl(i);
                return this;
            }

            public final zza zzk(long j) {
                zzak();
                ((zzj) this.zza).zzk(j);
                return this;
            }

            public final zza zzl(long j) {
                zzak();
                ((zzj) this.zza).zzl(j);
                return this;
            }

            public final zza zza(int i, zzn zznVar) {
                zzak();
                ((zzj) this.zza).zza(i, zznVar);
                return this;
            }

            public final zza zzs(String str) {
                zzak();
                ((zzj) this.zza).zzs(str);
                return this;
            }

            public final zzn zzk(int i) {
                return ((zzj) this.zza).zzb(i);
            }

            public final String zzt() {
                return ((zzj) this.zza).zzy();
            }

            public final String zzu() {
                return ((zzj) this.zza).zzz();
            }

            public final String zzv() {
                return ((zzj) this.zza).zzac();
            }

            public final String zzw() {
                return ((zzj) this.zza).zzae();
            }

            public final String zzx() {
                return ((zzj) this.zza).zzai();
            }

            public final String zzy() {
                return ((zzj) this.zza).zzak();
            }

            public final String zzz() {
                return ((zzj) this.zza).zzam();
            }

            public final List<zze> zzaa() {
                return Collections.unmodifiableList(((zzj) this.zza).zzaq());
            }

            public final List<zzn> zzab() {
                return Collections.unmodifiableList(((zzj) this.zza).zzar());
            }

            private zza() {
                super(zzj.zzc);
            }

            /* synthetic */ zza(zzft zzftVar) {
                this();
            }

            public final boolean zzac() {
                return ((zzj) this.zza).zzat();
            }

            public final boolean zzad() {
                return ((zzj) this.zza).zzau();
            }
        }

        public final int zza() {
            return this.zzbl;
        }

        public final int zzb() {
            return this.zzai;
        }

        public final int zzc() {
            return this.zzac;
        }

        public final int zzd() {
            return this.zzbo;
        }

        public final int zze() {
            return this.zzh.size();
        }

        public final int zzf() {
            return this.zzg;
        }

        public final int zzg() {
            return this.zzaq;
        }

        public final int zzh() {
            return this.zzs;
        }

        public final int zzi() {
            return this.zzi.size();
        }

        public final long zzj() {
            return this.zzam;
        }

        public final long zzk() {
            return this.zzab;
        }

        public final long zzl() {
            return this.zzau;
        }

        public final long zzm() {
            return this.zzl;
        }

        public final long zzn() {
            return this.zzw;
        }

        public final long zzo() {
            return this.zzn;
        }

        public final long zzp() {
            return this.zzm;
        }

        public final long zzq() {
            return this.zzk;
        }

        public final long zzr() {
            return this.zzbg;
        }

        public final long zzs() {
            return this.zzj;
        }

        public final long zzt() {
            return this.zzx;
        }

        public final zzb zzu() {
            zzb zzbVar = this.zzbn;
            return zzbVar == null ? zzb.zzc() : zzbVar;
        }

        public final zze zza(int i) {
            return this.zzh.get(i);
        }

        public static zza zzv() {
            return zzc.zzbz();
        }

        public final zzn zzb(int i) {
            return this.zzi.get(i);
        }

        @Override // com.google.android.gms.internal.measurement.zzjv
        protected final Object zza(int i, Object obj, Object obj2) {
            zzft zzftVar = null;
            switch (zzft.zza[i - 1]) {
                case 1:
                    return new zzj();
                case 2:
                    return new zza(zzftVar);
                case 3:
                    return zza(zzc, "\u0001=\u0000\u0002\u0001M=\u0000\u0005\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဂ\u0001\u0005ဂ\u0002\u0006ဂ\u0003\u0007ဂ\u0005\bဈ\u0006\tဈ\u0007\nဈ\b\u000bဈ\t\fင\n\rဈ\u000b\u000eဈ\f\u0010ဈ\r\u0011ဂ\u000e\u0012ဂ\u000f\u0013ဈ\u0010\u0014ဇ\u0011\u0015ဈ\u0012\u0016ဂ\u0013\u0017င\u0014\u0018ဈ\u0015\u0019ဈ\u0016\u001aဂ\u0004\u001cဇ\u0017\u001d\u001b\u001eဈ\u0018\u001fင\u0019 င\u001a!င\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဈ\u001f&ဈ 'င!)ဈ\",ဉ#-\u001d.ဂ$/ဂ%2ဈ&4ဈ'5᠌(7ဇ)9ဈ*:ဇ+;ဉ,?ဈ-@\u001aAဈ.Cဂ/Dဇ0Gဈ1Hဇ2Iဈ3Jင4Kဈ5Lဉ6Mင7", new Object[]{"zze", "zzf", "zzg", "zzh", zze.class, "zzi", zzn.class, "zzj", "zzk", "zzl", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzaa", "zzab", "zzac", "zzad", "zzae", "zzm", "zzaf", "zzag", zzc.class, "zzah", "zzai", "zzaj", "zzak", "zzal", "zzam", "zzan", "zzao", "zzap", "zzaq", "zzar", "zzas", "zzat", "zzau", "zzav", "zzaw", "zzax", "zzay", zzfw.zzb(), "zzaz", "zzba", "zzbb", "zzbc", "zzbd", "zzbe", "zzbf", "zzbg", "zzbh", "zzbi", "zzbj", "zzbk", "zzbl", "zzbm", "zzbn", "zzbo"});
                case 4:
                    return zzc;
                case 5:
                    zzlr<zzj> zzcVar = zzd;
                    if (zzcVar == null) {
                        synchronized (zzj.class) {
                            zzcVar = zzd;
                            if (zzcVar == null) {
                                zzcVar = new zzjv.zzc<>(zzc);
                                zzd = zzcVar;
                            }
                        }
                    }
                    return zzcVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public final String zzx() {
            return this.zzar;
        }

        public final String zzy() {
            return this.zzu;
        }

        public final String zzz() {
            return this.zzaa;
        }

        public final String zzaa() {
            return this.zzt;
        }

        public final String zzab() {
            return this.zzv;
        }

        public final String zzac() {
            return this.zzbi;
        }

        public final String zzad() {
            return this.zzax;
        }

        public final String zzae() {
            return this.zzbk;
        }

        public final String zzaf() {
            return this.zzq;
        }

        public final String zzag() {
            return this.zzao;
        }

        public final String zzah() {
            return this.zzah;
        }

        public final String zzai() {
            return this.zzae;
        }

        public final String h_() {
            return this.zzad;
        }

        public final String zzak() {
            return this.zzp;
        }

        public final String zzal() {
            return this.zzo;
        }

        public final String zzam() {
            return this.zzy;
        }

        public final String zzan() {
            return this.zzbd;
        }

        public final String zzao() {
            return this.zzr;
        }

        public final List<zzc> zzap() {
            return this.zzag;
        }

        public final List<zze> zzaq() {
            return this.zzh;
        }

        public final List<zzn> zzar() {
            return this.zzi;
        }

        static {
            zzj zzjVar = new zzj();
            zzc = zzjVar;
            zzjv.zza((Class<zzj>) zzj.class, zzjVar);
        }

        private zzj() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(Iterable<? extends zzc> iterable) {
            zzke<zzc> zzkeVar = this.zzag;
            if (!zzkeVar.zzc()) {
                this.zzag = zzjv.zza(zzkeVar);
            }
            zzhz.zza(iterable, this.zzag);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzb(Iterable<? extends zze> iterable) {
            zzcx();
            zzhz.zza(iterable, this.zzh);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzc(Iterable<? extends Integer> iterable) {
            zzkc zzkcVar = this.zzat;
            if (!zzkcVar.zzc()) {
                int size = zzkcVar.size();
                this.zzat = zzkcVar.zza(size == 0 ? 10 : size << 1);
            }
            zzhz.zza(iterable, this.zzat);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzd(Iterable<String> iterable) {
            zzke<String> zzkeVar = this.zzbe;
            if (!zzkeVar.zzc()) {
                this.zzbe = zzjv.zza(zzkeVar);
            }
            zzhz.zza(iterable, this.zzbe);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zze(Iterable<? extends zzn> iterable) {
            zzcy();
            zzhz.zza(iterable, this.zzi);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(zze zzeVar) {
            zzeVar.getClass();
            zzcx();
            this.zzh.add(zzeVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(zzn zznVar) {
            zznVar.getClass();
            zzcy();
            this.zzi.add(zznVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzck() {
            this.zze &= -262145;
            this.zzaa = zzc.zzaa;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzcl() {
            this.zzag = zzce();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzcm() {
            this.zze &= -257;
            this.zzq = zzc.zzq;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzcn() {
            this.zze &= Integer.MAX_VALUE;
            this.zzao = zzc.zzao;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzco() {
            this.zzh = zzce();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzcp() {
            this.zze &= -2097153;
            this.zzad = zzc.zzad;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzcq() {
            this.zze &= -131073;
            this.zzz = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzcr() {
            this.zze &= -129;
            this.zzp = zzc.zzp;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzcs() {
            this.zze &= -33;
            this.zzn = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzct() {
            this.zze &= -17;
            this.zzm = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzcu() {
            this.zze &= -65537;
            this.zzy = zzc.zzy;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzcv() {
            this.zzf &= -8193;
            this.zzbd = zzc.zzbd;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzcw() {
            this.zze &= -268435457;
            this.zzal = zzc.zzal;
        }

        private final void zzcx() {
            zzke<zze> zzkeVar = this.zzh;
            if (zzkeVar.zzc()) {
                return;
            }
            this.zzh = zzjv.zza(zzkeVar);
        }

        private final void zzcy() {
            zzke<zzn> zzkeVar = this.zzi;
            if (zzkeVar.zzc()) {
                return;
            }
            this.zzi = zzjv.zza(zzkeVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzd(int i) {
            zzcx();
            this.zzh.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zze(int i) {
            zzcy();
            this.zzi.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzf(int i) {
            this.zzf |= 1048576;
            this.zzbl = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(String str) {
            str.getClass();
            this.zzf |= 4;
            this.zzar = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzb(String str) {
            str.getClass();
            this.zze |= 4096;
            this.zzu = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzc(String str) {
            str.getClass();
            this.zze |= 262144;
            this.zzaa = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzd(String str) {
            str.getClass();
            this.zze |= 2048;
            this.zzt = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zze(String str) {
            str.getClass();
            this.zze |= 8192;
            this.zzv = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzg(int i) {
            this.zze |= 33554432;
            this.zzai = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(zzb zzbVar) {
            zzbVar.getClass();
            this.zzbn = zzbVar;
            this.zzf |= 4194304;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzh(int i) {
            this.zze |= 1048576;
            this.zzac = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(long j) {
            this.zzf |= 32;
            this.zzav = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzb(long j) {
            this.zze |= 536870912;
            this.zzam = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzf(String str) {
            str.getClass();
            this.zzf |= 131072;
            this.zzbi = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzg(String str) {
            str.getClass();
            this.zzf |= 128;
            this.zzax = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzh(String str) {
            str.getClass();
            this.zzf |= 524288;
            this.zzbk = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzi(int i) {
            this.zzf |= 8388608;
            this.zzbo = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzc(long j) {
            this.zze |= 524288;
            this.zzab = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzi(String str) {
            str.getClass();
            this.zze |= 256;
            this.zzq = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzj(String str) {
            str.getClass();
            this.zze |= Integer.MIN_VALUE;
            this.zzao = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzd(long j) {
            this.zzf |= 16;
            this.zzau = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(boolean z) {
            this.zzf |= 65536;
            this.zzbh = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zze(long j) {
            this.zze |= 8;
            this.zzl = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzk(String str) {
            str.getClass();
            this.zzf |= 16384;
            this.zzbf = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(int i, zze zzeVar) {
            zzeVar.getClass();
            zzcx();
            this.zzh.set(i, zzeVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzl(String str) {
            str.getClass();
            this.zze |= 16777216;
            this.zzah = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzm(String str) {
            str.getClass();
            this.zze |= 4194304;
            this.zzae = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzf(long j) {
            this.zze |= 16384;
            this.zzw = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzn(String str) {
            str.getClass();
            this.zze |= 2097152;
            this.zzad = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzb(boolean z) {
            this.zzf |= 262144;
            this.zzbj = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzc(boolean z) {
            this.zze |= 131072;
            this.zzz = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzo(String str) {
            str.getClass();
            this.zze |= 128;
            this.zzp = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzp(String str) {
            str.getClass();
            this.zze |= 64;
            this.zzo = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(zzk zzkVar) {
            zzkVar.getClass();
            this.zzas = zzkVar;
            this.zzf |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzg(long j) {
            this.zze |= 32;
            this.zzn = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzh(long j) {
            this.zze |= 16;
            this.zzm = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzj(int i) {
            this.zze |= 1;
            this.zzg = 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzq(String str) {
            str.getClass();
            this.zze |= 65536;
            this.zzy = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzk(int i) {
            this.zzf |= 2;
            this.zzaq = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzd(boolean z) {
            this.zze |= 8388608;
            this.zzaf = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzr(String str) {
            str.getClass();
            this.zzf |= 8192;
            this.zzbd = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzi(long j) {
            this.zze |= 4;
            this.zzk = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzj(long j) {
            this.zzf |= 32768;
            this.zzbg = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzl(int i) {
            this.zze |= 1024;
            this.zzs = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzk(long j) {
            this.zze |= 2;
            this.zzj = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzl(long j) {
            this.zze |= 32768;
            this.zzx = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(int i, zzn zznVar) {
            zznVar.getClass();
            zzcy();
            this.zzi.set(i, zznVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzs(String str) {
            str.getClass();
            this.zze |= 512;
            this.zzr = str;
        }

        public final boolean zzas() {
            return this.zzbh;
        }

        public final boolean zzat() {
            return this.zzbj;
        }

        public final boolean zzau() {
            return this.zzz;
        }

        public final boolean zzav() {
            return this.zzaf;
        }

        public final boolean zzaw() {
            return (this.zze & 33554432) != 0;
        }

        public final boolean zzax() {
            return (this.zzf & 4194304) != 0;
        }

        public final boolean zzay() {
            return (this.zze & 1048576) != 0;
        }

        public final boolean zzaz() {
            return (this.zze & 536870912) != 0;
        }

        public final boolean zzba() {
            return (this.zzf & 131072) != 0;
        }

        public final boolean zzbb() {
            return (this.zzf & 128) != 0;
        }

        public final boolean zzbc() {
            return (this.zzf & 524288) != 0;
        }

        public final boolean zzbd() {
            return (this.zzf & 8388608) != 0;
        }

        public final boolean zzbe() {
            return (this.zze & 524288) != 0;
        }

        public final boolean zzbf() {
            return (this.zzf & 16) != 0;
        }

        public final boolean zzbg() {
            return (this.zze & 8) != 0;
        }

        public final boolean zzbh() {
            return (this.zze & 16384) != 0;
        }

        public final boolean zzbi() {
            return (this.zzf & 262144) != 0;
        }

        public final boolean zzbj() {
            return (this.zze & 131072) != 0;
        }

        public final boolean zzbk() {
            return (this.zze & 32) != 0;
        }

        public final boolean zzbl() {
            return (this.zze & 16) != 0;
        }

        public final boolean zzbm() {
            return (this.zze & 1) != 0;
        }

        public final boolean zzbn() {
            return (this.zzf & 2) != 0;
        }

        public final boolean zzbo() {
            return (this.zze & 8388608) != 0;
        }

        public final boolean zzbp() {
            return (this.zzf & 8192) != 0;
        }

        public final boolean zzbq() {
            return (this.zze & 4) != 0;
        }

        public final boolean zzbr() {
            return (this.zzf & 32768) != 0;
        }

        public final boolean zzbs() {
            return (this.zze & 1024) != 0;
        }

        public final boolean zzbt() {
            return (this.zze & 2) != 0;
        }

        public final boolean zzbu() {
            return (this.zze & 32768) != 0;
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@22.0.0 */
    public static final class zzk extends zzjv<zzk, zza> implements zzlk {
        private static final zzk zzc;
        private static volatile zzlr<zzk> zzd;
        private int zze;
        private int zzf = 1;
        private zzke<zzf> zzg = zzce();

        public static zza zza() {
            return zzc.zzbz();
        }

        /* compiled from: com.google.android.gms:play-services-measurement@@22.0.0 */
        public static final class zza extends zzjv.zza<zzk, zza> implements zzlk {
            public final zza zza(zzf.zza zzaVar) {
                zzak();
                ((zzk) this.zza).zza((zzf) ((zzjv) zzaVar.zzah()));
                return this;
            }

            private zza() {
                super(zzk.zzc);
            }

            /* synthetic */ zza(zzft zzftVar) {
                this();
            }
        }

        /* compiled from: com.google.android.gms:play-services-measurement@@22.0.0 */
        public enum zzb implements zzjx {
            RADS(1),
            PROVISIONING(2);

            private static final zzka<zzb> zzc = new zzga();
            private final int zze;

            @Override // com.google.android.gms.internal.measurement.zzjx
            public final int zza() {
                return this.zze;
            }

            public static zzb zza(int i) {
                if (i == 1) {
                    return RADS;
                }
                if (i != 2) {
                    return null;
                }
                return PROVISIONING;
            }

            public static zzjz zzb() {
                return zzgb.zza;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zze + " name=" + name() + Typography.greater;
            }

            zzb(int i) {
                this.zze = i;
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzjv
        protected final Object zza(int i, Object obj, Object obj2) {
            zzft zzftVar = null;
            switch (zzft.zza[i - 1]) {
                case 1:
                    return new zzk();
                case 2:
                    return new zza(zzftVar);
                case 3:
                    return zza(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b", new Object[]{"zze", "zzf", zzb.zzb(), "zzg", zzf.class});
                case 4:
                    return zzc;
                case 5:
                    zzlr<zzk> zzcVar = zzd;
                    if (zzcVar == null) {
                        synchronized (zzk.class) {
                            zzcVar = zzd;
                            if (zzcVar == null) {
                                zzcVar = new zzjv.zzc<>(zzc);
                                zzd = zzcVar;
                            }
                        }
                    }
                    return zzcVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            zzk zzkVar = new zzk();
            zzc = zzkVar;
            zzjv.zza((Class<zzk>) zzk.class, zzkVar);
        }

        private zzk() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(zzf zzfVar) {
            zzfVar.getClass();
            zzke<zzf> zzkeVar = this.zzg;
            if (!zzkeVar.zzc()) {
                this.zzg = zzjv.zza(zzkeVar);
            }
            this.zzg.add(zzfVar);
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@22.0.0 */
    public static final class zzl extends zzjv<zzl, zza> implements zzlk {
        private static final zzl zzc;
        private static volatile zzlr<zzl> zzd;
        private zzkb zze = zzcd();
        private zzkb zzf = zzcd();
        private zzke<zzd> zzg = zzce();
        private zzke<zzm> zzh = zzce();

        public final int zza() {
            return this.zzg.size();
        }

        public final int zzb() {
            return this.zzf.size();
        }

        /* compiled from: com.google.android.gms:play-services-measurement@@22.0.0 */
        public static final class zza extends zzjv.zza<zzl, zza> implements zzlk {
            public final zza zza(Iterable<? extends zzd> iterable) {
                zzak();
                ((zzl) this.zza).zza(iterable);
                return this;
            }

            public final zza zzb(Iterable<? extends Long> iterable) {
                zzak();
                ((zzl) this.zza).zzb(iterable);
                return this;
            }

            public final zza zzc(Iterable<? extends zzm> iterable) {
                zzak();
                ((zzl) this.zza).zzc(iterable);
                return this;
            }

            public final zza zzd(Iterable<? extends Long> iterable) {
                zzak();
                ((zzl) this.zza).zzd(iterable);
                return this;
            }

            public final zza zza() {
                zzak();
                ((zzl) this.zza).zzl();
                return this;
            }

            public final zza zzb() {
                zzak();
                ((zzl) this.zza).zzm();
                return this;
            }

            public final zza zzc() {
                zzak();
                ((zzl) this.zza).zzn();
                return this;
            }

            public final zza zzd() {
                zzak();
                ((zzl) this.zza).zzo();
                return this;
            }

            private zza() {
                super(zzl.zzc);
            }

            /* synthetic */ zza(zzft zzftVar) {
                this();
            }
        }

        public final int zzc() {
            return this.zzh.size();
        }

        public final int zzd() {
            return this.zze.size();
        }

        public static zza zze() {
            return zzc.zzbz();
        }

        public static zzl zzg() {
            return zzc;
        }

        @Override // com.google.android.gms.internal.measurement.zzjv
        protected final Object zza(int i, Object obj, Object obj2) {
            zzft zzftVar = null;
            switch (zzft.zza[i - 1]) {
                case 1:
                    return new zzl();
                case 2:
                    return new zza(zzftVar);
                case 3:
                    return zza(zzc, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zze", "zzf", "zzg", zzd.class, "zzh", zzm.class});
                case 4:
                    return zzc;
                case 5:
                    zzlr<zzl> zzcVar = zzd;
                    if (zzcVar == null) {
                        synchronized (zzl.class) {
                            zzcVar = zzd;
                            if (zzcVar == null) {
                                zzcVar = new zzjv.zzc<>(zzc);
                                zzd = zzcVar;
                            }
                        }
                    }
                    return zzcVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public final List<zzd> zzh() {
            return this.zzg;
        }

        public final List<Long> zzi() {
            return this.zzf;
        }

        public final List<zzm> zzj() {
            return this.zzh;
        }

        public final List<Long> zzk() {
            return this.zze;
        }

        static {
            zzl zzlVar = new zzl();
            zzc = zzlVar;
            zzjv.zza((Class<zzl>) zzl.class, zzlVar);
        }

        private zzl() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(Iterable<? extends zzd> iterable) {
            zzke<zzd> zzkeVar = this.zzg;
            if (!zzkeVar.zzc()) {
                this.zzg = zzjv.zza(zzkeVar);
            }
            zzhz.zza(iterable, this.zzg);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzb(Iterable<? extends Long> iterable) {
            zzkb zzkbVar = this.zzf;
            if (!zzkbVar.zzc()) {
                this.zzf = zzjv.zza(zzkbVar);
            }
            zzhz.zza(iterable, this.zzf);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzc(Iterable<? extends zzm> iterable) {
            zzke<zzm> zzkeVar = this.zzh;
            if (!zzkeVar.zzc()) {
                this.zzh = zzjv.zza(zzkeVar);
            }
            zzhz.zza(iterable, this.zzh);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzd(Iterable<? extends Long> iterable) {
            zzkb zzkbVar = this.zze;
            if (!zzkbVar.zzc()) {
                this.zze = zzjv.zza(zzkbVar);
            }
            zzhz.zza(iterable, this.zze);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzl() {
            this.zzg = zzce();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzm() {
            this.zzf = zzcd();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzn() {
            this.zzh = zzce();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzo() {
            this.zze = zzcd();
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@22.0.0 */
    public static final class zzm extends zzjv<zzm, zza> implements zzlk {
        private static final zzm zzc;
        private static volatile zzlr<zzm> zzd;
        private int zze;
        private int zzf;
        private zzkb zzg = zzcd();

        public final int zza() {
            return this.zzg.size();
        }

        public final int zzb() {
            return this.zzf;
        }

        /* compiled from: com.google.android.gms:play-services-measurement@@22.0.0 */
        public static final class zza extends zzjv.zza<zzm, zza> implements zzlk {
            public final zza zza(Iterable<? extends Long> iterable) {
                zzak();
                ((zzm) this.zza).zza(iterable);
                return this;
            }

            public final zza zza(int i) {
                zzak();
                ((zzm) this.zza).zzb(i);
                return this;
            }

            private zza() {
                super(zzm.zzc);
            }

            /* synthetic */ zza(zzft zzftVar) {
                this();
            }
        }

        public final long zza(int i) {
            return this.zzg.zzb(i);
        }

        public static zza zzc() {
            return zzc.zzbz();
        }

        @Override // com.google.android.gms.internal.measurement.zzjv
        protected final Object zza(int i, Object obj, Object obj2) {
            zzft zzftVar = null;
            switch (zzft.zza[i - 1]) {
                case 1:
                    return new zzm();
                case 2:
                    return new zza(zzftVar);
                case 3:
                    return zza(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zze", "zzf", "zzg"});
                case 4:
                    return zzc;
                case 5:
                    zzlr<zzm> zzcVar = zzd;
                    if (zzcVar == null) {
                        synchronized (zzm.class) {
                            zzcVar = zzd;
                            if (zzcVar == null) {
                                zzcVar = new zzjv.zzc<>(zzc);
                                zzd = zzcVar;
                            }
                        }
                    }
                    return zzcVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public final List<Long> zze() {
            return this.zzg;
        }

        static {
            zzm zzmVar = new zzm();
            zzc = zzmVar;
            zzjv.zza((Class<zzm>) zzm.class, zzmVar);
        }

        private zzm() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(Iterable<? extends Long> iterable) {
            zzkb zzkbVar = this.zzg;
            if (!zzkbVar.zzc()) {
                this.zzg = zzjv.zza(zzkbVar);
            }
            zzhz.zza(iterable, this.zzg);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzb(int i) {
            this.zze |= 1;
            this.zzf = i;
        }

        public final boolean zzf() {
            return (this.zze & 1) != 0;
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@22.0.0 */
    public static final class zzn extends zzjv<zzn, zza> implements zzlk {
        private static final zzn zzc;
        private static volatile zzlr<zzn> zzd;
        private int zze;
        private long zzf;
        private String zzg = "";
        private String zzh = "";
        private long zzi;
        private float zzj;
        private double zzk;

        public final double zza() {
            return this.zzk;
        }

        public final float zzb() {
            return this.zzj;
        }

        /* compiled from: com.google.android.gms:play-services-measurement@@22.0.0 */
        public static final class zza extends zzjv.zza<zzn, zza> implements zzlk {
            public final zza zza() {
                zzak();
                ((zzn) this.zza).zzn();
                return this;
            }

            public final zza zzb() {
                zzak();
                ((zzn) this.zza).zzo();
                return this;
            }

            public final zza zzc() {
                zzak();
                ((zzn) this.zza).zzp();
                return this;
            }

            public final zza zza(double d) {
                zzak();
                ((zzn) this.zza).zza(d);
                return this;
            }

            public final zza zza(long j) {
                zzak();
                ((zzn) this.zza).zza(j);
                return this;
            }

            public final zza zza(String str) {
                zzak();
                ((zzn) this.zza).zza(str);
                return this;
            }

            public final zza zzb(long j) {
                zzak();
                ((zzn) this.zza).zzb(j);
                return this;
            }

            public final zza zzb(String str) {
                zzak();
                ((zzn) this.zza).zzb(str);
                return this;
            }

            private zza() {
                super(zzn.zzc);
            }

            /* synthetic */ zza(zzft zzftVar) {
                this();
            }
        }

        public final long zzc() {
            return this.zzi;
        }

        public final long zzd() {
            return this.zzf;
        }

        public static zza zze() {
            return zzc.zzbz();
        }

        @Override // com.google.android.gms.internal.measurement.zzjv
        protected final Object zza(int i, Object obj, Object obj2) {
            zzft zzftVar = null;
            switch (zzft.zza[i - 1]) {
                case 1:
                    return new zzn();
                case 2:
                    return new zza(zzftVar);
                case 3:
                    return zza(zzc, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
                case 4:
                    return zzc;
                case 5:
                    zzlr<zzn> zzcVar = zzd;
                    if (zzcVar == null) {
                        synchronized (zzn.class) {
                            zzcVar = zzd;
                            if (zzcVar == null) {
                                zzcVar = new zzjv.zzc<>(zzc);
                                zzd = zzcVar;
                            }
                        }
                    }
                    return zzcVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public final String zzg() {
            return this.zzg;
        }

        public final String zzh() {
            return this.zzh;
        }

        static {
            zzn zznVar = new zzn();
            zzc = zznVar;
            zzjv.zza((Class<zzn>) zzn.class, zznVar);
        }

        private zzn() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzn() {
            this.zze &= -33;
            this.zzk = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzo() {
            this.zze &= -9;
            this.zzi = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzp() {
            this.zze &= -5;
            this.zzh = zzc.zzh;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(double d) {
            this.zze |= 32;
            this.zzk = d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(long j) {
            this.zze |= 8;
            this.zzi = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(String str) {
            str.getClass();
            this.zze |= 2;
            this.zzg = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzb(long j) {
            this.zze |= 1;
            this.zzf = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzb(String str) {
            str.getClass();
            this.zze |= 4;
            this.zzh = str;
        }

        public final boolean zzi() {
            return (this.zze & 32) != 0;
        }

        public final boolean zzj() {
            return (this.zze & 16) != 0;
        }

        public final boolean zzk() {
            return (this.zze & 8) != 0;
        }

        public final boolean zzl() {
            return (this.zze & 1) != 0;
        }

        public final boolean zzm() {
            return (this.zze & 4) != 0;
        }
    }
}
