package deshaw.dae.descrypto.domain;

import org.springframework.http.ResponseEntity;

import java.sql.Timestamp;
import java.time.LocalDateTime;


public class Order {

    private int  orderId;//primary key
    private int userId;//which user has placed
    private String tradingType;//spot or margin
    private String orderPair;//btcusdt
    private double amount;//number of coins specified by user
    private double limitPrice;//trade will start at this price for limit and current for market
    private double average;// average price at which trade was executed till now for this user
    private String orderType;//limit or market
    private String side;// buy or sell
    private String orderStatus;//open, partially_filled, filled, cancelled
    private double filled;//how much of the order is completed
    private double total;//total spent/gained by the user so far
    private double triggerPrice;//for stop-loss orders only
    private Timestamp timestamp;// when order was placed

    public String getTradingType() {
        return tradingType;
    }

    public void setTradingType(String tradingType) {
        this.tradingType = tradingType;
    }


    public double getTriggerPrice() {
        return triggerPrice;
    }

    public void setTriggerPrice(double triggerPrice) {
        this.triggerPrice = triggerPrice;
    }


    public double getLimitPrice() {
        return limitPrice;
    }

    public void setLimitPrice(double limitPrice) {
        this.limitPrice = limitPrice;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) { this.orderType = orderType; }

    public String getOrderStatus() { return orderStatus; }

    public void setOrderStatus(String OrderStatus) { this.orderStatus = OrderStatus; }

    public String getOrderPair() { return orderPair; }

    public void setOrderPair(String OrderPair) { this.orderPair = OrderPair; }

    public String getSide() {
        return side;
    }

    public void setSide(String Side) { this.side = Side; }

    public Double getFilled() {
        return filled;
    }

    public void setFilled(double Filled) { this.filled = Filled; }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double Total) { this.total = Total; }

    public Double getAverage() {
        return average;
    }

    public void setAverage(Double Average) { this.average = Average; }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp time) { this.timestamp = time; }

}
