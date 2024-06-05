class ArrayToString {
    public static void main(String[] args) {
        String arr [] = {"This" ,
                " is ",
                "a" ,
                "Book" ,
                "Which" ,
                "help" ,
                "you" ,
                "to",
                "make" ,
                "a good" ,
                "conversation" ,
                "in English"};

        StringBuilder sb = new StringBuilder();
        for(String str : arr){
            sb.append(str).append(" ");
        }
        System.out.println(sb);
    }
}
