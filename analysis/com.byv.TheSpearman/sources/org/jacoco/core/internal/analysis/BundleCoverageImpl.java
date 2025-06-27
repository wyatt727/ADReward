package org.jacoco.core.internal.analysis;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import org.jacoco.core.analysis.CoverageNodeImpl;
import org.jacoco.core.analysis.IBundleCoverage;
import org.jacoco.core.analysis.IClassCoverage;
import org.jacoco.core.analysis.ICoverageNode;
import org.jacoco.core.analysis.IPackageCoverage;
import org.jacoco.core.analysis.ISourceFileCoverage;

/* loaded from: classes5.dex */
public class BundleCoverageImpl extends CoverageNodeImpl implements IBundleCoverage {
    private final Collection<IPackageCoverage> packages;

    public BundleCoverageImpl(String str, Collection<IPackageCoverage> collection) {
        super(ICoverageNode.ElementType.BUNDLE, str);
        this.packages = collection;
        increment(collection);
    }

    public BundleCoverageImpl(String str, Collection<IClassCoverage> collection, Collection<ISourceFileCoverage> collection2) {
        this(str, groupByPackage(collection, collection2));
    }

    private static Collection<IPackageCoverage> groupByPackage(Collection<IClassCoverage> collection, Collection<ISourceFileCoverage> collection2) {
        HashMap map = new HashMap();
        for (IClassCoverage iClassCoverage : collection) {
            addByName(map, iClassCoverage.getPackageName(), iClassCoverage);
        }
        HashMap map2 = new HashMap();
        for (ISourceFileCoverage iSourceFileCoverage : collection2) {
            addByName(map2, iSourceFileCoverage.getPackageName(), iSourceFileCoverage);
        }
        HashSet<String> hashSet = new HashSet();
        hashSet.addAll(map.keySet());
        hashSet.addAll(map2.keySet());
        ArrayList arrayList = new ArrayList();
        for (String str : hashSet) {
            Collection collectionEmptyList = (Collection) map.get(str);
            if (collectionEmptyList == null) {
                collectionEmptyList = Collections.emptyList();
            }
            Collection collectionEmptyList2 = (Collection) map2.get(str);
            if (collectionEmptyList2 == null) {
                collectionEmptyList2 = Collections.emptyList();
            }
            arrayList.add(new PackageCoverageImpl(str, collectionEmptyList, collectionEmptyList2));
        }
        return arrayList;
    }

    private static <T> void addByName(Map<String, Collection<T>> map, String str, T t) {
        Collection<T> arrayList = map.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            map.put(str, arrayList);
        }
        arrayList.add(t);
    }

    @Override // org.jacoco.core.analysis.IBundleCoverage
    public Collection<IPackageCoverage> getPackages() {
        return this.packages;
    }
}
