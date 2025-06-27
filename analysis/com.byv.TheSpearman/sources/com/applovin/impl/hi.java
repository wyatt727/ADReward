package com.applovin.impl;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;

/* loaded from: classes.dex */
public final class hi extends z1 {
    private final Resources e;
    private final String f;
    private Uri g;
    private AssetFileDescriptor h;
    private InputStream i;
    private long j;
    private boolean k;

    public static class a extends h5 {
        public a(String str, Throwable th, int i) {
            super(str, th, i);
        }
    }

    public hi(Context context) {
        super(false);
        this.e = context.getResources();
        this.f = context.getPackageName();
    }

    @Override // com.applovin.impl.g5
    public long a(j5 j5Var) throws h5, Resources.NotFoundException, NumberFormatException {
        int identifier;
        String str;
        Uri uri = j5Var.f560a;
        this.g = uri;
        if (!TextUtils.equals("rawresource", uri.getScheme()) && (!TextUtils.equals("android.resource", uri.getScheme()) || uri.getPathSegments().size() != 1 || !((String) a1.a((Object) uri.getLastPathSegment())).matches("\\d+"))) {
            if (TextUtils.equals("android.resource", uri.getScheme())) {
                String strSubstring = (String) a1.a((Object) uri.getPath());
                if (strSubstring.startsWith("/")) {
                    strSubstring = strSubstring.substring(1);
                }
                String host = uri.getHost();
                StringBuilder sb = new StringBuilder();
                if (TextUtils.isEmpty(host)) {
                    str = "";
                } else {
                    str = host + ":";
                }
                sb.append(str);
                sb.append(strSubstring);
                identifier = this.e.getIdentifier(sb.toString(), "raw", this.f);
                if (identifier == 0) {
                    throw new a("Resource not found.", null, 2005);
                }
            } else {
                throw new a("URI must either use scheme rawresource or android.resource", null, 1004);
            }
        } else {
            try {
                identifier = Integer.parseInt((String) a1.a((Object) uri.getLastPathSegment()));
            } catch (NumberFormatException unused) {
                throw new a("Resource identifier must be an integer.", null, 1004);
            }
        }
        b(j5Var);
        try {
            AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = this.e.openRawResourceFd(identifier);
            this.h = assetFileDescriptorOpenRawResourceFd;
            if (assetFileDescriptorOpenRawResourceFd != null) {
                long length = assetFileDescriptorOpenRawResourceFd.getLength();
                FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenRawResourceFd.getFileDescriptor());
                this.i = fileInputStream;
                if (length != -1) {
                    try {
                        if (j5Var.g > length) {
                            throw new a(null, null, 2008);
                        }
                    } catch (a e) {
                        throw e;
                    } catch (IOException e2) {
                        throw new a(null, e2, 2000);
                    }
                }
                long startOffset = assetFileDescriptorOpenRawResourceFd.getStartOffset();
                long jSkip = fileInputStream.skip(j5Var.g + startOffset) - startOffset;
                if (jSkip == j5Var.g) {
                    if (length == -1) {
                        FileChannel channel = fileInputStream.getChannel();
                        if (channel.size() == 0) {
                            this.j = -1L;
                        } else {
                            long size = channel.size() - channel.position();
                            this.j = size;
                            if (size < 0) {
                                throw new a(null, null, 2008);
                            }
                        }
                    } else {
                        long j = length - jSkip;
                        this.j = j;
                        if (j < 0) {
                            throw new h5(2008);
                        }
                    }
                    long jMin = j5Var.h;
                    if (jMin != -1) {
                        long j2 = this.j;
                        if (j2 != -1) {
                            jMin = Math.min(j2, jMin);
                        }
                        this.j = jMin;
                    }
                    this.k = true;
                    c(j5Var);
                    long j3 = j5Var.h;
                    return j3 != -1 ? j3 : this.j;
                }
                throw new a(null, null, 2008);
            }
            throw new a("Resource is compressed: " + uri, null, 2000);
        } catch (Resources.NotFoundException e3) {
            throw new a(null, e3, 2005);
        }
    }

    @Override // com.applovin.impl.g5
    public Uri c() {
        return this.g;
    }

    @Override // com.applovin.impl.g5
    public void close() {
        this.g = null;
        try {
            try {
                InputStream inputStream = this.i;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.i = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.h;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } finally {
                        this.h = null;
                        if (this.k) {
                            this.k = false;
                            g();
                        }
                    }
                } catch (IOException e) {
                    throw new a(null, e, 2000);
                }
            } catch (IOException e2) {
                throw new a(null, e2, 2000);
            }
        } catch (Throwable th) {
            this.i = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.h;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.h = null;
                    if (this.k) {
                        this.k = false;
                        g();
                    }
                    throw th;
                } catch (IOException e3) {
                    throw new a(null, e3, 2000);
                }
            } finally {
                this.h = null;
                if (this.k) {
                    this.k = false;
                    g();
                }
            }
        }
    }

    @Override // com.applovin.impl.e5
    public int a(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.j;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new a(null, e, 2000);
            }
        }
        int i3 = ((InputStream) yp.a((Object) this.i)).read(bArr, i, i2);
        if (i3 == -1) {
            if (this.j == -1) {
                return -1;
            }
            throw new a("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
        long j2 = this.j;
        if (j2 != -1) {
            this.j = j2 - i3;
        }
        d(i3);
        return i3;
    }
}
