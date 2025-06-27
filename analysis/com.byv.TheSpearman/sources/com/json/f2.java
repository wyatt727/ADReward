package com.json;

import com.json.environment.thread.IronSourceThreadManager;
import com.json.environment.workerthread.WorkerManager;
import com.json.environment.workerthread.WorkerResult;
import com.json.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public class f2 {

    class a implements WorkerManager.WorkEndedListener<g2> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ b f1769a;

        a(b bVar) {
            this.f1769a = bVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.ironsource.environment.workerthread.WorkerManager.WorkEndedListener
        public void onWorkCompleted(List<WorkerResult<g2>> list, long j) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (WorkerResult<g2> workerResult : list) {
                if (workerResult instanceof WorkerResult.Completed) {
                    arrayList2.add((g2) ((WorkerResult.Completed) workerResult).data);
                } else if (workerResult instanceof WorkerResult.Canceled) {
                    arrayList.add(((c2) ((WorkerResult.Canceled) workerResult).callable).c());
                } else if (workerResult instanceof WorkerResult.Failed) {
                    WorkerResult.Failed failed = (WorkerResult.Failed) workerResult;
                    c2 c2Var = (c2) failed.callable;
                    arrayList2.add(new g2(c2Var.d(), c2Var.c(), null, 0L, failed.exception.getMessage()));
                }
            }
            f2.this.a(arrayList2, arrayList, j);
            this.f1769a.a(arrayList2, j, arrayList);
        }

        @Override // com.ironsource.environment.workerthread.WorkerManager.WorkEndedListener
        public void onWorkFailed(String str) {
            String str2 = "failed to collect bidding data, error= " + str;
            IronLog.INTERNAL.verbose(str2);
            this.f1769a.onFailure(str2);
        }
    }

    public interface b {
        void a(List<g2> list, long j, List<String> list2);

        void onFailure(String str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<g2> list, List<String> list2, long j) {
        IronLog ironLog;
        StringBuilder sb;
        String strB;
        IronLog.INTERNAL.verbose("tokens received=" + list.size() + ", reached timeout=" + list2.size() + ", total duration=" + j + " millis");
        for (g2 g2Var : list) {
            if (g2Var.a() != null) {
                ironLog = IronLog.INTERNAL;
                sb = new StringBuilder();
                sb.append(g2Var.c());
                sb.append(" - success (");
                sb.append(g2Var.e());
                strB = " millis)";
            } else {
                ironLog = IronLog.INTERNAL;
                sb = new StringBuilder();
                sb.append(g2Var.c());
                sb.append(" - failed (");
                sb.append(g2Var.e());
                sb.append(" millis) error: ");
                strB = g2Var.b();
            }
            sb.append(strB);
            ironLog.verbose(sb.toString());
        }
        for (String str : list2) {
            IronLog.INTERNAL.verbose(str + " reached timeout");
        }
    }

    public void a(List<c2> list, b bVar, long j, TimeUnit timeUnit) {
        try {
            if (list.isEmpty()) {
                IronLog.INTERNAL.verbose("BiddingDataCallable list is empty");
                return;
            }
            WorkerManager workerManager = new WorkerManager(IronSourceThreadManager.INSTANCE.getThreadPoolExecutor());
            Iterator<c2> it = list.iterator();
            while (it.hasNext()) {
                workerManager.addCallable(it.next());
            }
            IronLog.INTERNAL.verbose("instances=" + list.size() + ", timeout=" + j + " millis");
            workerManager.startWork(new a(bVar), j, timeUnit);
        } catch (Throwable th) {
            String str = "Exception - failed to collect bidding data, error= " + th.getMessage();
            IronLog.INTERNAL.error(str);
            bVar.onFailure(str);
        }
    }
}
