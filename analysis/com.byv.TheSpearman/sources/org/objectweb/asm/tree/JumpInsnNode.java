package org.objectweb.asm.tree;

import java.util.Map;
import org.objectweb.asm.MethodVisitor;

/* loaded from: classes5.dex */
public class JumpInsnNode extends AbstractInsnNode {
    public LabelNode label;

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public int getType() {
        return 7;
    }

    public JumpInsnNode(int i, LabelNode labelNode) {
        super(i);
        this.label = labelNode;
    }

    public void setOpcode(int i) {
        this.opcode = i;
    }

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public void accept(MethodVisitor methodVisitor) {
        methodVisitor.visitJumpInsn(this.opcode, this.label.getLabel());
        acceptAnnotations(methodVisitor);
    }

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public AbstractInsnNode clone(Map<LabelNode, LabelNode> map) {
        return new JumpInsnNode(this.opcode, clone(this.label, map)).cloneAnnotations(this);
    }
}
