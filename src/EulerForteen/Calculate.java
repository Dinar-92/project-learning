package EulerForteen;

import static EulerForteen.Sequence.seqLen;

public class Calculate {
    public static long calc() {
        long max = 0L;
        long maxI = 0L;
        for (long i = 0L; i <= 1000000L; i++) {
            if (seqLen(i) >= max) {
                max = seqLen(i);
                maxI = i;
            }
        }
        return maxI;
    }
}
