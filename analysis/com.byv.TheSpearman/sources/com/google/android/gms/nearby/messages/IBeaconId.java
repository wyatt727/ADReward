package com.google.android.gms.nearby.messages;

import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.nearby.messages.internal.zzl;
import java.util.UUID;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* loaded from: classes3.dex */
public class IBeaconId {
    public static final int LENGTH = 20;
    private final zzl zza;

    public IBeaconId(UUID uuid, short s, short s2) {
        this.zza = new zzl(uuid, Short.valueOf(s), Short.valueOf(s2));
    }

    public static IBeaconId from(Message message) {
        boolean zZza = message.zza(Message.MESSAGE_TYPE_I_BEACON_ID);
        String type = message.getType();
        StringBuilder sb = new StringBuilder(String.valueOf(type).length() + 55);
        sb.append("Message type '");
        sb.append(type);
        sb.append("' is not Message.MESSAGE_TYPE_I_BEACON_ID");
        Preconditions.checkArgument(zZza, sb.toString());
        return new IBeaconId(message.getContent());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof IBeaconId) {
            return Objects.equal(this.zza, ((IBeaconId) obj).zza);
        }
        return false;
    }

    public short getMajor() {
        return this.zza.zzf().shortValue();
    }

    public short getMinor() {
        return this.zza.zzg().shortValue();
    }

    public UUID getProximityUuid() {
        return this.zza.zze();
    }

    public int hashCode() {
        return Objects.hashCode(this.zza);
    }

    public String toString() {
        String strValueOf = String.valueOf(getProximityUuid());
        short major = getMajor();
        short minor = getMinor();
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 53);
        sb.append("IBeaconId{proximityUuid=");
        sb.append(strValueOf);
        sb.append(", major=");
        sb.append((int) major);
        sb.append(", minor=");
        sb.append((int) minor);
        sb.append(AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }

    public IBeaconId(byte[] bArr) {
        Preconditions.checkArgument(bArr.length == 20, "iBeacon ID must be a UUID, a major, and a minor (20 total bytes).");
        this.zza = new zzl(bArr);
    }
}
