package org.jacoco.core.internal.analysis.filter;

import java.util.Iterator;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.MethodNode;

/* loaded from: classes5.dex */
final class AssertFilter implements IFilter {
    AssertFilter() {
    }

    @Override // org.jacoco.core.internal.analysis.filter.IFilter
    public void filter(MethodNode methodNode, IFilterContext iFilterContext, IFilterOutput iFilterOutput) {
        Matcher matcher = new Matcher();
        if ("<clinit>".equals(methodNode.name)) {
            Iterator<AbstractInsnNode> it = methodNode.instructions.iterator();
            while (it.hasNext()) {
                matcher.matchSet(iFilterContext.getClassName(), it.next(), iFilterOutput);
            }
        }
        Iterator<AbstractInsnNode> it2 = methodNode.instructions.iterator();
        while (it2.hasNext()) {
            matcher.matchGet(iFilterContext.getClassName(), it2.next(), iFilterOutput);
        }
    }

    private static class Matcher extends AbstractMatcher {
        private Matcher() {
        }

        public void matchSet(String str, AbstractInsnNode abstractInsnNode, IFilterOutput iFilterOutput) {
            this.cursor = abstractInsnNode;
            nextIsInvoke(Opcodes.INVOKEVIRTUAL, "java/lang/Class", "desiredAssertionStatus", "()Z");
            nextIs(154);
            nextIs(4);
            nextIs(Opcodes.GOTO);
            nextIs(3);
            nextIsField(Opcodes.PUTSTATIC, str, "$assertionsDisabled", "Z");
            if (this.cursor != null) {
                iFilterOutput.ignore(abstractInsnNode, this.cursor);
            }
        }

        public void matchGet(String str, AbstractInsnNode abstractInsnNode, IFilterOutput iFilterOutput) {
            this.cursor = abstractInsnNode;
            nextIsField(Opcodes.GETSTATIC, str, "$assertionsDisabled", "Z");
            nextIs(154);
            if (this.cursor != null) {
                iFilterOutput.ignore(this.cursor, this.cursor);
            }
        }
    }
}
