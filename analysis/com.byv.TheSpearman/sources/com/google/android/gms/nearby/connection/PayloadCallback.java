package com.google.android.gms.nearby.connection;

/* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* loaded from: classes3.dex */
public abstract class PayloadCallback {
    public abstract void onPayloadReceived(String str, Payload payload);

    public abstract void onPayloadTransferUpdate(String str, PayloadTransferUpdate payloadTransferUpdate);
}
