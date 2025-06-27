package com.facebook.ads.redexgen.uinode;

import android.app.Activity;
import android.app.AlertDialog;
import android.widget.EditText;
import com.facebook.ads.internal.util.activity.ActivityUtils;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.io.encoding.Base64;
import okio.Utf8;
import org.objectweb.asm.Opcodes;

/* loaded from: assets/audience_network.dex */
public class UY implements M3 {
    public static byte[] A04;
    public C1206Ym A00;
    public C8S A01;
    public RK A02;
    public final Executor A03;

    static {
        A06();
    }

    public static String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 127);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A06() {
        A04 = new byte[]{107, 110, 110, 104, 109, 96, 104, 106, 111, 107, 106, 105, 110, 104, 107, 64, 75, 69, 66, 65, 71, 70, 64, 66, 74, 74, 71, 70, 65, 70, 64, 79, 69, 79, 67, 69, 79, 66, 70, 79, 79, 65, 79, 70, 71, 10, 79, 20, 16, 68, 79, 23, 71, 16, 68, 65, 66, 67, 65, 66, 64, 23, 64, 21, 64, 70, 18, 65, 70, 65, 16, 67, 20, 21, 68, 69, 21, 68, 116, 86, 89, 84, 82, 91, 30, 50, 42, 115, 60, 39, 59, 54, 33, 32, 115, Utf8.REPLACEMENT_BYTE, 60, 52, 58, Base64.padSymbol, 115, 50, 32, 115, 42, 60, 38, 115, 39, 60, 115, 55, 54, 49, 38, 52, 108, 115, 27, 60, 36, 115, 55, 60, 115, 42, 60, 38, 115, 33, 54, 35, 33, 60, 55, 38, 48, 54, 115, 39, 59, 54, 115, 58, 32, 32, 38, 54, 108, 83, 101, 110, 100, 32, 82, 101, 112, 111, 114, 116, 52, 11, 2, 23, 67, 43, 2, 19, 19, 6, 13, 6, 7, 92, 27, 25, 25, 31, 9, 9, 37, 14, 21, 17, 31, 20, 14, 12, 25, 8, 10, 2, 31, 20, 50, 4, 9, 42, 37, 32, 44, 39, Base64.padSymbol, 22, Base64.padSymbol, 32, 36, 44, 90, 85, 80, 92, 87, 77, 102, 77, 86, 82, 92, 87, 108, 96, 97, 105, 102, 104, 80, 102, 107, 32, 33, 55, 39, 54, 45, 52, 48, 45, 43, 42, Base64.padSymbol, 53, 36, 49, 52, 49, 36, 49, 116, 112, 106, 122, 70, 112, 119, Byte.MAX_VALUE, 118, 106, 108, 122, 109, 64, 118, 123, 122, 113, 107, 118, 121, 118, 122, 109};
    }

    public UY(Executor executor, C8S c8s, C1207Yn c1207Yn) {
        C1206Ym c1206YmA01 = c1207Yn.A01();
        this.A00 = c1206YmA01;
        this.A02 = C1018Rc.A01(c1206YmA01);
        this.A03 = executor;
        this.A01 = c8s;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> A02(String str) {
        RY ry = new RY();
        RY ry2 = new RY();
        RY ry3 = new RY();
        ry.put(A03(257, 15, 96), C6E.A00().A03());
        ry.put(A03(220, 9, 112), A03(15, 15, 13));
        ry.put(A03(Opcodes.INVOKEDYNAMIC, 11, 18), A03(0, 15, 38));
        ry.put(A03(Opcodes.FRETURN, 12, 5), A03(30, 48, 9));
        ry.put(A03(Opcodes.MULTIANEWARRAY, 11, 54), (System.currentTimeMillis() / 1000) + A03(0, 0, 125));
        String strA07 = this.A01.A07();
        if (strA07 != null) {
            ry3.put(A03(208, 12, 70), strA07);
        }
        ry2.put(A03(229, 11, 59), str);
        ry2.put(A03(248, 9, 102), LJ.A01(ry3));
        ry.A04(A03(240, 8, 47), LJ.A01(ry2));
        return ry;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07(C8S c8s) {
        this.A01 = c8s;
    }

    @Override // com.facebook.ads.redexgen.uinode.M3
    public final void AD6() {
        Activity activityA00 = ActivityUtils.A00();
        if (activityA00 == null) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(activityA00);
        builder.setTitle(A03(Opcodes.IF_ICMPNE, 14, 28));
        EditText editText = new EditText(activityA00);
        editText.setSingleLine(false);
        editText.setImeOptions(1073741824);
        editText.setHint(A03(84, 65, 44));
        editText.setMaxLines(2);
        editText.setMinLines(2);
        builder.setView(editText);
        builder.setNegativeButton(A03(78, 6, 72), new M0(this));
        builder.setPositiveButton(A03(Opcodes.FCMPL, 11, 127), new M1(this, editText));
        builder.create().show();
    }
}
