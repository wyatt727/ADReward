package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgxp;
import com.google.android.gms.internal.ads.zzgxq;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
public abstract class zzgxq<MessageType extends zzgxq<MessageType, BuilderType>, BuilderType extends zzgxp<MessageType, BuilderType>> implements zzhbl {
    protected int zzq = 0;

    protected static <T> void zzaQ(Iterable<T> iterable, List<? super T> list) {
        zzgxp.zzbd(iterable, list);
    }

    protected static void zzaR(zzgyj zzgyjVar) throws IllegalArgumentException {
        if (!zzgyjVar.zzp()) {
            throw new IllegalArgumentException("Byte string is not UTF-8.");
        }
    }

    private String zzdI(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    int zzaL() {
        throw new UnsupportedOperationException();
    }

    int zzaM(zzhcg zzhcgVar) {
        return zzaL();
    }

    @Override // com.google.android.gms.internal.ads.zzhbl
    public zzgyj zzaN() {
        try {
            int iZzaY = zzaY();
            zzgyj zzgyjVar = zzgyj.zzb;
            byte[] bArr = new byte[iZzaY];
            zzgza zzgzaVarZzF = zzgza.zzF(bArr, 0, iZzaY);
            zzda(zzgzaVarZzF);
            zzgzaVarZzF.zzG();
            return new zzgyf(bArr);
        } catch (IOException e) {
            throw new RuntimeException(zzdI("ByteString"), e);
        }
    }

    public zzhbq zzaO() {
        throw new UnsupportedOperationException("mutableCopy() is not implemented.");
    }

    zzhcw zzaP() {
        return new zzhcw(this);
    }

    void zzaS(int i) {
        throw new UnsupportedOperationException();
    }

    public void zzaT(OutputStream outputStream) throws IOException {
        int iZzaY = zzaY();
        zzgyy zzgyyVar = new zzgyy(outputStream, zzgza.zzB(zzgza.zzD(iZzaY) + iZzaY));
        zzgyyVar.zzu(iZzaY);
        zzda(zzgyyVar);
        zzgyyVar.zzL();
    }

    public void zzaU(OutputStream outputStream) throws IOException {
        zzgyy zzgyyVar = new zzgyy(outputStream, zzgza.zzB(zzaY()));
        zzda(zzgyyVar);
        zzgyyVar.zzL();
    }

    public byte[] zzaV() {
        try {
            int iZzaY = zzaY();
            byte[] bArr = new byte[iZzaY];
            zzgza zzgzaVarZzF = zzgza.zzF(bArr, 0, iZzaY);
            zzda(zzgzaVarZzF);
            zzgzaVarZzF.zzG();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException(zzdI("byte array"), e);
        }
    }
}
