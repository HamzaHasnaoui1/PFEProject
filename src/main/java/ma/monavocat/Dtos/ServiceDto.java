package ma.monavocat.Dtos;

public class ServiceDto {
    private Long id ;
    private String type ;

    public ServiceDto(Long id, String type) {
        this.id = id;
        this.type = type;
    }

    public ServiceDto(long id) {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "ServiceDto{" +
                "id=" + id +
                ", type='" + type + '\'' +
                '}';
    }
}
