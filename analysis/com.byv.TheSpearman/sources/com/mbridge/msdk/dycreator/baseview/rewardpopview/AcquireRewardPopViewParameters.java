package com.mbridge.msdk.dycreator.baseview.rewardpopview;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.ad;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class AcquireRewardPopViewParameters {
    public AcquireRewardPopViewBehaviourListener behaviourListener;
    public String failTip;
    public String failTitle;
    public String language;
    public String placementId;
    public List<String> rightAnswerList;
    public String slideSuccessTitle;
    public String slideTip;
    public String slideTitle;
    public String successTip;
    public String successTitle;
    public String tips;
    public String title;
    public String unitId;
    public int viewType;
    public List<String> wrongAnswerList;
    public int autoDismissTime = 5;
    public int reduceTime = 0;
    public boolean canClickMaskArea = true;
    public int viewBackLayerTopColor = AcquireRewardPopViewConst.DEFAULT_COLOR_FFC27A;
    public int viewBackLayerBottomColor = AcquireRewardPopViewConst.DEFAULT_COLOR_FF932B;
    public int viewForegroundTopColor = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBE2;
    public int viewForegroundBottomColor = AcquireRewardPopViewConst.DEFAULT_COLOR_FFE0B5;
    public int buttonBackgroundLightColor = AcquireRewardPopViewConst.DEFAULT_COLOR_FF8B00;
    public int buttonBackgroundDarkColor = AcquireRewardPopViewConst.DEFAULT_COLOR_33EF7601;
    public int titleTextColor = AcquireRewardPopViewConst.DEFAULT_COLOR_E56F19;
    public int tipTextColor = AcquireRewardPopViewConst.DEFAULT_COLOR_89664C;
    public int buttonTextLightColor = -1;
    public int buttonTextDarkColor = AcquireRewardPopViewConst.DEFAULT_COLOR_D26700;
    public int successTipTextColor = -1;
    public int failTipTextColor = -1;
    public int containerBackgroundColor = AcquireRewardPopViewConst.DEFAULT_COLOR_50000000;
    public int successTitleGradientStartColor = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
    public int successTitleGradientEndColor = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
    public int successTitleShadowColor = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
    public int successTitleTextSize = 40;
    public float successTitleShadowRadius = 3.0f;
    public float successTitleShadowDx = 1.5f;
    public float successTitleShadowDy = 1.8f;
    public int failTitleGradientStartColor = -1;
    public int failTitleGradientEndColor = AcquireRewardPopViewConst.DEFAULT_COLOR_8B6B45;
    public int failTitleShadowColor = AcquireRewardPopViewConst.DEFAULT_COLOR_3B3127;
    public int failTitleTextSize = 40;
    public float failTitleShadowRadius = 3.0f;
    public float failTitleShadowDx = 1.5f;
    public float failTitleShadowDy = 1.8f;

    public static Builder builder(String str, String str2, int i, String str3) {
        if (TextUtils.isEmpty(str2)) {
            ad.b("AcquireRewardPopViewParameters", "Unit id must not null.");
            return null;
        }
        if (i == 0) {
            i = 1;
        }
        if (TextUtils.isEmpty(str3)) {
            str3 = "EN";
        }
        return new Builder(str, str2, i, str3);
    }

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        private AcquireRewardPopViewParameters f2628a;

        /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public Builder(java.lang.String r3, java.lang.String r4, int r5, java.lang.String r6) {
            /*
                Method dump skipped, instructions count: 365
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.dycreator.baseview.rewardpopview.AcquireRewardPopViewParameters.Builder.<init>(java.lang.String, java.lang.String, int, java.lang.String):void");
        }

        public Builder setAutoDismissTime(int i) {
            this.f2628a.autoDismissTime = i;
            return this;
        }

        public Builder setReduceTime(int i) {
            this.f2628a.reduceTime = i;
            return this;
        }

        public Builder setCanClickMaskArea(boolean z) {
            this.f2628a.canClickMaskArea = z;
            return this;
        }

        public Builder setTitle(String str) {
            this.f2628a.title = str;
            return this;
        }

        public Builder setTips(String str) {
            this.f2628a.tips = str;
            return this;
        }

        public Builder setSuccessTitle(String str) {
            this.f2628a.successTitle = str;
            return this;
        }

        public Builder setSuccessTip(String str) {
            this.f2628a.successTip = str;
            return this;
        }

        public Builder setFailTitle(String str) {
            this.f2628a.failTitle = str;
            return this;
        }

        public Builder setFailTip(String str) {
            this.f2628a.failTip = str;
            return this;
        }

        public Builder setSlideTitle(String str) {
            this.f2628a.slideTitle = str;
            return this;
        }

        public Builder setSlideTip(String str) {
            this.f2628a.slideTip = str;
            return this;
        }

        public Builder setSlideSuccessTitle(String str) {
            this.f2628a.slideSuccessTitle = str;
            return this;
        }

        public Builder setRightAnswerList(ArrayList<String> arrayList) {
            this.f2628a.rightAnswerList = arrayList;
            return this;
        }

        public Builder setWrongAnswerList(ArrayList<String> arrayList) {
            this.f2628a.wrongAnswerList = arrayList;
            return this;
        }

        public Builder setViewBackLayerTopColor(int i) {
            this.f2628a.viewBackLayerTopColor = i;
            return this;
        }

        public Builder setViewBackLayerBottomColor(int i) {
            this.f2628a.viewBackLayerBottomColor = i;
            return this;
        }

        public Builder setViewForegroundTopColor(int i) {
            this.f2628a.viewForegroundTopColor = i;
            return this;
        }

        public Builder setViewForegroundBottomColor(int i) {
            this.f2628a.viewForegroundBottomColor = i;
            return this;
        }

        public Builder setButtonBackgroundLightColor(int i) {
            this.f2628a.buttonBackgroundLightColor = i;
            return this;
        }

        public Builder setButtonBackgroundDarkColor(int i) {
            this.f2628a.buttonBackgroundDarkColor = i;
            return this;
        }

        public Builder setTitleTextColor(int i) {
            this.f2628a.titleTextColor = i;
            return this;
        }

        public Builder setTipTextColor(int i) {
            this.f2628a.tipTextColor = i;
            return this;
        }

        public Builder setButtonTextLightColor(int i) {
            this.f2628a.buttonTextLightColor = i;
            return this;
        }

        public Builder setButtonTextDarkColor(int i) {
            this.f2628a.buttonTextDarkColor = i;
            return this;
        }

        public Builder setSuccessTipTextColor(int i) {
            this.f2628a.successTipTextColor = i;
            return this;
        }

        public Builder setFailTipTextColor(int i) {
            this.f2628a.failTipTextColor = i;
            return this;
        }

        public Builder setContainerBackgroundColor(int i) {
            this.f2628a.containerBackgroundColor = i;
            return this;
        }

        public Builder setSuccessTitleGradientStartColor(int i) {
            this.f2628a.successTitleGradientStartColor = i;
            return this;
        }

        public Builder setSuccessTitleGradientEndColor(int i) {
            this.f2628a.successTitleGradientEndColor = i;
            return this;
        }

        public Builder setSuccessTitleShadowColor(int i) {
            this.f2628a.successTitleShadowColor = i;
            return this;
        }

        public Builder setSuccessTitleTextSize(int i) {
            this.f2628a.successTitleTextSize = i;
            return this;
        }

        public Builder setSuccessTitleShadowRadius(float f) {
            this.f2628a.successTitleShadowRadius = f;
            return this;
        }

        public Builder setSuccessTitleShadowDx(float f) {
            this.f2628a.successTitleShadowDx = f;
            return this;
        }

        public Builder setSuccessTitleShadowDy(float f) {
            this.f2628a.successTitleShadowDy = f;
            return this;
        }

        public Builder setFailTitleGradientStartColor(int i) {
            this.f2628a.failTitleGradientStartColor = i;
            return this;
        }

        public Builder setFailTitleGradientEndColor(int i) {
            this.f2628a.failTitleGradientEndColor = i;
            return this;
        }

        public Builder setFailTitleShadowColor(int i) {
            this.f2628a.failTitleShadowColor = i;
            return this;
        }

        public Builder setFailTitleTextSize(int i) {
            this.f2628a.failTitleTextSize = i;
            return this;
        }

        public Builder setFailTitleShadowRadius(float f) {
            this.f2628a.failTitleShadowRadius = f;
            return this;
        }

        public Builder setFailTitleShadowDx(float f) {
            this.f2628a.failTitleShadowDx = f;
            return this;
        }

        public Builder setFailTitleShadowDy(float f) {
            this.f2628a.failTitleShadowDy = f;
            return this;
        }

        public Builder setBehaviourListener(AcquireRewardPopViewBehaviourListener acquireRewardPopViewBehaviourListener) {
            this.f2628a.behaviourListener = acquireRewardPopViewBehaviourListener;
            return this;
        }

        public AcquireRewardPopViewParameters build() {
            return this.f2628a;
        }
    }
}
