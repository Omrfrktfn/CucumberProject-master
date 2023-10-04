package team12.pojos.esmaPojo;

import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class US07ResponsePojo implements Serializable {
	private List<US07Content1Pojo> content;
	private US07PageablePojo pageable;
	private int totalPages;
	private int totalElements;
	private boolean last;
	private int number;
	private US07SortPojo sort;
	private int size;
	private int numberOfElements;
	private boolean first;
	private boolean empty;

	public US07ResponsePojo(List<US07Content1Pojo> content, US07PageablePojo pageable, int totalPages, int totalElements, boolean last, int number, US07SortPojo sort, int size, int numberOfElements, boolean first, boolean empty) {
		this.content = content;
		this.pageable = pageable;
		this.totalPages = totalPages;
		this.totalElements = totalElements;
		this.last = last;
		this.number = number;
		this.sort = sort;
		this.size = size;
		this.numberOfElements = numberOfElements;
		this.first = first;
		this.empty = empty;
	}

	public US07ResponsePojo() {
	}

	public void setContent(List<US07Content1Pojo> content){
		this.content = content;
	}

	public List<US07Content1Pojo> getContent(){
		return content;
	}

	public void setPageable(US07PageablePojo pageable){
		this.pageable = pageable;
	}

	public US07PageablePojo getPageable(){
		return pageable;
	}

	public void setTotalPages(int totalPages){
		this.totalPages = totalPages;
	}

	public int getTotalPages(){
		return totalPages;
	}

	public void setTotalElements(int totalElements){
		this.totalElements = totalElements;
	}

	public int getTotalElements(){
		return totalElements;
	}

	public void setLast(boolean last){
		this.last = last;
	}

	public boolean isLast(){
		return last;
	}

	public void setNumber(int number){
		this.number = number;
	}

	public int getNumber(){
		return number;
	}

	public void setSort(US07SortPojo sort){
		this.sort = sort;
	}

	public US07SortPojo getSort(){
		return sort;
	}

	public void setSize(int size){
		this.size = size;
	}

	public int getSize(){
		return size;
	}

	public void setNumberOfElements(int numberOfElements){
		this.numberOfElements = numberOfElements;
	}

	public int getNumberOfElements(){
		return numberOfElements;
	}

	public void setFirst(boolean first){
		this.first = first;
	}

	public boolean isFirst(){
		return first;
	}

	public void setEmpty(boolean empty){
		this.empty = empty;
	}

	public boolean isEmpty(){
		return empty;
	}

	@Override
 	public String toString(){
		return 
			"US07ResponsePojo{" + 
			"content = '" + content + '\'' + 
			",pageable = '" + pageable + '\'' + 
			",totalPages = '" + totalPages + '\'' + 
			",totalElements = '" + totalElements + '\'' + 
			",last = '" + last + '\'' + 
			",number = '" + number + '\'' + 
			",sort = '" + sort + '\'' + 
			",size = '" + size + '\'' + 
			",numberOfElements = '" + numberOfElements + '\'' + 
			",first = '" + first + '\'' + 
			",empty = '" + empty + '\'' + 
			"}";
		}
}