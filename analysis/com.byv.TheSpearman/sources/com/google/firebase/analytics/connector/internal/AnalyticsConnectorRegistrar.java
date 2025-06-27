package com.google.firebase.analytics.connector.internal;

import android.content.Context;
import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.analytics.connector.AnalyticsConnectorImpl;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.events.Subscriber;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import com.google.firebase.remoteconfig.BuildConfig;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-api@@22.0.0 */
/* loaded from: classes2.dex */
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<Component<?>> getComponents() {
        return Arrays.asList(Component.builder(AnalyticsConnector.class).add(Dependency.required((Class<?>) FirebaseApp.class)).add(Dependency.required((Class<?>) Context.class)).add(Dependency.required((Class<?>) Subscriber.class)).factory(new ComponentFactory() { // from class: com.google.firebase.analytics.connector.internal.zzc
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return AnalyticsConnectorImpl.getInstance((FirebaseApp) componentContainer.get(FirebaseApp.class), (Context) componentContainer.get(Context.class), (Subscriber) componentContainer.get(Subscriber.class));
            }
        }).eagerInDefaultApp().build(), LibraryVersionComponent.create("fire-analytics", BuildConfig.VERSION_NAME));
    }
}
