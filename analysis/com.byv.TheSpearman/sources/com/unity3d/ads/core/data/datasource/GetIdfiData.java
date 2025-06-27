package com.unity3d.ads.core.data.datasource;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GetIdfiData.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\t\u0010\u0004\u001a\u00020\u0005H\u0096\u0002J\u0011\u0010\u0004\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0005H\u0096\u0002¨\u0006\b"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/GetIdfiData;", "Lcom/unity3d/ads/core/data/datasource/GetByteStringData;", "Lcom/unity3d/ads/core/data/datasource/GetPreferenceString;", "()V", "invoke", "", "Lcom/google/protobuf/ByteString;", "data", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class GetIdfiData implements GetByteStringData, GetPreferenceString {
    @Override // com.unity3d.ads.core.data.datasource.GetByteStringData
    public ByteString invoke(String data) {
        Intrinsics.checkNotNullParameter(data, "data");
        UUID uuidFromString = UUID.fromString(data);
        Intrinsics.checkNotNullExpressionValue(uuidFromString, "fromString(data)");
        return ProtobufExtensionsKt.toByteString(uuidFromString);
    }

    @Override // com.unity3d.ads.core.data.datasource.GetPreferenceString
    public String invoke() {
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString()");
        return string;
    }
}
