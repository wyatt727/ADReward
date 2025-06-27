package com.google.android.gms.games.internal.player;

import android.text.TextUtils;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzd {
    public final String name;
    public final String zzbe;
    public final String zzbj;
    public final String zzce;
    public final String zzhz;
    public final String zzia;
    public final String zzib;
    public final String zzic;
    public final String zzid;
    public final String zzie;
    public final String zzif;
    public final String zzig;
    public final String zzih;
    public final String zzii;
    public final String zzij;
    public final String zzik;
    public final String zzil;
    public final String zzim;
    public final String zzin;
    public final String zzio;
    private final String zzip;
    public final String zziq;
    public final String zzir;
    public final String zzis;
    public final String zzit;
    public final String zziu;
    public final String zziv;
    public final String zziw;
    public final String zzix;
    public final String zziy;
    public final String zziz;
    public final String zzja;
    public final String zzjb;

    @Deprecated
    private final String zzjc;

    @Deprecated
    private final String zzjd;

    @Deprecated
    private final String zzje;
    public final String zzjf;
    public final String zzjg;
    public final String zzjh;
    public final String zzji;
    private final String zzjj;
    public final String zzjk;

    public zzd(String str) {
        String strConcat;
        if (TextUtils.isEmpty(null)) {
            this.zzhz = "external_player_id";
            this.zzia = "profile_name";
            this.zzib = "profile_icon_image_uri";
            this.zzic = "profile_icon_image_url";
            this.zzid = "profile_hi_res_image_uri";
            this.zzie = "profile_hi_res_image_url";
            this.zzif = "last_updated";
            this.zzig = "is_in_circles";
            this.zzih = "played_with_timestamp";
            this.zzii = "current_xp_total";
            this.zzij = "current_level";
            this.zzik = "current_level_min_xp";
            this.zzil = "current_level_max_xp";
            this.zzim = "next_level";
            this.zzin = "next_level_max_xp";
            this.zzio = "last_level_up_timestamp";
            this.zzbe = "player_title";
            this.zzip = "has_all_public_acls";
            this.zziq = "is_profile_visible";
            this.zzir = "most_recent_external_game_id";
            this.zzis = "most_recent_game_name";
            this.zzit = "most_recent_activity_timestamp";
            this.zziu = "most_recent_game_icon_uri";
            this.zziv = "most_recent_game_hi_res_uri";
            this.zziw = "most_recent_game_featured_uri";
            this.zzix = "has_debug_access";
            this.zzbj = "gamer_tag";
            this.name = "real_name";
            this.zziy = "banner_image_landscape_uri";
            this.zziz = "banner_image_landscape_url";
            this.zzja = "banner_image_portrait_uri";
            this.zzjb = "banner_image_portrait_url";
            this.zzjc = "gamer_friend_status";
            this.zzjd = "gamer_friend_update_timestamp";
            this.zzje = "is_muted";
            this.zzjf = "total_unlocked_achievements";
            this.zzjg = com.google.android.gms.games.internal.zzd.zzda;
            this.zzjh = com.google.android.gms.games.internal.zzd.zzdb;
            this.zzji = com.google.android.gms.games.internal.zzd.zzdc;
            this.zzjj = "profile_creation_timestamp";
            this.zzce = com.google.android.gms.games.internal.zzd.zzdd;
            strConcat = "friends_list_visibility";
        } else {
            this.zzhz = "external_player_id".length() != 0 ? AbstractJsonLexerKt.NULL.concat("external_player_id") : new String(AbstractJsonLexerKt.NULL);
            this.zzia = "profile_name".length() != 0 ? AbstractJsonLexerKt.NULL.concat("profile_name") : new String(AbstractJsonLexerKt.NULL);
            this.zzib = "profile_icon_image_uri".length() != 0 ? AbstractJsonLexerKt.NULL.concat("profile_icon_image_uri") : new String(AbstractJsonLexerKt.NULL);
            this.zzic = "profile_icon_image_url".length() != 0 ? AbstractJsonLexerKt.NULL.concat("profile_icon_image_url") : new String(AbstractJsonLexerKt.NULL);
            this.zzid = "profile_hi_res_image_uri".length() != 0 ? AbstractJsonLexerKt.NULL.concat("profile_hi_res_image_uri") : new String(AbstractJsonLexerKt.NULL);
            this.zzie = "profile_hi_res_image_url".length() != 0 ? AbstractJsonLexerKt.NULL.concat("profile_hi_res_image_url") : new String(AbstractJsonLexerKt.NULL);
            this.zzif = "last_updated".length() != 0 ? AbstractJsonLexerKt.NULL.concat("last_updated") : new String(AbstractJsonLexerKt.NULL);
            this.zzig = "is_in_circles".length() != 0 ? AbstractJsonLexerKt.NULL.concat("is_in_circles") : new String(AbstractJsonLexerKt.NULL);
            this.zzih = "played_with_timestamp".length() != 0 ? AbstractJsonLexerKt.NULL.concat("played_with_timestamp") : new String(AbstractJsonLexerKt.NULL);
            this.zzii = "current_xp_total".length() != 0 ? AbstractJsonLexerKt.NULL.concat("current_xp_total") : new String(AbstractJsonLexerKt.NULL);
            this.zzij = "current_level".length() != 0 ? AbstractJsonLexerKt.NULL.concat("current_level") : new String(AbstractJsonLexerKt.NULL);
            this.zzik = "current_level_min_xp".length() != 0 ? AbstractJsonLexerKt.NULL.concat("current_level_min_xp") : new String(AbstractJsonLexerKt.NULL);
            this.zzil = "current_level_max_xp".length() != 0 ? AbstractJsonLexerKt.NULL.concat("current_level_max_xp") : new String(AbstractJsonLexerKt.NULL);
            this.zzim = "next_level".length() != 0 ? AbstractJsonLexerKt.NULL.concat("next_level") : new String(AbstractJsonLexerKt.NULL);
            this.zzin = "next_level_max_xp".length() != 0 ? AbstractJsonLexerKt.NULL.concat("next_level_max_xp") : new String(AbstractJsonLexerKt.NULL);
            this.zzio = "last_level_up_timestamp".length() != 0 ? AbstractJsonLexerKt.NULL.concat("last_level_up_timestamp") : new String(AbstractJsonLexerKt.NULL);
            this.zzbe = "player_title".length() != 0 ? AbstractJsonLexerKt.NULL.concat("player_title") : new String(AbstractJsonLexerKt.NULL);
            this.zzip = "has_all_public_acls".length() != 0 ? AbstractJsonLexerKt.NULL.concat("has_all_public_acls") : new String(AbstractJsonLexerKt.NULL);
            this.zziq = "is_profile_visible".length() != 0 ? AbstractJsonLexerKt.NULL.concat("is_profile_visible") : new String(AbstractJsonLexerKt.NULL);
            this.zzir = "most_recent_external_game_id".length() != 0 ? AbstractJsonLexerKt.NULL.concat("most_recent_external_game_id") : new String(AbstractJsonLexerKt.NULL);
            this.zzis = "most_recent_game_name".length() != 0 ? AbstractJsonLexerKt.NULL.concat("most_recent_game_name") : new String(AbstractJsonLexerKt.NULL);
            this.zzit = "most_recent_activity_timestamp".length() != 0 ? AbstractJsonLexerKt.NULL.concat("most_recent_activity_timestamp") : new String(AbstractJsonLexerKt.NULL);
            this.zziu = "most_recent_game_icon_uri".length() != 0 ? AbstractJsonLexerKt.NULL.concat("most_recent_game_icon_uri") : new String(AbstractJsonLexerKt.NULL);
            this.zziv = "most_recent_game_hi_res_uri".length() != 0 ? AbstractJsonLexerKt.NULL.concat("most_recent_game_hi_res_uri") : new String(AbstractJsonLexerKt.NULL);
            this.zziw = "most_recent_game_featured_uri".length() != 0 ? AbstractJsonLexerKt.NULL.concat("most_recent_game_featured_uri") : new String(AbstractJsonLexerKt.NULL);
            this.zzix = "has_debug_access".length() != 0 ? AbstractJsonLexerKt.NULL.concat("has_debug_access") : new String(AbstractJsonLexerKt.NULL);
            this.zzbj = "gamer_tag".length() != 0 ? AbstractJsonLexerKt.NULL.concat("gamer_tag") : new String(AbstractJsonLexerKt.NULL);
            this.name = "real_name".length() != 0 ? AbstractJsonLexerKt.NULL.concat("real_name") : new String(AbstractJsonLexerKt.NULL);
            this.zziy = "banner_image_landscape_uri".length() != 0 ? AbstractJsonLexerKt.NULL.concat("banner_image_landscape_uri") : new String(AbstractJsonLexerKt.NULL);
            this.zziz = "banner_image_landscape_url".length() != 0 ? AbstractJsonLexerKt.NULL.concat("banner_image_landscape_url") : new String(AbstractJsonLexerKt.NULL);
            this.zzja = "banner_image_portrait_uri".length() != 0 ? AbstractJsonLexerKt.NULL.concat("banner_image_portrait_uri") : new String(AbstractJsonLexerKt.NULL);
            this.zzjb = "banner_image_portrait_url".length() != 0 ? AbstractJsonLexerKt.NULL.concat("banner_image_portrait_url") : new String(AbstractJsonLexerKt.NULL);
            this.zzjc = "gamer_friend_status".length() != 0 ? AbstractJsonLexerKt.NULL.concat("gamer_friend_status") : new String(AbstractJsonLexerKt.NULL);
            this.zzjd = "gamer_friend_update_timestamp".length() != 0 ? AbstractJsonLexerKt.NULL.concat("gamer_friend_update_timestamp") : new String(AbstractJsonLexerKt.NULL);
            this.zzje = "is_muted".length() != 0 ? AbstractJsonLexerKt.NULL.concat("is_muted") : new String(AbstractJsonLexerKt.NULL);
            this.zzjf = "total_unlocked_achievements".length() != 0 ? AbstractJsonLexerKt.NULL.concat("total_unlocked_achievements") : new String(AbstractJsonLexerKt.NULL);
            String strValueOf = String.valueOf(com.google.android.gms.games.internal.zzd.zzda);
            this.zzjg = strValueOf.length() != 0 ? AbstractJsonLexerKt.NULL.concat(strValueOf) : new String(AbstractJsonLexerKt.NULL);
            String strValueOf2 = String.valueOf(com.google.android.gms.games.internal.zzd.zzdb);
            this.zzjh = strValueOf2.length() != 0 ? AbstractJsonLexerKt.NULL.concat(strValueOf2) : new String(AbstractJsonLexerKt.NULL);
            String strValueOf3 = String.valueOf(com.google.android.gms.games.internal.zzd.zzdc);
            this.zzji = strValueOf3.length() != 0 ? AbstractJsonLexerKt.NULL.concat(strValueOf3) : new String(AbstractJsonLexerKt.NULL);
            this.zzjj = "profile_creation_timestamp".length() != 0 ? AbstractJsonLexerKt.NULL.concat("profile_creation_timestamp") : new String(AbstractJsonLexerKt.NULL);
            String strValueOf4 = String.valueOf(com.google.android.gms.games.internal.zzd.zzdd);
            this.zzce = strValueOf4.length() != 0 ? AbstractJsonLexerKt.NULL.concat(strValueOf4) : new String(AbstractJsonLexerKt.NULL);
            strConcat = "friends_list_visibility".length() != 0 ? AbstractJsonLexerKt.NULL.concat("friends_list_visibility") : new String(AbstractJsonLexerKt.NULL);
        }
        this.zzjk = strConcat;
    }
}
