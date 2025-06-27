package com.unity3d.ads.core.domain.om;

import android.content.Context;
import com.unity3d.ads.core.data.repository.OpenMeasurementRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import org.koin.core.annotation.Single;

/* compiled from: InitializeOMAndroidSDK.kt */
@Single
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0011\u0010\u000b\u001a\u00020\fH\u0096Bø\u0001\u0000¢\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lcom/unity3d/ads/core/domain/om/InitializeOMAndroidSDK;", "Lcom/unity3d/ads/core/domain/om/InitializeOMSDK;", "context", "Landroid/content/Context;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "omRepository", "Lcom/unity3d/ads/core/data/repository/OpenMeasurementRepository;", "(Landroid/content/Context;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/data/repository/OpenMeasurementRepository;)V", "invoke", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class InitializeOMAndroidSDK implements InitializeOMSDK {
    private final Context context;
    private final OpenMeasurementRepository omRepository;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;

    /* compiled from: InitializeOMAndroidSDK.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.unity3d.ads.core.domain.om.InitializeOMAndroidSDK", f = "InitializeOMAndroidSDK.kt", i = {0, 0}, l = {28}, m = "invoke", n = {"this", "startTime"}, s = {"L$0", "J$0"})
    /* renamed from: com.unity3d.ads.core.domain.om.InitializeOMAndroidSDK$invoke$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl {
        long J$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return InitializeOMAndroidSDK.this.invoke(this);
        }
    }

    public InitializeOMAndroidSDK(Context context, SendDiagnosticEvent sendDiagnosticEvent, SessionRepository sessionRepository, OpenMeasurementRepository omRepository) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        Intrinsics.checkNotNullParameter(omRepository, "omRepository");
        this.context = context;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.sessionRepository = sessionRepository;
        this.omRepository = omRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.unity3d.ads.core.domain.om.InitializeOMSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(kotlin.coroutines.Continuation<? super kotlin.Unit> r15) throws java.lang.Throwable {
        /*
            r14 = this;
            boolean r0 = r15 instanceof com.unity3d.ads.core.domain.om.InitializeOMAndroidSDK.AnonymousClass1
            if (r0 == 0) goto L14
            r0 = r15
            com.unity3d.ads.core.domain.om.InitializeOMAndroidSDK$invoke$1 r0 = (com.unity3d.ads.core.domain.om.InitializeOMAndroidSDK.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r15 = r0.label
            int r15 = r15 - r2
            r0.label = r15
            goto L19
        L14:
            com.unity3d.ads.core.domain.om.InitializeOMAndroidSDK$invoke$1 r0 = new com.unity3d.ads.core.domain.om.InitializeOMAndroidSDK$invoke$1
            r0.<init>(r15)
        L19:
            java.lang.Object r15 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            long r1 = r0.J$0
            java.lang.Object r0 = r0.L$0
            com.unity3d.ads.core.domain.om.InitializeOMAndroidSDK r0 = (com.unity3d.ads.core.domain.om.InitializeOMAndroidSDK) r0
            kotlin.ResultKt.throwOnFailure(r15)
            goto L6a
        L30:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L38:
            kotlin.ResultKt.throwOnFailure(r15)
            com.unity3d.ads.core.data.repository.SessionRepository r15 = r14.sessionRepository
            boolean r15 = r15.isOmEnabled()
            if (r15 == 0) goto Lca
            kotlin.time.TimeSource$Monotonic r15 = kotlin.time.TimeSource.Monotonic.INSTANCE
            long r4 = r15.m2527markNowz9LOYto()
            com.unity3d.ads.core.domain.SendDiagnosticEvent r6 = r14.sendDiagnosticEvent
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 30
            r13 = 0
            java.lang.String r7 = "om_activate_started"
            com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(r6, r7, r8, r9, r10, r11, r12, r13)
            com.unity3d.ads.core.data.repository.OpenMeasurementRepository r15 = r14.omRepository
            android.content.Context r2 = r14.context
            r0.L$0 = r14
            r0.J$0 = r4
            r0.label = r3
            java.lang.Object r15 = r15.activateOM(r2, r0)
            if (r15 != r1) goto L68
            return r1
        L68:
            r0 = r14
            r1 = r4
        L6a:
            com.unity3d.ads.core.data.model.OMResult r15 = (com.unity3d.ads.core.data.model.OMResult) r15
            boolean r3 = r15 instanceof com.unity3d.ads.core.data.model.OMResult.Success
            if (r3 == 0) goto L8a
            com.unity3d.ads.core.domain.SendDiagnosticEvent r4 = r0.sendDiagnosticEvent
            kotlin.time.TimeSource$Monotonic$ValueTimeMark r15 = kotlin.time.TimeSource.Monotonic.ValueTimeMark.m2528boximpl(r1)
            double r0 = com.unity3d.ads.core.extensions.TimeExtensionsKt.elapsedMillis(r15)
            java.lang.Double r6 = kotlin.coroutines.jvm.internal.Boxing.boxDouble(r0)
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 28
            r11 = 0
            java.lang.String r5 = "om_activate_success_time"
            com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(r4, r5, r6, r7, r8, r9, r10, r11)
            goto Lca
        L8a:
            boolean r3 = r15 instanceof com.unity3d.ads.core.data.model.OMResult.Failure
            if (r3 == 0) goto Lca
            com.unity3d.ads.core.domain.SendDiagnosticEvent r4 = r0.sendDiagnosticEvent
            kotlin.time.TimeSource$Monotonic$ValueTimeMark r0 = kotlin.time.TimeSource.Monotonic.ValueTimeMark.m2528boximpl(r1)
            double r0 = com.unity3d.ads.core.extensions.TimeExtensionsKt.elapsedMillis(r0)
            java.lang.Double r6 = kotlin.coroutines.jvm.internal.Boxing.boxDouble(r0)
            java.util.Map r0 = kotlin.collections.MapsKt.createMapBuilder()
            com.unity3d.ads.core.data.model.OMResult$Failure r15 = (com.unity3d.ads.core.data.model.OMResult.Failure) r15
            java.lang.String r1 = r15.getReason()
            java.lang.String r2 = "reason"
            r0.put(r2, r1)
            java.lang.String r1 = r15.getReasonDebug()
            if (r1 == 0) goto Lba
            java.lang.String r15 = r15.getReasonDebug()
            java.lang.String r1 = "reason_debug"
            r0.put(r1, r15)
        Lba:
            kotlin.Unit r15 = kotlin.Unit.INSTANCE
            java.util.Map r7 = kotlin.collections.MapsKt.build(r0)
            r8 = 0
            r9 = 0
            r10 = 24
            r11 = 0
            java.lang.String r5 = "om_activate_failure_time"
            com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(r4, r5, r6, r7, r8, r9, r10, r11)
        Lca:
            kotlin.Unit r15 = kotlin.Unit.INSTANCE
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.om.InitializeOMAndroidSDK.invoke(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
