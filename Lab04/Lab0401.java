public class Lab0401 {
    public static void main(String[] args) {

        Stock orcl = new Stock("ORCL","Oracle Corporation");
        orcl.setPreviousClosingPrice(34.5);
        orcl.setCurrentPrice(34.35);

        orcl.log();

    }

}

