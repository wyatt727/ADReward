package com.google.android.exoplayer2.text.ssa;

import android.text.Layout;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.SimpleSubtitleDecoder;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.text.ssa.SsaStyle;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import com.google.common.base.Ascii;
import com.google.common.base.Charsets;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Deprecated
/* loaded from: classes2.dex */
public final class SsaDecoder extends SimpleSubtitleDecoder {
    private static final float DEFAULT_MARGIN = 0.05f;
    private static final String DIALOGUE_LINE_PREFIX = "Dialogue:";
    static final String FORMAT_LINE_PREFIX = "Format:";
    private static final Pattern SSA_TIMECODE_PATTERN = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    static final String STYLE_LINE_PREFIX = "Style:";
    private static final String TAG = "SsaDecoder";
    private final SsaDialogueFormat dialogueFormatFromInitializationData;
    private final boolean haveInitializationData;
    private float screenHeight;
    private float screenWidth;
    private Map<String, SsaStyle> styles;

    private static float computeDefaultLineOrPosition(int i) {
        if (i == 0) {
            return DEFAULT_MARGIN;
        }
        if (i != 1) {
            return i != 2 ? -3.4028235E38f : 0.95f;
        }
        return 0.5f;
    }

    public SsaDecoder() {
        this(null);
    }

    public SsaDecoder(List<byte[]> list) {
        super(TAG);
        this.screenWidth = -3.4028235E38f;
        this.screenHeight = -3.4028235E38f;
        if (list != null && !list.isEmpty()) {
            this.haveInitializationData = true;
            String strFromUtf8Bytes = Util.fromUtf8Bytes(list.get(0));
            Assertions.checkArgument(strFromUtf8Bytes.startsWith(FORMAT_LINE_PREFIX));
            this.dialogueFormatFromInitializationData = (SsaDialogueFormat) Assertions.checkNotNull(SsaDialogueFormat.fromFormatLine(strFromUtf8Bytes));
            parseHeader(new ParsableByteArray(list.get(1)), Charsets.UTF_8);
            return;
        }
        this.haveInitializationData = false;
        this.dialogueFormatFromInitializationData = null;
    }

    @Override // com.google.android.exoplayer2.text.SimpleSubtitleDecoder
    protected Subtitle decode(byte[] bArr, int i, boolean z) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ParsableByteArray parsableByteArray = new ParsableByteArray(bArr, i);
        Charset charsetDetectUtfCharset = detectUtfCharset(parsableByteArray);
        if (!this.haveInitializationData) {
            parseHeader(parsableByteArray, charsetDetectUtfCharset);
        }
        parseEventBody(parsableByteArray, arrayList, arrayList2, charsetDetectUtfCharset);
        return new SsaSubtitle(arrayList, arrayList2);
    }

    private Charset detectUtfCharset(ParsableByteArray parsableByteArray) {
        Charset utfCharsetFromBom = parsableByteArray.readUtfCharsetFromBom();
        return utfCharsetFromBom != null ? utfCharsetFromBom : Charsets.UTF_8;
    }

    private void parseHeader(ParsableByteArray parsableByteArray, Charset charset) {
        while (true) {
            String line = parsableByteArray.readLine(charset);
            if (line == null) {
                return;
            }
            if ("[Script Info]".equalsIgnoreCase(line)) {
                parseScriptInfo(parsableByteArray, charset);
            } else if ("[V4+ Styles]".equalsIgnoreCase(line)) {
                this.styles = parseStyles(parsableByteArray, charset);
            } else if ("[V4 Styles]".equalsIgnoreCase(line)) {
                Log.i(TAG, "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(line)) {
                return;
            }
        }
    }

    private void parseScriptInfo(ParsableByteArray parsableByteArray, Charset charset) {
        while (true) {
            String line = parsableByteArray.readLine(charset);
            if (line == null) {
                return;
            }
            if (parsableByteArray.bytesLeft() != 0 && parsableByteArray.peekChar(charset) == '[') {
                return;
            }
            String[] strArrSplit = line.split(":");
            if (strArrSplit.length == 2) {
                String lowerCase = Ascii.toLowerCase(strArrSplit[0].trim());
                lowerCase.hashCode();
                if (lowerCase.equals("playresx")) {
                    this.screenWidth = Float.parseFloat(strArrSplit[1].trim());
                } else if (lowerCase.equals("playresy")) {
                    try {
                        this.screenHeight = Float.parseFloat(strArrSplit[1].trim());
                    } catch (NumberFormatException unused) {
                    }
                }
            }
        }
    }

    private static Map<String, SsaStyle> parseStyles(ParsableByteArray parsableByteArray, Charset charset) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        SsaStyle.Format formatFromFormatLine = null;
        while (true) {
            String line = parsableByteArray.readLine(charset);
            if (line == null || (parsableByteArray.bytesLeft() != 0 && parsableByteArray.peekChar(charset) == '[')) {
                break;
            }
            if (line.startsWith(FORMAT_LINE_PREFIX)) {
                formatFromFormatLine = SsaStyle.Format.fromFormatLine(line);
            } else if (line.startsWith(STYLE_LINE_PREFIX)) {
                if (formatFromFormatLine == null) {
                    Log.w(TAG, "Skipping 'Style:' line before 'Format:' line: " + line);
                } else {
                    SsaStyle ssaStyleFromStyleLine = SsaStyle.fromStyleLine(line, formatFromFormatLine);
                    if (ssaStyleFromStyleLine != null) {
                        linkedHashMap.put(ssaStyleFromStyleLine.name, ssaStyleFromStyleLine);
                    }
                }
            }
        }
        return linkedHashMap;
    }

    private void parseEventBody(ParsableByteArray parsableByteArray, List<List<Cue>> list, List<Long> list2, Charset charset) {
        SsaDialogueFormat ssaDialogueFormatFromFormatLine = this.haveInitializationData ? this.dialogueFormatFromInitializationData : null;
        while (true) {
            String line = parsableByteArray.readLine(charset);
            if (line == null) {
                return;
            }
            if (line.startsWith(FORMAT_LINE_PREFIX)) {
                ssaDialogueFormatFromFormatLine = SsaDialogueFormat.fromFormatLine(line);
            } else if (line.startsWith(DIALOGUE_LINE_PREFIX)) {
                if (ssaDialogueFormatFromFormatLine == null) {
                    Log.w(TAG, "Skipping dialogue line before complete format: " + line);
                } else {
                    parseDialogueLine(line, ssaDialogueFormatFromFormatLine, list, list2);
                }
            }
        }
    }

    private void parseDialogueLine(String str, SsaDialogueFormat ssaDialogueFormat, List<List<Cue>> list, List<Long> list2) {
        Assertions.checkArgument(str.startsWith(DIALOGUE_LINE_PREFIX));
        String[] strArrSplit = str.substring(9).split(",", ssaDialogueFormat.length);
        if (strArrSplit.length != ssaDialogueFormat.length) {
            Log.w(TAG, "Skipping dialogue line with fewer columns than format: " + str);
            return;
        }
        long timecodeUs = parseTimecodeUs(strArrSplit[ssaDialogueFormat.startTimeIndex]);
        if (timecodeUs == -9223372036854775807L) {
            Log.w(TAG, "Skipping invalid timing: " + str);
            return;
        }
        long timecodeUs2 = parseTimecodeUs(strArrSplit[ssaDialogueFormat.endTimeIndex]);
        if (timecodeUs2 == -9223372036854775807L) {
            Log.w(TAG, "Skipping invalid timing: " + str);
            return;
        }
        SsaStyle ssaStyle = (this.styles == null || ssaDialogueFormat.styleIndex == -1) ? null : this.styles.get(strArrSplit[ssaDialogueFormat.styleIndex].trim());
        String str2 = strArrSplit[ssaDialogueFormat.textIndex];
        Cue cueCreateCue = createCue(SsaStyle.Overrides.stripStyleOverrides(str2).replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " "), ssaStyle, SsaStyle.Overrides.parseFromDialogue(str2), this.screenWidth, this.screenHeight);
        int iAddCuePlacerholderByTime = addCuePlacerholderByTime(timecodeUs2, list2, list);
        for (int iAddCuePlacerholderByTime2 = addCuePlacerholderByTime(timecodeUs, list2, list); iAddCuePlacerholderByTime2 < iAddCuePlacerholderByTime; iAddCuePlacerholderByTime2++) {
            list.get(iAddCuePlacerholderByTime2).add(cueCreateCue);
        }
    }

    private static long parseTimecodeUs(String str) {
        Matcher matcher = SSA_TIMECODE_PATTERN.matcher(str.trim());
        if (matcher.matches()) {
            return (Long.parseLong((String) Util.castNonNull(matcher.group(1))) * 60 * 60 * 1000000) + (Long.parseLong((String) Util.castNonNull(matcher.group(2))) * 60 * 1000000) + (Long.parseLong((String) Util.castNonNull(matcher.group(3))) * 1000000) + (Long.parseLong((String) Util.castNonNull(matcher.group(4))) * 10000);
        }
        return -9223372036854775807L;
    }

    private static Cue createCue(String str, SsaStyle ssaStyle, SsaStyle.Overrides overrides, float f, float f2) {
        SpannableString spannableString = new SpannableString(str);
        Cue.Builder text = new Cue.Builder().setText(spannableString);
        if (ssaStyle != null) {
            if (ssaStyle.primaryColor != null) {
                spannableString.setSpan(new ForegroundColorSpan(ssaStyle.primaryColor.intValue()), 0, spannableString.length(), 33);
            }
            if (ssaStyle.borderStyle == 3 && ssaStyle.outlineColor != null) {
                spannableString.setSpan(new BackgroundColorSpan(ssaStyle.outlineColor.intValue()), 0, spannableString.length(), 33);
            }
            if (ssaStyle.fontSize != -3.4028235E38f && f2 != -3.4028235E38f) {
                text.setTextSize(ssaStyle.fontSize / f2, 1);
            }
            if (ssaStyle.bold && ssaStyle.italic) {
                spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
            } else if (ssaStyle.bold) {
                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
            } else if (ssaStyle.italic) {
                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
            }
            if (ssaStyle.underline) {
                spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 33);
            }
            if (ssaStyle.strikeout) {
                spannableString.setSpan(new StrikethroughSpan(), 0, spannableString.length(), 33);
            }
        }
        int i = -1;
        if (overrides.alignment != -1) {
            i = overrides.alignment;
        } else if (ssaStyle != null) {
            i = ssaStyle.alignment;
        }
        text.setTextAlignment(toTextAlignment(i)).setPositionAnchor(toPositionAnchor(i)).setLineAnchor(toLineAnchor(i));
        if (overrides.position != null && f2 != -3.4028235E38f && f != -3.4028235E38f) {
            text.setPosition(overrides.position.x / f);
            text.setLine(overrides.position.y / f2, 0);
        } else {
            text.setPosition(computeDefaultLineOrPosition(text.getPositionAnchor()));
            text.setLine(computeDefaultLineOrPosition(text.getLineAnchor()), 0);
        }
        return text.build();
    }

    private static Layout.Alignment toTextAlignment(int i) {
        switch (i) {
            case -1:
                return null;
            case 0:
            default:
                Log.w(TAG, "Unknown alignment: " + i);
                return null;
            case 1:
            case 4:
            case 7:
                return Layout.Alignment.ALIGN_NORMAL;
            case 2:
            case 5:
            case 8:
                return Layout.Alignment.ALIGN_CENTER;
            case 3:
            case 6:
            case 9:
                return Layout.Alignment.ALIGN_OPPOSITE;
        }
    }

    private static int toLineAnchor(int i) {
        switch (i) {
            case -1:
                break;
            case 0:
            default:
                Log.w(TAG, "Unknown alignment: " + i);
                break;
            case 1:
            case 2:
            case 3:
                break;
            case 4:
            case 5:
            case 6:
                break;
            case 7:
            case 8:
            case 9:
                break;
        }
        return Integer.MIN_VALUE;
    }

    private static int toPositionAnchor(int i) {
        switch (i) {
            case -1:
                break;
            case 0:
            default:
                Log.w(TAG, "Unknown alignment: " + i);
                break;
            case 1:
            case 4:
            case 7:
                break;
            case 2:
            case 5:
            case 8:
                break;
            case 3:
            case 6:
            case 9:
                break;
        }
        return Integer.MIN_VALUE;
    }

    private static int addCuePlacerholderByTime(long j, List<Long> list, List<List<Cue>> list2) {
        int i;
        int size = list.size() - 1;
        while (true) {
            if (size < 0) {
                i = 0;
                break;
            }
            if (list.get(size).longValue() == j) {
                return size;
            }
            if (list.get(size).longValue() < j) {
                i = size + 1;
                break;
            }
            size--;
        }
        list.add(i, Long.valueOf(j));
        list2.add(i, i == 0 ? new ArrayList() : new ArrayList(list2.get(i - 1)));
        return i;
    }
}
