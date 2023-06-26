package structuraldesignpatterns.adapterdesignpattern.adapterclass;

import structuraldesignpatterns.adapterdesignpattern.targetinterface.WebRequester;
import structuraldesignpatterns.adapterdesignpattern.thirdpartyapp.WebService;

public class WebAdapter implements WebRequester {
    private WebService service;
    public void connect(WebService currentService) {
        this.service = currentService;
        /* Connect to the web service */
    }
    public int request(Object request) {
        String stringJsonResult = this.toJson(request);
        String stringJsonResponse = service.request(stringJsonResult);

        if (stringJsonResponse != null)
            return 200; // OK status code

        return 500; // Server error status code
    }
    private String toJson(Object input) {
        return "";
    }
}
