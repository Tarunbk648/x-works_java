class McDonaldsExecutor{
    public static void main(String[] args){
        String foodName="McVeg Burger";
        double df=McDonalds.search(foodName);
        System.out.println("The food item is:" +foodName+ ",with price:" +df);
    }
}
