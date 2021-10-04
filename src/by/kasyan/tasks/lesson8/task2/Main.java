package by.kasyan.tasks.lesson8.task2;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("notes.txt"))) {
            String text = "Lorem Ipsum 1221 is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. Standard dummy text.";
            bw.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader br = new BufferedReader(new FileReader("notes.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("changeNotes.txt"))) {
            String s;
            while ((s = br.readLine()) != null) {
                System.out.println(s);
                String[] sentences = s.split(".");
                for (String sentence : sentences) {
                    if (TextFormater.calculatingWords(sentence) > 2 && TextFormater.calculatingWords(sentence) < 6) {
                        writer.write(sentence);
                    }
                    if (TextFormater.calculatingPalindrome(sentence)) {
                        writer.write(sentence);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader reader = new BufferedReader(new FileReader("changeNotes.txt"))) {
            String str;
            while ((str = reader.readLine()) != null) {
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
