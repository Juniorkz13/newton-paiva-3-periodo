package lab7.adapter;

public class Data {
    
    private String data;

    public Data(String data){
        this.data = data;
    }


    public String getData() {
        return this.data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "{" +
            " data='" + getData() + "'" +
            "}";
    }

}
