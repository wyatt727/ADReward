package com.google.android.gms.internal.games;

import java.util.Iterator;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes3.dex */
final class zzgd<E> extends zzfy<E> {
    private final transient E zznf;
    private transient int zzng;

    zzgd(E e) {
        this.zznf = (E) zzfo.checkNotNull(e);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    zzgd(E e, int i) {
        this.zznf = e;
        this.zzng = i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.zznf.equals(obj);
    }

    @Override // com.google.android.gms.internal.games.zzfs
    /* renamed from: zzcn */
    public final zzgg<E> iterator() {
        return new zzga(this.zznf);
    }

    @Override // com.google.android.gms.internal.games.zzfy
    final zzft<E> zzcv() {
        return zzft.zzd(this.zznf);
    }

    @Override // com.google.android.gms.internal.games.zzfs
    final int zza(Object[] objArr, int i) {
        objArr[i] = this.zznf;
        return i + 1;
    }

    @Override // com.google.android.gms.internal.games.zzfy, java.util.Collection, java.util.Set
    public final int hashCode() {
        int i = this.zzng;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.zznf.hashCode();
        this.zzng = iHashCode;
        return iHashCode;
    }

    @Override // com.google.android.gms.internal.games.zzfy
    final boolean zzcu() {
        return this.zzng != 0;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        String string = this.zznf.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 2);
        sb.append(AbstractJsonLexerKt.BEGIN_LIST);
        sb.append(string);
        sb.append(AbstractJsonLexerKt.END_LIST);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.games.zzfy, com.google.android.gms.internal.games.zzfs, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return iterator();
    }
}
