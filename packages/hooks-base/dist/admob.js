export const family = 'admob';
export function match(src) {
    const clazzRe = /Lcom\/google\/android\/gms\/ads\/(rewarded|reward|rewardedinterstitial)\/OnUserEarnedRewardListener;/g;
    const methodRe = /\.method public onUserEarnedReward\(Lcom\/google\/android\/gms\/ads\/rewarded\/RewardItem;\)V/g;
    if (!clazzRe.test(src) || !methodRe.test(src)) {
        return [];
    }
    const classNameMatch = /^\.class.*(Lcom\/google\/android\/gms\/internal\/ads\/[a-zA-Z0-9]+;)/m.exec(src);
    if (!classNameMatch) {
        return [];
    }
    const className = classNameMatch[1].replace(/\//g, '.').slice(1, -1);
    return [{
            className: className,
            methodName: 'onUserEarnedReward',
            clazzVar: `C${Math.random().toString(36).substring(7)}`
        }];
}
//# sourceMappingURL=admob.js.map