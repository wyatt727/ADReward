package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jacoco.core.runtime.AgentOptions;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.0 */
/* loaded from: classes3.dex */
final class zznb {
    static final boolean zza;
    private static final Unsafe zzb;
    private static final Class<?> zzc;
    private static final boolean zzd;
    private static final boolean zze;
    private static final zzb zzf;
    private static final boolean zzg;
    private static final boolean zzh;
    private static final long zzi;
    private static final long zzj;
    private static final long zzk;
    private static final long zzl;
    private static final long zzm;
    private static final long zzn;
    private static final long zzo;
    private static final long zzp;
    private static final long zzq;
    private static final long zzr;
    private static final long zzs;
    private static final long zzt;
    private static final long zzu;
    private static final long zzv;
    private static final int zzw;

    /* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.0 */
    private static final class zza extends zzb {
        @Override // com.google.android.gms.internal.measurement.zznb.zzb
        public final double zza(Object obj, long j) {
            return Double.longBitsToDouble(zze(obj, j));
        }

        @Override // com.google.android.gms.internal.measurement.zznb.zzb
        public final float zzb(Object obj, long j) {
            return Float.intBitsToFloat(zzd(obj, j));
        }

        zza(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.measurement.zznb.zzb
        public final void zza(Object obj, long j, boolean z) {
            if (zznb.zza) {
                zznb.zza(obj, j, z);
            } else {
                zznb.zzb(obj, j, z);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zznb.zzb
        public final void zza(Object obj, long j, byte b) {
            if (zznb.zza) {
                zznb.zzc(obj, j, b);
            } else {
                zznb.zzd(obj, j, b);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zznb.zzb
        public final void zza(Object obj, long j, double d) {
            zza(obj, j, Double.doubleToLongBits(d));
        }

        @Override // com.google.android.gms.internal.measurement.zznb.zzb
        public final void zza(Object obj, long j, float f) {
            zza(obj, j, Float.floatToIntBits(f));
        }

        @Override // com.google.android.gms.internal.measurement.zznb.zzb
        public final boolean zzc(Object obj, long j) {
            if (zznb.zza) {
                return zznb.zzf(obj, j);
            }
            return zznb.zzg(obj, j);
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.0 */
    private static abstract class zzb {
        Unsafe zza;

        public abstract double zza(Object obj, long j);

        public abstract void zza(Object obj, long j, byte b);

        public abstract void zza(Object obj, long j, double d);

        public abstract void zza(Object obj, long j, float f);

        public abstract void zza(Object obj, long j, boolean z);

        public abstract float zzb(Object obj, long j);

        public abstract boolean zzc(Object obj, long j);

        public final int zzd(Object obj, long j) {
            return this.zza.getInt(obj, j);
        }

        public final long zze(Object obj, long j) {
            return this.zza.getLong(obj, j);
        }

        zzb(Unsafe unsafe) {
            this.zza = unsafe;
        }

        public final void zza(Object obj, long j, int i) {
            this.zza.putInt(obj, j, i);
        }

        public final void zza(Object obj, long j, long j2) {
            this.zza.putLong(obj, j, j2);
        }

        public final boolean zza() {
            Unsafe unsafe = this.zza;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("arrayBaseOffset", Class.class);
                cls.getMethod("arrayIndexScale", Class.class);
                cls.getMethod("getInt", Object.class, Long.TYPE);
                cls.getMethod("putInt", Object.class, Long.TYPE, Integer.TYPE);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                cls.getMethod("putLong", Object.class, Long.TYPE, Long.TYPE);
                cls.getMethod("getObject", Object.class, Long.TYPE);
                cls.getMethod("putObject", Object.class, Long.TYPE, Object.class);
                return true;
            } catch (Throwable th) {
                zznb.zza(th);
                return false;
            }
        }

        public final boolean zzb() {
            Unsafe unsafe = this.zza;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                return zznb.zze() != null;
            } catch (Throwable th) {
                zznb.zza(th);
                return false;
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.0 */
    private static final class zzc extends zzb {
        @Override // com.google.android.gms.internal.measurement.zznb.zzb
        public final double zza(Object obj, long j) {
            return Double.longBitsToDouble(zze(obj, j));
        }

        @Override // com.google.android.gms.internal.measurement.zznb.zzb
        public final float zzb(Object obj, long j) {
            return Float.intBitsToFloat(zzd(obj, j));
        }

        zzc(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.measurement.zznb.zzb
        public final void zza(Object obj, long j, boolean z) {
            if (zznb.zza) {
                zznb.zza(obj, j, z);
            } else {
                zznb.zzb(obj, j, z);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zznb.zzb
        public final void zza(Object obj, long j, byte b) {
            if (zznb.zza) {
                zznb.zzc(obj, j, b);
            } else {
                zznb.zzd(obj, j, b);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zznb.zzb
        public final void zza(Object obj, long j, double d) {
            zza(obj, j, Double.doubleToLongBits(d));
        }

        @Override // com.google.android.gms.internal.measurement.zznb.zzb
        public final void zza(Object obj, long j, float f) {
            zza(obj, j, Float.floatToIntBits(f));
        }

        @Override // com.google.android.gms.internal.measurement.zznb.zzb
        public final boolean zzc(Object obj, long j) {
            if (zznb.zza) {
                return zznb.zzf(obj, j);
            }
            return zznb.zzg(obj, j);
        }
    }

    static double zza(Object obj, long j) {
        return zzf.zza(obj, j);
    }

    static float zzb(Object obj, long j) {
        return zzf.zzb(obj, j);
    }

    private static int zzb(Class<?> cls) {
        if (zzh) {
            return zzf.zza.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int zzc(Class<?> cls) {
        if (zzh) {
            return zzf.zza.arrayIndexScale(cls);
        }
        return -1;
    }

    static int zzc(Object obj, long j) {
        return zzf.zzd(obj, j);
    }

    static long zzd(Object obj, long j) {
        return zzf.zze(obj, j);
    }

    static <T> T zza(Class<T> cls) {
        try {
            return (T) zzb.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    static Object zze(Object obj, long j) {
        return zzf.zza.getObject(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Field zze() {
        Field fieldZza = zza((Class<?>) Buffer.class, "effectiveDirectAddress");
        if (fieldZza != null) {
            return fieldZza;
        }
        Field fieldZza2 = zza((Class<?>) Buffer.class, AgentOptions.ADDRESS);
        if (fieldZza2 == null || fieldZza2.getType() != Long.TYPE) {
            return null;
        }
        return fieldZza2;
    }

    private static Field zza(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    static Unsafe zzb() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zznd());
        } catch (Throwable unused) {
            return null;
        }
    }

    static /* synthetic */ void zza(Throwable th) {
        Logger.getLogger(zznb.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: " + String.valueOf(th));
    }

    static /* synthetic */ void zza(Object obj, long j, boolean z) {
        zzc(obj, j, z ? (byte) 1 : (byte) 0);
    }

    static /* synthetic */ void zzb(Object obj, long j, boolean z) {
        zzd(obj, j, z ? (byte) 1 : (byte) 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0038  */
    static {
        /*
            java.lang.Class<double[]> r0 = double[].class
            java.lang.Class<float[]> r1 = float[].class
            java.lang.Class<long[]> r2 = long[].class
            java.lang.Class<int[]> r3 = int[].class
            java.lang.Class<boolean[]> r4 = boolean[].class
            sun.misc.Unsafe r5 = zzb()
            com.google.android.gms.internal.measurement.zznb.zzb = r5
            java.lang.Class r6 = com.google.android.gms.internal.measurement.zzif.zza()
            com.google.android.gms.internal.measurement.zznb.zzc = r6
            java.lang.Class r6 = java.lang.Long.TYPE
            boolean r6 = zzd(r6)
            com.google.android.gms.internal.measurement.zznb.zzd = r6
            java.lang.Class r7 = java.lang.Integer.TYPE
            boolean r7 = zzd(r7)
            com.google.android.gms.internal.measurement.zznb.zze = r7
            if (r5 == 0) goto L38
            if (r6 == 0) goto L30
            com.google.android.gms.internal.measurement.zznb$zzc r6 = new com.google.android.gms.internal.measurement.zznb$zzc
            r6.<init>(r5)
            goto L39
        L30:
            if (r7 == 0) goto L38
            com.google.android.gms.internal.measurement.zznb$zza r6 = new com.google.android.gms.internal.measurement.zznb$zza
            r6.<init>(r5)
            goto L39
        L38:
            r6 = 0
        L39:
            com.google.android.gms.internal.measurement.zznb.zzf = r6
            r5 = 0
            if (r6 != 0) goto L40
            r7 = r5
            goto L44
        L40:
            boolean r7 = r6.zzb()
        L44:
            com.google.android.gms.internal.measurement.zznb.zzg = r7
            if (r6 != 0) goto L4a
            r7 = r5
            goto L4e
        L4a:
            boolean r7 = r6.zza()
        L4e:
            com.google.android.gms.internal.measurement.zznb.zzh = r7
            java.lang.Class<byte[]> r7 = byte[].class
            int r7 = zzb(r7)
            long r7 = (long) r7
            com.google.android.gms.internal.measurement.zznb.zzi = r7
            int r9 = zzb(r4)
            long r9 = (long) r9
            com.google.android.gms.internal.measurement.zznb.zzj = r9
            int r4 = zzc(r4)
            long r9 = (long) r4
            com.google.android.gms.internal.measurement.zznb.zzk = r9
            int r4 = zzb(r3)
            long r9 = (long) r4
            com.google.android.gms.internal.measurement.zznb.zzl = r9
            int r3 = zzc(r3)
            long r3 = (long) r3
            com.google.android.gms.internal.measurement.zznb.zzm = r3
            int r3 = zzb(r2)
            long r3 = (long) r3
            com.google.android.gms.internal.measurement.zznb.zzn = r3
            int r2 = zzc(r2)
            long r2 = (long) r2
            com.google.android.gms.internal.measurement.zznb.zzo = r2
            int r2 = zzb(r1)
            long r2 = (long) r2
            com.google.android.gms.internal.measurement.zznb.zzp = r2
            int r1 = zzc(r1)
            long r1 = (long) r1
            com.google.android.gms.internal.measurement.zznb.zzq = r1
            int r1 = zzb(r0)
            long r1 = (long) r1
            com.google.android.gms.internal.measurement.zznb.zzr = r1
            int r0 = zzc(r0)
            long r0 = (long) r0
            com.google.android.gms.internal.measurement.zznb.zzs = r0
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            int r0 = zzb(r0)
            long r0 = (long) r0
            com.google.android.gms.internal.measurement.zznb.zzt = r0
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            int r0 = zzc(r0)
            long r0 = (long) r0
            com.google.android.gms.internal.measurement.zznb.zzu = r0
            java.lang.reflect.Field r0 = zze()
            if (r0 == 0) goto Lc1
            if (r6 != 0) goto Lba
            goto Lc1
        Lba:
            sun.misc.Unsafe r1 = r6.zza
            long r0 = r1.objectFieldOffset(r0)
            goto Lc3
        Lc1:
            r0 = -1
        Lc3:
            com.google.android.gms.internal.measurement.zznb.zzv = r0
            r0 = 7
            long r0 = r0 & r7
            int r0 = (int) r0
            com.google.android.gms.internal.measurement.zznb.zzw = r0
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto Ld4
            r5 = 1
        Ld4:
            com.google.android.gms.internal.measurement.zznb.zza = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zznb.<clinit>():void");
    }

    private zznb() {
    }

    static void zzc(Object obj, long j, boolean z) {
        zzf.zza(obj, j, z);
    }

    static void zza(byte[] bArr, long j, byte b) {
        zzf.zza((Object) bArr, zzi + j, b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzc(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int iZzc = zzc(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        zza(obj, j2, ((255 & b) << i) | (iZzc & (~(255 << i))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzd(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        zza(obj, j2, ((255 & b) << i) | (zzc(obj, j2) & (~(255 << i))));
    }

    static void zza(Object obj, long j, double d) {
        zzf.zza(obj, j, d);
    }

    static void zza(Object obj, long j, float f) {
        zzf.zza(obj, j, f);
    }

    static void zza(Object obj, long j, int i) {
        zzf.zza(obj, j, i);
    }

    static void zza(Object obj, long j, long j2) {
        zzf.zza(obj, j, j2);
    }

    static void zza(Object obj, long j, Object obj2) {
        zzf.zza.putObject(obj, j, obj2);
    }

    static /* synthetic */ boolean zzf(Object obj, long j) {
        return ((byte) (zzc(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3)))) != 0;
    }

    static /* synthetic */ boolean zzg(Object obj, long j) {
        return ((byte) (zzc(obj, (-4) & j) >>> ((int) ((j & 3) << 3)))) != 0;
    }

    private static boolean zzd(Class<?> cls) {
        try {
            Class<?> cls2 = zzc;
            cls2.getMethod("peekLong", cls, Boolean.TYPE);
            cls2.getMethod("pokeLong", cls, Long.TYPE, Boolean.TYPE);
            cls2.getMethod("pokeInt", cls, Integer.TYPE, Boolean.TYPE);
            cls2.getMethod("peekInt", cls, Boolean.TYPE);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, Integer.TYPE, Integer.TYPE);
            cls2.getMethod("peekByteArray", cls, byte[].class, Integer.TYPE, Integer.TYPE);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    static boolean zzh(Object obj, long j) {
        return zzf.zzc(obj, j);
    }

    static boolean zzc() {
        return zzh;
    }

    static boolean zzd() {
        return zzg;
    }
}
