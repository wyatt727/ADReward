package com.unity3d.ads.adplayer;

import com.unity3d.services.core.di.KoinModule;
import com.unity3d.services.core.di.ServiceProvider;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.JobKt;
import org.koin.core.Koin;
import org.koin.core.annotation.Factory;
import org.koin.core.annotation.Named;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.TypeQualifier;
import org.koin.core.scope.Scope;
import org.koin.mp.KoinPlatformTools;

/* compiled from: AdPlayerScope.kt */
@Factory
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/unity3d/ads/adplayer/AdPlayerScope;", "Lorg/koin/core/component/KoinScopeComponent;", "Lkotlinx/coroutines/CoroutineScope;", "defaultDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lkotlinx/coroutines/CoroutineDispatcher;)V", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "scope", "Lorg/koin/core/scope/Scope;", "getScope", "()Lorg/koin/core/scope/Scope;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AdPlayerScope implements KoinScopeComponent, CoroutineScope {
    private final /* synthetic */ CoroutineScope $$delegate_0;
    private final CoroutineDispatcher defaultDispatcher;
    private final Scope scope;

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.$$delegate_0.getCoroutineContext();
    }

    public AdPlayerScope(@Named(ServiceProvider.DEFAULT_DISPATCHER) CoroutineDispatcher defaultDispatcher) {
        Intrinsics.checkNotNullParameter(defaultDispatcher, "defaultDispatcher");
        this.defaultDispatcher = defaultDispatcher;
        this.$$delegate_0 = CoroutineScopeKt.CoroutineScope(defaultDispatcher);
        Koin koin = KoinModule.INSTANCE.getSystem().getKoin();
        this.scope = koin.getScopeRegistry().createScope(KoinPlatformTools.INSTANCE.generateId(), new TypeQualifier(Reflection.getOrCreateKotlinClass(AdPlayerScope.class)), null);
        JobKt.getJob(getCoroutineContext()).invokeOnCompletion(new Function1<Throwable, Unit>() { // from class: com.unity3d.ads.adplayer.AdPlayerScope.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                AdPlayerScope.this.getScope().close();
            }
        });
    }

    @Override // org.koin.core.component.KoinScopeComponent
    @Deprecated(message = "not used internaly anymore")
    public void closeScope() {
        KoinScopeComponent.DefaultImpls.closeScope(this);
    }

    @Override // org.koin.core.component.KoinComponent
    public Koin getKoin() {
        return KoinScopeComponent.DefaultImpls.getKoin(this);
    }

    @Override // org.koin.core.component.KoinScopeComponent
    public Scope getScope() {
        return this.scope;
    }
}
