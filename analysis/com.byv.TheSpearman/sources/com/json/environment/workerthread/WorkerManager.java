package com.json.environment.workerthread;

import com.json.environment.workerthread.WorkerResult;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public class WorkerManager<T> {

    /* renamed from: a, reason: collision with root package name */
    List<Callable<T>> f1765a = new ArrayList();
    private final ExecutorService b;

    public interface WorkEndedListener<T> {
        void onWorkCompleted(List<WorkerResult<T>> list, long j);

        void onWorkFailed(String str);
    }

    public WorkerManager(ExecutorService executorService) {
        this.b = executorService;
    }

    public void addCallable(Callable<T> callable) {
        this.f1765a.add(callable);
    }

    public void startWork(WorkEndedListener<T> workEndedListener, long j, TimeUnit timeUnit) throws InterruptedException {
        WorkerResult.Canceled canceled;
        if (this.b.isShutdown()) {
            workEndedListener.onWorkFailed("can not start work, executor has been shut down");
            return;
        }
        if (this.f1765a.isEmpty()) {
            workEndedListener.onWorkFailed("can not start work, callable list is empty");
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        try {
            List<Future<T>> listInvokeAll = this.b.invokeAll(this.f1765a, j, timeUnit);
            for (int i = 0; i < listInvokeAll.size(); i++) {
                Future<T> future = listInvokeAll.get(i);
                if (!future.isDone() || future.isCancelled()) {
                    canceled = new WorkerResult.Canceled(this.f1765a.get(i));
                } else {
                    try {
                        arrayList.add(new WorkerResult.Completed(future.get()));
                    } catch (InterruptedException e) {
                        e = e;
                        arrayList.add(new WorkerResult.Failed(this.f1765a.get(i), e));
                    } catch (CancellationException unused) {
                        canceled = new WorkerResult.Canceled(this.f1765a.get(i));
                    } catch (ExecutionException e2) {
                        e = e2;
                        arrayList.add(new WorkerResult.Failed(this.f1765a.get(i), e));
                    }
                }
                arrayList.add(canceled);
            }
            workEndedListener.onWorkCompleted(arrayList, System.currentTimeMillis() - jCurrentTimeMillis);
            this.b.shutdownNow();
        } catch (Exception e3) {
            e3.printStackTrace();
            workEndedListener.onWorkFailed("failed to invoke callables, error= " + e3.getMessage());
            this.b.shutdownNow();
        }
    }
}
