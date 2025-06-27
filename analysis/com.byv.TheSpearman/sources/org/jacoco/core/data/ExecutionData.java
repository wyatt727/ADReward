package org.jacoco.core.data;

import java.util.Arrays;

/* loaded from: classes5.dex */
public final class ExecutionData {
    private final long id;
    private final String name;
    private final boolean[] probes;

    public ExecutionData(long j, String str, boolean[] zArr) {
        this.id = j;
        this.name = str;
        this.probes = zArr;
    }

    public ExecutionData(long j, String str, int i) {
        this.id = j;
        this.name = str;
        this.probes = new boolean[i];
    }

    public long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public boolean[] getProbes() {
        return this.probes;
    }

    public void reset() {
        Arrays.fill(this.probes, false);
    }

    public boolean hasHits() {
        for (boolean z : this.probes) {
            if (z) {
                return true;
            }
        }
        return false;
    }

    public void merge(ExecutionData executionData) throws IllegalStateException {
        merge(executionData, true);
    }

    public void merge(ExecutionData executionData, boolean z) throws IllegalStateException {
        assertCompatibility(executionData.getId(), executionData.getName(), executionData.getProbes().length);
        boolean[] probes = executionData.getProbes();
        int i = 0;
        while (true) {
            boolean[] zArr = this.probes;
            if (i >= zArr.length) {
                return;
            }
            if (probes[i]) {
                zArr[i] = z;
            }
            i++;
        }
    }

    public void assertCompatibility(long j, String str, int i) throws IllegalStateException {
        if (this.id != j) {
            throw new IllegalStateException(String.format("Different ids (%016x and %016x).", Long.valueOf(this.id), Long.valueOf(j)));
        }
        if (!this.name.equals(str)) {
            throw new IllegalStateException(String.format("Different class names %s and %s for id %016x.", this.name, str, Long.valueOf(j)));
        }
        if (this.probes.length != i) {
            throw new IllegalStateException(String.format("Incompatible execution data for class %s with id %016x.", str, Long.valueOf(j)));
        }
    }

    public String toString() {
        return String.format("ExecutionData[name=%s, id=%016x]", this.name, Long.valueOf(this.id));
    }
}
