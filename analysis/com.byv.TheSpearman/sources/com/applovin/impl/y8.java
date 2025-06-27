package com.applovin.impl;

import android.support.v4.media.session.PlaybackStateCompat;
import com.applovin.impl.d9;
import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.audio.DtsUtil;
import com.google.android.exoplayer2.audio.OpusUtil;
import com.json.t2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class y8 {

    /* renamed from: a, reason: collision with root package name */
    public final int f1196a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final long j;
    public final a k;
    private final we l;

    private static int a(int i) {
        if (i == 8) {
            return 1;
        }
        if (i == 12) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i != 20) {
            return i != 24 ? -1 : 6;
        }
        return 5;
    }

    private static int b(int i) {
        switch (i) {
            case 8000:
                return 4;
            case AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND /* 16000 */:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case OpusUtil.SAMPLE_RATE /* 48000 */:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND /* 192000 */:
                return 3;
            default:
                return -1;
        }
    }

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final long[] f1197a;
        public final long[] b;

        public a(long[] jArr, long[] jArr2) {
            this.f1197a = jArr;
            this.b = jArr2;
        }
    }

    private y8(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, a aVar, we weVar) {
        this.f1196a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = b(i5);
        this.g = i6;
        this.h = i7;
        this.i = a(i7);
        this.j = j;
        this.k = aVar;
        this.l = weVar;
    }

    public y8 b(List list) {
        return new y8(this.f1196a, this.b, this.c, this.d, this.e, this.g, this.h, this.j, this.k, a(a(list, Collections.emptyList())));
    }

    public y8(byte[] bArr, int i) {
        xg xgVar = new xg(bArr);
        xgVar.c(i * 8);
        this.f1196a = xgVar.a(16);
        this.b = xgVar.a(16);
        this.c = xgVar.a(24);
        this.d = xgVar.a(24);
        int iA = xgVar.a(20);
        this.e = iA;
        this.f = b(iA);
        this.g = xgVar.a(3) + 1;
        int iA2 = xgVar.a(5) + 1;
        this.h = iA2;
        this.i = a(iA2);
        this.j = xgVar.b(36);
        this.k = null;
        this.l = null;
    }

    private static we a(List list, List list2) {
        if (list.isEmpty() && list2.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            String[] strArrB = yp.b(str, t2.i.b);
            if (strArrB.length != 2) {
                kc.d("FlacStreamMetadata", "Failed to parse Vorbis comment: " + str);
            } else {
                arrayList.add(new er(strArrB[0], strArrB[1]));
            }
        }
        arrayList.addAll(list2);
        if (arrayList.isEmpty()) {
            return null;
        }
        return new we(arrayList);
    }

    public long b() {
        long j = this.j;
        if (j == 0) {
            return -9223372036854775807L;
        }
        return (j * 1000000) / this.e;
    }

    public y8 a(List list) {
        return new y8(this.f1196a, this.b, this.c, this.d, this.e, this.g, this.h, this.j, this.k, a(a(Collections.emptyList(), list)));
    }

    public long a() {
        long j;
        long j2;
        int i = this.d;
        if (i > 0) {
            j = (i + this.c) / 2;
            j2 = 1;
        } else {
            int i2 = this.f1196a;
            j = ((((i2 != this.b || i2 <= 0) ? PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM : i2) * this.g) * this.h) / 8;
            j2 = 64;
        }
        return j + j2;
    }

    public d9 a(byte[] bArr, we weVar) {
        bArr[4] = Byte.MIN_VALUE;
        int i = this.d;
        if (i <= 0) {
            i = -1;
        }
        return new d9.b().f("audio/flac").i(i).c(this.g).n(this.e).a(Collections.singletonList(bArr)).a(a(weVar)).a();
    }

    public we a(we weVar) {
        we weVar2 = this.l;
        return weVar2 == null ? weVar : weVar2.a(weVar);
    }

    public long a(long j) {
        return yp.b((j * this.e) / 1000000, 0L, this.j - 1);
    }

    public y8 a(a aVar) {
        return new y8(this.f1196a, this.b, this.c, this.d, this.e, this.g, this.h, this.j, aVar, this.l);
    }
}
