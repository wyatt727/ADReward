package com.facebook.ads.internal.api;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;

/* loaded from: classes2.dex */
public abstract class AdComponentFrameLayout extends FrameLayout implements AdComponentView {
    private AdComponentViewApi mAdComponentViewApi;
    private final AdComponentViewParentApi mAdComponentViewParentApi;

    public AdComponentFrameLayout(Context context) {
        super(context);
        this.mAdComponentViewParentApi = new AdComponentViewParentApi() { // from class: com.facebook.ads.internal.api.AdComponentFrameLayout.1
            @Override // com.facebook.ads.internal.api.AdComponentView
            public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
                AdComponentFrameLayout.super.setLayoutParams(layoutParams);
            }

            @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
            public void onMeasure(int i, int i2) {
                AdComponentFrameLayout.super.onMeasure(i, i2);
            }

            @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
            public void onAttachedToWindow() {
                AdComponentFrameLayout.super.onAttachedToWindow();
            }

            @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
            public void onDetachedFromWindow() {
                AdComponentFrameLayout.super.onDetachedFromWindow();
            }

            @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
            public void setMeasuredDimension(int i, int i2) {
                AdComponentFrameLayout.super.setMeasuredDimension(i, i2);
            }

            @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
            public void bringChildToFront(View view) {
                AdComponentFrameLayout.super.bringChildToFront(view);
            }

            @Override // com.facebook.ads.internal.api.AdComponentView
            public void onWindowFocusChanged(boolean z) {
                AdComponentFrameLayout.super.onWindowFocusChanged(z);
            }

            @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
            public void onVisibilityChanged(View view, int i) {
                AdComponentFrameLayout.super.onVisibilityChanged(view, i);
            }

            @Override // com.facebook.ads.internal.api.AdComponentView
            public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
                AdComponentFrameLayout.super.addView(view, i, layoutParams);
            }

            @Override // com.facebook.ads.internal.api.AdComponentView
            public void addView(View view) {
                AdComponentFrameLayout.super.addView(view);
            }

            @Override // com.facebook.ads.internal.api.AdComponentView
            public void addView(View view, int i) {
                AdComponentFrameLayout.super.addView(view, i);
            }

            @Override // com.facebook.ads.internal.api.AdComponentView, android.view.ViewManager
            public void addView(View view, ViewGroup.LayoutParams layoutParams) {
                AdComponentFrameLayout.super.addView(view, layoutParams);
            }

            @Override // com.facebook.ads.internal.api.AdComponentView
            public void addView(View view, int i, int i2) {
                AdComponentFrameLayout.super.addView(view, i, i2);
            }
        };
    }

    public AdComponentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mAdComponentViewParentApi = new AdComponentViewParentApi() { // from class: com.facebook.ads.internal.api.AdComponentFrameLayout.1
            @Override // com.facebook.ads.internal.api.AdComponentView
            public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
                AdComponentFrameLayout.super.setLayoutParams(layoutParams);
            }

            @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
            public void onMeasure(int i, int i2) {
                AdComponentFrameLayout.super.onMeasure(i, i2);
            }

            @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
            public void onAttachedToWindow() {
                AdComponentFrameLayout.super.onAttachedToWindow();
            }

            @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
            public void onDetachedFromWindow() {
                AdComponentFrameLayout.super.onDetachedFromWindow();
            }

            @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
            public void setMeasuredDimension(int i, int i2) {
                AdComponentFrameLayout.super.setMeasuredDimension(i, i2);
            }

            @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
            public void bringChildToFront(View view) {
                AdComponentFrameLayout.super.bringChildToFront(view);
            }

            @Override // com.facebook.ads.internal.api.AdComponentView
            public void onWindowFocusChanged(boolean z) {
                AdComponentFrameLayout.super.onWindowFocusChanged(z);
            }

            @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
            public void onVisibilityChanged(View view, int i) {
                AdComponentFrameLayout.super.onVisibilityChanged(view, i);
            }

            @Override // com.facebook.ads.internal.api.AdComponentView
            public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
                AdComponentFrameLayout.super.addView(view, i, layoutParams);
            }

            @Override // com.facebook.ads.internal.api.AdComponentView
            public void addView(View view) {
                AdComponentFrameLayout.super.addView(view);
            }

            @Override // com.facebook.ads.internal.api.AdComponentView
            public void addView(View view, int i) {
                AdComponentFrameLayout.super.addView(view, i);
            }

            @Override // com.facebook.ads.internal.api.AdComponentView, android.view.ViewManager
            public void addView(View view, ViewGroup.LayoutParams layoutParams) {
                AdComponentFrameLayout.super.addView(view, layoutParams);
            }

            @Override // com.facebook.ads.internal.api.AdComponentView
            public void addView(View view, int i, int i2) {
                AdComponentFrameLayout.super.addView(view, i, i2);
            }
        };
    }

    public AdComponentFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mAdComponentViewParentApi = new AdComponentViewParentApi() { // from class: com.facebook.ads.internal.api.AdComponentFrameLayout.1
            @Override // com.facebook.ads.internal.api.AdComponentView
            public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
                AdComponentFrameLayout.super.setLayoutParams(layoutParams);
            }

            @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
            public void onMeasure(int i2, int i22) {
                AdComponentFrameLayout.super.onMeasure(i2, i22);
            }

            @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
            public void onAttachedToWindow() {
                AdComponentFrameLayout.super.onAttachedToWindow();
            }

            @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
            public void onDetachedFromWindow() {
                AdComponentFrameLayout.super.onDetachedFromWindow();
            }

            @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
            public void setMeasuredDimension(int i2, int i22) {
                AdComponentFrameLayout.super.setMeasuredDimension(i2, i22);
            }

            @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
            public void bringChildToFront(View view) {
                AdComponentFrameLayout.super.bringChildToFront(view);
            }

            @Override // com.facebook.ads.internal.api.AdComponentView
            public void onWindowFocusChanged(boolean z) {
                AdComponentFrameLayout.super.onWindowFocusChanged(z);
            }

            @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
            public void onVisibilityChanged(View view, int i2) {
                AdComponentFrameLayout.super.onVisibilityChanged(view, i2);
            }

            @Override // com.facebook.ads.internal.api.AdComponentView
            public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
                AdComponentFrameLayout.super.addView(view, i2, layoutParams);
            }

            @Override // com.facebook.ads.internal.api.AdComponentView
            public void addView(View view) {
                AdComponentFrameLayout.super.addView(view);
            }

            @Override // com.facebook.ads.internal.api.AdComponentView
            public void addView(View view, int i2) {
                AdComponentFrameLayout.super.addView(view, i2);
            }

            @Override // com.facebook.ads.internal.api.AdComponentView, android.view.ViewManager
            public void addView(View view, ViewGroup.LayoutParams layoutParams) {
                AdComponentFrameLayout.super.addView(view, layoutParams);
            }

            @Override // com.facebook.ads.internal.api.AdComponentView
            public void addView(View view, int i2, int i22) {
                AdComponentFrameLayout.super.addView(view, i2, i22);
            }
        };
    }

    public AdComponentFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.mAdComponentViewParentApi = new AdComponentViewParentApi() { // from class: com.facebook.ads.internal.api.AdComponentFrameLayout.1
            @Override // com.facebook.ads.internal.api.AdComponentView
            public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
                AdComponentFrameLayout.super.setLayoutParams(layoutParams);
            }

            @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
            public void onMeasure(int i22, int i222) {
                AdComponentFrameLayout.super.onMeasure(i22, i222);
            }

            @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
            public void onAttachedToWindow() {
                AdComponentFrameLayout.super.onAttachedToWindow();
            }

            @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
            public void onDetachedFromWindow() {
                AdComponentFrameLayout.super.onDetachedFromWindow();
            }

            @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
            public void setMeasuredDimension(int i22, int i222) {
                AdComponentFrameLayout.super.setMeasuredDimension(i22, i222);
            }

            @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
            public void bringChildToFront(View view) {
                AdComponentFrameLayout.super.bringChildToFront(view);
            }

            @Override // com.facebook.ads.internal.api.AdComponentView
            public void onWindowFocusChanged(boolean z) {
                AdComponentFrameLayout.super.onWindowFocusChanged(z);
            }

            @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
            public void onVisibilityChanged(View view, int i22) {
                AdComponentFrameLayout.super.onVisibilityChanged(view, i22);
            }

            @Override // com.facebook.ads.internal.api.AdComponentView
            public void addView(View view, int i22, ViewGroup.LayoutParams layoutParams) {
                AdComponentFrameLayout.super.addView(view, i22, layoutParams);
            }

            @Override // com.facebook.ads.internal.api.AdComponentView
            public void addView(View view) {
                AdComponentFrameLayout.super.addView(view);
            }

            @Override // com.facebook.ads.internal.api.AdComponentView
            public void addView(View view, int i22) {
                AdComponentFrameLayout.super.addView(view, i22);
            }

            @Override // com.facebook.ads.internal.api.AdComponentView, android.view.ViewManager
            public void addView(View view, ViewGroup.LayoutParams layoutParams) {
                AdComponentFrameLayout.super.addView(view, layoutParams);
            }

            @Override // com.facebook.ads.internal.api.AdComponentView
            public void addView(View view, int i22, int i222) {
                AdComponentFrameLayout.super.addView(view, i22, i222);
            }
        };
    }

    protected void attachAdComponentViewApi(AdComponentViewApiProvider adComponentViewApiProvider) {
        if (DynamicLoaderFactory.isFallbackMode()) {
            return;
        }
        if (this.mAdComponentViewApi == null) {
            adComponentViewApiProvider.getAdComponentViewApi().onAttachedToView(this, this.mAdComponentViewParentApi);
            this.mAdComponentViewApi = adComponentViewApiProvider.getAdComponentViewApi();
            return;
        }
        throw new IllegalStateException("AdComponentViewApi can't be attached more then once.");
    }

    @Override // android.view.ViewGroup, com.facebook.ads.internal.api.AdComponentView
    public void addView(View view) {
        AdComponentViewApi adComponentViewApi = this.mAdComponentViewApi;
        if (adComponentViewApi != null) {
            adComponentViewApi.addView(view);
        } else {
            super.addView(view);
        }
    }

    @Override // android.view.ViewGroup, com.facebook.ads.internal.api.AdComponentView
    public void addView(View view, int i) {
        AdComponentViewApi adComponentViewApi = this.mAdComponentViewApi;
        if (adComponentViewApi != null) {
            adComponentViewApi.addView(view, i);
        } else {
            super.addView(view, i);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager, com.facebook.ads.internal.api.AdComponentView
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        AdComponentViewApi adComponentViewApi = this.mAdComponentViewApi;
        if (adComponentViewApi != null) {
            adComponentViewApi.addView(view, layoutParams);
        } else {
            super.addView(view, layoutParams);
        }
    }

    @Override // android.view.ViewGroup, com.facebook.ads.internal.api.AdComponentView
    public void addView(View view, int i, int i2) {
        AdComponentViewApi adComponentViewApi = this.mAdComponentViewApi;
        if (adComponentViewApi != null) {
            adComponentViewApi.addView(view, i, i2);
        } else {
            super.addView(view, i, i2);
        }
    }

    @Override // android.view.ViewGroup, com.facebook.ads.internal.api.AdComponentView
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        AdComponentViewApi adComponentViewApi = this.mAdComponentViewApi;
        if (adComponentViewApi != null) {
            adComponentViewApi.addView(view, i, layoutParams);
        } else {
            super.addView(view, i, layoutParams);
        }
    }

    @Override // android.view.View, com.facebook.ads.internal.api.AdComponentView
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        AdComponentViewApi adComponentViewApi = this.mAdComponentViewApi;
        if (adComponentViewApi != null) {
            adComponentViewApi.setLayoutParams(layoutParams);
        } else {
            super.setLayoutParams(layoutParams);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        AdComponentViewApi adComponentViewApi = this.mAdComponentViewApi;
        if (adComponentViewApi != null) {
            adComponentViewApi.onMeasure(i, i2);
        } else {
            super.onMeasure(i, i2);
        }
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
        AdComponentViewApi adComponentViewApi = this.mAdComponentViewApi;
        if (adComponentViewApi != null) {
            adComponentViewApi.onVisibilityChanged(view, i);
        } else {
            super.onVisibilityChanged(view, i);
        }
    }

    @Override // android.view.View, com.facebook.ads.internal.api.AdComponentView
    public void onWindowFocusChanged(boolean z) {
        AdComponentViewApi adComponentViewApi = this.mAdComponentViewApi;
        if (adComponentViewApi != null) {
            adComponentViewApi.onWindowFocusChanged(z);
        } else {
            super.onWindowFocusChanged(z);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        AdComponentViewApi adComponentViewApi = this.mAdComponentViewApi;
        if (adComponentViewApi != null) {
            adComponentViewApi.onAttachedToWindow();
        } else {
            super.onAttachedToWindow();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        AdComponentViewApi adComponentViewApi = this.mAdComponentViewApi;
        if (adComponentViewApi != null) {
            adComponentViewApi.onDetachedFromWindow();
        } else {
            super.onDetachedFromWindow();
        }
    }
}
