package com.json;

import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.json.b6;
import com.json.mediationsdk.utils.IronSourceConstants;
import com.json.x7;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \b2\u00020\u00012\u00020\u0002:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016R\u001b\u0010\u000f\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0013\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/ironsource/ca;", "Lcom/ironsource/j6;", "Lcom/ironsource/i6;", "Lcom/ironsource/x7;", "d", "Lcom/ironsource/x7$a;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lcom/ironsource/b6;", "c", "Lcom/ironsource/b6$a;", "a", "Lcom/ironsource/tc;", "Lkotlin/Lazy;", CmcdHeadersFactory.OBJECT_TYPE_INIT_SEGMENT, "()Lcom/ironsource/tc;", "sessionDepthManager", "Lcom/ironsource/y3;", "f", "()Lcom/ironsource/y3;", "deviceInfoService", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class ca implements j6, i6 {

    /* renamed from: c, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Lazy<ca> d = LazyKt.lazy(a.f1721a);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Lazy sessionDepthManager;

    /* renamed from: b, reason: from kotlin metadata */
    private final Lazy deviceInfoService;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/ironsource/ca;", "a", "()Lcom/ironsource/ca;"}, k = 3, mv = {1, 8, 0})
    static final class a extends Lambda implements Function0<ca> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f1721a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ca invoke() {
            return new ca(null);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\fR\u001b\u0010\u0007\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0012\u001a\u00020\u000e8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0011\u0010\f\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/ironsource/ca$b;", "", "Lcom/ironsource/ca;", "instance$delegate", "Lkotlin/Lazy;", "c", "()Lcom/ironsource/ca;", i1.o, "Lcom/ironsource/j6;", "d", "()Lcom/ironsource/j6;", "getProvider$annotations", "()V", IronSourceConstants.EVENTS_PROVIDER, "Lcom/ironsource/i6;", "a", "()Lcom/ironsource/i6;", "getEditor$annotations", "editor", "<init>", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: com.ironsource.ca$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public static /* synthetic */ void b() {
        }

        private final ca c() {
            return (ca) ca.d.getValue();
        }

        @JvmStatic
        public static /* synthetic */ void e() {
        }

        public final i6 a() {
            return c();
        }

        public final j6 d() {
            return c();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/ironsource/y3;", "a", "()Lcom/ironsource/y3;"}, k = 3, mv = {1, 8, 0})
    static final class c extends Lambda implements Function0<y3> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f1722a = new c();

        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final y3 invoke() {
            return new y3();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/ironsource/tc;", "a", "()Lcom/ironsource/tc;"}, k = 3, mv = {1, 8, 0})
    static final class d extends Lambda implements Function0<tc> {

        /* renamed from: a, reason: collision with root package name */
        public static final d f1723a = new d();

        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final tc invoke() {
            return new tc();
        }
    }

    private ca() {
        this.sessionDepthManager = LazyKt.lazy(d.f1723a);
        this.deviceInfoService = LazyKt.lazy(c.f1722a);
    }

    public /* synthetic */ ca(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final y3 f() {
        return (y3) this.deviceInfoService.getValue();
    }

    public static final i6 g() {
        return INSTANCE.a();
    }

    public static final j6 h() {
        return INSTANCE.d();
    }

    private final tc i() {
        return (tc) this.sessionDepthManager.getValue();
    }

    @Override // com.json.i6
    public b6.a a() {
        return f();
    }

    @Override // com.json.i6
    public x7.a b() {
        return i();
    }

    @Override // com.json.j6
    public b6 c() {
        return f();
    }

    @Override // com.json.j6
    public x7 d() {
        return i();
    }
}
