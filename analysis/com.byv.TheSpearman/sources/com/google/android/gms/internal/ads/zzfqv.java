package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.json.mediationsdk.utils.IronSourceConstants;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashSet;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzfqv {
    public static boolean zza(zzazh zzazhVar) {
        zzazh zzazhVar2 = zzazh.UNSUPPORTED;
        int iOrdinal = zzazhVar.ordinal();
        return iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 4 || iOrdinal == 5;
    }

    public static final zzazh zzb(Context context, zzfpp zzfppVar) {
        zzazh zzazhVar;
        FileInputStream fileInputStream;
        byte[] bArr;
        File file = new File(new File(context.getApplicationInfo().dataDir), "lib");
        if (file.exists()) {
            File[] fileArrListFiles = file.listFiles(new zzgby(Pattern.compile(".*\\.so$", 2)));
            if (fileArrListFiles == null || fileArrListFiles.length == 0) {
                zzfppVar.zzb(5017, "No .so");
                zzazhVar = zzazh.UNKNOWN;
            } else {
                try {
                    fileInputStream = new FileInputStream(fileArrListFiles[0]);
                    try {
                        bArr = new byte[20];
                    } finally {
                    }
                } catch (IOException e) {
                    zzd(null, e.toString(), context, zzfppVar);
                }
                if (fileInputStream.read(bArr) == 20) {
                    byte[] bArr2 = {0, 0};
                    if (bArr[5] == 2) {
                        zzd(bArr, null, context, zzfppVar);
                        zzazhVar = zzazh.UNSUPPORTED;
                    } else {
                        bArr2[0] = bArr[19];
                        bArr2[1] = bArr[18];
                        short s = ByteBuffer.wrap(bArr2).getShort();
                        if (s == 3) {
                            zzazhVar = zzazh.X86;
                        } else if (s == 40) {
                            zzazhVar = zzazh.ARM7;
                        } else if (s == 62) {
                            zzazhVar = zzazh.X86_64;
                        } else if (s == 183) {
                            zzazhVar = zzazh.ARM64;
                        } else if (s != 243) {
                            zzd(bArr, null, context, zzfppVar);
                            zzazhVar = zzazh.UNSUPPORTED;
                        } else {
                            zzazhVar = zzazh.RISCV64;
                        }
                    }
                    fileInputStream.close();
                } else {
                    fileInputStream.close();
                    zzazhVar = zzazh.UNSUPPORTED;
                }
            }
        } else {
            zzfppVar.zzb(5017, "No lib/");
            zzazhVar = zzazh.UNKNOWN;
        }
        if (zzazhVar == zzazh.UNKNOWN) {
            String strZzc = zzc(context, zzfppVar);
            if (TextUtils.isEmpty(strZzc)) {
                zzd(null, "Empty dev arch", context, zzfppVar);
                zzazhVar = zzazh.UNSUPPORTED;
            } else if (strZzc.equalsIgnoreCase("i686") || strZzc.equalsIgnoreCase("x86")) {
                zzazhVar = zzazh.X86;
            } else if (strZzc.equalsIgnoreCase("x86_64")) {
                zzazhVar = zzazh.X86_64;
            } else if (strZzc.equalsIgnoreCase("arm64-v8a")) {
                zzazhVar = zzazh.ARM64;
            } else if (strZzc.equalsIgnoreCase("armeabi-v7a") || strZzc.equalsIgnoreCase("armv71")) {
                zzazhVar = zzazh.ARM7;
            } else if (strZzc.equalsIgnoreCase("riscv64")) {
                zzazhVar = zzazh.RISCV64;
            } else {
                zzd(null, strZzc, context, zzfppVar);
                zzazhVar = zzazh.UNSUPPORTED;
            }
        }
        zzfppVar.zzb(5018, zzazhVar.name());
        return zzazhVar;
    }

    private static final String zzc(Context context, zzfpp zzfppVar) {
        HashSet hashSet = new HashSet(Arrays.asList("i686", "armv71"));
        String strZza = zzfxf.OS_ARCH.zza();
        if (!TextUtils.isEmpty(strZza) && hashSet.contains(strZza)) {
            return strZza;
        }
        try {
            String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
            if (strArr != null && strArr.length > 0) {
                return strArr[0];
            }
        } catch (IllegalAccessException e) {
            zzfppVar.zzc(2024, 0L, e);
        } catch (NoSuchFieldException e2) {
            zzfppVar.zzc(2024, 0L, e2);
        }
        return Build.CPU_ABI != null ? Build.CPU_ABI : Build.CPU_ABI2;
    }

    private static final void zzd(byte[] bArr, String str, Context context, zzfpp zzfppVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("os.arch:");
        sb.append(zzfxf.OS_ARCH.zza());
        sb.append(";");
        try {
            String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
            if (strArr != null) {
                sb.append("supported_abis:");
                sb.append(Arrays.toString(strArr));
                sb.append(";");
            }
        } catch (IllegalAccessException | NoSuchFieldException unused) {
        }
        sb.append("CPU_ABI:");
        sb.append(Build.CPU_ABI);
        sb.append(";CPU_ABI2:");
        sb.append(Build.CPU_ABI2);
        sb.append(";");
        if (bArr != null) {
            sb.append("ELF:");
            sb.append(Arrays.toString(bArr));
            sb.append(";");
        }
        if (str != null) {
            sb.append("dbg:");
            sb.append(str);
            sb.append(";");
        }
        zzfppVar.zzb(IronSourceConstants.NT_INSTANCE_UNEXPECTED_LOAD_SUCCESS, sb.toString());
    }
}
