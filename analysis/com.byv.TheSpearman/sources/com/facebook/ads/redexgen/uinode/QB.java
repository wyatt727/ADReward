package com.facebook.ads.redexgen.uinode;

import android.view.View;
import java.util.ArrayList;

/* loaded from: assets/audience_network.dex */
public interface QB {
    View getView();

    ArrayList<View> getViewsForInteraction();

    void unregisterView();
}
