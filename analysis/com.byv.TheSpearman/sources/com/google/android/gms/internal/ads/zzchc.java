package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.Predicate;
import com.google.common.util.concurrent.ListenableFuture;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzchc extends FrameLayout implements zzcgm {
    private final zzcgm zza;
    private final zzcdc zzb;
    private final AtomicBoolean zzc;

    /* JADX WARN: Multi-variable type inference failed */
    public zzchc(zzcgm zzcgmVar) {
        super(zzcgmVar.getContext());
        this.zzc = new AtomicBoolean();
        this.zza = zzcgmVar;
        this.zzb = new zzcdc(zzcgmVar.zzE(), this, this);
        addView((View) zzcgmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final boolean canGoBack() {
        return this.zza.canGoBack();
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final void destroy() {
        final zzfmy zzfmyVarZzR = zzR();
        if (zzfmyVarZzR == null) {
            this.zza.destroy();
            return;
        }
        com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcha
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.gms.ads.internal.zzu.zzA().zzg(zzfmyVarZzR);
            }
        });
        final zzcgm zzcgmVar = this.zza;
        zzftg zzftgVar = com.google.android.gms.ads.internal.util.zzt.zza;
        Objects.requireNonNull(zzcgmVar);
        zzftgVar.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzchb
            @Override // java.lang.Runnable
            public final void run() {
                zzcgmVar.destroy();
            }
        }, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzeX)).intValue());
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final void goBack() {
        this.zza.goBack();
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final void loadData(String str, String str2, String str3) {
        this.zza.loadData(str, "text/html", str3);
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.zza.loadDataWithBaseURL(str, str2, "text/html", C.UTF8_NAME, null);
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final void loadUrl(String str) {
        this.zza.loadUrl(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzcgm zzcgmVar = this.zza;
        if (zzcgmVar != null) {
            zzcgmVar.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final void onPause() {
        this.zzb.zzf();
        this.zza.onPause();
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final void onResume() {
        this.zza.onResume();
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzcgm
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.zza.setOnClickListener(onClickListener);
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzcgm
    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.zza.setOnTouchListener(onTouchListener);
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final void setWebChromeClient(WebChromeClient webChromeClient) {
        this.zza.setWebChromeClient(webChromeClient);
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final void setWebViewClient(WebViewClient webViewClient) {
        this.zza.setWebViewClient(webViewClient);
    }

    @Override // com.google.android.gms.internal.ads.zzcdn
    public final void zzA(int i) {
        this.zza.zzA(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcdn
    public final void zzB(int i) {
        this.zzb.zzg(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcgm, com.google.android.gms.internal.ads.zzcdn
    public final void zzC(zzchm zzchmVar) {
        this.zza.zzC(zzchmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcgm, com.google.android.gms.internal.ads.zzcgd
    public final zzffn zzD() {
        return this.zza.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final Context zzE() {
        return this.zza.zzE();
    }

    @Override // com.google.android.gms.internal.ads.zzcgm, com.google.android.gms.internal.ads.zzchz
    public final View zzF() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final WebView zzG() {
        return (WebView) this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final WebViewClient zzH() {
        return this.zza.zzH();
    }

    @Override // com.google.android.gms.internal.ads.zzcgm, com.google.android.gms.internal.ads.zzchx
    public final zzawo zzI() {
        return this.zza.zzI();
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final zzbbl zzJ() {
        return this.zza.zzJ();
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final zzbgs zzK() {
        return this.zza.zzK();
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final com.google.android.gms.ads.internal.overlay.zzm zzL() {
        return this.zza.zzL();
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final com.google.android.gms.ads.internal.overlay.zzm zzM() {
        return this.zza.zzM();
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final zzcic zzN() {
        return ((zzchj) this.zza).zzaL();
    }

    @Override // com.google.android.gms.internal.ads.zzcgm, com.google.android.gms.internal.ads.zzchw
    public final zzcie zzO() {
        return this.zza.zzO();
    }

    @Override // com.google.android.gms.internal.ads.zzcgm, com.google.android.gms.internal.ads.zzchn
    public final zzffq zzP() {
        return this.zza.zzP();
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final zzfgm zzQ() {
        return this.zza.zzQ();
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final zzfmy zzR() {
        return this.zza.zzR();
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final ListenableFuture zzS() {
        return this.zza.zzS();
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final String zzT() {
        return this.zza.zzT();
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final void zzU(zzffn zzffnVar, zzffq zzffqVar) {
        this.zza.zzU(zzffnVar, zzffqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final void zzV() {
        this.zzb.zze();
        this.zza.zzV();
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final void zzW() {
        this.zza.zzW();
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final void zzX(int i) {
        this.zza.zzX(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final void zzY() {
        this.zza.zzY();
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final void zzZ() {
        HashMap map = new HashMap(3);
        map.put("app_muted", String.valueOf(com.google.android.gms.ads.internal.zzu.zzr().zze()));
        map.put("app_volume", String.valueOf(com.google.android.gms.ads.internal.zzu.zzr().zza()));
        zzchj zzchjVar = (zzchj) this.zza;
        map.put("device_volume", String.valueOf(com.google.android.gms.ads.internal.util.zzac.zzb(zzchjVar.getContext())));
        zzchjVar.zzd("volume", map);
    }

    @Override // com.google.android.gms.internal.ads.zzbog
    public final void zza(String str) {
        ((zzchj) this.zza).zzaQ(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final boolean zzaA(boolean z, int i) {
        if (!this.zzc.compareAndSet(false, true)) {
            return true;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzaL)).booleanValue()) {
            return false;
        }
        if (this.zza.getParent() instanceof ViewGroup) {
            ((ViewGroup) this.zza.getParent()).removeView((View) this.zza);
        }
        this.zza.zzaA(z, i);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final boolean zzaB() {
        return this.zza.zzaB();
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final boolean zzaC() {
        return this.zza.zzaC();
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final boolean zzaD() {
        return this.zzc.get();
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final boolean zzaE() {
        return this.zza.zzaE();
    }

    @Override // com.google.android.gms.internal.ads.zzchu
    public final void zzaF(com.google.android.gms.ads.internal.overlay.zzc zzcVar, boolean z) {
        this.zza.zzaF(zzcVar, z);
    }

    @Override // com.google.android.gms.internal.ads.zzchu
    public final void zzaG(String str, String str2, int i) {
        this.zza.zzaG(str, str2, 14);
    }

    @Override // com.google.android.gms.internal.ads.zzchu
    public final void zzaH(boolean z, int i, boolean z2) {
        this.zza.zzaH(z, i, z2);
    }

    @Override // com.google.android.gms.internal.ads.zzchu
    public final void zzaI(boolean z, int i, String str, String str2, boolean z2) {
        this.zza.zzaI(z, i, str, str2, z2);
    }

    @Override // com.google.android.gms.internal.ads.zzchu
    public final void zzaJ(boolean z, int i, String str, boolean z2, boolean z3) {
        this.zza.zzaJ(z, i, str, z2, z3);
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final void zzaa(boolean z) {
        this.zza.zzaa(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final void zzab() {
        this.zza.zzab();
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final void zzac(String str, String str2, String str3) {
        this.zza.zzac(str, str2, null);
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final void zzad() {
        this.zza.zzad();
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final void zzae(String str, zzbky zzbkyVar) {
        this.zza.zzae(str, zzbkyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final void zzaf() {
        TextView textView = new TextView(getContext());
        com.google.android.gms.ads.internal.zzu.zzp();
        textView.setText(com.google.android.gms.ads.internal.util.zzt.zzy());
        textView.setTextSize(15.0f);
        textView.setTextColor(-1);
        textView.setPadding(5, 0, 5, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-12303292);
        gradientDrawable.setCornerRadius(8.0f);
        textView.setBackground(gradientDrawable);
        addView(textView, new FrameLayout.LayoutParams(-2, -2, 49));
        bringChildToFront(textView);
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final void zzag(com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        this.zza.zzag(zzmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final void zzah(zzcie zzcieVar) {
        this.zza.zzah(zzcieVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final void zzai(zzbbl zzbblVar) {
        this.zza.zzai(zzbblVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final void zzaj(boolean z) {
        this.zza.zzaj(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final void zzak() {
        setBackgroundColor(0);
        this.zza.setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final void zzal(Context context) {
        this.zza.zzal(context);
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final void zzam(boolean z) {
        this.zza.zzam(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final void zzan(zzbgq zzbgqVar) {
        this.zza.zzan(zzbgqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final void zzao(boolean z) {
        this.zza.zzao(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final void zzap(zzbgs zzbgsVar) {
        this.zza.zzap(zzbgsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final void zzaq(zzfmy zzfmyVar) {
        this.zza.zzaq(zzfmyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final void zzar(int i) {
        this.zza.zzar(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final void zzas(boolean z) {
        this.zza.zzas(true);
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final void zzat(com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        this.zza.zzat(zzmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final void zzau(boolean z) {
        this.zza.zzau(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final void zzav(boolean z) {
        this.zza.zzav(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final void zzaw(String str, zzbky zzbkyVar) {
        this.zza.zzaw(str, zzbkyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final void zzax(String str, Predicate predicate) {
        this.zza.zzax(str, predicate);
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final boolean zzay() {
        return this.zza.zzay();
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final boolean zzaz() {
        return this.zza.zzaz();
    }

    @Override // com.google.android.gms.internal.ads.zzbog
    public final void zzb(String str, String str2) {
        this.zza.zzb("window.inspectorInfo", str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbnt
    public final void zzd(String str, Map map) {
        this.zza.zzd(str, map);
    }

    @Override // com.google.android.gms.internal.ads.zzdgn
    public final void zzdG() {
        zzcgm zzcgmVar = this.zza;
        if (zzcgmVar != null) {
            zzcgmVar.zzdG();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdgn
    public final void zzdf() {
        zzcgm zzcgmVar = this.zza;
        if (zzcgmVar != null) {
            zzcgmVar.zzdf();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzm
    public final void zzdg() {
        this.zza.zzdg();
    }

    @Override // com.google.android.gms.ads.internal.zzm
    public final void zzdh() {
        this.zza.zzdh();
    }

    @Override // com.google.android.gms.internal.ads.zzcdn
    public final String zzdi() {
        return this.zza.zzdi();
    }

    @Override // com.google.android.gms.internal.ads.zzazy
    public final void zzdp(zzazx zzazxVar) {
        this.zza.zzdp(zzazxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbnt
    public final void zze(String str, JSONObject jSONObject) {
        this.zza.zze(str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzcdn
    public final int zzf() {
        return this.zza.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzcdn
    public final int zzg() {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzdM)).booleanValue() ? this.zza.getMeasuredHeight() : getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.zzcdn
    public final int zzh() {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzdM)).booleanValue() ? this.zza.getMeasuredWidth() : getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.zzcgm, com.google.android.gms.internal.ads.zzchr, com.google.android.gms.internal.ads.zzcdn
    public final Activity zzi() {
        return this.zza.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzcgm, com.google.android.gms.internal.ads.zzcdn
    public final com.google.android.gms.ads.internal.zza zzj() {
        return this.zza.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzcdn
    public final zzbel zzk() {
        return this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzbog
    public final void zzl(String str, JSONObject jSONObject) {
        ((zzchj) this.zza).zzb(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzcgm, com.google.android.gms.internal.ads.zzcdn
    public final zzbem zzm() {
        return this.zza.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzcgm, com.google.android.gms.internal.ads.zzchy, com.google.android.gms.internal.ads.zzcdn
    public final VersionInfoParcel zzn() {
        return this.zza.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzcdn
    public final zzcdc zzo() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzcdn
    public final zzcey zzp(String str) {
        return this.zza.zzp(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcgm, com.google.android.gms.internal.ads.zzcdn
    public final zzchm zzq() {
        return this.zza.zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzcdn
    public final String zzr() {
        return this.zza.zzr();
    }

    @Override // com.google.android.gms.internal.ads.zzcgm, com.google.android.gms.internal.ads.zzcdn
    public final void zzt(String str, zzcey zzceyVar) {
        this.zza.zzt(str, zzceyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcdn
    public final void zzu() {
        this.zza.zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzcdn
    public final void zzv(boolean z, long j) {
        this.zza.zzv(z, j);
    }

    @Override // com.google.android.gms.internal.ads.zzcdn
    public final void zzw() {
        this.zza.zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzcdn
    public final void zzx(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzcdn
    public final void zzy(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzcdn
    public final void zzz(boolean z) {
        this.zza.zzz(false);
    }
}
