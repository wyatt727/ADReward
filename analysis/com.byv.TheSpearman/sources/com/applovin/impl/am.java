package com.applovin.impl;

import android.net.Uri;
import android.text.TextUtils;
import com.applovin.impl.d1;
import com.applovin.impl.e1;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.ue;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinErrorCodes;
import com.applovin.sdk.AppLovinSdkUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vungle.ads.internal.model.AdPayload;
import java.io.Closeable;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public abstract class am extends xl implements ue.a {
    protected final com.applovin.impl.sdk.ad.b h;
    protected final s2 i;
    private AppLovinAdLoadListener j;
    private final com.applovin.impl.sdk.p k;
    private final Collection l;
    private boolean m;
    protected ExecutorService n;
    protected ExecutorService o;
    protected List p;
    protected String q;

    public interface e {
        void a(String str);
    }

    protected List e() {
        if (com.applovin.impl.sdk.t.a()) {
            this.c.a(this.b, "Caching mute images...");
        }
        ArrayList arrayList = new ArrayList();
        if (this.h.L() != null) {
            arrayList.add(a(this.h.L().toString(), new a()));
        }
        if (this.h.e0() != null) {
            arrayList.add(a(this.h.e0().toString(), new b()));
        }
        return arrayList;
    }

    void f() {
        if (com.applovin.impl.sdk.t.a()) {
            this.c.a(this.b, "Rendered new ad:" + this.h);
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.am$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.i();
            }
        });
    }

    void j() {
        if (x3.f()) {
            return;
        }
        if (com.applovin.impl.sdk.t.a()) {
            this.c.a(this.b, "Caching mute images...");
        }
        Uri uriA = a(this.h.L(), CampaignEx.JSON_NATIVE_VIDEO_MUTE);
        if (uriA != null) {
            this.h.b(uriA);
        }
        Uri uriA2 = a(this.h.e0(), CampaignEx.JSON_NATIVE_VIDEO_UNMUTE);
        if (uriA2 != null) {
            this.h.c(uriA2);
        }
        if (com.applovin.impl.sdk.t.a()) {
            this.c.a(this.b, "Ad updated with muteImageFilename = " + this.h.L() + ", unmuteImageFilename = " + this.h.e0());
        }
    }

    am(String str, com.applovin.impl.sdk.ad.b bVar, com.applovin.impl.sdk.k kVar, AppLovinAdLoadListener appLovinAdLoadListener) {
        super(str, kVar);
        if (bVar != null) {
            this.h = bVar;
            this.j = appLovinAdLoadListener;
            this.k = kVar.D();
            this.l = h();
            this.i = new s2();
            if (((Boolean) kVar.a(oj.c1)).booleanValue()) {
                this.q = StringUtils.isValidString(bVar.H()) ? bVar.H() : UUID.randomUUID().toString();
                this.n = kVar.l0().a("com.applovin.sdk.caching." + this.q, ((Integer) kVar.a(oj.d1)).intValue());
                this.o = kVar.l0().a("com.applovin.sdk.caching.html." + this.q, ((Integer) kVar.a(oj.e1)).intValue());
                return;
            }
            return;
        }
        throw new IllegalArgumentException("No ad specified.");
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.h.a1()) {
            if (com.applovin.impl.sdk.t.a()) {
                this.c.a(this.b, "Subscribing to timeout events...");
            }
            this.f1179a.U().a(this);
        }
    }

    protected void k() {
        this.f1179a.U().b(this);
        ExecutorService executorService = this.n;
        if (executorService != null) {
            executorService.shutdown();
            this.n = null;
        }
        ExecutorService executorService2 = this.o;
        if (executorService2 != null) {
            executorService2.shutdown();
            this.o = null;
        }
    }

    protected boolean l() {
        return this.m;
    }

    protected void g() {
        this.m = true;
        List list = this.p;
        if (list != null && !list.isEmpty()) {
            Iterator it = this.p.iterator();
            while (it.hasNext()) {
                ((c1) it.next()).a(true);
            }
        }
        ExecutorService executorService = this.n;
        if (executorService != null) {
            executorService.shutdown();
            this.n = null;
        }
        ExecutorService executorService2 = this.o;
        if (executorService2 != null) {
            executorService2.shutdown();
            this.o = null;
        }
    }

    protected List a(List list) {
        this.p = list;
        return this.f1179a.l0().a(list, this.n);
    }

    class a implements e1.a {
        a() {
        }

        @Override // com.applovin.impl.e1.a
        public void a(Uri uri) {
            am.this.h.b(uri);
            com.applovin.impl.sdk.t tVar = am.this.c;
            if (com.applovin.impl.sdk.t.a()) {
                am amVar = am.this;
                amVar.c.a(amVar.b, "Ad updated with muteImageUri = " + uri);
            }
        }
    }

    class b implements e1.a {
        b() {
        }

        @Override // com.applovin.impl.e1.a
        public void a(Uri uri) {
            am.this.h.c(uri);
            com.applovin.impl.sdk.t tVar = am.this.c;
            if (com.applovin.impl.sdk.t.a()) {
                am amVar = am.this;
                amVar.c.a(amVar.b, "Ad updated with unmuteImageUri = " + uri);
            }
        }
    }

    class c implements e1.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ e1.a f275a;

        c(e1.a aVar) {
            this.f275a = aVar;
        }

        @Override // com.applovin.impl.e1.a
        public void a(Uri uri) {
            if (uri != null) {
                com.applovin.impl.sdk.t tVar = am.this.c;
                if (com.applovin.impl.sdk.t.a()) {
                    am amVar = am.this;
                    amVar.c.a(amVar.b, "Finish caching video for ad #" + am.this.h.getAdIdNumber() + ". Updating ad with cachedVideoURL = " + uri);
                }
                this.f275a.a(uri);
                return;
            }
            com.applovin.impl.sdk.t tVar2 = am.this.c;
            if (com.applovin.impl.sdk.t.a()) {
                am amVar2 = am.this;
                amVar2.c.b(amVar2.b, "Failed to cache video");
            }
            am.this.a(AppLovinErrorCodes.UNABLE_TO_PRECACHE_VIDEO_RESOURCES);
        }
    }

    class d implements d1.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ e f276a;

        d(e eVar) {
            this.f276a = eVar;
        }

        @Override // com.applovin.impl.d1.c
        public void a(String str, boolean z) {
            if (z) {
                am.this.a(AppLovinErrorCodes.UNABLE_TO_PRECACHE_HTML_RESOURCES);
                return;
            }
            e eVar = this.f276a;
            if (eVar != null) {
                eVar.a(str);
            }
        }
    }

    Uri c(String str) {
        return c(str, this.h.X(), true);
    }

    protected Uri b(String str) {
        return a(str, this.h.X(), true);
    }

    protected String d(String str, List list, boolean z) {
        if (((Boolean) this.f1179a.a(oj.M)).booleanValue()) {
            try {
                InputStream inputStreamA = this.k.a(str, list, z, this.i);
                if (inputStreamA == null) {
                    if (inputStreamA != null) {
                        inputStreamA.close();
                    }
                    return null;
                }
                try {
                    String strA = this.k.a(inputStreamA);
                    inputStreamA.close();
                    return strA;
                } finally {
                }
            } catch (Throwable th) {
                if (com.applovin.impl.sdk.t.a()) {
                    this.c.a(this.b, "Unknown failure to read input stream.", th);
                }
                this.c.a(this.b, th);
                this.f1179a.B().a(this.b, "readInputStreamAsString", th);
                return null;
            }
        }
        InputStream inputStreamA2 = this.k.a(str, list, z, this.i);
        if (inputStreamA2 == null) {
            return null;
        }
        try {
            return this.k.a(inputStreamA2);
        } catch (Throwable th2) {
            try {
                if (com.applovin.impl.sdk.t.a()) {
                    this.c.a(this.b, "Unknown failure to read input stream.", th2);
                }
                this.f1179a.B().a(this.b, "readInputStreamAsString", th2);
                return null;
            } finally {
                zp.a((Closeable) inputStreamA2, this.f1179a);
            }
        }
    }

    Uri c(String str, List list, boolean z) {
        if (!StringUtils.isValidString(str)) {
            return null;
        }
        if (com.applovin.impl.sdk.t.a()) {
            this.c.a(this.b, "Caching video " + str + "...");
        }
        String strA = this.k.a(a(), str, this.h.getCachePrefix(), list, z, this.i);
        if (StringUtils.isValidString(strA)) {
            File fileA = this.k.a(strA, a());
            if (fileA != null) {
                Uri uriFromFile = Uri.fromFile(fileA);
                if (uriFromFile != null) {
                    if (com.applovin.impl.sdk.t.a()) {
                        this.c.a(this.b, "Finish caching video for ad #" + this.h.getAdIdNumber() + ". Updating ad with cachedVideoFilename = " + strA);
                    }
                    return uriFromFile;
                }
                if (com.applovin.impl.sdk.t.a()) {
                    this.c.b(this.b, "Unable to create URI from cached video file = " + fileA);
                }
                this.f1179a.B().a(o.b.CACHE_ERROR, "extractUriFromVideoFile", (Map) CollectionUtils.hashMap("url", strA));
                return null;
            }
            if (com.applovin.impl.sdk.t.a()) {
                this.c.b(this.b, "Unable to retrieve File from cached video filename = " + strA);
            }
            this.f1179a.B().a(o.b.CACHE_ERROR, "retrieveVideoFile", (Map) CollectionUtils.hashMap("url", strA));
            return null;
        }
        if (com.applovin.impl.sdk.t.a()) {
            this.c.b(this.b, "Failed to cache video: " + str);
        }
        this.f1179a.B().a(o.b.CACHE_ERROR, "cacheVideo", (Map) CollectionUtils.hashMap("url", str));
        a(AppLovinErrorCodes.UNABLE_TO_PRECACHE_VIDEO_RESOURCES);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i() {
        AppLovinAdLoadListener appLovinAdLoadListener = this.j;
        if (appLovinAdLoadListener != null) {
            appLovinAdLoadListener.adReceived(this.h);
            this.j = null;
        }
    }

    private Collection h() {
        HashSet hashSet = new HashSet();
        for (char c2 : ((String) this.f1179a.a(oj.X0)).toCharArray()) {
            hashSet.add(Character.valueOf(c2));
        }
        hashSet.add('\"');
        return hashSet;
    }

    String b(String str, List list, boolean z) {
        InputStream inputStreamA;
        if (StringUtils.isValidString(str)) {
            Uri uri = Uri.parse(str);
            if (uri == null) {
                if (com.applovin.impl.sdk.t.a()) {
                    this.c.a(this.b, "Nothing to cache, skipping...");
                }
                return null;
            }
            try {
                File fileA = this.k.a(zp.a(uri, this.h.getCachePrefix(), this.f1179a), a());
                if (!this.k.a(fileA)) {
                    if (((Boolean) this.f1179a.a(oj.M)).booleanValue()) {
                        try {
                            InputStream inputStreamA2 = this.k.a(str, list, z, this.i);
                            try {
                                if (inputStreamA2 != null) {
                                    this.k.a(inputStreamA2, fileA);
                                } else {
                                    if (com.applovin.impl.sdk.t.a()) {
                                        this.c.b(this.b, "Failed to load resource: " + str);
                                    }
                                    this.f1179a.B().a(o.b.CACHE_ERROR, "cacheStringResource", (Map) CollectionUtils.hashMap("url", str));
                                }
                                if (inputStreamA2 != null) {
                                    inputStreamA2.close();
                                }
                            } finally {
                            }
                        } catch (Throwable th) {
                            this.c.a(this.b, th);
                            this.f1179a.B().a(this.b, "cacheStringResource", th);
                        }
                    } else {
                        try {
                            inputStreamA = this.k.a(str, list, z, this.i);
                            try {
                                if (inputStreamA != null) {
                                    this.k.a(inputStreamA, fileA);
                                } else {
                                    if (com.applovin.impl.sdk.t.a()) {
                                        this.c.b(this.b, "Failed to load resource: " + str);
                                    }
                                    this.f1179a.B().a(o.b.CACHE_ERROR, "cacheStringResource", (Map) CollectionUtils.hashMap("url", str));
                                }
                                zp.a((Closeable) inputStreamA, this.f1179a);
                            } catch (Throwable th2) {
                                th = th2;
                                zp.a((Closeable) inputStreamA, this.f1179a);
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            inputStreamA = null;
                        }
                    }
                }
                return this.k.e(fileA);
            } catch (Throwable th4) {
                if (com.applovin.impl.sdk.t.a()) {
                    this.c.a(this.b, "Resource at " + str + " failed to load.", th4);
                }
            }
        }
        return null;
    }

    private Uri a(String str, String str2) {
        File fileA = this.k.a(zp.a(Uri.parse(str2), this.h.getCachePrefix(), this.f1179a), com.applovin.impl.sdk.k.k());
        if (fileA == null) {
            return null;
        }
        if (this.k.a(fileA)) {
            this.i.a(fileA.length());
            return Uri.parse(AdPayload.FILE_SCHEME + fileA.getAbsolutePath());
        }
        if (!this.k.a(fileA, str + str2, Arrays.asList(str), this.i)) {
            return null;
        }
        return Uri.parse(AdPayload.FILE_SCHEME + fileA.getAbsolutePath());
    }

    protected e1 b(String str, e1.a aVar) {
        return a(str, this.h.X(), true, aVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x003c, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    java.lang.String a(java.lang.String r13, java.util.List r14, com.applovin.impl.sdk.ad.b r15) {
        /*
            Method dump skipped, instructions count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.am.a(java.lang.String, java.util.List, com.applovin.impl.sdk.ad.b):java.lang.String");
    }

    Uri a(String str, List list, boolean z) {
        try {
            String strA = this.k.a(a(), str, this.h.getCachePrefix(), list, z, this.i);
            if (StringUtils.isValidString(strA)) {
                File fileA = this.k.a(strA, a());
                if (fileA != null) {
                    Uri uriFromFile = Uri.fromFile(fileA);
                    if (uriFromFile != null) {
                        return uriFromFile;
                    }
                    if (com.applovin.impl.sdk.t.a()) {
                        this.c.b(this.b, "Unable to extract Uri from image file");
                    }
                    this.f1179a.B().a(o.b.CACHE_ERROR, "extractUriFromImageFile", (Map) CollectionUtils.hashMap("url", strA));
                    return null;
                }
                if (com.applovin.impl.sdk.t.a()) {
                    this.c.b(this.b, "Unable to retrieve File from cached image filename = " + strA);
                }
                this.f1179a.B().a(o.b.CACHE_ERROR, "retrieveImageFile", (Map) CollectionUtils.hashMap("url", strA));
                return null;
            }
            if (com.applovin.impl.sdk.t.a()) {
                this.c.b(this.b, "Failed to cache image: " + str);
            }
            this.f1179a.B().a(o.b.CACHE_ERROR, "cacheImageResource", (Map) CollectionUtils.hashMap("url", str));
            return null;
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.t.a()) {
                this.c.a(this.b, "Failed to cache image at url = " + str, th);
            }
            this.f1179a.B().a(this.b, "cacheImageResource", th, CollectionUtils.hashMap("url", str));
            return null;
        }
    }

    protected Uri a(Uri uri, String str) {
        if (uri == null) {
            if (com.applovin.impl.sdk.t.a()) {
                this.c.a(this.b, "No " + str + " image to cache");
            }
            return null;
        }
        String string = uri.toString();
        if (TextUtils.isEmpty(string)) {
            if (com.applovin.impl.sdk.t.a()) {
                this.c.a(this.b, "Failed to cache " + str + " image");
            }
            return null;
        }
        if (com.applovin.impl.sdk.t.a()) {
            this.c.a(this.b, "Caching " + str + " image...");
        }
        return b(string);
    }

    void a(com.applovin.impl.sdk.ad.b bVar) {
        String strA = a(bVar.g0(), bVar.h0(), bVar.N0(), bVar.X(), bVar.X0());
        if (bVar.M0() && StringUtils.isValidString(strA)) {
            String strA2 = a(strA, bVar.X(), bVar);
            bVar.a(strA2);
            this.c.f(this.b, "Ad updated with video button HTML assets cached = " + strA2);
        }
    }

    protected e1 a(String str, List list, boolean z, e1.a aVar) {
        if (TextUtils.isEmpty(str)) {
            if (!com.applovin.impl.sdk.t.a()) {
                return null;
            }
            this.c.a(this.b, "No video to cache, skipping...");
            return null;
        }
        if (com.applovin.impl.sdk.t.a()) {
            this.c.a(this.b, "Caching video " + str + "...");
        }
        return new e1(str, this.h, list, z, this.i, this.f1179a, new c(aVar));
    }

    void a(int i) {
        if (this.j != null) {
            if (com.applovin.impl.sdk.t.a()) {
                this.c.a(this.b, "Calling back ad load failed with error code: " + i);
            }
            this.j.failedToReceiveAd(i);
            this.j = null;
        }
        g();
    }

    @Override // com.applovin.impl.ue.a
    public void a(be beVar) {
        if (beVar.Q().equalsIgnoreCase(this.h.H())) {
            if (com.applovin.impl.sdk.t.a()) {
                this.c.b(this.b, "Updating flag for timeout...");
            }
            g();
        }
        this.f1179a.U().b(this);
    }

    String a(String str, String str2, boolean z, List list, boolean z2) {
        if (StringUtils.isValidString(str2)) {
            String strA = a(str2, z, list, z2);
            if (StringUtils.isValidString(strA)) {
                return strA;
            }
            if (TextUtils.isEmpty(str)) {
                a(AppLovinErrorCodes.UNABLE_TO_PRECACHE_HTML_RESOURCES);
                if (com.applovin.impl.sdk.t.a()) {
                    this.c.b(this.b, "Could not retrieve HTML from: " + str2 + " and HTML source is invalid.");
                }
                this.f1179a.B().a(o.b.CACHE_ERROR, "retrieveHtmlString", (Map) CollectionUtils.hashMap("url", str2));
            }
        }
        return str;
    }

    private String a(String str, boolean z, List list, boolean z2) {
        if (z) {
            return b(str, list, z2);
        }
        return d(str, list, z2);
    }

    protected e1 a(String str, e1.a aVar) {
        return new e1(str, this.h, this.i, this.f1179a, aVar);
    }

    protected d1 a(String str, List list, e eVar) {
        return new d1(str, this.h, list, this.i, this.o, this.f1179a, new d(eVar));
    }
}
