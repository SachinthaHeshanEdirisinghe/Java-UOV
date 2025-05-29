class Singleton{
    private static Singleton instance;
    private Singleton(){
        System.out.println("Constructor:Object created");
    }
    public static Singleton getInstance(){
        if(instance==null){
            instance=new Singleton();
        } 
        System.out.println("Returned the Object");
        return instance; 
         
    }
}
class SingletonDemo{
    public static void main(String[] args){
         Singleton a1=Singleton.getInstance();
    }
}