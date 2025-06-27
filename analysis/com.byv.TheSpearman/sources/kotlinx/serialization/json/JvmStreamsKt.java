package kotlinx.serialization.json;

import com.google.android.gms.ads.RequestConfiguration;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KType;
import kotlin.sequences.Sequence;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.json.internal.JavaStreamSerialReader;
import kotlinx.serialization.json.internal.JsonStreamsKt;
import kotlinx.serialization.json.internal.JsonToJavaStreamWriter;
import kotlinx.serialization.modules.SerializersModule;

/* compiled from: JvmStreams.kt */
@Metadata(d1 = {"\u0000<\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\"\u0010\u0000\u001a\u0002H\u0001\"\u0006\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b¢\u0006\u0002\u0010\u0005\u001a-\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\b\u001a8\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00010\n\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00010\u00072\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007\u001a-\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00010\n\"\u0006\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0087\b\u001a*\u0010\r\u001a\u00020\u000e\"\u0006\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00022\u0006\u0010\u000f\u001a\u0002H\u00012\u0006\u0010\u0003\u001a\u00020\u0010H\u0087\b¢\u0006\u0002\u0010\u0011\u001a5\u0010\r\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00010\u00132\u0006\u0010\u000f\u001a\u0002H\u00012\u0006\u0010\u0003\u001a\u00020\u0010H\u0007¢\u0006\u0002\u0010\u0014¨\u0006\u0015"}, d2 = {"decodeFromStream", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/serialization/json/Json;", "stream", "Ljava/io/InputStream;", "(Lkotlinx/serialization/json/Json;Ljava/io/InputStream;)Ljava/lang/Object;", "deserializer", "Lkotlinx/serialization/DeserializationStrategy;", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/DeserializationStrategy;Ljava/io/InputStream;)Ljava/lang/Object;", "decodeToSequence", "Lkotlin/sequences/Sequence;", "format", "Lkotlinx/serialization/json/DecodeSequenceMode;", "encodeToStream", "", "value", "Ljava/io/OutputStream;", "(Lkotlinx/serialization/json/Json;Ljava/lang/Object;Ljava/io/OutputStream;)V", "serializer", "Lkotlinx/serialization/SerializationStrategy;", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;Ljava/io/OutputStream;)V", "kotlinx-serialization-json"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes5.dex */
public final class JvmStreamsKt {
    @ExperimentalSerializationApi
    public static final <T> void encodeToStream(Json json, SerializationStrategy<? super T> serializer, T t, OutputStream stream) throws IOException {
        Intrinsics.checkNotNullParameter(json, "<this>");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(stream, "stream");
        JsonToJavaStreamWriter jsonToJavaStreamWriter = new JsonToJavaStreamWriter(stream);
        try {
            JsonStreamsKt.encodeByWriter(json, jsonToJavaStreamWriter, serializer, t);
        } finally {
            jsonToJavaStreamWriter.release();
        }
    }

    @ExperimentalSerializationApi
    public static final /* synthetic */ <T> void encodeToStream(Json json, T t, OutputStream stream) throws IOException {
        Intrinsics.checkNotNullParameter(json, "<this>");
        Intrinsics.checkNotNullParameter(stream, "stream");
        SerializersModule serializersModule = json.getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        KSerializer<Object> kSerializerSerializer = SerializersKt.serializer(serializersModule, (KType) null);
        Intrinsics.checkNotNull(kSerializerSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        encodeToStream(json, kSerializerSerializer, t, stream);
    }

    @ExperimentalSerializationApi
    public static final <T> T decodeFromStream(Json json, DeserializationStrategy<T> deserializer, InputStream stream) {
        Intrinsics.checkNotNullParameter(json, "<this>");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(stream, "stream");
        return (T) JsonStreamsKt.decodeByReader(json, deserializer, new JavaStreamSerialReader(stream, null, 2, null));
    }

    @ExperimentalSerializationApi
    public static final /* synthetic */ <T> T decodeFromStream(Json json, InputStream stream) {
        Intrinsics.checkNotNullParameter(json, "<this>");
        Intrinsics.checkNotNullParameter(stream, "stream");
        SerializersModule serializersModule = json.getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        KSerializer<Object> kSerializerSerializer = SerializersKt.serializer(serializersModule, (KType) null);
        Intrinsics.checkNotNull(kSerializerSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        return (T) decodeFromStream(json, kSerializerSerializer, stream);
    }

    public static /* synthetic */ Sequence decodeToSequence$default(Json json, InputStream inputStream, DeserializationStrategy deserializationStrategy, DecodeSequenceMode decodeSequenceMode, int i, Object obj) {
        if ((i & 4) != 0) {
            decodeSequenceMode = DecodeSequenceMode.AUTO_DETECT;
        }
        return decodeToSequence(json, inputStream, deserializationStrategy, decodeSequenceMode);
    }

    @ExperimentalSerializationApi
    public static final <T> Sequence<T> decodeToSequence(Json json, InputStream stream, DeserializationStrategy<T> deserializer, DecodeSequenceMode format) {
        Intrinsics.checkNotNullParameter(json, "<this>");
        Intrinsics.checkNotNullParameter(stream, "stream");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(format, "format");
        return JsonStreamsKt.decodeToSequenceByReader(json, new JavaStreamSerialReader(stream, null, 2, null), deserializer, format);
    }

    public static /* synthetic */ Sequence decodeToSequence$default(Json json, InputStream stream, DecodeSequenceMode format, int i, Object obj) {
        if ((i & 2) != 0) {
            format = DecodeSequenceMode.AUTO_DETECT;
        }
        Intrinsics.checkNotNullParameter(json, "<this>");
        Intrinsics.checkNotNullParameter(stream, "stream");
        Intrinsics.checkNotNullParameter(format, "format");
        SerializersModule serializersModule = json.getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        KSerializer<Object> kSerializerSerializer = SerializersKt.serializer(serializersModule, (KType) null);
        Intrinsics.checkNotNull(kSerializerSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        return decodeToSequence(json, stream, kSerializerSerializer, format);
    }

    @ExperimentalSerializationApi
    public static final /* synthetic */ <T> Sequence<T> decodeToSequence(Json json, InputStream stream, DecodeSequenceMode format) {
        Intrinsics.checkNotNullParameter(json, "<this>");
        Intrinsics.checkNotNullParameter(stream, "stream");
        Intrinsics.checkNotNullParameter(format, "format");
        SerializersModule serializersModule = json.getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        KSerializer<Object> kSerializerSerializer = SerializersKt.serializer(serializersModule, (KType) null);
        Intrinsics.checkNotNull(kSerializerSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        return decodeToSequence(json, stream, kSerializerSerializer, format);
    }
}
