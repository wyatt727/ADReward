package com.google.common.graph;

import java.util.Set;
import javax.annotation.CheckForNull;

@ElementTypesAreNonnullByDefault
/* loaded from: classes3.dex */
public abstract class AbstractGraph<N> extends AbstractBaseGraph<N> implements Graph<N> {
    @Override // com.google.common.graph.AbstractBaseGraph, com.google.common.graph.PredecessorsFunction
    public /* bridge */ /* synthetic */ Iterable predecessors(Object obj) {
        return predecessors((AbstractGraph<N>) ((Graph) obj));
    }

    @Override // com.google.common.graph.AbstractBaseGraph, com.google.common.graph.SuccessorsFunction
    public /* bridge */ /* synthetic */ Iterable successors(Object obj) {
        return successors((AbstractGraph<N>) ((Graph) obj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public /* bridge */ /* synthetic */ int degree(Object obj) {
        return super.degree(obj);
    }

    @Override // com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public /* bridge */ /* synthetic */ Set edges() {
        return super.edges();
    }

    @Override // com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public /* bridge */ /* synthetic */ boolean hasEdgeConnecting(EndpointPair endpointPair) {
        return super.hasEdgeConnecting(endpointPair);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public /* bridge */ /* synthetic */ boolean hasEdgeConnecting(Object obj, Object obj2) {
        return super.hasEdgeConnecting(obj, obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public /* bridge */ /* synthetic */ int inDegree(Object obj) {
        return super.inDegree(obj);
    }

    @Override // com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public /* bridge */ /* synthetic */ ElementOrder incidentEdgeOrder() {
        return super.incidentEdgeOrder();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public /* bridge */ /* synthetic */ Set incidentEdges(Object obj) {
        return super.incidentEdges(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public /* bridge */ /* synthetic */ int outDegree(Object obj) {
        return super.outDegree(obj);
    }

    @Override // com.google.common.graph.Graph
    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Graph)) {
            return false;
        }
        Graph graph = (Graph) obj;
        return isDirected() == graph.isDirected() && nodes().equals(graph.nodes()) && edges().equals(graph.edges());
    }

    @Override // com.google.common.graph.Graph
    public final int hashCode() {
        return edges().hashCode();
    }

    public String toString() {
        boolean zIsDirected = isDirected();
        boolean zAllowsSelfLoops = allowsSelfLoops();
        String strValueOf = String.valueOf(nodes());
        String strValueOf2 = String.valueOf(edges());
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 59 + String.valueOf(strValueOf2).length());
        sb.append("isDirected: ");
        sb.append(zIsDirected);
        sb.append(", allowsSelfLoops: ");
        sb.append(zAllowsSelfLoops);
        sb.append(", nodes: ");
        sb.append(strValueOf);
        sb.append(", edges: ");
        sb.append(strValueOf2);
        return sb.toString();
    }
}
