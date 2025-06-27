package org.jacoco.core.internal.instr;

import org.jacoco.core.internal.flow.ClassProbesVisitor;
import org.jacoco.core.internal.flow.MethodProbesVisitor;

/* loaded from: classes5.dex */
class ProbeCounter extends ClassProbesVisitor {
    private int count = 0;
    private boolean methods = false;

    ProbeCounter() {
    }

    @Override // org.jacoco.core.internal.flow.ClassProbesVisitor, org.objectweb.asm.ClassVisitor
    public MethodProbesVisitor visitMethod(int i, String str, String str2, String str3, String[] strArr) {
        if ("<clinit>".equals(str) || (i & 1024) != 0) {
            return null;
        }
        this.methods = true;
        return null;
    }

    @Override // org.jacoco.core.internal.flow.ClassProbesVisitor
    public void visitTotalProbeCount(int i) {
        this.count = i;
    }

    int getCount() {
        return this.count;
    }

    boolean hasMethods() {
        return this.methods;
    }
}
