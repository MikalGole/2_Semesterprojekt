package model;
/**
 * Author: Mikal
 */
public class Media {
	private double priceOfMedia;
	private String type;
	private String ageRecommendation;
	private String genre;
	private String period;
	private String playDuration;
	private String mediaID;
	private String title;
	
	public Media(double priceOfMedia, String type, String ageRecommendation, String genre, String period, String playDuration, String mediaID, String title) {
		this.priceOfMedia = priceOfMedia;
		this.type = type;
		this.ageRecommendation = ageRecommendation;
		this.genre = genre;
		this.period = period;
		this.playDuration = playDuration;
		this.mediaID = mediaID;
		this.title = title;
	}
	
	// getters and setters for priceOfMedia
	public double getPriceOfMedia() {
		return priceOfMedia;
	}
	public void setPriceOfMedia(double priceOfMedia) {
		this.priceOfMedia = priceOfMedia;
	}
	// getters and setters for type
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	// getters and setters for ageRecommendation
	public String getAgeRecommendation() {
		return ageRecommendation;
	}
	public void setAgeRecommendation(String ageRecommendation) {
		this.ageRecommendation = ageRecommendation;
	}
	// getters and setters for  genre
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	// getters and setters for period
	public String getPeriod() {
		return period;
	}
	public void setPeriod(String period) {
		this.period = period;
	}
	// getters and setters for playDuration
	public String getPlayDuration() {
		return playDuration;
	}
	public void setPlayDuration(String playDuration) {
		this.playDuration = playDuration;
	}
	// getters and setters for mediaID
	public String getMediaID() {
		return mediaID;
	}
	public void setMediaID(String mediaID) {
		this.mediaID = mediaID;
	}
	// getters and setters for title
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
}
