package stock.earnings.management.model;

import java.util.Date;

public class Transaction {
	
	private int transactionId;
	private String stockId;
	private String transactionType;
	private double transactionPrice;
	private int transactionAmuont;
	private Date transaction_date;
	private String isSettled;
	public int getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	public String getStockId() {
		return stockId;
	}
	public void setStockId(String stockId) {
		this.stockId = stockId;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	public double getTransactionPrice() {
		return transactionPrice;
	}
	public void setTransactionPrice(double transactionPrice) {
		this.transactionPrice = transactionPrice;
	}
	public int getTransactionAmuont() {
		return transactionAmuont;
	}
	public void setTransactionAmuont(int transactionAmuont) {
		this.transactionAmuont = transactionAmuont;
	}
	public Date getTransaction_date() {
		return transaction_date;
	}
	public void setTransaction_date(Date transaction_date) {
		this.transaction_date = transaction_date;
	}
	public String getIsSettled() {
		return isSettled;
	}
	public void setIsSettled(String isSettled) {
		this.isSettled = isSettled;
	}
	
	
}
