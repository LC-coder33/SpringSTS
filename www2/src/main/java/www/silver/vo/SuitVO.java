package www.silver.vo;

public class SuitVO {
	String suitcode;
	String suitname;
	String suitcontent;
	String suitleft;
	String indate;
	
	public String getSuitcode() {
		return suitcode;
	}
	public void setSuitcode(String suitcode) {
		this.suitcode = suitcode;
	}
	public String getSuitname() {
		return suitname;
	}
	public void setSuitname(String suitname) {
		this.suitname = suitname;
	}
	public String getSuitcontent() {
		return suitcontent;
	}
	public void setSuitcontent(String suitcontent) {
		this.suitcontent = suitcontent;
	}
	public String getSuitleft() {
		return suitleft;
	}
	public void setSuitleft(String suitleft) {
		this.suitleft = suitleft;
	}
	public String getIndate() {
		return indate;
	}
	public void setIndate(String indate) {
		this.indate = indate;
	}
	@Override
	public String toString() {
		return "SuitVO [suitcode=" + suitcode + ", suitname=" + suitname + ", suitcontent=" + suitcontent
				+ ", suitleft=" + suitleft + ", indate=" + indate + "]";
	}
	
	
}
