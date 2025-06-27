package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.Pair;
import java.util.HashMap;
import java.util.Map;

/* compiled from: DrawableUtils.java */
/* loaded from: classes2.dex */
public class VwS {
    private static final Map<String, Pair<? extends Drawable, Integer>> EYQ = new HashMap();
    private static Integer mZx = null;

    public static Drawable EYQ(Context context, String str) {
        Pair<? extends Drawable, Integer> pair;
        if (mZx == null) {
            mZx = Integer.valueOf(com.bytedance.sdk.openadsdk.core.hu.Pm().oB());
        }
        if (mZx.intValue() <= 0) {
            "drawable name is: ".concat(String.valueOf(str));
            return com.bytedance.sdk.component.utils.zF.Td(context, str);
        }
        "drawable name is: ".concat(String.valueOf(str));
        Map<String, Pair<? extends Drawable, Integer>> map = EYQ;
        Integer.valueOf(map.size());
        if (map.containsKey(str) && (pair = map.get(str)) != null) {
            Drawable drawable = (Drawable) pair.first;
            map.put(str, new Pair<>(drawable, Integer.valueOf(((Integer) pair.second).intValue() + 1)));
            return drawable;
        }
        EYQ();
        return EYQ(str, context);
    }

    private static Drawable EYQ(String str, Context context) {
        GradientDrawable gradientDrawableEYQ;
        GradientDrawable gradientDrawable;
        str.hashCode();
        switch (str) {
            case "tt_dislike_dialog_bg":
                gradientDrawableEYQ = EYQ(0, Integer.valueOf(Color.parseColor("#ffffff")), new int[]{tr.mZx(context, 8.0f)}, null, null, null);
                break;
            case "tt_seek_thumb_normal":
                gradientDrawableEYQ = EYQ(1, Integer.valueOf(Color.parseColor("#ffffffff")), null, new int[]{tr.mZx(context, 15.0f), tr.mZx(context, 15.0f)}, Integer.valueOf(tr.mZx(context, 1.0f)), 0);
                break;
            case "tt_ad_report_info_bg":
                gradientDrawableEYQ = EYQ(0, Integer.valueOf(Color.parseColor("#FFFFFF")), new int[]{tr.mZx(context, 12.0f), tr.mZx(context, 12.0f), 0, 0}, null, null, null);
                break;
            case "tt_playable_btn_bk":
                gradientDrawableEYQ = EYQ(0, Integer.valueOf(com.bytedance.sdk.component.utils.zF.QQ(context, "tt_transparent")), new int[]{tr.mZx(context, 30.0f)}, null, Integer.valueOf(tr.mZx(context, 1.0f)), Integer.valueOf(com.bytedance.sdk.component.utils.zF.QQ(context, "tt_white")));
                break;
            case "tt_seek_thumb_fullscreen":
                gradientDrawableEYQ = EYQ(1, Integer.valueOf(Color.parseColor("#ffffffff")), null, new int[]{tr.mZx(context, 18.0f), tr.mZx(context, 18.0f)}, null, null);
                break;
            case "tt_custom_dialog_bg":
                gradientDrawableEYQ = EYQ(0, Integer.valueOf(Color.parseColor("#ffffff")), new int[]{tr.mZx(context, 6.0f)}, null, Integer.valueOf(tr.mZx(context, 0.8f)), Integer.valueOf(Color.parseColor("#ffffff")));
                break;
            case "tt_ad_loading_three_mid":
                gradientDrawableEYQ = EYQ(0, null, null, null, Integer.valueOf(tr.mZx(context, 1.5f)), Integer.valueOf(Color.parseColor("#ffffff")));
                break;
            case "tt_mute_btn_bg":
                gradientDrawableEYQ = EYQ(1, Integer.valueOf(Color.parseColor("#99333333")), null, new int[]{tr.mZx(context, 28.0f), tr.mZx(context, 28.0f)}, null, null);
                break;
            case "tt_reward_countdown_bg":
                gradientDrawableEYQ = EYQ(1, Integer.valueOf(Color.parseColor("#99333333")), null, new int[]{tr.mZx(context, 28.0f), tr.mZx(context, 28.0f)}, null, null);
                break;
            case "tt_ad_landing_loading_three_mid":
                gradientDrawableEYQ = EYQ(0, null, null, null, Integer.valueOf(tr.mZx(context, 1.5f)), Integer.valueOf(Color.parseColor("#ABACB0")));
                break;
            case "tt_pangle_ad_mute_btn_bg":
                gradientDrawableEYQ = EYQ(1, Integer.valueOf(Color.parseColor("#99333333")), null, new int[]{tr.mZx(context, 28.0f), tr.mZx(context, 28.0f)}, null, null);
                break;
            case "tt_video_black_desc_gradient":
                gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setGradientType(0);
                gradientDrawable.setColors(new int[]{com.bytedance.sdk.component.utils.zF.QQ(context, "tt_trans_half_black"), com.bytedance.sdk.component.utils.zF.QQ(context, "tt_trans_black")});
                gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
                gradientDrawableEYQ = gradientDrawable;
                break;
            case "tt_ad_loading_three_left":
                gradientDrawableEYQ = EYQ(0, null, new int[]{tr.mZx(context, 6.0f), 0, 0, tr.mZx(context, 6.0f)}, null, Integer.valueOf(tr.mZx(context, 1.5f)), Integer.valueOf(Color.parseColor("#ffffff")));
                break;
            case "tt_dislike_top_bg":
                gradientDrawableEYQ = EYQ(0, Integer.valueOf(com.bytedance.sdk.component.utils.zF.QQ(context, "tt_listview")), new int[]{tr.mZx(context, 5.0f), tr.mZx(context, 5.0f), 0, 0}, null, null, null);
                break;
            case "tt_comment_tv":
                gradientDrawableEYQ = EYQ(0, Integer.valueOf(Color.parseColor("#ffffff")), new int[]{tr.mZx(context, 4.0f)}, null, Integer.valueOf(tr.mZx(context, 1.0f)), Integer.valueOf(Color.parseColor("#0F161823")));
                break;
            case "tt_reward_full_new_bar_bg":
                gradientDrawableEYQ = EYQ(0, Integer.valueOf(Color.parseColor("#ccffffff")), new int[]{tr.mZx(context, 18.0f)}, null, null, null);
                break;
            case "tt_reward_full_video_backup_btn_bg":
                gradientDrawableEYQ = EYQ(0, Integer.valueOf(Color.parseColor("#ff0088ff")), new int[]{tr.mZx(context, 6.0f)}, null, null, null);
                break;
            case "tt_detail_video_btn_bg":
                gradientDrawableEYQ = EYQ(0, Integer.valueOf(Color.parseColor("#26000000")), new int[]{tr.mZx(context, 4.0f)}, null, null, null);
                break;
            case "tt_pangle_banner_btn_bg":
                gradientDrawableEYQ = EYQ(0, Integer.valueOf(Color.parseColor("#ff2f87f8")), new int[]{tr.mZx(context, 2.0f)}, new int[]{tr.mZx(context, 98.0f), tr.mZx(context, 25.0f)}, null, null);
                break;
            case "tt_seek_thumb_fullscreen_press":
                gradientDrawableEYQ = EYQ(1, Integer.valueOf(Color.parseColor("#ffffffff")), null, new int[]{tr.mZx(context, 18.0f), tr.mZx(context, 18.0f)}, Integer.valueOf(tr.mZx(context, 1.0f)), 0);
                break;
            case "tt_ad_loading_three_right":
                gradientDrawableEYQ = EYQ(0, null, new int[]{0, tr.mZx(context, 6.0f), tr.mZx(context, 6.0f), 0}, null, Integer.valueOf(tr.mZx(context, 1.5f)), Integer.valueOf(Color.parseColor("#ffffff")));
                break;
            case "tt_pangle_btn_bg":
                gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setSize(tr.mZx(context, 280.0f), tr.mZx(context, 38.0f));
                gradientDrawable.setCornerRadius(tr.mZx(context, 19.0f));
                gradientDrawable.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
                gradientDrawable.setColors(new int[]{Color.parseColor("#fff02d42"), Color.parseColor("#fffc4b3c")});
                gradientDrawable.setGradientType(0);
                gradientDrawable.setUseLevel(true);
                gradientDrawableEYQ = gradientDrawable;
                break;
            case "tt_privacy_btn_bg":
                gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setSize(tr.mZx(context, 258.0f), tr.mZx(context, 43.0f));
                gradientDrawable.setCornerRadius(tr.mZx(context, 22.0f));
                gradientDrawable.setColors(new int[]{Color.parseColor("#73CBFC"), Color.parseColor("#3F9CF7")});
                gradientDrawable.setGradientType(0);
                gradientDrawableEYQ = gradientDrawable;
                break;
            case "tt_seek_thumb_press":
                gradientDrawableEYQ = EYQ(1, Integer.valueOf(Color.parseColor("#ffffffff")), null, new int[]{tr.mZx(context, 22.0f), tr.mZx(context, 22.0f)}, Integer.valueOf(tr.mZx(context, 1.0f)), 0);
                break;
            case "tt_ad_landing_loading_three_right":
                gradientDrawableEYQ = EYQ(0, null, new int[]{0, tr.mZx(context, 6.0f), tr.mZx(context, 6.0f), 0}, null, Integer.valueOf(tr.mZx(context, 1.5f)), Integer.valueOf(Color.parseColor("#ABACB0")));
                break;
            case "tt_landingpage_loading_text_rect":
                gradientDrawableEYQ = EYQ(0, Integer.valueOf(Color.parseColor("#141A73E8")), new int[]{tr.mZx(context, 5.0f)}, null, null, null);
                break;
            case "tt_circle_solid_mian":
                gradientDrawableEYQ = EYQ(1, Integer.valueOf(com.bytedance.sdk.component.utils.zF.QQ(context, "tt_ssxinmian1")), null, null, null, null);
                break;
            case "tt_download_corner_bg":
                gradientDrawableEYQ = EYQ(0, Integer.valueOf(com.bytedance.sdk.component.utils.zF.QQ(context, "tt_download_text_background")), new int[]{tr.mZx(context, 4.0f)}, null, null, null);
                break;
            case "tt_ad_landing_loading_three_left":
                gradientDrawableEYQ = EYQ(0, null, new int[]{tr.mZx(context, 6.0f), 0, 0, tr.mZx(context, 6.0f)}, null, Integer.valueOf(tr.mZx(context, 1.5f)), Integer.valueOf(Color.parseColor("#ABACB0")));
                break;
            case "tt_pangle_ad_close_btn_bg":
                gradientDrawableEYQ = EYQ(1, Integer.valueOf(Color.parseColor("#30333333")), null, new int[]{tr.mZx(context, 28.0f), tr.mZx(context, 28.0f)}, null, null);
                break;
            case "tt_reward_video_download_btn_bg":
                gradientDrawableEYQ = EYQ(0, Integer.valueOf(Color.parseColor("#ff007aff")), new int[]{tr.mZx(context, 18.0f)}, null, null, null);
                break;
            case "tt_ad_loading_rect":
                gradientDrawableEYQ = EYQ(0, Integer.valueOf(Color.parseColor("#33FFFFFF")), new int[]{tr.mZx(context, 15.0f)}, null, null, null);
                break;
            case "tt_ad_skip_btn_bg2":
                gradientDrawableEYQ = EYQ(0, Integer.valueOf(Color.parseColor("#66161823")), new int[]{tr.mZx(context, 14.0f)}, null, null, null);
                break;
            case "tt_privacy_webview_bg":
                gradientDrawableEYQ = EYQ(0, Integer.valueOf(Color.parseColor("#ffffff")), new int[]{tr.mZx(context, 14.5f)}, null, null, null);
                break;
            default:
                gradientDrawableEYQ = null;
                break;
        }
        EYQ.put(str, new Pair<>(gradientDrawableEYQ, 1));
        return gradientDrawableEYQ;
    }

    private static void EYQ() {
        Map<String, Pair<? extends Drawable, Integer>> map = EYQ;
        if (map.size() < mZx.intValue()) {
            return;
        }
        String key = null;
        int iIntValue = Integer.MAX_VALUE;
        for (Map.Entry<String, Pair<? extends Drawable, Integer>> entry : map.entrySet()) {
            if (((Integer) entry.getValue().second).intValue() < iIntValue) {
                key = entry.getKey();
                iIntValue = ((Integer) entry.getValue().second).intValue();
                if (iIntValue == 1) {
                    break;
                }
            }
        }
        EYQ.remove(key);
    }

    private static GradientDrawable EYQ(int i, Integer num, int[] iArr, int[] iArr2, Integer num2, Integer num3) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(i);
        if (num != null) {
            gradientDrawable.setColor(num.intValue());
        }
        int length = iArr != null ? iArr.length : 0;
        if (length == 1) {
            gradientDrawable.setCornerRadius(iArr[0]);
        } else if (length == 4) {
            gradientDrawable.setCornerRadii(new float[]{iArr[0], iArr[0], iArr[1], iArr[1], iArr[2], iArr[2], iArr[3], iArr[3]});
        }
        if (iArr2 != null && iArr2.length == 2) {
            gradientDrawable.setSize(iArr2[0], iArr2[1]);
        }
        if (num2 != null && num3 != null) {
            gradientDrawable.setStroke(num2.intValue(), num3.intValue());
        }
        return gradientDrawable;
    }
}
