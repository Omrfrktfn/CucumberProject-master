package team12.pojos.zeynepPojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
import java.io.Serializable;
@JsonIgnoreProperties(ignoreUnknown = true)
public class US1011AddLessonPojo implements Serializable {
	private String day;
	private String educationTermId;
	private List<String> lessonIdList;
	private String startTime;
	private String stopTime;

	public US1011AddLessonPojo() {
	}

	public US1011AddLessonPojo(String day, String educationTermId, List<String> lessonIdList, String startTime, String stopTime) {
		this.day = day;
		this.educationTermId = educationTermId;
		this.lessonIdList = lessonIdList;
		this.startTime = startTime;
		this.stopTime = stopTime;
	}

	public void setDay(String day){
		this.day = day;
	}

	public String getDay(){
		return day;
	}

	public void setEducationTermId(String educationTermId){
		this.educationTermId = educationTermId;
	}

	public String getEducationTermId(){
		return educationTermId;
	}

	public void setLessonIdList(List<String> lessonIdList){
		this.lessonIdList = lessonIdList;
	}

	public List<String> getLessonIdList(){
		return lessonIdList;
	}

	public void setStartTime(String startTime){
		this.startTime = startTime;
	}

	public String getStartTime(){
		return startTime;
	}

	public void setStopTime(String stopTime){
		this.stopTime = stopTime;
	}

	public String getStopTime(){
		return stopTime;
	}

	@Override
 	public String toString(){
		return 
			"US10AddLessonPojo{" + 
			"day = '" + day + '\'' + 
			",educationTermId = '" + educationTermId + '\'' + 
			",lessonIdList = '" + lessonIdList + '\'' + 
			",startTime = '" + startTime + '\'' + 
			",stopTime = '" + stopTime + '\'' + 
			"}";
		}
}