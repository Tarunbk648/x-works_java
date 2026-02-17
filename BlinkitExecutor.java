class BlinkitExecutor{
    public static void main(String[] args){
        String itemName="Milk 1L";
        double df=Blinkit.search(itemName);
        System.out.println("The item is:" +itemName+ ",with price:" +df);
    }
}
