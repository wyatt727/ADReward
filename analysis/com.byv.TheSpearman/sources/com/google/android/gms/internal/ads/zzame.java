package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Base64;
import android.util.Pair;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.TreeSet;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzame {
    public final String zza;
    public final String zzb;
    public final boolean zzc;
    public final long zzd;
    public final long zze;
    public final zzamk zzf;
    public final String zzg;
    public final String zzh;
    public final zzame zzi;
    private final String[] zzj;
    private final HashMap zzk;
    private final HashMap zzl;
    private List zzm;

    public static zzame zzb(String str, long j, long j2, zzamk zzamkVar, String[] strArr, String str2, String str3, zzame zzameVar) {
        return new zzame(str, null, j, j2, zzamkVar, strArr, str2, str3, zzameVar);
    }

    public static zzame zzc(String str) {
        return new zzame(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    private static SpannableStringBuilder zzi(String str, Map map) {
        if (!map.containsKey(str)) {
            zzea zzeaVar = new zzea();
            zzeaVar.zzl(new SpannableStringBuilder());
            map.put(str, zzeaVar);
        }
        CharSequence charSequenceZzq = ((zzea) map.get(str)).zzq();
        Objects.requireNonNull(charSequenceZzq);
        return (SpannableStringBuilder) charSequenceZzq;
    }

    private final void zzj(TreeSet treeSet, boolean z) {
        String str = this.zza;
        boolean zEquals = "p".equals(str);
        boolean zEquals2 = "div".equals(str);
        if (z || zEquals || (zEquals2 && this.zzh != null)) {
            long j = this.zzd;
            if (j != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j));
            }
            long j2 = this.zze;
            if (j2 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j2));
            }
        }
        if (this.zzm != null) {
            for (int i = 0; i < this.zzm.size(); i++) {
                zzame zzameVar = (zzame) this.zzm.get(i);
                boolean z2 = true;
                if (!z && !zEquals) {
                    z2 = false;
                }
                zzameVar.zzj(treeSet, z2);
            }
        }
    }

    private final void zzk(long j, String str, List list) {
        String str2;
        if (!"".equals(this.zzg)) {
            str = this.zzg;
        }
        if (zzg(j) && "div".equals(this.zza) && (str2 = this.zzh) != null) {
            list.add(new Pair(str, str2));
            return;
        }
        for (int i = 0; i < zza(); i++) {
            zzd(i).zzk(j, str, list);
        }
    }

    private final void zzl(long j, Map map, Map map2, String str, Map map3) {
        zzame zzameVar;
        int i;
        int iZzf;
        zzamk zzamkVarZza;
        int i2;
        if (zzg(j)) {
            String str2 = !"".equals(this.zzg) ? this.zzg : str;
            for (Map.Entry entry : this.zzl.entrySet()) {
                String str3 = (String) entry.getKey();
                int iIntValue = this.zzk.containsKey(str3) ? ((Integer) this.zzk.get(str3)).intValue() : 0;
                int iIntValue2 = ((Integer) entry.getValue()).intValue();
                if (iIntValue != iIntValue2) {
                    zzea zzeaVar = (zzea) map3.get(str3);
                    Objects.requireNonNull(zzeaVar);
                    zzami zzamiVar = (zzami) map2.get(str2);
                    Objects.requireNonNull(zzamiVar);
                    zzamk zzamkVarZza2 = zzamj.zza(this.zzf, this.zzj, map);
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) zzeaVar.zzq();
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                        zzeaVar.zzl(spannableStringBuilder);
                    }
                    if (zzamkVarZza2 != null) {
                        zzame zzameVar2 = this.zzi;
                        if (zzamkVarZza2.zzh() != -1) {
                            spannableStringBuilder.setSpan(new StyleSpan(zzamkVarZza2.zzh()), iIntValue, iIntValue2, 33);
                        }
                        if (zzamkVarZza2.zzI()) {
                            spannableStringBuilder.setSpan(new StrikethroughSpan(), iIntValue, iIntValue2, 33);
                        }
                        if (zzamkVarZza2.zzJ()) {
                            spannableStringBuilder.setSpan(new UnderlineSpan(), iIntValue, iIntValue2, 33);
                        }
                        if (zzamkVarZza2.zzH()) {
                            zzei.zza(spannableStringBuilder, new ForegroundColorSpan(zzamkVarZza2.zzd()), iIntValue, iIntValue2, 33);
                        }
                        if (zzamkVarZza2.zzG()) {
                            zzei.zza(spannableStringBuilder, new BackgroundColorSpan(zzamkVarZza2.zzc()), iIntValue, iIntValue2, 33);
                        }
                        if (zzamkVarZza2.zzD() != null) {
                            zzei.zza(spannableStringBuilder, new TypefaceSpan(zzamkVarZza2.zzD()), iIntValue, iIntValue2, 33);
                        }
                        if (zzamkVarZza2.zzk() != null) {
                            zzamd zzamdVarZzk = zzamkVarZza2.zzk();
                            Objects.requireNonNull(zzamdVarZzk);
                            int i3 = zzamdVarZzk.zza;
                            if (i3 == -1) {
                                int i4 = zzamiVar.zzj;
                                i3 = (i4 == 2 || i4 == 1) ? 3 : 1;
                                i2 = 1;
                            } else {
                                i2 = zzamdVarZzk.zzb;
                            }
                            int i5 = zzamdVarZzk.zzc;
                            if (i5 == -2) {
                                i5 = 1;
                            }
                            zzei.zza(spannableStringBuilder, new zzej(i3, i2, i5), iIntValue, iIntValue2, 33);
                        }
                        int iZzg = zzamkVarZza2.zzg();
                        if (iZzg == 2) {
                            while (true) {
                                if (zzameVar2 == null) {
                                    zzameVar2 = null;
                                    break;
                                }
                                zzamk zzamkVarZza3 = zzamj.zza(zzameVar2.zzf, zzameVar2.zzj, map);
                                if (zzamkVarZza3 != null && zzamkVarZza3.zzg() == 1) {
                                    break;
                                } else {
                                    zzameVar2 = zzameVar2.zzi;
                                }
                            }
                            if (zzameVar2 != null) {
                                ArrayDeque arrayDeque = new ArrayDeque();
                                arrayDeque.push(zzameVar2);
                                while (true) {
                                    if (arrayDeque.isEmpty()) {
                                        zzameVar = null;
                                        break;
                                    }
                                    zzame zzameVar3 = (zzame) arrayDeque.pop();
                                    zzamk zzamkVarZza4 = zzamj.zza(zzameVar3.zzf, zzameVar3.zzj, map);
                                    if (zzamkVarZza4 != null && zzamkVarZza4.zzg() == 3) {
                                        zzameVar = zzameVar3;
                                        break;
                                    }
                                    for (int iZza = zzameVar3.zza() - 1; iZza >= 0; iZza--) {
                                        arrayDeque.push(zzameVar3.zzd(iZza));
                                    }
                                }
                                if (zzameVar != null) {
                                    if (zzameVar.zza() != 1 || zzameVar.zzd(0).zzb == null) {
                                        zzfe.zze("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                                    } else {
                                        String str4 = zzameVar.zzd(0).zzb;
                                        int i6 = zzfx.zza;
                                        zzamk zzamkVarZza5 = zzamj.zza(zzameVar.zzf, zzameVar.zzj, map);
                                        if (zzamkVarZza5 != null) {
                                            iZzf = zzamkVarZza5.zzf();
                                            i = -1;
                                        } else {
                                            i = -1;
                                            iZzf = -1;
                                        }
                                        if (iZzf == i && (zzamkVarZza = zzamj.zza(zzameVar2.zzf, zzameVar2.zzj, map)) != null) {
                                            iZzf = zzamkVarZza.zzf();
                                        }
                                        spannableStringBuilder.setSpan(new zzeh(str4, iZzf), iIntValue, iIntValue2, 33);
                                    }
                                }
                            }
                        } else if (iZzg == 3 || iZzg == 4) {
                            spannableStringBuilder.setSpan(new zzamc(), iIntValue, iIntValue2, 33);
                        }
                        if (zzamkVarZza2.zzF()) {
                            zzei.zza(spannableStringBuilder, new zzeg(), iIntValue, iIntValue2, 33);
                        }
                        int iZze = zzamkVarZza2.zze();
                        if (iZze == 1) {
                            zzei.zza(spannableStringBuilder, new AbsoluteSizeSpan((int) zzamkVarZza2.zza(), true), iIntValue, iIntValue2, 33);
                        } else if (iZze == 2) {
                            zzei.zza(spannableStringBuilder, new RelativeSizeSpan(zzamkVarZza2.zza()), iIntValue, iIntValue2, 33);
                        } else if (iZze == 3) {
                            zzei.zza(spannableStringBuilder, new RelativeSizeSpan(zzamkVarZza2.zza() / 100.0f), iIntValue, iIntValue2, 33);
                        }
                        if ("p".equals(this.zza)) {
                            if (zzamkVarZza2.zzb() != Float.MAX_VALUE) {
                                zzeaVar.zzj((zzamkVarZza2.zzb() * (-90.0f)) / 100.0f);
                            }
                            if (zzamkVarZza2.zzj() != null) {
                                zzeaVar.zzm(zzamkVarZza2.zzj());
                            }
                            if (zzamkVarZza2.zzi() != null) {
                                zzeaVar.zzg(zzamkVarZza2.zzi());
                            }
                        }
                    }
                }
            }
            for (int i7 = 0; i7 < zza(); i7++) {
                zzd(i7).zzl(j, map, map2, str2, map3);
            }
        }
    }

    private final void zzm(long j, boolean z, String str, Map map) {
        this.zzk.clear();
        this.zzl.clear();
        if ("metadata".equals(this.zza)) {
            return;
        }
        if (!"".equals(this.zzg)) {
            str = this.zzg;
        }
        if (this.zzc && z) {
            SpannableStringBuilder spannableStringBuilderZzi = zzi(str, map);
            String str2 = this.zzb;
            Objects.requireNonNull(str2);
            spannableStringBuilderZzi.append((CharSequence) str2);
            return;
        }
        if ("br".equals(this.zza) && z) {
            zzi(str, map).append('\n');
            return;
        }
        if (zzg(j)) {
            for (Map.Entry entry : map.entrySet()) {
                HashMap map2 = this.zzk;
                String str3 = (String) entry.getKey();
                CharSequence charSequenceZzq = ((zzea) entry.getValue()).zzq();
                Objects.requireNonNull(charSequenceZzq);
                map2.put(str3, Integer.valueOf(charSequenceZzq.length()));
            }
            boolean zEquals = "p".equals(this.zza);
            for (int i = 0; i < zza(); i++) {
                zzd(i).zzm(j, z || zEquals, str, map);
            }
            if (zEquals) {
                SpannableStringBuilder spannableStringBuilderZzi2 = zzi(str, map);
                int length = spannableStringBuilderZzi2.length();
                do {
                    length--;
                    if (length < 0) {
                        break;
                    }
                } while (spannableStringBuilderZzi2.charAt(length) == ' ');
                if (length >= 0 && spannableStringBuilderZzi2.charAt(length) != '\n') {
                    spannableStringBuilderZzi2.append('\n');
                }
            }
            for (Map.Entry entry2 : map.entrySet()) {
                HashMap map3 = this.zzl;
                String str4 = (String) entry2.getKey();
                CharSequence charSequenceZzq2 = ((zzea) entry2.getValue()).zzq();
                Objects.requireNonNull(charSequenceZzq2);
                map3.put(str4, Integer.valueOf(charSequenceZzq2.length()));
            }
        }
    }

    public final int zza() {
        List list = this.zzm;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public final zzame zzd(int i) {
        List list = this.zzm;
        if (list != null) {
            return (zzame) list.get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    public final List zze(long j, Map map, Map map2, Map map3) {
        List arrayList = new ArrayList();
        zzk(j, this.zzg, arrayList);
        TreeMap treeMap = new TreeMap();
        zzm(j, false, this.zzg, treeMap);
        zzl(j, map, map2, this.zzg, treeMap);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Pair pair = (Pair) arrayList.get(i);
            String str = (String) map3.get(pair.second);
            if (str != null) {
                byte[] bArrDecode = Base64.decode(str, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                zzami zzamiVar = (zzami) map2.get(pair.first);
                Objects.requireNonNull(zzamiVar);
                zzea zzeaVar = new zzea();
                zzeaVar.zzc(bitmapDecodeByteArray);
                zzeaVar.zzh(zzamiVar.zzb);
                zzeaVar.zzi(0);
                zzeaVar.zze(zzamiVar.zzc, 0);
                zzeaVar.zzf(zzamiVar.zze);
                zzeaVar.zzk(zzamiVar.zzf);
                zzeaVar.zzd(zzamiVar.zzg);
                zzeaVar.zzo(zzamiVar.zzj);
                arrayList2.add(zzeaVar.zzp());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            zzami zzamiVar2 = (zzami) map2.get(entry.getKey());
            Objects.requireNonNull(zzamiVar2);
            zzea zzeaVar2 = (zzea) entry.getValue();
            CharSequence charSequenceZzq = zzeaVar2.zzq();
            Objects.requireNonNull(charSequenceZzq);
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequenceZzq;
            for (zzamc zzamcVar : (zzamc[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), zzamc.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(zzamcVar), spannableStringBuilder.getSpanEnd(zzamcVar), (CharSequence) "");
            }
            int i2 = 0;
            while (i2 < spannableStringBuilder.length()) {
                int i3 = i2 + 1;
                if (spannableStringBuilder.charAt(i2) == ' ') {
                    int i4 = i3;
                    while (i4 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i4) == ' ') {
                        i4++;
                    }
                    int i5 = i4 - i3;
                    if (i5 > 0) {
                        spannableStringBuilder.delete(i2, i5 + i2);
                    }
                }
                i2 = i3;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            int i6 = 0;
            while (i6 < spannableStringBuilder.length() - 1) {
                int i7 = i6 + 1;
                if (spannableStringBuilder.charAt(i6) == '\n' && spannableStringBuilder.charAt(i7) == ' ') {
                    spannableStringBuilder.delete(i7, i6 + 2);
                }
                i6 = i7;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            int i8 = 0;
            while (i8 < spannableStringBuilder.length() - 1) {
                int i9 = i8 + 1;
                if (spannableStringBuilder.charAt(i8) == ' ' && spannableStringBuilder.charAt(i9) == '\n') {
                    spannableStringBuilder.delete(i8, i9);
                }
                i8 = i9;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            zzeaVar2.zze(zzamiVar2.zzc, zzamiVar2.zzd);
            zzeaVar2.zzf(zzamiVar2.zze);
            zzeaVar2.zzh(zzamiVar2.zzb);
            zzeaVar2.zzk(zzamiVar2.zzf);
            zzeaVar2.zzn(zzamiVar2.zzi, zzamiVar2.zzh);
            zzeaVar2.zzo(zzamiVar2.zzj);
            arrayList2.add(zzeaVar2.zzp());
        }
        return arrayList2;
    }

    public final void zzf(zzame zzameVar) {
        if (this.zzm == null) {
            this.zzm = new ArrayList();
        }
        this.zzm.add(zzameVar);
    }

    public final boolean zzg(long j) {
        long j2 = this.zzd;
        if (j2 != -9223372036854775807L) {
            if ((j2 <= j || this.zze != -9223372036854775807L) && ((j2 != -9223372036854775807L || j >= this.zze) && (j2 > j || j >= this.zze))) {
                return false;
            }
        } else if (this.zze != -9223372036854775807L) {
            j2 = -9223372036854775807L;
            return j2 <= j ? false : false;
        }
        return true;
    }

    public final long[] zzh() {
        TreeSet treeSet = new TreeSet();
        int i = 0;
        zzj(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = ((Long) it.next()).longValue();
            i++;
        }
        return jArr;
    }

    private zzame(String str, String str2, long j, long j2, zzamk zzamkVar, String[] strArr, String str3, String str4, zzame zzameVar) {
        this.zza = str;
        this.zzb = str2;
        this.zzh = str4;
        this.zzf = zzamkVar;
        this.zzj = strArr;
        this.zzc = str2 != null;
        this.zzd = j;
        this.zze = j2;
        Objects.requireNonNull(str3);
        this.zzg = str3;
        this.zzi = zzameVar;
        this.zzk = new HashMap();
        this.zzl = new HashMap();
    }
}
