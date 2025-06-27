package com.bykv.vk.openvk.preload.a.b;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

/* compiled from: ConstructorConstructor.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final Map<Type, com.bykv.vk.openvk.preload.a.h<?>> f1324a;
    private final com.bykv.vk.openvk.preload.a.b.b.b b = com.bykv.vk.openvk.preload.a.b.b.b.a();

    public c(Map<Type, com.bykv.vk.openvk.preload.a.h<?>> map) {
        this.f1324a = map;
    }

    private <T> i<T> a(Class<? super T> cls) throws NoSuchMethodException, SecurityException {
        try {
            final Constructor<? super T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (!declaredConstructor.isAccessible()) {
                this.b.a(declaredConstructor);
            }
            return new i<T>() { // from class: com.bykv.vk.openvk.preload.a.b.c.8
                @Override // com.bykv.vk.openvk.preload.a.b.i
                public final T a() {
                    try {
                        return (T) declaredConstructor.newInstance(null);
                    } catch (IllegalAccessException e) {
                        throw new AssertionError(e);
                    } catch (InstantiationException e2) {
                        throw new RuntimeException("Failed to invoke " + declaredConstructor + " with no args", e2);
                    } catch (InvocationTargetException e3) {
                        throw new RuntimeException("Failed to invoke " + declaredConstructor + " with no args", e3.getTargetException());
                    }
                }
            };
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public final String toString() {
        return this.f1324a.toString();
    }

    public final <T> i<T> a(com.bykv.vk.openvk.preload.a.c.a<T> aVar) throws NoSuchMethodException, SecurityException {
        i<T> iVar;
        final Type type = aVar.c;
        final Class<? super T> cls = aVar.b;
        final com.bykv.vk.openvk.preload.a.h<?> hVar = this.f1324a.get(type);
        if (hVar != null) {
            return new i<T>() { // from class: com.bykv.vk.openvk.preload.a.b.c.1
                @Override // com.bykv.vk.openvk.preload.a.b.i
                public final T a() {
                    return (T) hVar.a();
                }
            };
        }
        final com.bykv.vk.openvk.preload.a.h<?> hVar2 = this.f1324a.get(cls);
        if (hVar2 != null) {
            return new i<T>() { // from class: com.bykv.vk.openvk.preload.a.b.c.7
                @Override // com.bykv.vk.openvk.preload.a.b.i
                public final T a() {
                    return (T) hVar2.a();
                }
            };
        }
        i<T> iVarA = a(cls);
        if (iVarA != null) {
            return iVarA;
        }
        if (Collection.class.isAssignableFrom(cls)) {
            if (SortedSet.class.isAssignableFrom(cls)) {
                iVar = new i<T>() { // from class: com.bykv.vk.openvk.preload.a.b.c.9
                    @Override // com.bykv.vk.openvk.preload.a.b.i
                    public final T a() {
                        return (T) new TreeSet();
                    }
                };
            } else if (EnumSet.class.isAssignableFrom(cls)) {
                iVar = new i<T>() { // from class: com.bykv.vk.openvk.preload.a.b.c.10
                    @Override // com.bykv.vk.openvk.preload.a.b.i
                    public final T a() {
                        Type type2 = type;
                        if (type2 instanceof ParameterizedType) {
                            Type type3 = ((ParameterizedType) type2).getActualTypeArguments()[0];
                            if (type3 instanceof Class) {
                                return (T) EnumSet.noneOf((Class) type3);
                            }
                            throw new com.bykv.vk.openvk.preload.a.l("Invalid EnumSet type: " + type.toString());
                        }
                        throw new com.bykv.vk.openvk.preload.a.l("Invalid EnumSet type: " + type.toString());
                    }
                };
            } else if (Set.class.isAssignableFrom(cls)) {
                iVar = new i<T>() { // from class: com.bykv.vk.openvk.preload.a.b.c.11
                    @Override // com.bykv.vk.openvk.preload.a.b.i
                    public final T a() {
                        return (T) new LinkedHashSet();
                    }
                };
            } else if (Queue.class.isAssignableFrom(cls)) {
                iVar = new i<T>() { // from class: com.bykv.vk.openvk.preload.a.b.c.12
                    @Override // com.bykv.vk.openvk.preload.a.b.i
                    public final T a() {
                        return (T) new ArrayDeque();
                    }
                };
            } else {
                iVar = new i<T>() { // from class: com.bykv.vk.openvk.preload.a.b.c.13
                    @Override // com.bykv.vk.openvk.preload.a.b.i
                    public final T a() {
                        return (T) new ArrayList();
                    }
                };
            }
        } else if (!Map.class.isAssignableFrom(cls)) {
            iVar = null;
        } else if (ConcurrentNavigableMap.class.isAssignableFrom(cls)) {
            iVar = new i<T>() { // from class: com.bykv.vk.openvk.preload.a.b.c.14
                @Override // com.bykv.vk.openvk.preload.a.b.i
                public final T a() {
                    return (T) new ConcurrentSkipListMap();
                }
            };
        } else if (ConcurrentMap.class.isAssignableFrom(cls)) {
            iVar = new i<T>() { // from class: com.bykv.vk.openvk.preload.a.b.c.2
                @Override // com.bykv.vk.openvk.preload.a.b.i
                public final T a() {
                    return (T) new ConcurrentHashMap();
                }
            };
        } else if (SortedMap.class.isAssignableFrom(cls)) {
            iVar = new i<T>() { // from class: com.bykv.vk.openvk.preload.a.b.c.3
                @Override // com.bykv.vk.openvk.preload.a.b.i
                public final T a() {
                    return (T) new TreeMap();
                }
            };
        } else if ((type instanceof ParameterizedType) && !String.class.isAssignableFrom(com.bykv.vk.openvk.preload.a.c.a.a(((ParameterizedType) type).getActualTypeArguments()[0]).b)) {
            iVar = new i<T>() { // from class: com.bykv.vk.openvk.preload.a.b.c.4
                @Override // com.bykv.vk.openvk.preload.a.b.i
                public final T a() {
                    return (T) new LinkedHashMap();
                }
            };
        } else {
            iVar = new i<T>() { // from class: com.bykv.vk.openvk.preload.a.b.c.5
                @Override // com.bykv.vk.openvk.preload.a.b.i
                public final T a() {
                    return (T) new h();
                }
            };
        }
        return iVar != null ? iVar : new i<T>() { // from class: com.bykv.vk.openvk.preload.a.b.c.6
            private final l d = l.a();

            @Override // com.bykv.vk.openvk.preload.a.b.i
            public final T a() {
                try {
                    return (T) this.d.a(cls);
                } catch (Exception e) {
                    throw new RuntimeException("Unable to invoke no-args constructor for " + type + ". Registering an InstanceCreator with Gson for this type may fix this problem.", e);
                }
            }
        };
    }
}
