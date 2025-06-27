package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public enum zzatu implements zzgzz {
    ERROR_ENCODE_SIZE_FAIL(1),
    ERROR_UNKNOWN(3),
    ERROR_NO_SIGNALS(5),
    ERROR_ENCRYPTION(7),
    ERROR_MEMORY(9),
    ERROR_SIMULATOR(11),
    ERROR_SERVICE(13),
    ERROR_THREAD(15),
    ERROR_COLLECTION_TIMEOUT(17),
    PSN_WEB64_FAIL(2),
    PSN_DECRYPT_SIZE_FAIL(4),
    PSN_MD5_CHECK_FAIL(8),
    PSN_MD5_SIZE_FAIL(16),
    PSN_MD5_FAIL(32),
    PSN_DECODE_FAIL(64),
    PSN_SALT_FAIL(128),
    PSN_BITSLICER_FAIL(256),
    PSN_REQUEST_TYPE_FAIL(512),
    PSN_INVALID_ERROR_CODE(1024),
    PSN_TIMESTAMP_EXPIRED(2048),
    PSN_ENCODE_SIZE_FAIL(4096),
    PSN_BLANK_VALUE(8192),
    PSN_INITIALIZATION_FAIL(16384),
    PSN_GASS_CLIENT_FAIL(32768),
    PSN_SIGNALS_TIMEOUT(65536),
    PSN_TINK_FAIL(131072);

    private static final zzhaa zzA = new zzhaa() { // from class: com.google.android.gms.internal.ads.zzatt
        @Override // com.google.android.gms.internal.ads.zzhaa
        public final /* synthetic */ zzgzz zza(int i) {
            zzatu zzatuVar = zzatu.ERROR_ENCODE_SIZE_FAIL;
            if (i == 1) {
                return zzatu.ERROR_ENCODE_SIZE_FAIL;
            }
            if (i == 2) {
                return zzatu.PSN_WEB64_FAIL;
            }
            if (i == 3) {
                return zzatu.ERROR_UNKNOWN;
            }
            if (i == 4) {
                return zzatu.PSN_DECRYPT_SIZE_FAIL;
            }
            if (i == 5) {
                return zzatu.ERROR_NO_SIGNALS;
            }
            if (i == 7) {
                return zzatu.ERROR_ENCRYPTION;
            }
            if (i == 8) {
                return zzatu.PSN_MD5_CHECK_FAIL;
            }
            if (i == 9) {
                return zzatu.ERROR_MEMORY;
            }
            switch (i) {
                case 11:
                    return zzatu.ERROR_SIMULATOR;
                case 13:
                    return zzatu.ERROR_SERVICE;
                case 32:
                    return zzatu.PSN_MD5_FAIL;
                case 64:
                    return zzatu.PSN_DECODE_FAIL;
                case 128:
                    return zzatu.PSN_SALT_FAIL;
                case 256:
                    return zzatu.PSN_BITSLICER_FAIL;
                case 512:
                    return zzatu.PSN_REQUEST_TYPE_FAIL;
                case 1024:
                    return zzatu.PSN_INVALID_ERROR_CODE;
                case 2048:
                    return zzatu.PSN_TIMESTAMP_EXPIRED;
                case 4096:
                    return zzatu.PSN_ENCODE_SIZE_FAIL;
                case 8192:
                    return zzatu.PSN_BLANK_VALUE;
                case 16384:
                    return zzatu.PSN_INITIALIZATION_FAIL;
                case 32768:
                    return zzatu.PSN_GASS_CLIENT_FAIL;
                case 65536:
                    return zzatu.PSN_SIGNALS_TIMEOUT;
                case 131072:
                    return zzatu.PSN_TINK_FAIL;
                default:
                    switch (i) {
                        case 15:
                            return zzatu.ERROR_THREAD;
                        case 16:
                            return zzatu.PSN_MD5_SIZE_FAIL;
                        case 17:
                            return zzatu.ERROR_COLLECTION_TIMEOUT;
                        default:
                            return null;
                    }
            }
        }
    };
    private final int zzC;

    zzatu(int i) {
        this.zzC = i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzC);
    }

    @Override // com.google.android.gms.internal.ads.zzgzz
    public final int zza() {
        return this.zzC;
    }
}
