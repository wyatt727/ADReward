package org.koin.core.registry;

import com.google.android.gms.ads.RequestConfiguration;
import com.json.i1;
import com.json.mediationsdk.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.koin.core.Koin;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.BeanDefinitionKt;
import org.koin.core.definition.Kind;
import org.koin.core.instance.InstanceContext;
import org.koin.core.instance.InstanceFactory;
import org.koin.core.instance.ScopedInstanceFactory;
import org.koin.core.instance.SingleInstanceFactory;
import org.koin.core.module.Module;
import org.koin.core.module.ModuleKt;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import org.koin.mp.KoinPlatformTools;

/* compiled from: InstanceRegistry.kt */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\r\u0010\u0019\u001a\u00020\u0016H\u0000¢\u0006\u0002\b\u001aJ\r\u0010\u001b\u001a\u00020\u0016H\u0000¢\u0006\u0002\b\u001cJ\u001a\u0010\u001d\u001a\u00020\u00162\u0010\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f0\u001eH\u0002JH\u0010\u001f\u001a\u00020\u0016\"\u0006\b\u0000\u0010 \u0018\u00012\u0006\u0010!\u001a\u0002H 2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#2\u0012\b\u0002\u0010$\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030&0%2\b\b\u0002\u0010'\u001a\u00020(H\u0081\b¢\u0006\u0002\u0010)J\\\u0010*\u001a\u00020\u0016\"\u0006\b\u0000\u0010 \u0018\u00012\u0006\u0010!\u001a\u0002H 2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#2\u0012\b\u0002\u0010$\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030&0%2\b\b\u0002\u0010'\u001a\u00020(2\u0006\u0010+\u001a\u00020#2\n\u0010,\u001a\u00060\u0007j\u0002`-H\u0081\b¢\u0006\u0002\u0010.J\u0015\u0010/\u001a\u00020\u00162\u0006\u00100\u001a\u000201H\u0000¢\u0006\u0002\b2J-\u00103\u001a\b\u0012\u0004\u0012\u0002H 0%\"\u0004\b\u0000\u0010 2\n\u00104\u001a\u0006\u0012\u0002\b\u00030&2\u0006\u00105\u001a\u000206H\u0000¢\u0006\u0002\b7J\u0018\u00108\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010'\u001a\u00020(H\u0002J#\u00109\u001a\u00020\u00162\f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00180;2\u0006\u0010'\u001a\u00020(H\u0000¢\u0006\u0002\b<J1\u0010=\u001a\b\u0012\u0002\b\u0003\u0018\u00010\t2\n\u00104\u001a\u0006\u0012\u0002\b\u00030&2\b\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010+\u001a\u00020#H\u0000¢\u0006\u0002\b>J=\u0010?\u001a\u0004\u0018\u0001H \"\u0004\b\u0000\u0010 2\b\u0010\"\u001a\u0004\u0018\u00010#2\n\u00104\u001a\u0006\u0012\u0002\b\u00030&2\u0006\u0010+\u001a\u00020#2\u0006\u00105\u001a\u000206H\u0000¢\u0006\u0004\b@\u0010AJ2\u0010B\u001a\u00020\u00162\u0006\u0010'\u001a\u00020(2\n\u0010C\u001a\u00060\u0007j\u0002`\b2\n\u0010D\u001a\u0006\u0012\u0002\b\u00030\t2\b\b\u0002\u0010E\u001a\u00020(H\u0007J\u0006\u0010F\u001a\u00020\u000eJ\u0010\u0010G\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u001b\u0010H\u001a\u00020\u00162\f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00180;H\u0000¢\u0006\u0002\bIR\"\u0010\u0005\u001a\u0016\u0012\b\u0012\u00060\u0007j\u0002`\b\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR2\u0010\f\u001a&\u0012\u0004\u0012\u00020\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f0\rj\u0012\u0012\u0004\u0012\u00020\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f`\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R%\u0010\u0011\u001a\u0016\u0012\b\u0012\u00060\u0007j\u0002`\b\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006J"}, d2 = {"Lorg/koin/core/registry/InstanceRegistry;", "", "_koin", "Lorg/koin/core/Koin;", "(Lorg/koin/core/Koin;)V", "_instances", "", "", "Lorg/koin/core/definition/IndexKey;", "Lorg/koin/core/instance/InstanceFactory;", "get_koin", "()Lorg/koin/core/Koin;", "eagerInstances", "Ljava/util/HashMap;", "", "Lorg/koin/core/instance/SingleInstanceFactory;", "Lkotlin/collections/HashMap;", d.k, "", "getInstances", "()Ljava/util/Map;", "addAllEagerInstances", "", "module", "Lorg/koin/core/module/Module;", "close", "close$koin_core", "createAllEagerInstances", "createAllEagerInstances$koin_core", "createEagerInstances", "", "declareRootInstance", RequestConfiguration.MAX_AD_CONTENT_RATING_T, i1.o, "qualifier", "Lorg/koin/core/qualifier/Qualifier;", "secondaryTypes", "", "Lkotlin/reflect/KClass;", "allowOverride", "", "(Ljava/lang/Object;Lorg/koin/core/qualifier/Qualifier;Ljava/util/List;Z)V", "declareScopedInstance", "scopeQualifier", "scopeID", "Lorg/koin/core/scope/ScopeID;", "(Ljava/lang/Object;Lorg/koin/core/qualifier/Qualifier;Ljava/util/List;ZLorg/koin/core/qualifier/Qualifier;Ljava/lang/String;)V", "dropScopeInstances", "scope", "Lorg/koin/core/scope/Scope;", "dropScopeInstances$koin_core", "getAll", "clazz", "instanceContext", "Lorg/koin/core/instance/InstanceContext;", "getAll$koin_core", "loadModule", "loadModules", "modules", "", "loadModules$koin_core", "resolveDefinition", "resolveDefinition$koin_core", "resolveInstance", "resolveInstance$koin_core", "(Lorg/koin/core/qualifier/Qualifier;Lkotlin/reflect/KClass;Lorg/koin/core/qualifier/Qualifier;Lorg/koin/core/instance/InstanceContext;)Ljava/lang/Object;", "saveMapping", "mapping", "factory", "logWarning", "size", "unloadModule", "unloadModules", "unloadModules$koin_core", "koin-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class InstanceRegistry {
    private final Map<String, InstanceFactory<?>> _instances;
    private final Koin _koin;
    private final HashMap<Integer, SingleInstanceFactory<?>> eagerInstances;

    public InstanceRegistry(Koin _koin) {
        Intrinsics.checkNotNullParameter(_koin, "_koin");
        this._koin = _koin;
        this._instances = KoinPlatformTools.INSTANCE.safeHashMap();
        this.eagerInstances = new HashMap<>();
    }

    public final Koin get_koin() {
        return this._koin;
    }

    public final Map<String, InstanceFactory<?>> getInstances() {
        return this._instances;
    }

    public final void loadModules$koin_core(Set<Module> modules, boolean allowOverride) {
        Intrinsics.checkNotNullParameter(modules, "modules");
        for (Module module : modules) {
            loadModule(module, allowOverride);
            addAllEagerInstances(module);
        }
    }

    private final void addAllEagerInstances(Module module) {
        for (SingleInstanceFactory<?> singleInstanceFactory : module.getEagerInstances()) {
            this.eagerInstances.put(Integer.valueOf(singleInstanceFactory.hashCode()), singleInstanceFactory);
        }
    }

    public final void createAllEagerInstances$koin_core() {
        Collection<SingleInstanceFactory<?>> collectionValues = this.eagerInstances.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
        SingleInstanceFactory[] singleInstanceFactoryArr = (SingleInstanceFactory[]) collectionValues.toArray(new SingleInstanceFactory[0]);
        ArrayList arrayListArrayListOf = CollectionsKt.arrayListOf(Arrays.copyOf(singleInstanceFactoryArr, singleInstanceFactoryArr.length));
        this.eagerInstances.clear();
        createEagerInstances(arrayListArrayListOf);
    }

    private final void loadModule(Module module, boolean allowOverride) {
        for (Map.Entry<String, InstanceFactory<?>> entry : module.getMappings().entrySet()) {
            saveMapping$default(this, allowOverride, entry.getKey(), entry.getValue(), false, 8, null);
        }
    }

    public static /* synthetic */ void saveMapping$default(InstanceRegistry instanceRegistry, boolean z, String str, InstanceFactory instanceFactory, boolean z2, int i, Object obj) {
        if ((i & 8) != 0) {
            z2 = true;
        }
        instanceRegistry.saveMapping(z, str, instanceFactory, z2);
    }

    public final void saveMapping(boolean allowOverride, String mapping, InstanceFactory<?> factory, boolean logWarning) {
        Intrinsics.checkNotNullParameter(mapping, "mapping");
        Intrinsics.checkNotNullParameter(factory, "factory");
        if (this._instances.containsKey(mapping)) {
            if (!allowOverride) {
                ModuleKt.overrideError(factory, mapping);
            } else if (logWarning) {
                this._koin.getLogger().warn("(+) override index '" + mapping + "' -> '" + factory.getBeanDefinition() + '\'');
            }
        }
        this._koin.getLogger().debug("(+) index '" + mapping + "' -> '" + factory.getBeanDefinition() + '\'');
        this._instances.put(mapping, factory);
    }

    private final void createEagerInstances(Collection<? extends SingleInstanceFactory<?>> instances) {
        InstanceContext instanceContext = new InstanceContext(this._koin.getLogger(), this._koin.getScopeRegistry().getRootScope(), null, 4, null);
        Iterator<T> it = instances.iterator();
        while (it.hasNext()) {
            ((SingleInstanceFactory) it.next()).get(instanceContext);
        }
    }

    public final InstanceFactory<?> resolveDefinition$koin_core(KClass<?> clazz, Qualifier qualifier, Qualifier scopeQualifier) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(scopeQualifier, "scopeQualifier");
        return this._instances.get(BeanDefinitionKt.indexKey(clazz, qualifier, scopeQualifier));
    }

    public final <T> T resolveInstance$koin_core(Qualifier qualifier, KClass<?> clazz, Qualifier scopeQualifier, InstanceContext instanceContext) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(scopeQualifier, "scopeQualifier");
        Intrinsics.checkNotNullParameter(instanceContext, "instanceContext");
        InstanceFactory<?> instanceFactoryResolveDefinition$koin_core = resolveDefinition$koin_core(clazz, qualifier, scopeQualifier);
        Object obj = instanceFactoryResolveDefinition$koin_core != null ? instanceFactoryResolveDefinition$koin_core.get(instanceContext) : null;
        if (obj == null) {
            return null;
        }
        return (T) obj;
    }

    public static /* synthetic */ void declareScopedInstance$default(InstanceRegistry instanceRegistry, Object obj, Qualifier qualifier, List list, boolean z, Qualifier scopeQualifier, String scopeID, int i, Object obj2) {
        Qualifier qualifier2 = (i & 2) != 0 ? null : qualifier;
        List secondaryTypes = (i & 4) != 0 ? CollectionsKt.emptyList() : list;
        boolean z2 = (i & 8) != 0 ? true : z;
        Intrinsics.checkNotNullParameter(secondaryTypes, "secondaryTypes");
        Intrinsics.checkNotNullParameter(scopeQualifier, "scopeQualifier");
        Intrinsics.checkNotNullParameter(scopeID, "scopeID");
        Kind kind = Kind.Scoped;
        Intrinsics.needClassReification();
        InstanceRegistry$declareScopedInstance$def$1 instanceRegistry$declareScopedInstance$def$1 = new InstanceRegistry$declareScopedInstance$def$1(obj);
        Intrinsics.reifiedOperationMarker(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        BeanDefinition beanDefinition = new BeanDefinition(scopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), qualifier2, instanceRegistry$declareScopedInstance$def$1, kind, secondaryTypes);
        String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), beanDefinition.getQualifier(), beanDefinition.getScopeQualifier());
        InstanceFactory<?> instanceFactory = instanceRegistry.getInstances().get(strIndexKey);
        ScopedInstanceFactory scopedInstanceFactory = instanceFactory instanceof ScopedInstanceFactory ? (ScopedInstanceFactory) instanceFactory : null;
        if (scopedInstanceFactory != null) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Any");
            scopedInstanceFactory.refreshInstance(scopeID, obj);
            return;
        }
        ScopedInstanceFactory scopedInstanceFactory2 = new ScopedInstanceFactory(beanDefinition);
        saveMapping$default(instanceRegistry, z2, strIndexKey, scopedInstanceFactory2, false, 8, null);
        Iterator<T> it = beanDefinition.getSecondaryTypes().iterator();
        while (it.hasNext()) {
            saveMapping$default(instanceRegistry, z2, BeanDefinitionKt.indexKey((KClass) it.next(), beanDefinition.getQualifier(), beanDefinition.getScopeQualifier()), scopedInstanceFactory2, false, 8, null);
        }
    }

    public final /* synthetic */ <T> void declareScopedInstance(T instance, Qualifier qualifier, List<? extends KClass<?>> secondaryTypes, boolean allowOverride, Qualifier scopeQualifier, String scopeID) {
        Intrinsics.checkNotNullParameter(secondaryTypes, "secondaryTypes");
        Intrinsics.checkNotNullParameter(scopeQualifier, "scopeQualifier");
        Intrinsics.checkNotNullParameter(scopeID, "scopeID");
        Kind kind = Kind.Scoped;
        Intrinsics.needClassReification();
        InstanceRegistry$declareScopedInstance$def$1 instanceRegistry$declareScopedInstance$def$1 = new InstanceRegistry$declareScopedInstance$def$1(instance);
        Intrinsics.reifiedOperationMarker(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        BeanDefinition beanDefinition = new BeanDefinition(scopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), qualifier, instanceRegistry$declareScopedInstance$def$1, kind, secondaryTypes);
        String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), beanDefinition.getQualifier(), beanDefinition.getScopeQualifier());
        InstanceFactory<?> instanceFactory = getInstances().get(strIndexKey);
        ScopedInstanceFactory scopedInstanceFactory = instanceFactory instanceof ScopedInstanceFactory ? (ScopedInstanceFactory) instanceFactory : null;
        if (scopedInstanceFactory != null) {
            Intrinsics.checkNotNull(instance, "null cannot be cast to non-null type kotlin.Any");
            scopedInstanceFactory.refreshInstance(scopeID, instance);
            return;
        }
        ScopedInstanceFactory scopedInstanceFactory2 = new ScopedInstanceFactory(beanDefinition);
        saveMapping$default(this, allowOverride, strIndexKey, scopedInstanceFactory2, false, 8, null);
        Iterator<T> it = beanDefinition.getSecondaryTypes().iterator();
        while (it.hasNext()) {
            saveMapping$default(this, allowOverride, BeanDefinitionKt.indexKey((KClass) it.next(), beanDefinition.getQualifier(), beanDefinition.getScopeQualifier()), scopedInstanceFactory2, false, 8, null);
        }
    }

    public static /* synthetic */ void declareRootInstance$default(InstanceRegistry instanceRegistry, Object obj, Qualifier qualifier, List list, boolean z, int i, Object obj2) {
        Qualifier qualifier2 = (i & 2) != 0 ? null : qualifier;
        List secondaryTypes = (i & 4) != 0 ? CollectionsKt.emptyList() : list;
        boolean z2 = (i & 8) != 0 ? true : z;
        Intrinsics.checkNotNullParameter(secondaryTypes, "secondaryTypes");
        Qualifier scopeQualifier = instanceRegistry.get_koin().getScopeRegistry().getRootScope().getScopeQualifier();
        Kind kind = Kind.Scoped;
        Intrinsics.needClassReification();
        InstanceRegistry$declareRootInstance$def$1 instanceRegistry$declareRootInstance$def$1 = new InstanceRegistry$declareRootInstance$def$1(obj);
        Intrinsics.reifiedOperationMarker(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        BeanDefinition beanDefinition = new BeanDefinition(scopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), qualifier2, instanceRegistry$declareRootInstance$def$1, kind, secondaryTypes);
        SingleInstanceFactory singleInstanceFactory = new SingleInstanceFactory(beanDefinition);
        saveMapping$default(instanceRegistry, z2, BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), beanDefinition.getQualifier(), beanDefinition.getScopeQualifier()), singleInstanceFactory, false, 8, null);
        Iterator<T> it = beanDefinition.getSecondaryTypes().iterator();
        while (it.hasNext()) {
            saveMapping$default(instanceRegistry, z2, BeanDefinitionKt.indexKey((KClass) it.next(), beanDefinition.getQualifier(), beanDefinition.getScopeQualifier()), singleInstanceFactory, false, 8, null);
        }
    }

    public final /* synthetic */ <T> void declareRootInstance(T instance, Qualifier qualifier, List<? extends KClass<?>> secondaryTypes, boolean allowOverride) {
        Intrinsics.checkNotNullParameter(secondaryTypes, "secondaryTypes");
        Qualifier scopeQualifier = get_koin().getScopeRegistry().getRootScope().getScopeQualifier();
        Kind kind = Kind.Scoped;
        Intrinsics.needClassReification();
        InstanceRegistry$declareRootInstance$def$1 instanceRegistry$declareRootInstance$def$1 = new InstanceRegistry$declareRootInstance$def$1(instance);
        Intrinsics.reifiedOperationMarker(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        BeanDefinition beanDefinition = new BeanDefinition(scopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), qualifier, instanceRegistry$declareRootInstance$def$1, kind, secondaryTypes);
        SingleInstanceFactory singleInstanceFactory = new SingleInstanceFactory(beanDefinition);
        saveMapping$default(this, allowOverride, BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), beanDefinition.getQualifier(), beanDefinition.getScopeQualifier()), singleInstanceFactory, false, 8, null);
        Iterator<T> it = beanDefinition.getSecondaryTypes().iterator();
        while (it.hasNext()) {
            saveMapping$default(this, allowOverride, BeanDefinitionKt.indexKey((KClass) it.next(), beanDefinition.getQualifier(), beanDefinition.getScopeQualifier()), singleInstanceFactory, false, 8, null);
        }
    }

    public final void dropScopeInstances$koin_core(Scope scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Collection<InstanceFactory<?>> collectionValues = this._instances.values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            if (obj instanceof ScopedInstanceFactory) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((ScopedInstanceFactory) it.next()).drop(scope);
        }
    }

    public final void close$koin_core() {
        Iterator<Map.Entry<String, InstanceFactory<?>>> it = this._instances.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().dropAll();
        }
        this._instances.clear();
    }

    public final <T> List<T> getAll$koin_core(KClass<?> clazz, InstanceContext instanceContext) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(instanceContext, "instanceContext");
        Collection<InstanceFactory<?>> collectionValues = this._instances.values();
        ArrayList arrayList = new ArrayList();
        for (T t : collectionValues) {
            if (Intrinsics.areEqual(((InstanceFactory) t).getBeanDefinition().getScopeQualifier(), instanceContext.getScope().getScopeQualifier())) {
                arrayList.add(t);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (T t2 : arrayList) {
            InstanceFactory instanceFactory = (InstanceFactory) t2;
            if (Intrinsics.areEqual(instanceFactory.getBeanDefinition().getPrimaryType(), clazz) || instanceFactory.getBeanDefinition().getSecondaryTypes().contains(clazz)) {
                arrayList2.add(t2);
            }
        }
        List listDistinct = CollectionsKt.distinct(arrayList2);
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listDistinct, 10));
        Iterator<T> it = listDistinct.iterator();
        while (it.hasNext()) {
            arrayList3.add(((InstanceFactory) it.next()).get(instanceContext));
        }
        return arrayList3;
    }

    public final void unloadModules$koin_core(Set<Module> modules) {
        Intrinsics.checkNotNullParameter(modules, "modules");
        Iterator<T> it = modules.iterator();
        while (it.hasNext()) {
            unloadModule((Module) it.next());
        }
    }

    private final void unloadModule(Module module) {
        Set<String> setKeySet = module.getMappings().keySet();
        Intrinsics.checkNotNullExpressionValue(setKeySet, "<get-keys>(...)");
        for (String str : setKeySet) {
            if (this._instances.containsKey(str)) {
                InstanceFactory<?> instanceFactory = this._instances.get(str);
                if (instanceFactory != null) {
                    instanceFactory.dropAll();
                }
                this._instances.remove(str);
            }
        }
    }

    public final int size() {
        return this._instances.size();
    }
}
