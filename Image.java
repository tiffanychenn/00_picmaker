import java.io.*;

public class Image {

	public static void main(String[] args){
		makeImage();
	}

	public static void makeImage(){
		try {
			File f = new File("image.ppm");
			FileWriter photo = new FileWriter(f);
			BufferedWriter w = new BufferedWriter(photo);
			w.write("P3\n512 512\n255\n");
			for (int i = 0; i < 256; i ++){
				for (int j = 0; j < 256; j ++){
					//System.out.println("i = " + Integer.toString(i) + " j = " + Integer.toString(j));
					String s = "0 " + Integer.toString(i) + " " + Integer.toString(j) + " ";
					w.write(s + s);
				}
				w.newLine();
				for (int j = 0; j < 256; j ++){
					//System.out.println("i = " + Integer.toString(i) + " j = " + Integer.toString(j));
					String s = "0 " + Integer.toString(i) + " " + Integer.toString(j) + " ";
					w.write(s + s);
				}
			}
			w.close();
		}
		catch (Exception e) {
			System.out.println("File doesn't exist.");
		}
	}

}