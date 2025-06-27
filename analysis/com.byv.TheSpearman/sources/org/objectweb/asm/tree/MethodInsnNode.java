package org.objectweb.asm.tree;

import java.util.Map;
import org.objectweb.asm.MethodVisitor;

/* loaded from: classes5.dex */
public class MethodInsnNode extends AbstractInsnNode {
    public String desc;
    public boolean itf;
    public String name;
    public String owner;

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public int getType() {
        return 5;
    }

    public MethodInsnNode(int i, String str, String str2, String str3) {
        this(i, str, str2, str3, i == 185);
    }

    public MethodInsnNode(int i, String str, String str2, String str3, boolean z) {
        super(i);
        this.owner = str;
        this.name = str2;
        this.desc = str3;
        this.itf = z;
    }

    public void setOpcode(int i) {
        this.opcode = i;
    }

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public void accept(MethodVisitor methodVisitor) {
        methodVisitor.visitMethodInsn(this.opcode, this.owner, this.name, this.desc, this.itf);
        acceptAnnotations(methodVisitor);
    }

    @Override // org.objectweb.asm.tree.AbstractInsnNode
    public AbstractInsnNode clone(Map<LabelNode, LabelNode> map) {
        return new MethodInsnNode(this.opcode, this.owner, this.name, this.desc, this.itf).cloneAnnotations(this);
    }
}
