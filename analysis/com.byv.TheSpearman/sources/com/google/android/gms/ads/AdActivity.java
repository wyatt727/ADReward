package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbup;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes2.dex */
public final class AdActivity extends Activity {
    public static final String CLASS_NAME = "com.google.android.gms.ads.AdActivity";
    private zzbup zza;

    private final void zza() {
        zzbup zzbupVar = this.zza;
        if (zzbupVar != null) {
            try {
                zzbupVar.zzx();
            } catch (RemoteException e) {
                zzm.zzl("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // android.app.Activity
    protected final void onActivityResult(int i, int i2, Intent intent) {
        try {
            zzbup zzbupVar = this.zza;
            if (zzbupVar != null) {
                zzbupVar.zzh(i, i2, intent);
            }
        } catch (Exception e) {
            zzm.zzl("#007 Could not call remote method.", e);
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        try {
            zzbup zzbupVar = this.zza;
            if (zzbupVar != null) {
                if (!zzbupVar.zzH()) {
                    return;
                }
            }
        } catch (RemoteException e) {
            zzm.zzl("#007 Could not call remote method.", e);
        }
        super.onBackPressed();
        try {
            zzbup zzbupVar2 = this.zza;
            if (zzbupVar2 != null) {
                zzbupVar2.zzi();
            }
        } catch (RemoteException e2) {
            zzm.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            zzbup zzbupVar = this.zza;
            if (zzbupVar != null) {
                zzbupVar.zzk(ObjectWrapper.wrap(configuration));
            }
        } catch (RemoteException e) {
            zzm.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        zzbup zzbupVarZzo = zzay.zza().zzo(this);
        this.zza = zzbupVarZzo;
        if (zzbupVarZzo == null) {
            zzm.zzl("#007 Could not call remote method.", null);
            finish();
            return;
        }
        try {
            zzbupVarZzo.zzl(bundle);
        } catch (RemoteException e) {
            zzm.zzl("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onDestroy() {
        try {
            zzbup zzbupVar = this.zza;
            if (zzbupVar != null) {
                zzbupVar.zzm();
            }
        } catch (RemoteException e) {
            zzm.zzl("#007 Could not call remote method.", e);
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    protected final void onPause() {
        try {
            zzbup zzbupVar = this.zza;
            if (zzbupVar != null) {
                zzbupVar.zzo();
            }
        } catch (RemoteException e) {
            zzm.zzl("#007 Could not call remote method.", e);
            finish();
        }
        super.onPause();
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        try {
            zzbup zzbupVar = this.zza;
            if (zzbupVar != null) {
                zzbupVar.zzp(i, strArr, iArr);
            }
        } catch (RemoteException e) {
            zzm.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // android.app.Activity
    protected final void onRestart() {
        super.onRestart();
        try {
            zzbup zzbupVar = this.zza;
            if (zzbupVar != null) {
                zzbupVar.zzq();
            }
        } catch (RemoteException e) {
            zzm.zzl("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onResume() {
        super.onResume();
        try {
            zzbup zzbupVar = this.zza;
            if (zzbupVar != null) {
                zzbupVar.zzr();
            }
        } catch (RemoteException e) {
            zzm.zzl("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        try {
            zzbup zzbupVar = this.zza;
            if (zzbupVar != null) {
                zzbupVar.zzs(bundle);
            }
        } catch (RemoteException e) {
            zzm.zzl("#007 Could not call remote method.", e);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    protected final void onStart() {
        super.onStart();
        try {
            zzbup zzbupVar = this.zza;
            if (zzbupVar != null) {
                zzbupVar.zzt();
            }
        } catch (RemoteException e) {
            zzm.zzl("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onStop() {
        try {
            zzbup zzbupVar = this.zza;
            if (zzbupVar != null) {
                zzbupVar.zzu();
            }
        } catch (RemoteException e) {
            zzm.zzl("#007 Could not call remote method.", e);
            finish();
        }
        super.onStop();
    }

    @Override // android.app.Activity
    protected final void onUserLeaveHint() {
        super.onUserLeaveHint();
        try {
            zzbup zzbupVar = this.zza;
            if (zzbupVar != null) {
                zzbupVar.zzv();
            }
        } catch (RemoteException e) {
            zzm.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i) {
        super.setContentView(i);
        zza();
    }

    @Override // android.app.Activity
    public final void setContentView(View view) {
        super.setContentView(view);
        zza();
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        zza();
    }
}
