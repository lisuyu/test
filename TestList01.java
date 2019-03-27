import java.util.ArrayList;
import java.util.List;

public class TestList01 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("123");
        list.add("234");
        list.add("345");
        show(list);

        list.remove("234");

        show(list);
    }

    public static void show(List list){
        for (int i = 0;i<list.size();i++){
            String str = (String) list.get(i);
            System.out.println(str);
        }
    }
}


基于Object进行添加，也可以添加其他类型的值，这个时候进行强制类型转换的时候，就会抛出异常

由此引入泛型

泛型时JDK1.5之后出现的。



import java.util.ArrayList;
import java.util.List;

public class TestList01 {
    public static void main(String[] args) {
        //使用泛型之后，说明这个list中只能添加String类型的值
        List<String> list = new ArrayList<String>();

        list.add("123");
        list.add("234");
        list.add("345");

        for (int i=0;i<list.size();i++){
            String str = list.get(i);
            System.out.println(str);
        }
    }
}


封装类：

每一种基本数据类型都有一种封装类来将基本数据类型封装为对象

int   Integer

泛型和封装类

import java.util.ArrayList;
import java.util.List;

public class TestList01 {
    public static void main(String[] args) {
        Integer num = 10;
        //Integer nums = new Integer(10);  1.5之前的版本

        String str = "321";
        System.out.println(str+1);

        /*
        parseInt()是一个static的方法，可以将字符串转换为int
        parseFloat()
        将String转换为其他类型
        * */
        int a = Integer.parseInt(str);
        System.out.println(a);

        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        //list.remove(2);  下标为2
        list.remove(new Integer(2));
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
