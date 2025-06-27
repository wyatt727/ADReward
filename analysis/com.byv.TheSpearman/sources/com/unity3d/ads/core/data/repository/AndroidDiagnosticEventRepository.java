package com.unity3d.ads.core.data.repository;

import com.json.m4;
import com.unity3d.services.core.log.DeviceLog;
import gateway.v1.DiagnosticEventRequestOuterClass;
import gateway.v1.NativeConfigurationOuterClass;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlowKt;
import org.koin.core.annotation.Single;

/* compiled from: AndroidDiagnosticEventRepository.kt */
@Single
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0006H\u0016J\b\u0010\u001c\u001a\u00020\u001aH\u0016J\u0010\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u001aH\u0016R\u001a\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/unity3d/ads/core/data/repository/AndroidDiagnosticEventRepository;", "Lcom/unity3d/ads/core/data/repository/DiagnosticEventRepository;", "()V", "_diagnosticEvents", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "", "Lgateway/v1/DiagnosticEventRequestOuterClass$DiagnosticEvent;", "allowedEvents", "", "Lgateway/v1/DiagnosticEventRequestOuterClass$DiagnosticEventType;", "batch", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "blockedEvents", "configured", "", "diagnosticEvents", "Lkotlinx/coroutines/flow/SharedFlow;", "getDiagnosticEvents", "()Lkotlinx/coroutines/flow/SharedFlow;", m4.r, "flushTimer", "Ljava/util/Timer;", "maxBatchSize", "", "addDiagnosticEvent", "", "diagnosticEvent", "clear", "configure", "diagnosticsEventsConfiguration", "Lgateway/v1/NativeConfigurationOuterClass$DiagnosticEventsConfiguration;", "flush", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AndroidDiagnosticEventRepository implements DiagnosticEventRepository {
    private final MutableSharedFlow<List<DiagnosticEventRequestOuterClass.DiagnosticEvent>> _diagnosticEvents;
    private final SharedFlow<List<DiagnosticEventRequestOuterClass.DiagnosticEvent>> diagnosticEvents;
    private final MutableStateFlow<List<DiagnosticEventRequestOuterClass.DiagnosticEvent>> batch = StateFlowKt.MutableStateFlow(new ArrayList());
    private final Timer flushTimer = new Timer();
    private int maxBatchSize = Integer.MAX_VALUE;
    private final Set<DiagnosticEventRequestOuterClass.DiagnosticEventType> allowedEvents = new LinkedHashSet();
    private final Set<DiagnosticEventRequestOuterClass.DiagnosticEventType> blockedEvents = new LinkedHashSet();
    private final MutableStateFlow<Boolean> enabled = StateFlowKt.MutableStateFlow(false);
    private final MutableStateFlow<Boolean> configured = StateFlowKt.MutableStateFlow(false);

    public AndroidDiagnosticEventRepository() {
        MutableSharedFlow<List<DiagnosticEventRequestOuterClass.DiagnosticEvent>> MutableSharedFlow = SharedFlowKt.MutableSharedFlow(10, 10, BufferOverflow.DROP_OLDEST);
        this._diagnosticEvents = MutableSharedFlow;
        this.diagnosticEvents = FlowKt.asSharedFlow(MutableSharedFlow);
    }

    @Override // com.unity3d.ads.core.data.repository.DiagnosticEventRepository
    public SharedFlow<List<DiagnosticEventRequestOuterClass.DiagnosticEvent>> getDiagnosticEvents() {
        return this.diagnosticEvents;
    }

    @Override // com.unity3d.ads.core.data.repository.DiagnosticEventRepository
    public void addDiagnosticEvent(DiagnosticEventRequestOuterClass.DiagnosticEvent diagnosticEvent) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(diagnosticEvent, "diagnosticEvent");
        if (!this.configured.getValue().booleanValue()) {
            this.batch.getValue().add(diagnosticEvent);
        } else if (this.enabled.getValue().booleanValue()) {
            this.batch.getValue().add(diagnosticEvent);
            if (this.batch.getValue().size() >= this.maxBatchSize) {
                flush();
            }
        }
    }

    @Override // com.unity3d.ads.core.data.repository.DiagnosticEventRepository
    public void flush() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        List<DiagnosticEventRequestOuterClass.DiagnosticEvent> value;
        MutableStateFlow<List<DiagnosticEventRequestOuterClass.DiagnosticEvent>> mutableStateFlow = this.batch;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, new ArrayList()));
        List<DiagnosticEventRequestOuterClass.DiagnosticEvent> list = SequencesKt.toList(SequencesKt.filter(SequencesKt.filter(CollectionsKt.asSequence(value), new Function1<DiagnosticEventRequestOuterClass.DiagnosticEvent, Boolean>() { // from class: com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository$flush$events$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(DiagnosticEventRequestOuterClass.DiagnosticEvent it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(this.this$0.allowedEvents.isEmpty() || this.this$0.allowedEvents.contains(it.getEventType()));
            }
        }), new Function1<DiagnosticEventRequestOuterClass.DiagnosticEvent, Boolean>() { // from class: com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository$flush$events$3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(DiagnosticEventRequestOuterClass.DiagnosticEvent it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(!this.this$0.blockedEvents.contains(it.getEventType()));
            }
        }));
        clear();
        if (!list.isEmpty()) {
            DeviceLog.debug("Unity Ads Sending diagnostic batch enabled: " + this.enabled.getValue().booleanValue() + " size: " + list.size() + " :: " + list);
            this._diagnosticEvents.tryEmit(list);
        }
    }

    @Override // com.unity3d.ads.core.data.repository.DiagnosticEventRepository
    public void clear() {
        MutableStateFlow<List<DiagnosticEventRequestOuterClass.DiagnosticEvent>> mutableStateFlow = this.batch;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), new ArrayList())) {
        }
    }

    @Override // com.unity3d.ads.core.data.repository.DiagnosticEventRepository
    public void configure(NativeConfigurationOuterClass.DiagnosticEventsConfiguration diagnosticsEventsConfiguration) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(diagnosticsEventsConfiguration, "diagnosticsEventsConfiguration");
        this.configured.setValue(true);
        this.enabled.setValue(Boolean.valueOf(diagnosticsEventsConfiguration.getEnabled()));
        if (!this.enabled.getValue().booleanValue()) {
            clear();
            return;
        }
        this.maxBatchSize = diagnosticsEventsConfiguration.getMaxBatchSize();
        Set<DiagnosticEventRequestOuterClass.DiagnosticEventType> set = this.allowedEvents;
        List<DiagnosticEventRequestOuterClass.DiagnosticEventType> allowedEventsList = diagnosticsEventsConfiguration.getAllowedEventsList();
        Intrinsics.checkNotNullExpressionValue(allowedEventsList, "diagnosticsEventsConfiguration.allowedEventsList");
        set.addAll(allowedEventsList);
        Set<DiagnosticEventRequestOuterClass.DiagnosticEventType> set2 = this.blockedEvents;
        List<DiagnosticEventRequestOuterClass.DiagnosticEventType> blockedEventsList = diagnosticsEventsConfiguration.getBlockedEventsList();
        Intrinsics.checkNotNullExpressionValue(blockedEventsList, "diagnosticsEventsConfiguration.blockedEventsList");
        set2.addAll(blockedEventsList);
        long maxBatchIntervalMs = diagnosticsEventsConfiguration.getMaxBatchIntervalMs();
        this.flushTimer.scheduleAtFixedRate(new TimerTask() { // from class: com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository$configure$$inlined$timerTask$1
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
                this.this$0.flush();
            }
        }, maxBatchIntervalMs, maxBatchIntervalMs);
        flush();
    }
}
