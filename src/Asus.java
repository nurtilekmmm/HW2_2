public class Asus extends Desktop implements Printable{
    private int year;
    private String operatingSystem;

    public Asus(String modelName, int year, String operatingSystem) {
        super(modelName);
        this.year = year;
        this.operatingSystem = operatingSystem;
    }

    @Override
    public void print() {
        System.out.println("Model Name: " + getModelName());
        System.out.println("Year: " + year);
        System.out.println("Operating System: " + operatingSystem);
    }
}
