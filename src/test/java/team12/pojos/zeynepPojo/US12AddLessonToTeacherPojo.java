package team12.pojos.zeynepPojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
import java.io.Serializable;
@JsonIgnoreProperties(ignoreUnknown = true)

public class US12AddLessonToTeacherPojo implements Serializable {
	private List<String> lessonProgramId;
	private String teacherId;

	public US12AddLessonToTeacherPojo() {
	}

	public US12AddLessonToTeacherPojo(List<String> lessonProgramId, String teacherId) {
		this.lessonProgramId = lessonProgramId;
		this.teacherId = teacherId;
	}

	public void setLessonProgramId(List<String> lessonProgramId){
		this.lessonProgramId = lessonProgramId;
	}

	public List<String> getLessonProgramId(){
		return lessonProgramId;
	}

	public void setTeacherId(String teacherId){
		this.teacherId = teacherId;
	}

	public String getTeacherId(){
		return teacherId;
	}

	@Override
 	public String toString(){
		return 
			"US12AddLessonToTeacherPojo{" + 
			"lessonProgramId = '" + lessonProgramId + '\'' + 
			",teacherId = '" + teacherId + '\'' + 
			"}";
		}
}