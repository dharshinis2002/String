public class StringReplace {
    public static void main(String[] args) {
        String Text = "<String> dharshini  // p tag ";
        System.out.println("original String" + Text);
        Text =Text.replaceAll("//<>","");
        System.out.println(Text);
    }  }