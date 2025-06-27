package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzhz;
import com.google.android.gms.internal.measurement.zzib;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.0 */
/* loaded from: classes3.dex */
public abstract class zzib<MessageType extends zzhz<MessageType, BuilderType>, BuilderType extends zzib<MessageType, BuilderType>> implements zzlh {
    @Override // 
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public abstract BuilderType zzb(zziw zziwVar, zzji zzjiVar) throws IOException;

    @Override // 
    /* renamed from: zzae, reason: merged with bridge method [inline-methods] */
    public abstract BuilderType clone();

    public BuilderType zza(byte[] bArr, int i, int i2) throws zzkd {
        try {
            zziw zziwVarZza = zziw.zza(bArr, 0, i2, false);
            zzb(zziwVarZza, zzji.zza);
            zziwVarZza.zzc(0);
            return this;
        } catch (zzkd e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(zza("byte array"), e2);
        }
    }

    public BuilderType zza(byte[] bArr, int i, int i2, zzji zzjiVar) throws zzkd {
        try {
            zziw zziwVarZza = zziw.zza(bArr, 0, i2, false);
            zzb(zziwVarZza, zzjiVar);
            zziwVarZza.zzc(0);
            return this;
        } catch (zzkd e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(zza("byte array"), e2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlh
    public final /* synthetic */ zzlh zza(byte[] bArr) throws zzkd {
        return zza(bArr, 0, bArr.length);
    }

    @Override // com.google.android.gms.internal.measurement.zzlh
    public final /* synthetic */ zzlh zza(byte[] bArr, zzji zzjiVar) throws zzkd {
        return zza(bArr, 0, bArr.length, zzjiVar);
    }

    private final String zza(String str) {
        return "Reading " + getClass().getName() + " from a " + str + " threw an IOException (should never happen).";
    }
}
