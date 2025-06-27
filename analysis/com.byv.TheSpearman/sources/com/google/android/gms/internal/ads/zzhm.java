package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzhm extends zzgp {
    private RandomAccessFile zza;
    private Uri zzb;
    private long zzc;
    private boolean zzd;

    public zzhm() {
        super(false);
    }

    @Override // com.google.android.gms.internal.ads.zzu
    public final int zza(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        if (this.zzc == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.zza;
            int i3 = zzfx.zza;
            int i4 = randomAccessFile.read(bArr, i, (int) Math.min(this.zzc, i2));
            if (i4 > 0) {
                this.zzc -= i4;
                zzg(i4);
            }
            return i4;
        } catch (IOException e) {
            throw new zzhl(e, 2000);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgv
    public final long zzb(zzhb zzhbVar) throws IOException {
        Uri uri = zzhbVar.zza;
        this.zzb = uri;
        zzi(zzhbVar);
        try {
            String path = uri.getPath();
            Objects.requireNonNull(path);
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.zza = randomAccessFile;
            try {
                randomAccessFile.seek(zzhbVar.zze);
                long length = zzhbVar.zzf;
                if (length == -1) {
                    length = this.zza.length() - zzhbVar.zze;
                }
                this.zzc = length;
                if (length < 0) {
                    throw new zzhl(null, null, 2008);
                }
                this.zzd = true;
                zzj(zzhbVar);
                return this.zzc;
            } catch (IOException e) {
                throw new zzhl(e, 2000);
            }
        } catch (FileNotFoundException e2) {
            if (!TextUtils.isEmpty(uri.getQuery()) || !TextUtils.isEmpty(uri.getFragment())) {
                throw new zzhl(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e2, 1004);
            }
            int i = zzfx.zza;
            throw new zzhl(e2, true != zzhk.zzb(e2.getCause()) ? 2005 : 2006);
        } catch (SecurityException e3) {
            throw new zzhl(e3, 2006);
        } catch (RuntimeException e4) {
            throw new zzhl(e4, 2000);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgv
    public final Uri zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgv
    public final void zzd() throws zzhl {
        this.zzb = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.zza;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.zza = null;
                if (this.zzd) {
                    this.zzd = false;
                    zzh();
                }
            } catch (IOException e) {
                throw new zzhl(e, 2000);
            }
        } catch (Throwable th) {
            this.zza = null;
            if (this.zzd) {
                this.zzd = false;
                zzh();
            }
            throw th;
        }
    }
}
