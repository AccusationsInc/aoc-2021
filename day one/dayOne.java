import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
public class dayOne {
    public static void main (String args[]) throws FileNotFoundException {
        //loads the numbers in input into an arrayList
        ArrayList<Integer> data = new ArrayList<>();
        File text = new File("input");
        Scanner input = new Scanner(text);
        while(input.hasNextLine()) {
            data.add(Integer.parseInt(input.nextLine()));
        }

        //solution for problem one
        int result = 0;
        for(int i = 1; i < data.size(); i++) {
            if(data.get(i) > data.get(i - 1))
                result++;
        }
        System.out.println("Problem one answer :: " + result);

        //solution for problem two
        result = 0;
        int prevSum = 0;
        for(int i = 2; i < data.size(); i++) {
            int sum = data.get(i - 2) + data.get(i - 1) + data.get(i);
            if(prevSum != 0)
                if(sum > prevSum)
                    result++;
            prevSum = sum;
            
        }
        System.out.println("Problem two answer :: " + result);

    }

}
