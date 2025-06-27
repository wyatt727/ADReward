package com.applovin.impl;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.provider.Settings;
import com.applovin.impl.ab;
import com.google.android.exoplayer2.audio.OpusUtil;
import com.json.t2;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class m1 {
    public static final m1 c = new m1(new int[]{2}, 8);
    private static final m1 d = new m1(new int[]{2, 5, 6}, 8);
    private static final int[] e = {5, 6, 18, 17, 14, 7, 8};

    /* renamed from: a, reason: collision with root package name */
    private final int[] f637a;
    private final int b;

    private static final class a {
        public static int[] a() {
            ab.a aVarF = ab.f();
            for (int i : m1.e) {
                if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(i).setSampleRate(OpusUtil.SAMPLE_RATE).build(), new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build())) {
                    aVarF.b(Integer.valueOf(i));
                }
            }
            aVarF.b(2);
            return pb.a(aVarF.a());
        }
    }

    private static boolean b() {
        if (yp.f1214a >= 17) {
            String str = yp.c;
            if ("Amazon".equals(str) || "Xiaomi".equals(str)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.b + ", supportedEncodings=" + Arrays.toString(this.f637a) + t2.i.e;
    }

    public static m1 a(Context context) {
        return a(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")));
    }

    public m1(int[] iArr, int i) {
        if (iArr != null) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            this.f637a = iArrCopyOf;
            Arrays.sort(iArrCopyOf);
        } else {
            this.f637a = new int[0];
        }
        this.b = i;
    }

    public int c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m1)) {
            return false;
        }
        m1 m1Var = (m1) obj;
        return Arrays.equals(this.f637a, m1Var.f637a) && this.b == m1Var.b;
    }

    public int hashCode() {
        return this.b + (Arrays.hashCode(this.f637a) * 31);
    }

    public boolean a(int i) {
        return Arrays.binarySearch(this.f637a, i) >= 0;
    }

    static m1 a(Context context, Intent intent) {
        if (b() && Settings.Global.getInt(context.getContentResolver(), "external_surround_sound_enabled", 0) == 1) {
            return d;
        }
        if (yp.f1214a >= 29 && yp.d(context)) {
            return new m1(a.a(), 8);
        }
        if (intent != null && intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 0) {
            return new m1(intent.getIntArrayExtra("android.media.extra.ENCODINGS"), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 8));
        }
        return c;
    }
}
