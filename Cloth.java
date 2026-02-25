class Cloth {

    static String brand;
    static String type;
    static String color;
    static String size;
    static String material;
    static int price;
    static String gender;
    static String season;
    static String pattern;
    static String fit;
    static String sleeveType;
    static String country;

    public static boolean createCloth(
            String b, String t, String c, String s,
            String m, int p, String g, String se,
            String pa, String f, String sl, String co) {

        boolean isCreated = false;

        boolean isBrandValid = false;
        boolean isTypeValid = false;
        boolean isColorValid = false;
        boolean isSizeValid = false;
        boolean isMaterialValid = false;
        boolean isPriceValid = false;
        boolean isGenderValid = false;
        boolean isSeasonValid = false;
        boolean isPatternValid = false;
        boolean isFitValid = false;
        boolean isSleeveValid = false;
        boolean isCountryValid = false;

        if (b != null && !b.isEmpty()) {
            System.out.println("Brand validated : " + b);
            brand = b;
            isBrandValid = true;
        } else {
            System.out.println("Brand invalid");
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

        if (s != null && !s.isEmpty()) {
            System.out.println("Size validated : " + s);
            size = s;
            isSizeValid = true;
        } else {
            System.out.println("Size invalid");
        }

        if (m != null && !m.isEmpty()) {
            System.out.println("Material validated : " + m);
            material = m;
            isMaterialValid = true;
        } else {
            System.out.println("Material invalid");
        }

        if (p > 0) {
            System.out.println("Price validated : " + p);
            price = p;
            isPriceValid = true;
        } else {
            System.out.println("Price invalid");
        }

        if (g != null && !g.isEmpty()) {
            System.out.println("Gender validated : " + g);
            gender = g;
            isGenderValid = true;
        } else {
            System.out.println("Gender invalid");
        }

        if (se != null && !se.isEmpty()) {
            System.out.println("Season validated : " + se);
            season = se;
            isSeasonValid = true;
        } else {
            System.out.println("Season invalid");
        }

        if (pa != null && !pa.isEmpty()) {
            System.out.println("Pattern validated : " + pa);
            pattern = pa;
            isPatternValid = true;
        } else {
            System.out.println("Pattern invalid");
        }

        if (f != null && !f.isEmpty()) {
            System.out.println("Fit validated : " + f);
            fit = f;
            isFitValid = true;
        } else {
            System.out.println("Fit invalid");
        }

        if (sl != null && !sl.isEmpty()) {
            System.out.println("Sleeve validated : " + sl);
            sleeveType = sl;
            isSleeveValid = true;
        } else {
            System.out.println("Sleeve invalid");
        }

        if (co != null && !co.isEmpty()) {
            System.out.println("Country validated : " + co);
            country = co;
            isCountryValid = true;
        } else {
            System.out.println("Country invalid");
        }

        if (isBrandValid && isTypeValid && isColorValid &&
            isSizeValid && isMaterialValid && isPriceValid &&
            isGenderValid && isSeasonValid && isPatternValid &&
            isFitValid && isSleeveValid && isCountryValid) {

            System.out.println("All Cloth Details Validated\n");
            isCreated = true;

        } else {
            System.out.println("Cloth Details Invalidated\n");
        }

        return isCreated;
    }

    public static void getClothDetails() {

        System.out.println("----- Last Cloth Stored -----");
        System.out.println("Brand : " + brand);
        System.out.println("Type : " + type);
        System.out.println("Color : " + color);
        System.out.println("Size : " + size);
        System.out.println("Material : " + material);
        System.out.println("Price : " + price);
        System.out.println("Gender : " + gender);
        System.out.println("Season : " + season);
        System.out.println("Pattern : " + pattern);
        System.out.println("Fit : " + fit);
        System.out.println("Sleeve Type : " + sleeveType);
        System.out.println("Country : " + country);
    }
}