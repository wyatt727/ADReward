package com.google.android.gms.nearby.messages;

/* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* loaded from: classes3.dex */
public interface BleSignal {
    public static final int UNKNOWN_TX_POWER = Integer.MIN_VALUE;

    int getRssi();

    int getTxPower();
}
