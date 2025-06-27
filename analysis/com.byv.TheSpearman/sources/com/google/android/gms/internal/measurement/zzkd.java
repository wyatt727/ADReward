package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.0 */
/* loaded from: classes3.dex */
public class zzkd extends IOException {
    private zzli zza;

    static zzkg zza() {
        return new zzkg("Protocol message tag had invalid wire type.");
    }

    static zzkd zzb() {
        return new zzkd("Protocol message end-group tag did not match expected tag.");
    }

    static zzkd zzc() {
        return new zzkd("Protocol message contained an invalid tag (zero).");
    }

    static zzkd zzd() {
        return new zzkd("Protocol message had invalid UTF-8.");
    }

    static zzkd zze() {
        return new zzkd("CodedInputStream encountered a malformed varint.");
    }

    static zzkd zzf() {
        return new zzkd("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static zzkd zzg() {
        return new zzkd("Failed to parse the message.");
    }

    static zzkd zzh() {
        return new zzkd("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public zzkd(String str) {
        super(str);
        this.zza = null;
    }
}
