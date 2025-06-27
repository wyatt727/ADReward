package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.Predicate;
import com.google.common.util.concurrent.ListenableFuture;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes3.dex */
public interface zzcgm extends com.google.android.gms.ads.internal.client.zza, zzdgn, zzcgd, zzbnt, zzchn, zzchr, zzbog, zzazy, zzchu, com.google.android.gms.ads.internal.zzm, zzchx, zzchy, zzcdn, zzchz {
    boolean canGoBack();

    void destroy();

    @Override // com.google.android.gms.internal.ads.zzchr, com.google.android.gms.internal.ads.zzcdn
    Context getContext();

    int getHeight();

    ViewGroup.LayoutParams getLayoutParams();

    void getLocationOnScreen(int[] iArr);

    int getMeasuredHeight();

    int getMeasuredWidth();

    ViewParent getParent();

    int getWidth();

    void goBack();

    boolean isAttachedToWindow();

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5);

    void loadUrl(String str);

    void measure(int i, int i2);

    void onPause();

    void onResume();

    @Override // com.google.android.gms.internal.ads.zzcdn
    void setBackgroundColor(int i);

    void setOnClickListener(View.OnClickListener onClickListener);

    void setOnTouchListener(View.OnTouchListener onTouchListener);

    void setWebChromeClient(WebChromeClient webChromeClient);

    void setWebViewClient(WebViewClient webViewClient);

    @Override // com.google.android.gms.internal.ads.zzcdn
    void zzC(zzchm zzchmVar);

    @Override // com.google.android.gms.internal.ads.zzcgd
    zzffn zzD();

    Context zzE();

    @Override // com.google.android.gms.internal.ads.zzchz
    View zzF();

    WebView zzG();

    WebViewClient zzH();

    @Override // com.google.android.gms.internal.ads.zzchx
    zzawo zzI();

    zzbbl zzJ();

    zzbgs zzK();

    com.google.android.gms.ads.internal.overlay.zzm zzL();

    com.google.android.gms.ads.internal.overlay.zzm zzM();

    zzcic zzN();

    @Override // com.google.android.gms.internal.ads.zzchw
    zzcie zzO();

    @Override // com.google.android.gms.internal.ads.zzchn
    zzffq zzP();

    zzfgm zzQ();

    zzfmy zzR();

    ListenableFuture zzS();

    String zzT();

    void zzU(zzffn zzffnVar, zzffq zzffqVar);

    void zzV();

    void zzW();

    void zzX(int i);

    void zzY();

    void zzZ();

    boolean zzaA(boolean z, int i);

    boolean zzaB();

    boolean zzaC();

    boolean zzaD();

    boolean zzaE();

    void zzaa(boolean z);

    void zzab();

    void zzac(String str, String str2, String str3);

    void zzad();

    void zzae(String str, zzbky zzbkyVar);

    void zzaf();

    void zzag(com.google.android.gms.ads.internal.overlay.zzm zzmVar);

    void zzah(zzcie zzcieVar);

    void zzai(zzbbl zzbblVar);

    void zzaj(boolean z);

    void zzak();

    void zzal(Context context);

    void zzam(boolean z);

    void zzan(zzbgq zzbgqVar);

    void zzao(boolean z);

    void zzap(zzbgs zzbgsVar);

    void zzaq(zzfmy zzfmyVar);

    void zzar(int i);

    void zzas(boolean z);

    void zzat(com.google.android.gms.ads.internal.overlay.zzm zzmVar);

    void zzau(boolean z);

    void zzav(boolean z);

    void zzaw(String str, zzbky zzbkyVar);

    void zzax(String str, Predicate predicate);

    boolean zzay();

    boolean zzaz();

    @Override // com.google.android.gms.internal.ads.zzchr, com.google.android.gms.internal.ads.zzcdn
    Activity zzi();

    @Override // com.google.android.gms.internal.ads.zzcdn
    com.google.android.gms.ads.internal.zza zzj();

    @Override // com.google.android.gms.internal.ads.zzcdn
    zzbem zzm();

    @Override // com.google.android.gms.internal.ads.zzchy, com.google.android.gms.internal.ads.zzcdn
    VersionInfoParcel zzn();

    @Override // com.google.android.gms.internal.ads.zzcdn
    zzchm zzq();

    @Override // com.google.android.gms.internal.ads.zzcdn
    void zzt(String str, zzcey zzceyVar);
}
