package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public class zzhp extends zzgw {
    public final zzhb zzb;
    public final int zzc;

    public zzhp(zzhb zzhbVar, int i, int i2) {
        super(zzb(2008, 1));
        this.zzb = zzhbVar;
        this.zzc = 1;
    }

    public static zzhp zza(IOException iOException, zzhb zzhbVar, int i) {
        String message = iOException.getMessage();
        int i2 = 2001;
        if (iOException instanceof SocketTimeoutException) {
            i2 = 2002;
        } else if (iOException instanceof InterruptedIOException) {
            i2 = 1004;
        } else if (message != null && zzfvx.zza(message).matches("cleartext.*not permitted.*")) {
            i2 = 2007;
        }
        return i2 == 2007 ? new zzho(iOException, zzhbVar) : new zzhp(iOException, zzhbVar, i2, i);
    }

    private static int zzb(int i, int i2) {
        return i == 2000 ? i2 != 1 ? 2000 : 2001 : i;
    }

    public zzhp(IOException iOException, zzhb zzhbVar, int i, int i2) {
        super(iOException, zzb(i, i2));
        this.zzb = zzhbVar;
        this.zzc = i2;
    }

    public zzhp(String str, zzhb zzhbVar, int i, int i2) {
        super(str, zzb(i, i2));
        this.zzb = zzhbVar;
        this.zzc = i2;
    }

    public zzhp(String str, IOException iOException, zzhb zzhbVar, int i, int i2) {
        super(str, iOException, zzb(i, i2));
        this.zzb = zzhbVar;
        this.zzc = i2;
    }
}
