package structuraldesignpatterns.adapterdesignpattern.thirdpartyapp;

public class WebService {
    String webHost;
    public WebService(String webHost){
        this.webHost = webHost;
    }

    public String request(String jsonString){
        return "JsonString";
    }
}
