package org.jacoco.core.internal.analysis.filter;

import org.objectweb.asm.Handle;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.InvokeDynamicInsnNode;
import org.objectweb.asm.tree.MethodNode;

/* loaded from: classes5.dex */
public final class RecordsFilter implements IFilter {
    @Override // org.jacoco.core.internal.analysis.filter.IFilter
    public void filter(MethodNode methodNode, IFilterContext iFilterContext, IFilterOutput iFilterOutput) {
        if ("java/lang/Record".equals(iFilterContext.getSuperClassName())) {
            Matcher matcher = new Matcher();
            if (matcher.isEquals(methodNode) || matcher.isHashCode(methodNode) || matcher.isToString(methodNode)) {
                iFilterOutput.ignore(methodNode.instructions.getFirst(), methodNode.instructions.getLast());
            }
        }
    }

    private static class Matcher extends AbstractMatcher {
        private Matcher() {
        }

        boolean isToString(MethodNode methodNode) {
            if (!"toString".equals(methodNode.name) || !"()Ljava/lang/String;".equals(methodNode.desc)) {
                return false;
            }
            firstIsALoad0(methodNode);
            nextIsInvokeDynamic("toString");
            nextIs(Opcodes.ARETURN);
            return this.cursor != null;
        }

        boolean isHashCode(MethodNode methodNode) {
            if (!"hashCode".equals(methodNode.name) || !"()I".equals(methodNode.desc)) {
                return false;
            }
            firstIsALoad0(methodNode);
            nextIsInvokeDynamic("hashCode");
            nextIs(172);
            return this.cursor != null;
        }

        boolean isEquals(MethodNode methodNode) {
            if (!"equals".equals(methodNode.name) || !"(Ljava/lang/Object;)Z".equals(methodNode.desc)) {
                return false;
            }
            firstIsALoad0(methodNode);
            nextIs(25);
            nextIsInvokeDynamic("equals");
            nextIs(172);
            return this.cursor != null;
        }

        private void nextIsInvokeDynamic(String str) {
            nextIs(Opcodes.INVOKEDYNAMIC);
            if (this.cursor == null) {
                return;
            }
            InvokeDynamicInsnNode invokeDynamicInsnNode = (InvokeDynamicInsnNode) this.cursor;
            Handle handle = invokeDynamicInsnNode.bsm;
            if (str.equals(invokeDynamicInsnNode.name) && "java/lang/runtime/ObjectMethods".equals(handle.getOwner()) && "bootstrap".equals(handle.getName())) {
                return;
            }
            this.cursor = null;
        }
    }
}
