package notes;

import java.util.*;

public class Notes {
    /**
     * Collection Heirarchy
     * <p>
     *                              Collection(I)
     * <p>
     * <p>
     *                  List(I)                             Queue(I)
     * <p>
     * <p>
     *                              LinkedList(C)
     *                                  ^
     *                                  |
     *                                  |
     *                                Stack
     * <p>
     * Collection Methods
     * add()
     * remove()
     * addAll(Collection<?> c)
     * removeAll(Collection<?> c)
     * isEmpty()
     * contains()
     * containsAll(Collection<?> c)
     * clear()
     * toArray()
     * size()
     * <p>
     * Hence ll has both the methods of Collections, List and Queue
     */
    public static void main(String[] a) {

        List<LinkedList<Integer>> lists=new ArrayList<>();





        //Queue Methods
        //In Java Q doesn't have enqueue or dequeue methods, use the add and remove from COllections instead

        Queue<Integer> q = new LinkedList<>();
        q.add(8);
        q.add(38);
        q.isEmpty();

        //peek()Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
        Integer canBeNull=q.peek();

        //poll() Retrieves and removes the head of this queue, or returns null if this queue is empty.
        Integer mayBeNull = q.poll();

        //remove() Retrieves and removes the head of this queue.
        //This method differs from poll only in that it throws an NoSuchElementException if this queue is empty
        q.remove();

        //Stack
        Stack<Integer> stack=new Stack<>();
        //Stack has all the list and queue methods see below
        stack.push(3);
        stack.push(3);
        stack.push(3);
        stack.pop();
        stack.add(3);
//        stack.remove(3);
        stack.peek();
        stack.isEmpty();
        //TODO: String methods, Array Utils, comparable, comparator, syntax of class, function, interface, abstract class
        //TODO: Java scope when to use public private or default with class, method, variables.
        //String intern
        //Array and 2D array declare, initialize.
        int[] array={0, 1, 3, 4, 2, 5, 7, 6};
        //the list we get from Arrays.asList are fixed size, beware
        Arrays.asList(1,2,45).forEach(System.out::print);
        List<String> messages = Arrays.asList("Hello", "World!", "How", "Are", "You");
        messages.forEach(System.out::println);

        //TODO empty check on array

        //List ops

        //Warning Arrays.asList gives fixed size list, but we need a linked list to be able
        //to add remove elements.
        List<Integer> list = new LinkedList<>(Arrays.asList(2, 6, 3, 8, 4, 9, 1, 7));
        //SWAP two list elements
        int index2=2;
        int givenIndex=0;
        int item=10;
        int index1= 1;
        //swap values at two given indexes, only for list
        Collections.swap(list, index2, index1);
        //read element from list
        Integer max = list.get(0);
        //append elemet to list
        list.add(item);
        //set item at a given index
        list.set(givenIndex, item);
        //remove item from given index and do shifting if needed
        list.remove(givenIndex);
        //traverse a list
        System.out.println("traverse a list...");
        list.forEach(member -> System.out.print(member));
        //multiple statement
        list.forEach(member -> {
            member++;
            System.out.print(member+" ");
        });
        //traditional
        for (Integer integer : list) {
            System.out.print(integer+" ");
        }

        int size =10;
        int value=-1;
        //Array ops
        int[] memo= new int[size];
        //takes an array and value to be filled returns nothing
        Arrays.fill(memo, value);
        //for hashcode and equals
        //see LCS.java in dp package

        //TODO: code from notepad to ide: common errors
        // different variable names used.
        //Add "new" before calling a constructor. eg. new Activity()
        //Add () after method name e.g. list.isEmpty()
        //dont' forget adding return keyword in return statement.

        //generate random numbers between 0 and a given number(exclding given number)
        int number =3;
        Random random=new Random();
        int randomNumber=random.nextInt(number);

        for(int i=0;i<20;i++)
            System.out.print(random.nextInt(number+1)+" ");
        //if you want between min and max
        int min=4;
        int maximum=7;
        int randomBetweenMinMax=min+random.nextInt(maximum+1);
        /*
        * Bellman ford (single source shortest path)
            DP
            Always works on negative edge graphs, unless there is a negative weight cycle
            Relax edges one bye one, n-1 times at most
            Returns false if there is a negative weight cycle
            If it relaxes even after n-1 time we know that there is a negative weight cycle
            for fully connected graph time complexity is n^3 for others it's n^2

          Dijkstra (single source shortest path)
            Greedy
            May or may not work on negative edge graph
            Process vertices one by one
            if a vertex has multiple destination vertices, choose the one with least value/weight
            O(n^2)

          Shortest path in DAG (single source shortest path, for topologically sorted DAG)
          Arrange in topological order using topological sort.
          Proceed like Dijkstra in order of topology
          Less time complexity, it's linear

          Fyodd Warshall (all source shortest path)
          DP
          Create a matrix
          Create n number of matrices progressively, for n vertices.
          E.g. 1st matrix will try to insert vertex v1 between every pair of vertices (x, y), and check
          if  (weight(x, v1) + weight(v1, y) > weight (x,y))
                weight (x,y) = weight(x, v1) + weight(v1, y)
          else
                do nothing

          Prims  - Minimum Spanning Tree (Only for connected graph) https://www.youtube.com/watch?v=4ZlRH0eK-qQ
          Initialize a solution/answer to an empty set (set of edges )
          Take an edge with min weight. (x,y)
          pick up new edge such that the edge creates a connected component / tree with the edges in solution.
          In other words, the solution should always stay connected.
          If there are multiple candidate edges eligible for the solution, choose the one with min weight
          Stop when all the vertices are connected, i.e. num of edges == (num of vertices -1)


          Kruskal's (intuitive) - Minimum Spanning Tree (Only for connected graph) https://www.youtube.com/watch?v=4ZlRH0eK-qQ
          Arrange all the edges in ascending order, or keep in minHeap
          Initialize a solution/answer to an empty set (set of edges )
          For each edge
            If adding an edge forms a cycle leave it else add it to solution.
            Stop when all the vertices are connected, i.e. num of edges == (num of vertices -1)


        * */

    }

}
