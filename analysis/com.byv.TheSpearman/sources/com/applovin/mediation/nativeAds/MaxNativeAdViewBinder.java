package com.applovin.mediation.nativeAds;

import android.view.View;

/* loaded from: classes.dex */
public class MaxNativeAdViewBinder {
    protected final int advertiserTextViewId;
    protected final int bodyTextViewId;
    protected final int callToActionButtonId;
    protected final int iconContentViewId;
    protected final int iconImageViewId;
    protected final int layoutResourceId;
    protected final View mainView;
    protected final int mediaContentFrameLayoutId;
    protected final int mediaContentViewGroupId;
    protected final int optionsContentFrameLayoutId;
    protected final int optionsContentViewGroupId;
    protected final int starRatingContentViewGroupId;
    protected final String templateType;
    protected final int titleTextViewId;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        private final View f1267a;
        private final int b;
        private int c;
        private int d;
        private int e;
        private int f;
        private int g;
        private int h;
        private int i;
        private int j;
        private int k;
        private int l;
        private int m;
        private String n;

        public Builder(View view) {
            this(-1, view);
        }

        public MaxNativeAdViewBinder build() {
            return new MaxNativeAdViewBinder(this.f1267a, this.b, this.c, this.d, this.e, this.f, this.g, this.j, this.h, this.i, this.k, this.l, this.m, this.n);
        }

        public Builder setAdvertiserTextViewId(int i) {
            this.d = i;
            return this;
        }

        public Builder setBodyTextViewId(int i) {
            this.e = i;
            return this;
        }

        public Builder setCallToActionButtonId(int i) {
            this.m = i;
            return this;
        }

        @Deprecated
        protected Builder setIconContentViewId(int i) {
            this.g = i;
            return this;
        }

        public Builder setIconImageViewId(int i) {
            this.f = i;
            return this;
        }

        @Deprecated
        protected Builder setMediaContentFrameLayoutId(int i) {
            this.l = i;
            return this;
        }

        public Builder setMediaContentViewGroupId(int i) {
            this.k = i;
            return this;
        }

        @Deprecated
        protected Builder setOptionsContentFrameLayoutId(int i) {
            this.i = i;
            return this;
        }

        public Builder setOptionsContentViewGroupId(int i) {
            this.h = i;
            return this;
        }

        public Builder setStarRatingContentViewGroupId(int i) {
            this.j = i;
            return this;
        }

        protected Builder setTemplateType(String str) {
            this.n = str;
            return this;
        }

        public Builder setTitleTextViewId(int i) {
            this.c = i;
            return this;
        }

        public Builder(int i) {
            this(i, null);
        }

        private Builder(int i, View view) {
            this.c = -1;
            this.d = -1;
            this.e = -1;
            this.f = -1;
            this.g = -1;
            this.h = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.b = i;
            this.f1267a = view;
        }
    }

    private MaxNativeAdViewBinder(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, String str) {
        this.mainView = view;
        this.layoutResourceId = i;
        this.titleTextViewId = i2;
        this.advertiserTextViewId = i3;
        this.bodyTextViewId = i4;
        this.iconImageViewId = i5;
        this.iconContentViewId = i6;
        this.starRatingContentViewGroupId = i7;
        this.optionsContentViewGroupId = i8;
        this.optionsContentFrameLayoutId = i9;
        this.mediaContentViewGroupId = i10;
        this.mediaContentFrameLayoutId = i11;
        this.callToActionButtonId = i12;
        this.templateType = str;
    }
}
