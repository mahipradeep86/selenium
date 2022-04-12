package seleniumSession;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		Browserutil br=new Browserutil();
		int j = 0;
		br.launchbrowser("chrome");
		Thread.sleep(200);
		j = br.launchurl("www.google.com");
		System.out.println(j);
		if (j==0)
		{
		String title=br.getPageTitle();
		System.out.println(title);
		//if(title.contains("gmail")) {
			///System.out.println("correct title");}
		//else {
			//System.out.println("incorrect title");}
		
		String url=br.getPageUrl();
		System.out.println(url);
		//br.close();
		System.out.println(j);
		}

	}

}
