package Exercise_2;

public class Car {
    private String cmodel;
    private String cyear;
    private double cprice;

    public Car (String cmodel, String cyear, double cprice){
        this.cmodel = cmodel;
        this.cyear = cyear;
        if(cprice > 0.0 ){
            this.cprice = cprice;
        }
    }

    public void setCmodel(String cmodel) {
        this.cmodel = cmodel;
    }

    public String getCmodel() {
        return cmodel;
    }

    public void setCyear(String cyear) {
        this.cyear = cyear;
    }

    public String getCyear() {
        return cyear;
    }

    public void setCprice(double cprice) {
        this.cprice = cprice;
    }

    public double getCprice() {
        return cprice;
    }

    public double getDiscount(double cprice, double discount){
        double newPrice;
        newPrice = cprice - (cprice * (discount / 100));

        if(newPrice >= 100000){
            System.out.println("You will get an amazing car!");
        }else if(newPrice >= 50_000){
            System.out.println("You will get good looking car!");
        }else{
            System.out.println("You better go create your own!");
        }
        return newPrice;
    }
}
