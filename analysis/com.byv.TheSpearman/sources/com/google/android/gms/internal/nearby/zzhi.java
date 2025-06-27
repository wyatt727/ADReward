package com.google.android.gms.internal.nearby;

import android.os.ParcelUuid;
import android.util.SparseArray;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.google.android.gms.common.util.Hex;
import com.json.t2;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.objectweb.asm.Opcodes;

/* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* loaded from: classes3.dex */
public final class zzhi {
    private static final ParcelUuid zza = ParcelUuid.fromString("00000000-0000-1000-8000-00805F9B34FB");
    private final int zzb;
    private final List<ParcelUuid> zzc;
    private final SparseArray<byte[]> zzd;
    private final Map<ParcelUuid, byte[]> zze;
    private final int zzf;
    private final String zzg;
    private final byte[] zzh;

    private zzhi(List<ParcelUuid> list, SparseArray<byte[]> sparseArray, Map<ParcelUuid, byte[]> map, int i, int i2, String str, byte[] bArr) {
        this.zzc = list;
        this.zzd = sparseArray;
        this.zze = map;
        this.zzg = str;
        this.zzb = i;
        this.zzf = i2;
        this.zzh = bArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.nearby.zzhi zza(byte[] r13) {
        /*
            r0 = 0
            if (r13 != 0) goto L4
            return r0
        L4:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            android.util.SparseArray r4 = new android.util.SparseArray
            r4.<init>()
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            r2 = 0
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = -1
            r8 = r0
            r7 = r3
        L19:
            int r3 = r13.length     // Catch: java.lang.Exception -> L97
            if (r2 >= r3) goto L85
            int r3 = r2 + 1
            r2 = r13[r2]     // Catch: java.lang.Exception -> L97
            r9 = 255(0xff, float:3.57E-43)
            r2 = r2 & r9
            if (r2 != 0) goto L26
            goto L85
        L26:
            int r2 = r2 + (-1)
            int r10 = r3 + 1
            r3 = r13[r3]     // Catch: java.lang.Exception -> L97
            r3 = r3 & r9
            r11 = 22
            r12 = 2
            if (r3 == r11) goto L70
            if (r3 == r9) goto L59
            switch(r3) {
                case 1: goto L54;
                case 2: goto L50;
                case 3: goto L50;
                case 4: goto L4b;
                case 5: goto L4b;
                case 6: goto L45;
                case 7: goto L45;
                case 8: goto L3b;
                case 9: goto L3b;
                case 10: goto L38;
                default: goto L37;
            }     // Catch: java.lang.Exception -> L97
        L37:
            goto L83
        L38:
            r7 = r13[r10]     // Catch: java.lang.Exception -> L97
            goto L83
        L3b:
            java.lang.String r8 = new java.lang.String     // Catch: java.lang.Exception -> L97
            byte[] r3 = zzc(r13, r10, r2)     // Catch: java.lang.Exception -> L97
            r8.<init>(r3)     // Catch: java.lang.Exception -> L97
            goto L83
        L45:
            r3 = 16
            zzb(r13, r10, r2, r3, r1)     // Catch: java.lang.Exception -> L97
            goto L83
        L4b:
            r3 = 4
            zzb(r13, r10, r2, r3, r1)     // Catch: java.lang.Exception -> L97
            goto L83
        L50:
            zzb(r13, r10, r2, r12, r1)     // Catch: java.lang.Exception -> L97
            goto L83
        L54:
            r3 = r13[r10]     // Catch: java.lang.Exception -> L97
            r6 = r3 & 255(0xff, float:3.57E-43)
            goto L83
        L59:
            int r3 = r10 + 1
            r3 = r13[r3]     // Catch: java.lang.Exception -> L97
            r3 = r3 & r9
            int r3 = r3 << 8
            r11 = r13[r10]     // Catch: java.lang.Exception -> L97
            r9 = r9 & r11
            int r3 = r3 + r9
            int r9 = r10 + 2
            int r11 = r2 + (-2)
            byte[] r9 = zzc(r13, r9, r11)     // Catch: java.lang.Exception -> L97
            r4.put(r3, r9)     // Catch: java.lang.Exception -> L97
            goto L83
        L70:
            byte[] r3 = zzc(r13, r10, r12)     // Catch: java.lang.Exception -> L97
            android.os.ParcelUuid r3 = zzd(r3)     // Catch: java.lang.Exception -> L97
            int r9 = r10 + 2
            int r11 = r2 + (-2)
            byte[] r9 = zzc(r13, r9, r11)     // Catch: java.lang.Exception -> L97
            r5.put(r3, r9)     // Catch: java.lang.Exception -> L97
        L83:
            int r2 = r2 + r10
            goto L19
        L85:
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Exception -> L97
            r3 = 1
            if (r3 == r2) goto L8e
            r3 = r1
            goto L8f
        L8e:
            r3 = r0
        L8f:
            com.google.android.gms.internal.nearby.zzhi r1 = new com.google.android.gms.internal.nearby.zzhi     // Catch: java.lang.Exception -> L97
            r2 = r1
            r9 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Exception -> L97
            return r1
        L97:
            r1 = move-exception
            java.lang.String r13 = java.util.Arrays.toString(r13)
            java.lang.String r13 = java.lang.String.valueOf(r13)
            java.lang.String r2 = "Unable to parse scan record: "
            int r3 = r13.length()
            if (r3 == 0) goto Lad
            java.lang.String r13 = r2.concat(r13)
            goto Lb2
        Lad:
            java.lang.String r13 = new java.lang.String
            r13.<init>(r2)
        Lb2:
            java.lang.String r2 = "BleRecord"
            android.util.Log.w(r2, r13, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.nearby.zzhi.zza(byte[]):com.google.android.gms.internal.nearby.zzhi");
    }

    private static int zzb(byte[] bArr, int i, int i2, int i3, List<ParcelUuid> list) {
        while (i2 > 0) {
            list.add(zzd(zzc(bArr, i, i3)));
            i2 -= i3;
            i += i3;
        }
        return i;
    }

    private static byte[] zzc(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzhi) {
            return Arrays.equals(this.zzh, ((zzhi) obj).zzh);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zzh);
    }

    public final String toString() {
        String string;
        int i = this.zzb;
        String strValueOf = String.valueOf(this.zzc);
        SparseArray<byte[]> sparseArray = this.zzd;
        StringBuilder sb = new StringBuilder();
        int size = sparseArray.size();
        String string2 = JsonUtils.EMPTY_JSON;
        int i2 = 0;
        if (size <= 0) {
            string = JsonUtils.EMPTY_JSON;
        } else {
            sb.append(AbstractJsonLexerKt.BEGIN_OBJ);
            for (int i3 = 0; i3 < sparseArray.size(); i3++) {
                if (i3 > 0) {
                    sb.append(", ");
                }
                int iKeyAt = sparseArray.keyAt(i3);
                byte[] bArrValueAt = sparseArray.valueAt(i3);
                sb.append(iKeyAt);
                sb.append('=');
                sb.append(bArrValueAt == null ? null : Hex.bytesToStringUppercase(bArrValueAt));
            }
            sb.append(AbstractJsonLexerKt.END_OBJ);
            string = sb.toString();
        }
        Map<ParcelUuid, byte[]> map = this.zze;
        StringBuilder sb2 = new StringBuilder();
        if (map.keySet().size() > 0) {
            sb2.append(AbstractJsonLexerKt.BEGIN_OBJ);
            for (Map.Entry<ParcelUuid, byte[]> entry : map.entrySet()) {
                if (i2 > 0) {
                    sb2.append(", ");
                }
                sb2.append(entry.getKey());
                sb2.append('=');
                byte[] value = entry.getValue();
                sb2.append(value == null ? null : Hex.bytesToStringUppercase(value));
                i2++;
            }
            sb2.append(AbstractJsonLexerKt.END_OBJ);
            string2 = sb2.toString();
        }
        int i4 = this.zzf;
        String str = this.zzg;
        int length = String.valueOf(strValueOf).length();
        StringBuilder sb3 = new StringBuilder(length + Opcodes.F2I + String.valueOf(string).length() + String.valueOf(string2).length() + String.valueOf(str).length());
        sb3.append("BleRecord [mAdvertiseFlags=");
        sb3.append(i);
        sb3.append(", mServiceUuids=");
        sb3.append(strValueOf);
        sb3.append(", mManufacturerSpecificData=");
        sb3.append(string);
        sb3.append(", mServiceData=");
        sb3.append(string2);
        sb3.append(", mTxPowerLevel=");
        sb3.append(i4);
        sb3.append(", mDeviceName=");
        sb3.append(str);
        sb3.append(t2.i.e);
        return sb3.toString();
    }

    private static ParcelUuid zzd(byte[] bArr) {
        long j;
        int length = bArr.length;
        if (length != 2 && length != 4 && length != 16) {
            StringBuilder sb = new StringBuilder(38);
            sb.append("uuidBytes length invalid - ");
            sb.append(length);
            throw new IllegalArgumentException(sb.toString());
        }
        if (length == 16) {
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            return new ParcelUuid(new UUID(byteBufferOrder.getLong(8), byteBufferOrder.getLong(0)));
        }
        if (length == 2) {
            j = (bArr[0] & 255) + ((bArr[1] & 255) << 8);
        } else {
            j = ((bArr[3] & 255) << 24) + (bArr[0] & 255) + ((bArr[1] & 255) << 8) + ((bArr[2] & 255) << 16);
        }
        ParcelUuid parcelUuid = zza;
        return new ParcelUuid(new UUID(parcelUuid.getUuid().getMostSignificantBits() + (j << 32), parcelUuid.getUuid().getLeastSignificantBits()));
    }
}
