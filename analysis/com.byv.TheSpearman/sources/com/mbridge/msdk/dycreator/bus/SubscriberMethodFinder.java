package com.mbridge.msdk.dycreator.bus;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.text.Typography;

/* loaded from: classes4.dex */
class SubscriberMethodFinder {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<String, List<SubscriberMethod>> f2666a = new HashMap();
    private static final Map<Class<?>, Class<?>> b = new ConcurrentHashMap();

    SubscriberMethodFinder() {
    }

    final List<SubscriberMethod> a(Class<?> cls, String str) throws SecurityException {
        List<SubscriberMethod> list;
        ThreadMode threadMode;
        String str2 = cls.getName() + '.' + str;
        Map<String, List<SubscriberMethod>> map = f2666a;
        synchronized (map) {
            list = map.get(str2);
        }
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder();
        for (Class<?> superclass = cls; superclass != null; superclass = superclass.getSuperclass()) {
            String name = superclass.getName();
            if (name.startsWith("java.") || name.startsWith("javax.") || name.startsWith("android.")) {
                break;
            }
            for (Method method : superclass.getDeclaredMethods()) {
                String name2 = method.getName();
                if (name2.startsWith(str)) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    if (parameterTypes.length == 1) {
                        String strSubstring = name2.substring(str.length());
                        if (strSubstring.length() == 0) {
                            threadMode = ThreadMode.PostThread;
                        } else if (strSubstring.equals("MainThread")) {
                            threadMode = ThreadMode.MainThread;
                        } else if (strSubstring.equals("BackgroundThread")) {
                            threadMode = ThreadMode.BackgroundThread;
                        } else if (!strSubstring.equals("Async")) {
                            if (!b.containsKey(superclass)) {
                                throw new EventBusException("Illegal onEvent method, check for typos: " + method);
                            }
                        } else {
                            threadMode = ThreadMode.Async;
                        }
                        Class<?> cls2 = parameterTypes[0];
                        sb.setLength(0);
                        sb.append(name2);
                        sb.append(Typography.greater);
                        sb.append(cls2.getName());
                        if (hashSet.add(sb.toString())) {
                            arrayList.add(new SubscriberMethod(method, threadMode, cls2));
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            throw new EventBusException("Subscriber " + cls + " has no methods called " + str);
        }
        Map<String, List<SubscriberMethod>> map2 = f2666a;
        synchronized (map2) {
            map2.put(str2, arrayList);
        }
        return arrayList;
    }

    static void a() {
        f2666a.clear();
    }

    static void a(Class<?> cls) {
        if (!f2666a.isEmpty()) {
            throw new IllegalStateException("This method must be called before registering anything");
        }
        b.put(cls, cls);
    }

    public static void clearSkipMethodNameVerifications() {
        b.clear();
    }
}
