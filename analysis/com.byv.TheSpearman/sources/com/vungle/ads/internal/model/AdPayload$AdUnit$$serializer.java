package com.vungle.ads.internal.model;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.json.unity.androidbridge.AndroidBridgeConstants;
import com.vungle.ads.internal.model.AdPayload;
import java.util.List;
import java.util.Map;
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

/* compiled from: AdPayload.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"com/vungle/ads/internal/model/AdPayload.AdUnit.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/vungle/ads/internal/model/AdPayload$AdUnit;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* loaded from: classes5.dex */
public final class AdPayload$AdUnit$$serializer implements GeneratedSerializer<AdPayload.AdUnit> {
    public static final AdPayload$AdUnit$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        AdPayload$AdUnit$$serializer adPayload$AdUnit$$serializer = new AdPayload$AdUnit$$serializer();
        INSTANCE = adPayload$AdUnit$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.AdPayload.AdUnit", adPayload$AdUnit$$serializer, 26);
        pluginGeneratedSerialDescriptor.addElement("id", true);
        pluginGeneratedSerialDescriptor.addElement("adType", true);
        pluginGeneratedSerialDescriptor.addElement("adSource", true);
        pluginGeneratedSerialDescriptor.addElement(FirebaseAnalytics.Param.CAMPAIGN, true);
        pluginGeneratedSerialDescriptor.addElement("expiry", true);
        pluginGeneratedSerialDescriptor.addElement("app_id", true);
        pluginGeneratedSerialDescriptor.addElement("callToActionUrl", true);
        pluginGeneratedSerialDescriptor.addElement("deeplinkUrl", true);
        pluginGeneratedSerialDescriptor.addElement("click_coordinates_enabled", true);
        pluginGeneratedSerialDescriptor.addElement("tpat", true);
        pluginGeneratedSerialDescriptor.addElement("templateURL", true);
        pluginGeneratedSerialDescriptor.addElement("templateId", true);
        pluginGeneratedSerialDescriptor.addElement("template_type", true);
        pluginGeneratedSerialDescriptor.addElement("templateSettings", true);
        pluginGeneratedSerialDescriptor.addElement("bid_token", true);
        pluginGeneratedSerialDescriptor.addElement("ad_market_id", true);
        pluginGeneratedSerialDescriptor.addElement("info", true);
        pluginGeneratedSerialDescriptor.addElement("sleep", true);
        pluginGeneratedSerialDescriptor.addElement("viewability", true);
        pluginGeneratedSerialDescriptor.addElement("adExt", true);
        pluginGeneratedSerialDescriptor.addElement("notification", true);
        pluginGeneratedSerialDescriptor.addElement("load_ad", true);
        pluginGeneratedSerialDescriptor.addElement("timestamp", true);
        pluginGeneratedSerialDescriptor.addElement("showCloseIncentivized", true);
        pluginGeneratedSerialDescriptor.addElement("showClose", true);
        pluginGeneratedSerialDescriptor.addElement(AndroidBridgeConstants.ERROR_CODE, true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private AdPayload$AdUnit$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(IntSerializer.INSTANCE), BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(BooleanSerializer.INSTANCE), BuiltinSerializersKt.getNullable(AdPayload.TpatSerializer.INSTANCE), BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(AdPayload$TemplateSettings$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(IntSerializer.INSTANCE), BuiltinSerializersKt.getNullable(AdPayload$Viewability$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(new ArrayListSerializer(StringSerializer.INSTANCE)), BuiltinSerializersKt.getNullable(new ArrayListSerializer(StringSerializer.INSTANCE)), BuiltinSerializersKt.getNullable(IntSerializer.INSTANCE), BuiltinSerializersKt.getNullable(IntSerializer.INSTANCE), BuiltinSerializersKt.getNullable(IntSerializer.INSTANCE), BuiltinSerializersKt.getNullable(IntSerializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public AdPayload.AdUnit deserialize(Decoder decoder) {
        Object objDecodeNullableSerializableElement;
        Object objDecodeNullableSerializableElement2;
        Object objDecodeNullableSerializableElement3;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object objDecodeNullableSerializableElement4;
        Object objDecodeNullableSerializableElement5;
        Object objDecodeNullableSerializableElement6;
        int i;
        Object objDecodeNullableSerializableElement7;
        Object objDecodeNullableSerializableElement8;
        Object objDecodeNullableSerializableElement9;
        Object objDecodeNullableSerializableElement10;
        Object objDecodeNullableSerializableElement11;
        Object objDecodeNullableSerializableElement12;
        Object obj7;
        Object obj8;
        Object obj9;
        Object objDecodeNullableSerializableElement13;
        Object objDecodeNullableSerializableElement14;
        Object objDecodeNullableSerializableElement15;
        Object objDecodeNullableSerializableElement16;
        Object objDecodeNullableSerializableElement17;
        Object obj10;
        Object obj11;
        int i2;
        int i3;
        Object obj12;
        Object obj13;
        Object obj14;
        Object obj15;
        Object obj16;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor2);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            Object objDecodeNullableSerializableElement18 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 0, StringSerializer.INSTANCE, null);
            Object objDecodeNullableSerializableElement19 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 1, StringSerializer.INSTANCE, null);
            objDecodeNullableSerializableElement10 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 2, StringSerializer.INSTANCE, null);
            objDecodeNullableSerializableElement11 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 3, StringSerializer.INSTANCE, null);
            objDecodeNullableSerializableElement12 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 4, IntSerializer.INSTANCE, null);
            objDecodeNullableSerializableElement13 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 5, StringSerializer.INSTANCE, null);
            Object objDecodeNullableSerializableElement20 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 6, StringSerializer.INSTANCE, null);
            Object objDecodeNullableSerializableElement21 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 7, StringSerializer.INSTANCE, null);
            objDecodeNullableSerializableElement16 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 8, BooleanSerializer.INSTANCE, null);
            objDecodeNullableSerializableElement17 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 9, AdPayload.TpatSerializer.INSTANCE, null);
            Object objDecodeNullableSerializableElement22 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 10, StringSerializer.INSTANCE, null);
            Object objDecodeNullableSerializableElement23 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 11, StringSerializer.INSTANCE, null);
            Object objDecodeNullableSerializableElement24 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 12, StringSerializer.INSTANCE, null);
            objDecodeNullableSerializableElement9 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 13, AdPayload$TemplateSettings$$serializer.INSTANCE, null);
            objDecodeNullableSerializableElement14 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 14, StringSerializer.INSTANCE, null);
            objDecodeNullableSerializableElement6 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 15, StringSerializer.INSTANCE, null);
            objDecodeNullableSerializableElement5 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 16, StringSerializer.INSTANCE, null);
            objDecodeNullableSerializableElement8 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 17, IntSerializer.INSTANCE, null);
            objDecodeNullableSerializableElement4 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 18, AdPayload$Viewability$$serializer.INSTANCE, null);
            Object objDecodeNullableSerializableElement25 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 19, StringSerializer.INSTANCE, null);
            objDecodeNullableSerializableElement7 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 20, new ArrayListSerializer(StringSerializer.INSTANCE), null);
            Object objDecodeNullableSerializableElement26 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 21, new ArrayListSerializer(StringSerializer.INSTANCE), null);
            obj9 = objDecodeNullableSerializableElement25;
            Object objDecodeNullableSerializableElement27 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 22, IntSerializer.INSTANCE, null);
            objDecodeNullableSerializableElement15 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 23, IntSerializer.INSTANCE, null);
            i = 67108863;
            obj4 = objDecodeNullableSerializableElement23;
            obj3 = objDecodeNullableSerializableElement22;
            obj2 = objDecodeNullableSerializableElement21;
            obj7 = objDecodeNullableSerializableElement20;
            obj5 = objDecodeNullableSerializableElement24;
            obj = objDecodeNullableSerializableElement27;
            objDecodeNullableSerializableElement2 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 24, IntSerializer.INSTANCE, null);
            objDecodeNullableSerializableElement = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 25, IntSerializer.INSTANCE, null);
            objDecodeNullableSerializableElement3 = objDecodeNullableSerializableElement26;
            obj6 = objDecodeNullableSerializableElement18;
            obj8 = objDecodeNullableSerializableElement19;
        } else {
            boolean z = true;
            Object objDecodeNullableSerializableElement28 = null;
            Object objDecodeNullableSerializableElement29 = null;
            Object objDecodeNullableSerializableElement30 = null;
            Object objDecodeNullableSerializableElement31 = null;
            Object objDecodeNullableSerializableElement32 = null;
            Object objDecodeNullableSerializableElement33 = null;
            Object objDecodeNullableSerializableElement34 = null;
            objDecodeNullableSerializableElement = null;
            objDecodeNullableSerializableElement2 = null;
            Object objDecodeNullableSerializableElement35 = null;
            objDecodeNullableSerializableElement3 = null;
            Object objDecodeNullableSerializableElement36 = null;
            Object objDecodeNullableSerializableElement37 = null;
            Object objDecodeNullableSerializableElement38 = null;
            Object objDecodeNullableSerializableElement39 = null;
            Object objDecodeNullableSerializableElement40 = null;
            Object objDecodeNullableSerializableElement41 = null;
            Object objDecodeNullableSerializableElement42 = null;
            Object objDecodeNullableSerializableElement43 = null;
            Object objDecodeNullableSerializableElement44 = null;
            Object objDecodeNullableSerializableElement45 = null;
            Object objDecodeNullableSerializableElement46 = null;
            Object objDecodeNullableSerializableElement47 = null;
            Object objDecodeNullableSerializableElement48 = null;
            Object objDecodeNullableSerializableElement49 = null;
            int i4 = 0;
            Object objDecodeNullableSerializableElement50 = null;
            while (z) {
                Object obj17 = objDecodeNullableSerializableElement34;
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        obj12 = objDecodeNullableSerializableElement28;
                        obj13 = objDecodeNullableSerializableElement29;
                        obj14 = objDecodeNullableSerializableElement31;
                        obj15 = obj17;
                        z = false;
                        objDecodeNullableSerializableElement28 = obj12;
                        objDecodeNullableSerializableElement29 = obj13;
                        objDecodeNullableSerializableElement34 = obj15;
                        objDecodeNullableSerializableElement31 = obj14;
                    case 0:
                        obj12 = objDecodeNullableSerializableElement28;
                        obj13 = objDecodeNullableSerializableElement29;
                        obj14 = objDecodeNullableSerializableElement31;
                        obj15 = obj17;
                        obj16 = objDecodeNullableSerializableElement50;
                        objDecodeNullableSerializableElement37 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 0, StringSerializer.INSTANCE, objDecodeNullableSerializableElement37);
                        i4 |= 1;
                        objDecodeNullableSerializableElement50 = obj16;
                        objDecodeNullableSerializableElement28 = obj12;
                        objDecodeNullableSerializableElement29 = obj13;
                        objDecodeNullableSerializableElement34 = obj15;
                        objDecodeNullableSerializableElement31 = obj14;
                    case 1:
                        obj14 = objDecodeNullableSerializableElement31;
                        objDecodeNullableSerializableElement38 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 1, StringSerializer.INSTANCE, objDecodeNullableSerializableElement38);
                        i4 |= 2;
                        objDecodeNullableSerializableElement50 = objDecodeNullableSerializableElement50;
                        objDecodeNullableSerializableElement28 = objDecodeNullableSerializableElement28;
                        objDecodeNullableSerializableElement29 = objDecodeNullableSerializableElement29;
                        objDecodeNullableSerializableElement34 = obj17;
                        objDecodeNullableSerializableElement39 = objDecodeNullableSerializableElement39;
                        objDecodeNullableSerializableElement31 = obj14;
                    case 2:
                        obj14 = objDecodeNullableSerializableElement31;
                        objDecodeNullableSerializableElement39 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 2, StringSerializer.INSTANCE, objDecodeNullableSerializableElement39);
                        i4 |= 4;
                        objDecodeNullableSerializableElement50 = objDecodeNullableSerializableElement50;
                        objDecodeNullableSerializableElement28 = objDecodeNullableSerializableElement28;
                        objDecodeNullableSerializableElement29 = objDecodeNullableSerializableElement29;
                        objDecodeNullableSerializableElement34 = obj17;
                        objDecodeNullableSerializableElement40 = objDecodeNullableSerializableElement40;
                        objDecodeNullableSerializableElement31 = obj14;
                    case 3:
                        obj14 = objDecodeNullableSerializableElement31;
                        objDecodeNullableSerializableElement40 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 3, StringSerializer.INSTANCE, objDecodeNullableSerializableElement40);
                        i4 |= 8;
                        objDecodeNullableSerializableElement50 = objDecodeNullableSerializableElement50;
                        objDecodeNullableSerializableElement28 = objDecodeNullableSerializableElement28;
                        objDecodeNullableSerializableElement29 = objDecodeNullableSerializableElement29;
                        objDecodeNullableSerializableElement34 = obj17;
                        objDecodeNullableSerializableElement41 = objDecodeNullableSerializableElement41;
                        objDecodeNullableSerializableElement31 = obj14;
                    case 4:
                        obj14 = objDecodeNullableSerializableElement31;
                        objDecodeNullableSerializableElement41 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 4, IntSerializer.INSTANCE, objDecodeNullableSerializableElement41);
                        i4 |= 16;
                        objDecodeNullableSerializableElement50 = objDecodeNullableSerializableElement50;
                        objDecodeNullableSerializableElement28 = objDecodeNullableSerializableElement28;
                        objDecodeNullableSerializableElement29 = objDecodeNullableSerializableElement29;
                        objDecodeNullableSerializableElement34 = obj17;
                        objDecodeNullableSerializableElement42 = objDecodeNullableSerializableElement42;
                        objDecodeNullableSerializableElement31 = obj14;
                    case 5:
                        obj14 = objDecodeNullableSerializableElement31;
                        objDecodeNullableSerializableElement42 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 5, StringSerializer.INSTANCE, objDecodeNullableSerializableElement42);
                        i4 |= 32;
                        objDecodeNullableSerializableElement50 = objDecodeNullableSerializableElement50;
                        objDecodeNullableSerializableElement28 = objDecodeNullableSerializableElement28;
                        objDecodeNullableSerializableElement29 = objDecodeNullableSerializableElement29;
                        objDecodeNullableSerializableElement34 = obj17;
                        objDecodeNullableSerializableElement43 = objDecodeNullableSerializableElement43;
                        objDecodeNullableSerializableElement31 = obj14;
                    case 6:
                        obj14 = objDecodeNullableSerializableElement31;
                        objDecodeNullableSerializableElement43 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 6, StringSerializer.INSTANCE, objDecodeNullableSerializableElement43);
                        i4 |= 64;
                        objDecodeNullableSerializableElement50 = objDecodeNullableSerializableElement50;
                        objDecodeNullableSerializableElement28 = objDecodeNullableSerializableElement28;
                        objDecodeNullableSerializableElement29 = objDecodeNullableSerializableElement29;
                        objDecodeNullableSerializableElement34 = obj17;
                        objDecodeNullableSerializableElement44 = objDecodeNullableSerializableElement44;
                        objDecodeNullableSerializableElement31 = obj14;
                    case 7:
                        obj14 = objDecodeNullableSerializableElement31;
                        objDecodeNullableSerializableElement44 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 7, StringSerializer.INSTANCE, objDecodeNullableSerializableElement44);
                        i4 |= 128;
                        objDecodeNullableSerializableElement50 = objDecodeNullableSerializableElement50;
                        objDecodeNullableSerializableElement28 = objDecodeNullableSerializableElement28;
                        objDecodeNullableSerializableElement29 = objDecodeNullableSerializableElement29;
                        objDecodeNullableSerializableElement34 = obj17;
                        objDecodeNullableSerializableElement45 = objDecodeNullableSerializableElement45;
                        objDecodeNullableSerializableElement31 = obj14;
                    case 8:
                        obj14 = objDecodeNullableSerializableElement31;
                        objDecodeNullableSerializableElement45 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 8, BooleanSerializer.INSTANCE, objDecodeNullableSerializableElement45);
                        i4 |= 256;
                        objDecodeNullableSerializableElement50 = objDecodeNullableSerializableElement50;
                        objDecodeNullableSerializableElement28 = objDecodeNullableSerializableElement28;
                        objDecodeNullableSerializableElement29 = objDecodeNullableSerializableElement29;
                        objDecodeNullableSerializableElement34 = obj17;
                        objDecodeNullableSerializableElement46 = objDecodeNullableSerializableElement46;
                        objDecodeNullableSerializableElement31 = obj14;
                    case 9:
                        obj14 = objDecodeNullableSerializableElement31;
                        objDecodeNullableSerializableElement46 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 9, AdPayload.TpatSerializer.INSTANCE, objDecodeNullableSerializableElement46);
                        i4 |= 512;
                        objDecodeNullableSerializableElement50 = objDecodeNullableSerializableElement50;
                        objDecodeNullableSerializableElement28 = objDecodeNullableSerializableElement28;
                        objDecodeNullableSerializableElement29 = objDecodeNullableSerializableElement29;
                        objDecodeNullableSerializableElement34 = obj17;
                        objDecodeNullableSerializableElement47 = objDecodeNullableSerializableElement47;
                        objDecodeNullableSerializableElement31 = obj14;
                    case 10:
                        obj14 = objDecodeNullableSerializableElement31;
                        objDecodeNullableSerializableElement47 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 10, StringSerializer.INSTANCE, objDecodeNullableSerializableElement47);
                        i4 |= 1024;
                        objDecodeNullableSerializableElement50 = objDecodeNullableSerializableElement50;
                        objDecodeNullableSerializableElement28 = objDecodeNullableSerializableElement28;
                        objDecodeNullableSerializableElement29 = objDecodeNullableSerializableElement29;
                        objDecodeNullableSerializableElement34 = obj17;
                        objDecodeNullableSerializableElement48 = objDecodeNullableSerializableElement48;
                        objDecodeNullableSerializableElement31 = obj14;
                    case 11:
                        obj14 = objDecodeNullableSerializableElement31;
                        objDecodeNullableSerializableElement48 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 11, StringSerializer.INSTANCE, objDecodeNullableSerializableElement48);
                        i4 |= 2048;
                        objDecodeNullableSerializableElement50 = objDecodeNullableSerializableElement50;
                        objDecodeNullableSerializableElement28 = objDecodeNullableSerializableElement28;
                        objDecodeNullableSerializableElement29 = objDecodeNullableSerializableElement29;
                        objDecodeNullableSerializableElement34 = obj17;
                        objDecodeNullableSerializableElement49 = objDecodeNullableSerializableElement49;
                        objDecodeNullableSerializableElement31 = obj14;
                    case 12:
                        obj12 = objDecodeNullableSerializableElement28;
                        obj13 = objDecodeNullableSerializableElement29;
                        obj14 = objDecodeNullableSerializableElement31;
                        obj16 = objDecodeNullableSerializableElement50;
                        obj15 = obj17;
                        objDecodeNullableSerializableElement49 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 12, StringSerializer.INSTANCE, objDecodeNullableSerializableElement49);
                        i4 |= 4096;
                        objDecodeNullableSerializableElement50 = obj16;
                        objDecodeNullableSerializableElement28 = obj12;
                        objDecodeNullableSerializableElement29 = obj13;
                        objDecodeNullableSerializableElement34 = obj15;
                        objDecodeNullableSerializableElement31 = obj14;
                    case 13:
                        obj14 = objDecodeNullableSerializableElement31;
                        i4 |= 8192;
                        objDecodeNullableSerializableElement34 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 13, AdPayload$TemplateSettings$$serializer.INSTANCE, obj17);
                        objDecodeNullableSerializableElement50 = objDecodeNullableSerializableElement50;
                        objDecodeNullableSerializableElement28 = objDecodeNullableSerializableElement28;
                        objDecodeNullableSerializableElement29 = objDecodeNullableSerializableElement29;
                        objDecodeNullableSerializableElement31 = obj14;
                    case 14:
                        obj14 = objDecodeNullableSerializableElement31;
                        objDecodeNullableSerializableElement50 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 14, StringSerializer.INSTANCE, objDecodeNullableSerializableElement50);
                        i4 |= 16384;
                        objDecodeNullableSerializableElement28 = objDecodeNullableSerializableElement28;
                        objDecodeNullableSerializableElement34 = obj17;
                        objDecodeNullableSerializableElement31 = obj14;
                    case 15:
                        obj10 = objDecodeNullableSerializableElement50;
                        obj11 = objDecodeNullableSerializableElement31;
                        objDecodeNullableSerializableElement33 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 15, StringSerializer.INSTANCE, objDecodeNullableSerializableElement33);
                        i2 = 32768;
                        i4 |= i2;
                        objDecodeNullableSerializableElement34 = obj17;
                        objDecodeNullableSerializableElement31 = obj11;
                        objDecodeNullableSerializableElement50 = obj10;
                    case 16:
                        obj10 = objDecodeNullableSerializableElement50;
                        obj11 = objDecodeNullableSerializableElement31;
                        objDecodeNullableSerializableElement32 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 16, StringSerializer.INSTANCE, objDecodeNullableSerializableElement32);
                        i2 = 65536;
                        i4 |= i2;
                        objDecodeNullableSerializableElement34 = obj17;
                        objDecodeNullableSerializableElement31 = obj11;
                        objDecodeNullableSerializableElement50 = obj10;
                    case 17:
                        obj10 = objDecodeNullableSerializableElement50;
                        obj11 = objDecodeNullableSerializableElement31;
                        objDecodeNullableSerializableElement29 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 17, IntSerializer.INSTANCE, objDecodeNullableSerializableElement29);
                        i2 = 131072;
                        i4 |= i2;
                        objDecodeNullableSerializableElement34 = obj17;
                        objDecodeNullableSerializableElement31 = obj11;
                        objDecodeNullableSerializableElement50 = obj10;
                    case 18:
                        obj10 = objDecodeNullableSerializableElement50;
                        obj11 = objDecodeNullableSerializableElement31;
                        objDecodeNullableSerializableElement30 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 18, AdPayload$Viewability$$serializer.INSTANCE, objDecodeNullableSerializableElement30);
                        i2 = 262144;
                        i4 |= i2;
                        objDecodeNullableSerializableElement34 = obj17;
                        objDecodeNullableSerializableElement31 = obj11;
                        objDecodeNullableSerializableElement50 = obj10;
                    case 19:
                        obj10 = objDecodeNullableSerializableElement50;
                        obj11 = objDecodeNullableSerializableElement31;
                        objDecodeNullableSerializableElement28 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 19, StringSerializer.INSTANCE, objDecodeNullableSerializableElement28);
                        i2 = 524288;
                        i4 |= i2;
                        objDecodeNullableSerializableElement34 = obj17;
                        objDecodeNullableSerializableElement31 = obj11;
                        objDecodeNullableSerializableElement50 = obj10;
                    case 20:
                        obj10 = objDecodeNullableSerializableElement50;
                        objDecodeNullableSerializableElement36 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 20, new ArrayListSerializer(StringSerializer.INSTANCE), objDecodeNullableSerializableElement36);
                        i3 = 1048576;
                        i4 |= i3;
                        objDecodeNullableSerializableElement34 = obj17;
                        objDecodeNullableSerializableElement50 = obj10;
                    case 21:
                        obj10 = objDecodeNullableSerializableElement50;
                        objDecodeNullableSerializableElement3 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 21, new ArrayListSerializer(StringSerializer.INSTANCE), objDecodeNullableSerializableElement3);
                        i3 = 2097152;
                        i4 |= i3;
                        objDecodeNullableSerializableElement34 = obj17;
                        objDecodeNullableSerializableElement50 = obj10;
                    case 22:
                        obj10 = objDecodeNullableSerializableElement50;
                        objDecodeNullableSerializableElement31 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 22, IntSerializer.INSTANCE, objDecodeNullableSerializableElement31);
                        i3 = 4194304;
                        i4 |= i3;
                        objDecodeNullableSerializableElement34 = obj17;
                        objDecodeNullableSerializableElement50 = obj10;
                    case 23:
                        obj10 = objDecodeNullableSerializableElement50;
                        objDecodeNullableSerializableElement35 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 23, IntSerializer.INSTANCE, objDecodeNullableSerializableElement35);
                        i3 = 8388608;
                        i4 |= i3;
                        objDecodeNullableSerializableElement34 = obj17;
                        objDecodeNullableSerializableElement50 = obj10;
                    case 24:
                        obj10 = objDecodeNullableSerializableElement50;
                        objDecodeNullableSerializableElement2 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 24, IntSerializer.INSTANCE, objDecodeNullableSerializableElement2);
                        i3 = 16777216;
                        i4 |= i3;
                        objDecodeNullableSerializableElement34 = obj17;
                        objDecodeNullableSerializableElement50 = obj10;
                    case 25:
                        obj10 = objDecodeNullableSerializableElement50;
                        objDecodeNullableSerializableElement = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 25, IntSerializer.INSTANCE, objDecodeNullableSerializableElement);
                        i3 = 33554432;
                        i4 |= i3;
                        objDecodeNullableSerializableElement34 = obj17;
                        objDecodeNullableSerializableElement50 = obj10;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            obj = objDecodeNullableSerializableElement31;
            Object obj18 = objDecodeNullableSerializableElement34;
            obj2 = objDecodeNullableSerializableElement44;
            obj3 = objDecodeNullableSerializableElement47;
            obj4 = objDecodeNullableSerializableElement48;
            obj5 = objDecodeNullableSerializableElement49;
            Object obj19 = objDecodeNullableSerializableElement50;
            obj6 = objDecodeNullableSerializableElement37;
            objDecodeNullableSerializableElement4 = objDecodeNullableSerializableElement30;
            objDecodeNullableSerializableElement5 = objDecodeNullableSerializableElement32;
            objDecodeNullableSerializableElement6 = objDecodeNullableSerializableElement33;
            i = i4;
            objDecodeNullableSerializableElement7 = objDecodeNullableSerializableElement36;
            objDecodeNullableSerializableElement8 = objDecodeNullableSerializableElement29;
            objDecodeNullableSerializableElement9 = obj18;
            objDecodeNullableSerializableElement10 = objDecodeNullableSerializableElement39;
            objDecodeNullableSerializableElement11 = objDecodeNullableSerializableElement40;
            objDecodeNullableSerializableElement12 = objDecodeNullableSerializableElement41;
            obj7 = objDecodeNullableSerializableElement43;
            obj8 = objDecodeNullableSerializableElement38;
            obj9 = objDecodeNullableSerializableElement28;
            objDecodeNullableSerializableElement13 = objDecodeNullableSerializableElement42;
            objDecodeNullableSerializableElement14 = obj19;
            objDecodeNullableSerializableElement15 = objDecodeNullableSerializableElement35;
            objDecodeNullableSerializableElement16 = objDecodeNullableSerializableElement45;
            objDecodeNullableSerializableElement17 = objDecodeNullableSerializableElement46;
        }
        compositeDecoderBeginStructure.endStructure(descriptor2);
        return new AdPayload.AdUnit(i, (String) obj6, (String) obj8, (String) objDecodeNullableSerializableElement10, (String) objDecodeNullableSerializableElement11, (Integer) objDecodeNullableSerializableElement12, (String) objDecodeNullableSerializableElement13, (String) obj7, (String) obj2, (Boolean) objDecodeNullableSerializableElement16, (Map) objDecodeNullableSerializableElement17, (String) obj3, (String) obj4, (String) obj5, (AdPayload.TemplateSettings) objDecodeNullableSerializableElement9, (String) objDecodeNullableSerializableElement14, (String) objDecodeNullableSerializableElement6, (String) objDecodeNullableSerializableElement5, (Integer) objDecodeNullableSerializableElement8, (AdPayload.Viewability) objDecodeNullableSerializableElement4, (String) obj9, (List) objDecodeNullableSerializableElement7, (List) objDecodeNullableSerializableElement3, (Integer) obj, (Integer) objDecodeNullableSerializableElement15, (Integer) objDecodeNullableSerializableElement2, (Integer) objDecodeNullableSerializableElement, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, AdPayload.AdUnit value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor2);
        AdPayload.AdUnit.write$Self(value, compositeEncoderBeginStructure, descriptor2);
        compositeEncoderBeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
