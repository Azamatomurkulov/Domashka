public class USB {

    private double typeOfPort;
    private String idOfPort;

    public USB(double typeOfPort,String idOfPort){
        this.typeOfPort = typeOfPort;
        this.idOfPort = idOfPort;
    }
    public void setTypeOfPort(double typeOfPort){
        this.typeOfPort = typeOfPort;
    }
    public double getTypeOfPort(){
        return this.typeOfPort;
    }

    public String getIdOfPort() {
        return idOfPort;
    }

    public void setIdOfPort(String idOfPort) {
        this.idOfPort = idOfPort;
    }

    @Override
    public String toString() {
        return
                "Type Of Port: " + typeOfPort +
                ". Id Of Port: '" + idOfPort + '\'';
    }
}
