package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;
import com.applovin.exoplayer2.common.base.Supplier;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public abstract class rf {
    private rf() {
    }

    /* synthetic */ rf(qf qfVar) {
        this();
    }

    class a extends d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Comparator f860a;

        @Override // com.applovin.impl.rf.d
        Map b() {
            return new TreeMap(this.f860a);
        }

        a(Comparator comparator) {
            this.f860a = comparator;
        }
    }

    public static d a(Comparator comparator) {
        Preconditions.checkNotNull(comparator);
        return new a(comparator);
    }

    public static d a() {
        return a(tg.a());
    }

    private static final class b implements Supplier, Serializable {

        /* renamed from: a, reason: collision with root package name */
        private final int f861a;

        @Override // com.applovin.exoplayer2.common.base.Supplier
        public List get() {
            return new ArrayList(this.f861a);
        }

        b(int i) {
            this.f861a = n3.a(i, "expectedValuesPerKey");
        }
    }

    public static abstract class d {
        d() {
        }

        abstract Map b();

        public c a() {
            return a(2);
        }

        class a extends c {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f862a;

            a(int i) {
                this.f862a = i;
            }

            @Override // com.applovin.impl.rf.c
            public ac b() {
                return sf.a(d.this.b(), new b(this.f862a));
            }
        }

        public c a(int i) {
            n3.a(i, "expectedValuesPerKey");
            return new a(i);
        }
    }

    public static abstract class c extends rf {
        public abstract ac b();

        c() {
            super(null);
        }
    }
}
