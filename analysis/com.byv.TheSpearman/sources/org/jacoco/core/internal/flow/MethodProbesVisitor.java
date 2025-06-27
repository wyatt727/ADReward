package org.jacoco.core.internal.flow;

import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.tree.MethodNode;

/* loaded from: classes5.dex */
public abstract class MethodProbesVisitor extends MethodVisitor {
    public void visitInsnWithProbe(int i, int i2) {
    }

    public void visitJumpInsnWithProbe(int i, Label label, int i2, IFrame iFrame) {
    }

    public void visitLookupSwitchInsnWithProbes(Label label, int[] iArr, Label[] labelArr, IFrame iFrame) {
    }

    public void visitProbe(int i) {
    }

    public void visitTableSwitchInsnWithProbes(int i, int i2, Label label, Label[] labelArr, IFrame iFrame) {
    }

    public MethodProbesVisitor() {
        this(null);
    }

    public MethodProbesVisitor(MethodVisitor methodVisitor) {
        super(589824, methodVisitor);
    }

    public void accept(MethodNode methodNode, MethodVisitor methodVisitor) {
        methodNode.accept(methodVisitor);
    }
}
