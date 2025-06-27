package com.vungle.ads.internal.model;

import androidx.privacysandbox.ads.adservices.adselection.AdSelectionOutcome$$ExternalSyntheticBackport0;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.json.t2;
import com.mbridge.msdk.MBridgeConstans;
import com.vungle.ads.internal.ui.AdActivity;
import java.util.List;
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
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jacoco.core.runtime.AgentOptions;

/* compiled from: CommonRequestBody.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u0000 62\u00020\u0001:\b3456789:BK\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0010B=\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u0011J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\rHÆ\u0003JC\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020\u0003HÖ\u0001J\t\u0010*\u001a\u00020+HÖ\u0001J!\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u00002\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u000202HÇ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u0006;"}, d2 = {"Lcom/vungle/ads/internal/model/CommonRequestBody;", "", "seen1", "", t2.h.G, "Lcom/vungle/ads/internal/model/DeviceNode;", MBridgeConstans.DYNAMIC_VIEW_WX_APP, "Lcom/vungle/ads/internal/model/AppNode;", "user", "Lcom/vungle/ads/internal/model/CommonRequestBody$User;", "ext", "Lcom/vungle/ads/internal/model/CommonRequestBody$RequestExt;", AdActivity.REQUEST_KEY_EXTRA, "Lcom/vungle/ads/internal/model/CommonRequestBody$RequestParam;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/vungle/ads/internal/model/DeviceNode;Lcom/vungle/ads/internal/model/AppNode;Lcom/vungle/ads/internal/model/CommonRequestBody$User;Lcom/vungle/ads/internal/model/CommonRequestBody$RequestExt;Lcom/vungle/ads/internal/model/CommonRequestBody$RequestParam;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lcom/vungle/ads/internal/model/DeviceNode;Lcom/vungle/ads/internal/model/AppNode;Lcom/vungle/ads/internal/model/CommonRequestBody$User;Lcom/vungle/ads/internal/model/CommonRequestBody$RequestExt;Lcom/vungle/ads/internal/model/CommonRequestBody$RequestParam;)V", "getApp", "()Lcom/vungle/ads/internal/model/AppNode;", "getDevice", "()Lcom/vungle/ads/internal/model/DeviceNode;", "getExt", "()Lcom/vungle/ads/internal/model/CommonRequestBody$RequestExt;", "setExt", "(Lcom/vungle/ads/internal/model/CommonRequestBody$RequestExt;)V", "getRequest", "()Lcom/vungle/ads/internal/model/CommonRequestBody$RequestParam;", "setRequest", "(Lcom/vungle/ads/internal/model/CommonRequestBody$RequestParam;)V", "getUser", "()Lcom/vungle/ads/internal/model/CommonRequestBody$User;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", AgentOptions.OUTPUT, "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "CCPA", "COPPA", "Companion", "GDPR", "RequestExt", "RequestParam", "User", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@Serializable
/* loaded from: classes5.dex */
public final /* data */ class CommonRequestBody {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final AppNode app;
    private final DeviceNode device;
    private RequestExt ext;
    private RequestParam request;
    private final User user;

    public static /* synthetic */ CommonRequestBody copy$default(CommonRequestBody commonRequestBody, DeviceNode deviceNode, AppNode appNode, User user, RequestExt requestExt, RequestParam requestParam, int i, Object obj) {
        if ((i & 1) != 0) {
            deviceNode = commonRequestBody.device;
        }
        if ((i & 2) != 0) {
            appNode = commonRequestBody.app;
        }
        AppNode appNode2 = appNode;
        if ((i & 4) != 0) {
            user = commonRequestBody.user;
        }
        User user2 = user;
        if ((i & 8) != 0) {
            requestExt = commonRequestBody.ext;
        }
        RequestExt requestExt2 = requestExt;
        if ((i & 16) != 0) {
            requestParam = commonRequestBody.request;
        }
        return commonRequestBody.copy(deviceNode, appNode2, user2, requestExt2, requestParam);
    }

    /* renamed from: component1, reason: from getter */
    public final DeviceNode getDevice() {
        return this.device;
    }

    /* renamed from: component2, reason: from getter */
    public final AppNode getApp() {
        return this.app;
    }

    /* renamed from: component3, reason: from getter */
    public final User getUser() {
        return this.user;
    }

    /* renamed from: component4, reason: from getter */
    public final RequestExt getExt() {
        return this.ext;
    }

    /* renamed from: component5, reason: from getter */
    public final RequestParam getRequest() {
        return this.request;
    }

    public final CommonRequestBody copy(DeviceNode device, AppNode app, User user, RequestExt ext, RequestParam request) {
        Intrinsics.checkNotNullParameter(device, "device");
        return new CommonRequestBody(device, app, user, ext, request);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommonRequestBody)) {
            return false;
        }
        CommonRequestBody commonRequestBody = (CommonRequestBody) other;
        return Intrinsics.areEqual(this.device, commonRequestBody.device) && Intrinsics.areEqual(this.app, commonRequestBody.app) && Intrinsics.areEqual(this.user, commonRequestBody.user) && Intrinsics.areEqual(this.ext, commonRequestBody.ext) && Intrinsics.areEqual(this.request, commonRequestBody.request);
    }

    public int hashCode() {
        int iHashCode = this.device.hashCode() * 31;
        AppNode appNode = this.app;
        int iHashCode2 = (iHashCode + (appNode == null ? 0 : appNode.hashCode())) * 31;
        User user = this.user;
        int iHashCode3 = (iHashCode2 + (user == null ? 0 : user.hashCode())) * 31;
        RequestExt requestExt = this.ext;
        int iHashCode4 = (iHashCode3 + (requestExt == null ? 0 : requestExt.hashCode())) * 31;
        RequestParam requestParam = this.request;
        return iHashCode4 + (requestParam != null ? requestParam.hashCode() : 0);
    }

    public String toString() {
        return "CommonRequestBody(device=" + this.device + ", app=" + this.app + ", user=" + this.user + ", ext=" + this.ext + ", request=" + this.request + ')';
    }

    /* compiled from: CommonRequestBody.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/model/CommonRequestBody$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/model/CommonRequestBody;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CommonRequestBody> serializer() {
            return CommonRequestBody$$serializer.INSTANCE;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ CommonRequestBody(int i, DeviceNode deviceNode, AppNode appNode, User user, RequestExt requestExt, RequestParam requestParam, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, CommonRequestBody$$serializer.INSTANCE.getDescriptor());
        }
        this.device = deviceNode;
        if ((i & 2) == 0) {
            this.app = null;
        } else {
            this.app = appNode;
        }
        if ((i & 4) == 0) {
            this.user = null;
        } else {
            this.user = user;
        }
        if ((i & 8) == 0) {
            this.ext = null;
        } else {
            this.ext = requestExt;
        }
        if ((i & 16) == 0) {
            this.request = null;
        } else {
            this.request = requestParam;
        }
    }

    public CommonRequestBody(DeviceNode device, AppNode appNode, User user, RequestExt requestExt, RequestParam requestParam) {
        Intrinsics.checkNotNullParameter(device, "device");
        this.device = device;
        this.app = appNode;
        this.user = user;
        this.ext = requestExt;
        this.request = requestParam;
    }

    @JvmStatic
    public static final void write$Self(CommonRequestBody self, CompositeEncoder output, SerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        output.encodeSerializableElement(serialDesc, 0, DeviceNode$$serializer.INSTANCE, self.device);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.app != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, AppNode$$serializer.INSTANCE, self.app);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.user != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, CommonRequestBody$User$$serializer.INSTANCE, self.user);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.ext != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, CommonRequestBody$RequestExt$$serializer.INSTANCE, self.ext);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.request != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, CommonRequestBody$RequestParam$$serializer.INSTANCE, self.request);
        }
    }

    public /* synthetic */ CommonRequestBody(DeviceNode deviceNode, AppNode appNode, User user, RequestExt requestExt, RequestParam requestParam, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(deviceNode, (i & 2) != 0 ? null : appNode, (i & 4) != 0 ? null : user, (i & 8) != 0 ? null : requestExt, (i & 16) != 0 ? null : requestParam);
    }

    public final DeviceNode getDevice() {
        return this.device;
    }

    public final AppNode getApp() {
        return this.app;
    }

    public final User getUser() {
        return this.user;
    }

    public final RequestExt getExt() {
        return this.ext;
    }

    public final void setExt(RequestExt requestExt) {
        this.ext = requestExt;
    }

    public final RequestParam getRequest() {
        return this.request;
    }

    public final void setRequest(RequestParam requestParam) {
        this.request = requestParam;
    }

    /* compiled from: CommonRequestBody.kt */
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002+,B7\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fB)\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\rJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\tHÆ\u0003J-\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001J!\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00002\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*HÇ\u0001R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006-"}, d2 = {"Lcom/vungle/ads/internal/model/CommonRequestBody$User;", "", "seen1", "", "gdpr", "Lcom/vungle/ads/internal/model/CommonRequestBody$GDPR;", "ccpa", "Lcom/vungle/ads/internal/model/CommonRequestBody$CCPA;", "coppa", "Lcom/vungle/ads/internal/model/CommonRequestBody$COPPA;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/vungle/ads/internal/model/CommonRequestBody$GDPR;Lcom/vungle/ads/internal/model/CommonRequestBody$CCPA;Lcom/vungle/ads/internal/model/CommonRequestBody$COPPA;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lcom/vungle/ads/internal/model/CommonRequestBody$GDPR;Lcom/vungle/ads/internal/model/CommonRequestBody$CCPA;Lcom/vungle/ads/internal/model/CommonRequestBody$COPPA;)V", "getCcpa", "()Lcom/vungle/ads/internal/model/CommonRequestBody$CCPA;", "setCcpa", "(Lcom/vungle/ads/internal/model/CommonRequestBody$CCPA;)V", "getCoppa", "()Lcom/vungle/ads/internal/model/CommonRequestBody$COPPA;", "setCoppa", "(Lcom/vungle/ads/internal/model/CommonRequestBody$COPPA;)V", "getGdpr", "()Lcom/vungle/ads/internal/model/CommonRequestBody$GDPR;", "setGdpr", "(Lcom/vungle/ads/internal/model/CommonRequestBody$GDPR;)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", AgentOptions.OUTPUT, "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @Serializable
    public static final /* data */ class User {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private CCPA ccpa;
        private COPPA coppa;
        private GDPR gdpr;

        public User() {
            this((GDPR) null, (CCPA) null, (COPPA) null, 7, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ User copy$default(User user, GDPR gdpr, CCPA ccpa, COPPA coppa, int i, Object obj) {
            if ((i & 1) != 0) {
                gdpr = user.gdpr;
            }
            if ((i & 2) != 0) {
                ccpa = user.ccpa;
            }
            if ((i & 4) != 0) {
                coppa = user.coppa;
            }
            return user.copy(gdpr, ccpa, coppa);
        }

        /* renamed from: component1, reason: from getter */
        public final GDPR getGdpr() {
            return this.gdpr;
        }

        /* renamed from: component2, reason: from getter */
        public final CCPA getCcpa() {
            return this.ccpa;
        }

        /* renamed from: component3, reason: from getter */
        public final COPPA getCoppa() {
            return this.coppa;
        }

        public final User copy(GDPR gdpr, CCPA ccpa, COPPA coppa) {
            return new User(gdpr, ccpa, coppa);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof User)) {
                return false;
            }
            User user = (User) other;
            return Intrinsics.areEqual(this.gdpr, user.gdpr) && Intrinsics.areEqual(this.ccpa, user.ccpa) && Intrinsics.areEqual(this.coppa, user.coppa);
        }

        public int hashCode() {
            GDPR gdpr = this.gdpr;
            int iHashCode = (gdpr == null ? 0 : gdpr.hashCode()) * 31;
            CCPA ccpa = this.ccpa;
            int iHashCode2 = (iHashCode + (ccpa == null ? 0 : ccpa.hashCode())) * 31;
            COPPA coppa = this.coppa;
            return iHashCode2 + (coppa != null ? coppa.hashCode() : 0);
        }

        public String toString() {
            return "User(gdpr=" + this.gdpr + ", ccpa=" + this.ccpa + ", coppa=" + this.coppa + ')';
        }

        /* compiled from: CommonRequestBody.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/model/CommonRequestBody$User$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/model/CommonRequestBody$User;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<User> serializer() {
                return CommonRequestBody$User$$serializer.INSTANCE;
            }
        }

        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public /* synthetic */ User(int i, GDPR gdpr, CCPA ccpa, COPPA coppa, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 0) != 0) {
                PluginExceptionsKt.throwMissingFieldException(i, 0, CommonRequestBody$User$$serializer.INSTANCE.getDescriptor());
            }
            if ((i & 1) == 0) {
                this.gdpr = null;
            } else {
                this.gdpr = gdpr;
            }
            if ((i & 2) == 0) {
                this.ccpa = null;
            } else {
                this.ccpa = ccpa;
            }
            if ((i & 4) == 0) {
                this.coppa = null;
            } else {
                this.coppa = coppa;
            }
        }

        public User(GDPR gdpr, CCPA ccpa, COPPA coppa) {
            this.gdpr = gdpr;
            this.ccpa = ccpa;
            this.coppa = coppa;
        }

        @JvmStatic
        public static final void write$Self(User self, CompositeEncoder output, SerialDescriptor serialDesc) {
            Intrinsics.checkNotNullParameter(self, "self");
            Intrinsics.checkNotNullParameter(output, "output");
            Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
            if (output.shouldEncodeElementDefault(serialDesc, 0) || self.gdpr != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, CommonRequestBody$GDPR$$serializer.INSTANCE, self.gdpr);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 1) || self.ccpa != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, CommonRequestBody$CCPA$$serializer.INSTANCE, self.ccpa);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 2) || self.coppa != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, CommonRequestBody$COPPA$$serializer.INSTANCE, self.coppa);
            }
        }

        public /* synthetic */ User(GDPR gdpr, CCPA ccpa, COPPA coppa, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : gdpr, (i & 2) != 0 ? null : ccpa, (i & 4) != 0 ? null : coppa);
        }

        public final CCPA getCcpa() {
            return this.ccpa;
        }

        public final COPPA getCoppa() {
            return this.coppa;
        }

        public final GDPR getGdpr() {
            return this.gdpr;
        }

        public final void setCcpa(CCPA ccpa) {
            this.ccpa = ccpa;
        }

        public final void setCoppa(COPPA coppa) {
            this.coppa = coppa;
        }

        public final void setGdpr(GDPR gdpr) {
            this.gdpr = gdpr;
        }
    }

    /* compiled from: CommonRequestBody.kt */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002*+BG\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fB%\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J1\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\t\u0010\"\u001a\u00020\u0005HÖ\u0001J!\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00002\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)HÇ\u0001R\u001c\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011R\u001c\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0017\u0010\u0018¨\u0006,"}, d2 = {"Lcom/vungle/ads/internal/model/CommonRequestBody$GDPR;", "", "seen1", "", "consentStatus", "", "consentSource", "consentTimestamp", "", "consentMessageVersion", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;JLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V", "getConsentMessageVersion$annotations", "()V", "getConsentMessageVersion", "()Ljava/lang/String;", "getConsentSource$annotations", "getConsentSource", "getConsentStatus$annotations", "getConsentStatus", "getConsentTimestamp$annotations", "getConsentTimestamp", "()J", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", AgentOptions.OUTPUT, "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @Serializable
    public static final /* data */ class GDPR {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String consentMessageVersion;
        private final String consentSource;
        private final String consentStatus;
        private final long consentTimestamp;

        public static /* synthetic */ GDPR copy$default(GDPR gdpr, String str, String str2, long j, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = gdpr.consentStatus;
            }
            if ((i & 2) != 0) {
                str2 = gdpr.consentSource;
            }
            String str4 = str2;
            if ((i & 4) != 0) {
                j = gdpr.consentTimestamp;
            }
            long j2 = j;
            if ((i & 8) != 0) {
                str3 = gdpr.consentMessageVersion;
            }
            return gdpr.copy(str, str4, j2, str3);
        }

        @SerialName("consent_message_version")
        public static /* synthetic */ void getConsentMessageVersion$annotations() {
        }

        @SerialName("consent_source")
        public static /* synthetic */ void getConsentSource$annotations() {
        }

        @SerialName("consent_status")
        public static /* synthetic */ void getConsentStatus$annotations() {
        }

        @SerialName("consent_timestamp")
        public static /* synthetic */ void getConsentTimestamp$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getConsentStatus() {
            return this.consentStatus;
        }

        /* renamed from: component2, reason: from getter */
        public final String getConsentSource() {
            return this.consentSource;
        }

        /* renamed from: component3, reason: from getter */
        public final long getConsentTimestamp() {
            return this.consentTimestamp;
        }

        /* renamed from: component4, reason: from getter */
        public final String getConsentMessageVersion() {
            return this.consentMessageVersion;
        }

        public final GDPR copy(String consentStatus, String consentSource, long consentTimestamp, String consentMessageVersion) {
            Intrinsics.checkNotNullParameter(consentStatus, "consentStatus");
            Intrinsics.checkNotNullParameter(consentSource, "consentSource");
            Intrinsics.checkNotNullParameter(consentMessageVersion, "consentMessageVersion");
            return new GDPR(consentStatus, consentSource, consentTimestamp, consentMessageVersion);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GDPR)) {
                return false;
            }
            GDPR gdpr = (GDPR) other;
            return Intrinsics.areEqual(this.consentStatus, gdpr.consentStatus) && Intrinsics.areEqual(this.consentSource, gdpr.consentSource) && this.consentTimestamp == gdpr.consentTimestamp && Intrinsics.areEqual(this.consentMessageVersion, gdpr.consentMessageVersion);
        }

        public int hashCode() {
            return (((((this.consentStatus.hashCode() * 31) + this.consentSource.hashCode()) * 31) + AdSelectionOutcome$$ExternalSyntheticBackport0.m(this.consentTimestamp)) * 31) + this.consentMessageVersion.hashCode();
        }

        public String toString() {
            return "GDPR(consentStatus=" + this.consentStatus + ", consentSource=" + this.consentSource + ", consentTimestamp=" + this.consentTimestamp + ", consentMessageVersion=" + this.consentMessageVersion + ')';
        }

        /* compiled from: CommonRequestBody.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/model/CommonRequestBody$GDPR$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/model/CommonRequestBody$GDPR;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<GDPR> serializer() {
                return CommonRequestBody$GDPR$$serializer.INSTANCE;
            }
        }

        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public /* synthetic */ GDPR(int i, @SerialName("consent_status") String str, @SerialName("consent_source") String str2, @SerialName("consent_timestamp") long j, @SerialName("consent_message_version") String str3, SerializationConstructorMarker serializationConstructorMarker) {
            if (15 != (i & 15)) {
                PluginExceptionsKt.throwMissingFieldException(i, 15, CommonRequestBody$GDPR$$serializer.INSTANCE.getDescriptor());
            }
            this.consentStatus = str;
            this.consentSource = str2;
            this.consentTimestamp = j;
            this.consentMessageVersion = str3;
        }

        public GDPR(String consentStatus, String consentSource, long j, String consentMessageVersion) {
            Intrinsics.checkNotNullParameter(consentStatus, "consentStatus");
            Intrinsics.checkNotNullParameter(consentSource, "consentSource");
            Intrinsics.checkNotNullParameter(consentMessageVersion, "consentMessageVersion");
            this.consentStatus = consentStatus;
            this.consentSource = consentSource;
            this.consentTimestamp = j;
            this.consentMessageVersion = consentMessageVersion;
        }

        @JvmStatic
        public static final void write$Self(GDPR self, CompositeEncoder output, SerialDescriptor serialDesc) {
            Intrinsics.checkNotNullParameter(self, "self");
            Intrinsics.checkNotNullParameter(output, "output");
            Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
            output.encodeStringElement(serialDesc, 0, self.consentStatus);
            output.encodeStringElement(serialDesc, 1, self.consentSource);
            output.encodeLongElement(serialDesc, 2, self.consentTimestamp);
            output.encodeStringElement(serialDesc, 3, self.consentMessageVersion);
        }

        public final String getConsentStatus() {
            return this.consentStatus;
        }

        public final String getConsentSource() {
            return this.consentSource;
        }

        public final long getConsentTimestamp() {
            return this.consentTimestamp;
        }

        public final String getConsentMessageVersion() {
            return this.consentMessageVersion;
        }
    }

    /* compiled from: CommonRequestBody.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001a\u001bB#\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J!\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019HÇ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/vungle/ads/internal/model/CommonRequestBody$CCPA;", "", "seen1", "", "status", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;)V", "getStatus", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", AgentOptions.OUTPUT, "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @Serializable
    public static final /* data */ class CCPA {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String status;

        public static /* synthetic */ CCPA copy$default(CCPA ccpa, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = ccpa.status;
            }
            return ccpa.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getStatus() {
            return this.status;
        }

        public final CCPA copy(String status) {
            Intrinsics.checkNotNullParameter(status, "status");
            return new CCPA(status);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CCPA) && Intrinsics.areEqual(this.status, ((CCPA) other).status);
        }

        public int hashCode() {
            return this.status.hashCode();
        }

        public String toString() {
            return "CCPA(status=" + this.status + ')';
        }

        /* compiled from: CommonRequestBody.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/model/CommonRequestBody$CCPA$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/model/CommonRequestBody$CCPA;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<CCPA> serializer() {
                return CommonRequestBody$CCPA$$serializer.INSTANCE;
            }
        }

        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public /* synthetic */ CCPA(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
            if (1 != (i & 1)) {
                PluginExceptionsKt.throwMissingFieldException(i, 1, CommonRequestBody$CCPA$$serializer.INSTANCE.getDescriptor());
            }
            this.status = str;
        }

        public CCPA(String status) {
            Intrinsics.checkNotNullParameter(status, "status");
            this.status = status;
        }

        @JvmStatic
        public static final void write$Self(CCPA self, CompositeEncoder output, SerialDescriptor serialDesc) {
            Intrinsics.checkNotNullParameter(self, "self");
            Intrinsics.checkNotNullParameter(output, "output");
            Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
            output.encodeStringElement(serialDesc, 0, self.status);
        }

        public final String getStatus() {
            return this.status;
        }
    }

    /* compiled from: CommonRequestBody.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001d\u001eB%\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB\u000f\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\tJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J!\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cHÇ\u0001R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\r\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\u0004\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/vungle/ads/internal/model/CommonRequestBody$COPPA;", "", "seen1", "", "isCoppa", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/Boolean;)V", "isCoppa$annotations", "()V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "copy", "(Ljava/lang/Boolean;)Lcom/vungle/ads/internal/model/CommonRequestBody$COPPA;", "equals", "other", "hashCode", "toString", "", "write$Self", "", "self", AgentOptions.OUTPUT, "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @Serializable
    public static final /* data */ class COPPA {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final Boolean isCoppa;

        public static /* synthetic */ COPPA copy$default(COPPA coppa, Boolean bool, int i, Object obj) {
            if ((i & 1) != 0) {
                bool = coppa.isCoppa;
            }
            return coppa.copy(bool);
        }

        @SerialName(Cookie.COPPA_STATUS_KEY)
        public static /* synthetic */ void isCoppa$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final Boolean getIsCoppa() {
            return this.isCoppa;
        }

        public final COPPA copy(Boolean isCoppa) {
            return new COPPA(isCoppa);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof COPPA) && Intrinsics.areEqual(this.isCoppa, ((COPPA) other).isCoppa);
        }

        public int hashCode() {
            Boolean bool = this.isCoppa;
            if (bool == null) {
                return 0;
            }
            return bool.hashCode();
        }

        public String toString() {
            return "COPPA(isCoppa=" + this.isCoppa + ')';
        }

        /* compiled from: CommonRequestBody.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/model/CommonRequestBody$COPPA$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/model/CommonRequestBody$COPPA;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<COPPA> serializer() {
                return CommonRequestBody$COPPA$$serializer.INSTANCE;
            }
        }

        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public /* synthetic */ COPPA(int i, @SerialName(Cookie.COPPA_STATUS_KEY) Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
            if (1 != (i & 1)) {
                PluginExceptionsKt.throwMissingFieldException(i, 1, CommonRequestBody$COPPA$$serializer.INSTANCE.getDescriptor());
            }
            this.isCoppa = bool;
        }

        public COPPA(Boolean bool) {
            this.isCoppa = bool;
        }

        @JvmStatic
        public static final void write$Self(COPPA self, CompositeEncoder output, SerialDescriptor serialDesc) {
            Intrinsics.checkNotNullParameter(self, "self");
            Intrinsics.checkNotNullParameter(output, "output");
            Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
            output.encodeNullableSerializableElement(serialDesc, 0, BooleanSerializer.INSTANCE, self.isCoppa);
        }

        public final Boolean isCoppa() {
            return this.isCoppa;
        }
    }

    /* compiled from: CommonRequestBody.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002\"#B1\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tB\u001d\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001J!\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!HÇ\u0001R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR&\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u000e\"\u0004\b\u0011\u0010\u0012¨\u0006$"}, d2 = {"Lcom/vungle/ads/internal/model/CommonRequestBody$RequestExt;", "", "seen1", "", "configExtension", "", "signals", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;)V", "getConfigExtension$annotations", "()V", "getConfigExtension", "()Ljava/lang/String;", "getSignals$annotations", "getSignals", "setSignals", "(Ljava/lang/String;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", AgentOptions.OUTPUT, "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @Serializable
    public static final /* data */ class RequestExt {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String configExtension;
        private String signals;

        /* JADX WARN: Multi-variable type inference failed */
        public RequestExt() {
            this((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ RequestExt copy$default(RequestExt requestExt, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = requestExt.configExtension;
            }
            if ((i & 2) != 0) {
                str2 = requestExt.signals;
            }
            return requestExt.copy(str, str2);
        }

        @SerialName(Cookie.CONFIG_EXTENSION)
        public static /* synthetic */ void getConfigExtension$annotations() {
        }

        @SerialName("signals")
        public static /* synthetic */ void getSignals$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getConfigExtension() {
            return this.configExtension;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSignals() {
            return this.signals;
        }

        public final RequestExt copy(String configExtension, String signals) {
            return new RequestExt(configExtension, signals);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RequestExt)) {
                return false;
            }
            RequestExt requestExt = (RequestExt) other;
            return Intrinsics.areEqual(this.configExtension, requestExt.configExtension) && Intrinsics.areEqual(this.signals, requestExt.signals);
        }

        public int hashCode() {
            String str = this.configExtension;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.signals;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "RequestExt(configExtension=" + this.configExtension + ", signals=" + this.signals + ')';
        }

        /* compiled from: CommonRequestBody.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/model/CommonRequestBody$RequestExt$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/model/CommonRequestBody$RequestExt;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<RequestExt> serializer() {
                return CommonRequestBody$RequestExt$$serializer.INSTANCE;
            }
        }

        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public /* synthetic */ RequestExt(int i, @SerialName(Cookie.CONFIG_EXTENSION) String str, @SerialName("signals") String str2, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 0) != 0) {
                PluginExceptionsKt.throwMissingFieldException(i, 0, CommonRequestBody$RequestExt$$serializer.INSTANCE.getDescriptor());
            }
            if ((i & 1) == 0) {
                this.configExtension = null;
            } else {
                this.configExtension = str;
            }
            if ((i & 2) == 0) {
                this.signals = null;
            } else {
                this.signals = str2;
            }
        }

        public RequestExt(String str, String str2) {
            this.configExtension = str;
            this.signals = str2;
        }

        @JvmStatic
        public static final void write$Self(RequestExt self, CompositeEncoder output, SerialDescriptor serialDesc) {
            Intrinsics.checkNotNullParameter(self, "self");
            Intrinsics.checkNotNullParameter(output, "output");
            Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
            if (output.shouldEncodeElementDefault(serialDesc, 0) || self.configExtension != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.configExtension);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 1) || self.signals != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.signals);
            }
        }

        public /* synthetic */ RequestExt(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
        }

        public final String getConfigExtension() {
            return this.configExtension;
        }

        public final String getSignals() {
            return this.signals;
        }

        public final void setSignals(String str) {
            this.signals = str;
        }
    }

    /* compiled from: CommonRequestBody.kt */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 ;2\u00020\u0001:\u0002:;Bm\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010\u0011B_\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0012J\u0011\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u0010\u0010'\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u001fJ\u000b\u0010(\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010)\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001aJ\u000b\u0010*\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0006HÆ\u0003Jh\u0010-\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010.J\u0013\u0010/\u001a\u00020\b2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u00020\u0003HÖ\u0001J\t\u00102\u001a\u00020\u0006HÖ\u0001J!\u00103\u001a\u0002042\u0006\u00105\u001a\u00020\u00002\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u000209HÇ\u0001R&\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u001e\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0014\u001a\u0004\b\u001d\u0010\u0016R \u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010 \u0012\u0004\b\u001e\u0010\u0014\u001a\u0004\b\u0007\u0010\u001fR\u001e\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b!\u0010\u0014\u001a\u0004\b\"\u0010\u0016R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0016¨\u0006<"}, d2 = {"Lcom/vungle/ads/internal/model/CommonRequestBody$RequestParam;", "", "seen1", "", "placements", "", "", "isHeaderBidding", "", t2.h.O, "adStartTime", "", RemoteConfigConstants.RequestFieldKey.APP_ID, "placementReferenceId", "user", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAdSize$annotations", "()V", "getAdSize", "()Ljava/lang/String;", "setAdSize", "(Ljava/lang/String;)V", "getAdStartTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getAppId$annotations", "getAppId", "isHeaderBidding$annotations", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getPlacementReferenceId$annotations", "getPlacementReferenceId", "getPlacements", "()Ljava/util/List;", "getUser", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/vungle/ads/internal/model/CommonRequestBody$RequestParam;", "equals", "other", "hashCode", "toString", "write$Self", "", "self", AgentOptions.OUTPUT, "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @Serializable
    public static final /* data */ class RequestParam {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private String adSize;
        private final Long adStartTime;
        private final String appId;
        private final Boolean isHeaderBidding;
        private final String placementReferenceId;
        private final List<String> placements;
        private final String user;

        public RequestParam() {
            this((List) null, (Boolean) null, (String) null, (Long) null, (String) null, (String) null, (String) null, 127, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ RequestParam copy$default(RequestParam requestParam, List list, Boolean bool, String str, Long l, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                list = requestParam.placements;
            }
            if ((i & 2) != 0) {
                bool = requestParam.isHeaderBidding;
            }
            Boolean bool2 = bool;
            if ((i & 4) != 0) {
                str = requestParam.adSize;
            }
            String str5 = str;
            if ((i & 8) != 0) {
                l = requestParam.adStartTime;
            }
            Long l2 = l;
            if ((i & 16) != 0) {
                str2 = requestParam.appId;
            }
            String str6 = str2;
            if ((i & 32) != 0) {
                str3 = requestParam.placementReferenceId;
            }
            String str7 = str3;
            if ((i & 64) != 0) {
                str4 = requestParam.user;
            }
            return requestParam.copy(list, bool2, str5, l2, str6, str7, str4);
        }

        @SerialName("ad_size")
        public static /* synthetic */ void getAdSize$annotations() {
        }

        @SerialName("app_id")
        public static /* synthetic */ void getAppId$annotations() {
        }

        @SerialName("placement_reference_id")
        public static /* synthetic */ void getPlacementReferenceId$annotations() {
        }

        @SerialName("header_bidding")
        public static /* synthetic */ void isHeaderBidding$annotations() {
        }

        public final List<String> component1() {
            return this.placements;
        }

        /* renamed from: component2, reason: from getter */
        public final Boolean getIsHeaderBidding() {
            return this.isHeaderBidding;
        }

        /* renamed from: component3, reason: from getter */
        public final String getAdSize() {
            return this.adSize;
        }

        /* renamed from: component4, reason: from getter */
        public final Long getAdStartTime() {
            return this.adStartTime;
        }

        /* renamed from: component5, reason: from getter */
        public final String getAppId() {
            return this.appId;
        }

        /* renamed from: component6, reason: from getter */
        public final String getPlacementReferenceId() {
            return this.placementReferenceId;
        }

        /* renamed from: component7, reason: from getter */
        public final String getUser() {
            return this.user;
        }

        public final RequestParam copy(List<String> placements, Boolean isHeaderBidding, String adSize, Long adStartTime, String appId, String placementReferenceId, String user) {
            return new RequestParam(placements, isHeaderBidding, adSize, adStartTime, appId, placementReferenceId, user);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RequestParam)) {
                return false;
            }
            RequestParam requestParam = (RequestParam) other;
            return Intrinsics.areEqual(this.placements, requestParam.placements) && Intrinsics.areEqual(this.isHeaderBidding, requestParam.isHeaderBidding) && Intrinsics.areEqual(this.adSize, requestParam.adSize) && Intrinsics.areEqual(this.adStartTime, requestParam.adStartTime) && Intrinsics.areEqual(this.appId, requestParam.appId) && Intrinsics.areEqual(this.placementReferenceId, requestParam.placementReferenceId) && Intrinsics.areEqual(this.user, requestParam.user);
        }

        public int hashCode() {
            List<String> list = this.placements;
            int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
            Boolean bool = this.isHeaderBidding;
            int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            String str = this.adSize;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            Long l = this.adStartTime;
            int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
            String str2 = this.appId;
            int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.placementReferenceId;
            int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.user;
            return iHashCode6 + (str4 != null ? str4.hashCode() : 0);
        }

        public String toString() {
            return "RequestParam(placements=" + this.placements + ", isHeaderBidding=" + this.isHeaderBidding + ", adSize=" + this.adSize + ", adStartTime=" + this.adStartTime + ", appId=" + this.appId + ", placementReferenceId=" + this.placementReferenceId + ", user=" + this.user + ')';
        }

        /* compiled from: CommonRequestBody.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/model/CommonRequestBody$RequestParam$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/model/CommonRequestBody$RequestParam;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<RequestParam> serializer() {
                return CommonRequestBody$RequestParam$$serializer.INSTANCE;
            }
        }

        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public /* synthetic */ RequestParam(int i, List list, @SerialName("header_bidding") Boolean bool, @SerialName("ad_size") String str, Long l, @SerialName("app_id") String str2, @SerialName("placement_reference_id") String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 0) != 0) {
                PluginExceptionsKt.throwMissingFieldException(i, 0, CommonRequestBody$RequestParam$$serializer.INSTANCE.getDescriptor());
            }
            if ((i & 1) == 0) {
                this.placements = null;
            } else {
                this.placements = list;
            }
            if ((i & 2) == 0) {
                this.isHeaderBidding = null;
            } else {
                this.isHeaderBidding = bool;
            }
            if ((i & 4) == 0) {
                this.adSize = null;
            } else {
                this.adSize = str;
            }
            if ((i & 8) == 0) {
                this.adStartTime = null;
            } else {
                this.adStartTime = l;
            }
            if ((i & 16) == 0) {
                this.appId = null;
            } else {
                this.appId = str2;
            }
            if ((i & 32) == 0) {
                this.placementReferenceId = null;
            } else {
                this.placementReferenceId = str3;
            }
            if ((i & 64) == 0) {
                this.user = null;
            } else {
                this.user = str4;
            }
        }

        public RequestParam(List<String> list, Boolean bool, String str, Long l, String str2, String str3, String str4) {
            this.placements = list;
            this.isHeaderBidding = bool;
            this.adSize = str;
            this.adStartTime = l;
            this.appId = str2;
            this.placementReferenceId = str3;
            this.user = str4;
        }

        @JvmStatic
        public static final void write$Self(RequestParam self, CompositeEncoder output, SerialDescriptor serialDesc) {
            Intrinsics.checkNotNullParameter(self, "self");
            Intrinsics.checkNotNullParameter(output, "output");
            Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
            if (output.shouldEncodeElementDefault(serialDesc, 0) || self.placements != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, new ArrayListSerializer(StringSerializer.INSTANCE), self.placements);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 1) || self.isHeaderBidding != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, BooleanSerializer.INSTANCE, self.isHeaderBidding);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 2) || self.adSize != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.adSize);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 3) || self.adStartTime != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, LongSerializer.INSTANCE, self.adStartTime);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 4) || self.appId != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.appId);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 5) || self.placementReferenceId != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.placementReferenceId);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 6) || self.user != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, self.user);
            }
        }

        public /* synthetic */ RequestParam(List list, Boolean bool, String str, Long l, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : l, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4);
        }

        public final List<String> getPlacements() {
            return this.placements;
        }

        public final Boolean isHeaderBidding() {
            return this.isHeaderBidding;
        }

        public final String getAdSize() {
            return this.adSize;
        }

        public final void setAdSize(String str) {
            this.adSize = str;
        }

        public final Long getAdStartTime() {
            return this.adStartTime;
        }

        public final String getAppId() {
            return this.appId;
        }

        public final String getPlacementReferenceId() {
            return this.placementReferenceId;
        }

        public final String getUser() {
            return this.user;
        }
    }
}
