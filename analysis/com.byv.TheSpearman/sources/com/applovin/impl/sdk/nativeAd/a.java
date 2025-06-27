package com.applovin.impl.sdk.nativeAd;

import android.net.Uri;
import com.applovin.impl.s2;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.xl;
import java.io.File;
import java.util.Collections;

/* loaded from: classes.dex */
public class a extends xl {
    private final s2 h;
    private final AppLovinNativeAdImpl i;
    private final InterfaceC0044a j;

    /* renamed from: com.applovin.impl.sdk.nativeAd.a$a, reason: collision with other inner class name */
    public interface InterfaceC0044a {
        void a(AppLovinNativeAdImpl appLovinNativeAdImpl);
    }

    public a(AppLovinNativeAdImpl appLovinNativeAdImpl, k kVar, InterfaceC0044a interfaceC0044a) {
        super("TaskCacheNativeAd", kVar);
        this.h = new s2();
        this.i = appLovinNativeAdImpl;
        this.j = interfaceC0044a;
    }

    private Uri a(Uri uri) {
        if (uri == null) {
            return null;
        }
        if (t.a()) {
            this.c.a(this.b, "Attempting to cache resource: " + uri);
        }
        String strA = this.f1179a.D().a(a(), uri.toString(), this.i.getCachePrefix(), Collections.emptyList(), false, false, this.h);
        if (StringUtils.isValidString(strA)) {
            File fileA = this.f1179a.D().a(strA, a());
            if (fileA != null) {
                Uri uriFromFile = Uri.fromFile(fileA);
                if (uriFromFile != null) {
                    return uriFromFile;
                }
                if (t.a()) {
                    this.c.b(this.b, "Unable to extract Uri from image file");
                }
            } else if (t.a()) {
                this.c.b(this.b, "Unable to retrieve File from cached image filename = " + strA);
            }
        }
        return null;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (t.a()) {
            this.c.a(this.b, "Begin caching ad #" + this.i.getAdIdNumber() + "...");
        }
        Uri uriA = a(this.i.getIconUri());
        if (uriA != null) {
            this.i.setIconUri(uriA);
        }
        Uri uriA2 = a(this.i.getMainImageUri());
        if (uriA2 != null) {
            this.i.setMainImageUri(uriA2);
        }
        Uri uriA3 = a(this.i.getPrivacyIconUri());
        if (uriA3 != null) {
            this.i.setPrivacyIconUri(uriA3);
        }
        if (t.a()) {
            this.c.a(this.b, "Finished caching ad #" + this.i.getAdIdNumber());
        }
        this.j.a(this.i);
    }
}
