package com.google.android.gms.internal.nearby;

import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.nearby.messages.Message;
import com.google.android.gms.nearby.messages.MessageListener;
import com.google.android.gms.nearby.messages.internal.Update;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* loaded from: classes3.dex */
public final class zzho extends com.google.android.gms.nearby.messages.internal.zzn {
    private final ListenerHolder<MessageListener> zza;

    public zzho(ListenerHolder<MessageListener> listenerHolder) {
        this.zza = listenerHolder;
    }

    public static void zzb(Iterable<Update> iterable, MessageListener messageListener) {
        for (Update update : iterable) {
            if (update.zza(1)) {
                messageListener.onFound(update.zzc);
            }
            if (update.zza(2)) {
                messageListener.onLost(update.zzc);
            }
            if (update.zza(4)) {
                messageListener.onDistanceChanged(update.zzc, update.zzd);
            }
            if (update.zza(8)) {
                messageListener.onBleSignalChanged(update.zzc, update.zze);
            }
            if (update.zza(16)) {
                Message message = update.zzc;
                zzhj zzhjVar = update.zzf;
            }
        }
    }

    public static void zzc(Intent intent, MessageListener messageListener) {
        Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.nearby.messages.UPDATES");
        zzb(bundleExtra == null ? Collections.emptyList() : bundleExtra.getParcelableArrayList("com.google.android.gms.nearby.messages.UPDATES"), messageListener);
    }

    @Override // com.google.android.gms.nearby.messages.internal.zzo
    public final void zzd(List<Update> list) throws RemoteException {
        this.zza.notifyListener(new zzhn(this, list));
    }
}
