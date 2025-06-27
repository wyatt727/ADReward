package org.koin.core.module.dsl;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function10;
import kotlin.jvm.functions.Function11;
import kotlin.jvm.functions.Function12;
import kotlin.jvm.functions.Function13;
import kotlin.jvm.functions.Function14;
import kotlin.jvm.functions.Function15;
import kotlin.jvm.functions.Function16;
import kotlin.jvm.functions.Function17;
import kotlin.jvm.functions.Function18;
import kotlin.jvm.functions.Function19;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function20;
import kotlin.jvm.functions.Function21;
import kotlin.jvm.functions.Function22;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.functions.Function9;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Kind;
import org.koin.core.definition.KoinDefinition;
import org.koin.core.instance.SingleInstanceFactory;
import org.koin.core.module.Module;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.registry.ScopeRegistry;
import org.koin.core.scope.Scope;
import org.objectweb.asm.Opcodes;

/* compiled from: SingleOf.kt */
@Metadata(d1 = {"\u0000ª\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a]\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001*\u00020\u00032\u000e\b\u0004\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00052-\b\n\u0010\u0006\u001a'\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007j\n\u0012\u0004\u0012\u0002H\u0002\u0018\u0001`\n¢\u0006\u0002\b\u000bH\u0086\bø\u0001\u0000\u001ak\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0006\b\u0001\u0010\f\u0018\u0001*\u00020\u00032\u0014\b\u0004\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\u00020\u00072-\b\n\u0010\u0006\u001a'\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007j\n\u0012\u0004\u0012\u0002H\u0002\u0018\u0001`\n¢\u0006\u0002\b\u000bH\u0086\bø\u0001\u0000\u001ay\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0006\b\u0001\u0010\f\u0018\u0001\"\u0006\b\u0002\u0010\r\u0018\u0001*\u00020\u00032\u001a\b\u0004\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u00020\u000e2-\b\n\u0010\u0006\u001a'\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007j\n\u0012\u0004\u0012\u0002H\u0002\u0018\u0001`\n¢\u0006\u0002\b\u000bH\u0086\bø\u0001\u0000\u001a\u0087\u0001\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0006\b\u0001\u0010\f\u0018\u0001\"\u0006\b\u0002\u0010\r\u0018\u0001\"\u0006\b\u0003\u0010\u000f\u0018\u0001*\u00020\u00032 \b\u0004\u0010\u0004\u001a\u001a\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u0002H\u00020\u00102-\b\n\u0010\u0006\u001a'\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007j\n\u0012\u0004\u0012\u0002H\u0002\u0018\u0001`\n¢\u0006\u0002\b\u000bH\u0086\bø\u0001\u0000\u001a\u0095\u0001\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0006\b\u0001\u0010\f\u0018\u0001\"\u0006\b\u0002\u0010\r\u0018\u0001\"\u0006\b\u0003\u0010\u000f\u0018\u0001\"\u0006\b\u0004\u0010\u0011\u0018\u0001*\u00020\u00032&\b\u0004\u0010\u0004\u001a \u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u0002H\u0011\u0012\u0004\u0012\u0002H\u00020\u00122-\b\n\u0010\u0006\u001a'\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007j\n\u0012\u0004\u0012\u0002H\u0002\u0018\u0001`\n¢\u0006\u0002\b\u000bH\u0086\bø\u0001\u0000\u001a£\u0001\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0006\b\u0001\u0010\f\u0018\u0001\"\u0006\b\u0002\u0010\r\u0018\u0001\"\u0006\b\u0003\u0010\u000f\u0018\u0001\"\u0006\b\u0004\u0010\u0011\u0018\u0001\"\u0006\b\u0005\u0010\u0013\u0018\u0001*\u00020\u00032,\b\u0004\u0010\u0004\u001a&\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u0002H\u0011\u0012\u0004\u0012\u0002H\u0013\u0012\u0004\u0012\u0002H\u00020\u00142-\b\n\u0010\u0006\u001a'\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007j\n\u0012\u0004\u0012\u0002H\u0002\u0018\u0001`\n¢\u0006\u0002\b\u000bH\u0086\bø\u0001\u0000\u001a±\u0001\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0006\b\u0001\u0010\f\u0018\u0001\"\u0006\b\u0002\u0010\r\u0018\u0001\"\u0006\b\u0003\u0010\u000f\u0018\u0001\"\u0006\b\u0004\u0010\u0011\u0018\u0001\"\u0006\b\u0005\u0010\u0013\u0018\u0001\"\u0006\b\u0006\u0010\u0015\u0018\u0001*\u00020\u000322\b\u0004\u0010\u0004\u001a,\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u0002H\u0011\u0012\u0004\u0012\u0002H\u0013\u0012\u0004\u0012\u0002H\u0015\u0012\u0004\u0012\u0002H\u00020\u00162-\b\n\u0010\u0006\u001a'\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007j\n\u0012\u0004\u0012\u0002H\u0002\u0018\u0001`\n¢\u0006\u0002\b\u000bH\u0086\bø\u0001\u0000\u001a¿\u0001\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0006\b\u0001\u0010\f\u0018\u0001\"\u0006\b\u0002\u0010\r\u0018\u0001\"\u0006\b\u0003\u0010\u000f\u0018\u0001\"\u0006\b\u0004\u0010\u0011\u0018\u0001\"\u0006\b\u0005\u0010\u0013\u0018\u0001\"\u0006\b\u0006\u0010\u0015\u0018\u0001\"\u0006\b\u0007\u0010\u0017\u0018\u0001*\u00020\u000328\b\u0004\u0010\u0004\u001a2\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u0002H\u0011\u0012\u0004\u0012\u0002H\u0013\u0012\u0004\u0012\u0002H\u0015\u0012\u0004\u0012\u0002H\u0017\u0012\u0004\u0012\u0002H\u00020\u00182-\b\n\u0010\u0006\u001a'\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007j\n\u0012\u0004\u0012\u0002H\u0002\u0018\u0001`\n¢\u0006\u0002\b\u000bH\u0086\bø\u0001\u0000\u001aÍ\u0001\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0006\b\u0001\u0010\f\u0018\u0001\"\u0006\b\u0002\u0010\r\u0018\u0001\"\u0006\b\u0003\u0010\u000f\u0018\u0001\"\u0006\b\u0004\u0010\u0011\u0018\u0001\"\u0006\b\u0005\u0010\u0013\u0018\u0001\"\u0006\b\u0006\u0010\u0015\u0018\u0001\"\u0006\b\u0007\u0010\u0017\u0018\u0001\"\u0006\b\b\u0010\u0019\u0018\u0001*\u00020\u00032>\b\u0004\u0010\u0004\u001a8\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u0002H\u0011\u0012\u0004\u0012\u0002H\u0013\u0012\u0004\u0012\u0002H\u0015\u0012\u0004\u0012\u0002H\u0017\u0012\u0004\u0012\u0002H\u0019\u0012\u0004\u0012\u0002H\u00020\u001a2-\b\n\u0010\u0006\u001a'\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007j\n\u0012\u0004\u0012\u0002H\u0002\u0018\u0001`\n¢\u0006\u0002\b\u000bH\u0086\bø\u0001\u0000\u001aÛ\u0001\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0006\b\u0001\u0010\f\u0018\u0001\"\u0006\b\u0002\u0010\r\u0018\u0001\"\u0006\b\u0003\u0010\u000f\u0018\u0001\"\u0006\b\u0004\u0010\u0011\u0018\u0001\"\u0006\b\u0005\u0010\u0013\u0018\u0001\"\u0006\b\u0006\u0010\u0015\u0018\u0001\"\u0006\b\u0007\u0010\u0017\u0018\u0001\"\u0006\b\b\u0010\u0019\u0018\u0001\"\u0006\b\t\u0010\u001b\u0018\u0001*\u00020\u00032D\b\u0004\u0010\u0004\u001a>\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u0002H\u0011\u0012\u0004\u0012\u0002H\u0013\u0012\u0004\u0012\u0002H\u0015\u0012\u0004\u0012\u0002H\u0017\u0012\u0004\u0012\u0002H\u0019\u0012\u0004\u0012\u0002H\u001b\u0012\u0004\u0012\u0002H\u00020\u001c2-\b\n\u0010\u0006\u001a'\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007j\n\u0012\u0004\u0012\u0002H\u0002\u0018\u0001`\n¢\u0006\u0002\b\u000bH\u0086\bø\u0001\u0000\u001aé\u0001\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0006\b\u0001\u0010\f\u0018\u0001\"\u0006\b\u0002\u0010\r\u0018\u0001\"\u0006\b\u0003\u0010\u000f\u0018\u0001\"\u0006\b\u0004\u0010\u0011\u0018\u0001\"\u0006\b\u0005\u0010\u0013\u0018\u0001\"\u0006\b\u0006\u0010\u0015\u0018\u0001\"\u0006\b\u0007\u0010\u0017\u0018\u0001\"\u0006\b\b\u0010\u0019\u0018\u0001\"\u0006\b\t\u0010\u001b\u0018\u0001\"\u0006\b\n\u0010\u001d\u0018\u0001*\u00020\u00032J\b\u0004\u0010\u0004\u001aD\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u0002H\u0011\u0012\u0004\u0012\u0002H\u0013\u0012\u0004\u0012\u0002H\u0015\u0012\u0004\u0012\u0002H\u0017\u0012\u0004\u0012\u0002H\u0019\u0012\u0004\u0012\u0002H\u001b\u0012\u0004\u0012\u0002H\u001d\u0012\u0004\u0012\u0002H\u00020\u001e2-\b\n\u0010\u0006\u001a'\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007j\n\u0012\u0004\u0012\u0002H\u0002\u0018\u0001`\n¢\u0006\u0002\b\u000bH\u0086\bø\u0001\u0000\u001a÷\u0001\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0006\b\u0001\u0010\f\u0018\u0001\"\u0006\b\u0002\u0010\r\u0018\u0001\"\u0006\b\u0003\u0010\u000f\u0018\u0001\"\u0006\b\u0004\u0010\u0011\u0018\u0001\"\u0006\b\u0005\u0010\u0013\u0018\u0001\"\u0006\b\u0006\u0010\u0015\u0018\u0001\"\u0006\b\u0007\u0010\u0017\u0018\u0001\"\u0006\b\b\u0010\u0019\u0018\u0001\"\u0006\b\t\u0010\u001b\u0018\u0001\"\u0006\b\n\u0010\u001d\u0018\u0001\"\u0006\b\u000b\u0010\u001f\u0018\u0001*\u00020\u00032P\b\u0004\u0010\u0004\u001aJ\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u0002H\u0011\u0012\u0004\u0012\u0002H\u0013\u0012\u0004\u0012\u0002H\u0015\u0012\u0004\u0012\u0002H\u0017\u0012\u0004\u0012\u0002H\u0019\u0012\u0004\u0012\u0002H\u001b\u0012\u0004\u0012\u0002H\u001d\u0012\u0004\u0012\u0002H\u001f\u0012\u0004\u0012\u0002H\u00020 2-\b\n\u0010\u0006\u001a'\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007j\n\u0012\u0004\u0012\u0002H\u0002\u0018\u0001`\n¢\u0006\u0002\b\u000bH\u0086\bø\u0001\u0000\u001a\u0085\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0006\b\u0001\u0010\f\u0018\u0001\"\u0006\b\u0002\u0010\r\u0018\u0001\"\u0006\b\u0003\u0010\u000f\u0018\u0001\"\u0006\b\u0004\u0010\u0011\u0018\u0001\"\u0006\b\u0005\u0010\u0013\u0018\u0001\"\u0006\b\u0006\u0010\u0015\u0018\u0001\"\u0006\b\u0007\u0010\u0017\u0018\u0001\"\u0006\b\b\u0010\u0019\u0018\u0001\"\u0006\b\t\u0010\u001b\u0018\u0001\"\u0006\b\n\u0010\u001d\u0018\u0001\"\u0006\b\u000b\u0010\u001f\u0018\u0001\"\u0006\b\f\u0010!\u0018\u0001*\u00020\u00032V\b\u0004\u0010\u0004\u001aP\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u0002H\u0011\u0012\u0004\u0012\u0002H\u0013\u0012\u0004\u0012\u0002H\u0015\u0012\u0004\u0012\u0002H\u0017\u0012\u0004\u0012\u0002H\u0019\u0012\u0004\u0012\u0002H\u001b\u0012\u0004\u0012\u0002H\u001d\u0012\u0004\u0012\u0002H\u001f\u0012\u0004\u0012\u0002H!\u0012\u0004\u0012\u0002H\u00020\"2-\b\n\u0010\u0006\u001a'\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007j\n\u0012\u0004\u0012\u0002H\u0002\u0018\u0001`\n¢\u0006\u0002\b\u000bH\u0086\bø\u0001\u0000\u001a\u0093\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0006\b\u0001\u0010\f\u0018\u0001\"\u0006\b\u0002\u0010\r\u0018\u0001\"\u0006\b\u0003\u0010\u000f\u0018\u0001\"\u0006\b\u0004\u0010\u0011\u0018\u0001\"\u0006\b\u0005\u0010\u0013\u0018\u0001\"\u0006\b\u0006\u0010\u0015\u0018\u0001\"\u0006\b\u0007\u0010\u0017\u0018\u0001\"\u0006\b\b\u0010\u0019\u0018\u0001\"\u0006\b\t\u0010\u001b\u0018\u0001\"\u0006\b\n\u0010\u001d\u0018\u0001\"\u0006\b\u000b\u0010\u001f\u0018\u0001\"\u0006\b\f\u0010!\u0018\u0001\"\u0006\b\r\u0010#\u0018\u0001*\u00020\u00032\\\b\u0004\u0010\u0004\u001aV\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u0002H\u0011\u0012\u0004\u0012\u0002H\u0013\u0012\u0004\u0012\u0002H\u0015\u0012\u0004\u0012\u0002H\u0017\u0012\u0004\u0012\u0002H\u0019\u0012\u0004\u0012\u0002H\u001b\u0012\u0004\u0012\u0002H\u001d\u0012\u0004\u0012\u0002H\u001f\u0012\u0004\u0012\u0002H!\u0012\u0004\u0012\u0002H#\u0012\u0004\u0012\u0002H\u00020$2-\b\n\u0010\u0006\u001a'\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007j\n\u0012\u0004\u0012\u0002H\u0002\u0018\u0001`\n¢\u0006\u0002\b\u000bH\u0086\bø\u0001\u0000\u001a¡\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0006\b\u0001\u0010\f\u0018\u0001\"\u0006\b\u0002\u0010\r\u0018\u0001\"\u0006\b\u0003\u0010\u000f\u0018\u0001\"\u0006\b\u0004\u0010\u0011\u0018\u0001\"\u0006\b\u0005\u0010\u0013\u0018\u0001\"\u0006\b\u0006\u0010\u0015\u0018\u0001\"\u0006\b\u0007\u0010\u0017\u0018\u0001\"\u0006\b\b\u0010\u0019\u0018\u0001\"\u0006\b\t\u0010\u001b\u0018\u0001\"\u0006\b\n\u0010\u001d\u0018\u0001\"\u0006\b\u000b\u0010\u001f\u0018\u0001\"\u0006\b\f\u0010!\u0018\u0001\"\u0006\b\r\u0010#\u0018\u0001\"\u0006\b\u000e\u0010%\u0018\u0001*\u00020\u00032b\b\u0004\u0010\u0004\u001a\\\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u0002H\u0011\u0012\u0004\u0012\u0002H\u0013\u0012\u0004\u0012\u0002H\u0015\u0012\u0004\u0012\u0002H\u0017\u0012\u0004\u0012\u0002H\u0019\u0012\u0004\u0012\u0002H\u001b\u0012\u0004\u0012\u0002H\u001d\u0012\u0004\u0012\u0002H\u001f\u0012\u0004\u0012\u0002H!\u0012\u0004\u0012\u0002H#\u0012\u0004\u0012\u0002H%\u0012\u0004\u0012\u0002H\u00020&2-\b\n\u0010\u0006\u001a'\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007j\n\u0012\u0004\u0012\u0002H\u0002\u0018\u0001`\n¢\u0006\u0002\b\u000bH\u0086\bø\u0001\u0000\u001a¯\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0006\b\u0001\u0010\f\u0018\u0001\"\u0006\b\u0002\u0010\r\u0018\u0001\"\u0006\b\u0003\u0010\u000f\u0018\u0001\"\u0006\b\u0004\u0010\u0011\u0018\u0001\"\u0006\b\u0005\u0010\u0013\u0018\u0001\"\u0006\b\u0006\u0010\u0015\u0018\u0001\"\u0006\b\u0007\u0010\u0017\u0018\u0001\"\u0006\b\b\u0010\u0019\u0018\u0001\"\u0006\b\t\u0010\u001b\u0018\u0001\"\u0006\b\n\u0010\u001d\u0018\u0001\"\u0006\b\u000b\u0010\u001f\u0018\u0001\"\u0006\b\f\u0010!\u0018\u0001\"\u0006\b\r\u0010#\u0018\u0001\"\u0006\b\u000e\u0010%\u0018\u0001\"\u0006\b\u000f\u0010'\u0018\u0001*\u00020\u00032h\b\u0004\u0010\u0004\u001ab\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u0002H\u0011\u0012\u0004\u0012\u0002H\u0013\u0012\u0004\u0012\u0002H\u0015\u0012\u0004\u0012\u0002H\u0017\u0012\u0004\u0012\u0002H\u0019\u0012\u0004\u0012\u0002H\u001b\u0012\u0004\u0012\u0002H\u001d\u0012\u0004\u0012\u0002H\u001f\u0012\u0004\u0012\u0002H!\u0012\u0004\u0012\u0002H#\u0012\u0004\u0012\u0002H%\u0012\u0004\u0012\u0002H'\u0012\u0004\u0012\u0002H\u00020(2-\b\n\u0010\u0006\u001a'\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007j\n\u0012\u0004\u0012\u0002H\u0002\u0018\u0001`\n¢\u0006\u0002\b\u000bH\u0086\bø\u0001\u0000\u001a½\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0006\b\u0001\u0010\f\u0018\u0001\"\u0006\b\u0002\u0010\r\u0018\u0001\"\u0006\b\u0003\u0010\u000f\u0018\u0001\"\u0006\b\u0004\u0010\u0011\u0018\u0001\"\u0006\b\u0005\u0010\u0013\u0018\u0001\"\u0006\b\u0006\u0010\u0015\u0018\u0001\"\u0006\b\u0007\u0010\u0017\u0018\u0001\"\u0006\b\b\u0010\u0019\u0018\u0001\"\u0006\b\t\u0010\u001b\u0018\u0001\"\u0006\b\n\u0010\u001d\u0018\u0001\"\u0006\b\u000b\u0010\u001f\u0018\u0001\"\u0006\b\f\u0010!\u0018\u0001\"\u0006\b\r\u0010#\u0018\u0001\"\u0006\b\u000e\u0010%\u0018\u0001\"\u0006\b\u000f\u0010'\u0018\u0001\"\u0006\b\u0010\u0010)\u0018\u0001*\u00020\u00032n\b\u0004\u0010\u0004\u001ah\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u0002H\u0011\u0012\u0004\u0012\u0002H\u0013\u0012\u0004\u0012\u0002H\u0015\u0012\u0004\u0012\u0002H\u0017\u0012\u0004\u0012\u0002H\u0019\u0012\u0004\u0012\u0002H\u001b\u0012\u0004\u0012\u0002H\u001d\u0012\u0004\u0012\u0002H\u001f\u0012\u0004\u0012\u0002H!\u0012\u0004\u0012\u0002H#\u0012\u0004\u0012\u0002H%\u0012\u0004\u0012\u0002H'\u0012\u0004\u0012\u0002H)\u0012\u0004\u0012\u0002H\u00020*2-\b\n\u0010\u0006\u001a'\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007j\n\u0012\u0004\u0012\u0002H\u0002\u0018\u0001`\n¢\u0006\u0002\b\u000bH\u0086\bø\u0001\u0000\u001aË\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0006\b\u0001\u0010\f\u0018\u0001\"\u0006\b\u0002\u0010\r\u0018\u0001\"\u0006\b\u0003\u0010\u000f\u0018\u0001\"\u0006\b\u0004\u0010\u0011\u0018\u0001\"\u0006\b\u0005\u0010\u0013\u0018\u0001\"\u0006\b\u0006\u0010\u0015\u0018\u0001\"\u0006\b\u0007\u0010\u0017\u0018\u0001\"\u0006\b\b\u0010\u0019\u0018\u0001\"\u0006\b\t\u0010\u001b\u0018\u0001\"\u0006\b\n\u0010\u001d\u0018\u0001\"\u0006\b\u000b\u0010\u001f\u0018\u0001\"\u0006\b\f\u0010!\u0018\u0001\"\u0006\b\r\u0010#\u0018\u0001\"\u0006\b\u000e\u0010%\u0018\u0001\"\u0006\b\u000f\u0010'\u0018\u0001\"\u0006\b\u0010\u0010)\u0018\u0001\"\u0006\b\u0011\u0010+\u0018\u0001*\u00020\u00032t\b\u0004\u0010\u0004\u001an\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u0002H\u0011\u0012\u0004\u0012\u0002H\u0013\u0012\u0004\u0012\u0002H\u0015\u0012\u0004\u0012\u0002H\u0017\u0012\u0004\u0012\u0002H\u0019\u0012\u0004\u0012\u0002H\u001b\u0012\u0004\u0012\u0002H\u001d\u0012\u0004\u0012\u0002H\u001f\u0012\u0004\u0012\u0002H!\u0012\u0004\u0012\u0002H#\u0012\u0004\u0012\u0002H%\u0012\u0004\u0012\u0002H'\u0012\u0004\u0012\u0002H)\u0012\u0004\u0012\u0002H+\u0012\u0004\u0012\u0002H\u00020,2-\b\n\u0010\u0006\u001a'\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007j\n\u0012\u0004\u0012\u0002H\u0002\u0018\u0001`\n¢\u0006\u0002\b\u000bH\u0086\bø\u0001\u0000\u001aÙ\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0006\b\u0001\u0010\f\u0018\u0001\"\u0006\b\u0002\u0010\r\u0018\u0001\"\u0006\b\u0003\u0010\u000f\u0018\u0001\"\u0006\b\u0004\u0010\u0011\u0018\u0001\"\u0006\b\u0005\u0010\u0013\u0018\u0001\"\u0006\b\u0006\u0010\u0015\u0018\u0001\"\u0006\b\u0007\u0010\u0017\u0018\u0001\"\u0006\b\b\u0010\u0019\u0018\u0001\"\u0006\b\t\u0010\u001b\u0018\u0001\"\u0006\b\n\u0010\u001d\u0018\u0001\"\u0006\b\u000b\u0010\u001f\u0018\u0001\"\u0006\b\f\u0010!\u0018\u0001\"\u0006\b\r\u0010#\u0018\u0001\"\u0006\b\u000e\u0010%\u0018\u0001\"\u0006\b\u000f\u0010'\u0018\u0001\"\u0006\b\u0010\u0010)\u0018\u0001\"\u0006\b\u0011\u0010+\u0018\u0001\"\u0006\b\u0012\u0010-\u0018\u0001*\u00020\u00032z\b\u0004\u0010\u0004\u001at\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u0002H\u0011\u0012\u0004\u0012\u0002H\u0013\u0012\u0004\u0012\u0002H\u0015\u0012\u0004\u0012\u0002H\u0017\u0012\u0004\u0012\u0002H\u0019\u0012\u0004\u0012\u0002H\u001b\u0012\u0004\u0012\u0002H\u001d\u0012\u0004\u0012\u0002H\u001f\u0012\u0004\u0012\u0002H!\u0012\u0004\u0012\u0002H#\u0012\u0004\u0012\u0002H%\u0012\u0004\u0012\u0002H'\u0012\u0004\u0012\u0002H)\u0012\u0004\u0012\u0002H+\u0012\u0004\u0012\u0002H-\u0012\u0004\u0012\u0002H\u00020.2-\b\n\u0010\u0006\u001a'\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007j\n\u0012\u0004\u0012\u0002H\u0002\u0018\u0001`\n¢\u0006\u0002\b\u000bH\u0086\bø\u0001\u0000\u001aè\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0006\b\u0001\u0010\f\u0018\u0001\"\u0006\b\u0002\u0010\r\u0018\u0001\"\u0006\b\u0003\u0010\u000f\u0018\u0001\"\u0006\b\u0004\u0010\u0011\u0018\u0001\"\u0006\b\u0005\u0010\u0013\u0018\u0001\"\u0006\b\u0006\u0010\u0015\u0018\u0001\"\u0006\b\u0007\u0010\u0017\u0018\u0001\"\u0006\b\b\u0010\u0019\u0018\u0001\"\u0006\b\t\u0010\u001b\u0018\u0001\"\u0006\b\n\u0010\u001d\u0018\u0001\"\u0006\b\u000b\u0010\u001f\u0018\u0001\"\u0006\b\f\u0010!\u0018\u0001\"\u0006\b\r\u0010#\u0018\u0001\"\u0006\b\u000e\u0010%\u0018\u0001\"\u0006\b\u000f\u0010'\u0018\u0001\"\u0006\b\u0010\u0010)\u0018\u0001\"\u0006\b\u0011\u0010+\u0018\u0001\"\u0006\b\u0012\u0010-\u0018\u0001\"\u0006\b\u0013\u0010/\u0018\u0001*\u00020\u00032\u0080\u0001\b\u0004\u0010\u0004\u001az\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u0002H\u0011\u0012\u0004\u0012\u0002H\u0013\u0012\u0004\u0012\u0002H\u0015\u0012\u0004\u0012\u0002H\u0017\u0012\u0004\u0012\u0002H\u0019\u0012\u0004\u0012\u0002H\u001b\u0012\u0004\u0012\u0002H\u001d\u0012\u0004\u0012\u0002H\u001f\u0012\u0004\u0012\u0002H!\u0012\u0004\u0012\u0002H#\u0012\u0004\u0012\u0002H%\u0012\u0004\u0012\u0002H'\u0012\u0004\u0012\u0002H)\u0012\u0004\u0012\u0002H+\u0012\u0004\u0012\u0002H-\u0012\u0004\u0012\u0002H/\u0012\u0004\u0012\u0002H\u0002002-\b\n\u0010\u0006\u001a'\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007j\n\u0012\u0004\u0012\u0002H\u0002\u0018\u0001`\n¢\u0006\u0002\b\u000bH\u0086\bø\u0001\u0000\u001a÷\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0006\b\u0001\u0010\f\u0018\u0001\"\u0006\b\u0002\u0010\r\u0018\u0001\"\u0006\b\u0003\u0010\u000f\u0018\u0001\"\u0006\b\u0004\u0010\u0011\u0018\u0001\"\u0006\b\u0005\u0010\u0013\u0018\u0001\"\u0006\b\u0006\u0010\u0015\u0018\u0001\"\u0006\b\u0007\u0010\u0017\u0018\u0001\"\u0006\b\b\u0010\u0019\u0018\u0001\"\u0006\b\t\u0010\u001b\u0018\u0001\"\u0006\b\n\u0010\u001d\u0018\u0001\"\u0006\b\u000b\u0010\u001f\u0018\u0001\"\u0006\b\f\u0010!\u0018\u0001\"\u0006\b\r\u0010#\u0018\u0001\"\u0006\b\u000e\u0010%\u0018\u0001\"\u0006\b\u000f\u0010'\u0018\u0001\"\u0006\b\u0010\u0010)\u0018\u0001\"\u0006\b\u0011\u0010+\u0018\u0001\"\u0006\b\u0012\u0010-\u0018\u0001\"\u0006\b\u0013\u0010/\u0018\u0001\"\u0006\b\u0014\u00101\u0018\u0001*\u00020\u00032\u0087\u0001\b\u0004\u0010\u0004\u001a\u0080\u0001\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u0002H\u0011\u0012\u0004\u0012\u0002H\u0013\u0012\u0004\u0012\u0002H\u0015\u0012\u0004\u0012\u0002H\u0017\u0012\u0004\u0012\u0002H\u0019\u0012\u0004\u0012\u0002H\u001b\u0012\u0004\u0012\u0002H\u001d\u0012\u0004\u0012\u0002H\u001f\u0012\u0004\u0012\u0002H!\u0012\u0004\u0012\u0002H#\u0012\u0004\u0012\u0002H%\u0012\u0004\u0012\u0002H'\u0012\u0004\u0012\u0002H)\u0012\u0004\u0012\u0002H+\u0012\u0004\u0012\u0002H-\u0012\u0004\u0012\u0002H/\u0012\u0004\u0012\u0002H1\u0012\u0004\u0012\u0002H\u0002022-\b\n\u0010\u0006\u001a'\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007j\n\u0012\u0004\u0012\u0002H\u0002\u0018\u0001`\n¢\u0006\u0002\b\u000bH\u0086\bø\u0001\u0000\u001a\u0085\u0003\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0006\b\u0001\u0010\f\u0018\u0001\"\u0006\b\u0002\u0010\r\u0018\u0001\"\u0006\b\u0003\u0010\u000f\u0018\u0001\"\u0006\b\u0004\u0010\u0011\u0018\u0001\"\u0006\b\u0005\u0010\u0013\u0018\u0001\"\u0006\b\u0006\u0010\u0015\u0018\u0001\"\u0006\b\u0007\u0010\u0017\u0018\u0001\"\u0006\b\b\u0010\u0019\u0018\u0001\"\u0006\b\t\u0010\u001b\u0018\u0001\"\u0006\b\n\u0010\u001d\u0018\u0001\"\u0006\b\u000b\u0010\u001f\u0018\u0001\"\u0006\b\f\u0010!\u0018\u0001\"\u0006\b\r\u0010#\u0018\u0001\"\u0006\b\u000e\u0010%\u0018\u0001\"\u0006\b\u000f\u0010'\u0018\u0001\"\u0006\b\u0010\u0010)\u0018\u0001\"\u0006\b\u0011\u0010+\u0018\u0001\"\u0006\b\u0012\u0010-\u0018\u0001\"\u0006\b\u0013\u0010/\u0018\u0001\"\u0006\b\u0014\u00101\u0018\u0001\"\u0006\b\u0015\u00103\u0018\u0001*\u00020\u00032\u008d\u0001\b\u0004\u0010\u0004\u001a\u0086\u0001\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u0002H\u0011\u0012\u0004\u0012\u0002H\u0013\u0012\u0004\u0012\u0002H\u0015\u0012\u0004\u0012\u0002H\u0017\u0012\u0004\u0012\u0002H\u0019\u0012\u0004\u0012\u0002H\u001b\u0012\u0004\u0012\u0002H\u001d\u0012\u0004\u0012\u0002H\u001f\u0012\u0004\u0012\u0002H!\u0012\u0004\u0012\u0002H#\u0012\u0004\u0012\u0002H%\u0012\u0004\u0012\u0002H'\u0012\u0004\u0012\u0002H)\u0012\u0004\u0012\u0002H+\u0012\u0004\u0012\u0002H-\u0012\u0004\u0012\u0002H/\u0012\u0004\u0012\u0002H1\u0012\u0004\u0012\u0002H3\u0012\u0004\u0012\u0002H\u0002042-\b\n\u0010\u0006\u001a'\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007j\n\u0012\u0004\u0012\u0002H\u0002\u0018\u0001`\n¢\u0006\u0002\b\u000bH\u0086\bø\u0001\u0000\u001a\u0093\u0003\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0006\b\u0001\u0010\f\u0018\u0001\"\u0006\b\u0002\u0010\r\u0018\u0001\"\u0006\b\u0003\u0010\u000f\u0018\u0001\"\u0006\b\u0004\u0010\u0011\u0018\u0001\"\u0006\b\u0005\u0010\u0013\u0018\u0001\"\u0006\b\u0006\u0010\u0015\u0018\u0001\"\u0006\b\u0007\u0010\u0017\u0018\u0001\"\u0006\b\b\u0010\u0019\u0018\u0001\"\u0006\b\t\u0010\u001b\u0018\u0001\"\u0006\b\n\u0010\u001d\u0018\u0001\"\u0006\b\u000b\u0010\u001f\u0018\u0001\"\u0006\b\f\u0010!\u0018\u0001\"\u0006\b\r\u0010#\u0018\u0001\"\u0006\b\u000e\u0010%\u0018\u0001\"\u0006\b\u000f\u0010'\u0018\u0001\"\u0006\b\u0010\u0010)\u0018\u0001\"\u0006\b\u0011\u0010+\u0018\u0001\"\u0006\b\u0012\u0010-\u0018\u0001\"\u0006\b\u0013\u0010/\u0018\u0001\"\u0006\b\u0014\u00101\u0018\u0001\"\u0006\b\u0015\u00103\u0018\u0001\"\u0006\b\u0016\u00105\u0018\u0001*\u00020\u00032\u0093\u0001\b\u0004\u0010\u0004\u001a\u008c\u0001\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u0002H\u0011\u0012\u0004\u0012\u0002H\u0013\u0012\u0004\u0012\u0002H\u0015\u0012\u0004\u0012\u0002H\u0017\u0012\u0004\u0012\u0002H\u0019\u0012\u0004\u0012\u0002H\u001b\u0012\u0004\u0012\u0002H\u001d\u0012\u0004\u0012\u0002H\u001f\u0012\u0004\u0012\u0002H!\u0012\u0004\u0012\u0002H#\u0012\u0004\u0012\u0002H%\u0012\u0004\u0012\u0002H'\u0012\u0004\u0012\u0002H)\u0012\u0004\u0012\u0002H+\u0012\u0004\u0012\u0002H-\u0012\u0004\u0012\u0002H/\u0012\u0004\u0012\u0002H1\u0012\u0004\u0012\u0002H3\u0012\u0004\u0012\u0002H5\u0012\u0004\u0012\u0002H\u0002062-\b\n\u0010\u0006\u001a'\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007j\n\u0012\u0004\u0012\u0002H\u0002\u0018\u0001`\n¢\u0006\u0002\b\u000bH\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u00067"}, d2 = {"singleOf", "Lorg/koin/core/definition/KoinDefinition;", "R", "Lorg/koin/core/module/Module;", "constructor", "Lkotlin/Function0;", "options", "Lkotlin/Function1;", "Lorg/koin/core/definition/BeanDefinition;", "", "Lorg/koin/core/module/dsl/DefinitionOptions;", "Lkotlin/ExtensionFunctionType;", "T1", "T2", "Lkotlin/Function2;", "T3", "Lkotlin/Function3;", "T4", "Lkotlin/Function4;", "T5", "Lkotlin/Function5;", "T6", "Lkotlin/Function6;", "T7", "Lkotlin/Function7;", "T8", "Lkotlin/Function8;", "T9", "Lkotlin/Function9;", "T10", "Lkotlin/Function10;", "T11", "Lkotlin/Function11;", "T12", "Lkotlin/Function12;", "T13", "Lkotlin/Function13;", "T14", "Lkotlin/Function14;", "T15", "Lkotlin/Function15;", "T16", "Lkotlin/Function16;", "T17", "Lkotlin/Function17;", "T18", "Lkotlin/Function18;", "T19", "Lkotlin/Function19;", "T20", "Lkotlin/Function20;", "T21", "Lkotlin/Function21;", "T22", "Lkotlin/Function22;", "koin-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SingleOfKt {
    public static /* synthetic */ KoinDefinition singleOf$default(Module module, Function0 constructor, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
        Kind kind = Kind.Singleton;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass1, kind, listEmptyList));
        SingleInstanceFactory<?> singleInstanceFactory2 = singleInstanceFactory;
        module.indexPrimaryType(singleInstanceFactory2);
        if (module.get_createdAtStart()) {
            module.prepareForCreationAtStart(singleInstanceFactory);
        }
        return OptionDSLKt.onOptions(new KoinDefinition(module, singleInstanceFactory2), function1);
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: SingleOf.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0006\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "R", "Lorg/koin/core/scope/Scope;", "it", "Lorg/koin/core/parameter/ParametersHolder;", "invoke", "(Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/ParametersHolder;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = Opcodes.ARETURN)
    /* renamed from: org.koin.core.module.dsl.SingleOfKt$singleOf$1, reason: invalid class name */
    public static final class AnonymousClass1<R> extends Lambda implements Function2<Scope, ParametersHolder, R> {
        final /* synthetic */ Function0<R> $constructor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Function0<? extends R> function0) {
            super(2);
            this.$constructor = function0;
        }

        @Override // kotlin.jvm.functions.Function2
        public final R invoke(Scope single, ParametersHolder it) {
            Intrinsics.checkNotNullParameter(single, "$this$single");
            Intrinsics.checkNotNullParameter(it, "it");
            return this.$constructor.invoke();
        }
    }

    public static final /* synthetic */ <R> KoinDefinition<R> singleOf(Module module, Function0<? extends R> constructor, Function1<? super BeanDefinition<R>, Unit> function1) {
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
        Kind kind = Kind.Singleton;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass1, kind, listEmptyList));
        SingleInstanceFactory<?> singleInstanceFactory2 = singleInstanceFactory;
        module.indexPrimaryType(singleInstanceFactory2);
        if (module.get_createdAtStart()) {
            module.prepareForCreationAtStart(singleInstanceFactory);
        }
        return OptionDSLKt.onOptions(new KoinDefinition(module, singleInstanceFactory2), function1);
    }

    public static /* synthetic */ KoinDefinition singleOf$default(Module module, Function1 constructor, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
        Kind kind = Kind.Singleton;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass2, kind, listEmptyList));
        SingleInstanceFactory<?> singleInstanceFactory2 = singleInstanceFactory;
        module.indexPrimaryType(singleInstanceFactory2);
        if (module.get_createdAtStart()) {
            module.prepareForCreationAtStart(singleInstanceFactory);
        }
        return OptionDSLKt.onOptions(new KoinDefinition(module, singleInstanceFactory2), function1);
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: SingleOf.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0006\b\u0000\u0010\u0001\u0018\u0001\"\u0006\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "R", "T1", "Lorg/koin/core/scope/Scope;", "it", "Lorg/koin/core/parameter/ParametersHolder;", "invoke", "(Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/ParametersHolder;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = Opcodes.ARETURN)
    /* renamed from: org.koin.core.module.dsl.SingleOfKt$singleOf$2, reason: invalid class name */
    public static final class AnonymousClass2<R> extends Lambda implements Function2<Scope, ParametersHolder, R> {
        final /* synthetic */ Function1<T1, R> $constructor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Function1<? super T1, ? extends R> function1) {
            super(2);
            this.$constructor = function1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final R invoke(Scope single, ParametersHolder it) {
            Intrinsics.checkNotNullParameter(single, "$this$single");
            Intrinsics.checkNotNullParameter(it, "it");
            Function1<T1, R> function1 = this.$constructor;
            Intrinsics.reifiedOperationMarker(4, "T1");
            return function1.invoke(single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null));
        }
    }

    public static final /* synthetic */ <R, T1> KoinDefinition<R> singleOf(Module module, Function1<? super T1, ? extends R> constructor, Function1<? super BeanDefinition<R>, Unit> function1) {
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
        Kind kind = Kind.Singleton;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass2, kind, listEmptyList));
        SingleInstanceFactory<?> singleInstanceFactory2 = singleInstanceFactory;
        module.indexPrimaryType(singleInstanceFactory2);
        if (module.get_createdAtStart()) {
            module.prepareForCreationAtStart(singleInstanceFactory);
        }
        return OptionDSLKt.onOptions(new KoinDefinition(module, singleInstanceFactory2), function1);
    }

    public static /* synthetic */ KoinDefinition singleOf$default(Module module, Function2 constructor, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass3 anonymousClass3 = new AnonymousClass3(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
        Kind kind = Kind.Singleton;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass3, kind, listEmptyList));
        SingleInstanceFactory<?> singleInstanceFactory2 = singleInstanceFactory;
        module.indexPrimaryType(singleInstanceFactory2);
        if (module.get_createdAtStart()) {
            module.prepareForCreationAtStart(singleInstanceFactory);
        }
        return OptionDSLKt.onOptions(new KoinDefinition(module, singleInstanceFactory2), function1);
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: SingleOf.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0006\b\u0000\u0010\u0001\u0018\u0001\"\u0006\b\u0001\u0010\u0002\u0018\u0001\"\u0006\b\u0002\u0010\u0003\u0018\u0001*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "R", "T1", "T2", "Lorg/koin/core/scope/Scope;", "it", "Lorg/koin/core/parameter/ParametersHolder;", "invoke", "(Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/ParametersHolder;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = Opcodes.ARETURN)
    /* renamed from: org.koin.core.module.dsl.SingleOfKt$singleOf$3, reason: invalid class name */
    public static final class AnonymousClass3<R> extends Lambda implements Function2<Scope, ParametersHolder, R> {
        final /* synthetic */ Function2<T1, T2, R> $constructor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(Function2<? super T1, ? super T2, ? extends R> function2) {
            super(2);
            this.$constructor = function2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final R invoke(Scope single, ParametersHolder it) {
            Intrinsics.checkNotNullParameter(single, "$this$single");
            Intrinsics.checkNotNullParameter(it, "it");
            Function2<T1, T2, R> function2 = this.$constructor;
            Intrinsics.reifiedOperationMarker(4, "T1");
            Object obj = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T2");
            return function2.invoke(obj, single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null));
        }
    }

    public static final /* synthetic */ <R, T1, T2> KoinDefinition<R> singleOf(Module module, Function2<? super T1, ? super T2, ? extends R> constructor, Function1<? super BeanDefinition<R>, Unit> function1) {
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass3 anonymousClass3 = new AnonymousClass3(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
        Kind kind = Kind.Singleton;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass3, kind, listEmptyList));
        SingleInstanceFactory<?> singleInstanceFactory2 = singleInstanceFactory;
        module.indexPrimaryType(singleInstanceFactory2);
        if (module.get_createdAtStart()) {
            module.prepareForCreationAtStart(singleInstanceFactory);
        }
        return OptionDSLKt.onOptions(new KoinDefinition(module, singleInstanceFactory2), function1);
    }

    public static /* synthetic */ KoinDefinition singleOf$default(Module module, Function3 constructor, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass4 anonymousClass4 = new AnonymousClass4(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
        Kind kind = Kind.Singleton;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass4, kind, listEmptyList));
        SingleInstanceFactory<?> singleInstanceFactory2 = singleInstanceFactory;
        module.indexPrimaryType(singleInstanceFactory2);
        if (module.get_createdAtStart()) {
            module.prepareForCreationAtStart(singleInstanceFactory);
        }
        return OptionDSLKt.onOptions(new KoinDefinition(module, singleInstanceFactory2), function1);
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: SingleOf.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0006\b\u0000\u0010\u0001\u0018\u0001\"\u0006\b\u0001\u0010\u0002\u0018\u0001\"\u0006\b\u0002\u0010\u0003\u0018\u0001\"\u0006\b\u0003\u0010\u0004\u0018\u0001*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"<anonymous>", "R", "T1", "T2", "T3", "Lorg/koin/core/scope/Scope;", "it", "Lorg/koin/core/parameter/ParametersHolder;", "invoke", "(Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/ParametersHolder;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = Opcodes.ARETURN)
    /* renamed from: org.koin.core.module.dsl.SingleOfKt$singleOf$4, reason: invalid class name */
    public static final class AnonymousClass4<R> extends Lambda implements Function2<Scope, ParametersHolder, R> {
        final /* synthetic */ Function3<T1, T2, T3, R> $constructor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(Function3<? super T1, ? super T2, ? super T3, ? extends R> function3) {
            super(2);
            this.$constructor = function3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final R invoke(Scope single, ParametersHolder it) {
            Intrinsics.checkNotNullParameter(single, "$this$single");
            Intrinsics.checkNotNullParameter(it, "it");
            Function3<T1, T2, T3, R> function3 = this.$constructor;
            Intrinsics.reifiedOperationMarker(4, "T1");
            Object obj = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T2");
            Object obj2 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T3");
            return function3.invoke(obj, obj2, single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null));
        }
    }

    public static final /* synthetic */ <R, T1, T2, T3> KoinDefinition<R> singleOf(Module module, Function3<? super T1, ? super T2, ? super T3, ? extends R> constructor, Function1<? super BeanDefinition<R>, Unit> function1) {
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass4 anonymousClass4 = new AnonymousClass4(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
        Kind kind = Kind.Singleton;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass4, kind, listEmptyList));
        SingleInstanceFactory<?> singleInstanceFactory2 = singleInstanceFactory;
        module.indexPrimaryType(singleInstanceFactory2);
        if (module.get_createdAtStart()) {
            module.prepareForCreationAtStart(singleInstanceFactory);
        }
        return OptionDSLKt.onOptions(new KoinDefinition(module, singleInstanceFactory2), function1);
    }

    public static /* synthetic */ KoinDefinition singleOf$default(Module module, Function4 constructor, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass5 anonymousClass5 = new AnonymousClass5(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
        Kind kind = Kind.Singleton;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass5, kind, listEmptyList));
        SingleInstanceFactory<?> singleInstanceFactory2 = singleInstanceFactory;
        module.indexPrimaryType(singleInstanceFactory2);
        if (module.get_createdAtStart()) {
            module.prepareForCreationAtStart(singleInstanceFactory);
        }
        return OptionDSLKt.onOptions(new KoinDefinition(module, singleInstanceFactory2), function1);
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: SingleOf.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0006\b\u0000\u0010\u0001\u0018\u0001\"\u0006\b\u0001\u0010\u0002\u0018\u0001\"\u0006\b\u0002\u0010\u0003\u0018\u0001\"\u0006\b\u0003\u0010\u0004\u0018\u0001\"\u0006\b\u0004\u0010\u0005\u0018\u0001*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"<anonymous>", "R", "T1", "T2", "T3", "T4", "Lorg/koin/core/scope/Scope;", "it", "Lorg/koin/core/parameter/ParametersHolder;", "invoke", "(Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/ParametersHolder;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = Opcodes.ARETURN)
    /* renamed from: org.koin.core.module.dsl.SingleOfKt$singleOf$5, reason: invalid class name */
    public static final class AnonymousClass5<R> extends Lambda implements Function2<Scope, ParametersHolder, R> {
        final /* synthetic */ Function4<T1, T2, T3, T4, R> $constructor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass5(Function4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> function4) {
            super(2);
            this.$constructor = function4;
        }

        @Override // kotlin.jvm.functions.Function2
        public final R invoke(Scope single, ParametersHolder it) {
            Intrinsics.checkNotNullParameter(single, "$this$single");
            Intrinsics.checkNotNullParameter(it, "it");
            Function4<T1, T2, T3, T4, R> function4 = this.$constructor;
            Intrinsics.reifiedOperationMarker(4, "T1");
            Object obj = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T2");
            Object obj2 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T3");
            Object obj3 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T4");
            return function4.invoke(obj, obj2, obj3, single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null));
        }
    }

    public static final /* synthetic */ <R, T1, T2, T3, T4> KoinDefinition<R> singleOf(Module module, Function4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> constructor, Function1<? super BeanDefinition<R>, Unit> function1) {
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass5 anonymousClass5 = new AnonymousClass5(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
        Kind kind = Kind.Singleton;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass5, kind, listEmptyList));
        SingleInstanceFactory<?> singleInstanceFactory2 = singleInstanceFactory;
        module.indexPrimaryType(singleInstanceFactory2);
        if (module.get_createdAtStart()) {
            module.prepareForCreationAtStart(singleInstanceFactory);
        }
        return OptionDSLKt.onOptions(new KoinDefinition(module, singleInstanceFactory2), function1);
    }

    public static /* synthetic */ KoinDefinition singleOf$default(Module module, Function5 constructor, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass6 anonymousClass6 = new AnonymousClass6(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
        Kind kind = Kind.Singleton;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass6, kind, listEmptyList));
        SingleInstanceFactory<?> singleInstanceFactory2 = singleInstanceFactory;
        module.indexPrimaryType(singleInstanceFactory2);
        if (module.get_createdAtStart()) {
            module.prepareForCreationAtStart(singleInstanceFactory);
        }
        return OptionDSLKt.onOptions(new KoinDefinition(module, singleInstanceFactory2), function1);
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: SingleOf.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0006\b\u0000\u0010\u0001\u0018\u0001\"\u0006\b\u0001\u0010\u0002\u0018\u0001\"\u0006\b\u0002\u0010\u0003\u0018\u0001\"\u0006\b\u0003\u0010\u0004\u0018\u0001\"\u0006\b\u0004\u0010\u0005\u0018\u0001\"\u0006\b\u0005\u0010\u0006\u0018\u0001*\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"<anonymous>", "R", "T1", "T2", "T3", "T4", "T5", "Lorg/koin/core/scope/Scope;", "it", "Lorg/koin/core/parameter/ParametersHolder;", "invoke", "(Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/ParametersHolder;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = Opcodes.ARETURN)
    /* renamed from: org.koin.core.module.dsl.SingleOfKt$singleOf$6, reason: invalid class name */
    public static final class AnonymousClass6<R> extends Lambda implements Function2<Scope, ParametersHolder, R> {
        final /* synthetic */ Function5<T1, T2, T3, T4, T5, R> $constructor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass6(Function5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> function5) {
            super(2);
            this.$constructor = function5;
        }

        @Override // kotlin.jvm.functions.Function2
        public final R invoke(Scope single, ParametersHolder it) {
            Intrinsics.checkNotNullParameter(single, "$this$single");
            Intrinsics.checkNotNullParameter(it, "it");
            Function5<T1, T2, T3, T4, T5, R> function5 = this.$constructor;
            Intrinsics.reifiedOperationMarker(4, "T1");
            Object obj = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T2");
            Object obj2 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T3");
            Object obj3 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T4");
            Object obj4 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T5");
            return function5.invoke(obj, obj2, obj3, obj4, single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null));
        }
    }

    public static final /* synthetic */ <R, T1, T2, T3, T4, T5> KoinDefinition<R> singleOf(Module module, Function5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> constructor, Function1<? super BeanDefinition<R>, Unit> function1) {
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass6 anonymousClass6 = new AnonymousClass6(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
        Kind kind = Kind.Singleton;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass6, kind, listEmptyList));
        SingleInstanceFactory<?> singleInstanceFactory2 = singleInstanceFactory;
        module.indexPrimaryType(singleInstanceFactory2);
        if (module.get_createdAtStart()) {
            module.prepareForCreationAtStart(singleInstanceFactory);
        }
        return OptionDSLKt.onOptions(new KoinDefinition(module, singleInstanceFactory2), function1);
    }

    public static /* synthetic */ KoinDefinition singleOf$default(Module module, Function6 constructor, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass7 anonymousClass7 = new AnonymousClass7(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
        Kind kind = Kind.Singleton;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass7, kind, listEmptyList));
        SingleInstanceFactory<?> singleInstanceFactory2 = singleInstanceFactory;
        module.indexPrimaryType(singleInstanceFactory2);
        if (module.get_createdAtStart()) {
            module.prepareForCreationAtStart(singleInstanceFactory);
        }
        return OptionDSLKt.onOptions(new KoinDefinition(module, singleInstanceFactory2), function1);
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: SingleOf.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0006\b\u0000\u0010\u0001\u0018\u0001\"\u0006\b\u0001\u0010\u0002\u0018\u0001\"\u0006\b\u0002\u0010\u0003\u0018\u0001\"\u0006\b\u0003\u0010\u0004\u0018\u0001\"\u0006\b\u0004\u0010\u0005\u0018\u0001\"\u0006\b\u0005\u0010\u0006\u0018\u0001\"\u0006\b\u0006\u0010\u0007\u0018\u0001*\u00020\b2\u0006\u0010\t\u001a\u00020\nH\n¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"<anonymous>", "R", "T1", "T2", "T3", "T4", "T5", "T6", "Lorg/koin/core/scope/Scope;", "it", "Lorg/koin/core/parameter/ParametersHolder;", "invoke", "(Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/ParametersHolder;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = Opcodes.ARETURN)
    /* renamed from: org.koin.core.module.dsl.SingleOfKt$singleOf$7, reason: invalid class name */
    public static final class AnonymousClass7<R> extends Lambda implements Function2<Scope, ParametersHolder, R> {
        final /* synthetic */ Function6<T1, T2, T3, T4, T5, T6, R> $constructor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass7(Function6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> function6) {
            super(2);
            this.$constructor = function6;
        }

        @Override // kotlin.jvm.functions.Function2
        public final R invoke(Scope single, ParametersHolder it) {
            Intrinsics.checkNotNullParameter(single, "$this$single");
            Intrinsics.checkNotNullParameter(it, "it");
            Function6<T1, T2, T3, T4, T5, T6, R> function6 = this.$constructor;
            Intrinsics.reifiedOperationMarker(4, "T1");
            Object obj = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T2");
            Object obj2 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T3");
            Object obj3 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T4");
            Object obj4 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T5");
            Object obj5 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T6");
            return function6.invoke(obj, obj2, obj3, obj4, obj5, single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null));
        }
    }

    public static final /* synthetic */ <R, T1, T2, T3, T4, T5, T6> KoinDefinition<R> singleOf(Module module, Function6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> constructor, Function1<? super BeanDefinition<R>, Unit> function1) {
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass7 anonymousClass7 = new AnonymousClass7(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
        Kind kind = Kind.Singleton;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass7, kind, listEmptyList));
        SingleInstanceFactory<?> singleInstanceFactory2 = singleInstanceFactory;
        module.indexPrimaryType(singleInstanceFactory2);
        if (module.get_createdAtStart()) {
            module.prepareForCreationAtStart(singleInstanceFactory);
        }
        return OptionDSLKt.onOptions(new KoinDefinition(module, singleInstanceFactory2), function1);
    }

    public static /* synthetic */ KoinDefinition singleOf$default(Module module, Function7 constructor, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass8 anonymousClass8 = new AnonymousClass8(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
        Kind kind = Kind.Singleton;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass8, kind, listEmptyList));
        SingleInstanceFactory<?> singleInstanceFactory2 = singleInstanceFactory;
        module.indexPrimaryType(singleInstanceFactory2);
        if (module.get_createdAtStart()) {
            module.prepareForCreationAtStart(singleInstanceFactory);
        }
        return OptionDSLKt.onOptions(new KoinDefinition(module, singleInstanceFactory2), function1);
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: SingleOf.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0006\b\u0000\u0010\u0001\u0018\u0001\"\u0006\b\u0001\u0010\u0002\u0018\u0001\"\u0006\b\u0002\u0010\u0003\u0018\u0001\"\u0006\b\u0003\u0010\u0004\u0018\u0001\"\u0006\b\u0004\u0010\u0005\u0018\u0001\"\u0006\b\u0005\u0010\u0006\u0018\u0001\"\u0006\b\u0006\u0010\u0007\u0018\u0001\"\u0006\b\u0007\u0010\b\u0018\u0001*\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\n¢\u0006\u0004\b\f\u0010\r"}, d2 = {"<anonymous>", "R", "T1", "T2", "T3", "T4", "T5", "T6", "T7", "Lorg/koin/core/scope/Scope;", "it", "Lorg/koin/core/parameter/ParametersHolder;", "invoke", "(Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/ParametersHolder;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = Opcodes.ARETURN)
    /* renamed from: org.koin.core.module.dsl.SingleOfKt$singleOf$8, reason: invalid class name */
    public static final class AnonymousClass8<R> extends Lambda implements Function2<Scope, ParametersHolder, R> {
        final /* synthetic */ Function7<T1, T2, T3, T4, T5, T6, T7, R> $constructor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass8(Function7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> function7) {
            super(2);
            this.$constructor = function7;
        }

        @Override // kotlin.jvm.functions.Function2
        public final R invoke(Scope single, ParametersHolder it) {
            Intrinsics.checkNotNullParameter(single, "$this$single");
            Intrinsics.checkNotNullParameter(it, "it");
            Function7<T1, T2, T3, T4, T5, T6, T7, R> function7 = this.$constructor;
            Intrinsics.reifiedOperationMarker(4, "T1");
            Object obj = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T2");
            Object obj2 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T3");
            Object obj3 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T4");
            Object obj4 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T5");
            Object obj5 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T6");
            Object obj6 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T7");
            return function7.invoke(obj, obj2, obj3, obj4, obj5, obj6, single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null));
        }
    }

    public static final /* synthetic */ <R, T1, T2, T3, T4, T5, T6, T7> KoinDefinition<R> singleOf(Module module, Function7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> constructor, Function1<? super BeanDefinition<R>, Unit> function1) {
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass8 anonymousClass8 = new AnonymousClass8(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
        Kind kind = Kind.Singleton;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass8, kind, listEmptyList));
        SingleInstanceFactory<?> singleInstanceFactory2 = singleInstanceFactory;
        module.indexPrimaryType(singleInstanceFactory2);
        if (module.get_createdAtStart()) {
            module.prepareForCreationAtStart(singleInstanceFactory);
        }
        return OptionDSLKt.onOptions(new KoinDefinition(module, singleInstanceFactory2), function1);
    }

    public static /* synthetic */ KoinDefinition singleOf$default(Module module, Function8 constructor, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass9 anonymousClass9 = new AnonymousClass9(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
        Kind kind = Kind.Singleton;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass9, kind, listEmptyList));
        SingleInstanceFactory<?> singleInstanceFactory2 = singleInstanceFactory;
        module.indexPrimaryType(singleInstanceFactory2);
        if (module.get_createdAtStart()) {
            module.prepareForCreationAtStart(singleInstanceFactory);
        }
        return OptionDSLKt.onOptions(new KoinDefinition(module, singleInstanceFactory2), function1);
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: SingleOf.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0006\b\u0000\u0010\u0001\u0018\u0001\"\u0006\b\u0001\u0010\u0002\u0018\u0001\"\u0006\b\u0002\u0010\u0003\u0018\u0001\"\u0006\b\u0003\u0010\u0004\u0018\u0001\"\u0006\b\u0004\u0010\u0005\u0018\u0001\"\u0006\b\u0005\u0010\u0006\u0018\u0001\"\u0006\b\u0006\u0010\u0007\u0018\u0001\"\u0006\b\u0007\u0010\b\u0018\u0001\"\u0006\b\b\u0010\t\u0018\u0001*\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\n¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"<anonymous>", "R", "T1", "T2", "T3", "T4", "T5", "T6", "T7", "T8", "Lorg/koin/core/scope/Scope;", "it", "Lorg/koin/core/parameter/ParametersHolder;", "invoke", "(Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/ParametersHolder;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = Opcodes.ARETURN)
    /* renamed from: org.koin.core.module.dsl.SingleOfKt$singleOf$9, reason: invalid class name */
    public static final class AnonymousClass9<R> extends Lambda implements Function2<Scope, ParametersHolder, R> {
        final /* synthetic */ Function8<T1, T2, T3, T4, T5, T6, T7, T8, R> $constructor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass9(Function8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> function8) {
            super(2);
            this.$constructor = function8;
        }

        @Override // kotlin.jvm.functions.Function2
        public final R invoke(Scope single, ParametersHolder it) {
            Intrinsics.checkNotNullParameter(single, "$this$single");
            Intrinsics.checkNotNullParameter(it, "it");
            Function8<T1, T2, T3, T4, T5, T6, T7, T8, R> function8 = this.$constructor;
            Intrinsics.reifiedOperationMarker(4, "T1");
            Object obj = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T2");
            Object obj2 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T3");
            Object obj3 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T4");
            Object obj4 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T5");
            Object obj5 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T6");
            Object obj6 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T7");
            Object obj7 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T8");
            return function8.invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null));
        }
    }

    public static final /* synthetic */ <R, T1, T2, T3, T4, T5, T6, T7, T8> KoinDefinition<R> singleOf(Module module, Function8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> constructor, Function1<? super BeanDefinition<R>, Unit> function1) {
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass9 anonymousClass9 = new AnonymousClass9(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
        Kind kind = Kind.Singleton;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass9, kind, listEmptyList));
        SingleInstanceFactory<?> singleInstanceFactory2 = singleInstanceFactory;
        module.indexPrimaryType(singleInstanceFactory2);
        if (module.get_createdAtStart()) {
            module.prepareForCreationAtStart(singleInstanceFactory);
        }
        return OptionDSLKt.onOptions(new KoinDefinition(module, singleInstanceFactory2), function1);
    }

    public static /* synthetic */ KoinDefinition singleOf$default(Module module, Function9 constructor, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass10 anonymousClass10 = new AnonymousClass10(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
        Kind kind = Kind.Singleton;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass10, kind, listEmptyList));
        SingleInstanceFactory<?> singleInstanceFactory2 = singleInstanceFactory;
        module.indexPrimaryType(singleInstanceFactory2);
        if (module.get_createdAtStart()) {
            module.prepareForCreationAtStart(singleInstanceFactory);
        }
        return OptionDSLKt.onOptions(new KoinDefinition(module, singleInstanceFactory2), function1);
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: SingleOf.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0006\b\u0000\u0010\u0001\u0018\u0001\"\u0006\b\u0001\u0010\u0002\u0018\u0001\"\u0006\b\u0002\u0010\u0003\u0018\u0001\"\u0006\b\u0003\u0010\u0004\u0018\u0001\"\u0006\b\u0004\u0010\u0005\u0018\u0001\"\u0006\b\u0005\u0010\u0006\u0018\u0001\"\u0006\b\u0006\u0010\u0007\u0018\u0001\"\u0006\b\u0007\u0010\b\u0018\u0001\"\u0006\b\b\u0010\t\u0018\u0001\"\u0006\b\t\u0010\n\u0018\u0001*\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\n¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"<anonymous>", "R", "T1", "T2", "T3", "T4", "T5", "T6", "T7", "T8", "T9", "Lorg/koin/core/scope/Scope;", "it", "Lorg/koin/core/parameter/ParametersHolder;", "invoke", "(Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/ParametersHolder;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = Opcodes.ARETURN)
    /* renamed from: org.koin.core.module.dsl.SingleOfKt$singleOf$10, reason: invalid class name */
    public static final class AnonymousClass10<R> extends Lambda implements Function2<Scope, ParametersHolder, R> {
        final /* synthetic */ Function9<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> $constructor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass10(Function9<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> function9) {
            super(2);
            this.$constructor = function9;
        }

        @Override // kotlin.jvm.functions.Function2
        public final R invoke(Scope single, ParametersHolder it) {
            Intrinsics.checkNotNullParameter(single, "$this$single");
            Intrinsics.checkNotNullParameter(it, "it");
            Function9<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> function9 = this.$constructor;
            Intrinsics.reifiedOperationMarker(4, "T1");
            Object obj = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T2");
            Object obj2 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T3");
            Object obj3 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T4");
            Object obj4 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T5");
            Object obj5 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T6");
            Object obj6 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T7");
            Object obj7 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T8");
            Object obj8 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T9");
            return function9.invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null));
        }
    }

    public static final /* synthetic */ <R, T1, T2, T3, T4, T5, T6, T7, T8, T9> KoinDefinition<R> singleOf(Module module, Function9<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> constructor, Function1<? super BeanDefinition<R>, Unit> function1) {
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass10 anonymousClass10 = new AnonymousClass10(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
        Kind kind = Kind.Singleton;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass10, kind, listEmptyList));
        SingleInstanceFactory<?> singleInstanceFactory2 = singleInstanceFactory;
        module.indexPrimaryType(singleInstanceFactory2);
        if (module.get_createdAtStart()) {
            module.prepareForCreationAtStart(singleInstanceFactory);
        }
        return OptionDSLKt.onOptions(new KoinDefinition(module, singleInstanceFactory2), function1);
    }

    public static /* synthetic */ KoinDefinition singleOf$default(Module module, Function10 constructor, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass11 anonymousClass11 = new AnonymousClass11(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
        Kind kind = Kind.Singleton;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass11, kind, listEmptyList));
        SingleInstanceFactory<?> singleInstanceFactory2 = singleInstanceFactory;
        module.indexPrimaryType(singleInstanceFactory2);
        if (module.get_createdAtStart()) {
            module.prepareForCreationAtStart(singleInstanceFactory);
        }
        return OptionDSLKt.onOptions(new KoinDefinition(module, singleInstanceFactory2), function1);
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: SingleOf.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0006\b\u0000\u0010\u0001\u0018\u0001\"\u0006\b\u0001\u0010\u0002\u0018\u0001\"\u0006\b\u0002\u0010\u0003\u0018\u0001\"\u0006\b\u0003\u0010\u0004\u0018\u0001\"\u0006\b\u0004\u0010\u0005\u0018\u0001\"\u0006\b\u0005\u0010\u0006\u0018\u0001\"\u0006\b\u0006\u0010\u0007\u0018\u0001\"\u0006\b\u0007\u0010\b\u0018\u0001\"\u0006\b\b\u0010\t\u0018\u0001\"\u0006\b\t\u0010\n\u0018\u0001\"\u0006\b\n\u0010\u000b\u0018\u0001*\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\n¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"<anonymous>", "R", "T1", "T2", "T3", "T4", "T5", "T6", "T7", "T8", "T9", "T10", "Lorg/koin/core/scope/Scope;", "it", "Lorg/koin/core/parameter/ParametersHolder;", "invoke", "(Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/ParametersHolder;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = Opcodes.ARETURN)
    /* renamed from: org.koin.core.module.dsl.SingleOfKt$singleOf$11, reason: invalid class name */
    public static final class AnonymousClass11<R> extends Lambda implements Function2<Scope, ParametersHolder, R> {
        final /* synthetic */ Function10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, R> $constructor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass11(Function10<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? extends R> function10) {
            super(2);
            this.$constructor = function10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final R invoke(Scope single, ParametersHolder it) {
            Intrinsics.checkNotNullParameter(single, "$this$single");
            Intrinsics.checkNotNullParameter(it, "it");
            Function10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, R> function10 = this.$constructor;
            Intrinsics.reifiedOperationMarker(4, "T1");
            Object obj = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T2");
            Object obj2 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T3");
            Object obj3 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T4");
            Object obj4 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T5");
            Object obj5 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T6");
            Object obj6 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T7");
            Object obj7 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T8");
            Object obj8 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T9");
            Object obj9 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T10");
            return function10.invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null));
        }
    }

    public static final /* synthetic */ <R, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> KoinDefinition<R> singleOf(Module module, Function10<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? extends R> constructor, Function1<? super BeanDefinition<R>, Unit> function1) {
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass11 anonymousClass11 = new AnonymousClass11(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
        Kind kind = Kind.Singleton;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass11, kind, listEmptyList));
        SingleInstanceFactory<?> singleInstanceFactory2 = singleInstanceFactory;
        module.indexPrimaryType(singleInstanceFactory2);
        if (module.get_createdAtStart()) {
            module.prepareForCreationAtStart(singleInstanceFactory);
        }
        return OptionDSLKt.onOptions(new KoinDefinition(module, singleInstanceFactory2), function1);
    }

    public static /* synthetic */ KoinDefinition singleOf$default(Module module, Function11 constructor, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass12 anonymousClass12 = new AnonymousClass12(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
        Kind kind = Kind.Singleton;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass12, kind, listEmptyList));
        SingleInstanceFactory<?> singleInstanceFactory2 = singleInstanceFactory;
        module.indexPrimaryType(singleInstanceFactory2);
        if (module.get_createdAtStart()) {
            module.prepareForCreationAtStart(singleInstanceFactory);
        }
        return OptionDSLKt.onOptions(new KoinDefinition(module, singleInstanceFactory2), function1);
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: SingleOf.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0006\b\u0000\u0010\u0001\u0018\u0001\"\u0006\b\u0001\u0010\u0002\u0018\u0001\"\u0006\b\u0002\u0010\u0003\u0018\u0001\"\u0006\b\u0003\u0010\u0004\u0018\u0001\"\u0006\b\u0004\u0010\u0005\u0018\u0001\"\u0006\b\u0005\u0010\u0006\u0018\u0001\"\u0006\b\u0006\u0010\u0007\u0018\u0001\"\u0006\b\u0007\u0010\b\u0018\u0001\"\u0006\b\b\u0010\t\u0018\u0001\"\u0006\b\t\u0010\n\u0018\u0001\"\u0006\b\n\u0010\u000b\u0018\u0001\"\u0006\b\u000b\u0010\f\u0018\u0001*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\n¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"<anonymous>", "R", "T1", "T2", "T3", "T4", "T5", "T6", "T7", "T8", "T9", "T10", "T11", "Lorg/koin/core/scope/Scope;", "it", "Lorg/koin/core/parameter/ParametersHolder;", "invoke", "(Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/ParametersHolder;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = Opcodes.ARETURN)
    /* renamed from: org.koin.core.module.dsl.SingleOfKt$singleOf$12, reason: invalid class name */
    public static final class AnonymousClass12<R> extends Lambda implements Function2<Scope, ParametersHolder, R> {
        final /* synthetic */ Function11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, R> $constructor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass12(Function11<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? extends R> function11) {
            super(2);
            this.$constructor = function11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final R invoke(Scope single, ParametersHolder it) {
            Intrinsics.checkNotNullParameter(single, "$this$single");
            Intrinsics.checkNotNullParameter(it, "it");
            Function11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, R> function11 = this.$constructor;
            Intrinsics.reifiedOperationMarker(4, "T1");
            Object obj = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T2");
            Object obj2 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T3");
            Object obj3 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T4");
            Object obj4 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T5");
            Object obj5 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T6");
            Object obj6 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T7");
            Object obj7 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T8");
            Object obj8 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T9");
            Object obj9 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T10");
            Object obj10 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T11");
            return function11.invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null));
        }
    }

    public static final /* synthetic */ <R, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> KoinDefinition<R> singleOf(Module module, Function11<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? extends R> constructor, Function1<? super BeanDefinition<R>, Unit> function1) {
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass12 anonymousClass12 = new AnonymousClass12(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
        Kind kind = Kind.Singleton;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass12, kind, listEmptyList));
        SingleInstanceFactory<?> singleInstanceFactory2 = singleInstanceFactory;
        module.indexPrimaryType(singleInstanceFactory2);
        if (module.get_createdAtStart()) {
            module.prepareForCreationAtStart(singleInstanceFactory);
        }
        return OptionDSLKt.onOptions(new KoinDefinition(module, singleInstanceFactory2), function1);
    }

    public static /* synthetic */ KoinDefinition singleOf$default(Module module, Function12 constructor, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass13 anonymousClass13 = new AnonymousClass13(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
        Kind kind = Kind.Singleton;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass13, kind, listEmptyList));
        SingleInstanceFactory<?> singleInstanceFactory2 = singleInstanceFactory;
        module.indexPrimaryType(singleInstanceFactory2);
        if (module.get_createdAtStart()) {
            module.prepareForCreationAtStart(singleInstanceFactory);
        }
        return OptionDSLKt.onOptions(new KoinDefinition(module, singleInstanceFactory2), function1);
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: SingleOf.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0006\b\u0000\u0010\u0001\u0018\u0001\"\u0006\b\u0001\u0010\u0002\u0018\u0001\"\u0006\b\u0002\u0010\u0003\u0018\u0001\"\u0006\b\u0003\u0010\u0004\u0018\u0001\"\u0006\b\u0004\u0010\u0005\u0018\u0001\"\u0006\b\u0005\u0010\u0006\u0018\u0001\"\u0006\b\u0006\u0010\u0007\u0018\u0001\"\u0006\b\u0007\u0010\b\u0018\u0001\"\u0006\b\b\u0010\t\u0018\u0001\"\u0006\b\t\u0010\n\u0018\u0001\"\u0006\b\n\u0010\u000b\u0018\u0001\"\u0006\b\u000b\u0010\f\u0018\u0001\"\u0006\b\f\u0010\r\u0018\u0001*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\n¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"<anonymous>", "R", "T1", "T2", "T3", "T4", "T5", "T6", "T7", "T8", "T9", "T10", "T11", "T12", "Lorg/koin/core/scope/Scope;", "it", "Lorg/koin/core/parameter/ParametersHolder;", "invoke", "(Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/ParametersHolder;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = Opcodes.ARETURN)
    /* renamed from: org.koin.core.module.dsl.SingleOfKt$singleOf$13, reason: invalid class name */
    public static final class AnonymousClass13<R> extends Lambda implements Function2<Scope, ParametersHolder, R> {
        final /* synthetic */ Function12<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, R> $constructor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass13(Function12<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? extends R> function12) {
            super(2);
            this.$constructor = function12;
        }

        @Override // kotlin.jvm.functions.Function2
        public final R invoke(Scope single, ParametersHolder it) {
            Intrinsics.checkNotNullParameter(single, "$this$single");
            Intrinsics.checkNotNullParameter(it, "it");
            Function12<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, R> function12 = this.$constructor;
            Intrinsics.reifiedOperationMarker(4, "T1");
            Object obj = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T2");
            Object obj2 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T3");
            Object obj3 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T4");
            Object obj4 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T5");
            Object obj5 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T6");
            Object obj6 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T7");
            Object obj7 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T8");
            Object obj8 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T9");
            Object obj9 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T10");
            Object obj10 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T11");
            Object obj11 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T12");
            return function12.invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null));
        }
    }

    public static final /* synthetic */ <R, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> KoinDefinition<R> singleOf(Module module, Function12<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? extends R> constructor, Function1<? super BeanDefinition<R>, Unit> function1) {
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass13 anonymousClass13 = new AnonymousClass13(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
        Kind kind = Kind.Singleton;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass13, kind, listEmptyList));
        SingleInstanceFactory<?> singleInstanceFactory2 = singleInstanceFactory;
        module.indexPrimaryType(singleInstanceFactory2);
        if (module.get_createdAtStart()) {
            module.prepareForCreationAtStart(singleInstanceFactory);
        }
        return OptionDSLKt.onOptions(new KoinDefinition(module, singleInstanceFactory2), function1);
    }

    public static /* synthetic */ KoinDefinition singleOf$default(Module module, Function13 constructor, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass14 anonymousClass14 = new AnonymousClass14(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
        Kind kind = Kind.Singleton;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass14, kind, listEmptyList));
        SingleInstanceFactory<?> singleInstanceFactory2 = singleInstanceFactory;
        module.indexPrimaryType(singleInstanceFactory2);
        if (module.get_createdAtStart()) {
            module.prepareForCreationAtStart(singleInstanceFactory);
        }
        return OptionDSLKt.onOptions(new KoinDefinition(module, singleInstanceFactory2), function1);
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: SingleOf.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0006\b\u0000\u0010\u0001\u0018\u0001\"\u0006\b\u0001\u0010\u0002\u0018\u0001\"\u0006\b\u0002\u0010\u0003\u0018\u0001\"\u0006\b\u0003\u0010\u0004\u0018\u0001\"\u0006\b\u0004\u0010\u0005\u0018\u0001\"\u0006\b\u0005\u0010\u0006\u0018\u0001\"\u0006\b\u0006\u0010\u0007\u0018\u0001\"\u0006\b\u0007\u0010\b\u0018\u0001\"\u0006\b\b\u0010\t\u0018\u0001\"\u0006\b\t\u0010\n\u0018\u0001\"\u0006\b\n\u0010\u000b\u0018\u0001\"\u0006\b\u000b\u0010\f\u0018\u0001\"\u0006\b\f\u0010\r\u0018\u0001\"\u0006\b\r\u0010\u000e\u0018\u0001*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\n¢\u0006\u0004\b\u0012\u0010\u0013"}, d2 = {"<anonymous>", "R", "T1", "T2", "T3", "T4", "T5", "T6", "T7", "T8", "T9", "T10", "T11", "T12", "T13", "Lorg/koin/core/scope/Scope;", "it", "Lorg/koin/core/parameter/ParametersHolder;", "invoke", "(Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/ParametersHolder;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = Opcodes.ARETURN)
    /* renamed from: org.koin.core.module.dsl.SingleOfKt$singleOf$14, reason: invalid class name */
    public static final class AnonymousClass14<R> extends Lambda implements Function2<Scope, ParametersHolder, R> {
        final /* synthetic */ Function13<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, R> $constructor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass14(Function13<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? extends R> function13) {
            super(2);
            this.$constructor = function13;
        }

        @Override // kotlin.jvm.functions.Function2
        public final R invoke(Scope single, ParametersHolder it) {
            Intrinsics.checkNotNullParameter(single, "$this$single");
            Intrinsics.checkNotNullParameter(it, "it");
            Function13<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, R> function13 = this.$constructor;
            Intrinsics.reifiedOperationMarker(4, "T1");
            Object obj = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T2");
            Object obj2 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T3");
            Object obj3 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T4");
            Object obj4 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T5");
            Object obj5 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T6");
            Object obj6 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T7");
            Object obj7 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T8");
            Object obj8 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T9");
            Object obj9 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T10");
            Object obj10 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T11");
            Object obj11 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T12");
            Object obj12 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T13");
            return function13.invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null));
        }
    }

    public static final /* synthetic */ <R, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> KoinDefinition<R> singleOf(Module module, Function13<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? extends R> constructor, Function1<? super BeanDefinition<R>, Unit> function1) {
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass14 anonymousClass14 = new AnonymousClass14(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
        Kind kind = Kind.Singleton;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass14, kind, listEmptyList));
        SingleInstanceFactory<?> singleInstanceFactory2 = singleInstanceFactory;
        module.indexPrimaryType(singleInstanceFactory2);
        if (module.get_createdAtStart()) {
            module.prepareForCreationAtStart(singleInstanceFactory);
        }
        return OptionDSLKt.onOptions(new KoinDefinition(module, singleInstanceFactory2), function1);
    }

    public static /* synthetic */ KoinDefinition singleOf$default(Module module, Function14 constructor, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass15 anonymousClass15 = new AnonymousClass15(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
        Kind kind = Kind.Singleton;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass15, kind, listEmptyList));
        SingleInstanceFactory<?> singleInstanceFactory2 = singleInstanceFactory;
        module.indexPrimaryType(singleInstanceFactory2);
        if (module.get_createdAtStart()) {
            module.prepareForCreationAtStart(singleInstanceFactory);
        }
        return OptionDSLKt.onOptions(new KoinDefinition(module, singleInstanceFactory2), function1);
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: SingleOf.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0006\b\u0000\u0010\u0001\u0018\u0001\"\u0006\b\u0001\u0010\u0002\u0018\u0001\"\u0006\b\u0002\u0010\u0003\u0018\u0001\"\u0006\b\u0003\u0010\u0004\u0018\u0001\"\u0006\b\u0004\u0010\u0005\u0018\u0001\"\u0006\b\u0005\u0010\u0006\u0018\u0001\"\u0006\b\u0006\u0010\u0007\u0018\u0001\"\u0006\b\u0007\u0010\b\u0018\u0001\"\u0006\b\b\u0010\t\u0018\u0001\"\u0006\b\t\u0010\n\u0018\u0001\"\u0006\b\n\u0010\u000b\u0018\u0001\"\u0006\b\u000b\u0010\f\u0018\u0001\"\u0006\b\f\u0010\r\u0018\u0001\"\u0006\b\r\u0010\u000e\u0018\u0001\"\u0006\b\u000e\u0010\u000f\u0018\u0001*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\n¢\u0006\u0004\b\u0013\u0010\u0014"}, d2 = {"<anonymous>", "R", "T1", "T2", "T3", "T4", "T5", "T6", "T7", "T8", "T9", "T10", "T11", "T12", "T13", "T14", "Lorg/koin/core/scope/Scope;", "it", "Lorg/koin/core/parameter/ParametersHolder;", "invoke", "(Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/ParametersHolder;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = Opcodes.ARETURN)
    /* renamed from: org.koin.core.module.dsl.SingleOfKt$singleOf$15, reason: invalid class name */
    public static final class AnonymousClass15<R> extends Lambda implements Function2<Scope, ParametersHolder, R> {
        final /* synthetic */ Function14<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, R> $constructor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass15(Function14<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? extends R> function14) {
            super(2);
            this.$constructor = function14;
        }

        @Override // kotlin.jvm.functions.Function2
        public final R invoke(Scope single, ParametersHolder it) {
            Intrinsics.checkNotNullParameter(single, "$this$single");
            Intrinsics.checkNotNullParameter(it, "it");
            Function14<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, R> function14 = this.$constructor;
            Intrinsics.reifiedOperationMarker(4, "T1");
            Object obj = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T2");
            Object obj2 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T3");
            Object obj3 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T4");
            Object obj4 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T5");
            Object obj5 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T6");
            Object obj6 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T7");
            Object obj7 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T8");
            Object obj8 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T9");
            Object obj9 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T10");
            Object obj10 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T11");
            Object obj11 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T12");
            Object obj12 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T13");
            Object obj13 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T14");
            return function14.invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null));
        }
    }

    public static final /* synthetic */ <R, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> KoinDefinition<R> singleOf(Module module, Function14<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? extends R> constructor, Function1<? super BeanDefinition<R>, Unit> function1) {
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass15 anonymousClass15 = new AnonymousClass15(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
        Kind kind = Kind.Singleton;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass15, kind, listEmptyList));
        SingleInstanceFactory<?> singleInstanceFactory2 = singleInstanceFactory;
        module.indexPrimaryType(singleInstanceFactory2);
        if (module.get_createdAtStart()) {
            module.prepareForCreationAtStart(singleInstanceFactory);
        }
        return OptionDSLKt.onOptions(new KoinDefinition(module, singleInstanceFactory2), function1);
    }

    public static /* synthetic */ KoinDefinition singleOf$default(Module module, Function15 constructor, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass16 anonymousClass16 = new AnonymousClass16(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
        Kind kind = Kind.Singleton;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass16, kind, listEmptyList));
        SingleInstanceFactory<?> singleInstanceFactory2 = singleInstanceFactory;
        module.indexPrimaryType(singleInstanceFactory2);
        if (module.get_createdAtStart()) {
            module.prepareForCreationAtStart(singleInstanceFactory);
        }
        return OptionDSLKt.onOptions(new KoinDefinition(module, singleInstanceFactory2), function1);
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: SingleOf.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0006\b\u0000\u0010\u0001\u0018\u0001\"\u0006\b\u0001\u0010\u0002\u0018\u0001\"\u0006\b\u0002\u0010\u0003\u0018\u0001\"\u0006\b\u0003\u0010\u0004\u0018\u0001\"\u0006\b\u0004\u0010\u0005\u0018\u0001\"\u0006\b\u0005\u0010\u0006\u0018\u0001\"\u0006\b\u0006\u0010\u0007\u0018\u0001\"\u0006\b\u0007\u0010\b\u0018\u0001\"\u0006\b\b\u0010\t\u0018\u0001\"\u0006\b\t\u0010\n\u0018\u0001\"\u0006\b\n\u0010\u000b\u0018\u0001\"\u0006\b\u000b\u0010\f\u0018\u0001\"\u0006\b\f\u0010\r\u0018\u0001\"\u0006\b\r\u0010\u000e\u0018\u0001\"\u0006\b\u000e\u0010\u000f\u0018\u0001\"\u0006\b\u000f\u0010\u0010\u0018\u0001*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\n¢\u0006\u0004\b\u0014\u0010\u0015"}, d2 = {"<anonymous>", "R", "T1", "T2", "T3", "T4", "T5", "T6", "T7", "T8", "T9", "T10", "T11", "T12", "T13", "T14", "T15", "Lorg/koin/core/scope/Scope;", "it", "Lorg/koin/core/parameter/ParametersHolder;", "invoke", "(Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/ParametersHolder;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = Opcodes.ARETURN)
    /* renamed from: org.koin.core.module.dsl.SingleOfKt$singleOf$16, reason: invalid class name */
    public static final class AnonymousClass16<R> extends Lambda implements Function2<Scope, ParametersHolder, R> {
        final /* synthetic */ Function15<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, R> $constructor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass16(Function15<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? extends R> function15) {
            super(2);
            this.$constructor = function15;
        }

        @Override // kotlin.jvm.functions.Function2
        public final R invoke(Scope single, ParametersHolder it) {
            Intrinsics.checkNotNullParameter(single, "$this$single");
            Intrinsics.checkNotNullParameter(it, "it");
            Function15<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, R> function15 = this.$constructor;
            Intrinsics.reifiedOperationMarker(4, "T1");
            Object obj = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T2");
            Object obj2 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T3");
            Object obj3 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T4");
            Object obj4 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T5");
            Object obj5 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T6");
            Object obj6 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T7");
            Object obj7 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T8");
            Object obj8 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T9");
            Object obj9 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T10");
            Object obj10 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T11");
            Object obj11 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T12");
            Object obj12 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T13");
            Object obj13 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T14");
            Object obj14 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T15");
            return function15.invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null));
        }
    }

    public static final /* synthetic */ <R, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> KoinDefinition<R> singleOf(Module module, Function15<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? extends R> constructor, Function1<? super BeanDefinition<R>, Unit> function1) {
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass16 anonymousClass16 = new AnonymousClass16(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
        Kind kind = Kind.Singleton;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass16, kind, listEmptyList));
        SingleInstanceFactory<?> singleInstanceFactory2 = singleInstanceFactory;
        module.indexPrimaryType(singleInstanceFactory2);
        if (module.get_createdAtStart()) {
            module.prepareForCreationAtStart(singleInstanceFactory);
        }
        return OptionDSLKt.onOptions(new KoinDefinition(module, singleInstanceFactory2), function1);
    }

    public static /* synthetic */ KoinDefinition singleOf$default(Module module, Function16 constructor, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass17 anonymousClass17 = new AnonymousClass17(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
        Kind kind = Kind.Singleton;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass17, kind, listEmptyList));
        SingleInstanceFactory<?> singleInstanceFactory2 = singleInstanceFactory;
        module.indexPrimaryType(singleInstanceFactory2);
        if (module.get_createdAtStart()) {
            module.prepareForCreationAtStart(singleInstanceFactory);
        }
        return OptionDSLKt.onOptions(new KoinDefinition(module, singleInstanceFactory2), function1);
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: SingleOf.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0006\b\u0000\u0010\u0001\u0018\u0001\"\u0006\b\u0001\u0010\u0002\u0018\u0001\"\u0006\b\u0002\u0010\u0003\u0018\u0001\"\u0006\b\u0003\u0010\u0004\u0018\u0001\"\u0006\b\u0004\u0010\u0005\u0018\u0001\"\u0006\b\u0005\u0010\u0006\u0018\u0001\"\u0006\b\u0006\u0010\u0007\u0018\u0001\"\u0006\b\u0007\u0010\b\u0018\u0001\"\u0006\b\b\u0010\t\u0018\u0001\"\u0006\b\t\u0010\n\u0018\u0001\"\u0006\b\n\u0010\u000b\u0018\u0001\"\u0006\b\u000b\u0010\f\u0018\u0001\"\u0006\b\f\u0010\r\u0018\u0001\"\u0006\b\r\u0010\u000e\u0018\u0001\"\u0006\b\u000e\u0010\u000f\u0018\u0001\"\u0006\b\u000f\u0010\u0010\u0018\u0001\"\u0006\b\u0010\u0010\u0011\u0018\u0001*\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\n¢\u0006\u0004\b\u0015\u0010\u0016"}, d2 = {"<anonymous>", "R", "T1", "T2", "T3", "T4", "T5", "T6", "T7", "T8", "T9", "T10", "T11", "T12", "T13", "T14", "T15", "T16", "Lorg/koin/core/scope/Scope;", "it", "Lorg/koin/core/parameter/ParametersHolder;", "invoke", "(Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/ParametersHolder;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = Opcodes.ARETURN)
    /* renamed from: org.koin.core.module.dsl.SingleOfKt$singleOf$17, reason: invalid class name */
    public static final class AnonymousClass17<R> extends Lambda implements Function2<Scope, ParametersHolder, R> {
        final /* synthetic */ Function16<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, R> $constructor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass17(Function16<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? extends R> function16) {
            super(2);
            this.$constructor = function16;
        }

        @Override // kotlin.jvm.functions.Function2
        public final R invoke(Scope single, ParametersHolder it) {
            Intrinsics.checkNotNullParameter(single, "$this$single");
            Intrinsics.checkNotNullParameter(it, "it");
            Function16<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, R> function16 = this.$constructor;
            Intrinsics.reifiedOperationMarker(4, "T1");
            Object obj = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T2");
            Object obj2 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T3");
            Object obj3 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T4");
            Object obj4 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T5");
            Object obj5 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T6");
            Object obj6 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T7");
            Object obj7 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T8");
            Object obj8 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T9");
            Object obj9 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T10");
            Object obj10 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T11");
            Object obj11 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T12");
            Object obj12 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T13");
            Object obj13 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T14");
            Object obj14 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T15");
            Object obj15 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T16");
            return function16.invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null));
        }
    }

    public static final /* synthetic */ <R, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> KoinDefinition<R> singleOf(Module module, Function16<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? extends R> constructor, Function1<? super BeanDefinition<R>, Unit> function1) {
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass17 anonymousClass17 = new AnonymousClass17(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
        Kind kind = Kind.Singleton;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass17, kind, listEmptyList));
        SingleInstanceFactory<?> singleInstanceFactory2 = singleInstanceFactory;
        module.indexPrimaryType(singleInstanceFactory2);
        if (module.get_createdAtStart()) {
            module.prepareForCreationAtStart(singleInstanceFactory);
        }
        return OptionDSLKt.onOptions(new KoinDefinition(module, singleInstanceFactory2), function1);
    }

    public static /* synthetic */ KoinDefinition singleOf$default(Module module, Function17 constructor, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass18 anonymousClass18 = new AnonymousClass18(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
        Kind kind = Kind.Singleton;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass18, kind, listEmptyList));
        SingleInstanceFactory<?> singleInstanceFactory2 = singleInstanceFactory;
        module.indexPrimaryType(singleInstanceFactory2);
        if (module.get_createdAtStart()) {
            module.prepareForCreationAtStart(singleInstanceFactory);
        }
        return OptionDSLKt.onOptions(new KoinDefinition(module, singleInstanceFactory2), function1);
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: SingleOf.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0006\b\u0000\u0010\u0001\u0018\u0001\"\u0006\b\u0001\u0010\u0002\u0018\u0001\"\u0006\b\u0002\u0010\u0003\u0018\u0001\"\u0006\b\u0003\u0010\u0004\u0018\u0001\"\u0006\b\u0004\u0010\u0005\u0018\u0001\"\u0006\b\u0005\u0010\u0006\u0018\u0001\"\u0006\b\u0006\u0010\u0007\u0018\u0001\"\u0006\b\u0007\u0010\b\u0018\u0001\"\u0006\b\b\u0010\t\u0018\u0001\"\u0006\b\t\u0010\n\u0018\u0001\"\u0006\b\n\u0010\u000b\u0018\u0001\"\u0006\b\u000b\u0010\f\u0018\u0001\"\u0006\b\f\u0010\r\u0018\u0001\"\u0006\b\r\u0010\u000e\u0018\u0001\"\u0006\b\u000e\u0010\u000f\u0018\u0001\"\u0006\b\u000f\u0010\u0010\u0018\u0001\"\u0006\b\u0010\u0010\u0011\u0018\u0001\"\u0006\b\u0011\u0010\u0012\u0018\u0001*\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\n¢\u0006\u0004\b\u0016\u0010\u0017"}, d2 = {"<anonymous>", "R", "T1", "T2", "T3", "T4", "T5", "T6", "T7", "T8", "T9", "T10", "T11", "T12", "T13", "T14", "T15", "T16", "T17", "Lorg/koin/core/scope/Scope;", "it", "Lorg/koin/core/parameter/ParametersHolder;", "invoke", "(Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/ParametersHolder;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = Opcodes.ARETURN)
    /* renamed from: org.koin.core.module.dsl.SingleOfKt$singleOf$18, reason: invalid class name */
    public static final class AnonymousClass18<R> extends Lambda implements Function2<Scope, ParametersHolder, R> {
        final /* synthetic */ Function17<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, R> $constructor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass18(Function17<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? super T17, ? extends R> function17) {
            super(2);
            this.$constructor = function17;
        }

        @Override // kotlin.jvm.functions.Function2
        public final R invoke(Scope single, ParametersHolder it) {
            Intrinsics.checkNotNullParameter(single, "$this$single");
            Intrinsics.checkNotNullParameter(it, "it");
            Function17<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, R> function17 = this.$constructor;
            Intrinsics.reifiedOperationMarker(4, "T1");
            Object obj = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T2");
            Object obj2 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T3");
            Object obj3 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T4");
            Object obj4 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T5");
            Object obj5 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T6");
            Object obj6 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T7");
            Object obj7 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T8");
            Object obj8 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T9");
            Object obj9 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T10");
            Object obj10 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T11");
            Object obj11 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T12");
            Object obj12 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T13");
            Object obj13 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T14");
            Object obj14 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T15");
            Object obj15 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T16");
            Object obj16 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T17");
            return function17.invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null));
        }
    }

    public static final /* synthetic */ <R, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> KoinDefinition<R> singleOf(Module module, Function17<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? super T17, ? extends R> constructor, Function1<? super BeanDefinition<R>, Unit> function1) {
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass18 anonymousClass18 = new AnonymousClass18(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
        Kind kind = Kind.Singleton;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass18, kind, listEmptyList));
        SingleInstanceFactory<?> singleInstanceFactory2 = singleInstanceFactory;
        module.indexPrimaryType(singleInstanceFactory2);
        if (module.get_createdAtStart()) {
            module.prepareForCreationAtStart(singleInstanceFactory);
        }
        return OptionDSLKt.onOptions(new KoinDefinition(module, singleInstanceFactory2), function1);
    }

    public static /* synthetic */ KoinDefinition singleOf$default(Module module, Function18 constructor, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass19 anonymousClass19 = new AnonymousClass19(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
        Kind kind = Kind.Singleton;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass19, kind, listEmptyList));
        SingleInstanceFactory<?> singleInstanceFactory2 = singleInstanceFactory;
        module.indexPrimaryType(singleInstanceFactory2);
        if (module.get_createdAtStart()) {
            module.prepareForCreationAtStart(singleInstanceFactory);
        }
        return OptionDSLKt.onOptions(new KoinDefinition(module, singleInstanceFactory2), function1);
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: SingleOf.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0006\b\u0000\u0010\u0001\u0018\u0001\"\u0006\b\u0001\u0010\u0002\u0018\u0001\"\u0006\b\u0002\u0010\u0003\u0018\u0001\"\u0006\b\u0003\u0010\u0004\u0018\u0001\"\u0006\b\u0004\u0010\u0005\u0018\u0001\"\u0006\b\u0005\u0010\u0006\u0018\u0001\"\u0006\b\u0006\u0010\u0007\u0018\u0001\"\u0006\b\u0007\u0010\b\u0018\u0001\"\u0006\b\b\u0010\t\u0018\u0001\"\u0006\b\t\u0010\n\u0018\u0001\"\u0006\b\n\u0010\u000b\u0018\u0001\"\u0006\b\u000b\u0010\f\u0018\u0001\"\u0006\b\f\u0010\r\u0018\u0001\"\u0006\b\r\u0010\u000e\u0018\u0001\"\u0006\b\u000e\u0010\u000f\u0018\u0001\"\u0006\b\u000f\u0010\u0010\u0018\u0001\"\u0006\b\u0010\u0010\u0011\u0018\u0001\"\u0006\b\u0011\u0010\u0012\u0018\u0001\"\u0006\b\u0012\u0010\u0013\u0018\u0001*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\n¢\u0006\u0004\b\u0017\u0010\u0018"}, d2 = {"<anonymous>", "R", "T1", "T2", "T3", "T4", "T5", "T6", "T7", "T8", "T9", "T10", "T11", "T12", "T13", "T14", "T15", "T16", "T17", "T18", "Lorg/koin/core/scope/Scope;", "it", "Lorg/koin/core/parameter/ParametersHolder;", "invoke", "(Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/ParametersHolder;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = Opcodes.ARETURN)
    /* renamed from: org.koin.core.module.dsl.SingleOfKt$singleOf$19, reason: invalid class name */
    public static final class AnonymousClass19<R> extends Lambda implements Function2<Scope, ParametersHolder, R> {
        final /* synthetic */ Function18<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, R> $constructor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass19(Function18<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? super T17, ? super T18, ? extends R> function18) {
            super(2);
            this.$constructor = function18;
        }

        @Override // kotlin.jvm.functions.Function2
        public final R invoke(Scope single, ParametersHolder it) {
            Intrinsics.checkNotNullParameter(single, "$this$single");
            Intrinsics.checkNotNullParameter(it, "it");
            Function18<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, R> function18 = this.$constructor;
            Intrinsics.reifiedOperationMarker(4, "T1");
            Object obj = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T2");
            Object obj2 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T3");
            Object obj3 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T4");
            Object obj4 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T5");
            Object obj5 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T6");
            Object obj6 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T7");
            Object obj7 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T8");
            Object obj8 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T9");
            Object obj9 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T10");
            Object obj10 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T11");
            Object obj11 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T12");
            Object obj12 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T13");
            Object obj13 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T14");
            Object obj14 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T15");
            Object obj15 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T16");
            Object obj16 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T17");
            Object obj17 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T18");
            return function18.invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null));
        }
    }

    public static final /* synthetic */ <R, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> KoinDefinition<R> singleOf(Module module, Function18<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? super T17, ? super T18, ? extends R> constructor, Function1<? super BeanDefinition<R>, Unit> function1) {
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass19 anonymousClass19 = new AnonymousClass19(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
        Kind kind = Kind.Singleton;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass19, kind, listEmptyList));
        SingleInstanceFactory<?> singleInstanceFactory2 = singleInstanceFactory;
        module.indexPrimaryType(singleInstanceFactory2);
        if (module.get_createdAtStart()) {
            module.prepareForCreationAtStart(singleInstanceFactory);
        }
        return OptionDSLKt.onOptions(new KoinDefinition(module, singleInstanceFactory2), function1);
    }

    public static /* synthetic */ KoinDefinition singleOf$default(Module module, Function19 constructor, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass20 anonymousClass20 = new AnonymousClass20(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
        Kind kind = Kind.Singleton;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass20, kind, listEmptyList));
        SingleInstanceFactory<?> singleInstanceFactory2 = singleInstanceFactory;
        module.indexPrimaryType(singleInstanceFactory2);
        if (module.get_createdAtStart()) {
            module.prepareForCreationAtStart(singleInstanceFactory);
        }
        return OptionDSLKt.onOptions(new KoinDefinition(module, singleInstanceFactory2), function1);
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: SingleOf.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0006\b\u0000\u0010\u0001\u0018\u0001\"\u0006\b\u0001\u0010\u0002\u0018\u0001\"\u0006\b\u0002\u0010\u0003\u0018\u0001\"\u0006\b\u0003\u0010\u0004\u0018\u0001\"\u0006\b\u0004\u0010\u0005\u0018\u0001\"\u0006\b\u0005\u0010\u0006\u0018\u0001\"\u0006\b\u0006\u0010\u0007\u0018\u0001\"\u0006\b\u0007\u0010\b\u0018\u0001\"\u0006\b\b\u0010\t\u0018\u0001\"\u0006\b\t\u0010\n\u0018\u0001\"\u0006\b\n\u0010\u000b\u0018\u0001\"\u0006\b\u000b\u0010\f\u0018\u0001\"\u0006\b\f\u0010\r\u0018\u0001\"\u0006\b\r\u0010\u000e\u0018\u0001\"\u0006\b\u000e\u0010\u000f\u0018\u0001\"\u0006\b\u000f\u0010\u0010\u0018\u0001\"\u0006\b\u0010\u0010\u0011\u0018\u0001\"\u0006\b\u0011\u0010\u0012\u0018\u0001\"\u0006\b\u0012\u0010\u0013\u0018\u0001\"\u0006\b\u0013\u0010\u0014\u0018\u0001*\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\n¢\u0006\u0004\b\u0018\u0010\u0019"}, d2 = {"<anonymous>", "R", "T1", "T2", "T3", "T4", "T5", "T6", "T7", "T8", "T9", "T10", "T11", "T12", "T13", "T14", "T15", "T16", "T17", "T18", "T19", "Lorg/koin/core/scope/Scope;", "it", "Lorg/koin/core/parameter/ParametersHolder;", "invoke", "(Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/ParametersHolder;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = Opcodes.ARETURN)
    /* renamed from: org.koin.core.module.dsl.SingleOfKt$singleOf$20, reason: invalid class name */
    public static final class AnonymousClass20<R> extends Lambda implements Function2<Scope, ParametersHolder, R> {
        final /* synthetic */ Function19<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, R> $constructor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass20(Function19<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? super T17, ? super T18, ? super T19, ? extends R> function19) {
            super(2);
            this.$constructor = function19;
        }

        @Override // kotlin.jvm.functions.Function2
        public final R invoke(Scope single, ParametersHolder it) {
            Intrinsics.checkNotNullParameter(single, "$this$single");
            Intrinsics.checkNotNullParameter(it, "it");
            Function19<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, R> function19 = this.$constructor;
            Intrinsics.reifiedOperationMarker(4, "T1");
            Object obj = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T2");
            Object obj2 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T3");
            Object obj3 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T4");
            Object obj4 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T5");
            Object obj5 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T6");
            Object obj6 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T7");
            Object obj7 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T8");
            Object obj8 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T9");
            Object obj9 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T10");
            Object obj10 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T11");
            Object obj11 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T12");
            Object obj12 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T13");
            Object obj13 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T14");
            Object obj14 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T15");
            Object obj15 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T16");
            Object obj16 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T17");
            Object obj17 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T18");
            Object obj18 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T19");
            return function19.invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null));
        }
    }

    public static final /* synthetic */ <R, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> KoinDefinition<R> singleOf(Module module, Function19<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? super T17, ? super T18, ? super T19, ? extends R> constructor, Function1<? super BeanDefinition<R>, Unit> function1) {
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass20 anonymousClass20 = new AnonymousClass20(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
        Kind kind = Kind.Singleton;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass20, kind, listEmptyList));
        SingleInstanceFactory<?> singleInstanceFactory2 = singleInstanceFactory;
        module.indexPrimaryType(singleInstanceFactory2);
        if (module.get_createdAtStart()) {
            module.prepareForCreationAtStart(singleInstanceFactory);
        }
        return OptionDSLKt.onOptions(new KoinDefinition(module, singleInstanceFactory2), function1);
    }

    public static /* synthetic */ KoinDefinition singleOf$default(Module module, Function20 constructor, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass21 anonymousClass21 = new AnonymousClass21(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
        Kind kind = Kind.Singleton;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass21, kind, listEmptyList));
        SingleInstanceFactory<?> singleInstanceFactory2 = singleInstanceFactory;
        module.indexPrimaryType(singleInstanceFactory2);
        if (module.get_createdAtStart()) {
            module.prepareForCreationAtStart(singleInstanceFactory);
        }
        return OptionDSLKt.onOptions(new KoinDefinition(module, singleInstanceFactory2), function1);
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: SingleOf.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0006\b\u0000\u0010\u0001\u0018\u0001\"\u0006\b\u0001\u0010\u0002\u0018\u0001\"\u0006\b\u0002\u0010\u0003\u0018\u0001\"\u0006\b\u0003\u0010\u0004\u0018\u0001\"\u0006\b\u0004\u0010\u0005\u0018\u0001\"\u0006\b\u0005\u0010\u0006\u0018\u0001\"\u0006\b\u0006\u0010\u0007\u0018\u0001\"\u0006\b\u0007\u0010\b\u0018\u0001\"\u0006\b\b\u0010\t\u0018\u0001\"\u0006\b\t\u0010\n\u0018\u0001\"\u0006\b\n\u0010\u000b\u0018\u0001\"\u0006\b\u000b\u0010\f\u0018\u0001\"\u0006\b\f\u0010\r\u0018\u0001\"\u0006\b\r\u0010\u000e\u0018\u0001\"\u0006\b\u000e\u0010\u000f\u0018\u0001\"\u0006\b\u000f\u0010\u0010\u0018\u0001\"\u0006\b\u0010\u0010\u0011\u0018\u0001\"\u0006\b\u0011\u0010\u0012\u0018\u0001\"\u0006\b\u0012\u0010\u0013\u0018\u0001\"\u0006\b\u0013\u0010\u0014\u0018\u0001\"\u0006\b\u0014\u0010\u0015\u0018\u0001*\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\n¢\u0006\u0004\b\u0019\u0010\u001a"}, d2 = {"<anonymous>", "R", "T1", "T2", "T3", "T4", "T5", "T6", "T7", "T8", "T9", "T10", "T11", "T12", "T13", "T14", "T15", "T16", "T17", "T18", "T19", "T20", "Lorg/koin/core/scope/Scope;", "it", "Lorg/koin/core/parameter/ParametersHolder;", "invoke", "(Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/ParametersHolder;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = Opcodes.ARETURN)
    /* renamed from: org.koin.core.module.dsl.SingleOfKt$singleOf$21, reason: invalid class name */
    public static final class AnonymousClass21<R> extends Lambda implements Function2<Scope, ParametersHolder, R> {
        final /* synthetic */ Function20<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, R> $constructor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass21(Function20<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? super T17, ? super T18, ? super T19, ? super T20, ? extends R> function20) {
            super(2);
            this.$constructor = function20;
        }

        @Override // kotlin.jvm.functions.Function2
        public final R invoke(Scope single, ParametersHolder it) {
            Intrinsics.checkNotNullParameter(single, "$this$single");
            Intrinsics.checkNotNullParameter(it, "it");
            Function20<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, R> function20 = this.$constructor;
            Intrinsics.reifiedOperationMarker(4, "T1");
            Object obj = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T2");
            Object obj2 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T3");
            Object obj3 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T4");
            Object obj4 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T5");
            Object obj5 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T6");
            Object obj6 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T7");
            Object obj7 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T8");
            Object obj8 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T9");
            Object obj9 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T10");
            Object obj10 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T11");
            Object obj11 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T12");
            Object obj12 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T13");
            Object obj13 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T14");
            Object obj14 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T15");
            Object obj15 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T16");
            Object obj16 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T17");
            Object obj17 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T18");
            Object obj18 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T19");
            Object obj19 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T20");
            return function20.invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, obj19, single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null));
        }
    }

    public static final /* synthetic */ <R, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> KoinDefinition<R> singleOf(Module module, Function20<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? super T17, ? super T18, ? super T19, ? super T20, ? extends R> constructor, Function1<? super BeanDefinition<R>, Unit> function1) {
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass21 anonymousClass21 = new AnonymousClass21(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
        Kind kind = Kind.Singleton;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass21, kind, listEmptyList));
        SingleInstanceFactory<?> singleInstanceFactory2 = singleInstanceFactory;
        module.indexPrimaryType(singleInstanceFactory2);
        if (module.get_createdAtStart()) {
            module.prepareForCreationAtStart(singleInstanceFactory);
        }
        return OptionDSLKt.onOptions(new KoinDefinition(module, singleInstanceFactory2), function1);
    }

    public static /* synthetic */ KoinDefinition singleOf$default(Module module, Function21 constructor, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass22 anonymousClass22 = new AnonymousClass22(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
        Kind kind = Kind.Singleton;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass22, kind, listEmptyList));
        SingleInstanceFactory<?> singleInstanceFactory2 = singleInstanceFactory;
        module.indexPrimaryType(singleInstanceFactory2);
        if (module.get_createdAtStart()) {
            module.prepareForCreationAtStart(singleInstanceFactory);
        }
        return OptionDSLKt.onOptions(new KoinDefinition(module, singleInstanceFactory2), function1);
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: SingleOf.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0006\b\u0000\u0010\u0001\u0018\u0001\"\u0006\b\u0001\u0010\u0002\u0018\u0001\"\u0006\b\u0002\u0010\u0003\u0018\u0001\"\u0006\b\u0003\u0010\u0004\u0018\u0001\"\u0006\b\u0004\u0010\u0005\u0018\u0001\"\u0006\b\u0005\u0010\u0006\u0018\u0001\"\u0006\b\u0006\u0010\u0007\u0018\u0001\"\u0006\b\u0007\u0010\b\u0018\u0001\"\u0006\b\b\u0010\t\u0018\u0001\"\u0006\b\t\u0010\n\u0018\u0001\"\u0006\b\n\u0010\u000b\u0018\u0001\"\u0006\b\u000b\u0010\f\u0018\u0001\"\u0006\b\f\u0010\r\u0018\u0001\"\u0006\b\r\u0010\u000e\u0018\u0001\"\u0006\b\u000e\u0010\u000f\u0018\u0001\"\u0006\b\u000f\u0010\u0010\u0018\u0001\"\u0006\b\u0010\u0010\u0011\u0018\u0001\"\u0006\b\u0011\u0010\u0012\u0018\u0001\"\u0006\b\u0012\u0010\u0013\u0018\u0001\"\u0006\b\u0013\u0010\u0014\u0018\u0001\"\u0006\b\u0014\u0010\u0015\u0018\u0001\"\u0006\b\u0015\u0010\u0016\u0018\u0001*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\n¢\u0006\u0004\b\u001a\u0010\u001b"}, d2 = {"<anonymous>", "R", "T1", "T2", "T3", "T4", "T5", "T6", "T7", "T8", "T9", "T10", "T11", "T12", "T13", "T14", "T15", "T16", "T17", "T18", "T19", "T20", "T21", "Lorg/koin/core/scope/Scope;", "it", "Lorg/koin/core/parameter/ParametersHolder;", "invoke", "(Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/ParametersHolder;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = Opcodes.ARETURN)
    /* renamed from: org.koin.core.module.dsl.SingleOfKt$singleOf$22, reason: invalid class name */
    public static final class AnonymousClass22<R> extends Lambda implements Function2<Scope, ParametersHolder, R> {
        final /* synthetic */ Function21<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, R> $constructor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass22(Function21<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? super T17, ? super T18, ? super T19, ? super T20, ? super T21, ? extends R> function21) {
            super(2);
            this.$constructor = function21;
        }

        @Override // kotlin.jvm.functions.Function2
        public final R invoke(Scope single, ParametersHolder it) {
            Intrinsics.checkNotNullParameter(single, "$this$single");
            Intrinsics.checkNotNullParameter(it, "it");
            Function21<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, R> function21 = this.$constructor;
            Intrinsics.reifiedOperationMarker(4, "T1");
            Object obj = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T2");
            Object obj2 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T3");
            Object obj3 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T4");
            Object obj4 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T5");
            Object obj5 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T6");
            Object obj6 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T7");
            Object obj7 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T8");
            Object obj8 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T9");
            Object obj9 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T10");
            Object obj10 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T11");
            Object obj11 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T12");
            Object obj12 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T13");
            Object obj13 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T14");
            Object obj14 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T15");
            Object obj15 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T16");
            Object obj16 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T17");
            Object obj17 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T18");
            Object obj18 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T19");
            Object obj19 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T20");
            Object obj20 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T21");
            return function21.invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, obj19, obj20, single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null));
        }
    }

    public static final /* synthetic */ <R, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> KoinDefinition<R> singleOf(Module module, Function21<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? super T17, ? super T18, ? super T19, ? super T20, ? super T21, ? extends R> constructor, Function1<? super BeanDefinition<R>, Unit> function1) {
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass22 anonymousClass22 = new AnonymousClass22(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
        Kind kind = Kind.Singleton;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass22, kind, listEmptyList));
        SingleInstanceFactory<?> singleInstanceFactory2 = singleInstanceFactory;
        module.indexPrimaryType(singleInstanceFactory2);
        if (module.get_createdAtStart()) {
            module.prepareForCreationAtStart(singleInstanceFactory);
        }
        return OptionDSLKt.onOptions(new KoinDefinition(module, singleInstanceFactory2), function1);
    }

    public static /* synthetic */ KoinDefinition singleOf$default(Module module, Function22 constructor, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass23 anonymousClass23 = new AnonymousClass23(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
        Kind kind = Kind.Singleton;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass23, kind, listEmptyList));
        SingleInstanceFactory<?> singleInstanceFactory2 = singleInstanceFactory;
        module.indexPrimaryType(singleInstanceFactory2);
        if (module.get_createdAtStart()) {
            module.prepareForCreationAtStart(singleInstanceFactory);
        }
        return OptionDSLKt.onOptions(new KoinDefinition(module, singleInstanceFactory2), function1);
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: SingleOf.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0006\b\u0000\u0010\u0001\u0018\u0001\"\u0006\b\u0001\u0010\u0002\u0018\u0001\"\u0006\b\u0002\u0010\u0003\u0018\u0001\"\u0006\b\u0003\u0010\u0004\u0018\u0001\"\u0006\b\u0004\u0010\u0005\u0018\u0001\"\u0006\b\u0005\u0010\u0006\u0018\u0001\"\u0006\b\u0006\u0010\u0007\u0018\u0001\"\u0006\b\u0007\u0010\b\u0018\u0001\"\u0006\b\b\u0010\t\u0018\u0001\"\u0006\b\t\u0010\n\u0018\u0001\"\u0006\b\n\u0010\u000b\u0018\u0001\"\u0006\b\u000b\u0010\f\u0018\u0001\"\u0006\b\f\u0010\r\u0018\u0001\"\u0006\b\r\u0010\u000e\u0018\u0001\"\u0006\b\u000e\u0010\u000f\u0018\u0001\"\u0006\b\u000f\u0010\u0010\u0018\u0001\"\u0006\b\u0010\u0010\u0011\u0018\u0001\"\u0006\b\u0011\u0010\u0012\u0018\u0001\"\u0006\b\u0012\u0010\u0013\u0018\u0001\"\u0006\b\u0013\u0010\u0014\u0018\u0001\"\u0006\b\u0014\u0010\u0015\u0018\u0001\"\u0006\b\u0015\u0010\u0016\u0018\u0001\"\u0006\b\u0016\u0010\u0017\u0018\u0001*\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\n¢\u0006\u0004\b\u001b\u0010\u001c"}, d2 = {"<anonymous>", "R", "T1", "T2", "T3", "T4", "T5", "T6", "T7", "T8", "T9", "T10", "T11", "T12", "T13", "T14", "T15", "T16", "T17", "T18", "T19", "T20", "T21", "T22", "Lorg/koin/core/scope/Scope;", "it", "Lorg/koin/core/parameter/ParametersHolder;", "invoke", "(Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/ParametersHolder;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = Opcodes.ARETURN)
    /* renamed from: org.koin.core.module.dsl.SingleOfKt$singleOf$23, reason: invalid class name */
    public static final class AnonymousClass23<R> extends Lambda implements Function2<Scope, ParametersHolder, R> {
        final /* synthetic */ Function22<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, R> $constructor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass23(Function22<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? super T17, ? super T18, ? super T19, ? super T20, ? super T21, ? super T22, ? extends R> function22) {
            super(2);
            this.$constructor = function22;
        }

        @Override // kotlin.jvm.functions.Function2
        public final R invoke(Scope single, ParametersHolder it) {
            Intrinsics.checkNotNullParameter(single, "$this$single");
            Intrinsics.checkNotNullParameter(it, "it");
            Function22<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, R> function22 = this.$constructor;
            Intrinsics.reifiedOperationMarker(4, "T1");
            Object obj = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T2");
            Object obj2 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T3");
            Object obj3 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T4");
            Object obj4 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T5");
            Object obj5 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T6");
            Object obj6 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T7");
            Object obj7 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T8");
            Object obj8 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T9");
            Object obj9 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T10");
            Object obj10 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T11");
            Object obj11 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T12");
            Object obj12 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T13");
            Object obj13 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T14");
            Object obj14 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T15");
            Object obj15 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T16");
            Object obj16 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T17");
            Object obj17 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T18");
            Object obj18 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T19");
            Object obj19 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T20");
            Object obj20 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T21");
            Object obj21 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
            Intrinsics.reifiedOperationMarker(4, "T22");
            return function22.invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, obj19, obj20, obj21, single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null));
        }
    }

    public static final /* synthetic */ <R, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> KoinDefinition<R> singleOf(Module module, Function22<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? super T17, ? super T18, ? super T19, ? super T20, ? super T21, ? super T22, ? extends R> constructor, Function1<? super BeanDefinition<R>, Unit> function1) {
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.needClassReification();
        AnonymousClass23 anonymousClass23 = new AnonymousClass23(constructor);
        StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
        Kind kind = Kind.Singleton;
        List listEmptyList = CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), null, anonymousClass23, kind, listEmptyList));
        SingleInstanceFactory<?> singleInstanceFactory2 = singleInstanceFactory;
        module.indexPrimaryType(singleInstanceFactory2);
        if (module.get_createdAtStart()) {
            module.prepareForCreationAtStart(singleInstanceFactory);
        }
        return OptionDSLKt.onOptions(new KoinDefinition(module, singleInstanceFactory2), function1);
    }
}
