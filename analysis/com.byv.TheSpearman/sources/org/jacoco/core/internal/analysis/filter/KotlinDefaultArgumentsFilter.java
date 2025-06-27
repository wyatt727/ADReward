package org.jacoco.core.internal.analysis.filter;

import java.util.HashSet;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.JumpInsnNode;
import org.objectweb.asm.tree.LdcInsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.VarInsnNode;

/* loaded from: classes5.dex */
public final class KotlinDefaultArgumentsFilter implements IFilter {
    static boolean isDefaultArgumentsMethod(MethodNode methodNode) {
        return methodNode.name.endsWith("$default");
    }

    static boolean isDefaultArgumentsConstructor(MethodNode methodNode) {
        if (!"<init>".equals(methodNode.name)) {
            return false;
        }
        Type[] argumentTypes = Type.getMethodType(methodNode.desc).getArgumentTypes();
        if (argumentTypes.length < 2) {
            return false;
        }
        return "kotlin.jvm.internal.DefaultConstructorMarker".equals(argumentTypes[argumentTypes.length - 1].getClassName());
    }

    @Override // org.jacoco.core.internal.analysis.filter.IFilter
    public void filter(MethodNode methodNode, IFilterContext iFilterContext, IFilterOutput iFilterOutput) {
        if ((methodNode.access & 4096) != 0 && KotlinGeneratedFilter.isKotlinClass(iFilterContext)) {
            if (isDefaultArgumentsMethod(methodNode)) {
                new Matcher().match(methodNode, iFilterOutput, false);
            } else if (isDefaultArgumentsConstructor(methodNode)) {
                new Matcher().match(methodNode, iFilterOutput, true);
            }
        }
    }

    private static class Matcher extends AbstractMatcher {
        private Matcher() {
        }

        public void match(MethodNode methodNode, IFilterOutput iFilterOutput, boolean z) {
            this.cursor = skipNonOpcodes(methodNode.instructions.getFirst());
            nextIs(Opcodes.IFNULL);
            nextIsType(Opcodes.NEW, "java/lang/UnsupportedOperationException");
            nextIs(89);
            nextIs(18);
            if (this.cursor == null || !(((LdcInsnNode) this.cursor).cst instanceof String) || !((String) ((LdcInsnNode) this.cursor).cst).startsWith("Super calls with default arguments not supported in this target")) {
                this.cursor = null;
            }
            nextIsInvoke(Opcodes.INVOKESPECIAL, "java/lang/UnsupportedOperationException", "<init>", "(Ljava/lang/String;)V");
            nextIs(Opcodes.ATHROW);
            if (this.cursor != null) {
                iFilterOutput.ignore(methodNode.instructions.getFirst(), this.cursor);
                next();
            } else {
                this.cursor = skipNonOpcodes(methodNode.instructions.getFirst());
            }
            HashSet<AbstractInsnNode> hashSet = new HashSet();
            int iMaskVar = maskVar(methodNode.desc, z);
            while (this.cursor.getOpcode() == 21 && ((VarInsnNode) this.cursor).var == iMaskVar) {
                next();
                nextIs(126);
                nextIs(153);
                if (this.cursor == null) {
                    return;
                }
                hashSet.add(this.cursor);
                this.cursor = ((JumpInsnNode) this.cursor).label;
                skipNonOpcodes();
            }
            for (AbstractInsnNode abstractInsnNode : hashSet) {
                iFilterOutput.ignore(abstractInsnNode, abstractInsnNode);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        private static int maskVar(String str, boolean z) {
            Type[] argumentTypes = Type.getMethodType(str).getArgumentTypes();
            int length = argumentTypes.length - 2;
            int i = 0;
            int i2 = z;
            while (i < length) {
                int size = i2 + argumentTypes[i].getSize();
                i++;
                i2 = size;
            }
            return i2;
        }
    }
}
