package com.json;

import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.json.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener;
import com.json.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\u0005\u000bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00028\u0000H&¢\u0006\u0004\b\u0005\u0010\tJ\u0017\u0010\u0005\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\u0005\u0010\n¨\u0006\f"}, d2 = {"Lcom/ironsource/s6;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "a", "(Ljava/lang/Object;)V", "", "instanceId", "(Ljava/lang/String;Ljava/lang/Object;)V", "(Ljava/lang/String;)Ljava/lang/Object;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public interface s6<T> {

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0016\u0010\n\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\tR \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/ironsource/s6$a;", "Lcom/ironsource/s6;", "Lcom/ironsource/mediationsdk/demandOnly/ISDemandOnlyInterstitialListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "a", "", "instanceId", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lcom/ironsource/mediationsdk/demandOnly/ISDemandOnlyInterstitialListener;", "defaultListener", "", "Lcom/ironsource/r6;", "Ljava/util/Map;", "listenerWrappers", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class a implements s6<ISDemandOnlyInterstitialListener> {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private ISDemandOnlyInterstitialListener defaultListener = new r6();

        /* renamed from: b, reason: from kotlin metadata */
        private final Map<String, r6> listenerWrappers = new HashMap();

        @Override // com.json.s6
        public void a(ISDemandOnlyInterstitialListener listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.defaultListener = new r6(listener);
            for (String str : this.listenerWrappers.keySet()) {
                Map<String, r6> map = this.listenerWrappers;
                ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener = this.defaultListener;
                Intrinsics.checkNotNull(iSDemandOnlyInterstitialListener, "null cannot be cast to non-null type com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListenerWrapper");
                map.put(str, (r6) iSDemandOnlyInterstitialListener);
            }
        }

        @Override // com.json.s6
        public void a(String instanceId, ISDemandOnlyInterstitialListener listener) {
            Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.listenerWrappers.put(instanceId, new r6(listener));
        }

        @Override // com.json.s6
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ISDemandOnlyInterstitialListener a(String instanceId) {
            Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            r6 r6Var = this.listenerWrappers.get(instanceId);
            return r6Var != null ? r6Var : this.defaultListener;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0016\u0010\n\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\tR \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/ironsource/s6$b;", "Lcom/ironsource/s6;", "Lcom/ironsource/mediationsdk/demandOnly/ISDemandOnlyRewardedVideoListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "a", "", "instanceId", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lcom/ironsource/mediationsdk/demandOnly/ISDemandOnlyRewardedVideoListener;", "defaultListener", "", "Lcom/ironsource/t6;", "Ljava/util/Map;", "listenerWrappers", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class b implements s6<ISDemandOnlyRewardedVideoListener> {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private ISDemandOnlyRewardedVideoListener defaultListener = new t6();

        /* renamed from: b, reason: from kotlin metadata */
        private final Map<String, t6> listenerWrappers = new HashMap();

        @Override // com.json.s6
        public void a(ISDemandOnlyRewardedVideoListener listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.defaultListener = new t6(listener);
            for (String str : this.listenerWrappers.keySet()) {
                Map<String, t6> map = this.listenerWrappers;
                ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener = this.defaultListener;
                Intrinsics.checkNotNull(iSDemandOnlyRewardedVideoListener, "null cannot be cast to non-null type com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListenerWrapper");
                map.put(str, (t6) iSDemandOnlyRewardedVideoListener);
            }
        }

        @Override // com.json.s6
        public void a(String instanceId, ISDemandOnlyRewardedVideoListener listener) {
            Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.listenerWrappers.put(instanceId, new t6(listener));
        }

        @Override // com.json.s6
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ISDemandOnlyRewardedVideoListener a(String instanceId) {
            Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            t6 t6Var = this.listenerWrappers.get(instanceId);
            return t6Var != null ? t6Var : this.defaultListener;
        }
    }

    T a(String instanceId);

    void a(T listener);

    void a(String instanceId, T listener);
}
