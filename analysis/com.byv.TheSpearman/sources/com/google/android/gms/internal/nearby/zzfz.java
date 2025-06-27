package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* loaded from: classes3.dex */
public final class zzfz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfz> CREATOR = new zzfy();
    private byte[] zza;
    private ParcelFileDescriptor zzb;

    private zzfz() {
        this.zza = new byte[0];
    }

    static byte[] zzb(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor));
        try {
            try {
                byte[] bArr = new byte[dataInputStream.readInt()];
                dataInputStream.read(bArr);
                return bArr;
            } catch (IOException e) {
                throw new IllegalStateException("Could not read from parcel file descriptor", e);
            }
        } finally {
            zze(dataInputStream);
        }
    }

    private static void zze(Closeable closeable) throws IOException {
        try {
            closeable.close();
        } catch (IOException e) {
            Log.w("ParcelByteArray", "Could not close stream", e);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzfz) {
            return Arrays.equals(this.zza, ((zzfz) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zza);
    }

    /* JADX WARN: Not initialized variable reg: 5, insn: 0x00ce: MOVE (r2 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]), block:B:40:0x00ce */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) throws Throwable {
        Closeable closeable;
        DataOutputStream dataOutputStream;
        ParcelFileDescriptor parcelFileDescriptor;
        File fileZzc;
        byte[] bArr = this.zza;
        Closeable closeable2 = null;
        if (bArr != null) {
            try {
                if (this.zzb == null) {
                    try {
                        try {
                            fileZzc = zzgf.zzc();
                        } catch (IOException e) {
                            e = e;
                            dataOutputStream = null;
                        }
                    } catch (IllegalStateException e2) {
                        e = e2;
                        dataOutputStream = null;
                    } catch (Throwable th) {
                        th = th;
                        if (closeable2 != null) {
                            zze(closeable2);
                        }
                        throw th;
                    }
                    if (fileZzc == null) {
                        throw new IllegalStateException("Must set temp dir before writing this object to a parcel");
                    }
                    try {
                        File fileCreateTempFile = File.createTempFile("teleporter" + SystemClock.elapsedRealtime(), ".tmp", fileZzc);
                        try {
                            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
                            ParcelFileDescriptor parcelFileDescriptorOpen = ParcelFileDescriptor.open(fileCreateTempFile, 268435456);
                            fileCreateTempFile.delete();
                            Pair pairCreate = Pair.create(fileOutputStream, parcelFileDescriptorOpen);
                            dataOutputStream = new DataOutputStream(new BufferedOutputStream((OutputStream) pairCreate.first));
                            try {
                                dataOutputStream.writeInt(bArr.length);
                                dataOutputStream.write(bArr);
                                parcelFileDescriptor = (ParcelFileDescriptor) pairCreate.second;
                                zze(dataOutputStream);
                            } catch (IOException e3) {
                                e = e3;
                                String strValueOf = String.valueOf(e);
                                StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 36);
                                sb.append("Could not write into unlinked file. ");
                                sb.append(strValueOf);
                                Log.e("ParcelByteArray", sb.toString());
                                if (dataOutputStream != null) {
                                    zze(dataOutputStream);
                                }
                                parcelFileDescriptor = null;
                                this.zzb = parcelFileDescriptor;
                                int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
                                SafeParcelWriter.writeParcelable(parcel, 1, this.zzb, i | 1, false);
                                SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
                                this.zzb = null;
                            } catch (IllegalStateException e4) {
                                e = e4;
                                String strValueOf2 = String.valueOf(e);
                                StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf2).length() + 32);
                                sb2.append("Could not create unlinked file. ");
                                sb2.append(strValueOf2);
                                Log.e("ParcelByteArray", sb2.toString());
                                if (dataOutputStream != null) {
                                    zze(dataOutputStream);
                                }
                                parcelFileDescriptor = null;
                                this.zzb = parcelFileDescriptor;
                                int iBeginObjectHeader2 = SafeParcelWriter.beginObjectHeader(parcel);
                                SafeParcelWriter.writeParcelable(parcel, 1, this.zzb, i | 1, false);
                                SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader2);
                                this.zzb = null;
                            }
                            this.zzb = parcelFileDescriptor;
                        } catch (FileNotFoundException e5) {
                            throw new IllegalStateException("Temporary file is somehow already deleted", e5);
                        }
                    } catch (IOException e6) {
                        throw new IllegalStateException("Could not create temporary file", e6);
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                closeable2 = closeable;
            }
        }
        int iBeginObjectHeader22 = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.zzb, i | 1, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader22);
        this.zzb = null;
    }

    public final byte[] zza() {
        return this.zza;
    }

    zzfz(ParcelFileDescriptor parcelFileDescriptor) {
        this.zza = new byte[0];
        this.zzb = parcelFileDescriptor;
    }
}
