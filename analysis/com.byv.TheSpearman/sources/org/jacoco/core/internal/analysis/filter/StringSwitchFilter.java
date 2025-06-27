package org.jacoco.core.internal.analysis.filter;

import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import java.util.HashSet;
import java.util.Iterator;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.JumpInsnNode;
import org.objectweb.asm.tree.LabelNode;
import org.objectweb.asm.tree.LookupSwitchInsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.TableSwitchInsnNode;
import org.objectweb.asm.tree.VarInsnNode;

/* loaded from: classes5.dex */
public final class StringSwitchFilter implements IFilter {
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
            LabelNode labelNode;
            int size;
            if (abstractInsnNode.getOpcode() == 58 || abstractInsnNode.getOpcode() == 25) {
                this.cursor = abstractInsnNode;
                nextIsInvoke(Opcodes.INVOKEVIRTUAL, "java/lang/String", "hashCode", "()I");
                nextIsSwitch();
                if (this.cursor == null) {
                    return;
                }
                this.vars.put(CmcdHeadersFactory.STREAMING_FORMAT_SS, (VarInsnNode) abstractInsnNode);
                AbstractInsnNode abstractInsnNode2 = this.cursor;
                if (abstractInsnNode2.getOpcode() == 171) {
                    LookupSwitchInsnNode lookupSwitchInsnNode = (LookupSwitchInsnNode) this.cursor;
                    labelNode = lookupSwitchInsnNode.dflt;
                    size = lookupSwitchInsnNode.labels.size();
                } else {
                    TableSwitchInsnNode tableSwitchInsnNode = (TableSwitchInsnNode) this.cursor;
                    labelNode = tableSwitchInsnNode.dflt;
                    size = tableSwitchInsnNode.labels.size();
                }
                if (size == 0) {
                    return;
                }
                HashSet hashSet = new HashSet();
                hashSet.add(skipNonOpcodes(labelNode));
                for (int i = 0; i < size; i++) {
                    while (true) {
                        nextIsVar(25, CmcdHeadersFactory.STREAMING_FORMAT_SS);
                        nextIs(18);
                        nextIsInvoke(Opcodes.INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z");
                        nextIs(154);
                        if (this.cursor == null) {
                            return;
                        }
                        hashSet.add(skipNonOpcodes(((JumpInsnNode) this.cursor).label));
                        if (this.cursor.getNext().getOpcode() == 167) {
                            nextIs(Opcodes.GOTO);
                            break;
                        } else if (this.cursor.getNext() == labelNode) {
                            break;
                        }
                    }
                }
                iFilterOutput.ignore(abstractInsnNode2.getNext(), this.cursor);
                iFilterOutput.replaceBranches(abstractInsnNode2, hashSet);
            }
        }
    }
}
