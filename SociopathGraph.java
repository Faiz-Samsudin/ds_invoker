package sociopath;

import java.util.ArrayList;

/**
 * This is basically WeightedGraph class, but this is designed for Student object as vertices
 * @author Lidros
 */
public class SociopathGraph<N extends Comparable<N>> {
    private class Vertex <N extends Comparable<N>>{    //T usually in String (to store name), N usually in integer-Weight (to store weight of the vertex)
        private Student vertexInfo;
        private int indeg,outdeg;
        private Vertex<N> nextVertex;
        private Edge<N> firstEdge;

        public Vertex(Student vertexInfo, Vertex<N> nextVertex) {
            this.vertexInfo = vertexInfo;
            this.nextVertex = nextVertex;
        }

        public Vertex(Student vertexInfo, Vertex<N> nextVertex, Edge<N> firstEdge) {
            this.vertexInfo = vertexInfo;
            this.nextVertex = nextVertex;
            this.firstEdge = firstEdge;
        }
    }
    
    private class Edge <N extends Comparable<N>>{
        private Vertex<N> toVertex;   //the vertex the edge points onto
        private N weight;   //the weight of the edge
        private Edge<N> nextEdge; //the next edge node (of this vertex) linked with this current edge

        public Edge(Vertex<N> toVertex, N weight, Edge<N> nextEdge) {
            this.toVertex = toVertex;
            this.weight = weight;
            this.nextEdge = nextEdge;
        }
    }

    public SociopathGraph() {
    }
}
