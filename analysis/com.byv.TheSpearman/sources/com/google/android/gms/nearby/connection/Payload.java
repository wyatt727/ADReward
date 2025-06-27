package com.google.android.gms.nearby.connection;

import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.IOUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* loaded from: classes3.dex */
public class Payload {
    private final long zza;
    private final int zzb;
    private final byte[] zzc;
    private final File zzd;
    private final Stream zze;
    private long zzf;
    private boolean zzg;

    /* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
    public static class File {
        private final java.io.File zza;
        private final ParcelFileDescriptor zzb;
        private final long zzc;
        private final Uri zzd;

        private File(java.io.File file, ParcelFileDescriptor parcelFileDescriptor, long j, Uri uri) {
            this.zza = file;
            this.zzb = parcelFileDescriptor;
            this.zzc = j;
            this.zzd = uri;
        }

        public static File zza(java.io.File file, ParcelFileDescriptor parcelFileDescriptor, long j, Uri uri) {
            return new File((java.io.File) Preconditions.checkNotNull(file, "Cannot create Payload.File from null java.io.File."), (ParcelFileDescriptor) Preconditions.checkNotNull(parcelFileDescriptor, "Cannot create Payload.File from null ParcelFileDescriptor."), j, (Uri) Preconditions.checkNotNull(uri, "Cannot create Payload.File from null Uri"));
        }

        public static File zzb(ParcelFileDescriptor parcelFileDescriptor) {
            return new File(null, (ParcelFileDescriptor) Preconditions.checkNotNull(parcelFileDescriptor, "Cannot create Payload.File from null ParcelFileDescriptor."), parcelFileDescriptor.getStatSize(), null);
        }

        @Deprecated
        public java.io.File asJavaFile() {
            return this.zza;
        }

        public ParcelFileDescriptor asParcelFileDescriptor() {
            return this.zzb;
        }

        public Uri asUri() {
            return this.zzd;
        }

        @Deprecated
        public void close() throws IOException {
            IOUtils.closeQuietly(this.zzb);
        }

        public long getSize() {
            return this.zzc;
        }
    }

    /* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
    public static class Stream {
        private final ParcelFileDescriptor zza;
        private InputStream zzb;

        private Stream(ParcelFileDescriptor parcelFileDescriptor, InputStream inputStream) {
            this.zza = parcelFileDescriptor;
            this.zzb = inputStream;
        }

        public static Stream zza(InputStream inputStream) {
            Preconditions.checkNotNull(inputStream, "Cannot create Payload.Stream from null InputStream.");
            return new Stream(null, inputStream);
        }

        public static Stream zzb(ParcelFileDescriptor parcelFileDescriptor) {
            Preconditions.checkNotNull(parcelFileDescriptor, "Cannot create Payload.Stream from null ParcelFileDescriptor.");
            return new Stream(parcelFileDescriptor, null);
        }

        public InputStream asInputStream() {
            if (this.zzb == null) {
                this.zzb = new ParcelFileDescriptor.AutoCloseInputStream((ParcelFileDescriptor) Preconditions.checkNotNull(this.zza));
            }
            return this.zzb;
        }

        public ParcelFileDescriptor asParcelFileDescriptor() {
            return this.zza;
        }

        @Deprecated
        public void close() throws IOException {
            IOUtils.closeQuietly(this.zza);
            IOUtils.closeQuietly(this.zzb);
        }
    }

    /* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
    public @interface Type {
        public static final int BYTES = 1;
        public static final int FILE = 2;
        public static final int STREAM = 3;
    }

    private Payload(long j, int i, byte[] bArr, File file, Stream stream) {
        this.zza = j;
        this.zzb = i;
        this.zzc = bArr;
        this.zzd = file;
        this.zze = stream;
    }

    public static Payload fromBytes(byte[] bArr) {
        Preconditions.checkNotNull(bArr, "Cannot create a Payload from null bytes.");
        return zza(bArr, UUID.randomUUID().getLeastSignificantBits());
    }

    public static Payload fromFile(ParcelFileDescriptor parcelFileDescriptor) {
        return zzb(File.zzb(parcelFileDescriptor), UUID.randomUUID().getLeastSignificantBits());
    }

    public static Payload fromStream(ParcelFileDescriptor parcelFileDescriptor) {
        return zzc(Stream.zzb(parcelFileDescriptor), UUID.randomUUID().getLeastSignificantBits());
    }

    public static Payload zza(byte[] bArr, long j) {
        return new Payload(j, 1, bArr, null, null);
    }

    public static Payload zzb(File file, long j) {
        return new Payload(j, 2, null, file, null);
    }

    public static Payload zzc(Stream stream, long j) {
        return new Payload(j, 3, null, null, stream);
    }

    public byte[] asBytes() {
        return this.zzc;
    }

    public File asFile() {
        return this.zzd;
    }

    public Stream asStream() {
        return this.zze;
    }

    public void close() throws IOException {
        File file = this.zzd;
        if (file != null) {
            file.close();
        }
        Stream stream = this.zze;
        if (stream != null) {
            stream.close();
        }
    }

    public long getId() {
        return this.zza;
    }

    public long getOffset() {
        return this.zzf;
    }

    public int getType() {
        return this.zzb;
    }

    public void setSensitive(boolean z) {
        this.zzg = z;
    }

    public final boolean zzd() {
        return this.zzg;
    }

    public void setOffset(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("Payload offset must be positive or zero.");
        }
        if (getType() != 2 && getType() != 3) {
            throw new IllegalArgumentException("Payload offset only support FILE or STREAM type.");
        }
        File file = this.zzd;
        if (file != null && j >= file.getSize()) {
            throw new IllegalArgumentException("Payload offset should be smaller than the file size.");
        }
        this.zzf = j;
    }

    public static Payload fromFile(java.io.File file) throws FileNotFoundException {
        return zzb(File.zza(file, ParcelFileDescriptor.open(file, 268435456), file.length(), Uri.fromFile(file)), UUID.randomUUID().getLeastSignificantBits());
    }

    public static Payload fromStream(InputStream inputStream) {
        return zzc(Stream.zza(inputStream), UUID.randomUUID().getLeastSignificantBits());
    }
}
