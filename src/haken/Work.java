package haken;

public class Work extends Record {
	/**
	 * フィールド
	 */
	private int personID; // 従業員ID
	private int clientID; // 顧客ID
	private String startTime; // 稼働開始年月日
	private String endTime; // 稼働終了年月日
	private int price; // 契約単価
	
	/**
	 * 　コンストラクタ　Work
	 */
	Work (int ID, int personID, int clientID,
			String startTime, String endTime,
			int price, boolean eraseFlag) {
		super (ID, eraseFlag);
		this.personID = personID;
		this.clientID = clientID;
		this.startTime = startTime;
		this.endTime = endTime;
		this.price = price;
	}

	@Override
	public String writeForCSV() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

}
