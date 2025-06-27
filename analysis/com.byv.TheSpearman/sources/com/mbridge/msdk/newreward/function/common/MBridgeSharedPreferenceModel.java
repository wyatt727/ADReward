package com.mbridge.msdk.newreward.function.common;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.same.b.c;
import com.mbridge.msdk.foundation.same.b.e;
import com.mbridge.msdk.foundation.tools.FastKV;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: classes4.dex */
public final class MBridgeSharedPreferenceModel {
    private static final String DEFAULT_NAME = "mbridge_new_config";
    private volatile FastKV mFastKV;
    private Object mLock = new Object();
    private String mName;
    private static ConcurrentHashMap<String, String> mStringCache = new ConcurrentHashMap<>();
    private static ConcurrentHashMap<String, Integer> mIntegerCache = new ConcurrentHashMap<>();
    private static ConcurrentHashMap<String, Long> mLongCache = new ConcurrentHashMap<>();
    private static Map<String, MBridgeSharedPreferenceModel> mInstanceMap = new HashMap();
    private static String mPath = e.a(c.MBRIDGE_700_CONFIG) + File.separator;
    private static Executor mExecutor = Executors.newSingleThreadExecutor();

    public final void init() {
    }

    private MBridgeSharedPreferenceModel(String str) {
        this.mName = str;
        mExecutor.execute(new Runnable() { // from class: com.mbridge.msdk.newreward.function.common.MBridgeSharedPreferenceModel.1
            @Override // java.lang.Runnable
            public void run() {
                MBridgeSharedPreferenceModel.this.initFastKV();
            }
        });
    }

    public static MBridgeSharedPreferenceModel getInstance() {
        return getInstance("");
    }

    public static MBridgeSharedPreferenceModel getInstance(String str) {
        MBridgeSharedPreferenceModel mBridgeSharedPreferenceModel;
        synchronized (mInstanceMap) {
            if (TextUtils.isEmpty(str)) {
                str = DEFAULT_NAME;
            }
            mBridgeSharedPreferenceModel = mInstanceMap.get(str);
            if (mBridgeSharedPreferenceModel == null) {
                mBridgeSharedPreferenceModel = new MBridgeSharedPreferenceModel(str);
                mInstanceMap.put(str, mBridgeSharedPreferenceModel);
            }
        }
        return mBridgeSharedPreferenceModel;
    }

    public final void putString(String str, String str2) {
        if (TextUtils.isEmpty(str) || str2 == null) {
            return;
        }
        if (mStringCache.containsKey(str)) {
            if (TextUtils.equals(mStringCache.get(str), str2)) {
                return;
            }
            putStringValue(str, str2);
            return;
        }
        putStringValue(str, str2);
    }

    public final String getString(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        if (mStringCache.containsKey(str)) {
            return mStringCache.get(str);
        }
        return getStringValue(str, str2);
    }

    public final void putLong(String str, long j) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (mLongCache.containsKey(str)) {
            Long l = mLongCache.get(str);
            if (l == null || l.longValue() != j) {
                putLongValue(str, j);
                return;
            }
            return;
        }
        putLongValue(str, j);
    }

    public final long getLong(String str, long j) {
        Long l;
        if (TextUtils.isEmpty(str)) {
            return j;
        }
        if (mLongCache.containsKey(str) && (l = mLongCache.get(str)) != null) {
            return l.longValue();
        }
        return getLongValue(str, j);
    }

    private long getLongValue(String str, long j) {
        if (this.mFastKV == null) {
            initFastKV();
        }
        try {
            long j2 = this.mFastKV.getLong(str, j);
            mLongCache.put(str, Long.valueOf(j2));
            return j2;
        } catch (Exception unused) {
            return j;
        }
    }

    private void putLongValue(String str, long j) {
        try {
            mLongCache.put(str, Long.valueOf(j));
        } catch (Exception unused) {
        }
        try {
            this.mFastKV.putLong(str, j);
        } catch (Exception unused2) {
        }
    }

    public final void putInteger(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (mIntegerCache.containsKey(str)) {
            Integer num = mIntegerCache.get(str);
            if (num == null || num.intValue() != i) {
                putIntegerValue(str, i);
                return;
            }
            return;
        }
        putIntegerValue(str, i);
    }

    public final int getInteger(String str, int i) {
        Integer num;
        if (TextUtils.isEmpty(str)) {
            return i;
        }
        if (mIntegerCache.containsKey(str) && (num = mIntegerCache.get(str)) != null) {
            return num.intValue();
        }
        return getIntegerValue(str, i);
    }

    private int getIntegerValue(String str, int i) {
        if (this.mFastKV == null) {
            initFastKV();
        }
        try {
            int i2 = this.mFastKV.getInt(str, i);
            mIntegerCache.put(str, Integer.valueOf(i2));
            return i2;
        } catch (Exception unused) {
            return i;
        }
    }

    private void putIntegerValue(String str, int i) {
        try {
            mIntegerCache.put(str, Integer.valueOf(i));
        } catch (Exception unused) {
        }
        try {
            this.mFastKV.putInt(str, i);
        } catch (Exception unused2) {
        }
    }

    private String getStringValue(String str, String str2) {
        if (this.mFastKV == null) {
            initFastKV();
        }
        String string = this.mFastKV.getString(str, str2);
        if (string != null) {
            mStringCache.put(str, string);
        }
        return string;
    }

    private void putStringValue(final String str, final String str2) {
        try {
            mStringCache.put(str, str2);
        } catch (Exception unused) {
        }
        mExecutor.execute(new Runnable() { // from class: com.mbridge.msdk.newreward.function.common.MBridgeSharedPreferenceModel.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    MBridgeSharedPreferenceModel.this.initFastKV();
                    MBridgeSharedPreferenceModel.this.mFastKV.putString(str, str2);
                } catch (Exception unused2) {
                }
            }
        });
    }

    public final void clear() {
        mStringCache.clear();
        mIntegerCache.clear();
        mLongCache.clear();
        if (this.mFastKV != null) {
            this.mFastKV.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initFastKV() {
        synchronized (this.mLock) {
            if (this.mFastKV == null) {
                try {
                    this.mFastKV = new FastKV.Builder(mPath, this.mName).build();
                } catch (Exception unused) {
                }
            }
        }
    }
}
