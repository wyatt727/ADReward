package com.unity3d.ads.core.data.datasource;

import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge;
import com.unity3d.services.core.misc.JsonStorage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.koin.core.annotation.Named;
import org.koin.core.annotation.Single;

/* compiled from: AndroidMediationDataSource.kt */
@Single
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\b¨\u0006\f"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/AndroidMediationDataSource;", "Lcom/unity3d/ads/core/data/datasource/MediationDataSource;", "publicStorage", "Lcom/unity3d/services/core/misc/JsonStorage;", "(Lcom/unity3d/services/core/misc/JsonStorage;)V", "name", "", "getName", "()Ljava/lang/String;", "version", MobileAdsBridge.versionMethodName, "Companion", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AndroidMediationDataSource implements MediationDataSource {
    private static final String MEDIATION_NAME = "name";
    public static final String MEDIATION_NAME_KEY = "mediation.name.value";
    private static final String MEDIATION_STORAGE_NAME = "mediation";
    private static final String MEDIATION_VALUE = "value";
    private static final String MEDIATION_VERSION = "version";
    public static final String MEDIATION_VERSION_KEY = "mediation.version.value";
    private final JsonStorage publicStorage;

    public AndroidMediationDataSource(@Named("PUBLIC") JsonStorage publicStorage) {
        Intrinsics.checkNotNullParameter(publicStorage, "publicStorage");
        this.publicStorage = publicStorage;
    }

    @Override // com.unity3d.ads.core.data.datasource.MediationDataSource
    public String getName() {
        return (String) this.publicStorage.get(MEDIATION_NAME_KEY);
    }

    @Override // com.unity3d.ads.core.data.datasource.MediationDataSource
    public String getVersion() {
        return (String) this.publicStorage.get(MEDIATION_VERSION_KEY);
    }
}
