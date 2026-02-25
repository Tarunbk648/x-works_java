class Refrigerator {

    static String brand;
    static String model;
    static int capacity;
    static String type;
    static String color;
    static int price;
    static int warranty;
    static String energyRating;
    static boolean inverterTechnology;
    static int doors;

    public static boolean createRefrigerator(
            String b,
            String m,
            int cap,
            String t,
            String c,
            int p,
            int w,
            String er,
            boolean it,
            int d) {

        boolean isCreated = false;

        boolean isBrandValid = false;
        boolean isModelValid = false;
        boolean isCapacityValid = false;
        boolean isTypeValid = false;
        boolean isColorValid = false;
        boolean isPriceValid = false;
        boolean isWarrantyValid = false;
        boolean isEnergyValid = false;
        boolean isDoorsValid = false;

        if (b != null && !b.isEmpty()) {
            System.out.println("Brand validated : " + b);
            brand = b;
            isBrandValid = true;
        } else {
            System.out.println("Brand invalid");
        }

        if (m != null && !m.isEmpty()) {
            System.out.println("Model validated : " + m);
            model = m;
            isModelValid = true;
        } else {
            System.out.println("Model invalid");
        }

        if (cap > 0) {
            System.out.println("Capacity validated : " + cap);
            capacity = cap;
            isCapacityValid = true;
        } else {
            System.out.println("Capacity invalid");
        }

        if (t != null && !t.isEmpty()) {
            System.out.println("Type validated : " + t);
            type = t;
            isTypeValid = true;
        } else {
            System.out.println("Type invalid");
        }

        if (c != null && !c.isEmpty()) {
            System.out.println("Color validated : " + c);
            color = c;
            isColorValid = true;
        } else {
            System.out.println("Color invalid");
        }

        if (p > 0) {
            System.out.println("Price validated : " + p);
            price = p;
            isPriceValid = true;
        } else {
            System.out.println("Price invalid");
        }

        if (w >= 0) {
            System.out.println("Warranty validated : " + w);
            warranty = w;
            isWarrantyValid = true;
        } else {
            System.out.println("Warranty invalid");
        }

        if (er != null && !er.isEmpty()) {
            System.out.println("Energy Rating validated : " + er);
            energyRating = er;
            isEnergyValid = true;
        } else {
            System.out.println("Energy Rating invalid");
        }

        if (d > 0) {
            System.out.println("Doors validated : " + d);
            doors = d;
            isDoorsValid = true;
        } else {
            System.out.println("Doors invalid");
        }

        if (isBrandValid && isModelValid && isCapacityValid &&
            isTypeValid && isColorValid && isPriceValid &&
            isWarrantyValid && isEnergyValid && isDoorsValid) {

            inverterTechnology = it;
            System.out.println("All Refrigerator Details Validated\n");
            isCreated = true;

        } else {
            System.out.println("Refrigerator Details Invalidated\n");
        }

        return isCreated;
    }

    public static void getRefrigeratorDetails() {

        System.out.println("----- Last Refrigerator Stored -----");
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Capacity : " + capacity);
        System.out.println("Type : " + type);
        System.out.println("Color : " + color);
        System.out.println("Price : " + price);
        System.out.println("Warranty : " + warranty);
        System.out.println("Energy Rating : " + energyRating);
        System.out.println("Inverter Technology : " + inverterTechnology);
        System.out.println("Doors : " + doors);
    }
}