package kotlin.internal;

import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import kotlin.Metadata;
import kotlin.UByte$$ExternalSyntheticBackport2;
import kotlin.UByte$$ExternalSyntheticBackport5;
import kotlin.UInt;
import kotlin.ULong;

/* compiled from: UProgressionUtil.kt */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\u0000\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\t\u001a'\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u000f\u0010\u0006\u001a'\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0011\u0010\t¨\u0006\u0012"}, d2 = {"differenceModulo", "Lkotlin/UInt;", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "c", "differenceModulo-WZ9TVnA", "(III)I", "Lkotlin/ULong;", "differenceModulo-sambcqE", "(JJJ)J", "getProgressionLastElement", "start", "end", "step", "", "getProgressionLastElement-Nkh28Cs", "", "getProgressionLastElement-7ftBX0g", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class UProgressionUtilKt {
    /* renamed from: differenceModulo-WZ9TVnA, reason: not valid java name */
    private static final int m2269differenceModuloWZ9TVnA(int i, int i2, int i3) {
        int iM = UByte$$ExternalSyntheticBackport2.m(i, i3);
        int iM2 = UByte$$ExternalSyntheticBackport2.m(i2, i3);
        int iCompare = Integer.compare(iM ^ Integer.MIN_VALUE, iM2 ^ Integer.MIN_VALUE);
        int iM1157constructorimpl = UInt.m1157constructorimpl(iM - iM2);
        return iCompare >= 0 ? iM1157constructorimpl : UInt.m1157constructorimpl(iM1157constructorimpl + i3);
    }

    /* renamed from: differenceModulo-sambcqE, reason: not valid java name */
    private static final long m2270differenceModulosambcqE(long j, long j2, long j3) {
        long jM = UByte$$ExternalSyntheticBackport5.m(j, j3);
        long jM2 = UByte$$ExternalSyntheticBackport5.m(j2, j3);
        int iCompare = Long.compare(jM ^ Long.MIN_VALUE, jM2 ^ Long.MIN_VALUE);
        long jM1236constructorimpl = ULong.m1236constructorimpl(jM - jM2);
        return iCompare >= 0 ? jM1236constructorimpl : ULong.m1236constructorimpl(jM1236constructorimpl + j3);
    }

    /* renamed from: getProgressionLastElement-Nkh28Cs, reason: not valid java name */
    public static final int m2272getProgressionLastElementNkh28Cs(int i, int i2, int i3) {
        if (i3 > 0) {
            return Integer.compare(i ^ Integer.MIN_VALUE, i2 ^ Integer.MIN_VALUE) >= 0 ? i2 : UInt.m1157constructorimpl(i2 - m2269differenceModuloWZ9TVnA(i2, i, UInt.m1157constructorimpl(i3)));
        }
        if (i3 < 0) {
            return Integer.compare(i ^ Integer.MIN_VALUE, i2 ^ Integer.MIN_VALUE) <= 0 ? i2 : UInt.m1157constructorimpl(i2 + m2269differenceModuloWZ9TVnA(i, i2, UInt.m1157constructorimpl(-i3)));
        }
        throw new IllegalArgumentException("Step is zero.");
    }

    /* renamed from: getProgressionLastElement-7ftBX0g, reason: not valid java name */
    public static final long m2271getProgressionLastElement7ftBX0g(long j, long j2, long j3) {
        if (j3 > 0) {
            return Long.compare(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE) >= 0 ? j2 : ULong.m1236constructorimpl(j2 - m2270differenceModulosambcqE(j2, j, ULong.m1236constructorimpl(j3)));
        }
        if (j3 < 0) {
            return Long.compare(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE) <= 0 ? j2 : ULong.m1236constructorimpl(j2 + m2270differenceModulosambcqE(j, j2, ULong.m1236constructorimpl(-j3)));
        }
        throw new IllegalArgumentException("Step is zero.");
    }
}
