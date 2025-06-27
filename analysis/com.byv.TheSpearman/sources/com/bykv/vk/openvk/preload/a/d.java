package com.bykv.vk.openvk.preload.a;

import java.lang.reflect.Field;
import java.util.Locale;

/* compiled from: FieldNamingPolicy.java */
/* loaded from: classes.dex */
public enum d implements e {
    IDENTITY { // from class: com.bykv.vk.openvk.preload.a.d.1
        @Override // com.bykv.vk.openvk.preload.a.e
        public final String a(Field field) {
            return field.getName();
        }
    },
    UPPER_CAMEL_CASE { // from class: com.bykv.vk.openvk.preload.a.d.2
        @Override // com.bykv.vk.openvk.preload.a.e
        public final String a(Field field) {
            return a(field.getName());
        }
    },
    UPPER_CAMEL_CASE_WITH_SPACES { // from class: com.bykv.vk.openvk.preload.a.d.3
        @Override // com.bykv.vk.openvk.preload.a.e
        public final String a(Field field) {
            return a(a(field.getName(), " "));
        }
    },
    LOWER_CASE_WITH_UNDERSCORES { // from class: com.bykv.vk.openvk.preload.a.d.4
        @Override // com.bykv.vk.openvk.preload.a.e
        public final String a(Field field) {
            return a(field.getName(), "_").toLowerCase(Locale.ENGLISH);
        }
    },
    LOWER_CASE_WITH_DASHES { // from class: com.bykv.vk.openvk.preload.a.d.5
        @Override // com.bykv.vk.openvk.preload.a.e
        public final String a(Field field) {
            return a(field.getName(), "-").toLowerCase(Locale.ENGLISH);
        }
    },
    LOWER_CASE_WITH_DOTS { // from class: com.bykv.vk.openvk.preload.a.d.6
        @Override // com.bykv.vk.openvk.preload.a.e
        public final String a(Field field) {
            return a(field.getName(), ".").toLowerCase(Locale.ENGLISH);
        }
    };

    /* synthetic */ d(byte b) {
        this();
    }

    static String a(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (Character.isUpperCase(cCharAt) && sb.length() != 0) {
                sb.append(str2);
            }
            sb.append(cCharAt);
        }
        return sb.toString();
    }

    static String a(String str) {
        int length = str.length() - 1;
        int i = 0;
        while (!Character.isLetter(str.charAt(i)) && i < length) {
            i++;
        }
        char cCharAt = str.charAt(i);
        if (Character.isUpperCase(cCharAt)) {
            return str;
        }
        char upperCase = Character.toUpperCase(cCharAt);
        if (i == 0) {
            return upperCase + str.substring(1);
        }
        return str.substring(0, i) + upperCase + str.substring(i + 1);
    }
}
