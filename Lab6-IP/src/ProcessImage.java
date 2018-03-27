


import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class ProcessImage {
    public static String getMD5(String path) throws NoSuchAlgorithmException, IOException, InvalidImageExtensionException, FilePathException {
        if(!Files.exists(Paths.get(path)))
            throw new FilePathException();
        File input = new File(path);
        String extension = "";
        byte[] hash;
        byte[] data;

        int i = path.lastIndexOf('.');
        if (i > 0) {
            extension = path.substring(i+1).toLowerCase();
        }
        if(!extension.equals("png") && !extension.equals("jpg") && !extension.equals("bmp")){
            throw new InvalidImageExtensionException();
        }

        BufferedImage buffImg = ImageIO.read(input);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        ImageIO.write( buffImg, extension, outputStream);
        data = outputStream.toByteArray();

        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(data);
        hash = md.digest();
        String hexString = "";
        for (i=0; i < hash.length; i++) {
            hexString += Integer.toString( ( hash[i] & 0xff ) + 0x100, 16).substring( 1 );
        }

        return hexString;

    }
}
