package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzhw extends zzgp {
    private final Context zza;
    private zzhb zzb;
    private AssetFileDescriptor zzc;
    private InputStream zzd;
    private long zze;
    private boolean zzf;

    public zzhw(Context context) {
        super(false);
        this.zza = context.getApplicationContext();
    }

    @Deprecated
    public static Uri buildRawResourceUri(int i) {
        return Uri.parse("rawresource:///" + i);
    }

    private static int zzk(String str) throws zzhv {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            throw new zzhv("Resource identifier must be an integer.", null, 1004);
        }
    }

    private static AssetFileDescriptor zzl(Context context, zzhb zzhbVar) throws zzhv, Resources.NotFoundException, PackageManager.NameNotFoundException {
        Resources resourcesForApplication;
        int identifier;
        Uri uriNormalizeScheme = zzhbVar.zza.normalizeScheme();
        if (TextUtils.equals("rawresource", uriNormalizeScheme.getScheme())) {
            resourcesForApplication = context.getResources();
            List<String> pathSegments = uriNormalizeScheme.getPathSegments();
            if (pathSegments.size() != 1) {
                throw new zzhv("rawresource:// URI must have exactly one path element, found " + pathSegments.size());
            }
            identifier = zzk(pathSegments.get(0));
        } else {
            if (!TextUtils.equals("android.resource", uriNormalizeScheme.getScheme())) {
                throw new zzhv("Unsupported URI scheme (" + uriNormalizeScheme.getScheme() + "). Only android.resource is supported.", null, 1004);
            }
            String path = uriNormalizeScheme.getPath();
            Objects.requireNonNull(path);
            if (path.startsWith("/")) {
                path = path.substring(1);
            }
            String packageName = TextUtils.isEmpty(uriNormalizeScheme.getHost()) ? context.getPackageName() : uriNormalizeScheme.getHost();
            if (packageName.equals(context.getPackageName())) {
                resourcesForApplication = context.getResources();
            } else {
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication(packageName);
                } catch (PackageManager.NameNotFoundException e) {
                    throw new zzhv("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e, 2005);
                }
            }
            if (path.matches("\\d+")) {
                identifier = zzk(path);
            } else {
                identifier = resourcesForApplication.getIdentifier(packageName + ":" + path, "raw", null);
                if (identifier == 0) {
                    throw new zzhv("Resource not found.", null, 2005);
                }
            }
        }
        try {
            AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = resourcesForApplication.openRawResourceFd(identifier);
            if (assetFileDescriptorOpenRawResourceFd != null) {
                return assetFileDescriptorOpenRawResourceFd;
            }
            throw new zzhv("Resource is compressed: ".concat(String.valueOf(String.valueOf(uriNormalizeScheme))), null, 2000);
        } catch (Resources.NotFoundException e2) {
            throw new zzhv(null, e2, 2005);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzu
    public final int zza(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.zze;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new zzhv(null, e, 2000);
            }
        }
        InputStream inputStream = this.zzd;
        int i3 = zzfx.zza;
        int i4 = inputStream.read(bArr, i, i2);
        if (i4 == -1) {
            if (this.zze == -1) {
                return -1;
            }
            throw new zzhv("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
        long j2 = this.zze;
        if (j2 != -1) {
            this.zze = j2 - i4;
        }
        zzg(i4);
        return i4;
    }

    @Override // com.google.android.gms.internal.ads.zzgv
    public final long zzb(zzhb zzhbVar) throws zzgw, Resources.NotFoundException, PackageManager.NameNotFoundException {
        long size;
        this.zzb = zzhbVar;
        zzi(zzhbVar);
        AssetFileDescriptor assetFileDescriptorZzl = zzl(this.zza, zzhbVar);
        this.zzc = assetFileDescriptorZzl;
        long length = assetFileDescriptorZzl.getLength();
        FileInputStream fileInputStream = new FileInputStream(this.zzc.getFileDescriptor());
        this.zzd = fileInputStream;
        if (length != -1) {
            try {
                if (zzhbVar.zze > length) {
                    throw new zzhv(null, null, 2008);
                }
            } catch (zzhv e) {
                throw e;
            } catch (IOException e2) {
                throw new zzhv(null, e2, 2000);
            }
        }
        long startOffset = this.zzc.getStartOffset();
        long jSkip = fileInputStream.skip(zzhbVar.zze + startOffset) - startOffset;
        if (jSkip != zzhbVar.zze) {
            throw new zzhv(null, null, 2008);
        }
        if (length == -1) {
            FileChannel channel = fileInputStream.getChannel();
            if (channel.size() == 0) {
                this.zze = -1L;
                size = -1;
            } else {
                size = channel.size() - channel.position();
                this.zze = size;
                if (size < 0) {
                    throw new zzhv(null, null, 2008);
                }
            }
        } else {
            size = length - jSkip;
            this.zze = size;
            if (size < 0) {
                throw new zzgw(2008);
            }
        }
        long jMin = zzhbVar.zzf;
        if (jMin != -1) {
            if (size != -1) {
                jMin = Math.min(size, jMin);
            }
            this.zze = jMin;
        }
        this.zzf = true;
        zzj(zzhbVar);
        long j = zzhbVar.zzf;
        return j != -1 ? j : this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzgv
    public final Uri zzc() {
        zzhb zzhbVar = this.zzb;
        if (zzhbVar != null) {
            return zzhbVar.zza;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzgv
    public final void zzd() throws zzhv {
        this.zzb = null;
        try {
            try {
                try {
                    InputStream inputStream = this.zzd;
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    this.zzd = null;
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.zzc;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                        this.zzc = null;
                        if (this.zzf) {
                            this.zzf = false;
                            zzh();
                        }
                    } catch (IOException e) {
                        throw new zzhv(null, e, 2000);
                    }
                } catch (IOException e2) {
                    throw new zzhv(null, e2, 2000);
                }
            } catch (Throwable th) {
                this.zzc = null;
                if (this.zzf) {
                    this.zzf = false;
                    zzh();
                }
                throw th;
            }
        } catch (Throwable th2) {
            this.zzd = null;
            try {
                AssetFileDescriptor assetFileDescriptor2 = this.zzc;
                if (assetFileDescriptor2 != null) {
                    assetFileDescriptor2.close();
                }
                this.zzc = null;
                if (this.zzf) {
                    this.zzf = false;
                    zzh();
                }
                throw th2;
            } catch (IOException e3) {
                throw new zzhv(null, e3, 2000);
            }
        }
    }
}
