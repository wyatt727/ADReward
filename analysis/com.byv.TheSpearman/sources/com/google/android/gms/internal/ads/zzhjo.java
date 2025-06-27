package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzhjo extends CustomTabsServiceConnection {
    private final WeakReference zza;

    public zzhjo(zzbew zzbewVar) {
        this.zza = new WeakReference(zzbewVar);
    }

    @Override // androidx.browser.customtabs.CustomTabsServiceConnection
    public final void onCustomTabsServiceConnected(ComponentName componentName, CustomTabsClient customTabsClient) {
        zzbew zzbewVar = (zzbew) this.zza.get();
        if (zzbewVar != null) {
            zzbewVar.zzc(customTabsClient);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzbew zzbewVar = (zzbew) this.zza.get();
        if (zzbewVar != null) {
            zzbewVar.zzd();
        }
    }
}
