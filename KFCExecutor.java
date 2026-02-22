class KFCExecutor{
    public static void main(String[] args){
        String foodName="Classic Chicken Bucket";
        double df=KFC.search(foodName);
        System.out.println("The food item is:" +foodName+ ",with price:" +df);

        foodName="Hot Crispy Bucket";
        df=KFC.search(foodName, 2);
        System.out.println("The food item is:" +foodName+ ", with quantity:" +df);


    }
}
