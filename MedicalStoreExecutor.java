class MedicalStoreExecutor {

    public static void main(String[] args) {

        MedicalStore.createMedicine("Paracetamol","Cipla","Tablet",20,"12/2026","500mg",false);
        MedicalStore.createMedicine("Amoxicillin","SunPharma","Capsule",45,"10/2025","250mg",true);
        MedicalStore.createMedicine("Ibuprofen","DrReddy","Tablet",30,"08/2026","400mg",false);
        MedicalStore.createMedicine("Azithromycin","Cipla","Tablet",70,"09/2025","500mg",true);
        MedicalStore.createMedicine("Cetirizine","Zydus","Tablet",15,"11/2026","10mg",false);

        MedicalStore.createMedicine("Dolo650","MicroLabs","Tablet",25,"07/2026","650mg",false);
        MedicalStore.createMedicine("Metformin","USV","Tablet",60,"06/2027","500mg",true);
        MedicalStore.createMedicine("Aspirin","Bayer","Tablet",35,"05/2026","75mg",false);
        MedicalStore.createMedicine("Pantoprazole","Alkem","Tablet",55,"12/2025","40mg",true);
        MedicalStore.createMedicine("ORS","Electral","Powder",20,"01/2027","1 sachet",false);

        MedicalStore.createMedicine("Insulin","NovoNordisk","Injection",350,"03/2025","10ml",true);
        MedicalStore.createMedicine("Vicks","P&G","Syrup",90,"04/2026","10ml",false);
        MedicalStore.createMedicine("Benadryl","J&J","Syrup",110,"08/2025","5ml",false);
        MedicalStore.createMedicine("Crocin","GSK","Tablet",22,"09/2026","500mg",false);
        MedicalStore.createMedicine("Zincovit","Apex","Tablet",95,"02/2027","Multivitamin",false);

        MedicalStore.createMedicine("Liv52","Himalaya","Tablet",130,"11/2026","2 tablets",false);
        MedicalStore.createMedicine("Gelusil","Pfizer","Tablet",40,"07/2025","Chewable",false);
        MedicalStore.createMedicine("Rantac","J&J","Tablet",28,"03/2026","150mg",true);
        MedicalStore.createMedicine("Augmentin","GSK","Tablet",120,"10/2025","625mg",true);
        MedicalStore.createMedicine("Volini","SunPharma","Gel",85,"01/2027","Apply",false);

        MedicalStore.createMedicine("Moov","Paras","Spray",150,"12/2026","External",false);
        MedicalStore.createMedicine("Digene","Abbott","Syrup",95,"08/2026","10ml",false);
        MedicalStore.createMedicine("Calpol","GSK","Syrup",60,"06/2026","5ml",false);
        MedicalStore.createMedicine("Ascoril","Glenmark","Syrup",125,"09/2025","10ml",true);
        MedicalStore.createMedicine("Shelcal","Torrent","Tablet",110,"02/2027","Calcium",false);

        MedicalStore.createMedicine("Revital","Ranbaxy","Capsule",300,"03/2027","Daily",false);
        MedicalStore.createMedicine("Neurobion","Merck","Tablet",45,"07/2026","VitaminB",false);
        MedicalStore.createMedicine("Combiflam","Sanofi","Tablet",35,"05/2026","PainRelief",false);
        MedicalStore.createMedicine("Loperamide","Pfizer","Tablet",50,"04/2026","2mg",true);
        MedicalStore.createMedicine("Domstal","Torrent","Tablet",42,"11/2025","10mg",true);

        MedicalStore.createMedicine("Sinarest","Centaur","Tablet",55,"12/2026","Cold",false);
        MedicalStore.createMedicine("Omez","DrReddy","Capsule",65,"01/2027","20mg",true);
        MedicalStore.createMedicine("Betadine","WinMed","Solution",140,"10/2026","External",false);
        MedicalStore.createMedicine("Cofsils","Cipla","Lozenge",30,"06/2026","Throat",false);
        MedicalStore.createMedicine("Strepsils","Reckitt","Lozenge",35,"07/2026","Mint",false);
        MedicalStore.createMedicine("Limcee","Abbott","Tablet",25,"09/2026","VitaminC",false);
        MedicalStore.createMedicine("Evion","Merck","Capsule",85,"03/2027","VitaminE",false);

        MedicalStore.getMedicineDetails();
    }
}