class objectFinalFieldConstructor {
    final int NoOfWhlees;
    final String model;
    final String EnginerinLiter;

    public objectFinalFieldConstructor(int noOfWhlees, String model, String enginerinLiter) {
        this.NoOfWhlees = noOfWhlees;
        this.model = model;
        this.EnginerinLiter = enginerinLiter;

        noOfWhlees = 4;
    }

    public static void main(String[] args) {
        objectFinalFieldConstructor obj = new objectFinalFieldConstructor(4,"martu","45l");
        
    }
}
