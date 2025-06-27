package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.view.SurfaceHolder;
import android.view.TextureView;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzkk implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener, zzabv, zzqg, zzxn, zzug, zzio, zzik {
    public static final /* synthetic */ int zzb = 0;
    final /* synthetic */ zzko zza;

    /* synthetic */ zzkk(zzko zzkoVar, zzkj zzkjVar) {
        this.zza = zzkoVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        zzko.zzP(this.zza, surfaceTexture);
        this.zza.zzaf(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.zza.zzai(null);
        this.zza.zzaf(0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.zza.zzaf(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.zza.zzaf(i2, i3);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.zza.zzaf(0, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzqg
    public final void zza(Exception exc) {
        this.zza.zzr.zzv(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzqg
    public final void zzb(String str, long j, long j2) {
        this.zza.zzr.zzw(str, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzqg
    public final void zzc(String str) {
        this.zza.zzr.zzx(str);
    }

    @Override // com.google.android.gms.internal.ads.zzqg
    public final void zzd(zzir zzirVar) {
        this.zza.zzr.zzy(zzirVar);
        this.zza.zzL = null;
        this.zza.zzR = null;
    }

    @Override // com.google.android.gms.internal.ads.zzqg
    public final void zze(zzir zzirVar) {
        this.zza.zzR = zzirVar;
        this.zza.zzr.zzz(zzirVar);
    }

    @Override // com.google.android.gms.internal.ads.zzqg
    public final void zzf(zzam zzamVar, zzis zzisVar) {
        this.zza.zzL = zzamVar;
        this.zza.zzr.zzA(zzamVar, zzisVar);
    }

    @Override // com.google.android.gms.internal.ads.zzqg
    public final void zzg(long j) {
        this.zza.zzr.zzB(j);
    }

    @Override // com.google.android.gms.internal.ads.zzqg
    public final void zzh(Exception exc) {
        this.zza.zzr.zzC(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzqg
    public final void zzi(zzqh zzqhVar) {
        this.zza.zzr.zzD(zzqhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzqg
    public final void zzj(zzqh zzqhVar) {
        this.zza.zzr.zzE(zzqhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzqg
    public final void zzk(int i, long j, long j2) {
        this.zza.zzr.zzF(i, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final void zzl(int i, long j) {
        this.zza.zzr.zzG(i, j);
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final void zzm(Object obj, long j) {
        this.zza.zzr.zzH(obj, j);
        zzko zzkoVar = this.zza;
        if (zzkoVar.zzM == obj) {
            zzfb zzfbVar = zzkoVar.zzl;
            zzfbVar.zzd(26, new zzey() { // from class: com.google.android.gms.internal.ads.zzki
                @Override // com.google.android.gms.internal.ads.zzey
                public final void zza(Object obj2) {
                }
            });
            zzfbVar.zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqg
    public final void zzn(final boolean z) {
        zzko zzkoVar = this.zza;
        if (zzkoVar.zzV == z) {
            return;
        }
        zzkoVar.zzV = z;
        zzfb zzfbVar = this.zza.zzl;
        zzfbVar.zzd(23, new zzey() { // from class: com.google.android.gms.internal.ads.zzkg
            @Override // com.google.android.gms.internal.ads.zzey
            public final void zza(Object obj) {
                int i = zzkk.zzb;
                ((zzcl) obj).zzn(z);
            }
        });
        zzfbVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final void zzo(Exception exc) {
        this.zza.zzr.zzI(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final void zzp(String str, long j, long j2) {
        this.zza.zzr.zzJ(str, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final void zzq(String str) {
        this.zza.zzr.zzK(str);
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final void zzr(zzir zzirVar) {
        this.zza.zzr.zzL(zzirVar);
        this.zza.zzK = null;
        this.zza.zzQ = null;
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final void zzs(zzir zzirVar) {
        this.zza.zzQ = zzirVar;
        this.zza.zzr.zzM(zzirVar);
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final void zzt(long j, int i) {
        this.zza.zzr.zzN(j, i);
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final void zzu(zzam zzamVar, zzis zzisVar) {
        this.zza.zzK = zzamVar;
        this.zza.zzr.zzO(zzamVar, zzisVar);
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final void zzv(final zzdp zzdpVar) {
        this.zza.zzaa = zzdpVar;
        zzfb zzfbVar = this.zza.zzl;
        zzfbVar.zzd(25, new zzey() { // from class: com.google.android.gms.internal.ads.zzkh
            @Override // com.google.android.gms.internal.ads.zzey
            public final void zza(Object obj) {
                int i = zzkk.zzb;
                ((zzcl) obj).zzr(zzdpVar);
            }
        });
        zzfbVar.zzc();
    }
}
