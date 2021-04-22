package akiko.proxy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Not really sure if I understood the assignment correctly but I do believe the proxy method is correctly shown at work here.
 * Proxy class is used to access the actual class (RealImage) without loading the involved recources there.
 * 
 * This example does not actually open any window to show the images in question, it will just show the functionality
 * of this program by printing the Object information about the images in question when displayImage method is called.
 * 
 * @author Aki Koppinen, 1810088
 * @version 1.0 14.04.2021
 *
 */
public class Main {

	public static void main(String[] args) {
		List<ProxyImage> images = new ArrayList<>();
		System.out.println("---\nAdding proxy images\n---");
		images.add(new ProxyImage("1C.png"));
		images.add(new ProxyImage("1D.png"));
		images.add(new ProxyImage("1H.png"));
		images.add(new ProxyImage("1S.png"));
		images.add(new ProxyImage("2C.png")); //not available, testing
		
		//Image image1 = new ProxyImage("HiRes_10MB_Photo1");
        //Image image2 = new ProxyImage("1H.png");
		
		Scanner scan = new Scanner(System.in);
		String input = "";
		while (!input.equals("3")) {
			System.out.println("\n***\nInput 1 to show names of images -- Input 2 to display images -- Input 3 to exit\n***");
			input = scan.nextLine();
			if (input.equals("1")) {
				System.out.println("\n---\nShowing image information\n---");
				for (ProxyImage image: images) {
					image.showData();
				}
			} else if (input.equals("2")) {
				System.out.println("\n---\nDisplaying images\n---");
				for (ProxyImage image: images) {
					image.displayImage();
				}
			}
		}
		scan.close();
	}

}
