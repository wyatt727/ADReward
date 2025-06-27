package com.my.target.nativeads;

import android.view.View;
import java.util.List;

/* loaded from: classes4.dex */
public interface INativeAd {
    int getAdChoicesPlacement();

    int getCachePolicy();

    void handleData(String str);

    void load();

    void loadFromBid(String str);

    void registerView(View view);

    void registerView(View view, List<View> list);

    void setAdChoicesPlacement(int i);

    void setCachePolicy(int i);

    void unregisterView();
}
