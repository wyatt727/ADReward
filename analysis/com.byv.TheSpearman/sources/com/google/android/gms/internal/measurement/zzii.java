package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.0 */
/* loaded from: classes3.dex */
public abstract class zzii implements Serializable, Iterable<Byte> {
    public static final zzii zza = new zziv(zzjy.zzb);
    private static final zzip zzb = new zziu();
    private static final Comparator<zzii> zzc = new zzik();
    private int zzd = 0;

    static /* synthetic */ int zza(byte b) {
        return b & 255;
    }

    public abstract boolean equals(Object obj);

    public abstract byte zza(int i);

    public abstract zzii zza(int i, int i2);

    protected abstract String zza(Charset charset);

    abstract void zza(zzij zzijVar) throws IOException;

    abstract byte zzb(int i);

    public abstract int zzb();

    protected abstract int zzb(int i, int i2, int i3);

    public abstract boolean zzd();

    static int zza(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i + " < 0");
        }
        if (i2 < i) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i + ", " + i2);
        }
        throw new IndexOutOfBoundsException("End index: " + i2 + " >= " + i3);
    }

    public final int hashCode() {
        int iZzb = this.zzd;
        if (iZzb == 0) {
            int iZzb2 = zzb();
            iZzb = zzb(iZzb2, 0, iZzb2);
            if (iZzb == 0) {
                iZzb = 1;
            }
            this.zzd = iZzb;
        }
        return iZzb;
    }

    protected final int zza() {
        return this.zzd;
    }

    static zzir zzc(int i) {
        return new zzir(i);
    }

    public static zzii zza(byte[] bArr, int i, int i2) {
        zza(i, i + i2, bArr.length);
        return new zziv(zzb.zza(bArr, i, i2));
    }

    public static zzii zza(String str) {
        return new zziv(str.getBytes(zzjy.zza));
    }

    static zzii zza(byte[] bArr) {
        return new zziv(bArr);
    }

    public final String toString() {
        String strZza;
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(zzb());
        if (zzb() <= 50) {
            strZza = zzmr.zza(this);
        } else {
            strZza = zzmr.zza(zza(0, 47)) + "...";
        }
        objArr[2] = strZza;
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    public final String zzc() {
        return zzb() == 0 ? "" : zza(zzjy.zza);
    }

    @Override // java.lang.Iterable
    public /* synthetic */ Iterator<Byte> iterator() {
        return new zzil(this);
    }

    zzii() {
    }
}
