package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.Predicate;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes3.dex */
public final class zzbof implements zzbnx, zzbnv {
    private final zzcgm zza;

    /* JADX WARN: Multi-variable type inference failed */
    public zzbof(Context context, VersionInfoParcel versionInfoParcel, zzawo zzawoVar, com.google.android.gms.ads.internal.zza zzaVar) throws zzcgy {
        com.google.android.gms.ads.internal.zzu.zzz();
        zzcgm zzcgmVarZza = zzcgz.zza(context, zzcie.zza(), "", false, false, null, null, versionInfoParcel, null, null, null, zzbcx.zza(), null, null, null, null);
        this.zza = zzcgmVarZza;
        ((View) zzcgmVarZza).setWillNotDraw(true);
    }

    private static final void zzs(Runnable runnable) {
        com.google.android.gms.ads.internal.client.zzay.zzb();
        if (com.google.android.gms.ads.internal.util.client.zzf.zzv()) {
            com.google.android.gms.ads.internal.util.zze.zza("runOnUiThread > the UI thread is the main thread, the runnable will be run now");
            runnable.run();
        } else {
            com.google.android.gms.ads.internal.util.zze.zza("runOnUiThread > the UI thread is not the main thread, the runnable will be added to the message queue");
            if (com.google.android.gms.ads.internal.util.zzt.zza.post(runnable)) {
                return;
            }
            com.google.android.gms.ads.internal.util.client.zzm.zzj("runOnUiThread > the runnable could not be placed to the message queue");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbog
    public final void zza(final String str) {
        com.google.android.gms.ads.internal.util.zze.zza("invokeJavascript on adWebView from js");
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbob
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzm(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbog
    public final /* synthetic */ void zzb(String str, String str2) {
        zzbnu.zzc(this, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbnx
    public final void zzc() {
        this.zza.destroy();
    }

    @Override // com.google.android.gms.internal.ads.zzbnt
    public final /* synthetic */ void zzd(String str, Map map) {
        zzbnu.zza(this, str, map);
    }

    @Override // com.google.android.gms.internal.ads.zzbnt
    public final /* synthetic */ void zze(String str, JSONObject jSONObject) {
        zzbnu.zzb(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzbnx
    public final void zzf(final String str) {
        com.google.android.gms.ads.internal.util.zze.zza("loadHtml on adWebView from html");
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzboc
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzn(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbnx
    public final void zzg(final String str) {
        com.google.android.gms.ads.internal.util.zze.zza("loadHtmlWrapper on adWebView from path: ".concat(String.valueOf(str)));
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbnz
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzo(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbnx
    public final void zzh(String str) {
        com.google.android.gms.ads.internal.util.zze.zza("loadJavascript on adWebView from path: ".concat(String.valueOf(str)));
        final String str2 = String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", str);
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbod
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzp(str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbnx
    public final boolean zzi() {
        return this.zza.zzaB();
    }

    @Override // com.google.android.gms.internal.ads.zzbnx
    public final zzbpe zzj() {
        return new zzbpe(this);
    }

    @Override // com.google.android.gms.internal.ads.zzbnx
    public final void zzk(final zzbol zzbolVar) {
        zzcic zzcicVarZzN = this.zza.zzN();
        Objects.requireNonNull(zzbolVar);
        zzcicVarZzN.zzH(new zzcib() { // from class: com.google.android.gms.internal.ads.zzboa
            @Override // com.google.android.gms.internal.ads.zzcib
            public final void zza() {
                long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis();
                zzbol zzbolVar2 = zzbolVar;
                final long j = zzbolVar2.zzc;
                final ArrayList arrayList = zzbolVar2.zzb;
                arrayList.add(Long.valueOf(jCurrentTimeMillis - j));
                com.google.android.gms.ads.internal.util.zze.zza("LoadNewJavascriptEngine(onEngLoaded) latency is " + String.valueOf(arrayList.get(0)) + " ms.");
                zzftg zzftgVar = com.google.android.gms.ads.internal.util.zzt.zza;
                final zzbpc zzbpcVar = zzbolVar2.zza;
                final zzbpb zzbpbVar = zzbolVar2.zzd;
                final zzbnx zzbnxVar = zzbolVar2.zze;
                zzftgVar.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzboh
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzbpcVar.zzi(zzbpbVar, zzbnxVar, arrayList, j);
                    }
                }, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzc)).intValue());
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbog
    public final /* synthetic */ void zzl(String str, JSONObject jSONObject) {
        zzbnu.zzd(this, str, jSONObject);
    }

    final /* synthetic */ void zzm(String str) {
        this.zza.zza(str);
    }

    final /* synthetic */ void zzn(String str) {
        this.zza.loadData(str, "text/html", C.UTF8_NAME);
    }

    final /* synthetic */ void zzo(String str) {
        this.zza.loadUrl(str);
    }

    final /* synthetic */ void zzp(String str) {
        this.zza.loadData(str, "text/html", C.UTF8_NAME);
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzq(String str, zzbky zzbkyVar) {
        this.zza.zzae(str, new zzboe(this, zzbkyVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzr(String str, final zzbky zzbkyVar) {
        this.zza.zzax(str, new Predicate() { // from class: com.google.android.gms.internal.ads.zzbny
            @Override // com.google.android.gms.common.util.Predicate
            public final boolean apply(Object obj) {
                zzbky zzbkyVar2 = (zzbky) obj;
                if (zzbkyVar2 instanceof zzboe) {
                    return ((zzboe) zzbkyVar2).zzb.equals(zzbkyVar);
                }
                return false;
            }
        });
    }
}
