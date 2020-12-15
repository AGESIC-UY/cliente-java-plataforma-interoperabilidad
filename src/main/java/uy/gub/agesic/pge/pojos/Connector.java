package uy.gub.agesic.pge.pojos;

public class Connector {

    private RoleOperation actualRoleOperation;

    private String wsaTo;

    private String username;

    private String issuer;

    private boolean enableCacheTokens;

    private boolean enableSTSLocal;

    private String stsLocalUrl;

    public Connector() {
    }

    public Connector(RoleOperation actualRoleOperation, String wsaTo, String username, String issuer, boolean enableCacheTokens, boolean enableSTSLocal, String stsLocalUrl) {
        this.actualRoleOperation = actualRoleOperation;
        this.wsaTo = wsaTo;
        this.username = username;
        this.issuer = issuer;
        this.enableCacheTokens = enableCacheTokens;
        this.enableSTSLocal = enableSTSLocal;
        this.stsLocalUrl = stsLocalUrl;
    }

    public RoleOperation getActualRoleOperation() {
        return actualRoleOperation;
    }

    public void setActualRoleOperation(RoleOperation actualRoleOperation) {
        this.actualRoleOperation = actualRoleOperation;
    }

    public String getWsaTo() {
        return wsaTo;
    }

    public void setWsaTo(String wsaTo) {
        this.wsaTo = wsaTo;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    public boolean isEnableCacheTokens() {
        return enableCacheTokens;
    }

    public void setEnableCacheTokens(boolean enableCacheTokens) {
        this.enableCacheTokens = enableCacheTokens;
    }

    public boolean isEnableSTSLocal() {
        return enableSTSLocal;
    }

    public void setEnableSTSLocal(boolean enableSTSLocal) {
        this.enableSTSLocal = enableSTSLocal;
    }

    public String getStsLocalUrl() {
        return stsLocalUrl;
    }

    public void setStsLocalUrl(String stsLocalUrl) {
        this.stsLocalUrl = stsLocalUrl;
    }
}
