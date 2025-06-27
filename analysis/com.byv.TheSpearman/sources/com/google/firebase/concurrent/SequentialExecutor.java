package com.google.firebase.concurrent;

import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;

/* loaded from: classes2.dex */
final class SequentialExecutor implements Executor {
    private static final Logger log = Logger.getLogger(SequentialExecutor.class.getName());
    private final Executor executor;
    private final Deque<Runnable> queue = new ArrayDeque();
    private WorkerRunningState workerRunningState = WorkerRunningState.IDLE;
    private long workerRunCount = 0;
    private final QueueWorker worker = new QueueWorker();

    enum WorkerRunningState {
        IDLE,
        QUEUING,
        QUEUED,
        RUNNING
    }

    static /* synthetic */ long access$308(SequentialExecutor sequentialExecutor) {
        long j = sequentialExecutor.workerRunCount;
        sequentialExecutor.workerRunCount = 1 + j;
        return j;
    }

    SequentialExecutor(Executor executor) {
        this.executor = (Executor) Preconditions.checkNotNull(executor);
    }

    @Override // java.util.concurrent.Executor
    public void execute(final Runnable runnable) {
        Preconditions.checkNotNull(runnable);
        synchronized (this.queue) {
            if (this.workerRunningState != WorkerRunningState.RUNNING && this.workerRunningState != WorkerRunningState.QUEUED) {
                long j = this.workerRunCount;
                Runnable runnable2 = new Runnable() { // from class: com.google.firebase.concurrent.SequentialExecutor.1
                    @Override // java.lang.Runnable
                    public void run() {
                        runnable.run();
                    }

                    public String toString() {
                        return runnable.toString();
                    }
                };
                this.queue.add(runnable2);
                this.workerRunningState = WorkerRunningState.QUEUING;
                try {
                    this.executor.execute(this.worker);
                    if (this.workerRunningState != WorkerRunningState.QUEUING) {
                        return;
                    }
                    synchronized (this.queue) {
                        if (this.workerRunCount == j && this.workerRunningState == WorkerRunningState.QUEUING) {
                            this.workerRunningState = WorkerRunningState.QUEUED;
                        }
                    }
                    return;
                } catch (Error | RuntimeException e) {
                    synchronized (this.queue) {
                        if ((this.workerRunningState != WorkerRunningState.IDLE && this.workerRunningState != WorkerRunningState.QUEUING) || !this.queue.removeLastOccurrence(runnable2)) {
                            z = false;
                        }
                        if (!(e instanceof RejectedExecutionException) || z) {
                            throw e;
                        }
                    }
                    return;
                }
            }
            this.queue.add(runnable);
        }
    }

    private final class QueueWorker implements Runnable {

        @CheckForNull
        Runnable task;

        private QueueWorker() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                workOnQueue();
            } catch (Error e) {
                synchronized (SequentialExecutor.this.queue) {
                    SequentialExecutor.this.workerRunningState = WorkerRunningState.IDLE;
                    throw e;
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0054, code lost:
        
            r1 = r1 | java.lang.Thread.interrupted();
            r2 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0056, code lost:
        
            r8.task.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0060, code lost:
        
            r3 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0061, code lost:
        
            com.google.firebase.concurrent.SequentialExecutor.log.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + r8.task, (java.lang.Throwable) r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x007e, code lost:
        
            r8.task = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0080, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:?, code lost:
        
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void workOnQueue() {
            /*
                r8 = this;
                r0 = 0
                r1 = r0
            L2:
                com.google.firebase.concurrent.SequentialExecutor r2 = com.google.firebase.concurrent.SequentialExecutor.this     // Catch: java.lang.Throwable -> L84
                java.util.Deque r2 = com.google.firebase.concurrent.SequentialExecutor.access$100(r2)     // Catch: java.lang.Throwable -> L84
                monitor-enter(r2)     // Catch: java.lang.Throwable -> L84
                if (r0 != 0) goto L2d
                com.google.firebase.concurrent.SequentialExecutor r0 = com.google.firebase.concurrent.SequentialExecutor.this     // Catch: java.lang.Throwable -> L81
                com.google.firebase.concurrent.SequentialExecutor$WorkerRunningState r0 = com.google.firebase.concurrent.SequentialExecutor.access$200(r0)     // Catch: java.lang.Throwable -> L81
                com.google.firebase.concurrent.SequentialExecutor$WorkerRunningState r3 = com.google.firebase.concurrent.SequentialExecutor.WorkerRunningState.RUNNING     // Catch: java.lang.Throwable -> L81
                if (r0 != r3) goto L20
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L81
                if (r1 == 0) goto L1f
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L1f:
                return
            L20:
                com.google.firebase.concurrent.SequentialExecutor r0 = com.google.firebase.concurrent.SequentialExecutor.this     // Catch: java.lang.Throwable -> L81
                com.google.firebase.concurrent.SequentialExecutor.access$308(r0)     // Catch: java.lang.Throwable -> L81
                com.google.firebase.concurrent.SequentialExecutor r0 = com.google.firebase.concurrent.SequentialExecutor.this     // Catch: java.lang.Throwable -> L81
                com.google.firebase.concurrent.SequentialExecutor$WorkerRunningState r3 = com.google.firebase.concurrent.SequentialExecutor.WorkerRunningState.RUNNING     // Catch: java.lang.Throwable -> L81
                com.google.firebase.concurrent.SequentialExecutor.access$202(r0, r3)     // Catch: java.lang.Throwable -> L81
                r0 = 1
            L2d:
                com.google.firebase.concurrent.SequentialExecutor r3 = com.google.firebase.concurrent.SequentialExecutor.this     // Catch: java.lang.Throwable -> L81
                java.util.Deque r3 = com.google.firebase.concurrent.SequentialExecutor.access$100(r3)     // Catch: java.lang.Throwable -> L81
                java.lang.Object r3 = r3.poll()     // Catch: java.lang.Throwable -> L81
                java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L81
                r8.task = r3     // Catch: java.lang.Throwable -> L81
                if (r3 != 0) goto L4f
                com.google.firebase.concurrent.SequentialExecutor r0 = com.google.firebase.concurrent.SequentialExecutor.this     // Catch: java.lang.Throwable -> L81
                com.google.firebase.concurrent.SequentialExecutor$WorkerRunningState r3 = com.google.firebase.concurrent.SequentialExecutor.WorkerRunningState.IDLE     // Catch: java.lang.Throwable -> L81
                com.google.firebase.concurrent.SequentialExecutor.access$202(r0, r3)     // Catch: java.lang.Throwable -> L81
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L81
                if (r1 == 0) goto L4e
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L4e:
                return
            L4f:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L81
                boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L84
                r1 = r1 | r2
                r2 = 0
                java.lang.Runnable r3 = r8.task     // Catch: java.lang.Throwable -> L5e java.lang.RuntimeException -> L60
                r3.run()     // Catch: java.lang.Throwable -> L5e java.lang.RuntimeException -> L60
            L5b:
                r8.task = r2     // Catch: java.lang.Throwable -> L84
                goto L2
            L5e:
                r0 = move-exception
                goto L7e
            L60:
                r3 = move-exception
                java.util.logging.Logger r4 = com.google.firebase.concurrent.SequentialExecutor.access$400()     // Catch: java.lang.Throwable -> L5e
                java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L5e
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5e
                r6.<init>()     // Catch: java.lang.Throwable -> L5e
                java.lang.String r7 = "Exception while executing runnable "
                r6.append(r7)     // Catch: java.lang.Throwable -> L5e
                java.lang.Runnable r7 = r8.task     // Catch: java.lang.Throwable -> L5e
                r6.append(r7)     // Catch: java.lang.Throwable -> L5e
                java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L5e
                r4.log(r5, r6, r3)     // Catch: java.lang.Throwable -> L5e
                goto L5b
            L7e:
                r8.task = r2     // Catch: java.lang.Throwable -> L84
                throw r0     // Catch: java.lang.Throwable -> L84
            L81:
                r0 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L81
                throw r0     // Catch: java.lang.Throwable -> L84
            L84:
                r0 = move-exception
                if (r1 == 0) goto L8e
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                r1.interrupt()
            L8e:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.concurrent.SequentialExecutor.QueueWorker.workOnQueue():void");
        }

        public String toString() {
            Runnable runnable = this.task;
            if (runnable != null) {
                return "SequentialExecutorWorker{running=" + runnable + "}";
            }
            return "SequentialExecutorWorker{state=" + SequentialExecutor.this.workerRunningState + "}";
        }
    }

    public String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.executor + "}";
    }
}
