public class Information {
    private String name;
    private String gender;
    private int customerNumber;
    private String VIP="N";


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getCustomerID() {
        return customerNumber;
    }

    public void setCustomerID(int customerID) {
        this.customerNumber = customerID;
    }

    public String getVIP() {
        return VIP;
    }

    public void setVIP(String VIP) {
        this.VIP = VIP;
    }

    @Override
    public String toString() {
        return "Information{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", customerID=" + customerNumber +
                ", VIP='" + VIP + '\'' +
                '}';
    }
}
