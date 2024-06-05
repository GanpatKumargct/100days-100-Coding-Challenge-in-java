class randomValue0to6 {
    public static void main(String[] args) {

        for(int i = 0; i <=10; i++){
            double random = Math.random()*6;
            int roll = (int)Math.ceil(random);
            System.out.println("The random value is : "+roll);
        }
    }
}
