package ma.pfe.entities;

import javax.persistence.Entity;

@Entity
public class Mineur extends StudentEntity{
    private Boolean isAuthorized;

    public Boolean getAuthorized() {
        return isAuthorized;
    }

    public void setAuthorized(Boolean authorized) {
        isAuthorized = authorized;
    }
}
