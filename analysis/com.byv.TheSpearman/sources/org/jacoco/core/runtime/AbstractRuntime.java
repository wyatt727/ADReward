package org.jacoco.core.runtime;

import java.util.Random;

/* loaded from: classes5.dex */
public abstract class AbstractRuntime implements IRuntime {
    private static final Random RANDOM = new Random();
    protected RuntimeData data;

    @Override // org.jacoco.core.runtime.IRuntime
    public void startup(RuntimeData runtimeData) throws Exception {
        this.data = runtimeData;
    }

    public static String createRandomId() {
        return Integer.toHexString(RANDOM.nextInt());
    }
}
