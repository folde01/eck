import static net.mindview.util.Print.*;

public class Dog {
  String name;
  String says;

	public static void main(String[] args) {
	  Dog dog1 = new Dog();
	  dog1.name = "spot";
	  dog1.says = "ruff!";
	  Dog dog2 = new Dog();
	  dog2.name = "scruffy";
	  dog2.says = "wurf!";
	  
	  print(dog1.name);
	  print(dog1.says);
	  print(dog2.name);
	  print(dog2.says);

    Dog dogref = dog1;

    if (dogref == dog1) { 
      print("'dogref == dog1' is true");
    }

    if (dogref.equals(dog1)) { 
      print("'dogref.equals(dog1)' is true");
    }

    if (dogref.equals(dog2)) { 
      print("'dogref.equals(dog2)' is true");
    }
	}

}
