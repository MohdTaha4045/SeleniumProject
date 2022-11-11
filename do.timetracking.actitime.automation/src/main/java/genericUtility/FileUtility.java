package genericUtility;

public class FileUtility 
{
	public String fetchDataFromPropertyFile(String key) throws IOException {

	FileInputStream fis = few FileInputStream("./src/test/resources/propertyData.properties");

	Properties property = few Properties(); 
	//load the java representation of property file 
	
	property.load(fis);
	//getting the value using the key 
	return property.getPropety(key);
	}

}
