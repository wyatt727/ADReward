package com.mbridge.msdk.playercommon.exoplayer2.upstream.cache;

import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class ContentMetadataMutations {
    private final Map<String, Object> editedValues = new HashMap();
    private final List<String> removedValues = new ArrayList();

    public ContentMetadataMutations set(String str, String str2) {
        return checkAndSet(str, str2);
    }

    public ContentMetadataMutations set(String str, long j) {
        return checkAndSet(str, Long.valueOf(j));
    }

    public ContentMetadataMutations set(String str, byte[] bArr) {
        return checkAndSet(str, Arrays.copyOf(bArr, bArr.length));
    }

    public ContentMetadataMutations remove(String str) {
        this.removedValues.add(str);
        this.editedValues.remove(str);
        return this;
    }

    public List<String> getRemovedValues() {
        return Collections.unmodifiableList(new ArrayList(this.removedValues));
    }

    public Map<String, Object> getEditedValues() {
        HashMap map = new HashMap(this.editedValues);
        for (Map.Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                entry.setValue(Arrays.copyOf(bArr, bArr.length));
            }
        }
        return Collections.unmodifiableMap(map);
    }

    private ContentMetadataMutations checkAndSet(String str, Object obj) {
        this.editedValues.put((String) Assertions.checkNotNull(str), Assertions.checkNotNull(obj));
        this.removedValues.remove(str);
        return this;
    }
}
