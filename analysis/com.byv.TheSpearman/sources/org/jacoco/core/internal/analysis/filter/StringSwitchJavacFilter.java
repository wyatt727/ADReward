package org.jacoco.core.internal.analysis.filter;

import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import java.util.Iterator;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.JumpInsnNode;
import org.objectweb.asm.tree.LabelNode;
import org.objectweb.asm.tree.LookupSwitchInsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.TableSwitchInsnNode;

/* loaded from: classes5.dex */
public final class StringSwitchJavacFilter implements IFilter {
    @Override // org.jacoco.core.internal.analysis.filter.IFilter
    public void filter(MethodNode methodNode, IFilterContext iFilterContext, IFilterOutput iFilterOutput) {
        Iterator<AbstractInsnNode> it = methodNode.instructions.iterator();
        while (it.hasNext()) {
            filter(it.next(), iFilterOutput);
        }
    }

    private void filter(AbstractInsnNode abstractInsnNode, IFilterOutput iFilterOutput) {
        LabelNode labelNode;
        if (abstractInsnNode.getOpcode() == 171) {
            labelNode = ((LookupSwitchInsnNode) abstractInsnNode).dflt;
        } else if (abstractInsnNode.getOpcode() != 170) {
            return;
        } else {
            labelNode = ((TableSwitchInsnNode) abstractInsnNode).dflt;
        }
        if (new Matcher().match(abstractInsnNode, labelNode)) {
            iFilterOutput.ignore(abstractInsnNode, labelNode);
        }
    }

    private static class Matcher extends AbstractMatcher {
        private Matcher() {
        }

        boolean match(AbstractInsnNode abstractInsnNode, AbstractInsnNode abstractInsnNode2) {
            this.cursor = abstractInsnNode;
            for (int i = 0; this.cursor != null && i < 4; i++) {
                this.cursor = this.cursor.getPrevious();
            }
            if (this.cursor != null && this.cursor.getOpcode() == 2) {
                nextIsVar(54, "c");
                nextIsVar(25, CmcdHeadersFactory.STREAMING_FORMAT_SS);
                nextIsInvoke(Opcodes.INVOKEVIRTUAL, "java/lang/String", "hashCode", "()I");
                next();
                do {
                    nextIsVar(25, CmcdHeadersFactory.STREAMING_FORMAT_SS);
                    nextIs(18);
                    nextIsInvoke(Opcodes.INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z");
                    nextIs(153);
                    next();
                    nextIsVar(54, "c");
                    if (this.cursor == null) {
                        return false;
                    }
                    if (this.cursor.getNext() != abstractInsnNode2) {
                        nextIs(Opcodes.GOTO);
                        if (this.cursor == null) {
                            return false;
                        }
                    } else {
                        nextIsVar(21, "c");
                        nextIsSwitch();
                        return this.cursor != null;
                    }
                } while (((JumpInsnNode) this.cursor).label == abstractInsnNode2);
            }
            return false;
        }
    }
}
