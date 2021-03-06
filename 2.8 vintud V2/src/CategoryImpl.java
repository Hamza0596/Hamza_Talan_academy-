public class CategoryImpl {
	private int id;
	private String name;
	private String description;
	
	public CategoryImpl(int id, String name, String description) {
		this.id=id;
		this.name=name;
		this.description=description;
	}
	public CategoryImpl(String name, String description) {
		this.name=name;
		this.description=description;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

}