package com.google.android.gms.nearby.messages.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.nio.ByteBuffer;
import java.util.UUID;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* loaded from: classes3.dex */
public final class zzl extends zzc {
    /* JADX WARN: Illegal instructions before constructor call */
    public zzl(UUID uuid, Short sh, Short sh2) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate((sh == null ? 0 : 2) + 16 + (sh2 != null ? 2 : 0));
        byteBufferAllocate.putLong(uuid.getMostSignificantBits()).putLong(uuid.getLeastSignificantBits());
        if (sh != null) {
            byteBufferAllocate.putShort(sh.shortValue());
        }
        if (sh2 != null) {
            byteBufferAllocate.putShort(sh2.shortValue());
        }
        byte[] bArrArray = byteBufferAllocate.array();
        zzh(bArrArray);
        super(bArrArray);
    }

    private static byte[] zzh(byte[] bArr) {
        int length = bArr.length;
        boolean z = true;
        if (length != 16 && length != 18 && length != 20) {
            z = false;
        }
        Preconditions.checkArgument(z, "Prefix must be a UUID, a UUID and a major, or a UUID, a major, and a minor.");
        return bArr;
    }

    @Override // com.google.android.gms.nearby.messages.internal.zzc
    public final String toString() {
        String strValueOf = String.valueOf(zze());
        String strValueOf2 = String.valueOf(zzf());
        String strValueOf3 = String.valueOf(zzg());
        int length = String.valueOf(strValueOf).length();
        StringBuilder sb = new StringBuilder(length + 47 + String.valueOf(strValueOf2).length() + String.valueOf(strValueOf3).length());
        sb.append("IBeaconIdPrefix{proximityUuid=");
        sb.append(strValueOf);
        sb.append(", major=");
        sb.append(strValueOf2);
        sb.append(", minor=");
        sb.append(strValueOf3);
        sb.append(AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }

    public final UUID zze() {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(zzc());
        return new UUID(byteBufferWrap.getLong(), byteBufferWrap.getLong());
    }

    public final Short zzf() {
        byte[] bArrZzc = zzc();
        if (bArrZzc.length >= 18) {
            return Short.valueOf(ByteBuffer.wrap(bArrZzc).getShort(16));
        }
        return null;
    }

    public final Short zzg() {
        byte[] bArrZzc = zzc();
        if (bArrZzc.length == 20) {
            return Short.valueOf(ByteBuffer.wrap(bArrZzc).getShort(18));
        }
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzl(byte[] bArr) {
        super(bArr);
        zzh(bArr);
    }
}
