package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.Button;
import com.bytedance.sdk.component.utils.zF;
import com.bytedance.sdk.openadsdk.utils.tr;

/* loaded from: classes2.dex */
public class LandingPageBrowserDownloadButton extends Button {
    public LandingPageBrowserDownloadButton(Context context) {
        super(context);
        EYQ();
    }

    private void EYQ() {
        setId(com.bytedance.sdk.openadsdk.utils.tp.aEX);
        Context context = getContext();
        setLayoutParams(new ViewGroup.LayoutParams(-1, tr.mZx(context, 48.0f)));
        setBackgroundResource(zF.Pm(context, "tt_browser_download_selector"));
        setText(zF.mZx(context, "tt_video_download_apk"));
        setTextColor(-1);
        setTextSize(2, 16.0f);
    }
}
