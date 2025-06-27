package com.my.target;

import android.content.Context;
import android.text.TextUtils;
import com.my.target.common.MyTargetConfig;
import com.my.tracker.MyTracker;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class b6 extends p1 {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final String f3928a;

        static {
            String id;
            try {
                id = MyTracker.getTrackerConfig().getId();
            } catch (Throwable th) {
                ba.a("MyTrackerHelper: Error occurred while working with myTracker, " + th.getMessage());
            }
            if (TextUtils.isEmpty(id)) {
                ba.a("MyTrackerHelper: myTracker id is empty");
                id = null;
            }
            f3928a = id;
        }
    }

    public Map<String, String> a(MyTargetConfig myTargetConfig, Context context) {
        HashMap map = new HashMap();
        String str = a.f3928a;
        if (str != null) {
            map.put("mtr_id", str);
        }
        return map;
    }
}
