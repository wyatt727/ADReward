package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.provider.CalendarContract;
import android.text.TextUtils;
import com.google.android.gms.ads.impl.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Map;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzbtj extends zzbts {
    private final Map zza;
    private final Context zzb;
    private final String zzc;
    private final long zzd;
    private final long zze;
    private final String zzf;
    private final String zzg;

    public zzbtj(zzcgm zzcgmVar, Map map) {
        super(zzcgmVar, "createCalendarEvent");
        this.zza = map;
        this.zzb = zzcgmVar.zzi();
        this.zzc = zze("description");
        this.zzf = zze("summary");
        this.zzd = zzd("start_ticks");
        this.zze = zzd("end_ticks");
        this.zzg = zze(FirebaseAnalytics.Param.LOCATION);
    }

    private final long zzd(String str) {
        String str2 = (String) this.zza.get(str);
        if (str2 == null) {
            return -1L;
        }
        try {
            return Long.parseLong(str2);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    private final String zze(String str) {
        return TextUtils.isEmpty((CharSequence) this.zza.get(str)) ? "" : (String) this.zza.get(str);
    }

    final Intent zzb() {
        Intent data = new Intent("android.intent.action.EDIT").setData(CalendarContract.Events.CONTENT_URI);
        data.putExtra("title", this.zzc);
        data.putExtra("eventLocation", this.zzg);
        data.putExtra("description", this.zzf);
        long j = this.zzd;
        if (j > -1) {
            data.putExtra("beginTime", j);
        }
        long j2 = this.zze;
        if (j2 > -1) {
            data.putExtra("endTime", j2);
        }
        data.setFlags(268435456);
        return data;
    }

    public final void zzc() throws JSONException {
        if (this.zzb == null) {
            zzh("Activity context is not available.");
            return;
        }
        com.google.android.gms.ads.internal.zzu.zzp();
        if (!new zzbdi(this.zzb).zzb()) {
            zzh("This feature is not available on the device.");
            return;
        }
        com.google.android.gms.ads.internal.zzu.zzp();
        AlertDialog.Builder builderZzK = com.google.android.gms.ads.internal.util.zzt.zzK(this.zzb);
        Resources resourcesZze = com.google.android.gms.ads.internal.zzu.zzo().zze();
        builderZzK.setTitle(resourcesZze != null ? resourcesZze.getString(R.string.s5) : "Create calendar event");
        builderZzK.setMessage(resourcesZze != null ? resourcesZze.getString(R.string.s6) : "Allow Ad to create a calendar event?");
        builderZzK.setPositiveButton(resourcesZze != null ? resourcesZze.getString(R.string.s3) : "Accept", new zzbth(this));
        builderZzK.setNegativeButton(resourcesZze != null ? resourcesZze.getString(R.string.s4) : "Decline", new zzbti(this));
        builderZzK.create().show();
    }
}
