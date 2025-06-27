package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
public abstract class zzgza extends zzgxy {
    private static final Logger zza = Logger.getLogger(zzgza.class.getName());
    private static final boolean zzb = zzhdh.zzA();
    public static final /* synthetic */ int zzf = 0;
    zzgzb zze;

    private zzgza() {
    }

    /* synthetic */ zzgza(zzgyz zzgyzVar) {
    }

    static int zzA(zzhbl zzhblVar, zzhcg zzhcgVar) {
        int iZzaM = ((zzgxq) zzhblVar).zzaM(zzhcgVar);
        return zzD(iZzaM) + iZzaM;
    }

    static int zzB(int i) {
        if (i > 4096) {
            return 4096;
        }
        return i;
    }

    public static int zzC(String str) {
        int length;
        try {
            length = zzhdm.zze(str);
        } catch (zzhdl unused) {
            length = str.getBytes(zzhai.zzb).length;
        }
        return zzD(length) + length;
    }

    public static int zzD(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int zzE(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public static zzgza zzF(byte[] bArr, int i, int i2) {
        return new zzgyw(bArr, 0, i2);
    }

    @Deprecated
    static int zzy(int i, zzhbl zzhblVar, zzhcg zzhcgVar) {
        int iZzD = zzD(i << 3);
        return iZzD + iZzD + ((zzgxq) zzhblVar).zzaM(zzhcgVar);
    }

    public static int zzz(zzhbl zzhblVar) {
        int iZzaY = zzhblVar.zzaY();
        return zzD(iZzaY) + iZzaY;
    }

    public final void zzG() {
        if (zzb() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    final void zzH(String str, zzhdl zzhdlVar) throws IOException {
        zza.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzhdlVar);
        byte[] bytes = str.getBytes(zzhai.zzb);
        try {
            int length = bytes.length;
            zzu(length);
            zza(bytes, 0, length);
        } catch (IndexOutOfBoundsException e) {
            throw new zzgyx(e);
        }
    }

    public abstract void zzL() throws IOException;

    public abstract void zzM(byte b) throws IOException;

    public abstract void zzN(int i, boolean z) throws IOException;

    public abstract void zzO(int i, zzgyj zzgyjVar) throws IOException;

    @Override // com.google.android.gms.internal.ads.zzgxy
    public abstract void zza(byte[] bArr, int i, int i2) throws IOException;

    public abstract int zzb();

    public abstract void zzh(int i, int i2) throws IOException;

    public abstract void zzi(int i) throws IOException;

    public abstract void zzj(int i, long j) throws IOException;

    public abstract void zzk(long j) throws IOException;

    public abstract void zzl(int i, int i2) throws IOException;

    public abstract void zzm(int i) throws IOException;

    abstract void zzn(int i, zzhbl zzhblVar, zzhcg zzhcgVar) throws IOException;

    public abstract void zzo(int i, zzhbl zzhblVar) throws IOException;

    public abstract void zzp(int i, zzgyj zzgyjVar) throws IOException;

    public abstract void zzq(int i, String str) throws IOException;

    public abstract void zzs(int i, int i2) throws IOException;

    public abstract void zzt(int i, int i2) throws IOException;

    public abstract void zzu(int i) throws IOException;

    public abstract void zzv(int i, long j) throws IOException;

    public abstract void zzw(long j) throws IOException;
}
