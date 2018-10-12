import java.util.ArrayList;
import java.util.List;

public class Generic {
    public static void main(String[] args) {
        //数组是协变的，以下代码可以编译通过，即Long是Object的子类型，那么Long[]是Object[]子类型
        Object[] a = new Long[1];
        a[0] = "i am a String"; // 运行时会抛出ArrayStoreException
        //泛型不是协变的
        //List<Object> list = new ArrayList<Long>();

        List[] arr = new List[]{};

    }
}
