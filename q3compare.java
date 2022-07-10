class q3compare{
    public static void main(String []args){
        int a = 2, b = 3, c = 4, d = 5;
        float k = 4.3f;

        System.out.println(--b*a + c*d--);
        System.out.println(a++);
        
        //System.out.println(-2*(g-c)+c); 
        //symbol:   variable g
        //location: class q3compare
        
        System.out.println(c=c++);
        System.out.println(c=++c*a++);
    }
}