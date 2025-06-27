package com.vungle.ads.internal.model;

import com.json.i5;
import com.vungle.ads.internal.model.DeviceNode;
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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: DeviceNode.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"com/vungle/ads/internal/model/DeviceNode.AndroidAmazonExt.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/vungle/ads/internal/model/DeviceNode$AndroidAmazonExt;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* loaded from: classes5.dex */
public final class DeviceNode$AndroidAmazonExt$$serializer implements GeneratedSerializer<DeviceNode.AndroidAmazonExt> {
    public static final DeviceNode$AndroidAmazonExt$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        DeviceNode$AndroidAmazonExt$$serializer deviceNode$AndroidAmazonExt$$serializer = new DeviceNode$AndroidAmazonExt$$serializer();
        INSTANCE = deviceNode$AndroidAmazonExt$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.DeviceNode.AndroidAmazonExt", deviceNode$AndroidAmazonExt$$serializer, 19);
        pluginGeneratedSerialDescriptor.addElement("android_id", true);
        pluginGeneratedSerialDescriptor.addElement("is_google_play_services_available", true);
        pluginGeneratedSerialDescriptor.addElement("app_set_id", true);
        pluginGeneratedSerialDescriptor.addElement("battery_level", true);
        pluginGeneratedSerialDescriptor.addElement("battery_state", true);
        pluginGeneratedSerialDescriptor.addElement("battery_saver_enabled", true);
        pluginGeneratedSerialDescriptor.addElement("connection_type", true);
        pluginGeneratedSerialDescriptor.addElement("connection_type_detail", true);
        pluginGeneratedSerialDescriptor.addElement("locale", true);
        pluginGeneratedSerialDescriptor.addElement("language", true);
        pluginGeneratedSerialDescriptor.addElement("time_zone", true);
        pluginGeneratedSerialDescriptor.addElement("volume_level", true);
        pluginGeneratedSerialDescriptor.addElement("sound_enabled", true);
        pluginGeneratedSerialDescriptor.addElement("is_tv", true);
        pluginGeneratedSerialDescriptor.addElement("sd_card_available", true);
        pluginGeneratedSerialDescriptor.addElement("is_sideload_enabled", true);
        pluginGeneratedSerialDescriptor.addElement("os_name", true);
        pluginGeneratedSerialDescriptor.addElement(i5.w0, true);
        pluginGeneratedSerialDescriptor.addElement("amazonAdvertisingId", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private DeviceNode$AndroidAmazonExt$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BooleanSerializer.INSTANCE, BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), FloatSerializer.INSTANCE, BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), IntSerializer.INSTANCE, BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), FloatSerializer.INSTANCE, IntSerializer.INSTANCE, BooleanSerializer.INSTANCE, IntSerializer.INSTANCE, BooleanSerializer.INSTANCE, BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public DeviceNode.AndroidAmazonExt deserialize(Decoder decoder) {
        Object objDecodeNullableSerializableElement;
        Object objDecodeNullableSerializableElement2;
        boolean zDecodeBooleanElement;
        int iDecodeIntElement;
        int iDecodeIntElement2;
        float fDecodeFloatElement;
        Object obj;
        Object objDecodeNullableSerializableElement3;
        Object obj2;
        Object objDecodeNullableSerializableElement4;
        boolean z;
        boolean z2;
        Object obj3;
        Object objDecodeNullableSerializableElement5;
        Object objDecodeNullableSerializableElement6;
        int iDecodeIntElement3;
        Object obj4;
        Object obj5;
        int i;
        float f;
        Object obj6;
        int i2;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor2);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            Object objDecodeNullableSerializableElement7 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 0, StringSerializer.INSTANCE, null);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(descriptor2, 1);
            Object objDecodeNullableSerializableElement8 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 2, StringSerializer.INSTANCE, null);
            float fDecodeFloatElement2 = compositeDecoderBeginStructure.decodeFloatElement(descriptor2, 3);
            Object objDecodeNullableSerializableElement9 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 4, StringSerializer.INSTANCE, null);
            int iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 5);
            objDecodeNullableSerializableElement4 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 6, StringSerializer.INSTANCE, null);
            objDecodeNullableSerializableElement6 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 7, StringSerializer.INSTANCE, null);
            Object objDecodeNullableSerializableElement10 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 8, StringSerializer.INSTANCE, null);
            Object objDecodeNullableSerializableElement11 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 9, StringSerializer.INSTANCE, null);
            Object objDecodeNullableSerializableElement12 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 10, StringSerializer.INSTANCE, null);
            float fDecodeFloatElement3 = compositeDecoderBeginStructure.decodeFloatElement(descriptor2, 11);
            int iDecodeIntElement5 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 12);
            boolean zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(descriptor2, 13);
            iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 14);
            boolean zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(descriptor2, 15);
            obj = objDecodeNullableSerializableElement9;
            objDecodeNullableSerializableElement5 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 16, StringSerializer.INSTANCE, null);
            z2 = zDecodeBooleanElement2;
            i = 524287;
            obj4 = objDecodeNullableSerializableElement8;
            zDecodeBooleanElement = zDecodeBooleanElement3;
            fDecodeFloatElement = fDecodeFloatElement3;
            iDecodeIntElement = iDecodeIntElement4;
            iDecodeIntElement2 = iDecodeIntElement5;
            f = fDecodeFloatElement2;
            objDecodeNullableSerializableElement2 = objDecodeNullableSerializableElement10;
            obj3 = objDecodeNullableSerializableElement12;
            obj2 = objDecodeNullableSerializableElement11;
            objDecodeNullableSerializableElement3 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 17, StringSerializer.INSTANCE, null);
            objDecodeNullableSerializableElement = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 18, StringSerializer.INSTANCE, null);
            obj5 = objDecodeNullableSerializableElement7;
            z = zDecodeBooleanElement4;
        } else {
            int i3 = 18;
            int i4 = 0;
            boolean z3 = true;
            Object objDecodeNullableSerializableElement13 = null;
            Object objDecodeNullableSerializableElement14 = null;
            Object objDecodeNullableSerializableElement15 = null;
            Object objDecodeNullableSerializableElement16 = null;
            objDecodeNullableSerializableElement = null;
            Object objDecodeNullableSerializableElement17 = null;
            Object objDecodeNullableSerializableElement18 = null;
            Object objDecodeNullableSerializableElement19 = null;
            objDecodeNullableSerializableElement2 = null;
            Object objDecodeNullableSerializableElement20 = null;
            Object objDecodeNullableSerializableElement21 = null;
            int iDecodeIntElement6 = 0;
            boolean zDecodeBooleanElement5 = false;
            zDecodeBooleanElement = false;
            iDecodeIntElement = 0;
            iDecodeIntElement2 = 0;
            float fDecodeFloatElement4 = 0.0f;
            fDecodeFloatElement = 0.0f;
            boolean zDecodeBooleanElement6 = false;
            while (z3) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        z3 = false;
                        i3 = 18;
                    case 0:
                        obj6 = objDecodeNullableSerializableElement15;
                        i4 |= 1;
                        objDecodeNullableSerializableElement21 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 0, StringSerializer.INSTANCE, objDecodeNullableSerializableElement21);
                        objDecodeNullableSerializableElement15 = obj6;
                        i3 = 18;
                    case 1:
                        obj6 = objDecodeNullableSerializableElement15;
                        zDecodeBooleanElement5 = compositeDecoderBeginStructure.decodeBooleanElement(descriptor2, 1);
                        i4 |= 2;
                        objDecodeNullableSerializableElement15 = obj6;
                        i3 = 18;
                    case 2:
                        obj6 = objDecodeNullableSerializableElement15;
                        objDecodeNullableSerializableElement13 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 2, StringSerializer.INSTANCE, objDecodeNullableSerializableElement13);
                        i4 |= 4;
                        objDecodeNullableSerializableElement15 = obj6;
                        i3 = 18;
                    case 3:
                        obj6 = objDecodeNullableSerializableElement15;
                        fDecodeFloatElement4 = compositeDecoderBeginStructure.decodeFloatElement(descriptor2, 3);
                        i4 |= 8;
                        objDecodeNullableSerializableElement15 = obj6;
                        i3 = 18;
                    case 4:
                        obj6 = objDecodeNullableSerializableElement15;
                        objDecodeNullableSerializableElement16 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 4, StringSerializer.INSTANCE, objDecodeNullableSerializableElement16);
                        i4 |= 16;
                        objDecodeNullableSerializableElement15 = obj6;
                        i3 = 18;
                    case 5:
                        obj6 = objDecodeNullableSerializableElement15;
                        iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 5);
                        i4 |= 32;
                        objDecodeNullableSerializableElement15 = obj6;
                        i3 = 18;
                    case 6:
                        obj6 = objDecodeNullableSerializableElement15;
                        objDecodeNullableSerializableElement20 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 6, StringSerializer.INSTANCE, objDecodeNullableSerializableElement20);
                        i4 |= 64;
                        objDecodeNullableSerializableElement15 = obj6;
                        i3 = 18;
                    case 7:
                        obj6 = objDecodeNullableSerializableElement15;
                        objDecodeNullableSerializableElement14 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 7, StringSerializer.INSTANCE, objDecodeNullableSerializableElement14);
                        i4 |= 128;
                        objDecodeNullableSerializableElement15 = obj6;
                        i3 = 18;
                    case 8:
                        obj6 = objDecodeNullableSerializableElement15;
                        objDecodeNullableSerializableElement2 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 8, StringSerializer.INSTANCE, objDecodeNullableSerializableElement2);
                        i4 |= 256;
                        objDecodeNullableSerializableElement15 = obj6;
                        i3 = 18;
                    case 9:
                        obj6 = objDecodeNullableSerializableElement15;
                        objDecodeNullableSerializableElement19 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 9, StringSerializer.INSTANCE, objDecodeNullableSerializableElement19);
                        i4 |= 512;
                        objDecodeNullableSerializableElement15 = obj6;
                        i3 = 18;
                    case 10:
                        obj6 = objDecodeNullableSerializableElement15;
                        objDecodeNullableSerializableElement18 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 10, StringSerializer.INSTANCE, objDecodeNullableSerializableElement18);
                        i4 |= 1024;
                        objDecodeNullableSerializableElement15 = obj6;
                        i3 = 18;
                    case 11:
                        fDecodeFloatElement = compositeDecoderBeginStructure.decodeFloatElement(descriptor2, 11);
                        i4 |= 2048;
                        i3 = 18;
                    case 12:
                        iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 12);
                        i4 |= 4096;
                        i3 = 18;
                    case 13:
                        zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(descriptor2, 13);
                        i4 |= 8192;
                        i3 = 18;
                    case 14:
                        i4 |= 16384;
                        iDecodeIntElement6 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 14);
                        i3 = 18;
                    case 15:
                        zDecodeBooleanElement6 = compositeDecoderBeginStructure.decodeBooleanElement(descriptor2, 15);
                        i4 |= 32768;
                        i3 = 18;
                    case 16:
                        objDecodeNullableSerializableElement15 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 16, StringSerializer.INSTANCE, objDecodeNullableSerializableElement15);
                        i2 = 65536;
                        i4 |= i2;
                        i3 = 18;
                    case 17:
                        objDecodeNullableSerializableElement17 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 17, StringSerializer.INSTANCE, objDecodeNullableSerializableElement17);
                        i2 = 131072;
                        i4 |= i2;
                        i3 = 18;
                    case 18:
                        objDecodeNullableSerializableElement = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, i3, StringSerializer.INSTANCE, objDecodeNullableSerializableElement);
                        i4 |= 262144;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            Object obj7 = objDecodeNullableSerializableElement15;
            obj = objDecodeNullableSerializableElement16;
            objDecodeNullableSerializableElement3 = objDecodeNullableSerializableElement17;
            obj2 = objDecodeNullableSerializableElement19;
            objDecodeNullableSerializableElement4 = objDecodeNullableSerializableElement20;
            z = zDecodeBooleanElement6;
            z2 = zDecodeBooleanElement5;
            obj3 = objDecodeNullableSerializableElement18;
            objDecodeNullableSerializableElement5 = obj7;
            objDecodeNullableSerializableElement6 = objDecodeNullableSerializableElement14;
            iDecodeIntElement3 = iDecodeIntElement6;
            obj4 = objDecodeNullableSerializableElement13;
            obj5 = objDecodeNullableSerializableElement21;
            i = i4;
            f = fDecodeFloatElement4;
        }
        compositeDecoderBeginStructure.endStructure(descriptor2);
        return new DeviceNode.AndroidAmazonExt(i, (String) obj5, z2, (String) obj4, f, (String) obj, iDecodeIntElement, (String) objDecodeNullableSerializableElement4, (String) objDecodeNullableSerializableElement6, (String) objDecodeNullableSerializableElement2, (String) obj2, (String) obj3, fDecodeFloatElement, iDecodeIntElement2, zDecodeBooleanElement, iDecodeIntElement3, z, (String) objDecodeNullableSerializableElement5, (String) objDecodeNullableSerializableElement3, (String) objDecodeNullableSerializableElement, null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, DeviceNode.AndroidAmazonExt value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor2);
        DeviceNode.AndroidAmazonExt.write$Self(value, compositeEncoderBeginStructure, descriptor2);
        compositeEncoderBeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
