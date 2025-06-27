package com.google.android.gms.internal.ads;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.Charset;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzamm implements zzalh {
    private final zzfo zza = new zzfo();
    private final boolean zzb;
    private final int zzc;
    private final int zzd;
    private final String zze;
    private final float zzf;
    private final int zzg;

    public zzamm(List list) {
        if (list.size() != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.zzc = 0;
            this.zzd = -1;
            this.zze = "sans-serif";
            this.zzb = false;
            this.zzf = 0.85f;
            this.zzg = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.zzc = bArr[24];
        this.zzd = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.zze = true == "Serif".equals(zzfx.zzB(bArr, 43, bArr.length + (-43))) ? "serif" : "sans-serif";
        int i = bArr[25] * 20;
        this.zzg = i;
        boolean z = (bArr[0] & 32) != 0;
        this.zzb = z;
        if (z) {
            this.zzf = Math.max(0.0f, Math.min(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i, 0.95f));
        } else {
            this.zzf = 0.85f;
        }
    }

    private static void zzb(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i >>> 8) | ((i & 255) << 24)), i3, i4, i5 | 33);
        }
    }

    private static void zzc(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            int i6 = i5 | 33;
            int i7 = i & 1;
            int i8 = i & 2;
            boolean z = true;
            if (i7 != 0) {
                if (i8 != 0) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i3, i4, i6);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i3, i4, i6);
                    z = false;
                }
            } else if (i8 != 0) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i3, i4, i6);
            } else {
                z = false;
            }
            if ((i & 4) != 0) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i3, i4, i6);
            } else {
                if (i7 != 0 || z) {
                    return;
                }
                spannableStringBuilder.setSpan(new StyleSpan(0), i3, i4, i6);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzalh
    public final void zza(byte[] bArr, int i, int i2, zzalg zzalgVar, zzep zzepVar) {
        String strZzA;
        int i3;
        int length;
        this.zza.zzI(bArr, i + i2);
        this.zza.zzK(i);
        zzfo zzfoVar = this.zza;
        int i4 = 2;
        int i5 = 1;
        int i6 = 0;
        zzek.zzd(zzfoVar.zzb() >= 2);
        int iZzq = zzfoVar.zzq();
        if (iZzq == 0) {
            strZzA = "";
        } else {
            int iZzd = zzfoVar.zzd();
            Charset charsetZzB = zzfoVar.zzB();
            int iZzd2 = zzfoVar.zzd() - iZzd;
            if (charsetZzB == null) {
                charsetZzB = zzfwd.zzc;
            }
            strZzA = zzfoVar.zzA(iZzq - iZzd2, charsetZzB);
        }
        if (strZzA.isEmpty()) {
            zzepVar.zza(new zzakz(zzfzn.zzm(), -9223372036854775807L, -9223372036854775807L));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strZzA);
        zzc(spannableStringBuilder, this.zzc, 0, 0, spannableStringBuilder.length(), 16711680);
        zzb(spannableStringBuilder, this.zzd, -1, 0, spannableStringBuilder.length(), 16711680);
        String str = this.zze;
        int length2 = spannableStringBuilder.length();
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length2, 16711713);
        }
        float fMax = this.zzf;
        while (true) {
            zzfo zzfoVar2 = this.zza;
            if (zzfoVar2.zzb() < 8) {
                zzea zzeaVar = new zzea();
                zzeaVar.zzl(spannableStringBuilder);
                zzeaVar.zze(fMax, 0);
                zzeaVar.zzf(0);
                zzepVar.zza(new zzakz(zzfzn.zzn(zzeaVar.zzp()), -9223372036854775807L, -9223372036854775807L));
                return;
            }
            int iZzd3 = zzfoVar2.zzd();
            int iZzg = zzfoVar2.zzg();
            int iZzg2 = this.zza.zzg();
            if (iZzg2 == 1937013100) {
                zzek.zzd(this.zza.zzb() >= i4 ? i5 : i6);
                int iZzq2 = this.zza.zzq();
                int i7 = i6;
                while (i7 < iZzq2) {
                    zzfo zzfoVar3 = this.zza;
                    zzek.zzd(zzfoVar3.zzb() >= 12 ? i5 : i6);
                    int iZzq3 = zzfoVar3.zzq();
                    int iZzq4 = zzfoVar3.zzq();
                    zzfoVar3.zzL(i4);
                    int iZzm = zzfoVar3.zzm();
                    zzfoVar3.zzL(i5);
                    int iZzg3 = zzfoVar3.zzg();
                    if (iZzq4 > spannableStringBuilder.length()) {
                        int length3 = spannableStringBuilder.length();
                        StringBuilder sb = new StringBuilder();
                        i3 = iZzq2;
                        sb.append("Truncating styl end (");
                        sb.append(iZzq4);
                        sb.append(") to cueText.length() (");
                        sb.append(length3);
                        sb.append(").");
                        zzfe.zzf("Tx3gParser", sb.toString());
                        length = spannableStringBuilder.length();
                    } else {
                        i3 = iZzq2;
                        length = iZzq4;
                    }
                    if (iZzq3 >= length) {
                        zzfe.zzf("Tx3gParser", "Ignoring styl with start (" + iZzq3 + ") >= end (" + length + ").");
                    } else {
                        int i8 = length;
                        zzc(spannableStringBuilder, iZzm, this.zzc, iZzq3, i8, 0);
                        zzb(spannableStringBuilder, iZzg3, this.zzd, iZzq3, i8, 0);
                    }
                    i7++;
                    iZzq2 = i3;
                    i4 = 2;
                    i5 = 1;
                    i6 = 0;
                }
            } else if (iZzg2 == 1952608120 && this.zzb) {
                i4 = 2;
                zzek.zzd(this.zza.zzb() >= 2);
                fMax = Math.max(0.0f, Math.min(this.zza.zzq() / this.zzg, 0.95f));
            } else {
                i4 = 2;
            }
            this.zza.zzK(iZzd3 + iZzg);
            i5 = 1;
            i6 = 0;
        }
    }
}
