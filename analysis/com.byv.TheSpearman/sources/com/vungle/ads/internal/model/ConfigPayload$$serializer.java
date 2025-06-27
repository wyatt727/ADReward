package com.vungle.ads.internal.model;

import com.vungle.ads.internal.model.ConfigPayload;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: ConfigPayload.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"com/vungle/ads/internal/model/ConfigPayload.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/vungle/ads/internal/model/ConfigPayload;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* loaded from: classes5.dex */
public final class ConfigPayload$$serializer implements GeneratedSerializer<ConfigPayload> {
    public static final ConfigPayload$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        ConfigPayload$$serializer configPayload$$serializer = new ConfigPayload$$serializer();
        INSTANCE = configPayload$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.ConfigPayload", configPayload$$serializer, 19);
        pluginGeneratedSerialDescriptor.addElement("endpoints", true);
        pluginGeneratedSerialDescriptor.addElement("placements", true);
        pluginGeneratedSerialDescriptor.addElement("config", true);
        pluginGeneratedSerialDescriptor.addElement("gdpr", true);
        pluginGeneratedSerialDescriptor.addElement("logging", true);
        pluginGeneratedSerialDescriptor.addElement("crash_report", true);
        pluginGeneratedSerialDescriptor.addElement("viewability", true);
        pluginGeneratedSerialDescriptor.addElement("ad_load_optimization", true);
        pluginGeneratedSerialDescriptor.addElement("ri", true);
        pluginGeneratedSerialDescriptor.addElement(Cookie.COPPA_DISABLE_AD_ID, true);
        pluginGeneratedSerialDescriptor.addElement(Cookie.CONFIG_EXTENSION, true);
        pluginGeneratedSerialDescriptor.addElement("template", true);
        pluginGeneratedSerialDescriptor.addElement("log_metrics", true);
        pluginGeneratedSerialDescriptor.addElement("session", true);
        pluginGeneratedSerialDescriptor.addElement("reuse_assets", true);
        pluginGeneratedSerialDescriptor.addElement("rta_debugging", true);
        pluginGeneratedSerialDescriptor.addElement("cacheable_assets_required", true);
        pluginGeneratedSerialDescriptor.addElement("sdk_session_timeout", true);
        pluginGeneratedSerialDescriptor.addElement("signals_disabled", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ConfigPayload$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{BuiltinSerializersKt.getNullable(ConfigPayload$Endpoints$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(new ArrayListSerializer(Placement$$serializer.INSTANCE)), BuiltinSerializersKt.getNullable(ConfigPayload$ConfigSettings$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(ConfigPayload$GDPRSettings$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(ConfigPayload$LoggingSettings$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(ConfigPayload$CrashReportSettings$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(ConfigPayload$ViewabilitySettings$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(ConfigPayload$LoadOptimizationSettings$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(ConfigPayload$ReportIncentivizedSettings$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(BooleanSerializer.INSTANCE), BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(ConfigPayload$Template$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(ConfigPayload$LogMetricsSettings$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(ConfigPayload$Session$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(CleverCache$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(BooleanSerializer.INSTANCE), BuiltinSerializersKt.getNullable(BooleanSerializer.INSTANCE), BuiltinSerializersKt.getNullable(IntSerializer.INSTANCE), BuiltinSerializersKt.getNullable(BooleanSerializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public ConfigPayload deserialize(Decoder decoder) {
        Object objDecodeNullableSerializableElement;
        Object objDecodeNullableSerializableElement2;
        Object obj;
        int i;
        Object objDecodeNullableSerializableElement3;
        Object objDecodeNullableSerializableElement4;
        Object objDecodeNullableSerializableElement5;
        Object objDecodeNullableSerializableElement6;
        Object objDecodeNullableSerializableElement7;
        Object objDecodeNullableSerializableElement8;
        Object objDecodeNullableSerializableElement9;
        Object obj2;
        Object objDecodeNullableSerializableElement10;
        Object objDecodeNullableSerializableElement11;
        Object objDecodeNullableSerializableElement12;
        Object objDecodeNullableSerializableElement13;
        Object objDecodeNullableSerializableElement14;
        Object objDecodeNullableSerializableElement15;
        Object objDecodeNullableSerializableElement16;
        Object objDecodeNullableSerializableElement17;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor2);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            Object objDecodeNullableSerializableElement18 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 0, ConfigPayload$Endpoints$$serializer.INSTANCE, null);
            Object objDecodeNullableSerializableElement19 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 1, new ArrayListSerializer(Placement$$serializer.INSTANCE), null);
            objDecodeNullableSerializableElement17 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 2, ConfigPayload$ConfigSettings$$serializer.INSTANCE, null);
            objDecodeNullableSerializableElement16 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 3, ConfigPayload$GDPRSettings$$serializer.INSTANCE, null);
            Object objDecodeNullableSerializableElement20 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 4, ConfigPayload$LoggingSettings$$serializer.INSTANCE, null);
            objDecodeNullableSerializableElement8 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 5, ConfigPayload$CrashReportSettings$$serializer.INSTANCE, null);
            objDecodeNullableSerializableElement13 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 6, ConfigPayload$ViewabilitySettings$$serializer.INSTANCE, null);
            objDecodeNullableSerializableElement12 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 7, ConfigPayload$LoadOptimizationSettings$$serializer.INSTANCE, null);
            objDecodeNullableSerializableElement11 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 8, ConfigPayload$ReportIncentivizedSettings$$serializer.INSTANCE, null);
            objDecodeNullableSerializableElement10 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 9, BooleanSerializer.INSTANCE, null);
            objDecodeNullableSerializableElement15 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 10, StringSerializer.INSTANCE, null);
            objDecodeNullableSerializableElement14 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 11, ConfigPayload$Template$$serializer.INSTANCE, null);
            objDecodeNullableSerializableElement9 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 12, ConfigPayload$LogMetricsSettings$$serializer.INSTANCE, null);
            objDecodeNullableSerializableElement7 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 13, ConfigPayload$Session$$serializer.INSTANCE, null);
            objDecodeNullableSerializableElement6 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 14, CleverCache$$serializer.INSTANCE, null);
            objDecodeNullableSerializableElement5 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 15, BooleanSerializer.INSTANCE, null);
            objDecodeNullableSerializableElement4 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 16, BooleanSerializer.INSTANCE, null);
            objDecodeNullableSerializableElement = objDecodeNullableSerializableElement20;
            i = 524287;
            objDecodeNullableSerializableElement3 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 17, IntSerializer.INSTANCE, null);
            obj = objDecodeNullableSerializableElement18;
            objDecodeNullableSerializableElement2 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 18, BooleanSerializer.INSTANCE, null);
            obj2 = objDecodeNullableSerializableElement19;
        } else {
            boolean z = true;
            Object objDecodeNullableSerializableElement21 = null;
            Object objDecodeNullableSerializableElement22 = null;
            Object objDecodeNullableSerializableElement23 = null;
            Object objDecodeNullableSerializableElement24 = null;
            Object objDecodeNullableSerializableElement25 = null;
            Object objDecodeNullableSerializableElement26 = null;
            Object objDecodeNullableSerializableElement27 = null;
            Object objDecodeNullableSerializableElement28 = null;
            Object objDecodeNullableSerializableElement29 = null;
            Object objDecodeNullableSerializableElement30 = null;
            Object objDecodeNullableSerializableElement31 = null;
            objDecodeNullableSerializableElement = null;
            Object objDecodeNullableSerializableElement32 = null;
            Object objDecodeNullableSerializableElement33 = null;
            Object objDecodeNullableSerializableElement34 = null;
            Object objDecodeNullableSerializableElement35 = null;
            Object objDecodeNullableSerializableElement36 = null;
            Object objDecodeNullableSerializableElement37 = null;
            int i2 = 0;
            Object objDecodeNullableSerializableElement38 = null;
            while (z) {
                Object obj7 = objDecodeNullableSerializableElement26;
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        obj3 = objDecodeNullableSerializableElement38;
                        obj4 = objDecodeNullableSerializableElement21;
                        obj5 = objDecodeNullableSerializableElement24;
                        z = false;
                        objDecodeNullableSerializableElement26 = obj7;
                        objDecodeNullableSerializableElement24 = obj5;
                        objDecodeNullableSerializableElement21 = obj4;
                        objDecodeNullableSerializableElement38 = obj3;
                    case 0:
                        obj4 = objDecodeNullableSerializableElement21;
                        obj5 = objDecodeNullableSerializableElement24;
                        obj3 = objDecodeNullableSerializableElement38;
                        objDecodeNullableSerializableElement26 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 0, ConfigPayload$Endpoints$$serializer.INSTANCE, obj7);
                        i2 |= 1;
                        objDecodeNullableSerializableElement24 = obj5;
                        objDecodeNullableSerializableElement21 = obj4;
                        objDecodeNullableSerializableElement38 = obj3;
                    case 1:
                        objDecodeNullableSerializableElement38 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 1, new ArrayListSerializer(Placement$$serializer.INSTANCE), objDecodeNullableSerializableElement38);
                        i2 |= 2;
                        objDecodeNullableSerializableElement24 = objDecodeNullableSerializableElement24;
                        objDecodeNullableSerializableElement21 = objDecodeNullableSerializableElement21;
                        objDecodeNullableSerializableElement26 = obj7;
                    case 2:
                        obj3 = objDecodeNullableSerializableElement38;
                        obj6 = objDecodeNullableSerializableElement24;
                        objDecodeNullableSerializableElement25 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 2, ConfigPayload$ConfigSettings$$serializer.INSTANCE, objDecodeNullableSerializableElement25);
                        i2 |= 4;
                        objDecodeNullableSerializableElement24 = obj6;
                        objDecodeNullableSerializableElement26 = obj7;
                        objDecodeNullableSerializableElement38 = obj3;
                    case 3:
                        obj3 = objDecodeNullableSerializableElement38;
                        obj6 = objDecodeNullableSerializableElement24;
                        objDecodeNullableSerializableElement23 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 3, ConfigPayload$GDPRSettings$$serializer.INSTANCE, objDecodeNullableSerializableElement23);
                        i2 |= 8;
                        objDecodeNullableSerializableElement24 = obj6;
                        objDecodeNullableSerializableElement26 = obj7;
                        objDecodeNullableSerializableElement38 = obj3;
                    case 4:
                        obj3 = objDecodeNullableSerializableElement38;
                        obj6 = objDecodeNullableSerializableElement24;
                        objDecodeNullableSerializableElement = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 4, ConfigPayload$LoggingSettings$$serializer.INSTANCE, objDecodeNullableSerializableElement);
                        i2 |= 16;
                        objDecodeNullableSerializableElement24 = obj6;
                        objDecodeNullableSerializableElement26 = obj7;
                        objDecodeNullableSerializableElement38 = obj3;
                    case 5:
                        obj3 = objDecodeNullableSerializableElement38;
                        obj6 = objDecodeNullableSerializableElement24;
                        objDecodeNullableSerializableElement21 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 5, ConfigPayload$CrashReportSettings$$serializer.INSTANCE, objDecodeNullableSerializableElement21);
                        i2 |= 32;
                        objDecodeNullableSerializableElement24 = obj6;
                        objDecodeNullableSerializableElement26 = obj7;
                        objDecodeNullableSerializableElement38 = obj3;
                    case 6:
                        obj3 = objDecodeNullableSerializableElement38;
                        obj6 = objDecodeNullableSerializableElement24;
                        objDecodeNullableSerializableElement31 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 6, ConfigPayload$ViewabilitySettings$$serializer.INSTANCE, objDecodeNullableSerializableElement31);
                        i2 |= 64;
                        objDecodeNullableSerializableElement24 = obj6;
                        objDecodeNullableSerializableElement26 = obj7;
                        objDecodeNullableSerializableElement38 = obj3;
                    case 7:
                        obj3 = objDecodeNullableSerializableElement38;
                        obj6 = objDecodeNullableSerializableElement24;
                        objDecodeNullableSerializableElement30 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 7, ConfigPayload$LoadOptimizationSettings$$serializer.INSTANCE, objDecodeNullableSerializableElement30);
                        i2 |= 128;
                        objDecodeNullableSerializableElement24 = obj6;
                        objDecodeNullableSerializableElement26 = obj7;
                        objDecodeNullableSerializableElement38 = obj3;
                    case 8:
                        obj3 = objDecodeNullableSerializableElement38;
                        obj6 = objDecodeNullableSerializableElement24;
                        objDecodeNullableSerializableElement29 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 8, ConfigPayload$ReportIncentivizedSettings$$serializer.INSTANCE, objDecodeNullableSerializableElement29);
                        i2 |= 256;
                        objDecodeNullableSerializableElement24 = obj6;
                        objDecodeNullableSerializableElement26 = obj7;
                        objDecodeNullableSerializableElement38 = obj3;
                    case 9:
                        obj3 = objDecodeNullableSerializableElement38;
                        obj6 = objDecodeNullableSerializableElement24;
                        objDecodeNullableSerializableElement22 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 9, BooleanSerializer.INSTANCE, objDecodeNullableSerializableElement22);
                        i2 |= 512;
                        objDecodeNullableSerializableElement24 = obj6;
                        objDecodeNullableSerializableElement26 = obj7;
                        objDecodeNullableSerializableElement38 = obj3;
                    case 10:
                        obj3 = objDecodeNullableSerializableElement38;
                        obj6 = objDecodeNullableSerializableElement24;
                        objDecodeNullableSerializableElement28 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 10, StringSerializer.INSTANCE, objDecodeNullableSerializableElement28);
                        i2 |= 1024;
                        objDecodeNullableSerializableElement24 = obj6;
                        objDecodeNullableSerializableElement26 = obj7;
                        objDecodeNullableSerializableElement38 = obj3;
                    case 11:
                        obj3 = objDecodeNullableSerializableElement38;
                        obj6 = objDecodeNullableSerializableElement24;
                        objDecodeNullableSerializableElement27 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 11, ConfigPayload$Template$$serializer.INSTANCE, objDecodeNullableSerializableElement27);
                        i2 |= 2048;
                        objDecodeNullableSerializableElement24 = obj6;
                        objDecodeNullableSerializableElement26 = obj7;
                        objDecodeNullableSerializableElement38 = obj3;
                    case 12:
                        obj3 = objDecodeNullableSerializableElement38;
                        objDecodeNullableSerializableElement32 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 12, ConfigPayload$LogMetricsSettings$$serializer.INSTANCE, objDecodeNullableSerializableElement32);
                        i2 |= 4096;
                        objDecodeNullableSerializableElement24 = objDecodeNullableSerializableElement24;
                        objDecodeNullableSerializableElement33 = objDecodeNullableSerializableElement33;
                        objDecodeNullableSerializableElement26 = obj7;
                        objDecodeNullableSerializableElement38 = obj3;
                    case 13:
                        obj3 = objDecodeNullableSerializableElement38;
                        objDecodeNullableSerializableElement33 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 13, ConfigPayload$Session$$serializer.INSTANCE, objDecodeNullableSerializableElement33);
                        i2 |= 8192;
                        objDecodeNullableSerializableElement24 = objDecodeNullableSerializableElement24;
                        objDecodeNullableSerializableElement34 = objDecodeNullableSerializableElement34;
                        objDecodeNullableSerializableElement26 = obj7;
                        objDecodeNullableSerializableElement38 = obj3;
                    case 14:
                        obj3 = objDecodeNullableSerializableElement38;
                        objDecodeNullableSerializableElement34 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 14, CleverCache$$serializer.INSTANCE, objDecodeNullableSerializableElement34);
                        i2 |= 16384;
                        objDecodeNullableSerializableElement24 = objDecodeNullableSerializableElement24;
                        objDecodeNullableSerializableElement35 = objDecodeNullableSerializableElement35;
                        objDecodeNullableSerializableElement26 = obj7;
                        objDecodeNullableSerializableElement38 = obj3;
                    case 15:
                        obj3 = objDecodeNullableSerializableElement38;
                        objDecodeNullableSerializableElement35 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 15, BooleanSerializer.INSTANCE, objDecodeNullableSerializableElement35);
                        i2 |= 32768;
                        objDecodeNullableSerializableElement24 = objDecodeNullableSerializableElement24;
                        objDecodeNullableSerializableElement36 = objDecodeNullableSerializableElement36;
                        objDecodeNullableSerializableElement26 = obj7;
                        objDecodeNullableSerializableElement38 = obj3;
                    case 16:
                        obj3 = objDecodeNullableSerializableElement38;
                        objDecodeNullableSerializableElement36 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 16, BooleanSerializer.INSTANCE, objDecodeNullableSerializableElement36);
                        i2 |= 65536;
                        objDecodeNullableSerializableElement24 = objDecodeNullableSerializableElement24;
                        objDecodeNullableSerializableElement37 = objDecodeNullableSerializableElement37;
                        objDecodeNullableSerializableElement26 = obj7;
                        objDecodeNullableSerializableElement38 = obj3;
                    case 17:
                        obj3 = objDecodeNullableSerializableElement38;
                        obj6 = objDecodeNullableSerializableElement24;
                        objDecodeNullableSerializableElement37 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 17, IntSerializer.INSTANCE, objDecodeNullableSerializableElement37);
                        i2 |= 131072;
                        objDecodeNullableSerializableElement24 = obj6;
                        objDecodeNullableSerializableElement26 = obj7;
                        objDecodeNullableSerializableElement38 = obj3;
                    case 18:
                        obj3 = objDecodeNullableSerializableElement38;
                        objDecodeNullableSerializableElement24 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 18, BooleanSerializer.INSTANCE, objDecodeNullableSerializableElement24);
                        i2 |= 262144;
                        objDecodeNullableSerializableElement26 = obj7;
                        objDecodeNullableSerializableElement38 = obj3;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            Object obj8 = objDecodeNullableSerializableElement38;
            Object obj9 = objDecodeNullableSerializableElement21;
            objDecodeNullableSerializableElement2 = objDecodeNullableSerializableElement24;
            obj = objDecodeNullableSerializableElement26;
            i = i2;
            objDecodeNullableSerializableElement3 = objDecodeNullableSerializableElement37;
            objDecodeNullableSerializableElement4 = objDecodeNullableSerializableElement36;
            objDecodeNullableSerializableElement5 = objDecodeNullableSerializableElement35;
            objDecodeNullableSerializableElement6 = objDecodeNullableSerializableElement34;
            objDecodeNullableSerializableElement7 = objDecodeNullableSerializableElement33;
            objDecodeNullableSerializableElement8 = obj9;
            objDecodeNullableSerializableElement9 = objDecodeNullableSerializableElement32;
            obj2 = obj8;
            Object obj10 = objDecodeNullableSerializableElement28;
            objDecodeNullableSerializableElement10 = objDecodeNullableSerializableElement22;
            objDecodeNullableSerializableElement11 = objDecodeNullableSerializableElement29;
            objDecodeNullableSerializableElement12 = objDecodeNullableSerializableElement30;
            objDecodeNullableSerializableElement13 = objDecodeNullableSerializableElement31;
            objDecodeNullableSerializableElement14 = objDecodeNullableSerializableElement27;
            objDecodeNullableSerializableElement15 = obj10;
            Object obj11 = objDecodeNullableSerializableElement25;
            objDecodeNullableSerializableElement16 = objDecodeNullableSerializableElement23;
            objDecodeNullableSerializableElement17 = obj11;
        }
        compositeDecoderBeginStructure.endStructure(descriptor2);
        return new ConfigPayload(i, (ConfigPayload.Endpoints) obj, (List) obj2, (ConfigPayload.ConfigSettings) objDecodeNullableSerializableElement17, (ConfigPayload.GDPRSettings) objDecodeNullableSerializableElement16, (ConfigPayload.LoggingSettings) objDecodeNullableSerializableElement, (ConfigPayload.CrashReportSettings) objDecodeNullableSerializableElement8, (ConfigPayload.ViewabilitySettings) objDecodeNullableSerializableElement13, (ConfigPayload.LoadOptimizationSettings) objDecodeNullableSerializableElement12, (ConfigPayload.ReportIncentivizedSettings) objDecodeNullableSerializableElement11, (Boolean) objDecodeNullableSerializableElement10, (String) objDecodeNullableSerializableElement15, (ConfigPayload.Template) objDecodeNullableSerializableElement14, (ConfigPayload.LogMetricsSettings) objDecodeNullableSerializableElement9, (ConfigPayload.Session) objDecodeNullableSerializableElement7, (CleverCache) objDecodeNullableSerializableElement6, (Boolean) objDecodeNullableSerializableElement5, (Boolean) objDecodeNullableSerializableElement4, (Integer) objDecodeNullableSerializableElement3, (Boolean) objDecodeNullableSerializableElement2, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, ConfigPayload value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor2);
        ConfigPayload.write$Self(value, compositeEncoderBeginStructure, descriptor2);
        compositeEncoderBeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
