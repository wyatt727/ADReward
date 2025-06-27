package com.bykv.vk.openvk.preload.a.c;

import com.bykv.vk.openvk.preload.a.b.b;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* compiled from: TypeToken.java */
/* loaded from: classes2.dex */
public class a<T> {
    public final Class<? super T> b;
    public final Type c;
    final int d;

    protected a() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (genericSuperclass instanceof Class) {
            throw new RuntimeException("Missing type parameter.");
        }
        Type typeA = b.a(((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]);
        this.c = typeA;
        this.b = (Class<? super T>) b.b(typeA);
        this.d = typeA.hashCode();
    }

    private a(Type type) {
        Type typeA = b.a((Type) com.bykv.vk.openvk.preload.a.b.a.a(type));
        this.c = typeA;
        this.b = (Class<? super T>) b.b(typeA);
        this.d = typeA.hashCode();
    }

    public final int hashCode() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof a) && b.a(this.c, ((a) obj).c);
    }

    public final String toString() {
        return b.c(this.c);
    }

    public static a<?> a(Type type) {
        return new a<>(type);
    }

    public static <T> a<T> a(Class<T> cls) {
        return new a<>(cls);
    }
}
