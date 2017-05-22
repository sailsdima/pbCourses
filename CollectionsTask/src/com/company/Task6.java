package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * Created by dima on 22.05.17.
 */
//6. Занести стихотворения одного автора в список. Провести сортировку по возрастанию длин
//        строк
public class Task6 {

    private List<List<String>> poems;

    public Task6(){
        poems = new ArrayList<>();
    }

    private void sort(){
        Collections.sort(poems, new Comparator<List<String>>() {
            @Override
            public int compare(List<String> list1, List<String> list2) {

                Comparator<String> comparator =
                        (o11, o21) -> ((Integer) o11.length()).compareTo(o21.length());

                String longestString1 = Collections.max(list1, comparator);
                String longestString2 = Collections.max(list2, comparator);
                return ((Integer)longestString1.length()).compareTo(longestString2.length());
            }
        });
    }

    private void readFile()  {
        Scanner in = null;
        try {
            in = new Scanner(new File("text.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        List<String> poem = new ArrayList<>();
        while(in.hasNext()) {
            String line = in.nextLine();
            if(line.equals("*****")){
                if(poem.size() > 0)
                    poems.add(poem);
                poem = new ArrayList<>();
            } else {
                if(line.length() > 0)
                    poem.add(line);
            }

        }
        in.close();
    }


    public void launch(){
        readFile();
        sort();
        for (List<String> poem: poems){
            System.out.println("**********");
            poem.forEach(System.out::println);
        }
    }

}
