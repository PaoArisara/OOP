public class Pro4_1_64010997 {
        public static void main(String[] args) 
        {
            Stock stock = new Stock("ORLC","Oracle Corporation"); 
            stock.previousClosingPrice = 34.5;
            stock.currentPrice = 34.35;
            double priceChange = stock.getChangePercent();
            
            System.out.println("Symbol : "+stock.symbol);
            System.out.println("Name : "+stock.name);
            System.out.println("Previous Closing Price : "+stock.previousClosingPrice);
            System.out.println("Current Price : "+stock.currentPrice);
            System.out.println("Price Change : "+priceChange+"%");
        }  
}
