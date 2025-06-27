package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzqs extends zzdu {
    private int[] zzd;
    private int[] zze;

    zzqs() {
    }

    @Override // com.google.android.gms.internal.ads.zzdt
    public final void zze(ByteBuffer byteBuffer) {
        int[] iArr = this.zze;
        Objects.requireNonNull(iArr);
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferZzj = zzj(((iLimit - iPosition) / this.zzb.zze) * this.zzc.zze);
        while (iPosition < iLimit) {
            for (int i : iArr) {
                byteBufferZzj.putShort(byteBuffer.getShort(i + i + iPosition));
            }
            iPosition += this.zzb.zze;
        }
        byteBuffer.position(iLimit);
        byteBufferZzj.flip();
    }

    @Override // com.google.android.gms.internal.ads.zzdu
    public final zzdr zzi(zzdr zzdrVar) throws zzds {
        int[] iArr = this.zzd;
        if (iArr == null) {
            return zzdr.zza;
        }
        if (zzdrVar.zzd != 2) {
            throw new zzds("Unhandled input format:", zzdrVar);
        }
        boolean z = zzdrVar.zzc != iArr.length;
        int i = 0;
        while (true) {
            int length = iArr.length;
            if (i >= length) {
                return z ? new zzdr(zzdrVar.zzb, length, 2) : zzdr.zza;
            }
            int i2 = iArr[i];
            if (i2 >= zzdrVar.zzc) {
                throw new zzds("Unhandled input format:", zzdrVar);
            }
            z |= i2 != i;
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdu
    protected final void zzk() {
        this.zze = this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzdu
    protected final void zzm() {
        this.zze = null;
        this.zzd = null;
    }

    public final void zzo(int[] iArr) {
        this.zzd = iArr;
    }
}
