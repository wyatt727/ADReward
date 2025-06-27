package com.google.android.gms.internal.nearby;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.nfc.NfcAdapter;
import android.nfc.Tag;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.core.content.ContextCompat;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* loaded from: classes3.dex */
public final class zzet {
    private static final WeakHashMap<Activity, zzet> zza = new WeakHashMap<>();
    private final Context zzb;
    private final WeakReference<Activity> zzc;
    private final NfcAdapter zzd;
    private boolean zze = true;
    private boolean zzf;
    private boolean zzg;

    private zzet(Activity activity) {
        Context applicationContext = activity.getApplicationContext();
        this.zzb = applicationContext;
        WeakReference<Activity> weakReference = new WeakReference<>(activity);
        this.zzc = weakReference;
        this.zzd = NfcAdapter.getDefaultAdapter(applicationContext);
        activity.getApplication().registerActivityLifecycleCallbacks(new zzes(this, weakReference));
        Log.d("NearbyConnections", "NfcDispatcher created.");
    }

    public static synchronized zzet zza(Activity activity) {
        WeakHashMap<Activity, zzet> weakHashMap;
        weakHashMap = zza;
        if (!weakHashMap.containsKey(activity)) {
            weakHashMap.put(activity, new zzet(activity));
        }
        return weakHashMap.get(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzg() {
        NfcAdapter nfcAdapter;
        Log.d("NearbyConnections", "Invalidating dispatch state.");
        if (!this.zze || !this.zzf) {
            Log.d("NearbyConnections", "Stopping NFC dispatching.");
            if (!this.zzg) {
                Log.d("NearbyConnections", "Can't stop NFC dispatching. Not dispatching.");
                return;
            }
            Activity activity = this.zzc.get();
            if (activity != null) {
                this.zzd.disableReaderMode(activity);
            }
            this.zzg = false;
            Log.d("NearbyConnections", "No longer dispatching NFC events");
            return;
        }
        Log.d("NearbyConnections", "Starting NFC dispatching.");
        if (this.zzg) {
            Log.d("NearbyConnections", "Can't start NFC dispatching. Already dispatching.");
            return;
        }
        if (Build.VERSION.SDK_INT < 19 || !this.zzb.getPackageManager().hasSystemFeature("android.hardware.nfc") || ContextCompat.checkSelfPermission(this.zzb, "android.permission.NFC") != 0 || (nfcAdapter = this.zzd) == null || !nfcAdapter.isEnabled()) {
            Log.d("NearbyConnections", "Cannot dispatch NFC events. NFC is not supported.");
            return;
        }
        Activity activity2 = this.zzc.get();
        if (activity2 == null) {
            Log.d("NearbyConnections", "Cannot dispatch NFC events. Activity is gone.");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("presence", 100);
        this.zzd.enableReaderMode(activity2, new NfcAdapter.ReaderCallback(this) { // from class: com.google.android.gms.internal.nearby.zzer
            private final zzet zza;

            {
                this.zza = this;
            }

            @Override // android.nfc.NfcAdapter.ReaderCallback
            public final void onTagDiscovered(Tag tag) {
                this.zza.zzf(tag);
            }
        }, 385, bundle);
        this.zzg = true;
        Log.d("NearbyConnections", "Dispatching NFC events");
    }

    public final void zzb() {
        this.zzf = true;
        Log.d("NearbyConnections", "NFC discovery started.");
        zzg();
    }

    public final void zzc() {
        this.zzf = false;
        Log.d("NearbyConnections", "NFC discovery stopped.");
        zzg();
    }

    final /* bridge */ /* synthetic */ void zzf(Tag tag) {
        Intent intent = new Intent("android.nfc.action.TAG_DISCOVERED");
        intent.setPackage("com.google.android.gms");
        intent.putExtra("android.nfc.extra.TAG", tag);
        this.zzb.sendBroadcast(intent);
        Log.d("NearbyConnections", "Dispatching discovered NFC tag");
    }
}
