package com.google.android.gms.internal.games;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.games.AchievementsClient;
import com.google.android.gms.games.AnnotatedData;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.achievement.AchievementBuffer;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes3.dex */
public final class zzf extends zzac implements AchievementsClient {
    public zzf(Context context, Games.GamesOptions gamesOptions) {
        super(context, gamesOptions);
    }

    public zzf(Activity activity, Games.GamesOptions gamesOptions) {
        super(activity, gamesOptions);
    }

    @Override // com.google.android.gms.games.AchievementsClient
    public final Task<Intent> getAchievementsIntent() {
        return doRead(zzbh.zzd(zze.zzev));
    }

    @Override // com.google.android.gms.games.AchievementsClient
    public final Task<AnnotatedData<AchievementBuffer>> load(final boolean z) {
        return doRead(zzbh.zzd(new RemoteCall(z) { // from class: com.google.android.gms.internal.games.zzh
            private final boolean zzex;

            {
                this.zzex = z;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((com.google.android.gms.games.internal.zzf) obj).zzc((TaskCompletionSource<AnnotatedData<AchievementBuffer>>) obj2, this.zzex);
            }
        }));
    }

    @Override // com.google.android.gms.games.AchievementsClient
    public final void reveal(final String str) {
        doWrite(zzbh.zzd(new RemoteCall(str) { // from class: com.google.android.gms.internal.games.zzg
            private final String zzew;

            {
                this.zzew = str;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((com.google.android.gms.games.internal.zzf) obj).zza((TaskCompletionSource<Void>) null, this.zzew);
            }
        }));
    }

    @Override // com.google.android.gms.games.AchievementsClient
    public final Task<Void> revealImmediate(final String str) {
        return doWrite(zzbh.zzd(new RemoteCall(str) { // from class: com.google.android.gms.internal.games.zzj
            private final String zzew;

            {
                this.zzew = str;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((com.google.android.gms.games.internal.zzf) obj).zza((TaskCompletionSource<Void>) obj2, this.zzew);
            }
        }));
    }

    @Override // com.google.android.gms.games.AchievementsClient
    public final void unlock(final String str) {
        doWrite(zzbh.zzd(new RemoteCall(str) { // from class: com.google.android.gms.internal.games.zzi
            private final String zzew;

            {
                this.zzew = str;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((com.google.android.gms.games.internal.zzf) obj).zzb((TaskCompletionSource<Void>) null, this.zzew);
            }
        }));
    }

    @Override // com.google.android.gms.games.AchievementsClient
    public final Task<Void> unlockImmediate(final String str) {
        return doWrite(zzbh.zzd(new RemoteCall(str) { // from class: com.google.android.gms.internal.games.zzl
            private final String zzew;

            {
                this.zzew = str;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((com.google.android.gms.games.internal.zzf) obj).zzb((TaskCompletionSource<Void>) obj2, this.zzew);
            }
        }));
    }

    @Override // com.google.android.gms.games.AchievementsClient
    public final void increment(final String str, final int i) {
        doWrite(zzbh.zzd(new RemoteCall(str, i) { // from class: com.google.android.gms.internal.games.zzk
            private final String zzew;
            private final int zzey;

            {
                this.zzew = str;
                this.zzey = i;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((com.google.android.gms.games.internal.zzf) obj).zza((TaskCompletionSource<Boolean>) null, this.zzew, this.zzey);
            }
        }));
    }

    @Override // com.google.android.gms.games.AchievementsClient
    public final Task<Boolean> incrementImmediate(final String str, final int i) {
        return doWrite(zzbh.zzd(new RemoteCall(str, i) { // from class: com.google.android.gms.internal.games.zzn
            private final String zzew;
            private final int zzey;

            {
                this.zzew = str;
                this.zzey = i;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((com.google.android.gms.games.internal.zzf) obj).zza((TaskCompletionSource<Boolean>) obj2, this.zzew, this.zzey);
            }
        }));
    }

    @Override // com.google.android.gms.games.AchievementsClient
    public final void setSteps(final String str, final int i) {
        doWrite(zzbh.zzd(new RemoteCall(str, i) { // from class: com.google.android.gms.internal.games.zzm
            private final String zzew;
            private final int zzey;

            {
                this.zzew = str;
                this.zzey = i;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((com.google.android.gms.games.internal.zzf) obj).zzb((TaskCompletionSource<Boolean>) null, this.zzew, this.zzey);
            }
        }));
    }

    @Override // com.google.android.gms.games.AchievementsClient
    public final Task<Boolean> setStepsImmediate(final String str, final int i) {
        return doWrite(zzbh.zzd(new RemoteCall(str, i) { // from class: com.google.android.gms.internal.games.zzp
            private final String zzew;
            private final int zzey;

            {
                this.zzew = str;
                this.zzey = i;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((com.google.android.gms.games.internal.zzf) obj).zzb((TaskCompletionSource<Boolean>) obj2, this.zzew, this.zzey);
            }
        }));
    }
}
