package com.applovin.impl;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.ApplicationMediaCapabilities;
import android.net.Uri;
import android.os.Bundle;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* loaded from: classes.dex */
public final class q4 extends z1 {
    private final ContentResolver e;
    private Uri f;
    private AssetFileDescriptor g;
    private FileInputStream h;
    private long i;
    private boolean j;

    public static class b extends h5 {
        public b(IOException iOException, int i) {
            super(iOException, i);
        }
    }

    public q4(Context context) {
        super(false);
        this.e = context.getContentResolver();
    }

    @Override // com.applovin.impl.g5
    public long a(j5 j5Var) throws IOException {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        try {
            Uri uri = j5Var.f560a;
            this.f = uri;
            b(j5Var);
            if ("content".equals(j5Var.f560a.getScheme())) {
                Bundle bundle = new Bundle();
                if (yp.f1214a >= 31) {
                    a.a(bundle);
                }
                assetFileDescriptorOpenAssetFileDescriptor = this.e.openTypedAssetFileDescriptor(uri, "*/*", bundle);
            } else {
                assetFileDescriptorOpenAssetFileDescriptor = this.e.openAssetFileDescriptor(uri, "r");
            }
            this.g = assetFileDescriptorOpenAssetFileDescriptor;
            if (assetFileDescriptorOpenAssetFileDescriptor != null) {
                long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
                this.h = fileInputStream;
                if (length != -1 && j5Var.g > length) {
                    throw new b(null, 2008);
                }
                long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
                long jSkip = fileInputStream.skip(j5Var.g + startOffset) - startOffset;
                if (jSkip == j5Var.g) {
                    if (length == -1) {
                        FileChannel channel = fileInputStream.getChannel();
                        long size = channel.size();
                        if (size == 0) {
                            this.i = -1L;
                        } else {
                            long jPosition = size - channel.position();
                            this.i = jPosition;
                            if (jPosition < 0) {
                                throw new b(null, 2008);
                            }
                        }
                    } else {
                        long j = length - jSkip;
                        this.i = j;
                        if (j < 0) {
                            throw new b(null, 2008);
                        }
                    }
                    long jMin = j5Var.h;
                    if (jMin != -1) {
                        long j2 = this.i;
                        if (j2 != -1) {
                            jMin = Math.min(j2, jMin);
                        }
                        this.i = jMin;
                    }
                    this.j = true;
                    c(j5Var);
                    long j3 = j5Var.h;
                    return j3 != -1 ? j3 : this.i;
                }
                throw new b(null, 2008);
            }
            throw new b(new IOException("Could not open file descriptor for: " + uri), 2000);
        } catch (b e) {
            throw e;
        } catch (IOException e2) {
            throw new b(e2, e2 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // com.applovin.impl.g5
    public Uri c() {
        return this.f;
    }

    @Override // com.applovin.impl.g5
    public void close() {
        this.f = null;
        try {
            try {
                FileInputStream fileInputStream = this.h;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } finally {
                        this.g = null;
                        if (this.j) {
                            this.j = false;
                            g();
                        }
                    }
                } catch (IOException e) {
                    throw new b(e, 2000);
                }
            } catch (IOException e2) {
                throw new b(e2, 2000);
            }
        } catch (Throwable th) {
            this.h = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.g;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.g = null;
                    if (this.j) {
                        this.j = false;
                        g();
                    }
                    throw th;
                } catch (IOException e3) {
                    throw new b(e3, 2000);
                }
            } finally {
                this.g = null;
                if (this.j) {
                    this.j = false;
                    g();
                }
            }
        }
    }

    private static final class a {
        public static void a(Bundle bundle) {
            bundle.putParcelable("android.provider.extra.MEDIA_CAPABILITIES", new ApplicationMediaCapabilities.Builder().addSupportedVideoMimeType("video/hevc").addSupportedHdrType("android.media.feature.hdr.dolby_vision").addSupportedHdrType("android.media.feature.hdr.hdr10").addSupportedHdrType("android.media.feature.hdr.hdr10_plus").addSupportedHdrType("android.media.feature.hdr.hlg").build());
        }
    }

    @Override // com.applovin.impl.e5
    public int a(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.i;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new b(e, 2000);
            }
        }
        int i3 = ((FileInputStream) yp.a((Object) this.h)).read(bArr, i, i2);
        if (i3 == -1) {
            return -1;
        }
        long j2 = this.i;
        if (j2 != -1) {
            this.i = j2 - i3;
        }
        d(i3);
        return i3;
    }
}
