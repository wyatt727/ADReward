package com.applovin.exoplayer2.common.base;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
abstract class b implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    private EnumC0017b f211a = EnumC0017b.NOT_READY;
    private Object b;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f212a;

        static {
            int[] iArr = new int[EnumC0017b.values().length];
            f212a = iArr;
            try {
                iArr[EnumC0017b.READY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f212a[EnumC0017b.DONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: com.applovin.exoplayer2.common.base.b$b, reason: collision with other inner class name */
    private enum EnumC0017b {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    protected b() {
    }

    private boolean c() {
        this.f211a = EnumC0017b.FAILED;
        this.b = a();
        if (this.f211a == EnumC0017b.DONE) {
            return false;
        }
        this.f211a = EnumC0017b.READY;
        return true;
    }

    protected abstract Object a();

    protected final Object b() {
        this.f211a = EnumC0017b.DONE;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Preconditions.checkState(this.f211a != EnumC0017b.FAILED);
        int i = a.f212a[this.f211a.ordinal()];
        if (i == 1) {
            return true;
        }
        if (i != 2) {
            return c();
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f211a = EnumC0017b.NOT_READY;
        Object obj = this.b;
        this.b = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
