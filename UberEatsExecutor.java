class UberEatsExecutor{
    public static void main(String[] args){
        String foodName="Hyderabadi Chicken Biryani";
        double df=UberEats.search(foodName);
        System.out.println("The food item is:" +foodName+ ",with price:" +df);
    }
}
