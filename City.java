//有问题需要解决，这里，关于this.name和name
//还有super()相关的一些东西
/**
 * Created by tom on 2016/10/29.
 */

class Country {
    String name = "云阳";
    String value(String name){
        name = "印度";
        return this.name;
    }
}

public class City extends Country {
    String name;

    String value(String name){
        this.name = "新德里";
        super.value("失败");
        System.out.println(name);
        System.out.println(super.value("重庆"));
        return this.name;
    }

    public static void main(String[] agrs){
        City c = new City();
        c.value("成功");
    }
}
