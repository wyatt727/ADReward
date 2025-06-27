package com.mbridge.msdk.foundation.same.net.a;

import java.io.ByteArrayOutputStream;
import java.nio.channels.WritableByteChannel;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import org.chromium.net.UrlRequest;

/* compiled from: DefaultCronetCallback.java */
/* loaded from: classes4.dex */
public final class c extends UrlRequest.Callback {

    /* renamed from: a, reason: collision with root package name */
    BlockingQueue<b> f2866a;
    ByteArrayOutputStream b = null;
    com.mbridge.msdk.foundation.same.net.f.b c = null;
    WritableByteChannel d = null;
    AtomicBoolean e = new AtomicBoolean(false);

    public c(BlockingQueue<b> blockingQueue) {
        this.f2866a = blockingQueue;
    }
}
