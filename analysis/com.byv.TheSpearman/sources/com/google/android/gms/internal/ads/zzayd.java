package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager;
import android.os.Build;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.io.ByteArrayInputStream;
import java.lang.reflect.InvocationTargetException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzayd extends zzazd {
    private static final zzaze zzi = new zzaze();
    private final Context zzj;

    public zzayd(zzaxp zzaxpVar, String str, String str2, zzata zzataVar, int i, int i2, Context context, zzasr zzasrVar) {
        super(zzaxpVar, "iz9pI8M74OdFMOjBXhk6CVKK/c29GtinDT3TfbuphLdYOSnoV+Rg8WuW9whaa7rD", "AMztxBQmasdCMrU1nlH2RhtlfSPsjcYFxTHFmKvCDYM=", zzataVar, i, 27);
        this.zzj = context;
    }

    private final String zzc() throws ExecutionException, InterruptedException {
        try {
            if (this.zzb.zzl() != null) {
                this.zzb.zzl().get();
            }
            zzaud zzaudVarZzc = this.zzb.zzc();
            if (zzaudVarZzc == null || !zzaudVarZzc.zzar()) {
                return null;
            }
            return zzaudVarZzc.zzi();
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzazd
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        zzasw zzaswVar;
        zzava zzavaVar;
        AtomicReference atomicReferenceZza = zzi.zza(this.zzj.getPackageName());
        synchronized (atomicReferenceZza) {
            zzava zzavaVar2 = (zzava) atomicReferenceZza.get();
            if (zzavaVar2 == null || zzaxs.zzd(zzavaVar2.zza) || zzavaVar2.zza.equals("E") || zzavaVar2.zza.equals("0000000000000000000000000000000000000000000000000000000000000000")) {
                if (zzaxs.zzd(null)) {
                    (!zzaxs.zzd(null) ? false : false).booleanValue();
                    zzaswVar = zzasw.ENUM_SIGNAL_SOURCE_ADSHIELD;
                } else {
                    zzaswVar = zzasw.ENUM_SIGNAL_SOURCE_CALLER_PROVIDED;
                }
                Boolean boolValueOf = Boolean.valueOf(zzaswVar == zzasw.ENUM_SIGNAL_SOURCE_ADSHIELD);
                Boolean bool = (Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzcp);
                String strZzb = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzco)).booleanValue() ? zzb() : null;
                if (bool.booleanValue() && this.zzb.zzp() && zzaxs.zzd(strZzb)) {
                    strZzb = zzc();
                }
                zzava zzavaVar3 = new zzava((String) this.zzf.invoke(null, this.zzj, boolValueOf, strZzb));
                if (zzaxs.zzd(zzavaVar3.zza) || zzavaVar3.zza.equals("E")) {
                    int iOrdinal = zzaswVar.ordinal();
                    if (iOrdinal == 3) {
                        String strZzc = zzc();
                        if (!zzaxs.zzd(strZzc)) {
                            zzavaVar3.zza = strZzc;
                        }
                    } else if (iOrdinal == 4) {
                        throw null;
                    }
                }
                atomicReferenceZza.set(zzavaVar3);
            }
            zzavaVar = (zzava) atomicReferenceZza.get();
        }
        synchronized (this.zze) {
            if (zzavaVar != null) {
                this.zze.zzz(zzavaVar.zza);
                this.zze.zzae(zzavaVar.zzb);
                this.zze.zzag(zzavaVar.zzc);
                this.zze.zzj(zzavaVar.zzd);
                this.zze.zzy(zzavaVar.zze);
            }
        }
    }

    protected final String zzb() throws PackageManager.NameNotFoundException, CertificateException {
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance(AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509);
            byte[] bArrZzf = zzaxs.zzf((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzcq));
            ArrayList arrayList = new ArrayList();
            arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(bArrZzf)));
            if (!Build.TYPE.equals("user")) {
                arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(zzaxs.zzf((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzcr)))));
            }
            Context context = this.zzj;
            String packageName = context.getPackageName();
            this.zzb.zzk();
            if (Build.VERSION.SDK_INT <= 30 && !Build.VERSION.CODENAME.equals("S")) {
                return null;
            }
            final zzgex zzgexVarZze = zzgex.zze();
            context.getPackageManager().requestChecksums(packageName, false, 8, arrayList, new PackageManager.OnChecksumsReadyListener() { // from class: com.google.android.gms.internal.ads.zzazf
                @Override // android.content.pm.PackageManager.OnChecksumsReadyListener
                public final void onChecksumsReady(List list) {
                    zzgex zzgexVar = zzgexVarZze;
                    if (list == null) {
                        zzgexVar.zzc(null);
                        return;
                    }
                    try {
                        int size = list.size();
                        for (int i = 0; i < size; i++) {
                            ApkChecksum apkChecksum = (ApkChecksum) list.get(i);
                            if (apkChecksum.getType() == 8) {
                                zzgexVar.zzc(zzaxs.zzb(apkChecksum.getValue()));
                                return;
                            }
                        }
                        zzgexVar.zzc(null);
                    } catch (Throwable unused) {
                        zzgexVar.zzc(null);
                    }
                }
            });
            return (String) zzgexVarZze.get();
        } catch (PackageManager.NameNotFoundException | InterruptedException | NoClassDefFoundError | CertificateEncodingException | CertificateException | ExecutionException unused) {
            return null;
        }
    }
}
