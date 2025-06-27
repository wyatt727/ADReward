package com.google.android.gms.internal.ads;

import android.graphics.Color;
import android.text.TextUtils;
import com.json.t2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzamx {
    public static final Pattern zza = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");
    private static final Pattern zzb = Pattern.compile("(\\S+?):(\\S+)");
    private static final Map zzc;
    private static final Map zzd;

    static {
        HashMap map = new HashMap();
        map.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        zzc = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        zzd = Collections.unmodifiableMap(map2);
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static android.text.SpannedString zza(java.lang.String r17, java.lang.String r18, java.util.List r19) {
        /*
            Method dump skipped, instructions count: 550
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzamx.zza(java.lang.String, java.lang.String, java.util.List):android.text.SpannedString");
    }

    static zzea zzb(String str) {
        zzamw zzamwVar = new zzamw();
        zzh(str, zzamwVar);
        return zzamwVar.zza();
    }

    public static zzamq zzc(zzfo zzfoVar, List list) {
        String strZzy = zzfoVar.zzy(zzfwd.zzc);
        if (strZzy != null) {
            Pattern pattern = zza;
            Matcher matcher = pattern.matcher(strZzy);
            if (matcher.matches()) {
                return zze(null, matcher, zzfoVar, list);
            }
            String strZzy2 = zzfoVar.zzy(zzfwd.zzc);
            if (strZzy2 != null) {
                Matcher matcher2 = pattern.matcher(strZzy2);
                if (matcher2.matches()) {
                    return zze(strZzy.trim(), matcher2, zzfoVar, list);
                }
            }
        }
        return null;
    }

    private static int zzd(List list, String str, zzamu zzamuVar) {
        List listZzf = zzf(list, str, zzamuVar);
        for (int i = 0; i < listZzf.size(); i++) {
            zzamp zzampVar = ((zzamv) listZzf.get(i)).zzb;
            if (zzampVar.zze() != -1) {
                return zzampVar.zze();
            }
        }
        return -1;
    }

    private static zzamq zze(String str, Matcher matcher, zzfo zzfoVar, List list) {
        zzamw zzamwVar = new zzamw();
        try {
            String strGroup = matcher.group(1);
            Objects.requireNonNull(strGroup);
            zzamwVar.zza = zzamz.zzb(strGroup);
            String strGroup2 = matcher.group(2);
            Objects.requireNonNull(strGroup2);
            zzamwVar.zzb = zzamz.zzb(strGroup2);
            String strGroup3 = matcher.group(3);
            Objects.requireNonNull(strGroup3);
            zzh(strGroup3, zzamwVar);
            StringBuilder sb = new StringBuilder();
            String strZzy = zzfoVar.zzy(zzfwd.zzc);
            while (!TextUtils.isEmpty(strZzy)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(strZzy.trim());
                strZzy = zzfoVar.zzy(zzfwd.zzc);
            }
            zzamwVar.zzc = zza(str, sb.toString(), list);
            return new zzamq(zzamwVar.zza().zzp(), zzamwVar.zza, zzamwVar.zzb);
        } catch (NumberFormatException unused) {
            zzfe.zzf("WebvttCueParser", "Skipping cue with bad header: ".concat(String.valueOf(matcher.group())));
            return null;
        }
    }

    private static List zzf(List list, String str, zzamu zzamuVar) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            zzamp zzampVar = (zzamp) list.get(i);
            int iZzf = zzampVar.zzf(str, zzamuVar.zza, zzamuVar.zzd, zzamuVar.zzc);
            if (iZzf > 0) {
                arrayList.add(new zzamv(iZzf, zzampVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void zzg(java.lang.String r18, com.google.android.gms.internal.ads.zzamu r19, java.util.List r20, android.text.SpannableStringBuilder r21, java.util.List r22) {
        /*
            Method dump skipped, instructions count: 576
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzamx.zzg(java.lang.String, com.google.android.gms.internal.ads.zzamu, java.util.List, android.text.SpannableStringBuilder, java.util.List):void");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static void zzh(String str, zzamw zzamwVar) {
        Matcher matcher = zzb.matcher(str);
        while (matcher.find()) {
            int i = 1;
            String strGroup = matcher.group(1);
            Objects.requireNonNull(strGroup);
            int i2 = 2;
            String strGroup2 = matcher.group(2);
            Objects.requireNonNull(strGroup2);
            try {
                char c = 65535;
                if ("line".equals(strGroup)) {
                    int iIndexOf = strGroup2.indexOf(44);
                    if (iIndexOf != -1) {
                        String strSubstring = strGroup2.substring(iIndexOf + 1);
                        switch (strSubstring.hashCode()) {
                            case -1364013995:
                                if (strSubstring.equals("center")) {
                                    c = 1;
                                    break;
                                }
                                break;
                            case -1074341483:
                                if (strSubstring.equals("middle")) {
                                    c = 2;
                                    break;
                                }
                                break;
                            case 100571:
                                if (strSubstring.equals("end")) {
                                    c = 3;
                                    break;
                                }
                                break;
                            case 109757538:
                                if (strSubstring.equals("start")) {
                                    c = 0;
                                    break;
                                }
                                break;
                        }
                        if (c == 0) {
                            i2 = 0;
                        } else if (c == 1 || c == 2) {
                            i2 = 1;
                        } else if (c != 3) {
                            zzfe.zzf("WebvttCueParser", "Invalid anchor value: ".concat(String.valueOf(strSubstring)));
                            i2 = Integer.MIN_VALUE;
                        }
                        zzamwVar.zzg = i2;
                        strGroup2 = strGroup2.substring(0, iIndexOf);
                    }
                    if (strGroup2.endsWith("%")) {
                        zzamwVar.zze = zzamz.zza(strGroup2);
                        zzamwVar.zzf = 0;
                    } else {
                        zzamwVar.zze = Integer.parseInt(strGroup2);
                        zzamwVar.zzf = 1;
                    }
                } else if ("align".equals(strGroup)) {
                    switch (strGroup2.hashCode()) {
                        case -1364013995:
                            if (strGroup2.equals("center")) {
                                c = 2;
                                break;
                            }
                            break;
                        case -1074341483:
                            if (strGroup2.equals("middle")) {
                                c = 3;
                                break;
                            }
                            break;
                        case 100571:
                            if (strGroup2.equals("end")) {
                                c = 4;
                                break;
                            }
                            break;
                        case 3317767:
                            if (strGroup2.equals("left")) {
                                c = 1;
                                break;
                            }
                            break;
                        case 108511772:
                            if (strGroup2.equals("right")) {
                                c = 5;
                                break;
                            }
                            break;
                        case 109757538:
                            if (strGroup2.equals("start")) {
                                c = 0;
                                break;
                            }
                            break;
                    }
                    if (c != 0) {
                        if (c == 1) {
                            i = 4;
                        } else if (c == 2 || c == 3) {
                            i = 2;
                        } else if (c != 4) {
                            i = 5;
                            if (c != 5) {
                                zzfe.zzf("WebvttCueParser", "Invalid alignment value: ".concat(strGroup2));
                                i = 2;
                            }
                        } else {
                            i = 3;
                        }
                    }
                    zzamwVar.zzd = i;
                } else if (t2.h.L.equals(strGroup)) {
                    int iIndexOf2 = strGroup2.indexOf(44);
                    if (iIndexOf2 != -1) {
                        String strSubstring2 = strGroup2.substring(iIndexOf2 + 1);
                        switch (strSubstring2.hashCode()) {
                            case -1842484672:
                                if (strSubstring2.equals("line-left")) {
                                    c = 0;
                                    break;
                                }
                                break;
                            case -1364013995:
                                if (strSubstring2.equals("center")) {
                                    c = 2;
                                    break;
                                }
                                break;
                            case -1276788989:
                                if (strSubstring2.equals("line-right")) {
                                    c = 4;
                                    break;
                                }
                                break;
                            case -1074341483:
                                if (strSubstring2.equals("middle")) {
                                    c = 3;
                                    break;
                                }
                                break;
                            case 100571:
                                if (strSubstring2.equals("end")) {
                                    c = 5;
                                    break;
                                }
                                break;
                            case 109757538:
                                if (strSubstring2.equals("start")) {
                                    c = 1;
                                    break;
                                }
                                break;
                        }
                        if (c == 0 || c == 1) {
                            i = 0;
                        } else if (c != 2 && c != 3) {
                            if (c == 4 || c == 5) {
                                i = 2;
                            } else {
                                zzfe.zzf("WebvttCueParser", "Invalid anchor value: ".concat(String.valueOf(strSubstring2)));
                                i = Integer.MIN_VALUE;
                            }
                        }
                        zzamwVar.zzi = i;
                        strGroup2 = strGroup2.substring(0, iIndexOf2);
                    }
                    zzamwVar.zzh = zzamz.zza(strGroup2);
                } else if ("size".equals(strGroup)) {
                    zzamwVar.zzj = zzamz.zza(strGroup2);
                } else if ("vertical".equals(strGroup)) {
                    int iHashCode = strGroup2.hashCode();
                    if (iHashCode != 3462) {
                        if (iHashCode == 3642 && strGroup2.equals("rl")) {
                            c = 0;
                        }
                    } else if (strGroup2.equals("lr")) {
                        c = 1;
                    }
                    if (c != 0) {
                        if (c != 1) {
                            zzfe.zzf("WebvttCueParser", "Invalid 'vertical' value: ".concat(strGroup2));
                            i = Integer.MIN_VALUE;
                        } else {
                            i = 2;
                        }
                    }
                    zzamwVar.zzk = i;
                } else {
                    zzfe.zzf("WebvttCueParser", "Unknown cue setting " + strGroup + ":" + strGroup2);
                }
            } catch (NumberFormatException unused) {
                zzfe.zzf("WebvttCueParser", "Skipping bad cue setting: ".concat(String.valueOf(matcher.group())));
            }
        }
    }
}
