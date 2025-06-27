package com.mbridge.msdk.dycreator.bus;

import android.os.Looper;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes4.dex */
public final class EventBus {
    private static volatile EventBus b;
    private boolean n;

    /* renamed from: a, reason: collision with root package name */
    static ExecutorService f2657a = Executors.newCachedThreadPool();
    public static String TAG = "Event";
    private static final Map<Class<?>, List<Class<?>>> c = new HashMap();
    private final Map<Class<?>, CopyOnWriteArrayList<Subscription>> d = new HashMap();
    private final Map<Object, List<Class<?>>> e = new HashMap();
    private final Map<Class<?>, Object> f = new ConcurrentHashMap();
    private final ThreadLocal<List<Object>> g = new ThreadLocal<List<Object>>() { // from class: com.mbridge.msdk.dycreator.bus.EventBus.1
        @Override // java.lang.ThreadLocal
        protected /* synthetic */ List<Object> initialValue() {
            return new ArrayList();
        }
    };
    private final ThreadLocal<BooleanWrapper> h = new ThreadLocal<BooleanWrapper>() { // from class: com.mbridge.msdk.dycreator.bus.EventBus.2
        @Override // java.lang.ThreadLocal
        protected /* synthetic */ BooleanWrapper initialValue() {
            return new BooleanWrapper();
        }
    };
    private String i = "onEvent";
    private final HandlerPoster j = new HandlerPoster(this, Looper.getMainLooper(), 10);
    private final BackgroundPoster k = new BackgroundPoster(this);
    private final AsyncPoster l = new AsyncPoster(this);
    private final SubscriberMethodFinder m = new SubscriberMethodFinder();
    private boolean o = true;
    private Map<String, Object> p = new ConcurrentHashMap();

    interface PostCallback {
        void onPostCompleted(List<SubscriberExceptionEvent> list);
    }

    public static EventBus getDefault() {
        if (b == null) {
            synchronized (EventBus.class) {
                if (b == null) {
                    b = new EventBus();
                }
            }
        }
        return b;
    }

    public static void clearCaches() {
        SubscriberMethodFinder.a();
        c.clear();
    }

    public static void skipMethodNameVerificationFor(Class<?> cls) {
        SubscriberMethodFinder.a(cls);
    }

    public static void clearSkipMethodNameVerifications() {
        SubscriberMethodFinder.clearSkipMethodNameVerifications();
    }

    public final void configureLogSubscriberExceptions(boolean z) {
        if (this.n) {
            throw new EventBusException("This method must be called before any registration");
        }
        this.o = z;
    }

    public final void register(Object obj) throws IllegalAccessException, Error, IllegalArgumentException, InvocationTargetException {
        a(obj, this.i, false);
    }

    public final void register(String str, Object obj) throws IllegalAccessException, Error, IllegalArgumentException, InvocationTargetException {
        Map<String, Object> map = this.p;
        if (map != null && map.containsKey(str)) {
            unregister(this.p.get(str));
        }
        this.p.put(str, obj);
        a(obj, this.i, false);
    }

    public final void register(Object obj, String str) throws IllegalAccessException, Error, IllegalArgumentException, InvocationTargetException {
        a(obj, str, false);
    }

    public final void registerSticky(Object obj) throws IllegalAccessException, Error, IllegalArgumentException, InvocationTargetException {
        a(obj, this.i, true);
    }

    public final void registerSticky(Object obj, String str) throws IllegalAccessException, Error, IllegalArgumentException, InvocationTargetException {
        a(obj, str, true);
    }

    private void a(Object obj, String str, boolean z) throws IllegalAccessException, Error, IllegalArgumentException, InvocationTargetException {
        Iterator<SubscriberMethod> it = this.m.a(obj.getClass(), str).iterator();
        while (it.hasNext()) {
            a(obj, it.next(), z);
        }
    }

    public final void register(Object obj, Class<?> cls, Class<?>... clsArr) {
        a(obj, this.i, false, cls, clsArr);
    }

    public final synchronized void register(Object obj, String str, Class<?> cls, Class<?>... clsArr) {
        a(obj, str, false, cls, clsArr);
    }

    public final void registerSticky(Object obj, Class<?> cls, Class<?>... clsArr) {
        a(obj, this.i, true, cls, clsArr);
    }

    public final synchronized void registerSticky(Object obj, String str, Class<?> cls, Class<?>... clsArr) {
        a(obj, str, true, cls, clsArr);
    }

    private synchronized void a(Object obj, String str, boolean z, Class<?> cls, Class<?>... clsArr) {
        for (SubscriberMethod subscriberMethod : this.m.a(obj.getClass(), str)) {
            if (cls == subscriberMethod.c) {
                a(obj, subscriberMethod, z);
            } else if (clsArr != null) {
                int length = clsArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    if (clsArr[i] == subscriberMethod.c) {
                        a(obj, subscriberMethod, z);
                        break;
                    }
                    i++;
                }
            }
        }
    }

    private void a(Object obj, SubscriberMethod subscriberMethod, boolean z) throws IllegalAccessException, Error, IllegalArgumentException, InvocationTargetException {
        Object obj2;
        this.n = true;
        Class<?> cls = subscriberMethod.c;
        CopyOnWriteArrayList<Subscription> copyOnWriteArrayList = this.d.get(cls);
        Subscription subscription = new Subscription(obj, subscriberMethod);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            this.d.put(cls, copyOnWriteArrayList);
        } else {
            Iterator<Subscription> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                if (it.next().equals(subscription)) {
                    throw new EventBusException("Subscriber " + obj.getClass() + " already registered to event " + cls);
                }
            }
        }
        subscriberMethod.f2665a.setAccessible(true);
        copyOnWriteArrayList.add(subscription);
        List<Class<?>> arrayList = this.e.get(obj);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.e.put(obj, arrayList);
        }
        arrayList.add(cls);
        if (z) {
            synchronized (this.f) {
                obj2 = this.f.get(cls);
            }
            if (obj2 != null) {
                a(subscription, obj2, Looper.getMainLooper() == Looper.myLooper());
            }
        }
    }

    public final synchronized void unregister(Object obj, Class<?>... clsArr) {
        if (clsArr.length == 0) {
            throw new IllegalArgumentException("Provide at least one event class");
        }
        List<Class<?>> list = this.e.get(obj);
        if (list != null) {
            for (Class<?> cls : clsArr) {
                a(obj, cls);
                list.remove(cls);
            }
            if (list.isEmpty()) {
                this.e.remove(obj);
            }
        } else {
            Log.w(TAG, "Subscriber to unregister was not registered before: " + obj.getClass());
        }
    }

    private void a(Object obj, Class<?> cls) {
        CopyOnWriteArrayList<Subscription> copyOnWriteArrayList = this.d.get(cls);
        if (copyOnWriteArrayList != null) {
            int size = copyOnWriteArrayList.size();
            int i = 0;
            while (i < size) {
                if (copyOnWriteArrayList.get(i).f2667a == obj) {
                    copyOnWriteArrayList.remove(i);
                    i--;
                    size--;
                }
                i++;
            }
        }
    }

    public final synchronized void unregister(Object obj) {
        List<Class<?>> list = this.e.get(obj);
        if (list != null) {
            Iterator<Class<?>> it = list.iterator();
            while (it.hasNext()) {
                a(obj, it.next());
            }
            this.e.remove(obj);
        } else {
            Log.w(TAG, "Subscriber to unregister was not registered before: " + obj.getClass());
        }
    }

    public final synchronized void unregister(String str) {
        Map<String, Object> map = this.p;
        if (map != null && map.containsKey(str)) {
            Object objRemove = this.p.remove(str);
            List<Class<?>> list = this.e.get(objRemove);
            if (list != null) {
                Iterator<Class<?>> it = list.iterator();
                while (it.hasNext()) {
                    a(objRemove, it.next());
                }
                this.e.remove(objRemove);
            } else {
                Log.w(TAG, "Subscriber to unregister was not registered before: " + objRemove.getClass());
            }
        }
    }

    public final void post(Object obj) {
        CopyOnWriteArrayList<Subscription> copyOnWriteArrayList;
        List<Object> list = this.g.get();
        list.add(obj);
        BooleanWrapper booleanWrapper = this.h.get();
        if (booleanWrapper.f2661a) {
            return;
        }
        boolean z = Looper.getMainLooper() == Looper.myLooper();
        booleanWrapper.f2661a = true;
        while (!list.isEmpty()) {
            try {
                Object objRemove = list.remove(0);
                if (objRemove != null) {
                    try {
                        Class<?> cls = objRemove.getClass();
                        List<Class<?>> listA = a(cls);
                        int size = listA.size();
                        boolean z2 = false;
                        for (int i = 0; i < size; i++) {
                            Class<?> cls2 = listA.get(i);
                            synchronized (this) {
                                copyOnWriteArrayList = this.d.get(cls2);
                            }
                            if (copyOnWriteArrayList != null) {
                                Iterator<Subscription> it = copyOnWriteArrayList.iterator();
                                while (it.hasNext()) {
                                    a(it.next(), objRemove, z);
                                }
                                z2 = true;
                            }
                        }
                        if (!z2) {
                            Log.d(TAG, "No subscripers registered for event " + cls);
                            if (cls != NoSubscriberEvent.class && cls != SubscriberExceptionEvent.class) {
                                post(new NoSubscriberEvent(this, objRemove));
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            } finally {
                booleanWrapper.f2661a = false;
            }
        }
    }

    public final void postSticky(Object obj) {
        post(obj);
        synchronized (this.f) {
            this.f.put(obj.getClass(), obj);
        }
    }

    public final Object getStickyEvent(Class<?> cls) {
        Object obj;
        synchronized (this.f) {
            obj = this.f.get(cls);
        }
        return obj;
    }

    public final Object removeStickyEvent(Class<?> cls) {
        Object objRemove;
        synchronized (this.f) {
            objRemove = this.f.remove(cls);
        }
        return objRemove;
    }

    public final boolean removeStickyEvent(Object obj) {
        synchronized (this.f) {
            Class<?> cls = obj.getClass();
            if (!obj.equals(this.f.get(cls))) {
                return false;
            }
            this.f.remove(cls);
            return true;
        }
    }

    public final void release() {
        if (b != null) {
            b = null;
            f2657a = null;
            Map<Class<?>, List<Class<?>>> map = c;
            if (map != null && map.size() > 0) {
                map.clear();
            }
            Map<Class<?>, CopyOnWriteArrayList<Subscription>> map2 = this.d;
            if (map2 != null && map2.size() > 0) {
                this.d.clear();
            }
            Map<Object, List<Class<?>>> map3 = this.e;
            if (map3 != null && map3.size() > 0) {
                this.e.clear();
            }
            Map<Class<?>, Object> map4 = this.f;
            if (map4 != null && map4.size() > 0) {
                this.f.clear();
            }
            Map<String, Object> map5 = this.p;
            if (map5 == null || map5.size() <= 0) {
                return;
            }
            this.p.clear();
        }
    }

    /* renamed from: com.mbridge.msdk.dycreator.bus.EventBus$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2660a;

        static {
            int[] iArr = new int[ThreadMode.values().length];
            f2660a = iArr;
            try {
                iArr[ThreadMode.PostThread.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2660a[ThreadMode.MainThread.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2660a[ThreadMode.BackgroundThread.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2660a[ThreadMode.Async.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private void a(Subscription subscription, Object obj, boolean z) throws IllegalAccessException, Error, IllegalArgumentException, InvocationTargetException {
        int i = AnonymousClass3.f2660a[subscription.b.b.ordinal()];
        if (i == 1) {
            a(subscription, obj);
            return;
        }
        if (i == 2) {
            if (z) {
                a(subscription, obj);
                return;
            } else {
                this.j.a(subscription, obj);
                return;
            }
        }
        if (i == 3) {
            if (z) {
                this.k.enqueue(subscription, obj);
                return;
            } else {
                a(subscription, obj);
                return;
            }
        }
        if (i == 4) {
            this.l.enqueue(subscription, obj);
            return;
        }
        throw new IllegalStateException("Unknown thread mode: " + subscription.b.b);
    }

    private List<Class<?>> a(Class<?> cls) {
        List<Class<?>> arrayList;
        Map<Class<?>, List<Class<?>>> map = c;
        synchronized (map) {
            arrayList = map.get(cls);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                for (Class<?> superclass = cls; superclass != null; superclass = superclass.getSuperclass()) {
                    arrayList.add(superclass);
                    a(arrayList, superclass.getInterfaces());
                }
                c.put(cls, arrayList);
            }
        }
        return arrayList;
    }

    private static void a(List<Class<?>> list, Class<?>[] clsArr) {
        for (Class<?> cls : clsArr) {
            if (!list.contains(cls)) {
                list.add(cls);
                a(list, cls.getInterfaces());
            }
        }
    }

    final void a(PendingPost pendingPost) {
        Object obj = pendingPost.f2663a;
        Subscription subscription = pendingPost.b;
        PendingPost.a(pendingPost);
        a(subscription, obj);
    }

    private void a(Subscription subscription, Object obj) throws IllegalAccessException, Error, IllegalArgumentException, InvocationTargetException {
        try {
            subscription.b.f2665a.invoke(subscription.f2667a, obj);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException("Unexpected exception", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (obj instanceof SubscriberExceptionEvent) {
                Log.e(TAG, "SubscriberExceptionEvent subscriber " + subscription.f2667a.getClass() + " threw an exception", cause);
                SubscriberExceptionEvent subscriberExceptionEvent = (SubscriberExceptionEvent) obj;
                Log.e(TAG, "Initial event " + subscriberExceptionEvent.causingEvent + " caused exception in " + subscriberExceptionEvent.causingSubscriber, subscriberExceptionEvent.throwable);
                return;
            }
            if (this.o) {
                Log.e(TAG, "Could not dispatch event: " + obj.getClass() + " to subscribing class " + subscription.f2667a.getClass(), cause);
            }
            post(new SubscriberExceptionEvent(this, cause, obj, subscription.f2667a));
        }
    }

    static final class BooleanWrapper {

        /* renamed from: a, reason: collision with root package name */
        boolean f2661a;

        BooleanWrapper() {
        }
    }
}
