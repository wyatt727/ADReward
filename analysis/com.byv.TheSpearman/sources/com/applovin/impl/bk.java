package com.applovin.impl;

import com.applovin.impl.wg;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public abstract class bk extends yj implements ll {
    private final String n;

    protected abstract kl a(byte[] bArr, int i, boolean z);

    @Override // com.applovin.impl.ll
    public void a(long j) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.applovin.impl.yj
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ml a(Throwable th) {
        return new ml("Unexpected decode error", th);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.applovin.impl.yj
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final ol f() {
        return new ol();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.applovin.impl.yj
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final pl g() {
        return new ck(new wg.a() { // from class: com.applovin.impl.bk$$ExternalSyntheticLambda0
            @Override // com.applovin.impl.wg.a
            public final void a(wg wgVar) {
                this.f$0.a(wgVar);
            }
        });
    }

    protected bk(String str) {
        super(new ol[2], new pl[2]);
        this.n = str;
        a(1024);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.applovin.impl.yj
    public final ml a(ol olVar, pl plVar, boolean z) {
        try {
            ByteBuffer byteBuffer = (ByteBuffer) a1.a(olVar.c);
            plVar.a(olVar.f, a(byteBuffer.array(), byteBuffer.limit(), z), olVar.j);
            plVar.c(Integer.MIN_VALUE);
            return null;
        } catch (ml e) {
            return e;
        }
    }
}
