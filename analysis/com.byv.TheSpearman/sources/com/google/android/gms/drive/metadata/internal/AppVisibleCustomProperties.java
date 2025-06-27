package com.google.android.gms.drive.metadata.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.drive.metadata.CustomPropertyKey;
import com.json.t2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class AppVisibleCustomProperties extends AbstractSafeParcelable implements ReflectedParcelable, Iterable<zzc> {
    public static final Parcelable.Creator<AppVisibleCustomProperties> CREATOR = new com.google.android.gms.drive.metadata.internal.zza();
    public static final AppVisibleCustomProperties zzjb = new zza().zzbb();
    private final List<zzc> zzjc;

    AppVisibleCustomProperties(Collection<zzc> collection) {
        Preconditions.checkNotNull(collection);
        this.zzjc = new ArrayList(collection);
    }

    public static class zza {
        private final Map<CustomPropertyKey, zzc> zzjd = new HashMap();

        public final zza zza(CustomPropertyKey customPropertyKey, String str) {
            Preconditions.checkNotNull(customPropertyKey, t2.h.W);
            this.zzjd.put(customPropertyKey, new zzc(customPropertyKey, str));
            return this;
        }

        public final zza zza(zzc zzcVar) {
            Preconditions.checkNotNull(zzcVar, "property");
            this.zzjd.put(zzcVar.zzje, zzcVar);
            return this;
        }

        public final AppVisibleCustomProperties zzbb() {
            return new AppVisibleCustomProperties(this.zzjd.values());
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 2, this.zzjc, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @Override // java.lang.Iterable
    public final Iterator<zzc> iterator() {
        return this.zzjc.iterator();
    }

    public final Map<CustomPropertyKey, String> zzba() {
        HashMap map = new HashMap(this.zzjc.size());
        for (zzc zzcVar : this.zzjc) {
            map.put(zzcVar.zzje, zzcVar.value);
        }
        return Collections.unmodifiableMap(map);
    }

    public final int hashCode() {
        return Objects.hashCode(this.zzjc);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        return zzba().equals(((AppVisibleCustomProperties) obj).zzba());
    }
}
