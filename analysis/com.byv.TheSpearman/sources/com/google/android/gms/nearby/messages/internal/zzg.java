package com.google.android.gms.nearby.messages.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.ArrayUtils;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* loaded from: classes3.dex */
public final class zzg extends zzc {
    public zzg(String str, String str2) {
        byte[] bArrZzb = zzb(str);
        byte[] bArrZzb2 = zzb(str2);
        byte[][] bArr = new byte[2][];
        int length = bArrZzb.length;
        boolean z = length == 10;
        StringBuilder sb = new StringBuilder(53);
        sb.append("Namespace length(");
        sb.append(length);
        sb.append(" bytes) must be 10 bytes.");
        Preconditions.checkArgument(z, sb.toString());
        bArr[0] = bArrZzb;
        int length2 = bArrZzb2.length;
        boolean z2 = length2 == 6;
        StringBuilder sb2 = new StringBuilder(51);
        sb2.append("Instance length(");
        sb2.append(length2);
        sb2.append(" bytes) must be 6 bytes.");
        Preconditions.checkArgument(z2, sb2.toString());
        bArr[1] = bArrZzb2;
        byte[] bArrConcatByteArrays = ArrayUtils.concatByteArrays(bArr);
        zze(bArrConcatByteArrays);
        super(bArrConcatByteArrays);
    }

    private static byte[] zze(byte[] bArr) {
        int length = bArr.length;
        boolean z = true;
        if (length != 10 && length != 16) {
            z = false;
        }
        Preconditions.checkArgument(z, "Bytes must be a namespace (10 bytes), or a namespace plus instance (16 bytes).");
        return bArr;
    }

    @Override // com.google.android.gms.nearby.messages.internal.zzc
    public final String toString() {
        String strZzd = zzd();
        StringBuilder sb = new StringBuilder(String.valueOf(strZzd).length() + 26);
        sb.append("EddystoneUidPrefix{bytes=");
        sb.append(strZzd);
        sb.append(AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzg(byte[] bArr) {
        super(bArr);
        zze(bArr);
    }
}
