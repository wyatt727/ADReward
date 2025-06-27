package com.google.android.gms.nearby.messages;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.webkit.ProxyConfig;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.nearby.zzhg;
import com.google.android.gms.internal.nearby.zzhl;
import com.google.android.gms.nearby.messages.internal.zzac;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* loaded from: classes3.dex */
public class MessageFilter extends AbstractSafeParcelable {
    public static final Parcelable.Creator<MessageFilter> CREATOR = new zzb();
    public static final MessageFilter INCLUDE_ALL_MY_TYPES;
    final int zza;
    private final List<zzac> zzb;
    private final List<zzhl> zzc;
    private final boolean zzd;
    private final List<zzhg> zze;
    private final int zzf;

    /* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
    public static final class Builder {
        private boolean zzd;
        private final Set<zzac> zza = new HashSet();
        private final List<zzhl> zzb = new ArrayList();
        private final Set<zzhg> zzc = new HashSet();
        private int zze = 0;

        private final Builder zza(String str, String str2) {
            this.zza.add(new zzac(str, str2));
            return this;
        }

        public MessageFilter build() {
            boolean z = true;
            if (!this.zzd && this.zza.isEmpty()) {
                z = false;
            }
            Preconditions.checkState(z, "At least one of the include methods must be called.");
            return new MessageFilter(2, new ArrayList(this.zza), this.zzb, this.zzd, new ArrayList(this.zzc), this.zze);
        }

        public Builder includeAllMyTypes() {
            this.zzd = true;
            return this;
        }

        public Builder includeAudioBytes(int i) {
            Preconditions.checkArgument(this.zze == 0, "includeAudioBytes() can only be called once per MessageFilter instance.");
            boolean z = i > 0;
            StringBuilder sb = new StringBuilder(44);
            sb.append("Invalid value for numAudioBytes: ");
            sb.append(i);
            Preconditions.checkArgument(z, sb.toString());
            Preconditions.checkArgument(i <= 10, "numAudioBytes is capped by AudioBytes.MAX_SIZE = 10");
            zza(Message.MESSAGE_NAMESPACE_RESERVED, Message.MESSAGE_TYPE_AUDIO_BYTES);
            this.zze = i;
            return this;
        }

        public Builder includeEddystoneUids(String str, String str2) {
            zza(Message.MESSAGE_NAMESPACE_RESERVED, Message.MESSAGE_TYPE_EDDYSTONE_UID);
            this.zzb.add(zzhl.zza(str, str2));
            return this;
        }

        public Builder includeFilter(MessageFilter messageFilter) {
            this.zza.addAll(messageFilter.zza());
            this.zzb.addAll(messageFilter.zzc());
            this.zzc.addAll(messageFilter.zzd());
            this.zzd = messageFilter.zzb() | this.zzd;
            return this;
        }

        public Builder includeIBeaconIds(UUID uuid, Short sh, Short sh2) {
            zza(Message.MESSAGE_NAMESPACE_RESERVED, Message.MESSAGE_TYPE_I_BEACON_ID);
            this.zzb.add(zzhl.zzb(uuid, sh, sh2));
            return this;
        }

        public Builder includeNamespacedType(String str, String str2) {
            Preconditions.checkArgument((str == null || str.isEmpty() || str.contains(ProxyConfig.MATCH_ALL_SCHEMES)) ? false : true, "namespace(%s) cannot be null, empty or contain (*).", str);
            Preconditions.checkArgument((str2 == null || str2.contains(ProxyConfig.MATCH_ALL_SCHEMES)) ? false : true, "type(%s) cannot be null or contain (*).", str2);
            zza(str, str2);
            return this;
        }
    }

    static {
        Builder builder = new Builder();
        builder.includeAllMyTypes();
        INCLUDE_ALL_MY_TYPES = builder.build();
    }

    MessageFilter(int i, List<zzac> list, List<zzhl> list2, boolean z, List<zzhg> list3, int i2) {
        this.zza = i;
        this.zzb = Collections.unmodifiableList((List) Preconditions.checkNotNull(list));
        this.zzd = z;
        this.zzc = Collections.unmodifiableList(list2 == null ? Collections.emptyList() : list2);
        this.zze = Collections.unmodifiableList(list3 == null ? Collections.emptyList() : list3);
        this.zzf = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessageFilter)) {
            return false;
        }
        MessageFilter messageFilter = (MessageFilter) obj;
        return this.zzd == messageFilter.zzd && Objects.equal(this.zzb, messageFilter.zzb) && Objects.equal(this.zzc, messageFilter.zzc) && Objects.equal(this.zze, messageFilter.zze);
    }

    public int hashCode() {
        return Objects.hashCode(this.zzb, this.zzc, Boolean.valueOf(this.zzd), this.zze);
    }

    public String toString() {
        boolean z = this.zzd;
        String strValueOf = String.valueOf(this.zzb);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 53);
        sb.append("MessageFilter{includeAllMyTypes=");
        sb.append(z);
        sb.append(", messageTypes=");
        sb.append(strValueOf);
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 1, this.zzb, false);
        SafeParcelWriter.writeTypedList(parcel, 2, this.zzc, false);
        SafeParcelWriter.writeBoolean(parcel, 3, this.zzd);
        SafeParcelWriter.writeTypedList(parcel, 4, this.zze, false);
        SafeParcelWriter.writeInt(parcel, 5, this.zzf);
        SafeParcelWriter.writeInt(parcel, 1000, this.zza);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final List<zzac> zza() {
        return this.zzb;
    }

    public final boolean zzb() {
        return this.zzd;
    }

    final List<zzhl> zzc() {
        return this.zzc;
    }

    public final List<zzhg> zzd() {
        return this.zze;
    }
}
