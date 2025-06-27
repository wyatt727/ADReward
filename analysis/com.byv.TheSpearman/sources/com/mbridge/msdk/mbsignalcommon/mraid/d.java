package com.mbridge.msdk.mbsignalcommon.mraid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.lang.ref.WeakReference;

/* compiled from: MraidVolumeChangeReceiver.java */
/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static double f3180a = -1.0d;
    private Context b;
    private AudioManager c;
    private boolean d = false;
    private b e;
    private a f;

    /* compiled from: MraidVolumeChangeReceiver.java */
    public interface b {
        void a(double d);
    }

    public d(Context context) {
        this.b = context;
        this.c = (AudioManager) context.getApplicationContext().getSystemService("audio");
    }

    public final double a() {
        AudioManager audioManager = this.c;
        double streamVolume = ((this.c != null ? r3.getStreamVolume(3) : -1) * 100.0d) / (audioManager != null ? audioManager.getStreamMaxVolume(3) : -1);
        f3180a = streamVolume;
        return streamVolume;
    }

    public final b b() {
        return this.e;
    }

    public final void a(b bVar) {
        this.e = bVar;
    }

    public final void c() {
        if (this.b != null) {
            this.f = new a(this);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
            this.b.registerReceiver(this.f, intentFilter);
            this.d = true;
        }
    }

    public final void d() {
        Context context;
        if (!this.d || (context = this.b) == null) {
            return;
        }
        try {
            context.unregisterReceiver(this.f);
            this.e = null;
            this.d = false;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* compiled from: MraidVolumeChangeReceiver.java */
    private static class a extends BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        private WeakReference<d> f3181a;

        public a(d dVar) {
            this.f3181a = new WeakReference<>(dVar);
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            d dVar;
            b bVarB;
            if (!"android.media.VOLUME_CHANGED_ACTION".equals(intent.getAction()) || intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1) != 3 || (dVar = this.f3181a.get()) == null || (bVarB = dVar.b()) == null) {
                return;
            }
            double dA = dVar.a();
            if (dA >= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                bVarB.a(dA);
            }
        }
    }
}
