package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgfw {
    public static final zzggi zza(zzggi zzggiVar) throws GeneralSecurityException {
        return zzggiVar != null ? zzggiVar : zzggp.zza(zzb(null).zzaV());
    }

    static final zzguu zzb(zzggi zzggiVar) {
        try {
            return ((zzgou) zzgnu.zzc().zze(null, zzgou.class)).zzc();
        } catch (GeneralSecurityException e) {
            throw new zzgph("Parsing parameters failed in getProto(). You probably want to call some Tink register function for ".concat(AbstractJsonLexerKt.NULL), e);
        }
    }
}
