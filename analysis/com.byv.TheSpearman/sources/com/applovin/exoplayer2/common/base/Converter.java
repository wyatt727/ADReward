package com.applovin.exoplayer2.common.base;

import com.google.errorprone.annotations.concurrent.LazyInit;
import java.io.Serializable;
import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
public abstract class Converter<A, B> implements Function<A, B> {
    private final boolean handleNullAutomatically;

    @LazyInit
    @MonotonicNonNullDecl
    private transient Converter<B, A> reverse;

    class a implements Iterable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Iterable f186a;

        /* renamed from: com.applovin.exoplayer2.common.base.Converter$a$a, reason: collision with other inner class name */
        class C0014a implements Iterator {

            /* renamed from: a, reason: collision with root package name */
            private final Iterator f187a;

            C0014a() {
                this.f187a = a.this.f186a.iterator();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f187a.hasNext();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Iterator
            public Object next() {
                return Converter.this.convert(this.f187a.next());
            }

            @Override // java.util.Iterator
            public void remove() {
                this.f187a.remove();
            }
        }

        a(Iterable iterable) {
            this.f186a = iterable;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return new C0014a();
        }
    }

    private static final class b extends Converter implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        final Converter f188a;
        final Converter b;

        b(Converter converter, Converter converter2) {
            this.f188a = converter;
            this.b = converter2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.applovin.exoplayer2.common.base.Converter
        Object correctedDoBackward(Object obj) {
            return this.f188a.correctedDoBackward(this.b.correctedDoBackward(obj));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.applovin.exoplayer2.common.base.Converter
        Object correctedDoForward(Object obj) {
            return this.b.correctedDoForward(this.f188a.correctedDoForward(obj));
        }

        @Override // com.applovin.exoplayer2.common.base.Converter
        protected Object doBackward(Object obj) {
            throw new AssertionError();
        }

        @Override // com.applovin.exoplayer2.common.base.Converter
        protected Object doForward(Object obj) {
            throw new AssertionError();
        }

        @Override // com.applovin.exoplayer2.common.base.Converter, com.applovin.exoplayer2.common.base.Function
        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f188a.equals(bVar.f188a) && this.b.equals(bVar.b);
        }

        public int hashCode() {
            return (this.f188a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            return this.f188a + ".andThen(" + this.b + ")";
        }
    }

    private static final class c extends Converter implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        private final Function f189a;
        private final Function b;

        /* synthetic */ c(Function function, Function function2, a aVar) {
            this(function, function2);
        }

        @Override // com.applovin.exoplayer2.common.base.Converter
        protected Object doBackward(Object obj) {
            return this.b.apply(obj);
        }

        @Override // com.applovin.exoplayer2.common.base.Converter
        protected Object doForward(Object obj) {
            return this.f189a.apply(obj);
        }

        @Override // com.applovin.exoplayer2.common.base.Converter, com.applovin.exoplayer2.common.base.Function
        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f189a.equals(cVar.f189a) && this.b.equals(cVar.b);
        }

        public int hashCode() {
            return (this.f189a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            return "Converter.from(" + this.f189a + ", " + this.b + ")";
        }

        private c(Function function, Function function2) {
            this.f189a = (Function) Preconditions.checkNotNull(function);
            this.b = (Function) Preconditions.checkNotNull(function2);
        }
    }

    private static final class d extends Converter implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        static final d f190a = new d();

        private d() {
        }

        @Override // com.applovin.exoplayer2.common.base.Converter
        Converter doAndThen(Converter converter) {
            return (Converter) Preconditions.checkNotNull(converter, "otherConverter");
        }

        @Override // com.applovin.exoplayer2.common.base.Converter
        protected Object doBackward(Object obj) {
            return obj;
        }

        @Override // com.applovin.exoplayer2.common.base.Converter
        protected Object doForward(Object obj) {
            return obj;
        }

        @Override // com.applovin.exoplayer2.common.base.Converter
        public d reverse() {
            return this;
        }

        public String toString() {
            return "Converter.identity()";
        }
    }

    private static final class e extends Converter implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        final Converter f191a;

        e(Converter converter) {
            this.f191a = converter;
        }

        @Override // com.applovin.exoplayer2.common.base.Converter
        Object correctedDoBackward(Object obj) {
            return this.f191a.correctedDoForward(obj);
        }

        @Override // com.applovin.exoplayer2.common.base.Converter
        Object correctedDoForward(Object obj) {
            return this.f191a.correctedDoBackward(obj);
        }

        @Override // com.applovin.exoplayer2.common.base.Converter
        protected Object doBackward(Object obj) {
            throw new AssertionError();
        }

        @Override // com.applovin.exoplayer2.common.base.Converter
        protected Object doForward(Object obj) {
            throw new AssertionError();
        }

        @Override // com.applovin.exoplayer2.common.base.Converter, com.applovin.exoplayer2.common.base.Function
        public boolean equals(Object obj) {
            if (obj instanceof e) {
                return this.f191a.equals(((e) obj).f191a);
            }
            return false;
        }

        public int hashCode() {
            return ~this.f191a.hashCode();
        }

        @Override // com.applovin.exoplayer2.common.base.Converter
        public Converter reverse() {
            return this.f191a;
        }

        public String toString() {
            return this.f191a + ".reverse()";
        }
    }

    protected Converter() {
        this(true);
    }

    public static <A, B> Converter<A, B> from(Function<? super A, ? extends B> function, Function<? super B, ? extends A> function2) {
        return new c(function, function2, null);
    }

    public static <T> Converter<T, T> identity() {
        return d.f190a;
    }

    public final <C> Converter<A, C> andThen(Converter<B, C> converter) {
        return doAndThen(converter);
    }

    @Override // com.applovin.exoplayer2.common.base.Function
    @NullableDecl
    @Deprecated
    public final B apply(@NullableDecl A a2) {
        return convert(a2);
    }

    @NullableDecl
    public final B convert(@NullableDecl A a2) {
        return correctedDoForward(a2);
    }

    public Iterable<B> convertAll(Iterable<? extends A> iterable) {
        Preconditions.checkNotNull(iterable, "fromIterable");
        return new a(iterable);
    }

    @NullableDecl
    A correctedDoBackward(@NullableDecl B b2) {
        if (!this.handleNullAutomatically) {
            return doBackward(b2);
        }
        if (b2 == null) {
            return null;
        }
        return (A) Preconditions.checkNotNull(doBackward(b2));
    }

    @NullableDecl
    B correctedDoForward(@NullableDecl A a2) {
        if (!this.handleNullAutomatically) {
            return doForward(a2);
        }
        if (a2 == null) {
            return null;
        }
        return (B) Preconditions.checkNotNull(doForward(a2));
    }

    <C> Converter<A, C> doAndThen(Converter<B, C> converter) {
        return new b(this, (Converter) Preconditions.checkNotNull(converter));
    }

    protected abstract A doBackward(B b2);

    protected abstract B doForward(A a2);

    @Override // com.applovin.exoplayer2.common.base.Function
    public boolean equals(@NullableDecl Object obj) {
        return super.equals(obj);
    }

    public Converter<B, A> reverse() {
        Converter<B, A> converter = this.reverse;
        if (converter != null) {
            return converter;
        }
        e eVar = new e(this);
        this.reverse = eVar;
        return eVar;
    }

    Converter(boolean z) {
        this.handleNullAutomatically = z;
    }
}
