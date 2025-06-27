package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzjv;
import com.google.android.gms.internal.measurement.zzjv.zza;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.0 */
/* loaded from: classes3.dex */
public abstract class zzjv<MessageType extends zzjv<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>> extends zzhz<MessageType, BuilderType> {
    private static Map<Object, zzjv<?, ?>> zzc = new ConcurrentHashMap();
    private int zzd = -1;
    protected zzmy zzb = zzmy.zzc();

    /* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.0 */
    public static abstract class zza<MessageType extends zzjv<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>> extends zzib<MessageType, BuilderType> {
        protected MessageType zza;
        private final MessageType zzb;

        @Override // com.google.android.gms.internal.measurement.zzib
        /* renamed from: zzae */
        public final /* synthetic */ zzib clone() {
            return (zza) clone();
        }

        @Override // com.google.android.gms.internal.measurement.zzib
        /* renamed from: zza */
        public final /* synthetic */ zzib zzb(zziw zziwVar, zzji zzjiVar) throws IOException {
            return (zza) zzb(zziwVar, zzjiVar);
        }

        @Override // com.google.android.gms.internal.measurement.zzib
        public final /* synthetic */ zzib zza(byte[] bArr, int i, int i2) throws zzkd {
            return zzb(bArr, 0, i2, zzji.zza);
        }

        @Override // com.google.android.gms.internal.measurement.zzib
        public final /* synthetic */ zzib zza(byte[] bArr, int i, int i2, zzji zzjiVar) throws zzkd {
            return zzb(bArr, 0, i2, zzjiVar);
        }

        public final BuilderType zza(MessageType messagetype) {
            if (this.zzb.equals(messagetype)) {
                return this;
            }
            if (!this.zza.zzcj()) {
                zzal();
            }
            zza(this.zza, messagetype);
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.google.android.gms.internal.measurement.zzib
        /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
        public final BuilderType zzb(zziw zziwVar, zzji zzjiVar) throws IOException {
            if (!this.zza.zzcj()) {
                zzal();
            }
            try {
                zzlw.zza().zza((zzlw) this.zza).zza(this.zza, zzja.zza(zziwVar), zzjiVar);
                return this;
            } catch (RuntimeException e) {
                if (e.getCause() instanceof IOException) {
                    throw ((IOException) e.getCause());
                }
                throw e;
            }
        }

        private final BuilderType zzb(byte[] bArr, int i, int i2, zzji zzjiVar) throws zzkd {
            if (!this.zza.zzcj()) {
                zzal();
            }
            try {
                zzlw.zza().zza((zzlw) this.zza).zza(this.zza, bArr, 0, i2, new zzih(zzjiVar));
                return this;
            } catch (zzkd e) {
                throw e;
            } catch (IOException e2) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
            } catch (IndexOutOfBoundsException unused) {
                throw zzkd.zzh();
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzlh
        /* renamed from: zzaf, reason: merged with bridge method [inline-methods] */
        public final MessageType zzah() {
            MessageType messagetype = (MessageType) zzai();
            if (messagetype.i_()) {
                return messagetype;
            }
            throw new zzmw(messagetype);
        }

        @Override // com.google.android.gms.internal.measurement.zzlh
        /* renamed from: zzag, reason: merged with bridge method [inline-methods] */
        public MessageType zzai() {
            if (!this.zza.zzcj()) {
                return this.zza;
            }
            this.zza.zzch();
            return this.zza;
        }

        @Override // com.google.android.gms.internal.measurement.zzlk
        public final /* synthetic */ zzli zzaj() {
            return this.zzb;
        }

        @Override // com.google.android.gms.internal.measurement.zzib
        public /* synthetic */ Object clone() throws CloneNotSupportedException {
            zza zzaVar = (zza) this.zzb.zza(zzf.zze, null, null);
            zzaVar.zza = (MessageType) zzai();
            return zzaVar;
        }

        protected zza(MessageType messagetype) {
            this.zzb = messagetype;
            if (messagetype.zzcj()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.zza = (MessageType) messagetype.zzcb();
        }

        protected final void zzak() {
            if (this.zza.zzcj()) {
                return;
            }
            zzal();
        }

        protected void zzal() {
            MessageType messagetype = (MessageType) this.zzb.zzcb();
            zza(messagetype, this.zza);
            this.zza = messagetype;
        }

        private static <MessageType> void zza(MessageType messagetype, MessageType messagetype2) {
            zzlw.zza().zza((zzlw) messagetype).zza(messagetype, messagetype2);
        }

        @Override // com.google.android.gms.internal.measurement.zzlk
        public final boolean i_() {
            return zzjv.zza(this.zza, false);
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.0 */
    public static abstract class zzb<MessageType extends zzb<MessageType, BuilderType>, BuilderType> extends zzjv<MessageType, BuilderType> implements zzlk {
        protected zzjl<zze> zzc = zzjl.zzb();

        final zzjl<zze> zza() {
            if (this.zzc.zzf()) {
                this.zzc = (zzjl) this.zzc.clone();
            }
            return this.zzc;
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.0 */
    protected static class zzc<T extends zzjv<T, ?>> extends zzid<T> {
        private final T zza;

        public zzc(T t) {
            this.zza = t;
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.0 */
    public static class zzd<ContainingType extends zzli, Type> extends zzjg<ContainingType, Type> {
    }

    /* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.0 */
    static final class zze implements zzjn<zze> {
        @Override // java.lang.Comparable
        public final /* synthetic */ int compareTo(Object obj) {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.measurement.zzjn
        public final int zza() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.measurement.zzjn
        public final zzlh zza(zzlh zzlhVar, zzli zzliVar) {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.measurement.zzjn
        public final zzln zza(zzln zzlnVar, zzln zzlnVar2) {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.measurement.zzjn
        public final zzni zzb() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.measurement.zzjn
        public final zzns zzc() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.measurement.zzjn
        public final boolean zzd() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.measurement.zzjn
        public final boolean zze() {
            throw new NoSuchMethodError();
        }
    }

    private final int zza() {
        return zzlw.zza().zza((zzlw) this).zzb(this);
    }

    protected abstract Object zza(int i, Object obj, Object obj2);

    private final int zzb(zzma<?> zzmaVar) {
        if (zzmaVar == null) {
            return zzlw.zza().zza((zzlw) this).zza(this);
        }
        return zzmaVar.zza(this);
    }

    @Override // com.google.android.gms.internal.measurement.zzhz
    final int zzbv() {
        return this.zzd & Integer.MAX_VALUE;
    }

    @Override // com.google.android.gms.internal.measurement.zzli
    public final int zzby() {
        return zza((zzma) null);
    }

    /* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.0 */
    public enum zzf {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        public static final int zze = 5;
        public static final int zzf = 6;
        public static final int zzg = 7;
        private static final /* synthetic */ int[] zzh = {1, 2, 3, 4, 5, 6, 7};

        public static int[] zza() {
            return (int[]) zzh.clone();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzhz
    final int zza(zzma zzmaVar) {
        if (zzcj()) {
            int iZzb = zzb(zzmaVar);
            if (iZzb >= 0) {
                return iZzb;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + iZzb);
        }
        if (zzbv() != Integer.MAX_VALUE) {
            return zzbv();
        }
        int iZzb2 = zzb(zzmaVar);
        zzc(iZzb2);
        return iZzb2;
    }

    public int hashCode() {
        if (zzcj()) {
            return zza();
        }
        if (this.zza == 0) {
            this.zza = zza();
        }
        return this.zza;
    }

    protected final <MessageType extends zzjv<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>> BuilderType zzbz() {
        return (BuilderType) zza(zzf.zze, (Object) null, (Object) null);
    }

    public final BuilderType zzca() {
        return (BuilderType) ((zza) zza(zzf.zze, (Object) null, (Object) null)).zza((zza) this);
    }

    static <T extends zzjv<?, ?>> T zza(Class<T> cls) throws ClassNotFoundException {
        zzjv<?, ?> zzjvVar = zzc.get(cls);
        if (zzjvVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzjvVar = zzc.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (zzjvVar == null) {
            zzjvVar = (T) ((zzjv) zznb.zza(cls)).zza(zzf.zzf, (Object) null, (Object) null);
            if (zzjvVar == null) {
                throw new IllegalStateException();
            }
            zzc.put(cls, zzjvVar);
        }
        return (T) zzjvVar;
    }

    final MessageType zzcb() {
        return (MessageType) zza(zzf.zzd, (Object) null, (Object) null);
    }

    protected static zzkc zzcc() {
        return zzjw.zzd();
    }

    protected static zzkb zzcd() {
        return zzkt.zzd();
    }

    protected static zzkb zza(zzkb zzkbVar) {
        int size = zzkbVar.size();
        return zzkbVar.zza(size == 0 ? 10 : size << 1);
    }

    protected static <E> zzke<E> zzce() {
        return zzlv.zzd();
    }

    protected static <E> zzke<E> zza(zzke<E> zzkeVar) {
        int size = zzkeVar.size();
        return zzkeVar.zza(size == 0 ? 10 : size << 1);
    }

    @Override // com.google.android.gms.internal.measurement.zzli
    public final /* synthetic */ zzlh zzcf() {
        return (zza) zza(zzf.zze, (Object) null, (Object) null);
    }

    @Override // com.google.android.gms.internal.measurement.zzli
    public final /* synthetic */ zzlh zzcg() {
        return ((zza) zza(zzf.zze, (Object) null, (Object) null)).zza((zza) this);
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final /* synthetic */ zzli zzaj() {
        return (zzjv) zza(zzf.zzf, (Object) null, (Object) null);
    }

    static Object zza(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    protected static Object zza(zzli zzliVar, String str, Object[] objArr) {
        return new zzly(zzliVar, str, objArr);
    }

    public String toString() {
        return zzlj.zza(this, super.toString());
    }

    protected final void zzch() {
        zzlw.zza().zza((zzlw) this).zzc(this);
        zzci();
    }

    final void zzci() {
        this.zzd &= Integer.MAX_VALUE;
    }

    protected static <T extends zzjv<?, ?>> void zza(Class<T> cls, T t) {
        t.zzci();
        zzc.put(cls, t);
    }

    @Override // com.google.android.gms.internal.measurement.zzhz
    final void zzc(int i) {
        if (i < 0) {
            throw new IllegalStateException("serialized size must be non-negative, was " + i);
        }
        this.zzd = (i & Integer.MAX_VALUE) | (this.zzd & Integer.MIN_VALUE);
    }

    @Override // com.google.android.gms.internal.measurement.zzli
    public final void zza(zzjc zzjcVar) throws IOException {
        zzlw.zza().zza((zzlw) this).zza((zzma) this, (zznv) zzje.zza(zzjcVar));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return zzlw.zza().zza((zzlw) this).zzb(this, (zzjv) obj);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final boolean i_() {
        Boolean bool = Boolean.TRUE;
        return zza(this, true);
    }

    protected static final <T extends zzjv<T, ?>> boolean zza(T t, boolean z) {
        byte bByteValue = ((Byte) t.zza(zzf.zza, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zZzd = zzlw.zza().zza((zzlw) t).zzd(t);
        if (z) {
            t.zza(zzf.zzb, zZzd ? t : null, null);
        }
        return zZzd;
    }

    final boolean zzcj() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }
}
