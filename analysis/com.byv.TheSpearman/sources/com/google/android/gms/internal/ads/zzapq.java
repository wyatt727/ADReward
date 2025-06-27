package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzapq implements zzapp {
    private final FileChannel zza;
    private final long zzb;
    private final long zzc;

    public zzapq(FileChannel fileChannel, long j, long j2) {
        this.zza = fileChannel;
        this.zzb = j;
        this.zzc = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzapp
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzapp
    public final void zzb(MessageDigest[] messageDigestArr, long j, int i) throws IOException {
        MappedByteBuffer map = this.zza.map(FileChannel.MapMode.READ_ONLY, this.zzb + j, i);
        map.load();
        for (MessageDigest messageDigest : messageDigestArr) {
            map.position(0);
            messageDigest.update(map);
        }
    }
}
