package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zziq;
import com.json.t2;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* loaded from: classes3.dex */
public final class zzmy {
    private static final String[] zza = {"GoogleConsent", "gdprApplies", "EnableAdvertiserConsentMode", "PolicyVersion", "PurposeConsents", "CmpSdkID"};
    private final Map<String, String> zzb;

    private final int zzd() {
        try {
            String str = this.zzb.get("CmpSdkID");
            if (TextUtils.isEmpty(str)) {
                return -1;
            }
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    private static int zza(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getInt(str, -1);
        } catch (ClassCastException unused) {
            return -1;
        }
    }

    private final int zze() {
        try {
            String str = this.zzb.get("PolicyVersion");
            if (TextUtils.isEmpty(str)) {
                return -1;
            }
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public final int hashCode() {
        return zzc().hashCode();
    }

    public final Bundle zza() {
        if (!("1".equals(this.zzb.get("GoogleConsent")) && "1".equals(this.zzb.get("gdprApplies")) && "1".equals(this.zzb.get("EnableAdvertiserConsentMode")))) {
            return Bundle.EMPTY;
        }
        int iZze = zze();
        if (iZze < 0) {
            return Bundle.EMPTY;
        }
        String str = this.zzb.get("PurposeConsents");
        if (TextUtils.isEmpty(str)) {
            return Bundle.EMPTY;
        }
        Bundle bundle = new Bundle();
        if (str.length() > 0) {
            bundle.putString(zziq.zza.AD_STORAGE.zze, str.charAt(0) == '1' ? "granted" : "denied");
        }
        if (str.length() > 3) {
            bundle.putString(zziq.zza.AD_PERSONALIZATION.zze, (str.charAt(2) == '1' && str.charAt(3) == '1') ? "granted" : "denied");
        }
        if (str.length() > 6 && iZze >= 4) {
            bundle.putString(zziq.zza.AD_USER_DATA.zze, (str.charAt(0) == '1' && str.charAt(6) == '1') ? "granted" : "denied");
        }
        return bundle;
    }

    public static zzmy zza(SharedPreferences sharedPreferences) {
        HashMap map = new HashMap();
        String strZzb = zzb(sharedPreferences, "IABTCF_VendorConsents");
        if (!"\u0000".equals(strZzb) && strZzb.length() > 754) {
            map.put("GoogleConsent", String.valueOf(strZzb.charAt(754)));
        }
        int iZza = zza(sharedPreferences, "IABTCF_gdprApplies");
        if (iZza != -1) {
            map.put("gdprApplies", String.valueOf(iZza));
        }
        int iZza2 = zza(sharedPreferences, "IABTCF_EnableAdvertiserConsentMode");
        if (iZza2 != -1) {
            map.put("EnableAdvertiserConsentMode", String.valueOf(iZza2));
        }
        int iZza3 = zza(sharedPreferences, "IABTCF_PolicyVersion");
        if (iZza3 != -1) {
            map.put("PolicyVersion", String.valueOf(iZza3));
        }
        String strZzb2 = zzb(sharedPreferences, "IABTCF_PurposeConsents");
        if (!"\u0000".equals(strZzb2)) {
            map.put("PurposeConsents", strZzb2);
        }
        int iZza4 = zza(sharedPreferences, "IABTCF_CmpSdkID");
        if (iZza4 != -1) {
            map.put("CmpSdkID", String.valueOf(iZza4));
        }
        return new zzmy(map);
    }

    private static String zzb(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getString(str, "\u0000");
        } catch (ClassCastException unused) {
            return "\u0000";
        }
    }

    public final String zzb() {
        StringBuilder sb = new StringBuilder();
        sb.append("1");
        int iZzd = zzd();
        if (iZzd >= 0 && iZzd <= 4095) {
            sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt((iZzd >> 6) & 63));
            sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(iZzd & 63));
        } else {
            sb.append("00");
        }
        int iZze = zze();
        if (iZze >= 0 && iZze <= 63) {
            sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(iZze));
        } else {
            sb.append("0");
        }
        Preconditions.checkArgument(true);
        int i = ("1".equals(this.zzb.get("gdprApplies")) ? 2 : 0) | 4;
        if ("1".equals(this.zzb.get("EnableAdvertiserConsentMode"))) {
            i |= 8;
        }
        sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i));
        return sb.toString();
    }

    public static String zza(String str, boolean z) {
        if (!z || str.length() <= 4) {
            return str;
        }
        char[] charArray = str.toCharArray();
        int i = 0;
        int i2 = 1;
        while (true) {
            if (i2 >= 64) {
                break;
            }
            if (charArray[4] == "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i2)) {
                i = i2;
                break;
            }
            i2++;
        }
        charArray[4] = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i | 1);
        return String.valueOf(charArray);
    }

    final String zzc() {
        StringBuilder sb = new StringBuilder();
        for (String str : zza) {
            if (this.zzb.containsKey(str)) {
                if (sb.length() > 0) {
                    sb.append(";");
                }
                sb.append(str);
                sb.append(t2.i.b);
                sb.append(this.zzb.get(str));
            }
        }
        return sb.toString();
    }

    public final String toString() {
        return zzc();
    }

    private zzmy(Map<String, String> map) {
        HashMap map2 = new HashMap();
        this.zzb = map2;
        map2.putAll(map);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzmy) {
            return zzc().equalsIgnoreCase(((zzmy) obj).zzc());
        }
        return false;
    }
}
