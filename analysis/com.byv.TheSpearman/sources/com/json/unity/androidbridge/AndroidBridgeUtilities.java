package com.json.unity.androidbridge;

import com.json.mediationsdk.adunit.adapter.utility.AdInfo;
import com.json.mediationsdk.impressionData.ImpressionData;
import com.json.mediationsdk.logger.IronSourceError;
import com.json.mediationsdk.model.Placement;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class AndroidBridgeUtilities {
    private static final ExecutorService callbackExecutor = Executors.newSingleThreadExecutor();

    public static HashMap<String, String> getHashMapFromJsonString(String jsonStr) {
        HashMap<String, String> map = new HashMap<>();
        try {
            JSONObject jSONObject = new JSONObject(jsonStr);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.getString(next));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return map;
    }

    public static String parseErrorToEvent(int code, String msg) {
        HashMap map = new HashMap();
        try {
            map.put(AndroidBridgeConstants.ERROR_CODE, String.valueOf(code));
            map.put(AndroidBridgeConstants.ERROR_DESCRIPTION, msg);
            return new JSONObject(map).toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String parseIronSourceError(IronSourceError ironSourceError) {
        return ironSourceError != null ? parseErrorToEvent(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage()) : "";
    }

    public static String getPlacememtJson(Placement placement) {
        HashMap map = new HashMap();
        try {
            map.put("placement_id", String.valueOf(placement.getCom.ironsource.t2.k java.lang.String()));
            map.put(AndroidBridgeConstants.PLACEMENT_NAME, placement.getPlacementName());
            map.put(AndroidBridgeConstants.PLACEMENT_REWARDED_AMOUNT, String.valueOf(placement.getCom.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_REWARD_AMOUNT java.lang.String()));
            map.put(AndroidBridgeConstants.PLACEMENT_REWARDED_NAME, placement.getCom.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_REWARD_NAME java.lang.String());
            return new JSONObject(map).toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String getAdInfoString(AdInfo adInfo) {
        return adInfo == null ? "" : adInfo.toString();
    }

    public static String getImpressionDataString(ImpressionData impressionData) {
        return impressionData == null ? "" : impressionData.getAllData().toString();
    }

    public static void postBackgroundTask(Runnable runnable) {
        ExecutorService executorService = callbackExecutor;
        if (executorService.isShutdown()) {
            return;
        }
        executorService.submit(runnable);
    }
}
