package com.vungle.ads.internal.model;

import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.json.i5;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jacoco.core.runtime.AgentOptions;

/* compiled from: DeviceNode.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 H2\u00020\u0001:\u0006EFGHIJB\u0083\u0001\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0002\u0010\u0013Bq\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010\u0014J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\u0010\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010!J\u000b\u0010.\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\t\u0010/\u001a\u00020\u0005HÆ\u0003J\t\u00100\u001a\u00020\u0005HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u00102\u001a\u00020\u0005HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0086\u0001\u00107\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0002\u00108J\u0013\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010<\u001a\u00020\u0003HÖ\u0001J\t\u0010=\u001a\u00020\u0005HÖ\u0001J!\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020\u00002\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020DHÇ\u0001R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0016\"\u0004\b\u001e\u0010\u001fR\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010$\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0016R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0016R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0016\"\u0004\b*\u0010\u001fR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001c¨\u0006K"}, d2 = {"Lcom/vungle/ads/internal/model/DeviceNode;", "", "seen1", "", i5.q, "", i5.u, i5.y, i5.s0, i5.x, "w", CmcdHeadersFactory.STREAMING_FORMAT_HLS, i5.R, "ifa", "lmt", "ext", "Lcom/vungle/ads/internal/model/DeviceNode$DeviceExt;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/vungle/ads/internal/model/DeviceNode$DeviceExt;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/vungle/ads/internal/model/DeviceNode$DeviceExt;)V", "getCarrier", "()Ljava/lang/String;", "getExt", "()Lcom/vungle/ads/internal/model/DeviceNode$DeviceExt;", "setExt", "(Lcom/vungle/ads/internal/model/DeviceNode$DeviceExt;)V", "getH", "()I", "getIfa", "setIfa", "(Ljava/lang/String;)V", "getLmt", "()Ljava/lang/Integer;", "setLmt", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getMake", "getModel", "getOs", "getOsv", "getUa", "setUa", "getW", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/vungle/ads/internal/model/DeviceNode$DeviceExt;)Lcom/vungle/ads/internal/model/DeviceNode;", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", AgentOptions.OUTPUT, "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "AndroidAmazonExt", "CommonVungleExt", "Companion", "DeviceExt", "VungleExt", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@Serializable
/* loaded from: classes5.dex */
public final /* data */ class DeviceNode {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String carrier;
    private DeviceExt ext;
    private final int h;
    private String ifa;
    private Integer lmt;
    private final String make;
    private final String model;
    private final String os;
    private final String osv;
    private String ua;
    private final int w;

    /* renamed from: component1, reason: from getter */
    public final String getMake() {
        return this.make;
    }

    /* renamed from: component10, reason: from getter */
    public final Integer getLmt() {
        return this.lmt;
    }

    /* renamed from: component11, reason: from getter */
    public final DeviceExt getExt() {
        return this.ext;
    }

    /* renamed from: component2, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    /* renamed from: component3, reason: from getter */
    public final String getOsv() {
        return this.osv;
    }

    /* renamed from: component4, reason: from getter */
    public final String getCarrier() {
        return this.carrier;
    }

    /* renamed from: component5, reason: from getter */
    public final String getOs() {
        return this.os;
    }

    /* renamed from: component6, reason: from getter */
    public final int getW() {
        return this.w;
    }

    /* renamed from: component7, reason: from getter */
    public final int getH() {
        return this.h;
    }

    /* renamed from: component8, reason: from getter */
    public final String getUa() {
        return this.ua;
    }

    /* renamed from: component9, reason: from getter */
    public final String getIfa() {
        return this.ifa;
    }

    public final DeviceNode copy(String make, String model, String osv, String carrier, String os, int w, int h, String ua, String ifa, Integer lmt, DeviceExt ext) {
        Intrinsics.checkNotNullParameter(make, "make");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(osv, "osv");
        Intrinsics.checkNotNullParameter(os, "os");
        return new DeviceNode(make, model, osv, carrier, os, w, h, ua, ifa, lmt, ext);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceNode)) {
            return false;
        }
        DeviceNode deviceNode = (DeviceNode) other;
        return Intrinsics.areEqual(this.make, deviceNode.make) && Intrinsics.areEqual(this.model, deviceNode.model) && Intrinsics.areEqual(this.osv, deviceNode.osv) && Intrinsics.areEqual(this.carrier, deviceNode.carrier) && Intrinsics.areEqual(this.os, deviceNode.os) && this.w == deviceNode.w && this.h == deviceNode.h && Intrinsics.areEqual(this.ua, deviceNode.ua) && Intrinsics.areEqual(this.ifa, deviceNode.ifa) && Intrinsics.areEqual(this.lmt, deviceNode.lmt) && Intrinsics.areEqual(this.ext, deviceNode.ext);
    }

    public int hashCode() {
        int iHashCode = ((((this.make.hashCode() * 31) + this.model.hashCode()) * 31) + this.osv.hashCode()) * 31;
        String str = this.carrier;
        int iHashCode2 = (((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.os.hashCode()) * 31) + this.w) * 31) + this.h) * 31;
        String str2 = this.ua;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.ifa;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.lmt;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        DeviceExt deviceExt = this.ext;
        return iHashCode5 + (deviceExt != null ? deviceExt.hashCode() : 0);
    }

    public String toString() {
        return "DeviceNode(make=" + this.make + ", model=" + this.model + ", osv=" + this.osv + ", carrier=" + this.carrier + ", os=" + this.os + ", w=" + this.w + ", h=" + this.h + ", ua=" + this.ua + ", ifa=" + this.ifa + ", lmt=" + this.lmt + ", ext=" + this.ext + ')';
    }

    /* compiled from: DeviceNode.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/model/DeviceNode$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/model/DeviceNode;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<DeviceNode> serializer() {
            return DeviceNode$$serializer.INSTANCE;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ DeviceNode(int i, String str, String str2, String str3, String str4, String str5, int i2, int i3, String str6, String str7, Integer num, DeviceExt deviceExt, SerializationConstructorMarker serializationConstructorMarker) {
        if (119 != (i & 119)) {
            PluginExceptionsKt.throwMissingFieldException(i, 119, DeviceNode$$serializer.INSTANCE.getDescriptor());
        }
        this.make = str;
        this.model = str2;
        this.osv = str3;
        if ((i & 8) == 0) {
            this.carrier = null;
        } else {
            this.carrier = str4;
        }
        this.os = str5;
        this.w = i2;
        this.h = i3;
        if ((i & 128) == 0) {
            this.ua = null;
        } else {
            this.ua = str6;
        }
        if ((i & 256) == 0) {
            this.ifa = null;
        } else {
            this.ifa = str7;
        }
        if ((i & 512) == 0) {
            this.lmt = null;
        } else {
            this.lmt = num;
        }
        if ((i & 1024) == 0) {
            this.ext = null;
        } else {
            this.ext = deviceExt;
        }
    }

    public DeviceNode(String make, String model, String osv, String str, String os, int i, int i2, String str2, String str3, Integer num, DeviceExt deviceExt) {
        Intrinsics.checkNotNullParameter(make, "make");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(osv, "osv");
        Intrinsics.checkNotNullParameter(os, "os");
        this.make = make;
        this.model = model;
        this.osv = osv;
        this.carrier = str;
        this.os = os;
        this.w = i;
        this.h = i2;
        this.ua = str2;
        this.ifa = str3;
        this.lmt = num;
        this.ext = deviceExt;
    }

    @JvmStatic
    public static final void write$Self(DeviceNode self, CompositeEncoder output, SerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        output.encodeStringElement(serialDesc, 0, self.make);
        output.encodeStringElement(serialDesc, 1, self.model);
        output.encodeStringElement(serialDesc, 2, self.osv);
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.carrier != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.carrier);
        }
        output.encodeStringElement(serialDesc, 4, self.os);
        output.encodeIntElement(serialDesc, 5, self.w);
        output.encodeIntElement(serialDesc, 6, self.h);
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.ua != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, StringSerializer.INSTANCE, self.ua);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.ifa != null) {
            output.encodeNullableSerializableElement(serialDesc, 8, StringSerializer.INSTANCE, self.ifa);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 9) || self.lmt != null) {
            output.encodeNullableSerializableElement(serialDesc, 9, IntSerializer.INSTANCE, self.lmt);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 10) || self.ext != null) {
            output.encodeNullableSerializableElement(serialDesc, 10, DeviceNode$DeviceExt$$serializer.INSTANCE, self.ext);
        }
    }

    public /* synthetic */ DeviceNode(String str, String str2, String str3, String str4, String str5, int i, int i2, String str6, String str7, Integer num, DeviceExt deviceExt, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i3 & 8) != 0 ? null : str4, str5, i, i2, (i3 & 128) != 0 ? null : str6, (i3 & 256) != 0 ? null : str7, (i3 & 512) != 0 ? null : num, (i3 & 1024) != 0 ? null : deviceExt);
    }

    public final String getMake() {
        return this.make;
    }

    public final String getModel() {
        return this.model;
    }

    public final String getOsv() {
        return this.osv;
    }

    public final String getCarrier() {
        return this.carrier;
    }

    public final String getOs() {
        return this.os;
    }

    public final int getW() {
        return this.w;
    }

    public final int getH() {
        return this.h;
    }

    public final String getUa() {
        return this.ua;
    }

    public final void setUa(String str) {
        this.ua = str;
    }

    public final String getIfa() {
        return this.ifa;
    }

    public final void setIfa(String str) {
        this.ifa = str;
    }

    public final Integer getLmt() {
        return this.lmt;
    }

    public final void setLmt(Integer num) {
        this.lmt = num;
    }

    public final DeviceExt getExt() {
        return this.ext;
    }

    public final void setExt(DeviceExt deviceExt) {
        this.ext = deviceExt;
    }

    /* compiled from: DeviceNode.kt */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001b\u001cB#\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J!\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aHÇ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/vungle/ads/internal/model/DeviceNode$DeviceExt;", "", "seen1", "", "vungle", "Lcom/vungle/ads/internal/model/DeviceNode$VungleExt;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/vungle/ads/internal/model/DeviceNode$VungleExt;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lcom/vungle/ads/internal/model/DeviceNode$VungleExt;)V", "getVungle", "()Lcom/vungle/ads/internal/model/DeviceNode$VungleExt;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", AgentOptions.OUTPUT, "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @Serializable
    public static final /* data */ class DeviceExt {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final VungleExt vungle;

        public static /* synthetic */ DeviceExt copy$default(DeviceExt deviceExt, VungleExt vungleExt, int i, Object obj) {
            if ((i & 1) != 0) {
                vungleExt = deviceExt.vungle;
            }
            return deviceExt.copy(vungleExt);
        }

        /* renamed from: component1, reason: from getter */
        public final VungleExt getVungle() {
            return this.vungle;
        }

        public final DeviceExt copy(VungleExt vungle) {
            Intrinsics.checkNotNullParameter(vungle, "vungle");
            return new DeviceExt(vungle);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DeviceExt) && Intrinsics.areEqual(this.vungle, ((DeviceExt) other).vungle);
        }

        public int hashCode() {
            return this.vungle.hashCode();
        }

        public String toString() {
            return "DeviceExt(vungle=" + this.vungle + ')';
        }

        /* compiled from: DeviceNode.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/model/DeviceNode$DeviceExt$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/model/DeviceNode$DeviceExt;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<DeviceExt> serializer() {
                return DeviceNode$DeviceExt$$serializer.INSTANCE;
            }
        }

        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public /* synthetic */ DeviceExt(int i, VungleExt vungleExt, SerializationConstructorMarker serializationConstructorMarker) {
            if (1 != (i & 1)) {
                PluginExceptionsKt.throwMissingFieldException(i, 1, DeviceNode$DeviceExt$$serializer.INSTANCE.getDescriptor());
            }
            this.vungle = vungleExt;
        }

        public DeviceExt(VungleExt vungle) {
            Intrinsics.checkNotNullParameter(vungle, "vungle");
            this.vungle = vungle;
        }

        @JvmStatic
        public static final void write$Self(DeviceExt self, CompositeEncoder output, SerialDescriptor serialDesc) {
            Intrinsics.checkNotNullParameter(self, "self");
            Intrinsics.checkNotNullParameter(output, "output");
            Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
            output.encodeSerializableElement(serialDesc, 0, DeviceNode$VungleExt$$serializer.INSTANCE, self.vungle);
        }

        public final VungleExt getVungle() {
            return this.vungle;
        }
    }

    /* compiled from: DeviceNode.kt */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001e\u001fB-\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tB\u001d\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\nJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J!\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dHÇ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006 "}, d2 = {"Lcom/vungle/ads/internal/model/DeviceNode$VungleExt;", "", "seen1", "", "android", "Lcom/vungle/ads/internal/model/DeviceNode$AndroidAmazonExt;", "amazon", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/vungle/ads/internal/model/DeviceNode$AndroidAmazonExt;Lcom/vungle/ads/internal/model/DeviceNode$AndroidAmazonExt;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lcom/vungle/ads/internal/model/DeviceNode$AndroidAmazonExt;Lcom/vungle/ads/internal/model/DeviceNode$AndroidAmazonExt;)V", "getAmazon", "()Lcom/vungle/ads/internal/model/DeviceNode$AndroidAmazonExt;", "getAndroid", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", AgentOptions.OUTPUT, "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @Serializable
    public static final /* data */ class VungleExt {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final AndroidAmazonExt amazon;
        private final AndroidAmazonExt android;

        /* JADX WARN: Multi-variable type inference failed */
        public VungleExt() {
            this((AndroidAmazonExt) null, (AndroidAmazonExt) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ VungleExt copy$default(VungleExt vungleExt, AndroidAmazonExt androidAmazonExt, AndroidAmazonExt androidAmazonExt2, int i, Object obj) {
            if ((i & 1) != 0) {
                androidAmazonExt = vungleExt.android;
            }
            if ((i & 2) != 0) {
                androidAmazonExt2 = vungleExt.amazon;
            }
            return vungleExt.copy(androidAmazonExt, androidAmazonExt2);
        }

        /* renamed from: component1, reason: from getter */
        public final AndroidAmazonExt getAndroid() {
            return this.android;
        }

        /* renamed from: component2, reason: from getter */
        public final AndroidAmazonExt getAmazon() {
            return this.amazon;
        }

        public final VungleExt copy(AndroidAmazonExt android2, AndroidAmazonExt amazon) {
            return new VungleExt(android2, amazon);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof VungleExt)) {
                return false;
            }
            VungleExt vungleExt = (VungleExt) other;
            return Intrinsics.areEqual(this.android, vungleExt.android) && Intrinsics.areEqual(this.amazon, vungleExt.amazon);
        }

        public int hashCode() {
            AndroidAmazonExt androidAmazonExt = this.android;
            int iHashCode = (androidAmazonExt == null ? 0 : androidAmazonExt.hashCode()) * 31;
            AndroidAmazonExt androidAmazonExt2 = this.amazon;
            return iHashCode + (androidAmazonExt2 != null ? androidAmazonExt2.hashCode() : 0);
        }

        public String toString() {
            return "VungleExt(android=" + this.android + ", amazon=" + this.amazon + ')';
        }

        /* compiled from: DeviceNode.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/model/DeviceNode$VungleExt$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/model/DeviceNode$VungleExt;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<VungleExt> serializer() {
                return DeviceNode$VungleExt$$serializer.INSTANCE;
            }
        }

        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public /* synthetic */ VungleExt(int i, AndroidAmazonExt androidAmazonExt, AndroidAmazonExt androidAmazonExt2, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 0) != 0) {
                PluginExceptionsKt.throwMissingFieldException(i, 0, DeviceNode$VungleExt$$serializer.INSTANCE.getDescriptor());
            }
            if ((i & 1) == 0) {
                this.android = null;
            } else {
                this.android = androidAmazonExt;
            }
            if ((i & 2) == 0) {
                this.amazon = null;
            } else {
                this.amazon = androidAmazonExt2;
            }
        }

        public VungleExt(AndroidAmazonExt androidAmazonExt, AndroidAmazonExt androidAmazonExt2) {
            this.android = androidAmazonExt;
            this.amazon = androidAmazonExt2;
        }

        @JvmStatic
        public static final void write$Self(VungleExt self, CompositeEncoder output, SerialDescriptor serialDesc) {
            Intrinsics.checkNotNullParameter(self, "self");
            Intrinsics.checkNotNullParameter(output, "output");
            Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
            if (output.shouldEncodeElementDefault(serialDesc, 0) || self.android != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, DeviceNode$AndroidAmazonExt$$serializer.INSTANCE, self.android);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 1) || self.amazon != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, DeviceNode$AndroidAmazonExt$$serializer.INSTANCE, self.amazon);
            }
        }

        public /* synthetic */ VungleExt(AndroidAmazonExt androidAmazonExt, AndroidAmazonExt androidAmazonExt2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : androidAmazonExt, (i & 2) != 0 ? null : androidAmazonExt2);
        }

        public final AndroidAmazonExt getAndroid() {
            return this.android;
        }

        public final AndroidAmazonExt getAmazon() {
            return this.amazon;
        }
    }

    /* compiled from: DeviceNode.kt */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b9\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u0000 Z2\u00020\u0001:\u0002YZBÑ\u0001\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\t\u001a\u00020\n\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\f\u001a\u00020\u0003\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0012\u001a\u00020\n\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0014\u001a\u00020\u0007\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0016\u001a\u00020\u0007\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\u0002\u0010\u001aB\u0005¢\u0006\u0002\u0010\u001bJ!\u0010R\u001a\u00020S2\u0006\u0010T\u001a\u00020\u00002\u0006\u0010U\u001a\u00020V2\u0006\u0010W\u001a\u00020XHÇ\u0001R&\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u001c\u0010\u001b\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R&\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b!\u0010\u001b\u001a\u0004\b\"\u0010\u001e\"\u0004\b#\u0010 R$\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b$\u0010\u001b\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R$\u0010\f\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b)\u0010\u001b\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R&\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b.\u0010\u001b\u001a\u0004\b/\u0010\u001e\"\u0004\b0\u0010 R&\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b1\u0010\u001b\u001a\u0004\b2\u0010\u001e\"\u0004\b3\u0010 R&\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b4\u0010\u001b\u001a\u0004\b5\u0010\u001e\"\u0004\b6\u0010 R$\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b7\u0010\u001b\u001a\u0004\b\u0006\u00108\"\u0004\b9\u0010:R$\u0010\u0016\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b;\u0010\u001b\u001a\u0004\b\u0016\u00108\"\u0004\b<\u0010:R$\u0010\u0014\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b=\u0010\u001b\u001a\u0004\b\u0014\u00108\"\u0004\b>\u0010:R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010\u001e\"\u0004\b@\u0010 R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\u001e\"\u0004\bB\u0010 R&\u0010\u0017\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\bC\u0010\u001b\u001a\u0004\bD\u0010\u001e\"\u0004\bE\u0010 R$\u0010\u0015\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\bF\u0010\u001b\u001a\u0004\bG\u0010+\"\u0004\bH\u0010-R$\u0010\u0013\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\bI\u0010\u001b\u001a\u0004\bJ\u0010+\"\u0004\bK\u0010-R&\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\bL\u0010\u001b\u001a\u0004\bM\u0010\u001e\"\u0004\bN\u0010 R$\u0010\u0012\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\bO\u0010\u001b\u001a\u0004\bP\u0010&\"\u0004\bQ\u0010(¨\u0006[\u0080å\b\u0004\u0080å\b\u0006\u0080å\b\b\u0080å\b\t\u0080å\b\u000b\u0080å\b\f\u0080å\b\r\u0080å\b\u000e\u0080å\b\u000f\u0080å\b\u0010\u0080å\b\u0011\u0080å\b\u0012\u0080å\b\u0013\u0080å\b\u0014\u0080å\b\u0015\u0080å\b\u0016\u0080å\b\u0017"}, d2 = {"Lcom/vungle/ads/internal/model/DeviceNode$CommonVungleExt;", "", "seen1", "", "androidId", "", "isGooglePlayServicesAvailable", "", "appSetId", "batteryLevel", "", "batteryState", "batterySaverEnabled", "connectionType", "connectionTypeDetail", "locale", "language", RemoteConfigConstants.RequestFieldKey.TIME_ZONE, "volumeLevel", "soundEnabled", "isTv", "sdCardAvailable", "isSideloadEnabled", "osName", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;ZLjava/lang/String;FLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FIZIZLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "()V", "getAndroidId$annotations", "getAndroidId", "()Ljava/lang/String;", "setAndroidId", "(Ljava/lang/String;)V", "getAppSetId$annotations", "getAppSetId", "setAppSetId", "getBatteryLevel$annotations", "getBatteryLevel", "()F", "setBatteryLevel", "(F)V", "getBatterySaverEnabled$annotations", "getBatterySaverEnabled", "()I", "setBatterySaverEnabled", "(I)V", "getBatteryState$annotations", "getBatteryState", "setBatteryState", "getConnectionType$annotations", "getConnectionType", "setConnectionType", "getConnectionTypeDetail$annotations", "getConnectionTypeDetail", "setConnectionTypeDetail", "isGooglePlayServicesAvailable$annotations", "()Z", "setGooglePlayServicesAvailable", "(Z)V", "isSideloadEnabled$annotations", "setSideloadEnabled", "isTv$annotations", "setTv", "getLanguage", "setLanguage", "getLocale", "setLocale", "getOsName$annotations", "getOsName", "setOsName", "getSdCardAvailable$annotations", "getSdCardAvailable", "setSdCardAvailable", "getSoundEnabled$annotations", "getSoundEnabled", "setSoundEnabled", "getTimeZone$annotations", "getTimeZone", "setTimeZone", "getVolumeLevel$annotations", "getVolumeLevel", "setVolumeLevel", "write$Self", "", "self", AgentOptions.OUTPUT, "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @Serializable
    public static class CommonVungleExt {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private String androidId;
        private String appSetId;
        private float batteryLevel;
        private int batterySaverEnabled;
        private String batteryState;
        private String connectionType;
        private String connectionTypeDetail;
        private boolean isGooglePlayServicesAvailable;
        private boolean isSideloadEnabled;
        private boolean isTv;
        private String language;
        private String locale;
        private String osName;
        private int sdCardAvailable;
        private int soundEnabled;
        private String timeZone;
        private float volumeLevel;

        @SerialName("android_id")
        public static /* synthetic */ void getAndroidId$annotations() {
        }

        @SerialName("app_set_id")
        public static /* synthetic */ void getAppSetId$annotations() {
        }

        @SerialName("battery_level")
        public static /* synthetic */ void getBatteryLevel$annotations() {
        }

        @SerialName("battery_saver_enabled")
        public static /* synthetic */ void getBatterySaverEnabled$annotations() {
        }

        @SerialName("battery_state")
        public static /* synthetic */ void getBatteryState$annotations() {
        }

        @SerialName("connection_type")
        public static /* synthetic */ void getConnectionType$annotations() {
        }

        @SerialName("connection_type_detail")
        public static /* synthetic */ void getConnectionTypeDetail$annotations() {
        }

        @SerialName("os_name")
        public static /* synthetic */ void getOsName$annotations() {
        }

        @SerialName("sd_card_available")
        public static /* synthetic */ void getSdCardAvailable$annotations() {
        }

        @SerialName("sound_enabled")
        public static /* synthetic */ void getSoundEnabled$annotations() {
        }

        @SerialName("time_zone")
        public static /* synthetic */ void getTimeZone$annotations() {
        }

        @SerialName("volume_level")
        public static /* synthetic */ void getVolumeLevel$annotations() {
        }

        @SerialName("is_google_play_services_available")
        public static /* synthetic */ void isGooglePlayServicesAvailable$annotations() {
        }

        @SerialName("is_sideload_enabled")
        public static /* synthetic */ void isSideloadEnabled$annotations() {
        }

        @SerialName("is_tv")
        public static /* synthetic */ void isTv$annotations() {
        }

        /* compiled from: DeviceNode.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/model/DeviceNode$CommonVungleExt$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/model/DeviceNode$CommonVungleExt;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<CommonVungleExt> serializer() {
                return DeviceNode$CommonVungleExt$$serializer.INSTANCE;
            }
        }

        public CommonVungleExt() {
            this.soundEnabled = 1;
            this.sdCardAvailable = 1;
        }

        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public /* synthetic */ CommonVungleExt(int i, @SerialName("android_id") String str, @SerialName("is_google_play_services_available") boolean z, @SerialName("app_set_id") String str2, @SerialName("battery_level") float f, @SerialName("battery_state") String str3, @SerialName("battery_saver_enabled") int i2, @SerialName("connection_type") String str4, @SerialName("connection_type_detail") String str5, String str6, String str7, @SerialName("time_zone") String str8, @SerialName("volume_level") float f2, @SerialName("sound_enabled") int i3, @SerialName("is_tv") boolean z2, @SerialName("sd_card_available") int i4, @SerialName("is_sideload_enabled") boolean z3, @SerialName("os_name") String str9, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 0) != 0) {
                PluginExceptionsKt.throwMissingFieldException(i, 0, DeviceNode$CommonVungleExt$$serializer.INSTANCE.getDescriptor());
            }
            if ((i & 1) == 0) {
                this.androidId = null;
            } else {
                this.androidId = str;
            }
            if ((i & 2) == 0) {
                this.isGooglePlayServicesAvailable = false;
            } else {
                this.isGooglePlayServicesAvailable = z;
            }
            if ((i & 4) == 0) {
                this.appSetId = null;
            } else {
                this.appSetId = str2;
            }
            if ((i & 8) == 0) {
                this.batteryLevel = 0.0f;
            } else {
                this.batteryLevel = f;
            }
            if ((i & 16) == 0) {
                this.batteryState = null;
            } else {
                this.batteryState = str3;
            }
            if ((i & 32) == 0) {
                this.batterySaverEnabled = 0;
            } else {
                this.batterySaverEnabled = i2;
            }
            if ((i & 64) == 0) {
                this.connectionType = null;
            } else {
                this.connectionType = str4;
            }
            if ((i & 128) == 0) {
                this.connectionTypeDetail = null;
            } else {
                this.connectionTypeDetail = str5;
            }
            if ((i & 256) == 0) {
                this.locale = null;
            } else {
                this.locale = str6;
            }
            if ((i & 512) == 0) {
                this.language = null;
            } else {
                this.language = str7;
            }
            if ((i & 1024) == 0) {
                this.timeZone = null;
            } else {
                this.timeZone = str8;
            }
            if ((i & 2048) == 0) {
                this.volumeLevel = 0.0f;
            } else {
                this.volumeLevel = f2;
            }
            if ((i & 4096) == 0) {
                this.soundEnabled = 1;
            } else {
                this.soundEnabled = i3;
            }
            if ((i & 8192) == 0) {
                this.isTv = false;
            } else {
                this.isTv = z2;
            }
            if ((i & 16384) == 0) {
                this.sdCardAvailable = 1;
            } else {
                this.sdCardAvailable = i4;
            }
            if ((32768 & i) == 0) {
                this.isSideloadEnabled = false;
            } else {
                this.isSideloadEnabled = z3;
            }
            if ((i & 65536) == 0) {
                this.osName = null;
            } else {
                this.osName = str9;
            }
        }

        @JvmStatic
        public static final void write$Self(CommonVungleExt self, CompositeEncoder output, SerialDescriptor serialDesc) {
            Intrinsics.checkNotNullParameter(self, "self");
            Intrinsics.checkNotNullParameter(output, "output");
            Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
            if (output.shouldEncodeElementDefault(serialDesc, 0) || self.androidId != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.androidId);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 1) || self.isGooglePlayServicesAvailable) {
                output.encodeBooleanElement(serialDesc, 1, self.isGooglePlayServicesAvailable);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 2) || self.appSetId != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.appSetId);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 3) || !Intrinsics.areEqual((Object) Float.valueOf(self.batteryLevel), (Object) Float.valueOf(0.0f))) {
                output.encodeFloatElement(serialDesc, 3, self.batteryLevel);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 4) || self.batteryState != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.batteryState);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 5) || self.batterySaverEnabled != 0) {
                output.encodeIntElement(serialDesc, 5, self.batterySaverEnabled);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 6) || self.connectionType != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, self.connectionType);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 7) || self.connectionTypeDetail != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, StringSerializer.INSTANCE, self.connectionTypeDetail);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 8) || self.locale != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, StringSerializer.INSTANCE, self.locale);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 9) || self.language != null) {
                output.encodeNullableSerializableElement(serialDesc, 9, StringSerializer.INSTANCE, self.language);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 10) || self.timeZone != null) {
                output.encodeNullableSerializableElement(serialDesc, 10, StringSerializer.INSTANCE, self.timeZone);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 11) || !Intrinsics.areEqual((Object) Float.valueOf(self.volumeLevel), (Object) Float.valueOf(0.0f))) {
                output.encodeFloatElement(serialDesc, 11, self.volumeLevel);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 12) || self.soundEnabled != 1) {
                output.encodeIntElement(serialDesc, 12, self.soundEnabled);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 13) || self.isTv) {
                output.encodeBooleanElement(serialDesc, 13, self.isTv);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 14) || self.sdCardAvailable != 1) {
                output.encodeIntElement(serialDesc, 14, self.sdCardAvailable);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 15) || self.isSideloadEnabled) {
                output.encodeBooleanElement(serialDesc, 15, self.isSideloadEnabled);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 16) || self.osName != null) {
                output.encodeNullableSerializableElement(serialDesc, 16, StringSerializer.INSTANCE, self.osName);
            }
        }

        public final String getAndroidId() {
            return this.androidId;
        }

        public final void setAndroidId(String str) {
            this.androidId = str;
        }

        /* renamed from: isGooglePlayServicesAvailable, reason: from getter */
        public final boolean getIsGooglePlayServicesAvailable() {
            return this.isGooglePlayServicesAvailable;
        }

        public final void setGooglePlayServicesAvailable(boolean z) {
            this.isGooglePlayServicesAvailable = z;
        }

        public final String getAppSetId() {
            return this.appSetId;
        }

        public final void setAppSetId(String str) {
            this.appSetId = str;
        }

        public final float getBatteryLevel() {
            return this.batteryLevel;
        }

        public final void setBatteryLevel(float f) {
            this.batteryLevel = f;
        }

        public final String getBatteryState() {
            return this.batteryState;
        }

        public final void setBatteryState(String str) {
            this.batteryState = str;
        }

        public final int getBatterySaverEnabled() {
            return this.batterySaverEnabled;
        }

        public final void setBatterySaverEnabled(int i) {
            this.batterySaverEnabled = i;
        }

        public final String getConnectionType() {
            return this.connectionType;
        }

        public final void setConnectionType(String str) {
            this.connectionType = str;
        }

        public final String getConnectionTypeDetail() {
            return this.connectionTypeDetail;
        }

        public final void setConnectionTypeDetail(String str) {
            this.connectionTypeDetail = str;
        }

        public final String getLocale() {
            return this.locale;
        }

        public final void setLocale(String str) {
            this.locale = str;
        }

        public final String getLanguage() {
            return this.language;
        }

        public final void setLanguage(String str) {
            this.language = str;
        }

        public final String getTimeZone() {
            return this.timeZone;
        }

        public final void setTimeZone(String str) {
            this.timeZone = str;
        }

        public final float getVolumeLevel() {
            return this.volumeLevel;
        }

        public final void setVolumeLevel(float f) {
            this.volumeLevel = f;
        }

        public final int getSoundEnabled() {
            return this.soundEnabled;
        }

        public final void setSoundEnabled(int i) {
            this.soundEnabled = i;
        }

        /* renamed from: isTv, reason: from getter */
        public final boolean getIsTv() {
            return this.isTv;
        }

        public final void setTv(boolean z) {
            this.isTv = z;
        }

        public final int getSdCardAvailable() {
            return this.sdCardAvailable;
        }

        public final void setSdCardAvailable(int i) {
            this.sdCardAvailable = i;
        }

        /* renamed from: isSideloadEnabled, reason: from getter */
        public final boolean getIsSideloadEnabled() {
            return this.isSideloadEnabled;
        }

        public final void setSideloadEnabled(boolean z) {
            this.isSideloadEnabled = z;
        }

        public final String getOsName() {
            return this.osName;
        }

        public final void setOsName(String str) {
            this.osName = str;
        }
    }

    /* compiled from: DeviceNode.kt */
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 42\u00020\u0001:\u000234Bå\u0001\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\t\u001a\u00020\n\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\f\u001a\u00020\u0003\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0012\u001a\u00020\n\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0014\u001a\u00020\u0007\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0016\u001a\u00020\u0007\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\u0002\u0010\u001cB\u001d\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u001dJ\u000b\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010'\u001a\u00020\u00072\b\u0010(\u001a\u0004\u0018\u00010)HÖ\u0003J\t\u0010*\u001a\u00020\u0003HÖ\u0001J\t\u0010+\u001a\u00020\u0005HÖ\u0001J!\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u00002\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u000202HÇ\u0001R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001f\"\u0004\b#\u0010!¨\u00065"}, d2 = {"Lcom/vungle/ads/internal/model/DeviceNode$AndroidAmazonExt;", "Lcom/vungle/ads/internal/model/DeviceNode$CommonVungleExt;", "seen1", "", "androidId", "", "isGooglePlayServicesAvailable", "", "appSetId", "batteryLevel", "", "batteryState", "batterySaverEnabled", "connectionType", "connectionTypeDetail", "locale", "language", RemoteConfigConstants.RequestFieldKey.TIME_ZONE, "volumeLevel", "soundEnabled", "isTv", "sdCardAvailable", "isSideloadEnabled", "osName", i5.w0, "amazonAdvertisingId", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;ZLjava/lang/String;FLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FIZIZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;)V", "getAmazonAdvertisingId", "()Ljava/lang/String;", "setAmazonAdvertisingId", "(Ljava/lang/String;)V", "getGaid", "setGaid", "component1", "component2", "copy", "equals", "other", "", "hashCode", "toString", "write$Self", "", "self", AgentOptions.OUTPUT, "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @Serializable
    public static final /* data */ class AndroidAmazonExt extends CommonVungleExt {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private String amazonAdvertisingId;
        private String gaid;

        /* JADX WARN: Multi-variable type inference failed */
        public AndroidAmazonExt() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ AndroidAmazonExt copy$default(AndroidAmazonExt androidAmazonExt, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = androidAmazonExt.gaid;
            }
            if ((i & 2) != 0) {
                str2 = androidAmazonExt.amazonAdvertisingId;
            }
            return androidAmazonExt.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getGaid() {
            return this.gaid;
        }

        /* renamed from: component2, reason: from getter */
        public final String getAmazonAdvertisingId() {
            return this.amazonAdvertisingId;
        }

        public final AndroidAmazonExt copy(String gaid, String amazonAdvertisingId) {
            return new AndroidAmazonExt(gaid, amazonAdvertisingId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AndroidAmazonExt)) {
                return false;
            }
            AndroidAmazonExt androidAmazonExt = (AndroidAmazonExt) other;
            return Intrinsics.areEqual(this.gaid, androidAmazonExt.gaid) && Intrinsics.areEqual(this.amazonAdvertisingId, androidAmazonExt.amazonAdvertisingId);
        }

        public int hashCode() {
            String str = this.gaid;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.amazonAdvertisingId;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "AndroidAmazonExt(gaid=" + this.gaid + ", amazonAdvertisingId=" + this.amazonAdvertisingId + ')';
        }

        /* compiled from: DeviceNode.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/model/DeviceNode$AndroidAmazonExt$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/model/DeviceNode$AndroidAmazonExt;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<AndroidAmazonExt> serializer() {
                return DeviceNode$AndroidAmazonExt$$serializer.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public /* synthetic */ AndroidAmazonExt(int i, @SerialName("android_id") String str, @SerialName("is_google_play_services_available") boolean z, @SerialName("app_set_id") String str2, @SerialName("battery_level") float f, @SerialName("battery_state") String str3, @SerialName("battery_saver_enabled") int i2, @SerialName("connection_type") String str4, @SerialName("connection_type_detail") String str5, String str6, String str7, @SerialName("time_zone") String str8, @SerialName("volume_level") float f2, @SerialName("sound_enabled") int i3, @SerialName("is_tv") boolean z2, @SerialName("sd_card_available") int i4, @SerialName("is_sideload_enabled") boolean z3, @SerialName("os_name") String str9, String str10, String str11, SerializationConstructorMarker serializationConstructorMarker) {
            AndroidAmazonExt androidAmazonExt;
            super(i, str, z, str2, f, str3, i2, str4, str5, str6, str7, str8, f2, i3, z2, i4, z3, str9, serializationConstructorMarker);
            if ((i & 0) != 0) {
                PluginExceptionsKt.throwMissingFieldException(i, 0, DeviceNode$AndroidAmazonExt$$serializer.INSTANCE.getDescriptor());
            }
            if ((i & 131072) == 0) {
                androidAmazonExt = this;
                androidAmazonExt.gaid = null;
            } else {
                androidAmazonExt = this;
                androidAmazonExt.gaid = str10;
            }
            androidAmazonExt.amazonAdvertisingId = (i & 262144) != 0 ? str11 : null;
        }

        @JvmStatic
        public static final void write$Self(AndroidAmazonExt self, CompositeEncoder output, SerialDescriptor serialDesc) {
            Intrinsics.checkNotNullParameter(self, "self");
            Intrinsics.checkNotNullParameter(output, "output");
            Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
            CommonVungleExt.write$Self(self, output, serialDesc);
            if (output.shouldEncodeElementDefault(serialDesc, 17) || self.gaid != null) {
                output.encodeNullableSerializableElement(serialDesc, 17, StringSerializer.INSTANCE, self.gaid);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 18) || self.amazonAdvertisingId != null) {
                output.encodeNullableSerializableElement(serialDesc, 18, StringSerializer.INSTANCE, self.amazonAdvertisingId);
            }
        }

        public /* synthetic */ AndroidAmazonExt(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
        }

        public final String getAmazonAdvertisingId() {
            return this.amazonAdvertisingId;
        }

        public final String getGaid() {
            return this.gaid;
        }

        public final void setAmazonAdvertisingId(String str) {
            this.amazonAdvertisingId = str;
        }

        public final void setGaid(String str) {
            this.gaid = str;
        }

        public AndroidAmazonExt(String str, String str2) {
            this.gaid = str;
            this.amazonAdvertisingId = str2;
        }
    }
}
