package com.mbridge.msdk.thrid.okhttp;

import com.mbridge.msdk.thrid.okhttp.internal.Util;
import com.mbridge.msdk.thrid.okio.BufferedSink;
import com.mbridge.msdk.thrid.okio.ByteString;
import com.mbridge.msdk.thrid.okio.Okio;
import com.mbridge.msdk.thrid.okio.Source;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Objects;
import javax.annotation.Nullable;

/* loaded from: classes4.dex */
public abstract class RequestBody {
    public long contentLength() throws IOException {
        return -1L;
    }

    @Nullable
    public abstract MediaType contentType();

    public abstract void writeTo(BufferedSink bufferedSink) throws IOException;

    public static RequestBody create(@Nullable MediaType mediaType, String str) {
        Charset charset = Util.UTF_8;
        if (mediaType != null && (charset = mediaType.charset()) == null) {
            charset = Util.UTF_8;
            mediaType = MediaType.parse(mediaType + "; charset=utf-8");
        }
        return create(mediaType, str.getBytes(charset));
    }

    public static RequestBody create(@Nullable final MediaType mediaType, final ByteString byteString) {
        return new RequestBody() { // from class: com.mbridge.msdk.thrid.okhttp.RequestBody.1
            @Override // com.mbridge.msdk.thrid.okhttp.RequestBody
            @Nullable
            public MediaType contentType() {
                return mediaType;
            }

            @Override // com.mbridge.msdk.thrid.okhttp.RequestBody
            public long contentLength() throws IOException {
                return byteString.size();
            }

            @Override // com.mbridge.msdk.thrid.okhttp.RequestBody
            public void writeTo(BufferedSink bufferedSink) throws IOException {
                bufferedSink.write(byteString);
            }
        };
    }

    public static RequestBody create(@Nullable MediaType mediaType, byte[] bArr) {
        return create(mediaType, bArr, 0, bArr.length);
    }

    public static RequestBody create(@Nullable final MediaType mediaType, final byte[] bArr, final int i, final int i2) {
        Objects.requireNonNull(bArr, "content == null");
        Util.checkOffsetAndCount(bArr.length, i, i2);
        return new RequestBody() { // from class: com.mbridge.msdk.thrid.okhttp.RequestBody.2
            @Override // com.mbridge.msdk.thrid.okhttp.RequestBody
            @Nullable
            public MediaType contentType() {
                return mediaType;
            }

            @Override // com.mbridge.msdk.thrid.okhttp.RequestBody
            public long contentLength() {
                return i2;
            }

            @Override // com.mbridge.msdk.thrid.okhttp.RequestBody
            public void writeTo(BufferedSink bufferedSink) throws IOException {
                bufferedSink.write(bArr, i, i2);
            }
        };
    }

    public static RequestBody create(@Nullable final MediaType mediaType, final File file) {
        Objects.requireNonNull(file, "file == null");
        return new RequestBody() { // from class: com.mbridge.msdk.thrid.okhttp.RequestBody.3
            @Override // com.mbridge.msdk.thrid.okhttp.RequestBody
            @Nullable
            public MediaType contentType() {
                return mediaType;
            }

            @Override // com.mbridge.msdk.thrid.okhttp.RequestBody
            public long contentLength() {
                return file.length();
            }

            @Override // com.mbridge.msdk.thrid.okhttp.RequestBody
            public void writeTo(BufferedSink bufferedSink) throws IOException {
                Source source = null;
                try {
                    source = Okio.source(file);
                    bufferedSink.writeAll(source);
                } finally {
                    Util.closeQuietly(source);
                }
            }
        };
    }
}
