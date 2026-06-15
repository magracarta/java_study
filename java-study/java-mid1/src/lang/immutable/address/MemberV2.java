package lang.immutable.address;

public class MemberV2 {

    private String name;
    private ImmutableAddress immutableAddress;

    public MemberV2(String name, ImmutableAddress immutableAddress) {
        this.name = name;
        this.immutableAddress = immutableAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ImmutableAddress getImmutableAddress() {
        return immutableAddress;
    }

    public void setImmutableAddress(ImmutableAddress immutableAddress) {
        this.immutableAddress = immutableAddress;
    }

    @Override
    public String toString() {
        return "MemberV2{" +
                "name='" + name + '\'' +
                ", immutableAddress=" + immutableAddress +
                '}';
    }
}

