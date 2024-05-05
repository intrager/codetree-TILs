import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class SequenceNumber implements Comparable<SequenceNumber> {
    private int num;
    private int index;

    public SequenceNumber(int num, int index) {
        this.num = num;
        this.index = index;
    }

    public int getNum() {
        return num;
    }
    public int getIndex() {
        return index;
    }

    @Override
    public int compareTo(SequenceNumber sequenceNumber) {
        if(this.num != sequenceNumber.num)
            return this.num - sequenceNumber.num;
        return this.index - sequenceNumber.index;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine().trim());
        SequenceNumber[] nums = new SequenceNumber[n];

        int[] answer = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < n; i++) {
            nums[i] = new SequenceNumber(Integer.parseInt(st.nextToken()), i);
        }
        
        Arrays.sort(nums);
        for(int i = 0; i < n; i++) {
            answer[nums[i].getIndex()] = i + 1;
        }

        for(int i = 0; i < n; i++) {
            System.out.print(answer[i] + " ");
        }

    }
}