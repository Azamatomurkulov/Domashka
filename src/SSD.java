public class SSD {

    private int memorySize;
    private int dividedFor;

    public SSD(int memorySize, int dividedFor) {
        this.memorySize = memorySize;
        this.dividedFor = dividedFor;
    }

    public int getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(int memorySize) {
        this.memorySize = memorySize;
    }

    public int getDividedFor() {
        return dividedFor;
    }

    public void setDividedFor(int dividedFor) {
        this.dividedFor = dividedFor;
    }

    @Override
    public String toString() {
        return
                "MemorySize: " + memorySize +
                ", DividedFor: " + dividedFor
                ;
    }
}
