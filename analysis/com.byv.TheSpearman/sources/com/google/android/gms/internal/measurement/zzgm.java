package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.Cursor;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* loaded from: classes3.dex */
public final class zzgm implements zzgo {
    @Override // com.google.android.gms.internal.measurement.zzgo
    public final String zza(ContentResolver contentResolver, String str) throws zzgr {
        Cursor cursorQuery = contentResolver.query(zzgg.zza, null, null, new String[]{str}, null);
        try {
            if (cursorQuery == null) {
                throw new zzgr("Failed to connect to GservicesProvider");
            }
            if (cursorQuery.moveToFirst()) {
                String string = cursorQuery.getString(1);
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return string;
            }
            if (cursorQuery == null) {
                return null;
            }
            cursorQuery.close();
            return null;
        } catch (Throwable th) {
            if (cursorQuery != null) {
                try {
                    cursorQuery.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzgo
    public final <T extends Map<String, String>> T zza(ContentResolver contentResolver, String[] strArr, zzgp<T> zzgpVar) throws zzgr {
        Cursor cursorQuery = contentResolver.query(zzgg.zzb, null, null, strArr, null);
        try {
            if (cursorQuery == null) {
                throw new zzgr("Failed to connect to GservicesProvider");
            }
            T t = (T) zzgpVar.zza(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                t.put(cursorQuery.getString(0), cursorQuery.getString(1));
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return t;
        } catch (Throwable th) {
            if (cursorQuery != null) {
                try {
                    cursorQuery.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
