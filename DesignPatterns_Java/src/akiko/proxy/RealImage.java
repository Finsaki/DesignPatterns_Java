package akiko.proxy;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

/**
 * Real subject class
 * @author akiko
 *
 */
public class RealImage implements Image {

	private final String filename;
	private final Object content; //just saving as object

    /**
     * Constructor
     * @param filename
     */
    public RealImage(String filename) {
        this.filename = filename;
        this.content = loadImageFromDisk();
    }

    /**
     * Loads the image from the disk
     */
    private Object loadImageFromDisk() {
    	System.out.println("Loading content...");
    	try {
    		Object myObj = ImageIO.read(new File("src/akiko/proxy/" + this.filename));
    	    return myObj;
    	} catch (IOException e) {
    	    System.out.println("No file with given name was found.");
    	    //e.printStackTrace();
    	    return null;
    	}
    }

    /**
     * Displays the image
     */
    public void displayImage() {
        System.out.println("Displaying content... ");
        System.out.println(this.content);
    }

	@Override
	/**
	 * Unused
	 */
	public void showData() {
		System.out.println("Showing data of content...");
		System.out.println(this.filename);
		
	}

}
