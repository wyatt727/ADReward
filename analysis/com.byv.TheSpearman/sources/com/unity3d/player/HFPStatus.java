package com.unity3d.player;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;

/* loaded from: classes4.dex */
public class HFPStatus {

    /* renamed from: a, reason: collision with root package name */
    private Context f4336a;
    private AudioManager d;
    private BroadcastReceiver b = null;
    private boolean c = false;
    private boolean e = false;
    private a f = a.f4338a;

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f4338a = new a("DISCONNECTED", 0);
        public static final a b = new a("CONNECTED", 1);

        private a(String str, int i) {
        }
    }

    public HFPStatus(Context context) {
        this.d = null;
        this.f4336a = context;
        this.d = (AudioManager) context.getSystemService("audio");
        initHFPStatusJni();
    }

    private final native void deinitHFPStatusJni();

    private final native void initHFPStatusJni();

    public void a() {
        clearHFPStat();
        deinitHFPStatusJni();
    }

    protected void clearHFPStat() {
        BroadcastReceiver broadcastReceiver = this.b;
        if (broadcastReceiver != null) {
            this.f4336a.unregisterReceiver(broadcastReceiver);
            this.b = null;
        }
        this.f = a.f4338a;
        if (this.e) {
            this.e = false;
            this.d.stopBluetoothSco();
        }
    }

    protected boolean getHFPStat() {
        return this.f == a.b;
    }

    protected void requestHFPStat() {
        clearHFPStat();
        BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.unity3d.player.HFPStatus.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                if (intent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", -1) != 1) {
                    return;
                }
                HFPStatus hFPStatus = HFPStatus.this;
                hFPStatus.f = a.b;
                if (hFPStatus.e) {
                    hFPStatus.e = false;
                    hFPStatus.d.stopBluetoothSco();
                }
                HFPStatus hFPStatus2 = HFPStatus.this;
                if (hFPStatus2.c) {
                    hFPStatus2.d.setMode(3);
                }
            }
        };
        this.b = broadcastReceiver;
        this.f4336a.registerReceiver(broadcastReceiver, new IntentFilter("android.media.ACTION_SCO_AUDIO_STATE_UPDATED"));
        try {
            this.e = true;
            this.d.startBluetoothSco();
        } catch (NullPointerException unused) {
            AbstractC1536u.Log(5, "startBluetoothSco() failed. no bluetooth device connected.");
        }
    }

    protected void setHFPRecordingStat(boolean z) {
        this.c = z;
        if (z) {
            return;
        }
        this.d.setMode(0);
    }
}
