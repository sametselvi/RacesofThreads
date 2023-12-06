import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws InterruptedException {


        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 200; i++) {
            arrayList.add(i);

        }
        ArrayList<Integer> evenNumber = new ArrayList<>();
        ArrayList<Integer> oddNumber = new ArrayList<>();
        int chunkSize = arrayList.size() / 4;
        int start = 0;
        int end = chunkSize;

        ExecutorService executorService = Executors.newFixedThreadPool(4);



            for (int i = 0; i < 4; i++) {

                executorService.execute(new NumberProcessor(arrayList.subList(start, end), evenNumber, oddNumber));
                start = end;
                end += chunkSize;

            }
            // ExecutorService'i kapatınız.
            executorService.shutdown();

            // Sonuçları ekrana yazdırınız.
            System.out.println("Even Numbers: " + evenNumber);
            System.out.println("Odd Numbers: " + oddNumber);



    }

}