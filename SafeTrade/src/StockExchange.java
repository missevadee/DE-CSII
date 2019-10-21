import java.util.*;

public class StockExchange{

   private HashMap<String, Stock> listedStocks;

   public StockExchange(){
      listedStocks = new HashMap<String, Stock>();
   }
   
   public void listStock(String s, String n, double p){
      listedStocks.put(s, new Stock(s, n, p));
   }
   
   public String getQuote(String s){
      return listedStocks.get(s).getQuote();
   }
   
   public void placeOrder(TradeOrder order){
      listedStocks.get(order.getSymbol()).placeOrder(order);
   }
   
}