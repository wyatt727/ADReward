package org.jacoco.core.runtime;

import org.objectweb.asm.MethodVisitor;

/* loaded from: classes5.dex */
public interface IExecutionDataAccessorGenerator {
    int generateDataAccessor(long j, String str, int i, MethodVisitor methodVisitor);
}
