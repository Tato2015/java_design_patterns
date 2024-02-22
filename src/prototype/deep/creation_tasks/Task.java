package prototype.deep.creation_tasks;

import java.time.LocalDate;

public class Task implements Cloneable {

	private String name;
	private String detail;
	private LocalDate init;
	private LocalDate finish;

	public Task() {
		super();
	}

	public Task(String name, String detail, LocalDate init, LocalDate finish) {
		super();
		this.name = name;
		this.detail = detail;
		this.init = init;
		this.finish = finish;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getInit() {
		return init;
	}

	public void setInit(LocalDate init) {
		this.init = init;
	}

	public LocalDate getFinish() {
		return finish;
	}

	public void setFinish(LocalDate finish) {
		this.finish = finish;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	@Override
	public Task clone() throws CloneNotSupportedException {
		return (Task) super.clone();
	}

	@Override
	public String toString() {
		return "Task [name=" + name + ", detail=" + detail + ", init=" + init + ", finish=" + finish + "]";
	}

}
