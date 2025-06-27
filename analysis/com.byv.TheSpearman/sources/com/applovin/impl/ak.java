package com.applovin.impl;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public abstract class ak implements xe {
    protected abstract we a(ze zeVar, ByteBuffer byteBuffer);

    @Override // com.applovin.impl.xe
    public final we a(ze zeVar) {
        ByteBuffer byteBuffer = (ByteBuffer) a1.a(zeVar.c);
        a1.a(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        if (zeVar.d()) {
            return null;
        }
        return a(zeVar, byteBuffer);
    }
}
