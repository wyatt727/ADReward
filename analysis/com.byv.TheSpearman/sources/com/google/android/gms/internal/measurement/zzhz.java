package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzhz;
import com.google.android.gms.internal.measurement.zzib;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.0 */
/* loaded from: classes3.dex */
public abstract class zzhz<MessageType extends zzhz<MessageType, BuilderType>, BuilderType extends zzib<MessageType, BuilderType>> implements zzli {
    protected int zza = 0;

    int zzbv() {
        throw new UnsupportedOperationException();
    }

    int zza(zzma zzmaVar) {
        int iZzbv = zzbv();
        if (iZzbv != -1) {
            return iZzbv;
        }
        int iZza = zzmaVar.zza(this);
        zzc(iZza);
        return iZza;
    }

    @Override // com.google.android.gms.internal.measurement.zzli
    public final zzii zzbw() {
        try {
            zzir zzirVarZzc = zzii.zzc(zzby());
            zza(zzirVarZzc.zzb());
            return zzirVarZzc.zza();
        } catch (IOException e) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a ByteString threw an IOException (should never happen).", e);
        }
    }

    protected static <T> void zza(Iterable<T> iterable, List<? super T> list) {
        zzjy.zza(iterable);
        if (iterable instanceof zzko) {
            List<?> listZze = ((zzko) iterable).zze();
            zzko zzkoVar = (zzko) list;
            int size = list.size();
            for (Object obj : listZze) {
                if (obj == null) {
                    String str = "Element at index " + (zzkoVar.size() - size) + " is null.";
                    for (int size2 = zzkoVar.size() - 1; size2 >= size; size2--) {
                        zzkoVar.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof zzii) {
                    zzkoVar.zza((zzii) obj);
                } else {
                    zzkoVar.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof zzlu) {
            list.addAll((Collection) iterable);
            return;
        }
        if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
        }
        int size3 = list.size();
        for (T t : iterable) {
            if (t == null) {
                String str2 = "Element at index " + (list.size() - size3) + " is null.";
                for (int size4 = list.size() - 1; size4 >= size3; size4--) {
                    list.remove(size4);
                }
                throw new NullPointerException(str2);
            }
            list.add(t);
        }
    }

    void zzc(int i) {
        throw new UnsupportedOperationException();
    }

    public final byte[] zzbx() {
        try {
            byte[] bArr = new byte[zzby()];
            zzjc zzjcVarZzb = zzjc.zzb(bArr);
            zza(zzjcVarZzb);
            zzjcVarZzb.zzb();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a byte array threw an IOException (should never happen).", e);
        }
    }
}
