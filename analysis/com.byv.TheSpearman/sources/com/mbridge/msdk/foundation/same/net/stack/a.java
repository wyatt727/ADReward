package com.mbridge.msdk.foundation.same.net.stack;

import com.mbridge.msdk.foundation.same.net.i;
import com.mbridge.msdk.foundation.tools.ad;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import org.chromium.net.CronetEngine;
import org.chromium.net.UploadDataProviders;
import org.chromium.net.UrlRequest;

/* compiled from: CronetStack.java */
/* loaded from: classes4.dex */
public final class a implements b {

    /* renamed from: a, reason: collision with root package name */
    private BlockingQueue<com.mbridge.msdk.foundation.same.net.a.b> f2907a = new ArrayBlockingQueue(2, true);
    private CronetEngine b;

    public a() {
        ad.b("CronetStack", "Cronet stack init.");
        this.b = com.mbridge.msdk.foundation.same.net.a.a.a().c();
    }

    @Override // com.mbridge.msdk.foundation.same.net.stack.b
    public final com.mbridge.msdk.foundation.same.net.f.b performRequest(i<?> iVar) throws InterruptedException, IOException {
        com.mbridge.msdk.foundation.same.net.a.b bVarPoll;
        ad.b("CronetStack", "CronetStack request start : " + iVar.s() + " " + a(iVar));
        int iP = iVar.p();
        int iM = iVar.m();
        if (iP == 0) {
            iP = 30000;
        }
        if (iM == 0) {
            iM = 30000;
        }
        ad.b("CronetStack", "Cronet writeTimeout : " + iP + " readTimeout : " + iM);
        UrlRequest.Builder builderNewUrlRequestBuilder = this.b.newUrlRequestBuilder(iVar.s(), new com.mbridge.msdk.foundation.same.net.a.c(this.f2907a), com.mbridge.msdk.foundation.same.net.a.a.a().b());
        int iB = iVar.b();
        int i = 4;
        if (iB == 1) {
            i = 2;
        } else if (iB != 3 && iB != 4) {
            i = 3;
        }
        UrlRequest.Builder builderAllowDirectExecutor = builderNewUrlRequestBuilder.setPriority(i).setHttpMethod(a(iVar)).allowDirectExecutor();
        if (iVar.k() != null) {
            for (Map.Entry<String, String> entry : iVar.k().entrySet()) {
                builderAllowDirectExecutor.addHeader(entry.getKey(), entry.getValue());
            }
        }
        if (iVar.h() != null) {
            builderAllowDirectExecutor.setUploadDataProvider(UploadDataProviders.create(iVar.h()), com.mbridge.msdk.foundation.same.net.a.a.a().b());
        }
        UrlRequest urlRequestBuild = builderAllowDirectExecutor.build();
        urlRequestBuild.start();
        try {
            bVarPoll = this.f2907a.poll(iP, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
        if (bVarPoll == null) {
            a(urlRequestBuild, iVar);
            this.f2907a.clear();
            ad.b("CronetStack", "Request cancel because request timeout");
            throw new IOException("request timeout.");
        }
        if (bVarPoll.c() == 0) {
            bVarPoll = this.f2907a.poll(iM, TimeUnit.MILLISECONDS);
        }
        bVarB = bVarPoll.c() == 1 ? bVarPoll.b() : null;
        if (bVarPoll.c() == 2) {
            throw new IOException(bVarPoll.a());
        }
        if (bVarB == null) {
            a(urlRequestBuild, iVar);
            this.f2907a.clear();
            ad.b("CronetStack", "response cancel because response timeout");
            throw new IOException("Response timeout.");
        }
        ad.b("CronetStack", "HttpResponse : " + bVarB.c() + " content : " + bVarB.a().toString());
        return bVarB;
    }

    private String a(i<?> iVar) {
        switch (iVar.l()) {
            case 0:
                return "GET";
            case 1:
                return "POST";
            case 2:
                return "PUT";
            case 3:
                return "DELETE";
            case 4:
                return "HEAD";
            case 5:
                return "OPTIONS";
            case 6:
                return "TRACE";
            case 7:
                return "PATCH";
            default:
                throw new IllegalStateException("Unknown method type.");
        }
    }

    private void a(UrlRequest urlRequest, i<?> iVar) {
        if (urlRequest != null) {
            urlRequest.cancel();
        }
        if (iVar != null) {
            iVar.a();
        }
    }
}
