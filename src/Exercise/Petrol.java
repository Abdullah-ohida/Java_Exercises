package Exercise;

public class Petrol{
    private String PetLocation;
    private String PetType;
    private int PetQuantity;
    private double PetPrice;
    private double PetPercentageDis;


    public Petrol(String PetLocation, String PetType,int PetQuantity, double PetPrice, double PetPercentageDis){
        this.PetLocation = PetLocation;
        this.PetType = PetType;

        if(PetQuantity > 0){
            this.PetQuantity = PetQuantity;
        }
        if(PetPrice > 0.0){
            this.PetPrice = PetPrice;
        }
        if(PetPercentageDis > 0.0){
            this.PetPercentageDis = PetPercentageDis;
        }
    }

    public void setPetLocation(String petLocation) {
        PetLocation = petLocation;
    }

    public String getPetLocation() {
        return PetLocation;
    }

    public void setPetType(String petType) {
        PetType = petType;
    }

    public String getPetType() {
        return PetType;
    }

    public void setPetQuantity(int petQuantity) {
        PetQuantity = petQuantity;
    }

    public int getPetQuantity() {
        return PetQuantity;
    }

    public void setPetPrice(double petPrice) {
        PetPrice = petPrice;
    }

    public double getPetPrice() {
        return PetPrice;
    }

    public void setPetPercentageDis(double petPercentageDis) {
        PetPercentageDis = petPercentageDis;
    }

    public double getPetPercentageDis() {
        return PetPercentageDis;
    }

    public double getPurchaseAmount(double petQuantity, double PetPrice){
        double netPurchase;
        netPurchase = petQuantity * PetPrice;
        return netPurchase;
    }


}
