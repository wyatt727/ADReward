package kotlin;

import androidx.privacysandbox.ads.adservices.adselection.AdSelectionOutcome$$ExternalSyntheticBackport0;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.ULongRange;
import kotlin.ranges.URangesKt;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: ULong.kt */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0087@\u0018\u0000 ~2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001~B\u0011\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u000eH\u0087\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0011H\u0087\n¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0000H\u0097\n¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0016H\u0087\n¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0005J\u0018\u0010\u001b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u000eH\u0087\n¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u001b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0011H\u0087\n¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010\u001b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b \u0010\u000bJ\u0018\u0010\u001b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0016H\u0087\n¢\u0006\u0004\b!\u0010\"J\u001a\u0010#\u001a\u00020$2\b\u0010\t\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b&\u0010'J\u0018\u0010(\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u000eH\u0087\b¢\u0006\u0004\b)\u0010\u001dJ\u0018\u0010(\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0011H\u0087\b¢\u0006\u0004\b*\u0010\u001fJ\u0018\u0010(\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b+\u0010\u000bJ\u0018\u0010(\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0016H\u0087\b¢\u0006\u0004\b,\u0010\"J\u0010\u0010-\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b.\u0010/J\u0013\u00100\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\b1\u0010\u0005J\u0013\u00102\u001a\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b3\u0010\u0005J\u0018\u00104\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u000eH\u0087\n¢\u0006\u0004\b5\u0010\u001dJ\u0018\u00104\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0011H\u0087\n¢\u0006\u0004\b6\u0010\u001fJ\u0018\u00104\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b7\u0010\u000bJ\u0018\u00104\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0016H\u0087\n¢\u0006\u0004\b8\u0010\"J\u0018\u00109\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u000eH\u0087\b¢\u0006\u0004\b:\u0010;J\u0018\u00109\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\b¢\u0006\u0004\b<\u0010\u0013J\u0018\u00109\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b=\u0010\u000bJ\u0018\u00109\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\u0016H\u0087\b¢\u0006\u0004\b>\u0010?J\u0018\u0010@\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\bA\u0010\u000bJ\u0018\u0010B\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u000eH\u0087\n¢\u0006\u0004\bC\u0010\u001dJ\u0018\u0010B\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0011H\u0087\n¢\u0006\u0004\bD\u0010\u001fJ\u0018\u0010B\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\bE\u0010\u000bJ\u0018\u0010B\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0016H\u0087\n¢\u0006\u0004\bF\u0010\"J\u0018\u0010G\u001a\u00020H2\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\bI\u0010JJ\u0018\u0010K\u001a\u00020H2\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\bL\u0010JJ\u0018\u0010M\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u000eH\u0087\n¢\u0006\u0004\bN\u0010\u001dJ\u0018\u0010M\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0011H\u0087\n¢\u0006\u0004\bO\u0010\u001fJ\u0018\u0010M\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\bP\u0010\u000bJ\u0018\u0010M\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0016H\u0087\n¢\u0006\u0004\bQ\u0010\"J\u001b\u0010R\u001a\u00020\u00002\u0006\u0010S\u001a\u00020\rH\u0087\fø\u0001\u0000¢\u0006\u0004\bT\u0010\u001fJ\u001b\u0010U\u001a\u00020\u00002\u0006\u0010S\u001a\u00020\rH\u0087\fø\u0001\u0000¢\u0006\u0004\bV\u0010\u001fJ\u0018\u0010W\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u000eH\u0087\n¢\u0006\u0004\bX\u0010\u001dJ\u0018\u0010W\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0011H\u0087\n¢\u0006\u0004\bY\u0010\u001fJ\u0018\u0010W\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\bZ\u0010\u000bJ\u0018\u0010W\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0016H\u0087\n¢\u0006\u0004\b[\u0010\"J\u0010\u0010\\\u001a\u00020]H\u0087\b¢\u0006\u0004\b^\u0010_J\u0010\u0010`\u001a\u00020aH\u0087\b¢\u0006\u0004\bb\u0010cJ\u0010\u0010d\u001a\u00020eH\u0087\b¢\u0006\u0004\bf\u0010gJ\u0010\u0010h\u001a\u00020\rH\u0087\b¢\u0006\u0004\bi\u0010/J\u0010\u0010j\u001a\u00020\u0003H\u0087\b¢\u0006\u0004\bk\u0010\u0005J\u0010\u0010l\u001a\u00020mH\u0087\b¢\u0006\u0004\bn\u0010oJ\u000f\u0010p\u001a\u00020qH\u0016¢\u0006\u0004\br\u0010sJ\u0013\u0010t\u001a\u00020\u000eH\u0087\bø\u0001\u0000¢\u0006\u0004\bu\u0010_J\u0013\u0010v\u001a\u00020\u0011H\u0087\bø\u0001\u0000¢\u0006\u0004\bw\u0010/J\u0013\u0010x\u001a\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\by\u0010\u0005J\u0013\u0010z\u001a\u00020\u0016H\u0087\bø\u0001\u0000¢\u0006\u0004\b{\u0010oJ\u0018\u0010|\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\b}\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002\u0092\u0001\u00020\u0003\u0082\u0002\u0004\n\u0002\b!¨\u0006\u007f"}, d2 = {"Lkotlin/ULong;", "", "data", "", "constructor-impl", "(J)J", "getData$annotations", "()V", "and", "other", "and-VKZWuLQ", "(JJ)J", "compareTo", "", "Lkotlin/UByte;", "compareTo-7apg3OU", "(JB)I", "Lkotlin/UInt;", "compareTo-WZ4Q5Ns", "(JI)I", "compareTo-VKZWuLQ", "(JJ)I", "Lkotlin/UShort;", "compareTo-xj2QHRw", "(JS)I", "dec", "dec-s-VKNKU", "div", "div-7apg3OU", "(JB)J", "div-WZ4Q5Ns", "(JI)J", "div-VKZWuLQ", "div-xj2QHRw", "(JS)J", "equals", "", "", "equals-impl", "(JLjava/lang/Object;)Z", "floorDiv", "floorDiv-7apg3OU", "floorDiv-WZ4Q5Ns", "floorDiv-VKZWuLQ", "floorDiv-xj2QHRw", "hashCode", "hashCode-impl", "(J)I", "inc", "inc-s-VKNKU", "inv", "inv-s-VKNKU", "minus", "minus-7apg3OU", "minus-WZ4Q5Ns", "minus-VKZWuLQ", "minus-xj2QHRw", "mod", "mod-7apg3OU", "(JB)B", "mod-WZ4Q5Ns", "mod-VKZWuLQ", "mod-xj2QHRw", "(JS)S", "or", "or-VKZWuLQ", "plus", "plus-7apg3OU", "plus-WZ4Q5Ns", "plus-VKZWuLQ", "plus-xj2QHRw", "rangeTo", "Lkotlin/ranges/ULongRange;", "rangeTo-VKZWuLQ", "(JJ)Lkotlin/ranges/ULongRange;", "rangeUntil", "rangeUntil-VKZWuLQ", "rem", "rem-7apg3OU", "rem-WZ4Q5Ns", "rem-VKZWuLQ", "rem-xj2QHRw", "shl", "bitCount", "shl-s-VKNKU", "shr", "shr-s-VKNKU", "times", "times-7apg3OU", "times-WZ4Q5Ns", "times-VKZWuLQ", "times-xj2QHRw", "toByte", "", "toByte-impl", "(J)B", "toDouble", "", "toDouble-impl", "(J)D", "toFloat", "", "toFloat-impl", "(J)F", "toInt", "toInt-impl", "toLong", "toLong-impl", "toShort", "", "toShort-impl", "(J)S", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "toUByte", "toUByte-w2LRezQ", "toUInt", "toUInt-pVg5ArA", "toULong", "toULong-s-VKNKU", "toUShort", "toUShort-Mh2AYeg", "xor", "xor-VKZWuLQ", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
/* loaded from: classes5.dex */
public final class ULong implements Comparable<ULong> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final long MAX_VALUE = -1;
    public static final long MIN_VALUE = 0;
    public static final int SIZE_BITS = 64;
    public static final int SIZE_BYTES = 8;
    private final long data;

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ULong m1230boximpl(long j) {
        return new ULong(j);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m1236constructorimpl(long j) {
        return j;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1242equalsimpl(long j, Object obj) {
        return (obj instanceof ULong) && j == ((ULong) obj).getData();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1243equalsimpl0(long j, long j2) {
        return j == j2;
    }

    public static /* synthetic */ void getData$annotations() {
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1248hashCodeimpl(long j) {
        return AdSelectionOutcome$$ExternalSyntheticBackport0.m(j);
    }

    /* renamed from: toByte-impl, reason: not valid java name */
    private static final byte m1276toByteimpl(long j) {
        return (byte) j;
    }

    /* renamed from: toInt-impl, reason: not valid java name */
    private static final int m1279toIntimpl(long j) {
        return (int) j;
    }

    /* renamed from: toLong-impl, reason: not valid java name */
    private static final long m1280toLongimpl(long j) {
        return j;
    }

    /* renamed from: toShort-impl, reason: not valid java name */
    private static final short m1281toShortimpl(long j) {
        return (short) j;
    }

    /* renamed from: toULong-s-VKNKU, reason: not valid java name */
    private static final long m1285toULongsVKNKU(long j) {
        return j;
    }

    public boolean equals(Object obj) {
        return m1242equalsimpl(this.data, obj);
    }

    public int hashCode() {
        return m1248hashCodeimpl(this.data);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getData() {
        return this.data;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(ULong uLong) {
        return UnsignedKt.ulongCompare(getData(), uLong.getData());
    }

    private /* synthetic */ ULong(long j) {
        this.data = j;
    }

    /* compiled from: ULong.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u00020\u0004X\u0086Tø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0005R\u0013\u0010\u0006\u001a\u00020\u0004X\u0086Tø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0005R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b!¨\u0006\n"}, d2 = {"Lkotlin/ULong$Companion;", "", "()V", "MAX_VALUE", "Lkotlin/ULong;", "J", "MIN_VALUE", "SIZE_BITS", "", "SIZE_BYTES", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* renamed from: compareTo-7apg3OU, reason: not valid java name */
    private static final int m1231compareTo7apg3OU(long j, byte b) {
        return Long.compare(j ^ Long.MIN_VALUE, m1236constructorimpl(b & 255) ^ Long.MIN_VALUE);
    }

    /* renamed from: compareTo-xj2QHRw, reason: not valid java name */
    private static final int m1235compareToxj2QHRw(long j, short s) {
        return Long.compare(j ^ Long.MIN_VALUE, m1236constructorimpl(s & WebSocketProtocol.PAYLOAD_SHORT_MAX) ^ Long.MIN_VALUE);
    }

    /* renamed from: compareTo-WZ4Q5Ns, reason: not valid java name */
    private static final int m1234compareToWZ4Q5Ns(long j, int i) {
        return Long.compare(j ^ Long.MIN_VALUE, m1236constructorimpl(i & 4294967295L) ^ Long.MIN_VALUE);
    }

    /* renamed from: compareTo-VKZWuLQ, reason: not valid java name */
    private int m1232compareToVKZWuLQ(long j) {
        return UnsignedKt.ulongCompare(getData(), j);
    }

    /* renamed from: compareTo-VKZWuLQ, reason: not valid java name */
    private static int m1233compareToVKZWuLQ(long j, long j2) {
        return UnsignedKt.ulongCompare(j, j2);
    }

    /* renamed from: plus-7apg3OU, reason: not valid java name */
    private static final long m1260plus7apg3OU(long j, byte b) {
        return m1236constructorimpl(j + m1236constructorimpl(b & 255));
    }

    /* renamed from: plus-xj2QHRw, reason: not valid java name */
    private static final long m1263plusxj2QHRw(long j, short s) {
        return m1236constructorimpl(j + m1236constructorimpl(s & WebSocketProtocol.PAYLOAD_SHORT_MAX));
    }

    /* renamed from: plus-WZ4Q5Ns, reason: not valid java name */
    private static final long m1262plusWZ4Q5Ns(long j, int i) {
        return m1236constructorimpl(j + m1236constructorimpl(i & 4294967295L));
    }

    /* renamed from: plus-VKZWuLQ, reason: not valid java name */
    private static final long m1261plusVKZWuLQ(long j, long j2) {
        return m1236constructorimpl(j + j2);
    }

    /* renamed from: minus-7apg3OU, reason: not valid java name */
    private static final long m1251minus7apg3OU(long j, byte b) {
        return m1236constructorimpl(j - m1236constructorimpl(b & 255));
    }

    /* renamed from: minus-xj2QHRw, reason: not valid java name */
    private static final long m1254minusxj2QHRw(long j, short s) {
        return m1236constructorimpl(j - m1236constructorimpl(s & WebSocketProtocol.PAYLOAD_SHORT_MAX));
    }

    /* renamed from: minus-WZ4Q5Ns, reason: not valid java name */
    private static final long m1253minusWZ4Q5Ns(long j, int i) {
        return m1236constructorimpl(j - m1236constructorimpl(i & 4294967295L));
    }

    /* renamed from: minus-VKZWuLQ, reason: not valid java name */
    private static final long m1252minusVKZWuLQ(long j, long j2) {
        return m1236constructorimpl(j - j2);
    }

    /* renamed from: times-7apg3OU, reason: not valid java name */
    private static final long m1272times7apg3OU(long j, byte b) {
        return m1236constructorimpl(j * m1236constructorimpl(b & 255));
    }

    /* renamed from: times-xj2QHRw, reason: not valid java name */
    private static final long m1275timesxj2QHRw(long j, short s) {
        return m1236constructorimpl(j * m1236constructorimpl(s & WebSocketProtocol.PAYLOAD_SHORT_MAX));
    }

    /* renamed from: times-WZ4Q5Ns, reason: not valid java name */
    private static final long m1274timesWZ4Q5Ns(long j, int i) {
        return m1236constructorimpl(j * m1236constructorimpl(i & 4294967295L));
    }

    /* renamed from: times-VKZWuLQ, reason: not valid java name */
    private static final long m1273timesVKZWuLQ(long j, long j2) {
        return m1236constructorimpl(j * j2);
    }

    /* renamed from: div-7apg3OU, reason: not valid java name */
    private static final long m1238div7apg3OU(long j, byte b) {
        return UByte$$ExternalSyntheticBackport4.m(j, m1236constructorimpl(b & 255));
    }

    /* renamed from: div-xj2QHRw, reason: not valid java name */
    private static final long m1241divxj2QHRw(long j, short s) {
        return UByte$$ExternalSyntheticBackport4.m(j, m1236constructorimpl(s & WebSocketProtocol.PAYLOAD_SHORT_MAX));
    }

    /* renamed from: div-WZ4Q5Ns, reason: not valid java name */
    private static final long m1240divWZ4Q5Ns(long j, int i) {
        return UByte$$ExternalSyntheticBackport4.m(j, m1236constructorimpl(i & 4294967295L));
    }

    /* renamed from: div-VKZWuLQ, reason: not valid java name */
    private static final long m1239divVKZWuLQ(long j, long j2) {
        return UnsignedKt.m1415ulongDivideeb3DHEI(j, j2);
    }

    /* renamed from: rem-7apg3OU, reason: not valid java name */
    private static final long m1266rem7apg3OU(long j, byte b) {
        return UByte$$ExternalSyntheticBackport5.m(j, m1236constructorimpl(b & 255));
    }

    /* renamed from: rem-xj2QHRw, reason: not valid java name */
    private static final long m1269remxj2QHRw(long j, short s) {
        return UByte$$ExternalSyntheticBackport5.m(j, m1236constructorimpl(s & WebSocketProtocol.PAYLOAD_SHORT_MAX));
    }

    /* renamed from: rem-WZ4Q5Ns, reason: not valid java name */
    private static final long m1268remWZ4Q5Ns(long j, int i) {
        return UByte$$ExternalSyntheticBackport5.m(j, m1236constructorimpl(i & 4294967295L));
    }

    /* renamed from: rem-VKZWuLQ, reason: not valid java name */
    private static final long m1267remVKZWuLQ(long j, long j2) {
        return UnsignedKt.m1416ulongRemaindereb3DHEI(j, j2);
    }

    /* renamed from: floorDiv-7apg3OU, reason: not valid java name */
    private static final long m1244floorDiv7apg3OU(long j, byte b) {
        return UByte$$ExternalSyntheticBackport4.m(j, m1236constructorimpl(b & 255));
    }

    /* renamed from: floorDiv-xj2QHRw, reason: not valid java name */
    private static final long m1247floorDivxj2QHRw(long j, short s) {
        return UByte$$ExternalSyntheticBackport4.m(j, m1236constructorimpl(s & WebSocketProtocol.PAYLOAD_SHORT_MAX));
    }

    /* renamed from: floorDiv-WZ4Q5Ns, reason: not valid java name */
    private static final long m1246floorDivWZ4Q5Ns(long j, int i) {
        return UByte$$ExternalSyntheticBackport4.m(j, m1236constructorimpl(i & 4294967295L));
    }

    /* renamed from: floorDiv-VKZWuLQ, reason: not valid java name */
    private static final long m1245floorDivVKZWuLQ(long j, long j2) {
        return UByte$$ExternalSyntheticBackport4.m(j, j2);
    }

    /* renamed from: mod-7apg3OU, reason: not valid java name */
    private static final byte m1255mod7apg3OU(long j, byte b) {
        return UByte.m1080constructorimpl((byte) UByte$$ExternalSyntheticBackport5.m(j, m1236constructorimpl(b & 255)));
    }

    /* renamed from: mod-xj2QHRw, reason: not valid java name */
    private static final short m1258modxj2QHRw(long j, short s) {
        return UShort.m1343constructorimpl((short) UByte$$ExternalSyntheticBackport5.m(j, m1236constructorimpl(s & WebSocketProtocol.PAYLOAD_SHORT_MAX)));
    }

    /* renamed from: mod-WZ4Q5Ns, reason: not valid java name */
    private static final int m1257modWZ4Q5Ns(long j, int i) {
        return UInt.m1157constructorimpl((int) UByte$$ExternalSyntheticBackport5.m(j, m1236constructorimpl(i & 4294967295L)));
    }

    /* renamed from: mod-VKZWuLQ, reason: not valid java name */
    private static final long m1256modVKZWuLQ(long j, long j2) {
        return UByte$$ExternalSyntheticBackport5.m(j, j2);
    }

    /* renamed from: inc-s-VKNKU, reason: not valid java name */
    private static final long m1249incsVKNKU(long j) {
        return m1236constructorimpl(j + 1);
    }

    /* renamed from: dec-s-VKNKU, reason: not valid java name */
    private static final long m1237decsVKNKU(long j) {
        return m1236constructorimpl(j - 1);
    }

    /* renamed from: rangeTo-VKZWuLQ, reason: not valid java name */
    private static final ULongRange m1264rangeToVKZWuLQ(long j, long j2) {
        return new ULongRange(j, j2, null);
    }

    /* renamed from: rangeUntil-VKZWuLQ, reason: not valid java name */
    private static final ULongRange m1265rangeUntilVKZWuLQ(long j, long j2) {
        return URangesKt.m2333untileb3DHEI(j, j2);
    }

    /* renamed from: shl-s-VKNKU, reason: not valid java name */
    private static final long m1270shlsVKNKU(long j, int i) {
        return m1236constructorimpl(j << i);
    }

    /* renamed from: shr-s-VKNKU, reason: not valid java name */
    private static final long m1271shrsVKNKU(long j, int i) {
        return m1236constructorimpl(j >>> i);
    }

    /* renamed from: and-VKZWuLQ, reason: not valid java name */
    private static final long m1229andVKZWuLQ(long j, long j2) {
        return m1236constructorimpl(j & j2);
    }

    /* renamed from: or-VKZWuLQ, reason: not valid java name */
    private static final long m1259orVKZWuLQ(long j, long j2) {
        return m1236constructorimpl(j | j2);
    }

    /* renamed from: xor-VKZWuLQ, reason: not valid java name */
    private static final long m1287xorVKZWuLQ(long j, long j2) {
        return m1236constructorimpl(j ^ j2);
    }

    /* renamed from: inv-s-VKNKU, reason: not valid java name */
    private static final long m1250invsVKNKU(long j) {
        return m1236constructorimpl(~j);
    }

    /* renamed from: toUByte-w2LRezQ, reason: not valid java name */
    private static final byte m1283toUBytew2LRezQ(long j) {
        return UByte.m1080constructorimpl((byte) j);
    }

    /* renamed from: toUShort-Mh2AYeg, reason: not valid java name */
    private static final short m1286toUShortMh2AYeg(long j) {
        return UShort.m1343constructorimpl((short) j);
    }

    /* renamed from: toUInt-pVg5ArA, reason: not valid java name */
    private static final int m1284toUIntpVg5ArA(long j) {
        return UInt.m1157constructorimpl((int) j);
    }

    /* renamed from: toFloat-impl, reason: not valid java name */
    private static final float m1278toFloatimpl(long j) {
        return (float) UnsignedKt.ulongToDouble(j);
    }

    /* renamed from: toDouble-impl, reason: not valid java name */
    private static final double m1277toDoubleimpl(long j) {
        return UnsignedKt.ulongToDouble(j);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1282toStringimpl(long j) {
        return UnsignedKt.ulongToString(j);
    }

    public String toString() {
        return m1282toStringimpl(this.data);
    }
}
