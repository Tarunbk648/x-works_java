class JustEatsExecutor{
    public static void main(String[] args){
        String foodName="Club Sandwich";
        double df=JustEats.search(foodName);
        System.out.println("The food item is:" +foodName+ ",with price:" +df);
    }
}
