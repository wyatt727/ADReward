package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.google.android.gms.ads.impl.R;
import java.util.Map;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzbtp extends zzbts {
    private final Map zza;
    private final Context zzb;

    public zzbtp(zzcgm zzcgmVar, Map map) {
        super(zzcgmVar, "storePicture");
        this.zza = map;
        this.zzb = zzcgmVar.zzi();
    }

    public final void zzb() throws JSONException {
        if (this.zzb == null) {
            zzh("Activity context is not available");
            return;
        }
        com.google.android.gms.ads.internal.zzu.zzp();
        if (!new zzbdi(this.zzb).zzc()) {
            zzh("Feature is not supported by the device.");
            return;
        }
        String str = (String) this.zza.get("iurl");
        if (TextUtils.isEmpty(str)) {
            zzh("Image url cannot be empty.");
            return;
        }
        if (!URLUtil.isValidUrl(str)) {
            zzh("Invalid image url: ".concat(String.valueOf(str)));
            return;
        }
        String lastPathSegment = Uri.parse(str).getLastPathSegment();
        com.google.android.gms.ads.internal.zzu.zzp();
        if (TextUtils.isEmpty(lastPathSegment) || !lastPathSegment.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)")) {
            zzh("Image type not recognized: ".concat(String.valueOf(lastPathSegment)));
            return;
        }
        Resources resourcesZze = com.google.android.gms.ads.internal.zzu.zzo().zze();
        com.google.android.gms.ads.internal.zzu.zzp();
        AlertDialog.Builder builderZzK = com.google.android.gms.ads.internal.util.zzt.zzK(this.zzb);
        builderZzK.setTitle(resourcesZze != null ? resourcesZze.getString(R.string.s1) : "Save image");
        builderZzK.setMessage(resourcesZze != null ? resourcesZze.getString(R.string.s2) : "Allow Ad to store image in Picture gallery?");
        builderZzK.setPositiveButton(resourcesZze != null ? resourcesZze.getString(R.string.s3) : "Accept", new zzbtn(this, str, lastPathSegment));
        builderZzK.setNegativeButton(resourcesZze != null ? resourcesZze.getString(R.string.s4) : "Decline", new zzbto(this));
        builderZzK.create().show();
    }
}
