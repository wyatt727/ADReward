package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
public class zzhak extends IOException {
    private zzhbl zza;
    private boolean zzb;

    public zzhak(IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.zza = null;
    }

    static zzhaj zza() {
        return new zzhaj("Protocol message tag had invalid wire type.");
    }

    static zzhak zzb() {
        return new zzhak("Protocol message end-group tag did not match expected tag.");
    }

    static zzhak zzc() {
        return new zzhak("Protocol message contained an invalid tag (zero).");
    }

    static zzhak zzd() {
        return new zzhak("Protocol message had invalid UTF-8.");
    }

    static zzhak zze() {
        return new zzhak("CodedInputStream encountered a malformed varint.");
    }

    static zzhak zzf() {
        return new zzhak("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static zzhak zzg() {
        return new zzhak("Failed to parse the message.");
    }

    static zzhak zzi() {
        return new zzhak("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    static zzhak zzj() {
        return new zzhak("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public final zzhak zzh(zzhbl zzhblVar) {
        this.zza = zzhblVar;
        return this;
    }

    final void zzk() {
        this.zzb = true;
    }

    final boolean zzl() {
        return this.zzb;
    }

    public zzhak(String str) {
        super(str);
        this.zza = null;
    }
}
