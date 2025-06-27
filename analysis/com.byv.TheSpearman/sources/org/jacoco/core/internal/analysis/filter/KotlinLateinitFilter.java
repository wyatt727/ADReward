package org.jacoco.core.internal.analysis.filter;

import java.util.Iterator;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.JumpInsnNode;
import org.objectweb.asm.tree.MethodNode;

/* loaded from: classes5.dex */
public class KotlinLateinitFilter implements IFilter {
    @Override // org.jacoco.core.internal.analysis.filter.IFilter
    public void filter(MethodNode methodNode, IFilterContext iFilterContext, IFilterOutput iFilterOutput) {
        Matcher matcher = new Matcher();
        Iterator<AbstractInsnNode> it = methodNode.instructions.iterator();
        while (it.hasNext()) {
            matcher.match(it.next(), iFilterOutput);
        }
    }

    private static class Matcher extends AbstractMatcher {
        private Matcher() {
        }

        public void match(AbstractInsnNode abstractInsnNode, IFilterOutput iFilterOutput) {
            if (199 != abstractInsnNode.getOpcode()) {
                return;
            }
            this.cursor = abstractInsnNode;
            nextIs(18);
            nextIsInvoke(Opcodes.INVOKESTATIC, "kotlin/jvm/internal/Intrinsics", "throwUninitializedPropertyAccessException", "(Ljava/lang/String;)V");
            if (this.cursor != null && skipNonOpcodes(this.cursor.getNext()) != skipNonOpcodes(((JumpInsnNode) abstractInsnNode).label)) {
                nextIs(1);
                nextIs(Opcodes.ATHROW);
            }
            if (this.cursor != null) {
                iFilterOutput.ignore(abstractInsnNode, this.cursor);
            }
        }
    }
}
