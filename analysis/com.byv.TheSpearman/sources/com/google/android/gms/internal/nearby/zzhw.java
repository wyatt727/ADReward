package com.google.android.gms.internal.nearby;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* loaded from: classes3.dex */
public final class zzhw {
    static HashMap<String, String> zze;
    private static Object zzl;
    private static boolean zzm;
    public static final Uri zza = Uri.parse("content://com.google.android.gsf.gservices");
    public static final Uri zzb = Uri.parse("content://com.google.android.gsf.gservices/prefix");
    public static final Pattern zzc = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
    public static final Pattern zzd = Pattern.compile("^(0|false|f|off|no|n)$", 2);
    private static final AtomicBoolean zzk = new AtomicBoolean();
    static final HashMap<String, Boolean> zzf = new HashMap<>();
    static final HashMap<String, Integer> zzg = new HashMap<>();
    static final HashMap<String, Long> zzh = new HashMap<>();
    static final HashMap<String, Float> zzi = new HashMap<>();
    static final String[] zzj = new String[0];

    public static boolean zza(ContentResolver contentResolver, String str, boolean z) {
        Object obj;
        String str2;
        Boolean bool;
        synchronized (zzhw.class) {
            zzc(contentResolver);
            obj = zzl;
        }
        HashMap<String, Boolean> map = zzf;
        boolean z2 = true;
        Boolean bool2 = true;
        synchronized (zzhw.class) {
            str2 = null;
            if (map.containsKey("gms:nearby:requires_gms_check")) {
                bool = map.get("gms:nearby:requires_gms_check");
                if (bool == null) {
                    bool = bool2;
                }
            } else {
                bool = null;
            }
        }
        Boolean bool3 = bool;
        if (bool3 != null) {
            return bool3.booleanValue();
        }
        synchronized (zzhw.class) {
            zzc(contentResolver);
            Object obj2 = zzl;
            if (zze.containsKey("gms:nearby:requires_gms_check")) {
                String str3 = zze.get("gms:nearby:requires_gms_check");
                if (str3 != null) {
                    str2 = str3;
                }
            } else {
                int length = zzj.length;
                Cursor cursorQuery = contentResolver.query(zza, null, null, new String[]{"gms:nearby:requires_gms_check"}, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            String string = cursorQuery.getString(1);
                            if (string != null && string.equals(null)) {
                                string = null;
                            }
                            zzd(obj2, "gms:nearby:requires_gms_check", string);
                            if (string != null) {
                                str2 = string;
                            }
                        } else {
                            zzd(obj2, "gms:nearby:requires_gms_check", null);
                        }
                    } finally {
                        cursorQuery.close();
                    }
                }
            }
        }
        if (str2 == null || str2.equals("")) {
            bool2 = bool3;
        } else if (!zzc.matcher(str2).matches()) {
            if (zzd.matcher(str2).matches()) {
                bool2 = false;
                z2 = false;
            } else {
                Log.w("Gservices", "attempt to read gservices key gms:nearby:requires_gms_check (value \"" + str2 + "\") as boolean");
                bool2 = bool3;
            }
        }
        synchronized (zzhw.class) {
            if (obj == zzl) {
                map.put("gms:nearby:requires_gms_check", bool2);
                zze.remove("gms:nearby:requires_gms_check");
            }
        }
        return z2;
    }

    private static void zzc(ContentResolver contentResolver) {
        if (zze == null) {
            zzk.set(false);
            zze = new HashMap<>();
            zzl = new Object();
            zzm = false;
            contentResolver.registerContentObserver(zza, true, new zzhv(null));
            return;
        }
        if (zzk.getAndSet(false)) {
            zze.clear();
            zzf.clear();
            zzg.clear();
            zzh.clear();
            zzi.clear();
            zzl = new Object();
            zzm = false;
        }
    }

    private static void zzd(Object obj, String str, String str2) {
        synchronized (zzhw.class) {
            if (obj == zzl) {
                zze.put("gms:nearby:requires_gms_check", str2);
            }
        }
    }
}
