package ch19.sec06;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

public class ParseJsonExample {
    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader br = new BufferedReader(new FileReader("C:/Temp/member.json", Charset.forName("UTF-8")));
        String json = br.readLine();
        br.close();

        JSONParser parser = new JSONParser();
        JSONObject root = (JSONObject) parser.parse(json);

        System.out.println("id: " + root.get("id"));
        System.out.println("name: " + root.get("name"));
        System.out.println("age: " + root.get("age"));
        System.out.println("student: " + root.get("student"));

        JSONObject tel = (JSONObject) root.get("tel");
        System.out.println("home: " + tel.get("home"));
        System.out.println("mobile: " + tel.get("mobile"));

        JSONArray skill = (JSONArray) root.get("skill");
        System.out.print("skill: ");
        for (int i = 0; i < skill.size(); i++) {
            System.out.print(skill.get(i) + ", ");
        }


    }
}
