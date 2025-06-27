package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.app.NotificationCompat;
import androidx.core.view.InputDeviceCompat;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.common.internal.Preconditions;
import com.json.t2;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashMap;
import java.util.Objects;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes3.dex */
public final class zzcdb extends FrameLayout implements zzccs {
    final zzcdp zza;
    private final zzcdn zzb;
    private final FrameLayout zzc;
    private final View zzd;
    private final zzbeo zze;
    private final long zzf;
    private final zzcct zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private long zzl;
    private long zzm;
    private String zzn;
    private String[] zzo;
    private Bitmap zzp;
    private final ImageView zzq;
    private boolean zzr;

    public zzcdb(Context context, zzcdn zzcdnVar, int i, boolean z, zzbeo zzbeoVar, zzcdm zzcdmVar) {
        super(context);
        this.zzb = zzcdnVar;
        this.zze = zzbeoVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.zzc = frameLayout;
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        Preconditions.checkNotNull(zzcdnVar.zzj());
        zzccu zzccuVar = zzcdnVar.zzj().zza;
        zzcct zzcefVar = i == 2 ? new zzcef(context, new zzcdo(context, zzcdnVar.zzn(), zzcdnVar.zzdi(), zzbeoVar, zzcdnVar.zzk()), zzcdnVar, z, zzcdf.zza(zzcdnVar), zzcdmVar) : new zzccr(context, zzcdnVar, z, zzcdf.zza(zzcdnVar), zzcdmVar, new zzcdo(context, zzcdnVar.zzn(), zzcdnVar.zzdi(), zzbeoVar, zzcdnVar.zzk()));
        this.zzg = zzcefVar;
        View view = new View(context);
        this.zzd = view;
        view.setBackgroundColor(0);
        frameLayout.addView(zzcefVar, new FrameLayout.LayoutParams(-1, -1, 17));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzF)).booleanValue()) {
            frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
            frameLayout.bringChildToFront(view);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzC)).booleanValue()) {
            zzn();
        }
        this.zzq = new ImageView(context);
        this.zzf = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzI)).longValue();
        boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzE)).booleanValue();
        this.zzk = zBooleanValue;
        if (zzbeoVar != null) {
            zzbeoVar.zzd("spinner_used", true != zBooleanValue ? "0" : "1");
        }
        this.zza = new zzcdp(this);
        zzcefVar.zzr(this);
    }

    private final void zzJ() {
        if (this.zzb.zzi() == null || !this.zzi || this.zzj) {
            return;
        }
        this.zzb.zzi().getWindow().clearFlags(128);
        this.zzi = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzK(String str, String... strArr) {
        HashMap map = new HashMap();
        Integer numZzl = zzl();
        if (numZzl != null) {
            map.put("playerId", numZzl.toString());
        }
        map.put(NotificationCompat.CATEGORY_EVENT, str);
        String str2 = null;
        for (String str3 : strArr) {
            if (str2 == null) {
                str2 = str3;
            } else {
                map.put(str2, str3);
                str2 = null;
            }
        }
        this.zzb.zzd("onVideoEvent", map);
    }

    private final boolean zzL() {
        return this.zzq.getParent() != null;
    }

    public final void finalize() throws Throwable {
        try {
            this.zza.zza();
            final zzcct zzcctVar = this.zzg;
            if (zzcctVar != null) {
                zzgep zzgepVar = zzcbr.zze;
                Objects.requireNonNull(zzcctVar);
                zzgepVar.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzccv
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzcctVar.zzt();
                    }
                });
            }
        } finally {
            super.finalize();
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(final boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            this.zza.zzb();
        } else {
            this.zza.zza();
            this.zzm = this.zzl;
        }
        com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzccx
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzq(z);
            }
        });
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzccs
    public final void onWindowVisibilityChanged(int i) {
        boolean z;
        super.onWindowVisibilityChanged(i);
        if (i == 0) {
            this.zza.zzb();
            z = true;
        } else {
            this.zza.zza();
            this.zzm = this.zzl;
            z = false;
        }
        com.google.android.gms.ads.internal.util.zzt.zza.post(new zzcda(this, z));
    }

    public final void zzA(int i) {
        zzcct zzcctVar = this.zzg;
        if (zzcctVar == null) {
            return;
        }
        zzcctVar.zzz(i);
    }

    public final void zzB(int i) {
        zzcct zzcctVar = this.zzg;
        if (zzcctVar == null) {
            return;
        }
        zzcctVar.zzA(i);
    }

    public final void zzC(int i) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzF)).booleanValue()) {
            this.zzc.setBackgroundColor(i);
            this.zzd.setBackgroundColor(i);
        }
    }

    public final void zzD(int i) {
        zzcct zzcctVar = this.zzg;
        if (zzcctVar == null) {
            return;
        }
        zzcctVar.zzB(i);
    }

    public final void zzE(String str, String[] strArr) {
        this.zzn = str;
        this.zzo = strArr;
    }

    public final void zzF(int i, int i2, int i3, int i4) {
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("Set video bounds to x:" + i + ";y:" + i2 + ";w:" + i3 + ";h:" + i4);
        }
        if (i3 == 0 || i4 == 0) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i3, i4);
        layoutParams.setMargins(i, i2, 0, 0);
        this.zzc.setLayoutParams(layoutParams);
        requestLayout();
    }

    public final void zzG(float f) {
        zzcct zzcctVar = this.zzg;
        if (zzcctVar == null) {
            return;
        }
        zzcctVar.zzb.zze(f);
        zzcctVar.zzn();
    }

    public final void zzH(float f, float f2) {
        zzcct zzcctVar = this.zzg;
        if (zzcctVar != null) {
            zzcctVar.zzu(f, f2);
        }
    }

    public final void zzI() {
        zzcct zzcctVar = this.zzg;
        if (zzcctVar == null) {
            return;
        }
        zzcctVar.zzb.zzd(false);
        zzcctVar.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final void zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzbS)).booleanValue()) {
            this.zza.zza();
        }
        zzK(t2.h.h0, new String[0]);
        zzJ();
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final void zzb(String str, String str2) {
        zzK("error", "what", str, "extra", str2);
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final void zzc(String str, String str2) {
        zzK("exception", "what", "ExoPlayerAdapter exception", "extra", str2);
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final void zzd() {
        zzK(CampaignEx.JSON_NATIVE_VIDEO_PAUSE, new String[0]);
        zzJ();
        this.zzh = false;
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final void zze() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzbS)).booleanValue()) {
            this.zza.zzb();
        }
        if (this.zzb.zzi() != null && !this.zzi) {
            boolean z = (this.zzb.zzi().getWindow().getAttributes().flags & 128) != 0;
            this.zzj = z;
            if (!z) {
                this.zzb.zzi().getWindow().addFlags(128);
                this.zzi = true;
            }
        }
        this.zzh = true;
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final void zzf() {
        zzcct zzcctVar = this.zzg;
        if (zzcctVar != null && this.zzm == 0) {
            float fZzc = zzcctVar.zzc();
            zzcct zzcctVar2 = this.zzg;
            zzK("canplaythrough", "duration", String.valueOf(fZzc / 1000.0f), "videoWidth", String.valueOf(zzcctVar2.zze()), "videoHeight", String.valueOf(zzcctVar2.zzd()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final void zzg() {
        this.zzd.setVisibility(4);
        com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzccw
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzp();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final void zzh() {
        this.zza.zzb();
        com.google.android.gms.ads.internal.util.zzt.zza.post(new zzccy(this));
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final void zzi() {
        if (this.zzr && this.zzp != null && !zzL()) {
            this.zzq.setImageBitmap(this.zzp);
            this.zzq.invalidate();
            this.zzc.addView(this.zzq, new FrameLayout.LayoutParams(-1, -1));
            this.zzc.bringChildToFront(this.zzq);
        }
        this.zza.zza();
        this.zzm = this.zzl;
        com.google.android.gms.ads.internal.util.zzt.zza.post(new zzccz(this));
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final void zzj(int i, int i2) {
        if (this.zzk) {
            int iMax = Math.max(i / ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzH)).intValue(), 1);
            int iMax2 = Math.max(i2 / ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzH)).intValue(), 1);
            Bitmap bitmap = this.zzp;
            if (bitmap != null && bitmap.getWidth() == iMax && this.zzp.getHeight() == iMax2) {
                return;
            }
            this.zzp = Bitmap.createBitmap(iMax, iMax2, Bitmap.Config.ARGB_8888);
            this.zzr = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final void zzk() {
        if (this.zzh && zzL()) {
            this.zzc.removeView(this.zzq);
        }
        if (this.zzg == null || this.zzp == null) {
            return;
        }
        long jElapsedRealtime = com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime();
        if (this.zzg.getBitmap(this.zzp) != null) {
            this.zzr = true;
        }
        long jElapsedRealtime2 = com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime() - jElapsedRealtime;
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("Spinner frame grab took " + jElapsedRealtime2 + "ms");
        }
        if (jElapsedRealtime2 > this.zzf) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Spinner frame grab crossed jank threshold! Suspending spinner.");
            this.zzk = false;
            this.zzp = null;
            zzbeo zzbeoVar = this.zze;
            if (zzbeoVar != null) {
                zzbeoVar.zzd("spinner_jank", Long.toString(jElapsedRealtime2));
            }
        }
    }

    public final Integer zzl() {
        zzcct zzcctVar = this.zzg;
        if (zzcctVar != null) {
            return zzcctVar.zzw();
        }
        return null;
    }

    public final void zzn() {
        zzcct zzcctVar = this.zzg;
        if (zzcctVar == null) {
            return;
        }
        TextView textView = new TextView(zzcctVar.getContext());
        Resources resourcesZze = com.google.android.gms.ads.internal.zzu.zzo().zze();
        textView.setText(String.valueOf(resourcesZze == null ? "AdMob - " : resourcesZze.getString(R.string.watermark_label_prefix)).concat(this.zzg.zzj()));
        textView.setTextColor(-65536);
        textView.setBackgroundColor(InputDeviceCompat.SOURCE_ANY);
        this.zzc.addView(textView, new FrameLayout.LayoutParams(-2, -2, 17));
        this.zzc.bringChildToFront(textView);
    }

    public final void zzo() {
        this.zza.zza();
        zzcct zzcctVar = this.zzg;
        if (zzcctVar != null) {
            zzcctVar.zzt();
        }
        zzJ();
    }

    final /* synthetic */ void zzp() {
        zzK("firstFrameRendered", new String[0]);
    }

    final /* synthetic */ void zzq(boolean z) {
        zzK("windowFocusChanged", "hasWindowFocus", String.valueOf(z));
    }

    public final void zzr(Integer num) {
        if (this.zzg == null) {
            return;
        }
        if (TextUtils.isEmpty(this.zzn)) {
            zzK("no_src", new String[0]);
        } else {
            this.zzg.zzC(this.zzn, this.zzo, num);
        }
    }

    public final void zzs() {
        zzcct zzcctVar = this.zzg;
        if (zzcctVar == null) {
            return;
        }
        zzcctVar.zzb.zzd(true);
        zzcctVar.zzn();
    }

    final void zzt() {
        zzcct zzcctVar = this.zzg;
        if (zzcctVar == null) {
            return;
        }
        long jZza = zzcctVar.zza();
        if (this.zzl == jZza || jZza <= 0) {
            return;
        }
        float f = jZza / 1000.0f;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzbQ)).booleanValue()) {
            zzK("timeupdate", "time", String.valueOf(f), "totalBytes", String.valueOf(this.zzg.zzh()), "qoeCachedBytes", String.valueOf(this.zzg.zzf()), "qoeLoadedBytes", String.valueOf(this.zzg.zzg()), "droppedFrames", String.valueOf(this.zzg.zzb()), "reportTime", String.valueOf(com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis()));
        } else {
            zzK("timeupdate", "time", String.valueOf(f));
        }
        this.zzl = jZza;
    }

    public final void zzu() {
        zzcct zzcctVar = this.zzg;
        if (zzcctVar == null) {
            return;
        }
        zzcctVar.zzo();
    }

    public final void zzv() {
        zzcct zzcctVar = this.zzg;
        if (zzcctVar == null) {
            return;
        }
        zzcctVar.zzp();
    }

    public final void zzw(int i) {
        zzcct zzcctVar = this.zzg;
        if (zzcctVar == null) {
            return;
        }
        zzcctVar.zzq(i);
    }

    public final void zzx(MotionEvent motionEvent) {
        zzcct zzcctVar = this.zzg;
        if (zzcctVar == null) {
            return;
        }
        zzcctVar.dispatchTouchEvent(motionEvent);
    }

    public final void zzy(int i) {
        zzcct zzcctVar = this.zzg;
        if (zzcctVar == null) {
            return;
        }
        zzcctVar.zzx(i);
    }

    public final void zzz(int i) {
        zzcct zzcctVar = this.zzg;
        if (zzcctVar == null) {
            return;
        }
        zzcctVar.zzy(i);
    }
}
