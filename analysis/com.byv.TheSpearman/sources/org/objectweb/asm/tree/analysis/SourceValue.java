package org.objectweb.asm.tree.analysis;

import java.util.Set;
import org.objectweb.asm.tree.AbstractInsnNode;

/* loaded from: classes5.dex */
public class SourceValue implements Value {
    public final Set<AbstractInsnNode> insns;
    public final int size;

    public SourceValue(int i) {
        this(i, new SmallSet());
    }

    public SourceValue(int i, AbstractInsnNode abstractInsnNode) {
        this.size = i;
        this.insns = new SmallSet(abstractInsnNode);
    }

    public SourceValue(int i, Set<AbstractInsnNode> set) {
        this.size = i;
        this.insns = set;
    }

    @Override // org.objectweb.asm.tree.analysis.Value
    public int getSize() {
        return this.size;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SourceValue)) {
            return false;
        }
        SourceValue sourceValue = (SourceValue) obj;
        return this.size == sourceValue.size && this.insns.equals(sourceValue.insns);
    }

    public int hashCode() {
        return this.insns.hashCode();
    }
}
