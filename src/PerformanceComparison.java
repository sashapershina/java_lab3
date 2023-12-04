import java.util.ArrayList;
import java.util.LinkedList;

public class PerformanceComparison {
    public static void main(String[] args) {
        int numIterations = 1000; // or any other desired number of iterations

        // ArrayList performance test
        ArrayList<Integer> arrayList = new ArrayList<>();
        long startTime = System.nanoTime();
        for (int i = 0; i < numIterations; i++) {
            arrayList.add(i);
        }
        long addArrayListTime = System.nanoTime() - startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < numIterations; i++) {
            arrayList.get(i);
        }
        long getArrayListTime = System.nanoTime() - startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < numIterations; i++) {
            arrayList.remove(0);
        }
        long deleteArrayListTime = System.nanoTime() - startTime;

        // LinkedList performance test
        LinkedList<Integer> linkedList = new LinkedList<>();
        startTime = System.nanoTime();
        for (int i = 0; i < numIterations; i++) {
            linkedList.add(i);
        }
        long addLinkedListTime = System.nanoTime() - startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < numIterations; i++) {
            linkedList.get(i);
        }
        long getLinkedListTime = System.nanoTime() - startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < numIterations; i++) {
            linkedList.remove(0);
        }
        long deleteLinkedListTime = System.nanoTime() - startTime;



        // Print the results
        System.out.println("ArrayList Performance:");
        System.out.println("Add: " + numIterations + " times, Time: " + addArrayListTime + " ns");
        System.out.println("Delete: " + numIterations + " times, Time: " + deleteArrayListTime + " ns");
        System.out.println("Get: " + numIterations + " times, Time: " + getArrayListTime + " ns");

        System.out.println("\nLinkedList Performance:");
        System.out.println("Add: " + numIterations + " times, Time: " + addLinkedListTime + " ns");
        System.out.println("Delete: " + numIterations + " times, Time: " + deleteLinkedListTime + " ns");
        System.out.println("Get: " + numIterations + " times, Time: " + getLinkedListTime + " ns");
    }
}
