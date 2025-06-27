package org.koin.core.definition;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.koin.core.instance.InstanceFactory;
import org.koin.core.module.KoinDslMarker;
import org.koin.core.module.Module;

/* compiled from: KoinDefinition.kt */
@KoinDslMarker
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0004HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006HÆ\u0003J)\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lorg/koin/core/definition/KoinDefinition;", "R", "", "module", "Lorg/koin/core/module/Module;", "factory", "Lorg/koin/core/instance/InstanceFactory;", "(Lorg/koin/core/module/Module;Lorg/koin/core/instance/InstanceFactory;)V", "getFactory", "()Lorg/koin/core/instance/InstanceFactory;", "getModule", "()Lorg/koin/core/module/Module;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "koin-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class KoinDefinition<R> {
    private final InstanceFactory<R> factory;
    private final Module module;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ KoinDefinition copy$default(KoinDefinition koinDefinition, Module module, InstanceFactory instanceFactory, int i, Object obj) {
        if ((i & 1) != 0) {
            module = koinDefinition.module;
        }
        if ((i & 2) != 0) {
            instanceFactory = koinDefinition.factory;
        }
        return koinDefinition.copy(module, instanceFactory);
    }

    /* renamed from: component1, reason: from getter */
    public final Module getModule() {
        return this.module;
    }

    public final InstanceFactory<R> component2() {
        return this.factory;
    }

    public final KoinDefinition<R> copy(Module module, InstanceFactory<R> factory) {
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new KoinDefinition<>(module, factory);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KoinDefinition)) {
            return false;
        }
        KoinDefinition koinDefinition = (KoinDefinition) other;
        return Intrinsics.areEqual(this.module, koinDefinition.module) && Intrinsics.areEqual(this.factory, koinDefinition.factory);
    }

    public int hashCode() {
        return (this.module.hashCode() * 31) + this.factory.hashCode();
    }

    public String toString() {
        return "KoinDefinition(module=" + this.module + ", factory=" + this.factory + ')';
    }

    public KoinDefinition(Module module, InstanceFactory<R> factory) {
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(factory, "factory");
        this.module = module;
        this.factory = factory;
    }

    public final InstanceFactory<R> getFactory() {
        return this.factory;
    }

    public final Module getModule() {
        return this.module;
    }
}
