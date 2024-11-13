package www.silver.vo;


public class wordVO {
    String eword = null;
    String kword = null;
	public String getEword() {
		return eword;
	}
	public void setEword(String eword) {
		this.eword = eword;
	}
	public String getKword() {
		return kword;
	}
	public void setKword(String kword) {
		this.kword = kword;
	}
	@Override
	public String toString() {
		return "wordVO [eword=" + eword + ", kword=" + kword + "]";
	}
    
}
