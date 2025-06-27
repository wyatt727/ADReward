package com.unity3d.ads.adplayer;

import android.view.View;
import com.mbridge.msdk.MBridgeConstans;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* compiled from: View.kt */
@Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0007¸\u0006\u0000"}, d2 = {"androidx/core/view/ViewKt$doOnDetach$1", "Landroid/view/View$OnAttachStateChangeListener;", "onViewAttachedToWindow", "", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/view/View;", "onViewDetachedFromWindow", "core-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AndroidEmbeddableWebViewAdPlayer$show$lambda$1$$inlined$doOnDetach$1 implements View.OnAttachStateChangeListener {
    final /* synthetic */ View $this_doOnDetach;
    final /* synthetic */ AndroidEmbeddableWebViewAdPlayer this$0;

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    public AndroidEmbeddableWebViewAdPlayer$show$lambda$1$$inlined$doOnDetach$1(View view, AndroidEmbeddableWebViewAdPlayer androidEmbeddableWebViewAdPlayer) {
        this.$this_doOnDetach = view;
        this.this$0 = androidEmbeddableWebViewAdPlayer;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.$this_doOnDetach.removeOnAttachStateChangeListener(this);
        BuildersKt__Builders_commonKt.launch$default(this.this$0.webViewAdPlayer.getScope(), null, null, new AndroidEmbeddableWebViewAdPlayer$show$2$2$1(this.this$0, null), 3, null);
    }
}
