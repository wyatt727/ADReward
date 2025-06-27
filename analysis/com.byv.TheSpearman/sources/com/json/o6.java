package com.json;

import android.os.Handler;
import android.os.Looper;
import com.json.t2;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b!\u0010\"J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001a\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007J\u001a\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007J\u001a\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007J\u001a\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007J\b\u0010\n\u001a\u0004\u0018\u00010\rJ\u0006\u0010\t\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0011R\"\u0010\u0016\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u000b\u0010\u0014\"\u0004\b\n\u0010\u0015R\u001b\u0010\u001a\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\f\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001cR\u0014\u0010 \u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001c¨\u0006#"}, d2 = {"Lcom/ironsource/o6;", "", "Ljava/lang/Runnable;", t2.h.h, "", "f", "", "delay", "", "c", "a", "d", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Landroid/os/Looper;", "Ljava/util/concurrent/ThreadPoolExecutor;", "e", "Landroid/os/Handler;", "Landroid/os/Handler;", "uiHandler", "Z", "()Z", "(Z)V", "useSharedExecutorService", "Lcom/ironsource/lc;", "Lkotlin/Lazy;", "()Lcom/ironsource/lc;", "executorService", "Lcom/ironsource/v8;", "Lcom/ironsource/v8;", "backgroundHandler", "publisherCallbackHandler", "g", "releaseHandler", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class o6 {

    /* renamed from: c, reason: from kotlin metadata */
    private static boolean useSharedExecutorService;

    /* renamed from: e, reason: from kotlin metadata */
    private static final v8 backgroundHandler;

    /* renamed from: f, reason: from kotlin metadata */
    private static final v8 publisherCallbackHandler;

    /* renamed from: g, reason: from kotlin metadata */
    private static final v8 releaseHandler;

    /* renamed from: a, reason: collision with root package name */
    public static final o6 f2043a = new o6();

    /* renamed from: b, reason: from kotlin metadata */
    private static final Handler uiHandler = new Handler(Looper.getMainLooper());

    /* renamed from: d, reason: from kotlin metadata */
    private static final Lazy executorService = LazyKt.lazy(a.f2044a);

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/ironsource/lc;", "a", "()Lcom/ironsource/lc;"}, k = 3, mv = {1, 8, 0})
    static final class a extends Lambda implements Function0<lc> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f2044a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final lc invoke() {
            return new lc(0, null, null, 7, null);
        }
    }

    static {
        v8 v8Var = new v8("isadplayer-background");
        v8Var.start();
        v8Var.a();
        backgroundHandler = v8Var;
        v8 v8Var2 = new v8("isadplayer-publisher-callbacks");
        v8Var2.start();
        v8Var2.a();
        publisherCallbackHandler = v8Var2;
        v8 v8Var3 = new v8("isadplayer-release");
        v8Var3.start();
        v8Var3.a();
        releaseHandler = v8Var3;
    }

    private o6() {
    }

    public static /* synthetic */ void a(o6 o6Var, Runnable runnable, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        o6Var.a(runnable, j);
    }

    private final lc b() {
        return (lc) executorService.getValue();
    }

    public static /* synthetic */ void b(o6 o6Var, Runnable runnable, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        o6Var.b(runnable, j);
    }

    public static /* synthetic */ void c(o6 o6Var, Runnable runnable, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        o6Var.c(runnable, j);
    }

    public static /* synthetic */ void d(o6 o6Var, Runnable runnable, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        o6Var.d(runnable, j);
    }

    private final boolean f(Runnable action) {
        return useSharedExecutorService && b().getQueue().contains(action);
    }

    public final Looper a() {
        return backgroundHandler.getLooper();
    }

    public final void a(Runnable action) {
        Intrinsics.checkNotNullParameter(action, "action");
        a(this, action, 0L, 2, null);
    }

    public final void a(Runnable action, long delay) {
        Intrinsics.checkNotNullParameter(action, "action");
        backgroundHandler.a(action, delay);
    }

    public final void a(boolean z) {
        useSharedExecutorService = z;
    }

    public final void b(Runnable action) {
        Intrinsics.checkNotNullParameter(action, "action");
        b(this, action, 0L, 2, null);
    }

    public final void b(Runnable action, long delay) {
        Intrinsics.checkNotNullParameter(action, "action");
        publisherCallbackHandler.a(action, delay);
    }

    public final ThreadPoolExecutor c() {
        return b();
    }

    public final void c(Runnable action) {
        Intrinsics.checkNotNullParameter(action, "action");
        c(this, action, 0L, 2, null);
    }

    public final void c(Runnable action, long delay) {
        Intrinsics.checkNotNullParameter(action, "action");
        uiHandler.postDelayed(action, delay);
    }

    public final void d(Runnable action) {
        Intrinsics.checkNotNullParameter(action, "action");
        d(this, action, 0L, 2, null);
    }

    public final void d(Runnable action, long delay) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (useSharedExecutorService) {
            b().schedule(action, delay, TimeUnit.MILLISECONDS);
        } else {
            releaseHandler.a(action, delay);
        }
    }

    public final boolean d() {
        return useSharedExecutorService;
    }

    public final void e(Runnable action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (f(action)) {
            b().remove(action);
        } else {
            releaseHandler.b(action);
        }
    }
}
