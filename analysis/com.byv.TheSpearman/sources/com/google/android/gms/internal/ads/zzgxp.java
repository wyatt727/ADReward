package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgxp;
import com.google.android.gms.internal.ads.zzgxq;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
public abstract class zzgxp<MessageType extends zzgxq<MessageType, BuilderType>, BuilderType extends zzgxp<MessageType, BuilderType>> implements zzhbk {
    private String zza(String str) {
        return "Reading " + getClass().getName() + " from a " + str + " threw an IOException (should never happen).";
    }

    private static <T> void zzb(Iterable<T> iterable, List<? super T> list) {
        if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
        }
        int size = list.size();
        for (T t : iterable) {
            if (t == null) {
                String str = "Element at index " + (list.size() - size) + " is null.";
                int size2 = list.size();
                while (true) {
                    size2--;
                    if (size2 < size) {
                        throw new NullPointerException(str);
                    }
                    list.remove(size2);
                }
            } else {
                list.add(t);
            }
        }
    }

    protected static zzhcw zzbb(zzhbl zzhblVar) {
        return new zzhcw(zzhblVar);
    }

    @Deprecated
    protected static <T> void zzbc(Iterable<T> iterable, Collection<? super T> collection) {
        zzbd(iterable, (List) collection);
    }

    protected static <T> void zzbd(Iterable<T> iterable, List<? super T> list) {
        byte[] bArr = zzhai.zzd;
        Objects.requireNonNull(iterable);
        if (!(iterable instanceof zzhat)) {
            if (iterable instanceof zzhbu) {
                list.addAll((Collection) iterable);
                return;
            } else {
                zzb(iterable, list);
                return;
            }
        }
        List listZzh = ((zzhat) iterable).zzh();
        zzhat zzhatVar = (zzhat) list;
        int size = list.size();
        for (Object obj : listZzh) {
            if (obj == null) {
                String str = "Element at index " + (zzhatVar.size() - size) + " is null.";
                int size2 = zzhatVar.size();
                while (true) {
                    size2--;
                    if (size2 < size) {
                        throw new NullPointerException(str);
                    }
                    zzhatVar.remove(size2);
                }
            } else if (obj instanceof zzgyj) {
                zzhatVar.zzi((zzgyj) obj);
            } else {
                zzhatVar.add((String) obj);
            }
        }
    }

    @Override // 
    public abstract BuilderType zzaP();

    protected abstract BuilderType zzaD(MessageType messagetype);

    public BuilderType zzaE(zzgyj zzgyjVar) throws zzhak {
        try {
            zzgyt zzgytVarZzl = zzgyjVar.zzl();
            zzaR(zzgytVarZzl);
            zzgytVarZzl.zzz(0);
            return this;
        } catch (zzhak e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(zza("ByteString"), e2);
        }
    }

    /* renamed from: zzaF, reason: merged with bridge method [inline-methods] */
    public BuilderType zzaR(zzgyt zzgytVar) throws IOException {
        return (BuilderType) zzaW(zzgytVar, zzgzf.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzhbk
    /* renamed from: zzaG, reason: merged with bridge method [inline-methods] */
    public BuilderType zzaS(zzhbl zzhblVar) {
        if (zzbt().getClass().isInstance(zzhblVar)) {
            return (BuilderType) zzaD((zzgxq) zzhblVar);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    public BuilderType zzaH(InputStream inputStream) throws IOException {
        zzgyt zzgytVarZzI = zzgyt.zzI(inputStream, 4096);
        zzaR(zzgytVarZzI);
        zzgytVarZzI.zzz(0);
        return this;
    }

    /* renamed from: zzaI, reason: merged with bridge method [inline-methods] */
    public BuilderType zzaU(byte[] bArr) throws zzhak {
        return (BuilderType) zzaZ(bArr, 0, bArr.length);
    }

    public BuilderType zzaJ(zzgyj zzgyjVar, zzgzf zzgzfVar) throws zzhak {
        try {
            zzgyt zzgytVarZzl = zzgyjVar.zzl();
            zzaW(zzgytVarZzl, zzgzfVar);
            zzgytVarZzl.zzz(0);
            return this;
        } catch (zzhak e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(zza("ByteString"), e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbk
    /* renamed from: zzaK, reason: merged with bridge method [inline-methods] */
    public abstract BuilderType zzaW(zzgyt zzgytVar, zzgzf zzgzfVar) throws IOException;

    public BuilderType zzaL(InputStream inputStream, zzgzf zzgzfVar) throws IOException {
        zzgyt zzgytVarZzI = zzgyt.zzI(inputStream, 4096);
        zzaW(zzgytVarZzI, zzgzfVar);
        zzgytVarZzI.zzz(0);
        return this;
    }

    /* renamed from: zzaM, reason: merged with bridge method [inline-methods] */
    public BuilderType zzaY(byte[] bArr, zzgzf zzgzfVar) throws zzhak {
        return (BuilderType) zzba(bArr, 0, bArr.length, zzgzfVar);
    }

    @Override // 
    /* renamed from: zzaN, reason: merged with bridge method [inline-methods] */
    public BuilderType zzaZ(byte[] bArr, int i, int i2) throws zzhak {
        try {
            zzgyt zzgytVarZzJ = zzgyt.zzJ(bArr, i, i2, false);
            zzaR(zzgytVarZzJ);
            zzgytVarZzJ.zzz(0);
            return this;
        } catch (zzhak e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(zza("byte array"), e2);
        }
    }

    @Override // 
    /* renamed from: zzaO, reason: merged with bridge method [inline-methods] */
    public BuilderType zzba(byte[] bArr, int i, int i2, zzgzf zzgzfVar) throws zzhak {
        try {
            zzgyt zzgytVarZzJ = zzgyt.zzJ(bArr, i, i2, false);
            zzaW(zzgytVarZzJ, zzgzfVar);
            zzgytVarZzJ.zzz(0);
            return this;
        } catch (zzhak e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(zza("byte array"), e2);
        }
    }

    public /* bridge */ /* synthetic */ zzhbk zzaQ(zzgyj zzgyjVar) throws zzhak {
        zzaE(zzgyjVar);
        return this;
    }

    public /* bridge */ /* synthetic */ zzhbk zzaT(InputStream inputStream) throws IOException {
        zzaH(inputStream);
        return this;
    }

    public /* bridge */ /* synthetic */ zzhbk zzaV(zzgyj zzgyjVar, zzgzf zzgzfVar) throws zzhak {
        zzaJ(zzgyjVar, zzgzfVar);
        return this;
    }

    public /* bridge */ /* synthetic */ zzhbk zzaX(InputStream inputStream, zzgzf zzgzfVar) throws IOException {
        zzaL(inputStream, zzgzfVar);
        return this;
    }

    public boolean zzbe(InputStream inputStream) throws IOException {
        return zzbf(inputStream, zzgzf.zza);
    }

    public boolean zzbf(InputStream inputStream, zzgzf zzgzfVar) throws IOException {
        int i = inputStream.read();
        if (i == -1) {
            return false;
        }
        zzaL(new zzgxo(inputStream, zzgyt.zzG(i, inputStream)), zzgzfVar);
        return true;
    }
}
