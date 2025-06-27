package com.my.tracker;

import android.text.TextUtils;
import com.my.tracker.obfuscated.s0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes4.dex */
public final class MyTrackerParams {
    final Map<String, String> customParams = new ConcurrentHashMap();
    volatile int age = -1;
    volatile int gender = -1;
    volatile String lang = null;
    volatile String mrgsAppId = null;
    volatile String mrgsUserId = null;
    volatile String mrgsDeviceId = null;
    volatile String[] emails = null;
    volatile String[] okIds = null;
    volatile String[] vkIds = null;
    volatile String[] vkConnectIds = null;
    volatile String[] icqIds = null;
    volatile String[] customUserIds = null;
    volatile String[] phones = null;

    @Retention(RetentionPolicy.SOURCE)
    public @interface Gender {
        public static final int FEMALE = 2;
        public static final int MALE = 1;
        public static final int UNKNOWN = 0;
        public static final int UNSPECIFIED = -1;
    }

    private static String[] createArray(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return new String[]{str};
    }

    private static String[] createArray(String[] strArr) {
        if (strArr == null) {
            return null;
        }
        return (String[]) strArr.clone();
    }

    private static String getFirstItem(String[] strArr) {
        if (strArr == null || strArr.length <= 0) {
            return null;
        }
        return strArr[0];
    }

    public int getAge() {
        return this.age;
    }

    public String getCustomParam(String str) {
        return this.customParams.get(str.toLowerCase(Locale.ROOT));
    }

    public String getCustomUserId() {
        return getFirstItem(this.customUserIds);
    }

    public String[] getCustomUserIds() {
        return this.customUserIds;
    }

    public String getEmail() {
        return getFirstItem(this.emails);
    }

    public String[] getEmails() {
        return this.emails;
    }

    public int getGender() {
        return this.gender;
    }

    public String getIcqId() {
        return getFirstItem(this.icqIds);
    }

    public String[] getIcqIds() {
        return this.icqIds;
    }

    public String getLang() {
        return this.lang;
    }

    public String getMrgsAppId() {
        return this.mrgsAppId;
    }

    public String getMrgsId() {
        return this.mrgsDeviceId;
    }

    public String getMrgsUserId() {
        return this.mrgsUserId;
    }

    public String getOkId() {
        return getFirstItem(this.okIds);
    }

    public String[] getOkIds() {
        return this.okIds;
    }

    public String getPhone() {
        return getFirstItem(this.phones);
    }

    public String[] getPhones() {
        return this.phones;
    }

    public String getVkConnectId() {
        return getFirstItem(this.vkConnectIds);
    }

    public String[] getVkConnectIds() {
        return this.vkConnectIds;
    }

    public String getVkId() {
        return getFirstItem(this.vkIds);
    }

    public String[] getVkIds() {
        return this.vkIds;
    }

    public void putDataToBuilder(s0 s0Var) {
        String str = this.mrgsAppId;
        if (str != null) {
            s0Var.m(str);
        }
        String str2 = this.mrgsUserId;
        if (str2 != null) {
            s0Var.o(str2);
        }
        String str3 = this.mrgsDeviceId;
        if (str3 != null) {
            s0Var.n(str3);
        }
        String[] strArr = this.emails;
        if (strArr != null && strArr.length > 0) {
            s0Var.b(strArr);
        }
        String[] strArr2 = this.okIds;
        if (strArr2 != null && strArr2.length > 0) {
            s0Var.d(strArr2);
        }
        String[] strArr3 = this.vkIds;
        if (strArr3 != null && strArr3.length > 0) {
            s0Var.g(strArr3);
        }
        String[] strArr4 = this.vkConnectIds;
        if (strArr4 != null && strArr4.length > 0) {
            s0Var.f(strArr4);
        }
        String[] strArr5 = this.phones;
        if (strArr5 != null && strArr5.length > 0) {
            s0Var.e(strArr5);
        }
        String[] strArr6 = this.icqIds;
        if (strArr6 != null && strArr6.length > 0) {
            s0Var.c(strArr6);
        }
        String[] strArr7 = this.customUserIds;
        if (strArr7 != null && strArr7.length > 0) {
            s0Var.a(strArr7);
        }
        String str4 = this.lang;
        if (str4 != null) {
            s0Var.p(str4);
        }
        int i = this.age;
        if (i >= 0) {
            s0Var.d(i);
        }
        int i2 = this.gender;
        if (i2 == 0 || i2 == 1 || i2 == 2) {
            s0Var.j(i2);
        }
        if (this.customParams.isEmpty()) {
            return;
        }
        s0Var.a(new HashMap(this.customParams));
    }

    public MyTrackerParams setAge(int i) {
        this.age = i;
        return this;
    }

    public MyTrackerParams setCustomParam(String str, String str2) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        if (str2 == null) {
            this.customParams.remove(lowerCase);
        } else {
            this.customParams.put(lowerCase, str2);
        }
        return this;
    }

    public MyTrackerParams setCustomUserId(String str) {
        this.customUserIds = createArray(str);
        return this;
    }

    public MyTrackerParams setCustomUserIds(String[] strArr) {
        this.customUserIds = createArray(strArr);
        return this;
    }

    public MyTrackerParams setEmail(String str) {
        this.emails = createArray(str);
        return this;
    }

    public MyTrackerParams setEmails(String[] strArr) {
        this.emails = createArray(strArr);
        return this;
    }

    public MyTrackerParams setGender(int i) {
        this.gender = i;
        return this;
    }

    public MyTrackerParams setIcqId(String str) {
        this.icqIds = createArray(str);
        return this;
    }

    public MyTrackerParams setIcqIds(String[] strArr) {
        this.icqIds = createArray(strArr);
        return this;
    }

    public MyTrackerParams setLang(String str) {
        this.lang = str;
        return this;
    }

    public MyTrackerParams setMrgsAppId(String str) {
        this.mrgsAppId = str;
        return this;
    }

    public MyTrackerParams setMrgsId(String str) {
        this.mrgsDeviceId = str;
        return this;
    }

    public MyTrackerParams setMrgsUserId(String str) {
        this.mrgsUserId = str;
        return this;
    }

    public MyTrackerParams setOkId(String str) {
        this.okIds = createArray(str);
        return this;
    }

    public MyTrackerParams setOkIds(String[] strArr) {
        this.okIds = createArray(strArr);
        return this;
    }

    public MyTrackerParams setPhone(String str) {
        this.phones = createArray(str);
        return this;
    }

    public MyTrackerParams setPhones(String[] strArr) {
        this.phones = createArray(strArr);
        return this;
    }

    public MyTrackerParams setVkConnectId(String str) {
        this.vkConnectIds = createArray(str);
        return this;
    }

    public MyTrackerParams setVkConnectIds(String[] strArr) {
        this.vkConnectIds = createArray(strArr);
        return this;
    }

    public MyTrackerParams setVkId(String str) {
        this.vkIds = createArray(str);
        return this;
    }

    public MyTrackerParams setVkIds(String[] strArr) {
        this.vkIds = createArray(strArr);
        return this;
    }
}
