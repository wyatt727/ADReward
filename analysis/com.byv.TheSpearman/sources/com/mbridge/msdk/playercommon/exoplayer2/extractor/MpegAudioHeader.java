package com.mbridge.msdk.playercommon.exoplayer2.extractor;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.audio.OpusUtil;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.DefaultOggSeeker;
import org.objectweb.asm.Opcodes;

/* loaded from: classes4.dex */
public final class MpegAudioHeader {
    public static final int MAX_FRAME_SIZE_BYTES = 4096;
    public int bitrate;
    public int channels;
    public int frameSize;
    public String mimeType;
    public int sampleRate;
    public int samplesPerFrame;
    public int version;
    private static final String[] MIME_TYPE_BY_LAYER = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};
    private static final int[] SAMPLING_RATE_V1 = {44100, OpusUtil.SAMPLE_RATE, 32000};
    private static final int[] BITRATE_V1_L1 = {32, 64, 96, 128, Opcodes.IF_ICMPNE, 192, 224, 256, 288, 320, 352, RendererCapabilities.MODE_SUPPORT_MASK, TypedValues.CycleType.TYPE_PATH_ROTATE, 448};
    private static final int[] BITRATE_V2_L1 = {32, 48, 56, 64, 80, 96, 112, 128, Opcodes.D2F, Opcodes.IF_ICMPNE, Opcodes.ARETURN, 192, 224, 256};
    private static final int[] BITRATE_V1_L2 = {32, 48, 56, 64, 80, 96, 112, 128, Opcodes.IF_ICMPNE, 192, 224, 256, 320, RendererCapabilities.MODE_SUPPORT_MASK};
    private static final int[] BITRATE_V1_L3 = {32, 40, 48, 56, 64, 80, 96, 112, 128, Opcodes.IF_ICMPNE, 192, 224, 256, 320};
    private static final int[] BITRATE_V2 = {8, 16, 24, 32, 40, 48, 56, 64, 80, 96, 112, 128, Opcodes.D2F, Opcodes.IF_ICMPNE};

    public static int getFrameSize(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if ((i & (-2097152)) != -2097152 || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return -1;
        }
        int i7 = SAMPLING_RATE_V1[i5];
        if (i2 == 2) {
            i7 /= 2;
        } else if (i2 == 0) {
            i7 /= 4;
        }
        int i8 = (i >>> 9) & 1;
        if (i3 == 3) {
            return ((((i2 == 3 ? BITRATE_V1_L1[i4 - 1] : BITRATE_V2_L1[i4 - 1]) * 12000) / i7) + i8) * 4;
        }
        if (i2 == 3) {
            i6 = i3 == 2 ? BITRATE_V1_L2[i4 - 1] : BITRATE_V1_L3[i4 - 1];
        } else {
            i6 = BITRATE_V2[i4 - 1];
        }
        if (i2 == 3) {
            return ((i6 * 144000) / i7) + i8;
        }
        return (((i3 == 1 ? DefaultOggSeeker.MATCH_RANGE : 144000) * i6) / i7) + i8;
    }

    public static boolean populateHeader(int i, MpegAudioHeader mpegAudioHeader) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        if ((i & (-2097152)) != -2097152 || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return false;
        }
        int i9 = SAMPLING_RATE_V1[i5];
        if (i2 == 2) {
            i9 /= 2;
        } else if (i2 == 0) {
            i9 /= 4;
        }
        int i10 = i9;
        int i11 = (i >>> 9) & 1;
        if (i3 == 3) {
            i6 = i2 == 3 ? BITRATE_V1_L1[i4 - 1] : BITRATE_V2_L1[i4 - 1];
            i8 = (((i6 * 12000) / i10) + i11) * 4;
            i7 = 384;
        } else {
            if (i2 == 3) {
                i6 = i3 == 2 ? BITRATE_V1_L2[i4 - 1] : BITRATE_V1_L3[i4 - 1];
            } else {
                i6 = BITRATE_V2[i4 - 1];
                i = i3 == 1 ? 576 : 1152;
                int i12 = i3 == 1 ? DefaultOggSeeker.MATCH_RANGE : 144000;
                i7 = i;
                i8 = ((i12 * i6) / i10) + i11;
            }
            i7 = i;
            i8 = ((i12 * i6) / i10) + i11;
        }
        mpegAudioHeader.setValues(i2, MIME_TYPE_BY_LAYER[3 - i3], i8, i10, ((i >> 6) & 3) == 3 ? 1 : 2, i6 * 1000, i7);
        return true;
    }

    private void setValues(int i, String str, int i2, int i3, int i4, int i5, int i6) {
        this.version = i;
        this.mimeType = str;
        this.frameSize = i2;
        this.sampleRate = i3;
        this.channels = i4;
        this.bitrate = i5;
        this.samplesPerFrame = i6;
    }
}
