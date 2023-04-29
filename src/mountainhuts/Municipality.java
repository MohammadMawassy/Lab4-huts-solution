package mountainhuts;

public class Municipality {
	private final String name;
	private final String province;
	private final Integer altitude;

	public Municipality(String name, String province, Integer altitude) {
		this.name = name;
		this.province = province;
		this.altitude = altitude;
	}

	public String getName() {
		return name;
	}

	public String getProvince() {
		return province;
	}

	public Integer getAltitude() {
		return altitude;
	}

}
