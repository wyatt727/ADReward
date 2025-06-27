package com.google.android.gms.nearby;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.nearby.zzcn;
import com.google.android.gms.internal.nearby.zzdm;
import com.google.android.gms.internal.nearby.zzh;
import com.google.android.gms.internal.nearby.zzhw;
import com.google.android.gms.internal.nearby.zzk;
import com.google.android.gms.nearby.connection.Connections;
import com.google.android.gms.nearby.connection.ConnectionsClient;
import com.google.android.gms.nearby.connection.ConnectionsOptions;
import com.google.android.gms.nearby.messages.Messages;
import com.google.android.gms.nearby.messages.MessagesClient;
import com.google.android.gms.nearby.messages.MessagesOptions;
import com.google.android.gms.nearby.messages.internal.zzbg;
import com.google.android.gms.nearby.messages.internal.zzbw;
import com.google.android.gms.nearby.messages.internal.zzbx;
import com.google.android.gms.nearby.messages.zzc;

/* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* loaded from: classes3.dex */
public final class Nearby {

    @Deprecated
    public static final Api<ConnectionsOptions> CONNECTIONS_API = new Api<>("Nearby.CONNECTIONS_API", zzdm.zzb, zzdm.zza);

    @Deprecated
    public static final Connections Connections = new zzdm();

    @Deprecated
    public static final Api<MessagesOptions> MESSAGES_API = new Api<>("Nearby.MESSAGES_API", zzbw.zzc, zzbw.zzb);

    @Deprecated
    public static final Messages Messages = zzbw.zza;
    public static final zzc zza = new zzbx();

    @Deprecated
    public static final Api<Api.ApiOptions.NoOptions> zzb = new Api<>("Nearby.BOOTSTRAP_API", zzk.zzb, zzk.zza);

    @Deprecated
    public static final zzh zzc = new zzk();

    private Nearby() {
    }

    public static final ConnectionsClient getConnectionsClient(Activity activity) {
        Preconditions.checkNotNull(activity, "Activity must not be null");
        return new zzcn(activity, (ConnectionsOptions) null);
    }

    public static final MessagesClient getMessagesClient(Activity activity) {
        Preconditions.checkNotNull(activity, "Activity must not be null");
        return new zzbg(activity, (MessagesOptions) null);
    }

    public static boolean zza(Context context) {
        if (Wrappers.packageManager(context).checkCallingOrSelfPermission("com.google.android.providers.gsf.permission.READ_GSERVICES") == 0) {
            return zzhw.zza(context.getContentResolver(), "gms:nearby:requires_gms_check", true);
        }
        return true;
    }

    public static final ConnectionsClient getConnectionsClient(Context context) {
        Preconditions.checkNotNull(context, "Context must not be null");
        return new zzcn(context, (ConnectionsOptions) null);
    }

    public static final MessagesClient getMessagesClient(Activity activity, MessagesOptions messagesOptions) {
        Preconditions.checkNotNull(activity, "Activity must not be null");
        Preconditions.checkNotNull(messagesOptions, "Options must not be null");
        return new zzbg(activity, messagesOptions);
    }

    public static final MessagesClient getMessagesClient(Context context) {
        Preconditions.checkNotNull(context, "Context must not be null");
        return new zzbg(context, (MessagesOptions) null);
    }

    public static final MessagesClient getMessagesClient(Context context, MessagesOptions messagesOptions) {
        Preconditions.checkNotNull(context, "Context must not be null");
        Preconditions.checkNotNull(messagesOptions, "Options must not be null");
        return new zzbg(context, messagesOptions);
    }
}
