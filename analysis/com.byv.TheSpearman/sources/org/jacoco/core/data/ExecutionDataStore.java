package org.jacoco.core.data;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
public final class ExecutionDataStore implements IExecutionDataVisitor {
    private final Map<Long, ExecutionData> entries = new HashMap();
    private final Set<String> names = new HashSet();

    public void put(ExecutionData executionData) throws IllegalStateException {
        Long lValueOf = Long.valueOf(executionData.getId());
        ExecutionData executionData2 = this.entries.get(lValueOf);
        if (executionData2 == null) {
            this.entries.put(lValueOf, executionData);
            this.names.add(executionData.getName());
        } else {
            executionData2.merge(executionData);
        }
    }

    public void subtract(ExecutionData executionData) throws IllegalStateException {
        ExecutionData executionData2 = this.entries.get(Long.valueOf(executionData.getId()));
        if (executionData2 != null) {
            executionData2.merge(executionData, false);
        }
    }

    public void subtract(ExecutionDataStore executionDataStore) throws IllegalStateException {
        Iterator<ExecutionData> it = executionDataStore.getContents().iterator();
        while (it.hasNext()) {
            subtract(it.next());
        }
    }

    public ExecutionData get(long j) {
        return this.entries.get(Long.valueOf(j));
    }

    public boolean contains(String str) {
        return this.names.contains(str);
    }

    public ExecutionData get(Long l, String str, int i) throws IllegalStateException {
        ExecutionData executionData = this.entries.get(l);
        if (executionData == null) {
            ExecutionData executionData2 = new ExecutionData(l.longValue(), str, i);
            this.entries.put(l, executionData2);
            this.names.add(str);
            return executionData2;
        }
        executionData.assertCompatibility(l.longValue(), str, i);
        return executionData;
    }

    public void reset() {
        Iterator<ExecutionData> it = this.entries.values().iterator();
        while (it.hasNext()) {
            it.next().reset();
        }
    }

    public Collection<ExecutionData> getContents() {
        return new ArrayList(this.entries.values());
    }

    public void accept(IExecutionDataVisitor iExecutionDataVisitor) {
        Iterator<ExecutionData> it = getContents().iterator();
        while (it.hasNext()) {
            iExecutionDataVisitor.visitClassExecution(it.next());
        }
    }

    @Override // org.jacoco.core.data.IExecutionDataVisitor
    public void visitClassExecution(ExecutionData executionData) throws IllegalStateException {
        put(executionData);
    }
}
