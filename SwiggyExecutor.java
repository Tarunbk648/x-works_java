class SwiggyExecutor{
    public static void main(String[] args){
        String foodName="Masala Dosa";
        double df=Swiggy.search(foodName);
        System.out.println("The food item is:" +foodName+ ",with price:" +df);
    }
}
