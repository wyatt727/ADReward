package com.google.firebase.concurrent;

import com.google.firebase.concurrent.DelegatingScheduledFuture;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes2.dex */
class DelegatingScheduledExecutorService implements ScheduledExecutorService {
    private final ExecutorService delegate;
    private final ScheduledExecutorService scheduler;

    DelegatingScheduledExecutorService(ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        this.delegate = executorService;
        this.scheduler = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.delegate.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.delegate.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.delegate.awaitTermination(j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Callable<T> callable) {
        return this.delegate.submit(callable);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Runnable runnable, T t) {
        return this.delegate.submit(runnable, t);
    }

    @Override // java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        return this.delegate.submit(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.delegate.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws InterruptedException {
        return this.delegate.invokeAll(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection) throws ExecutionException, InterruptedException {
        return (T) this.delegate.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return (T) this.delegate.invokeAny(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.delegate.execute(runnable);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> schedule(final Runnable runnable, final long j, final TimeUnit timeUnit) {
        return new DelegatingScheduledFuture(new DelegatingScheduledFuture.Resolver() { // from class: com.google.firebase.concurrent.DelegatingScheduledExecutorService$$ExternalSyntheticLambda4
            @Override // com.google.firebase.concurrent.DelegatingScheduledFuture.Resolver
            public final ScheduledFuture addCompleter(DelegatingScheduledFuture.Completer completer) {
                return this.f$0.m473x1338b4cd(runnable, j, timeUnit, completer);
            }
        });
    }

    /* renamed from: lambda$schedule$2$com-google-firebase-concurrent-DelegatingScheduledExecutorService, reason: not valid java name */
    public /* synthetic */ ScheduledFuture m473x1338b4cd(final Runnable runnable, long j, TimeUnit timeUnit, final DelegatingScheduledFuture.Completer completer) {
        return this.scheduler.schedule(new Runnable() { // from class: com.google.firebase.concurrent.DelegatingScheduledExecutorService$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m472x3777390c(runnable, completer);
            }
        }, j, timeUnit);
    }

    /* renamed from: lambda$schedule$1$com-google-firebase-concurrent-DelegatingScheduledExecutorService, reason: not valid java name */
    public /* synthetic */ void m472x3777390c(final Runnable runnable, final DelegatingScheduledFuture.Completer completer) {
        this.delegate.execute(new Runnable() { // from class: com.google.firebase.concurrent.DelegatingScheduledExecutorService$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                DelegatingScheduledExecutorService.lambda$schedule$0(runnable, completer);
            }
        });
    }

    static /* synthetic */ void lambda$schedule$0(Runnable runnable, DelegatingScheduledFuture.Completer completer) {
        try {
            runnable.run();
            completer.set(null);
        } catch (Exception e) {
            completer.setException(e);
        }
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public <V> ScheduledFuture<V> schedule(final Callable<V> callable, final long j, final TimeUnit timeUnit) {
        return new DelegatingScheduledFuture(new DelegatingScheduledFuture.Resolver() { // from class: com.google.firebase.concurrent.DelegatingScheduledExecutorService$$ExternalSyntheticLambda5
            @Override // com.google.firebase.concurrent.DelegatingScheduledFuture.Resolver
            public final ScheduledFuture addCompleter(DelegatingScheduledFuture.Completer completer) {
                return this.f$0.m475xa67d2810(callable, j, timeUnit, completer);
            }
        });
    }

    /* renamed from: lambda$schedule$5$com-google-firebase-concurrent-DelegatingScheduledExecutorService, reason: not valid java name */
    public /* synthetic */ ScheduledFuture m475xa67d2810(final Callable callable, long j, TimeUnit timeUnit, final DelegatingScheduledFuture.Completer completer) {
        return this.scheduler.schedule(new Callable() { // from class: com.google.firebase.concurrent.DelegatingScheduledExecutorService$$ExternalSyntheticLambda2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f$0.m474xcabbac4f(callable, completer);
            }
        }, j, timeUnit);
    }

    /* renamed from: lambda$schedule$4$com-google-firebase-concurrent-DelegatingScheduledExecutorService, reason: not valid java name */
    public /* synthetic */ Future m474xcabbac4f(final Callable callable, final DelegatingScheduledFuture.Completer completer) throws Exception {
        return this.delegate.submit(new Runnable() { // from class: com.google.firebase.concurrent.DelegatingScheduledExecutorService$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                DelegatingScheduledExecutorService.lambda$schedule$3(callable, completer);
            }
        });
    }

    static /* synthetic */ void lambda$schedule$3(Callable callable, DelegatingScheduledFuture.Completer completer) {
        try {
            completer.set(callable.call());
        } catch (Exception e) {
            completer.setException(e);
        }
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleAtFixedRate(final Runnable runnable, final long j, final long j2, final TimeUnit timeUnit) {
        return new DelegatingScheduledFuture(new DelegatingScheduledFuture.Resolver() { // from class: com.google.firebase.concurrent.DelegatingScheduledExecutorService$$ExternalSyntheticLambda0
            @Override // com.google.firebase.concurrent.DelegatingScheduledFuture.Resolver
            public final ScheduledFuture addCompleter(DelegatingScheduledFuture.Completer completer) {
                return this.f$0.m477xa2ce000c(runnable, j, j2, timeUnit, completer);
            }
        });
    }

    /* renamed from: lambda$scheduleAtFixedRate$8$com-google-firebase-concurrent-DelegatingScheduledExecutorService, reason: not valid java name */
    public /* synthetic */ ScheduledFuture m477xa2ce000c(final Runnable runnable, long j, long j2, TimeUnit timeUnit, final DelegatingScheduledFuture.Completer completer) {
        return this.scheduler.scheduleAtFixedRate(new Runnable() { // from class: com.google.firebase.concurrent.DelegatingScheduledExecutorService$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m476xc70c844b(runnable, completer);
            }
        }, j, j2, timeUnit);
    }

    /* renamed from: lambda$scheduleAtFixedRate$7$com-google-firebase-concurrent-DelegatingScheduledExecutorService, reason: not valid java name */
    public /* synthetic */ void m476xc70c844b(final Runnable runnable, final DelegatingScheduledFuture.Completer completer) {
        this.delegate.execute(new Runnable() { // from class: com.google.firebase.concurrent.DelegatingScheduledExecutorService$$ExternalSyntheticLambda10
            @Override // java.lang.Runnable
            public final void run() throws Exception {
                DelegatingScheduledExecutorService.lambda$scheduleAtFixedRate$6(runnable, completer);
            }
        });
    }

    static /* synthetic */ void lambda$scheduleAtFixedRate$6(Runnable runnable, DelegatingScheduledFuture.Completer completer) throws Exception {
        try {
            runnable.run();
        } catch (Exception e) {
            completer.setException(e);
            throw e;
        }
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleWithFixedDelay(final Runnable runnable, final long j, final long j2, final TimeUnit timeUnit) {
        return new DelegatingScheduledFuture(new DelegatingScheduledFuture.Resolver() { // from class: com.google.firebase.concurrent.DelegatingScheduledExecutorService$$ExternalSyntheticLambda3
            @Override // com.google.firebase.concurrent.DelegatingScheduledFuture.Resolver
            public final ScheduledFuture addCompleter(DelegatingScheduledFuture.Completer completer) {
                return this.f$0.m479x88d94906(runnable, j, j2, timeUnit, completer);
            }
        });
    }

    /* renamed from: lambda$scheduleWithFixedDelay$11$com-google-firebase-concurrent-DelegatingScheduledExecutorService, reason: not valid java name */
    public /* synthetic */ ScheduledFuture m479x88d94906(final Runnable runnable, long j, long j2, TimeUnit timeUnit, final DelegatingScheduledFuture.Completer completer) {
        return this.scheduler.scheduleWithFixedDelay(new Runnable() { // from class: com.google.firebase.concurrent.DelegatingScheduledExecutorService$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m478xad17cd45(runnable, completer);
            }
        }, j, j2, timeUnit);
    }

    /* renamed from: lambda$scheduleWithFixedDelay$10$com-google-firebase-concurrent-DelegatingScheduledExecutorService, reason: not valid java name */
    public /* synthetic */ void m478xad17cd45(final Runnable runnable, final DelegatingScheduledFuture.Completer completer) {
        this.delegate.execute(new Runnable() { // from class: com.google.firebase.concurrent.DelegatingScheduledExecutorService$$ExternalSyntheticLambda11
            @Override // java.lang.Runnable
            public final void run() {
                DelegatingScheduledExecutorService.lambda$scheduleWithFixedDelay$9(runnable, completer);
            }
        });
    }

    static /* synthetic */ void lambda$scheduleWithFixedDelay$9(Runnable runnable, DelegatingScheduledFuture.Completer completer) {
        try {
            runnable.run();
        } catch (Exception e) {
            completer.setException(e);
        }
    }
}
