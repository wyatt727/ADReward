package com.json.mediationsdk.ads.nativead.interfaces;

import android.view.View;
import com.json.mediationsdk.ads.nativead.LevelPlayMediaView;
import com.mbridge.msdk.MBridgeConstans;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bH&J\u0012\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\r"}, d2 = {"Lcom/ironsource/mediationsdk/ads/nativead/interfaces/NativeAdViewBinderInterface;", "", "setAdvertiserView", "", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/view/View;", "setBodyView", "setCallToActionView", "setIconView", "setMediaView", "mediaView", "Lcom/ironsource/mediationsdk/ads/nativead/LevelPlayMediaView;", "setTitleView", "mediationsdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface NativeAdViewBinderInterface {
    void setAdvertiserView(View view);

    void setBodyView(View view);

    void setCallToActionView(View view);

    void setIconView(View view);

    void setMediaView(LevelPlayMediaView mediaView);

    void setTitleView(View view);
}
