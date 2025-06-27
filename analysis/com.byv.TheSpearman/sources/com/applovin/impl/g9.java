package com.applovin.impl;

import com.applovin.impl.go;

/* loaded from: classes.dex */
public abstract class g9 extends go {
    protected final go c;

    public g9(go goVar) {
        this.c = goVar;
    }

    @Override // com.applovin.impl.go
    public int b(boolean z) {
        return this.c.b(z);
    }

    @Override // com.applovin.impl.go
    public int a(boolean z) {
        return this.c.a(z);
    }

    @Override // com.applovin.impl.go
    public int b(int i, int i2, boolean z) {
        return this.c.b(i, i2, z);
    }

    @Override // com.applovin.impl.go
    public int a(Object obj) {
        return this.c.a(obj);
    }

    @Override // com.applovin.impl.go
    public int a(int i, int i2, boolean z) {
        return this.c.a(i, i2, z);
    }

    @Override // com.applovin.impl.go
    public Object b(int i) {
        return this.c.b(i);
    }

    @Override // com.applovin.impl.go
    public int b() {
        return this.c.b();
    }

    @Override // com.applovin.impl.go
    public go.b a(int i, go.b bVar, boolean z) {
        return this.c.a(i, bVar, z);
    }

    @Override // com.applovin.impl.go
    public int a() {
        return this.c.a();
    }

    @Override // com.applovin.impl.go
    public go.d a(int i, go.d dVar, long j) {
        return this.c.a(i, dVar, j);
    }
}
