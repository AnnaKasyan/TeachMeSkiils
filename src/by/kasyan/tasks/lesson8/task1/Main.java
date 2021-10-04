package by.kasyan.tasks.lesson8.task1;

public class Main {
    public static void main(String[] args) {

        String text = "Lorem Ipsum 1221 is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged.";

        int index1 = text.indexOf('a');
        int index2 = text.lastIndexOf('b');
        char[] dst = new char[index2 - index1];
        text.getChars(index1, index2, dst, 0);
        System.out.println(dst);
        System.out.println("----------");

        String replaceText = text.replace(text.charAt(3), text.charAt(0));
        System.out.println(replaceText);
        System.out.println("----------");

        String[] words = text.split(" ");
        for (String word : words) {
            StringBuffer buffer = new StringBuffer(word);
            buffer.reverse();
            if (word.equals(buffer.toString())) {
                System.out.println(buffer);
            }
        }
    }
}
