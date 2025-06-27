package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzyx extends zzzc implements zzmg {
    private static final zzgay zzb = zzgay.zzb(new Comparator() { // from class: com.google.android.gms.internal.ads.zzxu
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            Integer num = (Integer) obj;
            Integer num2 = (Integer) obj2;
            if (num.intValue() == -1) {
                return num2.intValue() == -1 ? 0 : -1;
            }
            if (num2.intValue() == -1) {
                return 1;
            }
            return num.intValue() - num2.intValue();
        }
    });
    public final Context zza;
    private final Object zzc;
    private final boolean zzd;
    private zzyl zze;
    private zzyq zzf;
    private zzk zzg;
    private final zzxq zzh;

    public zzyx(Context context) {
        zzxq zzxqVar = new zzxq();
        zzyl zzylVarZzd = zzyl.zzd(context);
        this.zzc = new Object();
        this.zza = context != null ? context.getApplicationContext() : null;
        this.zzh = zzxqVar;
        this.zze = zzylVarZzd;
        this.zzg = zzk.zza;
        boolean z = false;
        if (context != null && zzfx.zzM(context)) {
            z = true;
        }
        this.zzd = z;
        if (!z && context != null && zzfx.zza >= 32) {
            this.zzf = zzyq.zza(context);
        }
        if (this.zze.zzS && context == null) {
            zzfe.zzf("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    static /* bridge */ /* synthetic */ int zzb(int i, int i2) {
        if (i == 0 || i != i2) {
            return Integer.bitCount(i & i2);
        }
        return Integer.MAX_VALUE;
    }

    protected static int zzc(zzam zzamVar, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(zzamVar.zzd)) {
            return 4;
        }
        String strZzh = zzh(str);
        String strZzh2 = zzh(zzamVar.zzd);
        if (strZzh2 == null || strZzh == null) {
            return (z && strZzh2 == null) ? 1 : 0;
        }
        if (strZzh2.startsWith(strZzh) || strZzh.startsWith(strZzh2)) {
            return 3;
        }
        int i = zzfx.zza;
        return strZzh2.split("-", 2)[0].equals(strZzh.split("-", 2)[0]) ? 2 : 0;
    }

    protected static String zzh(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ boolean zzm(com.google.android.gms.internal.ads.zzyx r8, com.google.android.gms.internal.ads.zzam r9) {
        /*
            java.lang.Object r0 = r8.zzc
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzyl r1 = r8.zze     // Catch: java.lang.Throwable -> L8e
            boolean r1 = r1.zzS     // Catch: java.lang.Throwable -> L8e
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L8b
            boolean r1 = r8.zzd     // Catch: java.lang.Throwable -> L8e
            if (r1 != 0) goto L8b
            int r1 = r9.zzz     // Catch: java.lang.Throwable -> L8e
            r4 = 2
            if (r1 <= r4) goto L8b
            java.lang.String r1 = r9.zzm     // Catch: java.lang.Throwable -> L8e
            r5 = 32
            if (r1 != 0) goto L1b
            goto L65
        L1b:
            int r6 = r1.hashCode()     // Catch: java.lang.Throwable -> L8e
            r7 = 3
            switch(r6) {
                case -2123537834: goto L42;
                case 187078296: goto L38;
                case 187078297: goto L2e;
                case 1504578661: goto L24;
                default: goto L23;
            }
        L23:
            goto L4c
        L24:
            java.lang.String r6 = "audio/eac3"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L4c
            r1 = r3
            goto L4d
        L2e:
            java.lang.String r6 = "audio/ac4"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L4c
            r1 = r7
            goto L4d
        L38:
            java.lang.String r6 = "audio/ac3"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L4c
            r1 = r2
            goto L4d
        L42:
            java.lang.String r6 = "audio/eac3-joc"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L4c
            r1 = r4
            goto L4d
        L4c:
            r1 = -1
        L4d:
            if (r1 == 0) goto L56
            if (r1 == r3) goto L56
            if (r1 == r4) goto L56
            if (r1 == r7) goto L56
            goto L65
        L56:
            int r1 = com.google.android.gms.internal.ads.zzfx.zza     // Catch: java.lang.Throwable -> L8e
            if (r1 < r5) goto L8b
            com.google.android.gms.internal.ads.zzyq r1 = r8.zzf     // Catch: java.lang.Throwable -> L8e
            if (r1 == 0) goto L8b
            boolean r1 = r1.zzg()     // Catch: java.lang.Throwable -> L8e
            if (r1 != 0) goto L65
            goto L8b
        L65:
            int r1 = com.google.android.gms.internal.ads.zzfx.zza     // Catch: java.lang.Throwable -> L8e
            if (r1 < r5) goto L8c
            com.google.android.gms.internal.ads.zzyq r1 = r8.zzf     // Catch: java.lang.Throwable -> L8e
            if (r1 == 0) goto L8c
            boolean r4 = r1.zzg()     // Catch: java.lang.Throwable -> L8e
            if (r4 == 0) goto L8c
            boolean r1 = r1.zze()     // Catch: java.lang.Throwable -> L8e
            if (r1 == 0) goto L8c
            com.google.android.gms.internal.ads.zzyq r1 = r8.zzf     // Catch: java.lang.Throwable -> L8e
            boolean r1 = r1.zzf()     // Catch: java.lang.Throwable -> L8e
            if (r1 == 0) goto L8c
            com.google.android.gms.internal.ads.zzyq r1 = r8.zzf     // Catch: java.lang.Throwable -> L8e
            com.google.android.gms.internal.ads.zzk r8 = r8.zzg     // Catch: java.lang.Throwable -> L8e
            boolean r8 = r1.zzd(r8, r9)     // Catch: java.lang.Throwable -> L8e
            if (r8 == 0) goto L8c
        L8b:
            r2 = r3
        L8c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8e
            return r2
        L8e:
            r8 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8e
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzyx.zzm(com.google.android.gms.internal.ads.zzyx, com.google.android.gms.internal.ads.zzam):boolean");
    }

    protected static boolean zzo(int i, boolean z) {
        int i2 = i & 7;
        return i2 == 4 || (z && i2 == 3);
    }

    private static void zzu(zzxk zzxkVar, zzdg zzdgVar, Map map) {
        for (int i = 0; i < zzxkVar.zzc; i++) {
            if (((zzdb) zzdgVar.zzD.get(zzxkVar.zzb(i))) != null) {
                throw null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzv() {
        boolean z;
        zzyq zzyqVar;
        synchronized (this.zzc) {
            z = false;
            if (this.zze.zzS && !this.zzd && zzfx.zza >= 32 && (zzyqVar = this.zzf) != null && zzyqVar.zzg()) {
                z = true;
            }
        }
        if (z) {
            zzt();
        }
    }

    private static final Pair zzw(int i, zzzb zzzbVar, int[][][] iArr, zzys zzysVar, Comparator comparator) {
        RandomAccess randomAccessZzn;
        zzzb zzzbVar2 = zzzbVar;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 < 2) {
            if (i == zzzbVar2.zzc(i2)) {
                zzxk zzxkVarZzd = zzzbVar2.zzd(i2);
                for (int i3 = 0; i3 < zzxkVarZzd.zzc; i3++) {
                    zzcz zzczVarZzb = zzxkVarZzd.zzb(i3);
                    List listZza = zzysVar.zza(i2, zzczVarZzb, iArr[i2][i3]);
                    boolean[] zArr = new boolean[zzczVarZzb.zzb];
                    int i4 = 0;
                    while (i4 < zzczVarZzb.zzb) {
                        int i5 = i4 + 1;
                        zzyt zzytVar = (zzyt) listZza.get(i4);
                        int iZzb = zzytVar.zzb();
                        if (!zArr[i4] && iZzb != 0) {
                            if (iZzb == 1) {
                                randomAccessZzn = zzfzn.zzn(zzytVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(zzytVar);
                                for (int i6 = i5; i6 < zzczVarZzb.zzb; i6++) {
                                    zzyt zzytVar2 = (zzyt) listZza.get(i6);
                                    if (zzytVar2.zzb() == 2 && zzytVar.zzc(zzytVar2)) {
                                        arrayList2.add(zzytVar2);
                                        zArr[i6] = true;
                                    }
                                }
                                randomAccessZzn = arrayList2;
                            }
                            arrayList.add(randomAccessZzn);
                        }
                        i4 = i5;
                    }
                }
            }
            i2++;
            zzzbVar2 = zzzbVar;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i7 = 0; i7 < list.size(); i7++) {
            iArr2[i7] = ((zzyt) list.get(i7)).zzc;
        }
        zzyt zzytVar3 = (zzyt) list.get(0);
        return Pair.create(new zzyy(zzytVar3.zzb, iArr2, 0), Integer.valueOf(zzytVar3.zza));
    }

    @Override // com.google.android.gms.internal.ads.zzmg
    public final void zza(zzmf zzmfVar) {
        synchronized (this.zzc) {
            boolean z = this.zze.zzW;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzzc
    protected final Pair zzd(zzzb zzzbVar, int[][][] iArr, final int[] iArr2, zzvh zzvhVar, zzcx zzcxVar) throws zziz {
        final zzyl zzylVar;
        Pair pairZzw;
        int i;
        final boolean z;
        int[] iArr3;
        int length;
        zzyq zzyqVar;
        synchronized (this.zzc) {
            zzylVar = this.zze;
            if (zzylVar.zzS && zzfx.zza >= 32 && (zzyqVar = this.zzf) != null) {
                Looper looperMyLooper = Looper.myLooper();
                zzek.zzb(looperMyLooper);
                zzyqVar.zzb(this, looperMyLooper);
            }
        }
        int i2 = 2;
        zzyy[] zzyyVarArr = new zzyy[2];
        zzde zzdeVar = zzylVar.zzv;
        Pair pairZzw2 = zzw(2, zzzbVar, iArr, new zzys() { // from class: com.google.android.gms.internal.ads.zzya
            /* JADX WARN: Removed duplicated region for block: B:22:0x003c  */
            /* JADX WARN: Removed duplicated region for block: B:25:0x0044  */
            /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
            @Override // com.google.android.gms.internal.ads.zzys
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.util.List zza(int r20, com.google.android.gms.internal.ads.zzcz r21, int[] r22) {
                /*
                    Method dump skipped, instructions count: 200
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzya.zza(int, com.google.android.gms.internal.ads.zzcz, int[]):java.util.List");
            }
        }, new Comparator() { // from class: com.google.android.gms.internal.ads.zzyb
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                List list = (List) obj;
                List list2 = (List) obj2;
                return zzfzc.zzk().zzd((zzyw) Collections.max(list, new Comparator() { // from class: com.google.android.gms.internal.ads.zzyu
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return zzyw.zzd((zzyw) obj3, (zzyw) obj4);
                    }
                }), (zzyw) Collections.max(list2, new Comparator() { // from class: com.google.android.gms.internal.ads.zzyu
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return zzyw.zzd((zzyw) obj3, (zzyw) obj4);
                    }
                }), new Comparator() { // from class: com.google.android.gms.internal.ads.zzyu
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return zzyw.zzd((zzyw) obj3, (zzyw) obj4);
                    }
                }).zzb(list.size(), list2.size()).zzd((zzyw) Collections.max(list, new Comparator() { // from class: com.google.android.gms.internal.ads.zzyv
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return zzyw.zza((zzyw) obj3, (zzyw) obj4);
                    }
                }), (zzyw) Collections.max(list2, new Comparator() { // from class: com.google.android.gms.internal.ads.zzyv
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return zzyw.zza((zzyw) obj3, (zzyw) obj4);
                    }
                }), new Comparator() { // from class: com.google.android.gms.internal.ads.zzyv
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return zzyw.zza((zzyw) obj3, (zzyw) obj4);
                    }
                }).zza();
            }
        });
        boolean z2 = zzylVar.zzA;
        int i3 = 4;
        if (pairZzw2 == null) {
            zzde zzdeVar2 = zzylVar.zzv;
            pairZzw = zzw(4, zzzbVar, iArr, new zzys() { // from class: com.google.android.gms.internal.ads.zzxw
                @Override // com.google.android.gms.internal.ads.zzys
                public final List zza(int i4, zzcz zzczVar, int[] iArr4) {
                    zzfzk zzfzkVar = new zzfzk();
                    for (int i5 = 0; i5 < zzczVar.zzb; i5++) {
                        zzfzkVar.zzf(new zzyf(i4, zzczVar, i5, zzylVar, iArr4[i5]));
                    }
                    return zzfzkVar.zzi();
                }
            }, new Comparator() { // from class: com.google.android.gms.internal.ads.zzxx
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return ((zzyf) ((List) obj).get(0)).zza((zzyf) ((List) obj2).get(0));
                }
            });
        } else {
            pairZzw = null;
        }
        int i4 = 0;
        if (pairZzw != null) {
            zzyyVarArr[((Integer) pairZzw.second).intValue()] = (zzyy) pairZzw.first;
        } else if (pairZzw2 != null) {
            zzyyVarArr[((Integer) pairZzw2.second).intValue()] = (zzyy) pairZzw2.first;
        }
        int i5 = 0;
        while (true) {
            i = 1;
            if (i5 >= 2) {
                z = false;
                break;
            }
            if (zzzbVar.zzc(i5) == 2 && zzzbVar.zzd(i5).zzc > 0) {
                z = true;
                break;
            }
            i5++;
        }
        Pair pairZzw3 = zzw(1, zzzbVar, iArr, new zzys() { // from class: com.google.android.gms.internal.ads.zzxy
            @Override // com.google.android.gms.internal.ads.zzys
            public final List zza(int i6, zzcz zzczVar, int[] iArr4) {
                final zzyx zzyxVar = this.zza;
                zzfws zzfwsVar = new zzfws() { // from class: com.google.android.gms.internal.ads.zzxv
                    @Override // com.google.android.gms.internal.ads.zzfws
                    public final boolean zza(Object obj) {
                        return zzyx.zzm(zzyxVar, (zzam) obj);
                    }
                };
                int i7 = iArr2[i6];
                zzfzk zzfzkVar = new zzfzk();
                for (int i8 = 0; i8 < zzczVar.zzb; i8++) {
                    zzfzkVar.zzf(new zzye(i6, zzczVar, i8, zzylVar, iArr4[i8], z, zzfwsVar, i7));
                }
                return zzfzkVar.zzi();
            }
        }, new Comparator() { // from class: com.google.android.gms.internal.ads.zzxz
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((zzye) Collections.max((List) obj)).zza((zzye) Collections.max((List) obj2));
            }
        });
        if (pairZzw3 != null) {
            zzyyVarArr[((Integer) pairZzw3.second).intValue()] = (zzyy) pairZzw3.first;
        }
        final String str = pairZzw3 == null ? null : ((zzyy) pairZzw3.first).zza.zzb(((zzyy) pairZzw3.first).zzb[0]).zzd;
        zzde zzdeVar3 = zzylVar.zzv;
        int i6 = 3;
        Pair pairZzw4 = zzw(3, zzzbVar, iArr, new zzys() { // from class: com.google.android.gms.internal.ads.zzyc
            @Override // com.google.android.gms.internal.ads.zzys
            public final List zza(int i7, zzcz zzczVar, int[] iArr4) {
                zzfzk zzfzkVar = new zzfzk();
                for (int i8 = 0; i8 < zzczVar.zzb; i8++) {
                    int i9 = i8;
                    zzfzkVar.zzf(new zzyr(i7, zzczVar, i9, zzylVar, iArr4[i8], str));
                }
                return zzfzkVar.zzi();
            }
        }, new Comparator() { // from class: com.google.android.gms.internal.ads.zzyd
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((zzyr) ((List) obj).get(0)).zza((zzyr) ((List) obj2).get(0));
            }
        });
        if (pairZzw4 != null) {
            zzyyVarArr[((Integer) pairZzw4.second).intValue()] = (zzyy) pairZzw4.first;
        }
        int i7 = 0;
        while (i7 < i2) {
            int iZzc = zzzbVar.zzc(i7);
            if (iZzc != i2 && iZzc != i && iZzc != i6 && iZzc != i3) {
                zzxk zzxkVarZzd = zzzbVar.zzd(i7);
                int[][] iArr4 = iArr[i7];
                zzde zzdeVar4 = zzylVar.zzv;
                int i8 = i4;
                int i9 = i8;
                zzcz zzczVar = null;
                zzyg zzygVar = null;
                while (i8 < zzxkVarZzd.zzc) {
                    zzcz zzczVarZzb = zzxkVarZzd.zzb(i8);
                    int[] iArr5 = iArr4[i8];
                    zzyg zzygVar2 = zzygVar;
                    for (int i10 = i4; i10 < zzczVarZzb.zzb; i10++) {
                        if (zzo(iArr5[i10], zzylVar.zzT)) {
                            zzyg zzygVar3 = new zzyg(zzczVarZzb.zzb(i10), iArr5[i10]);
                            if (zzygVar2 == null || zzygVar3.compareTo(zzygVar2) > 0) {
                                zzczVar = zzczVarZzb;
                                i9 = i10;
                                zzygVar2 = zzygVar3;
                            }
                        }
                    }
                    i8++;
                    zzygVar = zzygVar2;
                    i4 = 0;
                }
                zzyyVarArr[i7] = zzczVar == null ? null : new zzyy(zzczVar, new int[]{i9}, 0);
            }
            i7++;
            i2 = 2;
            i3 = 4;
            i = 1;
            i4 = 0;
            i6 = 3;
        }
        HashMap map = new HashMap();
        int i11 = 2;
        for (int i12 = 0; i12 < 2; i12++) {
            zzu(zzzbVar.zzd(i12), zzylVar, map);
        }
        zzu(zzzbVar.zze(), zzylVar, map);
        for (int i13 = 0; i13 < 2; i13++) {
            if (((zzdb) map.get(Integer.valueOf(zzzbVar.zzc(i13)))) != null) {
                throw null;
            }
        }
        int[] iArr6 = null;
        int i14 = 0;
        while (i14 < i11) {
            zzxk zzxkVarZzd2 = zzzbVar.zzd(i14);
            if (zzylVar.zzg(i14, zzxkVarZzd2)) {
                zzyyVarArr[i14] = (zzylVar.zze(i14, zzxkVarZzd2) == null || iArr6.length == 0) ? null : new zzyy(zzxkVarZzd2.zzb(0), iArr6, 0);
            }
            i14++;
            iArr6 = null;
            i11 = 2;
        }
        int i15 = 0;
        for (int i16 = i11; i15 < i16; i16 = 2) {
            int iZzc2 = zzzbVar.zzc(i15);
            if (zzylVar.zzf(i15) || zzylVar.zzE.contains(Integer.valueOf(iZzc2))) {
                zzyyVarArr[i15] = null;
            }
            i15++;
        }
        zzxq zzxqVar = this.zzh;
        zzzn zzznVarZzr = zzr();
        zzfzn zzfznVarZzf = zzxr.zzf(zzyyVarArr);
        int i17 = 2;
        zzyz[] zzyzVarArr = new zzyz[2];
        int i18 = 0;
        while (i18 < i17) {
            zzyy zzyyVar = zzyyVarArr[i18];
            if (zzyyVar != null && (length = (iArr3 = zzyyVar.zzb).length) != 0) {
                zzyzVarArr[i18] = length == 1 ? new zzza(zzyyVar.zza, iArr3[0], 0, 0, null) : zzxqVar.zza(zzyyVar.zza, iArr3, 0, zzznVarZzr, (zzfzn) zzfznVarZzf.get(i18));
            }
            i18++;
            i17 = 2;
        }
        zzmi[] zzmiVarArr = new zzmi[i17];
        for (int i19 = 0; i19 < i17; i19++) {
            zzmiVarArr[i19] = (zzylVar.zzf(i19) || zzylVar.zzE.contains(Integer.valueOf(zzzbVar.zzc(i19))) || (zzzbVar.zzc(i19) != -2 && zzyzVarArr[i19] == null)) ? null : zzmi.zza;
        }
        boolean z3 = zzylVar.zzU;
        zzde zzdeVar5 = zzylVar.zzv;
        return Pair.create(zzmiVarArr, zzyzVarArr);
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    public final zzmg zze() {
        return this;
    }

    public final zzyl zzf() {
        zzyl zzylVar;
        synchronized (this.zzc) {
            zzylVar = this.zze;
        }
        return zzylVar;
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    public final void zzj() {
        zzyq zzyqVar;
        synchronized (this.zzc) {
            if (zzfx.zza >= 32 && (zzyqVar = this.zzf) != null) {
                zzyqVar.zzc();
            }
        }
        super.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    public final void zzk(zzk zzkVar) {
        boolean z;
        synchronized (this.zzc) {
            z = !this.zzg.equals(zzkVar);
            this.zzg = zzkVar;
        }
        if (z) {
            zzv();
        }
    }

    public final void zzl(zzyj zzyjVar) {
        boolean z;
        zzyl zzylVar = new zzyl(zzyjVar);
        synchronized (this.zzc) {
            z = !this.zze.equals(zzylVar);
            this.zze = zzylVar;
        }
        if (z) {
            if (zzylVar.zzS && this.zza == null) {
                zzfe.zzf("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
            }
            zzt();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    public final boolean zzn() {
        return true;
    }
}
