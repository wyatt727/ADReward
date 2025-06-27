package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public enum zzfpk implements zzgzz {
    UNKNOWN(0),
    PROVIDENCE(1),
    INTENT_OPERATION(2),
    BROADCAST_RECEIVER(3),
    CONTENT_PROVIDER(4),
    ACTIVITY(5),
    SERVICE(6),
    BINDER(7),
    SYNC_ADAPTER(8),
    GCM_TASK(9),
    INTENT_SERVICE(10),
    SERVICE_CONNECTION(11),
    GCM_LISTENER(12),
    CALLBACKS(13),
    ALARM_LISTENER(14),
    CUSTOM_EVENT_LOOP(15),
    SENSOR_EVENT_LISTENER(16),
    BLE_SCAN_CALLBACK(17),
    BINDER_BY_INTERCEPTOR(18),
    CONTENT_OBSERVER(19),
    BACKUP_AGENT(20),
    SLICE_PROVIDER(21),
    LOCATION_LISTENER(22),
    GMS_APPLICATION(23),
    OAUTH(24),
    LOCATION_CALLBACKS(25),
    BT_ADAPTER(26),
    NETWORK_CALLBACK(27),
    JOB_SERVICE(28);

    private static final zzhaa zzD = new zzhaa() { // from class: com.google.android.gms.internal.ads.zzfpj
        @Override // com.google.android.gms.internal.ads.zzhaa
        public final /* synthetic */ zzgzz zza(int i) {
            zzfpk zzfpkVar = zzfpk.UNKNOWN;
            switch (i) {
                case 0:
                    return zzfpk.UNKNOWN;
                case 1:
                    return zzfpk.PROVIDENCE;
                case 2:
                    return zzfpk.INTENT_OPERATION;
                case 3:
                    return zzfpk.BROADCAST_RECEIVER;
                case 4:
                    return zzfpk.CONTENT_PROVIDER;
                case 5:
                    return zzfpk.ACTIVITY;
                case 6:
                    return zzfpk.SERVICE;
                case 7:
                    return zzfpk.BINDER;
                case 8:
                    return zzfpk.SYNC_ADAPTER;
                case 9:
                    return zzfpk.GCM_TASK;
                case 10:
                    return zzfpk.INTENT_SERVICE;
                case 11:
                    return zzfpk.SERVICE_CONNECTION;
                case 12:
                    return zzfpk.GCM_LISTENER;
                case 13:
                    return zzfpk.CALLBACKS;
                case 14:
                    return zzfpk.ALARM_LISTENER;
                case 15:
                    return zzfpk.CUSTOM_EVENT_LOOP;
                case 16:
                    return zzfpk.SENSOR_EVENT_LISTENER;
                case 17:
                    return zzfpk.BLE_SCAN_CALLBACK;
                case 18:
                    return zzfpk.BINDER_BY_INTERCEPTOR;
                case 19:
                    return zzfpk.CONTENT_OBSERVER;
                case 20:
                    return zzfpk.BACKUP_AGENT;
                case 21:
                    return zzfpk.SLICE_PROVIDER;
                case 22:
                    return zzfpk.LOCATION_LISTENER;
                case 23:
                    return zzfpk.GMS_APPLICATION;
                case 24:
                    return zzfpk.OAUTH;
                case 25:
                    return zzfpk.LOCATION_CALLBACKS;
                case 26:
                    return zzfpk.BT_ADAPTER;
                case 27:
                    return zzfpk.NETWORK_CALLBACK;
                case 28:
                    return zzfpk.JOB_SERVICE;
                default:
                    return null;
            }
        }
    };
    private final int zzF;

    zzfpk(int i) {
        this.zzF = i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzF);
    }

    @Override // com.google.android.gms.internal.ads.zzgzz
    public final int zza() {
        return this.zzF;
    }
}
