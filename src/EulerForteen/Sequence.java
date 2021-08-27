package EulerForteen;
//определяем последовательность
public class Sequence {
    public static long seqLen(long seed) {
        if (seed <= 0) return 0;
        if (seed == 1) return 1;
        long len = 1L;
        if (seed % 2 == 0) {
            len += seqLen(seed / 2);
        } else {
            len += seqLen((3 * seed) + 1);
        }
        return len;
    }
}
