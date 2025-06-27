package com.google.android.gms.internal.games;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.games.AnnotatedData;
import com.google.android.gms.games.EventsClient;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.event.EventBuffer;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes3.dex */
public final class zzae extends zzac implements EventsClient {
    public zzae(Context context, Games.GamesOptions gamesOptions) {
        super(context, gamesOptions);
    }

    public zzae(Activity activity, Games.GamesOptions gamesOptions) {
        super(activity, gamesOptions);
    }

    @Override // com.google.android.gms.games.EventsClient
    public final Task<AnnotatedData<EventBuffer>> load(final boolean z) {
        return zza(new RemoteCall(z) { // from class: com.google.android.gms.internal.games.zzah
            private final boolean zzex;

            {
                this.zzex = z;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((com.google.android.gms.games.internal.zzf) obj).zzd((TaskCompletionSource<AnnotatedData<EventBuffer>>) obj2, this.zzex);
            }
        });
    }

    @Override // com.google.android.gms.games.EventsClient
    public final Task<AnnotatedData<EventBuffer>> loadByIds(final boolean z, final String... strArr) {
        return zza(new RemoteCall(z, strArr) { // from class: com.google.android.gms.internal.games.zzag
            private final boolean zzex;
            private final String[] zzff;

            {
                this.zzex = z;
                this.zzff = strArr;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((com.google.android.gms.games.internal.zzf) obj).zza((TaskCompletionSource<AnnotatedData<EventBuffer>>) obj2, this.zzex, this.zzff);
            }
        });
    }

    @Override // com.google.android.gms.games.EventsClient
    public final void increment(final String str, final int i) {
        zzb(new RemoteCall(str, i) { // from class: com.google.android.gms.internal.games.zzaj
            private final String zzew;
            private final int zzey;

            {
                this.zzew = str;
                this.zzey = i;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                ((com.google.android.gms.games.internal.zzf) obj).zzb(this.zzew, this.zzey);
            }
        });
    }
}
