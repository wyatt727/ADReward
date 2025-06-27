package com.google.android.gms.internal.ads;

import android.app.UiModeManager;
import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.AudioFormat;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.json.t2;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.my.target.ads.Reward;
import com.unity3d.services.ads.gmascar.utils.ScarConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Pattern;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.signature.SignatureVisitor;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzfx {
    public static final int zza;
    public static final String zzb;
    public static final String zzc;
    public static final String zzd;
    public static final String zze;
    public static final byte[] zzf;
    private static final Pattern zzg;
    private static final Pattern zzh;
    private static final Pattern zzi;
    private static final Pattern zzj;
    private static HashMap zzk;
    private static final String[] zzl;
    private static final String[] zzm;
    private static final int[] zzn;
    private static final int[] zzo;
    private static final int[] zzp;

    static {
        int i = Build.VERSION.SDK_INT;
        zza = i;
        String str = Build.DEVICE;
        zzb = str;
        String str2 = Build.MANUFACTURER;
        zzc = str2;
        String str3 = Build.MODEL;
        zzd = str3;
        zze = str + ", " + str3 + ", " + str2 + ", " + i;
        zzf = new byte[0];
        zzg = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        zzh = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        zzi = Pattern.compile("%([A-Fa-f0-9]{2})");
        zzj = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        zzl = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_ERROR, "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", ScarConstants.IN_SIGNAL_KEY, "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        zzm = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        zzn = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        zzo = new int[]{0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935};
        zzp = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, 214, 209, 196, Opcodes.MONITOREXIT, 202, 205, Opcodes.D2F, Opcodes.DCMPL, 158, 153, 140, Opcodes.F2I, 130, 133, Opcodes.JSR, Opcodes.DRETURN, Opcodes.IF_ACMPNE, Opcodes.IF_ICMPLT, Opcodes.GETFIELD, Opcodes.PUTSTATIC, Opcodes.INVOKEDYNAMIC, 189, Opcodes.IFNONNULL, 192, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, Opcodes.INVOKESPECIAL, Opcodes.ARETURN, Opcodes.INVOKEINTERFACE, Opcodes.ARRAYLENGTH, Opcodes.LOOKUPSWITCH, 172, Opcodes.IF_ACMPEQ, Opcodes.IF_ICMPGE, Opcodes.D2L, 136, 129, 134, Opcodes.I2S, Opcodes.LCMP, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, Opcodes.D2I, 135, 128, Opcodes.FCMPL, Opcodes.I2C, 155, 156, Opcodes.RETURN, Opcodes.INVOKEVIRTUAL, Opcodes.ATHROW, Opcodes.INVOKESTATIC, Opcodes.LRETURN, Opcodes.TABLESWITCH, Opcodes.IF_ICMPGT, Opcodes.IF_ICMPLE, 249, 254, 247, 240, 229, 226, 235, 236, Opcodes.INSTANCEOF, Opcodes.IFNULL, 207, 200, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, Opcodes.FRETURN, Opcodes.RET, Opcodes.IF_ICMPNE, Opcodes.GOTO, Opcodes.GETSTATIC, Opcodes.PUTFIELD, 188, Opcodes.NEW, 150, Opcodes.I2B, Opcodes.DCMPG, Opcodes.IF_ICMPEQ, 138, Opcodes.F2D, 132, 131, 222, 217, 208, 215, Opcodes.MONITORENTER, Opcodes.MULTIANEWARRAY, 204, 203, 230, 225, 232, 239, 250, 253, 244, 243};
    }

    public static String zzA(byte[] bArr) {
        return new String(bArr, zzfwd.zzc);
    }

    public static String zzB(byte[] bArr, int i, int i2) {
        return new String(bArr, i, i2, zzfwd.zzc);
    }

    public static String zzC(int i) {
        switch (i) {
            case -2:
                return "none";
            case -1:
                return "unknown";
            case 0:
                return Reward.DEFAULT;
            case 1:
                return "audio";
            case 2:
                return "video";
            case 3:
                return "text";
            case 4:
                return "image";
            case 5:
                return "metadata";
            default:
                return "camera motion";
        }
    }

    public static String zzD(String str) {
        if (str == null) {
            return null;
        }
        String strReplace = str.replace('_', SignatureVisitor.SUPER);
        if (!strReplace.isEmpty() && !strReplace.equals("und")) {
            str = strReplace;
        }
        String strZza = zzfvx.zza(str);
        int i = 0;
        String str2 = strZza.split("-", 2)[0];
        if (zzk == null) {
            zzk = zzS();
        }
        String str3 = (String) zzk.get(str2);
        if (str3 != null) {
            strZza = str3.concat(String.valueOf(strZza.substring(str2.length())));
            str2 = str3;
        }
        if (!"no".equals(str2) && !CmcdHeadersFactory.OBJECT_TYPE_INIT_SEGMENT.equals(str2) && !"zh".equals(str2)) {
            return strZza;
        }
        while (true) {
            String[] strArr = zzm;
            int length = strArr.length;
            if (i >= 18) {
                return strZza;
            }
            if (strZza.startsWith(strArr[i])) {
                return String.valueOf(strArr[i + 1]).concat(String.valueOf(strZza.substring(strArr[i].length())));
            }
            i += 2;
        }
    }

    public static ExecutorService zzE(final String str) {
        return Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: com.google.android.gms.internal.ads.zzfw
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return new Thread(runnable, str);
            }
        });
    }

    public static boolean zzG(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static boolean zzH(SparseArray sparseArray, int i) {
        return sparseArray.indexOfKey(i) >= 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0045, code lost:
    
        r4.zzJ(r3);
        r1 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean zzI(com.google.android.gms.internal.ads.zzfo r3, com.google.android.gms.internal.ads.zzfo r4, java.util.zip.Inflater r5) {
        /*
            int r0 = r3.zzb()
            r1 = 0
            if (r0 > 0) goto L8
            return r1
        L8:
            int r0 = r4.zzc()
            int r2 = r3.zzb()
            if (r0 >= r2) goto L1a
            int r0 = r3.zzb()
            int r0 = r0 + r0
            r4.zzE(r0)
        L1a:
            if (r5 != 0) goto L21
            java.util.zip.Inflater r5 = new java.util.zip.Inflater
            r5.<init>()
        L21:
            byte[] r0 = r3.zzM()
            int r2 = r3.zzd()
            int r3 = r3.zzb()
            r5.setInput(r0, r2, r3)
            r3 = r1
        L31:
            byte[] r0 = r4.zzM()     // Catch: java.lang.Throwable -> L66 java.util.zip.DataFormatException -> L6b
            int r2 = r4.zzc()     // Catch: java.lang.Throwable -> L66 java.util.zip.DataFormatException -> L6b
            int r2 = r2 - r3
            int r0 = r5.inflate(r0, r3, r2)     // Catch: java.lang.Throwable -> L66 java.util.zip.DataFormatException -> L6b
            int r3 = r3 + r0
            boolean r0 = r5.finished()     // Catch: java.lang.Throwable -> L66 java.util.zip.DataFormatException -> L6b
            if (r0 == 0) goto L4a
            r4.zzJ(r3)     // Catch: java.lang.Throwable -> L66 java.util.zip.DataFormatException -> L6b
            r1 = 1
            goto L6b
        L4a:
            boolean r0 = r5.needsDictionary()     // Catch: java.lang.Throwable -> L66 java.util.zip.DataFormatException -> L6b
            if (r0 != 0) goto L6b
            boolean r0 = r5.needsInput()     // Catch: java.lang.Throwable -> L66 java.util.zip.DataFormatException -> L6b
            if (r0 == 0) goto L57
            goto L6b
        L57:
            int r0 = r4.zzc()     // Catch: java.lang.Throwable -> L66 java.util.zip.DataFormatException -> L6b
            if (r3 != r0) goto L31
            int r0 = r4.zzc()     // Catch: java.lang.Throwable -> L66 java.util.zip.DataFormatException -> L6b
            int r0 = r0 + r0
            r4.zzE(r0)     // Catch: java.lang.Throwable -> L66 java.util.zip.DataFormatException -> L6b
            goto L31
        L66:
            r3 = move-exception
            r5.reset()
            throw r3
        L6b:
            r5.reset()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfx.zzI(com.google.android.gms.internal.ads.zzfo, com.google.android.gms.internal.ads.zzfo, java.util.zip.Inflater):boolean");
    }

    public static boolean zzJ(Context context) {
        return zza >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive");
    }

    public static boolean zzK(int i) {
        return i == 3 || i == 2 || i == 268435456 || i == 21 || i == 1342177280 || i == 22 || i == 1610612736 || i == 4;
    }

    public static boolean zzL(int i) {
        return i == 10 || i == 13;
    }

    public static boolean zzM(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static boolean zzN(Handler handler, Runnable runnable) {
        if (!handler.getLooper().getThread().isAlive()) {
            return false;
        }
        if (handler.getLooper() != Looper.myLooper()) {
            return handler.post(runnable);
        }
        runnable.run();
        return true;
    }

    public static Object[] zzO(Object[] objArr, int i) {
        zzek.zzd(i <= objArr.length);
        return Arrays.copyOf(objArr, i);
    }

    private static int zzP(int i, int i2) {
        return (char) (zzo[i ^ (i2 >> 12)] ^ ((char) (i2 << 4)));
    }

    private static long zzQ(long j, long j2, long j3, RoundingMode roundingMode) {
        long jZzc = zzgcf.zzc(j, j2);
        if (jZzc != Long.MAX_VALUE && jZzc != Long.MIN_VALUE) {
            return zzgcf.zza(jZzc, j3, roundingMode);
        }
        long jZzb = zzgcf.zzb(Math.abs(j2), Math.abs(j3));
        long jZza = zzgcf.zza(j2, jZzb, RoundingMode.UNNECESSARY);
        long jZza2 = zzgcf.zza(j3, jZzb, RoundingMode.UNNECESSARY);
        long jZzb2 = zzgcf.zzb(Math.abs(j), Math.abs(jZza2));
        long jZza3 = zzgcf.zza(j, jZzb2, RoundingMode.UNNECESSARY);
        long jZza4 = zzgcf.zza(jZza2, jZzb2, RoundingMode.UNNECESSARY);
        long jZzc2 = zzgcf.zzc(jZza3, jZza);
        if (jZzc2 != Long.MAX_VALUE && jZzc2 != Long.MIN_VALUE) {
            return zzgcf.zza(jZzc2, jZza4, roundingMode);
        }
        double d = jZza3 * (jZza / jZza4);
        if (d > 9.223372036854776E18d) {
            return Long.MAX_VALUE;
        }
        if (d < -9.223372036854776E18d) {
            return Long.MIN_VALUE;
        }
        return zzgca.zza(d, roundingMode);
    }

    private static String zzR(String str) throws ClassNotFoundException {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e) {
            zzfe.zzd("Util", "Failed to read system property ".concat(str), e);
            return null;
        }
    }

    private static HashMap zzS() throws MissingResourceException {
        String[] iSOLanguages = Locale.getISOLanguages();
        int length = iSOLanguages.length;
        int length2 = zzl.length;
        HashMap map = new HashMap(length + 88);
        int i = 0;
        for (String str : iSOLanguages) {
            try {
                String iSO3Language = new Locale(str).getISO3Language();
                if (!TextUtils.isEmpty(iSO3Language)) {
                    map.put(iSO3Language, str);
                }
            } catch (MissingResourceException unused) {
            }
        }
        while (true) {
            String[] strArr = zzl;
            int length3 = strArr.length;
            if (i >= 88) {
                return map;
            }
            map.put(strArr[i], strArr[i + 1]);
            i += 2;
        }
    }

    public static int zza(long[] jArr, long j, boolean z, boolean z2) {
        int iBinarySearch = Arrays.binarySearch(jArr, j);
        if (iBinarySearch < 0) {
            return ~iBinarySearch;
        }
        do {
            iBinarySearch++;
            if (iBinarySearch >= jArr.length) {
                break;
            }
        } while (jArr[iBinarySearch] == j);
        return !z ? iBinarySearch : iBinarySearch - 1;
    }

    public static int zzb(int[] iArr, int i, boolean z, boolean z2) {
        int i2;
        int iBinarySearch = Arrays.binarySearch(iArr, i);
        if (iBinarySearch < 0) {
            i2 = -(iBinarySearch + 2);
        } else {
            do {
                iBinarySearch--;
                if (iBinarySearch < 0) {
                    break;
                }
            } while (iArr[iBinarySearch] == i);
            i2 = z ? iBinarySearch + 1 : iBinarySearch;
        }
        return z2 ? Math.max(0, i2) : i2;
    }

    public static int zzc(long[] jArr, long j, boolean z, boolean z2) {
        int i;
        int iBinarySearch = Arrays.binarySearch(jArr, j);
        if (iBinarySearch < 0) {
            i = -(iBinarySearch + 2);
        } else {
            do {
                iBinarySearch--;
                if (iBinarySearch < 0) {
                    break;
                }
            } while (jArr[iBinarySearch] == j);
            i = iBinarySearch + 1;
        }
        return z2 ? Math.max(0, i) : i;
    }

    public static int zzd(byte[] bArr, int i, int i2, int i3) {
        int iZzP = 65535;
        for (int i4 = 0; i4 < i2; i4++) {
            int i5 = bArr[i4] & 255;
            iZzP = zzP(i5 & 15, zzP(i5 >> 4, iZzP));
        }
        return iZzP;
    }

    public static int zze(byte[] bArr, int i, int i2, int i3) {
        while (i < i2) {
            i3 = zzn[(i3 >>> 24) ^ (bArr[i] & 255)] ^ (i3 << 8);
            i++;
        }
        return i3;
    }

    public static int zzf(byte[] bArr, int i, int i2, int i3) {
        int i4 = 0;
        while (i < i2) {
            i4 = zzp[i4 ^ (bArr[i] & 255)];
            i++;
        }
        return i4;
    }

    public static int zzg(int i) {
        if (i == 20) {
            return 30;
        }
        if (i == 22) {
            return 31;
        }
        if (i == 30) {
            return 34;
        }
        switch (i) {
            case 2:
            case 3:
                return 3;
            case 4:
            case 5:
            case 6:
                return 21;
            case 7:
            case 8:
                return 23;
            case 9:
            case 10:
            case 11:
            case 12:
                return 28;
            default:
                switch (i) {
                    case 14:
                        return 25;
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                        return 28;
                    default:
                        return Integer.MAX_VALUE;
                }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0015 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int zzh(int r2) {
        /*
            r0 = 6396(0x18fc, float:8.963E-42)
            switch(r2) {
                case 1: goto L28;
                case 2: goto L25;
                case 3: goto L22;
                case 4: goto L1f;
                case 5: goto L1c;
                case 6: goto L19;
                case 7: goto L16;
                case 8: goto L15;
                case 9: goto L5;
                case 10: goto Lb;
                case 11: goto L5;
                case 12: goto L7;
                default: goto L5;
            }
        L5:
            r2 = 0
            return r2
        L7:
            r2 = 743676(0xb58fc, float:1.042112E-39)
            return r2
        Lb:
            int r2 = com.google.android.gms.internal.ads.zzfx.zza
            r1 = 32
            if (r2 < r1) goto L15
            r2 = 737532(0xb40fc, float:1.033502E-39)
            return r2
        L15:
            return r0
        L16:
            r2 = 1276(0x4fc, float:1.788E-42)
            return r2
        L19:
            r2 = 252(0xfc, float:3.53E-43)
            return r2
        L1c:
            r2 = 220(0xdc, float:3.08E-43)
            return r2
        L1f:
            r2 = 204(0xcc, float:2.86E-43)
            return r2
        L22:
            r2 = 28
            return r2
        L25:
            r2 = 12
            return r2
        L28:
            r2 = 4
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfx.zzh(int):int");
    }

    public static int zzi(ByteBuffer byteBuffer, int i) {
        int i2 = byteBuffer.getInt(i);
        return byteBuffer.order() == ByteOrder.BIG_ENDIAN ? i2 : Integer.reverseBytes(i2);
    }

    public static int zzj(int i) {
        if (i == 2 || i == 4) {
            return PlaybackException.ERROR_CODE_DRM_DISALLOWED_OPERATION;
        }
        if (i == 10) {
            return 6004;
        }
        if (i == 7) {
            return PlaybackException.ERROR_CODE_DRM_DISALLOWED_OPERATION;
        }
        if (i == 8) {
            return 6003;
        }
        switch (i) {
            case 15:
                return 6003;
            case 16:
            case 18:
                return PlaybackException.ERROR_CODE_DRM_DISALLOWED_OPERATION;
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                return 6004;
            default:
                switch (i) {
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        return 6002;
                    default:
                        return PlaybackException.ERROR_CODE_DRM_SYSTEM_ERROR;
                }
        }
    }

    public static int zzk(String str) throws NumberFormatException {
        String[] strArrSplit;
        int length;
        int i = 0;
        if (str == null || (length = (strArrSplit = str.split("_", -1)).length) < 2) {
            return 0;
        }
        String str2 = strArrSplit[length - 1];
        boolean z = length >= 3 && "neg".equals(strArrSplit[length + (-2)]);
        Objects.requireNonNull(str2);
        try {
            i = Integer.parseInt(str2);
            if (z) {
                return -i;
            }
        } catch (NumberFormatException unused) {
        }
        return i;
    }

    public static int zzl(int i) {
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 2;
        }
        if (i != 24) {
            return i != 32 ? 0 : 22;
        }
        return 21;
    }

    public static int zzm(int i, int i2) {
        if (i != 2) {
            if (i == 3) {
                return i2;
            }
            if (i != 4) {
                if (i != 21) {
                    if (i != 22) {
                        if (i != 268435456) {
                            if (i != 1342177280) {
                                if (i != 1610612736) {
                                    throw new IllegalArgumentException();
                                }
                            }
                        }
                    }
                }
                return i2 * 3;
            }
            return i2 * 4;
        }
        return i2 + i2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int zzn(android.net.Uri r7) {
        /*
            java.lang.String r0 = r7.getScheme()
            r1 = 3
            if (r0 == 0) goto L11
            java.lang.String r2 = "rtsp"
            boolean r0 = com.google.android.gms.internal.ads.zzfvx.zzc(r2, r0)
            if (r0 != 0) goto L10
            goto L11
        L10:
            return r1
        L11:
            java.lang.String r0 = r7.getLastPathSegment()
            r2 = 4
            if (r0 != 0) goto L19
            return r2
        L19:
            r3 = 46
            int r3 = r0.lastIndexOf(r3)
            r4 = 0
            r5 = 2
            r6 = 1
            if (r3 < 0) goto L71
            int r3 = r3 + r6
            java.lang.String r0 = r0.substring(r3)
            java.lang.String r0 = com.google.android.gms.internal.ads.zzfvx.zza(r0)
            int r3 = r0.hashCode()
            switch(r3) {
                case 104579: goto L53;
                case 108321: goto L49;
                case 3242057: goto L3f;
                case 3299913: goto L35;
                default: goto L34;
            }
        L34:
            goto L5d
        L35:
            java.lang.String r3 = "m3u8"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L5d
            r0 = r6
            goto L5e
        L3f:
            java.lang.String r3 = "isml"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L5d
            r0 = r1
            goto L5e
        L49:
            java.lang.String r3 = "mpd"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L5d
            r0 = r4
            goto L5e
        L53:
            java.lang.String r3 = "ism"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L5d
            r0 = r5
            goto L5e
        L5d:
            r0 = -1
        L5e:
            if (r0 == 0) goto L6c
            if (r0 == r6) goto L6a
            if (r0 == r5) goto L68
            if (r0 == r1) goto L68
            r0 = r2
            goto L6d
        L68:
            r0 = r6
            goto L6d
        L6a:
            r0 = r5
            goto L6d
        L6c:
            r0 = r4
        L6d:
            if (r0 != r2) goto L70
            goto L71
        L70:
            return r0
        L71:
            java.util.regex.Pattern r0 = com.google.android.gms.internal.ads.zzfx.zzj
            java.lang.String r7 = r7.getPath()
            java.util.Objects.requireNonNull(r7)
            java.util.regex.Matcher r7 = r0.matcher(r7)
            boolean r0 = r7.matches()
            if (r0 == 0) goto L9d
            java.lang.String r7 = r7.group(r5)
            if (r7 == 0) goto L9c
            java.lang.String r0 = "format=mpd-time-csf"
            boolean r0 = r7.contains(r0)
            if (r0 == 0) goto L93
            return r4
        L93:
            java.lang.String r0 = "format=m3u8-aapl"
            boolean r7 = r7.contains(r0)
            if (r7 == 0) goto L9c
            return r5
        L9c:
            return r6
        L9d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfx.zzn(android.net.Uri):int");
    }

    public static long zzo(long j, int i) {
        return zzt(j, i, 1000000L, RoundingMode.CEILING);
    }

    public static long zzp(long j, float f) {
        return f == 1.0f ? j : Math.round(j * f);
    }

    public static long zzq(long j, float f) {
        return f == 1.0f ? j : Math.round(j / f);
    }

    public static long zzr(long j) {
        return (j == -9223372036854775807L || j == Long.MIN_VALUE) ? j : j * 1000;
    }

    public static long zzs(long j, int i) {
        return zzt(j, 1000000L, i, RoundingMode.FLOOR);
    }

    public static long zzt(long j, long j2, long j3, RoundingMode roundingMode) {
        if (j == 0 || j2 == 0) {
            return 0L;
        }
        return (j3 < j2 || j3 % j2 != 0) ? (j3 >= j2 || j2 % j3 != 0) ? (j3 < j || j3 % j != 0) ? (j3 >= j || j % j3 != 0) ? zzQ(j, j2, j3, roundingMode) : zzgcf.zzc(j2, zzgcf.zza(j, j3, RoundingMode.UNNECESSARY)) : zzgcf.zza(j2, zzgcf.zza(j3, j, RoundingMode.UNNECESSARY), roundingMode) : zzgcf.zzc(j, zzgcf.zza(j2, j3, RoundingMode.UNNECESSARY)) : zzgcf.zza(j, zzgcf.zza(j3, j2, RoundingMode.UNNECESSARY), roundingMode);
    }

    public static long zzu(long j) {
        return (j == -9223372036854775807L || j == Long.MIN_VALUE) ? j : j / 1000;
    }

    public static Point zzv(Context context) throws NumberFormatException {
        DisplayManager displayManager = (DisplayManager) context.getSystemService(t2.h.d);
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            Objects.requireNonNull(windowManager);
            display = windowManager.getDefaultDisplay();
        }
        if (display.getDisplayId() == 0 && zzM(context)) {
            String strZzR = zza < 28 ? zzR("sys.display-size") : zzR("vendor.display-size");
            if (!TextUtils.isEmpty(strZzR)) {
                try {
                    String[] strArrSplit = strZzR.trim().split("x", -1);
                    if (strArrSplit.length == 2) {
                        int i = Integer.parseInt(strArrSplit[0]);
                        int i2 = Integer.parseInt(strArrSplit[1]);
                        if (i > 0 && i2 > 0) {
                            return new Point(i, i2);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                zzfe.zzc("Util", "Invalid display size: ".concat(String.valueOf(strZzR)));
            }
            if ("Sony".equals(zzc) && zzd.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
        }
        Point point = new Point();
        if (zza < 23) {
            display.getRealSize(point);
            return point;
        }
        Display.Mode mode = display.getMode();
        point.x = mode.getPhysicalWidth();
        point.y = mode.getPhysicalHeight();
        return point;
    }

    public static AudioFormat zzw(int i, int i2, int i3) {
        return new AudioFormat.Builder().setSampleRate(i).setChannelMask(i2).setEncoding(i3).build();
    }

    public static Handler zzx(Handler.Callback callback) {
        Looper looperMyLooper = Looper.myLooper();
        zzek.zzb(looperMyLooper);
        return new Handler(looperMyLooper, null);
    }

    public static Looper zzy() {
        Looper looperMyLooper = Looper.myLooper();
        return looperMyLooper != null ? looperMyLooper : Looper.getMainLooper();
    }

    public static zzam zzz(int i, int i2, int i3) {
        zzak zzakVar = new zzak();
        zzakVar.zzW("audio/raw");
        zzakVar.zzy(i2);
        zzakVar.zzX(i3);
        zzakVar.zzQ(i);
        return zzakVar.zzac();
    }

    public static void zzF(long[] jArr, long j, long j2) {
        RoundingMode roundingMode = RoundingMode.FLOOR;
        int i = 0;
        if (j2 >= 1000000 && j2 % 1000000 == 0) {
            long jZza = zzgcf.zza(j2, 1000000L, RoundingMode.UNNECESSARY);
            while (i < jArr.length) {
                jArr[i] = zzgcf.zza(jArr[i], jZza, roundingMode);
                i++;
            }
            return;
        }
        if (j2 < 1000000 && 1000000 % j2 == 0) {
            long jZza2 = zzgcf.zza(1000000L, j2, RoundingMode.UNNECESSARY);
            while (i < jArr.length) {
                jArr[i] = zzgcf.zzc(jArr[i], jZza2);
                i++;
            }
            return;
        }
        for (int i2 = 0; i2 < jArr.length; i2++) {
            long j3 = jArr[i2];
            if (j3 != 0) {
                if (j2 >= j3 && j2 % j3 == 0) {
                    jArr[i2] = zzgcf.zza(1000000L, zzgcf.zza(j2, j3, RoundingMode.UNNECESSARY), roundingMode);
                } else if (j2 >= j3 || j3 % j2 != 0) {
                    jArr[i2] = zzQ(j3, 1000000L, j2, roundingMode);
                } else {
                    jArr[i2] = zzgcf.zzc(1000000L, zzgcf.zza(j3, j2, RoundingMode.UNNECESSARY));
                }
            }
        }
    }
}
