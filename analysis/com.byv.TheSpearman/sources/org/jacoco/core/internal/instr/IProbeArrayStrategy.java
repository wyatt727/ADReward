package org.jacoco.core.internal.instr;

import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.MethodVisitor;

/* loaded from: classes5.dex */
public interface IProbeArrayStrategy {
    void addMembers(ClassVisitor classVisitor, int i);

    int storeInstance(MethodVisitor methodVisitor, boolean z, int i);
}
