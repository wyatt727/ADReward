package com.my.target;

import android.content.Context;
import android.graphics.Point;
import com.my.target.common.MyTargetConfig;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class sa extends p1 {
    public Map<String, String> a(MyTargetConfig myTargetConfig, Context context) {
        HashMap map = new HashMap();
        Point pointB = ca.b(context);
        int i = pointB.x;
        int i2 = pointB.y;
        if (i != 0 && i2 != 0) {
            map.put("vpw", String.valueOf(i));
            map.put("vph", String.valueOf(i2));
        }
        return map;
    }
}
