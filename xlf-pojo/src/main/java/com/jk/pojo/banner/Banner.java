
package com.jk.pojo.banner;

import java.io.Serializable;

public class Banner implements Serializable{
	private int bannerID;
	private String bannerTitle;
	private String bannerContent;
	private String bannerImgpath;
	private String bannerLinkurl;
	private int bannerSort;
	private String bannerNote;
	public int getBannerID() {
		return bannerID;
	}
	public void setBannerID(int bannerID) {
		this.bannerID = bannerID;
	}
	public String getBannerTitle() {
		return bannerTitle;
	}
	public void setBannerTitle(String bannerTitle) {
		this.bannerTitle = bannerTitle;
	}
	public String getBannerContent() {
		return bannerContent;
	}
	public void setBannerContent(String bannerContent) {
		this.bannerContent = bannerContent;
	}
	public String getBannerImgpath() {
		return bannerImgpath;
	}
	public void setBannerImgpath(String bannerImgpath) {
		this.bannerImgpath = bannerImgpath;
	}
	public String getBannerLinkurl() {
		return bannerLinkurl;
	}
	public void setBannerLinkurl(String bannerLinkurl) {
		this.bannerLinkurl = bannerLinkurl;
	}
	public int getBannerSort() {
		return bannerSort;
	}
	public void setBannerSort(int bannerSort) {
		this.bannerSort = bannerSort;
	}
	public String getBannerNote() {
		return bannerNote;
	}
	public void setBannerNote(String bannerNote) {
		this.bannerNote = bannerNote;
	}
}
