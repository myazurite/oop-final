package medicine.Constant;

public class Constant {
    public static final String ROOT = System.getProperty("user.dir");
    public static final String MEDICIN_INFORMATION = System.getProperty("user.dir") + "\\RootFile";
    public static final String MEDICIN_IMAGE = System.getProperty("user.dir") + "\\Image";
    
    public static void main(String[] args) {
        String s1 = "viettuts %is a very good website";
        String replaceString = s1.replace('%', '_');//thay thế tất cả ký tự 't' thành 'j'  
        System.out.println(replaceString);
    }
}
