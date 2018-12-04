package com.jxyd.nole.web.wx.dto;

public class ActivityCover {

	private java.lang.Long id;
	
	private java.lang.String status;
	
	private java.lang.String coverPicPath;
	
	private java.lang.String title;
	
	private java.lang.String date;
	
	private java.lang.Integer applyCount;
	
	private java.lang.String leaderNickname;
	
	private java.lang.String leaderHeaderPic;
	
	private java.lang.String leaderStatus;

	public java.lang.Long getId() {
		return id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	public java.lang.String getStatus() {
		return status;
	}

	public void setStatus(java.lang.String status) {
		this.status = status;
	}

	public java.lang.String getCoverPicPath() {
		return coverPicPath;
	}

	public void setCoverPicPath(java.lang.String coverPicPath) {
		this.coverPicPath = coverPicPath;
	}

	public java.lang.String getTitle() {
		return title;
	}

	public void setTitle(java.lang.String title) {
		this.title = title;
	}

	public java.lang.String getDate() {
		return date;
	}

	public void setDate(java.lang.String date) {
		this.date = date;
	}

	public java.lang.Integer getApplyCount() {
		return applyCount;
	}

	public void setApplyCount(java.lang.Integer applyCount) {
		this.applyCount = applyCount;
	}

	public java.lang.String getLeaderNickname() {
		return leaderNickname;
	}

	public void setLeaderNickname(java.lang.String leaderNickname) {
		this.leaderNickname = leaderNickname;
	}

	public java.lang.String getLeaderHeaderPic() {
		return leaderHeaderPic;
	}

	public void setLeaderHeaderPic(java.lang.String leaderHeaderPic) {
		this.leaderHeaderPic = leaderHeaderPic;
	}

	public java.lang.String getLeaderStatus() {
		return leaderStatus;
	}

	public void setLeaderStatus(java.lang.String leaderStatus) {
		this.leaderStatus = leaderStatus;
	}

	@Override
	public String toString() {
		return "Activity [id=" + id + ", status=" + status + ", coverPicPath=" + coverPicPath + ", title=" + title
				+ ", date=" + date + ", applyCount=" + applyCount + ", leaderNickname=" + leaderNickname
				+ ", leaderHeaderPic=" + leaderHeaderPic + ", leaderStatus=" + leaderStatus + "]";
	}
	
	
}
