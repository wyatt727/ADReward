package com.unity3d.services.core.request;

import android.os.ConditionVariable;
import com.unity3d.ads.core.domain.InitializeAndroidBoldSDK;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.request.WebRequest;
import java.lang.reflect.InvocationTargetException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public class WebRequestThread {
    private static int _corePoolSize = 1;
    private static long _keepAliveTime = 1000;
    private static int _maximumPoolSize = 1;
    private static CancelableThreadPoolExecutor _pool = null;
    private static LinkedBlockingQueue<Runnable> _queue = null;
    private static boolean _ready = false;
    private static final Object _readyLock = new Object();

    private static synchronized void init() {
        _queue = new LinkedBlockingQueue<>();
        CancelableThreadPoolExecutor cancelableThreadPoolExecutor = new CancelableThreadPoolExecutor(_corePoolSize, _maximumPoolSize, _keepAliveTime, TimeUnit.MILLISECONDS, _queue);
        _pool = cancelableThreadPoolExecutor;
        cancelableThreadPoolExecutor.prestartAllCoreThreads();
        _queue.add(new Runnable() { // from class: com.unity3d.services.core.request.WebRequestThread.1
            @Override // java.lang.Runnable
            public void run() {
                boolean unused = WebRequestThread._ready = true;
                synchronized (WebRequestThread._readyLock) {
                    WebRequestThread._readyLock.notifyAll();
                }
            }
        });
        while (!_ready) {
            try {
                Object obj = _readyLock;
                synchronized (obj) {
                    obj.wait();
                }
            } catch (InterruptedException unused) {
                DeviceLog.debug("Couldn't synchronize thread");
                Thread.currentThread().interrupt();
                return;
            }
        }
    }

    public static synchronized void reset() {
        cancel();
        CancelableThreadPoolExecutor cancelableThreadPoolExecutor = _pool;
        if (cancelableThreadPoolExecutor != null) {
            cancelableThreadPoolExecutor.shutdown();
            try {
                _pool.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
            _queue.clear();
            _pool = null;
            _queue = null;
            _ready = false;
        }
    }

    public static synchronized void cancel() {
        CancelableThreadPoolExecutor cancelableThreadPoolExecutor = _pool;
        if (cancelableThreadPoolExecutor != null) {
            cancelableThreadPoolExecutor.cancel();
            Iterator<Runnable> it = _queue.iterator();
            while (it.hasNext()) {
                Runnable next = it.next();
                if (next instanceof WebRequestRunnable) {
                    ((WebRequestRunnable) next).setCancelStatus(true);
                }
            }
            _queue.clear();
            _pool.purge();
        }
    }

    public static synchronized void request(String str, WebRequest.RequestType requestType, Map<String, List<String>> map, Integer num, Integer num2, IWebRequestListener iWebRequestListener) {
        request(str, requestType, map, null, num, num2, iWebRequestListener);
    }

    public static synchronized void request(String str, WebRequest.RequestType requestType, Map<String, List<String>> map, String str2, Integer num, Integer num2, IWebRequestListener iWebRequestListener) {
        if (!_ready) {
            init();
        }
        if (str != null && str.length() >= 3) {
            _queue.add(new WebRequestRunnable(str, requestType.name(), str2, num.intValue(), num2.intValue(), map, iWebRequestListener));
            return;
        }
        iWebRequestListener.onFailed(str, "Request is NULL or too short");
    }

    public static synchronized void setConcurrentRequestCount(int i) {
        _corePoolSize = i;
        _maximumPoolSize = i;
        CancelableThreadPoolExecutor cancelableThreadPoolExecutor = _pool;
        if (cancelableThreadPoolExecutor != null) {
            cancelableThreadPoolExecutor.setCorePoolSize(i);
            _pool.setMaximumPoolSize(_maximumPoolSize);
        }
    }

    public static synchronized void setMaximumPoolSize(int i) {
        _maximumPoolSize = i;
        CancelableThreadPoolExecutor cancelableThreadPoolExecutor = _pool;
        if (cancelableThreadPoolExecutor != null) {
            cancelableThreadPoolExecutor.setMaximumPoolSize(i);
        }
    }

    public static synchronized void setKeepAliveTime(long j) {
        _keepAliveTime = j;
        CancelableThreadPoolExecutor cancelableThreadPoolExecutor = _pool;
        if (cancelableThreadPoolExecutor != null) {
            cancelableThreadPoolExecutor.setKeepAliveTime(j, TimeUnit.MILLISECONDS);
        }
    }

    public static synchronized boolean resolve(final String str, final IResolveHostListener iResolveHostListener) {
        if (str != null) {
            if (str.length() >= 3) {
                new Thread(new Runnable() { // from class: com.unity3d.services.core.request.WebRequestThread.2
                    @Override // java.lang.Runnable
                    public void run() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
                        Thread thread;
                        Exception e;
                        final ConditionVariable conditionVariable = new ConditionVariable();
                        try {
                            thread = new Thread(new Runnable() { // from class: com.unity3d.services.core.request.WebRequestThread.2.1
                                @Override // java.lang.Runnable
                                public void run() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
                                    try {
                                        iResolveHostListener.onResolve(str, InetAddress.getByName(str).getHostAddress());
                                    } catch (UnknownHostException e2) {
                                        DeviceLog.exception("Unknown host", e2);
                                        iResolveHostListener.onFailed(str, ResolveHostError.UNKNOWN_HOST, e2.getMessage());
                                    }
                                    conditionVariable.open();
                                }
                            });
                        } catch (Exception e2) {
                            thread = null;
                            e = e2;
                        }
                        try {
                            thread.start();
                        } catch (Exception e3) {
                            e = e3;
                            DeviceLog.exception("Exception while resolving host", e);
                            iResolveHostListener.onFailed(str, ResolveHostError.UNEXPECTED_EXCEPTION, e.getMessage());
                            if (conditionVariable.block(20000L)) {
                                return;
                            } else {
                                return;
                            }
                        }
                        if (conditionVariable.block(20000L) || thread == null) {
                            return;
                        }
                        thread.interrupt();
                        iResolveHostListener.onFailed(str, ResolveHostError.TIMEOUT, InitializeAndroidBoldSDK.MSG_TIMEOUT);
                    }
                }).start();
                return true;
            }
        }
        iResolveHostListener.onFailed(str, ResolveHostError.INVALID_HOST, "Host is NULL");
        return false;
    }
}
