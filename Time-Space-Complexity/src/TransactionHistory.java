import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TransactionHistory {
	private List<Transaction> transactions;

	public TransactionHistory() {
		transactions = new ArrayList<>();
	}

	public void addTransaction(Transaction transaction) {
		transactions.add(transaction);
	}

	public List<Transaction> getTransactionsByDateRange(Date startDate, Date enddate) {
		List<Transaction> result = new ArrayList<>();

		for (Transaction transaction : transactions) {
			if (transaction.getDate().compareTo(startDate) >= 0 && transaction.getDate().compareTo(enddate) <= 0) {
				result.add(transaction);
			}
		}

		return result;
	}
	
	public double calculateAccountBalance() {
		double balance = 0.0;
		
		for(Transaction transaction: transactions) {
			balance += transaction.getAmount();
		}
		
		return balance;
	}

	public static void main(String[] args) throws Exception {
		// creating a simple transaction history
		TransactionHistory history = new TransactionHistory();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");

		// Adding some transactions
		history.addTransaction(new Transaction(dateFormat.parse("01-MAY-2023"), "purchase", -100.50));
		history.addTransaction(new Transaction(dateFormat.parse("20-MAY-2023"), "UpiTxnSushma", 900.50));
		history.addTransaction(new Transaction(dateFormat.parse("15-MAY-2023"), "BankTransferUTIBIOOO", 45100.50));
		history.addTransaction(new Transaction(dateFormat.parse("10-MAY-2023"), "purchase", -2508.50));
		
		//Retrieving transactions within a date range
		Date startDate = dateFormat.parse("01-MAY-2023");
		Date endDate = dateFormat.parse("20-MAY-2023");
		List<Transaction> transactionsInRange = history.getTransactionsByDateRange(startDate, endDate);
		
		System.out.println("Transactions within the date range: ");
		for(Transaction transaction: transactionsInRange) {
			System.out.println(transaction);
		}
		
		//Calculating the account balance
		double accountBalance = history.calculateAccountBalance();
		System.out.println("Account balance :"+ accountBalance);
		

	}

	//

}

//

class Transaction {
	private Date date;
	private String description;
	private double amount;

	public Transaction(Date date, String description, double amount) {
		super();
		this.date = date;
		this.description = description;
		this.amount = amount;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Transaction [date=" + date + ", description=" + description + ", amount=" + amount + "]";
	}

}
