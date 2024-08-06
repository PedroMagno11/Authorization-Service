package br.com.pedromagno.authorization.domain;

public class Authorization {
    private String status;
    private boolean authorize;

    public Authorization(){}

    public Authorization(String status, boolean authorize){
        this.status = status;
        this.authorize = authorize;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isAuthorize() {
        return authorize;
    }

    public void setAuthorize(boolean authorize) {
        this.authorize = authorize;
    }
}