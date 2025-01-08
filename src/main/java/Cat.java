import org.springframework.stereotype.Component;

@Component
public class Cat {
	private String name;

	public Cat() {}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Cat{" +
				"name='" + name + '\'' +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Cat cat = (Cat) o;
		return name.equals(cat.name);
	}

	@Override
	public int hashCode() {
		return name.hashCode();
	}
}
