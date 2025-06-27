package com.bytedance.sdk.component.Pm.EYQ;

import com.my.target.ads.Reward;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: ThreadPoolFactory.java */
/* loaded from: classes2.dex */
public class Td {
    private static final TimeUnit EYQ = TimeUnit.SECONDS;

    public static ExecutorService EYQ() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 2, 30L, EYQ, new LinkedBlockingQueue(), new EYQ(Reward.DEFAULT));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }
}
