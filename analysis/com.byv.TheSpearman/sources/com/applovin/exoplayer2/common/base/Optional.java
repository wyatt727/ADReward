package com.applovin.exoplayer2.common.base;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
public abstract class Optional<T> implements Serializable {
    private static final long serialVersionUID = 0;

    class a implements Iterable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Iterable f196a;

        /* renamed from: com.applovin.exoplayer2.common.base.Optional$a$a, reason: collision with other inner class name */
        class C0015a extends b {
            private final Iterator c;

            C0015a() {
                this.c = (Iterator) Preconditions.checkNotNull(a.this.f196a.iterator());
            }

            @Override // com.applovin.exoplayer2.common.base.b
            protected Object a() {
                while (this.c.hasNext()) {
                    Optional optional = (Optional) this.c.next();
                    if (optional.isPresent()) {
                        return optional.get();
                    }
                }
                return b();
            }
        }

        a(Iterable iterable) {
            this.f196a = iterable;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return new C0015a();
        }
    }

    Optional() {
    }

    public static <T> Optional<T> absent() {
        return com.applovin.exoplayer2.common.base.a.a();
    }

    public static <T> Optional<T> fromNullable(@NullableDecl T t) {
        return t == null ? absent() : new d(t);
    }

    public static <T> Optional<T> of(T t) {
        return new d(Preconditions.checkNotNull(t));
    }

    public static <T> Iterable<T> presentInstances(Iterable<? extends Optional<? extends T>> iterable) {
        Preconditions.checkNotNull(iterable);
        return new a(iterable);
    }

    public abstract Set<T> asSet();

    public abstract boolean equals(@NullableDecl Object obj);

    public abstract T get();

    public abstract int hashCode();

    public abstract boolean isPresent();

    public abstract Optional<T> or(Optional<? extends T> optional);

    public abstract T or(Supplier<? extends T> supplier);

    public abstract T or(T t);

    @NullableDecl
    public abstract T orNull();

    public abstract String toString();

    public abstract <V> Optional<V> transform(Function<? super T, V> function);
}
