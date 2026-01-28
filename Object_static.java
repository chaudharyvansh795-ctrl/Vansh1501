class Object_static{

    static int count = 0;  

    static void showCount() {   
        System.out.println("Count = " + count);
    }

    public static void main(String[] args) {
        count++;        
        showCount();    
    }
}
