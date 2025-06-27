package com.google.android.gms.nearby.messages.internal;

import android.app.PendingIntent;
import android.content.Intent;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.nearby.zzho;
import com.google.android.gms.nearby.messages.Message;
import com.google.android.gms.nearby.messages.MessageListener;
import com.google.android.gms.nearby.messages.Messages;
import com.google.android.gms.nearby.messages.MessagesOptions;
import com.google.android.gms.nearby.messages.PublishOptions;
import com.google.android.gms.nearby.messages.StatusCallback;
import com.google.android.gms.nearby.messages.SubscribeOptions;

/* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* loaded from: classes3.dex */
public final class zzbw implements Messages {
    public static final zzbw zza = new zzbw();
    public static final Api.ClientKey<zzai> zzb = new Api.ClientKey<>();
    public static final Api.AbstractClientBuilder<zzai, MessagesOptions> zzc = new zzbi();

    private zzbw() {
    }

    @Override // com.google.android.gms.nearby.messages.Messages
    public final PendingResult<Status> getPermissionStatus(GoogleApiClient googleApiClient) {
        return googleApiClient.execute(new zzbp(this, googleApiClient));
    }

    @Override // com.google.android.gms.nearby.messages.Messages
    public final void handleIntent(Intent intent, MessageListener messageListener) {
        zzho.zzc(intent, messageListener);
    }

    @Override // com.google.android.gms.nearby.messages.Messages
    public final PendingResult<Status> publish(GoogleApiClient googleApiClient, Message message) {
        PublishOptions publishOptions = PublishOptions.DEFAULT;
        Preconditions.checkNotNull(message);
        Preconditions.checkNotNull(publishOptions);
        ListenerHolder listenerHolderRegisterListener = publishOptions.getCallback() == null ? null : googleApiClient.registerListener(publishOptions.getCallback());
        return googleApiClient.execute(new zzbj(this, googleApiClient, message, listenerHolderRegisterListener != null ? new zzbs(listenerHolderRegisterListener) : null, publishOptions));
    }

    @Override // com.google.android.gms.nearby.messages.Messages
    public final PendingResult<Status> registerStatusCallback(GoogleApiClient googleApiClient, StatusCallback statusCallback) {
        Preconditions.checkNotNull(statusCallback);
        return googleApiClient.execute(new zzbq(this, googleApiClient, googleApiClient.registerListener(statusCallback)));
    }

    @Override // com.google.android.gms.nearby.messages.Messages
    public final PendingResult<Status> subscribe(GoogleApiClient googleApiClient, PendingIntent pendingIntent) {
        SubscribeOptions subscribeOptions = SubscribeOptions.DEFAULT;
        Preconditions.checkNotNull(pendingIntent);
        Preconditions.checkNotNull(subscribeOptions);
        ListenerHolder listenerHolderRegisterListener = subscribeOptions.getCallback() == null ? null : googleApiClient.registerListener(subscribeOptions.getCallback());
        return googleApiClient.execute(new zzbm(this, googleApiClient, pendingIntent, listenerHolderRegisterListener != null ? new zzbv(listenerHolderRegisterListener) : null, subscribeOptions));
    }

    @Override // com.google.android.gms.nearby.messages.Messages
    public final PendingResult<Status> unpublish(GoogleApiClient googleApiClient, Message message) {
        Preconditions.checkNotNull(message);
        return googleApiClient.execute(new zzbk(this, googleApiClient, message));
    }

    @Override // com.google.android.gms.nearby.messages.Messages
    public final PendingResult<Status> unregisterStatusCallback(GoogleApiClient googleApiClient, StatusCallback statusCallback) {
        Preconditions.checkNotNull(statusCallback);
        return googleApiClient.execute(new zzbh(this, googleApiClient, googleApiClient.registerListener(statusCallback)));
    }

    @Override // com.google.android.gms.nearby.messages.Messages
    public final PendingResult<Status> unsubscribe(GoogleApiClient googleApiClient, PendingIntent pendingIntent) {
        Preconditions.checkNotNull(pendingIntent);
        return googleApiClient.execute(new zzbo(this, googleApiClient, pendingIntent));
    }

    @Override // com.google.android.gms.nearby.messages.Messages
    public final PendingResult<Status> unsubscribe(GoogleApiClient googleApiClient, MessageListener messageListener) {
        Preconditions.checkNotNull(messageListener);
        return googleApiClient.execute(new zzbn(this, googleApiClient, googleApiClient.registerListener(messageListener)));
    }

    @Override // com.google.android.gms.nearby.messages.Messages
    public final PendingResult<Status> publish(GoogleApiClient googleApiClient, Message message, PublishOptions publishOptions) {
        Preconditions.checkNotNull(message);
        Preconditions.checkNotNull(publishOptions);
        ListenerHolder listenerHolderRegisterListener = publishOptions.getCallback() == null ? null : googleApiClient.registerListener(publishOptions.getCallback());
        return googleApiClient.execute(new zzbj(this, googleApiClient, message, listenerHolderRegisterListener != null ? new zzbs(listenerHolderRegisterListener) : null, publishOptions));
    }

    @Override // com.google.android.gms.nearby.messages.Messages
    public final PendingResult<Status> subscribe(GoogleApiClient googleApiClient, PendingIntent pendingIntent, SubscribeOptions subscribeOptions) {
        Preconditions.checkNotNull(pendingIntent);
        Preconditions.checkNotNull(subscribeOptions);
        ListenerHolder listenerHolderRegisterListener = subscribeOptions.getCallback() == null ? null : googleApiClient.registerListener(subscribeOptions.getCallback());
        return googleApiClient.execute(new zzbm(this, googleApiClient, pendingIntent, listenerHolderRegisterListener != null ? new zzbv(listenerHolderRegisterListener) : null, subscribeOptions));
    }

    @Override // com.google.android.gms.nearby.messages.Messages
    public final PendingResult<Status> subscribe(GoogleApiClient googleApiClient, MessageListener messageListener) {
        SubscribeOptions subscribeOptions = SubscribeOptions.DEFAULT;
        Preconditions.checkNotNull(messageListener);
        Preconditions.checkNotNull(subscribeOptions);
        Preconditions.checkArgument(subscribeOptions.getStrategy().zza() == 0, "Strategy.setBackgroundScanMode() is only supported by background subscribe (the version which takes a PendingIntent).");
        ListenerHolder listenerHolderRegisterListener = googleApiClient.registerListener(messageListener);
        ListenerHolder listenerHolderRegisterListener2 = subscribeOptions.getCallback() == null ? null : googleApiClient.registerListener(subscribeOptions.getCallback());
        return googleApiClient.execute(new zzbl(this, googleApiClient, listenerHolderRegisterListener, listenerHolderRegisterListener2 != null ? new zzbv(listenerHolderRegisterListener2) : null, subscribeOptions));
    }

    @Override // com.google.android.gms.nearby.messages.Messages
    public final PendingResult<Status> subscribe(GoogleApiClient googleApiClient, MessageListener messageListener, SubscribeOptions subscribeOptions) {
        Preconditions.checkNotNull(messageListener);
        Preconditions.checkNotNull(subscribeOptions);
        Preconditions.checkArgument(subscribeOptions.getStrategy().zza() == 0, "Strategy.setBackgroundScanMode() is only supported by background subscribe (the version which takes a PendingIntent).");
        ListenerHolder listenerHolderRegisterListener = googleApiClient.registerListener(messageListener);
        ListenerHolder listenerHolderRegisterListener2 = subscribeOptions.getCallback() == null ? null : googleApiClient.registerListener(subscribeOptions.getCallback());
        return googleApiClient.execute(new zzbl(this, googleApiClient, listenerHolderRegisterListener, listenerHolderRegisterListener2 != null ? new zzbv(listenerHolderRegisterListener2) : null, subscribeOptions));
    }
}
