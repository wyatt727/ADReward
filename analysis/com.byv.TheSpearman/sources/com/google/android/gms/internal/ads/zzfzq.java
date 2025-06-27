package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public abstract class zzfzq implements Map, Serializable {

    @CheckForNull
    private transient zzfzs zza;

    @CheckForNull
    private transient zzfzs zzb;

    @CheckForNull
    private transient zzfzi zzc;

    zzfzq() {
    }

    public static zzfzq zzc(Map map) {
        Set setEntrySet = map.entrySet();
        zzfzp zzfzpVar = new zzfzp(setEntrySet instanceof Collection ? setEntrySet.size() : 4);
        zzfzpVar.zzb(setEntrySet);
        return zzfzpVar.zzc();
    }

    public static zzfzq zzd() {
        return zzgbe.zza;
    }

    public static zzfzq zze(Object obj, Object obj2) {
        zzfyk.zzb("dialog_not_shown_reason", obj2);
        return zzgbe.zzj(1, new Object[]{"dialog_not_shown_reason", obj2}, null);
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(@CheckForNull Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(@CheckForNull Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(@CheckForNull Object obj) {
        return zzgak.zzb(this, obj);
    }

    @Override // java.util.Map
    @CheckForNull
    public abstract Object get(@CheckForNull Object obj);

    @Override // java.util.Map
    @CheckForNull
    public final Object getOrDefault(@CheckForNull Object obj, @CheckForNull Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return zzgbp.zza(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    @CheckForNull
    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @CheckForNull
    @Deprecated
    public final Object remove(@CheckForNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        zzfyk.zza(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(size * 8, 1073741824L));
        sb.append(AbstractJsonLexerKt.BEGIN_OBJ);
        boolean z = true;
        for (Map.Entry entry : entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
        sb.append(AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }

    abstract zzfzi zza();

    @Override // java.util.Map
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzfzi values() {
        zzfzi zzfziVar = this.zzc;
        if (zzfziVar != null) {
            return zzfziVar;
        }
        zzfzi zzfziVarZza = zza();
        this.zzc = zzfziVarZza;
        return zzfziVarZza;
    }

    abstract zzfzs zzf();

    abstract zzfzs zzg();

    @Override // java.util.Map
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final zzfzs entrySet() {
        zzfzs zzfzsVar = this.zza;
        if (zzfzsVar != null) {
            return zzfzsVar;
        }
        zzfzs zzfzsVarZzf = zzf();
        this.zza = zzfzsVarZzf;
        return zzfzsVarZzf;
    }

    @Override // java.util.Map
    /* renamed from: zzi, reason: merged with bridge method [inline-methods] */
    public final zzfzs keySet() {
        zzfzs zzfzsVar = this.zzb;
        if (zzfzsVar != null) {
            return zzfzsVar;
        }
        zzfzs zzfzsVarZzg = zzg();
        this.zzb = zzfzsVarZzg;
        return zzfzsVarZzg;
    }
}
