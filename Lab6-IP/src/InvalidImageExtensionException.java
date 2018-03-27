

public class InvalidImageExtensionException extends Exception{
    public InvalidImageExtensionException(){
        super("Invalid extension. Supported extensions: png, jpg, bmp");
    }
}
