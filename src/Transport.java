public abstract class Transport {
    private final String brand;
    private final String model;
    private final double engineVolume;
//    private final int productionYear;
//    private final String productionCountry;
//    private String colorBody;
//    private int maxSpeed;

    public Transport(String brand,
                     String model,
                     double engineVolume
//                     int productionYear,
//                     String productionCountry,
//                     String colorBody,
//                     int maxSpeed
    ) {

        if (isNull(brand)) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }

        if (isNull(model)) {
            this.model = "default";
        } else {
            this.model = model;
        }

        if (engineVolume < 0) {
            this.engineVolume = 0;
        } else {
            this.engineVolume = engineVolume;
        }

//        if (productionYear < 0) {
//            this.productionYear = 2000;
//        } else {
//            this.productionYear = productionYear;
//        }
//
//        if (productionCountry == null) {
//            this.productionCountry = "default";
//        } else {
//            this.productionCountry = productionCountry;
//        }
//
//        setColorBody(colorBody);
//        setMaxSpeed(maxSpeed);
    }


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

//    public Integer getProductionYear() {
//        return productionYear;
//    }
//
//    public String getProductionCountry() {
//        return productionCountry;
//    }
//
//    public String getColorBody() {
//        return colorBody;
//    }
//
//    public void setColorBody(String colorBody) {
//        if (colorBody == null || colorBody.isBlank()) {
//            this.colorBody = "белый";
//        } else {
//            this.colorBody = colorBody;
//        }
//    }
//
//    public Integer getMaxSpeed() {
//        return maxSpeed;
//    }
//
//    public void setMaxSpeed(int maxSpeed) {
//        if (maxSpeed < 0) {
//            this.maxSpeed = 0;
//        } else {
//            this.maxSpeed = maxSpeed;
//        }
//    }

    public boolean isNull(String value) {
        return value == null || value.isBlank();
    }

//    public abstract void refuel();

    public double getEngineVolume() {
        return engineVolume;
    }

    public abstract void startMoving();
    public abstract void finishMoving();


    public void printInfo() {
        System.out.println(getClass()
                + " (Марка - " + getBrand()
                + ", модель - " + getModel()
                + ", объем двигателя: " + getEngineVolume()
                + ".)");
    }
}
