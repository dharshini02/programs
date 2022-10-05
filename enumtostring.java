enum Size {
   SMALL, MEDIUM, LARGE, EXTRALARGE
}

class enumtostring {
   public static void main(String[] args) {

      System.out.println("string value of SMALL is " + Size.SMALL.toString());
      System.out.println("string value of MEDIUM is " + Size.MEDIUM.name());

   }
}
