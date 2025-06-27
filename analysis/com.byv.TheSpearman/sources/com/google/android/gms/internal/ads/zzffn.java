package com.google.android.gms.internal.ads;

import com.json.t2;
import com.my.tracker.ads.AdFormat;
import java.util.List;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzffn {
    public final String zzA;
    public final zzbzl zzB;
    public final String zzC;
    public final JSONObject zzD;
    public final JSONObject zzE;
    public final String zzF;
    public final String zzG;
    public final String zzH;
    public final String zzI;
    public final String zzJ;
    public final boolean zzK;
    public final boolean zzL;
    public final boolean zzM;
    public final boolean zzN;
    public final boolean zzO;
    public final boolean zzP;
    public final boolean zzQ;
    public final int zzR;
    public final int zzS;
    public final boolean zzT;
    public final boolean zzU;
    public final String zzV;
    public final zzfgl zzW;
    public final boolean zzX;
    public final boolean zzY;
    public final int zzZ;
    public final List zza;
    public final String zzaa;
    public final int zzab;
    public final String zzac;
    public final boolean zzad;
    public final zzbuv zzae;
    public final com.google.android.gms.ads.internal.client.zzs zzaf;
    public final String zzag;
    public final boolean zzah;
    public final JSONObject zzai;
    public final boolean zzaj;
    public final JSONObject zzak;
    public final boolean zzal;
    public final String zzam;
    public final boolean zzan;
    public final String zzao;
    public final String zzap;
    public final String zzaq;
    public final boolean zzar;
    public final int zzas;
    public final String zzat;
    public final List zzau;
    public final int zzb;
    public final List zzc;
    public final List zzd;
    public final List zze;
    public final int zzf;
    public final List zzg;
    public final List zzh;
    public final List zzi;
    public final List zzj;
    public final String zzk;
    public final String zzl;
    public final zzbyc zzm;
    public final List zzn;
    public final List zzo;
    public final List zzp;
    public final List zzq;
    public final int zzr;
    public final List zzs;
    public final zzffs zzt;
    public final List zzu;
    public final List zzv;
    public final JSONObject zzw;
    public final String zzx;
    public final String zzy;
    public final String zzz;

    /* JADX WARN: Removed duplicated region for block: B:234:0x062f A[PHI: r22 r79
      0x062f: PHI (r22v80 java.util.List) = 
      (r22v5 java.util.List)
      (r22v6 java.util.List)
      (r22v7 java.util.List)
      (r22v8 java.util.List)
      (r22v9 java.util.List)
      (r22v10 java.util.List)
      (r22v11 java.util.List)
      (r22v12 java.util.List)
      (r22v13 java.util.List)
      (r22v14 java.util.List)
      (r22v15 java.util.List)
      (r22v16 java.util.List)
      (r22v17 java.util.List)
      (r22v18 java.util.List)
      (r22v19 java.util.List)
      (r22v20 java.util.List)
      (r22v21 java.util.List)
      (r22v22 java.util.List)
      (r22v23 java.util.List)
      (r22v24 java.util.List)
      (r22v25 java.util.List)
      (r22v26 java.util.List)
      (r22v27 java.util.List)
      (r22v28 java.util.List)
      (r22v29 java.util.List)
      (r22v30 java.util.List)
      (r22v31 java.util.List)
      (r22v32 java.util.List)
      (r22v33 java.util.List)
      (r22v34 java.util.List)
      (r22v35 java.util.List)
      (r22v36 java.util.List)
      (r22v37 java.util.List)
      (r22v38 java.util.List)
      (r22v39 java.util.List)
      (r22v40 java.util.List)
      (r22v41 java.util.List)
      (r22v42 java.util.List)
      (r22v43 java.util.List)
      (r22v44 java.util.List)
      (r22v45 java.util.List)
      (r22v46 java.util.List)
      (r22v47 java.util.List)
      (r22v48 java.util.List)
      (r22v49 java.util.List)
      (r22v50 java.util.List)
      (r22v51 java.util.List)
      (r22v52 java.util.List)
      (r22v53 java.util.List)
      (r22v54 java.util.List)
      (r22v55 java.util.List)
      (r22v56 java.util.List)
      (r22v57 java.util.List)
      (r22v58 java.util.List)
      (r22v59 java.util.List)
      (r22v60 java.util.List)
      (r22v61 java.util.List)
      (r22v62 java.util.List)
      (r22v63 java.util.List)
      (r22v64 java.util.List)
      (r22v65 java.util.List)
      (r22v66 java.util.List)
      (r22v67 java.util.List)
      (r22v68 java.util.List)
      (r22v69 java.util.List)
      (r22v70 java.util.List)
      (r22v71 java.util.List)
      (r22v72 java.util.List)
      (r22v73 java.util.List)
      (r22v74 java.util.List)
      (r22v75 java.util.List)
      (r22v76 java.util.List)
      (r22v77 java.util.List)
      (r22v78 java.util.List)
      (r22v81 java.util.List)
     binds: [B:232:0x062a, B:229:0x0619, B:226:0x0608, B:223:0x05f7, B:220:0x05e6, B:217:0x05d5, B:214:0x05c3, B:211:0x05b1, B:208:0x059f, B:205:0x058d, B:202:0x057b, B:199:0x0569, B:196:0x0557, B:193:0x0545, B:190:0x0533, B:187:0x0521, B:184:0x050f, B:181:0x04fd, B:178:0x04eb, B:175:0x04d9, B:172:0x04c7, B:169:0x04b5, B:166:0x04a3, B:163:0x0491, B:160:0x0480, B:157:0x046e, B:154:0x045c, B:151:0x044a, B:148:0x0438, B:145:0x0426, B:142:0x0414, B:139:0x0402, B:136:0x03f1, B:133:0x03df, B:130:0x03cd, B:127:0x03bc, B:124:0x03aa, B:121:0x0398, B:118:0x0386, B:115:0x0374, B:112:0x0362, B:109:0x0350, B:106:0x033e, B:103:0x032c, B:100:0x031a, B:97:0x0308, B:94:0x02f6, B:91:0x02e4, B:88:0x02d2, B:85:0x02c0, B:82:0x02ae, B:79:0x029c, B:76:0x028b, B:73:0x0279, B:70:0x0267, B:67:0x0255, B:64:0x0243, B:61:0x0231, B:58:0x0220, B:55:0x020e, B:52:0x01fc, B:49:0x01ea, B:46:0x01d8, B:43:0x01c6, B:40:0x01b4, B:37:0x01a2, B:34:0x0191, B:31:0x017f, B:28:0x016e, B:25:0x015c, B:22:0x014a, B:19:0x0138, B:16:0x0126, B:13:0x0114, B:11:0x0102] A[DONT_GENERATE, DONT_INLINE]
      0x062f: PHI (r79v76 java.util.List) = 
      (r79v1 java.util.List)
      (r79v2 java.util.List)
      (r79v3 java.util.List)
      (r79v4 java.util.List)
      (r79v5 java.util.List)
      (r79v6 java.util.List)
      (r79v7 java.util.List)
      (r79v8 java.util.List)
      (r79v9 java.util.List)
      (r79v10 java.util.List)
      (r79v11 java.util.List)
      (r79v12 java.util.List)
      (r79v13 java.util.List)
      (r79v14 java.util.List)
      (r79v15 java.util.List)
      (r79v16 java.util.List)
      (r79v17 java.util.List)
      (r79v18 java.util.List)
      (r79v19 java.util.List)
      (r79v20 java.util.List)
      (r79v21 java.util.List)
      (r79v22 java.util.List)
      (r79v23 java.util.List)
      (r79v24 java.util.List)
      (r79v25 java.util.List)
      (r79v26 java.util.List)
      (r79v27 java.util.List)
      (r79v28 java.util.List)
      (r79v29 java.util.List)
      (r79v30 java.util.List)
      (r79v31 java.util.List)
      (r79v32 java.util.List)
      (r79v33 java.util.List)
      (r79v34 java.util.List)
      (r79v35 java.util.List)
      (r79v36 java.util.List)
      (r79v37 java.util.List)
      (r79v38 java.util.List)
      (r79v39 java.util.List)
      (r79v40 java.util.List)
      (r79v41 java.util.List)
      (r79v42 java.util.List)
      (r79v43 java.util.List)
      (r79v44 java.util.List)
      (r79v45 java.util.List)
      (r79v46 java.util.List)
      (r79v47 java.util.List)
      (r79v48 java.util.List)
      (r79v49 java.util.List)
      (r79v50 java.util.List)
      (r79v51 java.util.List)
      (r79v52 java.util.List)
      (r79v53 java.util.List)
      (r79v54 java.util.List)
      (r79v55 java.util.List)
      (r79v56 java.util.List)
      (r79v57 java.util.List)
      (r79v58 java.util.List)
      (r79v59 java.util.List)
      (r79v60 java.util.List)
      (r79v61 java.util.List)
      (r79v62 java.util.List)
      (r79v63 java.util.List)
      (r79v64 java.util.List)
      (r79v65 java.util.List)
      (r79v66 java.util.List)
      (r79v67 java.util.List)
      (r79v68 java.util.List)
      (r79v69 java.util.List)
      (r79v70 java.util.List)
      (r79v71 java.util.List)
      (r79v72 java.util.List)
      (r79v73 java.util.List)
      (r79v74 java.util.List)
      (r79v77 java.util.List)
     binds: [B:232:0x062a, B:229:0x0619, B:226:0x0608, B:223:0x05f7, B:220:0x05e6, B:217:0x05d5, B:214:0x05c3, B:211:0x05b1, B:208:0x059f, B:205:0x058d, B:202:0x057b, B:199:0x0569, B:196:0x0557, B:193:0x0545, B:190:0x0533, B:187:0x0521, B:184:0x050f, B:181:0x04fd, B:178:0x04eb, B:175:0x04d9, B:172:0x04c7, B:169:0x04b5, B:166:0x04a3, B:163:0x0491, B:160:0x0480, B:157:0x046e, B:154:0x045c, B:151:0x044a, B:148:0x0438, B:145:0x0426, B:142:0x0414, B:139:0x0402, B:136:0x03f1, B:133:0x03df, B:130:0x03cd, B:127:0x03bc, B:124:0x03aa, B:121:0x0398, B:118:0x0386, B:115:0x0374, B:112:0x0362, B:109:0x0350, B:106:0x033e, B:103:0x032c, B:100:0x031a, B:97:0x0308, B:94:0x02f6, B:91:0x02e4, B:88:0x02d2, B:85:0x02c0, B:82:0x02ae, B:79:0x029c, B:76:0x028b, B:73:0x0279, B:70:0x0267, B:67:0x0255, B:64:0x0243, B:61:0x0231, B:58:0x0220, B:55:0x020e, B:52:0x01fc, B:49:0x01ea, B:46:0x01d8, B:43:0x01c6, B:40:0x01b4, B:37:0x01a2, B:34:0x0191, B:31:0x017f, B:28:0x016e, B:25:0x015c, B:22:0x014a, B:19:0x0138, B:16:0x0126, B:13:0x0114, B:11:0x0102] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    zzffn(android.util.JsonReader r81) throws java.lang.IllegalStateException, org.json.JSONException, java.io.IOException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 2912
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzffn.<init>(android.util.JsonReader):void");
    }

    public static String zza(int i) {
        switch (i) {
            case 1:
                return "BANNER";
            case 2:
                return "INTERSTITIAL";
            case 3:
                return "NATIVE_EXPRESS";
            case 4:
                return "NATIVE";
            case 5:
                return "REWARDED";
            case 6:
                return "APP_OPEN_AD";
            case 7:
                return "REWARDED_INTERSTITIAL";
            default:
                return "UNKNOWN";
        }
    }

    private static int zzb(String str) {
        if (AdFormat.BANNER.equals(str)) {
            return 1;
        }
        if ("interstitial".equals(str)) {
            return 2;
        }
        if ("native_express".equals(str)) {
            return 3;
        }
        if (AdFormat.NATIVE.equals(str)) {
            return 4;
        }
        if ("rewarded".equals(str)) {
            return 5;
        }
        if ("app_open_ad".equals(str)) {
            return 6;
        }
        return "rewarded_interstitial".equals(str) ? 7 : 0;
    }

    private static int zzc(int i) {
        if (i == 0 || i == 1 || i == 3) {
            return i;
        }
        return 0;
    }

    private static final int zzd(String str) {
        if (t2.h.C.equalsIgnoreCase(str)) {
            return 6;
        }
        return t2.h.D.equalsIgnoreCase(str) ? 7 : -1;
    }
}
