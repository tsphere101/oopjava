public class Stock {
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;

    // Constructor
    // Default Cons.
    public Stock() {}
    // Specifig Cons.
    public Stock(String symbol, String name)
    {
        this.symbol = symbol;
        this.name = name;
    }

    //Encap.
    public double getCurrentPrice() {
        return currentPrice;
    }public String getName() {
        return name;
    }public double getPreviousClosingPrice() {
        return previousClosingPrice;
    }public String getSymbol() {
        return symbol;
    }public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }public void setName(String name) {
        this.name = name;
    }public void setPreviousClosingPrice(double previousClosingPrice) {
        this.previousClosingPrice = previousClosingPrice;
    }public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    //Method
    public double getChangePercent()
    {
        return (this.currentPrice-this.previousClosingPrice)/this.previousClosingPrice * 100.0;
    }

    public void log()
    {
        System.out.println("Symbol: " + this.symbol);
        System.out.println("Name: " + this.name);
        System.out.println("Previous Closing Price: " + this.previousClosingPrice);
        System.out.println("Current Price: " + this.currentPrice);
        System.out.println("Price Change: " + this.getChangePercent()+ "%");
    }
}
