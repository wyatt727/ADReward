package org.koin.core.module.dsl;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Callbacks;
import org.koin.core.definition.KoinDefinition;
import org.koin.core.instance.SingleInstanceFactory;
import org.koin.core.module.OptionDslMarker;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.qualifier.TypeQualifier;

/* compiled from: OptionDSL.kt */
@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001*\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0003H\u0086\b\u001a \u0010\u0004\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00032\u0010\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006\u001a\u000e\u0010\b\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0003\u001a\u0019\u0010\t\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001*\u0006\u0012\u0002\b\u00030\u0003H\u0086\b\u001a\u0016\u0010\t\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\n\u001a\u00020\u000b\u001a6\u0010\f\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u001e\u0010\f\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u0001H\u0002\u0012\u0004\u0012\u00020\u00010\rj\b\u0012\u0004\u0012\u0002H\u0002`\u000e\u001aK\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0010\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00102-\b\u0002\u0010\u0011\u001a'\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\rj\n\u0012\u0004\u0012\u0002H\u0002\u0018\u0001`\u0012¢\u0006\u0002\b\u0013\u001aK\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0010\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00102'\u0010\u0011\u001a#\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0003\u0012\u0004\u0012\u00020\u00010\rj\b\u0012\u0004\u0012\u0002H\u0002`\u0012¢\u0006\u0002\b\u0013H\u0087\fø\u0001\u0000*>\u0010\u0015\u001a\u0004\b\u0000\u0010\u0002\"\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0003\u0012\u0004\u0012\u00020\u00010\r¢\u0006\u0002\b\u00132\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0003\u0012\u0004\u0012\u00020\u00010\r¢\u0006\u0002\b\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0016"}, d2 = {"bind", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lorg/koin/core/definition/BeanDefinition;", "binds", "classes", "", "Lkotlin/reflect/KClass;", "createdAtStart", "named", "name", "", "onClose", "Lkotlin/Function1;", "Lorg/koin/core/definition/OnCloseCallback;", "onOptions", "Lorg/koin/core/definition/KoinDefinition;", "options", "Lorg/koin/core/module/dsl/DefinitionOptions;", "Lkotlin/ExtensionFunctionType;", "withOptions", "DefinitionOptions", "koin-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class OptionDSLKt {
    @OptionDslMarker
    public static final <T> KoinDefinition<T> withOptions(KoinDefinition<T> koinDefinition, Function1<? super BeanDefinition<T>, Unit> options) {
        Intrinsics.checkNotNullParameter(koinDefinition, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        BeanDefinition<T> beanDefinition = koinDefinition.getFactory().getBeanDefinition();
        Qualifier qualifier = beanDefinition.getQualifier();
        options.invoke(beanDefinition);
        if (!Intrinsics.areEqual(beanDefinition.getQualifier(), qualifier)) {
            koinDefinition.getModule().indexPrimaryType(koinDefinition.getFactory());
        }
        if (!beanDefinition.getSecondaryTypes().isEmpty()) {
            koinDefinition.getModule().indexSecondaryTypes(koinDefinition.getFactory());
        }
        if (beanDefinition.get_createdAtStart() && (koinDefinition.getFactory() instanceof SingleInstanceFactory)) {
            koinDefinition.getModule().prepareForCreationAtStart((SingleInstanceFactory) koinDefinition.getFactory());
        }
        return koinDefinition;
    }

    public static /* synthetic */ KoinDefinition onOptions$default(KoinDefinition koinDefinition, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = null;
        }
        return onOptions(koinDefinition, function1);
    }

    public static final void named(BeanDefinition<?> beanDefinition, String name) {
        Intrinsics.checkNotNullParameter(beanDefinition, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        beanDefinition.setQualifier(new StringQualifier(name));
    }

    public static final /* synthetic */ <T> void named(BeanDefinition<?> beanDefinition) {
        Intrinsics.checkNotNullParameter(beanDefinition, "<this>");
        Intrinsics.reifiedOperationMarker(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        beanDefinition.setQualifier(new TypeQualifier(Reflection.getOrCreateKotlinClass(Object.class)));
    }

    public static final /* synthetic */ <T> void bind(BeanDefinition<? extends T> beanDefinition) {
        Intrinsics.checkNotNullParameter(beanDefinition, "<this>");
        List<KClass<?>> secondaryTypes = beanDefinition.getSecondaryTypes();
        Intrinsics.reifiedOperationMarker(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        beanDefinition.setSecondaryTypes(CollectionsKt.plus((Collection<? extends KClass>) secondaryTypes, Reflection.getOrCreateKotlinClass(Object.class)));
    }

    public static final void binds(BeanDefinition<?> beanDefinition, List<? extends KClass<?>> classes) {
        Intrinsics.checkNotNullParameter(beanDefinition, "<this>");
        Intrinsics.checkNotNullParameter(classes, "classes");
        beanDefinition.setSecondaryTypes(CollectionsKt.plus((Collection) beanDefinition.getSecondaryTypes(), (Iterable) classes));
    }

    public static final void createdAtStart(BeanDefinition<?> beanDefinition) {
        Intrinsics.checkNotNullParameter(beanDefinition, "<this>");
        beanDefinition.set_createdAtStart(true);
    }

    public static final <T> void onClose(BeanDefinition<T> beanDefinition, Function1<? super T, Unit> onClose) {
        Intrinsics.checkNotNullParameter(beanDefinition, "<this>");
        Intrinsics.checkNotNullParameter(onClose, "onClose");
        beanDefinition.setCallbacks(new Callbacks<>(onClose));
    }

    public static final <T> KoinDefinition<T> onOptions(KoinDefinition<T> koinDefinition, Function1<? super BeanDefinition<T>, Unit> function1) {
        Intrinsics.checkNotNullParameter(koinDefinition, "<this>");
        if (function1 != null) {
            BeanDefinition<T> beanDefinition = koinDefinition.getFactory().getBeanDefinition();
            Qualifier qualifier = beanDefinition.getQualifier();
            function1.invoke(beanDefinition);
            if (!Intrinsics.areEqual(beanDefinition.getQualifier(), qualifier)) {
                koinDefinition.getModule().indexPrimaryType(koinDefinition.getFactory());
            }
            if (!beanDefinition.getSecondaryTypes().isEmpty()) {
                koinDefinition.getModule().indexSecondaryTypes(koinDefinition.getFactory());
            }
            if (beanDefinition.get_createdAtStart() && (koinDefinition.getFactory() instanceof SingleInstanceFactory)) {
                koinDefinition.getModule().prepareForCreationAtStart((SingleInstanceFactory) koinDefinition.getFactory());
            }
        }
        return koinDefinition;
    }
}
