package com.vungle.ads.internal.model;

import com.google.android.exoplayer2.source.rtsp.RtspHeaders;
import com.json.m4;
import com.mbridge.msdk.foundation.entity.b;
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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jacoco.core.runtime.AgentOptions;

/* compiled from: ConfigPayload.kt */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\bN\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u0000 ~2\u00020\u0001:\u0017}~\u007f\u0080\u0001\u0081\u0001\u0082\u0001\u0083\u0001\u0084\u0001\u0085\u0001\u0086\u0001\u0087\u0001\u0088\u0001\u0089\u0001Bû\u0001\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0001\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\n\b\u0001\u0010!\u001a\u0004\u0018\u00010\"\u0012\n\b\u0001\u0010#\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0001\u0010$\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0001\u0010%\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010&\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010'\u001a\u0004\u0018\u00010(¢\u0006\u0002\u0010)Bï\u0001\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0018¢\u0006\u0002\u0010*J\u000b\u0010]\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010^\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0002\u00109J\u000b\u0010_\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\u001cHÆ\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\u001eHÆ\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010 HÆ\u0003J\u000b\u0010c\u001a\u0004\u0018\u00010\"HÆ\u0003J\u0010\u0010d\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0002\u00109J\u0010\u0010e\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0002\u00109J\u0010\u0010f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010SJ\u0010\u0010g\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0002\u00109J\u0011\u0010h\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u000b\u0010i\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010j\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010k\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010l\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010m\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u0010n\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u000b\u0010o\u001a\u0004\u0018\u00010\u0016HÆ\u0003Jø\u0001\u0010p\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0018HÆ\u0001¢\u0006\u0002\u0010qJ\u0013\u0010r\u001a\u00020\u00182\b\u0010s\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010t\u001a\u00020\u0003HÖ\u0001J\t\u0010u\u001a\u00020\u001aHÖ\u0001J!\u0010v\u001a\u00020w2\u0006\u0010x\u001a\u00020\u00002\u0006\u0010y\u001a\u00020z2\u0006\u0010{\u001a\u00020|HÇ\u0001R\u001e\u0010!\u001a\u0004\u0018\u00010\"8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u001e\u0010\u0019\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b1\u0010,\u001a\u0004\b2\u00103R\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b4\u0010,\u001a\u0004\b5\u00106R \u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010:\u0012\u0004\b7\u0010,\u001a\u0004\b8\u00109R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b?\u0010,\u001a\u0004\b\u0013\u0010@R \u0010$\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010:\u0012\u0004\bA\u0010,\u001a\u0004\b$\u00109R\u001e\u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bB\u0010,\u001a\u0004\b\u0015\u0010CR\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bD\u0010,\u001a\u0004\bE\u0010FR\u001e\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bG\u0010,\u001a\u0004\bH\u0010IR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010KR \u0010#\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010:\u0012\u0004\bL\u0010,\u001a\u0004\bM\u00109R\u001e\u0010\u001f\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bN\u0010,\u001a\u0004\bO\u0010PR \u0010%\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010T\u0012\u0004\bQ\u0010,\u001a\u0004\bR\u0010SR \u0010&\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010:\u0012\u0004\bU\u0010,\u001a\u0004\bV\u00109R\u001e\u0010\u001b\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bW\u0010,\u001a\u0004\bX\u0010YR\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bZ\u0010,\u001a\u0004\b[\u0010\\¨\u0006\u008a\u0001"}, d2 = {"Lcom/vungle/ads/internal/model/ConfigPayload;", "", "seen1", "", "endpoints", "Lcom/vungle/ads/internal/model/ConfigPayload$Endpoints;", "placements", "", "Lcom/vungle/ads/internal/model/Placement;", "config", "Lcom/vungle/ads/internal/model/ConfigPayload$ConfigSettings;", "gdpr", "Lcom/vungle/ads/internal/model/ConfigPayload$GDPRSettings;", "loggingEnabled", "Lcom/vungle/ads/internal/model/ConfigPayload$LoggingSettings;", "crashReport", "Lcom/vungle/ads/internal/model/ConfigPayload$CrashReportSettings;", "viewability", "Lcom/vungle/ads/internal/model/ConfigPayload$ViewabilitySettings;", "isAdDownloadOptEnabled", "Lcom/vungle/ads/internal/model/ConfigPayload$LoadOptimizationSettings;", "isReportIncentivizedEnabled", "Lcom/vungle/ads/internal/model/ConfigPayload$ReportIncentivizedSettings;", "disableAdId", "", "configExtension", "", "template", "Lcom/vungle/ads/internal/model/ConfigPayload$Template;", "logMetricsSettings", "Lcom/vungle/ads/internal/model/ConfigPayload$LogMetricsSettings;", "session", "Lcom/vungle/ads/internal/model/ConfigPayload$Session;", "cleverCache", "Lcom/vungle/ads/internal/model/CleverCache;", "rtaDebugging", "isCacheableAssetsRequired", "signalSessionTimeout", "signalsDisabled", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/vungle/ads/internal/model/ConfigPayload$Endpoints;Ljava/util/List;Lcom/vungle/ads/internal/model/ConfigPayload$ConfigSettings;Lcom/vungle/ads/internal/model/ConfigPayload$GDPRSettings;Lcom/vungle/ads/internal/model/ConfigPayload$LoggingSettings;Lcom/vungle/ads/internal/model/ConfigPayload$CrashReportSettings;Lcom/vungle/ads/internal/model/ConfigPayload$ViewabilitySettings;Lcom/vungle/ads/internal/model/ConfigPayload$LoadOptimizationSettings;Lcom/vungle/ads/internal/model/ConfigPayload$ReportIncentivizedSettings;Ljava/lang/Boolean;Ljava/lang/String;Lcom/vungle/ads/internal/model/ConfigPayload$Template;Lcom/vungle/ads/internal/model/ConfigPayload$LogMetricsSettings;Lcom/vungle/ads/internal/model/ConfigPayload$Session;Lcom/vungle/ads/internal/model/CleverCache;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lcom/vungle/ads/internal/model/ConfigPayload$Endpoints;Ljava/util/List;Lcom/vungle/ads/internal/model/ConfigPayload$ConfigSettings;Lcom/vungle/ads/internal/model/ConfigPayload$GDPRSettings;Lcom/vungle/ads/internal/model/ConfigPayload$LoggingSettings;Lcom/vungle/ads/internal/model/ConfigPayload$CrashReportSettings;Lcom/vungle/ads/internal/model/ConfigPayload$ViewabilitySettings;Lcom/vungle/ads/internal/model/ConfigPayload$LoadOptimizationSettings;Lcom/vungle/ads/internal/model/ConfigPayload$ReportIncentivizedSettings;Ljava/lang/Boolean;Ljava/lang/String;Lcom/vungle/ads/internal/model/ConfigPayload$Template;Lcom/vungle/ads/internal/model/ConfigPayload$LogMetricsSettings;Lcom/vungle/ads/internal/model/ConfigPayload$Session;Lcom/vungle/ads/internal/model/CleverCache;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;)V", "getCleverCache$annotations", "()V", "getCleverCache", "()Lcom/vungle/ads/internal/model/CleverCache;", "getConfig", "()Lcom/vungle/ads/internal/model/ConfigPayload$ConfigSettings;", "getConfigExtension$annotations", "getConfigExtension", "()Ljava/lang/String;", "getCrashReport$annotations", "getCrashReport", "()Lcom/vungle/ads/internal/model/ConfigPayload$CrashReportSettings;", "getDisableAdId$annotations", "getDisableAdId", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getEndpoints", "()Lcom/vungle/ads/internal/model/ConfigPayload$Endpoints;", "getGdpr", "()Lcom/vungle/ads/internal/model/ConfigPayload$GDPRSettings;", "isAdDownloadOptEnabled$annotations", "()Lcom/vungle/ads/internal/model/ConfigPayload$LoadOptimizationSettings;", "isCacheableAssetsRequired$annotations", "isReportIncentivizedEnabled$annotations", "()Lcom/vungle/ads/internal/model/ConfigPayload$ReportIncentivizedSettings;", "getLogMetricsSettings$annotations", "getLogMetricsSettings", "()Lcom/vungle/ads/internal/model/ConfigPayload$LogMetricsSettings;", "getLoggingEnabled$annotations", "getLoggingEnabled", "()Lcom/vungle/ads/internal/model/ConfigPayload$LoggingSettings;", "getPlacements", "()Ljava/util/List;", "getRtaDebugging$annotations", "getRtaDebugging", "getSession$annotations", "getSession", "()Lcom/vungle/ads/internal/model/ConfigPayload$Session;", "getSignalSessionTimeout$annotations", "getSignalSessionTimeout", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSignalsDisabled$annotations", "getSignalsDisabled", "getTemplate$annotations", "getTemplate", "()Lcom/vungle/ads/internal/model/ConfigPayload$Template;", "getViewability$annotations", "getViewability", "()Lcom/vungle/ads/internal/model/ConfigPayload$ViewabilitySettings;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lcom/vungle/ads/internal/model/ConfigPayload$Endpoints;Ljava/util/List;Lcom/vungle/ads/internal/model/ConfigPayload$ConfigSettings;Lcom/vungle/ads/internal/model/ConfigPayload$GDPRSettings;Lcom/vungle/ads/internal/model/ConfigPayload$LoggingSettings;Lcom/vungle/ads/internal/model/ConfigPayload$CrashReportSettings;Lcom/vungle/ads/internal/model/ConfigPayload$ViewabilitySettings;Lcom/vungle/ads/internal/model/ConfigPayload$LoadOptimizationSettings;Lcom/vungle/ads/internal/model/ConfigPayload$ReportIncentivizedSettings;Ljava/lang/Boolean;Ljava/lang/String;Lcom/vungle/ads/internal/model/ConfigPayload$Template;Lcom/vungle/ads/internal/model/ConfigPayload$LogMetricsSettings;Lcom/vungle/ads/internal/model/ConfigPayload$Session;Lcom/vungle/ads/internal/model/CleverCache;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;)Lcom/vungle/ads/internal/model/ConfigPayload;", "equals", "other", "hashCode", "toString", "write$Self", "", "self", AgentOptions.OUTPUT, "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "ConfigSettings", "CrashReportSettings", "Endpoints", "GDPRSettings", "LoadOptimizationSettings", "LogMetricsSettings", "LoggingSettings", "ReportIncentivizedSettings", RtspHeaders.SESSION, "Template", "ViewabilitySettings", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@Serializable
/* loaded from: classes5.dex */
public final /* data */ class ConfigPayload {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final CleverCache cleverCache;
    private final ConfigSettings config;
    private final String configExtension;
    private final CrashReportSettings crashReport;
    private final Boolean disableAdId;
    private final Endpoints endpoints;
    private final GDPRSettings gdpr;
    private final LoadOptimizationSettings isAdDownloadOptEnabled;
    private final Boolean isCacheableAssetsRequired;
    private final ReportIncentivizedSettings isReportIncentivizedEnabled;
    private final LogMetricsSettings logMetricsSettings;
    private final LoggingSettings loggingEnabled;
    private final List<Placement> placements;
    private final Boolean rtaDebugging;
    private final Session session;
    private final Integer signalSessionTimeout;
    private final Boolean signalsDisabled;
    private final Template template;
    private final ViewabilitySettings viewability;

    public ConfigPayload() {
        this((Endpoints) null, (List) null, (ConfigSettings) null, (GDPRSettings) null, (LoggingSettings) null, (CrashReportSettings) null, (ViewabilitySettings) null, (LoadOptimizationSettings) null, (ReportIncentivizedSettings) null, (Boolean) null, (String) null, (Template) null, (LogMetricsSettings) null, (Session) null, (CleverCache) null, (Boolean) null, (Boolean) null, (Integer) null, (Boolean) null, 524287, (DefaultConstructorMarker) null);
    }

    @SerialName("reuse_assets")
    public static /* synthetic */ void getCleverCache$annotations() {
    }

    @SerialName(Cookie.CONFIG_EXTENSION)
    public static /* synthetic */ void getConfigExtension$annotations() {
    }

    @SerialName("crash_report")
    public static /* synthetic */ void getCrashReport$annotations() {
    }

    @SerialName(Cookie.COPPA_DISABLE_AD_ID)
    public static /* synthetic */ void getDisableAdId$annotations() {
    }

    @SerialName("log_metrics")
    public static /* synthetic */ void getLogMetricsSettings$annotations() {
    }

    @SerialName("logging")
    public static /* synthetic */ void getLoggingEnabled$annotations() {
    }

    @SerialName("rta_debugging")
    public static /* synthetic */ void getRtaDebugging$annotations() {
    }

    @SerialName("session")
    public static /* synthetic */ void getSession$annotations() {
    }

    @SerialName("sdk_session_timeout")
    public static /* synthetic */ void getSignalSessionTimeout$annotations() {
    }

    @SerialName("signals_disabled")
    public static /* synthetic */ void getSignalsDisabled$annotations() {
    }

    @SerialName("template")
    public static /* synthetic */ void getTemplate$annotations() {
    }

    @SerialName("viewability")
    public static /* synthetic */ void getViewability$annotations() {
    }

    @SerialName("ad_load_optimization")
    public static /* synthetic */ void isAdDownloadOptEnabled$annotations() {
    }

    @SerialName("cacheable_assets_required")
    public static /* synthetic */ void isCacheableAssetsRequired$annotations() {
    }

    @SerialName("ri")
    public static /* synthetic */ void isReportIncentivizedEnabled$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final Endpoints getEndpoints() {
        return this.endpoints;
    }

    /* renamed from: component10, reason: from getter */
    public final Boolean getDisableAdId() {
        return this.disableAdId;
    }

    /* renamed from: component11, reason: from getter */
    public final String getConfigExtension() {
        return this.configExtension;
    }

    /* renamed from: component12, reason: from getter */
    public final Template getTemplate() {
        return this.template;
    }

    /* renamed from: component13, reason: from getter */
    public final LogMetricsSettings getLogMetricsSettings() {
        return this.logMetricsSettings;
    }

    /* renamed from: component14, reason: from getter */
    public final Session getSession() {
        return this.session;
    }

    /* renamed from: component15, reason: from getter */
    public final CleverCache getCleverCache() {
        return this.cleverCache;
    }

    /* renamed from: component16, reason: from getter */
    public final Boolean getRtaDebugging() {
        return this.rtaDebugging;
    }

    /* renamed from: component17, reason: from getter */
    public final Boolean getIsCacheableAssetsRequired() {
        return this.isCacheableAssetsRequired;
    }

    /* renamed from: component18, reason: from getter */
    public final Integer getSignalSessionTimeout() {
        return this.signalSessionTimeout;
    }

    /* renamed from: component19, reason: from getter */
    public final Boolean getSignalsDisabled() {
        return this.signalsDisabled;
    }

    public final List<Placement> component2() {
        return this.placements;
    }

    /* renamed from: component3, reason: from getter */
    public final ConfigSettings getConfig() {
        return this.config;
    }

    /* renamed from: component4, reason: from getter */
    public final GDPRSettings getGdpr() {
        return this.gdpr;
    }

    /* renamed from: component5, reason: from getter */
    public final LoggingSettings getLoggingEnabled() {
        return this.loggingEnabled;
    }

    /* renamed from: component6, reason: from getter */
    public final CrashReportSettings getCrashReport() {
        return this.crashReport;
    }

    /* renamed from: component7, reason: from getter */
    public final ViewabilitySettings getViewability() {
        return this.viewability;
    }

    /* renamed from: component8, reason: from getter */
    public final LoadOptimizationSettings getIsAdDownloadOptEnabled() {
        return this.isAdDownloadOptEnabled;
    }

    /* renamed from: component9, reason: from getter */
    public final ReportIncentivizedSettings getIsReportIncentivizedEnabled() {
        return this.isReportIncentivizedEnabled;
    }

    public final ConfigPayload copy(Endpoints endpoints, List<Placement> placements, ConfigSettings config, GDPRSettings gdpr, LoggingSettings loggingEnabled, CrashReportSettings crashReport, ViewabilitySettings viewability, LoadOptimizationSettings isAdDownloadOptEnabled, ReportIncentivizedSettings isReportIncentivizedEnabled, Boolean disableAdId, String configExtension, Template template, LogMetricsSettings logMetricsSettings, Session session, CleverCache cleverCache, Boolean rtaDebugging, Boolean isCacheableAssetsRequired, Integer signalSessionTimeout, Boolean signalsDisabled) {
        return new ConfigPayload(endpoints, placements, config, gdpr, loggingEnabled, crashReport, viewability, isAdDownloadOptEnabled, isReportIncentivizedEnabled, disableAdId, configExtension, template, logMetricsSettings, session, cleverCache, rtaDebugging, isCacheableAssetsRequired, signalSessionTimeout, signalsDisabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConfigPayload)) {
            return false;
        }
        ConfigPayload configPayload = (ConfigPayload) other;
        return Intrinsics.areEqual(this.endpoints, configPayload.endpoints) && Intrinsics.areEqual(this.placements, configPayload.placements) && Intrinsics.areEqual(this.config, configPayload.config) && Intrinsics.areEqual(this.gdpr, configPayload.gdpr) && Intrinsics.areEqual(this.loggingEnabled, configPayload.loggingEnabled) && Intrinsics.areEqual(this.crashReport, configPayload.crashReport) && Intrinsics.areEqual(this.viewability, configPayload.viewability) && Intrinsics.areEqual(this.isAdDownloadOptEnabled, configPayload.isAdDownloadOptEnabled) && Intrinsics.areEqual(this.isReportIncentivizedEnabled, configPayload.isReportIncentivizedEnabled) && Intrinsics.areEqual(this.disableAdId, configPayload.disableAdId) && Intrinsics.areEqual(this.configExtension, configPayload.configExtension) && Intrinsics.areEqual(this.template, configPayload.template) && Intrinsics.areEqual(this.logMetricsSettings, configPayload.logMetricsSettings) && Intrinsics.areEqual(this.session, configPayload.session) && Intrinsics.areEqual(this.cleverCache, configPayload.cleverCache) && Intrinsics.areEqual(this.rtaDebugging, configPayload.rtaDebugging) && Intrinsics.areEqual(this.isCacheableAssetsRequired, configPayload.isCacheableAssetsRequired) && Intrinsics.areEqual(this.signalSessionTimeout, configPayload.signalSessionTimeout) && Intrinsics.areEqual(this.signalsDisabled, configPayload.signalsDisabled);
    }

    public int hashCode() {
        Endpoints endpoints = this.endpoints;
        int iHashCode = (endpoints == null ? 0 : endpoints.hashCode()) * 31;
        List<Placement> list = this.placements;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        ConfigSettings configSettings = this.config;
        int iHashCode3 = (iHashCode2 + (configSettings == null ? 0 : configSettings.hashCode())) * 31;
        GDPRSettings gDPRSettings = this.gdpr;
        int iHashCode4 = (iHashCode3 + (gDPRSettings == null ? 0 : gDPRSettings.hashCode())) * 31;
        LoggingSettings loggingSettings = this.loggingEnabled;
        int iHashCode5 = (iHashCode4 + (loggingSettings == null ? 0 : loggingSettings.hashCode())) * 31;
        CrashReportSettings crashReportSettings = this.crashReport;
        int iHashCode6 = (iHashCode5 + (crashReportSettings == null ? 0 : crashReportSettings.hashCode())) * 31;
        ViewabilitySettings viewabilitySettings = this.viewability;
        int iHashCode7 = (iHashCode6 + (viewabilitySettings == null ? 0 : viewabilitySettings.hashCode())) * 31;
        LoadOptimizationSettings loadOptimizationSettings = this.isAdDownloadOptEnabled;
        int iHashCode8 = (iHashCode7 + (loadOptimizationSettings == null ? 0 : loadOptimizationSettings.hashCode())) * 31;
        ReportIncentivizedSettings reportIncentivizedSettings = this.isReportIncentivizedEnabled;
        int iHashCode9 = (iHashCode8 + (reportIncentivizedSettings == null ? 0 : reportIncentivizedSettings.hashCode())) * 31;
        Boolean bool = this.disableAdId;
        int iHashCode10 = (iHashCode9 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.configExtension;
        int iHashCode11 = (iHashCode10 + (str == null ? 0 : str.hashCode())) * 31;
        Template template = this.template;
        int iHashCode12 = (iHashCode11 + (template == null ? 0 : template.hashCode())) * 31;
        LogMetricsSettings logMetricsSettings = this.logMetricsSettings;
        int iHashCode13 = (iHashCode12 + (logMetricsSettings == null ? 0 : logMetricsSettings.hashCode())) * 31;
        Session session = this.session;
        int iHashCode14 = (iHashCode13 + (session == null ? 0 : session.hashCode())) * 31;
        CleverCache cleverCache = this.cleverCache;
        int iHashCode15 = (iHashCode14 + (cleverCache == null ? 0 : cleverCache.hashCode())) * 31;
        Boolean bool2 = this.rtaDebugging;
        int iHashCode16 = (iHashCode15 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isCacheableAssetsRequired;
        int iHashCode17 = (iHashCode16 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Integer num = this.signalSessionTimeout;
        int iHashCode18 = (iHashCode17 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool4 = this.signalsDisabled;
        return iHashCode18 + (bool4 != null ? bool4.hashCode() : 0);
    }

    public String toString() {
        return "ConfigPayload(endpoints=" + this.endpoints + ", placements=" + this.placements + ", config=" + this.config + ", gdpr=" + this.gdpr + ", loggingEnabled=" + this.loggingEnabled + ", crashReport=" + this.crashReport + ", viewability=" + this.viewability + ", isAdDownloadOptEnabled=" + this.isAdDownloadOptEnabled + ", isReportIncentivizedEnabled=" + this.isReportIncentivizedEnabled + ", disableAdId=" + this.disableAdId + ", configExtension=" + this.configExtension + ", template=" + this.template + ", logMetricsSettings=" + this.logMetricsSettings + ", session=" + this.session + ", cleverCache=" + this.cleverCache + ", rtaDebugging=" + this.rtaDebugging + ", isCacheableAssetsRequired=" + this.isCacheableAssetsRequired + ", signalSessionTimeout=" + this.signalSessionTimeout + ", signalsDisabled=" + this.signalsDisabled + ')';
    }

    /* compiled from: ConfigPayload.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/model/ConfigPayload$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/model/ConfigPayload;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ConfigPayload> serializer() {
            return ConfigPayload$$serializer.INSTANCE;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ ConfigPayload(int i, Endpoints endpoints, List list, ConfigSettings configSettings, GDPRSettings gDPRSettings, @SerialName("logging") LoggingSettings loggingSettings, @SerialName("crash_report") CrashReportSettings crashReportSettings, @SerialName("viewability") ViewabilitySettings viewabilitySettings, @SerialName("ad_load_optimization") LoadOptimizationSettings loadOptimizationSettings, @SerialName("ri") ReportIncentivizedSettings reportIncentivizedSettings, @SerialName(Cookie.COPPA_DISABLE_AD_ID) Boolean bool, @SerialName(Cookie.CONFIG_EXTENSION) String str, @SerialName("template") Template template, @SerialName("log_metrics") LogMetricsSettings logMetricsSettings, @SerialName("session") Session session, @SerialName("reuse_assets") CleverCache cleverCache, @SerialName("rta_debugging") Boolean bool2, @SerialName("cacheable_assets_required") Boolean bool3, @SerialName("sdk_session_timeout") Integer num, @SerialName("signals_disabled") Boolean bool4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 0) != 0) {
            PluginExceptionsKt.throwMissingFieldException(i, 0, ConfigPayload$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.endpoints = null;
        } else {
            this.endpoints = endpoints;
        }
        if ((i & 2) == 0) {
            this.placements = null;
        } else {
            this.placements = list;
        }
        if ((i & 4) == 0) {
            this.config = null;
        } else {
            this.config = configSettings;
        }
        if ((i & 8) == 0) {
            this.gdpr = null;
        } else {
            this.gdpr = gDPRSettings;
        }
        if ((i & 16) == 0) {
            this.loggingEnabled = null;
        } else {
            this.loggingEnabled = loggingSettings;
        }
        if ((i & 32) == 0) {
            this.crashReport = null;
        } else {
            this.crashReport = crashReportSettings;
        }
        if ((i & 64) == 0) {
            this.viewability = null;
        } else {
            this.viewability = viewabilitySettings;
        }
        if ((i & 128) == 0) {
            this.isAdDownloadOptEnabled = null;
        } else {
            this.isAdDownloadOptEnabled = loadOptimizationSettings;
        }
        if ((i & 256) == 0) {
            this.isReportIncentivizedEnabled = null;
        } else {
            this.isReportIncentivizedEnabled = reportIncentivizedSettings;
        }
        this.disableAdId = (i & 512) == 0 ? true : bool;
        if ((i & 1024) == 0) {
            this.configExtension = null;
        } else {
            this.configExtension = str;
        }
        if ((i & 2048) == 0) {
            this.template = null;
        } else {
            this.template = template;
        }
        if ((i & 4096) == 0) {
            this.logMetricsSettings = null;
        } else {
            this.logMetricsSettings = logMetricsSettings;
        }
        if ((i & 8192) == 0) {
            this.session = null;
        } else {
            this.session = session;
        }
        if ((i & 16384) == 0) {
            this.cleverCache = null;
        } else {
            this.cleverCache = cleverCache;
        }
        if ((32768 & i) == 0) {
            this.rtaDebugging = null;
        } else {
            this.rtaDebugging = bool2;
        }
        if ((65536 & i) == 0) {
            this.isCacheableAssetsRequired = null;
        } else {
            this.isCacheableAssetsRequired = bool3;
        }
        if ((131072 & i) == 0) {
            this.signalSessionTimeout = null;
        } else {
            this.signalSessionTimeout = num;
        }
        if ((i & 262144) == 0) {
            this.signalsDisabled = null;
        } else {
            this.signalsDisabled = bool4;
        }
    }

    public ConfigPayload(Endpoints endpoints, List<Placement> list, ConfigSettings configSettings, GDPRSettings gDPRSettings, LoggingSettings loggingSettings, CrashReportSettings crashReportSettings, ViewabilitySettings viewabilitySettings, LoadOptimizationSettings loadOptimizationSettings, ReportIncentivizedSettings reportIncentivizedSettings, Boolean bool, String str, Template template, LogMetricsSettings logMetricsSettings, Session session, CleverCache cleverCache, Boolean bool2, Boolean bool3, Integer num, Boolean bool4) {
        this.endpoints = endpoints;
        this.placements = list;
        this.config = configSettings;
        this.gdpr = gDPRSettings;
        this.loggingEnabled = loggingSettings;
        this.crashReport = crashReportSettings;
        this.viewability = viewabilitySettings;
        this.isAdDownloadOptEnabled = loadOptimizationSettings;
        this.isReportIncentivizedEnabled = reportIncentivizedSettings;
        this.disableAdId = bool;
        this.configExtension = str;
        this.template = template;
        this.logMetricsSettings = logMetricsSettings;
        this.session = session;
        this.cleverCache = cleverCache;
        this.rtaDebugging = bool2;
        this.isCacheableAssetsRequired = bool3;
        this.signalSessionTimeout = num;
        this.signalsDisabled = bool4;
    }

    @JvmStatic
    public static final void write$Self(ConfigPayload self, CompositeEncoder output, SerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.endpoints != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, ConfigPayload$Endpoints$$serializer.INSTANCE, self.endpoints);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.placements != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, new ArrayListSerializer(Placement$$serializer.INSTANCE), self.placements);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.config != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, ConfigPayload$ConfigSettings$$serializer.INSTANCE, self.config);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.gdpr != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, ConfigPayload$GDPRSettings$$serializer.INSTANCE, self.gdpr);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.loggingEnabled != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, ConfigPayload$LoggingSettings$$serializer.INSTANCE, self.loggingEnabled);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.crashReport != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, ConfigPayload$CrashReportSettings$$serializer.INSTANCE, self.crashReport);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.viewability != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, ConfigPayload$ViewabilitySettings$$serializer.INSTANCE, self.viewability);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.isAdDownloadOptEnabled != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, ConfigPayload$LoadOptimizationSettings$$serializer.INSTANCE, self.isAdDownloadOptEnabled);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.isReportIncentivizedEnabled != null) {
            output.encodeNullableSerializableElement(serialDesc, 8, ConfigPayload$ReportIncentivizedSettings$$serializer.INSTANCE, self.isReportIncentivizedEnabled);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 9) || !Intrinsics.areEqual((Object) self.disableAdId, (Object) true)) {
            output.encodeNullableSerializableElement(serialDesc, 9, BooleanSerializer.INSTANCE, self.disableAdId);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 10) || self.configExtension != null) {
            output.encodeNullableSerializableElement(serialDesc, 10, StringSerializer.INSTANCE, self.configExtension);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 11) || self.template != null) {
            output.encodeNullableSerializableElement(serialDesc, 11, ConfigPayload$Template$$serializer.INSTANCE, self.template);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 12) || self.logMetricsSettings != null) {
            output.encodeNullableSerializableElement(serialDesc, 12, ConfigPayload$LogMetricsSettings$$serializer.INSTANCE, self.logMetricsSettings);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 13) || self.session != null) {
            output.encodeNullableSerializableElement(serialDesc, 13, ConfigPayload$Session$$serializer.INSTANCE, self.session);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 14) || self.cleverCache != null) {
            output.encodeNullableSerializableElement(serialDesc, 14, CleverCache$$serializer.INSTANCE, self.cleverCache);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 15) || self.rtaDebugging != null) {
            output.encodeNullableSerializableElement(serialDesc, 15, BooleanSerializer.INSTANCE, self.rtaDebugging);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 16) || self.isCacheableAssetsRequired != null) {
            output.encodeNullableSerializableElement(serialDesc, 16, BooleanSerializer.INSTANCE, self.isCacheableAssetsRequired);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 17) || self.signalSessionTimeout != null) {
            output.encodeNullableSerializableElement(serialDesc, 17, IntSerializer.INSTANCE, self.signalSessionTimeout);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 18) || self.signalsDisabled != null) {
            output.encodeNullableSerializableElement(serialDesc, 18, BooleanSerializer.INSTANCE, self.signalsDisabled);
        }
    }

    public final Endpoints getEndpoints() {
        return this.endpoints;
    }

    public final List<Placement> getPlacements() {
        return this.placements;
    }

    public final ConfigSettings getConfig() {
        return this.config;
    }

    public final GDPRSettings getGdpr() {
        return this.gdpr;
    }

    public final LoggingSettings getLoggingEnabled() {
        return this.loggingEnabled;
    }

    public final CrashReportSettings getCrashReport() {
        return this.crashReport;
    }

    public final ViewabilitySettings getViewability() {
        return this.viewability;
    }

    public final LoadOptimizationSettings isAdDownloadOptEnabled() {
        return this.isAdDownloadOptEnabled;
    }

    public final ReportIncentivizedSettings isReportIncentivizedEnabled() {
        return this.isReportIncentivizedEnabled;
    }

    public /* synthetic */ ConfigPayload(Endpoints endpoints, List list, ConfigSettings configSettings, GDPRSettings gDPRSettings, LoggingSettings loggingSettings, CrashReportSettings crashReportSettings, ViewabilitySettings viewabilitySettings, LoadOptimizationSettings loadOptimizationSettings, ReportIncentivizedSettings reportIncentivizedSettings, Boolean bool, String str, Template template, LogMetricsSettings logMetricsSettings, Session session, CleverCache cleverCache, Boolean bool2, Boolean bool3, Integer num, Boolean bool4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : endpoints, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : configSettings, (i & 8) != 0 ? null : gDPRSettings, (i & 16) != 0 ? null : loggingSettings, (i & 32) != 0 ? null : crashReportSettings, (i & 64) != 0 ? null : viewabilitySettings, (i & 128) != 0 ? null : loadOptimizationSettings, (i & 256) != 0 ? null : reportIncentivizedSettings, (i & 512) != 0 ? true : bool, (i & 1024) != 0 ? null : str, (i & 2048) != 0 ? null : template, (i & 4096) != 0 ? null : logMetricsSettings, (i & 8192) != 0 ? null : session, (i & 16384) != 0 ? null : cleverCache, (i & 32768) != 0 ? null : bool2, (i & 65536) != 0 ? null : bool3, (i & 131072) != 0 ? null : num, (i & 262144) != 0 ? null : bool4);
    }

    public final Boolean getDisableAdId() {
        return this.disableAdId;
    }

    public final String getConfigExtension() {
        return this.configExtension;
    }

    public final Template getTemplate() {
        return this.template;
    }

    public final LogMetricsSettings getLogMetricsSettings() {
        return this.logMetricsSettings;
    }

    public final Session getSession() {
        return this.session;
    }

    public final CleverCache getCleverCache() {
        return this.cleverCache;
    }

    public final Boolean getRtaDebugging() {
        return this.rtaDebugging;
    }

    public final Boolean isCacheableAssetsRequired() {
        return this.isCacheableAssetsRequired;
    }

    public final Integer getSignalSessionTimeout() {
        return this.signalSessionTimeout;
    }

    /* compiled from: ConfigPayload.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002,-BU\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fBA\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\rJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003JE\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\u0003HÖ\u0001J\t\u0010$\u001a\u00020\u0005HÖ\u0001J!\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u00002\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+HÇ\u0001R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001e\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u001e\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0017\u0010\u0011R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u000f\u001a\u0004\b\u0019\u0010\u0011¨\u0006."}, d2 = {"Lcom/vungle/ads/internal/model/ConfigPayload$Endpoints;", "", "seen1", "", "adsEndpoint", "", "riEndpoint", "mraidEndpoint", "metricsEndpoint", "errorLogsEndpoint", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAdsEndpoint$annotations", "()V", "getAdsEndpoint", "()Ljava/lang/String;", "getErrorLogsEndpoint$annotations", "getErrorLogsEndpoint", "getMetricsEndpoint$annotations", "getMetricsEndpoint", "getMraidEndpoint$annotations", "getMraidEndpoint", "getRiEndpoint$annotations", "getRiEndpoint", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", AgentOptions.OUTPUT, "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @Serializable
    public static final /* data */ class Endpoints {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String adsEndpoint;
        private final String errorLogsEndpoint;
        private final String metricsEndpoint;
        private final String mraidEndpoint;
        private final String riEndpoint;

        public Endpoints() {
            this((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Endpoints copy$default(Endpoints endpoints, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
            if ((i & 1) != 0) {
                str = endpoints.adsEndpoint;
            }
            if ((i & 2) != 0) {
                str2 = endpoints.riEndpoint;
            }
            String str6 = str2;
            if ((i & 4) != 0) {
                str3 = endpoints.mraidEndpoint;
            }
            String str7 = str3;
            if ((i & 8) != 0) {
                str4 = endpoints.metricsEndpoint;
            }
            String str8 = str4;
            if ((i & 16) != 0) {
                str5 = endpoints.errorLogsEndpoint;
            }
            return endpoints.copy(str, str6, str7, str8, str5);
        }

        @SerialName(b.JSON_KEY_ADS)
        public static /* synthetic */ void getAdsEndpoint$annotations() {
        }

        @SerialName("error_logs")
        public static /* synthetic */ void getErrorLogsEndpoint$annotations() {
        }

        @SerialName("metrics")
        public static /* synthetic */ void getMetricsEndpoint$annotations() {
        }

        @SerialName("mraid_js")
        public static /* synthetic */ void getMraidEndpoint$annotations() {
        }

        @SerialName("ri")
        public static /* synthetic */ void getRiEndpoint$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getAdsEndpoint() {
            return this.adsEndpoint;
        }

        /* renamed from: component2, reason: from getter */
        public final String getRiEndpoint() {
            return this.riEndpoint;
        }

        /* renamed from: component3, reason: from getter */
        public final String getMraidEndpoint() {
            return this.mraidEndpoint;
        }

        /* renamed from: component4, reason: from getter */
        public final String getMetricsEndpoint() {
            return this.metricsEndpoint;
        }

        /* renamed from: component5, reason: from getter */
        public final String getErrorLogsEndpoint() {
            return this.errorLogsEndpoint;
        }

        public final Endpoints copy(String adsEndpoint, String riEndpoint, String mraidEndpoint, String metricsEndpoint, String errorLogsEndpoint) {
            return new Endpoints(adsEndpoint, riEndpoint, mraidEndpoint, metricsEndpoint, errorLogsEndpoint);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Endpoints)) {
                return false;
            }
            Endpoints endpoints = (Endpoints) other;
            return Intrinsics.areEqual(this.adsEndpoint, endpoints.adsEndpoint) && Intrinsics.areEqual(this.riEndpoint, endpoints.riEndpoint) && Intrinsics.areEqual(this.mraidEndpoint, endpoints.mraidEndpoint) && Intrinsics.areEqual(this.metricsEndpoint, endpoints.metricsEndpoint) && Intrinsics.areEqual(this.errorLogsEndpoint, endpoints.errorLogsEndpoint);
        }

        public int hashCode() {
            String str = this.adsEndpoint;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.riEndpoint;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.mraidEndpoint;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.metricsEndpoint;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.errorLogsEndpoint;
            return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
        }

        public String toString() {
            return "Endpoints(adsEndpoint=" + this.adsEndpoint + ", riEndpoint=" + this.riEndpoint + ", mraidEndpoint=" + this.mraidEndpoint + ", metricsEndpoint=" + this.metricsEndpoint + ", errorLogsEndpoint=" + this.errorLogsEndpoint + ')';
        }

        /* compiled from: ConfigPayload.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/model/ConfigPayload$Endpoints$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/model/ConfigPayload$Endpoints;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<Endpoints> serializer() {
                return ConfigPayload$Endpoints$$serializer.INSTANCE;
            }
        }

        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public /* synthetic */ Endpoints(int i, @SerialName(b.JSON_KEY_ADS) String str, @SerialName("ri") String str2, @SerialName("mraid_js") String str3, @SerialName("metrics") String str4, @SerialName("error_logs") String str5, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 0) != 0) {
                PluginExceptionsKt.throwMissingFieldException(i, 0, ConfigPayload$Endpoints$$serializer.INSTANCE.getDescriptor());
            }
            if ((i & 1) == 0) {
                this.adsEndpoint = null;
            } else {
                this.adsEndpoint = str;
            }
            if ((i & 2) == 0) {
                this.riEndpoint = null;
            } else {
                this.riEndpoint = str2;
            }
            if ((i & 4) == 0) {
                this.mraidEndpoint = null;
            } else {
                this.mraidEndpoint = str3;
            }
            if ((i & 8) == 0) {
                this.metricsEndpoint = null;
            } else {
                this.metricsEndpoint = str4;
            }
            if ((i & 16) == 0) {
                this.errorLogsEndpoint = null;
            } else {
                this.errorLogsEndpoint = str5;
            }
        }

        public Endpoints(String str, String str2, String str3, String str4, String str5) {
            this.adsEndpoint = str;
            this.riEndpoint = str2;
            this.mraidEndpoint = str3;
            this.metricsEndpoint = str4;
            this.errorLogsEndpoint = str5;
        }

        @JvmStatic
        public static final void write$Self(Endpoints self, CompositeEncoder output, SerialDescriptor serialDesc) {
            Intrinsics.checkNotNullParameter(self, "self");
            Intrinsics.checkNotNullParameter(output, "output");
            Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
            if (output.shouldEncodeElementDefault(serialDesc, 0) || self.adsEndpoint != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.adsEndpoint);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 1) || self.riEndpoint != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.riEndpoint);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 2) || self.mraidEndpoint != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.mraidEndpoint);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 3) || self.metricsEndpoint != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.metricsEndpoint);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 4) || self.errorLogsEndpoint != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.errorLogsEndpoint);
            }
        }

        public /* synthetic */ Endpoints(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
        }

        public final String getAdsEndpoint() {
            return this.adsEndpoint;
        }

        public final String getRiEndpoint() {
            return this.riEndpoint;
        }

        public final String getMraidEndpoint() {
            return this.mraidEndpoint;
        }

        public final String getMetricsEndpoint() {
            return this.metricsEndpoint;
        }

        public final String getErrorLogsEndpoint() {
            return this.errorLogsEndpoint;
        }
    }

    public final Boolean getSignalsDisabled() {
        return this.signalsDisabled;
    }

    /* compiled from: ConfigPayload.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001c\u001dB#\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J!\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bHÇ\u0001R\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u001e"}, d2 = {"Lcom/vungle/ads/internal/model/ConfigPayload$ConfigSettings;", "", "seen1", "", "refreshTime", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(I)V", "getRefreshTime$annotations", "()V", "getRefreshTime", "()I", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", AgentOptions.OUTPUT, "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @Serializable
    public static final /* data */ class ConfigSettings {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final int refreshTime;

        public static /* synthetic */ ConfigSettings copy$default(ConfigSettings configSettings, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = configSettings.refreshTime;
            }
            return configSettings.copy(i);
        }

        @SerialName("refresh_time")
        public static /* synthetic */ void getRefreshTime$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final int getRefreshTime() {
            return this.refreshTime;
        }

        public final ConfigSettings copy(int refreshTime) {
            return new ConfigSettings(refreshTime);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ConfigSettings) && this.refreshTime == ((ConfigSettings) other).refreshTime;
        }

        public int hashCode() {
            return this.refreshTime;
        }

        public String toString() {
            return "ConfigSettings(refreshTime=" + this.refreshTime + ')';
        }

        /* compiled from: ConfigPayload.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/model/ConfigPayload$ConfigSettings$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/model/ConfigPayload$ConfigSettings;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<ConfigSettings> serializer() {
                return ConfigPayload$ConfigSettings$$serializer.INSTANCE;
            }
        }

        public ConfigSettings(int i) {
            this.refreshTime = i;
        }

        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public /* synthetic */ ConfigSettings(int i, @SerialName("refresh_time") int i2, SerializationConstructorMarker serializationConstructorMarker) {
            if (1 != (i & 1)) {
                PluginExceptionsKt.throwMissingFieldException(i, 1, ConfigPayload$ConfigSettings$$serializer.INSTANCE.getDescriptor());
            }
            this.refreshTime = i2;
        }

        @JvmStatic
        public static final void write$Self(ConfigSettings self, CompositeEncoder output, SerialDescriptor serialDesc) {
            Intrinsics.checkNotNullParameter(self, "self");
            Intrinsics.checkNotNullParameter(output, "output");
            Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
            output.encodeIntElement(serialDesc, 0, self.refreshTime);
        }

        public final int getRefreshTime() {
            return this.refreshTime;
        }
    }

    /* compiled from: ConfigPayload.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000201B_\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eB5\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0002\u0010\u000fJ\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\t\u0010\"\u001a\u00020\u0007HÆ\u0003J\t\u0010#\u001a\u00020\u0007HÆ\u0003JE\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010%\u001a\u00020\u00052\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020\u0003HÖ\u0001J\t\u0010(\u001a\u00020\u0007HÖ\u0001J!\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u00002\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/HÇ\u0001R\u001c\u0010\n\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u000b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u001c\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013R\u001c\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0011\u001a\u0004\b\u0019\u0010\u0013R\u001c\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0011\u001a\u0004\b\u001b\u0010\u0013R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0011\u001a\u0004\b\u0004\u0010\u001d¨\u00062"}, d2 = {"Lcom/vungle/ads/internal/model/ConfigPayload$GDPRSettings;", "", "seen1", "", "isCountryDataProtected", "", "consentTitle", "", "consentMessage", "consentMessageVersion", "buttonAccept", "buttonDeny", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getButtonAccept$annotations", "()V", "getButtonAccept", "()Ljava/lang/String;", "getButtonDeny$annotations", "getButtonDeny", "getConsentMessage$annotations", "getConsentMessage", "getConsentMessageVersion$annotations", "getConsentMessageVersion", "getConsentTitle$annotations", "getConsentTitle", "isCountryDataProtected$annotations", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", AgentOptions.OUTPUT, "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @Serializable
    public static final /* data */ class GDPRSettings {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String buttonAccept;
        private final String buttonDeny;
        private final String consentMessage;
        private final String consentMessageVersion;
        private final String consentTitle;
        private final boolean isCountryDataProtected;

        public static /* synthetic */ GDPRSettings copy$default(GDPRSettings gDPRSettings, boolean z, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
            if ((i & 1) != 0) {
                z = gDPRSettings.isCountryDataProtected;
            }
            if ((i & 2) != 0) {
                str = gDPRSettings.consentTitle;
            }
            String str6 = str;
            if ((i & 4) != 0) {
                str2 = gDPRSettings.consentMessage;
            }
            String str7 = str2;
            if ((i & 8) != 0) {
                str3 = gDPRSettings.consentMessageVersion;
            }
            String str8 = str3;
            if ((i & 16) != 0) {
                str4 = gDPRSettings.buttonAccept;
            }
            String str9 = str4;
            if ((i & 32) != 0) {
                str5 = gDPRSettings.buttonDeny;
            }
            return gDPRSettings.copy(z, str6, str7, str8, str9, str5);
        }

        @SerialName("button_accept")
        public static /* synthetic */ void getButtonAccept$annotations() {
        }

        @SerialName("button_deny")
        public static /* synthetic */ void getButtonDeny$annotations() {
        }

        @SerialName("consent_message")
        public static /* synthetic */ void getConsentMessage$annotations() {
        }

        @SerialName("consent_message_version")
        public static /* synthetic */ void getConsentMessageVersion$annotations() {
        }

        @SerialName("consent_title")
        public static /* synthetic */ void getConsentTitle$annotations() {
        }

        @SerialName("is_country_data_protected")
        public static /* synthetic */ void isCountryDataProtected$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsCountryDataProtected() {
            return this.isCountryDataProtected;
        }

        /* renamed from: component2, reason: from getter */
        public final String getConsentTitle() {
            return this.consentTitle;
        }

        /* renamed from: component3, reason: from getter */
        public final String getConsentMessage() {
            return this.consentMessage;
        }

        /* renamed from: component4, reason: from getter */
        public final String getConsentMessageVersion() {
            return this.consentMessageVersion;
        }

        /* renamed from: component5, reason: from getter */
        public final String getButtonAccept() {
            return this.buttonAccept;
        }

        /* renamed from: component6, reason: from getter */
        public final String getButtonDeny() {
            return this.buttonDeny;
        }

        public final GDPRSettings copy(boolean isCountryDataProtected, String consentTitle, String consentMessage, String consentMessageVersion, String buttonAccept, String buttonDeny) {
            Intrinsics.checkNotNullParameter(consentTitle, "consentTitle");
            Intrinsics.checkNotNullParameter(consentMessage, "consentMessage");
            Intrinsics.checkNotNullParameter(consentMessageVersion, "consentMessageVersion");
            Intrinsics.checkNotNullParameter(buttonAccept, "buttonAccept");
            Intrinsics.checkNotNullParameter(buttonDeny, "buttonDeny");
            return new GDPRSettings(isCountryDataProtected, consentTitle, consentMessage, consentMessageVersion, buttonAccept, buttonDeny);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GDPRSettings)) {
                return false;
            }
            GDPRSettings gDPRSettings = (GDPRSettings) other;
            return this.isCountryDataProtected == gDPRSettings.isCountryDataProtected && Intrinsics.areEqual(this.consentTitle, gDPRSettings.consentTitle) && Intrinsics.areEqual(this.consentMessage, gDPRSettings.consentMessage) && Intrinsics.areEqual(this.consentMessageVersion, gDPRSettings.consentMessageVersion) && Intrinsics.areEqual(this.buttonAccept, gDPRSettings.buttonAccept) && Intrinsics.areEqual(this.buttonDeny, gDPRSettings.buttonDeny);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v12 */
        /* JADX WARN: Type inference failed for: r0v13 */
        public int hashCode() {
            boolean z = this.isCountryDataProtected;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            return (((((((((r0 * 31) + this.consentTitle.hashCode()) * 31) + this.consentMessage.hashCode()) * 31) + this.consentMessageVersion.hashCode()) * 31) + this.buttonAccept.hashCode()) * 31) + this.buttonDeny.hashCode();
        }

        public String toString() {
            return "GDPRSettings(isCountryDataProtected=" + this.isCountryDataProtected + ", consentTitle=" + this.consentTitle + ", consentMessage=" + this.consentMessage + ", consentMessageVersion=" + this.consentMessageVersion + ", buttonAccept=" + this.buttonAccept + ", buttonDeny=" + this.buttonDeny + ')';
        }

        /* compiled from: ConfigPayload.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/model/ConfigPayload$GDPRSettings$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/model/ConfigPayload$GDPRSettings;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<GDPRSettings> serializer() {
                return ConfigPayload$GDPRSettings$$serializer.INSTANCE;
            }
        }

        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public /* synthetic */ GDPRSettings(int i, @SerialName("is_country_data_protected") boolean z, @SerialName("consent_title") String str, @SerialName("consent_message") String str2, @SerialName("consent_message_version") String str3, @SerialName("button_accept") String str4, @SerialName("button_deny") String str5, SerializationConstructorMarker serializationConstructorMarker) {
            if (63 != (i & 63)) {
                PluginExceptionsKt.throwMissingFieldException(i, 63, ConfigPayload$GDPRSettings$$serializer.INSTANCE.getDescriptor());
            }
            this.isCountryDataProtected = z;
            this.consentTitle = str;
            this.consentMessage = str2;
            this.consentMessageVersion = str3;
            this.buttonAccept = str4;
            this.buttonDeny = str5;
        }

        public GDPRSettings(boolean z, String consentTitle, String consentMessage, String consentMessageVersion, String buttonAccept, String buttonDeny) {
            Intrinsics.checkNotNullParameter(consentTitle, "consentTitle");
            Intrinsics.checkNotNullParameter(consentMessage, "consentMessage");
            Intrinsics.checkNotNullParameter(consentMessageVersion, "consentMessageVersion");
            Intrinsics.checkNotNullParameter(buttonAccept, "buttonAccept");
            Intrinsics.checkNotNullParameter(buttonDeny, "buttonDeny");
            this.isCountryDataProtected = z;
            this.consentTitle = consentTitle;
            this.consentMessage = consentMessage;
            this.consentMessageVersion = consentMessageVersion;
            this.buttonAccept = buttonAccept;
            this.buttonDeny = buttonDeny;
        }

        @JvmStatic
        public static final void write$Self(GDPRSettings self, CompositeEncoder output, SerialDescriptor serialDesc) {
            Intrinsics.checkNotNullParameter(self, "self");
            Intrinsics.checkNotNullParameter(output, "output");
            Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
            output.encodeBooleanElement(serialDesc, 0, self.isCountryDataProtected);
            output.encodeStringElement(serialDesc, 1, self.consentTitle);
            output.encodeStringElement(serialDesc, 2, self.consentMessage);
            output.encodeStringElement(serialDesc, 3, self.consentMessageVersion);
            output.encodeStringElement(serialDesc, 4, self.buttonAccept);
            output.encodeStringElement(serialDesc, 5, self.buttonDeny);
        }

        public final boolean isCountryDataProtected() {
            return this.isCountryDataProtected;
        }

        public final String getConsentTitle() {
            return this.consentTitle;
        }

        public final String getConsentMessage() {
            return this.consentMessage;
        }

        public final String getConsentMessageVersion() {
            return this.consentMessageVersion;
        }

        public final String getButtonAccept() {
            return this.buttonAccept;
        }

        public final String getButtonDeny() {
            return this.buttonDeny;
        }
    }

    /* compiled from: ConfigPayload.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001a\u001bB!\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB\u000f\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J!\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019HÇ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/vungle/ads/internal/model/ConfigPayload$LoggingSettings;", "", "seen1", "", m4.r, "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Z)V", "getEnabled", "()Z", "component1", "copy", "equals", "other", "hashCode", "toString", "", "write$Self", "", "self", AgentOptions.OUTPUT, "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @Serializable
    public static final /* data */ class LoggingSettings {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final boolean enabled;

        public LoggingSettings() {
            this(false, 1, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ LoggingSettings copy$default(LoggingSettings loggingSettings, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = loggingSettings.enabled;
            }
            return loggingSettings.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getEnabled() {
            return this.enabled;
        }

        public final LoggingSettings copy(boolean enabled) {
            return new LoggingSettings(enabled);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof LoggingSettings) && this.enabled == ((LoggingSettings) other).enabled;
        }

        public int hashCode() {
            boolean z = this.enabled;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public String toString() {
            return "LoggingSettings(enabled=" + this.enabled + ')';
        }

        /* compiled from: ConfigPayload.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/model/ConfigPayload$LoggingSettings$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/model/ConfigPayload$LoggingSettings;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<LoggingSettings> serializer() {
                return ConfigPayload$LoggingSettings$$serializer.INSTANCE;
            }
        }

        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public /* synthetic */ LoggingSettings(int i, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 0) != 0) {
                PluginExceptionsKt.throwMissingFieldException(i, 0, ConfigPayload$LoggingSettings$$serializer.INSTANCE.getDescriptor());
            }
            if ((i & 1) == 0) {
                this.enabled = false;
            } else {
                this.enabled = z;
            }
        }

        public LoggingSettings(boolean z) {
            this.enabled = z;
        }

        @JvmStatic
        public static final void write$Self(LoggingSettings self, CompositeEncoder output, SerialDescriptor serialDesc) {
            Intrinsics.checkNotNullParameter(self, "self");
            Intrinsics.checkNotNullParameter(output, "output");
            Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
            boolean z = true;
            if (!output.shouldEncodeElementDefault(serialDesc, 0) && !self.enabled) {
                z = false;
            }
            if (z) {
                output.encodeBooleanElement(serialDesc, 0, self.enabled);
            }
        }

        public /* synthetic */ LoggingSettings(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z);
        }

        public final boolean getEnabled() {
            return this.enabled;
        }
    }

    /* compiled from: ConfigPayload.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002%&B7\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bB\u001f\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\fJ\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J'\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001d\u001a\u00020\bHÖ\u0001J!\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00002\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$HÇ\u0001R\u001c\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0015¨\u0006'"}, d2 = {"Lcom/vungle/ads/internal/model/ConfigPayload$CrashReportSettings;", "", "seen1", "", m4.r, "", "maxSendAmount", "collectFilter", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IZILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(ZILjava/lang/String;)V", "getCollectFilter$annotations", "()V", "getCollectFilter", "()Ljava/lang/String;", "getEnabled", "()Z", "getMaxSendAmount$annotations", "getMaxSendAmount", "()I", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", AgentOptions.OUTPUT, "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @Serializable
    public static final /* data */ class CrashReportSettings {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String collectFilter;
        private final boolean enabled;
        private final int maxSendAmount;

        public static /* synthetic */ CrashReportSettings copy$default(CrashReportSettings crashReportSettings, boolean z, int i, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                z = crashReportSettings.enabled;
            }
            if ((i2 & 2) != 0) {
                i = crashReportSettings.maxSendAmount;
            }
            if ((i2 & 4) != 0) {
                str = crashReportSettings.collectFilter;
            }
            return crashReportSettings.copy(z, i, str);
        }

        @SerialName("collect_filter")
        public static /* synthetic */ void getCollectFilter$annotations() {
        }

        @SerialName("max_send_amount")
        public static /* synthetic */ void getMaxSendAmount$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getEnabled() {
            return this.enabled;
        }

        /* renamed from: component2, reason: from getter */
        public final int getMaxSendAmount() {
            return this.maxSendAmount;
        }

        /* renamed from: component3, reason: from getter */
        public final String getCollectFilter() {
            return this.collectFilter;
        }

        public final CrashReportSettings copy(boolean enabled, int maxSendAmount, String collectFilter) {
            Intrinsics.checkNotNullParameter(collectFilter, "collectFilter");
            return new CrashReportSettings(enabled, maxSendAmount, collectFilter);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CrashReportSettings)) {
                return false;
            }
            CrashReportSettings crashReportSettings = (CrashReportSettings) other;
            return this.enabled == crashReportSettings.enabled && this.maxSendAmount == crashReportSettings.maxSendAmount && Intrinsics.areEqual(this.collectFilter, crashReportSettings.collectFilter);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v6 */
        /* JADX WARN: Type inference failed for: r0v7 */
        public int hashCode() {
            boolean z = this.enabled;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            return (((r0 * 31) + this.maxSendAmount) * 31) + this.collectFilter.hashCode();
        }

        public String toString() {
            return "CrashReportSettings(enabled=" + this.enabled + ", maxSendAmount=" + this.maxSendAmount + ", collectFilter=" + this.collectFilter + ')';
        }

        /* compiled from: ConfigPayload.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/model/ConfigPayload$CrashReportSettings$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/model/ConfigPayload$CrashReportSettings;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<CrashReportSettings> serializer() {
                return ConfigPayload$CrashReportSettings$$serializer.INSTANCE;
            }
        }

        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public /* synthetic */ CrashReportSettings(int i, boolean z, @SerialName("max_send_amount") int i2, @SerialName("collect_filter") String str, SerializationConstructorMarker serializationConstructorMarker) {
            if (6 != (i & 6)) {
                PluginExceptionsKt.throwMissingFieldException(i, 6, ConfigPayload$CrashReportSettings$$serializer.INSTANCE.getDescriptor());
            }
            if ((i & 1) == 0) {
                this.enabled = false;
            } else {
                this.enabled = z;
            }
            this.maxSendAmount = i2;
            this.collectFilter = str;
        }

        public CrashReportSettings(boolean z, int i, String collectFilter) {
            Intrinsics.checkNotNullParameter(collectFilter, "collectFilter");
            this.enabled = z;
            this.maxSendAmount = i;
            this.collectFilter = collectFilter;
        }

        @JvmStatic
        public static final void write$Self(CrashReportSettings self, CompositeEncoder output, SerialDescriptor serialDesc) {
            Intrinsics.checkNotNullParameter(self, "self");
            Intrinsics.checkNotNullParameter(output, "output");
            Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
            if (output.shouldEncodeElementDefault(serialDesc, 0) || self.enabled) {
                output.encodeBooleanElement(serialDesc, 0, self.enabled);
            }
            output.encodeIntElement(serialDesc, 1, self.maxSendAmount);
            output.encodeStringElement(serialDesc, 2, self.collectFilter);
        }

        public /* synthetic */ CrashReportSettings(boolean z, int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? false : z, i, str);
        }

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final int getMaxSendAmount() {
            return this.maxSendAmount;
        }

        public final String getCollectFilter() {
            return this.collectFilter;
        }
    }

    /* compiled from: ConfigPayload.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001a\u001bB!\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J!\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019HÇ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/vungle/ads/internal/model/ConfigPayload$ViewabilitySettings;", "", "seen1", "", "om", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Z)V", "getOm", "()Z", "component1", "copy", "equals", "other", "hashCode", "toString", "", "write$Self", "", "self", AgentOptions.OUTPUT, "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @Serializable
    public static final /* data */ class ViewabilitySettings {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final boolean om;

        public static /* synthetic */ ViewabilitySettings copy$default(ViewabilitySettings viewabilitySettings, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = viewabilitySettings.om;
            }
            return viewabilitySettings.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getOm() {
            return this.om;
        }

        public final ViewabilitySettings copy(boolean om) {
            return new ViewabilitySettings(om);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ViewabilitySettings) && this.om == ((ViewabilitySettings) other).om;
        }

        public int hashCode() {
            boolean z = this.om;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public String toString() {
            return "ViewabilitySettings(om=" + this.om + ')';
        }

        /* compiled from: ConfigPayload.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/model/ConfigPayload$ViewabilitySettings$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/model/ConfigPayload$ViewabilitySettings;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<ViewabilitySettings> serializer() {
                return ConfigPayload$ViewabilitySettings$$serializer.INSTANCE;
            }
        }

        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public /* synthetic */ ViewabilitySettings(int i, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
            if (1 != (i & 1)) {
                PluginExceptionsKt.throwMissingFieldException(i, 1, ConfigPayload$ViewabilitySettings$$serializer.INSTANCE.getDescriptor());
            }
            this.om = z;
        }

        public ViewabilitySettings(boolean z) {
            this.om = z;
        }

        @JvmStatic
        public static final void write$Self(ViewabilitySettings self, CompositeEncoder output, SerialDescriptor serialDesc) {
            Intrinsics.checkNotNullParameter(self, "self");
            Intrinsics.checkNotNullParameter(output, "output");
            Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
            output.encodeBooleanElement(serialDesc, 0, self.om);
        }

        public final boolean getOm() {
            return this.om;
        }
    }

    /* compiled from: ConfigPayload.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001a\u001bB!\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J!\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019HÇ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/vungle/ads/internal/model/ConfigPayload$LoadOptimizationSettings;", "", "seen1", "", m4.r, "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Z)V", "getEnabled", "()Z", "component1", "copy", "equals", "other", "hashCode", "toString", "", "write$Self", "", "self", AgentOptions.OUTPUT, "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @Serializable
    public static final /* data */ class LoadOptimizationSettings {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final boolean enabled;

        public static /* synthetic */ LoadOptimizationSettings copy$default(LoadOptimizationSettings loadOptimizationSettings, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = loadOptimizationSettings.enabled;
            }
            return loadOptimizationSettings.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getEnabled() {
            return this.enabled;
        }

        public final LoadOptimizationSettings copy(boolean enabled) {
            return new LoadOptimizationSettings(enabled);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof LoadOptimizationSettings) && this.enabled == ((LoadOptimizationSettings) other).enabled;
        }

        public int hashCode() {
            boolean z = this.enabled;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public String toString() {
            return "LoadOptimizationSettings(enabled=" + this.enabled + ')';
        }

        /* compiled from: ConfigPayload.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/model/ConfigPayload$LoadOptimizationSettings$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/model/ConfigPayload$LoadOptimizationSettings;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<LoadOptimizationSettings> serializer() {
                return ConfigPayload$LoadOptimizationSettings$$serializer.INSTANCE;
            }
        }

        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public /* synthetic */ LoadOptimizationSettings(int i, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
            if (1 != (i & 1)) {
                PluginExceptionsKt.throwMissingFieldException(i, 1, ConfigPayload$LoadOptimizationSettings$$serializer.INSTANCE.getDescriptor());
            }
            this.enabled = z;
        }

        public LoadOptimizationSettings(boolean z) {
            this.enabled = z;
        }

        @JvmStatic
        public static final void write$Self(LoadOptimizationSettings self, CompositeEncoder output, SerialDescriptor serialDesc) {
            Intrinsics.checkNotNullParameter(self, "self");
            Intrinsics.checkNotNullParameter(output, "output");
            Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
            output.encodeBooleanElement(serialDesc, 0, self.enabled);
        }

        public final boolean getEnabled() {
            return this.enabled;
        }
    }

    /* compiled from: ConfigPayload.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001a\u001bB!\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J!\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019HÇ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/vungle/ads/internal/model/ConfigPayload$ReportIncentivizedSettings;", "", "seen1", "", m4.r, "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Z)V", "getEnabled", "()Z", "component1", "copy", "equals", "other", "hashCode", "toString", "", "write$Self", "", "self", AgentOptions.OUTPUT, "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @Serializable
    public static final /* data */ class ReportIncentivizedSettings {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final boolean enabled;

        public static /* synthetic */ ReportIncentivizedSettings copy$default(ReportIncentivizedSettings reportIncentivizedSettings, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = reportIncentivizedSettings.enabled;
            }
            return reportIncentivizedSettings.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getEnabled() {
            return this.enabled;
        }

        public final ReportIncentivizedSettings copy(boolean enabled) {
            return new ReportIncentivizedSettings(enabled);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ReportIncentivizedSettings) && this.enabled == ((ReportIncentivizedSettings) other).enabled;
        }

        public int hashCode() {
            boolean z = this.enabled;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public String toString() {
            return "ReportIncentivizedSettings(enabled=" + this.enabled + ')';
        }

        /* compiled from: ConfigPayload.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/model/ConfigPayload$ReportIncentivizedSettings$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/model/ConfigPayload$ReportIncentivizedSettings;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<ReportIncentivizedSettings> serializer() {
                return ConfigPayload$ReportIncentivizedSettings$$serializer.INSTANCE;
            }
        }

        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public /* synthetic */ ReportIncentivizedSettings(int i, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
            if (1 != (i & 1)) {
                PluginExceptionsKt.throwMissingFieldException(i, 1, ConfigPayload$ReportIncentivizedSettings$$serializer.INSTANCE.getDescriptor());
            }
            this.enabled = z;
        }

        public ReportIncentivizedSettings(boolean z) {
            this.enabled = z;
        }

        @JvmStatic
        public static final void write$Self(ReportIncentivizedSettings self, CompositeEncoder output, SerialDescriptor serialDesc) {
            Intrinsics.checkNotNullParameter(self, "self");
            Intrinsics.checkNotNullParameter(output, "output");
            Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
            output.encodeBooleanElement(serialDesc, 0, self.enabled);
        }

        public final boolean getEnabled() {
            return this.enabled;
        }
    }

    /* compiled from: ConfigPayload.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001c\u001dB#\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u0013\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J!\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bHÇ\u0001R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u001e"}, d2 = {"Lcom/vungle/ads/internal/model/ConfigPayload$Template;", "", "seen1", "", "heartbeatEnabled", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Z)V", "getHeartbeatEnabled$annotations", "()V", "getHeartbeatEnabled", "()Z", "component1", "copy", "equals", "other", "hashCode", "toString", "", "write$Self", "", "self", AgentOptions.OUTPUT, "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @Serializable
    public static final /* data */ class Template {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final boolean heartbeatEnabled;

        public static /* synthetic */ Template copy$default(Template template, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = template.heartbeatEnabled;
            }
            return template.copy(z);
        }

        @SerialName("heartbeat_check_enabled")
        public static /* synthetic */ void getHeartbeatEnabled$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getHeartbeatEnabled() {
            return this.heartbeatEnabled;
        }

        public final Template copy(boolean heartbeatEnabled) {
            return new Template(heartbeatEnabled);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Template) && this.heartbeatEnabled == ((Template) other).heartbeatEnabled;
        }

        public int hashCode() {
            boolean z = this.heartbeatEnabled;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public String toString() {
            return "Template(heartbeatEnabled=" + this.heartbeatEnabled + ')';
        }

        /* compiled from: ConfigPayload.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/model/ConfigPayload$Template$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/model/ConfigPayload$Template;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<Template> serializer() {
                return ConfigPayload$Template$$serializer.INSTANCE;
            }
        }

        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public /* synthetic */ Template(int i, @SerialName("heartbeat_check_enabled") boolean z, SerializationConstructorMarker serializationConstructorMarker) {
            if (1 != (i & 1)) {
                PluginExceptionsKt.throwMissingFieldException(i, 1, ConfigPayload$Template$$serializer.INSTANCE.getDescriptor());
            }
            this.heartbeatEnabled = z;
        }

        public Template(boolean z) {
            this.heartbeatEnabled = z;
        }

        @JvmStatic
        public static final void write$Self(Template self, CompositeEncoder output, SerialDescriptor serialDesc) {
            Intrinsics.checkNotNullParameter(self, "self");
            Intrinsics.checkNotNullParameter(output, "output");
            Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
            output.encodeBooleanElement(serialDesc, 0, self.heartbeatEnabled);
        }

        public final boolean getHeartbeatEnabled() {
            return this.heartbeatEnabled;
        }
    }

    /* compiled from: ConfigPayload.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002!\"B-\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tB\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\u001d\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J!\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 HÇ\u0001R\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u0011¨\u0006#"}, d2 = {"Lcom/vungle/ads/internal/model/ConfigPayload$LogMetricsSettings;", "", "seen1", "", "errorLogLevel", "metricsEnabled", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IIZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(IZ)V", "getErrorLogLevel$annotations", "()V", "getErrorLogLevel", "()I", "getMetricsEnabled$annotations", "getMetricsEnabled", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "toString", "", "write$Self", "", "self", AgentOptions.OUTPUT, "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @Serializable
    public static final /* data */ class LogMetricsSettings {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final int errorLogLevel;
        private final boolean metricsEnabled;

        public static /* synthetic */ LogMetricsSettings copy$default(LogMetricsSettings logMetricsSettings, int i, boolean z, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = logMetricsSettings.errorLogLevel;
            }
            if ((i2 & 2) != 0) {
                z = logMetricsSettings.metricsEnabled;
            }
            return logMetricsSettings.copy(i, z);
        }

        @SerialName("error_log_level")
        public static /* synthetic */ void getErrorLogLevel$annotations() {
        }

        @SerialName("metrics_is_enabled")
        public static /* synthetic */ void getMetricsEnabled$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final int getErrorLogLevel() {
            return this.errorLogLevel;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getMetricsEnabled() {
            return this.metricsEnabled;
        }

        public final LogMetricsSettings copy(int errorLogLevel, boolean metricsEnabled) {
            return new LogMetricsSettings(errorLogLevel, metricsEnabled);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LogMetricsSettings)) {
                return false;
            }
            LogMetricsSettings logMetricsSettings = (LogMetricsSettings) other;
            return this.errorLogLevel == logMetricsSettings.errorLogLevel && this.metricsEnabled == logMetricsSettings.metricsEnabled;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int i = this.errorLogLevel * 31;
            boolean z = this.metricsEnabled;
            int i2 = z;
            if (z != 0) {
                i2 = 1;
            }
            return i + i2;
        }

        public String toString() {
            return "LogMetricsSettings(errorLogLevel=" + this.errorLogLevel + ", metricsEnabled=" + this.metricsEnabled + ')';
        }

        /* compiled from: ConfigPayload.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/model/ConfigPayload$LogMetricsSettings$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/model/ConfigPayload$LogMetricsSettings;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<LogMetricsSettings> serializer() {
                return ConfigPayload$LogMetricsSettings$$serializer.INSTANCE;
            }
        }

        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public /* synthetic */ LogMetricsSettings(int i, @SerialName("error_log_level") int i2, @SerialName("metrics_is_enabled") boolean z, SerializationConstructorMarker serializationConstructorMarker) {
            if (3 != (i & 3)) {
                PluginExceptionsKt.throwMissingFieldException(i, 3, ConfigPayload$LogMetricsSettings$$serializer.INSTANCE.getDescriptor());
            }
            this.errorLogLevel = i2;
            this.metricsEnabled = z;
        }

        public LogMetricsSettings(int i, boolean z) {
            this.errorLogLevel = i;
            this.metricsEnabled = z;
        }

        @JvmStatic
        public static final void write$Self(LogMetricsSettings self, CompositeEncoder output, SerialDescriptor serialDesc) {
            Intrinsics.checkNotNullParameter(self, "self");
            Intrinsics.checkNotNullParameter(output, "output");
            Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
            output.encodeIntElement(serialDesc, 0, self.errorLogLevel);
            output.encodeBooleanElement(serialDesc, 1, self.metricsEnabled);
        }

        public final int getErrorLogLevel() {
            return this.errorLogLevel;
        }

        public final boolean getMetricsEnabled() {
            return this.metricsEnabled;
        }
    }

    /* compiled from: ConfigPayload.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002%&B7\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nB\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J'\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J!\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00002\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$HÇ\u0001R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\r\u001a\u0004\b\u0014\u0010\u0012¨\u0006'"}, d2 = {"Lcom/vungle/ads/internal/model/ConfigPayload$Session;", "", "seen1", "", m4.r, "", "limit", "timeout", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IZIILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(ZII)V", "getEnabled$annotations", "()V", "getEnabled", "()Z", "getLimit$annotations", "getLimit", "()I", "getTimeout$annotations", "getTimeout", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "", "write$Self", "", "self", AgentOptions.OUTPUT, "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @Serializable
    public static final /* data */ class Session {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final boolean enabled;
        private final int limit;
        private final int timeout;

        public static /* synthetic */ Session copy$default(Session session, boolean z, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                z = session.enabled;
            }
            if ((i3 & 2) != 0) {
                i = session.limit;
            }
            if ((i3 & 4) != 0) {
                i2 = session.timeout;
            }
            return session.copy(z, i, i2);
        }

        @SerialName(m4.r)
        public static /* synthetic */ void getEnabled$annotations() {
        }

        @SerialName("limit")
        public static /* synthetic */ void getLimit$annotations() {
        }

        @SerialName("timeout")
        public static /* synthetic */ void getTimeout$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getEnabled() {
            return this.enabled;
        }

        /* renamed from: component2, reason: from getter */
        public final int getLimit() {
            return this.limit;
        }

        /* renamed from: component3, reason: from getter */
        public final int getTimeout() {
            return this.timeout;
        }

        public final Session copy(boolean enabled, int limit, int timeout) {
            return new Session(enabled, limit, timeout);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Session)) {
                return false;
            }
            Session session = (Session) other;
            return this.enabled == session.enabled && this.limit == session.limit && this.timeout == session.timeout;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v6 */
        /* JADX WARN: Type inference failed for: r0v7 */
        public int hashCode() {
            boolean z = this.enabled;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            return (((r0 * 31) + this.limit) * 31) + this.timeout;
        }

        public String toString() {
            return "Session(enabled=" + this.enabled + ", limit=" + this.limit + ", timeout=" + this.timeout + ')';
        }

        /* compiled from: ConfigPayload.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/model/ConfigPayload$Session$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/model/ConfigPayload$Session;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<Session> serializer() {
                return ConfigPayload$Session$$serializer.INSTANCE;
            }
        }

        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public /* synthetic */ Session(int i, @SerialName(m4.r) boolean z, @SerialName("limit") int i2, @SerialName("timeout") int i3, SerializationConstructorMarker serializationConstructorMarker) {
            if (7 != (i & 7)) {
                PluginExceptionsKt.throwMissingFieldException(i, 7, ConfigPayload$Session$$serializer.INSTANCE.getDescriptor());
            }
            this.enabled = z;
            this.limit = i2;
            this.timeout = i3;
        }

        public Session(boolean z, int i, int i2) {
            this.enabled = z;
            this.limit = i;
            this.timeout = i2;
        }

        @JvmStatic
        public static final void write$Self(Session self, CompositeEncoder output, SerialDescriptor serialDesc) {
            Intrinsics.checkNotNullParameter(self, "self");
            Intrinsics.checkNotNullParameter(output, "output");
            Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
            output.encodeBooleanElement(serialDesc, 0, self.enabled);
            output.encodeIntElement(serialDesc, 1, self.limit);
            output.encodeIntElement(serialDesc, 2, self.timeout);
        }

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final int getLimit() {
            return this.limit;
        }

        public final int getTimeout() {
            return this.timeout;
        }
    }
}
