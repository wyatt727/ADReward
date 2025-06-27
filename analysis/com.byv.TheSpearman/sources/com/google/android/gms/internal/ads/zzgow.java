package com.google.android.gms.internal.ads;

import com.google.android.gms.security.ProviderInstaller;
import java.lang.reflect.InvocationTargetException;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.SecureRandom;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgow {
    private static final ThreadLocal zza = new zzgov();

    static /* synthetic */ SecureRandom zza() throws GeneralSecurityException {
        SecureRandom secureRandomZzc = zzc();
        secureRandomZzc.nextLong();
        return secureRandomZzc;
    }

    public static byte[] zzb(int i) {
        byte[] bArr = new byte[i];
        ((SecureRandom) zza.get()).nextBytes(bArr);
        return bArr;
    }

    private static SecureRandom zzc() throws GeneralSecurityException {
        try {
            try {
                try {
                    try {
                        try {
                            return SecureRandom.getInstance("SHA1PRNG", ProviderInstaller.PROVIDER_NAME);
                        } catch (GeneralSecurityException unused) {
                            return new SecureRandom();
                        }
                    } catch (GeneralSecurityException unused2) {
                        return SecureRandom.getInstance("SHA1PRNG", "Conscrypt");
                    }
                } catch (GeneralSecurityException unused3) {
                    return SecureRandom.getInstance("SHA1PRNG", "AndroidOpenSSL");
                }
            } catch (GeneralSecurityException unused4) {
                return SecureRandom.getInstance("SHA1PRNG", (Provider) Class.forName("org.conscrypt.Conscrypt").getMethod("newProvider", new Class[0]).invoke(null, new Object[0]));
            }
        } catch (ClassNotFoundException e) {
            e = e;
            throw new GeneralSecurityException("Failed to get Conscrypt provider", e);
        } catch (IllegalAccessException e2) {
            e = e2;
            throw new GeneralSecurityException("Failed to get Conscrypt provider", e);
        } catch (IllegalArgumentException e3) {
            e = e3;
            throw new GeneralSecurityException("Failed to get Conscrypt provider", e);
        } catch (NoSuchMethodException e4) {
            e = e4;
            throw new GeneralSecurityException("Failed to get Conscrypt provider", e);
        } catch (InvocationTargetException e5) {
            e = e5;
            throw new GeneralSecurityException("Failed to get Conscrypt provider", e);
        }
    }
}
