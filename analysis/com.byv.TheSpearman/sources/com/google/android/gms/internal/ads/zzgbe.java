package com.google.android.gms.internal.ads;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Arrays;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzgbe extends zzfzq {
    static final zzfzq zza = new zzgbe(null, new Object[0], 0);
    final transient Object[] zzb;

    @CheckForNull
    private final transient Object zzc;
    private final transient int zzd;

    private zzgbe(@CheckForNull Object obj, Object[] objArr, int i) {
        this.zzc = obj;
        this.zzb = objArr;
        this.zzd = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r5v2, types: [int[]] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object[]] */
    static zzgbe zzj(int i, Object[] objArr, zzfzp zzfzpVar) {
        short[] sArr;
        char c;
        char c2;
        Object[] objArr2;
        int i2 = i;
        Object[] objArrCopyOf = objArr;
        if (i2 == 0) {
            return (zzgbe) zza;
        }
        Object obj = null;
        int i3 = 1;
        if (i2 == 1) {
            Object obj2 = objArrCopyOf[0];
            Objects.requireNonNull(obj2);
            Object obj3 = objArrCopyOf[1];
            Objects.requireNonNull(obj3);
            zzfyk.zzb(obj2, obj3);
            return new zzgbe(null, objArrCopyOf, 1);
        }
        zzfwr.zzb(i2, objArrCopyOf.length >> 1, FirebaseAnalytics.Param.INDEX);
        int iZzh = zzfzs.zzh(i);
        if (i2 == 1) {
            Object obj4 = objArrCopyOf[0];
            Objects.requireNonNull(obj4);
            Object obj5 = objArrCopyOf[1];
            Objects.requireNonNull(obj5);
            zzfyk.zzb(obj4, obj5);
            i2 = 1;
            c = 1;
            c2 = 2;
        } else {
            int i4 = iZzh - 1;
            char c3 = 65535;
            if (iZzh <= 128) {
                byte[] bArr = new byte[iZzh];
                Arrays.fill(bArr, (byte) -1);
                int i5 = 0;
                int i6 = 0;
                while (i5 < i2) {
                    int i7 = i6 + i6;
                    int i8 = i5 + i5;
                    Object obj6 = objArrCopyOf[i8];
                    Objects.requireNonNull(obj6);
                    Object obj7 = objArrCopyOf[i8 ^ i3];
                    Objects.requireNonNull(obj7);
                    zzfyk.zzb(obj6, obj7);
                    int iZza = zzfzf.zza(obj6.hashCode());
                    while (true) {
                        int i9 = iZza & i4;
                        int i10 = bArr[i9] & 255;
                        if (i10 == 255) {
                            bArr[i9] = (byte) i7;
                            if (i6 < i5) {
                                objArrCopyOf[i7] = obj6;
                                objArrCopyOf[i7 ^ 1] = obj7;
                            }
                            i6++;
                        } else {
                            if (obj6.equals(objArrCopyOf[i10])) {
                                int i11 = i10 ^ 1;
                                Object obj8 = objArrCopyOf[i11];
                                Objects.requireNonNull(obj8);
                                zzfzo zzfzoVar = new zzfzo(obj6, obj7, obj8);
                                objArrCopyOf[i11] = obj7;
                                obj = zzfzoVar;
                                break;
                            }
                            iZza = i9 + 1;
                        }
                    }
                    i5++;
                    i3 = 1;
                }
                if (i6 == i2) {
                    obj = bArr;
                } else {
                    obj = new Object[]{bArr, Integer.valueOf(i6), obj};
                    c2 = 2;
                    c = 1;
                }
            } else {
                if (iZzh <= 32768) {
                    sArr = new short[iZzh];
                    Arrays.fill(sArr, (short) -1);
                    int i12 = 0;
                    for (int i13 = 0; i13 < i2; i13++) {
                        int i14 = i12 + i12;
                        int i15 = i13 + i13;
                        Object obj9 = objArrCopyOf[i15];
                        Objects.requireNonNull(obj9);
                        Object obj10 = objArrCopyOf[i15 ^ 1];
                        Objects.requireNonNull(obj10);
                        zzfyk.zzb(obj9, obj10);
                        int iZza2 = zzfzf.zza(obj9.hashCode());
                        while (true) {
                            int i16 = iZza2 & i4;
                            char c4 = (char) sArr[i16];
                            if (c4 == 65535) {
                                sArr[i16] = (short) i14;
                                if (i12 < i13) {
                                    objArrCopyOf[i14] = obj9;
                                    objArrCopyOf[i14 ^ 1] = obj10;
                                }
                                i12++;
                            } else {
                                if (obj9.equals(objArrCopyOf[c4])) {
                                    int i17 = c4 ^ 1;
                                    Object obj11 = objArrCopyOf[i17];
                                    Objects.requireNonNull(obj11);
                                    zzfzo zzfzoVar2 = new zzfzo(obj9, obj10, obj11);
                                    objArrCopyOf[i17] = obj10;
                                    obj = zzfzoVar2;
                                    break;
                                }
                                iZza2 = i16 + 1;
                            }
                        }
                    }
                    if (i12 != i2) {
                        Integer numValueOf = Integer.valueOf(i12);
                        c = 1;
                        c2 = 2;
                        objArr2 = new Object[]{sArr, numValueOf, obj};
                        obj = objArr2;
                    }
                    obj = sArr;
                } else {
                    int i18 = 1;
                    sArr = new int[iZzh];
                    Arrays.fill((int[]) sArr, -1);
                    int i19 = 0;
                    int i20 = 0;
                    while (i19 < i2) {
                        int i21 = i20 + i20;
                        int i22 = i19 + i19;
                        Object obj12 = objArrCopyOf[i22];
                        Objects.requireNonNull(obj12);
                        Object obj13 = objArrCopyOf[i22 ^ i18];
                        Objects.requireNonNull(obj13);
                        zzfyk.zzb(obj12, obj13);
                        int iZza3 = zzfzf.zza(obj12.hashCode());
                        while (true) {
                            int i23 = iZza3 & i4;
                            ?? r15 = sArr[i23];
                            if (r15 == c3) {
                                sArr[i23] = i21;
                                if (i20 < i19) {
                                    objArrCopyOf[i21] = obj12;
                                    objArrCopyOf[i21 ^ 1] = obj13;
                                }
                                i20++;
                            } else {
                                if (obj12.equals(objArrCopyOf[r15])) {
                                    int i24 = r15 ^ 1;
                                    Object obj14 = objArrCopyOf[i24];
                                    Objects.requireNonNull(obj14);
                                    zzfzo zzfzoVar3 = new zzfzo(obj12, obj13, obj14);
                                    objArrCopyOf[i24] = obj13;
                                    obj = zzfzoVar3;
                                    break;
                                }
                                iZza3 = i23 + 1;
                                c3 = 65535;
                            }
                        }
                        i19++;
                        i18 = 1;
                        c3 = 65535;
                    }
                    if (i20 != i2) {
                        c = 1;
                        c2 = 2;
                        objArr2 = new Object[]{sArr, Integer.valueOf(i20), obj};
                        obj = objArr2;
                    }
                    obj = sArr;
                }
                c = 1;
            }
            c2 = 2;
            c = 1;
        }
        boolean z = obj instanceof Object[];
        Object obj15 = obj;
        if (z) {
            Object[] objArr3 = (Object[]) obj;
            zzfzo zzfzoVar4 = (zzfzo) objArr3[c2];
            if (zzfzpVar == null) {
                throw zzfzoVar4.zza();
            }
            zzfzpVar.zzc = zzfzoVar4;
            Object obj16 = objArr3[0];
            int iIntValue = ((Integer) objArr3[c]).intValue();
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue + iIntValue);
            obj15 = obj16;
            i2 = iIntValue;
        }
        return new zzgbe(obj15, objArrCopyOf, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0003  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0003 A[EDGE_INSN: B:44:0x0003->B:4:0x0003 BREAK  A[LOOP:0: B:16:0x0038->B:22:0x004e], EDGE_INSN: B:46:0x0003->B:4:0x0003 BREAK  A[LOOP:1: B:26:0x0063->B:32:0x007a], EDGE_INSN: B:48:0x0003->B:4:0x0003 BREAK  A[LOOP:2: B:34:0x0089->B:43:0x00a0]] */
    @Override // com.google.android.gms.internal.ads.zzfzq, java.util.Map
    @javax.annotation.CheckForNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object get(@javax.annotation.CheckForNull java.lang.Object r10) {
        /*
            r9 = this;
            r0 = 0
            if (r10 != 0) goto L6
        L3:
            r10 = r0
            goto L9c
        L6:
            int r1 = r9.zzd
            java.lang.Object[] r2 = r9.zzb
            r3 = 1
            if (r1 != r3) goto L20
            r1 = 0
            r1 = r2[r1]
            java.util.Objects.requireNonNull(r1)
            boolean r10 = r1.equals(r10)
            if (r10 == 0) goto L3
            r10 = r2[r3]
            java.util.Objects.requireNonNull(r10)
            goto L9c
        L20:
            java.lang.Object r1 = r9.zzc
            if (r1 != 0) goto L25
            goto L3
        L25:
            boolean r4 = r1 instanceof byte[]
            r5 = -1
            if (r4 == 0) goto L51
            r4 = r1
            byte[] r4 = (byte[]) r4
            int r1 = r4.length
            int r6 = r1 + (-1)
            int r1 = r10.hashCode()
            int r1 = com.google.android.gms.internal.ads.zzfzf.zza(r1)
        L38:
            r1 = r1 & r6
            r5 = r4[r1]
            r7 = 255(0xff, float:3.57E-43)
            r5 = r5 & r7
            if (r5 != r7) goto L41
            goto L3
        L41:
            r7 = r2[r5]
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L4e
            r10 = r5 ^ 1
            r10 = r2[r10]
            goto L9c
        L4e:
            int r1 = r1 + 1
            goto L38
        L51:
            boolean r4 = r1 instanceof short[]
            if (r4 == 0) goto L7d
            r4 = r1
            short[] r4 = (short[]) r4
            int r1 = r4.length
            int r6 = r1 + (-1)
            int r1 = r10.hashCode()
            int r1 = com.google.android.gms.internal.ads.zzfzf.zza(r1)
        L63:
            r1 = r1 & r6
            short r5 = r4[r1]
            char r5 = (char) r5
            r7 = 65535(0xffff, float:9.1834E-41)
            if (r5 != r7) goto L6d
            goto L3
        L6d:
            r7 = r2[r5]
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L7a
            r10 = r5 ^ 1
            r10 = r2[r10]
            goto L9c
        L7a:
            int r1 = r1 + 1
            goto L63
        L7d:
            int[] r1 = (int[]) r1
            int r4 = r1.length
            int r4 = r4 + r5
            int r6 = r10.hashCode()
            int r6 = com.google.android.gms.internal.ads.zzfzf.zza(r6)
        L89:
            r6 = r6 & r4
            r7 = r1[r6]
            if (r7 != r5) goto L90
            goto L3
        L90:
            r8 = r2[r7]
            boolean r8 = r10.equals(r8)
            if (r8 == 0) goto La0
            r10 = r7 ^ 1
            r10 = r2[r10]
        L9c:
            if (r10 != 0) goto L9f
            return r0
        L9f:
            return r10
        La0:
            int r6 = r6 + 1
            goto L89
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgbe.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzfzq
    final zzfzi zza() {
        return new zzgbd(this.zzb, 1, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzfzq
    final zzfzs zzf() {
        return new zzgbb(this, this.zzb, 0, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzfzq
    final zzfzs zzg() {
        return new zzgbc(this, new zzgbd(this.zzb, 0, this.zzd));
    }
}
