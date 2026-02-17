class DominosExecutor{
    public static void main(String[] args){
        String foodName="Margherita Pizza";
        double df=Dominos.search(foodName);
        System.out.println("The food item is:" +foodName+ ",with price:" +df);
    }
}
