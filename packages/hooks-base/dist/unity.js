export const family = 'unity';
export function match(src) {
    const unityAdsListenerRe = /Lcom\/unity3d\/ads\/IUnityAdsListener;/;
    if (!unityAdsListenerRe.test(src)) {
        return [];
    }
    const onUnityAdsFinishRe = /\.method public onUnityAdsFinish\(Ljava\/lang\/String;Lcom\/unity3d\/ads\/UnityAds$FinishState;\)V/g;
    if (!onUnityAdsFinishRe.test(src)) {
        return [];
    }
    const classNameMatch = /^\.class.*(L[a-zA-Z0-9\/]+;)/m.exec(src);
    if (!classNameMatch) {
        return [];
    }
    const className = classNameMatch[1].replace(/\//g, '.').slice(1, -1);
    return [{
            className: className,
            methodName: 'onUnityAdsFinish',
            clazzVar: `C${Math.random().toString(36).substring(7)}`
        }];
}
//# sourceMappingURL=unity.js.map