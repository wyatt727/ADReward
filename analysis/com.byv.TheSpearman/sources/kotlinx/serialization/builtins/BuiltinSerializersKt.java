package kotlinx.serialization.builtins;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.UInt;
import kotlin.UIntArray;
import kotlin.ULong;
import kotlin.ULongArray;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.Unit;
import kotlin.jvm.internal.BooleanCompanionObject;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.CharCompanionObject;
import kotlin.jvm.internal.DoubleCompanionObject;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ShortCompanionObject;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.reflect.KClass;
import kotlin.time.Duration;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanArraySerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.ByteArraySerializer;
import kotlinx.serialization.internal.ByteSerializer;
import kotlinx.serialization.internal.CharArraySerializer;
import kotlinx.serialization.internal.CharSerializer;
import kotlinx.serialization.internal.DoubleArraySerializer;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.DurationSerializer;
import kotlinx.serialization.internal.FloatArraySerializer;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.IntArraySerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.LinkedHashSetSerializer;
import kotlinx.serialization.internal.LongArraySerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.MapEntrySerializer;
import kotlinx.serialization.internal.NullableSerializer;
import kotlinx.serialization.internal.PairSerializer;
import kotlinx.serialization.internal.ReferenceArraySerializer;
import kotlinx.serialization.internal.ShortArraySerializer;
import kotlinx.serialization.internal.ShortSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.internal.TripleSerializer;
import kotlinx.serialization.internal.UByteArraySerializer;
import kotlinx.serialization.internal.UByteSerializer;
import kotlinx.serialization.internal.UIntArraySerializer;
import kotlinx.serialization.internal.UIntSerializer;
import kotlinx.serialization.internal.ULongArraySerializer;
import kotlinx.serialization.internal.ULongSerializer;
import kotlinx.serialization.internal.UShortArraySerializer;
import kotlinx.serialization.internal.UShortSerializer;
import kotlinx.serialization.internal.UnitSerializer;

/* compiled from: BuiltinSerializers.kt */
@Metadata(d1 = {"\u0000\u008a\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0018\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\u0013\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010&\n\u0002\b\u0005\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0005\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0010\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001aF\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\n0\t0\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\n\b\u0001\u0010\n*\u0004\u0018\u0001H\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\n0\u0001H\u0007\u001a=\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\n0\t0\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003\"\f\b\u0001\u0010\n\u0018\u0001*\u0004\u0018\u0001H\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\n0\u0001H\u0087\b\u001a\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0001\u001a\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0001\u001a\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0001\u001a\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0001\u001a\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0001\u001a\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0001\u001a&\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u001b0\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\u001a\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0001\u001a@\u0010\u001e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H \u0012\u0004\u0012\u0002H!0\u001f0\u0001\"\u0004\b\u0000\u0010 \"\u0004\b\u0001\u0010!2\f\u0010\"\u001a\b\u0012\u0004\u0012\u0002H 0\u00012\f\u0010#\u001a\b\u0012\u0004\u0012\u0002H!0\u0001\u001a@\u0010$\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H \u0012\u0004\u0012\u0002H!0%0\u0001\"\u0004\b\u0000\u0010 \"\u0004\b\u0001\u0010!2\f\u0010\"\u001a\b\u0012\u0004\u0012\u0002H 0\u00012\f\u0010#\u001a\b\u0012\u0004\u0012\u0002H!0\u0001\u001a@\u0010&\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H \u0012\u0004\u0012\u0002H!0'0\u0001\"\u0004\b\u0000\u0010 \"\u0004\b\u0001\u0010!2\f\u0010\"\u001a\b\u0012\u0004\u0012\u0002H 0\u00012\f\u0010#\u001a\b\u0012\u0004\u0012\u0002H!0\u0001\u001a&\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020)0\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\u001a\f\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\u0001\u001aZ\u0010,\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u0002H.\u0012\u0004\u0012\u0002H/\u0012\u0004\u0012\u0002H00-0\u0001\"\u0004\b\u0000\u0010.\"\u0004\b\u0001\u0010/\"\u0004\b\u0002\u001002\f\u00101\u001a\b\u0012\u0004\u0012\u0002H.0\u00012\f\u00102\u001a\b\u0012\u0004\u0012\u0002H/0\u00012\f\u00103\u001a\b\u0012\u0004\u0012\u0002H00\u0001\u001a\u0011\u00104\u001a\b\u0012\u0004\u0012\u0002050\u0001H\u0007ø\u0001\u0000\u001a\u0011\u00106\u001a\b\u0012\u0004\u0012\u0002070\u0001H\u0007ø\u0001\u0000\u001a\u0011\u00108\u001a\b\u0012\u0004\u0012\u0002090\u0001H\u0007ø\u0001\u0000\u001a\u0011\u0010:\u001a\b\u0012\u0004\u0012\u00020;0\u0001H\u0007ø\u0001\u0000\u001a\u0015\u0010<\u001a\b\u0012\u0004\u0012\u00020=0\u0001*\u00020>¢\u0006\u0002\u0010?\u001a\u0010\u0010<\u001a\b\u0012\u0004\u0012\u00020@0\u0001*\u00020A\u001a\u0010\u0010<\u001a\b\u0012\u0004\u0012\u00020B0\u0001*\u00020C\u001a\u0010\u0010<\u001a\b\u0012\u0004\u0012\u00020D0\u0001*\u00020E\u001a\u0010\u0010<\u001a\b\u0012\u0004\u0012\u00020F0\u0001*\u00020G\u001a\u0010\u0010<\u001a\b\u0012\u0004\u0012\u00020H0\u0001*\u00020I\u001a\u0010\u0010<\u001a\b\u0012\u0004\u0012\u00020J0\u0001*\u00020K\u001a\u0010\u0010<\u001a\b\u0012\u0004\u0012\u00020L0\u0001*\u00020M\u001a\u0010\u0010<\u001a\b\u0012\u0004\u0012\u00020N0\u0001*\u00020O\u001a\u0013\u0010<\u001a\b\u0012\u0004\u0012\u00020P0\u0001*\u00020Qø\u0001\u0000\u001a\u0013\u0010<\u001a\b\u0012\u0004\u0012\u00020R0\u0001*\u00020Sø\u0001\u0000\u001a\u0013\u0010<\u001a\b\u0012\u0004\u0012\u00020T0\u0001*\u00020Uø\u0001\u0000\u001a\u0013\u0010<\u001a\b\u0012\u0004\u0012\u00020V0\u0001*\u00020Wø\u0001\u0000\u001a\u0015\u0010<\u001a\b\u0012\u0004\u0012\u00020X0\u0001*\u00020X¢\u0006\u0002\u0010Y\u001a\u0013\u0010<\u001a\b\u0012\u0004\u0012\u00020Z0\u0001*\u00020[ø\u0001\u0000\"3\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00018F¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\\"}, d2 = {"nullable", "Lkotlinx/serialization/KSerializer;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "getNullable$annotations", "(Lkotlinx/serialization/KSerializer;)V", "getNullable", "(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;", "ArraySerializer", "", "E", "kClass", "Lkotlin/reflect/KClass;", "elementSerializer", "BooleanArraySerializer", "", "ByteArraySerializer", "", "CharArraySerializer", "", "DoubleArraySerializer", "", "FloatArraySerializer", "", "IntArraySerializer", "", "ListSerializer", "", "LongArraySerializer", "", "MapEntrySerializer", "", "K", "V", "keySerializer", "valueSerializer", "MapSerializer", "", "PairSerializer", "Lkotlin/Pair;", "SetSerializer", "", "ShortArraySerializer", "", "TripleSerializer", "Lkotlin/Triple;", "A", "B", "C", "aSerializer", "bSerializer", "cSerializer", "UByteArraySerializer", "Lkotlin/UByteArray;", "UIntArraySerializer", "Lkotlin/UIntArray;", "ULongArraySerializer", "Lkotlin/ULongArray;", "UShortArraySerializer", "Lkotlin/UShortArray;", "serializer", "", "Lkotlin/Boolean$Companion;", "(Lkotlin/jvm/internal/BooleanCompanionObject;)Lkotlinx/serialization/KSerializer;", "", "Lkotlin/Byte$Companion;", "", "Lkotlin/Char$Companion;", "", "Lkotlin/Double$Companion;", "", "Lkotlin/Float$Companion;", "", "Lkotlin/Int$Companion;", "", "Lkotlin/Long$Companion;", "", "Lkotlin/Short$Companion;", "", "Lkotlin/String$Companion;", "Lkotlin/UByte;", "Lkotlin/UByte$Companion;", "Lkotlin/UInt;", "Lkotlin/UInt$Companion;", "Lkotlin/ULong;", "Lkotlin/ULong$Companion;", "Lkotlin/UShort;", "Lkotlin/UShort$Companion;", "", "(Lkotlin/Unit;)Lkotlinx/serialization/KSerializer;", "Lkotlin/time/Duration;", "Lkotlin/time/Duration$Companion;", "kotlinx-serialization-core"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes5.dex */
public final class BuiltinSerializersKt {
    public static /* synthetic */ void getNullable$annotations(KSerializer kSerializer) {
    }

    public static final <T> KSerializer<T> getNullable(KSerializer<T> kSerializer) {
        Intrinsics.checkNotNullParameter(kSerializer, "<this>");
        return kSerializer.getDescriptor().isNullable() ? kSerializer : new NullableSerializer(kSerializer);
    }

    public static final <K, V> KSerializer<Pair<K, V>> PairSerializer(KSerializer<K> keySerializer, KSerializer<V> valueSerializer) {
        Intrinsics.checkNotNullParameter(keySerializer, "keySerializer");
        Intrinsics.checkNotNullParameter(valueSerializer, "valueSerializer");
        return new PairSerializer(keySerializer, valueSerializer);
    }

    public static final <K, V> KSerializer<Map.Entry<K, V>> MapEntrySerializer(KSerializer<K> keySerializer, KSerializer<V> valueSerializer) {
        Intrinsics.checkNotNullParameter(keySerializer, "keySerializer");
        Intrinsics.checkNotNullParameter(valueSerializer, "valueSerializer");
        return new MapEntrySerializer(keySerializer, valueSerializer);
    }

    public static final <A, B, C> KSerializer<Triple<A, B, C>> TripleSerializer(KSerializer<A> aSerializer, KSerializer<B> bSerializer, KSerializer<C> cSerializer) {
        Intrinsics.checkNotNullParameter(aSerializer, "aSerializer");
        Intrinsics.checkNotNullParameter(bSerializer, "bSerializer");
        Intrinsics.checkNotNullParameter(cSerializer, "cSerializer");
        return new TripleSerializer(aSerializer, bSerializer, cSerializer);
    }

    public static final KSerializer<Character> serializer(CharCompanionObject charCompanionObject) {
        Intrinsics.checkNotNullParameter(charCompanionObject, "<this>");
        return CharSerializer.INSTANCE;
    }

    public static final KSerializer<char[]> CharArraySerializer() {
        return CharArraySerializer.INSTANCE;
    }

    public static final KSerializer<Byte> serializer(ByteCompanionObject byteCompanionObject) {
        Intrinsics.checkNotNullParameter(byteCompanionObject, "<this>");
        return ByteSerializer.INSTANCE;
    }

    public static final KSerializer<byte[]> ByteArraySerializer() {
        return ByteArraySerializer.INSTANCE;
    }

    @ExperimentalSerializationApi
    public static final KSerializer<UByteArray> UByteArraySerializer() {
        return UByteArraySerializer.INSTANCE;
    }

    public static final KSerializer<Short> serializer(ShortCompanionObject shortCompanionObject) {
        Intrinsics.checkNotNullParameter(shortCompanionObject, "<this>");
        return ShortSerializer.INSTANCE;
    }

    public static final KSerializer<short[]> ShortArraySerializer() {
        return ShortArraySerializer.INSTANCE;
    }

    @ExperimentalSerializationApi
    public static final KSerializer<UShortArray> UShortArraySerializer() {
        return UShortArraySerializer.INSTANCE;
    }

    public static final KSerializer<Integer> serializer(IntCompanionObject intCompanionObject) {
        Intrinsics.checkNotNullParameter(intCompanionObject, "<this>");
        return IntSerializer.INSTANCE;
    }

    public static final KSerializer<int[]> IntArraySerializer() {
        return IntArraySerializer.INSTANCE;
    }

    @ExperimentalSerializationApi
    public static final KSerializer<UIntArray> UIntArraySerializer() {
        return UIntArraySerializer.INSTANCE;
    }

    public static final KSerializer<Long> serializer(LongCompanionObject longCompanionObject) {
        Intrinsics.checkNotNullParameter(longCompanionObject, "<this>");
        return LongSerializer.INSTANCE;
    }

    public static final KSerializer<long[]> LongArraySerializer() {
        return LongArraySerializer.INSTANCE;
    }

    @ExperimentalSerializationApi
    public static final KSerializer<ULongArray> ULongArraySerializer() {
        return ULongArraySerializer.INSTANCE;
    }

    public static final KSerializer<Float> serializer(FloatCompanionObject floatCompanionObject) {
        Intrinsics.checkNotNullParameter(floatCompanionObject, "<this>");
        return FloatSerializer.INSTANCE;
    }

    public static final KSerializer<float[]> FloatArraySerializer() {
        return FloatArraySerializer.INSTANCE;
    }

    public static final KSerializer<Double> serializer(DoubleCompanionObject doubleCompanionObject) {
        Intrinsics.checkNotNullParameter(doubleCompanionObject, "<this>");
        return DoubleSerializer.INSTANCE;
    }

    public static final KSerializer<double[]> DoubleArraySerializer() {
        return DoubleArraySerializer.INSTANCE;
    }

    public static final KSerializer<Boolean> serializer(BooleanCompanionObject booleanCompanionObject) {
        Intrinsics.checkNotNullParameter(booleanCompanionObject, "<this>");
        return BooleanSerializer.INSTANCE;
    }

    public static final KSerializer<boolean[]> BooleanArraySerializer() {
        return BooleanArraySerializer.INSTANCE;
    }

    public static final KSerializer<Unit> serializer(Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "<this>");
        return UnitSerializer.INSTANCE;
    }

    public static final KSerializer<String> serializer(StringCompanionObject stringCompanionObject) {
        Intrinsics.checkNotNullParameter(stringCompanionObject, "<this>");
        return StringSerializer.INSTANCE;
    }

    @ExperimentalSerializationApi
    public static final /* synthetic */ <T, E extends T> KSerializer<E[]> ArraySerializer(KSerializer<E> elementSerializer) {
        Intrinsics.checkNotNullParameter(elementSerializer, "elementSerializer");
        Intrinsics.reifiedOperationMarker(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        return ArraySerializer(Reflection.getOrCreateKotlinClass(Object.class), elementSerializer);
    }

    @ExperimentalSerializationApi
    public static final <T, E extends T> KSerializer<E[]> ArraySerializer(KClass<T> kClass, KSerializer<E> elementSerializer) {
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(elementSerializer, "elementSerializer");
        return new ReferenceArraySerializer(kClass, elementSerializer);
    }

    public static final <T> KSerializer<List<T>> ListSerializer(KSerializer<T> elementSerializer) {
        Intrinsics.checkNotNullParameter(elementSerializer, "elementSerializer");
        return new ArrayListSerializer(elementSerializer);
    }

    public static final <T> KSerializer<Set<T>> SetSerializer(KSerializer<T> elementSerializer) {
        Intrinsics.checkNotNullParameter(elementSerializer, "elementSerializer");
        return new LinkedHashSetSerializer(elementSerializer);
    }

    public static final <K, V> KSerializer<Map<K, V>> MapSerializer(KSerializer<K> keySerializer, KSerializer<V> valueSerializer) {
        Intrinsics.checkNotNullParameter(keySerializer, "keySerializer");
        Intrinsics.checkNotNullParameter(valueSerializer, "valueSerializer");
        return new LinkedHashMapSerializer(keySerializer, valueSerializer);
    }

    public static final KSerializer<UInt> serializer(UInt.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return UIntSerializer.INSTANCE;
    }

    public static final KSerializer<ULong> serializer(ULong.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return ULongSerializer.INSTANCE;
    }

    public static final KSerializer<UByte> serializer(UByte.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return UByteSerializer.INSTANCE;
    }

    public static final KSerializer<UShort> serializer(UShort.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return UShortSerializer.INSTANCE;
    }

    public static final KSerializer<Duration> serializer(Duration.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return DurationSerializer.INSTANCE;
    }
}
