package com.bytedance.sdk.component.adexpress.dynamic.EYQ;

import android.content.Context;
import com.bytedance.sdk.component.adexpress.Pm;
import com.bytedance.sdk.component.adexpress.dynamic.Td.QQ;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseInternalScrollWidgetImp;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseScrollWidgetImp;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicButton;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicClose;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicDislike;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicDislikeFeedBack;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicImageView;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicLeisureWidget;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicLogoAd;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicLogoUnion;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicMutedView;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicPrivacyView;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicRoot;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicRootView;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicSkipCountDown;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicSkipCountDownBtn;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicSkipCountDownContainer;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicSplitLineView;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicStarView;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicTextView;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicTimeOuter;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicTimeOuterContainerWidgetImp;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicTimeOuterRewardFullSkip;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicTimeOuterSkip;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicUnKnowView;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicVerticalScrollWidgetImp;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicVideoView;

/* compiled from: DynamicViewFactory.java */
/* loaded from: classes2.dex */
public class mZx {
    public static DynamicBaseWidget EYQ(Context context, DynamicRootView dynamicRootView, QQ qq) {
        if (context == null || dynamicRootView == null || qq == null || qq.tp() == null) {
            return null;
        }
        switch (qq.tp().EYQ()) {
            case -1:
                return new DynamicUnKnowView(context, dynamicRootView, qq);
            case 0:
                return new DynamicTextView(context, dynamicRootView, qq);
            case 1:
                return new DynamicImageView(context, dynamicRootView, qq);
            case 2:
                return new DynamicButton(context, dynamicRootView, qq);
            case 3:
                return new DynamicDislike(context, dynamicRootView, qq);
            case 4:
                return new DynamicLogoAd(context, dynamicRootView, qq);
            case 5:
                return new DynamicLogoUnion(context, dynamicRootView, qq);
            case 6:
            case 9:
            case 17:
                return new DynamicBaseWidgetImp(context, dynamicRootView, qq);
            case 7:
                return new DynamicVideoView(context, dynamicRootView, qq);
            case 8:
                return new DynamicRoot(context, dynamicRootView, qq);
            case 10:
                return new DynamicMutedView(context, dynamicRootView, qq);
            case 11:
                return new DynamicStarView(context, dynamicRootView, qq);
            case 12:
                return new DynamicDislikeFeedBack(context, dynamicRootView, qq);
            case 13:
                return new DynamicTimeOuter(context, dynamicRootView, qq);
            case 14:
                return new DynamicTimeOuterContainerWidgetImp(context, dynamicRootView, qq);
            case 15:
                if (Pm.mZx()) {
                    return new DynamicTimeOuterRewardFullSkip(context, dynamicRootView, qq);
                }
                return new DynamicTimeOuterSkip(context, dynamicRootView, qq);
            case 16:
                return new DynamicImageView(context, dynamicRootView, qq);
            case 18:
                return new DynamicSplitLineView(context, dynamicRootView, qq);
            case 19:
                return new DynamicSkipCountDownContainer(context, dynamicRootView, qq);
            case 20:
                return new DynamicSkipCountDown(context, dynamicRootView, qq);
            case 21:
                return new DynamicSkipCountDownBtn(context, dynamicRootView, qq);
            case 22:
                return new DynamicClose(context, dynamicRootView, qq);
            case 23:
                return new DynamicPrivacyView(context, dynamicRootView, qq);
            case 24:
                return new DynamicBaseScrollWidgetImp(context, dynamicRootView, qq);
            case 25:
                return new DynamicLeisureWidget(context, dynamicRootView, qq);
            case 26:
                if ("vertical".equals(qq.tp().Kbd().XT())) {
                    return new DynamicVerticalScrollWidgetImp(context, dynamicRootView, qq);
                }
                return new DynamicBaseInternalScrollWidgetImp(context, dynamicRootView, qq);
            case 27:
                return new DynamicTimeOuterSkip(context, dynamicRootView, qq);
            default:
                return null;
        }
    }
}
