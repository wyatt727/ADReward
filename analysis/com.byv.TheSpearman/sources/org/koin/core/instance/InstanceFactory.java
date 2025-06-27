package org.koin.core.instance;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.error.InstanceCreationException;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.parameter.ParametersHolderKt;
import org.koin.core.scope.Scope;
import org.koin.mp.KoinPlatformTools;

/* compiled from: InstanceFactory.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b&\u0018\u0000 \u0019*\u0004\b\u0000\u0010\u00012\u00060\u0002j\u0002`\u0003:\u0001\u0019B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0002\u0010\u0006J\u0015\u0010\t\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\fJ\u0014\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010H&J\b\u0010\u0011\u001a\u00020\u000eH&J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\u0015\u0010\u0015\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\u000bH&¢\u0006\u0002\u0010\fJ\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0014\u0010\u0018\u001a\u00020\u00132\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH&R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u001a"}, d2 = {"Lorg/koin/core/instance/InstanceFactory;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Lorg/koin/mp/Lockable;", "beanDefinition", "Lorg/koin/core/definition/BeanDefinition;", "(Lorg/koin/core/definition/BeanDefinition;)V", "getBeanDefinition", "()Lorg/koin/core/definition/BeanDefinition;", "create", "context", "Lorg/koin/core/instance/InstanceContext;", "(Lorg/koin/core/instance/InstanceContext;)Ljava/lang/Object;", "drop", "", "scope", "Lorg/koin/core/scope/Scope;", "dropAll", "equals", "", "other", "get", "hashCode", "", "isCreated", "Companion", "koin-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class InstanceFactory<T> {
    public static final String ERROR_SEPARATOR = "\n\t";
    private final BeanDefinition<T> beanDefinition;

    public abstract void drop(Scope scope);

    public abstract void dropAll();

    public abstract T get(InstanceContext context);

    public abstract boolean isCreated(InstanceContext context);

    public InstanceFactory(BeanDefinition<T> beanDefinition) {
        Intrinsics.checkNotNullParameter(beanDefinition, "beanDefinition");
        this.beanDefinition = beanDefinition;
    }

    public final BeanDefinition<T> getBeanDefinition() {
        return this.beanDefinition;
    }

    public T create(InstanceContext context) throws InstanceCreationException {
        Intrinsics.checkNotNullParameter(context, "context");
        context.getLogger().debug("| (+) '" + this.beanDefinition + '\'');
        try {
            ParametersHolder parameters = context.getParameters();
            if (parameters == null) {
                parameters = ParametersHolderKt.emptyParametersHolder();
            }
            return this.beanDefinition.getDefinition().invoke(context.getScope(), parameters);
        } catch (Exception e) {
            String stackTrace = KoinPlatformTools.INSTANCE.getStackTrace(e);
            context.getLogger().error("* Instance creation error : could not create instance for '" + this.beanDefinition + "': " + stackTrace);
            throw new InstanceCreationException("Could not create instance for '" + this.beanDefinition + '\'', e);
        }
    }

    public static /* synthetic */ boolean isCreated$default(InstanceFactory instanceFactory, InstanceContext instanceContext, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: isCreated");
        }
        if ((i & 1) != 0) {
            instanceContext = null;
        }
        return instanceFactory.isCreated(instanceContext);
    }

    public static /* synthetic */ void drop$default(InstanceFactory instanceFactory, Scope scope, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drop");
        }
        if ((i & 1) != 0) {
            scope = null;
        }
        instanceFactory.drop(scope);
    }

    public boolean equals(Object other) {
        InstanceFactory instanceFactory = other instanceof InstanceFactory ? (InstanceFactory) other : null;
        return Intrinsics.areEqual(this.beanDefinition, instanceFactory != null ? instanceFactory.beanDefinition : null);
    }

    public int hashCode() {
        return this.beanDefinition.hashCode();
    }
}
