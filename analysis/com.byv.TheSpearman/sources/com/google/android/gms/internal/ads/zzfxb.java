package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
final class zzfxb implements Iterable {
    final /* synthetic */ CharSequence zza;
    final /* synthetic */ zzfxe zzb;

    zzfxb(zzfxe zzfxeVar, CharSequence charSequence) {
        this.zza = charSequence;
        this.zzb = zzfxeVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.zzb.zzg(this.zza);
    }

    public final String toString() throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractJsonLexerKt.BEGIN_LIST);
        zzfwg.zzb(sb, this, ", ");
        sb.append(AbstractJsonLexerKt.END_LIST);
        return sb.toString();
    }
}
