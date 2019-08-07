package in.gskitchen.api.helloworld;

public class HelloBean {

    private String name;
    private String msg;

    public HelloBean(String msg, String name) {
        this.msg = msg;
        this.name = name;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "HelloBean{" +
                "name='" + name + '\'' +
                ", msg='" + msg + '\'' +
                '}';
    }
}
