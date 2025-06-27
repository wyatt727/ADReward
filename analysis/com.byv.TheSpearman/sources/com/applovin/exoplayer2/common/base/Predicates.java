package com.applovin.exoplayer2.common.base;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
public final class Predicates {

    private static class b implements Predicate, Serializable {

        /* renamed from: a, reason: collision with root package name */
        private final List f197a;

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean apply(Object obj) {
            for (int i = 0; i < this.f197a.size(); i++) {
                if (!((Predicate) this.f197a.get(i)).apply(obj)) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f197a.equals(((b) obj).f197a);
            }
            return false;
        }

        public int hashCode() {
            return this.f197a.hashCode() + 306654252;
        }

        public String toString() {
            return Predicates.toStringHelper("and", this.f197a);
        }

        private b(List list) {
            this.f197a = list;
        }
    }

    private static class c implements Predicate, Serializable {

        /* renamed from: a, reason: collision with root package name */
        final Predicate f198a;
        final Function b;

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean apply(Object obj) {
            return this.f198a.apply(this.b.apply(obj));
        }

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.b.equals(cVar.b) && this.f198a.equals(cVar.f198a);
        }

        public int hashCode() {
            return this.b.hashCode() ^ this.f198a.hashCode();
        }

        public String toString() {
            return this.f198a + "(" + this.b + ")";
        }

        private c(Predicate predicate, Function function) {
            this.f198a = (Predicate) Preconditions.checkNotNull(predicate);
            this.b = (Function) Preconditions.checkNotNull(function);
        }
    }

    private static class d implements Predicate, Serializable {

        /* renamed from: a, reason: collision with root package name */
        private final Collection f199a;

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean apply(Object obj) {
            try {
                return this.f199a.contains(obj);
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean equals(Object obj) {
            if (obj instanceof d) {
                return this.f199a.equals(((d) obj).f199a);
            }
            return false;
        }

        public int hashCode() {
            return this.f199a.hashCode();
        }

        public String toString() {
            return "Predicates.in(" + this.f199a + ")";
        }

        private d(Collection collection) {
            this.f199a = (Collection) Preconditions.checkNotNull(collection);
        }
    }

    private static class e implements Predicate, Serializable {

        /* renamed from: a, reason: collision with root package name */
        private final Class f200a;

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean apply(Object obj) {
            return this.f200a.isInstance(obj);
        }

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean equals(Object obj) {
            return (obj instanceof e) && this.f200a == ((e) obj).f200a;
        }

        public int hashCode() {
            return this.f200a.hashCode();
        }

        public String toString() {
            return "Predicates.instanceOf(" + this.f200a.getName() + ")";
        }

        private e(Class cls) {
            this.f200a = (Class) Preconditions.checkNotNull(cls);
        }
    }

    private static class f implements Predicate, Serializable {

        /* renamed from: a, reason: collision with root package name */
        private final Object f201a;

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean apply(Object obj) {
            return this.f201a.equals(obj);
        }

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean equals(Object obj) {
            if (obj instanceof f) {
                return this.f201a.equals(((f) obj).f201a);
            }
            return false;
        }

        public int hashCode() {
            return this.f201a.hashCode();
        }

        public String toString() {
            return "Predicates.equalTo(" + this.f201a + ")";
        }

        private f(Object obj) {
            this.f201a = obj;
        }
    }

    private static class g implements Predicate, Serializable {

        /* renamed from: a, reason: collision with root package name */
        final Predicate f202a;

        g(Predicate predicate) {
            this.f202a = (Predicate) Preconditions.checkNotNull(predicate);
        }

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean apply(Object obj) {
            return !this.f202a.apply(obj);
        }

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean equals(Object obj) {
            if (obj instanceof g) {
                return this.f202a.equals(((g) obj).f202a);
            }
            return false;
        }

        public int hashCode() {
            return ~this.f202a.hashCode();
        }

        public String toString() {
            return "Predicates.not(" + this.f202a + ")";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    static abstract class h implements Predicate {

        /* renamed from: a, reason: collision with root package name */
        public static final h f203a = new a("ALWAYS_TRUE", 0);
        public static final h b = new b("ALWAYS_FALSE", 1);
        public static final h c = new c("IS_NULL", 2);
        public static final h d = new d("NOT_NULL", 3);
        private static final /* synthetic */ h[] f = a();

        enum a extends h {
            a(String str, int i) {
                super(str, i);
            }

            @Override // com.applovin.exoplayer2.common.base.Predicate
            public boolean apply(Object obj) {
                return true;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Predicates.alwaysTrue()";
            }
        }

        enum b extends h {
            b(String str, int i) {
                super(str, i);
            }

            @Override // com.applovin.exoplayer2.common.base.Predicate
            public boolean apply(Object obj) {
                return false;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Predicates.alwaysFalse()";
            }
        }

        enum c extends h {
            c(String str, int i) {
                super(str, i);
            }

            @Override // com.applovin.exoplayer2.common.base.Predicate
            public boolean apply(Object obj) {
                return obj == null;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Predicates.isNull()";
            }
        }

        enum d extends h {
            d(String str, int i) {
                super(str, i);
            }

            @Override // com.applovin.exoplayer2.common.base.Predicate
            public boolean apply(Object obj) {
                return obj != null;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Predicates.notNull()";
            }
        }

        private h(String str, int i) {
        }

        private static /* synthetic */ h[] a() {
            return new h[]{f203a, b, c, d};
        }

        public static h valueOf(String str) {
            return (h) Enum.valueOf(h.class, str);
        }

        public static h[] values() {
            return (h[]) f.clone();
        }

        Predicate b() {
            return this;
        }
    }

    private static class i implements Predicate, Serializable {

        /* renamed from: a, reason: collision with root package name */
        private final List f204a;

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean apply(Object obj) {
            for (int i = 0; i < this.f204a.size(); i++) {
                if (((Predicate) this.f204a.get(i)).apply(obj)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean equals(Object obj) {
            if (obj instanceof i) {
                return this.f204a.equals(((i) obj).f204a);
            }
            return false;
        }

        public int hashCode() {
            return this.f204a.hashCode() + 87855567;
        }

        public String toString() {
            return Predicates.toStringHelper("or", this.f204a);
        }

        private i(List list) {
            this.f204a = list;
        }
    }

    private static class j implements Predicate, Serializable {

        /* renamed from: a, reason: collision with root package name */
        private final Class f205a;

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean equals(Object obj) {
            return (obj instanceof j) && this.f205a == ((j) obj).f205a;
        }

        public int hashCode() {
            return this.f205a.hashCode();
        }

        public String toString() {
            return "Predicates.subtypeOf(" + this.f205a.getName() + ")";
        }

        private j(Class cls) {
            this.f205a = (Class) Preconditions.checkNotNull(cls);
        }

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean apply(Class cls) {
            return this.f205a.isAssignableFrom(cls);
        }
    }

    private Predicates() {
    }

    public static <T> Predicate<T> alwaysFalse() {
        return h.b.b();
    }

    public static <T> Predicate<T> alwaysTrue() {
        return h.f203a.b();
    }

    public static <T> Predicate<T> and(Iterable<? extends Predicate<? super T>> iterable) {
        return new b(defensiveCopy(iterable));
    }

    private static <T> List<Predicate<? super T>> asList(Predicate<? super T> predicate, Predicate<? super T> predicate2) {
        return Arrays.asList(predicate, predicate2);
    }

    public static <A, B> Predicate<A> compose(Predicate<B> predicate, Function<A, ? extends B> function) {
        return new c(predicate, function);
    }

    private static <T> List<T> defensiveCopy(T... tArr) {
        return defensiveCopy(Arrays.asList(tArr));
    }

    public static <T> Predicate<T> equalTo(@NullableDecl T t) {
        return t == null ? isNull() : new f(t);
    }

    public static <T> Predicate<T> in(Collection<? extends T> collection) {
        return new d(collection);
    }

    public static Predicate<Object> instanceOf(Class<?> cls) {
        return new e(cls);
    }

    public static <T> Predicate<T> isNull() {
        return h.c.b();
    }

    public static <T> Predicate<T> not(Predicate<T> predicate) {
        return new g(predicate);
    }

    public static <T> Predicate<T> notNull() {
        return h.d.b();
    }

    public static <T> Predicate<T> or(Iterable<? extends Predicate<? super T>> iterable) {
        return new i(defensiveCopy(iterable));
    }

    public static Predicate<Class<?>> subtypeOf(Class<?> cls) {
        return new j(cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String toStringHelper(String str, Iterable<?> iterable) {
        StringBuilder sb = new StringBuilder("Predicates.");
        sb.append(str);
        sb.append('(');
        boolean z = true;
        for (Object obj : iterable) {
            if (!z) {
                sb.append(AbstractJsonLexerKt.COMMA);
            }
            sb.append(obj);
            z = false;
        }
        sb.append(')');
        return sb.toString();
    }

    @SafeVarargs
    public static <T> Predicate<T> and(Predicate<? super T>... predicateArr) {
        return new b(defensiveCopy(predicateArr));
    }

    static <T> List<T> defensiveCopy(Iterable<T> iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(Preconditions.checkNotNull(it.next()));
        }
        return arrayList;
    }

    @SafeVarargs
    public static <T> Predicate<T> or(Predicate<? super T>... predicateArr) {
        return new i(defensiveCopy(predicateArr));
    }

    public static <T> Predicate<T> and(Predicate<? super T> predicate, Predicate<? super T> predicate2) {
        return new b(asList((Predicate) Preconditions.checkNotNull(predicate), (Predicate) Preconditions.checkNotNull(predicate2)));
    }

    public static <T> Predicate<T> or(Predicate<? super T> predicate, Predicate<? super T> predicate2) {
        return new i(asList((Predicate) Preconditions.checkNotNull(predicate), (Predicate) Preconditions.checkNotNull(predicate2)));
    }
}
