package Short;

public class Pen {

	private int pen_id;
	private String pen_type;
	private double cost;

	public Pen(int pen_id, String pen_type, double cost) {
		super();
		this.pen_id = pen_id;
		this.pen_type = pen_type;
		this.cost = cost;
	}

	public int getPen_id() {
		return pen_id;
	}

	public void setPen_id(int pen_id) {
		this.pen_id = pen_id;
	}

	public String getPen_type() {
		return pen_type;
	}

	public void setPen_type(String pen_type) {
		this.pen_type = pen_type;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Pen [pen_id=" + pen_id + ", pen_type=" + pen_type + ", cost=" + cost + "]";
	}

}
