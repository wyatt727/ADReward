package com.unity3d.services.core.extensions;

import com.google.android.gms.ads.RequestConfiguration;
import com.json.t2;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Deferred;
import org.objectweb.asm.Opcodes;

/* compiled from: CoroutineExtensions.kt */
@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aJ\u0010\n\u001a\u0002H\u000b\"\u0004\b\u0000\u0010\u000b2\u0006\u0010\f\u001a\u00020\u00022)\b\u0004\u0010\r\u001a#\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000b0\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000e¢\u0006\u0002\b\u0011H\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\u0012\u001a.\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00150\u0014\"\u0004\b\u0000\u0010\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00150\u0017H\u0086\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0002\u0010\u0018\u001a.\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u00150\u0014\"\u0004\b\u0000\u0010\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00150\u0017H\u0086\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0002\u0010\u0018\"!\u0010\u0000\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b\u009920\u0001¨\u0006\u001a"}, d2 = {"deferreds", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lkotlinx/coroutines/Deferred;", "getDeferreds", "()Ljava/util/concurrent/ConcurrentHashMap;", "deferredsCleanLaunched", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getDeferredsCleanLaunched", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "memoize", RequestConfiguration.MAX_AD_CONTENT_RATING_T, t2.h.W, t2.h.h, "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "runReturnSuspendCatching", "Lkotlin/Result;", "R", "block", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "runSuspendCatching", "unity-ads_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CoroutineExtensionsKt {
    private static final ConcurrentHashMap<Object, Deferred<?>> deferreds = new ConcurrentHashMap<>();
    private static final AtomicBoolean deferredsCleanLaunched = new AtomicBoolean();

    public static final <R> Object runSuspendCatching(Function0<? extends R> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            Result.Companion companion = Result.INSTANCE;
            return Result.m1062constructorimpl(block.invoke());
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m1062constructorimpl(ResultKt.createFailure(th));
        }
    }

    public static final ConcurrentHashMap<Object, Deferred<?>> getDeferreds() {
        return deferreds;
    }

    public static final AtomicBoolean getDeferredsCleanLaunched() {
        return deferredsCleanLaunched;
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: CoroutineExtensions.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = Opcodes.ARETURN)
    @DebugMetadata(c = "com.unity3d.services.core.extensions.CoroutineExtensionsKt$memoize$2", f = "CoroutineExtensions.kt", i = {}, l = {50}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.services.core.extensions.CoroutineExtensionsKt$memoize$2, reason: invalid class name */
    public static final class AnonymousClass2<T> extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super T>, Object> {
        final /* synthetic */ Function2<CoroutineScope, Continuation<? super T>, Object> $action;
        final /* synthetic */ Object $key;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Object obj, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$key = obj;
            this.$action = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$key, this.$action, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super T> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                Deferred<?> deferredAsync$default = CoroutineExtensionsKt.getDeferreds().get(this.$key);
                if (deferredAsync$default == null || !deferredAsync$default.isActive()) {
                    deferredAsync$default = null;
                }
                if (deferredAsync$default == null) {
                    deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new CoroutineExtensionsKt$memoize$2$deferred$2(this.$action, null), 3, null);
                    CoroutineExtensionsKt.getDeferreds().put(this.$key, deferredAsync$default);
                }
                if (CoroutineExtensionsKt.getDeferreds().size() > 100 && !CoroutineExtensionsKt.getDeferredsCleanLaunched().getAndSet(true)) {
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(null), 3, null);
                }
                this.label = 1;
                obj = deferredAsync$default.await(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }

        public final Object invokeSuspend$$forInline(Object obj) {
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            Deferred<?> deferredAsync$default = CoroutineExtensionsKt.getDeferreds().get(this.$key);
            if (deferredAsync$default == null) {
                deferredAsync$default = null;
            } else if (!Boolean.valueOf(deferredAsync$default.isActive()).booleanValue()) {
                deferredAsync$default = null;
            }
            if (deferredAsync$default == null) {
                deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new CoroutineExtensionsKt$memoize$2$deferred$2(this.$action, null), 3, null);
                CoroutineExtensionsKt.getDeferreds().put(this.$key, deferredAsync$default);
                Unit unit = Unit.INSTANCE;
            } else {
                Intrinsics.checkNotNullExpressionValue(deferredAsync$default, "deferreds[key]?.takeIf {…o { deferreds[key] = it }");
            }
            Deferred<?> deferred = deferredAsync$default;
            if (CoroutineExtensionsKt.getDeferreds().size() > 100 && !CoroutineExtensionsKt.getDeferredsCleanLaunched().getAndSet(true)) {
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(null), 3, null);
            }
            InlineMarker.mark(0);
            Object objAwait = deferred.await(this);
            InlineMarker.mark(1);
            return objAwait;
        }

        /* compiled from: CoroutineExtensions.kt */
        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = Opcodes.ARETURN)
        @DebugMetadata(c = "com.unity3d.services.core.extensions.CoroutineExtensionsKt$memoize$2$1", f = "CoroutineExtensions.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.unity3d.services.core.extensions.CoroutineExtensionsKt$memoize$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;

            public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Set<Map.Entry<Object, Deferred<?>>> setEntrySet = CoroutineExtensionsKt.getDeferreds().entrySet();
                Intrinsics.checkNotNullExpressionValue(setEntrySet, "deferreds.entries");
                CollectionsKt.removeAll(setEntrySet, C03261.INSTANCE);
                CoroutineExtensionsKt.getDeferredsCleanLaunched().set(false);
                return Unit.INSTANCE;
            }

            /* compiled from: CoroutineExtensions.kt */
            @Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010'\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "it", "", "", "Lkotlinx/coroutines/Deferred;", "invoke", "(Ljava/util/Map$Entry;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = Opcodes.ARETURN)
            /* renamed from: com.unity3d.services.core.extensions.CoroutineExtensionsKt$memoize$2$1$1, reason: invalid class name and collision with other inner class name */
            public static final class C03261 extends Lambda implements Function1<Map.Entry<Object, Deferred<?>>, Boolean> {
                public static final C03261 INSTANCE = new C03261();

                public C03261() {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(Map.Entry<Object, Deferred<?>> it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return Boolean.valueOf(it.getValue().isCompleted());
                }
            }
        }
    }

    public static final <T> Object memoize(Object obj, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) {
        return CoroutineScopeKt.coroutineScope(new AnonymousClass2(obj, function2, null), continuation);
    }

    private static final <T> Object memoize$$forInline(Object obj, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) {
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(obj, function2, null);
        InlineMarker.mark(0);
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(anonymousClass2, continuation);
        InlineMarker.mark(1);
        return objCoroutineScope;
    }

    public static final <R> Object runReturnSuspendCatching(Function0<? extends R> block) {
        Object objM1062constructorimpl;
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            Result.Companion companion = Result.INSTANCE;
            objM1062constructorimpl = Result.m1062constructorimpl(block.invoke());
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM1062constructorimpl = Result.m1062constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m1069isSuccessimpl(objM1062constructorimpl)) {
            Result.Companion companion3 = Result.INSTANCE;
            return Result.m1062constructorimpl(objM1062constructorimpl);
        }
        Throwable thM1065exceptionOrNullimpl = Result.m1065exceptionOrNullimpl(objM1062constructorimpl);
        if (thM1065exceptionOrNullimpl == null) {
            return objM1062constructorimpl;
        }
        Result.Companion companion4 = Result.INSTANCE;
        return Result.m1062constructorimpl(ResultKt.createFailure(thM1065exceptionOrNullimpl));
    }
}
