package okio.internal;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.exoplayer2.MediaPeriodQueue;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.io.EOFException;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Typography;
import okhttp3.internal.connection.RealConnection;
import okio.Buffer;
import okio.ByteString;
import okio.Options;
import okio.Segment;
import okio.SegmentPool;
import okio.SegmentedByteString;
import okio.Sink;
import okio.Source;
import okio.Utf8;
import okio._JvmPlatformKt;
import okio._UtilKt;

/* compiled from: -Buffer.kt */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a0\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\nH\u0000\u001a\r\u0010\u0013\u001a\u00020\u0014*\u00020\u0015H\u0080\b\u001a\r\u0010\u0016\u001a\u00020\u0014*\u00020\u0017H\u0080\b\u001a\r\u0010\u0018\u001a\u00020\u0007*\u00020\u0015H\u0080\b\u001a\r\u0010\u0019\u001a\u00020\u0015*\u00020\u0015H\u0080\b\u001a%\u0010\u001a\u001a\u00020\u0015*\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u0007H\u0080\b\u001a\u0017\u0010\u001e\u001a\u00020\f*\u00020\u00152\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0080\b\u001a\u0015\u0010!\u001a\u00020\u0007*\u00020\u00172\u0006\u0010\"\u001a\u00020\nH\u0080\b\u001a\u0015\u0010#\u001a\u00020$*\u00020\u00152\u0006\u0010%\u001a\u00020\u0007H\u0080\b\u001a\r\u0010&\u001a\u00020\n*\u00020\u0015H\u0080\b\u001a%\u0010'\u001a\u00020\u0007*\u00020\u00152\u0006\u0010(\u001a\u00020$2\u0006\u0010)\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u0007H\u0080\b\u001a\u001d\u0010'\u001a\u00020\u0007*\u00020\u00152\u0006\u0010\u0010\u001a\u00020+2\u0006\u0010)\u001a\u00020\u0007H\u0080\b\u001a\u001d\u0010,\u001a\u00020\u0007*\u00020\u00152\u0006\u0010-\u001a\u00020+2\u0006\u0010)\u001a\u00020\u0007H\u0080\b\u001a\r\u0010.\u001a\u00020\n*\u00020\u0017H\u0080\b\u001a-\u0010/\u001a\u00020\f*\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020+2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\nH\u0080\b\u001a\u0015\u00100\u001a\u00020\n*\u00020\u00152\u0006\u00101\u001a\u00020\u0001H\u0080\b\u001a%\u00100\u001a\u00020\n*\u00020\u00152\u0006\u00101\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\nH\u0080\b\u001a\u001d\u00100\u001a\u00020\u0007*\u00020\u00152\u0006\u00101\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u0007H\u0080\b\u001a\u0015\u00102\u001a\u00020\u0007*\u00020\u00152\u0006\u00101\u001a\u000203H\u0080\b\u001a\u0014\u00104\u001a\u00020\u0017*\u00020\u00152\u0006\u00105\u001a\u00020\u0017H\u0000\u001a\r\u00106\u001a\u00020$*\u00020\u0015H\u0080\b\u001a\r\u00107\u001a\u00020\u0001*\u00020\u0015H\u0080\b\u001a\u0015\u00107\u001a\u00020\u0001*\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u0007H\u0080\b\u001a\r\u00108\u001a\u00020+*\u00020\u0015H\u0080\b\u001a\u0015\u00108\u001a\u00020+*\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u0007H\u0080\b\u001a\r\u00109\u001a\u00020\u0007*\u00020\u0015H\u0080\b\u001a\u0015\u0010:\u001a\u00020\u0014*\u00020\u00152\u0006\u00101\u001a\u00020\u0001H\u0080\b\u001a\u001d\u0010:\u001a\u00020\u0014*\u00020\u00152\u0006\u00101\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u0007H\u0080\b\u001a\r\u0010;\u001a\u00020\u0007*\u00020\u0015H\u0080\b\u001a\r\u0010<\u001a\u00020\n*\u00020\u0015H\u0080\b\u001a\r\u0010=\u001a\u00020\u0007*\u00020\u0015H\u0080\b\u001a\r\u0010>\u001a\u00020?*\u00020\u0015H\u0080\b\u001a\u0014\u0010@\u001a\u00020\u0017*\u00020\u00152\u0006\u00105\u001a\u00020\u0017H\u0000\u001a\u0015\u0010A\u001a\u00020B*\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u0007H\u0080\b\u001a\r\u0010C\u001a\u00020\n*\u00020\u0015H\u0080\b\u001a\u000f\u0010D\u001a\u0004\u0018\u00010B*\u00020\u0015H\u0080\b\u001a\u0015\u0010E\u001a\u00020B*\u00020\u00152\u0006\u0010F\u001a\u00020\u0007H\u0080\b\u001a\u0015\u0010G\u001a\u00020\u0007*\u00020\u00172\u0006\u0010H\u001a\u00020\u0007H\u0080\b\u001a\u0015\u0010I\u001a\u00020\n*\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u0007H\u0080\b\u001a\u0015\u0010J\u001a\u00020\n*\u00020\u00152\u0006\u0010K\u001a\u00020LH\u0080\b\u001a\u0015\u0010M\u001a\u00020\u0014*\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u0007H\u0080\b\u001a\r\u0010N\u001a\u00020+*\u00020\u0015H\u0080\b\u001a\u0015\u0010N\u001a\u00020+*\u00020\u00152\u0006\u0010\u001d\u001a\u00020\nH\u0080\b\u001a\u0015\u0010O\u001a\u00020\u000e*\u00020\u00152\u0006\u0010P\u001a\u00020\nH\u0080\b\u001a\u0015\u0010Q\u001a\u00020\u0015*\u00020\u00152\u0006\u0010R\u001a\u00020\u0001H\u0080\b\u001a%\u0010Q\u001a\u00020\u0015*\u00020\u00152\u0006\u0010R\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\nH\u0080\b\u001a\u001d\u0010Q\u001a\u00020\u0014*\u00020\u00152\u0006\u0010R\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u0007H\u0080\b\u001a)\u0010Q\u001a\u00020\u0015*\u00020\u00152\u0006\u0010S\u001a\u00020+2\b\b\u0002\u0010\u001c\u001a\u00020\n2\b\b\u0002\u0010\u001d\u001a\u00020\nH\u0080\b\u001a\u001d\u0010Q\u001a\u00020\u0015*\u00020\u00152\u0006\u0010R\u001a\u00020T2\u0006\u0010\u001d\u001a\u00020\u0007H\u0080\b\u001a\u0015\u0010U\u001a\u00020\u0007*\u00020\u00152\u0006\u0010R\u001a\u00020TH\u0080\b\u001a\u0015\u0010V\u001a\u00020\u0015*\u00020\u00152\u0006\u0010(\u001a\u00020\nH\u0080\b\u001a\u0015\u0010W\u001a\u00020\u0015*\u00020\u00152\u0006\u0010X\u001a\u00020\u0007H\u0080\b\u001a\u0015\u0010Y\u001a\u00020\u0015*\u00020\u00152\u0006\u0010X\u001a\u00020\u0007H\u0080\b\u001a\u0015\u0010Z\u001a\u00020\u0015*\u00020\u00152\u0006\u0010[\u001a\u00020\nH\u0080\b\u001a\u0015\u0010\\\u001a\u00020\u0015*\u00020\u00152\u0006\u0010X\u001a\u00020\u0007H\u0080\b\u001a\u0015\u0010]\u001a\u00020\u0015*\u00020\u00152\u0006\u0010^\u001a\u00020\nH\u0080\b\u001a%\u0010_\u001a\u00020\u0015*\u00020\u00152\u0006\u0010`\u001a\u00020B2\u0006\u0010a\u001a\u00020\n2\u0006\u0010b\u001a\u00020\nH\u0080\b\u001a\u0015\u0010c\u001a\u00020\u0015*\u00020\u00152\u0006\u0010d\u001a\u00020\nH\u0080\b\u001a\u0014\u0010e\u001a\u00020B*\u00020\u00152\u0006\u0010f\u001a\u00020\u0007H\u0000\u001a?\u0010g\u001a\u0002Hh\"\u0004\b\u0000\u0010h*\u00020\u00152\u0006\u0010)\u001a\u00020\u00072\u001a\u0010i\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u0002Hh0jH\u0080\bø\u0001\u0000¢\u0006\u0002\u0010k\u001a\u001e\u0010l\u001a\u00020\n*\u00020\u00152\u0006\u0010K\u001a\u00020L2\b\b\u0002\u0010m\u001a\u00020\fH\u0000\"\u001c\u0010\u0000\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u000e\u0010\u0006\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\nX\u0080T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006n"}, d2 = {"HEX_DIGIT_BYTES", "", "getHEX_DIGIT_BYTES$annotations", "()V", "getHEX_DIGIT_BYTES", "()[B", "OVERFLOW_DIGIT_START", "", "OVERFLOW_ZONE", "SEGMENTING_THRESHOLD", "", "rangeEquals", "", "segment", "Lokio/Segment;", "segmentPos", "bytes", "bytesOffset", "bytesLimit", "commonClear", "", "Lokio/Buffer;", "commonClose", "Lokio/Buffer$UnsafeCursor;", "commonCompleteSegmentByteCount", "commonCopy", "commonCopyTo", "out", TypedValues.CycleType.S_WAVE_OFFSET, "byteCount", "commonEquals", "other", "", "commonExpandBuffer", "minByteCount", "commonGet", "", "pos", "commonHashCode", "commonIndexOf", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "fromIndex", "toIndex", "Lokio/ByteString;", "commonIndexOfElement", "targetBytes", "commonNext", "commonRangeEquals", "commonRead", "sink", "commonReadAll", "Lokio/Sink;", "commonReadAndWriteUnsafe", "unsafeCursor", "commonReadByte", "commonReadByteArray", "commonReadByteString", "commonReadDecimalLong", "commonReadFully", "commonReadHexadecimalUnsignedLong", "commonReadInt", "commonReadLong", "commonReadShort", "", "commonReadUnsafe", "commonReadUtf8", "", "commonReadUtf8CodePoint", "commonReadUtf8Line", "commonReadUtf8LineStrict", "limit", "commonResizeBuffer", "newSize", "commonSeek", "commonSelect", "options", "Lokio/Options;", "commonSkip", "commonSnapshot", "commonWritableSegment", "minimumCapacity", "commonWrite", FirebaseAnalytics.Param.SOURCE, "byteString", "Lokio/Source;", "commonWriteAll", "commonWriteByte", "commonWriteDecimalLong", "v", "commonWriteHexadecimalUnsignedLong", "commonWriteInt", CmcdHeadersFactory.OBJECT_TYPE_INIT_SEGMENT, "commonWriteLong", "commonWriteShort", CmcdHeadersFactory.STREAMING_FORMAT_SS, "commonWriteUtf8", TypedValues.Custom.S_STRING, "beginIndex", "endIndex", "commonWriteUtf8CodePoint", "codePoint", "readUtf8Line", "newline", "seek", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "lambda", "Lkotlin/Function2;", "(Lokio/Buffer;JLkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "selectPrefix", "selectTruncated", "okio"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes5.dex */
public final class _BufferKt {
    private static final byte[] HEX_DIGIT_BYTES = _JvmPlatformKt.asUtf8ToByteArray("0123456789abcdef");
    public static final long OVERFLOW_DIGIT_START = -7;
    public static final long OVERFLOW_ZONE = -922337203685477580L;
    public static final int SEGMENTING_THRESHOLD = 4096;

    public static /* synthetic */ void getHEX_DIGIT_BYTES$annotations() {
    }

    public static final byte[] getHEX_DIGIT_BYTES() {
        return HEX_DIGIT_BYTES;
    }

    public static final boolean rangeEquals(Segment segment, int i, byte[] bytes, int i2, int i3) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        int i4 = segment.limit;
        byte[] bArr = segment.data;
        while (i2 < i3) {
            if (i == i4) {
                segment = segment.next;
                Intrinsics.checkNotNull(segment);
                byte[] bArr2 = segment.data;
                bArr = bArr2;
                i = segment.pos;
                i4 = segment.limit;
            }
            if (bArr[i] != bytes[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    public static final String readUtf8Line(Buffer buffer, long j) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (j > 0) {
            long j2 = j - 1;
            if (buffer.getByte(j2) == ((byte) 13)) {
                String utf8 = buffer.readUtf8(j2);
                buffer.skip(2L);
                return utf8;
            }
        }
        String utf82 = buffer.readUtf8(j);
        buffer.skip(1L);
        return utf82;
    }

    public static final <T> T seek(Buffer buffer, long j, Function2<? super Segment, ? super Long, ? extends T> lambda) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(lambda, "lambda");
        Segment segment = buffer.head;
        if (segment == null) {
            return lambda.invoke(null, -1L);
        }
        if (buffer.size() - j < j) {
            long size = buffer.size();
            while (size > j) {
                segment = segment.prev;
                Intrinsics.checkNotNull(segment);
                size -= segment.limit - segment.pos;
            }
            return lambda.invoke(segment, Long.valueOf(size));
        }
        long j2 = 0;
        while (true) {
            long j3 = (segment.limit - segment.pos) + j2;
            if (j3 <= j) {
                segment = segment.next;
                Intrinsics.checkNotNull(segment);
                j2 = j3;
            } else {
                return lambda.invoke(segment, Long.valueOf(j2));
            }
        }
    }

    public static /* synthetic */ int selectPrefix$default(Buffer buffer, Options options, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return selectPrefix(buffer, options, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0062, code lost:
    
        if (r19 == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0064, code lost:
    
        return -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0065, code lost:
    
        return r10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int selectPrefix(okio.Buffer r17, okio.Options r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 177
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.internal._BufferKt.selectPrefix(okio.Buffer, okio.Options, boolean):int");
    }

    public static final Buffer commonCopyTo(Buffer buffer, Buffer out, long j, long j2) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(out, "out");
        _UtilKt.checkOffsetAndCount(buffer.size(), j, j2);
        if (j2 == 0) {
            return buffer;
        }
        out.setSize$okio(out.size() + j2);
        Segment segment = buffer.head;
        while (true) {
            Intrinsics.checkNotNull(segment);
            if (j < segment.limit - segment.pos) {
                break;
            }
            j -= segment.limit - segment.pos;
            segment = segment.next;
        }
        while (j2 > 0) {
            Intrinsics.checkNotNull(segment);
            Segment segmentSharedCopy = segment.sharedCopy();
            segmentSharedCopy.pos += (int) j;
            segmentSharedCopy.limit = Math.min(segmentSharedCopy.pos + ((int) j2), segmentSharedCopy.limit);
            if (out.head == null) {
                segmentSharedCopy.prev = segmentSharedCopy;
                segmentSharedCopy.next = segmentSharedCopy.prev;
                out.head = segmentSharedCopy.next;
            } else {
                Segment segment2 = out.head;
                Intrinsics.checkNotNull(segment2);
                Segment segment3 = segment2.prev;
                Intrinsics.checkNotNull(segment3);
                segment3.push(segmentSharedCopy);
            }
            j2 -= segmentSharedCopy.limit - segmentSharedCopy.pos;
            segment = segment.next;
            j = 0;
        }
        return buffer;
    }

    public static final long commonCompleteSegmentByteCount(Buffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        long size = buffer.size();
        if (size == 0) {
            return 0L;
        }
        Segment segment = buffer.head;
        Intrinsics.checkNotNull(segment);
        Segment segment2 = segment.prev;
        Intrinsics.checkNotNull(segment2);
        return (segment2.limit >= 8192 || !segment2.owner) ? size : size - (segment2.limit - segment2.pos);
    }

    public static final byte commonReadByte(Buffer buffer) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (buffer.size() == 0) {
            throw new EOFException();
        }
        Segment segment = buffer.head;
        Intrinsics.checkNotNull(segment);
        int i = segment.pos;
        int i2 = segment.limit;
        int i3 = i + 1;
        byte b = segment.data[i];
        buffer.setSize$okio(buffer.size() - 1);
        if (i3 == i2) {
            buffer.head = segment.pop();
            SegmentPool.recycle(segment);
        } else {
            segment.pos = i3;
        }
        return b;
    }

    public static final short commonReadShort(Buffer buffer) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (buffer.size() < 2) {
            throw new EOFException();
        }
        Segment segment = buffer.head;
        Intrinsics.checkNotNull(segment);
        int i = segment.pos;
        int i2 = segment.limit;
        if (i2 - i < 2) {
            return (short) ((buffer.readByte() & 255) | ((buffer.readByte() & 255) << 8));
        }
        byte[] bArr = segment.data;
        int i3 = i + 1;
        int i4 = i3 + 1;
        int i5 = ((bArr[i] & 255) << 8) | (bArr[i3] & 255);
        buffer.setSize$okio(buffer.size() - 2);
        if (i4 == i2) {
            buffer.head = segment.pop();
            SegmentPool.recycle(segment);
        } else {
            segment.pos = i4;
        }
        return (short) i5;
    }

    public static final int commonReadInt(Buffer buffer) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (buffer.size() < 4) {
            throw new EOFException();
        }
        Segment segment = buffer.head;
        Intrinsics.checkNotNull(segment);
        int i = segment.pos;
        int i2 = segment.limit;
        if (i2 - i < 4) {
            return (buffer.readByte() & 255) | ((buffer.readByte() & 255) << 24) | ((buffer.readByte() & 255) << 16) | ((buffer.readByte() & 255) << 8);
        }
        byte[] bArr = segment.data;
        int i3 = i + 1;
        int i4 = i3 + 1;
        int i5 = ((bArr[i] & 255) << 24) | ((bArr[i3] & 255) << 16);
        int i6 = i4 + 1;
        int i7 = i5 | ((bArr[i4] & 255) << 8);
        int i8 = i6 + 1;
        int i9 = i7 | (bArr[i6] & 255);
        buffer.setSize$okio(buffer.size() - 4);
        if (i8 == i2) {
            buffer.head = segment.pop();
            SegmentPool.recycle(segment);
        } else {
            segment.pos = i8;
        }
        return i9;
    }

    public static final long commonReadLong(Buffer buffer) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (buffer.size() < 8) {
            throw new EOFException();
        }
        Segment segment = buffer.head;
        Intrinsics.checkNotNull(segment);
        int i = segment.pos;
        int i2 = segment.limit;
        if (i2 - i < 8) {
            return ((buffer.readInt() & 4294967295L) << 32) | (4294967295L & buffer.readInt());
        }
        byte[] bArr = segment.data;
        long j = (bArr[i] & 255) << 56;
        int i3 = i + 1 + 1 + 1;
        long j2 = j | ((bArr[r7] & 255) << 48) | ((bArr[r1] & 255) << 40);
        long j3 = j2 | ((bArr[i3] & 255) << 32) | ((bArr[r1] & 255) << 24);
        long j4 = j3 | ((bArr[r8] & 255) << 16);
        long j5 = j4 | ((bArr[r1] & 255) << 8);
        int i4 = i3 + 1 + 1 + 1 + 1 + 1;
        long j6 = j5 | (bArr[r8] & 255);
        buffer.setSize$okio(buffer.size() - 8);
        if (i4 == i2) {
            buffer.head = segment.pop();
            SegmentPool.recycle(segment);
        } else {
            segment.pos = i4;
        }
        return j6;
    }

    public static final byte commonGet(Buffer buffer, long j) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        _UtilKt.checkOffsetAndCount(buffer.size(), j, 1L);
        Segment segment = buffer.head;
        if (segment == null) {
            Segment segment2 = null;
            Intrinsics.checkNotNull(null);
            return segment2.data[(int) ((segment2.pos + j) - (-1))];
        }
        if (buffer.size() - j < j) {
            long size = buffer.size();
            while (size > j) {
                segment = segment.prev;
                Intrinsics.checkNotNull(segment);
                size -= segment.limit - segment.pos;
            }
            Intrinsics.checkNotNull(segment);
            return segment.data[(int) ((segment.pos + j) - size)];
        }
        long j2 = 0;
        while (true) {
            long j3 = (segment.limit - segment.pos) + j2;
            if (j3 > j) {
                Intrinsics.checkNotNull(segment);
                return segment.data[(int) ((segment.pos + j) - j2)];
            }
            segment = segment.next;
            Intrinsics.checkNotNull(segment);
            j2 = j3;
        }
    }

    public static final void commonClear(Buffer buffer) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        buffer.skip(buffer.size());
    }

    public static final void commonSkip(Buffer buffer, long j) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        while (j > 0) {
            Segment segment = buffer.head;
            if (segment == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j, segment.limit - segment.pos);
            long j2 = iMin;
            buffer.setSize$okio(buffer.size() - j2);
            j -= j2;
            segment.pos += iMin;
            if (segment.pos == segment.limit) {
                buffer.head = segment.pop();
                SegmentPool.recycle(segment);
            }
        }
    }

    public static /* synthetic */ Buffer commonWrite$default(Buffer buffer, ByteString byteString, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = byteString.size();
        }
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        byteString.write$okio(buffer, i, i2);
        return buffer;
    }

    public static final Buffer commonWrite(Buffer buffer, ByteString byteString, int i, int i2) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        byteString.write$okio(buffer, i, i2);
        return buffer;
    }

    public static final Buffer commonWriteDecimalLong(Buffer buffer, long j) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (j == 0) {
            return buffer.writeByte(48);
        }
        boolean z = false;
        int i = 1;
        if (j < 0) {
            j = -j;
            if (j < 0) {
                return buffer.writeUtf8("-9223372036854775808");
            }
            z = true;
        }
        if (j >= 100000000) {
            i = j < MediaPeriodQueue.INITIAL_RENDERER_POSITION_OFFSET_US ? j < RealConnection.IDLE_CONNECTION_HEALTHY_NS ? j < 1000000000 ? 9 : 10 : j < 100000000000L ? 11 : 12 : j < 1000000000000000L ? j < 10000000000000L ? 13 : j < 100000000000000L ? 14 : 15 : j < 100000000000000000L ? j < 10000000000000000L ? 16 : 17 : j < 1000000000000000000L ? 18 : 19;
        } else if (j >= 10000) {
            i = j < 1000000 ? j < 100000 ? 5 : 6 : j < 10000000 ? 7 : 8;
        } else if (j >= 100) {
            i = j < 1000 ? 3 : 4;
        } else if (j >= 10) {
            i = 2;
        }
        if (z) {
            i++;
        }
        Segment segmentWritableSegment$okio = buffer.writableSegment$okio(i);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i2 = segmentWritableSegment$okio.limit + i;
        while (j != 0) {
            long j2 = 10;
            i2--;
            bArr[i2] = getHEX_DIGIT_BYTES()[(int) (j % j2)];
            j /= j2;
        }
        if (z) {
            bArr[i2 - 1] = (byte) 45;
        }
        segmentWritableSegment$okio.limit += i;
        buffer.setSize$okio(buffer.size() + i);
        return buffer;
    }

    public static final Buffer commonWriteHexadecimalUnsignedLong(Buffer buffer, long j) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (j == 0) {
            return buffer.writeByte(48);
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
        long j11 = j10 + (j10 >>> 8);
        long j12 = j11 + (j11 >>> 16);
        int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + 3) / 4);
        Segment segmentWritableSegment$okio = buffer.writableSegment$okio(i);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i2 = segmentWritableSegment$okio.limit;
        for (int i3 = (segmentWritableSegment$okio.limit + i) - 1; i3 >= i2; i3--) {
            bArr[i3] = getHEX_DIGIT_BYTES()[(int) (15 & j)];
            j >>>= 4;
        }
        segmentWritableSegment$okio.limit += i;
        buffer.setSize$okio(buffer.size() + i);
        return buffer;
    }

    public static final Segment commonWritableSegment(Buffer buffer, int i) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (!(i >= 1 && i <= 8192)) {
            throw new IllegalArgumentException("unexpected capacity".toString());
        }
        if (buffer.head == null) {
            Segment segmentTake = SegmentPool.take();
            buffer.head = segmentTake;
            segmentTake.prev = segmentTake;
            segmentTake.next = segmentTake;
            return segmentTake;
        }
        Segment segment = buffer.head;
        Intrinsics.checkNotNull(segment);
        Segment segment2 = segment.prev;
        Intrinsics.checkNotNull(segment2);
        return (segment2.limit + i > 8192 || !segment2.owner) ? segment2.push(SegmentPool.take()) : segment2;
    }

    public static final Buffer commonWrite(Buffer buffer, byte[] source) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        return buffer.write(source, 0, source.length);
    }

    public static final Buffer commonWrite(Buffer buffer, byte[] source, int i, int i2) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        long j = i2;
        _UtilKt.checkOffsetAndCount(source.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            Segment segmentWritableSegment$okio = buffer.writableSegment$okio(1);
            int iMin = Math.min(i3 - i, 8192 - segmentWritableSegment$okio.limit);
            int i4 = i + iMin;
            ArraysKt.copyInto(source, segmentWritableSegment$okio.data, segmentWritableSegment$okio.limit, i, i4);
            segmentWritableSegment$okio.limit += iMin;
            i = i4;
        }
        buffer.setSize$okio(buffer.size() + j);
        return buffer;
    }

    public static final byte[] commonReadByteArray(Buffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        return buffer.readByteArray(buffer.size());
    }

    public static final byte[] commonReadByteArray(Buffer buffer, long j) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (!(j >= 0 && j <= 2147483647L)) {
            throw new IllegalArgumentException(Intrinsics.stringPlus("byteCount: ", Long.valueOf(j)).toString());
        }
        if (buffer.size() < j) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j];
        buffer.readFully(bArr);
        return bArr;
    }

    public static final int commonRead(Buffer buffer, byte[] sink) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(sink, "sink");
        return buffer.read(sink, 0, sink.length);
    }

    public static final void commonReadFully(Buffer buffer, byte[] sink) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(sink, "sink");
        int i = 0;
        while (i < sink.length) {
            int i2 = buffer.read(sink, i, sink.length - i);
            if (i2 == -1) {
                throw new EOFException();
            }
            i += i2;
        }
    }

    public static final int commonRead(Buffer buffer, byte[] sink, int i, int i2) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(sink, "sink");
        _UtilKt.checkOffsetAndCount(sink.length, i, i2);
        Segment segment = buffer.head;
        if (segment == null) {
            return -1;
        }
        int iMin = Math.min(i2, segment.limit - segment.pos);
        ArraysKt.copyInto(segment.data, sink, i, segment.pos, segment.pos + iMin);
        segment.pos += iMin;
        buffer.setSize$okio(buffer.size() - iMin);
        if (segment.pos == segment.limit) {
            buffer.head = segment.pop();
            SegmentPool.recycle(segment);
        }
        return iMin;
    }

    public static final long commonReadDecimalLong(Buffer buffer) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (buffer.size() == 0) {
            throw new EOFException();
        }
        long j = -7;
        int i = 0;
        long j2 = 0;
        boolean z = false;
        boolean z2 = false;
        do {
            Segment segment = buffer.head;
            Intrinsics.checkNotNull(segment);
            byte[] bArr = segment.data;
            int i2 = segment.pos;
            int i3 = segment.limit;
            while (i2 < i3) {
                byte b = bArr[i2];
                byte b2 = (byte) 48;
                if (b >= b2 && b <= ((byte) 57)) {
                    int i4 = b2 - b;
                    if (j2 < OVERFLOW_ZONE || (j2 == OVERFLOW_ZONE && i4 < j)) {
                        Buffer bufferWriteByte = new Buffer().writeDecimalLong(j2).writeByte((int) b);
                        if (!z) {
                            bufferWriteByte.readByte();
                        }
                        throw new NumberFormatException(Intrinsics.stringPlus("Number too large: ", bufferWriteByte.readUtf8()));
                    }
                    j2 = (j2 * 10) + i4;
                } else {
                    if (b != ((byte) 45) || i != 0) {
                        z2 = true;
                        break;
                    }
                    j--;
                    z = true;
                }
                i2++;
                i++;
            }
            if (i2 == i3) {
                buffer.head = segment.pop();
                SegmentPool.recycle(segment);
            } else {
                segment.pos = i2;
            }
            if (z2) {
                break;
            }
        } while (buffer.head != null);
        buffer.setSize$okio(buffer.size() - i);
        if (i >= (z ? 2 : 1)) {
            return z ? j2 : -j2;
        }
        if (buffer.size() == 0) {
            throw new EOFException();
        }
        throw new NumberFormatException((z ? "Expected a digit" : "Expected a digit or '-'") + " but was 0x" + _UtilKt.toHexString(buffer.getByte(0L)));
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009d A[EDGE_INSN: B:43:0x009d->B:37:0x009d BREAK  A[LOOP:0: B:5:0x0012->B:45:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long commonReadHexadecimalUnsignedLong(okio.Buffer r14) throws java.io.EOFException {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            long r0 = r14.size()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto La7
            r0 = 0
            r1 = r0
            r4 = r2
        L12:
            okio.Segment r6 = r14.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
            byte[] r7 = r6.data
            int r8 = r6.pos
            int r9 = r6.limit
        L1d:
            if (r8 >= r9) goto L89
            r10 = r7[r8]
            r11 = 48
            byte r11 = (byte) r11
            if (r10 < r11) goto L2e
            r12 = 57
            byte r12 = (byte) r12
            if (r10 > r12) goto L2e
            int r11 = r10 - r11
            goto L48
        L2e:
            r11 = 97
            byte r11 = (byte) r11
            if (r10 < r11) goto L3d
            r12 = 102(0x66, float:1.43E-43)
            byte r12 = (byte) r12
            if (r10 > r12) goto L3d
        L38:
            int r11 = r10 - r11
            int r11 = r11 + 10
            goto L48
        L3d:
            r11 = 65
            byte r11 = (byte) r11
            if (r10 < r11) goto L75
            r12 = 70
            byte r12 = (byte) r12
            if (r10 > r12) goto L75
            goto L38
        L48:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L58
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L1d
        L58:
            okio.Buffer r14 = new okio.Buffer
            r14.<init>()
            okio.Buffer r14 = r14.writeHexadecimalUnsignedLong(r4)
            okio.Buffer r14 = r14.writeByte(r10)
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r14 = r14.readUtf8()
            java.lang.String r1 = "Number too large: "
            java.lang.String r14 = kotlin.jvm.internal.Intrinsics.stringPlus(r1, r14)
            r0.<init>(r14)
            throw r0
        L75:
            if (r0 == 0) goto L79
            r1 = 1
            goto L89
        L79:
            java.lang.NumberFormatException r14 = new java.lang.NumberFormatException
            java.lang.String r0 = okio._UtilKt.toHexString(r10)
            java.lang.String r1 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.String r0 = kotlin.jvm.internal.Intrinsics.stringPlus(r1, r0)
            r14.<init>(r0)
            throw r14
        L89:
            if (r8 != r9) goto L95
            okio.Segment r7 = r6.pop()
            r14.head = r7
            okio.SegmentPool.recycle(r6)
            goto L97
        L95:
            r6.pos = r8
        L97:
            if (r1 != 0) goto L9d
            okio.Segment r6 = r14.head
            if (r6 != 0) goto L12
        L9d:
            long r1 = r14.size()
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.setSize$okio(r1)
            return r4
        La7:
            java.io.EOFException r14 = new java.io.EOFException
            r14.<init>()
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.internal._BufferKt.commonReadHexadecimalUnsignedLong(okio.Buffer):long");
    }

    public static final ByteString commonReadByteString(Buffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        return buffer.readByteString(buffer.size());
    }

    public static final ByteString commonReadByteString(Buffer buffer, long j) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (!(j >= 0 && j <= 2147483647L)) {
            throw new IllegalArgumentException(Intrinsics.stringPlus("byteCount: ", Long.valueOf(j)).toString());
        }
        if (buffer.size() < j) {
            throw new EOFException();
        }
        if (j >= PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) {
            ByteString byteStringSnapshot = buffer.snapshot((int) j);
            buffer.skip(j);
            return byteStringSnapshot;
        }
        return new ByteString(buffer.readByteArray(j));
    }

    public static final int commonSelect(Buffer buffer, Options options) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        int iSelectPrefix$default = selectPrefix$default(buffer, options, false, 2, null);
        if (iSelectPrefix$default == -1) {
            return -1;
        }
        buffer.skip(options.getByteStrings()[iSelectPrefix$default].size());
        return iSelectPrefix$default;
    }

    public static final void commonReadFully(Buffer buffer, Buffer sink, long j) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (buffer.size() < j) {
            sink.write(buffer, buffer.size());
            throw new EOFException();
        }
        sink.write(buffer, j);
    }

    public static final long commonReadAll(Buffer buffer, Sink sink) throws IOException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(sink, "sink");
        long size = buffer.size();
        if (size > 0) {
            sink.write(buffer, size);
        }
        return size;
    }

    public static final String commonReadUtf8(Buffer buffer, long j) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (!(j >= 0 && j <= 2147483647L)) {
            throw new IllegalArgumentException(Intrinsics.stringPlus("byteCount: ", Long.valueOf(j)).toString());
        }
        if (buffer.size() < j) {
            throw new EOFException();
        }
        if (j == 0) {
            return "";
        }
        Segment segment = buffer.head;
        Intrinsics.checkNotNull(segment);
        if (segment.pos + j > segment.limit) {
            return _Utf8Kt.commonToUtf8String$default(buffer.readByteArray(j), 0, 0, 3, null);
        }
        int i = (int) j;
        String strCommonToUtf8String = _Utf8Kt.commonToUtf8String(segment.data, segment.pos, segment.pos + i);
        segment.pos += i;
        buffer.setSize$okio(buffer.size() - j);
        if (segment.pos == segment.limit) {
            buffer.head = segment.pop();
            SegmentPool.recycle(segment);
        }
        return strCommonToUtf8String;
    }

    public static final String commonReadUtf8Line(Buffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        long jIndexOf = buffer.indexOf((byte) 10);
        if (jIndexOf != -1) {
            return readUtf8Line(buffer, jIndexOf);
        }
        if (buffer.size() != 0) {
            return buffer.readUtf8(buffer.size());
        }
        return null;
    }

    public static final String commonReadUtf8LineStrict(Buffer buffer, long j) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (!(j >= 0)) {
            throw new IllegalArgumentException(Intrinsics.stringPlus("limit < 0: ", Long.valueOf(j)).toString());
        }
        long j2 = j != Long.MAX_VALUE ? j + 1 : Long.MAX_VALUE;
        byte b = (byte) 10;
        long jIndexOf = buffer.indexOf(b, 0L, j2);
        if (jIndexOf != -1) {
            return readUtf8Line(buffer, jIndexOf);
        }
        if (j2 < buffer.size() && buffer.getByte(j2 - 1) == ((byte) 13) && buffer.getByte(j2) == b) {
            return readUtf8Line(buffer, j2);
        }
        Buffer buffer2 = new Buffer();
        buffer.copyTo(buffer2, 0L, Math.min(32, buffer.size()));
        throw new EOFException("\\n not found: limit=" + Math.min(buffer.size(), j) + " content=" + buffer2.readByteString().hex() + Typography.ellipsis);
    }

    public static final int commonReadUtf8CodePoint(Buffer buffer) throws EOFException {
        int i;
        int i2;
        int i3;
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (buffer.size() == 0) {
            throw new EOFException();
        }
        byte b = buffer.getByte(0L);
        boolean z = false;
        if ((b & 128) == 0) {
            i = b & Byte.MAX_VALUE;
            i3 = 0;
            i2 = 1;
        } else if ((b & 224) == 192) {
            i = b & 31;
            i2 = 2;
            i3 = 128;
        } else if ((b & 240) == 224) {
            i = b & 15;
            i2 = 3;
            i3 = 2048;
        } else {
            if ((b & 248) != 240) {
                buffer.skip(1L);
                return Utf8.REPLACEMENT_CODE_POINT;
            }
            i = b & 7;
            i2 = 4;
            i3 = 65536;
        }
        long j = i2;
        if (buffer.size() < j) {
            throw new EOFException("size < " + i2 + ": " + buffer.size() + " (to read code point prefixed 0x" + _UtilKt.toHexString(b) + ')');
        }
        if (1 < i2) {
            int i4 = 1;
            while (true) {
                int i5 = i4 + 1;
                long j2 = i4;
                byte b2 = buffer.getByte(j2);
                if ((b2 & 192) != 128) {
                    buffer.skip(j2);
                    return Utf8.REPLACEMENT_CODE_POINT;
                }
                i = (i << 6) | (b2 & Utf8.REPLACEMENT_BYTE);
                if (i5 >= i2) {
                    break;
                }
                i4 = i5;
            }
        }
        buffer.skip(j);
        if (i > 1114111) {
            return Utf8.REPLACEMENT_CODE_POINT;
        }
        if (55296 <= i && i <= 57343) {
            z = true;
        }
        return (!z && i >= i3) ? i : Utf8.REPLACEMENT_CODE_POINT;
    }

    public static final Buffer commonWriteUtf8(Buffer buffer, String string, int i, int i2) {
        char cCharAt;
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(string, "string");
        if (!(i >= 0)) {
            throw new IllegalArgumentException(Intrinsics.stringPlus("beginIndex < 0: ", Integer.valueOf(i)).toString());
        }
        if (!(i2 >= i)) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i2 + " < " + i).toString());
        }
        if (!(i2 <= string.length())) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i2 + " > " + string.length()).toString());
        }
        while (i < i2) {
            char cCharAt2 = string.charAt(i);
            if (cCharAt2 < 128) {
                Segment segmentWritableSegment$okio = buffer.writableSegment$okio(1);
                byte[] bArr = segmentWritableSegment$okio.data;
                int i3 = segmentWritableSegment$okio.limit - i;
                int iMin = Math.min(i2, 8192 - i3);
                int i4 = i + 1;
                bArr[i + i3] = (byte) cCharAt2;
                while (true) {
                    i = i4;
                    if (i >= iMin || (cCharAt = string.charAt(i)) >= 128) {
                        break;
                    }
                    i4 = i + 1;
                    bArr[i + i3] = (byte) cCharAt;
                }
                int i5 = (i3 + i) - segmentWritableSegment$okio.limit;
                segmentWritableSegment$okio.limit += i5;
                buffer.setSize$okio(buffer.size() + i5);
            } else {
                if (cCharAt2 < 2048) {
                    Segment segmentWritableSegment$okio2 = buffer.writableSegment$okio(2);
                    segmentWritableSegment$okio2.data[segmentWritableSegment$okio2.limit] = (byte) ((cCharAt2 >> 6) | 192);
                    segmentWritableSegment$okio2.data[segmentWritableSegment$okio2.limit + 1] = (byte) ((cCharAt2 & '?') | 128);
                    segmentWritableSegment$okio2.limit += 2;
                    buffer.setSize$okio(buffer.size() + 2);
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    Segment segmentWritableSegment$okio3 = buffer.writableSegment$okio(3);
                    segmentWritableSegment$okio3.data[segmentWritableSegment$okio3.limit] = (byte) ((cCharAt2 >> '\f') | 224);
                    segmentWritableSegment$okio3.data[segmentWritableSegment$okio3.limit + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    segmentWritableSegment$okio3.data[segmentWritableSegment$okio3.limit + 2] = (byte) ((cCharAt2 & '?') | 128);
                    segmentWritableSegment$okio3.limit += 3;
                    buffer.setSize$okio(buffer.size() + 3);
                } else {
                    int i6 = i + 1;
                    char cCharAt3 = i6 < i2 ? string.charAt(i6) : (char) 0;
                    if (cCharAt2 <= 56319) {
                        if (56320 <= cCharAt3 && cCharAt3 <= 57343) {
                            int i7 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                            Segment segmentWritableSegment$okio4 = buffer.writableSegment$okio(4);
                            segmentWritableSegment$okio4.data[segmentWritableSegment$okio4.limit] = (byte) ((i7 >> 18) | 240);
                            segmentWritableSegment$okio4.data[segmentWritableSegment$okio4.limit + 1] = (byte) (((i7 >> 12) & 63) | 128);
                            segmentWritableSegment$okio4.data[segmentWritableSegment$okio4.limit + 2] = (byte) (((i7 >> 6) & 63) | 128);
                            segmentWritableSegment$okio4.data[segmentWritableSegment$okio4.limit + 3] = (byte) ((i7 & 63) | 128);
                            segmentWritableSegment$okio4.limit += 4;
                            buffer.setSize$okio(buffer.size() + 4);
                            i += 2;
                        }
                    }
                    buffer.writeByte(63);
                    i = i6;
                }
                i++;
            }
        }
        return buffer;
    }

    public static final Buffer commonWriteUtf8CodePoint(Buffer buffer, int i) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (i < 128) {
            buffer.writeByte(i);
        } else if (i < 2048) {
            Segment segmentWritableSegment$okio = buffer.writableSegment$okio(2);
            segmentWritableSegment$okio.data[segmentWritableSegment$okio.limit] = (byte) ((i >> 6) | 192);
            segmentWritableSegment$okio.data[segmentWritableSegment$okio.limit + 1] = (byte) ((i & 63) | 128);
            segmentWritableSegment$okio.limit += 2;
            buffer.setSize$okio(buffer.size() + 2);
        } else {
            boolean z = false;
            if (55296 <= i && i <= 57343) {
                z = true;
            }
            if (z) {
                buffer.writeByte(63);
            } else if (i < 65536) {
                Segment segmentWritableSegment$okio2 = buffer.writableSegment$okio(3);
                segmentWritableSegment$okio2.data[segmentWritableSegment$okio2.limit] = (byte) ((i >> 12) | 224);
                segmentWritableSegment$okio2.data[segmentWritableSegment$okio2.limit + 1] = (byte) (((i >> 6) & 63) | 128);
                segmentWritableSegment$okio2.data[segmentWritableSegment$okio2.limit + 2] = (byte) ((i & 63) | 128);
                segmentWritableSegment$okio2.limit += 3;
                buffer.setSize$okio(buffer.size() + 3);
            } else if (i <= 1114111) {
                Segment segmentWritableSegment$okio3 = buffer.writableSegment$okio(4);
                segmentWritableSegment$okio3.data[segmentWritableSegment$okio3.limit] = (byte) ((i >> 18) | 240);
                segmentWritableSegment$okio3.data[segmentWritableSegment$okio3.limit + 1] = (byte) (((i >> 12) & 63) | 128);
                segmentWritableSegment$okio3.data[segmentWritableSegment$okio3.limit + 2] = (byte) (((i >> 6) & 63) | 128);
                segmentWritableSegment$okio3.data[segmentWritableSegment$okio3.limit + 3] = (byte) ((i & 63) | 128);
                segmentWritableSegment$okio3.limit += 4;
                buffer.setSize$okio(buffer.size() + 4);
            } else {
                throw new IllegalArgumentException(Intrinsics.stringPlus("Unexpected code point: 0x", _UtilKt.toHexString(i)));
            }
        }
        return buffer;
    }

    public static final long commonWriteAll(Buffer buffer, Source source) throws IOException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        long j = 0;
        while (true) {
            long j2 = source.read(buffer, PlaybackStateCompat.ACTION_PLAY_FROM_URI);
            if (j2 == -1) {
                return j;
            }
            j += j2;
        }
    }

    public static final Buffer commonWrite(Buffer buffer, Source source, long j) throws IOException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        while (j > 0) {
            long j2 = source.read(buffer, j);
            if (j2 == -1) {
                throw new EOFException();
            }
            j -= j2;
        }
        return buffer;
    }

    public static final Buffer commonWriteByte(Buffer buffer, int i) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Segment segmentWritableSegment$okio = buffer.writableSegment$okio(1);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i2 = segmentWritableSegment$okio.limit;
        segmentWritableSegment$okio.limit = i2 + 1;
        bArr[i2] = (byte) i;
        buffer.setSize$okio(buffer.size() + 1);
        return buffer;
    }

    public static final Buffer commonWriteShort(Buffer buffer, int i) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Segment segmentWritableSegment$okio = buffer.writableSegment$okio(2);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i2 = segmentWritableSegment$okio.limit;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i3] = (byte) (i & 255);
        segmentWritableSegment$okio.limit = i3 + 1;
        buffer.setSize$okio(buffer.size() + 2);
        return buffer;
    }

    public static final Buffer commonWriteInt(Buffer buffer, int i) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Segment segmentWritableSegment$okio = buffer.writableSegment$okio(4);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i2 = segmentWritableSegment$okio.limit;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i >>> 16) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i >>> 8) & 255);
        bArr[i5] = (byte) (i & 255);
        segmentWritableSegment$okio.limit = i5 + 1;
        buffer.setSize$okio(buffer.size() + 4);
        return buffer;
    }

    public static final Buffer commonWriteLong(Buffer buffer, long j) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Segment segmentWritableSegment$okio = buffer.writableSegment$okio(8);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i = segmentWritableSegment$okio.limit;
        int i2 = i + 1;
        bArr[i] = (byte) ((j >>> 56) & 255);
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((j >>> 48) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((j >>> 40) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((j >>> 32) & 255);
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((j >>> 24) & 255);
        int i7 = i6 + 1;
        bArr[i6] = (byte) ((j >>> 16) & 255);
        int i8 = i7 + 1;
        bArr[i7] = (byte) ((j >>> 8) & 255);
        bArr[i8] = (byte) (j & 255);
        segmentWritableSegment$okio.limit = i8 + 1;
        buffer.setSize$okio(buffer.size() + 8);
        return buffer;
    }

    public static final void commonWrite(Buffer buffer, Buffer source, long j) {
        Segment segment;
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        if (!(source != buffer)) {
            throw new IllegalArgumentException("source == this".toString());
        }
        _UtilKt.checkOffsetAndCount(source.size(), 0L, j);
        while (j > 0) {
            Segment segment2 = source.head;
            Intrinsics.checkNotNull(segment2);
            int i = segment2.limit;
            Intrinsics.checkNotNull(source.head);
            if (j < i - r2.pos) {
                if (buffer.head != null) {
                    Segment segment3 = buffer.head;
                    Intrinsics.checkNotNull(segment3);
                    segment = segment3.prev;
                } else {
                    segment = null;
                }
                if (segment != null && segment.owner) {
                    if ((segment.limit + j) - (segment.shared ? 0 : segment.pos) <= PlaybackStateCompat.ACTION_PLAY_FROM_URI) {
                        Segment segment4 = source.head;
                        Intrinsics.checkNotNull(segment4);
                        segment4.writeTo(segment, (int) j);
                        source.setSize$okio(source.size() - j);
                        buffer.setSize$okio(buffer.size() + j);
                        return;
                    }
                }
                Segment segment5 = source.head;
                Intrinsics.checkNotNull(segment5);
                source.head = segment5.split((int) j);
            }
            Segment segment6 = source.head;
            Intrinsics.checkNotNull(segment6);
            long j2 = segment6.limit - segment6.pos;
            source.head = segment6.pop();
            if (buffer.head == null) {
                buffer.head = segment6;
                segment6.prev = segment6;
                segment6.next = segment6.prev;
            } else {
                Segment segment7 = buffer.head;
                Intrinsics.checkNotNull(segment7);
                Segment segment8 = segment7.prev;
                Intrinsics.checkNotNull(segment8);
                segment8.push(segment6).compact();
            }
            source.setSize$okio(source.size() - j2);
            buffer.setSize$okio(buffer.size() + j2);
            j -= j2;
        }
    }

    public static final long commonRead(Buffer buffer, Buffer sink, long j) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (!(j >= 0)) {
            throw new IllegalArgumentException(Intrinsics.stringPlus("byteCount < 0: ", Long.valueOf(j)).toString());
        }
        if (buffer.size() == 0) {
            return -1L;
        }
        if (j > buffer.size()) {
            j = buffer.size();
        }
        sink.write(buffer, j);
        return j;
    }

    public static final long commonIndexOf(Buffer buffer, byte b, long j, long j2) {
        int i;
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        long size = 0;
        boolean z = false;
        if (0 <= j && j <= j2) {
            z = true;
        }
        if (!z) {
            throw new IllegalArgumentException(("size=" + buffer.size() + " fromIndex=" + j + " toIndex=" + j2).toString());
        }
        if (j2 > buffer.size()) {
            j2 = buffer.size();
        }
        long j3 = j2;
        if (j == j3) {
            return -1L;
        }
        Segment segment = buffer.head;
        if (segment == null) {
            return -1L;
        }
        if (buffer.size() - j < j) {
            size = buffer.size();
            while (size > j) {
                segment = segment.prev;
                Intrinsics.checkNotNull(segment);
                size -= segment.limit - segment.pos;
            }
            if (segment == null) {
                return -1L;
            }
            while (size < j3) {
                byte[] bArr = segment.data;
                int iMin = (int) Math.min(segment.limit, (segment.pos + j3) - size);
                i = (int) ((segment.pos + j) - size);
                while (i < iMin) {
                    if (bArr[i] != b) {
                        i++;
                    }
                }
                size += segment.limit - segment.pos;
                segment = segment.next;
                Intrinsics.checkNotNull(segment);
                j = size;
            }
            return -1L;
        }
        while (true) {
            long j4 = (segment.limit - segment.pos) + size;
            if (j4 > j) {
                break;
            }
            segment = segment.next;
            Intrinsics.checkNotNull(segment);
            size = j4;
        }
        if (segment == null) {
            return -1L;
        }
        while (size < j3) {
            byte[] bArr2 = segment.data;
            int iMin2 = (int) Math.min(segment.limit, (segment.pos + j3) - size);
            i = (int) ((segment.pos + j) - size);
            while (i < iMin2) {
                if (bArr2[i] != b) {
                    i++;
                }
            }
            size += segment.limit - segment.pos;
            segment = segment.next;
            Intrinsics.checkNotNull(segment);
            j = size;
        }
        return -1L;
        return (i - segment.pos) + size;
    }

    public static final long commonIndexOf(Buffer buffer, ByteString bytes, long j) {
        long j2;
        Segment segment;
        int i;
        boolean z;
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        boolean z2 = true;
        if (!(bytes.size() > 0)) {
            throw new IllegalArgumentException("bytes is empty".toString());
        }
        long j3 = 0;
        if (!(j >= 0)) {
            throw new IllegalArgumentException(Intrinsics.stringPlus("fromIndex < 0: ", Long.valueOf(j)).toString());
        }
        Segment segment2 = buffer.head;
        long j4 = -1;
        if (segment2 == null) {
            return -1L;
        }
        if (buffer.size() - j < j) {
            long size = buffer.size();
            while (size > j) {
                segment2 = segment2.prev;
                Intrinsics.checkNotNull(segment2);
                size -= segment2.limit - segment2.pos;
            }
            if (segment2 == null) {
                return -1L;
            }
            byte[] bArrInternalArray$okio = bytes.internalArray$okio();
            byte b = bArrInternalArray$okio[0];
            int size2 = bytes.size();
            long size3 = (buffer.size() - size2) + 1;
            j2 = size;
            segment = segment2;
            long j5 = j;
            loop1: while (j2 < size3) {
                byte[] bArr = segment.data;
                int iMin = (int) Math.min(segment.limit, (segment.pos + size3) - j2);
                i = (int) ((segment.pos + j5) - j2);
                if (i < iMin) {
                    while (true) {
                        int i2 = i + 1;
                        if (bArr[i] == b && rangeEquals(segment, i2, bArrInternalArray$okio, 1, size2)) {
                            break loop1;
                        }
                        if (i2 >= iMin) {
                            break;
                        }
                        i = i2;
                    }
                }
                j2 += segment.limit - segment.pos;
                segment = segment.next;
                Intrinsics.checkNotNull(segment);
                j5 = j2;
                j4 = -1;
            }
            return j4;
        }
        while (true) {
            long j6 = (segment2.limit - segment2.pos) + j3;
            if (j6 > j) {
                break;
            }
            segment2 = segment2.next;
            Intrinsics.checkNotNull(segment2);
            j3 = j6;
            z2 = z2;
        }
        if (segment2 == null) {
            return -1L;
        }
        byte[] bArrInternalArray$okio2 = bytes.internalArray$okio();
        byte b2 = bArrInternalArray$okio2[0];
        int size4 = bytes.size();
        long size5 = (buffer.size() - size4) + 1;
        j2 = j3;
        Segment segment3 = segment2;
        long j7 = j;
        loop4: while (j2 < size5) {
            byte[] bArr2 = segment3.data;
            int iMin2 = (int) Math.min(segment3.limit, (segment3.pos + size5) - j2);
            segment = segment3;
            i = (int) ((segment.pos + j7) - j2);
            if (i < iMin2) {
                while (true) {
                    int i3 = i + 1;
                    z = true;
                    if (bArr2[i] == b2 && rangeEquals(segment, i3, bArrInternalArray$okio2, 1, size4)) {
                        break loop4;
                    }
                    if (i3 >= iMin2) {
                        break;
                    }
                    i = i3;
                }
            } else {
                z = true;
            }
            j2 += segment.limit - segment.pos;
            segment3 = segment.next;
            Intrinsics.checkNotNull(segment3);
            j7 = j2;
        }
        return -1L;
        return (i - segment.pos) + j2;
    }

    public static final boolean commonRangeEquals(Buffer buffer, long j, ByteString bytes, int i, int i2) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (j < 0 || i < 0 || i2 < 0 || buffer.size() - j < i2 || bytes.size() - i < i2) {
            return false;
        }
        if (i2 <= 0) {
            return true;
        }
        int i3 = 0;
        while (true) {
            int i4 = i3 + 1;
            if (buffer.getByte(i3 + j) != bytes.getByte(i3 + i)) {
                return false;
            }
            if (i4 >= i2) {
                return true;
            }
            i3 = i4;
        }
    }

    public static final boolean commonEquals(Buffer buffer, Object obj) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (buffer == obj) {
            return true;
        }
        if (!(obj instanceof Buffer)) {
            return false;
        }
        Buffer buffer2 = (Buffer) obj;
        if (buffer.size() != buffer2.size()) {
            return false;
        }
        if (buffer.size() == 0) {
            return true;
        }
        Segment segment = buffer.head;
        Intrinsics.checkNotNull(segment);
        Segment segment2 = buffer2.head;
        Intrinsics.checkNotNull(segment2);
        int i = segment.pos;
        int i2 = segment2.pos;
        long j = 0;
        while (j < buffer.size()) {
            long jMin = Math.min(segment.limit - i, segment2.limit - i2);
            if (0 < jMin) {
                long j2 = 0;
                while (true) {
                    j2++;
                    int i3 = i + 1;
                    int i4 = i2 + 1;
                    if (segment.data[i] != segment2.data[i2]) {
                        return false;
                    }
                    if (j2 >= jMin) {
                        i = i3;
                        i2 = i4;
                        break;
                    }
                    i = i3;
                    i2 = i4;
                }
            }
            if (i == segment.limit) {
                segment = segment.next;
                Intrinsics.checkNotNull(segment);
                i = segment.pos;
            }
            if (i2 == segment2.limit) {
                segment2 = segment2.next;
                Intrinsics.checkNotNull(segment2);
                i2 = segment2.pos;
            }
            j += jMin;
        }
        return true;
    }

    public static final int commonHashCode(Buffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Segment segment = buffer.head;
        if (segment == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = segment.limit;
            for (int i3 = segment.pos; i3 < i2; i3++) {
                i = (i * 31) + segment.data[i3];
            }
            segment = segment.next;
            Intrinsics.checkNotNull(segment);
        } while (segment != buffer.head);
        return i;
    }

    public static final Buffer commonCopy(Buffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Buffer buffer2 = new Buffer();
        if (buffer.size() == 0) {
            return buffer2;
        }
        Segment segment = buffer.head;
        Intrinsics.checkNotNull(segment);
        Segment segmentSharedCopy = segment.sharedCopy();
        buffer2.head = segmentSharedCopy;
        segmentSharedCopy.prev = buffer2.head;
        segmentSharedCopy.next = segmentSharedCopy.prev;
        for (Segment segment2 = segment.next; segment2 != segment; segment2 = segment2.next) {
            Segment segment3 = segmentSharedCopy.prev;
            Intrinsics.checkNotNull(segment3);
            Intrinsics.checkNotNull(segment2);
            segment3.push(segment2.sharedCopy());
        }
        buffer2.setSize$okio(buffer.size());
        return buffer2;
    }

    public static final ByteString commonSnapshot(Buffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (!(buffer.size() <= 2147483647L)) {
            throw new IllegalStateException(Intrinsics.stringPlus("size > Int.MAX_VALUE: ", Long.valueOf(buffer.size())).toString());
        }
        return buffer.snapshot((int) buffer.size());
    }

    public static final ByteString commonSnapshot(Buffer buffer, int i) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (i == 0) {
            return ByteString.EMPTY;
        }
        _UtilKt.checkOffsetAndCount(buffer.size(), 0L, i);
        Segment segment = buffer.head;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Intrinsics.checkNotNull(segment);
            if (segment.limit == segment.pos) {
                throw new AssertionError("s.limit == s.pos");
            }
            i3 += segment.limit - segment.pos;
            i4++;
            segment = segment.next;
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[i4 * 2];
        Segment segment2 = buffer.head;
        int i5 = 0;
        while (i2 < i) {
            Intrinsics.checkNotNull(segment2);
            bArr[i5] = segment2.data;
            i2 += segment2.limit - segment2.pos;
            iArr[i5] = Math.min(i2, i);
            iArr[bArr.length + i5] = segment2.pos;
            segment2.shared = true;
            i5++;
            segment2 = segment2.next;
        }
        return new SegmentedByteString(bArr, iArr);
    }

    public static final Buffer.UnsafeCursor commonReadUnsafe(Buffer buffer, Buffer.UnsafeCursor unsafeCursor) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(unsafeCursor, "unsafeCursor");
        Buffer.UnsafeCursor unsafeCursorResolveDefaultParameter = _UtilKt.resolveDefaultParameter(unsafeCursor);
        if (!(unsafeCursorResolveDefaultParameter.buffer == null)) {
            throw new IllegalStateException("already attached to a buffer".toString());
        }
        unsafeCursorResolveDefaultParameter.buffer = buffer;
        unsafeCursorResolveDefaultParameter.readWrite = false;
        return unsafeCursorResolveDefaultParameter;
    }

    public static final Buffer.UnsafeCursor commonReadAndWriteUnsafe(Buffer buffer, Buffer.UnsafeCursor unsafeCursor) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(unsafeCursor, "unsafeCursor");
        Buffer.UnsafeCursor unsafeCursorResolveDefaultParameter = _UtilKt.resolveDefaultParameter(unsafeCursor);
        if (!(unsafeCursorResolveDefaultParameter.buffer == null)) {
            throw new IllegalStateException("already attached to a buffer".toString());
        }
        unsafeCursorResolveDefaultParameter.buffer = buffer;
        unsafeCursorResolveDefaultParameter.readWrite = true;
        return unsafeCursorResolveDefaultParameter;
    }

    public static final int commonNext(Buffer.UnsafeCursor unsafeCursor) {
        Intrinsics.checkNotNullParameter(unsafeCursor, "<this>");
        long j = unsafeCursor.offset;
        Buffer buffer = unsafeCursor.buffer;
        Intrinsics.checkNotNull(buffer);
        if (j != buffer.size()) {
            return unsafeCursor.seek(unsafeCursor.offset == -1 ? 0L : unsafeCursor.offset + (unsafeCursor.end - unsafeCursor.start));
        }
        throw new IllegalStateException("no more bytes".toString());
    }

    public static final int commonSeek(Buffer.UnsafeCursor unsafeCursor, long j) {
        Intrinsics.checkNotNullParameter(unsafeCursor, "<this>");
        Buffer buffer = unsafeCursor.buffer;
        if (buffer == null) {
            throw new IllegalStateException("not attached to a buffer".toString());
        }
        if (j < -1 || j > buffer.size()) {
            throw new ArrayIndexOutOfBoundsException("offset=" + j + " > size=" + buffer.size());
        }
        if (j == -1 || j == buffer.size()) {
            unsafeCursor.setSegment$okio(null);
            unsafeCursor.offset = j;
            unsafeCursor.data = null;
            unsafeCursor.start = -1;
            unsafeCursor.end = -1;
            return -1;
        }
        long j2 = 0;
        long size = buffer.size();
        Segment segmentPush = buffer.head;
        Segment segment = buffer.head;
        if (unsafeCursor.getSegment() != null) {
            long j3 = unsafeCursor.offset;
            int i = unsafeCursor.start;
            Intrinsics.checkNotNull(unsafeCursor.getSegment());
            long j4 = j3 - (i - r10.pos);
            if (j4 > j) {
                segment = unsafeCursor.getSegment();
                size = j4;
            } else {
                segmentPush = unsafeCursor.getSegment();
                j2 = j4;
            }
        }
        if (size - j > j - j2) {
            while (true) {
                Intrinsics.checkNotNull(segmentPush);
                if (j < (segmentPush.limit - segmentPush.pos) + j2) {
                    break;
                }
                j2 += segmentPush.limit - segmentPush.pos;
                segmentPush = segmentPush.next;
            }
        } else {
            while (size > j) {
                Intrinsics.checkNotNull(segment);
                segment = segment.prev;
                Intrinsics.checkNotNull(segment);
                size -= segment.limit - segment.pos;
            }
            j2 = size;
            segmentPush = segment;
        }
        if (unsafeCursor.readWrite) {
            Intrinsics.checkNotNull(segmentPush);
            if (segmentPush.shared) {
                Segment segmentUnsharedCopy = segmentPush.unsharedCopy();
                if (buffer.head == segmentPush) {
                    buffer.head = segmentUnsharedCopy;
                }
                segmentPush = segmentPush.push(segmentUnsharedCopy);
                Segment segment2 = segmentPush.prev;
                Intrinsics.checkNotNull(segment2);
                segment2.pop();
            }
        }
        unsafeCursor.setSegment$okio(segmentPush);
        unsafeCursor.offset = j;
        Intrinsics.checkNotNull(segmentPush);
        unsafeCursor.data = segmentPush.data;
        unsafeCursor.start = segmentPush.pos + ((int) (j - j2));
        unsafeCursor.end = segmentPush.limit;
        return unsafeCursor.end - unsafeCursor.start;
    }

    public static final long commonResizeBuffer(Buffer.UnsafeCursor unsafeCursor, long j) {
        Intrinsics.checkNotNullParameter(unsafeCursor, "<this>");
        Buffer buffer = unsafeCursor.buffer;
        if (buffer == null) {
            throw new IllegalStateException("not attached to a buffer".toString());
        }
        if (!unsafeCursor.readWrite) {
            throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers".toString());
        }
        long size = buffer.size();
        int i = 1;
        if (j <= size) {
            if (!(j >= 0)) {
                throw new IllegalArgumentException(Intrinsics.stringPlus("newSize < 0: ", Long.valueOf(j)).toString());
            }
            long j2 = size - j;
            while (true) {
                if (j2 <= 0) {
                    break;
                }
                Segment segment = buffer.head;
                Intrinsics.checkNotNull(segment);
                Segment segment2 = segment.prev;
                Intrinsics.checkNotNull(segment2);
                long j3 = segment2.limit - segment2.pos;
                if (j3 <= j2) {
                    buffer.head = segment2.pop();
                    SegmentPool.recycle(segment2);
                    j2 -= j3;
                } else {
                    segment2.limit -= (int) j2;
                    break;
                }
            }
            unsafeCursor.setSegment$okio(null);
            unsafeCursor.offset = j;
            unsafeCursor.data = null;
            unsafeCursor.start = -1;
            unsafeCursor.end = -1;
        } else if (j > size) {
            long j4 = j - size;
            boolean z = true;
            while (j4 > 0) {
                Segment segmentWritableSegment$okio = buffer.writableSegment$okio(i);
                int iMin = (int) Math.min(j4, 8192 - segmentWritableSegment$okio.limit);
                segmentWritableSegment$okio.limit += iMin;
                j4 -= iMin;
                if (z) {
                    unsafeCursor.setSegment$okio(segmentWritableSegment$okio);
                    unsafeCursor.offset = size;
                    unsafeCursor.data = segmentWritableSegment$okio.data;
                    unsafeCursor.start = segmentWritableSegment$okio.limit - iMin;
                    unsafeCursor.end = segmentWritableSegment$okio.limit;
                    z = false;
                }
                i = 1;
            }
        }
        buffer.setSize$okio(j);
        return size;
    }

    public static final long commonExpandBuffer(Buffer.UnsafeCursor unsafeCursor, int i) {
        Intrinsics.checkNotNullParameter(unsafeCursor, "<this>");
        if (!(i > 0)) {
            throw new IllegalArgumentException(Intrinsics.stringPlus("minByteCount <= 0: ", Integer.valueOf(i)).toString());
        }
        if (!(i <= 8192)) {
            throw new IllegalArgumentException(Intrinsics.stringPlus("minByteCount > Segment.SIZE: ", Integer.valueOf(i)).toString());
        }
        Buffer buffer = unsafeCursor.buffer;
        if (buffer == null) {
            throw new IllegalStateException("not attached to a buffer".toString());
        }
        if (!unsafeCursor.readWrite) {
            throw new IllegalStateException("expandBuffer() only permitted for read/write buffers".toString());
        }
        long size = buffer.size();
        Segment segmentWritableSegment$okio = buffer.writableSegment$okio(i);
        int i2 = 8192 - segmentWritableSegment$okio.limit;
        segmentWritableSegment$okio.limit = 8192;
        long j = i2;
        buffer.setSize$okio(size + j);
        unsafeCursor.setSegment$okio(segmentWritableSegment$okio);
        unsafeCursor.offset = size;
        unsafeCursor.data = segmentWritableSegment$okio.data;
        unsafeCursor.start = 8192 - i2;
        unsafeCursor.end = 8192;
        return j;
    }

    public static final void commonClose(Buffer.UnsafeCursor unsafeCursor) {
        Intrinsics.checkNotNullParameter(unsafeCursor, "<this>");
        if (!(unsafeCursor.buffer != null)) {
            throw new IllegalStateException("not attached to a buffer".toString());
        }
        unsafeCursor.buffer = null;
        unsafeCursor.setSegment$okio(null);
        unsafeCursor.offset = -1L;
        unsafeCursor.data = null;
        unsafeCursor.start = -1;
        unsafeCursor.end = -1;
    }

    public static final long commonIndexOfElement(Buffer buffer, ByteString targetBytes, long j) {
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        long size = 0;
        if (!(j >= 0)) {
            throw new IllegalArgumentException(Intrinsics.stringPlus("fromIndex < 0: ", Long.valueOf(j)).toString());
        }
        Segment segment = buffer.head;
        if (segment == null) {
            return -1L;
        }
        if (buffer.size() - j < j) {
            size = buffer.size();
            while (size > j) {
                segment = segment.prev;
                Intrinsics.checkNotNull(segment);
                size -= segment.limit - segment.pos;
            }
            if (segment == null) {
                return -1L;
            }
            if (targetBytes.size() == 2) {
                byte b = targetBytes.getByte(0);
                byte b2 = targetBytes.getByte(1);
                while (size < buffer.size()) {
                    byte[] bArr = segment.data;
                    i = (int) ((segment.pos + j) - size);
                    int i3 = segment.limit;
                    while (i < i3) {
                        byte b3 = bArr[i];
                        if (b3 == b || b3 == b2) {
                            i2 = segment.pos;
                        } else {
                            i++;
                        }
                    }
                    size += segment.limit - segment.pos;
                    segment = segment.next;
                    Intrinsics.checkNotNull(segment);
                    j = size;
                }
            } else {
                byte[] bArrInternalArray$okio = targetBytes.internalArray$okio();
                while (size < buffer.size()) {
                    byte[] bArr2 = segment.data;
                    i = (int) ((segment.pos + j) - size);
                    int i4 = segment.limit;
                    while (i < i4) {
                        byte b4 = bArr2[i];
                        int length = bArrInternalArray$okio.length;
                        int i5 = 0;
                        while (i5 < length) {
                            byte b5 = bArrInternalArray$okio[i5];
                            i5++;
                            if (b4 == b5) {
                                i2 = segment.pos;
                            }
                        }
                        i++;
                    }
                    size += segment.limit - segment.pos;
                    segment = segment.next;
                    Intrinsics.checkNotNull(segment);
                    j = size;
                }
            }
            return -1L;
        }
        while (true) {
            long j2 = (segment.limit - segment.pos) + size;
            if (j2 > j) {
                break;
            }
            segment = segment.next;
            Intrinsics.checkNotNull(segment);
            size = j2;
        }
        if (segment == null) {
            return -1L;
        }
        if (targetBytes.size() == 2) {
            byte b6 = targetBytes.getByte(0);
            byte b7 = targetBytes.getByte(1);
            while (size < buffer.size()) {
                byte[] bArr3 = segment.data;
                i = (int) ((segment.pos + j) - size);
                int i6 = segment.limit;
                while (i < i6) {
                    byte b8 = bArr3[i];
                    if (b8 == b6 || b8 == b7) {
                        i2 = segment.pos;
                    } else {
                        i++;
                    }
                }
                size += segment.limit - segment.pos;
                segment = segment.next;
                Intrinsics.checkNotNull(segment);
                j = size;
            }
        } else {
            byte[] bArrInternalArray$okio2 = targetBytes.internalArray$okio();
            while (size < buffer.size()) {
                byte[] bArr4 = segment.data;
                i = (int) ((segment.pos + j) - size);
                int i7 = segment.limit;
                while (i < i7) {
                    byte b9 = bArr4[i];
                    int length2 = bArrInternalArray$okio2.length;
                    int i8 = 0;
                    while (i8 < length2) {
                        byte b10 = bArrInternalArray$okio2[i8];
                        i8++;
                        if (b9 == b10) {
                            i2 = segment.pos;
                        }
                    }
                    i++;
                }
                size += segment.limit - segment.pos;
                segment = segment.next;
                Intrinsics.checkNotNull(segment);
                j = size;
            }
        }
        return -1L;
        return (i - i2) + size;
    }
}
