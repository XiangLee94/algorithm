public class NQueen {

    int n;
    int[] array;

    public NQueen(int n) {
        this.n = n;
        array = new int[n];
    }

    public void findNQ() {
        _findNQ(0, 0, 0, 0);
    }

    private void _findNQ(int nRows, int column, int lt2rd, int rt2ld) {
        if (nRows >= n) {
            //输出
            for (int i = 0; i < array.length; i++) {
                int t = array[i];
                int c = 0;
                while (c < n) {
                    if ((t & 1) == 1) {
                        System.out.print("Q ");
                    } else {
                        System.out.print("* ");
                    }
                    t >>= 1;
                    c++;
                }
                System.out.println();
            }
            System.out.println("--------");
            return;
        }
        //find valid place
        int t = (~(column | lt2rd | rt2ld)) & ((1 << n) - 1);
        while (t != 0) {
            int tt = t & -t;
            array[nRows] = tt;
            _findNQ(nRows + 1, column | tt, (lt2rd | tt) >> 1, (rt2ld | tt) << 1);
            array[nRows] = 0;
            t = t & (t - 1);
        }
    }

    public static void main(String[] args) {
        NQueen nq = new NQueen(4);
        nq.findNQ();
    }
}