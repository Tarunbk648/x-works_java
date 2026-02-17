class ZeptoExecutor{
    public static void main(String[] args){
        String itemName="Floor Cleaner";
        double df=Zepto.search(itemName);
        System.out.println("The item is:" +itemName+ ",with price:" +df);
    }
}
