package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class d extends qp {

    /* renamed from: a, reason: collision with root package name */
    private b f344a = b.NOT_READY;
    private Object b;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f345a;

        static {
            int[] iArr = new int[b.values().length];
            f345a = iArr;
            try {
                iArr[b.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f345a[b.READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private enum b {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    protected abstract Object a();

    protected d() {
    }

    protected final Object b() {
        this.f344a = b.DONE;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Preconditions.checkState(this.f344a != b.FAILED);
        int i = a.f345a[this.f344a.ordinal()];
        if (i == 1) {
            return false;
        }
        if (i != 2) {
            return c();
        }
        return true;
    }

    private boolean c() {
        this.f344a = b.FAILED;
        this.b = a();
        if (this.f344a == b.DONE) {
            return false;
        }
        this.f344a = b.READY;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.f344a = b.NOT_READY;
            Object obj = this.b;
            this.b = null;
            return obj;
        }
        throw new NoSuchElementException();
    }
}
