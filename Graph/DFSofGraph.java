package Graph;
import java.util.*;

class DFSofGraph {
    private List<List<Integer>> adjList;
    private boolean[] visited;
    private List<Integer> visitedNodes;

    public DFSofGraph(int vertices) {
        adjList = new ArrayList<>();
        visited = new boolean[vertices + 1]; 
        visitedNodes = new ArrayList<>(); 
        for (int i = 0; i <= vertices; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    public void addEdge(int i, int j) {
        adjList.get(i).add(j);
        adjList.get(j).add(i);
    }

    public void dfs(int start) {
        if (visited[start]) return; 

        visited[start] = true;
        visitedNodes.add(start);//visited nodes are stored in a list

        for (int neighbor : adjList.get(start)) {
            if (!visited[neighbor]) { 
                dfs(neighbor);
            }
        }
    }

    public void printVisitedNodes() {
        System.out.println("Visited Nodes: " + visitedNodes);
    }

    public static void main(String[] args) {
        DFSofGraph graph = new DFSofGraph(6); 

        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.addEdge(4, 5);
        graph.addEdge(4, 6);

        //System.out.println("DFS Traversal:");
        graph.dfs(1); 
        graph.printVisitedNodes();
    }
}
