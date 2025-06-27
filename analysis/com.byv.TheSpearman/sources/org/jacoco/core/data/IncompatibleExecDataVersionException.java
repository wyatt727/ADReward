package org.jacoco.core.data;

import java.io.IOException;

/* loaded from: classes5.dex */
public class IncompatibleExecDataVersionException extends IOException {
    private static final long serialVersionUID = 1;
    private final int actualVersion;

    public IncompatibleExecDataVersionException(int i) {
        super(String.format("Cannot read execution data version 0x%x. This version of JaCoCo uses execution data version 0x%x.", Integer.valueOf(i), Integer.valueOf(ExecutionDataWriter.FORMAT_VERSION)));
        this.actualVersion = i;
    }

    public int getExpectedVersion() {
        return ExecutionDataWriter.FORMAT_VERSION;
    }

    public int getActualVersion() {
        return this.actualVersion;
    }
}
