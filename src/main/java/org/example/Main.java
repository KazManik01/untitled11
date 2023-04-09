package org.example;

import org.apache.commons.io.FileUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        Document doc = Jsoup.connect("https://www.youtube.com/watch?v=fEeBMfoCFqs").get();
        String link = "div.html5-video-container";
        String jj = new String(String.valueOf((doc.select(link))));
        System.out.println(jj);




    }
    public static void download(ArrayList<String> links) throws IOException {
        for (int i = 1; i < links.size(); i++) {
            FileUtils.copyURLToFile(new URL(links.get(i)), new File("C:\\Новая папка\\test "+ i +".mp4"));
            if (links.get(i).isEmpty()){
                break;
            }


        }
    }

}
