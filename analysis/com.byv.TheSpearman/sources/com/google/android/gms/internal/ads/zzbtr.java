package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzbtr extends zzbts implements zzbky {
    DisplayMetrics zza;
    int zzb;
    int zzc;
    int zzd;
    int zze;
    int zzf;
    int zzg;
    private final zzcgm zzh;
    private final Context zzi;
    private final WindowManager zzj;
    private final zzbdi zzk;
    private float zzl;
    private int zzm;

    public zzbtr(zzcgm zzcgmVar, Context context, zzbdi zzbdiVar) {
        super(zzcgmVar, "");
        this.zzb = -1;
        this.zzc = -1;
        this.zzd = -1;
        this.zze = -1;
        this.zzf = -1;
        this.zzg = -1;
        this.zzh = zzcgmVar;
        this.zzi = context;
        this.zzk = zzbdiVar;
        this.zzj = (WindowManager) context.getSystemService("window");
    }

    @Override // com.google.android.gms.internal.ads.zzbky
    public final /* synthetic */ void zza(Object obj, Map map) throws JSONException {
        JSONObject jSONObjectPut;
        this.zza = new DisplayMetrics();
        Display defaultDisplay = this.zzj.getDefaultDisplay();
        defaultDisplay.getMetrics(this.zza);
        this.zzl = this.zza.density;
        this.zzm = defaultDisplay.getRotation();
        com.google.android.gms.ads.internal.client.zzay.zzb();
        DisplayMetrics displayMetrics = this.zza;
        this.zzb = com.google.android.gms.ads.internal.util.client.zzf.zzw(displayMetrics, displayMetrics.widthPixels);
        com.google.android.gms.ads.internal.client.zzay.zzb();
        DisplayMetrics displayMetrics2 = this.zza;
        this.zzc = com.google.android.gms.ads.internal.util.client.zzf.zzw(displayMetrics2, displayMetrics2.heightPixels);
        Activity activityZzi = this.zzh.zzi();
        if (activityZzi == null || activityZzi.getWindow() == null) {
            this.zzd = this.zzb;
            this.zze = this.zzc;
        } else {
            com.google.android.gms.ads.internal.zzu.zzp();
            int[] iArrZzQ = com.google.android.gms.ads.internal.util.zzt.zzQ(activityZzi);
            com.google.android.gms.ads.internal.client.zzay.zzb();
            this.zzd = com.google.android.gms.ads.internal.util.client.zzf.zzw(this.zza, iArrZzQ[0]);
            com.google.android.gms.ads.internal.client.zzay.zzb();
            this.zze = com.google.android.gms.ads.internal.util.client.zzf.zzw(this.zza, iArrZzQ[1]);
        }
        if (this.zzh.zzO().zzi()) {
            this.zzf = this.zzb;
            this.zzg = this.zzc;
        } else {
            this.zzh.measure(0, 0);
        }
        zzj(this.zzb, this.zzc, this.zzd, this.zze, this.zzl, this.zzm);
        zzbtq zzbtqVar = new zzbtq();
        zzbdi zzbdiVar = this.zzk;
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        zzbtqVar.zze(zzbdiVar.zza(intent));
        zzbdi zzbdiVar2 = this.zzk;
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setData(Uri.parse("sms:"));
        zzbtqVar.zzc(zzbdiVar2.zza(intent2));
        zzbtqVar.zza(this.zzk.zzb());
        zzbtqVar.zzd(this.zzk.zzc());
        zzbtqVar.zzb(true);
        boolean z = zzbtqVar.zza;
        boolean z2 = zzbtqVar.zzb;
        boolean z3 = zzbtqVar.zzc;
        boolean z4 = zzbtqVar.zzd;
        boolean z5 = zzbtqVar.zze;
        zzcgm zzcgmVar = this.zzh;
        try {
            jSONObjectPut = new JSONObject().put("sms", z).put("tel", z2).put("calendar", z3).put("storePicture", z4).put("inlineVideo", z5);
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Error occurred while obtaining the MRAID capabilities.", e);
            jSONObjectPut = null;
        }
        zzcgmVar.zze("onDeviceFeaturesReceived", jSONObjectPut);
        int[] iArr = new int[2];
        this.zzh.getLocationOnScreen(iArr);
        zzb(com.google.android.gms.ads.internal.client.zzay.zzb().zzb(this.zzi, iArr[0]), com.google.android.gms.ads.internal.client.zzay.zzb().zzb(this.zzi, iArr[1]));
        if (com.google.android.gms.ads.internal.util.zze.zzm(2)) {
            com.google.android.gms.ads.internal.util.client.zzm.zzi("Dispatching Ready Event.");
        }
        zzi(this.zzh.zzn().afmaVersion);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006b A[PHI: r3
      0x006b: PHI (r3v1 int) = (r3v0 int), (r3v4 int) binds: [B:11:0x0042, B:17:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzb(int r7, int r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.zzi
            boolean r1 = r0 instanceof android.app.Activity
            r2 = 0
            if (r1 == 0) goto L13
            com.google.android.gms.ads.internal.zzu.zzp()
            android.app.Activity r0 = (android.app.Activity) r0
            int[] r0 = com.google.android.gms.ads.internal.util.zzt.zzR(r0)
            r0 = r0[r2]
            goto L14
        L13:
            r0 = r2
        L14:
            com.google.android.gms.internal.ads.zzcgm r1 = r6.zzh
            com.google.android.gms.internal.ads.zzcie r1 = r1.zzO()
            if (r1 == 0) goto L28
            com.google.android.gms.internal.ads.zzcgm r1 = r6.zzh
            com.google.android.gms.internal.ads.zzcie r1 = r1.zzO()
            boolean r1 = r1.zzi()
            if (r1 != 0) goto L84
        L28:
            com.google.android.gms.internal.ads.zzcgm r1 = r6.zzh
            int r3 = r1.getWidth()
            int r1 = r1.getHeight()
            com.google.android.gms.internal.ads.zzbdq r4 = com.google.android.gms.internal.ads.zzbdz.zzR
            com.google.android.gms.internal.ads.zzbdx r5 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r4 = r5.zza(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L6b
            if (r3 != 0) goto L58
            com.google.android.gms.internal.ads.zzcgm r3 = r6.zzh
            com.google.android.gms.internal.ads.zzcie r3 = r3.zzO()
            if (r3 == 0) goto L57
            com.google.android.gms.internal.ads.zzcgm r3 = r6.zzh
            com.google.android.gms.internal.ads.zzcie r3 = r3.zzO()
            int r3 = r3.zzb
            goto L58
        L57:
            r3 = r2
        L58:
            if (r1 != 0) goto L6b
            com.google.android.gms.internal.ads.zzcgm r1 = r6.zzh
            com.google.android.gms.internal.ads.zzcie r1 = r1.zzO()
            if (r1 == 0) goto L6c
            com.google.android.gms.internal.ads.zzcgm r1 = r6.zzh
            com.google.android.gms.internal.ads.zzcie r1 = r1.zzO()
            int r2 = r1.zza
            goto L6c
        L6b:
            r2 = r1
        L6c:
            android.content.Context r1 = r6.zzi
            com.google.android.gms.ads.internal.util.client.zzf r4 = com.google.android.gms.ads.internal.client.zzay.zzb()
            int r1 = r4.zzb(r1, r3)
            r6.zzf = r1
            android.content.Context r1 = r6.zzi
            com.google.android.gms.ads.internal.util.client.zzf r3 = com.google.android.gms.ads.internal.client.zzay.zzb()
            int r1 = r3.zzb(r1, r2)
            r6.zzg = r1
        L84:
            int r0 = r8 - r0
            int r1 = r6.zzf
            int r2 = r6.zzg
            r6.zzg(r7, r0, r1, r2)
            com.google.android.gms.internal.ads.zzcgm r0 = r6.zzh
            com.google.android.gms.internal.ads.zzcic r0 = r0.zzN()
            r0.zzC(r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbtr.zzb(int, int):void");
    }
}
