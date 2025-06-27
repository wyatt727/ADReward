package androidx.privacysandbox.ads.adservices.adid;

import android.content.Context;
import androidx.core.os.OutcomeReceiverKt;
import androidx.privacysandbox.ads.adservices.internal.AdServicesInfo;
import com.json.mediationsdk.utils.c;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;

/* compiled from: AdIdManager.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000 \u00072\u00020\u0001:\u0002\u0006\u0007B\u0007\b\u0000¢\u0006\u0002\u0010\u0002J\u0011\u0010\u0003\u001a\u00020\u0004H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adid/AdIdManager;", "", "()V", "getAdId", "Landroidx/privacysandbox/ads/adservices/adid/AdId;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Api33Ext4Impl", "Companion", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class AdIdManager {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmStatic
    public static final AdIdManager obtain(Context context) {
        return INSTANCE.obtain(context);
    }

    public abstract Object getAdId(Continuation<? super AdId> continuation);

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AdIdManager.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0011\u0010\f\u001a\u00020\tH\u0097@ø\u0001\u0000¢\u0006\u0002\u0010\rJ\u0011\u0010\u000e\u001a\u00020\u000bH\u0083@ø\u0001\u0000¢\u0006\u0002\u0010\rR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adid/AdIdManager$Api33Ext4Impl;", "Landroidx/privacysandbox/ads/adservices/adid/AdIdManager;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "mAdIdManager", "Landroid/adservices/adid/AdIdManager;", "(Landroid/adservices/adid/AdIdManager;)V", "convertResponse", "Landroidx/privacysandbox/ads/adservices/adid/AdId;", c.Y1, "Landroid/adservices/adid/AdId;", "getAdId", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAdIdAsyncInternal", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final class Api33Ext4Impl extends AdIdManager {
        private final android.adservices.adid.AdIdManager mAdIdManager;

        public Api33Ext4Impl(android.adservices.adid.AdIdManager mAdIdManager) {
            Intrinsics.checkNotNullParameter(mAdIdManager, "mAdIdManager");
            this.mAdIdManager = mAdIdManager;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Api33Ext4Impl(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            Object systemService = context.getSystemService((Class<Object>) android.adservices.adid.AdIdManager.class);
            Intrinsics.checkNotNullExpressionValue(systemService, "context.getSystemService…:class.java\n            )");
            this((android.adservices.adid.AdIdManager) systemService);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
        @Override // androidx.privacysandbox.ads.adservices.adid.AdIdManager
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object getAdId(kotlin.coroutines.Continuation<? super androidx.privacysandbox.ads.adservices.adid.AdId> r5) throws java.lang.Throwable {
            /*
                r4 = this;
                boolean r0 = r5 instanceof androidx.privacysandbox.ads.adservices.adid.AdIdManager$Api33Ext4Impl$getAdId$1
                if (r0 == 0) goto L14
                r0 = r5
                androidx.privacysandbox.ads.adservices.adid.AdIdManager$Api33Ext4Impl$getAdId$1 r0 = (androidx.privacysandbox.ads.adservices.adid.AdIdManager$Api33Ext4Impl$getAdId$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r1 = r1 & r2
                if (r1 == 0) goto L14
                int r5 = r0.label
                int r5 = r5 - r2
                r0.label = r5
                goto L19
            L14:
                androidx.privacysandbox.ads.adservices.adid.AdIdManager$Api33Ext4Impl$getAdId$1 r0 = new androidx.privacysandbox.ads.adservices.adid.AdIdManager$Api33Ext4Impl$getAdId$1
                r0.<init>(r4, r5)
            L19:
                java.lang.Object r5 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L36
                if (r2 != r3) goto L2e
                java.lang.Object r0 = r0.L$0
                androidx.privacysandbox.ads.adservices.adid.AdIdManager$Api33Ext4Impl r0 = (androidx.privacysandbox.ads.adservices.adid.AdIdManager.Api33Ext4Impl) r0
                kotlin.ResultKt.throwOnFailure(r5)
                goto L45
            L2e:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L36:
                kotlin.ResultKt.throwOnFailure(r5)
                r0.L$0 = r4
                r0.label = r3
                java.lang.Object r5 = r4.getAdIdAsyncInternal(r0)
                if (r5 != r1) goto L44
                return r1
            L44:
                r0 = r4
            L45:
                android.adservices.adid.AdId r5 = (android.adservices.adid.AdId) r5
                androidx.privacysandbox.ads.adservices.adid.AdId r5 = r0.convertResponse(r5)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.privacysandbox.ads.adservices.adid.AdIdManager.Api33Ext4Impl.getAdId(kotlin.coroutines.Continuation):java.lang.Object");
        }

        private final AdId convertResponse(android.adservices.adid.AdId response) {
            String adId = response.getAdId();
            Intrinsics.checkNotNullExpressionValue(adId, "response.adId");
            return new AdId(adId, response.isLimitAdTrackingEnabled());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Object getAdIdAsyncInternal(Continuation<? super android.adservices.adid.AdId> continuation) {
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
            cancellableContinuationImpl.initCancellability();
            this.mAdIdManager.getAdId(AdIdManager$Api33Ext4Impl$$ExternalSyntheticLambda0.INSTANCE, OutcomeReceiverKt.asOutcomeReceiver(cancellableContinuationImpl));
            Object result = cancellableContinuationImpl.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return result;
        }
    }

    /* compiled from: AdIdManager.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adid/AdIdManager$Companion;", "", "()V", "obtain", "Landroidx/privacysandbox/ads/adservices/adid/AdIdManager;", "context", "Landroid/content/Context;", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final AdIdManager obtain(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (AdServicesInfo.INSTANCE.version() >= 4) {
                return new Api33Ext4Impl(context);
            }
            return null;
        }
    }
}
