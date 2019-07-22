package java_20190722;

public class MemberPay {
	private int seq;
	private int group;
	private String name;
	private boolean valid;
	private int price;
	private String status;
	private String sdate;
	private String edate;
	private String regdate;
	
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public int getSeq() {
		return seq;
	}
	public void setGroup(int group) {
		this.group = group;
	}
	public int getGroup() {
		return group;
	}
	
	public void setValid(boolean valid) {
		this.valid = valid;
	}
	// boolean은 get이 아니라 is로 쓴다.
	public boolean isValid() {
		return valid;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus() {
		return status;
	}
	public void setSdate(String sdate) {
		this.sdate = sdate;
	}
	public String getSdate() {
		return sdate;
	}
	public void setEdate(String edate) {
		this.edate = edate;
	}
	public String getEdate() {
		return edate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	public String getRegdate() {
		return regdate;
		
		
	}
}
