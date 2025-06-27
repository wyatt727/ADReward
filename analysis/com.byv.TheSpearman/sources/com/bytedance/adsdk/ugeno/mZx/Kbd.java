package com.bytedance.adsdk.ugeno.mZx;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.widget.CompoundButton;
import java.lang.reflect.Field;

/* compiled from: UGCompoundButtonCompat.java */
/* loaded from: classes2.dex */
public class Kbd {
    private static Field EYQ;
    private static boolean mZx;

    public static Drawable EYQ(CompoundButton compoundButton) throws NoSuchFieldException {
        if (Build.VERSION.SDK_INT >= 23) {
            return compoundButton.getButtonDrawable();
        }
        if (!mZx) {
            try {
                Field declaredField = CompoundButton.class.getDeclaredField("mButtonDrawable");
                EYQ = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.i("CompoundButtonCompat", "Failed to retrieve mButtonDrawable field", e);
            }
            mZx = true;
        }
        Field field = EYQ;
        if (field != null) {
            try {
                return (Drawable) field.get(compoundButton);
            } catch (IllegalAccessException e2) {
                Log.i("CompoundButtonCompat", "Failed to get button drawable via reflection", e2);
                EYQ = null;
            }
        }
        return null;
    }
}
