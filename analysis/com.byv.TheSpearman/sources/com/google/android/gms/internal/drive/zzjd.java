package com.google.android.gms.internal.drive;

import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
final class zzjd extends zzjf {
    private final int limit;
    private int position = 0;
    private final /* synthetic */ zzjc zznu;

    zzjd(zzjc zzjcVar) {
        this.zznu = zzjcVar;
        this.limit = zzjcVar.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.position < this.limit;
    }

    @Override // com.google.android.gms.internal.drive.zzjj
    public final byte nextByte() {
        int i = this.position;
        if (i >= this.limit) {
            throw new NoSuchElementException();
        }
        this.position = i + 1;
        return this.zznu.zzt(i);
    }
}
