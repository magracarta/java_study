public class MemberDTO {
    private int id;
    private static int idAdd = 1;
    private String name;
    private int birth;

    public MemberDTO(String name, int birth) {
        this.id = idAdd++;
        this.name = name;
        this.birth = birth;
    }

    public MemberDTO(int id, String name, int birth) {
        this.id = id;
        this.name = name;
        this.birth = birth;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdAdd() {
        return idAdd;
    }

    public void setIdAdd(int idAdd) {
        this.idAdd = idAdd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirth() {
        return birth;
    }

    public void setBirth(int birth) {
        this.birth = birth;
    }

    @Override
    public String toString() {
        return "MemberDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birth=" + birth +
                '}';
    }
}
