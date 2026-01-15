package com.tka.array;

public class Players {
	@Override
	public String toString() {
		return "Players [jn=" + jn + ", nm=" + nm + ", runs=" + runs + ", wks=" + wks + ", tname=" + tname + "]";
	}


	public int getJn() {
		return jn;
	}


	public void setJn(int jn) {
		this.jn = jn;
	}


	public String getNm() {
		return nm;
	}


	public void setNm(String nm) {
		this.nm = nm;
	}


	public int getRuns() {
		return runs;
	}


	public void setRuns(int runs) {
		this.runs = runs;
	}


	public int getWks() {
		return wks;
	}


	public void setWks(int wks) {
		this.wks = wks;
	}


	public String getTname() {
		return tname;
	}


	public void setTname(String tname) {
		this.tname = tname;
	}


	private int jn;
	private String nm;
	private int runs;
	private int wks;
	private String tname;
	
	
	public Players(int jn, String nm, int runs, int wks, String tname) {
		super();
		this.jn = jn;
		this.nm = nm;
		this.runs = runs;
		this.wks = wks;
		this.tname = tname;
	}
	

}
