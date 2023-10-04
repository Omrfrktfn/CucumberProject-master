package team12.pojos.esmaPojo;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class US07SortPojo implements Serializable {
	private boolean empty;
	private boolean sorted;
	private boolean unsorted;

	public US07SortPojo(boolean empty, boolean sorted, boolean unsorted) {
		this.empty = empty;
		this.sorted = sorted;
		this.unsorted = unsorted;
	}

	public US07SortPojo() {
	}

	public void setEmpty(boolean empty){
		this.empty = empty;
	}

	public boolean isEmpty(){
		return empty;
	}

	public void setSorted(boolean sorted){
		this.sorted = sorted;
	}

	public boolean isSorted(){
		return sorted;
	}

	public void setUnsorted(boolean unsorted){
		this.unsorted = unsorted;
	}

	public boolean isUnsorted(){
		return unsorted;
	}

	@Override
 	public String toString(){
		return 
			"SortPojo{" + 
			"empty = '" + empty + '\'' + 
			",sorted = '" + sorted + '\'' + 
			",unsorted = '" + unsorted + '\'' + 
			"}";
		}
}