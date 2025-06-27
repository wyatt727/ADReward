package org.jacoco.core.internal.analysis;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jacoco.core.internal.flow.LabelInfo;
import org.objectweb.asm.Label;
import org.objectweb.asm.tree.AbstractInsnNode;

/* loaded from: classes5.dex */
class InstructionsBuilder {
    private final boolean[] probes;
    private int currentLine = -1;
    private Instruction currentInsn = null;
    private final Map<AbstractInsnNode, Instruction> instructions = new HashMap();
    private final List<Label> currentLabel = new ArrayList(2);
    private final List<Jump> jumps = new ArrayList();

    InstructionsBuilder(boolean[] zArr) {
        this.probes = zArr;
    }

    void setCurrentLine(int i) {
        this.currentLine = i;
    }

    void addLabel(Label label) {
        this.currentLabel.add(label);
        if (LabelInfo.isSuccessor(label)) {
            return;
        }
        noSuccessor();
    }

    void addInstruction(AbstractInsnNode abstractInsnNode) {
        Instruction instruction = new Instruction(this.currentLine);
        int size = this.currentLabel.size();
        if (size > 0) {
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else {
                    LabelInfo.setInstruction(this.currentLabel.get(size), instruction);
                }
            }
            this.currentLabel.clear();
        }
        Instruction instruction2 = this.currentInsn;
        if (instruction2 != null) {
            instruction2.addBranch(instruction, 0);
        }
        this.currentInsn = instruction;
        this.instructions.put(abstractInsnNode, instruction);
    }

    void noSuccessor() {
        this.currentInsn = null;
    }

    void addJump(Label label, int i) {
        this.jumps.add(new Jump(this.currentInsn, label, i));
    }

    void addProbe(int i, int i2) {
        boolean[] zArr = this.probes;
        this.currentInsn.addBranch(zArr != null && zArr[i], i2);
    }

    Map<AbstractInsnNode, Instruction> getInstructions() {
        Iterator<Jump> it = this.jumps.iterator();
        while (it.hasNext()) {
            it.next().wire();
        }
        return this.instructions;
    }

    private static class Jump {
        private final int branch;
        private final Instruction source;
        private final Label target;

        Jump(Instruction instruction, Label label, int i) {
            this.source = instruction;
            this.target = label;
            this.branch = i;
        }

        void wire() {
            this.source.addBranch(LabelInfo.getInstruction(this.target), this.branch);
        }
    }
}
