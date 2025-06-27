package org.koin.core.definition;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import org.koin.ext.KClassExtKt;

/* compiled from: BeanDefinition.kt */
@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u001aw\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062)\b\b\u0010\u0007\u001a#\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u0002H\u00020\bj\b\u0012\u0004\u0012\u0002H\u0002`\u000b¢\u0006\u0002\b\f2\u0012\b\u0002\u0010\r\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u0006H\u0086\bø\u0001\u0000\u001a$\u0010\u0011\u001a\u00020\u00122\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0010\u001a\u00020\u0006*>\u0010\u0015\u001a\u0004\b\u0000\u0010\u0002\"\u0019\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u0002H\u00020\b¢\u0006\u0002\b\f2\u0019\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u0002H\u00020\b¢\u0006\u0002\b\f*\n\u0010\u0016\"\u00020\u00122\u00020\u0012\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0017"}, d2 = {"_createDefinition", "Lorg/koin/core/definition/BeanDefinition;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "kind", "Lorg/koin/core/definition/Kind;", "qualifier", "Lorg/koin/core/qualifier/Qualifier;", "definition", "Lkotlin/Function2;", "Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "Lorg/koin/core/definition/Definition;", "Lkotlin/ExtensionFunctionType;", "secondaryTypes", "", "Lkotlin/reflect/KClass;", "scopeQualifier", "indexKey", "", "clazz", "typeQualifier", "Definition", "IndexKey", "koin-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BeanDefinitionKt {
    public static final String indexKey(KClass<?> clazz, Qualifier qualifier, Qualifier scopeQualifier) {
        String value;
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(scopeQualifier, "scopeQualifier");
        if (qualifier == null || (value = qualifier.getValue()) == null) {
            value = "";
        }
        return KClassExtKt.getFullName(clazz) + AbstractJsonLexerKt.COLON + value + AbstractJsonLexerKt.COLON + scopeQualifier;
    }

    public static /* synthetic */ BeanDefinition _createDefinition$default(Kind kind, Qualifier qualifier, Function2 definition, List list, Qualifier scopeQualifier, int i, Object obj) {
        if ((i & 1) != 0) {
            kind = Kind.Singleton;
        }
        Kind kind2 = kind;
        if ((i & 2) != 0) {
            qualifier = null;
        }
        Qualifier qualifier2 = qualifier;
        if ((i & 8) != 0) {
            list = CollectionsKt.emptyList();
        }
        List secondaryTypes = list;
        Intrinsics.checkNotNullParameter(kind2, "kind");
        Intrinsics.checkNotNullParameter(definition, "definition");
        Intrinsics.checkNotNullParameter(secondaryTypes, "secondaryTypes");
        Intrinsics.checkNotNullParameter(scopeQualifier, "scopeQualifier");
        Intrinsics.reifiedOperationMarker(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        return new BeanDefinition(scopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), qualifier2, definition, kind2, secondaryTypes);
    }

    public static final /* synthetic */ <T> BeanDefinition<T> _createDefinition(Kind kind, Qualifier qualifier, Function2<? super Scope, ? super ParametersHolder, ? extends T> definition, List<? extends KClass<?>> secondaryTypes, Qualifier scopeQualifier) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(definition, "definition");
        Intrinsics.checkNotNullParameter(secondaryTypes, "secondaryTypes");
        Intrinsics.checkNotNullParameter(scopeQualifier, "scopeQualifier");
        Intrinsics.reifiedOperationMarker(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        return new BeanDefinition<>(scopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), qualifier, definition, kind, secondaryTypes);
    }
}
