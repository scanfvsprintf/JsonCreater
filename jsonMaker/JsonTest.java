package jsonMaker;

public class JsonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JsonObject country=new JsonObject();
		country.add("name", "�й�");
		
		JsonObject province1=new JsonObject();		
		province1.add("name", "������");
		JsonObject city1=new JsonObject();
		JsonGroup group1=new JsonGroup();
		group1.add("������");
		group1.add("����");
		city1.add("city", group1);
		province1.add("citis", city1);
		
		JsonObject province2=new JsonObject();
		province2.add("name", "�㶫");
		JsonObject city2=new JsonObject();
		JsonGroup group2=new JsonGroup();
		group2.add("����");
		group2.add("����");
		city2.add("city", group2);
		province2.add("citis", city2);
		
		JsonGroup provinces=new JsonGroup();
		provinces.add(province1);
		provinces.add(province2);
		country.add("province", provinces);
		System.out.println(country.Create());

	}

}
