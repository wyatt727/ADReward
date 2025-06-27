package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgzp;
import com.google.android.gms.internal.ads.zzgzv;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
public abstract class zzgzv<MessageType extends zzgzv<MessageType, BuilderType>, BuilderType extends zzgzp<MessageType, BuilderType>> extends zzgxq<MessageType, BuilderType> {
    private static final int zza = Integer.MIN_VALUE;
    private static final int zzb = Integer.MAX_VALUE;
    private static Map<Object, zzgzv<?, ?>> zzc = new ConcurrentHashMap();
    static final int zzr = Integer.MAX_VALUE;
    static final int zzs = 0;
    private int zzd = -1;
    protected zzhcy zzt = zzhcy.zzc();

    protected static zzgzx zzbA() {
        return zzgxx.zzd();
    }

    protected static zzgzx zzbB(zzgzx zzgzxVar) {
        int size = zzgzxVar.size();
        return zzgzxVar.zzf(size == 0 ? 10 : size + size);
    }

    protected static zzgzy zzbC() {
        return zzgzc.zzd();
    }

    protected static zzgzy zzbD(zzgzy zzgzyVar) {
        int size = zzgzyVar.size();
        return zzgzyVar.zzf(size == 0 ? 10 : size + size);
    }

    protected static zzhac zzbE() {
        return zzgzm.zzd();
    }

    protected static zzhac zzbF(zzhac zzhacVar) {
        int size = zzhacVar.size();
        return zzhacVar.zzf(size == 0 ? 10 : size + size);
    }

    protected static zzhad zzbG() {
        return zzgzw.zzg();
    }

    protected static zzhad zzbH(zzhad zzhadVar) {
        int size = zzhadVar.size();
        return zzhadVar.zzf(size == 0 ? 10 : size + size);
    }

    protected static zzhag zzbI() {
        return zzhba.zzh();
    }

    protected static zzhag zzbJ(zzhag zzhagVar) {
        int size = zzhagVar.size();
        return zzhagVar.zzf(size == 0 ? 10 : size + size);
    }

    protected static <E> zzhah<E> zzbK() {
        return zzhbw.zzd();
    }

    protected static <E> zzhah<E> zzbL(zzhah<E> zzhahVar) {
        int size = zzhahVar.size();
        return zzhahVar.zzf(size == 0 ? 10 : size + size);
    }

    static Object zzbQ(Method method, Object obj, Object... objArr) {
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

    protected static Object zzbR(zzhbl zzhblVar, String str, Object[] objArr) {
        return new zzhbx(zzhblVar, str, objArr);
    }

    static Method zzbS(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException("Generated message class \"" + cls.getName() + "\" missing method \"" + str + "\".", e);
        }
    }

    public static <ContainingType extends zzhbl, Type> zzgzt<ContainingType, Type> zzbe(ContainingType containingtype, zzhbl zzhblVar, zzhaa zzhaaVar, int i, zzhdn zzhdnVar, boolean z, Class cls) {
        return new zzgzt<>(containingtype, Collections.emptyList(), zzhblVar, new zzgzs(zzhaaVar, i, zzhdnVar, true, z), cls);
    }

    public static <ContainingType extends zzhbl, Type> zzgzt<ContainingType, Type> zzbf(ContainingType containingtype, Type type, zzhbl zzhblVar, zzhaa zzhaaVar, int i, zzhdn zzhdnVar, Class cls) {
        return new zzgzt<>(containingtype, type, zzhblVar, new zzgzs(zzhaaVar, i, zzhdnVar, false, false), cls);
    }

    static <T extends zzgzv> T zzbh(Class<T> cls) throws ClassNotFoundException {
        zzgzv<?, ?> zzgzvVarZzbt = zzc.get(cls);
        if (zzgzvVarZzbt == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzgzvVarZzbt = zzc.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (zzgzvVarZzbt == null) {
            zzgzvVarZzbt = ((zzgzv) zzhdh.zzg(cls)).zzbt();
            if (zzgzvVarZzbt == null) {
                throw new IllegalStateException();
            }
            zzc.put(cls, zzgzvVarZzbt);
        }
        return zzgzvVarZzbt;
    }

    protected static <T extends zzgzv<T, ?>> T zzbk(T t, InputStream inputStream) throws zzhak {
        T t2 = (T) zzg(t, inputStream, zzgzf.zza);
        zzf(t2);
        return t2;
    }

    protected static <T extends zzgzv<T, ?>> T zzbl(T t, InputStream inputStream, zzgzf zzgzfVar) throws zzhak {
        T t2 = (T) zzg(t, inputStream, zzgzfVar);
        zzf(t2);
        return t2;
    }

    protected static <T extends zzgzv<T, ?>> T zzbm(T t, zzgyj zzgyjVar) throws zzhak {
        T t2 = (T) zzbr(t, zzgyjVar, zzgzf.zza);
        zzf(t2);
        return t2;
    }

    protected static <T extends zzgzv<T, ?>> T zzbn(T t, zzgyt zzgytVar) throws zzhak {
        return (T) zzbs(t, zzgytVar, zzgzf.zza);
    }

    protected static <T extends zzgzv<T, ?>> T zzbo(T t, InputStream inputStream) throws zzhak {
        T t2 = (T) zzbz(t, zzgyt.zzI(inputStream, 4096), zzgzf.zza);
        zzf(t2);
        return t2;
    }

    protected static <T extends zzgzv<T, ?>> T zzbp(T t, ByteBuffer byteBuffer) throws zzhak {
        return (T) zzbv(t, byteBuffer, zzgzf.zza);
    }

    protected static <T extends zzgzv<T, ?>> T zzbq(T t, byte[] bArr) throws zzhak {
        T t2 = (T) zzi(t, bArr, 0, bArr.length, zzgzf.zza);
        zzf(t2);
        return t2;
    }

    protected static <T extends zzgzv<T, ?>> T zzbr(T t, zzgyj zzgyjVar, zzgzf zzgzfVar) throws zzhak {
        T t2 = (T) zzh(t, zzgyjVar, zzgzfVar);
        zzf(t2);
        return t2;
    }

    protected static <T extends zzgzv<T, ?>> T zzbs(T t, zzgyt zzgytVar, zzgzf zzgzfVar) throws zzhak {
        T t2 = (T) zzbz(t, zzgytVar, zzgzfVar);
        zzf(t2);
        return t2;
    }

    protected static <T extends zzgzv<T, ?>> T zzbu(T t, InputStream inputStream, zzgzf zzgzfVar) throws zzhak {
        T t2 = (T) zzbz(t, zzgyt.zzI(inputStream, 4096), zzgzfVar);
        zzf(t2);
        return t2;
    }

    protected static <T extends zzgzv<T, ?>> T zzbv(T t, ByteBuffer byteBuffer, zzgzf zzgzfVar) throws zzhak {
        zzgyt zzgytVarZzJ;
        int i = zzgyt.zzd;
        boolean z = false;
        if (byteBuffer.hasArray()) {
            zzgytVarZzJ = zzgyt.zzJ(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining(), false);
        } else if (byteBuffer.isDirect() && zzhdh.zzB()) {
            zzgytVarZzJ = new zzgyr(byteBuffer, z, null);
        } else {
            int iRemaining = byteBuffer.remaining();
            byte[] bArr = new byte[iRemaining];
            byteBuffer.duplicate().get(bArr);
            zzgytVarZzJ = zzgyt.zzJ(bArr, 0, iRemaining, true);
        }
        T t2 = (T) zzbs(t, zzgytVarZzJ, zzgzfVar);
        zzf(t2);
        return t2;
    }

    protected static <T extends zzgzv<T, ?>> T zzbx(T t, byte[] bArr, zzgzf zzgzfVar) throws zzhak {
        T t2 = (T) zzi(t, bArr, 0, bArr.length, zzgzfVar);
        zzf(t2);
        return t2;
    }

    protected static <T extends zzgzv<T, ?>> T zzby(T t, zzgyt zzgytVar) throws zzhak {
        return (T) zzbz(t, zzgytVar, zzgzf.zza);
    }

    static <T extends zzgzv<T, ?>> T zzbz(T t, zzgyt zzgytVar, zzgzf zzgzfVar) throws zzhak {
        T t2 = (T) t.zzbj();
        try {
            zzhcg zzhcgVarZzb = zzhbv.zza().zzb(t2.getClass());
            zzhcgVarZzb.zzh(t2, zzgyu.zzq(zzgytVar), zzgzfVar);
            zzhcgVarZzb.zzf(t2);
            return t2;
        } catch (zzhak e) {
            e = e;
            if (e.zzl()) {
                e = new zzhak(e);
            }
            e.zzh(t2);
            throw e;
        } catch (zzhcw e2) {
            zzhak zzhakVarZza = e2.zza();
            zzhakVarZza.zzh(t2);
            throw zzhakVarZza;
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzhak) {
                throw ((zzhak) e3.getCause());
            }
            zzhak zzhakVar = new zzhak(e3);
            zzhakVar.zzh(t2);
            throw zzhakVar;
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof zzhak) {
                throw ((zzhak) e4.getCause());
            }
            throw e4;
        }
    }

    private int zzc(zzhcg<?> zzhcgVar) {
        if (zzhcgVar != null) {
            return zzhcgVar.zza(this);
        }
        return zzhbv.zza().zzb(getClass()).zza(this);
    }

    protected static <T extends zzgzv> void zzca(Class<T> cls, T t) {
        t.zzbW();
        zzc.put(cls, t);
    }

    protected static final <T extends zzgzv<T, ?>> boolean zzcd(T t, boolean z) {
        byte bByteValue = ((Byte) t.zzbO(zzgzu.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zZzk = zzhbv.zza().zzb(t.getClass()).zzk(t);
        if (z) {
            t.zzbP(zzgzu.SET_MEMOIZED_IS_INITIALIZED, true != zZzk ? null : t);
        }
        return zZzk;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <MessageType extends zzgzr<MessageType, BuilderType>, BuilderType, T> zzgzt<MessageType, T> zze(zzgzd<MessageType, T> zzgzdVar) {
        return (zzgzt) zzgzdVar;
    }

    private static <T extends zzgzv<T, ?>> T zzf(T t) throws zzhak {
        if (t == null || t.zzbw()) {
            return t;
        }
        zzhak zzhakVarZza = t.zzaP().zza();
        zzhakVarZza.zzh(t);
        throw zzhakVarZza;
    }

    private static <T extends zzgzv<T, ?>> T zzg(T t, InputStream inputStream, zzgzf zzgzfVar) throws IOException {
        try {
            int i = inputStream.read();
            if (i == -1) {
                return null;
            }
            zzgyt zzgytVarZzI = zzgyt.zzI(new zzgxo(inputStream, zzgyt.zzG(i, inputStream)), 4096);
            T t2 = (T) zzbz(t, zzgytVarZzI, zzgzfVar);
            try {
                zzgytVarZzI.zzz(0);
                return t2;
            } catch (zzhak e) {
                e.zzh(t2);
                throw e;
            }
        } catch (zzhak e2) {
            if (e2.zzl()) {
                throw new zzhak(e2);
            }
            throw e2;
        } catch (IOException e3) {
            throw new zzhak(e3);
        }
    }

    private static <T extends zzgzv<T, ?>> T zzh(T t, zzgyj zzgyjVar, zzgzf zzgzfVar) throws zzhak {
        zzgyt zzgytVarZzl = zzgyjVar.zzl();
        T t2 = (T) zzbz(t, zzgytVarZzl, zzgzfVar);
        try {
            zzgytVarZzl.zzz(0);
            return t2;
        } catch (zzhak e) {
            e.zzh(t2);
            throw e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T extends zzgzv<T, ?>> T zzi(T t, byte[] bArr, int i, int i2, zzgzf zzgzfVar) throws zzhak {
        T t2 = (T) t.zzbj();
        try {
            zzhcg zzhcgVarZzb = zzhbv.zza().zzb(t2.getClass());
            zzhcgVarZzb.zzi(t2, bArr, i, i + i2, new zzgxv(zzgzfVar));
            zzhcgVarZzb.zzf(t2);
            return t2;
        } catch (zzhak e) {
            e = e;
            if (e.zzl()) {
                e = new zzhak(e);
            }
            e.zzh(t2);
            throw e;
        } catch (zzhcw e2) {
            zzhak zzhakVarZza = e2.zza();
            zzhakVarZza.zzh(t2);
            throw zzhakVarZza;
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzhak) {
                throw ((zzhak) e3.getCause());
            }
            zzhak zzhakVar = new zzhak(e3);
            zzhakVar.zzh(t2);
            throw zzhakVar;
        } catch (IndexOutOfBoundsException unused) {
            zzhak zzhakVarZzj = zzhak.zzj();
            zzhakVarZzj.zzh(t2);
            throw zzhakVarZzj;
        }
    }

    private void zzj() {
        if (this.zzt == zzhcy.zzc()) {
            this.zzt = zzhcy.zzf();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzhbv.zza().zzb(getClass()).zzj(this, (zzgzv) obj);
    }

    public int hashCode() {
        if (zzce()) {
            return zzaW();
        }
        if (zzcc()) {
            zzcb(zzaW());
        }
        return zzaX();
    }

    public String toString() {
        return zzhbn.zza(this, super.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzgxq
    int zzaL() {
        return this.zzd & Integer.MAX_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzgxq
    int zzaM(zzhcg zzhcgVar) {
        if (!zzce()) {
            if (zzaL() != Integer.MAX_VALUE) {
                return zzaL();
            }
            int iZzc = zzc(zzhcgVar);
            zzaS(iZzc);
            return iZzc;
        }
        int iZzc2 = zzc(zzhcgVar);
        if (iZzc2 >= 0) {
            return iZzc2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + iZzc2);
    }

    @Override // com.google.android.gms.internal.ads.zzgxq
    public zzhbq zzaO() {
        throw new UnsupportedOperationException("Lite does not support the mutable API.");
    }

    @Override // com.google.android.gms.internal.ads.zzgxq
    void zzaS(int i) {
        if (i >= 0) {
            this.zzd = i | (this.zzd & Integer.MIN_VALUE);
            return;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + i);
    }

    int zzaW() {
        return zzhbv.zza().zzb(getClass()).zzb(this);
    }

    int zzaX() {
        return this.zzq;
    }

    @Override // com.google.android.gms.internal.ads.zzhbl
    public int zzaY() {
        return zzaM(null);
    }

    protected final <MessageType extends zzgzv<MessageType, BuilderType>, BuilderType extends zzgzp<MessageType, BuilderType>> BuilderType zzaZ() {
        return (BuilderType) zzbO(zzgzu.NEW_BUILDER);
    }

    public final zzhbt<MessageType> zzbM() {
        return (zzhbt) zzbO(zzgzu.GET_PARSER);
    }

    Object zzbN() throws Exception {
        return zzbO(zzgzu.BUILD_MESSAGE_INFO);
    }

    protected Object zzbO(zzgzu zzgzuVar) {
        return zzde(zzgzuVar, null, null);
    }

    protected Object zzbP(zzgzu zzgzuVar, Object obj) {
        return zzde(zzgzuVar, obj, null);
    }

    void zzbT() {
        this.zzq = 0;
    }

    void zzbU() {
        zzaS(Integer.MAX_VALUE);
    }

    protected void zzbV() {
        zzhbv.zza().zzb(getClass()).zzf(this);
        zzbW();
    }

    void zzbW() {
        this.zzd &= Integer.MAX_VALUE;
    }

    protected void zzbX(int i, zzgyj zzgyjVar) {
        zzj();
        zzhcy zzhcyVar = this.zzt;
        zzhcyVar.zzg();
        if (i == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        zzhcyVar.zzj((i << 3) | 2, zzgyjVar);
    }

    protected final void zzbY(zzhcy zzhcyVar) {
        this.zzt = zzhcy.zze(this.zzt, zzhcyVar);
    }

    protected void zzbZ(int i, int i2) {
        zzj();
        zzhcy zzhcyVar = this.zzt;
        zzhcyVar.zzg();
        if (i == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        zzhcyVar.zzj(i << 3, Long.valueOf(i2));
    }

    protected final <MessageType extends zzgzv<MessageType, BuilderType>, BuilderType extends zzgzp<MessageType, BuilderType>> BuilderType zzba(MessageType messagetype) {
        BuilderType buildertype = (BuilderType) zzaZ();
        buildertype.zzbj(messagetype);
        return buildertype;
    }

    @Override // com.google.android.gms.internal.ads.zzhbl
    /* renamed from: zzbb, reason: merged with bridge method [inline-methods] */
    public final BuilderType zzcY() {
        return (BuilderType) zzbO(zzgzu.NEW_BUILDER);
    }

    @Override // com.google.android.gms.internal.ads.zzhbl
    /* renamed from: zzbc, reason: merged with bridge method [inline-methods] */
    public final BuilderType zzcZ() {
        BuilderType buildertype = (BuilderType) zzbO(zzgzu.NEW_BUILDER);
        buildertype.zzbj(this);
        return buildertype;
    }

    @Override // com.google.android.gms.internal.ads.zzhbm
    /* renamed from: zzbi, reason: merged with bridge method [inline-methods] */
    public final MessageType zzbt() {
        return (MessageType) zzbO(zzgzu.GET_DEFAULT_INSTANCE);
    }

    MessageType zzbj() {
        return (MessageType) zzbO(zzgzu.NEW_MUTABLE_INSTANCE);
    }

    @Override // com.google.android.gms.internal.ads.zzhbm
    public final boolean zzbw() {
        Boolean bool = Boolean.TRUE;
        return zzcd(this, true);
    }

    void zzcb(int i) {
        this.zzq = i;
    }

    boolean zzcc() {
        return zzaX() == 0;
    }

    boolean zzce() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    protected boolean zzcf(int i, zzgyt zzgytVar) throws IOException {
        if ((i & 7) == 4) {
            return false;
        }
        zzj();
        return this.zzt.zzk(i, zzgytVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhbl
    public void zzda(zzgza zzgzaVar) throws IOException {
        zzhbv.zza().zzb(getClass()).zzm(this, zzgzb.zza(zzgzaVar));
    }

    protected abstract Object zzde(zzgzu zzgzuVar, Object obj, Object obj2);
}
