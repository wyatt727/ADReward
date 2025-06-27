package com.iab.omid.library.corpmailru.adsession;

import android.view.View;
import com.iab.omid.library.corpmailru.d.e;
import com.iab.omid.library.corpmailru.publisher.AdSessionStatePublisher;

/* loaded from: classes4.dex */
public abstract class AdSession {
    public static AdSession createAdSession(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        e.a();
        e.a(adSessionConfiguration, "AdSessionConfiguration is null");
        e.a(adSessionContext, "AdSessionContext is null");
        return new a(adSessionConfiguration, adSessionContext);
    }

    public abstract void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str);

    public abstract void error(ErrorType errorType, String str);

    public abstract void finish();

    public abstract String getAdSessionId();

    public abstract AdSessionStatePublisher getAdSessionStatePublisher();

    public abstract void registerAdView(View view);

    public abstract void removeAllFriendlyObstructions();

    public abstract void removeFriendlyObstruction(View view);

    public abstract void start();
}
