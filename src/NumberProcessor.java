import java.util.ArrayList;
import java.util.List;

public class NumberProcessor  implements   Runnable{
    private List<Integer> chunk;
    private ArrayList<Integer> evenNumber;
    private ArrayList<Integer> oddNumber;

    public NumberProcessor(List<Integer> chunk, ArrayList<Integer> evenNumber, ArrayList<Integer> oddNumber){
        this.chunk= chunk;
        this.evenNumber= evenNumber;
        this.oddNumber= oddNumber;
    }

    @Override
    public void run() {
        for (int i = 0; i < chunk.size(); i++) {
            if(chunk.get(i) %2 ==0){
                synchronized (evenNumber){
                    evenNumber.add(chunk.get(i));

                }
            }else {
                synchronized (oddNumber){
                    oddNumber.add(chunk.get(i));
                }
            }

        }
        /*
         @Override
    public void run() {
        for (int number : chunk) {
            if (number % 2 == 0) {
                synchronized (evenNumbers) {
                    evenNumbers.add(number);
                }
            } else {
                synchronized (oddNumbers) {
                    oddNumbers.add(number);
                }
            }
         */
    }
}
