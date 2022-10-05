public class Directory {
   public static void main(String[] arg) throws Exception {
      String currentDirectory = System.getProperty("user.dir");
      System.out.println("The current working directory is " + currentDirectory);
   }
}
