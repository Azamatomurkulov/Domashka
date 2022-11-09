public class LCD {
    private double displayDiagonal;
    private String manufacturer;
    private String matrixType;

    public LCD(double displayDiagonal, String manufacturer, String matrixType) {
        this.displayDiagonal = displayDiagonal;
        this.manufacturer = manufacturer;
        this.matrixType = matrixType;
    }

    public double getDisplayDiagonal() {
        return displayDiagonal;
    }

    public void setDisplayDiagonal(double displayDiagonal) {
        this.displayDiagonal = displayDiagonal;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getMatrixType() {
        return matrixType;
    }

    public void setMatrixType(String matrixType) {
        this.matrixType = matrixType;
    }

    @Override
    public String toString() {
        return
                "DisplayDiagonal: " + displayDiagonal +
                ", Manufacturer: '" + manufacturer + '\'' +
                ", MatrixType: '" + matrixType + '\''
                ;
    }
}
