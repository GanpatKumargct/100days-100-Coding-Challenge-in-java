class ConcatenstesAndConvert {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Sita ");
        sb.append("Ram");

        System.out.println("Original Case : "+sb);
        System.out.printf("upper case : %S",sb);

        String name = "pratyush";
        System.out.println("\nUpper Case String : "+name.toUpperCase());
    }
}
