package org.jacoco.core.internal.analysis.filter;

import java.util.Iterator;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.JumpInsnNode;
import org.objectweb.asm.tree.LdcInsnNode;
import org.objectweb.asm.tree.MethodNode;

/* loaded from: classes5.dex */
public final class KotlinUnsafeCastOperatorFilter implements IFilter {
    @Override // org.jacoco.core.internal.analysis.filter.IFilter
    public void filter(MethodNode methodNode, IFilterContext iFilterContext, IFilterOutput iFilterOutput) {
        if (KotlinGeneratedFilter.isKotlinClass(iFilterContext)) {
            Matcher matcher = new Matcher();
            Iterator<AbstractInsnNode> it = methodNode.instructions.iterator();
            while (it.hasNext()) {
                AbstractInsnNode next = it.next();
                matcher.match("kotlin/TypeCastException", next, iFilterOutput);
                matcher.match("java/lang/NullPointerException", next, iFilterOutput);
            }
        }
    }

    private static class Matcher extends AbstractMatcher {
        private Matcher() {
        }

        public void match(String str, AbstractInsnNode abstractInsnNode, IFilterOutput iFilterOutput) {
            if (199 != abstractInsnNode.getOpcode()) {
                return;
            }
            this.cursor = abstractInsnNode;
            JumpInsnNode jumpInsnNode = (JumpInsnNode) this.cursor;
            AbstractInsnNode next = this.cursor.getNext();
            if (next != null && next.getOpcode() == 87) {
                next();
            }
            nextIsType(Opcodes.NEW, str);
            nextIs(89);
            nextIs(18);
            if (this.cursor == null) {
                return;
            }
            LdcInsnNode ldcInsnNode = (LdcInsnNode) this.cursor;
            if ((ldcInsnNode.cst instanceof String) && ((String) ldcInsnNode.cst).startsWith("null cannot be cast to non-null type")) {
                nextIsInvoke(Opcodes.INVOKESPECIAL, str, "<init>", "(Ljava/lang/String;)V");
                nextIs(Opcodes.ATHROW);
                if (this.cursor != null && this.cursor.getNext() == jumpInsnNode.label) {
                    iFilterOutput.ignore(abstractInsnNode, this.cursor);
                }
            }
        }
    }
}
